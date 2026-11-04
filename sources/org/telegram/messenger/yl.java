package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yl implements RequestDelegate {
    public final int f26600a;
    public final long f26601b;
    public final int f26602c;
    public final Object d;

    public yl(c1 c1Var, long j10, int i3, int i10) {
        this.f26600a = i10;
        this.d = c1Var;
        this.f26601b = j10;
        this.f26602c = i3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26600a) {
            case 0:
                hp hpVar = (hp) this.d;
                HashMap hashMap = hpVar.f23121s8;
                hashMap.remove(this.f26601b + "_" + this.f26602c);
                if (tL_error == null && tLObject != null) {
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                c00 c00Var = (c00) this.d;
                a0.h hVar = new a0.h();
                boolean z10 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                long j10 = this.f26601b;
                int i3 = this.f26602c;
                int i10 = 0;
                if (z10) {
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i10 < tL_messages_savedDialogs.messages.size()) {
                        hVar.k(tL_messages_savedDialogs.messages.get(i10), tL_messages_savedDialogs.messages.get(i10).f27022id);
                        i10++;
                    }
                    g0.h3(new z1(c00Var, tL_messages_savedDialogs, j10, hVar, i3, 8));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
                    while (i10 < tL_messages_savedDialogsSlice.messages.size()) {
                        hVar.k(tL_messages_savedDialogsSlice.messages.get(i10), tL_messages_savedDialogsSlice.messages.get(i10).f27022id);
                        i10++;
                    }
                    g0.h3(new z1(c00Var, tL_messages_savedDialogsSlice, j10, hVar, i3, 7));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    g0.h3(new zq(c00Var, j10, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 5));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                    while (i10 < tL_messages_forumTopics.messages.size()) {
                        hVar.k(tL_messages_forumTopics.messages.get(i10), tL_messages_forumTopics.messages.get(i10).f27022id);
                        i10++;
                    }
                    g0.h3(new ci.d8(c00Var, tL_messages_forumTopics, j10, tL_messages_forumTopics, hVar, i3));
                    return;
                } else {
                    g0.h3(new uz(c00Var, j10, 0));
                    return;
                }
            default:
                g0.h3(new ci.f8(this.f26602c, 2, this.f26601b, (org.telegram.ui.i4) this.d, tLObject));
                return;
        }
    }

    public yl(org.telegram.ui.i4 i4Var, int i3, long j10) {
        this.f26600a = 2;
        this.d = i4Var;
        this.f26602c = i3;
        this.f26601b = j10;
    }
}
