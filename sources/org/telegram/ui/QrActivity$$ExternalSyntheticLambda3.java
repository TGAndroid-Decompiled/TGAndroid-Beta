package org.telegram.ui;

import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class QrActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final Object f$3;

    public QrActivity$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((QrActivity) this.f$0).lambda$onItemSelected$14(this.f$1, (EmojiThemes) this.f$2, (INavigationLayout.ThemeAnimationSettings) this.f$3);
                break;
            case 1:
                MessageObject messageObject = (MessageObject) this.f$3;
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressCustomBotButton$25((TLRPC.Message) this.f$2, this.f$1, messageObject);
                break;
            case 2:
                ((LinkManager.AnonymousClass1) this.f$0).lambda$onCallUsersSelected$0((TLObject) this.f$2, (TLRPC.User) this.f$3, this.f$1);
                break;
            case 3:
                ((PassportActivity.AnonymousClass8) this.f$0).lambda$run$15((TLObject) this.f$2, (String) this.f$3, this.f$1);
                break;
            case 4:
                ((PassportActivity.AnonymousClass8) this.f$0).lambda$run$9((TLRPC.TL_error) this.f$2, (TLObject) this.f$3, this.f$1);
                break;
            case 5:
                ((PassportActivity.AnonymousClass8) this.f$0).lambda$run$14((TL_account.passwordSettings) this.f$2, this.f$1, (byte[]) this.f$3);
                break;
            case 6:
                ((ChatActivity) this.f$0).lambda$didLongPressLink$415((String) this.f$2, (MessageObject) this.f$3, this.f$1);
                break;
            case 7:
                ((ChatActivity.ThemeDelegate) this.f$0).lambda$setCurrentTheme$1((EmojiThemes) this.f$2, (TLRPC.WallPaper) this.f$3, this.f$1);
                break;
            case 8:
                ((ChatEditTypeActivity) this.f$0).lambda$generateLink$26((TLRPC.TL_error) this.f$2, (TLObject) this.f$3, this.f$1);
                break;
            case 9:
                GroupCallActivity.lambda$makeFocusable$6((BottomSheet) this.f$0, (EditTextBoldCursor) this.f$2, this.f$1, (AlertDialog) this.f$3);
                break;
            case 10:
                ((GroupCallActivity) this.f$0).lambda$getLink$55((TLObject) this.f$2, (TLRPC.ChatFull) this.f$3, this.f$1);
                break;
            case 11:
                ((GroupInviteActivity) this.f$0).lambda$generateLink$2((TLRPC.TL_error) this.f$2, (TLObject) this.f$3, this.f$1);
                break;
            case 12:
                ((LaunchActivity) this.f$0).lambda$checkAppUpdate$135((Browser.Progress) this.f$2, this.f$1, (BetaUpdate) this.f$3);
                break;
            case 13:
                ((PaymentFormActivity) this.f$0).lambda$sendSavePassword$43((TLRPC.TL_error) this.f$2, (TLObject) this.f$3, this.f$1);
                break;
            default:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$setNewPassword$45((TLRPC.TL_error) this.f$2, (TLObject) this.f$3, this.f$1);
                break;
        }
    }

    public QrActivity$$ExternalSyntheticLambda3(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
        this.f$3 = obj3;
    }

    public QrActivity$$ExternalSyntheticLambda3(QrActivity qrActivity, boolean z, EmojiThemes emojiThemes, INavigationLayout.ThemeAnimationSettings themeAnimationSettings) {
        this.$r8$classId = 0;
        this.f$0 = qrActivity;
        this.f$1 = z;
        this.f$2 = emojiThemes;
        this.f$3 = themeAnimationSettings;
    }
}
