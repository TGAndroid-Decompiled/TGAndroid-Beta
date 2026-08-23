package org.telegram.ui.Stars;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.ToIntFunction;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.bots.BotWebViewSheet;

public class StarsController {
    private static volatile StarsController[][] Instance = (StarsController[][]) Array.newInstance((Class<?>) StarsController.class, 2, 4);
    private static final Object[][] lockObjects = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    private boolean balanceLoaded;
    private boolean balanceLoading;
    public final int currentAccount;
    private PaidMessagesToast currentPaidMessagesToast;
    public PendingPaidReactions currentPendingReactions;
    private ArrayList giftOptions;
    private boolean giftOptionsLoaded;
    private boolean giftOptionsLoading;
    private boolean giftsCacheLoaded;
    public int giftsHash;
    public boolean giftsLoaded;
    public boolean giftsLoading;
    public long giftsRemoteTime;
    private ArrayList giveawayOptions;
    private boolean giveawayOptionsLoaded;
    private boolean giveawayOptionsLoading;
    private boolean insufficientSubscriptionsLoading;
    private long lastBalanceLoaded;
    public long minus;
    private ArrayList options;
    private boolean optionsLoaded;
    private boolean optionsLoading;
    private boolean paymentFormOpened;
    public boolean subscriptionsEndReached;
    public boolean subscriptionsLoading;
    public String subscriptionsOffset;
    public final boolean ton;
    public TL_stars.StarsAmount balance = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] transactions = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] transactionsExist = new boolean[3];
    private final String[] offset = new String[3];
    private final boolean[] loading = new boolean[3];
    private final boolean[] endReached = new boolean[3];
    public final ArrayList subscriptions = new ArrayList();
    public final ArrayList insufficientSubscriptions = new ArrayList();
    public final ArrayList gifts = new ArrayList();
    public final ArrayList sortedGifts = new ArrayList();
    public final ArrayList birthdaySortedGifts = new ArrayList();
    public final LongSparseArray giftCollections = new LongSparseArray();
    public final LongSparseArray giftLists = new LongSparseArray();
    private ConcurrentHashMap giftPreviews = new ConcurrentHashMap();
    public final ConcurrentHashMap justAgreedToNotAskDialogs = new ConcurrentHashMap();
    public final ConcurrentHashMap sendingMessagesCount = new ConcurrentHashMap();
    private final Set sendingPaidMessagesIds = Collections.newSetFromMap(new ConcurrentHashMap());
    private final ConcurrentHashMap postponedPaidMessages = new ConcurrentHashMap();

    public interface IGiftsList {
        int findGiftToUpgrade(int i);

        Object get(int i);

        int getLoadedCount();

        int getTotalCount();

        int indexOf(Object obj);

        void load();

        void notifyUpdate();
    }

    public static void m4214$r8$lambda$_CaaQE60qTIO9sLAkjRqiU8go() {
    }

    static {
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                lockObjects[i][i2] = new Object();
            }
        }
    }

    public static StarsController getTonInstance(int i) {
        return getInstance(i, true);
    }

    public static StarsController getInstance(int i) {
        return getInstance(i, false);
    }

    public static StarsController getInstance(int i, AmountUtils$Currency amountUtils$Currency) {
        return getInstance(i, amountUtils$Currency == AmountUtils$Currency.TON);
    }

    public static StarsController getInstance(int i, boolean z) {
        StarsController starsController;
        StarsController starsController2 = Instance[z ? 1 : 0][i];
        if (starsController2 != null) {
            return starsController2;
        }
        synchronized (lockObjects[z ? 1 : 0][i]) {
            try {
                starsController = Instance[z ? 1 : 0][i];
                if (starsController == null) {
                    StarsController[] starsControllerArr = Instance[z ? 1 : 0];
                    StarsController starsController3 = new StarsController(i, z);
                    starsControllerArr[i] = starsController3;
                    starsController = starsController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return starsController;
    }

    private StarsController(int i, boolean z) {
        this.currentAccount = i;
        this.ton = z;
    }

    public TL_stars.StarsAmount getBalance() {
        return getBalance((Runnable) null);
    }

    public AmountUtils$Amount getBalanceAmount() {
        AmountUtils$Amount amountUtils$AmountOf = AmountUtils$Amount.of(getBalance());
        if (amountUtils$AmountOf == null) {
            return AmountUtils$Amount.fromNano(0L, this.ton ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS);
        }
        return amountUtils$AmountOf;
    }

    public long getBalance(boolean z) {
        return getBalance(z, null, false).amount;
    }

    public TL_stars.StarsAmount getBalance(Runnable runnable) {
        return getBalance(true, runnable, false);
    }

    public TL_stars.StarsAmount getBalance(boolean z, final Runnable runnable, boolean z2) {
        if (((!this.balanceLoaded || System.currentTimeMillis() - this.lastBalanceLoaded > 60000) && !this.balanceLoading) || z2) {
            this.balanceLoading = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.ton;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsStatus, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.$r8$lambda$jB3uWSbVFhI6C4YE7w1k_ZogJk8(this.f$0, runnable, tLObject, tL_error);
                }
            });
        }
        if (z && this.minus > 0) {
            AmountUtils$Amount amountUtils$AmountOfSafe = AmountUtils$Amount.ofSafe(this.balance);
            return AmountUtils$Amount.fromDecimal(Math.max(0L, amountUtils$AmountOfSafe.asDecimal() - this.minus), amountUtils$AmountOfSafe.currency).toTl();
        }
        return this.balance;
    }

    public static void $r8$lambda$jB3uWSbVFhI6C4YE7w1k_ZogJk8(final StarsController starsController, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$eg3uiHI8e_tLwG9HJYQ0IHgdm1Q(this.f$0, tLObject, runnable);
            }
        });
    }

    public static void $r8$lambda$eg3uiHI8e_tLwG9HJYQ0IHgdm1Q(StarsController starsController, TLObject tLObject, Runnable runnable) {
        boolean z;
        boolean z2;
        boolean z3 = !starsController.balanceLoaded;
        starsController.lastBalanceLoaded = System.currentTimeMillis();
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(starsController.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(starsController.currentAccount).putChats(starsStatus.chats, false);
            if (starsController.transactions[0].isEmpty()) {
                ArrayList<TL_stars.StarsTransaction> arrayList = starsStatus.history;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TL_stars.StarsTransaction starsTransaction = arrayList.get(i);
                    i++;
                    TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                    starsController.transactions[0].add(starsTransaction2);
                    starsController.transactions[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                }
                for (int i2 = 0; i2 < 3; i2++) {
                    starsController.transactionsExist[i2] = !starsController.transactions[i2].isEmpty() || starsController.transactionsExist[i2];
                    boolean[] zArr = starsController.endReached;
                    boolean z4 = (starsStatus.flags & 1) == 0;
                    zArr[i2] = z4;
                    if (z4) {
                        starsController.loading[i2] = false;
                    }
                    starsController.offset[i2] = zArr[i2] ? null : starsStatus.next_offset;
                }
                z = true;
            } else {
                z = false;
            }
            if (starsController.subscriptions.isEmpty()) {
                starsController.subscriptions.addAll(starsStatus.subscriptions);
                starsController.subscriptionsLoading = false;
                starsController.subscriptionsOffset = starsStatus.subscriptions_next_offset;
                starsController.subscriptionsEndReached = (starsStatus.flags & 4) == 0;
                z2 = true;
            } else {
                z2 = false;
            }
            long j = starsController.balance.amount;
            TL_stars.StarsAmount starsAmount = starsStatus.balance;
            if (j != starsAmount.amount) {
                z3 = true;
            }
            starsController.balance = starsAmount;
            starsController.minus = 0L;
        } else {
            z = false;
            z2 = false;
        }
        starsController.balanceLoading = false;
        starsController.balanceLoaded = true;
        if (z3) {
            NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        if (z) {
            NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starTransactionsLoaded, new Object[0]);
        }
        if (z2) {
            NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean canUseTon() {
        if (!this.ton) {
            return false;
        }
        if (TONIntroActivity.allowTopUp()) {
            return true;
        }
        TL_stars.StarsAmount balance = getBalance();
        return (balance.nanos == 0 && balance.amount == 0) ? false : true;
    }

    public void invalidateBalance() {
        this.balanceLoaded = false;
        getBalance();
        this.balanceLoaded = true;
    }

    public void invalidateBalance(Runnable runnable) {
        this.balanceLoaded = false;
        getBalance(false, runnable, true);
        this.balanceLoaded = true;
    }

    public void updateBalance(TL_stars.StarsAmount starsAmount) {
        if (!this.balance.equals(starsAmount)) {
            this.balance = starsAmount;
            this.minus = 0L;
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.minus != 0) {
            this.minus = 0L;
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
    }

    public boolean balanceAvailable() {
        return this.balanceLoaded;
    }

    public ArrayList getOptions() {
        if (this.optionsLoading || this.optionsLoaded) {
            return this.options;
        }
        this.optionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.$r8$lambda$6JEx8_TrfbXFHKbKcMqJfI7YAVM(this.f$0, tLObject, tL_error);
            }
        });
        return this.options;
    }

    public static void $r8$lambda$6JEx8_TrfbXFHKbKcMqJfI7YAVM(final StarsController starsController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.m4212$r8$lambda$UWon6LcgZnftrsCWmL7Ghso3DE(this.f$0, tLObject);
            }
        });
    }

    public static void m4212$r8$lambda$UWon6LcgZnftrsCWmL7Ghso3DE(final StarsController starsController, TLObject tLObject) {
        starsController.getClass();
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                if (obj instanceof TL_stars.TL_starsTopupOption) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                    arrayList.add(tL_starsTopupOption);
                    if (tL_starsTopupOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tL_starsTopupOption);
                        tL_starsTopupOption.loadingStorePrice = true;
                    }
                }
            }
            starsController.optionsLoaded = true;
        }
        starsController.options = arrayList;
        starsController.optionsLoading = false;
        NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starOptionsLoaded, new Object[0]);
        if (arrayList2.isEmpty()) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$HvmJ62FicKm0RQQVOBWgWPj4zdg(this.f$0, arrayList2);
            }
        };
        if (!BillingController.getInstance().isReady()) {
            BillingController.getInstance().whenSetuped(runnable);
        } else {
            runnable.run();
        }
    }

    public static void $r8$lambda$HvmJ62FicKm0RQQVOBWgWPj4zdg(final StarsController starsController, final ArrayList arrayList) {
        starsController.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TL_stars.TL_starsTopupOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new BillingController.ProductDetailsResponseListenerLegacy() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.m4215$r8$lambda$aQBbLDlxm68EHYJOylDwiuZWnc(this.f$0, arrayList, billingResult, list);
            }
        });
    }

    public static void m4215$r8$lambda$aQBbLDlxm68EHYJOylDwiuZWnc(final StarsController starsController, final ArrayList arrayList, final BillingResult billingResult, final List list) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$5LJK0nJQfKZ1qdJ3Q9pENaAIdQU(this.f$0, billingResult, list, arrayList);
            }
        });
    }

    public static void $r8$lambda$5LJK0nJQfKZ1qdJ3Q9pENaAIdQU(StarsController starsController, BillingResult billingResult, List list, ArrayList arrayList) {
        TL_stars.TL_starsTopupOption tL_starsTopupOption;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        starsController.getClass();
        if (billingResult.getResponseCode() != 0) {
            starsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            return;
        }
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ProductDetails productDetails = (ProductDetails) list.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        tL_starsTopupOption = null;
                        break;
                    } else {
                        if (((TL_stars.TL_starsTopupOption) arrayList.get(i2)).store_product.equals(productDetails.getProductId())) {
                            tL_starsTopupOption = (TL_stars.TL_starsTopupOption) arrayList.get(i2);
                            break;
                        }
                        i2++;
                    }
                }
                if (tL_starsTopupOption != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                    tL_starsTopupOption.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                    tL_starsTopupOption.amount = (long) ((oneTimePurchaseOfferDetails.getPriceAmountMicros() / Math.pow(10.0d, 6.0d)) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)));
                    tL_starsTopupOption.loadingStorePrice = false;
                }
            }
        }
        if (starsController.options != null) {
            for (int i3 = 0; i3 < starsController.options.size(); i3++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) starsController.options.get(i3);
                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                    tL_starsTopupOption2.missingStorePrice = true;
                }
            }
        }
        NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starOptionsLoaded, new Object[0]);
    }

    public ArrayList getGiftOptions() {
        if (this.giftOptionsLoading || this.giftOptionsLoaded) {
            return this.giftOptions;
        }
        this.giftOptionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.m4213$r8$lambda$XR9EsXeH550JhyzqVdx4zkRfw8(this.f$0, tLObject, tL_error);
            }
        });
        return this.giftOptions;
    }

    public static void m4213$r8$lambda$XR9EsXeH550JhyzqVdx4zkRfw8(final StarsController starsController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$Z3IUMcJD6ICp3OAQh79f9ZaY7nU(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$Z3IUMcJD6ICp3OAQh79f9ZaY7nU(final StarsController starsController, TLObject tLObject) {
        starsController.getClass();
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                if (obj instanceof TL_stars.TL_starsGiftOption) {
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj;
                    arrayList.add(tL_starsGiftOption);
                    if (tL_starsGiftOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tL_starsGiftOption);
                        tL_starsGiftOption.loadingStorePrice = true;
                    }
                }
            }
            starsController.giftOptionsLoaded = true;
        }
        starsController.giftOptions = arrayList;
        starsController.giftOptionsLoading = false;
        NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
        if (arrayList2.isEmpty()) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$E2pgljsMpDTlGFSzrWlQyTVBVlc(this.f$0, arrayList2);
            }
        };
        if (!BillingController.getInstance().isReady()) {
            BillingController.getInstance().whenSetuped(runnable);
        } else {
            runnable.run();
        }
    }

    public static void $r8$lambda$E2pgljsMpDTlGFSzrWlQyTVBVlc(final StarsController starsController, final ArrayList arrayList) {
        starsController.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TL_stars.TL_starsGiftOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new BillingController.ProductDetailsResponseListenerLegacy() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.m4223$r8$lambda$oYKWwxdPXz_VU79ULkKrCY2CoY(this.f$0, arrayList, billingResult, list);
            }
        });
    }

    public static void m4223$r8$lambda$oYKWwxdPXz_VU79ULkKrCY2CoY(final StarsController starsController, final ArrayList arrayList, final BillingResult billingResult, final List list) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$vhRt34eLrCGVvMcX2z3ExcJ1rdE(this.f$0, billingResult, list, arrayList);
            }
        });
    }

    public static void $r8$lambda$vhRt34eLrCGVvMcX2z3ExcJ1rdE(StarsController starsController, BillingResult billingResult, List list, ArrayList arrayList) {
        TL_stars.TL_starsGiftOption tL_starsGiftOption;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        starsController.getClass();
        if (billingResult.getResponseCode() != 0) {
            starsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            return;
        }
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ProductDetails productDetails = (ProductDetails) list.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        tL_starsGiftOption = null;
                        break;
                    } else {
                        if (((TL_stars.TL_starsGiftOption) arrayList.get(i2)).store_product.equals(productDetails.getProductId())) {
                            tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList.get(i2);
                            break;
                        }
                        i2++;
                    }
                }
                if (tL_starsGiftOption != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                    tL_starsGiftOption.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                    tL_starsGiftOption.amount = (long) ((oneTimePurchaseOfferDetails.getPriceAmountMicros() / Math.pow(10.0d, 6.0d)) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)));
                    tL_starsGiftOption.loadingStorePrice = false;
                }
            }
        }
        if (starsController.giftOptions != null) {
            for (int i3 = 0; i3 < starsController.giftOptions.size(); i3++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) starsController.giftOptions.get(i3);
                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                    tL_starsGiftOption2.missingStorePrice = true;
                }
            }
        }
        NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
    }

    public ArrayList getGiveawayOptions() {
        if (this.giveawayOptionsLoading || this.giveawayOptionsLoaded) {
            return this.giveawayOptions;
        }
        this.giveawayOptionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.m4230$r8$lambda$zSf1Ixy5O01ZT_aMdOiA1Xo0w(this.f$0, tLObject, tL_error);
            }
        });
        return this.giveawayOptions;
    }

    public static void m4230$r8$lambda$zSf1Ixy5O01ZT_aMdOiA1Xo0w(final StarsController starsController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$ZOpfiq4HTYapQjLnzatqZWszlsM(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$ZOpfiq4HTYapQjLnzatqZWszlsM(final StarsController starsController, TLObject tLObject) {
        starsController.getClass();
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                if (obj instanceof TL_stars.TL_starsGiveawayOption) {
                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj;
                    arrayList.add(tL_starsGiveawayOption);
                    if (tL_starsGiveawayOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tL_starsGiveawayOption);
                        tL_starsGiveawayOption.loadingStorePrice = true;
                    }
                }
            }
            starsController.giveawayOptionsLoaded = true;
        }
        starsController.giveawayOptions = arrayList;
        starsController.giveawayOptionsLoading = false;
        NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
        if (arrayList2.isEmpty()) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$Qobo3ysRaIGdmaNh6nsqCdiX_R4(this.f$0, arrayList2);
            }
        };
        if (!BillingController.getInstance().isReady()) {
            BillingController.getInstance().whenSetuped(runnable);
        } else {
            runnable.run();
        }
    }

    public static void $r8$lambda$Qobo3ysRaIGdmaNh6nsqCdiX_R4(final StarsController starsController, final ArrayList arrayList) {
        starsController.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TL_stars.TL_starsGiveawayOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new BillingController.ProductDetailsResponseListenerLegacy() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.m4198$r8$lambda$AN3SoZPVLKKLVvX4h4MoI67qE(this.f$0, arrayList, billingResult, list);
            }
        });
    }

    public static void m4198$r8$lambda$AN3SoZPVLKKLVvX4h4MoI67qE(final StarsController starsController, final ArrayList arrayList, final BillingResult billingResult, final List list) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$FCCrCbIFwIK9MP9FxmwCAw9tliw(this.f$0, billingResult, list, arrayList);
            }
        });
    }

    public static void $r8$lambda$FCCrCbIFwIK9MP9FxmwCAw9tliw(StarsController starsController, BillingResult billingResult, List list, ArrayList arrayList) {
        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        starsController.getClass();
        if (billingResult.getResponseCode() != 0) {
            starsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            return;
        }
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ProductDetails productDetails = (ProductDetails) list.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        tL_starsGiveawayOption = null;
                        break;
                    } else {
                        if (((TL_stars.TL_starsGiveawayOption) arrayList.get(i2)).store_product.equals(productDetails.getProductId())) {
                            tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList.get(i2);
                            break;
                        }
                        i2++;
                    }
                }
                if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                    tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                    tL_starsGiveawayOption.amount = (long) ((oneTimePurchaseOfferDetails.getPriceAmountMicros() / Math.pow(10.0d, 6.0d)) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)));
                    tL_starsGiveawayOption.loadingStorePrice = false;
                }
            }
        }
        if (starsController.giveawayOptions != null) {
            for (int i3 = 0; i3 < starsController.giveawayOptions.size(); i3++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController.giveawayOptions.get(i3);
                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                    tL_starsGiveawayOption2.missingStorePrice = true;
                }
            }
        }
        NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
    }

    private void bulletinError(TLRPC.TL_error tL_error, String str) {
        if (tL_error != null) {
            str = tL_error.text;
        }
        bulletinError(str);
    }

    private void bulletinError(String str) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        ((lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment)).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str)).show();
    }

    public void invalidateTransactions(boolean z) {
        for (int i = 0; i < 3; i++) {
            if (!this.loading[i]) {
                this.transactions[i].clear();
                this.offset[i] = null;
                this.loading[i] = false;
                this.endReached[i] = false;
                if (z) {
                    loadTransactions(i);
                }
            }
        }
    }

    public void loadTransactions(final int i) {
        boolean[] zArr = this.loading;
        if (zArr[i] || this.endReached[i]) {
            return;
        }
        zArr[i] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = this.ton;
        tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
        tL_payments_getStarsTransactions.inbound = i == 1;
        tL_payments_getStarsTransactions.outbound = i == 2;
        String str = this.offset[i];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.$r8$lambda$rNofGyji6emKcqkdemp_5_zNgOs(this.f$0, i, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$rNofGyji6emKcqkdemp_5_zNgOs(final StarsController starsController, final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$0bmoQrHCgPb1sopt2TC7WXuHkEA(this.f$0, i, tLObject);
            }
        });
    }

    public static void $r8$lambda$0bmoQrHCgPb1sopt2TC7WXuHkEA(StarsController starsController, int i, TLObject tLObject) {
        starsController.loading[i] = false;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(starsController.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(starsController.currentAccount).putChats(starsStatus.chats, false);
            starsController.transactions[i].addAll(starsStatus.history);
            starsController.transactionsExist[i] = !starsController.transactions[i].isEmpty() || starsController.transactionsExist[i];
            boolean[] zArr = starsController.endReached;
            boolean z = (starsStatus.flags & 1) == 0;
            zArr[i] = z;
            starsController.offset[i] = z ? null : starsStatus.next_offset;
            starsController.updateBalance(starsStatus.balance);
            NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starTransactionsLoaded, new Object[0]);
        }
    }

    public boolean didFullyLoadTransactions(int i) {
        return this.endReached[i];
    }

    public boolean hasTransactions() {
        return hasTransactions(0);
    }

    public boolean hasTransactions(int i) {
        return balanceAvailable() && !this.transactions[i].isEmpty();
    }

    public boolean hasSubscriptions() {
        return balanceAvailable() && !this.subscriptions.isEmpty();
    }

    public void invalidateSubscriptions(boolean z) {
        if (this.subscriptionsLoading) {
            return;
        }
        this.subscriptions.clear();
        this.subscriptionsOffset = null;
        this.subscriptionsLoading = false;
        this.subscriptionsEndReached = false;
        if (z) {
            loadSubscriptions();
        }
    }

    public void loadSubscriptions() {
        if (this.ton || this.subscriptionsLoading || this.subscriptionsEndReached) {
            return;
        }
        this.subscriptionsLoading = true;
        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
        String str = this.subscriptionsOffset;
        tL_getStarsSubscriptions.offset = str;
        if (str == null) {
            tL_getStarsSubscriptions.offset = "";
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_getStarsSubscriptions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.$r8$lambda$DRcRo4H7xRsZHcu9fbSAa2BDsy8(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$DRcRo4H7xRsZHcu9fbSAa2BDsy8(final StarsController starsController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.m4220$r8$lambda$j2kZ3TUVuqEfHIbcjteQk233Uk(this.f$0, tLObject);
            }
        });
    }

    public static void m4220$r8$lambda$j2kZ3TUVuqEfHIbcjteQk233Uk(StarsController starsController, TLObject tLObject) {
        starsController.subscriptionsLoading = false;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(starsController.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(starsController.currentAccount).putChats(starsStatus.chats, false);
            starsController.subscriptions.addAll(starsStatus.subscriptions);
            starsController.subscriptionsEndReached = (starsStatus.flags & 4) == 0;
            starsController.subscriptionsOffset = starsStatus.subscriptions_next_offset;
            starsController.updateBalance(starsStatus.balance);
            NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
        }
    }

    public boolean isLoadingSubscriptions() {
        return this.subscriptionsLoading;
    }

    public boolean didFullyLoadSubscriptions() {
        return this.subscriptionsEndReached;
    }

    public void loadInsufficientSubscriptions() {
        if (this.insufficientSubscriptionsLoading) {
            return;
        }
        this.insufficientSubscriptionsLoading = true;
        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
        tL_getStarsSubscriptions.missing_balance = true;
        tL_getStarsSubscriptions.offset = "";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_getStarsSubscriptions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.m4205$r8$lambda$MJdSoWK4CTwte4cus4ccMb8rD8(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m4205$r8$lambda$MJdSoWK4CTwte4cus4ccMb8rD8(final StarsController starsController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$GItNK2oXeWkweaBadMq7oAZDbbc(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$GItNK2oXeWkweaBadMq7oAZDbbc(StarsController starsController, TLObject tLObject) {
        starsController.insufficientSubscriptionsLoading = false;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(starsController.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(starsController.currentAccount).putChats(starsStatus.chats, false);
            starsController.insufficientSubscriptions.addAll(starsStatus.subscriptions);
            starsController.updateBalance(starsStatus.balance);
            NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
        }
    }

    public boolean hasInsufficientSubscriptions() {
        return !this.insufficientSubscriptions.isEmpty();
    }

    public Theme.ResourcesProvider getResourceProvider() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            return safeLastFragment.getResourceProvider();
        }
        return null;
    }

    public void showStarsTopup(final Activity activity, final long j, final String str) {
        if (!balanceAvailable()) {
            getBalance(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.showStarsTopupInternal(activity, j, str);
                }
            });
        } else {
            showStarsTopupInternal(activity, j, str);
        }
    }

    public void showStarsTopupInternal(Activity activity, long j, String str) {
        if (getBalance().amount >= j || j <= 0) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new Runnable() {
                @Override
                public final void run() {
                    StarsController.$r8$lambda$GVqWnHWIjEmLvTniSF7wHbjMeo8();
                }
            }).setDuration(5000).show(true);
            return;
        }
        new StarsIntroActivity.StarsNeededSheet(activity, null, j, 4, str, new Runnable() {
            @Override
            public final void run() {
                StarsController.m4214$r8$lambda$_CaaQE60qTIO9sLAkjRqiU8go();
            }
        }, 0L).show();
    }

    public static void $r8$lambda$GVqWnHWIjEmLvTniSF7wHbjMeo8() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.presentFragment(new StarsIntroActivity());
    }

    private boolean isInvoiceBillingDisabled(TLRPC.InputPeer inputPeer) {
        return AppGlobalConfig.getInstance(this.currentAccount).starsSpendTopUpInvoiceDisabled.get() && inputPeer != null;
    }

    public boolean canBuy(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null || !isInvoiceBillingDisabled(inputPeer)) {
            return true;
        }
        return BillingController.getInstance().isReady();
    }

    public void buy(final Activity activity, final TL_stars.TL_starsTopupOption tL_starsTopupOption, final Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment != null && lastFragment.getContext() != null) {
                showNoSupportDialog(lastFragment.getContext(), lastFragment.getResourceProvider());
                return;
            } else {
                showNoSupportDialog(activity, null);
                return;
            }
        }
        boolean zIsInvoiceBillingDisabled = isInvoiceBillingDisabled(inputPeer);
        if ((BuildVars.useInvoiceBilling() || !BillingController.getInstance().isReady()) && !zIsInvoiceBillingDisabled) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            final TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(getResourceProvider());
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.m4211$r8$lambda$URwfflcKYUwRheceHB4mKvlQYc(this.f$0, callback2, tL_inputInvoiceStars, tLObject, tL_error);
                }
            });
            return;
        }
        if (!BillingController.getInstance().isReady()) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            return;
        }
        final TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
        tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
        tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
        tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
        QueryProductDetailsParams.Product productBuild = QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tL_starsTopupOption.store_product).build();
        FileLog.d("StarsController.buy starts queryProductDetails");
        BillingController.getInstance().queryProductDetails(Arrays.asList(productBuild), new BillingController.ProductDetailsResponseListenerLegacy() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.$r8$lambda$DErIybbYfQ854cklBZI8aDA5518(list, callback2, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity);
                    }
                });
            }
        });
    }

    public static void m4211$r8$lambda$URwfflcKYUwRheceHB4mKvlQYc(final StarsController starsController, final Utilities.Callback2 callback2, final TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$FRim_ui_250cBn8YUlO_9lsnwXQ(this.f$0, tL_error, callback2, tLObject, tL_inputInvoiceStars);
            }
        });
    }

    public static void $r8$lambda$FRim_ui_250cBn8YUlO_9lsnwXQ(StarsController starsController, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars) {
        starsController.getClass();
        if (tL_error != null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, tL_error.text);
                return;
            }
            return;
        }
        PaymentFormActivity paymentFormActivity = null;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            paymentForm.invoice.recurring = true;
            MessagesController.getInstance(starsController.currentAccount).putUsers(paymentForm.users, false);
            paymentFormActivity = new PaymentFormActivity(paymentForm, tL_inputInvoiceStars, (BaseFragment) null);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            paymentFormActivity = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject);
        }
        if (paymentFormActivity == null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            }
            return;
        }
        paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
            @Override
            public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                StarsController.$r8$lambda$wJQar96j6YtvG_3jhJiROy7mhts(callback2, invoiceStatus);
            }
        });
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        if (AndroidUtilities.hasDialogOnTop(lastFragment)) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(paymentFormActivity, bottomSheetParams);
            return;
        }
        lastFragment.presentFragment(paymentFormActivity);
    }

    public static void $r8$lambda$wJQar96j6YtvG_3jhJiROy7mhts(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            if (callback2 != null) {
                callback2.run(Boolean.TRUE, null);
            }
        } else {
            if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PENDING || callback2 == null) {
                return;
            }
            callback2.run(Boolean.FALSE, null);
        }
    }

    public static void $r8$lambda$DErIybbYfQ854cklBZI8aDA5518(List list, final Utilities.Callback2 callback2, TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup, TL_stars.TL_starsTopupOption tL_starsTopupOption, Activity activity) {
        if (list.isEmpty()) {
            FileLog.d("StarsController.buy queryProductDetails done: no products");
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                }
            });
            return;
        }
        ProductDetails productDetails = (ProductDetails) list.get(0);
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
        if (oneTimePurchaseOfferDetails == null) {
            FileLog.d("StarsController.buy queryProductDetails done: no details");
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                }
            });
            return;
        }
        tL_inputStorePaymentStarsTopup.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        tL_inputStorePaymentStarsTopup.amount = (long) ((oneTimePurchaseOfferDetails.getPriceAmountMicros() / Math.pow(10.0d, 6.0d)) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)));
        BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
            @Override
            public final void accept(Object obj) {
                StarsController.$r8$lambda$qQaSoh4tsDlXULA6tHmBOxJ7qqw(callback2, (BillingResult) obj);
            }
        });
        BillingController.getInstance().setOnCanceled(new Runnable() {
            @Override
            public final void run() {
                StarsController.m4207$r8$lambda$N4Q4pfKNiiMlcRyDII8I9qqz4Y(callback2);
            }
        });
        FileLog.d("StarsController.buy launchBillingFlow");
        BillingController.getInstance().launchBillingFlow(activity, AccountInstance.getInstance(UserConfig.selectedAccount), tL_inputStorePaymentStarsTopup, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) list.get(0)).build()));
    }

    public static void $r8$lambda$qQaSoh4tsDlXULA6tHmBOxJ7qqw(final Utilities.Callback2 callback2, BillingResult billingResult) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        FileLog.d("StarsController.buy onResult " + z + " " + responseCodeString);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                callback2.run(Boolean.valueOf(z), responseCodeString);
            }
        });
    }

    public static void m4207$r8$lambda$N4Q4pfKNiiMlcRyDII8I9qqz4Y(final Utilities.Callback2 callback2) {
        FileLog.d("StarsController.buy onCanceled");
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                callback2.run(Boolean.FALSE, null);
            }
        });
    }

    public void buyGift(final Activity activity, final TL_stars.TL_starsGiftOption tL_starsGiftOption, long j, final Utilities.Callback2 callback2) {
        if (activity == null) {
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment != null && lastFragment.getContext() != null) {
                showNoSupportDialog(lastFragment.getContext(), lastFragment.getResourceProvider());
                return;
            } else {
                showNoSupportDialog(activity, null);
                return;
            }
        }
        if (BuildVars.useInvoiceBilling() || !BillingController.getInstance().isReady()) {
            TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
            tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
            tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
            tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
            tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
            final TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(getResourceProvider());
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.$r8$lambda$eEu9W2xMXiItx0hDmsXYC1aIeN0(this.f$0, callback2, tL_inputInvoiceStars, tLObject, tL_error);
                }
            });
            return;
        }
        final TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
        BillingController.getInstance().queryProductDetails(Arrays.asList(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tL_starsGiftOption.store_product).build()), new BillingController.ProductDetailsResponseListenerLegacy() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.$r8$lambda$rUfOOF0ayxBt89EjAUQcYfCsfIU(this.f$0, callback2, tL_inputStorePaymentStarsGift2, tL_starsGiftOption, activity, billingResult, list);
            }
        });
    }

    public static void $r8$lambda$eEu9W2xMXiItx0hDmsXYC1aIeN0(final StarsController starsController, final Utilities.Callback2 callback2, final TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$1i1nlBO3X5J4gM1KgJFtNOWaWEE(this.f$0, tL_error, callback2, tLObject, tL_inputInvoiceStars);
            }
        });
    }

    public static void $r8$lambda$1i1nlBO3X5J4gM1KgJFtNOWaWEE(StarsController starsController, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars) {
        starsController.getClass();
        if (tL_error != null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, tL_error.text);
                return;
            }
            return;
        }
        PaymentFormActivity paymentFormActivity = null;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            paymentForm.invoice.recurring = true;
            MessagesController.getInstance(starsController.currentAccount).putUsers(paymentForm.users, false);
            paymentFormActivity = new PaymentFormActivity(paymentForm, tL_inputInvoiceStars, (BaseFragment) null);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            paymentFormActivity = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject);
        }
        if (paymentFormActivity == null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            }
            return;
        }
        paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
            @Override
            public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                StarsController.$r8$lambda$aUXHaEjBJoTRLw17pXrAHfsMUDo(callback2, invoiceStatus);
            }
        });
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        if (AndroidUtilities.hasDialogOnTop(lastFragment)) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(paymentFormActivity, bottomSheetParams);
            return;
        }
        lastFragment.presentFragment(paymentFormActivity);
    }

    public static void $r8$lambda$aUXHaEjBJoTRLw17pXrAHfsMUDo(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            if (callback2 != null) {
                callback2.run(Boolean.TRUE, null);
            }
        } else {
            if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PENDING || callback2 == null) {
                return;
            }
            callback2.run(Boolean.FALSE, null);
        }
    }

    public static void $r8$lambda$rUfOOF0ayxBt89EjAUQcYfCsfIU(final StarsController starsController, final Utilities.Callback2 callback2, final TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift, final TL_stars.TL_starsGiftOption tL_starsGiftOption, final Activity activity, final BillingResult billingResult, final List list) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$EuTKw3x_fs3wYPpUoRfB97rlpD8(this.f$0, list, callback2, tL_inputStorePaymentStarsGift, tL_starsGiftOption, billingResult, activity);
            }
        });
    }

    public static void $r8$lambda$EuTKw3x_fs3wYPpUoRfB97rlpD8(StarsController starsController, final List list, final Utilities.Callback2 callback2, final TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift, TL_stars.TL_starsGiftOption tL_starsGiftOption, final BillingResult billingResult, final Activity activity) {
        starsController.getClass();
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                }
            });
            return;
        }
        final ProductDetails productDetails = (ProductDetails) list.get(0);
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
        if (oneTimePurchaseOfferDetails == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                }
            });
            return;
        }
        tL_inputStorePaymentStarsGift.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        tL_inputStorePaymentStarsGift.amount = (long) ((oneTimePurchaseOfferDetails.getPriceAmountMicros() / Math.pow(10.0d, 6.0d)) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)));
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
        ConnectionsManager.getInstance(starsController.currentAccount).sendRequest(tL_payments_canPurchaseStore, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.$r8$lambda$b7n4Xkga8tF3q667jc3QykwqdNI(tLObject, productDetails, billingResult, callback2, activity, tL_inputStorePaymentStarsGift, list, tL_error);
                    }
                });
            }
        });
    }

    public static void $r8$lambda$b7n4Xkga8tF3q667jc3QykwqdNI(TLObject tLObject, ProductDetails productDetails, final BillingResult billingResult, final Utilities.Callback2 callback2, Activity activity, TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift, List list, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
                @Override
                public final void accept(Object obj) {
                    StarsController.$r8$lambda$nG0zK4QkjDCJo3pETctNU0vmKhI(billingResult, callback2, (BillingResult) obj);
                }
            });
            BillingController.getInstance().setOnCanceled(new Runnable() {
                @Override
                public final void run() {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            callback2.run(Boolean.FALSE, null);
                        }
                    });
                }
            });
            BillingController.getInstance().launchBillingFlow(activity, AccountInstance.getInstance(UserConfig.selectedAccount), tL_inputStorePaymentStarsGift, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) list.get(0)).build()));
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
            }
        } else if (callback2 != null) {
            callback2.run(Boolean.FALSE, tL_error != null ? tL_error.text : "SERVER_ERROR");
        }
    }

    public static void $r8$lambda$nG0zK4QkjDCJo3pETctNU0vmKhI(BillingResult billingResult, final Utilities.Callback2 callback2, BillingResult billingResult2) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                callback2.run(Boolean.valueOf(z), responseCodeString);
            }
        });
    }

    public void buyGiveaway(final Activity activity, TLRPC.Chat chat, List list, TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i, List list2, int i2, boolean z, boolean z2, boolean z3, String str, final Utilities.Callback2 callback2) {
        if (activity == null) {
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment != null && lastFragment.getContext() != null) {
                showNoSupportDialog(lastFragment.getContext(), lastFragment.getResourceProvider());
                return;
            } else {
                showNoSupportDialog(activity, null);
                return;
            }
        }
        final TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z2;
        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z;
        tL_inputStorePaymentStarsGiveaway.stars = tL_starsGiveawayOption.stars;
        MessagesController.getInstance(this.currentAccount);
        tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
        if (list != null && !list.isEmpty()) {
            tL_inputStorePaymentStarsGiveaway.flags |= 2;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                ArrayList<TLRPC.InputPeer> arrayList = tL_inputStorePaymentStarsGiveaway.additional_peers;
                MessagesController.getInstance(this.currentAccount);
                arrayList.add(MessagesController.getInputPeer(tLObject));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) it2.next())).iso2);
        }
        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
            tL_inputStorePaymentStarsGiveaway.flags |= 4;
        }
        if (z3) {
            tL_inputStorePaymentStarsGiveaway.flags |= 16;
            tL_inputStorePaymentStarsGiveaway.prize_description = str;
        }
        tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
        tL_inputStorePaymentStarsGiveaway.until_date = i2;
        tL_inputStorePaymentStarsGiveaway.currency = tL_starsGiveawayOption.currency;
        tL_inputStorePaymentStarsGiveaway.amount = tL_starsGiveawayOption.amount;
        tL_inputStorePaymentStarsGiveaway.users = i;
        if (BuildVars.useInvoiceBilling() || !BillingController.getInstance().isReady() || tL_starsGiveawayOption.store_product == null) {
            final TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(getResourceProvider());
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    StarsController.m4203$r8$lambda$JXQGlRm1HTbT0yavfgmbYhrmng(this.f$0, callback2, tL_inputInvoiceStars, tLObject2, tL_error);
                }
            });
            return;
        }
        BillingController.getInstance().queryProductDetails(Arrays.asList(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tL_starsGiveawayOption.store_product).build()), new BillingController.ProductDetailsResponseListenerLegacy() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list3) {
                StarsController.m4229$r8$lambda$zMx6ZT729rZf200ZLOgAnJZ6E(this.f$0, callback2, tL_inputStorePaymentStarsGiveaway, activity, billingResult, list3);
            }
        });
    }

    public static void m4203$r8$lambda$JXQGlRm1HTbT0yavfgmbYhrmng(final StarsController starsController, final Utilities.Callback2 callback2, final TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$jEBDH9KYUsN2YaBlBVAMkOI1ZDo(this.f$0, tL_error, callback2, tLObject, tL_inputInvoiceStars);
            }
        });
    }

    public static void $r8$lambda$jEBDH9KYUsN2YaBlBVAMkOI1ZDo(StarsController starsController, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars) {
        starsController.getClass();
        if (tL_error != null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, tL_error.text);
                return;
            }
            return;
        }
        PaymentFormActivity paymentFormActivity = null;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            paymentForm.invoice.recurring = true;
            MessagesController.getInstance(starsController.currentAccount).putUsers(paymentForm.users, false);
            paymentFormActivity = new PaymentFormActivity(paymentForm, tL_inputInvoiceStars, (BaseFragment) null);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            paymentFormActivity = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject);
        }
        if (paymentFormActivity == null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            }
            return;
        }
        paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
            @Override
            public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                StarsController.$r8$lambda$0CbP5pj7F7P1HDfgSiiePMUv7Lo(callback2, invoiceStatus);
            }
        });
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        if (AndroidUtilities.hasDialogOnTop(lastFragment)) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(paymentFormActivity, bottomSheetParams);
            return;
        }
        lastFragment.presentFragment(paymentFormActivity);
    }

    public static void $r8$lambda$0CbP5pj7F7P1HDfgSiiePMUv7Lo(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            if (callback2 != null) {
                callback2.run(Boolean.TRUE, null);
            }
        } else {
            if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PENDING || callback2 == null) {
                return;
            }
            callback2.run(Boolean.FALSE, null);
        }
    }

    public static void m4229$r8$lambda$zMx6ZT729rZf200ZLOgAnJZ6E(final StarsController starsController, final Utilities.Callback2 callback2, final TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway, final Activity activity, final BillingResult billingResult, final List list) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.m4209$r8$lambda$QyeXIYYWo68_mwcW4Tp3NZSXNU(this.f$0, list, callback2, tL_inputStorePaymentStarsGiveaway, billingResult, activity);
            }
        });
    }

    public static void m4209$r8$lambda$QyeXIYYWo68_mwcW4Tp3NZSXNU(StarsController starsController, final List list, final Utilities.Callback2 callback2, final TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway, final BillingResult billingResult, final Activity activity) {
        starsController.getClass();
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                }
            });
            return;
        }
        final ProductDetails productDetails = (ProductDetails) list.get(0);
        if (productDetails.getOneTimePurchaseOfferDetails() == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                }
            });
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(starsController.currentAccount).sendRequest(tL_payments_canPurchaseStore, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.m4224$r8$lambda$qE9Zs7WyGEKPaMBs3dblGFThSk(tLObject, productDetails, billingResult, callback2, activity, tL_inputStorePaymentStarsGiveaway, list, tL_error);
                    }
                });
            }
        });
    }

    public static void m4224$r8$lambda$qE9Zs7WyGEKPaMBs3dblGFThSk(TLObject tLObject, ProductDetails productDetails, final BillingResult billingResult, final Utilities.Callback2 callback2, Activity activity, TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway, List list, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
                @Override
                public final void accept(Object obj) {
                    StarsController.$r8$lambda$91WsDiYUJPjolDzHHV177eWySrw(billingResult, callback2, (BillingResult) obj);
                }
            });
            BillingController.getInstance().setOnCanceled(new Runnable() {
                @Override
                public final void run() {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            callback2.run(Boolean.FALSE, null);
                        }
                    });
                }
            });
            BillingController.getInstance().launchBillingFlow(activity, AccountInstance.getInstance(UserConfig.selectedAccount), tL_inputStorePaymentStarsGiveaway, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) list.get(0)).build()));
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
            }
        } else if (callback2 != null) {
            callback2.run(Boolean.FALSE, tL_error != null ? tL_error.text : "SERVER_ERROR");
        }
    }

    public static void $r8$lambda$91WsDiYUJPjolDzHHV177eWySrw(BillingResult billingResult, final Utilities.Callback2 callback2, BillingResult billingResult2) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                callback2.run(Boolean.valueOf(z), responseCodeString);
            }
        });
    }

    public Runnable pay(final MessageObject messageObject, final Runnable runnable) {
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (messageObject == null || context == null) {
            return null;
        }
        long dialogId = messageObject.getDialogId();
        int id = messageObject.getId();
        final TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
        tL_inputInvoiceMessage.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(dialogId);
        tL_inputInvoiceMessage.msg_id = id;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
        final int iSendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.$r8$lambda$8S9fwiWKQY64lRcnVMPHf2SOWYU(this.f$0, messageObject, tL_inputInvoiceMessage, runnable, tLObject, tL_error);
            }
        });
        return new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.getInstance(this.f$0.currentAccount).cancelRequest(iSendRequest, true);
            }
        };
    }

    public static void $r8$lambda$8S9fwiWKQY64lRcnVMPHf2SOWYU(final StarsController starsController, final MessageObject messageObject, final TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.m4219$r8$lambda$gF8ltFeuI57iYH_GifzSnPd6VE(this.f$0, tLObject, messageObject, tL_inputInvoiceMessage, runnable, tL_error);
            }
        });
    }

    public static void m4219$r8$lambda$gF8ltFeuI57iYH_GifzSnPd6VE(StarsController starsController, TLObject tLObject, MessageObject messageObject, TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage, Runnable runnable, TLRPC.TL_error tL_error) {
        starsController.getClass();
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            starsController.openPaymentForm(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, runnable, null);
        } else {
            starsController.bulletinError(tL_error, "NO_PAYMENT_FORM");
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void openPaymentForm(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Runnable runnable, final Utilities.Callback callback) {
        long dialogId;
        final String userName;
        final boolean z;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null && tL_payments_paymentFormStars.invoice != null && !this.paymentFormOpened) {
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentFormStars.users, false);
            Context context = LaunchActivity.instance;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            final Context context2 = context;
            final Theme.ResourcesProvider resourceProvider = getResourceProvider();
            if (context2 != null) {
                if (!balanceAvailable()) {
                    getBalance(new Runnable() {
                        @Override
                        public final void run() {
                            StarsController.$r8$lambda$JQtYXydnbvYbfSPPiy7NMNT1UkI(this.f$0, runnable, messageObject, inputInvoice, tL_payments_paymentFormStars, callback);
                        }
                    });
                    return;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                int size = arrayList.size();
                int i = 0;
                long j = 0;
                while (i < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                    i++;
                    j += tL_labeledPrice.amount;
                }
                if (messageObject != null && messageObject.type == 29) {
                    TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
                    if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null) {
                        dialogId = DialogObject.getPeerDialogId(peer);
                    } else {
                        dialogId = messageObject.getDialogId();
                    }
                } else {
                    dialogId = tL_payments_paymentFormStars.bot_id;
                }
                if (dialogId >= 0) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                    userName = UserObject.getUserName(user);
                    UserObject.isBot(user);
                    z = !UserObject.isBot(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                    userName = chat == null ? "" : chat.title;
                    z = false;
                }
                String str = tL_payments_paymentFormStars.title;
                if (runnable != null) {
                    runnable.run();
                }
                final int i2 = tL_payments_paymentFormStars.invoice.subscription_period;
                final boolean[] zArr = {false};
                final long j2 = dialogId;
                final long j3 = j;
                StarsIntroActivity.openConfirmPurchaseSheet(context2, resourceProvider, this.currentAccount, messageObject, j2, str, j3, tL_payments_paymentFormStars.photo, i2, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StarsController.m4195$r8$lambda$1EOvTkJw3L653tBUEcQgrPyEWs(this.f$0, j3, zArr, callback, context2, resourceProvider, z, userName, messageObject, inputInvoice, tL_payments_paymentFormStars, i2, j2, (Utilities.Callback) obj);
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.m4216$r8$lambda$dDVmgmPFHBhm3NQ591YnR9aR8s(this.f$0, zArr, callback);
                    }
                });
            }
        }
    }

    public static void $r8$lambda$JQtYXydnbvYbfSPPiy7NMNT1UkI(StarsController starsController, Runnable runnable, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback) {
        if (!starsController.balanceAvailable()) {
            starsController.bulletinError("NO_BALANCE");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        starsController.openPaymentForm(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
    }

    public static void m4195$r8$lambda$1EOvTkJw3L653tBUEcQgrPyEWs(final StarsController starsController, long j, final boolean[] zArr, final Utilities.Callback callback, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, String str, final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final int i, long j2, final Utilities.Callback callback2) {
        if (starsController.balance.amount < j) {
            if (!MessagesController.getInstance(starsController.currentAccount).starsPurchaseAvailable()) {
                starsController.paymentFormOpened = false;
                if (callback2 != null) {
                    callback2.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback != null) {
                    callback.run("cancelled");
                    zArr[0] = true;
                }
                showNoSupportDialog(context, resourcesProvider);
                return;
            }
            final boolean[] zArr2 = {false};
            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, z ? 9 : 0, str, new Runnable() {
                @Override
                public final void run() {
                    StarsController.$r8$lambda$FRZeScknA6YrbNU1kriAH6bC2Vk(this.f$0, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i, callback, callback2);
                }
            }, j2);
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    StarsController.$r8$lambda$epO9vC2rP7V1A3hOQ8jrQFbUOok(this.f$0, callback2, zArr2, zArr, callback, dialogInterface);
                }
            });
            starsNeededSheet.show();
            return;
        }
        starsController.payAfterConfirmed(messageObject, inputInvoice, tL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.$r8$lambda$o3rsUqG2k0w1hFkXcP03hws9edI(this.f$0, i, callback2, zArr, callback, (Boolean) obj);
            }
        });
    }

    public static void $r8$lambda$FRZeScknA6YrbNU1kriAH6bC2Vk(final StarsController starsController, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final boolean[] zArr2, final int i, final Utilities.Callback callback, final Utilities.Callback callback2) {
        starsController.getClass();
        zArr[0] = true;
        starsController.payAfterConfirmed(messageObject, inputInvoice, tL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.m4231$r8$lambda$zcOFQ6YN5XqO0Jcn6o9mWXitk0(this.f$0, zArr2, i, callback, callback2, (Boolean) obj);
            }
        });
    }

    public static void m4231$r8$lambda$zcOFQ6YN5XqO0Jcn6o9mWXitk0(StarsController starsController, boolean[] zArr, int i, Utilities.Callback callback, Utilities.Callback callback2, Boolean bool) {
        starsController.getClass();
        zArr[0] = true;
        if (i > 0) {
            starsController.invalidateSubscriptions(true);
        }
        if (callback != null) {
            callback.run(bool.booleanValue() ? "paid" : "failed");
        }
        if (callback2 != null) {
            callback2.run(Boolean.TRUE);
        }
    }

    public static void $r8$lambda$epO9vC2rP7V1A3hOQ8jrQFbUOok(StarsController starsController, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Utilities.Callback callback2, DialogInterface dialogInterface) {
        starsController.getClass();
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
        starsController.paymentFormOpened = false;
        if (zArr2[0] || callback2 == null) {
            return;
        }
        callback2.run("cancelled");
        zArr2[0] = true;
    }

    public static void $r8$lambda$o3rsUqG2k0w1hFkXcP03hws9edI(StarsController starsController, int i, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2, Boolean bool) {
        if (i > 0) {
            starsController.invalidateSubscriptions(true);
        } else {
            starsController.getClass();
        }
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed");
        }
    }

    public static void m4216$r8$lambda$dDVmgmPFHBhm3NQ591YnR9aR8s(StarsController starsController, boolean[] zArr, Utilities.Callback callback) {
        starsController.paymentFormOpened = false;
        if (zArr[0] || callback == null) {
            return;
        }
        callback.run("cancelled");
        zArr[0] = true;
    }

    public void subscribeTo(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        final long j = chatInvite.subscription_pricing.amount;
        if (context2 == null) {
            return;
        }
        final int i = UserConfig.selectedAccount;
        final boolean[] zArr = {false};
        StarsIntroActivity.openStarsChannelInviteSheet(context2, resourceProvider, i, chatInvite, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.$r8$lambda$zHrlS10JfmXFgJaYqG_4POoUuEk(this.f$0, j, i, zArr, callback2, context2, resourceProvider, chatInvite, str, (Utilities.Callback) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$fRendxPcUDz5_yMV2wx4wdPgGMQ(this.f$0, zArr, callback2);
            }
        });
    }

    public static void $r8$lambda$zHrlS10JfmXFgJaYqG_4POoUuEk(final StarsController starsController, long j, int i, final boolean[] zArr, final Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, final TLRPC.ChatInvite chatInvite, final String str, final Utilities.Callback callback) {
        if (starsController.balance.amount < j) {
            if (!MessagesController.getInstance(i).starsPurchaseAvailable()) {
                starsController.paymentFormOpened = false;
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                if (!zArr[0] && callback2 != null) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                }
                showNoSupportDialog(context, resourcesProvider);
                return;
            }
            final boolean[] zArr2 = {false};
            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 1, chatInvite.title, new Runnable() {
                @Override
                public final void run() {
                    StarsController.$r8$lambda$kbAD7BpEa74bhP6cw7ZRffBjcCw(this.f$0, zArr2, str, chatInvite, zArr, callback2, callback);
                }
            }, 0L);
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    StarsController.$r8$lambda$zZFuAwHulTIC84UqBuyIl9rmHug(this.f$0, callback, zArr2, zArr, callback2, dialogInterface);
                }
            });
            starsNeededSheet.show();
            return;
        }
        starsController.payAfterConfirmed(str, chatInvite, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StarsController.$r8$lambda$yV6q7CdJK6WXDtnzZld0gtRFjbE(callback, zArr, callback2, (Long) obj, (Boolean) obj2);
            }
        });
    }

    public static void $r8$lambda$kbAD7BpEa74bhP6cw7ZRffBjcCw(StarsController starsController, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, final boolean[] zArr2, final Utilities.Callback2 callback2, final Utilities.Callback callback) {
        starsController.getClass();
        zArr[0] = true;
        starsController.payAfterConfirmed(str, chatInvite, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StarsController.m4232$r8$lambda$znJy1AHu4aZaErIcGDMC8oLPo(zArr2, callback2, callback, (Long) obj, (Boolean) obj2);
            }
        });
    }

    public static void m4232$r8$lambda$znJy1AHu4aZaErIcGDMC8oLPo(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback, Long l, Boolean bool) {
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed", l);
        }
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public static void $r8$lambda$zZFuAwHulTIC84UqBuyIl9rmHug(StarsController starsController, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Utilities.Callback2 callback2, DialogInterface dialogInterface) {
        starsController.getClass();
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
        starsController.paymentFormOpened = false;
        if (zArr2[0] || callback2 == null) {
            return;
        }
        callback2.run("cancelled", 0L);
        zArr2[0] = true;
    }

    public static void $r8$lambda$yV6q7CdJK6WXDtnzZld0gtRFjbE(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2, Long l, Boolean bool) {
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed", l);
        }
    }

    public static void $r8$lambda$fRendxPcUDz5_yMV2wx4wdPgGMQ(StarsController starsController, boolean[] zArr, Utilities.Callback2 callback2) {
        starsController.paymentFormOpened = false;
        if (zArr[0] || callback2 == null) {
            return;
        }
        callback2.run("cancelled", 0L);
        zArr[0] = true;
    }

    public static void showNoSupportDialog(Context context, Theme.ResourcesProvider resourcesProvider) {
        new AlertDialog.Builder(context, resourcesProvider).setTitle(LocaleController.getString(R.string.StarsNotAvailableTitle)).setMessage(LocaleController.getString(R.string.StarsNotAvailableText)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
    }

    public void payAfterConfirmed(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Utilities.Callback callback) {
        long dialogId;
        String userName;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context == null) {
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        final long j = 0;
        int i = 0;
        while (i < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
            i++;
            j += tL_labeledPrice.amount;
        }
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                dialogId = DialogObject.getPeerDialogId(peer);
            } else {
                dialogId = messageObject.getDialogId();
            }
            if (dialogId < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                dialogId = user.id;
            }
        } else {
            dialogId = tL_payments_paymentFormStars.bot_id;
        }
        final long j2 = dialogId;
        if (j2 >= 0) {
            userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j2)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j2));
            userName = chat == null ? "" : chat.title;
        }
        final String str = userName;
        final String str2 = tL_payments_paymentFormStars.title;
        final int i2 = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.m4206$r8$lambda$MuwfEWSSTOAT5rSjAcAunaYPTQ(this.f$0, callback, messageObject, context, j, str, i2, str2, inputInvoice, j2, resourceProvider, tL_payments_paymentFormStars, tLObject, tL_error);
            }
        });
    }

    public static void m4206$r8$lambda$MuwfEWSSTOAT5rSjAcAunaYPTQ(final StarsController starsController, final Utilities.Callback callback, final MessageObject messageObject, final Context context, final long j, final String str, final int i, final String str2, final TLRPC.InputInvoice inputInvoice, final long j2, final Theme.ResourcesProvider resourcesProvider, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$N82GEYp3BvEwTa0iV0yywKpdhxo(this.f$0, tLObject, callback, messageObject, context, j, str, i, str2, inputInvoice, j2, tL_error, resourcesProvider, tL_payments_paymentFormStars);
            }
        });
    }

    public static void $r8$lambda$N82GEYp3BvEwTa0iV0yywKpdhxo(final StarsController starsController, TLObject tLObject, final Utilities.Callback callback, final MessageObject messageObject, Context context, long j, String str, int i, String str2, final TLRPC.InputInvoice inputInvoice, long j2, TLRPC.TL_error tL_error, Theme.ResourcesProvider resourcesProvider, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars) {
        TLRPC.Message message;
        starsController.paymentFormOpened = false;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactoryGlobal = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
            }
            final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws InterruptedException {
                    MessagesController.getInstance(this.f$0.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
                }
            });
            if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                bulletinFactoryGlobal.createSimpleBulletin(context.getResources().getDrawable(R.drawable.star_small_inner).mutate(), LocaleController.getString(R.string.StarsMediaPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsMediaPurchaseCompletedInfo", (int) j, str))).show();
            } else if (i > 0) {
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsBotSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsBotSubscriptionCompletedInfo", (int) j, str2, str))).show();
            } else {
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsPurchaseCompletedInfo", (int) j, str2, str))).show();
            }
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null && launchActivity.getFireworksOverlay() != null) {
                LaunchActivity.instance.getFireworksOverlay().start(true);
            }
            if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                starsController.invalidateTransactions(true);
            }
            if (messageObject != null) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia.peer = MessagesController.getInstance(starsController.currentAccount).getInputPeer(j2);
                tL_messages_getExtendedMedia.id.add(Integer.valueOf(messageObject.getId()));
                ConnectionsManager.getInstance(starsController.currentAccount).sendRequest(tL_messages_getExtendedMedia, null);
                return;
            }
            return;
        }
        if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(starsController.currentAccount).starsPurchaseAvailable()) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                showNoSupportDialog(context, resourcesProvider);
                return;
            } else {
                final boolean[] zArr = {false};
                StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 0, str, new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.m4210$r8$lambda$T6t5kJP4MDEAlbMFZ889IevwSM(this.f$0, zArr, messageObject, inputInvoice, tL_payments_paymentFormStars, callback);
                    }
                }, j2);
                starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        StarsController.$r8$lambda$deJyltirXToTnmOnXJMSLHPFZRA(callback, zArr, dialogInterface);
                    }
                });
                starsNeededSheet.show();
                return;
            }
        }
        if (tL_error == null || !"FORM_EXPIRED".equals(tL_error.text)) {
            if (callback != null) {
                callback.run(Boolean.FALSE);
            }
            bulletinFactoryGlobal.createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error != null ? tL_error.text : "FAILED_SEND_STARS")).show();
            if (messageObject != null) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia2.peer = MessagesController.getInstance(starsController.currentAccount).getInputPeer(j2);
                tL_messages_getExtendedMedia2.id.add(Integer.valueOf(messageObject.getId()));
                ConnectionsManager.getInstance(starsController.currentAccount).sendRequest(tL_messages_getExtendedMedia2, null);
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourcesProvider);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = inputInvoice;
        final BulletinFactory bulletinFactory = bulletinFactoryGlobal;
        ConnectionsManager.getInstance(starsController.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                StarsController.$r8$lambda$Jp_pZ0iyoWyrcwBpITHC6YsXiM4(this.f$0, messageObject, inputInvoice, callback, bulletinFactory, tLObject2, tL_error2);
            }
        });
    }

    public static void m4210$r8$lambda$T6t5kJP4MDEAlbMFZ889IevwSM(StarsController starsController, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Utilities.Callback callback) {
        starsController.getClass();
        zArr[0] = true;
        starsController.payAfterConfirmed(messageObject, inputInvoice, tL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.m4194$r8$lambda$RZjEMxvYCtyuSt_61udmFKLPfw(callback, (Boolean) obj);
            }
        });
    }

    public static void m4194$r8$lambda$RZjEMxvYCtyuSt_61udmFKLPfw(Utilities.Callback callback, Boolean bool) {
        if (callback != null) {
            callback.run(bool);
        }
    }

    public static void $r8$lambda$deJyltirXToTnmOnXJMSLHPFZRA(Utilities.Callback callback, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
    }

    public static void $r8$lambda$Jp_pZ0iyoWyrcwBpITHC6YsXiM4(final StarsController starsController, final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final Utilities.Callback callback, final BulletinFactory bulletinFactory, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$Vs_ywekFO1Ckzhs1kuEDghnu2GI(this.f$0, tLObject, messageObject, inputInvoice, callback, bulletinFactory, tL_error);
            }
        });
    }

    public static void $r8$lambda$Vs_ywekFO1Ckzhs1kuEDghnu2GI(StarsController starsController, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, BulletinFactory bulletinFactory, TLRPC.TL_error tL_error) {
        starsController.getClass();
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            starsController.payAfterConfirmed(messageObject, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, callback);
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        bulletinFactory.createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error != null ? tL_error.text : "FAILED_GETTING_FORM")).show();
    }

    private void payAfterConfirmed(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context == null) {
            return;
        }
        final long j = chatInvite.subscription_pricing.amount;
        final String str2 = chatInvite.title;
        TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
        tL_inputInvoiceChatInviteSubscription.hash = str;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.$r8$lambda$BbneXcS265i5fG2WwiwTs5BnoVA(this.f$0, callback2, j, str2, context, resourceProvider, chatInvite, str, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$BbneXcS265i5fG2WwiwTs5BnoVA(final StarsController starsController, final Utilities.Callback2 callback2, final long j, final String str, final Context context, final Theme.ResourcesProvider resourcesProvider, final TLRPC.ChatInvite chatInvite, final String str2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.m4221$r8$lambda$jrXc0sNvoUY9F9rtaLpzfuCEo(this.f$0, tLObject, callback2, j, str, tL_error, context, resourcesProvider, chatInvite, str2);
            }
        });
    }

    public static void m4221$r8$lambda$jrXc0sNvoUY9F9rtaLpzfuCEo(final StarsController starsController, TLObject tLObject, final Utilities.Callback2 callback2, long j, String str, TLRPC.TL_error tL_error, Context context, Theme.ResourcesProvider resourcesProvider, final TLRPC.ChatInvite chatInvite, final String str2) {
        starsController.paymentFormOpened = false;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactoryOf = !AndroidUtilities.hasDialogOnTop(lastFragment) ? BulletinFactory.of(lastFragment) : BulletinFactory.global();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws InterruptedException {
                    MessagesController.getInstance(this.f$0.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
                }
            });
            TLRPC.Updates updates = tL_payments_paymentResult.updates;
            TLRPC.Update update = updates.update;
            long j2 = update instanceof TL_update.TL_updateChannel ? -((TL_update.TL_updateChannel) update).channel_id : 0L;
            if (updates.updates != null) {
                for (int i = 0; i < tL_payments_paymentResult.updates.updates.size(); i++) {
                    if (tL_payments_paymentResult.updates.updates.get(i) instanceof TL_update.TL_updateChannel) {
                        j2 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i)).channel_id;
                    }
                }
            }
            if (callback2 != null) {
                callback2.run(Long.valueOf(j2), Boolean.TRUE);
            }
            if (j2 == 0) {
                bulletinFactoryOf.createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j, str))).show();
            }
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null && launchActivity.getFireworksOverlay() != null) {
                LaunchActivity.instance.getFireworksOverlay().start(true);
            }
            starsController.invalidateTransactions(true);
            starsController.invalidateSubscriptions(true);
            return;
        }
        if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (callback2 != null) {
                callback2.run(0L, Boolean.FALSE);
            }
            bulletinFactoryOf.createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error != null ? tL_error.text : "FAILED_SEND_STARS")).show();
        } else if (!MessagesController.getInstance(starsController.currentAccount).starsPurchaseAvailable()) {
            if (callback2 != null) {
                callback2.run(0L, Boolean.FALSE);
            }
            showNoSupportDialog(context, resourcesProvider);
        } else {
            final boolean[] zArr = {false};
            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 1, chatInvite.title, new Runnable() {
                @Override
                public final void run() {
                    StarsController.$r8$lambda$J8fuZu3TkOxx51WJIp3a5Afzpw0(this.f$0, zArr, str2, chatInvite, callback2);
                }
            }, 0L);
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    StarsController.m4197$r8$lambda$6oxdMonxiNsfmY_HYNHPjtUF7I(callback2, zArr, dialogInterface);
                }
            });
            starsNeededSheet.show();
        }
    }

    public static void $r8$lambda$J8fuZu3TkOxx51WJIp3a5Afzpw0(StarsController starsController, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        starsController.getClass();
        zArr[0] = true;
        starsController.payAfterConfirmed(str, chatInvite, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StarsController.m4227$r8$lambda$wNJonyjdy9Z4FZ9RC680nAQhM(callback2, (Long) obj, (Boolean) obj2);
            }
        });
    }

    public static void m4227$r8$lambda$wNJonyjdy9Z4FZ9RC680nAQhM(Utilities.Callback2 callback2, Long l, Boolean bool) {
        if (callback2 != null) {
            callback2.run(l, bool);
        }
    }

    public static void m4197$r8$lambda$6oxdMonxiNsfmY_HYNHPjtUF7I(Utilities.Callback2 callback2, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback2 == null || zArr[0]) {
            return;
        }
        callback2.run(0L, Boolean.FALSE);
    }

    public void updateMediaPrice(MessageObject messageObject, long j, Runnable runnable) {
        updateMediaPrice(messageObject, j, runnable, false);
    }

    private void updateMediaPrice(final MessageObject messageObject, final long j, final Runnable runnable, final boolean z) {
        if (messageObject == null) {
            runnable.run();
            return;
        }
        final long dialogId = messageObject.getDialogId();
        final int id = messageObject.getId();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        tL_messages_editMessage.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(dialogId);
        int i = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.id = id;
        tL_messages_editMessage.flags = i | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j;
        for (int i2 = 0; i2 < tL_messageMediaPaidMedia.extended_media.size(); i2++) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i2);
            if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
                runnable.run();
                return;
            }
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputMediaDocument.id = tL_inputDocument;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaDocument);
            }
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.m4226$r8$lambda$w5Kyg7LhyEWFTO58ygUdFZPKY(this.f$0, runnable, z, dialogId, id, messageObject, j, tLObject, tL_error);
            }
        });
    }

    public static void m4226$r8$lambda$w5Kyg7LhyEWFTO58ygUdFZPKY(final StarsController starsController, final Runnable runnable, final boolean z, final long j, final int i, final MessageObject messageObject, final long j2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$zZquM3yVVoCgyvKEhybrB3BleR0(this.f$0, tLObject, runnable, tL_error, z, j, i, messageObject, j2);
            }
        });
    }

    public static void $r8$lambda$zZquM3yVVoCgyvKEhybrB3BleR0(final StarsController starsController, final TLObject tLObject, final Runnable runnable, TLRPC.TL_error tL_error, boolean z, long j, int i, final MessageObject messageObject, final long j2) {
        starsController.getClass();
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws InterruptedException {
                    MessagesController.getInstance(this.f$0.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
                }
            });
            runnable.run();
        } else {
            if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z) {
                TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                tL_messages_getScheduledMessages.peer = MessagesController.getInstance(starsController.currentAccount).getInputPeer(j);
                tL_messages_getScheduledMessages.id.add(Integer.valueOf(i));
                ConnectionsManager.getInstance(starsController.currentAccount).sendRequest(tL_messages_getScheduledMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        StarsController.m4225$r8$lambda$s7R69qiUn6Ln9T19z4bwvx0HY(this.f$0, messageObject, j2, runnable, tLObject2, tL_error2);
                    }
                });
                return;
            }
            runnable.run();
        }
    }

    public static void m4225$r8$lambda$s7R69qiUn6Ln9T19z4bwvx0HY(final StarsController starsController, final MessageObject messageObject, final long j, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$QUXqqFn5RfiPGM1aldJNCXrri_w(this.f$0, tLObject, messageObject, j, runnable);
            }
        });
    }

    public static void $r8$lambda$QUXqqFn5RfiPGM1aldJNCXrri_w(StarsController starsController, TLObject tLObject, MessageObject messageObject, long j, Runnable runnable) {
        starsController.getClass();
        if (tLObject instanceof TLRPC.TL_messages_messages) {
            TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject;
            MessagesController.getInstance(starsController.currentAccount).putUsers(tL_messages_messages.users, false);
            MessagesController.getInstance(starsController.currentAccount).putChats(tL_messages_messages.chats, false);
            if (tL_messages_messages.messages.size() == 1 && (tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) && (tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                messageObject.messageOwner = tL_messages_messages.messages.get(0);
                starsController.updateMediaPrice(messageObject, j, runnable, true);
                return;
            } else {
                runnable.run();
                return;
            }
        }
        runnable.run();
    }

    public static class MessageId {
        public long did;
        public int mid;

        private MessageId(long j, int i) {
            this.did = j;
            this.mid = i;
        }

        public static MessageId from(long j, int i) {
            return new MessageId(j, i);
        }

        public static MessageId from(MessageObject messageObject) {
            if (messageObject == null) {
                return null;
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
                return new MessageId(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
            }
            return new MessageId(messageObject.getDialogId(), messageObject.getId());
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.did), Integer.valueOf(this.mid));
        }

        public boolean equals(Object obj) {
            if (obj instanceof MessageId) {
                MessageId messageId = (MessageId) obj;
                if (messageId.did == this.did && messageId.mid == this.mid) {
                    return true;
                }
            }
            return false;
        }
    }

    public long getPaidReactionsDialogId(MessageObject messageObject) {
        Long l;
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions != null && pendingPaidReactions.message.equals(MessageId.from(messageObject)) && (l = this.currentPendingReactions.peer) != null) {
            return l.longValue();
        }
        Long myPaidReactionPeer = messageObject == null ? null : messageObject.getMyPaidReactionPeer();
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.currentAccount).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public long getPaidReactionsDialogId(MessageId messageId, TLRPC.MessageReactions messageReactions) {
        Long l;
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions != null && pendingPaidReactions.message.equals(messageId) && (l = this.currentPendingReactions.peer) != null) {
            return l.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.currentAccount).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public class PendingPaidReactions {
        public long amount;
        public boolean applied;
        public Bulletin bulletin;
        public Bulletin.UndoButton bulletinButton;
        public Bulletin.TwoLineAnimatedLottieLayout bulletinLayout;
        public final Runnable cancelRunnable;
        public ChatActivity chatActivity;
        public final Runnable closeRunnable;
        public long lastTime;
        public MessageId message;
        public MessageObject messageObject;
        public long not_added;
        public StarReactionsOverlay overlay;
        public boolean shownBulletin;
        public Bulletin.TimerView timerView;
        public boolean wasChosen;
        public boolean committed = false;
        public boolean cancelled = false;
        public Long peer = null;

        public long getPeerId() {
            Long l = this.peer;
            return l != null ? l.longValue() : StarsController.this.getPaidReactionsDialogId(this.messageObject);
        }

        public boolean isAnonymous() {
            return getPeerId() == 2666000;
        }

        public void setOverlay(StarReactionsOverlay starReactionsOverlay) {
            this.overlay = starReactionsOverlay;
        }

        public String getToastTitle() {
            if (isAnonymous()) {
                return LocaleController.getString(R.string.StarsSentAnonymouslyTitle);
            }
            return (getPeerId() == 0 || getPeerId() == UserConfig.getInstance(StarsController.this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.StarsSentTitle) : LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(getPeerId()));
        }

        public PendingPaidReactions(MessageId messageId, MessageObject messageObject, ChatActivity chatActivity, long j, boolean z) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.close();
                }
            };
            this.closeRunnable = runnable;
            this.cancelRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.cancel();
                }
            };
            this.message = messageId;
            this.messageObject = messageObject;
            this.chatActivity = chatActivity;
            Context context = StarsController.this.getContext(chatActivity);
            Bulletin.TwoLineAnimatedLottieLayout twoLineAnimatedLottieLayout = new Bulletin.TwoLineAnimatedLottieLayout(context, chatActivity.themeDelegate);
            this.bulletinLayout = twoLineAnimatedLottieLayout;
            twoLineAnimatedLottieLayout.setAnimation(R.raw.stars_topup, new String[0]);
            this.bulletinLayout.titleTextView.setText(getToastTitle());
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, true, false, chatActivity.themeDelegate);
            this.bulletinButton = undoButton;
            undoButton.setText(LocaleController.getString(R.string.StarsSentUndo));
            this.bulletinButton.setUndoAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.cancel();
                }
            });
            Bulletin.TimerView timerView = new Bulletin.TimerView(context, chatActivity.themeDelegate);
            this.timerView = timerView;
            timerView.timeLeft = 5000L;
            timerView.setColor(Theme.getColor(Theme.key_undo_cancelColor, chatActivity.themeDelegate));
            this.bulletinButton.addView(this.timerView, LayoutHelper.createFrame(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.bulletinButton.undoTextView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.bulletinLayout.setButton(this.bulletinButton);
            Bulletin bulletinCreate = BulletinFactory.of(chatActivity).create(this.bulletinLayout, -1);
            this.bulletin = bulletinCreate;
            bulletinCreate.hideAfterBottomSheet = false;
            if (z) {
                bulletinCreate.show(true);
                this.shownBulletin = true;
            }
            this.bulletin.setOnHideListener(runnable);
            this.amount = 0L;
            this.lastTime = System.currentTimeMillis();
            this.wasChosen = messageObject.isPaidReactionChosen();
        }

        public void add(long j, boolean z) {
            if (this.committed || this.cancelled) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw new RuntimeException("adding more amount to committed reactions");
                }
                return;
            }
            this.amount += j;
            this.lastTime = System.currentTimeMillis();
            this.bulletinLayout.subtitleTextView.cancelAnimation();
            this.bulletinLayout.subtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) this.amount, new Object[0])), true);
            if (this.shownBulletin) {
                this.timerView.timeLeft = 5000L;
                AndroidUtilities.cancelRunOnUIThread(this.closeRunnable);
                AndroidUtilities.runOnUIThread(this.closeRunnable, 5000L);
            }
            if (z) {
                this.applied = true;
                this.messageObject.addPaidReactions((int) j, true, getPeerId());
                StarsController starsController = StarsController.this;
                starsController.minus += j;
                NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
                NotificationCenter.getInstance(StarsController.this.currentAccount).postNotificationName(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                this.applied = false;
                if (this.messageObject.ensurePaidReactionsExist(true)) {
                    this.not_added--;
                }
                NotificationCenter.getInstance(StarsController.this.currentAccount).postNotificationName(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
                this.not_added += j;
            }
            this.bulletinLayout.titleTextView.setText(getToastTitle());
        }

        public void apply() {
            if (!this.applied) {
                this.applied = true;
                this.messageObject.addPaidReactions((int) this.not_added, true, getPeerId());
                StarsController starsController = StarsController.this;
                starsController.minus += this.not_added;
                NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starBalanceUpdated, new Object[0]);
                this.not_added = 0L;
                NotificationCenter.getInstance(StarsController.this.currentAccount).postNotificationName(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
            }
            if (!this.shownBulletin) {
                this.shownBulletin = true;
                this.timerView.timeLeft = 5000L;
                AndroidUtilities.cancelRunOnUIThread(this.closeRunnable);
                AndroidUtilities.runOnUIThread(this.closeRunnable, 5000L);
                this.bulletin.show(true);
                this.bulletin.setOnHideListener(this.closeRunnable);
            }
            this.bulletinLayout.titleTextView.setText(getToastTitle());
        }

        public void close() {
            AndroidUtilities.cancelRunOnUIThread(this.closeRunnable);
            if (this.applied) {
                commit();
            } else {
                this.cancelled = true;
                this.messageObject.addPaidReactions((int) (-this.amount), this.wasChosen, getPeerId());
                StarsController starsController = StarsController.this;
                starsController.minus -= this.amount;
                NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starBalanceUpdated, new Object[0]);
            }
            this.bulletin.hide();
            StarReactionsOverlay starReactionsOverlay = this.overlay;
            if (starReactionsOverlay != null && starReactionsOverlay.isShowing(this.messageObject)) {
                this.overlay.hide();
            }
            StarsController starsController2 = StarsController.this;
            if (starsController2.currentPendingReactions == this) {
                starsController2.currentPendingReactions = null;
            }
        }

        public void cancel() {
            AndroidUtilities.cancelRunOnUIThread(this.closeRunnable);
            this.cancelled = true;
            this.bulletin.hide();
            StarReactionsOverlay starReactionsOverlay = this.overlay;
            if (starReactionsOverlay != null) {
                starReactionsOverlay.hide();
            }
            this.messageObject.addPaidReactions((int) (-this.amount), this.wasChosen, getPeerId());
            StarsController starsController = StarsController.this;
            starsController.minus -= this.amount;
            NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starBalanceUpdated, new Object[0]);
            NotificationCenter.getInstance(StarsController.this.currentAccount).postNotificationName(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
            StarsController starsController2 = StarsController.this;
            if (starsController2.currentPendingReactions == this) {
                starsController2.currentPendingReactions = null;
            }
        }

        public void commit() {
            String forcedFirstName;
            if (this.committed || this.cancelled) {
                return;
            }
            StarsController starsController = StarsController.getInstance(StarsController.this.currentAccount);
            final MessagesController messagesController = MessagesController.getInstance(StarsController.this.currentAccount);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(StarsController.this.currentAccount);
            final long j = this.amount;
            if (starsController.balanceAvailable() && starsController.getBalance(false) < j) {
                this.cancelled = true;
                this.messageObject.addPaidReactions((int) (-this.amount), this.wasChosen, getPeerId());
                StarsController starsController2 = StarsController.this;
                starsController2.minus = 0L;
                NotificationCenter.getInstance(starsController2.currentAccount).postNotificationName(NotificationCenter.starBalanceUpdated, new Object[0]);
                NotificationCenter.getInstance(StarsController.this.currentAccount).postNotificationName(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
                if (this.message.did >= 0) {
                    forcedFirstName = UserObject.getForcedFirstName(this.chatActivity.getMessagesController().getUser(Long.valueOf(this.message.did)));
                } else {
                    TLRPC.Chat chat = this.chatActivity.getMessagesController().getChat(Long.valueOf(-this.message.did));
                    forcedFirstName = chat == null ? "" : chat.title;
                }
                String str = forcedFirstName;
                Context context = this.chatActivity.getContext();
                if (context == null) {
                    context = LaunchActivity.instance;
                }
                if (context == null) {
                    context = ApplicationLoader.applicationContext;
                }
                new StarsIntroActivity.StarsNeededSheet(context, this.chatActivity.getResourceProvider(), j, 5, str, new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.PendingPaidReactions pendingPaidReactions = this.f$0;
                        StarsController.this.sendPaidReaction(pendingPaidReactions.messageObject, pendingPaidReactions.chatActivity, j, true, true, pendingPaidReactions.peer);
                    }
                }, 0L).show();
                return;
            }
            this.committed = true;
            TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
            tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.message.did);
            tL_messages_sendPaidReaction.msg_id = this.message.mid;
            tL_messages_sendPaidReaction.random_id = (Utilities.random.nextLong() & 4294967295L) | (((long) connectionsManager.getCurrentTime()) << 32);
            tL_messages_sendPaidReaction.count = (int) this.amount;
            tL_messages_sendPaidReaction.flags = 1 | tL_messages_sendPaidReaction.flags;
            long peerId = getPeerId();
            if (peerId == 0 || peerId == UserConfig.getInstance(StarsController.this.currentAccount).getClientUserId()) {
                tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
            } else if (peerId == 2666000) {
                tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
            } else {
                TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                paidreactionprivacypeer.peer = messagesController.getInputPeer(peerId);
            }
            StarsController.this.invalidateBalance();
            connectionsManager.sendRequest(tL_messages_sendPaidReaction, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.PendingPaidReactions.$r8$lambda$Kkskxseamhr0bj594yocnYsr9Lw(this.f$0, messagesController, j, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$Kkskxseamhr0bj594yocnYsr9Lw(final PendingPaidReactions pendingPaidReactions, final MessagesController messagesController, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            pendingPaidReactions.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.PendingPaidReactions.$r8$lambda$kgS4hCJGCf5srCZESTQuQaVxgpA(this.f$0, tLObject, messagesController, tL_error, j);
                }
            });
        }

        public static void $r8$lambda$kgS4hCJGCf5srCZESTQuQaVxgpA(final PendingPaidReactions pendingPaidReactions, final TLObject tLObject, final MessagesController messagesController, TLRPC.TL_error tL_error, final long j) {
            String forcedFirstName;
            pendingPaidReactions.getClass();
            if (tLObject != null) {
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() throws InterruptedException {
                        messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                    }
                });
                return;
            }
            if (tL_error != null) {
                pendingPaidReactions.messageObject.addPaidReactions((int) (-pendingPaidReactions.amount), pendingPaidReactions.wasChosen, pendingPaidReactions.getPeerId());
                NotificationCenter.getInstance(StarsController.this.currentAccount).postNotificationName(NotificationCenter.didUpdateReactions, Long.valueOf(pendingPaidReactions.messageObject.getDialogId()), Integer.valueOf(pendingPaidReactions.messageObject.getId()), pendingPaidReactions.messageObject.messageOwner.reactions);
                if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                    if (pendingPaidReactions.message.did >= 0) {
                        forcedFirstName = UserObject.getForcedFirstName(pendingPaidReactions.chatActivity.getMessagesController().getUser(Long.valueOf(pendingPaidReactions.message.did)));
                    } else {
                        TLRPC.Chat chat = pendingPaidReactions.chatActivity.getMessagesController().getChat(Long.valueOf(-pendingPaidReactions.message.did));
                        forcedFirstName = chat == null ? "" : chat.title;
                    }
                    String str = forcedFirstName;
                    Context context = pendingPaidReactions.chatActivity.getContext();
                    if (context == null) {
                        context = LaunchActivity.instance;
                    }
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    new StarsIntroActivity.StarsNeededSheet(context, pendingPaidReactions.chatActivity.getResourceProvider(), j, 5, str, new Runnable() {
                        @Override
                        public final void run() {
                            StarsController.PendingPaidReactions pendingPaidReactions2 = this.f$0;
                            StarsController.this.sendPaidReaction(pendingPaidReactions2.messageObject, pendingPaidReactions2.chatActivity, j, true, true, pendingPaidReactions2.peer);
                        }
                    }, 0L).show();
                }
                StarsController.this.invalidateTransactions(false);
                StarsController.this.invalidateBalance();
            }
        }
    }

    public Context getContext(BaseFragment baseFragment) {
        if (baseFragment != null && baseFragment.getContext() != null) {
            return baseFragment.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.instance;
        }
        if (ApplicationLoader.applicationContext != null) {
            return ApplicationLoader.applicationContext;
        }
        return null;
    }

    public PendingPaidReactions sendPaidReaction(final MessageObject messageObject, final ChatActivity chatActivity, final long j, boolean z, boolean z2, final Long l) {
        final StarsController starsController;
        MessageId messageIdFrom = MessageId.from(messageObject);
        StarsController starsController2 = getInstance(this.currentAccount);
        Context context = getContext(chatActivity);
        if (context == null) {
            return null;
        }
        String forcedFirstName = "";
        if (z2 && starsController2.balanceAvailable() && starsController2.getBalance(false) <= 0) {
            long dialogId = chatActivity.getDialogId();
            if (dialogId >= 0) {
                forcedFirstName = UserObject.getForcedFirstName(chatActivity.getMessagesController().getUser(Long.valueOf(dialogId)));
            } else {
                TLRPC.Chat chat = chatActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    forcedFirstName = chat.title;
                }
            }
            new StarsIntroActivity.StarsNeededSheet(context, chatActivity.getResourceProvider(), j, 5, forcedFirstName, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.sendPaidReaction(messageObject, chatActivity, j, true, true, l);
                }
            }, 0L).show();
            return null;
        }
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions == null || !pendingPaidReactions.message.equals(messageIdFrom)) {
            PendingPaidReactions pendingPaidReactions2 = this.currentPendingReactions;
            if (pendingPaidReactions2 != null) {
                pendingPaidReactions2.close();
            }
            starsController = this;
            PendingPaidReactions pendingPaidReactions3 = starsController.new PendingPaidReactions(messageIdFrom, messageObject, chatActivity, ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), z);
            starsController.currentPendingReactions = pendingPaidReactions3;
            pendingPaidReactions3.peer = l;
        } else {
            starsController = this;
        }
        if (starsController.currentPendingReactions.amount + j > MessagesController.getInstance(starsController.currentAccount).starsPaidReactionAmountMax) {
            starsController.currentPendingReactions.close();
            starsController.currentPendingReactions = starsController.new PendingPaidReactions(messageIdFrom, messageObject, chatActivity, ConnectionsManager.getInstance(starsController.currentAccount).getCurrentTime(), z);
        }
        final long j2 = starsController.currentPendingReactions.amount + j;
        if (z2 && starsController2.balanceAvailable() && starsController2.getBalance(false) < j2) {
            starsController.currentPendingReactions.cancel();
            long dialogId2 = chatActivity.getDialogId();
            if (dialogId2 >= 0) {
                forcedFirstName = UserObject.getForcedFirstName(chatActivity.getMessagesController().getUser(Long.valueOf(dialogId2)));
            } else {
                TLRPC.Chat chat2 = chatActivity.getMessagesController().getChat(Long.valueOf(-dialogId2));
                if (chat2 != null) {
                    forcedFirstName = chat2.title;
                }
            }
            new StarsIntroActivity.StarsNeededSheet(context, chatActivity.getResourceProvider(), j2, 5, forcedFirstName, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.sendPaidReaction(messageObject, chatActivity, j2, true, true, l);
                }
            }, 0L).show();
            return null;
        }
        starsController.currentPendingReactions.add(j, !(messageObject == null || messageObject.doesPaidReactionExist()) || z);
        PendingPaidReactions pendingPaidReactions4 = starsController.currentPendingReactions;
        pendingPaidReactions4.peer = l;
        return pendingPaidReactions4;
    }

    public void undoPaidReaction() {
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions != null) {
            pendingPaidReactions.cancel();
        }
    }

    public void commitPaidReaction() {
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions != null) {
            pendingPaidReactions.close();
        }
    }

    public long getPendingPaidReactions(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return 0L;
        }
        if ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null) {
            return getPendingPaidReactions(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return getPendingPaidReactions(messageObject.getDialogId(), messageObject.getId());
    }

    public long getPendingPaidReactions(long j, int i) {
        PendingPaidReactions pendingPaidReactions = this.currentPendingReactions;
        if (pendingPaidReactions == null) {
            return 0L;
        }
        MessageId messageId = pendingPaidReactions.message;
        if (messageId.did == j && messageId.mid == i && pendingPaidReactions.applied) {
            return pendingPaidReactions.amount;
        }
        return 0L;
    }

    public void invalidateStarGifts() {
        this.giftsLoaded = false;
        this.giftsCacheLoaded = true;
        this.giftsRemoteTime = 0L;
        loadStarGifts();
    }

    public void loadStarGifts() {
        if (this.giftsLoading) {
            return;
        }
        if (!this.giftsLoaded || System.currentTimeMillis() - this.giftsRemoteTime >= 60000) {
            this.giftsLoading = true;
            if (!this.giftsCacheLoaded) {
                getStarGiftsCached(new Utilities.Callback5() {
                    @Override
                    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        StarsController.$r8$lambda$yDo8SPv83PDjdDT8jSf4OT6lyDs(this.f$0, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                    }
                });
            } else {
                getStarGiftsRemote(this.giftsHash, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StarsController.$r8$lambda$kiFbuDeLtfLxTFNKSyshr7haojU(this.f$0, (TL_stars.StarGifts) obj);
                    }
                });
            }
        }
    }

    public static void $r8$lambda$yDo8SPv83PDjdDT8jSf4OT6lyDs(StarsController starsController, ArrayList arrayList, Integer num, Long l, ArrayList arrayList2, ArrayList arrayList3) {
        MessagesController.getInstance(starsController.currentAccount).putUsers(arrayList2, true);
        MessagesController.getInstance(starsController.currentAccount).putChats(arrayList3, true);
        starsController.giftsCacheLoaded = true;
        starsController.gifts.clear();
        starsController.gifts.addAll(arrayList);
        starsController.birthdaySortedGifts.clear();
        starsController.birthdaySortedGifts.addAll(starsController.gifts);
        Collections.sort(starsController.birthdaySortedGifts, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ToIntFunction() {
            @Override
            public final int applyAsInt(Object obj) {
                return StarsController.$r8$lambda$Us9pnX4ICTEIGHoYchoexwVRQpM((TL_stars.StarGift) obj);
            }
        }), new ToIntFunction() {
            @Override
            public final int applyAsInt(Object obj) {
                return StarsController.m4204$r8$lambda$LJA61Htjvlsb7cftFmMy3Rd8((TL_stars.StarGift) obj);
            }
        }));
        starsController.sortedGifts.clear();
        starsController.sortedGifts.addAll(starsController.gifts);
        Collections.sort(starsController.sortedGifts, Comparator$CC.comparingInt(new ToIntFunction() {
            @Override
            public final int applyAsInt(Object obj) {
                return StarsController.$r8$lambda$8RIADxFUJE6nR9745iR3r7cnYBg((TL_stars.StarGift) obj);
            }
        }));
        starsController.giftsHash = num.intValue();
        starsController.giftsRemoteTime = l.longValue();
        starsController.giftsLoading = false;
        NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starGiftsLoaded, new Object[0]);
        starsController.loadStarGifts();
    }

    public static int m4204$r8$lambda$LJA61Htjvlsb7cftFmMy3Rd8(TL_stars.StarGift starGift) {
        return starGift.birthday ? -1 : 0;
    }

    public static int $r8$lambda$Us9pnX4ICTEIGHoYchoexwVRQpM(TL_stars.StarGift starGift) {
        return starGift.sold_out ? 1 : 0;
    }

    public static int $r8$lambda$8RIADxFUJE6nR9745iR3r7cnYBg(TL_stars.StarGift starGift) {
        return starGift.sold_out ? 1 : 0;
    }

    public static void $r8$lambda$kiFbuDeLtfLxTFNKSyshr7haojU(StarsController starsController, TL_stars.StarGifts starGifts) {
        starsController.giftsLoading = false;
        starsController.giftsLoaded = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            MessagesController.getInstance(starsController.currentAccount).putUsers(tL_starGifts.users, false);
            MessagesController.getInstance(starsController.currentAccount).putChats(tL_starGifts.chats, false);
            MessagesStorage.getInstance(starsController.currentAccount).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
            starsController.gifts.clear();
            starsController.gifts.addAll(tL_starGifts.gifts);
            starsController.birthdaySortedGifts.clear();
            starsController.birthdaySortedGifts.addAll(starsController.gifts);
            Collections.sort(starsController.birthdaySortedGifts, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return StarsController.$r8$lambda$MMWtfYJBPiAUTyzKvw5X7ukwj6I((TL_stars.StarGift) obj);
                }
            }), new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return StarsController.$r8$lambda$a2qcG_CF3BQhoiP7hSQh56K6RdQ((TL_stars.StarGift) obj);
                }
            }));
            starsController.sortedGifts.clear();
            starsController.sortedGifts.addAll(starsController.gifts);
            Collections.sort(starsController.sortedGifts, Comparator$CC.comparingInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return StarsController.$r8$lambda$71M4iF328AGMmc4MleP8xrfpq1Q((TL_stars.StarGift) obj);
                }
            }));
            starsController.giftsHash = tL_starGifts.hash;
            starsController.giftsRemoteTime = System.currentTimeMillis();
            NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.starGiftsLoaded, new Object[0]);
            starsController.saveStarGiftsCached(tL_starGifts.gifts, starsController.giftsHash, starsController.giftsRemoteTime);
            return;
        }
        if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            ArrayList arrayList = starsController.gifts;
            int i = starsController.giftsHash;
            long jCurrentTimeMillis = System.currentTimeMillis();
            starsController.giftsRemoteTime = jCurrentTimeMillis;
            starsController.saveStarGiftsCached(arrayList, i, jCurrentTimeMillis);
        }
    }

    public static int $r8$lambda$MMWtfYJBPiAUTyzKvw5X7ukwj6I(TL_stars.StarGift starGift) {
        return starGift.sold_out ? 1 : 0;
    }

    public static int $r8$lambda$a2qcG_CF3BQhoiP7hSQh56K6RdQ(TL_stars.StarGift starGift) {
        return starGift.birthday ? -1 : 0;
    }

    public static int $r8$lambda$71M4iF328AGMmc4MleP8xrfpq1Q(TL_stars.StarGift starGift) {
        return starGift.sold_out ? 1 : 0;
    }

    public void makeStarGiftSoldOut(TL_stars.StarGift starGift) {
        if (starGift == null || !this.giftsLoaded) {
            return;
        }
        starGift.availability_remains = 0;
        saveStarGiftsCached(this.gifts, this.giftsHash, this.giftsRemoteTime);
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starGiftSoldOut, starGift);
    }

    private void getStarGiftsCached(final Utilities.Callback5 callback5) {
        if (callback5 == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$ZHYZOMS4eAs0Ttd0VV1OF6XD8Cw(messagesStorage, arrayList3, arrayList2, arrayList, callback5);
            }
        });
    }

    public static void $r8$lambda$ZHYZOMS4eAs0Ttd0VV1OF6XD8Cw(MessagesStorage messagesStorage, final ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, final Utilities.Callback5 callback5) {
        ArrayList arrayList4;
        ArrayList arrayList5;
        Exception exc;
        final long j;
        final int i;
        long jLongValue;
        int iLongValue;
        int i2 = 0;
        long j2 = 0;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                jLongValue = 0;
                iLongValue = 0;
                while (sQLiteCursorQueryFinalized.next()) {
                    try {
                        try {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            if (nativeByteBufferByteBufferValue != null) {
                                TL_stars.StarGift starGiftTLdeserialize = TL_stars.StarGift.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                if (starGiftTLdeserialize != null) {
                                    arrayList.add(starGiftTLdeserialize);
                                }
                                nativeByteBufferByteBufferValue.reuse();
                                iLongValue = (int) sQLiteCursorQueryFinalized.longValue(1);
                                jLongValue = sQLiteCursorQueryFinalized.longValue(2);
                            }
                        } catch (Exception e) {
                            exc = e;
                            arrayList4 = arrayList2;
                            arrayList5 = arrayList3;
                            i2 = iLongValue;
                            j2 = jLongValue;
                            FileLog.e(exc);
                            if (sQLiteCursorQueryFinalized != null) {
                                iLongValue = i2;
                                jLongValue = j2;
                                sQLiteCursorQueryFinalized.dispose();
                                i = iLongValue;
                                j = jLongValue;
                            } else {
                                j = j2;
                                i = i2;
                            }
                            final ArrayList arrayList6 = arrayList4;
                            final ArrayList arrayList7 = arrayList5;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    callback5.run(arrayList, Integer.valueOf(i), Long.valueOf(j), arrayList7, arrayList6);
                                }
                            });
                        }
                    } catch (Exception e2) {
                        e = e2;
                        arrayList4 = arrayList2;
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        if (peerDialogId > 0) {
                            arrayList8.add(Long.valueOf(peerDialogId));
                        } else if (peerDialogId < 0) {
                            arrayList9.add(Long.valueOf(-peerDialogId));
                        }
                    }
                }
                if (arrayList9.isEmpty()) {
                    arrayList4 = arrayList2;
                } else {
                    try {
                        String strJoin = TextUtils.join(",", arrayList9);
                        arrayList4 = arrayList2;
                        try {
                            messagesStorage.getChatsInternal(strJoin, arrayList4);
                        } catch (Exception e3) {
                            e = e3;
                            exc = e;
                            arrayList5 = arrayList3;
                            i2 = iLongValue;
                            j2 = jLongValue;
                            FileLog.e(exc);
                            if (sQLiteCursorQueryFinalized != null) {
                                iLongValue = i2;
                                jLongValue = j2;
                            } else {
                                j = j2;
                                i = i2;
                            }
                            final ArrayList arrayList10 = arrayList4;
                            final ArrayList arrayList11 = arrayList5;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    callback5.run(arrayList, Integer.valueOf(i), Long.valueOf(j), arrayList11, arrayList10);
                                }
                            });
                        }
                    } catch (Exception e4) {
                        e = e4;
                        arrayList4 = arrayList2;
                    }
                }
                try {
                    if (arrayList8.isEmpty()) {
                        arrayList5 = arrayList3;
                    } else {
                        arrayList5 = arrayList3;
                        try {
                            messagesStorage.getUsersInternal((ArrayList<Long>) arrayList8, (ArrayList<TLRPC.User>) arrayList5);
                        } catch (Exception e5) {
                            e = e5;
                            exc = e;
                            i2 = iLongValue;
                            j2 = jLongValue;
                            FileLog.e(exc);
                            if (sQLiteCursorQueryFinalized != null) {
                                iLongValue = i2;
                                jLongValue = j2;
                            } else {
                                j = j2;
                                i = i2;
                            }
                            final ArrayList arrayList12 = arrayList4;
                            final ArrayList arrayList13 = arrayList5;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    callback5.run(arrayList, Integer.valueOf(i), Long.valueOf(j), arrayList13, arrayList12);
                                }
                            });
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    arrayList5 = arrayList3;
                    exc = e;
                    i2 = iLongValue;
                    j2 = jLongValue;
                    FileLog.e(exc);
                    if (sQLiteCursorQueryFinalized != null) {
                        iLongValue = i2;
                        jLongValue = j2;
                        sQLiteCursorQueryFinalized.dispose();
                        i = iLongValue;
                        j = jLongValue;
                    } else {
                        j = j2;
                        i = i2;
                    }
                    final ArrayList arrayList14 = arrayList4;
                    final ArrayList arrayList15 = arrayList5;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            callback5.run(arrayList, Integer.valueOf(i), Long.valueOf(j), arrayList15, arrayList14);
                        }
                    });
                }
            } catch (Exception e7) {
                arrayList4 = arrayList2;
                arrayList5 = arrayList3;
                exc = e7;
            }
            sQLiteCursorQueryFinalized.dispose();
            i = iLongValue;
            j = jLongValue;
            final ArrayList arrayList16 = arrayList4;
            final ArrayList arrayList17 = arrayList5;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback5.run(arrayList, Integer.valueOf(i), Long.valueOf(j), arrayList17, arrayList16);
                }
            });
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
                throw th;
            }
            throw th;
        }
    }

    private void saveStarGiftsCached(final ArrayList arrayList, final int i, final long j) {
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$BsMauLOcbyhrhsDCcNl4lgwEei0(messagesStorage, arrayList, i, j);
            }
        });
    }

    public static void $r8$lambda$BsMauLOcbyhrhsDCcNl4lgwEei0(MessagesStorage messagesStorage, ArrayList arrayList, int i, long j) {
        SQLiteDatabase database = messagesStorage.getDatabase();
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                database.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                if (arrayList != null) {
                    sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i2);
                        sQLitePreparedStatementExecuteFast.requery();
                        sQLitePreparedStatementExecuteFast.bindLong(1, starGift.id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                        starGift.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.bindLong(3, i);
                        sQLitePreparedStatementExecuteFast.bindLong(4, j);
                        sQLitePreparedStatementExecuteFast.bindInteger(5, i2);
                        sQLitePreparedStatementExecuteFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } finally {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
        }
    }

    private void getStarGiftsRemote(int i, final Utilities.Callback callback) {
        if (callback == null) {
            return;
        }
        TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
        getstargifts.hash = i;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargifts, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.m4200$r8$lambda$EOwRo6RAibLoJMYmUqnoGU6u10(tLObject, callback);
                    }
                });
            }
        });
    }

    public static void m4200$r8$lambda$EOwRo6RAibLoJMYmUqnoGU6u10(TLObject tLObject, Utilities.Callback callback) {
        if (tLObject instanceof TL_stars.StarGifts) {
            callback.run((TL_stars.StarGifts) tLObject);
        } else {
            callback.run(null);
        }
    }

    public TL_stars.StarGift getStarGift(long j) {
        loadStarGifts();
        for (int i = 0; i < this.gifts.size(); i++) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) this.gifts.get(i);
            if (starGift.id == j) {
                return starGift;
            }
        }
        return null;
    }

    public Runnable getStarGift(final long j, final Utilities.Callback callback) {
        final boolean[] zArr = {false};
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
        notificationCenterDelegateArr[0] = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                StarsController.$r8$lambda$9g2PRtNLFoFx8i07jM4c9fOJ04c(this.f$0, zArr, j, notificationCenterDelegateArr, callback, i, i2, objArr);
            }
        };
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
        int i = NotificationCenter.starGiftsLoaded;
        notificationCenter.addObserver(notificationCenterDelegate, i);
        TL_stars.StarGift starGift = getStarGift(j);
        if (starGift != null) {
            zArr[0] = true;
            NotificationCenter.getInstance(this.currentAccount).removeObserver(notificationCenterDelegateArr[0], i);
            callback.run(starGift);
        }
        return new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$v4TRXFP4gJcTOzhWTOPLUVS1nhk(this.f$0, zArr, notificationCenterDelegateArr);
            }
        };
    }

    public static void $r8$lambda$9g2PRtNLFoFx8i07jM4c9fOJ04c(StarsController starsController, boolean[] zArr, long j, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, Utilities.Callback callback, int i, int i2, Object[] objArr) {
        int i3;
        TL_stars.StarGift starGift;
        starsController.getClass();
        if (zArr[0] || i != (i3 = NotificationCenter.starGiftsLoaded) || (starGift = starsController.getStarGift(j)) == null) {
            return;
        }
        zArr[0] = true;
        NotificationCenter.getInstance(starsController.currentAccount).removeObserver(notificationCenterDelegateArr[0], i3);
        callback.run(starGift);
    }

    public static void $r8$lambda$v4TRXFP4gJcTOzhWTOPLUVS1nhk(StarsController starsController, boolean[] zArr, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        starsController.getClass();
        zArr[0] = true;
        NotificationCenter.getInstance(starsController.currentAccount).removeObserver(notificationCenterDelegateArr[0], NotificationCenter.starGiftsLoaded);
    }

    public void buyPremiumGift(final long j, final Object obj, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i;
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        boolean z = obj instanceof TLRPC.TL_premiumGiftOption;
        if ((z || (obj instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!balanceAvailable()) {
                getBalance(new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.$r8$lambda$uoBewVkLtm0TZ5i1ukNhA4c3qik(this.f$0, callback2, j, obj, tL_textWithEntities);
                    }
                });
                return;
            }
            if (z) {
                i = ((TLRPC.TL_premiumGiftOption) obj).months;
            } else if (!(obj instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i = ((TLRPC.TL_premiumGiftCodeOption) obj).months;
            }
            final String name = DialogObject.getName(this.currentAccount, j);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
            tL_inputInvoicePremiumGiftStars.months = i;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider);
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.$r8$lambda$ORTyUYwwiux6gPqSiF14ITk8l0U(this.f$0, callback2, tL_inputInvoicePremiumGiftStars, context2, resourceProvider, name, j, obj, tL_textWithEntities, tLObject, tL_error);
                }
            });
        }
    }

    public static void $r8$lambda$uoBewVkLtm0TZ5i1ukNhA4c3qik(StarsController starsController, Utilities.Callback2 callback2, long j, Object obj, TLRPC.TL_textWithEntities tL_textWithEntities) {
        if (!starsController.balanceAvailable()) {
            starsController.bulletinError("NO_BALANCE");
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, null);
                return;
            }
            return;
        }
        starsController.buyPremiumGift(j, obj, tL_textWithEntities, callback2);
    }

    public static void $r8$lambda$ORTyUYwwiux6gPqSiF14ITk8l0U(final StarsController starsController, final Utilities.Callback2 callback2, final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars, final Context context, final Theme.ResourcesProvider resourcesProvider, final String str, final long j, final Object obj, final TLRPC.TL_textWithEntities tL_textWithEntities, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$7FYlwkzBQ6cxAtQ8PJltXft8vzs(this.f$0, tLObject, tL_error, callback2, tL_inputInvoicePremiumGiftStars, context, resourcesProvider, str, j, obj, tL_textWithEntities);
            }
        });
    }

    public static void $r8$lambda$7FYlwkzBQ6cxAtQ8PJltXft8vzs(final StarsController starsController, TLObject tLObject, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars, final Context context, final Theme.ResourcesProvider resourcesProvider, final String str, final long j, final Object obj, final TLRPC.TL_textWithEntities tL_textWithEntities) {
        starsController.getClass();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStars)) {
            starsController.bulletinError(tL_error, "NO_PAYMENT_FORM");
            callback2.run(Boolean.FALSE, null);
            return;
        }
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        int i = 0;
        final long j2 = 0;
        while (i < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
            i++;
            j2 += tL_labeledPrice.amount;
        }
        ConnectionsManager.getInstance(starsController.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                StarsController.$r8$lambda$SgzQxyLplUyP3m1plPBcfwQZe6o(this.f$0, callback2, context, resourcesProvider, j2, str, j, obj, tL_textWithEntities, tLObject2, tL_error2);
            }
        });
    }

    public static void $r8$lambda$SgzQxyLplUyP3m1plPBcfwQZe6o(final StarsController starsController, final Utilities.Callback2 callback2, final Context context, final Theme.ResourcesProvider resourcesProvider, final long j, final String str, final long j2, final Object obj, final TLRPC.TL_textWithEntities tL_textWithEntities, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$h9YnBLbWJreqUu_hoKaVDjDWfOo(this.f$0, tLObject, tL_error, callback2, context, resourcesProvider, j, str, j2, obj, tL_textWithEntities);
            }
        });
    }

    public static void $r8$lambda$h9YnBLbWJreqUu_hoKaVDjDWfOo(final StarsController starsController, TLObject tLObject, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, final long j2, final Object obj, final TLRPC.TL_textWithEntities tL_textWithEntities) {
        starsController.getClass();
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactoryGlobal = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                if (!MessagesController.getInstance(starsController.currentAccount).starsPurchaseAvailable()) {
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE, null);
                    }
                    showNoSupportDialog(context, resourcesProvider);
                    return;
                } else {
                    final boolean[] zArr = {false};
                    StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 6, str, new Runnable() {
                        @Override
                        public final void run() {
                            StarsController.$r8$lambda$PTFsip6v49tfC3_Z0SWdmaRCQyc(this.f$0, zArr, j2, obj, tL_textWithEntities, callback2);
                        }
                    }, 0L);
                    starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            StarsController.$r8$lambda$siQ4nEhnubXG2m33E6fPnGuzL5s(callback2, zArr, dialogInterface);
                        }
                    });
                    starsNeededSheet.show();
                    return;
                }
            }
            if (tL_error == null || !"STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                if (callback2 != null) {
                    callback2.run(Boolean.FALSE, null);
                }
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error != null ? tL_error.text : "FAILED_SEND_STARS")).show();
                return;
            } else {
                if (callback2 != null) {
                    callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                    return;
                }
                return;
            }
        }
        final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                MessagesController.getInstance(this.f$0.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
            }
        });
        starsController.invalidateTransactions(true);
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, null);
        }
        if (BirthdayController.getInstance(starsController.currentAccount).contains(j2)) {
            MessagesController.getInstance(starsController.currentAccount).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j2, false).apply();
        }
        MessagesController.getInstance(starsController.currentAccount).getMainSettings().edit().putBoolean("show_gift_for_" + j2, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j2, true).apply();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity == null || launchActivity.getFireworksOverlay() == null) {
            return;
        }
        LaunchActivity.instance.getFireworksOverlay().start(true);
    }

    public static void $r8$lambda$PTFsip6v49tfC3_Z0SWdmaRCQyc(StarsController starsController, boolean[] zArr, long j, Object obj, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        starsController.getClass();
        zArr[0] = true;
        starsController.buyPremiumGift(j, obj, tL_textWithEntities, callback2);
    }

    public static void $r8$lambda$siQ4nEhnubXG2m33E6fPnGuzL5s(Utilities.Callback2 callback2, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback2 == null || zArr[0]) {
            return;
        }
        callback2.run(Boolean.FALSE, null);
    }

    public void buyStarGift(final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!balanceAvailable()) {
            getBalance(new Runnable() {
                @Override
                public final void run() {
                    StarsController.$r8$lambda$JzUJAo6YXgqIt22IsdThn_DQ6lU(this.f$0, callback2, starGift, z, z2, j, tL_textWithEntities);
                }
            });
            return;
        }
        final String name = DialogObject.getName(this.currentAccount, j);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z;
        tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z2;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.$r8$lambda$lpDexVxIhqG0MCvTdMrK8ad0mrY(this.f$0, callback2, tL_inputInvoiceStarGift, context2, resourceProvider, name, starGift, z, z2, j, tL_textWithEntities, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$JzUJAo6YXgqIt22IsdThn_DQ6lU(StarsController starsController, Utilities.Callback2 callback2, TL_stars.StarGift starGift, boolean z, boolean z2, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        if (!starsController.balanceAvailable()) {
            starsController.bulletinError("NO_BALANCE");
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, null);
                return;
            }
            return;
        }
        starsController.buyStarGift(starGift, z, z2, j, tL_textWithEntities, callback2);
    }

    public static void $r8$lambda$lpDexVxIhqG0MCvTdMrK8ad0mrY(final StarsController starsController, final Utilities.Callback2 callback2, final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift, final Context context, final Theme.ResourcesProvider resourcesProvider, final String str, final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$L1Im6MTpBfr9oKzasG9SqKi0FlI(this.f$0, tLObject, tL_error, callback2, tL_inputInvoiceStarGift, context, resourcesProvider, str, starGift, z, z2, j, tL_textWithEntities);
            }
        });
    }

    public static void $r8$lambda$L1Im6MTpBfr9oKzasG9SqKi0FlI(final StarsController starsController, TLObject tLObject, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift, final Context context, final Theme.ResourcesProvider resourcesProvider, final String str, final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities) {
        starsController.getClass();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStarGift)) {
            starsController.bulletinError(tL_error, "NO_PAYMENT_FORM");
            callback2.run(Boolean.FALSE, null);
            return;
        }
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
        int size = arrayList.size();
        final long j2 = 0;
        int i = 0;
        while (i < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
            i++;
            j2 += tL_labeledPrice.amount;
        }
        ConnectionsManager.getInstance(starsController.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                StarsController.m4199$r8$lambda$CNQ41l37SdswbgSGQ7busCmyUU(this.f$0, callback2, context, resourcesProvider, j2, str, starGift, z, z2, j, tL_textWithEntities, tLObject2, tL_error2);
            }
        });
    }

    public static void m4199$r8$lambda$CNQ41l37SdswbgSGQ7busCmyUU(final StarsController starsController, final Utilities.Callback2 callback2, final Context context, final Theme.ResourcesProvider resourcesProvider, final long j, final String str, final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j2, final TLRPC.TL_textWithEntities tL_textWithEntities, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$QPuFJ6ifrK_25Bjgcttx4BfPUjo(this.f$0, tLObject, tL_error, callback2, context, resourcesProvider, j, str, starGift, z, z2, j2, tL_textWithEntities);
            }
        });
    }

    public static void $r8$lambda$QPuFJ6ifrK_25Bjgcttx4BfPUjo(final StarsController starsController, TLObject tLObject, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, final long j, final String str, final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j2, final TLRPC.TL_textWithEntities tL_textWithEntities) {
        starsController.getClass();
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactoryGlobal = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
        SpannableStringBuilder spannableStringBuilderReplaceTags = null;
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                if (!MessagesController.getInstance(starsController.currentAccount).starsPurchaseAvailable()) {
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE, null);
                    }
                    showNoSupportDialog(context, resourcesProvider);
                    return;
                } else {
                    final boolean[] zArr = {false};
                    StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 6, str, new Runnable() {
                        @Override
                        public final void run() {
                            StarsController.m4208$r8$lambda$PQNsam9xP1WQU53sMyKAJHppp0(this.f$0, zArr, starGift, z, z2, j2, tL_textWithEntities, callback2);
                        }
                    }, 0L);
                    starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            StarsController.m4222$r8$lambda$nadFl9CkQFfHIYek7Zj3B51CGo(callback2, zArr, dialogInterface);
                        }
                    });
                    starsNeededSheet.show();
                    return;
                }
            }
            if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                if (callback2 != null) {
                    callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                    return;
                }
                return;
            } else if (tL_error == null || !"STARGIFT_USER_USAGE_LIMITED".equals(tL_error.text)) {
                if (callback2 != null) {
                    callback2.run(Boolean.FALSE, null);
                }
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error != null ? tL_error.text : "FAILED_SEND_STARS")).show();
                return;
            } else {
                if (callback2 != null) {
                    callback2.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                    return;
                }
                return;
            }
        }
        final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                MessagesController.getInstance(this.f$0.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
            }
        });
        starsController.invalidateStarGifts();
        starsController.invalidateProfileGifts(j2);
        starsController.invalidateTransactions(true);
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, null);
        }
        if (BirthdayController.getInstance(starsController.currentAccount).contains(j2)) {
            MessagesController.getInstance(starsController.currentAccount).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j2, false).apply();
        }
        if (starGift != null && starGift.limited_per_user) {
            int i = starGift.per_user_remains - 1;
            starGift.per_user_remains = i;
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SentRemainsLimit", Math.max(0, i)));
        }
        if (j2 < 0) {
            long j3 = -j2;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(starsController.currentAccount).getChatFull(j3);
            if (chatFull != null) {
                chatFull.stargifts_count++;
                chatFull.flags2 |= 262144;
                MessagesController.getInstance(starsController.currentAccount).putChatFull(chatFull);
            }
            if (lastFragment instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) lastFragment;
                if (profileActivity.getDialogId() == j2) {
                    SharedMediaLayout sharedMediaLayout = profileActivity.sharedMediaLayout;
                    if (sharedMediaLayout != null) {
                        sharedMediaLayout.updateTabs(true);
                        profileActivity.sharedMediaLayout.scrollToPage(14);
                        profileActivity.scrollToSharedMedia();
                    }
                    BulletinFactory bulletinFactoryOf = BulletinFactory.of(lastFragment);
                    TLRPC.Document document = starGift.sticker;
                    String string = LocaleController.getString(R.string.StarsGiftCompleted);
                    if (spannableStringBuilderReplaceTags == null) {
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j, str));
                    }
                    bulletinFactoryOf.createEmojiBulletin(document, string, spannableStringBuilderReplaceTags).show(false);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j3);
                    bundle.putBoolean("open_gifts", true);
                    final ProfileActivity profileActivity2 = new ProfileActivity(bundle);
                    final SpannableStringBuilder spannableStringBuilder = spannableStringBuilderReplaceTags;
                    profileActivity2.whenFullyVisible(new Runnable() {
                        @Override
                        public final void run() {
                            StarsController.$r8$lambda$fWK7pRtgbDU4eEQo4WaFH2Dh_Hc(profileActivity2, starGift, spannableStringBuilder, j, str);
                        }
                    });
                    lastFragment.presentFragment(profileActivity2);
                }
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", j3);
                bundle2.putBoolean("open_gifts", true);
                final ProfileActivity profileActivity3 = new ProfileActivity(bundle2);
                final CharSequence spannableStringBuilder2 = spannableStringBuilderReplaceTags;
                profileActivity3.whenFullyVisible(new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.$r8$lambda$fWK7pRtgbDU4eEQo4WaFH2Dh_Hc(profileActivity3, starGift, spannableStringBuilder2, j, str);
                    }
                });
                lastFragment.presentFragment(profileActivity3);
            }
        } else if ((lastFragment instanceof ChatActivity) && ((ChatActivity) lastFragment).getDialogId() == j2) {
            BulletinFactory bulletinFactoryOf2 = BulletinFactory.of(lastFragment);
            TLRPC.Document document2 = starGift.sticker;
            String string2 = LocaleController.getString(R.string.StarsGiftCompleted);
            if (spannableStringBuilderReplaceTags == null) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j, new Object[0]));
            }
            bulletinFactoryOf2.createEmojiBulletin(document2, string2, spannableStringBuilderReplaceTags).show(true);
        } else {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(starsController.currentAccount);
            int i2 = NotificationCenter.closeProfileActivity;
            Long lValueOf = Long.valueOf(j2);
            Boolean bool = Boolean.FALSE;
            notificationCenter.postNotificationName(i2, lValueOf, bool);
            NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.closeChatActivity, Long.valueOf(j2), bool);
            final ChatActivity chatActivityOf = ChatActivity.of(j2);
            final SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilderReplaceTags;
            chatActivityOf.whenFullyVisible(new Runnable() {
                @Override
                public final void run() {
                    StarsController.$r8$lambda$LJYDPBim4bmVx1r6VTziltdUj4w(chatActivityOf, starGift, spannableStringBuilder3, j);
                }
            });
            lastFragment.presentFragment(chatActivityOf);
        }
        MessagesController.getInstance(starsController.currentAccount).getMainSettings().edit().putBoolean("show_gift_for_" + j2, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j2, true).apply();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity == null || launchActivity.getFireworksOverlay() == null) {
            return;
        }
        LaunchActivity.instance.getFireworksOverlay().start(true);
    }

    public static void m4208$r8$lambda$PQNsam9xP1WQU53sMyKAJHppp0(StarsController starsController, boolean[] zArr, TL_stars.StarGift starGift, boolean z, boolean z2, long j, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        starsController.getClass();
        zArr[0] = true;
        starsController.buyStarGift(starGift, z, z2, j, tL_textWithEntities, callback2);
    }

    public static void m4222$r8$lambda$nadFl9CkQFfHIYek7Zj3B51CGo(Utilities.Callback2 callback2, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback2 == null || zArr[0]) {
            return;
        }
        callback2.run(Boolean.FALSE, null);
    }

    public static void $r8$lambda$fWK7pRtgbDU4eEQo4WaFH2Dh_Hc(final ProfileActivity profileActivity, TL_stars.StarGift starGift, CharSequence charSequence, long j, String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$z2Cz6VDLPoS8iBsgp4ssRzpFdH4(profileActivity);
            }
        }, 200L);
        BulletinFactory bulletinFactoryOf = BulletinFactory.of(profileActivity);
        TLRPC.Document document = starGift.sticker;
        String string = LocaleController.getString(R.string.StarsGiftCompleted);
        if (charSequence == null) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j, str));
        }
        bulletinFactoryOf.createEmojiBulletin(document, string, charSequence).show(false);
    }

    public static void $r8$lambda$z2Cz6VDLPoS8iBsgp4ssRzpFdH4(ProfileActivity profileActivity) {
        SharedMediaLayout sharedMediaLayout = profileActivity.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.scrollToPage(14);
            profileActivity.scrollToSharedMedia();
        }
    }

    public static void $r8$lambda$LJYDPBim4bmVx1r6VTziltdUj4w(ChatActivity chatActivity, TL_stars.StarGift starGift, CharSequence charSequence, long j) {
        BulletinFactory bulletinFactoryOf = BulletinFactory.of(chatActivity);
        TLRPC.Document document = starGift.sticker;
        String string = LocaleController.getString(R.string.StarsGiftCompleted);
        if (charSequence == null) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j, new Object[0]));
        }
        bulletinFactoryOf.createEmojiBulletin(document, string, charSequence).show(true);
    }

    public void getResellingGiftForm(TL_stars.StarGift starGift, long j, Utilities.Callback callback) {
        getResellingGiftForm(starGift, j, null, true, callback);
    }

    public void getResellingGiftForm(final TL_stars.StarGift starGift, final long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, final Utilities.Callback callback) {
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (starGift == null || context == null) {
            return;
        }
        if (!balanceAvailable()) {
            getBalance(new Runnable() {
                @Override
                public final void run() {
                    StarsController.$r8$lambda$FrIE6lBmfM1k7us_BodGqm1lTLQ(this.f$0, callback, starGift, j);
                }
            });
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_inputInvoiceStarGiftResale.ton = this.ton;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.m4196$r8$lambda$6jX9Dab3_DzikP78lhmkpRwv8(this.f$0, callback, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$FrIE6lBmfM1k7us_BodGqm1lTLQ(StarsController starsController, Utilities.Callback callback, TL_stars.StarGift starGift, long j) {
        if (!starsController.balanceAvailable()) {
            starsController.bulletinError("NO_BALANCE");
            if (callback != null) {
                callback.run(null);
                return;
            }
            return;
        }
        starsController.getResellingGiftForm(starGift, j, callback);
    }

    public static void m4196$r8$lambda$6jX9Dab3_DzikP78lhmkpRwv8(final StarsController starsController, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.m4202$r8$lambda$JOmo2jJGWZwvxnpyxfGlcSKZAs(this.f$0, tLObject, tL_error, callback);
            }
        });
    }

    public static void m4202$r8$lambda$JOmo2jJGWZwvxnpyxfGlcSKZAs(StarsController starsController, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback callback) {
        starsController.getClass();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStarGift)) {
            starsController.bulletinError(tL_error, "NO_PAYMENT_FORM");
            callback.run(null);
        } else {
            callback.run((TLRPC.TL_payments_paymentFormStarGift) tLObject);
        }
    }

    public static long getFormStarsPrice(TLRPC.PaymentForm paymentForm) {
        long j = 0;
        if (paymentForm != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                i++;
                j += tL_labeledPrice.amount;
            }
        }
        return j;
    }

    public void buyResellingGift(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j, Utilities.Callback2 callback2) {
        buyResellingGift(tL_payments_paymentFormStarGift, starGift, j, null, true, callback2);
    }

    public void buyResellingGift(final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, final Utilities.Callback2 callback2) {
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!balanceAvailable()) {
            getBalance(new Runnable() {
                @Override
                public final void run() {
                    StarsController.$r8$lambda$GGFoqgCTDi67QW1O8m9QU0_l6Ps(this.f$0, callback2, tL_payments_paymentFormStarGift, starGift, j);
                }
            });
            return;
        }
        final String name = DialogObject.getName(this.currentAccount, j);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_inputInvoiceStarGiftResale.ton = this.ton;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
        int size = arrayList.size();
        final long j2 = 0;
        int i = 0;
        while (i < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
            i++;
            j2 += tL_labeledPrice.amount;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.$r8$lambda$ITW2Iik_5IqionYfy7LcMZuGRcw(this.f$0, callback2, context2, resourceProvider, j2, name, tL_payments_paymentFormStarGift, starGift, j, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$GGFoqgCTDi67QW1O8m9QU0_l6Ps(StarsController starsController, Utilities.Callback2 callback2, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j) {
        if (!starsController.balanceAvailable()) {
            starsController.bulletinError("NO_BALANCE");
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, null);
                return;
            }
            return;
        }
        starsController.buyResellingGift(tL_payments_paymentFormStarGift, starGift, j, callback2);
    }

    public static void $r8$lambda$ITW2Iik_5IqionYfy7LcMZuGRcw(final StarsController starsController, final Utilities.Callback2 callback2, final Context context, final Theme.ResourcesProvider resourcesProvider, final long j, final String str, final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.m4217$r8$lambda$fXJcu2qs2wlpY9WM2rbVqxxwlQ(this.f$0, tLObject, tL_error, callback2, context, resourcesProvider, j, str, tL_payments_paymentFormStarGift, starGift, j2);
            }
        });
    }

    public static void m4217$r8$lambda$fXJcu2qs2wlpY9WM2rbVqxxwlQ(final StarsController starsController, TLObject tLObject, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j2) {
        starsController.getClass();
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactoryGlobal = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                if (!MessagesController.getInstance(starsController.currentAccount).starsPurchaseAvailable()) {
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE, null);
                    }
                    showNoSupportDialog(context, resourcesProvider);
                    return;
                } else {
                    final boolean[] zArr = {false};
                    StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 6, str, new Runnable() {
                        @Override
                        public final void run() {
                            StarsController.$r8$lambda$TgT3MynLYPKE6ZVb0tkBZKyVo_E(this.f$0, zArr, tL_payments_paymentFormStarGift, starGift, j2, callback2);
                        }
                    }, 0L);
                    starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            StarsController.$r8$lambda$NmzP04uKlI6aUI9IW1aocwMcmCo(callback2, zArr, dialogInterface);
                        }
                    });
                    starsNeededSheet.show();
                    return;
                }
            }
            if (tL_error == null || !"STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                if (callback2 != null) {
                    callback2.run(Boolean.FALSE, null);
                }
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error != null ? tL_error.text : "FAILED_SEND_STARS")).show();
                return;
            } else {
                if (callback2 != null) {
                    callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                    return;
                }
                return;
            }
        }
        final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                MessagesController.getInstance(this.f$0.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
            }
        });
        starsController.invalidateStarGifts();
        starsController.invalidateProfileGifts(j2);
        starsController.invalidateTransactions(true);
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, null);
        }
        if (BirthdayController.getInstance(starsController.currentAccount).contains(j2)) {
            MessagesController.getInstance(starsController.currentAccount).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j2, false).apply();
        }
        MessagesController.getInstance(starsController.currentAccount).getMainSettings().edit().putBoolean("show_gift_for_" + j2, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j2, true).apply();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity == null || launchActivity.getFireworksOverlay() == null) {
            return;
        }
        LaunchActivity.instance.getFireworksOverlay().start(true);
    }

    public static void $r8$lambda$TgT3MynLYPKE6ZVb0tkBZKyVo_E(StarsController starsController, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j, Utilities.Callback2 callback2) {
        starsController.getClass();
        zArr[0] = true;
        starsController.buyResellingGift(tL_payments_paymentFormStarGift, starGift, j, callback2);
    }

    public static void $r8$lambda$NmzP04uKlI6aUI9IW1aocwMcmCo(Utilities.Callback2 callback2, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback2 == null || zArr[0]) {
            return;
        }
        callback2.run(Boolean.FALSE, null);
    }

    public GiftsList getProfileGiftsList(long j) {
        return getProfileGiftsList(j, true);
    }

    public GiftsList getProfileGiftsList(long j, boolean z) {
        GiftsList giftsList = (GiftsList) this.giftLists.get(j);
        if (giftsList != null || !z) {
            return giftsList;
        }
        LongSparseArray longSparseArray = this.giftLists;
        GiftsList giftsList2 = new GiftsList(this.currentAccount, j);
        longSparseArray.put(j, giftsList2);
        return giftsList2;
    }

    public GiftsCollections getProfileGiftCollectionsList(long j, boolean z) {
        GiftsCollections giftsCollections = (GiftsCollections) this.giftCollections.get(j);
        if (giftsCollections != null || !z) {
            return giftsCollections;
        }
        LongSparseArray longSparseArray = this.giftCollections;
        GiftsCollections giftsCollections2 = new GiftsCollections(this.currentAccount, j);
        longSparseArray.put(j, giftsCollections2);
        return giftsCollections2;
    }

    public void invalidateProfileGifts(long j) {
        GiftsList profileGiftsList = getProfileGiftsList(j, false);
        if (profileGiftsList != null) {
            profileGiftsList.invalidate(false);
        }
        GiftsCollections giftsCollections = (GiftsCollections) this.giftCollections.get(j);
        if (giftsCollections != null) {
            giftsCollections.invalidate(false);
        }
    }

    public void invalidateProfileGifts(TLRPC.UserFull userFull) {
        if (userFull == null) {
            return;
        }
        long j = userFull.id;
        GiftsList profileGiftsList = getProfileGiftsList(j, false);
        if (profileGiftsList != null && profileGiftsList.totalCount != userFull.stargifts_count) {
            profileGiftsList.invalidate(false);
        }
        GiftsCollections giftsCollections = (GiftsCollections) this.giftCollections.get(j);
        if (giftsCollections != null) {
            giftsCollections.invalidate(false);
        }
    }

    public static class GiftsCollections {
        public GiftsList all;
        private ArrayList collections;
        public boolean creating;
        public final int currentAccount;
        public int currentRequestId;
        public final long dialogId;
        private ArrayList filteredCollections;
        public HashMap gifts;
        public boolean loaded;
        public boolean loading;
        public boolean shown;

        public GiftsCollections(int i, long j) {
            this(i, j, true);
        }

        public GiftsCollections(int i, long j, boolean z) {
            this.collections = new ArrayList();
            this.filteredCollections = new ArrayList();
            this.gifts = new HashMap();
            this.currentRequestId = -1;
            this.currentAccount = i;
            this.dialogId = j;
            if (z) {
                load();
            }
        }

        public boolean isMine() {
            long j = this.dialogId;
            if (j >= 0) {
                return j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId();
            }
            return ChatObject.canUserDoAction(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)), 5);
        }

        public ArrayList getCollections() {
            return isMine() ? this.collections : this.filteredCollections;
        }

        private void refilterCollections() {
            this.filteredCollections.clear();
            for (int i = 0; i < this.collections.size(); i++) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.collections.get(i);
                if (tL_starGiftCollection.gifts_count > 0) {
                    this.filteredCollections.add(tL_starGiftCollection);
                }
            }
        }

        public void updateGiftsCollections(TL_stars.SavedStarGift savedStarGift, int i, boolean z) {
            Iterator it = this.gifts.values().iterator();
            while (it.hasNext()) {
                ((GiftsList) it.next()).updateGiftsCollections(savedStarGift, i, z);
            }
            GiftsList giftsList = this.all;
            if (giftsList != null) {
                giftsList.updateGiftsCollections(savedStarGift, i, z);
            }
        }

        public void updateGiftsUnsaved(TL_stars.SavedStarGift savedStarGift, boolean z) {
            Iterator it = this.gifts.values().iterator();
            while (it.hasNext()) {
                ((GiftsList) it.next()).updateGiftsUnsaved(savedStarGift, z);
            }
            GiftsList giftsList = this.all;
            if (giftsList != null) {
                giftsList.updateGiftsUnsaved(savedStarGift, z);
            }
        }

        private long getHash(ArrayList arrayList) {
            int size = arrayList.size();
            long jCalcHash = 0;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jCalcHash = MediaDataController.calcHash(jCalcHash, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            return jCalcHash;
        }

        public GiftsList getListByIndex(int i) {
            if (i < 0 || i >= getCollections().size()) {
                return null;
            }
            return getListById(((TL_stars.TL_starGiftCollection) getCollections().get(i)).collection_id);
        }

        public GiftsList getListById(int i) {
            return (GiftsList) this.gifts.get(Integer.valueOf(i));
        }

        public void load() {
            if (this.loading || this.loaded) {
                return;
            }
            this.loading = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            getstargiftcollections.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            getstargiftcollections.hash = getHash(this.collections);
            this.currentRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftcollections, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.GiftsCollections.$r8$lambda$aXrbr1JBcQidsThBar62rNr0UU4(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$aXrbr1JBcQidsThBar62rNr0UU4(final GiftsCollections giftsCollections, final TLObject tLObject, TLRPC.TL_error tL_error) {
            giftsCollections.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.GiftsCollections.m4233$r8$lambda$Dnzr_JXYKqlwh8B_GBWlD1wbyE(this.f$0, tLObject);
                }
            });
        }

        public static void m4233$r8$lambda$Dnzr_JXYKqlwh8B_GBWlD1wbyE(GiftsCollections giftsCollections, TLObject tLObject) {
            giftsCollections.getClass();
            if (tLObject instanceof TL_stars.TL_starGiftCollections) {
                giftsCollections.collections.clear();
                giftsCollections.collections.addAll(((TL_stars.TL_starGiftCollections) tLObject).collections);
                giftsCollections.refilterCollections();
                ArrayList arrayList = giftsCollections.collections;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                    if (giftsCollections.getListById(tL_starGiftCollection.collection_id) == null) {
                        GiftsList giftsList = new GiftsList(giftsCollections.currentAccount, giftsCollections.dialogId, false);
                        giftsList.setCollectionId(tL_starGiftCollection.collection_id);
                        giftsCollections.gifts.put(Integer.valueOf(tL_starGiftCollection.collection_id), giftsList);
                    }
                }
                giftsCollections.loaded = true;
                giftsCollections.loading = false;
                NotificationCenter.getInstance(giftsCollections.currentAccount).postNotificationName(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(giftsCollections.dialogId), giftsCollections);
                return;
            }
            if (tLObject instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                giftsCollections.refilterCollections();
                giftsCollections.loaded = true;
                giftsCollections.loading = false;
                NotificationCenter.getInstance(giftsCollections.currentAccount).postNotificationName(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(giftsCollections.dialogId), giftsCollections);
            }
        }

        public void invalidate(boolean z) {
            if (this.currentRequestId != -1) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestId, true);
                this.currentRequestId = -1;
            }
            this.loading = false;
            this.loaded = false;
            if (z || this.shown) {
                load();
            }
        }

        public void createCollection(String str, final Utilities.Callback callback) {
            if (this.creating) {
                return;
            }
            this.creating = true;
            final TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
            tL_starGiftCollection.collection_id = -1;
            tL_starGiftCollection.title = str;
            this.collections.add(tL_starGiftCollection);
            refilterCollections();
            final GiftsList giftsList = new GiftsList(this.currentAccount, this.dialogId, false);
            giftsList.setCollectionId(-1);
            giftsList.totalCount = 0;
            giftsList.endReached = true;
            this.gifts.put(-1, giftsList);
            TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
            createstargiftcollection.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            createstargiftcollection.title = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createstargiftcollection, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.GiftsCollections.m4234$r8$lambda$SCsYlD92hx096soRSGr9X0nBw(this.f$0, tL_starGiftCollection, giftsList, callback, tLObject, tL_error);
                }
            });
        }

        public static void m4234$r8$lambda$SCsYlD92hx096soRSGr9X0nBw(final GiftsCollections giftsCollections, final TL_stars.TL_starGiftCollection tL_starGiftCollection, final GiftsList giftsList, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            giftsCollections.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.GiftsCollections.$r8$lambda$kd36xzXEc7kF_1tdd9bSploiBx4(this.f$0, tLObject, tL_starGiftCollection, giftsList, callback, tL_error);
                }
            });
        }

        public static void $r8$lambda$kd36xzXEc7kF_1tdd9bSploiBx4(GiftsCollections giftsCollections, TLObject tLObject, TL_stars.TL_starGiftCollection tL_starGiftCollection, GiftsList giftsList, Utilities.Callback callback, TLRPC.TL_error tL_error) {
            BaseFragment safeLastFragment;
            giftsCollections.creating = false;
            if (tLObject instanceof TL_stars.TL_starGiftCollection) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject;
                giftsCollections.collections.remove(tL_starGiftCollection);
                giftsCollections.collections.add(tL_starGiftCollection2);
                giftsCollections.gifts.remove(-1);
                int i = tL_starGiftCollection2.collection_id;
                giftsList.collectionId = i;
                giftsCollections.gifts.put(Integer.valueOf(i), giftsList);
                giftsCollections.refilterCollections();
                NotificationCenter.getInstance(giftsCollections.currentAccount).postNotificationName(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(giftsCollections.dialogId), giftsCollections);
                if (callback != null) {
                    callback.run(tL_starGiftCollection2);
                    return;
                }
                return;
            }
            if (tL_error != null && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null) {
                BulletinFactory.of(safeLastFragment).showForError(tL_error);
            }
            giftsCollections.collections.remove(tL_starGiftCollection);
            giftsCollections.gifts.remove(-1);
            giftsCollections.refilterCollections();
            NotificationCenter.getInstance(giftsCollections.currentAccount).postNotificationName(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(giftsCollections.dialogId), giftsCollections);
        }

        public TL_stars.TL_starGiftCollection findById(int i) {
            for (int i2 = 0; i2 < this.collections.size(); i2++) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.collections.get(i2);
                if (i == tL_starGiftCollection.collection_id) {
                    return tL_starGiftCollection;
                }
            }
            return null;
        }

        public int indexOf(int i) {
            for (int i2 = 0; i2 < this.collections.size(); i2++) {
                if (i == ((TL_stars.TL_starGiftCollection) this.collections.get(i2)).collection_id) {
                    return i2;
                }
            }
            return -1;
        }

        public void removeCollection(int i) {
            int iIndexOf = indexOf(i);
            if (iIndexOf == -1) {
                return;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.collections.remove(iIndexOf);
            this.gifts.remove(Integer.valueOf(tL_starGiftCollection.collection_id));
            TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
            deletestargiftcollection.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            deletestargiftcollection.collection_id = tL_starGiftCollection.collection_id;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletestargiftcollection, null);
        }

        public void updateIcon(int i) {
            GiftsList listById = getListById(i);
            TL_stars.TL_starGiftCollection tL_starGiftCollectionFindById = findById(i);
            if (listById == null || tL_starGiftCollectionFindById == null) {
                return;
            }
            TL_stars.SavedStarGift savedStarGift = listById.gifts.isEmpty() ? null : (TL_stars.SavedStarGift) listById.gifts.get(0);
            if (savedStarGift == null) {
                tL_starGiftCollectionFindById.flags &= -2;
                tL_starGiftCollectionFindById.icon = null;
            } else {
                tL_starGiftCollectionFindById.flags |= 1;
                tL_starGiftCollectionFindById.icon = savedStarGift.gift.getDocument();
            }
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.dialogId), this);
        }

        public void rename(int i, String str) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            updatestargiftcollection.collection_id = i;
            updatestargiftcollection.flags |= 1;
            updatestargiftcollection.title = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftcollection, null);
        }

        public void addGift(int i, TL_stars.SavedStarGift savedStarGift, boolean z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(savedStarGift);
            addGifts(i, arrayList, z);
        }

        public void addGifts(int i, ArrayList arrayList, boolean z) {
            int i2 = 0;
            if (arrayList.isEmpty()) {
                return;
            }
            GiftsList listById = getListById(i);
            if (listById != null && z) {
                listById.gifts.addAll(0, arrayList);
                listById.totalCount += arrayList.size();
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), listById);
                updateIcon(i);
            }
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            updatestargiftcollection.collection_id = i;
            updatestargiftcollection.flags |= 4;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                updateGiftsCollections(savedStarGift, i, true);
                if (savedStarGift.msg_id > 0) {
                    TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                    tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                    updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
                } else if (savedStarGift.saved_id != 0) {
                    TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                    tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
                } else {
                    FileLog.w("can't convert gift to inputgift to add into the collection");
                }
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftcollection, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.GiftsCollections.m4237$r8$lambda$um1AjQkJ_a0ixht96VU4tDpU28(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void m4237$r8$lambda$um1AjQkJ_a0ixht96VU4tDpU28(final GiftsCollections giftsCollections, final TLObject tLObject, TLRPC.TL_error tL_error) {
            giftsCollections.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.GiftsCollections.m4235$r8$lambda$pvMIToOxiuZkBXBsVlwzFF6B5k(this.f$0, tLObject);
                }
            });
        }

        public static void m4235$r8$lambda$pvMIToOxiuZkBXBsVlwzFF6B5k(GiftsCollections giftsCollections, TLObject tLObject) {
            giftsCollections.getClass();
            if (tLObject instanceof TL_stars.TL_starGiftCollection) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) tLObject;
                int iIndexOf = giftsCollections.indexOf(tL_starGiftCollection.collection_id);
                if (iIndexOf >= 0) {
                    giftsCollections.collections.set(iIndexOf, tL_starGiftCollection);
                }
            }
        }

        public void removeGift(int i, TL_stars.SavedStarGift savedStarGift) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(savedStarGift);
            removeGifts(i, arrayList);
        }

        public void removeGifts(int i, ArrayList arrayList) {
            if (arrayList.isEmpty()) {
                return;
            }
            GiftsList listById = getListById(i);
            if (listById != null && !listById.gifts.isEmpty()) {
                int i2 = 0;
                while (i2 < listById.gifts.size()) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) listById.gifts.get(i2);
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (StarsController.eq(savedStarGift, (TL_stars.SavedStarGift) arrayList.get(i3))) {
                            listById.gifts.remove(i2);
                            listById.totalCount = Math.max(0, listById.totalCount - 1);
                            i2--;
                            break;
                        }
                    }
                    i2++;
                }
            }
            updateIcon(i);
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            updatestargiftcollection.collection_id = i;
            updatestargiftcollection.flags |= 2;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
                updateGiftsCollections(savedStarGift2, i, false);
                if (savedStarGift2.msg_id > 0) {
                    TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                    tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
                    updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                } else if (savedStarGift2.saved_id != 0) {
                    TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                    tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift2.saved_id;
                    updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
                } else {
                    FileLog.w("can't convert gift to inputgift to add into the collection");
                }
            }
            updatestargiftcollection.delete_stargift.size();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftcollection, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.GiftsCollections.$r8$lambda$jKD92iaTyY7atUl36R5VfP0J7UI(this.f$0, tLObject, tL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), listById);
        }

        public static void $r8$lambda$jKD92iaTyY7atUl36R5VfP0J7UI(final GiftsCollections giftsCollections, final TLObject tLObject, TLRPC.TL_error tL_error) {
            giftsCollections.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.GiftsCollections.m4236$r8$lambda$tcJZgsb9xFBZmPvhenrngFaCy0(this.f$0, tLObject);
                }
            });
        }

        public static void m4236$r8$lambda$tcJZgsb9xFBZmPvhenrngFaCy0(GiftsCollections giftsCollections, TLObject tLObject) {
            giftsCollections.getClass();
            if (tLObject instanceof TL_stars.TL_starGiftCollection) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) tLObject;
                int iIndexOf = giftsCollections.indexOf(tL_starGiftCollection.collection_id);
                if (iIndexOf >= 0) {
                    giftsCollections.collections.set(iIndexOf, tL_starGiftCollection);
                }
            }
        }

        public void reorder(ArrayList arrayList) {
            HashMap map = new HashMap();
            ArrayList arrayList2 = this.collections;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                map.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                Integer num = (Integer) obj2;
                num.getClass();
                TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) map.get(num);
                if (tL_starGiftCollection2 != null) {
                    arrayList3.add(tL_starGiftCollection2);
                }
            }
            this.collections.clear();
            this.collections.addAll(arrayList3);
            refilterCollections();
        }

        public void sendOrder() {
            TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
            reorderstargiftcollections.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            ArrayList arrayList = this.collections;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(reorderstargiftcollections, null);
            refilterCollections();
        }
    }

    public static class GiftsList implements IGiftsList {
        public Boolean chat_notifications_enabled;
        public int collectionId;
        private long craftingGiftId;
        public final int currentAccount;
        public int currentRequestId;
        public final long dialogId;
        public boolean endReached;
        public ArrayList gifts;
        private int includeFlags;
        public boolean isCollection;
        public String lastOffset;
        public boolean loading;
        public boolean peer_color_available;
        private ArrayList savedPinnedState;
        public boolean shown;
        public boolean sort_by_date;
        public int totalCount;

        public static void $r8$lambda$o_kNtECv5tdzurkuOWUGKNeeFVE(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        private int getMask(int i) {
            if ((i & 15) != 0) {
                return 15;
            }
            return (i & 768) != 0 ? 768 : 0;
        }

        public GiftsList(int i, long j) {
            this(i, j, true);
        }

        public GiftsList(int i, long j, boolean z) {
            this.isCollection = false;
            this.sort_by_date = true;
            this.peer_color_available = false;
            this.includeFlags = 783;
            this.gifts = new ArrayList();
            this.currentRequestId = -1;
            this.craftingGiftId = 0L;
            this.currentAccount = i;
            this.dialogId = j;
            if (z) {
                load();
            }
        }

        public void setCollectionId(int i) {
            this.isCollection = true;
            this.collectionId = i;
        }

        @Override
        public void notifyUpdate() {
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
        }

        public void updateGiftsCollections(TL_stars.SavedStarGift savedStarGift, int i, boolean z) {
            ArrayList arrayList = this.gifts;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
                if (StarsController.eq(savedStarGift2, savedStarGift)) {
                    if (z) {
                        if (!savedStarGift2.collection_id.contains(Integer.valueOf(i))) {
                            savedStarGift2.collection_id.add(Integer.valueOf(i));
                        }
                    } else {
                        savedStarGift2.collection_id.remove(Integer.valueOf(i));
                    }
                }
            }
        }

        public void updateGiftsUnsaved(TL_stars.SavedStarGift savedStarGift, boolean z) {
            ArrayList arrayList = this.gifts;
            int size = arrayList.size();
            int i = 0;
            boolean z2 = false;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
                if (StarsController.eq(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z) {
                    savedStarGift2.unsaved = z;
                    z2 = true;
                }
            }
            if (z2) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
            }
        }

        @Override
        public int findGiftToUpgrade(int i) {
            if (!StarGiftSheet.isMineWithActions(this.currentAccount, this.dialogId)) {
                return -1;
            }
            for (int i2 = i + 1; i2 < this.gifts.size(); i2++) {
                if (((TL_stars.SavedStarGift) this.gifts.get(i2)).can_upgrade) {
                    return i2;
                }
            }
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (((TL_stars.SavedStarGift) this.gifts.get(i3)).can_upgrade) {
                    return i3;
                }
            }
            return -1;
        }

        public void forceTypeIncludeFlag(int i, boolean z) {
            int mask = getMask(i);
            int i2 = this.includeFlags;
            int i3 = i | ((~mask) & i2);
            if (i2 != i3) {
                this.includeFlags = i3;
                if (z) {
                    invalidate(true);
                }
            }
        }

        public void toggleTypeIncludeFlag(int i) {
            int mask = getMask(i);
            int i2 = this.includeFlags & mask;
            int flag = TLObject.setFlag(i2, i, !TLObject.hasFlag(i2, i));
            if (flag == 0) {
                flag = mask & (~i);
            }
            int i3 = this.includeFlags;
            int i4 = ((~mask) & i3) | flag;
            if (i3 != i4) {
                this.includeFlags = i4;
                invalidate(true);
            }
        }

        public void resetFilters() {
            if (hasFilters()) {
                this.includeFlags = 783;
                this.sort_by_date = true;
                invalidate(true);
            }
        }

        public void setFilters(int i) {
            this.includeFlags = i;
            this.sort_by_date = true;
            invalidate(true);
        }

        public boolean hasFilters() {
            return (this.sort_by_date && this.includeFlags == 783) ? false : true;
        }

        public boolean isInclude_unlimited() {
            return TLObject.hasFlag(this.includeFlags, 1);
        }

        public boolean isInclude_limited() {
            return TLObject.hasFlag(this.includeFlags, 2);
        }

        public boolean isInclude_upgradable() {
            return TLObject.hasFlag(this.includeFlags, 4);
        }

        public boolean isInclude_unique() {
            return TLObject.hasFlag(this.includeFlags, 8);
        }

        public boolean isInclude_displayed() {
            return TLObject.hasFlag(this.includeFlags, 256);
        }

        public boolean isInclude_hidden() {
            return TLObject.hasFlag(this.includeFlags, 512);
        }

        @Override
        public int getTotalCount() {
            return this.totalCount;
        }

        @Override
        public int getLoadedCount() {
            return this.gifts.size();
        }

        @Override
        public Object get(int i) {
            if (i < 0 || i >= this.gifts.size()) {
                return null;
            }
            return this.gifts.get(i);
        }

        @Override
        public int indexOf(Object obj) {
            return this.gifts.indexOf(obj);
        }

        public void invalidate(boolean z) {
            if (this.currentRequestId != -1) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestId, true);
                this.currentRequestId = -1;
            }
            this.loading = false;
            this.gifts.clear();
            this.lastOffset = null;
            this.endReached = false;
            if (z || this.shown) {
                load();
            }
        }

        public void forCrafting(long j) {
            this.craftingGiftId = j;
        }

        @Override
        public void load() {
            TLObject tLObject;
            if (this.loading || this.endReached) {
                return;
            }
            final boolean z = this.lastOffset == null;
            this.loading = true;
            if (this.craftingGiftId != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.craftingGiftId;
                getcraftstargifts.offset = z ? "" : this.lastOffset;
                getcraftstargifts.limit = z ? 15 : 30;
                tLObject = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts = new TL_stars.getSavedStarGifts();
                getsavedstargifts.sort_by_value = !this.sort_by_date;
                getsavedstargifts.exclude_unupgradable = !isInclude_limited();
                getsavedstargifts.exclude_upgradable = !isInclude_upgradable();
                getsavedstargifts.exclude_unlimited = !isInclude_unlimited();
                getsavedstargifts.exclude_unique = !isInclude_unique();
                getsavedstargifts.exclude_saved = !isInclude_displayed();
                getsavedstargifts.exclude_unsaved = !isInclude_hidden();
                getsavedstargifts.peer_color_available = this.peer_color_available;
                if (this.dialogId == 0) {
                    getsavedstargifts.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                }
                getsavedstargifts.offset = z ? "" : this.lastOffset;
                getsavedstargifts.limit = z ? Math.max(MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit, 15) : 30;
                tLObject = getsavedstargifts;
                if (this.isCollection) {
                    getsavedstargifts.flags |= 64;
                    getsavedstargifts.collection_id = this.collectionId;
                    tLObject = getsavedstargifts;
                }
            }
            int iSendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    StarsController.GiftsList.$r8$lambda$R44KHcXsMh8b5yAcsAjehxmwKqs(this.f$0, iArr, z, tLObject2, tL_error);
                }
            });
            this.currentRequestId = iSendRequest;
            final int[] iArr = {iSendRequest};
        }

        public static void $r8$lambda$R44KHcXsMh8b5yAcsAjehxmwKqs(final GiftsList giftsList, final int[] iArr, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
            giftsList.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.GiftsList.$r8$lambda$9qiI7tKVicfQoc42OBZn5RKwC7c(this.f$0, iArr, tLObject, z);
                }
            });
        }

        public static void $r8$lambda$9qiI7tKVicfQoc42OBZn5RKwC7c(GiftsList giftsList, int[] iArr, TLObject tLObject, boolean z) {
            giftsList.getClass();
            if (iArr[0] != giftsList.currentRequestId) {
                return;
            }
            giftsList.loading = false;
            giftsList.currentRequestId = -1;
            if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                MessagesController.getInstance(giftsList.currentAccount).putUsers(tL_payments_savedStarGifts.users, false);
                MessagesController.getInstance(giftsList.currentAccount).putChats(tL_payments_savedStarGifts.chats, false);
                if (z) {
                    giftsList.gifts.clear();
                }
                giftsList.gifts.addAll(tL_payments_savedStarGifts.gifts);
                giftsList.lastOffset = tL_payments_savedStarGifts.next_offset;
                giftsList.totalCount = tL_payments_savedStarGifts.count;
                giftsList.chat_notifications_enabled = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                giftsList.endReached = giftsList.gifts.size() > giftsList.totalCount || giftsList.lastOffset == null;
            } else {
                giftsList.endReached = true;
            }
            NotificationCenter.getInstance(giftsList.currentAccount).postNotificationName(NotificationCenter.starUserGiftsLoaded, Long.valueOf(giftsList.dialogId), giftsList);
        }

        public void cancel() {
            if (this.currentRequestId != -1) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestId, true);
                this.currentRequestId = -1;
            }
            this.loading = false;
        }

        public void processCrafting(ArrayList arrayList, TL_stars.StarGift starGift) {
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                boolean z = false;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                    for (int i2 = 0; i2 < this.gifts.size(); i2++) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) this.gifts.get(i2)).gift;
                        if (starGift3 != null && starGift3.id == starGift2.id) {
                            this.gifts.remove(i2);
                            this.totalCount = Math.max(0, this.totalCount - 1);
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
                }
            }
            if (starGift != null) {
                TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = starGift.slug;
                getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(getsavedstargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StarsController.GiftsList.$r8$lambda$F3q15Ifbe9YMY263ylRnEnIoFhY(this.f$0, tLObject, tL_error);
                    }
                });
            }
        }

        public static void $r8$lambda$F3q15Ifbe9YMY263ylRnEnIoFhY(final GiftsList giftsList, final TLObject tLObject, TLRPC.TL_error tL_error) {
            giftsList.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.GiftsList.$r8$lambda$WQGmiNfeSLcmsvyVb6XruwNq8TQ(this.f$0, tLObject);
                }
            });
        }

        public static void $r8$lambda$WQGmiNfeSLcmsvyVb6XruwNq8TQ(GiftsList giftsList, TLObject tLObject) {
            giftsList.getClass();
            if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                MessagesController.getInstance(giftsList.currentAccount).putUsers(tL_payments_savedStarGifts.users, false);
                MessagesController.getInstance(giftsList.currentAccount).putChats(tL_payments_savedStarGifts.chats, false);
                if (tL_payments_savedStarGifts.gifts.size() > 0) {
                    TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                    int i = 0;
                    while (i < giftsList.gifts.size() && ((TL_stars.SavedStarGift) giftsList.gifts.get(i)).pinned_to_top) {
                        i++;
                    }
                    giftsList.gifts.add(i, savedStarGift);
                    NotificationCenter.getInstance(giftsList.currentAccount).postNotificationName(NotificationCenter.starUserGiftsLoaded, Long.valueOf(giftsList.dialogId), giftsList);
                }
            }
        }

        public ArrayList getPinned() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.gifts.size(); i++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.gifts.get(i);
                if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                    arrayList.add(savedStarGift);
                }
            }
            return arrayList;
        }

        public boolean eq(ArrayList arrayList, ArrayList arrayList2) {
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != arrayList2.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public TL_stars.InputSavedStarGift getInput(TL_stars.SavedStarGift savedStarGift) {
            if (savedStarGift == null) {
                return null;
            }
            if ((savedStarGift.flags & 8) != 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                return tL_inputSavedStarGiftUser;
            }
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
            return tL_inputSavedStarGiftChat;
        }

        public void setPinned(ArrayList arrayList) {
            this.gifts.removeAll(arrayList);
            if (this.sort_by_date && !this.isCollection) {
                Collections.sort(this.gifts, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return StarsController.GiftsList.$r8$lambda$0NrJlscDpM24Kyu4MXSRqJVLA4I((TL_stars.SavedStarGift) obj, (TL_stars.SavedStarGift) obj2);
                    }
                });
            }
            this.gifts.addAll(0, arrayList);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
            sendPinnedOrder();
        }

        public static int $r8$lambda$0NrJlscDpM24Kyu4MXSRqJVLA4I(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
            return savedStarGift2.date - savedStarGift.date;
        }

        public boolean togglePinned(TL_stars.SavedStarGift savedStarGift, boolean z, boolean z2) {
            boolean z3;
            if (savedStarGift == null) {
                return false;
            }
            ArrayList pinned = getPinned();
            if (pinned.contains(savedStarGift)) {
                if (z) {
                    return false;
                }
                pinned.remove(savedStarGift);
                z3 = false;
            } else {
                if (!z) {
                    return false;
                }
                if (pinned.size() + 1 <= MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit) {
                    z3 = false;
                } else {
                    if (!z2) {
                        return true;
                    }
                    while (pinned.size() > 0 && pinned.size() + 1 > MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit) {
                        ((TL_stars.SavedStarGift) pinned.remove(pinned.size() - 1)).pinned_to_top = false;
                    }
                    z3 = true;
                }
                pinned.add(savedStarGift);
            }
            savedStarGift.pinned_to_top = z;
            this.gifts.removeAll(pinned);
            if (this.sort_by_date && !this.isCollection) {
                Collections.sort(this.gifts, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return StarsController.GiftsList.$r8$lambda$wnJT01tEmt5i9wNF1FR_FImlPC4((TL_stars.SavedStarGift) obj, (TL_stars.SavedStarGift) obj2);
                    }
                });
            }
            this.gifts.addAll(0, pinned);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
            sendPinnedOrder();
            return z3;
        }

        public static int $r8$lambda$wnJT01tEmt5i9wNF1FR_FImlPC4(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
            return savedStarGift2.date - savedStarGift.date;
        }

        public void reorderPinned(int i, int i2) {
            if (this.savedPinnedState == null) {
                this.savedPinnedState = getPinned();
            }
            reorder(i, i2);
        }

        public void reorder(int i, int i2) {
            int iClamp = Utilities.clamp(i, this.gifts.size() - 1, 0);
            if (iClamp < 0 || iClamp >= this.gifts.size()) {
                return;
            }
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.gifts.remove(iClamp);
            int iClamp2 = Utilities.clamp(i2, this.gifts.size() - 1, 0);
            if (iClamp2 < 0 || iClamp2 >= this.gifts.size()) {
                return;
            }
            this.gifts.add(iClamp2, savedStarGift);
        }

        public void reorderDone() {
            ArrayList arrayList = this.savedPinnedState;
            if (arrayList == null || eq(arrayList, getPinned())) {
                this.savedPinnedState = null;
            } else {
                sendPinnedOrder();
                this.savedPinnedState = null;
            }
        }

        public void sendPinnedOrder() {
            int i = 0;
            if (this.isCollection) {
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                updatestargiftcollection.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                updatestargiftcollection.collection_id = this.collectionId;
                updatestargiftcollection.flags |= 8;
                ArrayList arrayList = this.gifts;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    updatestargiftcollection.order.add(getInput((TL_stars.SavedStarGift) obj));
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftcollection, null, 64);
                return;
            }
            TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
            togglestargiftspinnedtotop.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            ArrayList pinned = getPinned();
            int size2 = pinned.size();
            while (i < size2) {
                Object obj2 = pinned.get(i);
                i++;
                togglestargiftspinnedtotop.stargift.add(getInput((TL_stars.SavedStarGift) obj2));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(togglestargiftspinnedtotop, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.GiftsList.$r8$lambda$o_kNtECv5tdzurkuOWUGKNeeFVE(tLObject, tL_error);
                }
            }, 64);
        }

        public boolean contains(TL_stars.SavedStarGift savedStarGift) {
            ArrayList arrayList = this.gifts;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (StarsController.eq((TL_stars.SavedStarGift) obj, savedStarGift)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean eq(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i = savedStarGift.flags;
        if ((i & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            return ((i & 8) == 0 || (savedStarGift2.flags & 8) == 0 || savedStarGift.msg_id != savedStarGift2.msg_id) ? false : true;
        }
        return true;
    }

    public TL_stars.SavedStarGift findUserStarGift(long j) {
        TL_stars.StarGift starGift;
        for (int i = 0; i < this.giftLists.size(); i++) {
            GiftsList giftsList = (GiftsList) this.giftLists.valueAt(i);
            for (int i2 = 0; i2 < giftsList.gifts.size(); i2++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) giftsList.gifts.get(i2);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.id == j) {
                    return savedStarGift;
                }
            }
        }
        return null;
    }

    public static TL_stars.StarGiftAttribute findAttribute(ArrayList arrayList, Class cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                return (TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute);
            }
        }
        return null;
    }

    public static ArrayList findAttributes(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                arrayList2.add((TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute));
            }
        }
        return arrayList2;
    }

    public void getStarGiftPreview(final long j, final Utilities.Callback callback) {
        if (callback == null) {
            return;
        }
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.giftPreviews.get(Long.valueOf(j));
        if (stargiftupgradepreview != null) {
            callback.run(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftupgradepreview, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.$r8$lambda$sX6keYetb5L2e1ZX7Bvp_YppqqQ(this.f$0, j, callback, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$sX6keYetb5L2e1ZX7Bvp_YppqqQ(final StarsController starsController, final long j, final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.m4218$r8$lambda$flACazvrJHdB4UgEvu7ji4HAfQ(this.f$0, tLObject, j, callback);
            }
        });
    }

    public static void m4218$r8$lambda$flACazvrJHdB4UgEvu7ji4HAfQ(StarsController starsController, TLObject tLObject, long j, Utilities.Callback callback) {
        starsController.getClass();
        if (tLObject instanceof TL_stars.starGiftUpgradePreview) {
            TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
            starsController.giftPreviews.put(Long.valueOf(j), stargiftupgradepreview);
            callback.run(stargiftupgradepreview);
            return;
        }
        callback.run(null);
    }

    public void getUserStarGift(final TL_stars.InputSavedStarGift inputSavedStarGift, final Utilities.Callback callback) {
        if (callback == null) {
            return;
        }
        final AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3);
        alertDialog.showDelayed(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getsavedstargift, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.$r8$lambda$TH4WPTAX62ZDRWN6kpStZqRLvxs(this.f$0, alertDialog, inputSavedStarGift, callback, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$TH4WPTAX62ZDRWN6kpStZqRLvxs(final StarsController starsController, final AlertDialog alertDialog, final TL_stars.InputSavedStarGift inputSavedStarGift, final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$mgTD02bkLunGcg52Og0OFxe2Fl4(this.f$0, alertDialog, tLObject, inputSavedStarGift, callback);
            }
        });
    }

    public static void $r8$lambda$mgTD02bkLunGcg52Og0OFxe2Fl4(StarsController starsController, AlertDialog alertDialog, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        TL_stars.SavedStarGift savedStarGift;
        starsController.getClass();
        alertDialog.dismiss();
        if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
            TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
            MessagesController.getInstance(starsController.currentAccount).putUsers(tL_payments_savedStarGifts.users, false);
            MessagesController.getInstance(starsController.currentAccount).putChats(tL_payments_savedStarGifts.chats, false);
            for (int i = 0; i < tL_payments_savedStarGifts.gifts.size(); i++) {
                savedStarGift = tL_payments_savedStarGifts.gifts.get(i);
                if ((!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) || ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id != savedStarGift.msg_id) && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) || ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id != savedStarGift.saved_id)) {
                }
            }
            savedStarGift = null;
        } else {
            savedStarGift = null;
        }
        callback.run(savedStarGift);
    }

    public void getPaidRevenue(long j, long j2, final Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
        if (j2 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpaidmessagesrevenue, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.$r8$lambda$tqy42fpvzOBY6_NH5yWEoodkogw(tLObject, callback);
                    }
                });
            }
        });
    }

    public static void $r8$lambda$tqy42fpvzOBY6_NH5yWEoodkogw(TLObject tLObject, Utilities.Callback callback) {
        if (tLObject instanceof TL_account.paidMessagesRevenue) {
            callback.run(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
        } else {
            callback.run(0L);
        }
    }

    public void stopPaidMessages(final long j, final long j2, boolean z, final boolean z2) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
        if (j2 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
        }
        togglenopaidmessagesexception.refund_charged = z;
        togglenopaidmessagesexception.require_payment = !z2;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.$r8$lambda$Sa4se0wMPExGS1bSwo9z7ofUhbs(this.f$0, j2, j, z2, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$Sa4se0wMPExGS1bSwo9z7ofUhbs(final StarsController starsController, final long j, final long j2, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        starsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$QEvEEyUL6sSBRUtpNRsU7uZZ2d8(this.f$0, tLObject, j, j2, z);
            }
        });
    }

    public static void $r8$lambda$QEvEEyUL6sSBRUtpNRsU7uZZ2d8(StarsController starsController, TLObject tLObject, long j, long j2, boolean z) {
        TLRPC.PeerSettings peerSettings;
        starsController.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            if (j != 0) {
                starsController.processUpdateMonoForumNoPaidException(-j, j2, z);
                return;
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(starsController.currentAccount).getUserFull(j2);
            if (userFull != null && (peerSettings = userFull.settings) != null) {
                peerSettings.flags &= -16385;
                peerSettings.charge_paid_message_stars = 0L;
            }
            MessagesController.getNotificationsSettings(starsController.currentAccount).edit().putLong("dialog_bar_paying_" + j2, 0L).apply();
            MessagesController.getInstance(starsController.currentAccount).loadPeerSettings(MessagesController.getInstance(starsController.currentAccount).getUser(Long.valueOf(j2)), MessagesController.getInstance(starsController.currentAccount).getChat(Long.valueOf(-j2)), true);
            ContactsController.getInstance(starsController.currentAccount).loadPrivacySettings(true);
            NotificationCenter.getInstance(starsController.currentAccount).postNotificationName(NotificationCenter.messagesFeeUpdated, Long.valueOf(j2));
        }
    }

    public void processUpdateMonoForumNoPaidException(long j, long j2, boolean z) {
        TopicsController topicsController = MessagesController.getInstance(this.currentAccount).getTopicsController();
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsController.findTopic(j, j2);
        if (tL_forumTopicFindTopic != null) {
            tL_forumTopicFindTopic.nopaid_messages_exception = z;
            topicsController.saveTopics(j);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.messagesFeeUpdated, Long.valueOf(j2));
        }
    }

    class PaidMessagesToast {
        public final Bulletin bulletin;
        public final Bulletin.UndoButton bulletinButton;
        public final Bulletin.TwoLineAnimatedLottieLayout bulletinLayout;
        public final long dialogId;
        public final BaseFragment fragment;
        private final Runnable sendRunnable;
        private boolean sent;
        public final Bulletin.TimerView timerView;
        public int totalMessagesCount;
        public long totalStars;
        public Utilities.Callback undoListener;
        private boolean undone;
        public final ArrayList totalSendListeners = new ArrayList();
        public final HashSet messages = new HashSet();
        public long startTime = System.currentTimeMillis();
        public boolean undoRunning = true;

        public PaidMessagesToast(BaseFragment baseFragment, long j) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.send();
                }
            };
            this.sendRunnable = runnable;
            this.fragment = baseFragment;
            this.dialogId = j;
            Context context = StarsController.this.getContext(baseFragment);
            Bulletin.TwoLineAnimatedLottieLayout twoLineAnimatedLottieLayout = new Bulletin.TwoLineAnimatedLottieLayout(context, baseFragment.getResourceProvider());
            this.bulletinLayout = twoLineAnimatedLottieLayout;
            twoLineAnimatedLottieLayout.setAnimation(R.raw.stars_topup, new String[0]);
            Bulletin.TimerView timerView = new Bulletin.TimerView(context, baseFragment.getResourceProvider());
            this.timerView = timerView;
            timerView.timeLeft = 3000L;
            timerView.setColor(Theme.getColor(Theme.key_undo_cancelColor, baseFragment.getResourceProvider()));
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, true, false, baseFragment.getResourceProvider());
            this.bulletinButton = undoButton;
            undoButton.setText(LocaleController.getString(R.string.StarsSentUndo));
            undoButton.setUndoAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.undo();
                }
            });
            undoButton.addView(timerView, LayoutHelper.createFrame(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            undoButton.undoTextView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            twoLineAnimatedLottieLayout.setButton(undoButton);
            Bulletin bulletinCreate = BulletinFactory.of(baseFragment).create(twoLineAnimatedLottieLayout, -1);
            this.bulletin = bulletinCreate;
            bulletinCreate.hideAfterBottomSheet = false;
            bulletinCreate.show(true);
            bulletinCreate.setOnHideListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.send();
                }
            });
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, 3000L);
        }

        public CharSequence getTitle() {
            int i = this.totalMessagesCount;
            if (i == 1) {
                return LocaleController.getString(R.string.PaidMessageSentTitleOne);
            }
            return LocaleController.formatPluralString("PaidMessageSentTitle", i, new Object[0]);
        }

        public CharSequence getSubtitle() {
            return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.totalStars)));
        }

        public boolean isUndoRunning() {
            return this.totalMessagesCount > 0 && this.undoRunning;
        }

        public boolean isVisible() {
            return (this.undone || this.sent) ? false : true;
        }

        public boolean push(MessageObject messageObject, long j, Utilities.Callback callback, Runnable runnable, boolean z) {
            if (this.undone || this.sent) {
                return false;
            }
            this.totalMessagesCount++;
            this.messages.add(messageObject);
            this.totalStars += j;
            this.undoListener = callback;
            if (runnable != null) {
                this.totalSendListeners.add(runnable);
            }
            if (this.undoRunning && !z) {
                this.undoRunning = false;
                AndroidUtilities.cancelRunOnUIThread(this.sendRunnable);
                this.bulletin.setDuration(5000);
                this.bulletin.setCanHide(true);
                if (System.currentTimeMillis() - this.startTime > 500) {
                    this.bulletinButton.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                } else {
                    this.bulletinButton.setAlpha(0.0f);
                    this.bulletinButton.setVisibility(8);
                }
            }
            Bulletin.TimerView timerView = this.timerView;
            if (timerView != null && this.undoRunning) {
                timerView.timeLeft = 3000L;
                AndroidUtilities.cancelRunOnUIThread(this.sendRunnable);
                AndroidUtilities.runOnUIThread(this.sendRunnable, 3000L);
            }
            this.bulletinLayout.titleTextView.setText(getTitle());
            this.bulletinLayout.subtitleTextView.setText(getSubtitle());
            this.bulletinLayout.imageView.playAnimation();
            return true;
        }

        public boolean pop(int i) {
            MessageObject messageObject;
            TLRPC.Message message;
            if (!this.undone && !this.sent) {
                Iterator it = this.messages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        messageObject = null;
                        break;
                    }
                    messageObject = (MessageObject) it.next();
                    if (messageObject.getId() == i) {
                        this.messages.remove(messageObject);
                        break;
                    }
                }
                if (this.messages.isEmpty()) {
                    this.undone = true;
                    this.bulletin.hide();
                    return true;
                }
                this.totalMessagesCount--;
                if (messageObject != null && (message = messageObject.messageOwner) != null) {
                    this.totalStars -= message.paid_message_stars;
                }
                Bulletin.TimerView timerView = this.timerView;
                if (timerView != null) {
                    timerView.timeLeft = 3000L;
                    AndroidUtilities.cancelRunOnUIThread(this.sendRunnable);
                    AndroidUtilities.runOnUIThread(this.sendRunnable, 3000L);
                }
                this.bulletinLayout.titleTextView.setText(getTitle());
                this.bulletinLayout.subtitleTextView.setText(getSubtitle());
                this.bulletinLayout.imageView.playAnimation();
            }
            return false;
        }

        public void undo() {
            if (this.undone || this.sent || !this.undoRunning) {
                return;
            }
            this.undone = true;
            Utilities.Callback callback = this.undoListener;
            if (callback != null) {
                callback.run(this.messages);
            }
            if (this.bulletinButton != null) {
                this.bulletin.hide();
            }
        }

        public void send() {
            if (this.undone || this.sent) {
                return;
            }
            this.sent = true;
            ArrayList arrayList = this.totalSendListeners;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
            if (this.bulletinButton != null) {
                this.bulletin.hide();
            }
        }
    }

    public void showPaidMessageToast(long j, MessageObject messageObject, long j2, Utilities.Callback callback, Runnable runnable, boolean z) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        PaidMessagesToast paidMessagesToast = this.currentPaidMessagesToast;
        if (paidMessagesToast != null && (paidMessagesToast.sent || this.currentPaidMessagesToast.undone)) {
            this.currentPaidMessagesToast = null;
        }
        if (this.currentPaidMessagesToast != null) {
            if (safeLastFragment == null || safeLastFragment.isRemovingFromStack()) {
                this.currentPaidMessagesToast.send();
                this.currentPaidMessagesToast = null;
            } else {
                PaidMessagesToast paidMessagesToast2 = this.currentPaidMessagesToast;
                if (paidMessagesToast2.dialogId != j || paidMessagesToast2.fragment != safeLastFragment) {
                    this.currentPaidMessagesToast.send();
                    this.currentPaidMessagesToast = null;
                }
            }
        }
        if (safeLastFragment == null || safeLastFragment.isRemovingFromStack()) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (this.currentPaidMessagesToast == null) {
                this.currentPaidMessagesToast = new PaidMessagesToast(safeLastFragment, j);
            }
            if (this.currentPaidMessagesToast.push(messageObject, j2, callback, runnable, z) || runnable == null) {
                return;
            }
            runnable.run();
        }
    }

    public void hidePaidMessageToast(MessageObject messageObject) {
        PaidMessagesToast paidMessagesToast;
        if (messageObject != null && (paidMessagesToast = this.currentPaidMessagesToast) != null && paidMessagesToast.dialogId == messageObject.getDialogId() && this.currentPaidMessagesToast.pop(messageObject.getId())) {
            this.currentPaidMessagesToast = null;
        }
    }

    private boolean needsUndoButton(MessageObject messageObject, long j) {
        PaidMessagesToast paidMessagesToast = this.currentPaidMessagesToast;
        if (paidMessagesToast != null && paidMessagesToast.isUndoRunning() && this.currentPaidMessagesToast.isVisible()) {
            return true;
        }
        if (AlertsCreator.needsPaidMessageAlert(this.currentAccount, messageObject.getDialogId())) {
            return false;
        }
        Long l = (Long) this.justAgreedToNotAskDialogs.get(Long.valueOf(messageObject.getDialogId()));
        if (l != null && System.currentTimeMillis() - l.longValue() > 5000) {
            return false;
        }
        Integer num = (Integer) this.sendingMessagesCount.get(Long.valueOf(messageObject.getDialogId()));
        return (num != null && num.intValue() >= 3) || j >= 100;
    }

    public void beforeSendingMessage(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        long j = message.paid_message_stars;
        if (j <= 0 || messageObject.isEphemeral()) {
            return;
        }
        final boolean zNeedsUndoButton = needsUndoButton(messageObject, j);
        final int id = messageObject.getId();
        if (zNeedsUndoButton) {
            this.sendingPaidMessagesIds.add(Integer.valueOf(id));
        }
        showPaidMessageToast(messageObject.getDialogId(), messageObject, j, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.$r8$lambda$uXH8rQE2M6SGRR7Olan2U9YZxt4(this.f$0, zNeedsUndoButton, (HashSet) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                StarsController.$r8$lambda$Bt5QekNXuVf6Q6STPhcXwlZhQQA(this.f$0, zNeedsUndoButton, id);
            }
        }, zNeedsUndoButton);
    }

    public static void $r8$lambda$uXH8rQE2M6SGRR7Olan2U9YZxt4(StarsController starsController, boolean z, HashSet hashSet) {
        if (z) {
            SendMessagesHelper.getInstance(starsController.currentAccount).cancelSendingMessage(new ArrayList<>(hashSet));
        } else {
            starsController.getClass();
        }
    }

    public static void $r8$lambda$Bt5QekNXuVf6Q6STPhcXwlZhQQA(StarsController starsController, boolean z, int i) {
        if (!z) {
            starsController.getClass();
            return;
        }
        starsController.sendingPaidMessagesIds.remove(Integer.valueOf(i));
        Runnable runnable = (Runnable) starsController.postponedPaidMessages.remove(Integer.valueOf(i));
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean beforeSendingFinalRequest(TLObject tLObject, MessageObject messageObject, Runnable runnable) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return true;
        }
        int id = messageObject.getId();
        if (getAllowedPaidStars(tLObject) <= 0 || !this.sendingPaidMessagesIds.remove(Integer.valueOf(id))) {
            return true;
        }
        this.postponedPaidMessages.put(Integer.valueOf(id), runnable);
        return false;
    }

    public boolean beforeSendingFinalRequest(TLObject tLObject, ArrayList arrayList, final Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || getAllowedPaidStars(tLObject) <= 0) {
            return true;
        }
        final HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int id = ((MessageObject) obj).getId();
            hashSet.add(Integer.valueOf(id));
            if (this.sendingPaidMessagesIds.remove(Integer.valueOf(id))) {
                this.postponedPaidMessages.put(Integer.valueOf(id), new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.$r8$lambda$RDudJPa6DBaAEl1U8xbN5ZNekVQ(this.f$0, hashSet, runnable);
                    }
                });
                z = true;
            }
        }
        return !z;
    }

    public static void $r8$lambda$RDudJPa6DBaAEl1U8xbN5ZNekVQ(StarsController starsController, HashSet hashSet, Runnable runnable) {
        starsController.getClass();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.getClass();
            starsController.sendingPaidMessagesIds.remove(num);
            starsController.postponedPaidMessages.remove(num);
        }
        runnable.run();
    }

    public static long getAllowedPaidStars(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            return ((TLRPC.TL_messages_sendMultiMedia) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return ((TLRPC.TL_messages_sendInlineBotResult) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject;
            return tL_messages_forwardMessages.allow_paid_stars / ((long) tL_messages_forwardMessages.id.size());
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        }
        return 0L;
    }

    public static long getPeer(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            return DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
        }
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            return DialogObject.getPeerDialogId(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMedia) tLObject).peer);
        }
        return 0L;
    }

    public void showPriceChangedToast(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        MessageObject messageObject = (MessageObject) list.get(0);
        long dialogId = messageObject.getDialogId();
        if (dialogId >= 0) {
            MessagesController.getInstance(this.currentAccount).loadFullUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId)), 0, true);
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(-dialogId, 0, true);
        }
        BulletinFactory.of(LaunchActivity.getSafeLastFragment()).createSimpleBulletin(R.raw.error, StarsIntroActivity.replaceStars(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).show();
    }

    public static boolean isEnoughAmount(int i, AmountUtils$Amount amountUtils$Amount) {
        return amountUtils$Amount == null || getInstance(i, amountUtils$Amount.currency).getBalanceAmount().asNano() >= amountUtils$Amount.asNano();
    }
}
