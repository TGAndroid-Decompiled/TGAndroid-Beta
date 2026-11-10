package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class od implements org.telegram.messenger.c20 {
    public final int f36583a = 0;
    public final Object f36584b;
    public final boolean f36585c;
    public final int d;
    public final int f36586e;
    public final boolean f36587f;
    public final String f36588g;
    public final Object h;
    public final Object f36589i;
    public final Object f36590j;

    public od(of ofVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, String str, Object obj2) {
        this.h = ofVar;
        this.f36584b = obj;
        this.f36589i = gfVar;
        this.f36585c = z9;
        this.d = i7;
        this.f36586e = i10;
        this.f36587f = z10;
        this.f36588g = str;
        this.f36590j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f36583a;
        Object obj2 = this.f36589i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.s5;
                ad adVar = new ad(chatActivityEnterView, (TLRPC.Document) obj2, this.f36588g, (org.telegram.messenger.ej) this.f36590j, this.f36585c, this.d, this.f36586e, this.f36584b, (Long) obj, this.f36587f);
                if (!chatActivityEnterView.r1(adVar)) {
                    adVar.run();
                    return;
                }
                return;
            default:
                of ofVar = (of) obj3;
                ad adVar2 = new ad(ofVar, this.f36584b, (org.telegram.messenger.gf) obj2, this.f36585c, this.d, this.f36586e, this.f36587f, (Long) obj, this.f36588g, this.f36590j);
                if (!ofVar.f36599a.r1(adVar2)) {
                    adVar2.run();
                    return;
                }
                return;
        }
    }

    public od(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.f36589i = document;
        this.f36588g = str;
        this.f36590j = ejVar;
        this.f36585c = z9;
        this.d = i7;
        this.f36586e = i10;
        this.f36584b = obj;
        this.f36587f = z10;
    }
}
