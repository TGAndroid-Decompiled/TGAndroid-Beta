package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zb implements RequestDelegate {
    public final int f20027a = 0;
    public final Object f20028b;
    public final long f20029c;
    public final int d;
    public final int f20030e;
    public final long f20031f;
    public final boolean f20032g;
    public final Object h;

    public zb(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f20028b = messagesController;
        this.f20029c = j3;
        this.f20031f = j10;
        this.d = i10;
        this.f20030e = i11;
        this.f20032g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20027a) {
            case 0:
                ((MessagesController) this.f20028b).lambda$deleteDialog$141(this.f20029c, this.f20031f, this.d, this.f20030e, this.f20032g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20028b).lambda$deleteMessagesRange$469(this.f20029c, this.d, this.f20030e, this.f20031f, this.f20032g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f20029c, this.f20031f, this.f20030e, this.f20032g, (Context) this.f20028b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public zb(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f20029c = j3;
        this.f20031f = j10;
        this.f20030e = i11;
        this.f20032g = z10;
        this.f20028b = context;
        this.h = str;
    }

    public zb(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f20028b = messagesController;
        this.f20029c = j3;
        this.d = i10;
        this.f20030e = i11;
        this.f20031f = j10;
        this.f20032g = z10;
        this.h = runnable;
    }
}
