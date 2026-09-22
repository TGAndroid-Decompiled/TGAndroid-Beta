package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z6 implements RequestDelegate {
    public final int f18040a;
    public final Object f18041b;
    public final long f18042c;
    public final long d;
    public final Object e;

    public z6(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f18040a = i10;
        this.f18041b = obj;
        this.e = obj2;
        this.f18042c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18040a) {
            case 0:
                ((MediaDataController) this.f18041b).lambda$loadPinnedMessageInternal$164(this.f18042c, this.d, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f18041b).lambda$getMediaCounts$129((int[]) this.e, this.f18042c, this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18041b).lambda$requestContactToken$476((Utilities.Callback) this.e, this.f18042c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f18041b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f18042c, this.d, tLObject, tL_error);
                return;
            default:
                yh.z3 z3Var = (yh.z3) this.f18041b;
                yh.z3.J0(this.f18042c, this.d, (Utilities.Callback) this.e, tLObject, tL_error, z3Var);
                return;
        }
    }

    public z6(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f18040a = 0;
        this.f18041b = mediaDataController;
        this.f18042c = j3;
        this.d = j10;
        this.e = tL_channels_getMessages;
    }
}
