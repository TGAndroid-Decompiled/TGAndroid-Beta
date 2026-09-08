package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z6 implements RequestDelegate {
    public final int f19820a;
    public final Object f19821b;
    public final long f19822c;
    public final long d;
    public final Object f19823e;

    public z6(Object obj, Object obj2, long j3, long j10, int i10) {
        this.f19820a = i10;
        this.f19821b = obj;
        this.f19823e = obj2;
        this.f19822c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19820a) {
            case 0:
                ((MediaDataController) this.f19821b).lambda$loadPinnedMessageInternal$164(this.f19822c, this.d, (TLRPC.TL_channels_getMessages) this.f19823e, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19821b).lambda$getMediaCounts$129((int[]) this.f19823e, this.f19822c, this.d, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19821b).lambda$requestContactToken$476((Utilities.Callback) this.f19823e, this.f19822c, this.d, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f19821b).lambda$getTopicRepliesCount$30((TLRPC.TL_forumTopic) this.f19823e, this.f19822c, this.d, tLObject, tL_error);
                return;
            default:
                zh.w3 w3Var = (zh.w3) this.f19821b;
                zh.w3.J0(this.f19822c, this.d, (Utilities.Callback) this.f19823e, tLObject, tL_error, w3Var);
                return;
        }
    }

    public z6(MediaDataController mediaDataController, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f19820a = 0;
        this.f19821b = mediaDataController;
        this.f19822c = j3;
        this.d = j10;
        this.f19823e = tL_channels_getMessages;
    }
}
