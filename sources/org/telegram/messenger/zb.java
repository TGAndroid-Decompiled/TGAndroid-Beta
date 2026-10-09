package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zb implements RequestDelegate {
    public final int f19990a = 0;
    public final Object f19991b;
    public final long f19992c;
    public final int d;
    public final int f19993e;
    public final long f19994f;
    public final boolean f19995g;
    public final Object h;

    public zb(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f19991b = messagesController;
        this.f19992c = j3;
        this.f19994f = j10;
        this.d = i10;
        this.f19993e = i11;
        this.f19995g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19990a) {
            case 0:
                ((MessagesController) this.f19991b).lambda$deleteDialog$141(this.f19992c, this.f19994f, this.d, this.f19993e, this.f19995g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19991b).lambda$deleteMessagesRange$469(this.f19992c, this.d, this.f19993e, this.f19994f, this.f19995g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f19992c, this.f19994f, this.f19993e, this.f19995g, (Context) this.f19991b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public zb(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f19992c = j3;
        this.f19994f = j10;
        this.f19993e = i11;
        this.f19995g = z10;
        this.f19991b = context;
        this.h = str;
    }

    public zb(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f19991b = messagesController;
        this.f19992c = j3;
        this.d = i10;
        this.f19993e = i11;
        this.f19994f = j10;
        this.f19995g = z10;
        this.h = runnable;
    }
}
