package org.telegram.ui;

import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ChatAvatarContainer;

public final class LinkManager$$ExternalSyntheticLambda25 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public LinkManager$$ExternalSyntheticLambda25(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager) this.f$0).lambda$handleSettings$10((TLObject) this.f$1, (String) this.f$2);
                break;
            case 1:
                ((LocationActivity) this.f$0).lambda$createView$13((AlertDialog[]) this.f$1, (TLRPC.TL_messageMediaVenue) this.f$2);
                break;
            case 2:
                ((LocationActivity) this.f$0).lambda$onCheckGlScreenshot$48((Bitmap) this.f$1, (GLSurfaceView) this.f$2);
                break;
            case 3:
                ((LocationActivity) this.f$0).lambda$onCheckGlScreenshot$47((ViewGroup) this.f$1, (GLSurfaceView) this.f$2);
                break;
            case 4:
                ((LoginActivity) this.f$0).lambda$resendCodeFromSafetyNet$18((Bundle) this.f$2, (TLObject) this.f$1);
                break;
            case 5:
                ((LoginActivity.LoginActivityEmailCodeView) this.f$0).lambda$onNextPressed$18((TLObject) this.f$1, (Bundle) this.f$2);
                break;
            case 6:
                ((LoginActivity.LoginActivityRegisterView) this.f$0).lambda$onNextPressed$18((TLObject) this.f$1, (TLRPC.TL_error) this.f$2);
                break;
            case 7:
                ((LoginActivity.LoginActivityRegisterView) this.f$0).lambda$didUploadPhoto$13((TLRPC.PhotoSize) this.f$1, (TLRPC.PhotoSize) this.f$2);
                break;
            case 8:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$new$2((Bundle) this.f$2, (TLObject) this.f$1);
                break;
            case 9:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$onNextPressed$24((TLRPC.TL_error) this.f$2, (TLObject) this.f$1);
                break;
            case 10:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$onNextPressed$28((TLRPC.TL_error) this.f$1, (TL_account.confirmPhone) this.f$2);
                break;
            case 11:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$19((TLRPC.TL_inputStorePaymentAuthCode) this.f$1, (TL_update.TL_updateSentPhoneCode) this.f$2);
                break;
            case 12:
                ((LoginActivity.LoginPayView) this.f$0).lambda$poll$31((TLObject) this.f$1, (TLRPC.TL_error) this.f$2);
                break;
            case 13:
                ((LoginActivity.PhoneView) this.f$0).lambda$new$12((TLObject) this.f$1, (HashMap) this.f$2);
                break;
            case 14:
                ((ManageLinksActivity) this.f$0).lambda$deleteLink$13((TLRPC.TL_error) this.f$1, (TLRPC.TL_chatInviteExported) this.f$2);
                break;
            case 15:
                ((NewContactBottomSheet) this.f$0).lambda$updatedPhone$19((TLObject) this.f$1, (Utilities.Callback) this.f$2);
                break;
            case 16:
                ((NewContactBottomSheet) this.f$0).lambda$updatedPhone$18((TLRPC.TL_contact) this.f$1, (OAuthSheet$$ExternalSyntheticLambda1) this.f$2);
                break;
            case 17:
                ((NotificationsSettingsActivity) this.f$0).lambda$loadExceptions$2((ArrayList) this.f$1, (Runnable) this.f$2);
                break;
            case 18:
                ((PassportActivity) this.f$0).lambda$createPasswordInterface$9((TLRPC.TL_error) this.f$2, (TLObject) this.f$1);
                break;
            case 19:
                ((PassportActivity.PhoneConfirmationView) this.f$0).lambda$onNextPressed$6((TLRPC.TL_error) this.f$1, (TL_account.verifyPhone) this.f$2);
                break;
            case 20:
                ((PaymentFormActivity) this.f$0).lambda$sendData$68((TLRPC.TL_error) this.f$1, (TLRPC.TL_payments_sendPaymentForm) this.f$2);
                break;
            case 21:
                ((PaymentFormActivity) this.f$0).lambda$sendSavedForm$49((TLRPC.TL_payments_validatedRequestedInfo) this.f$1, (Runnable) this.f$2);
                break;
            case 22:
                ((PaymentFormActivity) this.f$0).lambda$checkPassword$72((TL_account.Password) this.f$1, (byte[]) this.f$2);
                break;
            case 23:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$52((Bitmap) this.f$1, (PhotoViewer$$ExternalSyntheticLambda10) this.f$2);
                break;
            case 24:
                ((PhotoViewer) this.f$0).lambda$detectFaces$108((ImageReceiver.BitmapHolder) this.f$1, (String) this.f$2);
                break;
            case 25:
                ((PhotoViewer) this.f$0).lambda$switchToPip$97((boolean[]) this.f$1, (PhotoViewer$$ExternalSyntheticLambda48) this.f$2);
                break;
            case 26:
                ((PollItemMenu) this.f$0).lambda$setCell$5((ChatActivity) this.f$1, (TLRPC.PollAnswer) this.f$2);
                break;
            case 27:
                ((PremiumPreviewFragment) this.f$0).lambda$createView$2((TLRPC.TL_error) this.f$2, (TLObject) this.f$1);
                break;
            case 28:
                ((ProfileActivity) this.f$0).lambda$onCustomTransitionAnimation$98((ChatAvatarContainer) this.f$1, (ChatActivity) this.f$2);
                break;
            default:
                ((ProfileActivity) this.f$0).lambda$openAddMember$92((ArrayList) this.f$1, (HashSet) this.f$2);
                break;
        }
    }

    public LinkManager$$ExternalSyntheticLambda25(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$2 = obj;
        this.f$1 = tLObject;
    }
}
