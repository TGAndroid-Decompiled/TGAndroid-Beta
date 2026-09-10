package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zb implements RequestDelegate {
    public final int f17143a;
    public final MessagesController f17144b;
    public final long f17145c;
    public final long d;
    public final ArrayList e;

    public zb(int i10, long j3, long j10, ArrayList arrayList, MessagesController messagesController) {
        this.f17143a = i10;
        this.f17144b = messagesController;
        this.f17145c = j3;
        this.d = j10;
        this.e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17143a) {
            case 0:
                this.f17144b.lambda$checkUnreadPollVotesInternal2$430(this.f17145c, this.d, this.e, tLObject, tL_error);
                return;
            case 1:
                this.f17144b.lambda$checkUnreadPollVotesInternal2$432(this.f17145c, this.d, this.e, tLObject, tL_error);
                return;
            case 2:
                this.f17144b.lambda$checkUnreadPollVotesInternal2$434(this.f17145c, this.d, this.e, tLObject, tL_error);
                return;
            case 3:
                this.f17144b.lambda$checkUnreadReactionsInternal2$423(this.f17145c, this.d, this.e, tLObject, tL_error);
                return;
            case 4:
                this.f17144b.lambda$checkUnreadReactionsInternal2$425(this.f17145c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                this.f17144b.lambda$checkUnreadReactionsInternal2$427(this.f17145c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
