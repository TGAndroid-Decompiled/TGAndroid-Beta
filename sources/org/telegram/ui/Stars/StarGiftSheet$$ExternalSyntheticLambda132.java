package org.telegram.ui.Stars;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class StarGiftSheet$$ExternalSyntheticLambda132 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final long f$3;

    public StarGiftSheet$$ExternalSyntheticLambda132(int i, long j, long j2, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = j2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((StarGiftSheet) this.f$0).lambda$doTransfer$158((Utilities.Callback) this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$loadPinnedMessageInternal$164(this.f$2, this.f$3, (TLRPC.TL_channels_getMessages) this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$getMediaCounts$129((int[]) this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$requestContactToken$476((Utilities.Callback) this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            default:
                ((TopicsController) this.f$0).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda132(MediaDataController mediaDataController, long j, long j2, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.$r8$classId = 1;
        this.f$0 = mediaDataController;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$1 = tL_channels_getMessages;
    }
}
