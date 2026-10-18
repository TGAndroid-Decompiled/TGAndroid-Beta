package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yb implements RequestDelegate {
    public final int f20146a = 0;
    public final Object f20147b;
    public final long f20148c;
    public final int d;
    public final int e;
    public final long f20149f;
    public final boolean f20150g;
    public final Object h;

    public yb(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f20147b = messagesController;
        this.f20148c = j10;
        this.f20149f = j11;
        this.d = i10;
        this.e = i11;
        this.f20150g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20146a) {
            case 0:
                ((MessagesController) this.f20147b).lambda$deleteDialog$141(this.f20148c, this.f20149f, this.d, this.e, this.f20150g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20147b).lambda$deleteMessagesRange$469(this.f20148c, this.d, this.e, this.f20149f, this.f20150g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f20148c, this.f20149f, this.e, this.f20150g, (Context) this.f20147b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public yb(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f20148c = j10;
        this.f20149f = j11;
        this.e = i11;
        this.f20150g = z10;
        this.f20147b = context;
        this.h = str;
    }

    public yb(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f20147b = messagesController;
        this.f20148c = j10;
        this.d = i10;
        this.e = i11;
        this.f20149f = j11;
        this.f20150g = z10;
        this.h = runnable;
    }
}
