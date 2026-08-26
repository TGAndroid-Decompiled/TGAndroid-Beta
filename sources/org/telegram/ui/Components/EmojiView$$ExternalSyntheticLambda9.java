package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;

public final class EmojiView$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public EmojiView$$ExternalSyntheticLambda9(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$1 = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((EmojiView) this.f$0).lambda$postBackspaceRunnable$24(this.f$1);
                break;
            case 1:
                ((ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView) this.f$0).lambda$onTouchEvent$4(this.f$1);
                break;
            case 2:
                ((PhotoViewerWebView.YoutubeProxy) this.f$0).lambda$onPlayerError$2(this.f$1);
                break;
            case 3:
                ((SharedMediaLayout.AnonymousClass40) this.f$0).lambda$showOptions$0(this.f$1);
                break;
            case 4:
                AlertsCreator.lambda$createBirthdayPickerDialog$149(this.f$1, (LinkSpanDrawable.LinksTextView) this.f$0);
                break;
            case 5:
                AlertsCreator.lambda$createClearOrDeleteDialogAlert$74(this.f$1, (MessagesStorage.BooleanCallback) this.f$0);
                break;
            case 6:
                AlertsCreator.lambda$showCallsForbidden$258(this.f$1, (TLRPC.Updates) this.f$0);
                break;
            case 7:
                ((AutoDeletePopupWrapper) this.f$0).lambda$updateItems$7(this.f$1);
                break;
            case 8:
                ((CaptionPhotoViewer) this.f$0).lambda$new$3(this.f$1);
                break;
            case 9:
                ((ChatActivityEnterView) this.f$0).lambda$showPopup$101(this.f$1);
                break;
            case 10:
                ItemOptions.lambda$addFrom$11((ActionBar.ActionBarMenuOnItemClick) this.f$0, this.f$1);
                break;
            case 11:
                ((MenuToItemOptions) this.f$0).lambda$add$0(this.f$1);
                break;
            case 12:
                ((RLottieDiceDrawable) this.f$0).lambda$setDiceNumber$1(this.f$1);
                break;
            case 13:
                ((SharedMediaLayout) this.f$0).lambda$onItemLongClick$58(this.f$1);
                break;
            case 14:
                SharedMediaLayout.lambda$new$30((SharedMediaLayout.MediaPage) this.f$0, this.f$1);
                break;
            case 15:
                ((StickerCategoriesListView) this.f$0).lambda$scrollToSelected$4(this.f$1);
                break;
            case 16:
                ((TranslateAlert3) this.f$0).lambda$onToLangMenu$4(this.f$1);
                break;
            case 17:
                ((ViewPagerFixed.TabsView) this.f$0).lambda$scrollToChild$4(this.f$1);
                break;
            default:
                ((WebPlayerView) this.f$0).lambda$onAudioFocusChange$5(this.f$1);
                break;
        }
    }

    public EmojiView$$ExternalSyntheticLambda9(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }
}
