package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z6 implements RequestDelegate {
    public final int f18269a;
    public final Object f18270b;
    public final long f18271c;
    public final long d;
    public final Object e;

    public z6(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f18269a = i10;
        this.f18270b = obj;
        this.e = obj2;
        this.f18271c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18269a) {
            case 0:
                ((MediaDataController) this.f18270b).lambda$loadPinnedMessageInternal$164(this.f18271c, this.d, (TLRPC.TL_channels_getMessages) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f18270b).lambda$getMediaCounts$129((int[]) this.e, this.f18271c, this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18270b).lambda$requestContactToken$476((Utilities.Callback) this.e, this.f18271c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f18270b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.e, this.f18271c, this.d, tLObject, tL_error);
                return;
            default:
                yh.y3 y3Var = (yh.y3) this.f18270b;
                yh.y3.J0(this.f18271c, this.d, (Utilities.Callback) this.e, tLObject, tL_error, y3Var);
                return;
        }
    }

    public z6(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f18269a = 0;
        this.f18270b = mediaDataController;
        this.f18271c = j3;
        this.d = j10;
        this.e = tL_channels_getMessages;
    }
}
