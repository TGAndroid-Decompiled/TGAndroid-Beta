package org.telegram.ui;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;

public final class WearAuthSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public WearAuthSheet$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                WearAuthSheet.lambda$show$1((int[]) this.f$0, this.f$1, (AvatarDrawable) this.f$2, (TLRPC.User) this.f$3, (BackupImageView) this.f$4);
                break;
            case 1:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressReplyMessage$44(this.f$1, (MessageObject) this.f$2, (Integer) this.f$3, (byte[]) this.f$4);
                break;
            case 2:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$openChat$20((Browser.Progress) this.f$2, (TLRPC.Chat) this.f$3, this.f$1, (ChatActivity) this.f$4);
                break;
            case 3:
                ((ArticleViewer) this.f$0).lambda$processSearch$49((ArrayList) this.f$2, (HashMap) this.f$3, (String) this.f$4, this.f$1);
                break;
            case 4:
                ((ChatActivity) this.f$0).lambda$searchLinks$136(this.f$1, (Boolean) this.f$2, (TLRPC.WebPage) this.f$3, (TL_account.getWebPagePreview) this.f$4);
                break;
            case 5:
                ((LaunchActivity) this.f$0).lambda$runImportRequest$34((TLObject) this.f$2, (Uri) this.f$3, this.f$1, (AlertDialog) this.f$4);
                break;
            case 6:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$49((TLObject) this.f$2, this.f$1, (String) this.f$3, (Runnable) this.f$4);
                break;
            case 7:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$89((Runnable) this.f$2, (TLRPC.TL_error) this.f$3, (TLRPC.Updates) this.f$4, this.f$1);
                break;
            default:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$30((String) this.f$2, (String) this.f$3, (String) this.f$4, this.f$1);
                break;
        }
    }

    public WearAuthSheet$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = i;
        this.f$4 = notificationCenterDelegate;
    }

    public WearAuthSheet$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$1 = i;
    }

    public WearAuthSheet$$ExternalSyntheticLambda0(LaunchActivity launchActivity, TLObject tLObject, int i, String str, Runnable runnable) {
        this.$r8$classId = 6;
        this.f$0 = launchActivity;
        this.f$2 = tLObject;
        this.f$1 = i;
        this.f$3 = str;
        this.f$4 = runnable;
    }
}
