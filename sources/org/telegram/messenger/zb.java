package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zb implements RequestDelegate {
    public final int f19994a = 0;
    public final Object f19995b;
    public final long f19996c;
    public final int d;
    public final int f19997e;
    public final long f19998f;
    public final boolean f19999g;
    public final Object h;

    public zb(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f19995b = messagesController;
        this.f19996c = j3;
        this.f19998f = j10;
        this.d = i10;
        this.f19997e = i11;
        this.f19999g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19994a) {
            case 0:
                ((MessagesController) this.f19995b).lambda$deleteDialog$141(this.f19996c, this.f19998f, this.d, this.f19997e, this.f19999g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19995b).lambda$deleteMessagesRange$469(this.f19996c, this.d, this.f19997e, this.f19998f, this.f19999g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f19996c, this.f19998f, this.f19997e, this.f19999g, (Context) this.f19995b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public zb(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f19996c = j3;
        this.f19998f = j10;
        this.f19997e = i11;
        this.f19999g = z10;
        this.f19995b = context;
        this.h = str;
    }

    public zb(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f19995b = messagesController;
        this.f19996c = j3;
        this.d = i10;
        this.f19997e = i11;
        this.f19998f = j10;
        this.f19999g = z10;
        this.h = runnable;
    }
}
