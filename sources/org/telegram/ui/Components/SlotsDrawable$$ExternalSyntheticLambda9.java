package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.view.View;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatMessageCell;

public final class SlotsDrawable$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public SlotsDrawable$$ExternalSyntheticLambda9(int i, Object obj, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$1 = i;
        this.f$0 = obj;
        this.f$2 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((SlotsDrawable) this.f$0).lambda$setBaseDice$3(this.f$1, (ChatMessageCell) this.f$2);
                break;
            case 1:
                ((EmojiPacksAlert.AnonymousClass9) this.f$0).lambda$onSend$0((LongSparseArray) this.f$2, this.f$1);
                break;
            case 2:
                ((EmojiView.EmojiSearchAdapter.AnonymousClass4.AnonymousClass1) this.f$0).lambda$onClick$3((AlertDialog[]) this.f$2, this.f$1);
                break;
            case 3:
                ((GroupVoipInviteAlert.SearchAdapter) this.f$0).lambda$updateSearchResults$3(this.f$1, (ArrayList) this.f$2);
                break;
            case 4:
                ((InstantCameraView.VideoRecorder) this.f$0).lambda$handleStopRecording$10(this.f$1, (InstantCameraView.SendOptions) this.f$2);
                break;
            case 5:
                ((SharedMediaLayout.AnonymousClass5) this.f$0).lambda$onClick$15(this.f$1, (ItemOptions) this.f$2);
                break;
            case 6:
                SharedMediaLayout.AnonymousClass50.lambda$onSend$0((BaseFragment) this.f$0, (LongSparseArray) this.f$2, this.f$1);
                break;
            case 7:
                ((SharedMediaLayout.SavedMessagesSearchAdapter) this.f$0).lambda$sendRequest$2(this.f$1, (TLRPC.TL_messages_search) this.f$2);
                break;
            case 8:
                ((SharedMediaLayout.SavedMessagesSearchAdapter) this.f$0).lambda$sendRequest$0((TLObject) this.f$2, this.f$1);
                break;
            case 9:
                StickerCategoriesListView.EmojiGroupFetcher.lambda$setLocal$2(this.f$1, (TLRPC.TL_messages_emojiGroups) this.f$0, (Integer) this.f$2);
                break;
            case 10:
                StickerCategoriesListView.EmojiGroupFetcher.lambda$getLocal$1(this.f$1, (Integer) this.f$0, (Utilities.Callback2) this.f$2);
                break;
            case 11:
                ((StickersAlert.AnonymousClass13) this.f$0).lambda$onSend$0((LongSparseArray) this.f$2, this.f$1);
                break;
            case 12:
                AlertsCreator.lambda$createScheduleDatePickerDialog$132((int[]) this.f$0, this.f$1, (Runnable) this.f$2);
                break;
            case 13:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$new$0(this.f$1, (View) this.f$2);
                break;
            case 14:
                FolderBottomSheet.lambda$showForDeletion$2(this.f$1, (BaseFragment) this.f$0, (Utilities.Callback) this.f$2);
                break;
            case 15:
                ((HashtagsSearchAdapter) this.f$0).lambda$search$3(this.f$1, (String) this.f$2);
                break;
            case 16:
                ((InstantCameraView) this.f$0).lambda$createCamera$7(this.f$1, (SurfaceTexture) this.f$2);
                break;
            case 17:
                ((ReactedHeaderView) this.f$0).lambda$loadReactions$6(this.f$1, (TLRPC.TL_messages_messageReactionsList) this.f$2);
                break;
            case 18:
                ((ShareAlert.ShareSearchAdapter) this.f$0).lambda$updateSearchResults$2(this.f$1, (ArrayList) this.f$2);
                break;
            case 19:
                ((SharedMediaLayout) this.f$0).lambda$checkLoadMoreScroll$35(this.f$1, (RecyclerListView) this.f$2);
                break;
            case 20:
                ((SharedMediaLayout) this.f$0).lambda$onItemLongClick$59(this.f$1, (TL_stories.StoryItem) this.f$2);
                break;
            case 21:
                ((SharedMediaLayout) this.f$0).lambda$buildItemOptionsForStoryAlbumActionBar$74(this.f$1, (ItemOptions) this.f$2);
                break;
            case 22:
                ((SuggestEmojiView) this.f$0).lambda$searchAnimated$6((String) this.f$2, this.f$1);
                break;
            case 23:
                ((ThemeEditorView.EditorAlert.SearchAdapter) this.f$0).lambda$searchDialogs$1((String) this.f$2, this.f$1);
                break;
            case 24:
                ((ThemeSmallPreviewView) this.f$0).lambda$setItem$3((ChatThemeBottomSheet.ChatThemeItem) this.f$2, this.f$1);
                break;
            default:
                TranscribeButton.lambda$transcribePressed$4((MessageObject) this.f$0, (ChatMessageCell.ChatMessageCellDelegate) this.f$2, this.f$1);
                break;
        }
    }

    public SlotsDrawable$$ExternalSyntheticLambda9(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    public SlotsDrawable$$ExternalSyntheticLambda9(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
    }
}
