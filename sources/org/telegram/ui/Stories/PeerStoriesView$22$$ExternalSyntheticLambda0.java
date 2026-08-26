package org.telegram.ui.Stories;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;

public final class PeerStoriesView$22$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final int f$3;

    public PeerStoriesView$22$$ExternalSyntheticLambda0(Object obj, Object obj2, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
        this.f$3 = i;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                TLRPC.User user = peerStoriesView.mentionContainer.getAdapter().foundContextBot;
                long j = user != null ? user.id : 0L;
                HashMap map = new HashMap();
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f$1;
                map.put("id", botInlineResult.id);
                map.put("query_id", "" + botInlineResult.query_id);
                map.put("bot", "" + j);
                TLRPC.User user2 = peerStoriesView.mentionContainer.getAdapter().foundContextBot;
                map.put("bot_name", user2 != null ? user2.username : "");
                SendMessagesHelper.prepareSendingBotContextResult(peerStoriesView.storyViewer.fragment, peerStoriesView.getAccountInstance(), botInlineResult, map, peerStoriesView.dialogId, null, null, peerStoriesView.currentStory.storyItem, null, this.f$2, this.f$3, 0, null, 0L, l.longValue());
                peerStoriesView.chatActivityEnterView.setFieldText("");
                peerStoriesView.afterMessageSend(l.longValue() <= 0);
                MediaDataController.getInstance(peerStoriesView.currentAccount).increaseInlineRating(j);
                break;
            default:
                ((ChatAttachAlertDocumentLayout) this.f$0).lambda$sendSelectedPhotos$6((ArrayList) this.f$1, this.f$2, this.f$3, (Long) obj);
                break;
        }
    }
}
