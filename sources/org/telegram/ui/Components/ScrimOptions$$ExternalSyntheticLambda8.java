package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;

public final class ScrimOptions$$ExternalSyntheticLambda8 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ScrimOptions$$ExternalSyntheticLambda8(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ScrimOptions.lambda$makeGlobalBlurBitmaps$8((View) this.f$0, (Utilities.Callback2) this.f$1, (Bitmap) obj);
                break;
            case 1:
                ((ChatActivityEnterView.AnonymousClass48) this.f$0).lambda$onItemClick$1((String) this.f$1, (Long) obj);
                break;
            case 2:
                ChatAttachAlert.AnonymousClass1.lambda$onWebAppOpenInvoice$3((ChatAttachAlertBotWebViewLayout) this.f$0, (String) this.f$1, (String) obj);
                break;
            case 3:
                ((EmojiPacksAlert.EmojiPacksLoader) this.f$0).lambda$init$3((boolean[]) this.f$1, (TLRPC.TL_messages_stickerSet) obj);
                break;
            case 4:
                EmojiView.EmojiSearchAdapter.AnonymousClass5.lambda$run$9((LinkedHashSet) this.f$0, (EmojiView$2$$ExternalSyntheticLambda0) this.f$1, (TLRPC.TL_emojiList) obj);
                break;
            case 5:
                ((EmojiView.EmojiSearchAdapter.AnonymousClass5) this.f$0).lambda$run$4((String) this.f$1, (Runnable) obj);
                break;
            case 6:
                ((EmojiView.EmojiSearchAdapter.AnonymousClass5) this.f$0).lambda$run$6((ArrayList) this.f$1, (Runnable) obj);
                break;
            case 7:
                ((EmojiView.StickersSearchGridAdapter.AnonymousClass1) this.f$0).lambda$searchStickerSetsByName$1((Runnable) this.f$1, (ArrayList) obj);
                break;
            case 8:
                ((AIEditorAlert.Tabs.Tab) this.f$0).lambda$set$0((String) this.f$1, (TLRPC.TL_messages_stickerSet) obj);
                break;
            case 9:
                ((ChatAttachAlert) this.f$0).lambda$new$32((ChatActivity) this.f$1, (MessageSuggestionParams) obj);
                break;
            case 10:
                ((ChatAttachAlertLocationLayout.MapOverlayView) this.f$0).lambda$addInfoView$1((ChatAttachAlertLocationLayout.VenueLocation) this.f$1, (Long) obj);
                break;
            case 11:
                ((FolderBottomSheet) this.f$0).lambda$onJoinButtonClicked$11((ArrayList) this.f$1, (BaseFragment) obj);
                break;
            case 12:
                SharedMediaLayout.lambda$new$13((MessagesController) this.f$0, (SharedMediaLayout$$ExternalSyntheticLambda26) this.f$1, (Boolean) obj);
                break;
            default:
                ((SharedMediaLayout) this.f$0).lambda$onItemLongClick$52((TL_stories.StoryItem) this.f$1, (StoriesController.StoryAlbum) obj);
                break;
        }
    }
}
