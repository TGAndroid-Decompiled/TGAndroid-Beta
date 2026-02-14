package org.telegram.ui.Stars;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.LongSparseArray;
import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
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
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
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

    public static void lambda$showStarsTopupInternal$25() {
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
        StarsController starsController = Instance[z ? 1 : 0][i];
        if (starsController == null) {
            synchronized (lockObjects[z ? 1 : 0][i]) {
                try {
                    starsController = Instance[z ? 1 : 0][i];
                    if (starsController == null) {
                        StarsController[] starsControllerArr = Instance[z ? 1 : 0];
                        StarsController starsController2 = new StarsController(i, z);
                        starsControllerArr[i] = starsController2;
                        starsController = starsController2;
                    }
                } finally {
                }
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
                    this.f$0.lambda$getBalance$1(runnable, tLObject, tL_error);
                }
            });
        }
        if (z && this.minus > 0) {
            AmountUtils$Amount amountUtils$AmountOfSafe = AmountUtils$Amount.ofSafe(this.balance);
            return AmountUtils$Amount.fromDecimal(Math.max(0L, amountUtils$AmountOfSafe.asDecimal() - this.minus), amountUtils$AmountOfSafe.currency).toTl();
        }
        return this.balance;
    }

    public void lambda$getBalance$1(final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getBalance$0(tLObject, runnable);
            }
        });
    }

    public void lambda$getBalance$0(TLObject tLObject, Runnable runnable) {
        boolean z;
        boolean z2;
        boolean z3 = !this.balanceLoaded;
        this.lastBalanceLoaded = System.currentTimeMillis();
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(starsStatus.chats, false);
            if (this.transactions[0].isEmpty()) {
                Iterator<TL_stars.StarsTransaction> it = starsStatus.history.iterator();
                while (it.hasNext()) {
                    TL_stars.StarsTransaction next = it.next();
                    this.transactions[0].add(next);
                    this.transactions[next.amount.amount > 0 ? (char) 1 : (char) 2].add(next);
                }
                for (int i = 0; i < 3; i++) {
                    this.transactionsExist[i] = !this.transactions[i].isEmpty() || this.transactionsExist[i];
                    boolean[] zArr = this.endReached;
                    boolean z4 = (starsStatus.flags & 1) == 0;
                    zArr[i] = z4;
                    if (z4) {
                        this.loading[i] = false;
                    }
                    this.offset[i] = zArr[i] ? null : starsStatus.next_offset;
                }
                z = true;
            } else {
                z = false;
            }
            if (this.subscriptions.isEmpty()) {
                this.subscriptions.addAll(starsStatus.subscriptions);
                this.subscriptionsLoading = false;
                this.subscriptionsOffset = starsStatus.subscriptions_next_offset;
                this.subscriptionsEndReached = (starsStatus.flags & 4) == 0;
                z2 = true;
            } else {
                z2 = false;
            }
            long j = this.balance.amount;
            TL_stars.StarsAmount starsAmount = starsStatus.balance;
            if (j != starsAmount.amount) {
                z3 = true;
            }
            this.balance = starsAmount;
            this.minus = 0L;
        } else {
            z = false;
            z2 = false;
        }
        this.balanceLoading = false;
        this.balanceLoaded = true;
        if (z3) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
        }
        if (z2) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
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
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.minus != 0) {
            this.minus = 0L;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
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
                this.f$0.lambda$getOptions$6(tLObject, tL_error);
            }
        });
        return this.options;
    }

    public void lambda$getOptions$6(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getOptions$5(tLObject);
            }
        });
    }

    public void lambda$getOptions$5(TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            Iterator it = ((Vector) tLObject).objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof TL_stars.TL_starsTopupOption) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) next;
                    arrayList.add(tL_starsTopupOption);
                    if (tL_starsTopupOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tL_starsTopupOption);
                        tL_starsTopupOption.loadingStorePrice = true;
                    }
                }
            }
            this.optionsLoaded = true;
        }
        this.options = arrayList;
        this.optionsLoading = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
        if (arrayList2.isEmpty()) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getOptions$4(arrayList2);
            }
        };
        if (!BillingController.getInstance().isReady()) {
            BillingController.getInstance().whenSetuped(runnable);
        } else {
            runnable.run();
        }
    }

    public void lambda$getOptions$4(final ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TL_stars.TL_starsTopupOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                this.f$0.lambda$getOptions$3(arrayList, billingResult, list);
            }
        });
    }

    public void lambda$getOptions$3(final ArrayList arrayList, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getOptions$2(billingResult, list, arrayList);
            }
        });
    }

    public void lambda$getOptions$2(BillingResult billingResult, List list, ArrayList arrayList) {
        TL_stars.TL_starsTopupOption tL_starsTopupOption;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (billingResult.getResponseCode() != 0) {
            bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
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
        if (this.options != null) {
            for (int i3 = 0; i3 < this.options.size(); i3++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) this.options.get(i3);
                if (tL_starsTopupOption2 != null && tL_starsTopupOption2.loadingStorePrice) {
                    tL_starsTopupOption2.missingStorePrice = true;
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
    }

    public ArrayList getGiftOptions() {
        if (this.giftOptionsLoading || this.giftOptionsLoaded) {
            return this.giftOptions;
        }
        this.giftOptionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getGiftOptions$11(tLObject, tL_error);
            }
        });
        return this.giftOptions;
    }

    public void lambda$getGiftOptions$11(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getGiftOptions$10(tLObject);
            }
        });
    }

    public void lambda$getGiftOptions$10(TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            Iterator it = ((Vector) tLObject).objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof TL_stars.TL_starsGiftOption) {
                    TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) next;
                    arrayList.add(tL_starsGiftOption);
                    if (tL_starsGiftOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tL_starsGiftOption);
                        tL_starsGiftOption.loadingStorePrice = true;
                    }
                }
            }
            this.giftOptionsLoaded = true;
        }
        this.giftOptions = arrayList;
        this.giftOptionsLoading = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
        if (arrayList2.isEmpty()) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getGiftOptions$9(arrayList2);
            }
        };
        if (!BillingController.getInstance().isReady()) {
            BillingController.getInstance().whenSetuped(runnable);
        } else {
            runnable.run();
        }
    }

    public void lambda$getGiftOptions$9(final ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TL_stars.TL_starsGiftOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                this.f$0.lambda$getGiftOptions$8(arrayList, billingResult, list);
            }
        });
    }

    public void lambda$getGiftOptions$8(final ArrayList arrayList, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getGiftOptions$7(billingResult, list, arrayList);
            }
        });
    }

    public void lambda$getGiftOptions$7(BillingResult billingResult, List list, ArrayList arrayList) {
        TL_stars.TL_starsGiftOption tL_starsGiftOption;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (billingResult.getResponseCode() != 0) {
            bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
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
        if (this.giftOptions != null) {
            for (int i3 = 0; i3 < this.giftOptions.size(); i3++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) this.giftOptions.get(i3);
                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                    tL_starsGiftOption2.missingStorePrice = true;
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
    }

    public ArrayList getGiveawayOptions() {
        if (this.giveawayOptionsLoading || this.giveawayOptionsLoaded) {
            return this.giveawayOptions;
        }
        this.giveawayOptionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getGiveawayOptions$16(tLObject, tL_error);
            }
        });
        return this.giveawayOptions;
    }

    public void lambda$getGiveawayOptions$16(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getGiveawayOptions$15(tLObject);
            }
        });
    }

    public void lambda$getGiveawayOptions$15(TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            Iterator it = ((Vector) tLObject).objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof TL_stars.TL_starsGiveawayOption) {
                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) next;
                    arrayList.add(tL_starsGiveawayOption);
                    if (tL_starsGiveawayOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tL_starsGiveawayOption);
                        tL_starsGiveawayOption.loadingStorePrice = true;
                    }
                }
            }
            this.giveawayOptionsLoaded = true;
        }
        this.giveawayOptions = arrayList;
        this.giveawayOptionsLoading = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
        if (arrayList2.isEmpty()) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getGiveawayOptions$14(arrayList2);
            }
        };
        if (!BillingController.getInstance().isReady()) {
            BillingController.getInstance().whenSetuped(runnable);
        } else {
            runnable.run();
        }
    }

    public void lambda$getGiveawayOptions$14(final ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TL_stars.TL_starsGiveawayOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                this.f$0.lambda$getGiveawayOptions$13(arrayList, billingResult, list);
            }
        });
    }

    public void lambda$getGiveawayOptions$13(final ArrayList arrayList, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getGiveawayOptions$12(billingResult, list, arrayList);
            }
        });
    }

    public void lambda$getGiveawayOptions$12(BillingResult billingResult, List list, ArrayList arrayList) {
        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (billingResult.getResponseCode() != 0) {
            bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
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
        if (this.giveawayOptions != null) {
            for (int i3 = 0; i3 < this.giveawayOptions.size(); i3++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) this.giveawayOptions.get(i3);
                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                    tL_starsGiveawayOption2.missingStorePrice = true;
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
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
                this.f$0.lambda$loadTransactions$18(i, tLObject, tL_error);
            }
        });
    }

    public void lambda$loadTransactions$18(final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadTransactions$17(i, tLObject);
            }
        });
    }

    public void lambda$loadTransactions$17(int i, TLObject tLObject) {
        this.loading[i] = false;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(starsStatus.chats, false);
            this.transactions[i].addAll(starsStatus.history);
            this.transactionsExist[i] = !this.transactions[i].isEmpty() || this.transactionsExist[i];
            boolean[] zArr = this.endReached;
            boolean z = (starsStatus.flags & 1) == 0;
            zArr[i] = z;
            this.offset[i] = z ? null : starsStatus.next_offset;
            updateBalance(starsStatus.balance);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
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
                this.f$0.lambda$loadSubscriptions$20(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadSubscriptions$20(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadSubscriptions$19(tLObject);
            }
        });
    }

    public void lambda$loadSubscriptions$19(TLObject tLObject) {
        this.subscriptionsLoading = false;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(starsStatus.chats, false);
            this.subscriptions.addAll(starsStatus.subscriptions);
            this.subscriptionsEndReached = (starsStatus.flags & 4) == 0;
            this.subscriptionsOffset = starsStatus.subscriptions_next_offset;
            updateBalance(starsStatus.balance);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
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
                this.f$0.lambda$loadInsufficientSubscriptions$22(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadInsufficientSubscriptions$22(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadInsufficientSubscriptions$21(tLObject);
            }
        });
    }

    public void lambda$loadInsufficientSubscriptions$21(TLObject tLObject) {
        this.insufficientSubscriptionsLoading = false;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(starsStatus.chats, false);
            this.insufficientSubscriptions.addAll(starsStatus.subscriptions);
            updateBalance(starsStatus.balance);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
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
                    this.f$0.lambda$showStarsTopup$23(activity, j, str);
                }
            });
        } else {
            lambda$showStarsTopup$23(activity, j, str);
        }
    }

    public void lambda$showStarsTopup$23(Activity activity, long j, String str) {
        if (getBalance().amount >= j || j <= 0) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$showStarsTopupInternal$24();
                }
            }).setDuration(5000).show(true);
            return;
        }
        new StarsIntroActivity.StarsNeededSheet(activity, null, j, 4, str, new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$showStarsTopupInternal$25();
            }
        }, 0L).show();
    }

    public static void lambda$showStarsTopupInternal$24() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.presentFragment(new StarsIntroActivity());
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
        if (BuildVars.useInvoiceBilling() || !BillingController.getInstance().isReady()) {
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
                    this.f$0.lambda$buy$28(callback2, tL_inputInvoiceStars, tLObject, tL_error);
                }
            });
            return;
        }
        final TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
        tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
        tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
        tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
        QueryProductDetailsParams.Product productBuild = QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tL_starsTopupOption.store_product).build();
        FileLog.d("StarsController.buy starts queryProductDetails");
        BillingController.getInstance().queryProductDetails(Arrays.asList(productBuild), new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.lambda$buy$36(callback2, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, billingResult, list);
            }
        });
    }

    public void lambda$buy$28(final Utilities.Callback2 callback2, final TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buy$27(tL_error, callback2, tLObject, tL_inputInvoiceStars);
            }
        });
    }

    public void lambda$buy$27(TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars) {
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
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
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
                StarsController.lambda$buy$26(callback2, invoiceStatus);
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

    public static void lambda$buy$26(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
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

    public static void lambda$buy$36(final Utilities.Callback2 callback2, final TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup, final TL_stars.TL_starsTopupOption tL_starsTopupOption, final Activity activity, BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$35(list, callback2, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity);
            }
        });
    }

    public static void lambda$buy$35(List list, final Utilities.Callback2 callback2, TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup, TL_stars.TL_starsTopupOption tL_starsTopupOption, Activity activity) {
        if (list.isEmpty()) {
            FileLog.d("StarsController.buy queryProductDetails done: no products");
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buy$29(callback2);
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
                    StarsController.lambda$buy$30(callback2);
                }
            });
            return;
        }
        tL_inputStorePaymentStarsTopup.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        tL_inputStorePaymentStarsTopup.amount = (long) ((oneTimePurchaseOfferDetails.getPriceAmountMicros() / Math.pow(10.0d, 6.0d)) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)));
        BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
            @Override
            public final void accept(Object obj) {
                StarsController.lambda$buy$32(callback2, (BillingResult) obj);
            }
        });
        BillingController.getInstance().setOnCanceled(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$34(callback2);
            }
        });
        FileLog.d("StarsController.buy launchBillingFlow");
        BillingController.getInstance().launchBillingFlow(activity, AccountInstance.getInstance(UserConfig.selectedAccount), tL_inputStorePaymentStarsTopup, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) list.get(0)).build()));
    }

    public static void lambda$buy$29(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
    }

    public static void lambda$buy$30(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
    }

    public static void lambda$buy$32(final Utilities.Callback2 callback2, BillingResult billingResult) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        FileLog.d("StarsController.buy onResult " + z + " " + responseCodeString);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$31(callback2, z, responseCodeString);
            }
        });
    }

    public static void lambda$buy$31(Utilities.Callback2 callback2, boolean z, String str) {
        callback2.run(Boolean.valueOf(z), str);
    }

    public static void lambda$buy$34(final Utilities.Callback2 callback2) {
        FileLog.d("StarsController.buy onCanceled");
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$33(callback2);
            }
        });
    }

    public static void lambda$buy$33(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, null);
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
                    this.f$0.lambda$buyGift$39(callback2, tL_inputInvoiceStars, tLObject, tL_error);
                }
            });
            return;
        }
        final TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
        tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
        tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
        tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
        tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
        BillingController.getInstance().queryProductDetails(Arrays.asList(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tL_starsGiftOption.store_product).build()), new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                this.f$0.lambda$buyGift$49(callback2, tL_inputStorePaymentStarsGift2, tL_starsGiftOption, activity, billingResult, list);
            }
        });
    }

    public void lambda$buyGift$39(final Utilities.Callback2 callback2, final TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buyGift$38(tL_error, callback2, tLObject, tL_inputInvoiceStars);
            }
        });
    }

    public void lambda$buyGift$38(TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars) {
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
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
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
                StarsController.lambda$buyGift$37(callback2, invoiceStatus);
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

    public static void lambda$buyGift$37(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
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

    public void lambda$buyGift$49(final Utilities.Callback2 callback2, final TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift, final TL_stars.TL_starsGiftOption tL_starsGiftOption, final Activity activity, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buyGift$48(list, callback2, tL_inputStorePaymentStarsGift, tL_starsGiftOption, billingResult, activity);
            }
        });
    }

    public void lambda$buyGift$48(final List list, final Utilities.Callback2 callback2, final TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift, TL_stars.TL_starsGiftOption tL_starsGiftOption, final BillingResult billingResult, final Activity activity) {
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGift$40(callback2);
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
                    StarsController.lambda$buyGift$41(callback2);
                }
            });
            return;
        }
        tL_inputStorePaymentStarsGift.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        tL_inputStorePaymentStarsGift.amount = (long) ((oneTimePurchaseOfferDetails.getPriceAmountMicros() / Math.pow(10.0d, 6.0d)) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)));
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_canPurchaseStore, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.lambda$buyGift$47(productDetails, billingResult, callback2, activity, tL_inputStorePaymentStarsGift, list, tLObject, tL_error);
            }
        });
    }

    public static void lambda$buyGift$40(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
    }

    public static void lambda$buyGift$41(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
    }

    public static void lambda$buyGift$47(final ProductDetails productDetails, final BillingResult billingResult, final Utilities.Callback2 callback2, final Activity activity, final TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift, final List list, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$46(tLObject, productDetails, billingResult, callback2, activity, tL_inputStorePaymentStarsGift, list, tL_error);
            }
        });
    }

    public static void lambda$buyGift$46(TLObject tLObject, ProductDetails productDetails, final BillingResult billingResult, final Utilities.Callback2 callback2, Activity activity, TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift, List list, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
                @Override
                public final void accept(Object obj) {
                    StarsController.lambda$buyGift$43(billingResult, callback2, (BillingResult) obj);
                }
            });
            BillingController.getInstance().setOnCanceled(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGift$45(callback2);
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

    public static void lambda$buyGift$43(BillingResult billingResult, final Utilities.Callback2 callback2, BillingResult billingResult2) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$42(callback2, z, responseCodeString);
            }
        });
    }

    public static void lambda$buyGift$42(Utilities.Callback2 callback2, boolean z, String str) {
        callback2.run(Boolean.valueOf(z), str);
    }

    public static void lambda$buyGift$44(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, null);
    }

    public static void lambda$buyGift$45(final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$44(callback2);
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
                    this.f$0.lambda$buyGiveaway$52(callback2, tL_inputInvoiceStars, tLObject2, tL_error);
                }
            });
            return;
        }
        BillingController.getInstance().queryProductDetails(Arrays.asList(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tL_starsGiveawayOption.store_product).build()), new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list3) {
                this.f$0.lambda$buyGiveaway$62(callback2, tL_inputStorePaymentStarsGiveaway, activity, billingResult, list3);
            }
        });
    }

    public void lambda$buyGiveaway$52(final Utilities.Callback2 callback2, final TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buyGiveaway$51(tL_error, callback2, tLObject, tL_inputInvoiceStars);
            }
        });
    }

    public void lambda$buyGiveaway$51(TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars) {
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
            MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
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
                StarsController.lambda$buyGiveaway$50(callback2, invoiceStatus);
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

    public static void lambda$buyGiveaway$50(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
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

    public void lambda$buyGiveaway$62(final Utilities.Callback2 callback2, final TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway, final Activity activity, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buyGiveaway$61(list, callback2, tL_inputStorePaymentStarsGiveaway, billingResult, activity);
            }
        });
    }

    public void lambda$buyGiveaway$61(final List list, final Utilities.Callback2 callback2, final TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway, final BillingResult billingResult, final Activity activity) {
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGiveaway$53(callback2);
                }
            });
            return;
        }
        final ProductDetails productDetails = (ProductDetails) list.get(0);
        if (productDetails.getOneTimePurchaseOfferDetails() == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGiveaway$54(callback2);
                }
            });
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_canPurchaseStore, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarsController.lambda$buyGiveaway$60(productDetails, billingResult, callback2, activity, tL_inputStorePaymentStarsGiveaway, list, tLObject, tL_error);
            }
        });
    }

    public static void lambda$buyGiveaway$53(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
    }

    public static void lambda$buyGiveaway$54(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
    }

    public static void lambda$buyGiveaway$60(final ProductDetails productDetails, final BillingResult billingResult, final Utilities.Callback2 callback2, final Activity activity, final TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway, final List list, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGiveaway$59(tLObject, productDetails, billingResult, callback2, activity, tL_inputStorePaymentStarsGiveaway, list, tL_error);
            }
        });
    }

    public static void lambda$buyGiveaway$59(TLObject tLObject, ProductDetails productDetails, final BillingResult billingResult, final Utilities.Callback2 callback2, Activity activity, TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway, List list, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
                @Override
                public final void accept(Object obj) {
                    StarsController.lambda$buyGiveaway$56(billingResult, callback2, (BillingResult) obj);
                }
            });
            BillingController.getInstance().setOnCanceled(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGiveaway$58(callback2);
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

    public static void lambda$buyGiveaway$56(BillingResult billingResult, final Utilities.Callback2 callback2, BillingResult billingResult2) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGiveaway$55(callback2, z, responseCodeString);
            }
        });
    }

    public static void lambda$buyGiveaway$55(Utilities.Callback2 callback2, boolean z, String str) {
        callback2.run(Boolean.valueOf(z), str);
    }

    public static void lambda$buyGiveaway$57(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, null);
    }

    public static void lambda$buyGiveaway$58(final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGiveaway$57(callback2);
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
                this.f$0.lambda$pay$64(messageObject, tL_inputInvoiceMessage, runnable, tLObject, tL_error);
            }
        });
        return new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$pay$65(iSendRequest);
            }
        };
    }

    public void lambda$pay$64(final MessageObject messageObject, final TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$pay$63(tLObject, messageObject, tL_inputInvoiceMessage, runnable, tL_error);
            }
        });
    }

    public void lambda$pay$63(TLObject tLObject, MessageObject messageObject, TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage, Runnable runnable, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            openPaymentForm(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, runnable, null);
        } else {
            bulletinError(tL_error, "NO_PAYMENT_FORM");
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$pay$65(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public void openPaymentForm(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Runnable runnable, final Utilities.Callback callback) {
        long dialogId;
        final String str;
        final boolean z;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null || this.paymentFormOpened) {
            return;
        }
        MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context2 == null) {
            return;
        }
        if (!balanceAvailable()) {
            getBalance(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openPaymentForm$66(runnable, messageObject, inputInvoice, tL_payments_paymentFormStars, callback);
                }
            });
            return;
        }
        Iterator<TLRPC.TL_labeledPrice> it = tL_payments_paymentFormStars.invoice.prices.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().amount;
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
        final long j2 = dialogId;
        if (j2 >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j2));
            String userName = UserObject.getUserName(user);
            UserObject.isBot(user);
            z = !UserObject.isBot(user);
            str = userName;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j2));
            str = chat == null ? "" : chat.title;
            z = false;
        }
        String str2 = tL_payments_paymentFormStars.title;
        if (runnable != null) {
            runnable.run();
        }
        final int i = tL_payments_paymentFormStars.invoice.subscription_period;
        final boolean[] zArr = {false};
        final long j3 = j;
        StarsIntroActivity.openConfirmPurchaseSheet(context2, resourceProvider, this.currentAccount, messageObject, j2, str2, j, tL_payments_paymentFormStars.photo, i, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$openPaymentForm$71(j3, zArr, callback, context2, resourceProvider, z, str, messageObject, inputInvoice, tL_payments_paymentFormStars, i, j2, (Utilities.Callback) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openPaymentForm$72(zArr, callback);
            }
        });
    }

    public void lambda$openPaymentForm$66(Runnable runnable, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback) {
        if (!balanceAvailable()) {
            bulletinError("NO_BALANCE");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        openPaymentForm(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
    }

    public void lambda$openPaymentForm$71(long j, final boolean[] zArr, final Utilities.Callback callback, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, String str, final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final int i, long j2, final Utilities.Callback callback2) {
        if (this.balance.amount < j) {
            if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                this.paymentFormOpened = false;
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
                    this.f$0.lambda$openPaymentForm$68(zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i, callback, callback2);
                }
            }, j2);
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f$0.lambda$openPaymentForm$69(callback2, zArr2, zArr, callback, dialogInterface);
                }
            });
            starsNeededSheet.show();
            return;
        }
        payAfterConfirmed(messageObject, inputInvoice, tL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$openPaymentForm$70(i, callback2, zArr, callback, (Boolean) obj);
            }
        });
    }

    public void lambda$openPaymentForm$68(boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final boolean[] zArr2, final int i, final Utilities.Callback callback, final Utilities.Callback callback2) {
        zArr[0] = true;
        payAfterConfirmed(messageObject, inputInvoice, tL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$openPaymentForm$67(zArr2, i, callback, callback2, (Boolean) obj);
            }
        });
    }

    public void lambda$openPaymentForm$67(boolean[] zArr, int i, Utilities.Callback callback, Utilities.Callback callback2, Boolean bool) {
        zArr[0] = true;
        if (i > 0) {
            invalidateSubscriptions(true);
        }
        if (callback != null) {
            callback.run(bool.booleanValue() ? "paid" : "failed");
        }
        if (callback2 != null) {
            callback2.run(Boolean.TRUE);
        }
    }

    public void lambda$openPaymentForm$69(Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Utilities.Callback callback2, DialogInterface dialogInterface) {
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
        this.paymentFormOpened = false;
        if (zArr2[0] || callback2 == null) {
            return;
        }
        callback2.run("cancelled");
        zArr2[0] = true;
    }

    public void lambda$openPaymentForm$70(int i, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2, Boolean bool) {
        if (i > 0) {
            invalidateSubscriptions(true);
        }
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed");
        }
    }

    public void lambda$openPaymentForm$72(boolean[] zArr, Utilities.Callback callback) {
        this.paymentFormOpened = false;
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
                this.f$0.lambda$subscribeTo$77(j, i, zArr, callback2, context2, resourceProvider, chatInvite, str, (Utilities.Callback) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$subscribeTo$78(zArr, callback2);
            }
        });
    }

    public void lambda$subscribeTo$77(long j, int i, final boolean[] zArr, final Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, final TLRPC.ChatInvite chatInvite, final String str, final Utilities.Callback callback) {
        if (this.balance.amount < j) {
            if (!MessagesController.getInstance(i).starsPurchaseAvailable()) {
                this.paymentFormOpened = false;
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
                    this.f$0.lambda$subscribeTo$74(zArr2, str, chatInvite, zArr, callback2, callback);
                }
            }, 0L);
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f$0.lambda$subscribeTo$75(callback, zArr2, zArr, callback2, dialogInterface);
                }
            });
            starsNeededSheet.show();
            return;
        }
        payAfterConfirmed(str, chatInvite, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StarsController.lambda$subscribeTo$76(callback, zArr, callback2, (Long) obj, (Boolean) obj2);
            }
        });
    }

    public void lambda$subscribeTo$74(boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, final boolean[] zArr2, final Utilities.Callback2 callback2, final Utilities.Callback callback) {
        zArr[0] = true;
        payAfterConfirmed(str, chatInvite, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StarsController.lambda$subscribeTo$73(zArr2, callback2, callback, (Long) obj, (Boolean) obj2);
            }
        });
    }

    public static void lambda$subscribeTo$73(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback, Long l, Boolean bool) {
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed", l);
        }
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public void lambda$subscribeTo$75(Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Utilities.Callback2 callback2, DialogInterface dialogInterface) {
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
        this.paymentFormOpened = false;
        if (zArr2[0] || callback2 == null) {
            return;
        }
        callback2.run("cancelled", 0L);
        zArr2[0] = true;
    }

    public static void lambda$subscribeTo$76(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2, Long l, Boolean bool) {
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed", l);
        }
    }

    public void lambda$subscribeTo$78(boolean[] zArr, Utilities.Callback2 callback2) {
        this.paymentFormOpened = false;
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
        Iterator<TLRPC.TL_labeledPrice> it = tL_payments_paymentFormStars.invoice.prices.iterator();
        final long j = 0;
        while (it.hasNext()) {
            j += it.next().amount;
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
        final int i = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$payAfterConfirmed$86(callback, messageObject, context, j, str, i, str2, inputInvoice, j2, resourceProvider, tL_payments_paymentFormStars, tLObject, tL_error);
            }
        });
    }

    public void lambda$payAfterConfirmed$86(final Utilities.Callback callback, final MessageObject messageObject, final Context context, final long j, final String str, final int i, final String str2, final TLRPC.InputInvoice inputInvoice, final long j2, final Theme.ResourcesProvider resourcesProvider, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$payAfterConfirmed$85(tLObject, callback, messageObject, context, j, str, i, str2, inputInvoice, j2, tL_error, resourcesProvider, tL_payments_paymentFormStars);
            }
        });
    }

    public void lambda$payAfterConfirmed$85(TLObject tLObject, final Utilities.Callback callback, final MessageObject messageObject, Context context, long j, String str, int i, String str2, final TLRPC.InputInvoice inputInvoice, long j2, TLRPC.TL_error tL_error, Theme.ResourcesProvider resourcesProvider, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars) {
        TLRPC.Message message;
        this.paymentFormOpened = false;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactoryGlobal = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
            }
            final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$payAfterConfirmed$79(tL_payments_paymentResult);
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
                invalidateTransactions(true);
            }
            if (messageObject != null) {
                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                tL_messages_getExtendedMedia.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
                tL_messages_getExtendedMedia.id.add(Integer.valueOf(messageObject.getId()));
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExtendedMedia, null);
                return;
            }
            return;
        }
        if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
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
                        this.f$0.lambda$payAfterConfirmed$81(zArr, messageObject, inputInvoice, tL_payments_paymentFormStars, callback);
                    }
                }, j2);
                starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        StarsController.lambda$payAfterConfirmed$82(callback, zArr, dialogInterface);
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
                tL_messages_getExtendedMedia2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
                tL_messages_getExtendedMedia2.id.add(Integer.valueOf(messageObject.getId()));
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExtendedMedia2, null);
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                this.f$0.lambda$payAfterConfirmed$84(messageObject, inputInvoice, callback, bulletinFactory, tLObject2, tL_error2);
            }
        });
    }

    public void lambda$payAfterConfirmed$79(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    public void lambda$payAfterConfirmed$81(boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Utilities.Callback callback) {
        zArr[0] = true;
        payAfterConfirmed(messageObject, inputInvoice, tL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.lambda$payAfterConfirmed$80(callback, (Boolean) obj);
            }
        });
    }

    public static void lambda$payAfterConfirmed$80(Utilities.Callback callback, Boolean bool) {
        if (callback != null) {
            callback.run(bool);
        }
    }

    public static void lambda$payAfterConfirmed$82(Utilities.Callback callback, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
    }

    public void lambda$payAfterConfirmed$84(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final Utilities.Callback callback, final BulletinFactory bulletinFactory, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$payAfterConfirmed$83(tLObject, messageObject, inputInvoice, callback, bulletinFactory, tL_error);
            }
        });
    }

    public void lambda$payAfterConfirmed$83(TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, BulletinFactory bulletinFactory, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            payAfterConfirmed(messageObject, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, callback);
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
                this.f$0.lambda$payAfterConfirmed$92(callback2, j, str2, context, resourceProvider, chatInvite, str, tLObject, tL_error);
            }
        });
    }

    public void lambda$payAfterConfirmed$92(final Utilities.Callback2 callback2, final long j, final String str, final Context context, final Theme.ResourcesProvider resourcesProvider, final TLRPC.ChatInvite chatInvite, final String str2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$payAfterConfirmed$91(tLObject, callback2, j, str, tL_error, context, resourcesProvider, chatInvite, str2);
            }
        });
    }

    public void lambda$payAfterConfirmed$91(TLObject tLObject, final Utilities.Callback2 callback2, long j, String str, TLRPC.TL_error tL_error, Context context, Theme.ResourcesProvider resourcesProvider, final TLRPC.ChatInvite chatInvite, final String str2) {
        this.paymentFormOpened = false;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactoryOf = !AndroidUtilities.hasDialogOnTop(lastFragment) ? BulletinFactory.of(lastFragment) : BulletinFactory.global();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$payAfterConfirmed$87(tL_payments_paymentResult);
                }
            });
            TLRPC.Updates updates = tL_payments_paymentResult.updates;
            TLRPC.Update update = updates.update;
            long j2 = update instanceof TLRPC.TL_updateChannel ? -((TLRPC.TL_updateChannel) update).channel_id : 0L;
            if (updates.updates != null) {
                for (int i = 0; i < tL_payments_paymentResult.updates.updates.size(); i++) {
                    if (tL_payments_paymentResult.updates.updates.get(i) instanceof TLRPC.TL_updateChannel) {
                        j2 = -((TLRPC.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i)).channel_id;
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
            invalidateTransactions(true);
            invalidateSubscriptions(true);
            return;
        }
        if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (callback2 != null) {
                callback2.run(0L, Boolean.FALSE);
            }
            bulletinFactoryOf.createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error != null ? tL_error.text : "FAILED_SEND_STARS")).show();
        } else if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
            if (callback2 != null) {
                callback2.run(0L, Boolean.FALSE);
            }
            showNoSupportDialog(context, resourcesProvider);
        } else {
            final boolean[] zArr = {false};
            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, 1, chatInvite.title, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$payAfterConfirmed$89(zArr, str2, chatInvite, callback2);
                }
            }, 0L);
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    StarsController.lambda$payAfterConfirmed$90(callback2, zArr, dialogInterface);
                }
            });
            starsNeededSheet.show();
        }
    }

    public void lambda$payAfterConfirmed$87(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    public void lambda$payAfterConfirmed$89(boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        zArr[0] = true;
        payAfterConfirmed(str, chatInvite, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StarsController.lambda$payAfterConfirmed$88(callback2, (Long) obj, (Boolean) obj2);
            }
        });
    }

    public static void lambda$payAfterConfirmed$88(Utilities.Callback2 callback2, Long l, Boolean bool) {
        if (callback2 != null) {
            callback2.run(l, bool);
        }
    }

    public static void lambda$payAfterConfirmed$90(Utilities.Callback2 callback2, boolean[] zArr, DialogInterface dialogInterface) {
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
                this.f$0.lambda$updateMediaPrice$97(runnable, z, dialogId, id, messageObject, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$updateMediaPrice$97(final Runnable runnable, final boolean z, final long j, final int i, final MessageObject messageObject, final long j2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateMediaPrice$96(tLObject, runnable, tL_error, z, j, i, messageObject, j2);
            }
        });
    }

    public void lambda$updateMediaPrice$96(final TLObject tLObject, final Runnable runnable, TLRPC.TL_error tL_error, boolean z, long j, int i, final MessageObject messageObject, final long j2) {
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateMediaPrice$93(tLObject);
                }
            });
            runnable.run();
        } else {
            if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z) {
                TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                tL_messages_getScheduledMessages.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
                tL_messages_getScheduledMessages.id.add(Integer.valueOf(i));
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getScheduledMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        this.f$0.lambda$updateMediaPrice$95(messageObject, j2, runnable, tLObject2, tL_error2);
                    }
                });
                return;
            }
            runnable.run();
        }
    }

    public void lambda$updateMediaPrice$93(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    public void lambda$updateMediaPrice$95(final MessageObject messageObject, final long j, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateMediaPrice$94(tLObject, messageObject, j, runnable);
            }
        });
    }

    public void lambda$updateMediaPrice$94(TLObject tLObject, MessageObject messageObject, long j, Runnable runnable) {
        if (tLObject instanceof TLRPC.TL_messages_messages) {
            TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_messages_messages.chats, false);
            if (tL_messages_messages.messages.size() == 1 && (tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) && (tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                messageObject.messageOwner = tL_messages_messages.messages.get(0);
                updateMediaPrice(messageObject, j, runnable, true);
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
            if (!(obj instanceof MessageId)) {
                return false;
            }
            MessageId messageId = (MessageId) obj;
            return messageId.did == this.did && messageId.mid == this.mid;
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
        public long random_id;
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
            this.random_id = (Utilities.random.nextLong() & 4294967295L) | (j << 32);
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
                NotificationCenter.getInstance(starsController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
                NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                this.applied = false;
                if (this.messageObject.ensurePaidReactionsExist(true)) {
                    this.not_added--;
                }
                NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
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
                NotificationCenter.getInstance(starsController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                this.not_added = 0L;
                NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
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
                NotificationCenter.getInstance(starsController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
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
            NotificationCenter.getInstance(starsController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
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
                NotificationCenter.getInstance(starsController2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
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
                        this.f$0.lambda$commit$0(j);
                    }
                }, 0L).show();
                return;
            }
            this.committed = true;
            TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
            tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.message.did);
            tL_messages_sendPaidReaction.msg_id = this.message.mid;
            tL_messages_sendPaidReaction.random_id = this.random_id;
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
                    this.f$0.lambda$commit$4(messagesController, j, tLObject, tL_error);
                }
            });
        }

        public void lambda$commit$0(long j) {
            StarsController.this.sendPaidReaction(this.messageObject, this.chatActivity, j, true, true, this.peer);
        }

        public void lambda$commit$4(final MessagesController messagesController, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$commit$3(tLObject, messagesController, tL_error, j);
                }
            });
        }

        public void lambda$commit$3(final TLObject tLObject, final MessagesController messagesController, TLRPC.TL_error tL_error, final long j) {
            String forcedFirstName;
            if (tLObject != null) {
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.PendingPaidReactions.lambda$commit$1(messagesController, tLObject);
                    }
                });
                return;
            }
            if (tL_error != null) {
                this.messageObject.addPaidReactions((int) (-this.amount), this.wasChosen, getPeerId());
                NotificationCenter.getInstance(StarsController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.messageObject.getDialogId()), Integer.valueOf(this.messageObject.getId()), this.messageObject.messageOwner.reactions);
                if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
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
                            this.f$0.lambda$commit$2(j);
                        }
                    }, 0L).show();
                }
                StarsController.this.invalidateTransactions(false);
                StarsController.this.invalidateBalance();
            }
        }

        public static void lambda$commit$1(MessagesController messagesController, TLObject tLObject) {
            messagesController.processUpdates((TLRPC.Updates) tLObject, false);
        }

        public void lambda$commit$2(long j) {
            StarsController.this.sendPaidReaction(this.messageObject, this.chatActivity, j, true, true, this.peer);
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
        Context context;
        boolean z3;
        String forcedFirstName;
        String str;
        String forcedFirstName2;
        MessageId messageIdFrom = MessageId.from(messageObject);
        StarsController starsController = getInstance(this.currentAccount);
        Context context2 = getContext(chatActivity);
        if (context2 == null) {
            return null;
        }
        String str2 = "";
        if (z2 && starsController.balanceAvailable() && starsController.getBalance(false) <= 0) {
            long dialogId = chatActivity.getDialogId();
            if (dialogId >= 0) {
                forcedFirstName2 = UserObject.getForcedFirstName(chatActivity.getMessagesController().getUser(Long.valueOf(dialogId)));
            } else {
                TLRPC.Chat chat = chatActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (chat != null) {
                    forcedFirstName2 = chat.title;
                }
                new StarsIntroActivity.StarsNeededSheet(context2, chatActivity.getResourceProvider(), j, 5, str2, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$sendPaidReaction$98(messageObject, chatActivity, j, l);
                    }
                }, 0L).show();
                return null;
            }
            str2 = forcedFirstName2;
            new StarsIntroActivity.StarsNeededSheet(context2, chatActivity.getResourceProvider(), j, 5, str2, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$sendPaidReaction$98(messageObject, chatActivity, j, l);
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
            context = context2;
            z3 = false;
            PendingPaidReactions pendingPaidReactions3 = new PendingPaidReactions(messageIdFrom, messageObject, chatActivity, ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), z);
            this.currentPendingReactions = pendingPaidReactions3;
            pendingPaidReactions3.peer = l;
        } else {
            context = context2;
            z3 = false;
        }
        if (this.currentPendingReactions.amount + j > MessagesController.getInstance(this.currentAccount).starsPaidReactionAmountMax) {
            this.currentPendingReactions.close();
            this.currentPendingReactions = new PendingPaidReactions(messageIdFrom, messageObject, chatActivity, ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), z);
        }
        final long j2 = this.currentPendingReactions.amount + j;
        if (z2 && starsController.balanceAvailable() && starsController.getBalance(z3) < j2) {
            this.currentPendingReactions.cancel();
            long dialogId2 = chatActivity.getDialogId();
            if (dialogId2 >= 0) {
                forcedFirstName = UserObject.getForcedFirstName(chatActivity.getMessagesController().getUser(Long.valueOf(dialogId2)));
            } else {
                TLRPC.Chat chat2 = chatActivity.getMessagesController().getChat(Long.valueOf(-dialogId2));
                if (chat2 != null) {
                    forcedFirstName = chat2.title;
                } else {
                    str = "";
                    new StarsIntroActivity.StarsNeededSheet(context, chatActivity.getResourceProvider(), j2, 5, str, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$sendPaidReaction$99(messageObject, chatActivity, j2, l);
                        }
                    }, 0L).show();
                    return null;
                }
            }
            str = forcedFirstName;
            new StarsIntroActivity.StarsNeededSheet(context, chatActivity.getResourceProvider(), j2, 5, str, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$sendPaidReaction$99(messageObject, chatActivity, j2, l);
                }
            }, 0L).show();
            return null;
        }
        this.currentPendingReactions.add(j, !(messageObject == null || messageObject.doesPaidReactionExist()) || z);
        PendingPaidReactions pendingPaidReactions4 = this.currentPendingReactions;
        pendingPaidReactions4.peer = l;
        return pendingPaidReactions4;
    }

    public void lambda$sendPaidReaction$98(MessageObject messageObject, ChatActivity chatActivity, long j, Long l) {
        sendPaidReaction(messageObject, chatActivity, j, true, true, l);
    }

    public void lambda$sendPaidReaction$99(MessageObject messageObject, ChatActivity chatActivity, long j, Long l) {
        sendPaidReaction(messageObject, chatActivity, j, true, true, l);
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
                        this.f$0.lambda$loadStarGifts$103((ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                    }
                });
            } else {
                getStarGiftsRemote(this.giftsHash, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$loadStarGifts$107((TL_stars.StarGifts) obj);
                    }
                });
            }
        }
    }

    public void lambda$loadStarGifts$103(ArrayList arrayList, Integer num, Long l, ArrayList arrayList2, ArrayList arrayList3) {
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList2, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList3, true);
        this.giftsCacheLoaded = true;
        this.gifts.clear();
        this.gifts.addAll(arrayList);
        this.birthdaySortedGifts.clear();
        this.birthdaySortedGifts.addAll(this.gifts);
        Collections.sort(this.birthdaySortedGifts, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ToIntFunction() {
            @Override
            public final int applyAsInt(Object obj) {
                return StarsController.lambda$loadStarGifts$100((TL_stars.StarGift) obj);
            }
        }), new ToIntFunction() {
            @Override
            public final int applyAsInt(Object obj) {
                return StarsController.lambda$loadStarGifts$101((TL_stars.StarGift) obj);
            }
        }));
        this.sortedGifts.clear();
        this.sortedGifts.addAll(this.gifts);
        Collections.sort(this.sortedGifts, Comparator$CC.comparingInt(new ToIntFunction() {
            @Override
            public final int applyAsInt(Object obj) {
                return StarsController.lambda$loadStarGifts$102((TL_stars.StarGift) obj);
            }
        }));
        this.giftsHash = num.intValue();
        this.giftsRemoteTime = l.longValue();
        this.giftsLoading = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        loadStarGifts();
    }

    public static int lambda$loadStarGifts$100(TL_stars.StarGift starGift) {
        return starGift.sold_out ? 1 : 0;
    }

    public static int lambda$loadStarGifts$101(TL_stars.StarGift starGift) {
        return starGift.birthday ? -1 : 0;
    }

    public static int lambda$loadStarGifts$102(TL_stars.StarGift starGift) {
        return starGift.sold_out ? 1 : 0;
    }

    public void lambda$loadStarGifts$107(TL_stars.StarGifts starGifts) {
        this.giftsLoading = false;
        this.giftsLoaded = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_starGifts.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_starGifts.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
            this.gifts.clear();
            this.gifts.addAll(tL_starGifts.gifts);
            this.birthdaySortedGifts.clear();
            this.birthdaySortedGifts.addAll(this.gifts);
            Collections.sort(this.birthdaySortedGifts, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return StarsController.lambda$loadStarGifts$104((TL_stars.StarGift) obj);
                }
            }), new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return StarsController.lambda$loadStarGifts$105((TL_stars.StarGift) obj);
                }
            }));
            this.sortedGifts.clear();
            this.sortedGifts.addAll(this.gifts);
            Collections.sort(this.sortedGifts, Comparator$CC.comparingInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return StarsController.lambda$loadStarGifts$106((TL_stars.StarGift) obj);
                }
            }));
            this.giftsHash = tL_starGifts.hash;
            this.giftsRemoteTime = System.currentTimeMillis();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
            saveStarGiftsCached(tL_starGifts.gifts, this.giftsHash, this.giftsRemoteTime);
            return;
        }
        if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            ArrayList arrayList = this.gifts;
            int i = this.giftsHash;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.giftsRemoteTime = jCurrentTimeMillis;
            saveStarGiftsCached(arrayList, i, jCurrentTimeMillis);
        }
    }

    public static int lambda$loadStarGifts$104(TL_stars.StarGift starGift) {
        return starGift.sold_out ? 1 : 0;
    }

    public static int lambda$loadStarGifts$105(TL_stars.StarGift starGift) {
        return starGift.birthday ? -1 : 0;
    }

    public static int lambda$loadStarGifts$106(TL_stars.StarGift starGift) {
        return starGift.sold_out ? 1 : 0;
    }

    public void makeStarGiftSoldOut(TL_stars.StarGift starGift) {
        if (starGift == null || !this.giftsLoaded) {
            return;
        }
        starGift.availability_remains = 0;
        saveStarGiftsCached(this.gifts, this.giftsHash, this.giftsRemoteTime);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftSoldOut, starGift);
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
                StarsController.lambda$getStarGiftsCached$109(messagesStorage, arrayList3, arrayList2, arrayList, callback5);
            }
        });
    }

    public static void lambda$getStarGiftsCached$109(org.telegram.messenger.MessagesStorage r18, final java.util.ArrayList r19, final java.util.ArrayList r20, final java.util.ArrayList r21, final org.telegram.messenger.Utilities.Callback5 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarsController.lambda$getStarGiftsCached$109(org.telegram.messenger.MessagesStorage, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, org.telegram.messenger.Utilities$Callback5):void");
    }

    public static void lambda$getStarGiftsCached$108(Utilities.Callback5 callback5, ArrayList arrayList, int i, long j, ArrayList arrayList2, ArrayList arrayList3) {
        callback5.run(arrayList, Integer.valueOf(i), Long.valueOf(j), arrayList2, arrayList3);
    }

    private void saveStarGiftsCached(final ArrayList arrayList, final int i, final long j) {
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$saveStarGiftsCached$110(messagesStorage, arrayList, i, j);
            }
        });
    }

    public static void lambda$saveStarGiftsCached$110(MessagesStorage messagesStorage, ArrayList arrayList, int i, long j) {
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
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
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
                StarsController.lambda$getStarGiftsRemote$112(callback, tLObject, tL_error);
            }
        });
    }

    public static void lambda$getStarGiftsRemote$112(final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$getStarGiftsRemote$111(tLObject, callback);
            }
        });
    }

    public static void lambda$getStarGiftsRemote$111(TLObject tLObject, Utilities.Callback callback) {
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
                this.f$0.lambda$getStarGift$113(zArr, j, notificationCenterDelegateArr, callback, i, i2, objArr);
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
                this.f$0.lambda$getStarGift$114(zArr, notificationCenterDelegateArr);
            }
        };
    }

    public void lambda$getStarGift$113(boolean[] zArr, long j, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, Utilities.Callback callback, int i, int i2, Object[] objArr) {
        int i3;
        TL_stars.StarGift starGift;
        if (zArr[0] || i != (i3 = NotificationCenter.starGiftsLoaded) || (starGift = getStarGift(j)) == null) {
            return;
        }
        zArr[0] = true;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(notificationCenterDelegateArr[0], i3);
        callback.run(starGift);
    }

    public void lambda$getStarGift$114(boolean[] zArr, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        zArr[0] = true;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(notificationCenterDelegateArr[0], NotificationCenter.starGiftsLoaded);
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
                        this.f$0.lambda$buyPremiumGift$115(callback2, j, obj, tL_textWithEntities);
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
                    this.f$0.lambda$buyPremiumGift$122(callback2, tL_inputInvoicePremiumGiftStars, context2, resourceProvider, name, j, obj, tL_textWithEntities, tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$buyPremiumGift$115(Utilities.Callback2 callback2, long j, Object obj, TLRPC.TL_textWithEntities tL_textWithEntities) {
        if (!balanceAvailable()) {
            bulletinError("NO_BALANCE");
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, null);
                return;
            }
            return;
        }
        buyPremiumGift(j, obj, tL_textWithEntities, callback2);
    }

    public void lambda$buyPremiumGift$122(final Utilities.Callback2 callback2, final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars, final Context context, final Theme.ResourcesProvider resourcesProvider, final String str, final long j, final Object obj, final TLRPC.TL_textWithEntities tL_textWithEntities, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buyPremiumGift$121(tLObject, tL_error, callback2, tL_inputInvoicePremiumGiftStars, context, resourcesProvider, str, j, obj, tL_textWithEntities);
            }
        });
    }

    public void lambda$buyPremiumGift$121(TLObject tLObject, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars, final Context context, final Theme.ResourcesProvider resourcesProvider, final String str, final long j, final Object obj, final TLRPC.TL_textWithEntities tL_textWithEntities) {
        if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStars)) {
            bulletinError(tL_error, "NO_PAYMENT_FORM");
            callback2.run(Boolean.FALSE, null);
            return;
        }
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars;
        Iterator<TLRPC.TL_labeledPrice> it = tL_payments_paymentFormStars.invoice.prices.iterator();
        final long j2 = 0;
        while (it.hasNext()) {
            j2 += it.next().amount;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                this.f$0.lambda$buyPremiumGift$120(callback2, context, resourcesProvider, j2, str, j, obj, tL_textWithEntities, tLObject2, tL_error2);
            }
        });
    }

    public void lambda$buyPremiumGift$120(final Utilities.Callback2 callback2, final Context context, final Theme.ResourcesProvider resourcesProvider, final long j, final String str, final long j2, final Object obj, final TLRPC.TL_textWithEntities tL_textWithEntities, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buyPremiumGift$119(tLObject, tL_error, callback2, context, resourcesProvider, j, str, j2, obj, tL_textWithEntities);
            }
        });
    }

    public void lambda$buyPremiumGift$119(TLObject tLObject, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, final long j2, final Object obj, final TLRPC.TL_textWithEntities tL_textWithEntities) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactoryGlobal = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
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
                            this.f$0.lambda$buyPremiumGift$116(zArr, j2, obj, tL_textWithEntities, callback2);
                        }
                    }, 0L);
                    starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            StarsController.lambda$buyPremiumGift$117(callback2, zArr, dialogInterface);
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
            public final void run() {
                this.f$0.lambda$buyPremiumGift$118(tL_payments_paymentResult);
            }
        });
        invalidateTransactions(true);
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, null);
        }
        if (BirthdayController.getInstance(this.currentAccount).contains(j2)) {
            MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j2, false).apply();
        }
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putBoolean("show_gift_for_" + j2, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j2, true).apply();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity == null || launchActivity.getFireworksOverlay() == null) {
            return;
        }
        LaunchActivity.instance.getFireworksOverlay().start(true);
    }

    public void lambda$buyPremiumGift$116(boolean[] zArr, long j, Object obj, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        zArr[0] = true;
        buyPremiumGift(j, obj, tL_textWithEntities, callback2);
    }

    public static void lambda$buyPremiumGift$117(Utilities.Callback2 callback2, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback2 == null || zArr[0]) {
            return;
        }
        callback2.run(Boolean.FALSE, null);
    }

    public void lambda$buyPremiumGift$118(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
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
                    this.f$0.lambda$buyStarGift$123(callback2, starGift, z, z2, j, tL_textWithEntities);
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
                this.f$0.lambda$buyStarGift$133(callback2, tL_inputInvoiceStarGift, context2, resourceProvider, name, starGift, z, z2, j, tL_textWithEntities, tLObject, tL_error);
            }
        });
    }

    public void lambda$buyStarGift$123(Utilities.Callback2 callback2, TL_stars.StarGift starGift, boolean z, boolean z2, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        if (!balanceAvailable()) {
            bulletinError("NO_BALANCE");
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, null);
                return;
            }
            return;
        }
        buyStarGift(starGift, z, z2, j, tL_textWithEntities, callback2);
    }

    public void lambda$buyStarGift$133(final Utilities.Callback2 callback2, final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift, final Context context, final Theme.ResourcesProvider resourcesProvider, final String str, final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buyStarGift$132(tLObject, tL_error, callback2, tL_inputInvoiceStarGift, context, resourcesProvider, str, starGift, z, z2, j, tL_textWithEntities);
            }
        });
    }

    public void lambda$buyStarGift$132(TLObject tLObject, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift, final Context context, final Theme.ResourcesProvider resourcesProvider, final String str, final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities) {
        if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStarGift)) {
            bulletinError(tL_error, "NO_PAYMENT_FORM");
            callback2.run(Boolean.FALSE, null);
            return;
        }
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift;
        Iterator<TLRPC.TL_labeledPrice> it = tL_payments_paymentFormStarGift.invoice.prices.iterator();
        final long j2 = 0;
        while (it.hasNext()) {
            j2 += it.next().amount;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                this.f$0.lambda$buyStarGift$131(callback2, context, resourcesProvider, j2, str, starGift, z, z2, j, tL_textWithEntities, tLObject2, tL_error2);
            }
        });
    }

    public void lambda$buyStarGift$131(final Utilities.Callback2 callback2, final Context context, final Theme.ResourcesProvider resourcesProvider, final long j, final String str, final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j2, final TLRPC.TL_textWithEntities tL_textWithEntities, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buyStarGift$130(tLObject, tL_error, callback2, context, resourcesProvider, j, str, starGift, z, z2, j2, tL_textWithEntities);
            }
        });
    }

    public void lambda$buyStarGift$130(org.telegram.tgnet.TLObject r18, org.telegram.tgnet.TLRPC.TL_error r19, final org.telegram.messenger.Utilities.Callback2 r20, android.content.Context r21, org.telegram.ui.ActionBar.Theme.ResourcesProvider r22, final long r23, final java.lang.String r25, final org.telegram.tgnet.tl.TL_stars.StarGift r26, final boolean r27, final boolean r28, final long r29, final org.telegram.tgnet.TLRPC.TL_textWithEntities r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarsController.lambda$buyStarGift$130(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error, org.telegram.messenger.Utilities$Callback2, android.content.Context, org.telegram.ui.ActionBar.Theme$ResourcesProvider, long, java.lang.String, org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, long, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public void lambda$buyStarGift$124(boolean[] zArr, TL_stars.StarGift starGift, boolean z, boolean z2, long j, TLRPC.TL_textWithEntities tL_textWithEntities, Utilities.Callback2 callback2) {
        zArr[0] = true;
        buyStarGift(starGift, z, z2, j, tL_textWithEntities, callback2);
    }

    public static void lambda$buyStarGift$125(Utilities.Callback2 callback2, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback2 == null || zArr[0]) {
            return;
        }
        callback2.run(Boolean.FALSE, null);
    }

    public void lambda$buyStarGift$126(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    public static void lambda$buyStarGift$128(final ProfileActivity profileActivity, TL_stars.StarGift starGift, CharSequence charSequence, long j, String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyStarGift$127(profileActivity);
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

    public static void lambda$buyStarGift$127(ProfileActivity profileActivity) {
        SharedMediaLayout sharedMediaLayout = profileActivity.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.scrollToPage(14);
            profileActivity.scrollToSharedMedia();
        }
    }

    public static void lambda$buyStarGift$129(ChatActivity chatActivity, TL_stars.StarGift starGift, CharSequence charSequence, long j) {
        BulletinFactory bulletinFactoryOf = BulletinFactory.of(chatActivity);
        TLRPC.Document document = starGift.sticker;
        String string = LocaleController.getString(R.string.StarsGiftCompleted);
        if (charSequence == null) {
            charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j, new Object[0]));
        }
        bulletinFactoryOf.createEmojiBulletin(document, string, charSequence).show(true);
    }

    public void getResellingGiftForm(final TL_stars.StarGift starGift, final long j, final Utilities.Callback callback) {
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
                    this.f$0.lambda$getResellingGiftForm$134(callback, starGift, j);
                }
            });
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_inputInvoiceStarGiftResale.ton = this.ton;
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
                this.f$0.lambda$getResellingGiftForm$136(callback, tLObject, tL_error);
            }
        });
    }

    public void lambda$getResellingGiftForm$134(Utilities.Callback callback, TL_stars.StarGift starGift, long j) {
        if (!balanceAvailable()) {
            bulletinError("NO_BALANCE");
            if (callback != null) {
                callback.run(null);
                return;
            }
            return;
        }
        getResellingGiftForm(starGift, j, callback);
    }

    public void lambda$getResellingGiftForm$136(final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getResellingGiftForm$135(tLObject, tL_error, callback);
            }
        });
    }

    public void lambda$getResellingGiftForm$135(TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback callback) {
        if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStarGift)) {
            bulletinError(tL_error, "NO_PAYMENT_FORM");
            callback.run(null);
        } else {
            callback.run((TLRPC.TL_payments_paymentFormStarGift) tLObject);
        }
    }

    public static long getFormStarsPrice(TLRPC.PaymentForm paymentForm) {
        long j = 0;
        if (paymentForm != null) {
            Iterator<TLRPC.TL_labeledPrice> it = paymentForm.invoice.prices.iterator();
            while (it.hasNext()) {
                j += it.next().amount;
            }
        }
        return j;
    }

    public void buyResellingGift(final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j, final Utilities.Callback2 callback2) {
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
                    this.f$0.lambda$buyResellingGift$137(callback2, tL_payments_paymentFormStarGift, starGift, j);
                }
            });
            return;
        }
        final String name = DialogObject.getName(this.currentAccount, j);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_inputInvoiceStarGiftResale.ton = this.ton;
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
        Iterator<TLRPC.TL_labeledPrice> it = tL_payments_paymentFormStarGift.invoice.prices.iterator();
        final long j2 = 0;
        while (it.hasNext()) {
            j2 += it.next().amount;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$buyResellingGift$142(callback2, context2, resourceProvider, j2, name, tL_payments_paymentFormStarGift, starGift, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$buyResellingGift$137(Utilities.Callback2 callback2, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j) {
        if (!balanceAvailable()) {
            bulletinError("NO_BALANCE");
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, null);
                return;
            }
            return;
        }
        buyResellingGift(tL_payments_paymentFormStarGift, starGift, j, callback2);
    }

    public void lambda$buyResellingGift$142(final Utilities.Callback2 callback2, final Context context, final Theme.ResourcesProvider resourcesProvider, final long j, final String str, final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buyResellingGift$141(tLObject, tL_error, callback2, context, resourcesProvider, j, str, tL_payments_paymentFormStarGift, starGift, j2);
            }
        });
    }

    public void lambda$buyResellingGift$141(TLObject tLObject, TLRPC.TL_error tL_error, final Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j2) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactoryGlobal = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
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
                            this.f$0.lambda$buyResellingGift$138(zArr, tL_payments_paymentFormStarGift, starGift, j2, callback2);
                        }
                    }, 0L);
                    starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            StarsController.lambda$buyResellingGift$139(callback2, zArr, dialogInterface);
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
            public final void run() {
                this.f$0.lambda$buyResellingGift$140(tL_payments_paymentResult);
            }
        });
        invalidateStarGifts();
        invalidateProfileGifts(j2);
        invalidateTransactions(true);
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, null);
        }
        if (BirthdayController.getInstance(this.currentAccount).contains(j2)) {
            MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j2, false).apply();
        }
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putBoolean("show_gift_for_" + j2, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j2, true).apply();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity == null || launchActivity.getFireworksOverlay() == null) {
            return;
        }
        LaunchActivity.instance.getFireworksOverlay().start(true);
    }

    public void lambda$buyResellingGift$138(boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j, Utilities.Callback2 callback2) {
        zArr[0] = true;
        buyResellingGift(tL_payments_paymentFormStarGift, starGift, j, callback2);
    }

    public static void lambda$buyResellingGift$139(Utilities.Callback2 callback2, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback2 == null || zArr[0]) {
            return;
        }
        callback2.run(Boolean.FALSE, null);
    }

    public void lambda$buyResellingGift$140(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
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
            Iterator it = arrayList.iterator();
            long jCalcHash = 0;
            while (it.hasNext()) {
                jCalcHash = MediaDataController.calcHash(jCalcHash, ((TL_stars.TL_starGiftCollection) it.next()).hash);
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
                    this.f$0.lambda$load$1(tLObject, tL_error);
                }
            });
        }

        public void lambda$load$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$load$0(tLObject);
                }
            });
        }

        public void lambda$load$0(TLObject tLObject) {
            if (tLObject instanceof TL_stars.TL_starGiftCollections) {
                this.collections.clear();
                this.collections.addAll(((TL_stars.TL_starGiftCollections) tLObject).collections);
                refilterCollections();
                Iterator it = this.collections.iterator();
                while (it.hasNext()) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) it.next();
                    if (getListById(tL_starGiftCollection.collection_id) == null) {
                        GiftsList giftsList = new GiftsList(this.currentAccount, this.dialogId, false);
                        giftsList.setCollectionId(tL_starGiftCollection.collection_id);
                        this.gifts.put(Integer.valueOf(tL_starGiftCollection.collection_id), giftsList);
                    }
                }
                this.loaded = true;
                this.loading = false;
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.dialogId), this);
                return;
            }
            if (tLObject instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                refilterCollections();
                this.loaded = true;
                this.loading = false;
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.dialogId), this);
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
                    this.f$0.lambda$createCollection$3(tL_starGiftCollection, giftsList, callback, tLObject, tL_error);
                }
            });
        }

        public void lambda$createCollection$3(final TL_stars.TL_starGiftCollection tL_starGiftCollection, final GiftsList giftsList, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createCollection$2(tLObject, tL_starGiftCollection, giftsList, callback, tL_error);
                }
            });
        }

        public void lambda$createCollection$2(TLObject tLObject, TL_stars.TL_starGiftCollection tL_starGiftCollection, GiftsList giftsList, Utilities.Callback callback, TLRPC.TL_error tL_error) {
            BaseFragment safeLastFragment;
            this.creating = false;
            if (tLObject instanceof TL_stars.TL_starGiftCollection) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject;
                this.collections.remove(tL_starGiftCollection);
                this.collections.add(tL_starGiftCollection2);
                this.gifts.remove(-1);
                int i = tL_starGiftCollection2.collection_id;
                giftsList.collectionId = i;
                this.gifts.put(Integer.valueOf(i), giftsList);
                refilterCollections();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.dialogId), this);
                if (callback != null) {
                    callback.run(tL_starGiftCollection2);
                    return;
                }
                return;
            }
            if (tL_error != null && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null) {
                BulletinFactory.of(safeLastFragment).showForError(tL_error);
            }
            this.collections.remove(tL_starGiftCollection);
            this.gifts.remove(-1);
            refilterCollections();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.dialogId), this);
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
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.dialogId), this);
        }

        public void rename(int i, String str) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            updatestargiftcollection.collection_id = i;
            updatestargiftcollection.flags |= 1;
            updatestargiftcollection.title = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftcollection, null);
        }

        public void addGift(int i, TL_stars.SavedStarGift savedStarGift, boolean z) throws IOException {
            ArrayList arrayList = new ArrayList();
            arrayList.add(savedStarGift);
            addGifts(i, arrayList, z);
        }

        public void addGifts(int i, ArrayList arrayList, boolean z) throws IOException {
            if (arrayList.isEmpty()) {
                return;
            }
            GiftsList listById = getListById(i);
            if (listById != null && z) {
                listById.gifts.addAll(0, arrayList);
                listById.totalCount += arrayList.size();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), listById);
                updateIcon(i);
            }
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            updatestargiftcollection.collection_id = i;
            updatestargiftcollection.flags |= 4;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) it.next();
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
                    this.f$0.lambda$addGifts$5(tLObject, tL_error);
                }
            });
        }

        public void lambda$addGifts$5(final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$addGifts$4(tLObject);
                }
            });
        }

        public void lambda$addGifts$4(TLObject tLObject) {
            if (tLObject instanceof TL_stars.TL_starGiftCollection) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) tLObject;
                int iIndexOf = indexOf(tL_starGiftCollection.collection_id);
                if (iIndexOf >= 0) {
                    this.collections.set(iIndexOf, tL_starGiftCollection);
                }
            }
        }

        public void removeGift(int i, TL_stars.SavedStarGift savedStarGift) throws IOException {
            ArrayList arrayList = new ArrayList();
            arrayList.add(savedStarGift);
            removeGifts(i, arrayList);
        }

        public void removeGifts(int i, ArrayList arrayList) throws IOException {
            if (arrayList.isEmpty()) {
                return;
            }
            GiftsList listById = getListById(i);
            if (listById != null && !listById.gifts.isEmpty()) {
                int i2 = 0;
                while (i2 < listById.gifts.size()) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) listById.gifts.get(i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        if (StarsController.eq(savedStarGift, (TL_stars.SavedStarGift) arrayList.get(i3))) {
                            listById.gifts.remove(i2);
                            listById.totalCount = Math.max(0, listById.totalCount - 1);
                            i2--;
                            break;
                        }
                        i3++;
                    }
                    i2++;
                }
            }
            updateIcon(i);
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            updatestargiftcollection.collection_id = i;
            updatestargiftcollection.flags |= 2;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) it.next();
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
                    this.f$0.lambda$removeGifts$7(tLObject, tL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), listById);
        }

        public void lambda$removeGifts$7(final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$removeGifts$6(tLObject);
                }
            });
        }

        public void lambda$removeGifts$6(TLObject tLObject) {
            if (tLObject instanceof TL_stars.TL_starGiftCollection) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) tLObject;
                int iIndexOf = indexOf(tL_starGiftCollection.collection_id);
                if (iIndexOf >= 0) {
                    this.collections.set(iIndexOf, tL_starGiftCollection);
                }
            }
        }

        public void reorder(ArrayList arrayList) {
            HashMap map = new HashMap();
            Iterator it = this.collections.iterator();
            while (it.hasNext()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) it.next();
                map.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                num.intValue();
                TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) map.get(num);
                if (tL_starGiftCollection2 != null) {
                    arrayList2.add(tL_starGiftCollection2);
                }
            }
            this.collections.clear();
            this.collections.addAll(arrayList2);
            refilterCollections();
        }

        public void sendOrder() {
            TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
            reorderstargiftcollections.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            Iterator it = this.collections.iterator();
            while (it.hasNext()) {
                reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) it.next()).collection_id));
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

        private int getMask(int i) {
            if ((i & 15) != 0) {
                return 15;
            }
            return (i & 768) != 0 ? 768 : 0;
        }

        public static void lambda$sendPinnedOrder$6(TLObject tLObject, TLRPC.TL_error tL_error) {
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
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
        }

        public void updateGiftsCollections(TL_stars.SavedStarGift savedStarGift, int i, boolean z) {
            Iterator it = this.gifts.iterator();
            while (it.hasNext()) {
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) it.next();
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
            Iterator it = this.gifts.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) it.next();
                if (StarsController.eq(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z) {
                    savedStarGift2.unsaved = z;
                    z2 = true;
                }
            }
            if (z2) {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
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
            int flag = TLObject.setFlag(this.includeFlags & mask, i, !TLObject.hasFlag(r1, i));
            if (flag == 0) {
                flag = mask & (~i);
            }
            int i2 = this.includeFlags;
            int i3 = ((~mask) & i2) | flag;
            if (i2 != i3) {
                this.includeFlags = i3;
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
            TL_stars.getSavedStarGifts getsavedstargifts;
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
                getsavedstargifts = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
                getsavedstargifts2.sort_by_value = !this.sort_by_date;
                getsavedstargifts2.exclude_unupgradable = !isInclude_limited();
                getsavedstargifts2.exclude_upgradable = !isInclude_upgradable();
                getsavedstargifts2.exclude_unlimited = !isInclude_unlimited();
                getsavedstargifts2.exclude_unique = !isInclude_unique();
                getsavedstargifts2.exclude_saved = !isInclude_displayed();
                getsavedstargifts2.exclude_unsaved = !isInclude_hidden();
                getsavedstargifts2.peer_color_available = this.peer_color_available;
                if (this.dialogId == 0) {
                    getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                }
                getsavedstargifts2.offset = z ? "" : this.lastOffset;
                getsavedstargifts2.limit = z ? Math.max(MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit, 15) : 30;
                getsavedstargifts = getsavedstargifts2;
                if (this.isCollection) {
                    getsavedstargifts2.flags |= 64;
                    getsavedstargifts2.collection_id = this.collectionId;
                    getsavedstargifts = getsavedstargifts2;
                }
            }
            int iSendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getsavedstargifts, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$load$1(iArr, z, tLObject, tL_error);
                }
            });
            this.currentRequestId = iSendRequest;
            final int[] iArr = {iSendRequest};
        }

        public void lambda$load$1(final int[] iArr, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$load$0(iArr, tLObject, z);
                }
            });
        }

        public void lambda$load$0(int[] iArr, TLObject tLObject, boolean z) {
            if (iArr[0] != this.currentRequestId) {
                return;
            }
            this.loading = false;
            this.currentRequestId = -1;
            if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_savedStarGifts.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tL_payments_savedStarGifts.chats, false);
                if (z) {
                    this.gifts.clear();
                }
                this.gifts.addAll(tL_payments_savedStarGifts.gifts);
                this.lastOffset = tL_payments_savedStarGifts.next_offset;
                this.totalCount = tL_payments_savedStarGifts.count;
                this.chat_notifications_enabled = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                this.endReached = this.gifts.size() > this.totalCount || this.lastOffset == null;
            } else {
                this.endReached = true;
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
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
                Iterator it = arrayList.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) it.next();
                    int i = 0;
                    while (true) {
                        if (i < this.gifts.size()) {
                            TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) this.gifts.get(i)).gift;
                            if (starGift3 != null && starGift3.id == starGift2.id) {
                                this.gifts.remove(i);
                                this.totalCount = Math.max(0, this.totalCount - 1);
                                z = true;
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
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
                        this.f$0.lambda$processCrafting$3(tLObject, tL_error);
                    }
                });
            }
        }

        public void lambda$processCrafting$3(final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processCrafting$2(tLObject);
                }
            });
        }

        public void lambda$processCrafting$2(TLObject tLObject) {
            if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_savedStarGifts.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tL_payments_savedStarGifts.chats, false);
                if (tL_payments_savedStarGifts.gifts.size() > 0) {
                    TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                    int i = 0;
                    while (i < this.gifts.size() && ((TL_stars.SavedStarGift) this.gifts.get(i)).pinned_to_top) {
                        i++;
                    }
                    this.gifts.add(i, savedStarGift);
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
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
                        return StarsController.GiftsList.lambda$setPinned$4((TL_stars.SavedStarGift) obj, (TL_stars.SavedStarGift) obj2);
                    }
                });
            }
            this.gifts.addAll(0, arrayList);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
            sendPinnedOrder();
        }

        public static int lambda$setPinned$4(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
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
                        return StarsController.GiftsList.lambda$togglePinned$5((TL_stars.SavedStarGift) obj, (TL_stars.SavedStarGift) obj2);
                    }
                });
            }
            this.gifts.addAll(0, pinned);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.dialogId), this);
            sendPinnedOrder();
            return z3;
        }

        public static int lambda$togglePinned$5(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
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
            if (this.isCollection) {
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                updatestargiftcollection.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                updatestargiftcollection.collection_id = this.collectionId;
                updatestargiftcollection.flags |= 8;
                Iterator it = this.gifts.iterator();
                while (it.hasNext()) {
                    updatestargiftcollection.order.add(getInput((TL_stars.SavedStarGift) it.next()));
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftcollection, null, 64);
                return;
            }
            TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
            togglestargiftspinnedtotop.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            Iterator it2 = getPinned().iterator();
            while (it2.hasNext()) {
                togglestargiftspinnedtotop.stargift.add(getInput((TL_stars.SavedStarGift) it2.next()));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(togglestargiftspinnedtotop, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarsController.GiftsList.lambda$sendPinnedOrder$6(tLObject, tL_error);
                }
            }, 64);
        }

        public boolean contains(TL_stars.SavedStarGift savedStarGift) {
            Iterator it = this.gifts.iterator();
            while (it.hasNext()) {
                if (StarsController.eq((TL_stars.SavedStarGift) it.next(), savedStarGift)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean eq(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i = savedStarGift.flags;
        return (((i & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) && ((i & 8) == 0 || (savedStarGift2.flags & 8) == 0 || savedStarGift.msg_id != savedStarGift2.msg_id)) ? false : true;
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
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) it.next();
            if (cls.isInstance(starGiftAttribute)) {
                return (TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute);
            }
        }
        return null;
    }

    public static ArrayList findAttributes(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) it.next();
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
                this.f$0.lambda$getStarGiftPreview$144(j, callback, tLObject, tL_error);
            }
        });
    }

    public void lambda$getStarGiftPreview$144(final long j, final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getStarGiftPreview$143(tLObject, j, callback);
            }
        });
    }

    public void lambda$getStarGiftPreview$143(TLObject tLObject, long j, Utilities.Callback callback) {
        if (tLObject instanceof TL_stars.starGiftUpgradePreview) {
            TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
            this.giftPreviews.put(Long.valueOf(j), stargiftupgradepreview);
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
                this.f$0.lambda$getUserStarGift$146(alertDialog, inputSavedStarGift, callback, tLObject, tL_error);
            }
        });
    }

    public void lambda$getUserStarGift$146(final AlertDialog alertDialog, final TL_stars.InputSavedStarGift inputSavedStarGift, final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getUserStarGift$145(alertDialog, tLObject, inputSavedStarGift, callback);
            }
        });
    }

    public void lambda$getUserStarGift$145(AlertDialog alertDialog, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        TL_stars.SavedStarGift savedStarGift;
        alertDialog.dismiss();
        if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
            TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_savedStarGifts.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_payments_savedStarGifts.chats, false);
            for (int i = 0; i < tL_payments_savedStarGifts.gifts.size(); i++) {
                savedStarGift = tL_payments_savedStarGifts.gifts.get(i);
                if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift.saved_id)) {
                    break;
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
                StarsController.lambda$getPaidRevenue$148(callback, tLObject, tL_error);
            }
        });
    }

    public static void lambda$getPaidRevenue$148(final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$getPaidRevenue$147(tLObject, callback);
            }
        });
    }

    public static void lambda$getPaidRevenue$147(TLObject tLObject, Utilities.Callback callback) {
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
                this.f$0.lambda$stopPaidMessages$150(j2, j, z2, tLObject, tL_error);
            }
        });
    }

    public void lambda$stopPaidMessages$150(final long j, final long j2, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$stopPaidMessages$149(tLObject, j, j2, z);
            }
        });
    }

    public void lambda$stopPaidMessages$149(TLObject tLObject, long j, long j2, boolean z) {
        TLRPC.PeerSettings peerSettings;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            if (j != 0) {
                processUpdateMonoForumNoPaidException(-j, j2, z);
                return;
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j2);
            if (userFull != null && (peerSettings = userFull.settings) != null) {
                peerSettings.flags &= -16385;
                peerSettings.charge_paid_message_stars = 0L;
            }
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putLong("dialog_bar_paying_" + j2, 0L).apply();
            MessagesController.getInstance(this.currentAccount).loadPeerSettings(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j2)), MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j2)), true);
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings(true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j2));
        }
    }

    public void processUpdateMonoForumNoPaidException(long j, long j2, boolean z) {
        TopicsController topicsController = MessagesController.getInstance(this.currentAccount).getTopicsController();
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsController.findTopic(j, j2);
        if (tL_forumTopicFindTopic != null) {
            tL_forumTopicFindTopic.nopaid_messages_exception = z;
            topicsController.saveTopics(j);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j2));
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
            Iterator it = this.totalSendListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (this.bulletinButton != null) {
                this.bulletin.hide();
            }
        }
    }

    public void showPaidMessageToast(long r10, org.telegram.messenger.MessageObject r12, long r13, org.telegram.messenger.Utilities.Callback r15, java.lang.Runnable r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.StarsController.showPaidMessageToast(long, org.telegram.messenger.MessageObject, long, org.telegram.messenger.Utilities$Callback, java.lang.Runnable, boolean):void");
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
        if (j <= 0) {
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
                this.f$0.lambda$beforeSendingMessage$151(zNeedsUndoButton, (HashSet) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$beforeSendingMessage$152(zNeedsUndoButton, id);
            }
        }, zNeedsUndoButton);
    }

    public void lambda$beforeSendingMessage$151(boolean z, HashSet hashSet) {
        if (z) {
            SendMessagesHelper.getInstance(this.currentAccount).cancelSendingMessage(new ArrayList<>(hashSet));
        }
    }

    public void lambda$beforeSendingMessage$152(boolean z, int i) {
        if (z) {
            this.sendingPaidMessagesIds.remove(Integer.valueOf(i));
            Runnable runnable = (Runnable) this.postponedPaidMessages.remove(Integer.valueOf(i));
            if (runnable != null) {
                runnable.run();
            }
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
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            int id = ((MessageObject) it.next()).getId();
            hashSet.add(Integer.valueOf(id));
            if (this.sendingPaidMessagesIds.remove(Integer.valueOf(id))) {
                this.postponedPaidMessages.put(Integer.valueOf(id), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$beforeSendingFinalRequest$153(hashSet, runnable);
                    }
                });
                z = true;
            }
        }
        return !z;
    }

    public void lambda$beforeSendingFinalRequest$153(HashSet hashSet, Runnable runnable) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            this.sendingPaidMessagesIds.remove(num);
            this.postponedPaidMessages.remove(num);
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
            return ((TLRPC.TL_messages_forwardMessages) tLObject).allow_paid_stars / r4.id.size();
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
