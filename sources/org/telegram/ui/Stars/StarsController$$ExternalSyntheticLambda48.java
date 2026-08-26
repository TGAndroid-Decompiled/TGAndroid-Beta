package org.telegram.ui.Stars;

import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;

public final class StarsController$$ExternalSyntheticLambda48 implements Runnable {
    public final int $r8$classId;
    public final StarsController f$0;
    public final TLObject f$1;

    public StarsController$$ExternalSyntheticLambda48(StarsController starsController, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = starsController;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StarsController starsController = this.f$0;
                starsController.insufficientSubscriptionsLoading = false;
                TLObject tLObject = this.f$1;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    int i = starsController.currentAccount;
                    MessagesController.getInstance(i).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i).putChats(starsStatus.chats, false);
                    starsController.insufficientSubscriptions.addAll(starsStatus.subscriptions);
                    starsController.updateBalance(starsStatus.balance);
                    NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                break;
            case 1:
                StarsController starsController2 = this.f$0;
                starsController2.subscriptionsLoading = false;
                TLObject tLObject2 = this.f$1;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    int i2 = starsController2.currentAccount;
                    MessagesController.getInstance(i2).putUsers(starsStatus2.users, false);
                    MessagesController.getInstance(i2).putChats(starsStatus2.chats, false);
                    starsController2.subscriptions.addAll(starsStatus2.subscriptions);
                    starsController2.subscriptionsEndReached = (starsStatus2.flags & 4) == 0;
                    starsController2.subscriptionsOffset = starsStatus2.subscriptions_next_offset;
                    starsController2.updateBalance(starsStatus2.balance);
                    NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                break;
            case 2:
                final StarsController starsController3 = this.f$0;
                starsController3.getClass();
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.f$1;
                if (tLObject3 instanceof Vector) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject3).objects;
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList3.get(i3);
                        i3++;
                        if (obj instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                            arrayList.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    starsController3.optionsLoaded = true;
                }
                starsController3.options = arrayList;
                starsController3.optionsLoading = false;
                NotificationCenter.getInstance(starsController3.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    final int i4 = 0;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    final StarsController starsController4 = starsController3;
                                    starsController4.getClass();
                                    ArrayList arrayList4 = new ArrayList();
                                    int i5 = 0;
                                    while (true) {
                                        final ArrayList arrayList5 = arrayList2;
                                        if (i5 >= arrayList5.size()) {
                                            final int i6 = 0;
                                            BillingController.getInstance().queryProductDetails(arrayList4, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final BillingResult billingResult, final List list) {
                                                    switch (i6) {
                                                        case 0:
                                                            final StarsController starsController5 = starsController4;
                                                            starsController5.getClass();
                                                            final ArrayList arrayList6 = arrayList5;
                                                            final int i7 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i7) {
                                                                        case 0:
                                                                            StarsController starsController6 = starsController5;
                                                                            starsController6.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i8 = 0; i8 < list2.size(); i8++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i8);
                                                                                        int i9 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7 = arrayList6;
                                                                                            if (i9 >= arrayList7.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList7.get(i9)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7.get(i9);
                                                                                            } else {
                                                                                                i9++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController6.options != null) {
                                                                                    for (int i10 = 0; i10 < starsController6.options.size(); i10++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController6.options.get(i10);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController6.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController7 = starsController5;
                                                                            starsController7.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i11 = 0; i11 < list3.size(); i11++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i11);
                                                                                        int i12 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList6;
                                                                                            if (i12 >= arrayList8.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList8.get(i12)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList8.get(i12);
                                                                                            } else {
                                                                                                i12++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController7.giftOptions != null) {
                                                                                    for (int i13 = 0; i13 < starsController7.giftOptions.size(); i13++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) starsController7.giftOptions.get(i13);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController7.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController8 = starsController5;
                                                                            starsController8.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i14 = 0; i14 < list4.size(); i14++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i14);
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList6;
                                                                                            if (i15 >= arrayList9.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList9.get(i15)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList9.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController8.giveawayOptions != null) {
                                                                                    for (int i16 = 0; i16 < starsController8.giveawayOptions.size(); i16++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController8.giveawayOptions.get(i16);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController8.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final StarsController starsController6 = starsController4;
                                                            starsController6.getClass();
                                                            final ArrayList arrayList7 = arrayList5;
                                                            final int i8 = 2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i8) {
                                                                        case 0:
                                                                            StarsController starsController7 = starsController6;
                                                                            starsController7.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i9);
                                                                                        int i10 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList7;
                                                                                            if (i10 >= arrayList8.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList8.get(i10)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList8.get(i10);
                                                                                            } else {
                                                                                                i10++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController7.options != null) {
                                                                                    for (int i11 = 0; i11 < starsController7.options.size(); i11++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController7.options.get(i11);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController7.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController8 = starsController6;
                                                                            starsController8.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i12 = 0; i12 < list3.size(); i12++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i12);
                                                                                        int i13 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList7;
                                                                                            if (i13 >= arrayList9.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList9.get(i13)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList9.get(i13);
                                                                                            } else {
                                                                                                i13++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController8.giftOptions != null) {
                                                                                    for (int i14 = 0; i14 < starsController8.giftOptions.size(); i14++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) starsController8.giftOptions.get(i14);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController8.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController9 = starsController6;
                                                                            starsController9.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i15 = 0; i15 < list4.size(); i15++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i15);
                                                                                        int i16 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList10 = arrayList7;
                                                                                            if (i16 >= arrayList10.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList10.get(i16)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList10.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController9.giveawayOptions != null) {
                                                                                    for (int i17 = 0; i17 < starsController9.giveawayOptions.size(); i17++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController9.giveawayOptions.get(i17);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController9.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final StarsController starsController7 = starsController4;
                                                            starsController7.getClass();
                                                            final ArrayList arrayList8 = arrayList5;
                                                            final int i9 = 1;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i9) {
                                                                        case 0:
                                                                            StarsController starsController8 = starsController7;
                                                                            starsController8.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i10);
                                                                                        int i11 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i11 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i11)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i11);
                                                                                            } else {
                                                                                                i11++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController8.options != null) {
                                                                                    for (int i12 = 0; i12 < starsController8.options.size(); i12++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController8.options.get(i12);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController8.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController9 = starsController7;
                                                                            starsController9.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i13 = 0; i13 < list3.size(); i13++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i13);
                                                                                        int i14 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList10 = arrayList8;
                                                                                            if (i14 >= arrayList10.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList10.get(i14)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList10.get(i14);
                                                                                            } else {
                                                                                                i14++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController9.giftOptions != null) {
                                                                                    for (int i15 = 0; i15 < starsController9.giftOptions.size(); i15++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) starsController9.giftOptions.get(i15);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController9.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController10 = starsController7;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i16 = 0; i16 < list4.size(); i16++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList11 = arrayList8;
                                                                                            if (i17 >= arrayList11.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList11.get(i17)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList11.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.giveawayOptions != null) {
                                                                                    for (int i18 = 0; i18 < starsController10.giveawayOptions.size(); i18++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController10.giveawayOptions.get(i18);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
                                            accountIdentifiers.zzb = "inapp";
                                            accountIdentifiers.zza = ((TL_stars.TL_starsTopupOption) arrayList5.get(i5)).store_product;
                                            arrayList4.add(accountIdentifiers.build());
                                            i5++;
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    final StarsController starsController5 = starsController3;
                                    starsController5.getClass();
                                    ArrayList arrayList6 = new ArrayList();
                                    int i7 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList2;
                                        if (i7 >= arrayList7.size()) {
                                            final int i8 = 2;
                                            BillingController.getInstance().queryProductDetails(arrayList6, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final BillingResult billingResult, final List list) {
                                                    switch (i8) {
                                                        case 0:
                                                            final StarsController starsController6 = starsController5;
                                                            starsController6.getClass();
                                                            final ArrayList arrayList8 = arrayList7;
                                                            final int i9 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i9) {
                                                                        case 0:
                                                                            StarsController starsController8 = starsController6;
                                                                            starsController8.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i10 = 0; i10 < list2.size(); i10++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i10);
                                                                                        int i11 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i11 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i11)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i11);
                                                                                            } else {
                                                                                                i11++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController8.options != null) {
                                                                                    for (int i12 = 0; i12 < starsController8.options.size(); i12++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController8.options.get(i12);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController8.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController9 = starsController6;
                                                                            starsController9.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i13 = 0; i13 < list3.size(); i13++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i13);
                                                                                        int i14 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList10 = arrayList8;
                                                                                            if (i14 >= arrayList10.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList10.get(i14)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList10.get(i14);
                                                                                            } else {
                                                                                                i14++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController9.giftOptions != null) {
                                                                                    for (int i15 = 0; i15 < starsController9.giftOptions.size(); i15++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) starsController9.giftOptions.get(i15);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController9.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController10 = starsController6;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i16 = 0; i16 < list4.size(); i16++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList11 = arrayList8;
                                                                                            if (i17 >= arrayList11.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList11.get(i17)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList11.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.giveawayOptions != null) {
                                                                                    for (int i18 = 0; i18 < starsController10.giveawayOptions.size(); i18++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController10.giveawayOptions.get(i18);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final StarsController starsController7 = starsController5;
                                                            starsController7.getClass();
                                                            final ArrayList arrayList9 = arrayList7;
                                                            final int i10 = 2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i10) {
                                                                        case 0:
                                                                            StarsController starsController8 = starsController7;
                                                                            starsController8.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i11 = 0; i11 < list2.size(); i11++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i11);
                                                                                        int i12 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList10 = arrayList9;
                                                                                            if (i12 >= arrayList10.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList10.get(i12)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList10.get(i12);
                                                                                            } else {
                                                                                                i12++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController8.options != null) {
                                                                                    for (int i13 = 0; i13 < starsController8.options.size(); i13++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController8.options.get(i13);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController8.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController9 = starsController7;
                                                                            starsController9.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i14 = 0; i14 < list3.size(); i14++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i14);
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList11 = arrayList9;
                                                                                            if (i15 >= arrayList11.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList11.get(i15)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList11.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController9.giftOptions != null) {
                                                                                    for (int i16 = 0; i16 < starsController9.giftOptions.size(); i16++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) starsController9.giftOptions.get(i16);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController9.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController10 = starsController7;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i17 = 0; i17 < list4.size(); i17++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList12 = arrayList9;
                                                                                            if (i18 >= arrayList12.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList12.get(i18)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList12.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.giveawayOptions != null) {
                                                                                    for (int i19 = 0; i19 < starsController10.giveawayOptions.size(); i19++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController10.giveawayOptions.get(i19);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final StarsController starsController8 = starsController5;
                                                            starsController8.getClass();
                                                            final ArrayList arrayList10 = arrayList7;
                                                            final int i11 = 1;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i11) {
                                                                        case 0:
                                                                            StarsController starsController9 = starsController8;
                                                                            starsController9.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i12 = 0; i12 < list2.size(); i12++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i12);
                                                                                        int i13 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList11 = arrayList10;
                                                                                            if (i13 >= arrayList11.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList11.get(i13)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList11.get(i13);
                                                                                            } else {
                                                                                                i13++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController9.options != null) {
                                                                                    for (int i14 = 0; i14 < starsController9.options.size(); i14++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController9.options.get(i14);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController9.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController10 = starsController8;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i15 = 0; i15 < list3.size(); i15++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i15);
                                                                                        int i16 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList12 = arrayList10;
                                                                                            if (i16 >= arrayList12.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList12.get(i16)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList12.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.giftOptions != null) {
                                                                                    for (int i17 = 0; i17 < starsController10.giftOptions.size(); i17++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) starsController10.giftOptions.get(i17);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController11 = starsController8;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i18 = 0; i18 < list4.size(); i18++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i18);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList10;
                                                                                            if (i19 >= arrayList13.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList13.get(i19)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList13.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giveawayOptions != null) {
                                                                                    for (int i110 = 0; i110 < starsController11.giveawayOptions.size(); i110++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController11.giveawayOptions.get(i110);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            AccountIdentifiers accountIdentifiers2 = new AccountIdentifiers();
                                            accountIdentifiers2.zzb = "inapp";
                                            accountIdentifiers2.zza = ((TL_stars.TL_starsGiftOption) arrayList7.get(i7)).store_product;
                                            arrayList6.add(accountIdentifiers2.build());
                                            i7++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    final StarsController starsController6 = starsController3;
                                    starsController6.getClass();
                                    ArrayList arrayList8 = new ArrayList();
                                    int i9 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList2;
                                        if (i9 >= arrayList9.size()) {
                                            final int i10 = 1;
                                            BillingController.getInstance().queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final BillingResult billingResult, final List list) {
                                                    switch (i10) {
                                                        case 0:
                                                            final StarsController starsController7 = starsController6;
                                                            starsController7.getClass();
                                                            final ArrayList arrayList10 = arrayList9;
                                                            final int i11 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i11) {
                                                                        case 0:
                                                                            StarsController starsController9 = starsController7;
                                                                            starsController9.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i12 = 0; i12 < list2.size(); i12++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i12);
                                                                                        int i13 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList11 = arrayList10;
                                                                                            if (i13 >= arrayList11.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList11.get(i13)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList11.get(i13);
                                                                                            } else {
                                                                                                i13++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController9.options != null) {
                                                                                    for (int i14 = 0; i14 < starsController9.options.size(); i14++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController9.options.get(i14);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController9.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController10 = starsController7;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i15 = 0; i15 < list3.size(); i15++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i15);
                                                                                        int i16 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList12 = arrayList10;
                                                                                            if (i16 >= arrayList12.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList12.get(i16)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList12.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.giftOptions != null) {
                                                                                    for (int i17 = 0; i17 < starsController10.giftOptions.size(); i17++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) starsController10.giftOptions.get(i17);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController11 = starsController7;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i18 = 0; i18 < list4.size(); i18++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i18);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList10;
                                                                                            if (i19 >= arrayList13.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList13.get(i19)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList13.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giveawayOptions != null) {
                                                                                    for (int i110 = 0; i110 < starsController11.giveawayOptions.size(); i110++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController11.giveawayOptions.get(i110);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final StarsController starsController8 = starsController6;
                                                            starsController8.getClass();
                                                            final ArrayList arrayList11 = arrayList9;
                                                            final int i12 = 2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i12) {
                                                                        case 0:
                                                                            StarsController starsController9 = starsController8;
                                                                            starsController9.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i13 = 0; i13 < list2.size(); i13++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i13);
                                                                                        int i14 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList12 = arrayList11;
                                                                                            if (i14 >= arrayList12.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList12.get(i14)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList12.get(i14);
                                                                                            } else {
                                                                                                i14++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController9.options != null) {
                                                                                    for (int i15 = 0; i15 < starsController9.options.size(); i15++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController9.options.get(i15);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController9.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController10 = starsController8;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i16 = 0; i16 < list3.size(); i16++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList11;
                                                                                            if (i17 >= arrayList13.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList13.get(i17)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList13.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.giftOptions != null) {
                                                                                    for (int i18 = 0; i18 < starsController10.giftOptions.size(); i18++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) starsController10.giftOptions.get(i18);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController11 = starsController8;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i19 = 0; i19 < list4.size(); i19++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList11;
                                                                                            if (i110 >= arrayList14.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList14.get(i110)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList14.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giveawayOptions != null) {
                                                                                    for (int i111 = 0; i111 < starsController11.giveawayOptions.size(); i111++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController11.giveawayOptions.get(i111);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final StarsController starsController9 = starsController6;
                                                            starsController9.getClass();
                                                            final ArrayList arrayList12 = arrayList9;
                                                            final int i13 = 1;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i13) {
                                                                        case 0:
                                                                            StarsController starsController10 = starsController9;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i14);
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList12;
                                                                                            if (i15 >= arrayList13.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList13.get(i15)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList13.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.options != null) {
                                                                                    for (int i16 = 0; i16 < starsController10.options.size(); i16++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController10.options.get(i16);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController11 = starsController9;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList12;
                                                                                            if (i18 >= arrayList14.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList14.get(i18)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList14.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giftOptions != null) {
                                                                                    for (int i19 = 0; i19 < starsController11.giftOptions.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) starsController11.giftOptions.get(i19);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController12 = starsController9;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i110 = 0; i110 < list4.size(); i110++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i110);
                                                                                        int i111 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList12;
                                                                                            if (i111 >= arrayList15.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList15.get(i111)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList15.get(i111);
                                                                                            } else {
                                                                                                i111++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giveawayOptions != null) {
                                                                                    for (int i112 = 0; i112 < starsController12.giveawayOptions.size(); i112++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController12.giveawayOptions.get(i112);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            AccountIdentifiers accountIdentifiers3 = new AccountIdentifiers();
                                            accountIdentifiers3.zzb = "inapp";
                                            accountIdentifiers3.zza = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i9)).store_product;
                                            arrayList8.add(accountIdentifiers3.build());
                                            i9++;
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable);
                    } else {
                        runnable.run();
                    }
                }
                break;
            case 3:
                final StarsController starsController4 = this.f$0;
                starsController4.getClass();
                ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                TLObject tLObject4 = this.f$1;
                if (tLObject4 instanceof Vector) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject4).objects;
                    int size2 = arrayList6.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList6.get(i5);
                        i5++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    starsController4.giftOptionsLoaded = true;
                }
                starsController4.giftOptions = arrayList4;
                starsController4.giftOptionsLoading = false;
                NotificationCenter.getInstance(starsController4.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    final int i6 = 1;
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    final StarsController starsController5 = starsController4;
                                    starsController5.getClass();
                                    ArrayList arrayList7 = new ArrayList();
                                    int i7 = 0;
                                    while (true) {
                                        final ArrayList arrayList8 = arrayList5;
                                        if (i7 >= arrayList8.size()) {
                                            final int i8 = 0;
                                            BillingController.getInstance().queryProductDetails(arrayList7, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final BillingResult billingResult, final List list) {
                                                    switch (i8) {
                                                        case 0:
                                                            final StarsController starsController7 = starsController5;
                                                            starsController7.getClass();
                                                            final ArrayList arrayList10 = arrayList8;
                                                            final int i11 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i11) {
                                                                        case 0:
                                                                            StarsController starsController10 = starsController7;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i14);
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList10;
                                                                                            if (i15 >= arrayList13.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList13.get(i15)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList13.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.options != null) {
                                                                                    for (int i16 = 0; i16 < starsController10.options.size(); i16++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController10.options.get(i16);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController11 = starsController7;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList10;
                                                                                            if (i18 >= arrayList14.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList14.get(i18)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList14.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giftOptions != null) {
                                                                                    for (int i19 = 0; i19 < starsController11.giftOptions.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController11.giftOptions.get(i19);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController12 = starsController7;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i110 = 0; i110 < list4.size(); i110++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i110);
                                                                                        int i111 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList10;
                                                                                            if (i111 >= arrayList15.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList15.get(i111)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList15.get(i111);
                                                                                            } else {
                                                                                                i111++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giveawayOptions != null) {
                                                                                    for (int i112 = 0; i112 < starsController12.giveawayOptions.size(); i112++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController12.giveawayOptions.get(i112);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final StarsController starsController8 = starsController5;
                                                            starsController8.getClass();
                                                            final ArrayList arrayList11 = arrayList8;
                                                            final int i12 = 2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i12) {
                                                                        case 0:
                                                                            StarsController starsController10 = starsController8;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i14);
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList11;
                                                                                            if (i15 >= arrayList13.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList13.get(i15)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList13.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.options != null) {
                                                                                    for (int i16 = 0; i16 < starsController10.options.size(); i16++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController10.options.get(i16);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController11 = starsController8;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList11;
                                                                                            if (i18 >= arrayList14.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList14.get(i18)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList14.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giftOptions != null) {
                                                                                    for (int i19 = 0; i19 < starsController11.giftOptions.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController11.giftOptions.get(i19);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController12 = starsController8;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i110 = 0; i110 < list4.size(); i110++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i110);
                                                                                        int i111 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList11;
                                                                                            if (i111 >= arrayList15.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList15.get(i111)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList15.get(i111);
                                                                                            } else {
                                                                                                i111++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giveawayOptions != null) {
                                                                                    for (int i112 = 0; i112 < starsController12.giveawayOptions.size(); i112++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController12.giveawayOptions.get(i112);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final StarsController starsController9 = starsController5;
                                                            starsController9.getClass();
                                                            final ArrayList arrayList12 = arrayList8;
                                                            final int i13 = 1;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i13) {
                                                                        case 0:
                                                                            StarsController starsController10 = starsController9;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i14);
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList12;
                                                                                            if (i15 >= arrayList13.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList13.get(i15)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList13.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.options != null) {
                                                                                    for (int i16 = 0; i16 < starsController10.options.size(); i16++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController10.options.get(i16);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController11 = starsController9;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList12;
                                                                                            if (i18 >= arrayList14.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList14.get(i18)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList14.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giftOptions != null) {
                                                                                    for (int i19 = 0; i19 < starsController11.giftOptions.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController11.giftOptions.get(i19);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController12 = starsController9;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i110 = 0; i110 < list4.size(); i110++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i110);
                                                                                        int i111 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList12;
                                                                                            if (i111 >= arrayList15.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList15.get(i111)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList15.get(i111);
                                                                                            } else {
                                                                                                i111++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giveawayOptions != null) {
                                                                                    for (int i112 = 0; i112 < starsController12.giveawayOptions.size(); i112++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController12.giveawayOptions.get(i112);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
                                            accountIdentifiers.zzb = "inapp";
                                            accountIdentifiers.zza = ((TL_stars.TL_starsTopupOption) arrayList8.get(i7)).store_product;
                                            arrayList7.add(accountIdentifiers.build());
                                            i7++;
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    final StarsController starsController6 = starsController4;
                                    starsController6.getClass();
                                    ArrayList arrayList9 = new ArrayList();
                                    int i9 = 0;
                                    while (true) {
                                        final ArrayList arrayList10 = arrayList5;
                                        if (i9 >= arrayList10.size()) {
                                            final int i10 = 2;
                                            BillingController.getInstance().queryProductDetails(arrayList9, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final BillingResult billingResult, final List list) {
                                                    switch (i10) {
                                                        case 0:
                                                            final StarsController starsController7 = starsController6;
                                                            starsController7.getClass();
                                                            final ArrayList arrayList11 = arrayList10;
                                                            final int i11 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i11) {
                                                                        case 0:
                                                                            StarsController starsController10 = starsController7;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i14);
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList11;
                                                                                            if (i15 >= arrayList13.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList13.get(i15)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList13.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.options != null) {
                                                                                    for (int i16 = 0; i16 < starsController10.options.size(); i16++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController10.options.get(i16);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController11 = starsController7;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList11;
                                                                                            if (i18 >= arrayList14.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList14.get(i18)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList14.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giftOptions != null) {
                                                                                    for (int i19 = 0; i19 < starsController11.giftOptions.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController11.giftOptions.get(i19);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController12 = starsController7;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i110 = 0; i110 < list4.size(); i110++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i110);
                                                                                        int i111 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList11;
                                                                                            if (i111 >= arrayList15.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList15.get(i111)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList15.get(i111);
                                                                                            } else {
                                                                                                i111++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giveawayOptions != null) {
                                                                                    for (int i112 = 0; i112 < starsController12.giveawayOptions.size(); i112++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController12.giveawayOptions.get(i112);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final StarsController starsController8 = starsController6;
                                                            starsController8.getClass();
                                                            final ArrayList arrayList12 = arrayList10;
                                                            final int i12 = 2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i12) {
                                                                        case 0:
                                                                            StarsController starsController10 = starsController8;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i14);
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList13 = arrayList12;
                                                                                            if (i15 >= arrayList13.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList13.get(i15)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList13.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.options != null) {
                                                                                    for (int i16 = 0; i16 < starsController10.options.size(); i16++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController10.options.get(i16);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController11 = starsController8;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList12;
                                                                                            if (i18 >= arrayList14.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList14.get(i18)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList14.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giftOptions != null) {
                                                                                    for (int i19 = 0; i19 < starsController11.giftOptions.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController11.giftOptions.get(i19);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController12 = starsController8;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i110 = 0; i110 < list4.size(); i110++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i110);
                                                                                        int i111 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList12;
                                                                                            if (i111 >= arrayList15.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList15.get(i111)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList15.get(i111);
                                                                                            } else {
                                                                                                i111++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giveawayOptions != null) {
                                                                                    for (int i112 = 0; i112 < starsController12.giveawayOptions.size(); i112++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController12.giveawayOptions.get(i112);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final StarsController starsController9 = starsController6;
                                                            starsController9.getClass();
                                                            final ArrayList arrayList13 = arrayList10;
                                                            final int i13 = 1;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i13) {
                                                                        case 0:
                                                                            StarsController starsController10 = starsController9;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i14);
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList13;
                                                                                            if (i15 >= arrayList14.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList14.get(i15)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList14.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.options != null) {
                                                                                    for (int i16 = 0; i16 < starsController10.options.size(); i16++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController10.options.get(i16);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController11 = starsController9;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList13;
                                                                                            if (i18 >= arrayList15.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList15.get(i18)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList15.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giftOptions != null) {
                                                                                    for (int i19 = 0; i19 < starsController11.giftOptions.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController11.giftOptions.get(i19);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController12 = starsController9;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i110 = 0; i110 < list4.size(); i110++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i110);
                                                                                        int i111 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList13;
                                                                                            if (i111 >= arrayList16.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList16.get(i111)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList16.get(i111);
                                                                                            } else {
                                                                                                i111++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giveawayOptions != null) {
                                                                                    for (int i112 = 0; i112 < starsController12.giveawayOptions.size(); i112++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController12.giveawayOptions.get(i112);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            AccountIdentifiers accountIdentifiers2 = new AccountIdentifiers();
                                            accountIdentifiers2.zzb = "inapp";
                                            accountIdentifiers2.zza = ((TL_stars.TL_starsGiftOption) arrayList10.get(i9)).store_product;
                                            arrayList9.add(accountIdentifiers2.build());
                                            i9++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    final StarsController starsController7 = starsController4;
                                    starsController7.getClass();
                                    ArrayList arrayList11 = new ArrayList();
                                    int i11 = 0;
                                    while (true) {
                                        final ArrayList arrayList12 = arrayList5;
                                        if (i11 >= arrayList12.size()) {
                                            final int i12 = 1;
                                            BillingController.getInstance().queryProductDetails(arrayList11, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final BillingResult billingResult, final List list) {
                                                    switch (i12) {
                                                        case 0:
                                                            final StarsController starsController8 = starsController7;
                                                            starsController8.getClass();
                                                            final ArrayList arrayList13 = arrayList12;
                                                            final int i13 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i13) {
                                                                        case 0:
                                                                            StarsController starsController10 = starsController8;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i14 = 0; i14 < list2.size(); i14++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i14);
                                                                                        int i15 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList14 = arrayList13;
                                                                                            if (i15 >= arrayList14.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList14.get(i15)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList14.get(i15);
                                                                                            } else {
                                                                                                i15++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.options != null) {
                                                                                    for (int i16 = 0; i16 < starsController10.options.size(); i16++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController10.options.get(i16);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController11 = starsController8;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i17 = 0; i17 < list3.size(); i17++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList13;
                                                                                            if (i18 >= arrayList15.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList15.get(i18)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList15.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giftOptions != null) {
                                                                                    for (int i19 = 0; i19 < starsController11.giftOptions.size(); i19++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController11.giftOptions.get(i19);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController12 = starsController8;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i110 = 0; i110 < list4.size(); i110++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i110);
                                                                                        int i111 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList13;
                                                                                            if (i111 >= arrayList16.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList16.get(i111)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList16.get(i111);
                                                                                            } else {
                                                                                                i111++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giveawayOptions != null) {
                                                                                    for (int i112 = 0; i112 < starsController12.giveawayOptions.size(); i112++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController12.giveawayOptions.get(i112);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final StarsController starsController9 = starsController7;
                                                            starsController9.getClass();
                                                            final ArrayList arrayList14 = arrayList12;
                                                            final int i14 = 2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i14) {
                                                                        case 0:
                                                                            StarsController starsController10 = starsController9;
                                                                            starsController10.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i15 = 0; i15 < list2.size(); i15++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i15);
                                                                                        int i16 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList15 = arrayList14;
                                                                                            if (i16 >= arrayList15.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList15.get(i16)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList15.get(i16);
                                                                                            } else {
                                                                                                i16++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController10.options != null) {
                                                                                    for (int i17 = 0; i17 < starsController10.options.size(); i17++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController10.options.get(i17);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController10.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController11 = starsController9;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i18 = 0; i18 < list3.size(); i18++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i18);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList14;
                                                                                            if (i19 >= arrayList16.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList16.get(i19)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList16.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.giftOptions != null) {
                                                                                    for (int i110 = 0; i110 < starsController11.giftOptions.size(); i110++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController11.giftOptions.get(i110);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController12 = starsController9;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i111 = 0; i111 < list4.size(); i111++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i111);
                                                                                        int i112 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList14;
                                                                                            if (i112 >= arrayList17.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList17.get(i112)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList17.get(i112);
                                                                                            } else {
                                                                                                i112++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giveawayOptions != null) {
                                                                                    for (int i113 = 0; i113 < starsController12.giveawayOptions.size(); i113++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController12.giveawayOptions.get(i113);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final StarsController starsController10 = starsController7;
                                                            starsController10.getClass();
                                                            final ArrayList arrayList15 = arrayList12;
                                                            final int i15 = 1;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i15) {
                                                                        case 0:
                                                                            StarsController starsController11 = starsController10;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList15;
                                                                                            if (i17 >= arrayList16.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList16.get(i17)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList16.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.options != null) {
                                                                                    for (int i18 = 0; i18 < starsController11.options.size(); i18++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController11.options.get(i18);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController12 = starsController10;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList15;
                                                                                            if (i110 >= arrayList17.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList17.get(i110)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList17.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giftOptions != null) {
                                                                                    for (int i111 = 0; i111 < starsController12.giftOptions.size(); i111++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController12.giftOptions.get(i111);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController13 = starsController10;
                                                                            starsController13.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i112 = 0; i112 < list4.size(); i112++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i112);
                                                                                        int i113 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList15;
                                                                                            if (i113 >= arrayList18.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList18.get(i113)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList18.get(i113);
                                                                                            } else {
                                                                                                i113++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController13.giveawayOptions != null) {
                                                                                    for (int i114 = 0; i114 < starsController13.giveawayOptions.size(); i114++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) starsController13.giveawayOptions.get(i114);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController13.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            AccountIdentifiers accountIdentifiers3 = new AccountIdentifiers();
                                            accountIdentifiers3.zzb = "inapp";
                                            accountIdentifiers3.zza = ((TL_stars.TL_starsGiveawayOption) arrayList12.get(i11)).store_product;
                                            arrayList11.add(accountIdentifiers3.build());
                                            i11++;
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable2);
                    } else {
                        runnable2.run();
                    }
                }
                break;
            case 4:
                final StarsController starsController5 = this.f$0;
                starsController5.getClass();
                ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                TLObject tLObject5 = this.f$1;
                if (tLObject5 instanceof Vector) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject5).objects;
                    int size3 = arrayList9.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj3 = arrayList9.get(i7);
                        i7++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    starsController5.giveawayOptionsLoaded = true;
                }
                starsController5.giveawayOptions = arrayList7;
                starsController5.giveawayOptionsLoading = false;
                NotificationCenter.getInstance(starsController5.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    final int i8 = 2;
                    Runnable runnable3 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (i8) {
                                case 0:
                                    final StarsController starsController6 = starsController5;
                                    starsController6.getClass();
                                    ArrayList arrayList10 = new ArrayList();
                                    int i9 = 0;
                                    while (true) {
                                        final ArrayList arrayList11 = arrayList8;
                                        if (i9 >= arrayList11.size()) {
                                            final int i10 = 0;
                                            BillingController.getInstance().queryProductDetails(arrayList10, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final BillingResult billingResult, final List list) {
                                                    switch (i10) {
                                                        case 0:
                                                            final StarsController starsController8 = starsController6;
                                                            starsController8.getClass();
                                                            final ArrayList arrayList13 = arrayList11;
                                                            final int i13 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i13) {
                                                                        case 0:
                                                                            StarsController starsController11 = starsController8;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList13;
                                                                                            if (i17 >= arrayList16.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList16.get(i17)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList16.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.options != null) {
                                                                                    for (int i18 = 0; i18 < starsController11.options.size(); i18++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController11.options.get(i18);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController12 = starsController8;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList13;
                                                                                            if (i110 >= arrayList17.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList17.get(i110)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList17.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giftOptions != null) {
                                                                                    for (int i111 = 0; i111 < starsController12.giftOptions.size(); i111++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController12.giftOptions.get(i111);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController13 = starsController8;
                                                                            starsController13.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i112 = 0; i112 < list4.size(); i112++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i112);
                                                                                        int i113 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList13;
                                                                                            if (i113 >= arrayList18.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList18.get(i113)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList18.get(i113);
                                                                                            } else {
                                                                                                i113++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController13.giveawayOptions != null) {
                                                                                    for (int i114 = 0; i114 < starsController13.giveawayOptions.size(); i114++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) starsController13.giveawayOptions.get(i114);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController13.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final StarsController starsController9 = starsController6;
                                                            starsController9.getClass();
                                                            final ArrayList arrayList14 = arrayList11;
                                                            final int i14 = 2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i14) {
                                                                        case 0:
                                                                            StarsController starsController11 = starsController9;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList14;
                                                                                            if (i17 >= arrayList16.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList16.get(i17)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList16.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.options != null) {
                                                                                    for (int i18 = 0; i18 < starsController11.options.size(); i18++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController11.options.get(i18);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController12 = starsController9;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList14;
                                                                                            if (i110 >= arrayList17.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList17.get(i110)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList17.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giftOptions != null) {
                                                                                    for (int i111 = 0; i111 < starsController12.giftOptions.size(); i111++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController12.giftOptions.get(i111);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController13 = starsController9;
                                                                            starsController13.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i112 = 0; i112 < list4.size(); i112++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i112);
                                                                                        int i113 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList14;
                                                                                            if (i113 >= arrayList18.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList18.get(i113)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList18.get(i113);
                                                                                            } else {
                                                                                                i113++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController13.giveawayOptions != null) {
                                                                                    for (int i114 = 0; i114 < starsController13.giveawayOptions.size(); i114++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) starsController13.giveawayOptions.get(i114);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController13.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final StarsController starsController10 = starsController6;
                                                            starsController10.getClass();
                                                            final ArrayList arrayList15 = arrayList11;
                                                            final int i15 = 1;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i15) {
                                                                        case 0:
                                                                            StarsController starsController11 = starsController10;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList15;
                                                                                            if (i17 >= arrayList16.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList16.get(i17)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList16.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.options != null) {
                                                                                    for (int i18 = 0; i18 < starsController11.options.size(); i18++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController11.options.get(i18);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController12 = starsController10;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList15;
                                                                                            if (i110 >= arrayList17.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList17.get(i110)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList17.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giftOptions != null) {
                                                                                    for (int i111 = 0; i111 < starsController12.giftOptions.size(); i111++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController12.giftOptions.get(i111);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController13 = starsController10;
                                                                            starsController13.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i112 = 0; i112 < list4.size(); i112++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i112);
                                                                                        int i113 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList15;
                                                                                            if (i113 >= arrayList18.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList18.get(i113)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList18.get(i113);
                                                                                            } else {
                                                                                                i113++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController13.giveawayOptions != null) {
                                                                                    for (int i114 = 0; i114 < starsController13.giveawayOptions.size(); i114++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) starsController13.giveawayOptions.get(i114);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController13.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
                                            accountIdentifiers.zzb = "inapp";
                                            accountIdentifiers.zza = ((TL_stars.TL_starsTopupOption) arrayList11.get(i9)).store_product;
                                            arrayList10.add(accountIdentifiers.build());
                                            i9++;
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    final StarsController starsController7 = starsController5;
                                    starsController7.getClass();
                                    ArrayList arrayList12 = new ArrayList();
                                    int i11 = 0;
                                    while (true) {
                                        final ArrayList arrayList13 = arrayList8;
                                        if (i11 >= arrayList13.size()) {
                                            final int i12 = 2;
                                            BillingController.getInstance().queryProductDetails(arrayList12, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final BillingResult billingResult, final List list) {
                                                    switch (i12) {
                                                        case 0:
                                                            final StarsController starsController8 = starsController7;
                                                            starsController8.getClass();
                                                            final ArrayList arrayList14 = arrayList13;
                                                            final int i13 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i13) {
                                                                        case 0:
                                                                            StarsController starsController11 = starsController8;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList14;
                                                                                            if (i17 >= arrayList16.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList16.get(i17)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList16.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.options != null) {
                                                                                    for (int i18 = 0; i18 < starsController11.options.size(); i18++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController11.options.get(i18);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController12 = starsController8;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList14;
                                                                                            if (i110 >= arrayList17.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList17.get(i110)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList17.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giftOptions != null) {
                                                                                    for (int i111 = 0; i111 < starsController12.giftOptions.size(); i111++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController12.giftOptions.get(i111);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController13 = starsController8;
                                                                            starsController13.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i112 = 0; i112 < list4.size(); i112++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i112);
                                                                                        int i113 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList14;
                                                                                            if (i113 >= arrayList18.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList18.get(i113)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList18.get(i113);
                                                                                            } else {
                                                                                                i113++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController13.giveawayOptions != null) {
                                                                                    for (int i114 = 0; i114 < starsController13.giveawayOptions.size(); i114++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) starsController13.giveawayOptions.get(i114);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController13.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final StarsController starsController9 = starsController7;
                                                            starsController9.getClass();
                                                            final ArrayList arrayList15 = arrayList13;
                                                            final int i14 = 2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i14) {
                                                                        case 0:
                                                                            StarsController starsController11 = starsController9;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList16 = arrayList15;
                                                                                            if (i17 >= arrayList16.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList16.get(i17)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList16.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.options != null) {
                                                                                    for (int i18 = 0; i18 < starsController11.options.size(); i18++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController11.options.get(i18);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController12 = starsController9;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList15;
                                                                                            if (i110 >= arrayList17.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList17.get(i110)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList17.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giftOptions != null) {
                                                                                    for (int i111 = 0; i111 < starsController12.giftOptions.size(); i111++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController12.giftOptions.get(i111);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController13 = starsController9;
                                                                            starsController13.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i112 = 0; i112 < list4.size(); i112++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i112);
                                                                                        int i113 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList15;
                                                                                            if (i113 >= arrayList18.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList18.get(i113)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList18.get(i113);
                                                                                            } else {
                                                                                                i113++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController13.giveawayOptions != null) {
                                                                                    for (int i114 = 0; i114 < starsController13.giveawayOptions.size(); i114++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) starsController13.giveawayOptions.get(i114);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController13.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final StarsController starsController10 = starsController7;
                                                            starsController10.getClass();
                                                            final ArrayList arrayList16 = arrayList13;
                                                            final int i15 = 1;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i15) {
                                                                        case 0:
                                                                            StarsController starsController11 = starsController10;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList16;
                                                                                            if (i17 >= arrayList17.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList17.get(i17)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList17.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.options != null) {
                                                                                    for (int i18 = 0; i18 < starsController11.options.size(); i18++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController11.options.get(i18);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController12 = starsController10;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList16;
                                                                                            if (i110 >= arrayList18.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList18.get(i110)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList18.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giftOptions != null) {
                                                                                    for (int i111 = 0; i111 < starsController12.giftOptions.size(); i111++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController12.giftOptions.get(i111);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController13 = starsController10;
                                                                            starsController13.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i112 = 0; i112 < list4.size(); i112++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i112);
                                                                                        int i113 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList19 = arrayList16;
                                                                                            if (i113 >= arrayList19.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList19.get(i113)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList19.get(i113);
                                                                                            } else {
                                                                                                i113++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController13.giveawayOptions != null) {
                                                                                    for (int i114 = 0; i114 < starsController13.giveawayOptions.size(); i114++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) starsController13.giveawayOptions.get(i114);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController13.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            AccountIdentifiers accountIdentifiers2 = new AccountIdentifiers();
                                            accountIdentifiers2.zzb = "inapp";
                                            accountIdentifiers2.zza = ((TL_stars.TL_starsGiftOption) arrayList13.get(i11)).store_product;
                                            arrayList12.add(accountIdentifiers2.build());
                                            i11++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    final StarsController starsController8 = starsController5;
                                    starsController8.getClass();
                                    ArrayList arrayList14 = new ArrayList();
                                    int i13 = 0;
                                    while (true) {
                                        final ArrayList arrayList15 = arrayList8;
                                        if (i13 >= arrayList15.size()) {
                                            final int i14 = 1;
                                            BillingController.getInstance().queryProductDetails(arrayList14, new BillingController.ProductDetailsResponseListenerLegacy() {
                                                @Override
                                                public final void onProductDetailsResponse(final BillingResult billingResult, final List list) {
                                                    switch (i14) {
                                                        case 0:
                                                            final StarsController starsController9 = starsController8;
                                                            starsController9.getClass();
                                                            final ArrayList arrayList16 = arrayList15;
                                                            final int i15 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i15) {
                                                                        case 0:
                                                                            StarsController starsController11 = starsController9;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList17 = arrayList16;
                                                                                            if (i17 >= arrayList17.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList17.get(i17)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList17.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.options != null) {
                                                                                    for (int i18 = 0; i18 < starsController11.options.size(); i18++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController11.options.get(i18);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController12 = starsController9;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i19);
                                                                                        int i110 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList16;
                                                                                            if (i110 >= arrayList18.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList18.get(i110)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList18.get(i110);
                                                                                            } else {
                                                                                                i110++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giftOptions != null) {
                                                                                    for (int i111 = 0; i111 < starsController12.giftOptions.size(); i111++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController12.giftOptions.get(i111);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController13 = starsController9;
                                                                            starsController13.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i112 = 0; i112 < list4.size(); i112++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i112);
                                                                                        int i113 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList19 = arrayList16;
                                                                                            if (i113 >= arrayList19.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList19.get(i113)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList19.get(i113);
                                                                                            } else {
                                                                                                i113++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController13.giveawayOptions != null) {
                                                                                    for (int i114 = 0; i114 < starsController13.giveawayOptions.size(); i114++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) starsController13.giveawayOptions.get(i114);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController13.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final StarsController starsController10 = starsController8;
                                                            starsController10.getClass();
                                                            final ArrayList arrayList17 = arrayList15;
                                                            final int i16 = 2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i16) {
                                                                        case 0:
                                                                            StarsController starsController11 = starsController10;
                                                                            starsController11.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i17 = 0; i17 < list2.size(); i17++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i17);
                                                                                        int i18 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList18 = arrayList17;
                                                                                            if (i18 >= arrayList18.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList18.get(i18)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList18.get(i18);
                                                                                            } else {
                                                                                                i18++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController11.options != null) {
                                                                                    for (int i19 = 0; i19 < starsController11.options.size(); i19++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController11.options.get(i19);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController11.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController12 = starsController10;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i110 = 0; i110 < list3.size(); i110++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i110);
                                                                                        int i111 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList19 = arrayList17;
                                                                                            if (i111 >= arrayList19.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList19.get(i111)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList19.get(i111);
                                                                                            } else {
                                                                                                i111++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.giftOptions != null) {
                                                                                    for (int i112 = 0; i112 < starsController12.giftOptions.size(); i112++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController12.giftOptions.get(i112);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController13 = starsController10;
                                                                            starsController13.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i113 = 0; i113 < list4.size(); i113++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i113);
                                                                                        int i114 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList110 = arrayList17;
                                                                                            if (i114 >= arrayList110.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList110.get(i114)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList110.get(i114);
                                                                                            } else {
                                                                                                i114++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController13.giveawayOptions != null) {
                                                                                    for (int i115 = 0; i115 < starsController13.giveawayOptions.size(); i115++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) starsController13.giveawayOptions.get(i115);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController13.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final StarsController starsController11 = starsController8;
                                                            starsController11.getClass();
                                                            final ArrayList arrayList18 = arrayList15;
                                                            final int i17 = 1;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
                                                                    switch (i17) {
                                                                        case 0:
                                                                            StarsController starsController12 = starsController11;
                                                                            starsController12.getClass();
                                                                            BillingResult billingResult2 = billingResult;
                                                                            if (billingResult2.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult2.zza));
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i18 = 0; i18 < list2.size(); i18++) {
                                                                                        ProductDetails productDetails = (ProductDetails) list2.get(i18);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList19 = arrayList18;
                                                                                            if (i19 >= arrayList19.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList19.get(i19)).store_product.equals(productDetails.zzc)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList19.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsTopupOption2.currency = oneTimePurchaseOfferDetails.zzc;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController12.options != null) {
                                                                                    for (int i110 = 0; i110 < starsController12.options.size(); i110++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) starsController12.options.get(i110);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController12.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            StarsController starsController13 = starsController11;
                                                                            starsController13.getClass();
                                                                            BillingResult billingResult3 = billingResult;
                                                                            if (billingResult3.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult3.zza));
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i111 = 0; i111 < list3.size(); i111++) {
                                                                                        ProductDetails productDetails2 = (ProductDetails) list3.get(i111);
                                                                                        int i112 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList110 = arrayList18;
                                                                                            if (i112 >= arrayList110.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList110.get(i112)).store_product.equals(productDetails2.zzc)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList110.get(i112);
                                                                                            } else {
                                                                                                i112++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (oneTimePurchaseOfferDetails2 = productDetails2.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiftOption2.currency = oneTimePurchaseOfferDetails2.zzc;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController13.giftOptions != null) {
                                                                                    for (int i113 = 0; i113 < starsController13.giftOptions.size(); i113++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption3 = (TL_stars.TL_starsGiftOption) starsController13.giftOptions.get(i113);
                                                                                        if (tL_starsGiftOption3 != null && tL_starsGiftOption3.loadingStorePrice) {
                                                                                            tL_starsGiftOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController13.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                        default:
                                                                            StarsController starsController14 = starsController11;
                                                                            starsController14.getClass();
                                                                            BillingResult billingResult4 = billingResult;
                                                                            if (billingResult4.zza != 0) {
                                                                                StarsController.bulletinError("BILLING_" + BillingController.getResponseCodeString(billingResult4.zza));
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i114 = 0; i114 < list4.size(); i114++) {
                                                                                        ProductDetails productDetails3 = (ProductDetails) list4.get(i114);
                                                                                        int i115 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList111 = arrayList18;
                                                                                            if (i115 >= arrayList111.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList111.get(i115)).store_product.equals(productDetails3.zzc)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList111.get(i115);
                                                                                            } else {
                                                                                                i115++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (oneTimePurchaseOfferDetails3 = productDetails3.getOneTimePurchaseOfferDetails()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = oneTimePurchaseOfferDetails3.zzc;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (oneTimePurchaseOfferDetails3.zzb / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (starsController14.giveawayOptions != null) {
                                                                                    for (int i116 = 0; i116 < starsController14.giveawayOptions.size(); i116++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption3 = (TL_stars.TL_starsGiveawayOption) starsController14.giveawayOptions.get(i116);
                                                                                        if (tL_starsGiveawayOption3 != null && tL_starsGiveawayOption3.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(starsController14.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        } else {
                                            AccountIdentifiers accountIdentifiers3 = new AccountIdentifiers();
                                            accountIdentifiers3.zzb = "inapp";
                                            accountIdentifiers3.zza = ((TL_stars.TL_starsGiveawayOption) arrayList15.get(i13)).store_product;
                                            arrayList14.add(accountIdentifiers3.build());
                                            i13++;
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable3);
                    } else {
                        runnable3.run();
                    }
                }
                break;
            default:
                MessagesController.getInstance(this.f$0.currentAccount).processUpdates((TLRPC.Updates) this.f$1, false);
                break;
        }
    }
}
