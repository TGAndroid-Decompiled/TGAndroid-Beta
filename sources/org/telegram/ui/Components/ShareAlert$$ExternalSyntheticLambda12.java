package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ShareAlert$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ShareAlert$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((ShareAlert) this.f$0).lambda$new$0((TLObject) this.f$1, (Context) this.f$2);
                break;
            case 1:
                ((SharedMediaLayout) this.f$0).lambda$onItemLongClick$54((TL_stories.StoryItem) this.f$1, (ItemOptions) this.f$2);
                break;
            case 2:
                ((SharedMediaLayout) this.f$0).lambda$addStoryAlbumShareItemOptions$76((String) this.f$1, (BaseFragment) this.f$2);
                break;
            case 3:
                ((SharedMediaLayout.MediaSearchAdapter) this.f$0).lambda$search$2((String) this.f$1, (ArrayList) this.f$2);
                break;
            case 4:
                ((StickersAlert) this.f$0).lambda$updateFields$28((TLRPC.TL_error) this.f$2, (TLObject) this.f$1);
                break;
            case 5:
                ((StickersAlert) this.f$0).lambda$checkUrlAvailable$47((String) this.f$1, (TextView) this.f$2);
                break;
            case 6:
                ((StickersAlert) this.f$0).lambda$new$6((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            case 7:
                ((StickersAlert) this.f$0).lambda$didReceivedNotification$48((String) this.f$1, (SendMessagesHelper.ImportingSticker) this.f$2);
                break;
            case 8:
                ((StickersAlert) this.f$0).lambda$new$5((ArrayList) this.f$1, (Boolean) this.f$2);
                break;
            case 9:
                ((TopicsTabsView) this.f$0).lambda$deleteTopics$19((ArrayList) this.f$1, (Runnable) this.f$2);
                break;
            case 10:
                ((VideoSeekPreviewImage) this.f$0).lambda$open$7((Uri) this.f$1, (MessageObject) this.f$2);
                break;
            default:
                ((VideoSeekPreviewImage) this.f$0).lambda$open$5((VideoPlayer.VideoUri) this.f$1, (MessageObject) this.f$2);
                break;
        }
    }

    public ShareAlert$$ExternalSyntheticLambda12(TLObject tLObject, TLRPC.TL_error tL_error, StickersAlert stickersAlert) {
        this.$r8$classId = 4;
        this.f$0 = stickersAlert;
        this.f$2 = tL_error;
        this.f$1 = tLObject;
    }
}
