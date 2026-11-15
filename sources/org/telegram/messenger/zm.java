package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ym0;
public final class zm implements RequestDelegate {
    public final int f27971a = 0;
    public final int f27972b;
    public final boolean f27973c;
    public final TLRPC.User d;
    public final is f27974e;
    public final Object f27975f;

    public zm(np npVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f27974e = npVar;
        this.f27972b = i7;
        this.f27975f = chat;
        this.d = user;
        this.f27973c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        switch (this.f27971a) {
            case 0:
                np npVar = (np) this.f27974e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f27975f;
                npVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f27972b));
                    vr messagesStorage = npVar.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f28051id;
                    } else {
                        j3 = this.d.f28200id;
                    }
                    messagesStorage.c2(j3, arrayList, !this.f27973c, -1, 0, false, null);
                    npVar.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.h3(new oi.n2((ym0) this.f27974e, (String) this.f27975f, this.f27972b, tLObject, this.f27973c, this.d));
                return;
        }
    }

    public zm(ym0 ym0Var, String str, int i7, boolean z10, TLRPC.User user) {
        this.f27974e = ym0Var;
        this.f27975f = str;
        this.f27972b = i7;
        this.f27973c = z10;
        this.d = user;
    }
}
