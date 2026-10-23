package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zb implements RequestDelegate {
    public final int f20305a;
    public final MessagesController f20306b;
    public final long f20307c;
    public final long d;
    public final ArrayList e;

    public zb(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f20305a = i10;
        this.f20306b = messagesController;
        this.f20307c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20305a) {
            case 0:
                this.f20306b.lambda$checkUnreadPollVotesInternal2$433(this.f20307c, this.d, this.e, tLObject, tL_error);
                return;
            case 1:
                this.f20306b.lambda$checkUnreadPollVotesInternal2$435(this.f20307c, this.d, this.e, tLObject, tL_error);
                return;
            case 2:
                this.f20306b.lambda$checkUnreadPollVotesInternal2$437(this.f20307c, this.d, this.e, tLObject, tL_error);
                return;
            case 3:
                this.f20306b.lambda$checkUnreadReactionsInternal2$426(this.f20307c, this.d, this.e, tLObject, tL_error);
                return;
            case 4:
                this.f20306b.lambda$checkUnreadReactionsInternal2$428(this.f20307c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                this.f20306b.lambda$checkUnreadReactionsInternal2$430(this.f20307c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
