package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zm0;
public final class zm implements RequestDelegate {
    public final int f27981a = 0;
    public final int f27982b;
    public final boolean f27983c;
    public final TLRPC.User d;
    public final is f27984e;
    public final Object f27985f;

    public zm(np npVar, int i7, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.f27984e = npVar;
        this.f27982b = i7;
        this.f27985f = chat;
        this.d = user;
        this.f27983c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        switch (this.f27981a) {
            case 0:
                np npVar = (np) this.f27984e;
                TLRPC.Chat chat = (TLRPC.Chat) this.f27985f;
                npVar.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.f27982b));
                    vr messagesStorage = npVar.getMessagesStorage();
                    if (chat != null) {
                        j3 = -chat.f28051id;
                    } else {
                        j3 = this.d.f28200id;
                    }
                    messagesStorage.c2(j3, arrayList, !this.f27983c, -1, 0, false, null);
                    npVar.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                g0.h3(new oi.n2((zm0) this.f27984e, (String) this.f27985f, this.f27982b, tLObject, this.f27983c, this.d));
                return;
        }
    }

    public zm(zm0 zm0Var, String str, int i7, boolean z10, TLRPC.User user) {
        this.f27984e = zm0Var;
        this.f27985f = str;
        this.f27982b = i7;
        this.f27983c = z10;
        this.d = user;
    }
}
