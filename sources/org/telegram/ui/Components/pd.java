package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pd implements org.telegram.messenger.c20 {
    public final int f36897a = 0;
    public final Object f36898b;
    public final boolean f36899c;
    public final int d;
    public final int f36900e;
    public final boolean f36901f;
    public final String f36902g;
    public final Object h;
    public final Object f36903i;
    public final Object f36904j;

    public pd(pf pfVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, String str, Object obj2) {
        this.h = pfVar;
        this.f36898b = obj;
        this.f36903i = gfVar;
        this.f36899c = z9;
        this.d = i7;
        this.f36900e = i10;
        this.f36901f = z10;
        this.f36902g = str;
        this.f36904j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f36897a;
        Object obj2 = this.f36903i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.s5;
                bd bdVar = new bd(chatActivityEnterView, (TLRPC.Document) obj2, this.f36902g, (org.telegram.messenger.ej) this.f36904j, this.f36899c, this.d, this.f36900e, this.f36898b, (Long) obj, this.f36901f);
                if (!chatActivityEnterView.r1(bdVar)) {
                    bdVar.run();
                    return;
                }
                return;
            default:
                pf pfVar = (pf) obj3;
                bd bdVar2 = new bd(pfVar, this.f36898b, (org.telegram.messenger.gf) obj2, this.f36899c, this.d, this.f36900e, this.f36901f, (Long) obj, this.f36902g, this.f36904j);
                if (!pfVar.f36916a.r1(bdVar2)) {
                    bdVar2.run();
                    return;
                }
                return;
        }
    }

    public pd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.f36903i = document;
        this.f36902g = str;
        this.f36904j = ejVar;
        this.f36899c = z9;
        this.d = i7;
        this.f36900e = i10;
        this.f36898b = obj;
        this.f36901f = z10;
    }
}
