package org.telegram.ui.Stars;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChannelMonetizationLayout;

public class BotStarsController {
    private static volatile BotStarsController[] Instance = new BotStarsController[4];
    private static final Object[] lockObjects = new Object[4];
    public ArrayList adminedBots;
    public ArrayList adminedChannels;
    public final int currentAccount;
    private boolean loadingAdminedBots;
    private boolean loadingAdminedChannels;
    private final HashMap lastLoadedBotStarsStats = new HashMap();
    private final HashMap botStarsStats = new HashMap();
    private final HashMap lastLoadedTonStats = new HashMap();
    private final HashMap tonStats = new HashMap();
    private final HashMap transactions = new HashMap();
    private final HashMap connectedBots = new HashMap();
    private final HashMap suggestedBots = new HashMap();

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static BotStarsController getInstance(int i) {
        BotStarsController botStarsController;
        BotStarsController botStarsController2 = Instance[i];
        if (botStarsController2 != null) {
            return botStarsController2;
        }
        synchronized (lockObjects[i]) {
            try {
                botStarsController = Instance[i];
                if (botStarsController == null) {
                    BotStarsController[] botStarsControllerArr = Instance;
                    BotStarsController botStarsController3 = new BotStarsController(i);
                    botStarsControllerArr[i] = botStarsController3;
                    botStarsController = botStarsController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return botStarsController;
    }

    private BotStarsController(int i) {
        this.currentAccount = i;
    }

    public TL_stars.StarsAmount getBotStarsBalance(long j) {
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = getStarsRevenueStats(j);
        return starsRevenueStats == null ? TL_stars.StarsAmount.ofStars(0L) : starsRevenueStats.status.current_balance;
    }

    public void invalidateStarsBalance(long j) {
        getStarsRevenueStats(j, true);
    }

    public long getTONBalance(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats tONRevenueStats = getTONRevenueStats(j, false);
        if (tONRevenueStats == null || (tL_starsRevenueStatus = tONRevenueStats.status) == null || (starsAmount = tL_starsRevenueStatus.current_balance) == null) {
            return 0L;
        }
        return starsAmount.amount;
    }

    public long getAvailableBalance(long j) {
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = getStarsRevenueStats(j);
        if (starsRevenueStats == null) {
            return 0L;
        }
        return starsRevenueStats.status.available_balance.amount;
    }

    public boolean isStarsBalanceAvailable(long j) {
        return getStarsRevenueStats(j) != null;
    }

    public boolean isTONBalanceAvailable(long j) {
        return getTONRevenueStats(j, false) != null;
    }

    public TLRPC.TL_payments_starsRevenueStats getStarsRevenueStats(long j) {
        return getStarsRevenueStats(j, false);
    }

    public boolean botHasStars(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = getStarsRevenueStats(j);
        if (starsRevenueStats == null || (tL_starsRevenueStatus = starsRevenueStats.status) == null) {
            return false;
        }
        return tL_starsRevenueStatus.available_balance.amount > 0 || tL_starsRevenueStatus.overall_revenue.amount > 0 || tL_starsRevenueStatus.current_balance.amount > 0;
    }

    public boolean botHasTON(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats tONRevenueStats = getTONRevenueStats(j, false);
        return (tONRevenueStats == null || (tL_starsRevenueStatus = tONRevenueStats.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) ? false : true;
    }

    public void preloadStarsStats(long j) {
        Long l = (Long) this.lastLoadedBotStarsStats.get(Long.valueOf(j));
        getStarsRevenueStats(j, l == null || System.currentTimeMillis() - l.longValue() > 30000);
    }

    public void preloadTonStats(long j) {
        Long l = (Long) this.lastLoadedTonStats.get(Long.valueOf(j));
        getTONRevenueStats(j, l == null || System.currentTimeMillis() - l.longValue() > 30000);
    }

    public TLRPC.TL_payments_starsRevenueStats getStarsRevenueStats(final long j, boolean z) {
        Long l = (Long) this.lastLoadedBotStarsStats.get(Long.valueOf(j));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.botStarsStats.get(Long.valueOf(j));
        if (l != null && System.currentTimeMillis() - l.longValue() <= 300000 && !z) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = Theme.isCurrentThemeDark();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotStarsController.m4088$r8$lambda$KbPi69xXbiMIuc4szqdvonZMps(this.f$0, j, tLObject, tL_error);
            }
        });
        return tL_payments_starsRevenueStats;
    }

    public static void m4088$r8$lambda$KbPi69xXbiMIuc4szqdvonZMps(final BotStarsController botStarsController, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        botStarsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotStarsController.$r8$lambda$wQbHBLsVnDCORSblXs6cJDL9hJ8(this.f$0, tLObject, j);
            }
        });
    }

    public static void $r8$lambda$wQbHBLsVnDCORSblXs6cJDL9hJ8(BotStarsController botStarsController, TLObject tLObject, long j) {
        botStarsController.getClass();
        if (tLObject instanceof TLRPC.TL_payments_starsRevenueStats) {
            botStarsController.botStarsStats.put(Long.valueOf(j), (TLRPC.TL_payments_starsRevenueStats) tLObject);
        } else {
            botStarsController.botStarsStats.put(Long.valueOf(j), null);
        }
        botStarsController.lastLoadedBotStarsStats.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
        NotificationCenter.getInstance(botStarsController.currentAccount).postNotificationName(NotificationCenter.botStarsUpdated, Long.valueOf(j));
    }

    public TLRPC.TL_payments_starsRevenueStats getTONRevenueStats(final long j, boolean z) {
        Long l = (Long) this.lastLoadedTonStats.get(Long.valueOf(j));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.tonStats.get(Long.valueOf(j));
        if (l != null && System.currentTimeMillis() - l.longValue() <= 300000 && !z) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = Theme.isCurrentThemeDark();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotStarsController.$r8$lambda$OGEjdIAq99LZVqQzwhcs4xrYkG0(this.f$0, j, tLObject, tL_error);
            }
        }, null, null, 0, chatFull != null ? chatFull.stats_dc : Integer.MAX_VALUE, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public static void $r8$lambda$OGEjdIAq99LZVqQzwhcs4xrYkG0(final BotStarsController botStarsController, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        botStarsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotStarsController.m4087$r8$lambda$FdHsq8Iu5m9EPD6mu5CD8juE8o(this.f$0, tLObject, j);
            }
        });
    }

    public static void m4087$r8$lambda$FdHsq8Iu5m9EPD6mu5CD8juE8o(BotStarsController botStarsController, TLObject tLObject, long j) {
        botStarsController.getClass();
        if (tLObject instanceof TLRPC.TL_payments_starsRevenueStats) {
            botStarsController.tonStats.put(Long.valueOf(j), (TLRPC.TL_payments_starsRevenueStats) tLObject);
        } else {
            botStarsController.tonStats.put(Long.valueOf(j), null);
        }
        botStarsController.lastLoadedTonStats.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
        NotificationCenter.getInstance(botStarsController.currentAccount).postNotificationName(NotificationCenter.botStarsUpdated, Long.valueOf(j));
    }

    public void onUpdate(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        if (tL_updateStarsRevenueStatus == null) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId < 0) {
            ChannelMonetizationLayout channelMonetizationLayout = ChannelMonetizationLayout.instance;
            if (channelMonetizationLayout == null || channelMonetizationLayout.dialogId != DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
                return;
            }
            ChannelMonetizationLayout channelMonetizationLayout2 = ChannelMonetizationLayout.instance;
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
            channelMonetizationLayout2.setupBalances(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
            ChannelMonetizationLayout.instance.reloadTransactions();
            return;
        }
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = getStarsRevenueStats(peerDialogId, true);
        if (starsRevenueStats != null) {
            starsRevenueStats.status = tL_updateStarsRevenueStatus.status;
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
        }
        invalidateTransactions(peerDialogId, true);
    }

    class TransactionsState {
        private final boolean[] endReached;
        private final boolean[] loading;
        private final String[] offset;
        public final ArrayList[] transactions;
        public final boolean[] transactionsExist;

        private TransactionsState() {
            this.transactions = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList()};
            this.transactionsExist = new boolean[3];
            this.offset = new String[3];
            this.loading = new boolean[3];
            this.endReached = new boolean[3];
        }
    }

    private TransactionsState getTransactionsState(long j) {
        TransactionsState transactionsState = (TransactionsState) this.transactions.get(Long.valueOf(j));
        if (transactionsState != null) {
            return transactionsState;
        }
        HashMap map = this.transactions;
        Long lValueOf = Long.valueOf(j);
        TransactionsState transactionsState2 = new TransactionsState();
        map.put(lValueOf, transactionsState2);
        return transactionsState2;
    }

    public ArrayList getTransactions(long j, int i) {
        return getTransactionsState(j).transactions[i];
    }

    public void invalidateTransactions(long j, boolean z) {
        TransactionsState transactionsState = getTransactionsState(j);
        for (int i = 0; i < 3; i++) {
            if (!transactionsState.loading[i]) {
                transactionsState.transactions[i].clear();
                transactionsState.offset[i] = null;
                transactionsState.loading[i] = false;
                transactionsState.endReached[i] = false;
                if (z) {
                    loadTransactions(j, i);
                }
            }
        }
    }

    public void loadTransactions(final long j, final int i) {
        final TransactionsState transactionsState = getTransactionsState(j);
        if (transactionsState.loading[i] || transactionsState.endReached[i]) {
            return;
        }
        transactionsState.loading[i] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_payments_getStarsTransactions.inbound = i == 1;
        tL_payments_getStarsTransactions.outbound = i == 2;
        String str = transactionsState.offset[i];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotStarsController.m4090$r8$lambda$q3J6_s2NaHwFlpUTn6KH4gphc(this.f$0, transactionsState, i, j, tLObject, tL_error);
            }
        });
    }

    public static void m4090$r8$lambda$q3J6_s2NaHwFlpUTn6KH4gphc(final BotStarsController botStarsController, final TransactionsState transactionsState, final int i, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        botStarsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotStarsController.$r8$lambda$nW9lNgRKDhZ7DNz2zftpvABxpRM(this.f$0, transactionsState, i, tLObject, j);
            }
        });
    }

    public static void $r8$lambda$nW9lNgRKDhZ7DNz2zftpvABxpRM(BotStarsController botStarsController, TransactionsState transactionsState, int i, TLObject tLObject, long j) {
        botStarsController.getClass();
        transactionsState.loading[i] = false;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(botStarsController.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(botStarsController.currentAccount).putChats(starsStatus.chats, false);
            transactionsState.transactions[i].addAll(starsStatus.history);
            transactionsState.transactionsExist[i] = !transactionsState.transactions[i].isEmpty() || transactionsState.transactionsExist[i];
            transactionsState.endReached[i] = (starsStatus.flags & 1) == 0;
            transactionsState.offset[i] = transactionsState.endReached[i] ? null : starsStatus.next_offset;
            NotificationCenter.getInstance(botStarsController.currentAccount).postNotificationName(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j));
        }
    }

    public boolean didFullyLoadTransactions(long j, int i) {
        return getTransactionsState(j).endReached[i];
    }

    public boolean hasTransactions(long j) {
        return hasTransactions(j, 0);
    }

    public boolean hasTransactions(long j, int i) {
        return !getTransactionsState(j).transactions[i].isEmpty();
    }

    public static class ChannelConnectedBots {
        public int count;
        public final int currentAccount;
        public final long dialogId;
        public boolean endReached;
        public long lastRequestTime;
        private int reqId;
        public final ArrayList bots = new ArrayList();
        private boolean loading = false;
        private boolean error = false;

        public ChannelConnectedBots(int i, long j) {
            this.currentAccount = i;
            this.dialogId = j;
            check();
        }

        public void clear() {
            this.count = 0;
            this.error = false;
            this.endReached = false;
        }

        public void check() {
            if (System.currentTimeMillis() - this.lastRequestTime > 900000) {
                clear();
                cancel();
                load();
            }
        }

        public void cancel() {
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            this.loading = false;
        }

        public boolean isLoading() {
            return this.loading;
        }

        public void load() {
            if (this.loading || this.error || this.endReached) {
                return;
            }
            this.lastRequestTime = System.currentTimeMillis();
            this.loading = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            getconnectedstarrefbots.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            getconnectedstarrefbots.limit = 20;
            if (!this.bots.isEmpty()) {
                ArrayList arrayList = this.bots;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList.get(arrayList.size() - 1);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getconnectedstarrefbots, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    BotStarsController.ChannelConnectedBots.m4092$r8$lambda$fgKXC2HLOUs81OUqtZ3pKxGP60(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void m4092$r8$lambda$fgKXC2HLOUs81OUqtZ3pKxGP60(final ChannelConnectedBots channelConnectedBots, final TLObject tLObject, TLRPC.TL_error tL_error) {
            channelConnectedBots.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotStarsController.ChannelConnectedBots.$r8$lambda$m00uTwk4k8ZPSyGGEVnSUhFKAgY(this.f$0, tLObject);
                }
            });
        }

        public static void $r8$lambda$m00uTwk4k8ZPSyGGEVnSUhFKAgY(ChannelConnectedBots channelConnectedBots, TLObject tLObject) {
            channelConnectedBots.reqId = 0;
            if (tLObject instanceof TL_payments.connectedStarRefBots) {
                TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                MessagesController.getInstance(channelConnectedBots.currentAccount).putUsers(connectedstarrefbots.users, false);
                if (channelConnectedBots.count <= 0) {
                    channelConnectedBots.bots.clear();
                }
                channelConnectedBots.count = connectedstarrefbots.count;
                channelConnectedBots.bots.addAll(connectedstarrefbots.connected_bots);
                channelConnectedBots.endReached = connectedstarrefbots.connected_bots.isEmpty() || channelConnectedBots.bots.size() >= channelConnectedBots.count;
            } else {
                channelConnectedBots.error = true;
                channelConnectedBots.endReached = true;
            }
            channelConnectedBots.loading = false;
            NotificationCenter.getInstance(channelConnectedBots.currentAccount).postNotificationName(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(channelConnectedBots.dialogId));
        }

        public void apply(TL_payments.connectedStarRefBots connectedstarrefbots) {
            MessagesController.getInstance(this.currentAccount).putUsers(connectedstarrefbots.users, false);
            clear();
            this.bots.clear();
            cancel();
            this.count = connectedstarrefbots.count;
            this.bots.addAll(connectedstarrefbots.connected_bots);
            this.endReached = connectedstarrefbots.connected_bots.isEmpty() || this.bots.size() >= this.count;
            this.error = false;
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(this.dialogId));
            load();
        }

        public void applyEdit(TL_payments.connectedStarRefBots connectedstarrefbots) {
            MessagesController.getInstance(this.currentAccount).putUsers(connectedstarrefbots.users, false);
            for (int i = 0; i < connectedstarrefbots.connected_bots.size(); i++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i);
                for (int i2 = 0; i2 < this.bots.size(); i2++) {
                    if (((TL_payments.connectedBotStarRef) this.bots.get(i2)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            this.bots.remove(i2);
                            this.count = Math.max(this.count - 1, 0);
                            break;
                        } else {
                            this.bots.set(i2, connectedbotstarref);
                            break;
                        }
                    }
                }
            }
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(this.dialogId));
            load();
        }
    }

    public ChannelConnectedBots getChannelConnectedBots(long j) {
        ChannelConnectedBots channelConnectedBots = (ChannelConnectedBots) this.connectedBots.get(Long.valueOf(j));
        if (channelConnectedBots != null) {
            return channelConnectedBots;
        }
        HashMap map = this.connectedBots;
        Long lValueOf = Long.valueOf(j);
        ChannelConnectedBots channelConnectedBots2 = new ChannelConnectedBots(this.currentAccount, j);
        map.put(lValueOf, channelConnectedBots2);
        return channelConnectedBots2;
    }

    public static class ChannelSuggestedBots {
        public int count;
        public final int currentAccount;
        public final long dialogId;
        public boolean endReached;
        public long lastRequestTime;
        private int reqId;
        public final ArrayList bots = new ArrayList();
        private Sort sorting = Sort.BY_PROFITABILITY;
        private boolean loading = false;
        private boolean error = false;
        private String lastOffset = null;

        public enum Sort {
            BY_PROFITABILITY,
            BY_REVENUE,
            BY_DATE
        }

        public ChannelSuggestedBots(int i, long j) {
            this.currentAccount = i;
            this.dialogId = j;
            check();
        }

        public void clear() {
            this.count = 0;
            this.endReached = false;
            this.error = false;
            this.lastRequestTime = 0L;
            this.lastOffset = null;
        }

        public void check() {
            if (System.currentTimeMillis() - this.lastRequestTime > 900000) {
                clear();
                cancel();
                load();
            }
        }

        public void cancel() {
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            this.loading = false;
        }

        public boolean isLoading() {
            return this.loading;
        }

        public void setSort(Sort sort) {
            if (this.sorting != sort) {
                this.sorting = sort;
                reload();
            }
        }

        public Sort getSort() {
            return this.sorting;
        }

        public void load() {
            if (this.loading || this.error || this.endReached) {
                return;
            }
            this.lastRequestTime = System.currentTimeMillis();
            this.loading = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            getsuggestedstarrefbots.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            getsuggestedstarrefbots.limit = 20;
            Sort sort = this.sorting;
            getsuggestedstarrefbots.order_by_date = sort == Sort.BY_DATE;
            getsuggestedstarrefbots.order_by_revenue = sort == Sort.BY_REVENUE;
            if (!TextUtils.isEmpty(this.lastOffset)) {
                getsuggestedstarrefbots.offset = this.lastOffset;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getsuggestedstarrefbots, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    BotStarsController.ChannelSuggestedBots.$r8$lambda$OzG6Cc7bHzlkZWKyxHqnQA1gh38(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$OzG6Cc7bHzlkZWKyxHqnQA1gh38(final ChannelSuggestedBots channelSuggestedBots, final TLObject tLObject, TLRPC.TL_error tL_error) {
            channelSuggestedBots.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotStarsController.ChannelSuggestedBots.$r8$lambda$3RezTmN7prcY4U9Gveth8gZwqu4(this.f$0, tLObject);
                }
            });
        }

        public static void $r8$lambda$3RezTmN7prcY4U9Gveth8gZwqu4(ChannelSuggestedBots channelSuggestedBots, TLObject tLObject) {
            channelSuggestedBots.getClass();
            if (tLObject instanceof TL_payments.suggestedStarRefBots) {
                TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject;
                MessagesController.getInstance(channelSuggestedBots.currentAccount).putUsers(suggestedstarrefbots.users, false);
                if (channelSuggestedBots.count <= 0) {
                    channelSuggestedBots.bots.clear();
                }
                channelSuggestedBots.count = suggestedstarrefbots.count;
                channelSuggestedBots.bots.addAll(suggestedstarrefbots.suggested_bots);
                channelSuggestedBots.lastOffset = suggestedstarrefbots.next_offset;
                channelSuggestedBots.endReached = suggestedstarrefbots.suggested_bots.isEmpty() || channelSuggestedBots.bots.size() >= channelSuggestedBots.count;
            } else {
                channelSuggestedBots.error = true;
                channelSuggestedBots.endReached = true;
            }
            channelSuggestedBots.loading = false;
            NotificationCenter.getInstance(channelSuggestedBots.currentAccount).postNotificationName(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(channelSuggestedBots.dialogId));
        }

        public void remove(long j) {
            for (int i = 0; i < this.bots.size(); i++) {
                if (((TL_payments.starRefProgram) this.bots.get(i)).bot_id == j) {
                    this.bots.remove(i);
                    this.count--;
                    NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(this.dialogId));
                    return;
                }
            }
        }

        public void reload() {
            clear();
            cancel();
            load();
        }
    }

    public ChannelSuggestedBots getChannelSuggestedBots(long j) {
        ChannelSuggestedBots channelSuggestedBots = (ChannelSuggestedBots) this.suggestedBots.get(Long.valueOf(j));
        if (channelSuggestedBots != null) {
            return channelSuggestedBots;
        }
        HashMap map = this.suggestedBots;
        Long lValueOf = Long.valueOf(j);
        ChannelSuggestedBots channelSuggestedBots2 = new ChannelSuggestedBots(this.currentAccount, j);
        map.put(lValueOf, channelSuggestedBots2);
        return channelSuggestedBots2;
    }

    public void loadAdminedBots() {
        if (this.loadingAdminedBots || this.adminedBots != null) {
            return;
        }
        this.loadingAdminedBots = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_bots.getAdminedBots(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotStarsController.$r8$lambda$Gg8WvY9k550H5gb_b3E0OkMABAE(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$Gg8WvY9k550H5gb_b3E0OkMABAE(final BotStarsController botStarsController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        botStarsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotStarsController.$r8$lambda$9exmVbB06JmmiEwzJFk32ay8Hd0(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$9exmVbB06JmmiEwzJFk32ay8Hd0(BotStarsController botStarsController, TLObject tLObject) {
        botStarsController.getClass();
        botStarsController.adminedBots = new ArrayList();
        botStarsController.loadingAdminedBots = false;
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < vector.objects.size(); i++) {
                botStarsController.adminedBots.add((TLRPC.User) vector.objects.get(i));
            }
            MessagesController.getInstance(botStarsController.currentAccount).putUsers(botStarsController.adminedBots, false);
        }
    }

    public void loadAdminedChannels() {
        if (this.loadingAdminedChannels || this.adminedChannels != null) {
            return;
        }
        this.loadingAdminedChannels = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotStarsController.m4091$r8$lambda$wYbKLxwHOuOEzwU_smPizHhfac(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m4091$r8$lambda$wYbKLxwHOuOEzwU_smPizHhfac(final BotStarsController botStarsController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        botStarsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotStarsController.$r8$lambda$CpAcXCQoii_sLEjZNOLXsBKBbHE(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$CpAcXCQoii_sLEjZNOLXsBKBbHE(BotStarsController botStarsController, TLObject tLObject) {
        botStarsController.getClass();
        botStarsController.adminedChannels = new ArrayList();
        botStarsController.loadingAdminedChannels = false;
        if (tLObject instanceof TLRPC.messages_Chats) {
            TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
            MessagesController.getInstance(botStarsController.currentAccount).putChats(messages_chats.chats, false);
            botStarsController.adminedChannels.addAll(messages_chats.chats);
        }
        NotificationCenter.getInstance(botStarsController.currentAccount).postNotificationName(NotificationCenter.adminedChannelsLoaded, new Object[0]);
    }

    public ArrayList getAdmined() {
        loadAdminedBots();
        loadAdminedChannels();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.adminedBots;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = this.adminedChannels;
        if (arrayList3 != null) {
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public ArrayList getAdminedChannels() {
        loadAdminedChannels();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.adminedChannels;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public void getConnectedBot(Context context, long j, final long j2, final Utilities.Callback callback) {
        if (callback == null) {
            return;
        }
        ChannelConnectedBots channelConnectedBots = (ChannelConnectedBots) this.connectedBots.get(Long.valueOf(j));
        if (channelConnectedBots != null) {
            for (int i = 0; i < channelConnectedBots.bots.size(); i++) {
                if (!((TL_payments.connectedBotStarRef) channelConnectedBots.bots.get(i)).revoked && ((TL_payments.connectedBotStarRef) channelConnectedBots.bots.get(i)).bot_id == j2) {
                    callback.run((TL_payments.connectedBotStarRef) channelConnectedBots.bots.get(i));
                    return;
                }
            }
        }
        final AlertDialog alertDialog = new AlertDialog(context, 3);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        getconnectedstarrefbot.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        getconnectedstarrefbot.bot = MessagesController.getInstance(this.currentAccount).getInputUser(j2);
        final int iSendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getconnectedstarrefbot, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotStarsController.m4089$r8$lambda$_74SYN3orOOKGVp21cGi7a16Q(this.f$0, alertDialog, j2, callback, tLObject, tL_error);
            }
        });
        alertDialog.setCanCancel(true);
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(this.f$0.currentAccount).cancelRequest(iSendRequest, true);
            }
        });
        alertDialog.showDelayed(200L);
    }

    public static void m4089$r8$lambda$_74SYN3orOOKGVp21cGi7a16Q(final BotStarsController botStarsController, final AlertDialog alertDialog, final long j, final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
        botStarsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotStarsController.m4086$r8$lambda$2F6I1a3kZP6dTRCIxezZ4FPDsg(this.f$0, alertDialog, tLObject, j, callback);
            }
        });
    }

    public static void m4086$r8$lambda$2F6I1a3kZP6dTRCIxezZ4FPDsg(BotStarsController botStarsController, AlertDialog alertDialog, TLObject tLObject, long j, Utilities.Callback callback) {
        botStarsController.getClass();
        alertDialog.dismiss();
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            MessagesController.getInstance(botStarsController.currentAccount).putUsers(connectedstarrefbots.users, false);
            for (int i = 0; i < connectedstarrefbots.connected_bots.size(); i++) {
                if (connectedstarrefbots.connected_bots.get(i).bot_id == j && !connectedstarrefbots.connected_bots.get(i).revoked) {
                    callback.run(connectedstarrefbots.connected_bots.get(i));
                    return;
                }
            }
        }
        callback.run(null);
    }
}
