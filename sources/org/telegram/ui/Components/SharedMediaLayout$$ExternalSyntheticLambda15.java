package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Stories.StoriesController;

public final class SharedMediaLayout$$ExternalSyntheticLambda15 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public SharedMediaLayout$$ExternalSyntheticLambda15(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((SharedMediaLayout) this.f$0).lambda$onItemLongClick$55((HashSet) this.f$1, (TL_stories.StoryItem) this.f$2, (ItemOptions) this.f$3, (StoriesController.StoryAlbum) obj);
                break;
            case 1:
                ((EmojiView.EmojiSearchAdapter) this.f$0).lambda$searchEmoji$0((String) this.f$1, (ArrayList) this.f$2, (Runnable) this.f$3, (ArrayList) obj);
                break;
            case 2:
                ((ChatActivityEnterView) this.f$0).lambda$didPressedBotButton$94((MessageObject) this.f$1, (TL_keyboard.TL_buttonTypeRequestPeer) this.f$2, (TLRPC.User) this.f$3, (TLRPC.User) obj);
                break;
            case 3:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = (ChatAttachAlertLocationLayout) this.f$0;
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = (TLRPC.TL_messageMediaGeo) this.f$2;
                chatAttachAlertLocationLayout.lambda$new$6((ChatActivity) this.f$1, tL_messageMediaGeo, (Theme.ResourcesProvider) this.f$3, (Long) obj);
                break;
            case 4:
                ((ChatAttachAlertLocationLayout) this.f$0).lambda$new$8((ChatActivity) this.f$1, (TLRPC.TL_messageMediaVenue) this.f$2, (Theme.ResourcesProvider) this.f$3, (Long) obj);
                break;
            default:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.f$0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f$2;
                chatAttachAlertPollLayout.lambda$onPollDoneButtonClick$8((ChatActivity) this.f$1, tL_messageMediaPoll, (ArrayList) this.f$3, (Long) obj);
                break;
        }
    }
}
