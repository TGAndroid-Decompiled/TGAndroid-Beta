package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Components.ChatActivityEnterTopView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class OAuthSheet$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public OAuthSheet$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$showMatchCodeSheet$21((BottomSheet[]) this.f$0, (Utilities.Callback) this.f$1, (String) this.f$2, view);
                break;
            case 1:
                ((CachedMediaLayout.AnonymousClass1) this.f$0).lambda$createView$3((CachedMediaLayout.ItemInner) this.f$1, (BaseFragment) this.f$2, view);
                break;
            case 2:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressChannelRecommendation$42((TLRPC.Chat) this.f$1, (ChatMessageCell) this.f$2, view);
                break;
            case 3:
                ((ArticleViewer) this.f$0).lambda$setParentActivity$22((String) this.f$2, (ArticleViewer.PageLayout) this.f$1, view);
                break;
            case 4:
                ((ChatActivity) this.f$0).lambda$createView$54((boolean[]) this.f$1, (Context) this.f$2, view);
                break;
            case 5:
                ((ChatActivity) this.f$0).lambda$createView$58((ChatActivityEnterTopView.EditViewButton) this.f$1, (boolean[]) this.f$2, view);
                break;
            case 6:
                ((ChatActivity) this.f$0).lambda$didPressReaction$463((View) this.f$1, (TLRPC.ReactionCount) this.f$2, view);
                break;
            case 7:
                ChatActivity.lambda$createMenu$264((ReactedUsersListView) this.f$0, (ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$1, (int[]) this.f$2, view);
                break;
            case 8:
                ((ChatActivity) this.f$0).lambda$updatePinnedMessageView$224((TL_keyboard.KeyboardInlineButton) this.f$1, (MessageObject) this.f$2, view);
                break;
            case 9:
                ((ChatEditActivity) this.f$0).lambda$createView$21((RadioButtonCell[]) this.f$1, (BottomSheet.Builder) this.f$2, view);
                break;
            case 10:
                ((ChooseDownloadQualityLayout) this.f$0).lambda$update$1((MessageObject) this.f$1, (VideoPlayer.Quality) this.f$2, view);
                break;
            case 11:
                ((ContactAddActivity) this.f$0).lambda$createView$10((Context) this.f$1, (TLRPC.User) this.f$2, view);
                break;
            case 12:
                ((MainTabsActivity) this.f$0).lambda$openFoldersSelector$7((ItemOptions) this.f$1, (MessagesController.DialogFilter) this.f$2, view);
                break;
            case 13:
                OAuthSheet.lambda$showMatchCodeSheet$23((ButtonWithCounterView) this.f$1, (BottomSheet[]) this.f$0, (Runnable) this.f$2, view);
                break;
            case 14:
                ((ProfileActivity) this.f$0).lambda$updateProfileData$105((TLRPC.User) this.f$1, (SimpleTextView) this.f$2, view);
                break;
            default:
                ((SaveToGallerySettingsActivity) this.f$0).lambda$createView$4((ActionBarPopupWindow) this.f$1, (SaveToGallerySettingsHelper.DialogException) this.f$2, view);
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda0(ArticleViewer articleViewer, String str, ArticleViewer.PageLayout pageLayout) {
        this.$r8$classId = 3;
        this.f$0 = articleViewer;
        this.f$2 = str;
        this.f$1 = pageLayout;
    }

    public OAuthSheet$$ExternalSyntheticLambda0(ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr, Runnable runnable) {
        this.$r8$classId = 13;
        this.f$1 = buttonWithCounterView;
        this.f$0 = bottomSheetArr;
        this.f$2 = runnable;
    }
}
