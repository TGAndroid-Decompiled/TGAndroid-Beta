package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zb implements RequestDelegate {
    public final int f20236a = 0;
    public final Object f20237b;
    public final long f20238c;
    public final int d;
    public final int e;
    public final long f20239f;
    public final boolean f20240g;
    public final Object h;

    public zb(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f20237b = messagesController;
        this.f20238c = j10;
        this.f20239f = j11;
        this.d = i10;
        this.e = i11;
        this.f20240g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20236a) {
            case 0:
                ((MessagesController) this.f20237b).lambda$deleteDialog$141(this.f20238c, this.f20239f, this.d, this.e, this.f20240g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20237b).lambda$deleteMessagesRange$469(this.f20238c, this.d, this.e, this.f20239f, this.f20240g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f20238c, this.f20239f, this.e, this.f20240g, (Context) this.f20237b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public zb(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f20238c = j10;
        this.f20239f = j11;
        this.e = i11;
        this.f20240g = z10;
        this.f20237b = context;
        this.h = str;
    }

    public zb(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f20237b = messagesController;
        this.f20238c = j10;
        this.d = i10;
        this.e = i11;
        this.f20239f = j11;
        this.f20240g = z10;
        this.h = runnable;
    }
}
