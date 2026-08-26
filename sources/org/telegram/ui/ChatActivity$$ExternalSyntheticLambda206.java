package org.telegram.ui;

import android.os.Bundle;
import android.text.style.CharacterStyle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Stars.StarsController;

public final class ChatActivity$$ExternalSyntheticLambda206 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda206(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375(chatActivity, (ChatActivity.AnonymousClass127) this.f$1, (ChatMessageCell) this.f$2, (String) this.f$3, tLObject, (CharacterStyle) this.f$4, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375(tLObject, this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, 3));
                break;
            case 2:
                ChatActivity chatActivity2 = (ChatActivity) this.f$0;
                chatActivity2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda135(chatActivity2, tL_error, (TLObject) this.f$2, tLObject, (ChatActivity$$ExternalSyntheticLambda301) this.f$4, (String) this.f$3, (ChatActivity.AnonymousClass127) this.f$1));
                break;
            case 3:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                chatMessageCellDelegate.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda135(chatMessageCellDelegate, (AlertDialog) this.f$1, tLObject, (HashSet) this.f$2, (TLRPC.TL_inputGroupCallInviteMessage) this.f$3, (MessageObject) this.f$4, tL_error));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375((Object) tL_error, this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, 5));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda135(tL_error, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0, tLObject, (MessagesController) this.f$1, (TLRPC.TL_inputInvoicePremiumGiftCode) this.f$2, (BaseFragment) this.f$3, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$4, 3));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda135(tL_error, (Utilities.Callback) this.f$0, tLObject, (MessagesController) this.f$1, (TLRPC.TL_inputInvoicePremiumGiftCode) this.f$2, (BaseFragment) this.f$3, (Utilities.Callback) this.f$4, 4));
                break;
            case 7:
                StickersAlert stickersAlert = (StickersAlert) this.f$0;
                stickersAlert.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375((Object) stickersAlert, tLObject, this.f$1, this.f$2, this.f$3, this.f$4, 6));
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda135(launchActivity, (AlertDialog) this.f$1, tL_error, (String) this.f$3, (Bundle) this.f$2, tLObject, (TL_account.sendConfirmPhoneCode) this.f$4));
                break;
            case 9:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) this.f$0;
                loginPayView.getClass();
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = arrayListFindUpdatesAndRemove.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListFindUpdatesAndRemove.get(i);
                        i++;
                        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(loginPayView, (TLRPC.TL_inputStorePaymentAuthCode) this.f$1, (TL_update.TL_updateSentPhoneCode) obj, 19));
                    }
                    LoginActivity.this.getMessagesController().processUpdates(updates, false);
                    BillingController.getInstance().consumeGiftPurchase((Purchase) this.f$2, ((TLRPC.TL_payments_canPurchaseStore) this.f$3).purpose, null);
                    AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda4(loginPayView, 0));
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6((LinkManager$$ExternalSyntheticLambda12) this.f$4, 23));
                }
                break;
            case 10:
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) this.f$0;
                phoneView.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda135(phoneView, tL_error, tLObject, (Bundle) this.f$1, (String) this.f$3, (ChatActivity.AnonymousClass117) this.f$2, (TLObject) this.f$4, 7));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda135(this.f$0, (Object) tLObject, (String) this.f$3, (TLObject) this.f$1, this.f$2, (Object) tL_error, this.f$4, 8));
                break;
            case 12:
                SelectChatUserSheet selectChatUserSheet = (SelectChatUserSheet) this.f$0;
                selectChatUserSheet.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375((Object) selectChatUserSheet, (Object) tL_error, this.f$1, this.f$2, this.f$3, this.f$4, 11));
                break;
            case 13:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda135(starsController, tLObject, (MessageObject) this.f$1, (TLRPC.InputInvoice) this.f$2, (Utilities.Callback) this.f$3, (BulletinFactory) this.f$4, tL_error, 10));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375(this.f$0, tLObject, this.f$1, this.f$2, this.f$3, this.f$4, 20));
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda206(Object obj, Object obj2, String str, Object obj3, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = str;
        this.f$2 = obj3;
        this.f$4 = tLObject;
    }

    public ChatActivity$$ExternalSyntheticLambda206(ChatActivity chatActivity, TLObject tLObject, ChatActivity$$ExternalSyntheticLambda301 chatActivity$$ExternalSyntheticLambda301, String str, ChatActivity.AnonymousClass127 anonymousClass127) {
        this.$r8$classId = 2;
        this.f$0 = chatActivity;
        this.f$2 = tLObject;
        this.f$4 = chatActivity$$ExternalSyntheticLambda301;
        this.f$3 = str;
        this.f$1 = anonymousClass127;
    }

    public ChatActivity$$ExternalSyntheticLambda206(PassportActivity.AnonymousClass20.AnonymousClass1 anonymousClass1, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, PassportActivity.PassportActivityDelegate passportActivityDelegate, PhotoViewer.AnonymousClass14 anonymousClass14) {
        this.$r8$classId = 11;
        this.f$0 = anonymousClass1;
        this.f$3 = str;
        this.f$1 = tL_secureRequiredType;
        this.f$2 = passportActivityDelegate;
        this.f$4 = anonymousClass14;
    }
}
