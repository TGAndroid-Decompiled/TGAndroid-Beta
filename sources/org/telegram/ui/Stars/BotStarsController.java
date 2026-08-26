package org.telegram.ui.Stars;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.MessageSeenView$$ExternalSyntheticLambda4;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

public final class BotStarsController {
    public static volatile BotStarsController[] Instance = new BotStarsController[4];
    public static final Object[] lockObjects = new Object[4];
    public ArrayList adminedBots;
    public ArrayList adminedChannels;
    public final int currentAccount;
    public boolean loadingAdminedBots;
    public boolean loadingAdminedChannels;
    public final HashMap lastLoadedBotStarsStats = new HashMap();
    public final HashMap botStarsStats = new HashMap();
    public final HashMap lastLoadedTonStats = new HashMap();
    public final HashMap tonStats = new HashMap();
    public final HashMap transactions = new HashMap();
    public final HashMap connectedBots = new HashMap();
    public final HashMap suggestedBots = new HashMap();

    public final class ChannelConnectedBots {
        public final ArrayList bots = new ArrayList();
        public int count;
        public final int currentAccount;
        public final long dialogId;
        public boolean endReached;
        public boolean error;
        public long lastRequestTime;
        public boolean loading;
        public int reqId;

        public ChannelConnectedBots(int i, long j) {
            this.loading = false;
            this.error = false;
            this.currentAccount = i;
            this.dialogId = j;
            if (System.currentTimeMillis() - this.lastRequestTime > 900000) {
                this.count = 0;
                this.error = false;
                this.endReached = false;
                if (this.reqId != 0) {
                    ConnectionsManager.getInstance(i).cancelRequest(this.reqId, true);
                    this.reqId = 0;
                }
                this.loading = false;
                load();
            }
        }

        public final void load() {
            if (this.loading || this.error || this.endReached) {
                return;
            }
            this.lastRequestTime = System.currentTimeMillis();
            this.loading = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i = this.currentAccount;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.bots;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) Fragment$$ExternalSyntheticOutline0.m(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.reqId = ConnectionsManager.getInstance(i).sendRequest(getconnectedstarrefbots, new RichMediaUploader$$ExternalSyntheticLambda0(this, 16));
        }
    }

    public final class ChannelSuggestedBots {
        public int count;
        public final int currentAccount;
        public final long dialogId;
        public boolean endReached;
        public boolean error;
        public String lastOffset;
        public long lastRequestTime;
        public boolean loading;
        public final ArrayList bots = new ArrayList();
        public int sorting = 1;

        public ChannelSuggestedBots(int i, long j) {
            this.loading = false;
            this.error = false;
            this.lastOffset = null;
            this.currentAccount = i;
            this.dialogId = j;
            if (System.currentTimeMillis() - this.lastRequestTime > 900000) {
                this.count = 0;
                this.endReached = false;
                this.error = false;
                this.lastRequestTime = 0L;
                this.lastOffset = null;
                this.loading = false;
                load();
            }
        }

        public final void load() {
            if (this.loading || this.error || this.endReached) {
                return;
            }
            this.lastRequestTime = System.currentTimeMillis();
            this.loading = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i = this.currentAccount;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
            getsuggestedstarrefbots.limit = 20;
            int i2 = this.sorting;
            getsuggestedstarrefbots.order_by_date = i2 == 3;
            getsuggestedstarrefbots.order_by_revenue = i2 == 2;
            if (TextUtils.isEmpty(this.lastOffset)) {
                getsuggestedstarrefbots.offset = "";
            } else {
                getsuggestedstarrefbots.offset = this.lastOffset;
            }
            ConnectionsManager.getInstance(i).sendRequest(getsuggestedstarrefbots, new RichMediaUploader$$ExternalSyntheticLambda0(this, 17));
        }
    }

