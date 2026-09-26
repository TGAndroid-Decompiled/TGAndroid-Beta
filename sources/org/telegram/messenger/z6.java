package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z6 implements RequestDelegate {
    public final int f18276a;
    public final Object f18277b;
    public final long f18278c;
    public final long d;
    public final Object e;

    public z6(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f18276a = i10;
        this.f18277b = obj;
        this.e = obj2;
        this.f18278c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18276a) {
            case 0:
                ((MediaDataController) this.f18277b).lambda$loadPinnedMessageInternal$164(this.f18278c, this.d, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f18277b).lambda$getMediaCounts$129((int[]) this.e, this.f18278c, this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18277b).lambda$requestContactToken$476((Utilities.Callback) this.e, this.f18278c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f18277b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f18278c, this.d, tLObject, tL_error);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.f18277b;
                yh.x3.J0(this.f18278c, this.d, (Utilities.Callback) this.e, tLObject, tL_error, x3Var);
                return;
        }
    }

    public z6(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f18276a = 0;
        this.f18277b = mediaDataController;
        this.f18278c = j3;
        this.d = j10;
        this.e = tL_channels_getMessages;
    }
}
