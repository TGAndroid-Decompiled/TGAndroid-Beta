package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pd implements org.telegram.messenger.c20 {
    public final int f36989a = 0;
    public final Object f36990b;
    public final boolean f36991c;
    public final int d;
    public final int f36992e;
    public final boolean f36993f;
    public final String f36994g;
    public final Object h;
    public final Object f36995i;
    public final Object f36996j;

    public pd(pf pfVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, String str, Object obj2) {
        this.h = pfVar;
        this.f36990b = obj;
        this.f36995i = gfVar;
        this.f36991c = z9;
        this.d = i7;
        this.f36992e = i10;
        this.f36993f = z10;
        this.f36994g = str;
        this.f36996j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f36989a;
        Object obj2 = this.f36995i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.s5;
                bd bdVar = new bd(chatActivityEnterView, (TLRPC.Document) obj2, this.f36994g, (org.telegram.messenger.ej) this.f36996j, this.f36991c, this.d, this.f36992e, this.f36990b, (Long) obj, this.f36993f);
                if (!chatActivityEnterView.r1(bdVar)) {
                    bdVar.run();
                    return;
                }
                return;
            default:
                pf pfVar = (pf) obj3;
                bd bdVar2 = new bd(pfVar, this.f36990b, (org.telegram.messenger.gf) obj2, this.f36991c, this.d, this.f36992e, this.f36993f, (Long) obj, this.f36994g, this.f36996j);
                if (!pfVar.f37005a.r1(bdVar2)) {
                    bdVar2.run();
                    return;
                }
                return;
        }
    }

    public pd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.f36995i = document;
        this.f36994g = str;
        this.f36996j = ejVar;
        this.f36991c = z9;
        this.d = i7;
        this.f36992e = i10;
        this.f36990b = obj;
        this.f36993f = z10;
    }
}
