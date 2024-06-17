package org.telegram.ui.Stars;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$InputInvoice;
import org.telegram.tgnet.TLRPC$PaymentForm;
import org.telegram.tgnet.TLRPC$PaymentReceipt;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputInvoiceStars;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentStars;
import org.telegram.tgnet.TLRPC$TL_labeledPrice;
import org.telegram.tgnet.TLRPC$TL_payments_getPaymentForm;
import org.telegram.tgnet.TLRPC$TL_payments_getStarsStatus;
import org.telegram.tgnet.TLRPC$TL_payments_getStarsTransactions;
import org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars;
import org.telegram.tgnet.TLRPC$TL_payments_paymentResult;
import org.telegram.tgnet.TLRPC$TL_payments_sendStarsForm;
import org.telegram.tgnet.TLRPC$TL_payments_starsStatus;
import org.telegram.tgnet.TLRPC$TL_starsTopupOption;
import org.telegram.tgnet.TLRPC$TL_starsTransaction;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.bots.BotWebViewSheet;

public class StarsController {
    private static volatile StarsController[] Instance = new StarsController[4];
    private static final Object[] lockObjects = new Object[4];
    public long balance;
    private boolean balanceLoaded;
    private boolean balanceLoading;
    public final int currentAccount;
    private long lastBalanceLoaded;
    private ArrayList<TLRPC$TL_starsTopupOption> options;
    private boolean optionsLoaded;
    private boolean optionsLoading;
    private boolean paymentFormOpened;
    public final ArrayList<TLRPC$TL_starsTransaction>[] transactions = {new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
    public final boolean[] transactionsExist = new boolean[3];
    private final String[] offset = new String[3];
    private final boolean[] loading = new boolean[3];
    private final boolean[] endReached = new boolean[3];

    private static boolean isCollapsed(long j) {
        return (j == 15 || j == 75 || j == 250 || j == 500 || j == 1000 || j == 2500) ? false : true;
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static StarsController getInstance(int i) {
        StarsController starsController = Instance[i];
        if (starsController == null) {
            synchronized (lockObjects[i]) {
                starsController = Instance[i];
                if (starsController == null) {
                    StarsController[] starsControllerArr = Instance;
                    StarsController starsController2 = new StarsController(i);
                    starsControllerArr[i] = starsController2;
                    starsController = starsController2;
                }
            }
        }
        return starsController;
    }

    private StarsController(int i) {
        this.currentAccount = i;
    }

    public long getBalance() {
        return getBalance(null);
    }

    public long getBalance(final Runnable runnable) {
        if ((!this.balanceLoaded || System.currentTimeMillis() - this.lastBalanceLoaded > 60000) && !this.balanceLoading) {
            this.balanceLoading = true;
            TLRPC$TL_payments_getStarsStatus tLRPC$TL_payments_getStarsStatus = new TLRPC$TL_payments_getStarsStatus();
            tLRPC$TL_payments_getStarsStatus.peer = new TLRPC$TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getStarsStatus, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StarsController.this.lambda$getBalance$1(runnable, tLObject, tLRPC$TL_error);
                }
            });
        }
        return this.balance;
    }

    public void lambda$getBalance$1(final Runnable runnable, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getBalance$0(tLObject, runnable);
            }
        });
    }

    public void lambda$getBalance$0(TLObject tLObject, Runnable runnable) {
        boolean z;
        boolean z2 = !this.balanceLoaded;
        this.lastBalanceLoaded = System.currentTimeMillis();
        if (tLObject instanceof TLRPC$TL_payments_starsStatus) {
            TLRPC$TL_payments_starsStatus tLRPC$TL_payments_starsStatus = (TLRPC$TL_payments_starsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_payments_starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_payments_starsStatus.chats, false);
            if (this.transactions[0].isEmpty()) {
                Iterator<TLRPC$TL_starsTransaction> it = tLRPC$TL_payments_starsStatus.history.iterator();
                while (it.hasNext()) {
                    TLRPC$TL_starsTransaction next = it.next();
                    this.transactions[0].add(next);
                    this.transactions[next.stars > 0 ? (char) 1 : (char) 2].add(next);
                }
                for (int i = 0; i < 3; i++) {
                    this.transactionsExist[i] = !this.transactions[i].isEmpty() || this.transactionsExist[i];
                    boolean[] zArr = this.endReached;
                    zArr[i] = (tLRPC$TL_payments_starsStatus.flags & 1) == 0;
                    if (zArr[i]) {
                        this.loading[i] = false;
                    }
                    this.offset[i] = zArr[i] ? null : tLRPC$TL_payments_starsStatus.next_offset;
                }
                z = true;
            } else {
                z = false;
            }
            long j = this.balance;
            long j2 = tLRPC$TL_payments_starsStatus.balance;
            if (j != j2) {
                z2 = true;
            }
            this.balance = j2;
        } else {
            z = false;
        }
        this.balanceLoading = false;
        this.balanceLoaded = true;
        if (z2) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void updateBalance(long j) {
        if (this.balance != j) {
            this.balance = j;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
    }

    public boolean balanceAvailable() {
        return this.balanceLoaded;
    }

    public ArrayList<TLRPC$TL_starsTopupOption> getOptions() {
        if (this.optionsLoading || this.optionsLoaded) {
            return this.options;
        }
        this.optionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                int readInt32 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt32; i2++) {
                    TLRPC$TL_starsTopupOption TLdeserialize = TLRPC$TL_starsTopupOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize == null) {
                        return tLRPC$Vector;
                    }
                    tLRPC$Vector.objects.add(TLdeserialize);
                }
                return tLRPC$Vector;
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-1072773165);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$getOptions$6(tLObject, tLRPC$TL_error);
            }
        });
        return this.options;
    }

    public void lambda$getOptions$6(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getOptions$5(tLObject);
            }
        });
    }

    public void lambda$getOptions$5(TLObject tLObject) {
        ArrayList<TLRPC$TL_starsTopupOption> arrayList = new ArrayList<>();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof TLRPC$Vector) {
            Iterator<Object> it = ((TLRPC$Vector) tLObject).objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof TLRPC$TL_starsTopupOption) {
                    TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption = (TLRPC$TL_starsTopupOption) next;
                    arrayList.add(tLRPC$TL_starsTopupOption);
                    tLRPC$TL_starsTopupOption.collapsed = isCollapsed(tLRPC$TL_starsTopupOption.stars);
                    if (tLRPC$TL_starsTopupOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tLRPC$TL_starsTopupOption);
                        tLRPC$TL_starsTopupOption.loadingStorePrice = true;
                    }
                }
            }
        }
        this.options = arrayList;
        this.optionsLoaded = true;
        this.optionsLoading = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
        if (arrayList2.isEmpty()) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getOptions$4(arrayList2);
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
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TLRPC$TL_starsTopupOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.this.lambda$getOptions$3(arrayList, billingResult, list);
            }
        });
    }

    public void lambda$getOptions$3(final ArrayList arrayList, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getOptions$2(billingResult, list, arrayList);
            }
        });
    }

    public void lambda$getOptions$2(BillingResult billingResult, List list, ArrayList arrayList) {
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (billingResult.getResponseCode() != 0) {
            bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            return;
        }
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ProductDetails productDetails = (ProductDetails) list.get(i);
                TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption = null;
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (((TLRPC$TL_starsTopupOption) arrayList.get(i2)).store_product.equals(productDetails.getProductId())) {
                        tLRPC$TL_starsTopupOption = (TLRPC$TL_starsTopupOption) arrayList.get(i2);
                        break;
                    }
                    i2++;
                }
                if (tLRPC$TL_starsTopupOption != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                    tLRPC$TL_starsTopupOption.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                    double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
                    double pow = Math.pow(10.0d, 6.0d);
                    Double.isNaN(priceAmountMicros);
                    tLRPC$TL_starsTopupOption.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tLRPC$TL_starsTopupOption.currency)));
                    tLRPC$TL_starsTopupOption.loadingStorePrice = false;
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
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
        TLRPC$TL_payments_getStarsTransactions tLRPC$TL_payments_getStarsTransactions = new TLRPC$TL_payments_getStarsTransactions();
        tLRPC$TL_payments_getStarsTransactions.peer = new TLRPC$TL_inputPeerSelf();
        tLRPC$TL_payments_getStarsTransactions.inbound = i == 1;
        tLRPC$TL_payments_getStarsTransactions.outbound = i == 2;
        String str = this.offset[i];
        tLRPC$TL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tLRPC$TL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getStarsTransactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$loadTransactions$8(i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadTransactions$8(final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$loadTransactions$7(i, tLObject);
            }
        });
    }

    public void lambda$loadTransactions$7(int i, TLObject tLObject) {
        this.loading[i] = false;
        if (tLObject instanceof TLRPC$TL_payments_starsStatus) {
            TLRPC$TL_payments_starsStatus tLRPC$TL_payments_starsStatus = (TLRPC$TL_payments_starsStatus) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_payments_starsStatus.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_payments_starsStatus.chats, false);
            this.transactions[i].addAll(tLRPC$TL_payments_starsStatus.history);
            this.transactionsExist[i] = !this.transactions[i].isEmpty() || this.transactionsExist[i];
            boolean[] zArr = this.endReached;
            zArr[i] = (tLRPC$TL_payments_starsStatus.flags & 1) == 0;
            this.offset[i] = zArr[i] ? null : tLRPC$TL_payments_starsStatus.next_offset;
            updateBalance(tLRPC$TL_payments_starsStatus.balance);
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

    public Theme.ResourcesProvider getResourceProvider() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            return lastFragment.getResourceProvider();
        }
        return null;
    }

    public void buy(final Activity activity, final TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption, final Utilities.Callback2<Boolean, String> callback2) {
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
            TLRPC$TL_inputStorePaymentStars tLRPC$TL_inputStorePaymentStars = new TLRPC$TL_inputStorePaymentStars();
            tLRPC$TL_inputStorePaymentStars.stars = tLRPC$TL_starsTopupOption.stars;
            tLRPC$TL_inputStorePaymentStars.currency = tLRPC$TL_starsTopupOption.currency;
            tLRPC$TL_inputStorePaymentStars.amount = tLRPC$TL_starsTopupOption.amount;
            final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars = new TLRPC$TL_inputInvoiceStars();
            tLRPC$TL_inputInvoiceStars.option = tLRPC$TL_starsTopupOption;
            TLRPC$TL_payments_getPaymentForm tLRPC$TL_payments_getPaymentForm = new TLRPC$TL_payments_getPaymentForm();
            JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(getResourceProvider());
            if (makeThemeParams != null) {
                TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
                tLRPC$TL_payments_getPaymentForm.theme_params = tLRPC$TL_dataJSON;
                tLRPC$TL_dataJSON.data = makeThemeParams.toString();
                tLRPC$TL_payments_getPaymentForm.flags |= 1;
            }
            tLRPC$TL_payments_getPaymentForm.invoice = tLRPC$TL_inputInvoiceStars;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StarsController.this.lambda$buy$11(callback2, tLRPC$TL_inputInvoiceStars, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        final TLRPC$TL_inputStorePaymentStars tLRPC$TL_inputStorePaymentStars2 = new TLRPC$TL_inputStorePaymentStars();
        tLRPC$TL_inputStorePaymentStars2.stars = tLRPC$TL_starsTopupOption.stars;
        tLRPC$TL_inputStorePaymentStars2.currency = tLRPC$TL_starsTopupOption.currency;
        tLRPC$TL_inputStorePaymentStars2.amount = tLRPC$TL_starsTopupOption.amount;
        BillingController.getInstance().queryProductDetails(Arrays.asList(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tLRPC$TL_starsTopupOption.store_product).build()), new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.lambda$buy$19(Utilities.Callback2.this, tLRPC$TL_inputStorePaymentStars2, tLRPC$TL_starsTopupOption, activity, billingResult, list);
            }
        });
    }

    public void lambda$buy$11(final Utilities.Callback2 callback2, final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$buy$10(tLRPC$TL_error, callback2, tLObject, tLRPC$TL_inputInvoiceStars);
            }
        });
    }

    public void lambda$buy$10(TLRPC$TL_error tLRPC$TL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars) {
        if (tLRPC$TL_error != null) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, tLRPC$TL_error.text);
                return;
            }
            return;
        }
        PaymentFormActivity paymentFormActivity = null;
        if (tLObject instanceof TLRPC$PaymentForm) {
            TLRPC$PaymentForm tLRPC$PaymentForm = (TLRPC$PaymentForm) tLObject;
            tLRPC$PaymentForm.invoice.recurring = true;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$PaymentForm.users, false);
            paymentFormActivity = new PaymentFormActivity(tLRPC$PaymentForm, tLRPC$TL_inputInvoiceStars, (BaseFragment) null);
        } else if (tLObject instanceof TLRPC$PaymentReceipt) {
            paymentFormActivity = new PaymentFormActivity((TLRPC$PaymentReceipt) tLObject);
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
                StarsController.lambda$buy$9(Utilities.Callback2.this, invoiceStatus);
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

    public static void lambda$buy$9(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
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

    public static void lambda$buy$19(final Utilities.Callback2 callback2, final TLRPC$TL_inputStorePaymentStars tLRPC$TL_inputStorePaymentStars, final TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption, final Activity activity, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$18(list, callback2, tLRPC$TL_inputStorePaymentStars, tLRPC$TL_starsTopupOption, billingResult, activity);
            }
        });
    }

    public static void lambda$buy$18(List list, final Utilities.Callback2 callback2, TLRPC$TL_inputStorePaymentStars tLRPC$TL_inputStorePaymentStars, TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption, final BillingResult billingResult, Activity activity) {
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buy$12(Utilities.Callback2.this);
                }
            });
            return;
        }
        ProductDetails productDetails = (ProductDetails) list.get(0);
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
        if (oneTimePurchaseOfferDetails == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buy$13(Utilities.Callback2.this);
                }
            });
            return;
        }
        tLRPC$TL_inputStorePaymentStars.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        double pow = Math.pow(10.0d, 6.0d);
        Double.isNaN(priceAmountMicros);
        tLRPC$TL_inputStorePaymentStars.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tLRPC$TL_starsTopupOption.currency)));
        BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
            @Override
            public final void accept(Object obj) {
                StarsController.lambda$buy$15(BillingResult.this, callback2, (BillingResult) obj);
            }
        });
        BillingController.getInstance().setOnCanceled(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$17(Utilities.Callback2.this);
            }
        });
        BillingController.getInstance().launchBillingFlow(activity, AccountInstance.getInstance(UserConfig.selectedAccount), tLRPC$TL_inputStorePaymentStars, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) list.get(0)).build()));
    }

    public static void lambda$buy$12(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
    }

    public static void lambda$buy$13(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
    }

    public static void lambda$buy$15(BillingResult billingResult, final Utilities.Callback2 callback2, BillingResult billingResult2) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$14(Utilities.Callback2.this, z, responseCodeString);
            }
        });
    }

    public static void lambda$buy$14(Utilities.Callback2 callback2, boolean z, String str) {
        callback2.run(Boolean.valueOf(z), str);
    }

    public static void lambda$buy$16(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, null);
    }

    public static void lambda$buy$17(final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$16(Utilities.Callback2.this);
            }
        });
    }

    public void openPaymentForm(final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Runnable runnable, final Utilities.Callback<String> callback) {
        String str;
        if (tLRPC$TL_payments_paymentFormStars == null || tLRPC$TL_payments_paymentFormStars.invoice == null || this.paymentFormOpened) {
            return;
        }
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
                    StarsController.this.lambda$openPaymentForm$22(runnable, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, callback);
                }
            });
            return;
        }
        Iterator<TLRPC$TL_labeledPrice> it = tLRPC$TL_payments_paymentFormStars.invoice.prices.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().amount;
        }
        long j2 = tLRPC$TL_payments_paymentFormStars.bot_id;
        if (j2 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j2)));
        } else {
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j2));
            str = chat == null ? "" : chat.title;
        }
        final String str2 = str;
        String str3 = tLRPC$TL_payments_paymentFormStars.title;
        if (runnable != null) {
            runnable.run();
        }
        final boolean[] zArr = {false};
        final long j3 = j;
        StarsIntroActivity.openConfirmPurchaseSheet(context2, resourceProvider, this.currentAccount, j2, str3, j, tLRPC$TL_payments_paymentFormStars.photo, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.this.lambda$openPaymentForm$27(j3, zArr, callback, context2, resourceProvider, str2, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, (Utilities.Callback) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$openPaymentForm$28(zArr, callback);
            }
        });
    }

    public void lambda$openPaymentForm$22(Runnable runnable, TLRPC$InputInvoice tLRPC$InputInvoice, TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, Utilities.Callback callback) {
        if (!balanceAvailable()) {
            bulletinError("NO_BALANCE");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        openPaymentForm(tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, runnable, callback);
    }

    public void lambda$openPaymentForm$27(long j, final boolean[] zArr, final Utilities.Callback callback, Context context, Theme.ResourcesProvider resourcesProvider, String str, final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Utilities.Callback callback2) {
        if (this.balance < j) {
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
            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, str, new Runnable() {
                @Override
                public final void run() {
                    StarsController.this.lambda$openPaymentForm$24(zArr2, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, zArr, callback, callback2);
                }
            });
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    StarsController.this.lambda$openPaymentForm$25(callback2, zArr2, zArr, callback, dialogInterface);
                }
            });
            starsNeededSheet.show();
            return;
        }
        payAfterConfirmed(tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.lambda$openPaymentForm$26(Utilities.Callback.this, zArr, callback, (Boolean) obj);
            }
        });
    }

    public void lambda$openPaymentForm$24(boolean[] zArr, TLRPC$InputInvoice tLRPC$InputInvoice, TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final boolean[] zArr2, final Utilities.Callback callback, final Utilities.Callback callback2) {
        zArr[0] = true;
        payAfterConfirmed(tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.lambda$openPaymentForm$23(zArr2, callback, callback2, (Boolean) obj);
            }
        });
    }

    public static void lambda$openPaymentForm$23(boolean[] zArr, Utilities.Callback callback, Utilities.Callback callback2, Boolean bool) {
        zArr[0] = true;
        if (callback != null) {
            callback.run(bool.booleanValue() ? "paid" : "failed");
        }
        if (callback2 != null) {
            callback2.run(Boolean.TRUE);
        }
    }

    public void lambda$openPaymentForm$25(Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Utilities.Callback callback2, DialogInterface dialogInterface) {
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

    public static void lambda$openPaymentForm$26(Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2, Boolean bool) {
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed");
        }
    }

    public void lambda$openPaymentForm$28(boolean[] zArr, Utilities.Callback callback) {
        this.paymentFormOpened = false;
        if (zArr[0] || callback == null) {
            return;
        }
        callback.run("cancelled");
        zArr[0] = true;
    }

    private void showNoSupportDialog(Context context, Theme.ResourcesProvider resourcesProvider) {
        new AlertDialog.Builder(context, resourcesProvider).setTitle(LocaleController.getString(R.string.StarsNotAvailableTitle)).setMessage(LocaleController.getString(R.string.StarsNotAvailableText)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
    }

    private void payAfterConfirmed(final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Utilities.Callback<Boolean> callback) {
        String str;
        if (tLRPC$TL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context == null) {
            return;
        }
        Iterator<TLRPC$TL_labeledPrice> it = tLRPC$TL_payments_paymentFormStars.invoice.prices.iterator();
        final long j = 0;
        while (it.hasNext()) {
            j += it.next().amount;
        }
        long j2 = tLRPC$TL_payments_paymentFormStars.bot_id;
        if (j2 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j2)));
        } else {
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j2));
            str = chat == null ? "" : chat.title;
        }
        final String str2 = str;
        final String str3 = tLRPC$TL_payments_paymentFormStars.title;
        TLRPC$TL_payments_sendStarsForm tLRPC$TL_payments_sendStarsForm = new TLRPC$TL_payments_sendStarsForm();
        tLRPC$TL_payments_sendStarsForm.form_id = tLRPC$TL_payments_paymentFormStars.form_id;
        tLRPC$TL_payments_sendStarsForm.invoice = tLRPC$InputInvoice;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$payAfterConfirmed$35(callback, context, j, str3, str2, resourceProvider, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$payAfterConfirmed$35(final Utilities.Callback callback, final Context context, final long j, final String str, final String str2, final Theme.ResourcesProvider resourcesProvider, final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$payAfterConfirmed$34(tLObject, callback, context, j, str, str2, tLRPC$TL_error, resourcesProvider, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars);
            }
        });
    }

    public void lambda$payAfterConfirmed$34(TLObject tLObject, final Utilities.Callback callback, Context context, long j, String str, String str2, TLRPC$TL_error tLRPC$TL_error, Theme.ResourcesProvider resourcesProvider, final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars) {
        this.paymentFormOpened = false;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        final BulletinFactory global = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
        if (tLObject instanceof TLRPC$TL_payments_paymentResult) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
            }
            MessagesController.getInstance(this.currentAccount).processUpdates(((TLRPC$TL_payments_paymentResult) tLObject).updates, false);
            global.createSimpleBulletin(context.getResources().getDrawable(R.drawable.star_small_inner).mutate(), LocaleController.getString(R.string.StarsPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsPurchaseCompletedInfo", (int) j, str, str2))).show();
            invalidateTransactions(true);
            return;
        }
        if (tLRPC$TL_error != null && "BALANCE_TOO_LOW".equals(tLRPC$TL_error.text)) {
            if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                showNoSupportDialog(context, resourcesProvider);
                return;
            } else {
                final boolean[] zArr = {false};
                StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, str2, new Runnable() {
                    @Override
                    public final void run() {
                        StarsController.this.lambda$payAfterConfirmed$30(zArr, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, callback);
                    }
                });
                starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        StarsController.lambda$payAfterConfirmed$31(Utilities.Callback.this, zArr, dialogInterface);
                    }
                });
                starsNeededSheet.show();
                return;
            }
        }
        if (tLRPC$TL_error != null && "FORM_EXPIRED".equals(tLRPC$TL_error.text)) {
            TLRPC$TL_payments_getPaymentForm tLRPC$TL_payments_getPaymentForm = new TLRPC$TL_payments_getPaymentForm();
            JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(resourcesProvider);
            if (makeThemeParams != null) {
                TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
                tLRPC$TL_payments_getPaymentForm.theme_params = tLRPC$TL_dataJSON;
                tLRPC$TL_dataJSON.data = makeThemeParams.toString();
                tLRPC$TL_payments_getPaymentForm.flags |= 1;
            }
            tLRPC$TL_payments_getPaymentForm.invoice = tLRPC$InputInvoice;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    StarsController.this.lambda$payAfterConfirmed$33(tLRPC$InputInvoice, callback, global, tLObject2, tLRPC$TL_error2);
                }
            });
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        int i = R.raw.error;
        int i2 = R.string.UnknownErrorCode;
        Object[] objArr = new Object[1];
        objArr[0] = tLRPC$TL_error != null ? tLRPC$TL_error.text : "FAILED_SEND_STARS";
        global.createSimpleBulletin(i, LocaleController.formatString(i2, objArr)).show();
    }

    public void lambda$payAfterConfirmed$30(boolean[] zArr, TLRPC$InputInvoice tLRPC$InputInvoice, TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Utilities.Callback callback) {
        zArr[0] = true;
        payAfterConfirmed(tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.lambda$payAfterConfirmed$29(Utilities.Callback.this, (Boolean) obj);
            }
        });
    }

    public static void lambda$payAfterConfirmed$29(Utilities.Callback callback, Boolean bool) {
        if (callback != null) {
            callback.run(bool);
        }
    }

    public static void lambda$payAfterConfirmed$31(Utilities.Callback callback, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
    }

    public void lambda$payAfterConfirmed$33(final TLRPC$InputInvoice tLRPC$InputInvoice, final Utilities.Callback callback, final BulletinFactory bulletinFactory, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$payAfterConfirmed$32(tLObject, tLRPC$InputInvoice, callback, bulletinFactory, tLRPC$TL_error);
            }
        });
    }

    public void lambda$payAfterConfirmed$32(TLObject tLObject, TLRPC$InputInvoice tLRPC$InputInvoice, Utilities.Callback callback, BulletinFactory bulletinFactory, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_payments_paymentFormStars) {
            payAfterConfirmed(tLRPC$InputInvoice, (TLRPC$TL_payments_paymentFormStars) tLObject, callback);
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        int i = R.raw.error;
        int i2 = R.string.UnknownErrorCode;
        Object[] objArr = new Object[1];
        objArr[0] = tLRPC$TL_error != null ? tLRPC$TL_error.text : "FAILED_GETTING_FORM";
        bulletinFactory.createSimpleBulletin(i, LocaleController.formatString(i2, objArr)).show();
    }
}
