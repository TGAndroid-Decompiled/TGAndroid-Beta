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
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
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
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputInvoice;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageExtendedMedia;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$PaymentForm;
import org.telegram.tgnet.TLRPC$PaymentReceipt;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$StarsTransaction;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$TL_inputInvoiceMessage;
import org.telegram.tgnet.TLRPC$TL_inputInvoiceStars;
import org.telegram.tgnet.TLRPC$TL_inputMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputMediaPaidMedia;
import org.telegram.tgnet.TLRPC$TL_inputMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$TL_inputPhoto;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsGift;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentStarsTopup;
import org.telegram.tgnet.TLRPC$TL_labeledPrice;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageExtendedMedia;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaPaidMedia;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messages_editMessage;
import org.telegram.tgnet.TLRPC$TL_messages_getExtendedMedia;
import org.telegram.tgnet.TLRPC$TL_messages_getScheduledMessages;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_payments_canPurchasePremium;
import org.telegram.tgnet.TLRPC$TL_payments_getPaymentForm;
import org.telegram.tgnet.TLRPC$TL_payments_getStarsStatus;
import org.telegram.tgnet.TLRPC$TL_payments_getStarsTransactions;
import org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars;
import org.telegram.tgnet.TLRPC$TL_payments_paymentResult;
import org.telegram.tgnet.TLRPC$TL_payments_sendStarsForm;
import org.telegram.tgnet.TLRPC$TL_payments_starsStatus;
import org.telegram.tgnet.TLRPC$TL_starsGiftOption;
import org.telegram.tgnet.TLRPC$TL_starsTopupOption;
import org.telegram.tgnet.TLRPC$Updates;
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
    private ArrayList<TLRPC$TL_starsGiftOption> giftOptions;
    private boolean giftOptionsLoaded;
    private boolean giftOptionsLoading;
    private long lastBalanceLoaded;
    private ArrayList<TLRPC$TL_starsTopupOption> options;
    private boolean optionsLoaded;
    private boolean optionsLoading;
    private boolean paymentFormOpened;
    public final ArrayList<TLRPC$StarsTransaction>[] transactions = {new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
    public final boolean[] transactionsExist = new boolean[3];
    private final String[] offset = new String[3];
    private final boolean[] loading = new boolean[3];
    private final boolean[] endReached = new boolean[3];

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
                Iterator<TLRPC$StarsTransaction> it = tLRPC$TL_payments_starsStatus.history.iterator();
                while (it.hasNext()) {
                    TLRPC$StarsTransaction next = it.next();
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
                    if (tLRPC$TL_starsTopupOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tLRPC$TL_starsTopupOption);
                        tLRPC$TL_starsTopupOption.loadingStorePrice = true;
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
                    } else if (((TLRPC$TL_starsTopupOption) arrayList.get(i2)).store_product.equals(productDetails.getProductId())) {
                        tLRPC$TL_starsTopupOption = (TLRPC$TL_starsTopupOption) arrayList.get(i2);
                        break;
                    } else {
                        i2++;
                    }
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
        if (this.options != null) {
            for (int i3 = 0; i3 < this.options.size(); i3++) {
                this.options.get(i3);
            }
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
    }

    public ArrayList<TLRPC$TL_starsGiftOption> getGiftOptions() {
        if (this.giftOptionsLoading || this.giftOptionsLoaded) {
            return this.giftOptions;
        }
        this.giftOptionsLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            public int flags;
            public TLRPC$InputUser user_id;

            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                int readInt32 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt32; i2++) {
                    TLRPC$TL_starsGiftOption TLdeserialize = TLRPC$TL_starsGiftOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize == null) {
                        return tLRPC$Vector;
                    }
                    tLRPC$Vector.objects.add(TLdeserialize);
                }
                return tLRPC$Vector;
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-741774392);
                abstractSerializedData.writeInt32(this.flags);
                if ((this.flags & 1) != 0) {
                    this.user_id.serializeToStream(abstractSerializedData);
                }
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$getGiftOptions$11(tLObject, tLRPC$TL_error);
            }
        });
        return this.giftOptions;
    }

    public void lambda$getGiftOptions$11(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getGiftOptions$10(tLObject);
            }
        });
    }

    public void lambda$getGiftOptions$10(TLObject tLObject) {
        ArrayList<TLRPC$TL_starsGiftOption> arrayList = new ArrayList<>();
        final ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof TLRPC$Vector) {
            Iterator<Object> it = ((TLRPC$Vector) tLObject).objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof TLRPC$TL_starsGiftOption) {
                    TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption = (TLRPC$TL_starsGiftOption) next;
                    arrayList.add(tLRPC$TL_starsGiftOption);
                    if (tLRPC$TL_starsGiftOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                        arrayList2.add(tLRPC$TL_starsGiftOption);
                        tLRPC$TL_starsGiftOption.loadingStorePrice = true;
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
                StarsController.this.lambda$getGiftOptions$9(arrayList2);
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
            arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(((TLRPC$TL_starsGiftOption) arrayList.get(i)).store_product).build());
        }
        BillingController.getInstance().queryProductDetails(arrayList2, new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                StarsController.this.lambda$getGiftOptions$8(arrayList, billingResult, list);
            }
        });
    }

    public void lambda$getGiftOptions$8(final ArrayList arrayList, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$getGiftOptions$7(billingResult, list, arrayList);
            }
        });
    }

    public void lambda$getGiftOptions$7(BillingResult billingResult, List list, ArrayList arrayList) {
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (billingResult.getResponseCode() != 0) {
            bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            return;
        }
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ProductDetails productDetails = (ProductDetails) list.get(i);
                TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption = null;
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    } else if (((TLRPC$TL_starsGiftOption) arrayList.get(i2)).store_product.equals(productDetails.getProductId())) {
                        tLRPC$TL_starsGiftOption = (TLRPC$TL_starsGiftOption) arrayList.get(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (tLRPC$TL_starsGiftOption != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                    tLRPC$TL_starsGiftOption.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                    double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
                    double pow = Math.pow(10.0d, 6.0d);
                    Double.isNaN(priceAmountMicros);
                    tLRPC$TL_starsGiftOption.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tLRPC$TL_starsGiftOption.currency)));
                    tLRPC$TL_starsGiftOption.loadingStorePrice = false;
                }
            }
        }
        if (this.giftOptions != null) {
            for (int i3 = 0; i3 < this.giftOptions.size(); i3++) {
                this.giftOptions.get(i3);
            }
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
    }

    private void bulletinError(TLRPC$TL_error tLRPC$TL_error, String str) {
        if (tLRPC$TL_error != null) {
            str = tLRPC$TL_error.text;
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
                StarsController.this.lambda$loadTransactions$13(i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadTransactions$13(final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$loadTransactions$12(i, tLObject);
            }
        });
    }

    public void lambda$loadTransactions$12(int i, TLObject tLObject) {
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
            } else {
                showNoSupportDialog(activity, null);
            }
        } else if (BuildVars.useInvoiceBilling() || !BillingController.getInstance().isReady()) {
            TLRPC$TL_inputStorePaymentStarsTopup tLRPC$TL_inputStorePaymentStarsTopup = new TLRPC$TL_inputStorePaymentStarsTopup();
            tLRPC$TL_inputStorePaymentStarsTopup.stars = tLRPC$TL_starsTopupOption.stars;
            tLRPC$TL_inputStorePaymentStarsTopup.currency = tLRPC$TL_starsTopupOption.currency;
            tLRPC$TL_inputStorePaymentStarsTopup.amount = tLRPC$TL_starsTopupOption.amount;
            TLRPC$TL_inputStorePaymentStarsTopup tLRPC$TL_inputStorePaymentStarsTopup2 = new TLRPC$TL_inputStorePaymentStarsTopup();
            tLRPC$TL_inputStorePaymentStarsTopup2.stars = tLRPC$TL_starsTopupOption.stars;
            tLRPC$TL_inputStorePaymentStarsTopup2.amount = tLRPC$TL_starsTopupOption.amount;
            tLRPC$TL_inputStorePaymentStarsTopup2.currency = tLRPC$TL_starsTopupOption.currency;
            final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars = new TLRPC$TL_inputInvoiceStars();
            tLRPC$TL_inputInvoiceStars.purpose = tLRPC$TL_inputStorePaymentStarsTopup2;
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
                    StarsController.this.lambda$buy$16(callback2, tLRPC$TL_inputInvoiceStars, tLObject, tLRPC$TL_error);
                }
            });
        } else {
            final TLRPC$TL_inputStorePaymentStarsTopup tLRPC$TL_inputStorePaymentStarsTopup3 = new TLRPC$TL_inputStorePaymentStarsTopup();
            tLRPC$TL_inputStorePaymentStarsTopup3.stars = tLRPC$TL_starsTopupOption.stars;
            tLRPC$TL_inputStorePaymentStarsTopup3.currency = tLRPC$TL_starsTopupOption.currency;
            tLRPC$TL_inputStorePaymentStarsTopup3.amount = tLRPC$TL_starsTopupOption.amount;
            BillingController.getInstance().queryProductDetails(Arrays.asList(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tLRPC$TL_starsTopupOption.store_product).build()), new ProductDetailsResponseListener() {
                @Override
                public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                    StarsController.lambda$buy$24(Utilities.Callback2.this, tLRPC$TL_inputStorePaymentStarsTopup3, tLRPC$TL_starsTopupOption, activity, billingResult, list);
                }
            });
        }
    }

    public void lambda$buy$16(final Utilities.Callback2 callback2, final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$buy$15(tLRPC$TL_error, callback2, tLObject, tLRPC$TL_inputInvoiceStars);
            }
        });
    }

    public void lambda$buy$15(TLRPC$TL_error tLRPC$TL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars) {
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
                StarsController.lambda$buy$14(Utilities.Callback2.this, invoiceStatus);
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

    public static void lambda$buy$14(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            if (callback2 != null) {
                callback2.run(Boolean.TRUE, null);
            }
        } else if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PENDING || callback2 == null) {
        } else {
            callback2.run(Boolean.FALSE, null);
        }
    }

    public static void lambda$buy$24(final Utilities.Callback2 callback2, final TLRPC$TL_inputStorePaymentStarsTopup tLRPC$TL_inputStorePaymentStarsTopup, final TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption, final Activity activity, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$23(list, callback2, tLRPC$TL_inputStorePaymentStarsTopup, tLRPC$TL_starsTopupOption, billingResult, activity);
            }
        });
    }

    public static void lambda$buy$23(List list, final Utilities.Callback2 callback2, TLRPC$TL_inputStorePaymentStarsTopup tLRPC$TL_inputStorePaymentStarsTopup, TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption, final BillingResult billingResult, Activity activity) {
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buy$17(Utilities.Callback2.this);
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
                    StarsController.lambda$buy$18(Utilities.Callback2.this);
                }
            });
            return;
        }
        tLRPC$TL_inputStorePaymentStarsTopup.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        double pow = Math.pow(10.0d, 6.0d);
        Double.isNaN(priceAmountMicros);
        tLRPC$TL_inputStorePaymentStarsTopup.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tLRPC$TL_starsTopupOption.currency)));
        BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
            @Override
            public final void accept(Object obj) {
                StarsController.lambda$buy$20(BillingResult.this, callback2, (BillingResult) obj);
            }
        });
        BillingController.getInstance().setOnCanceled(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$22(Utilities.Callback2.this);
            }
        });
        BillingController.getInstance().launchBillingFlow(activity, AccountInstance.getInstance(UserConfig.selectedAccount), tLRPC$TL_inputStorePaymentStarsTopup, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) list.get(0)).build()));
    }

    public static void lambda$buy$17(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
    }

    public static void lambda$buy$18(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
    }

    public static void lambda$buy$20(BillingResult billingResult, final Utilities.Callback2 callback2, BillingResult billingResult2) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$19(Utilities.Callback2.this, z, responseCodeString);
            }
        });
    }

    public static void lambda$buy$19(Utilities.Callback2 callback2, boolean z, String str) {
        callback2.run(Boolean.valueOf(z), str);
    }

    public static void lambda$buy$21(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, null);
    }

    public static void lambda$buy$22(final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buy$21(Utilities.Callback2.this);
            }
        });
    }

    public void buyGift(final Activity activity, final TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption, long j, final Utilities.Callback2<Boolean, String> callback2) {
        if (activity == null) {
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment != null && lastFragment.getContext() != null) {
                showNoSupportDialog(lastFragment.getContext(), lastFragment.getResourceProvider());
            } else {
                showNoSupportDialog(activity, null);
            }
        } else if (BuildVars.useInvoiceBilling() || !BillingController.getInstance().isReady()) {
            TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift = new TLRPC$TL_inputStorePaymentStarsGift();
            tLRPC$TL_inputStorePaymentStarsGift.stars = tLRPC$TL_starsGiftOption.stars;
            tLRPC$TL_inputStorePaymentStarsGift.amount = tLRPC$TL_starsGiftOption.amount;
            tLRPC$TL_inputStorePaymentStarsGift.currency = tLRPC$TL_starsGiftOption.currency;
            tLRPC$TL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
            final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars = new TLRPC$TL_inputInvoiceStars();
            tLRPC$TL_inputInvoiceStars.purpose = tLRPC$TL_inputStorePaymentStarsGift;
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
                    StarsController.this.lambda$buyGift$27(callback2, tLRPC$TL_inputInvoiceStars, tLObject, tLRPC$TL_error);
                }
            });
        } else {
            final TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift2 = new TLRPC$TL_inputStorePaymentStarsGift();
            tLRPC$TL_inputStorePaymentStarsGift2.stars = tLRPC$TL_starsGiftOption.stars;
            tLRPC$TL_inputStorePaymentStarsGift2.currency = tLRPC$TL_starsGiftOption.currency;
            tLRPC$TL_inputStorePaymentStarsGift2.amount = tLRPC$TL_starsGiftOption.amount;
            tLRPC$TL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(j);
            TLRPC$TL_payments_canPurchasePremium tLRPC$TL_payments_canPurchasePremium = new TLRPC$TL_payments_canPurchasePremium();
            tLRPC$TL_payments_canPurchasePremium.purpose = tLRPC$TL_inputStorePaymentStarsGift2;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_canPurchasePremium, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StarsController.lambda$buyGift$37(TLRPC$TL_starsGiftOption.this, callback2, tLRPC$TL_inputStorePaymentStarsGift2, activity, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$buyGift$27(final Utilities.Callback2 callback2, final TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$buyGift$26(tLRPC$TL_error, callback2, tLObject, tLRPC$TL_inputInvoiceStars);
            }
        });
    }

    public void lambda$buyGift$26(TLRPC$TL_error tLRPC$TL_error, final Utilities.Callback2 callback2, TLObject tLObject, TLRPC$TL_inputInvoiceStars tLRPC$TL_inputInvoiceStars) {
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
                StarsController.lambda$buyGift$25(Utilities.Callback2.this, invoiceStatus);
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

    public static void lambda$buyGift$25(Utilities.Callback2 callback2, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            if (callback2 != null) {
                callback2.run(Boolean.TRUE, null);
            }
        } else if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PENDING || callback2 == null) {
        } else {
            callback2.run(Boolean.FALSE, null);
        }
    }

    public static void lambda$buyGift$37(final TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption, final Utilities.Callback2 callback2, final TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift, final Activity activity, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$36(TLObject.this, tLRPC$TL_starsGiftOption, callback2, tLRPC$TL_inputStorePaymentStarsGift, activity, tLRPC$TL_error);
            }
        });
    }

    public static void lambda$buyGift$36(TLObject tLObject, final TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption, final Utilities.Callback2 callback2, final TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift, final Activity activity, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            BillingController.getInstance().queryProductDetails(Arrays.asList(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(tLRPC$TL_starsGiftOption.store_product).build()), new ProductDetailsResponseListener() {
                @Override
                public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                    StarsController.lambda$buyGift$35(Utilities.Callback2.this, tLRPC$TL_inputStorePaymentStarsGift, tLRPC$TL_starsGiftOption, activity, billingResult, list);
                }
            });
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
            }
        } else if (callback2 != null) {
            callback2.run(Boolean.FALSE, tLRPC$TL_error != null ? tLRPC$TL_error.text : "SERVER_ERROR");
        }
    }

    public static void lambda$buyGift$35(final Utilities.Callback2 callback2, final TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift, final TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption, final Activity activity, final BillingResult billingResult, final List list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$34(list, callback2, tLRPC$TL_inputStorePaymentStarsGift, tLRPC$TL_starsGiftOption, billingResult, activity);
            }
        });
    }

    public static void lambda$buyGift$34(List list, final Utilities.Callback2 callback2, TLRPC$TL_inputStorePaymentStarsGift tLRPC$TL_inputStorePaymentStarsGift, TLRPC$TL_starsGiftOption tLRPC$TL_starsGiftOption, final BillingResult billingResult, Activity activity) {
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StarsController.lambda$buyGift$28(Utilities.Callback2.this);
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
                    StarsController.lambda$buyGift$29(Utilities.Callback2.this);
                }
            });
            return;
        }
        tLRPC$TL_inputStorePaymentStarsGift.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        double pow = Math.pow(10.0d, 6.0d);
        Double.isNaN(priceAmountMicros);
        tLRPC$TL_inputStorePaymentStarsGift.amount = (long) ((priceAmountMicros / pow) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tLRPC$TL_starsGiftOption.currency)));
        BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
            @Override
            public final void accept(Object obj) {
                StarsController.lambda$buyGift$31(BillingResult.this, callback2, (BillingResult) obj);
            }
        });
        BillingController.getInstance().setOnCanceled(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$33(Utilities.Callback2.this);
            }
        });
        BillingController.getInstance().launchBillingFlow(activity, AccountInstance.getInstance(UserConfig.selectedAccount), tLRPC$TL_inputStorePaymentStarsGift, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) list.get(0)).build()));
    }

    public static void lambda$buyGift$28(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
    }

    public static void lambda$buyGift$29(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
    }

    public static void lambda$buyGift$31(BillingResult billingResult, final Utilities.Callback2 callback2, BillingResult billingResult2) {
        final boolean z = billingResult.getResponseCode() == 0;
        final String responseCodeString = z ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$30(Utilities.Callback2.this, z, responseCodeString);
            }
        });
    }

    public static void lambda$buyGift$30(Utilities.Callback2 callback2, boolean z, String str) {
        callback2.run(Boolean.valueOf(z), str);
    }

    public static void lambda$buyGift$32(Utilities.Callback2 callback2) {
        callback2.run(Boolean.FALSE, null);
    }

    public static void lambda$buyGift$33(final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.lambda$buyGift$32(Utilities.Callback2.this);
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
        final TLRPC$TL_inputInvoiceMessage tLRPC$TL_inputInvoiceMessage = new TLRPC$TL_inputInvoiceMessage();
        tLRPC$TL_inputInvoiceMessage.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(dialogId);
        tLRPC$TL_inputInvoiceMessage.msg_id = id;
        TLRPC$TL_payments_getPaymentForm tLRPC$TL_payments_getPaymentForm = new TLRPC$TL_payments_getPaymentForm();
        JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(resourceProvider);
        if (makeThemeParams != null) {
            TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
            tLRPC$TL_payments_getPaymentForm.theme_params = tLRPC$TL_dataJSON;
            tLRPC$TL_dataJSON.data = makeThemeParams.toString();
            tLRPC$TL_payments_getPaymentForm.flags |= 1;
        }
        tLRPC$TL_payments_getPaymentForm.invoice = tLRPC$TL_inputInvoiceMessage;
        final int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$pay$39(messageObject, tLRPC$TL_inputInvoiceMessage, runnable, tLObject, tLRPC$TL_error);
            }
        });
        return new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$pay$40(sendRequest);
            }
        };
    }

    public void lambda$pay$39(final MessageObject messageObject, final TLRPC$TL_inputInvoiceMessage tLRPC$TL_inputInvoiceMessage, final Runnable runnable, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$pay$38(tLObject, messageObject, tLRPC$TL_inputInvoiceMessage, runnable, tLRPC$TL_error);
            }
        });
    }

    public void lambda$pay$38(TLObject tLObject, MessageObject messageObject, TLRPC$TL_inputInvoiceMessage tLRPC$TL_inputInvoiceMessage, Runnable runnable, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_payments_paymentFormStars) {
            openPaymentForm(messageObject, tLRPC$TL_inputInvoiceMessage, (TLRPC$TL_payments_paymentFormStars) tLObject, runnable, null);
        } else {
            bulletinError(tLRPC$TL_error, "NO_PAYMENT_FORM");
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$pay$40(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public void openPaymentForm(final MessageObject messageObject, final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Runnable runnable, final Utilities.Callback<String> callback) {
        long j;
        String str;
        TLRPC$Peer tLRPC$Peer;
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
                    StarsController.this.lambda$openPaymentForm$41(runnable, messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, callback);
                }
            });
            return;
        }
        Iterator<TLRPC$TL_labeledPrice> it = tLRPC$TL_payments_paymentFormStars.invoice.prices.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += it.next().amount;
        }
        if (messageObject != null && messageObject.type == 29) {
            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from;
            if (tLRPC$MessageFwdHeader != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.from_id) != null) {
                j = DialogObject.getPeerDialogId(tLRPC$Peer);
            } else {
                j = messageObject.getDialogId();
            }
        } else {
            j = tLRPC$TL_payments_paymentFormStars.bot_id;
        }
        long j3 = j;
        if (j3 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)));
        } else {
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            str = chat == null ? "" : chat.title;
        }
        final String str2 = str;
        String str3 = tLRPC$TL_payments_paymentFormStars.title;
        if (runnable != null) {
            runnable.run();
        }
        final boolean[] zArr = {false};
        final long j4 = j2;
        StarsIntroActivity.openConfirmPurchaseSheet(context2, resourceProvider, this.currentAccount, messageObject, j3, str3, j2, tLRPC$TL_payments_paymentFormStars.photo, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.this.lambda$openPaymentForm$46(j4, zArr, callback, context2, resourceProvider, str2, messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, (Utilities.Callback) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$openPaymentForm$47(zArr, callback);
            }
        });
    }

    public void lambda$openPaymentForm$41(Runnable runnable, MessageObject messageObject, TLRPC$InputInvoice tLRPC$InputInvoice, TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, Utilities.Callback callback) {
        if (!balanceAvailable()) {
            bulletinError("NO_BALANCE");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        openPaymentForm(messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, runnable, callback);
    }

    public void lambda$openPaymentForm$46(long j, final boolean[] zArr, final Utilities.Callback callback, Context context, Theme.ResourcesProvider resourcesProvider, String str, final MessageObject messageObject, final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Utilities.Callback callback2) {
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
                    StarsController.this.lambda$openPaymentForm$43(zArr2, messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, zArr, callback, callback2);
                }
            });
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    StarsController.this.lambda$openPaymentForm$44(callback2, zArr2, zArr, callback, dialogInterface);
                }
            });
            starsNeededSheet.show();
            return;
        }
        payAfterConfirmed(messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.lambda$openPaymentForm$45(Utilities.Callback.this, zArr, callback, (Boolean) obj);
            }
        });
    }

    public void lambda$openPaymentForm$43(boolean[] zArr, MessageObject messageObject, TLRPC$InputInvoice tLRPC$InputInvoice, TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final boolean[] zArr2, final Utilities.Callback callback, final Utilities.Callback callback2) {
        zArr[0] = true;
        payAfterConfirmed(messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.lambda$openPaymentForm$42(zArr2, callback, callback2, (Boolean) obj);
            }
        });
    }

    public static void lambda$openPaymentForm$42(boolean[] zArr, Utilities.Callback callback, Utilities.Callback callback2, Boolean bool) {
        zArr[0] = true;
        if (callback != null) {
            callback.run(bool.booleanValue() ? "paid" : "failed");
        }
        if (callback2 != null) {
            callback2.run(Boolean.TRUE);
        }
    }

    public void lambda$openPaymentForm$44(Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Utilities.Callback callback2, DialogInterface dialogInterface) {
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

    public static void lambda$openPaymentForm$45(Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2, Boolean bool) {
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(bool.booleanValue() ? "paid" : "failed");
        }
    }

    public void lambda$openPaymentForm$47(boolean[] zArr, Utilities.Callback callback) {
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

    private void payAfterConfirmed(final MessageObject messageObject, final TLRPC$InputInvoice tLRPC$InputInvoice, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Utilities.Callback<Boolean> callback) {
        long j;
        String str;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader;
        TLRPC$Peer tLRPC$Peer;
        if (tLRPC$TL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (context == null) {
            return;
        }
        Iterator<TLRPC$TL_labeledPrice> it = tLRPC$TL_payments_paymentFormStars.invoice.prices.iterator();
        final long j2 = 0;
        while (it.hasNext()) {
            j2 += it.next().amount;
        }
        if (messageObject != null) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (tLRPC$Message != null && (tLRPC$MessageFwdHeader = tLRPC$Message.fwd_from) != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.from_id) != null) {
                j = DialogObject.getPeerDialogId(tLRPC$Peer);
            } else {
                j = messageObject.getDialogId();
            }
        } else {
            j = tLRPC$TL_payments_paymentFormStars.bot_id;
        }
        final long j3 = j;
        if (j3 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)));
        } else {
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
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
                StarsController.this.lambda$payAfterConfirmed$54(callback, messageObject, context, j2, str2, str3, tLRPC$InputInvoice, j3, resourceProvider, tLRPC$TL_payments_paymentFormStars, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$payAfterConfirmed$54(final Utilities.Callback callback, final MessageObject messageObject, final Context context, final long j, final String str, final String str2, final TLRPC$InputInvoice tLRPC$InputInvoice, final long j2, final Theme.ResourcesProvider resourcesProvider, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$payAfterConfirmed$53(tLObject, callback, messageObject, context, j, str, str2, tLRPC$InputInvoice, j2, tLRPC$TL_error, resourcesProvider, tLRPC$TL_payments_paymentFormStars);
            }
        });
    }

    public void lambda$payAfterConfirmed$53(TLObject tLObject, final Utilities.Callback callback, final MessageObject messageObject, Context context, long j, String str, String str2, final TLRPC$InputInvoice tLRPC$InputInvoice, long j2, TLRPC$TL_error tLRPC$TL_error, Theme.ResourcesProvider resourcesProvider, final TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars) {
        TLRPC$Message tLRPC$Message;
        boolean z = false;
        this.paymentFormOpened = false;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory global = (lastFragment == null || lastFragment.visibleDialog != null) ? BulletinFactory.global() : BulletinFactory.of(lastFragment);
        if (tLObject instanceof TLRPC$TL_payments_paymentResult) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
            }
            MessagesController.getInstance(this.currentAccount).processUpdates(((TLRPC$TL_payments_paymentResult) tLObject).updates, false);
            if ((messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || !(tLRPC$Message.media instanceof TLRPC$TL_messageMediaPaidMedia)) ? false : true) {
                global.createSimpleBulletin(context.getResources().getDrawable(R.drawable.star_small_inner).mutate(), LocaleController.getString(R.string.StarsMediaPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsMediaPurchaseCompletedInfo", (int) j, str))).show();
            } else {
                global.createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsPurchaseCompletedInfo", (int) j, str2, str))).show();
            }
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null && launchActivity.getFireworksOverlay() != null) {
                LaunchActivity.instance.getFireworksOverlay().start(true);
            }
            if ((tLRPC$InputInvoice instanceof TLRPC$TL_inputInvoiceStars) && (((TLRPC$TL_inputInvoiceStars) tLRPC$InputInvoice).purpose instanceof TLRPC$TL_inputStorePaymentStarsGift)) {
                z = true;
            }
            if (!z) {
                invalidateTransactions(true);
            }
            if (messageObject != null) {
                TLRPC$TL_messages_getExtendedMedia tLRPC$TL_messages_getExtendedMedia = new TLRPC$TL_messages_getExtendedMedia();
                tLRPC$TL_messages_getExtendedMedia.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
                tLRPC$TL_messages_getExtendedMedia.id.add(Integer.valueOf(messageObject.getId()));
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getExtendedMedia, null);
            }
        } else if (tLRPC$TL_error != null && "BALANCE_TOO_LOW".equals(tLRPC$TL_error.text)) {
            if (!MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                showNoSupportDialog(context, resourcesProvider);
                return;
            }
            final boolean[] zArr = {false};
            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j, str, new Runnable() {
                @Override
                public final void run() {
                    StarsController.this.lambda$payAfterConfirmed$49(zArr, messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, callback);
                }
            });
            starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    StarsController.lambda$payAfterConfirmed$50(Utilities.Callback.this, zArr, dialogInterface);
                }
            });
            starsNeededSheet.show();
        } else if (tLRPC$TL_error != null && "FORM_EXPIRED".equals(tLRPC$TL_error.text)) {
            TLRPC$TL_payments_getPaymentForm tLRPC$TL_payments_getPaymentForm = new TLRPC$TL_payments_getPaymentForm();
            JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(resourcesProvider);
            if (makeThemeParams != null) {
                TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
                tLRPC$TL_payments_getPaymentForm.theme_params = tLRPC$TL_dataJSON;
                tLRPC$TL_dataJSON.data = makeThemeParams.toString();
                tLRPC$TL_payments_getPaymentForm.flags |= 1;
            }
            tLRPC$TL_payments_getPaymentForm.invoice = tLRPC$InputInvoice;
            final BulletinFactory bulletinFactory = global;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    StarsController.this.lambda$payAfterConfirmed$52(messageObject, tLRPC$InputInvoice, callback, bulletinFactory, tLObject2, tLRPC$TL_error2);
                }
            });
        } else {
            if (callback != null) {
                callback.run(Boolean.FALSE);
            }
            int i = R.raw.error;
            int i2 = R.string.UnknownErrorCode;
            Object[] objArr = new Object[1];
            objArr[0] = tLRPC$TL_error != null ? tLRPC$TL_error.text : "FAILED_SEND_STARS";
            global.createSimpleBulletin(i, LocaleController.formatString(i2, objArr)).show();
            if (messageObject != null) {
                TLRPC$TL_messages_getExtendedMedia tLRPC$TL_messages_getExtendedMedia2 = new TLRPC$TL_messages_getExtendedMedia();
                tLRPC$TL_messages_getExtendedMedia2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
                tLRPC$TL_messages_getExtendedMedia2.id.add(Integer.valueOf(messageObject.getId()));
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getExtendedMedia2, null);
            }
        }
    }

    public void lambda$payAfterConfirmed$49(boolean[] zArr, MessageObject messageObject, TLRPC$InputInvoice tLRPC$InputInvoice, TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars, final Utilities.Callback callback) {
        zArr[0] = true;
        payAfterConfirmed(messageObject, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StarsController.lambda$payAfterConfirmed$48(Utilities.Callback.this, (Boolean) obj);
            }
        });
    }

    public static void lambda$payAfterConfirmed$48(Utilities.Callback callback, Boolean bool) {
        if (callback != null) {
            callback.run(bool);
        }
    }

    public static void lambda$payAfterConfirmed$50(Utilities.Callback callback, boolean[] zArr, DialogInterface dialogInterface) {
        if (callback == null || zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
    }

    public void lambda$payAfterConfirmed$52(final MessageObject messageObject, final TLRPC$InputInvoice tLRPC$InputInvoice, final Utilities.Callback callback, final BulletinFactory bulletinFactory, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$payAfterConfirmed$51(tLObject, messageObject, tLRPC$InputInvoice, callback, bulletinFactory, tLRPC$TL_error);
            }
        });
    }

    public void lambda$payAfterConfirmed$51(TLObject tLObject, MessageObject messageObject, TLRPC$InputInvoice tLRPC$InputInvoice, Utilities.Callback callback, BulletinFactory bulletinFactory, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_payments_paymentFormStars) {
            payAfterConfirmed(messageObject, tLRPC$InputInvoice, (TLRPC$TL_payments_paymentFormStars) tLObject, callback);
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
        TLRPC$TL_messageMediaPaidMedia tLRPC$TL_messageMediaPaidMedia = (TLRPC$TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage = new TLRPC$TL_messages_editMessage();
        tLRPC$TL_messages_editMessage.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(dialogId);
        int i = tLRPC$TL_messages_editMessage.flags | 32768;
        tLRPC$TL_messages_editMessage.flags = i;
        tLRPC$TL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tLRPC$TL_messages_editMessage.id = id;
        tLRPC$TL_messages_editMessage.flags = i | 16384;
        TLRPC$TL_inputMediaPaidMedia tLRPC$TL_inputMediaPaidMedia = new TLRPC$TL_inputMediaPaidMedia();
        tLRPC$TL_inputMediaPaidMedia.stars_amount = j;
        for (int i2 = 0; i2 < tLRPC$TL_messageMediaPaidMedia.extended_media.size(); i2++) {
            TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia = tLRPC$TL_messageMediaPaidMedia.extended_media.get(i2);
            if (!(tLRPC$MessageExtendedMedia instanceof TLRPC$TL_messageExtendedMedia)) {
                runnable.run();
                return;
            }
            TLRPC$MessageMedia tLRPC$MessageMedia = ((TLRPC$TL_messageExtendedMedia) tLRPC$MessageExtendedMedia).media;
            if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) {
                TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto = new TLRPC$TL_inputMediaPhoto();
                TLRPC$TL_inputPhoto tLRPC$TL_inputPhoto = new TLRPC$TL_inputPhoto();
                TLRPC$Photo tLRPC$Photo = ((TLRPC$TL_messageMediaPhoto) tLRPC$MessageMedia).photo;
                tLRPC$TL_inputPhoto.id = tLRPC$Photo.id;
                tLRPC$TL_inputPhoto.access_hash = tLRPC$Photo.access_hash;
                tLRPC$TL_inputPhoto.file_reference = tLRPC$Photo.file_reference;
                tLRPC$TL_inputMediaPhoto.id = tLRPC$TL_inputPhoto;
                tLRPC$TL_inputMediaPaidMedia.extended_media.add(tLRPC$TL_inputMediaPhoto);
            } else if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) {
                TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument = new TLRPC$TL_inputMediaDocument();
                TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
                TLRPC$Document tLRPC$Document = ((TLRPC$TL_messageMediaDocument) tLRPC$MessageMedia).document;
                tLRPC$TL_inputDocument.id = tLRPC$Document.id;
                tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
                tLRPC$TL_inputDocument.file_reference = tLRPC$Document.file_reference;
                tLRPC$TL_inputMediaDocument.id = tLRPC$TL_inputDocument;
                tLRPC$TL_inputMediaPaidMedia.extended_media.add(tLRPC$TL_inputMediaDocument);
            }
        }
        tLRPC$TL_messages_editMessage.media = tLRPC$TL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StarsController.this.lambda$updateMediaPrice$58(runnable, z, dialogId, id, messageObject, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$updateMediaPrice$58(final Runnable runnable, final boolean z, final long j, final int i, final MessageObject messageObject, final long j2, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$updateMediaPrice$57(tLObject, runnable, tLRPC$TL_error, z, j, i, messageObject, j2);
            }
        });
    }

    public void lambda$updateMediaPrice$57(TLObject tLObject, final Runnable runnable, TLRPC$TL_error tLRPC$TL_error, boolean z, long j, int i, final MessageObject messageObject, final long j2) {
        if (tLObject instanceof TLRPC$Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC$Updates) tLObject, false);
            runnable.run();
        } else if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text) && !z) {
            TLRPC$TL_messages_getScheduledMessages tLRPC$TL_messages_getScheduledMessages = new TLRPC$TL_messages_getScheduledMessages();
            tLRPC$TL_messages_getScheduledMessages.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            tLRPC$TL_messages_getScheduledMessages.id.add(Integer.valueOf(i));
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getScheduledMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    StarsController.this.lambda$updateMediaPrice$56(messageObject, j2, runnable, tLObject2, tLRPC$TL_error2);
                }
            });
        } else {
            runnable.run();
        }
    }

    public void lambda$updateMediaPrice$56(final MessageObject messageObject, final long j, final Runnable runnable, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StarsController.this.lambda$updateMediaPrice$55(tLObject, messageObject, j, runnable);
            }
        });
    }

    public void lambda$updateMediaPrice$55(TLObject tLObject, MessageObject messageObject, long j, Runnable runnable) {
        if (tLObject instanceof TLRPC$TL_messages_messages) {
            TLRPC$TL_messages_messages tLRPC$TL_messages_messages = (TLRPC$TL_messages_messages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_messages_messages.chats, false);
            if (tLRPC$TL_messages_messages.messages.size() == 1 && (tLRPC$TL_messages_messages.messages.get(0) instanceof TLRPC$TL_message) && (tLRPC$TL_messages_messages.messages.get(0).media instanceof TLRPC$TL_messageMediaPaidMedia)) {
                messageObject.messageOwner = tLRPC$TL_messages_messages.messages.get(0);
                updateMediaPrice(messageObject, j, runnable, true);
                return;
            }
            runnable.run();
            return;
        }
        runnable.run();
    }
}
