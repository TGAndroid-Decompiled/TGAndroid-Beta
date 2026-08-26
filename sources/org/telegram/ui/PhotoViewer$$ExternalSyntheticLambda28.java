package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.FolderBottomSheet;

public final class PhotoViewer$$ExternalSyntheticLambda28 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;

    public PhotoViewer$$ExternalSyntheticLambda28(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).lambda$detectFaces$107((String) this.f$1, this.f$2);
                break;
            case 1:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressInstantButton$49((TLObject) this.f$1, this.f$2);
                break;
            case 2:
                ((ChatEditTypeActivity.UsernamesListView.AnonymousClass1) this.f$0).lambda$onItemClick$1((TLRPC.TL_username) this.f$1, this.f$2);
                break;
            case 3:
                ((ChatLinkActivity.ListAdapter.AnonymousClass1) this.f$0).lambda$onJoinToSendToggle$7(this.f$2, (TLRPC.Chat) this.f$1);
                break;
            case 4:
                ((DialogsActivity.AnonymousClass11) this.f$0).lambda$didSelectTab$2(this.f$2, (MessagesController.DialogFilter) this.f$1);
                break;
            case 5:
                ((DialogsActivity.AnonymousClass11) this.f$0).lambda$didSelectTab$3((ArrayList) this.f$1, this.f$2);
                break;
            case 6:
                ((FilterChatlistActivity.ListAdapter.AnonymousClass1) this.f$0).lambda$revoke$0(this.f$2, (AlertDialog) this.f$1);
                break;
            case 7:
                ((FilterCreateActivity.LinkCell) this.f$0).lambda$revoke$2(this.f$2, (AlertDialog) this.f$1);
                break;
            case 8:
                ((PassportActivity.AnonymousClass8) this.f$0).lambda$run$16(this.f$2, (TLRPC.TL_error) this.f$1);
                break;
            case 9:
                ((ChatActivity) this.f$0).lambda$updateMessageAnimated$311((MessageObject) this.f$1, this.f$2);
                break;
            case 10:
                ChatActivity.lambda$didReceivedNotification6$188((Theme.ThemeAccent) this.f$0, (Theme.ThemeInfo) this.f$1, this.f$2);
                break;
            case 11:
                ((FilterChatlistActivity) this.f$0).lambda$deselectAll$6((FolderBottomSheet.HeaderCell) this.f$1, this.f$2);
                break;
            case 12:
                ((LanguageSelectActivity) this.f$0).lambda$createView$1((AlertDialog) this.f$1, this.f$2);
                break;
            case 13:
                ((LaunchActivity) this.f$0).lambda$handleIntent$21((BaseFragment) this.f$1, this.f$2);
                break;
            case 14:
                ((PassportActivity) this.f$0).lambda$onPasswordDone$13(this.f$2, (String) this.f$1);
                break;
            case 15:
                ((PhotoPickerActivity) this.f$0).lambda$searchBotUser$10((TLObject) this.f$1, this.f$2);
                break;
            case 16:
                ((PhotoViewer) this.f$0).lambda$setItemVisible$130(this.f$2, (View) this.f$1);
                break;
            case 17:
                ProfileActivity.lambda$sendLogs$115((AlertDialog) this.f$0, this.f$2, (Activity) this.f$1);
                break;
            case 18:
                ((ProfileActivity) this.f$0).lambda$onJoinClicked$54(this.f$2, (boolean[]) this.f$1);
                break;
            case 19:
                ((SearchAdsInfoBottomSheet) this.f$0).lambda$new$0(this.f$2, (Runnable) this.f$1);
                break;
            case 20:
                ((TwoStepVerificationActivity) this.f$0).lambda$processDone$29(this.f$2, (byte[]) this.f$1);
                break;
            default:
                ((WallpapersListActivity) this.f$0).lambda$loadWallpapers$7((TLObject) this.f$1, this.f$2);
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda28(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = z;
        this.f$1 = obj2;
    }
}