    public final class TransactionsState {
        public final ArrayList[] transactions = {new ArrayList(), new ArrayList(), new ArrayList()};
        public final boolean[] transactionsExist = new boolean[3];
        public final String[] offset = new String[3];
        public final boolean[] loading = new boolean[3];
        public final boolean[] endReached = new boolean[3];
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public BotStarsController(int i) {
        this.currentAccount = i;
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

    public final boolean botHasStars(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = getStarsRevenueStats(j, false);
        return (starsRevenueStats == null || (tL_starsRevenueStatus = starsRevenueStats.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) ? false : true;
    }

    public final boolean botHasTON(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats tONRevenueStats = getTONRevenueStats(j, false);
        return (tONRevenueStats == null || (tL_starsRevenueStatus = tONRevenueStats.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) ? false : true;
    }

    public final TL_stars.StarsAmount getBotStarsBalance(long j) {
        TLRPC.TL_payments_starsRevenueStats starsRevenueStats = getStarsRevenueStats(j, false);
        return starsRevenueStats == null ? TL_stars.StarsAmount.ofStars(0L) : starsRevenueStats.status.current_balance;
    }

    public final ChannelConnectedBots getChannelConnectedBots(long j) {
        HashMap map = this.connectedBots;
        ChannelConnectedBots channelConnectedBots = (ChannelConnectedBots) map.get(Long.valueOf(j));
        if (channelConnectedBots != null) {
            return channelConnectedBots;
        }
        Long lValueOf = Long.valueOf(j);
        ChannelConnectedBots channelConnectedBots2 = new ChannelConnectedBots(this.currentAccount, j);
        map.put(lValueOf, channelConnectedBots2);
        return channelConnectedBots2;
    }

    public final ChannelSuggestedBots getChannelSuggestedBots(long j) {
        HashMap map = this.suggestedBots;
        ChannelSuggestedBots channelSuggestedBots = (ChannelSuggestedBots) map.get(Long.valueOf(j));
        if (channelSuggestedBots != null) {
            return channelSuggestedBots;
        }
        Long lValueOf = Long.valueOf(j);
        ChannelSuggestedBots channelSuggestedBots2 = new ChannelSuggestedBots(this.currentAccount, j);
        map.put(lValueOf, channelSuggestedBots2);
        return channelSuggestedBots2;
    }

    public final void getConnectedBot(Context context, long j, long j2, Utilities.Callback callback) {
        ChannelConnectedBots channelConnectedBots = (ChannelConnectedBots) this.connectedBots.get(Long.valueOf(j));
        if (channelConnectedBots != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = channelConnectedBots.bots;
                if (i >= arrayList.size()) {
                    break;
                }
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i)).bot_id == j2) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i));
                    return;
                }
                i++;
            }
        }
        AlertDialog alertDialog = new AlertDialog(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i2 = this.currentAccount;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i2).getInputPeer(j);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i2).getInputUser(j2);
        final int iSendRequest = ConnectionsManager.getInstance(i2).sendRequest(getconnectedstarrefbot, new StarGiftSheet$$ExternalSyntheticLambda150(this, alertDialog, j2, callback, 5));
        alertDialog.canCacnel = true;
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(this.f$0.currentAccount).cancelRequest(iSendRequest, true);
            }
        });
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats getStarsRevenueStats(long j, boolean z) {
        Long l = (Long) this.lastLoadedBotStarsStats.get(Long.valueOf(j));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.botStarsStats.get(Long.valueOf(j));
        if (l != null && System.currentTimeMillis() - l.longValue() <= 300000 && !z) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = Theme.currentTheme.isDark();
        int i = this.currentAccount;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i).getInputPeer(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new BotStarsController$$ExternalSyntheticLambda0(this, j, 0));
        return tL_payments_starsRevenueStats;
    }

    public final long getTONBalance(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats tONRevenueStats = getTONRevenueStats(j, false);
        if (tONRevenueStats == null || (tL_starsRevenueStatus = tONRevenueStats.status) == null || (starsAmount = tL_starsRevenueStatus.current_balance) == null) {
            return 0L;
        }
        return starsAmount.amount;
    }

    public final TLRPC.TL_payments_starsRevenueStats getTONRevenueStats(long j, boolean z) {
        Long l = (Long) this.lastLoadedTonStats.get(Long.valueOf(j));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.tonStats.get(Long.valueOf(j));
        if (l != null && System.currentTimeMillis() - l.longValue() <= 300000 && !z) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = Theme.currentTheme.isDark();
        int i = this.currentAccount;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i).getInputPeer(j);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(-j);
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new BotStarsController$$ExternalSyntheticLambda0(this, j, 1), null, null, 0, chatFull != null ? chatFull.stats_dc : Integer.MAX_VALUE, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final TransactionsState getTransactionsState(long j) {
        HashMap map = this.transactions;
        TransactionsState transactionsState = (TransactionsState) map.get(Long.valueOf(j));
        if (transactionsState != null) {
            return transactionsState;
        }
        Long lValueOf = Long.valueOf(j);
        TransactionsState transactionsState2 = new TransactionsState();
        map.put(lValueOf, transactionsState2);
        return transactionsState2;
    }

    public final void invalidateTransactions(long j) {
        TransactionsState transactionsState = getTransactionsState(j);
        for (int i = 0; i < 3; i++) {
            boolean[] zArr = transactionsState.loading;
            if (!zArr[i]) {
                transactionsState.transactions[i].clear();
                transactionsState.offset[i] = null;
                zArr[i] = false;
                transactionsState.endReached[i] = false;
                loadTransactions(i, j);
            }
        }
    }

    public final boolean isTONBalanceAvailable(long j) {
        return getTONRevenueStats(j, false) != null;
    }

    public final void loadAdminedBots() {
        if (this.loadingAdminedBots || this.adminedBots != null) {
            return;
        }
        this.loadingAdminedBots = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_bots.getAdminedBots(), new BotStarsController$$ExternalSyntheticLambda1(this, 1));
    }

    public final void loadAdminedChannels() {
        if (this.loadingAdminedChannels || this.adminedChannels != null) {
            return;
        }
        this.loadingAdminedChannels = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new BotStarsController$$ExternalSyntheticLambda1(this, 0));
    }

    public final void loadTransactions(int i, long j) {
        TransactionsState transactionsState = getTransactionsState(j);
        boolean[] zArr = transactionsState.loading;
        if (zArr[i] || transactionsState.endReached[i]) {
            return;
        }
        zArr[i] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        int i2 = this.currentAccount;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i2).getInputPeer(j);
        tL_payments_getStarsTransactions.inbound = i == 1;
        tL_payments_getStarsTransactions.outbound = i == 2;
        String str = transactionsState.offset[i];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsTransactions, new MessageSeenView$$ExternalSyntheticLambda4(this, transactionsState, i, j, 4));
    }

    public final void onUpdate(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        if (tL_updateStarsRevenueStatus == null) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId >= 0) {
            TLRPC.TL_payments_starsRevenueStats starsRevenueStats = getStarsRevenueStats(peerDialogId, true);
            if (starsRevenueStats != null) {
                starsRevenueStats.status = tL_updateStarsRevenueStatus.status;
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
            }
            invalidateTransactions(peerDialogId);
            return;
        }
        ChannelMonetizationLayout channelMonetizationLayout = ChannelMonetizationLayout.instance;
        if (channelMonetizationLayout == null || channelMonetizationLayout.dialogId != DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
            return;
        }
        ChannelMonetizationLayout channelMonetizationLayout2 = ChannelMonetizationLayout.instance;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
        channelMonetizationLayout2.setupBalances(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
        ChannelMonetizationLayout.instance.reloadTransactions();
    }
}
