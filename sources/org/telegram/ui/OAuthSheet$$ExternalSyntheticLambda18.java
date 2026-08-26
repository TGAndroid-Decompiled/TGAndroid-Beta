package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.Bulletin;

public final class OAuthSheet$$ExternalSyntheticLambda18 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;

    public OAuthSheet$$ExternalSyntheticLambda18(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$handle$17((BottomSheet[]) this.f$0, dialogInterface);
                break;
            case 1:
                ((BoostsActivity.AnonymousClass5) this.f$0).lambda$new$1(dialogInterface);
                break;
            case 2:
                ((CameraScanActivity.AnonymousClass1) this.f$0).lambda$new$0(dialogInterface);
                break;
            case 3:
                ChatActivity.ChatMessageCellDelegate.lambda$didPressCustomBotButton$22((Bulletin[]) this.f$0, dialogInterface);
                break;
            case 4:
                ((ChannelCreateActivity) this.f$0).lambda$createView$7(dialogInterface);
                break;
            case 5:
                ChatActivity.lambda$openClickableLink$391((ChatMessageCell) this.f$0, dialogInterface);
                break;
            case 6:
                ((ChatEditActivity) this.f$0).lambda$openSetPhotoAlert$56(dialogInterface);
                break;
            case 7:
                ((ExternalActionActivity) this.f$0).lambda$handleIntent$4(dialogInterface);
                break;
            case 8:
                ((GroupCreateFinalActivity) this.f$0).lambda$createView$3(dialogInterface);
                break;
            case 9:
                ((LoginActivity.LoginActivityRegisterView) this.f$0).lambda$new$6(dialogInterface);
                break;
            case 10:
                ((BottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                break;
            case 11:
                ((PhotoViewer) this.f$0).lambda$showAlertDialog$105(dialogInterface);
                break;
            case 12:
                ((Runnable) this.f$0).run();
                break;
            case 13:
                ((PrivacyControlActivity) this.f$0).lambda$createView$5(dialogInterface);
                break;
            case 14:
                ((ProfileActivity) this.f$0).lambda$onWriteButtonClick$57(dialogInterface);
                break;
            case 15:
                ((SelectAnimatedEmojiDialog) this.f$0).lambda$onRecentLongClick$6(dialogInterface);
                break;
            case 16:
                ((ShareActivity) this.f$0).lambda$onCreate$0(dialogInterface);
                break;
            case 17:
                ((ThemeActivity) this.f$0).lambda$didReceivedNotification$1(dialogInterface);
                break;
            case 18:
                ((TwoStepVerificationActivity) this.f$0).lambda$resetPassword$11(dialogInterface);
                break;
            default:
                ((VoIPFragment) this.f$0).lambda$showErrorDialog$42(dialogInterface);
                break;
        }
    }
}
