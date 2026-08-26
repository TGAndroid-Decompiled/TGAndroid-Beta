package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.google.android.exoplayer2.PlaybackException;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Stories.StoriesController;

public final class UndoView$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public UndoView$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((UndoView) this.f$0).lambda$showWithAction$4((TLObject) this.f$1);
                break;
            case 1:
                ((LinkSpanDrawable.ClickableSmallTextView) this.f$0).lambda$onTouchEvent$0((LinkSpanDrawable) this.f$1);
                break;
            case 2:
                ((LinkSpanDrawable.LinkCollector) this.f$0).lambda$removeLoadingAt$2((LoadingDrawable) this.f$1);
                break;
            case 3:
                ((MediaActivity) this.f$0).lambda$createView$9((boolean[]) this.f$1);
                break;
            case 4:
                ((MemberRequestsBottomSheet) this.f$0).lambda$onSearchViewTouched$1((EditTextBoldCursor) this.f$1);
                break;
            case 5:
                ((PostRunnableHolder) this.f$0).lambda$post$0((Runnable) this.f$1);
                break;
            case 6:
                ((PostsSearchContainer) this.f$0).lambda$loadFlood$5((TLObject) this.f$1);
                break;
            case 7:
                ((ProfileActionsView) this.f$0).lambda$applyVisibleActions$1((ArrayList) this.f$1);
                break;
            case 8:
                QuoteHighlight.lambda$new$2((View) this.f$0, (ViewParent) this.f$1);
                break;
            case 9:
                RLottieDiceDrawable.lambda$recycleNativePtr$5((RLottieNative) this.f$0, (RLottieNative) this.f$1);
                break;
            case 10:
                ((ReactedHeaderView) this.f$0).lambda$onAttachedToWindow$0((ArrayList) this.f$1);
                break;
            case 11:
                ((SeekBarAccessibilityDelegate) this.f$0).lambda$postAccessibilityEventRunnable$0((View) this.f$1);
                break;
            case 12:
                ((SenderSelectPopup) this.f$0).lambda$new$0((ChatActivity) this.f$1);
                break;
            case 13:
                ((SenderSelectPopup) this.f$0).lambda$new$1((WindowManager) this.f$1);
                break;
            case 14:
                SharedMediaLayout.lambda$showFastScrollHint$40((SharedMediaLayout.MediaPage) this.f$0, (SharedMediaFastScrollTooltip) this.f$1);
                break;
            case 15:
                ((SharedMediaLayout) this.f$0).lambda$onStoryAlbumCreate$79((StoriesController.StoryAlbum) this.f$1);
                break;
            case 16:
                ((SharedMediaLayout.MediaSearchAdapter) this.f$0).lambda$updateSearchResults$4((ArrayList) this.f$1);
                break;
            case 17:
                ((SharedMediaLayout.MediaSearchAdapter) this.f$0).lambda$search$3((String) this.f$1);
                break;
            case 18:
                StickersAlert.lambda$onSubItemClick$22((TLObject) this.f$1, (Utilities.Callback) this.f$0);
                break;
            case 19:
                StickersDialogs.lambda$openStickerPickerDialog$8((TLRPC.TL_messages_stickerSet) this.f$0, (TLRPC.Document) this.f$1);
                break;
            case 20:
                ((TopicsTabsView) this.f$0).lambda$onTabLongClick$6((TLRPC.Updates) this.f$1);
                break;
            case 21:
                TranscribeButton.lambda$transcribePressed$3((ChatMessageCell.ChatMessageCellDelegate) this.f$0, (TLRPC.TL_messages_transcribedAudio) this.f$1);
                break;
            case 22:
                ((TranslateAlert2) this.f$0).lambda$translate$1((TLObject) this.f$1);
                break;
            case 23:
                ((TranslateButton) this.f$0).lambda$onMenuClick$9((TranslateController) this.f$1);
                break;
            case 24:
                ((TranslateButton) this.f$0).lambda$onMenuClick$11((ActionBarPopupWindow) this.f$1);
                break;
            case 25:
                UniversalAdapter.lambda$onBindViewHolder$3((UItem) this.f$0, (TextCheckCell2) this.f$1);
                break;
            case 26:
                ((VideoPlayer) this.f$0).lambda$onPlayerError$2((PlaybackException) this.f$1);
                break;
            default:
                ((VideoSeekPreviewImage) this.f$0).lambda$setProgress$1((Bitmap) this.f$1);
                break;
        }
    }

    public UndoView$$ExternalSyntheticLambda3(TLObject tLObject, Utilities.Callback callback) {
        this.$r8$classId = 18;
        this.f$1 = tLObject;
        this.f$0 = callback;
    }
}
