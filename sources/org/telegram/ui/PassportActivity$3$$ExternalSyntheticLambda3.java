package org.telegram.ui;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.UndoView;

public final class PassportActivity$3$$ExternalSyntheticLambda3 implements AlertDialog.OnButtonClickListener, BillingController.ProductDetailsResponseListenerLegacy {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public PassportActivity$3$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                PassportActivity.AnonymousClass3 anonymousClass3 = (PassportActivity.AnonymousClass3) this.f$0;
                PassportActivity passportActivity = PassportActivity.this;
                passportActivity.inputFields[0].setText((String) this.f$1);
                passportActivity.inputFields[1].setText((String) this.f$2);
                passportActivity.inputFields[2].setText((String) this.f$3);
                passportActivity.showEditDoneProgress$2(true, true);
                anonymousClass3.onIdentityDone((PhotoViewer$$ExternalSyntheticLambda21) this.f$4, (PhotoViewer.AnonymousClass14) this.f$5);
                break;
            default:
                TLRPC.User user = (TLRPC.User) this.f$0;
                AccountInstance accountInstance = (AccountInstance) this.f$1;
                ChatActivity chatActivity = (ChatActivity) this.f$2;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(chatActivity.getDialogId(), user.id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(chatActivity.getDialogId(), -((TLRPC.Chat) this.f$3).id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = ((MessageObject) this.f$4).getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (((CheckBoxCell[]) this.f$5)[0].isChecked()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (chatActivity.getParentActivity() != null) {
                        chatActivity.createUndoView();
                        UndoView undoView = chatActivity.undoView;
                        if (undoView != null) {
                            undoView.showWithAction(0L, 74, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new CallLogActivity$$ExternalSyntheticLambda1(accountInstance, 16));
                break;
        }
    }

    @Override
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        switch (this.$r8$classId) {
            case 2:
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = ((ProductDetails) list.get(0)).getOneTimePurchaseOfferDetails();
                String str = oneTimePurchaseOfferDetails.zzc;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f$0;
                tL_inputStorePaymentPremiumGiveaway.currency = str;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f$1).currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.f$2).sendRequest(tL_payments_canPurchaseStore, new UserInfoActivity$$ExternalSyntheticLambda1((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$3, list, billingResult, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$4, (BaseFragment) this.f$5, tL_inputStorePaymentPremiumGiveaway, 1));
                break;
            default:
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = ((ProductDetails) list.get(0)).getOneTimePurchaseOfferDetails();
                String str2 = oneTimePurchaseOfferDetails2.zzc;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f$0;
                tL_inputStorePaymentPremiumGiftCode.currency = str2;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f$1).currency)) * (oneTimePurchaseOfferDetails2.zzb / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.f$2).sendRequest(tL_payments_canPurchaseStore2, new UserInfoActivity$$ExternalSyntheticLambda1((Utilities.Callback) this.f$3, list, billingResult, (Utilities.Callback) this.f$4, (BaseFragment) this.f$5, tL_inputStorePaymentPremiumGiftCode, 2));
                break;
        }
    }

    public PassportActivity$3$$ExternalSyntheticLambda3(TLRPC.User user, AccountInstance accountInstance, ChatActivity chatActivity, TLRPC.Chat chat, MessageObject messageObject, CheckBoxCell[] checkBoxCellArr, Theme.ResourcesProvider resourcesProvider) {
        this.$r8$classId = 1;
        this.f$0 = user;
        this.f$1 = accountInstance;
        this.f$2 = chatActivity;
        this.f$3 = chat;
        this.f$4 = messageObject;
        this.f$5 = checkBoxCellArr;
    }
}
