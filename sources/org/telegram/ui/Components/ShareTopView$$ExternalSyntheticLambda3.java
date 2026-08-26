package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class ShareTopView$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;

    public ShareTopView$$ExternalSyntheticLambda3(int i, TLObject tLObject, TLRPC.TL_error tL_error, SharedMediaLayout.CommonGroupsAdapter commonGroupsAdapter) {
        this.$r8$classId = 4;
        this.f$0 = commonGroupsAdapter;
        this.f$3 = tL_error;
        this.f$2 = tLObject;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ShareTopView) this.f$0).lambda$requestLinkPreview$1(this.f$1, (TLObject) this.f$2, (String) this.f$3);
                break;
            case 1:
                ((ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView) this.f$0).lambda$onTouchEvent$3((ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell) this.f$2, (MediaController.PhotoEntry) this.f$3, this.f$1);
                break;
            case 2:
                ((GroupVoipInviteAlert.SearchAdapter) this.f$0).lambda$processSearch$1((String) this.f$3, this.f$1, (ArrayList) this.f$2);
                break;
            case 3:
                ((SearchTagsList) this.f$0).lambda$new$3(this.f$1, (SearchTagsList.Item) this.f$2, (Theme.ResourcesProvider) this.f$3);
                break;
            case 4:
                ((SharedMediaLayout.CommonGroupsAdapter) this.f$0).lambda$getChats$0((TLRPC.TL_error) this.f$3, (TLObject) this.f$2, this.f$1);
                break;
            case 5:
                ((ChatAttachAlertContactsLayout.ShareSearchAdapter) this.f$0).lambda$updateSearchResults$3(this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3);
                break;
            case 6:
                ChatNotificationsPopupWrapper.lambda$addAsItemOptions$16((ItemOptions) this.f$0, (Theme.ResourcesProvider) this.f$2, this.f$1, (ChatNotificationsPopupWrapper$$ExternalSyntheticLambda3) this.f$3);
                break;
            case 7:
                FolderBottomSheet.lambda$showForDeletion$0((BaseFragment) this.f$0, (TLObject) this.f$2, this.f$1, (Utilities.Callback) this.f$3);
                break;
            case 8:
                ((HashtagsSearchAdapter) this.f$0).lambda$search$1(this.f$1, (TLObject) this.f$2, (String) this.f$3);
                break;
            case 9:
                ((SharedMediaLayout) this.f$0).lambda$onItemLongClick$57((MessageObject) this.f$2, (View) this.f$3, this.f$1);
                break;
            case 10:
                ((SharedMediaLayout) this.f$0).lambda$onItemLongClick$60(this.f$1, (TL_stories.StoryItem) this.f$2, (String) this.f$3);
                break;
            case 11:
                ((SharedMediaLayout) this.f$0).lambda$new$22(this.f$1, (TLRPC.TL_error) this.f$2, (TLRPC.TL_messages_editMessage) this.f$3);
                break;
            case 12:
                ((SharedMediaLayout.MediaSearchAdapter) this.f$0).lambda$queryServerSearch$0(this.f$1, (ArrayList) this.f$2, (String) this.f$3);
                break;
            case 13:
                ((SuggestEmojiView) this.f$0).lambda$searchAnimated$5(this.f$1, (String) this.f$3, (ArrayList) this.f$2);
                break;
            case 14:
                ((SuggestEmojiView) this.f$0).lambda$searchKeywords$4((String[]) this.f$2, (String) this.f$3, this.f$1);
                break;
            case 15:
                ((ThemeEditorView.EditorAlert.SearchAdapter) this.f$0).lambda$updateSearchResults$0(this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3);
                break;
            default:
                ((ThemeSmallPreviewView) this.f$0).lambda$setItem$2((ChatThemeBottomSheet.ChatThemeItem) this.f$2, this.f$1, (Bitmap) this.f$3);
                break;
        }
    }

    public ShareTopView$$ExternalSyntheticLambda3(ViewGroup viewGroup, Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = viewGroup;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$1 = i;
    }

    public ShareTopView$$ExternalSyntheticLambda3(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    public ShareTopView$$ExternalSyntheticLambda3(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
        this.f$3 = obj3;
    }

    public ShareTopView$$ExternalSyntheticLambda3(GroupVoipInviteAlert.SearchAdapter searchAdapter, String str, int i, ArrayList arrayList) {
        this.$r8$classId = 2;
        this.f$0 = searchAdapter;
        this.f$3 = str;
        this.f$1 = i;
        this.f$2 = arrayList;
    }

    public ShareTopView$$ExternalSyntheticLambda3(SuggestEmojiView suggestEmojiView, int i, String str, ArrayList arrayList) {
        this.$r8$classId = 13;
        this.f$0 = suggestEmojiView;
        this.f$1 = i;
        this.f$3 = str;
        this.f$2 = arrayList;
    }
}
