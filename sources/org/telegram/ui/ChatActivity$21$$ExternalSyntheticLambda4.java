package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.DialogCell;

public final class ChatActivity$21$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$21$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity.AnonymousClass21) this.f$0).lambda$onTouchEvent$4();
                break;
            case 1:
                ((ArticleViewer.AnonymousClass26) this.f$0).lambda$onAnimationEnd$0();
                break;
            case 2:
                ((ArticleViewer.BlockEmbedCell.AnonymousClass2) this.f$0).lambda$onShowCustomView$0();
                break;
            case 3:
                ((ArticleViewer.BlockEmbedCell.AnonymousClass3) this.f$0).lambda$onRenderProcessGone$0();
                break;
            case 4:
                ((AvatarPreviewer.Layout) this.f$0).prepareBlurBitmap();
                break;
            case 5:
                ((CameraScanActivity.AnonymousClass7) this.f$0).lambda$run$0();
                break;
            case 6:
                ((ChannelAdminLogActivity.AnonymousClass9) this.f$0).lambda$onAllAnimationsDone$0();
                break;
            case 7:
                ((ChatActivity.AnonymousClass132) this.f$0).lambda$onAnimationEnd$0();
                break;
            case 8:
                ((ChatActivity.AnonymousClass134) this.f$0).lambda$onAnimationEnd$0();
                break;
            case 9:
                ((ChatActivity.AnonymousClass23) this.f$0).lambda$onLayoutChildren$0();
                break;
            case 10:
                ((ChatActivity.AnonymousClass83) this.f$0).lambda$onAnimationEnd$0();
                break;
            case 11:
                ((MessageObject) this.f$0).settingAvatar = false;
                break;
            case 12:
                ((ChatActivity.ChatActivityAdapter.AnonymousClass2.C00122) this.f$0).lambda$sendButtonPressed$1();
                break;
            case 13:
                ((ChatActivity.ChatActivityEnterViewDelegate) this.f$0).lambda$onMessageEditEnd$2();
                break;
            case 14:
                ((ChatActivity.SearchItemListener) this.f$0).lambda$onSearchExpand$1();
                break;
            case 15:
                ((ChatEditActivity.AnonymousClass1) this.f$0).lambda$onDeletePhoto$0();
                break;
            case 16:
                ((ContactsActivity.AnonymousClass1) this.f$0).lambda$onItemClick$0();
                break;
            case 17:
                ((ContentPreviewViewer.AnonymousClass1) this.f$0).lambda$run$0();
                break;
            case 18:
                ((DialogsActivity.AnonymousClass10) this.f$0).lambda$onDefaultTabMoved$0();
                break;
            case 19:
                ((DialogsActivity.AnonymousClass11) this.f$0).lambda$didSelectTab$1();
                break;
            case 20:
                ((DialogsActivity.AnonymousClass50) this.f$0).openAvatarInProfile();
                break;
            case 21:
                ((DialogCell) this.f$0).setBackgroundDrawable(null);
                break;
            case 22:
                ((FilteredSearchView.AnonymousClass6) this.f$0).lambda$onScrolled$0();
                break;
            case 23:
                ((FiltersSetupActivity.AnonymousClass2) this.f$0).lambda$onTouchEvent$0();
                break;
            case 24:
                ((GroupCallActivity.AnonymousClass19) this.f$0).lambda$onClick$0();
                break;
            case 25:
                ((GroupCallActivity.AvatarUpdaterDelegate) this.f$0).lambda$didUploadPhoto$2();
                break;
            case 26:
                ((GroupStickersActivity.AnonymousClass4) this.f$0).lambda$onCustomButtonPressed$0();
                break;
            case 27:
                ((IntroActivity.AnonymousClass2) this.f$0).lambda$onSurfaceTextureAvailable$0();
                break;
            default:
                ((IntroActivity.AnonymousClass5) this.f$0).lambda$didReceivedNotification$0();
                break;
        }
    }
}
