package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yb implements RequestDelegate {
    public final int f20149a = 0;
    public final Object f20150b;
    public final long f20151c;
    public final int d;
    public final int e;
    public final long f20152f;
    public final boolean f20153g;
    public final Object h;

    public yb(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f20150b = messagesController;
        this.f20151c = j10;
        this.f20152f = j11;
        this.d = i10;
        this.e = i11;
        this.f20153g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20149a) {
            case 0:
                ((MessagesController) this.f20150b).lambda$deleteDialog$141(this.f20151c, this.f20152f, this.d, this.e, this.f20153g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20150b).lambda$deleteMessagesRange$469(this.f20151c, this.d, this.e, this.f20152f, this.f20153g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f20151c, this.f20152f, this.e, this.f20153g, (Context) this.f20150b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public yb(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f20151c = j10;
        this.f20152f = j11;
        this.e = i11;
        this.f20153g = z10;
        this.f20150b = context;
        this.h = str;
    }

    public yb(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f20150b = messagesController;
        this.f20151c = j10;
        this.d = i10;
        this.e = i11;
        this.f20152f = j11;
        this.f20153g = z10;
        this.h = runnable;
    }
}
