package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pd implements org.telegram.messenger.c20 {
    public final int f36976a = 0;
    public final Object f36977b;
    public final boolean f36978c;
    public final int d;
    public final int f36979e;
    public final boolean f36980f;
    public final String f36981g;
    public final Object h;
    public final Object f36982i;
    public final Object f36983j;

    public pd(pf pfVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, String str, Object obj2) {
        this.h = pfVar;
        this.f36977b = obj;
        this.f36982i = gfVar;
        this.f36978c = z9;
        this.d = i7;
        this.f36979e = i10;
        this.f36980f = z10;
        this.f36981g = str;
        this.f36983j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f36976a;
        Object obj2 = this.f36982i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.s5;
                bd bdVar = new bd(chatActivityEnterView, (TLRPC.Document) obj2, this.f36981g, (org.telegram.messenger.ej) this.f36983j, this.f36978c, this.d, this.f36979e, this.f36977b, (Long) obj, this.f36980f);
                if (!chatActivityEnterView.r1(bdVar)) {
                    bdVar.run();
                    return;
                }
                return;
            default:
                pf pfVar = (pf) obj3;
                bd bdVar2 = new bd(pfVar, this.f36977b, (org.telegram.messenger.gf) obj2, this.f36978c, this.d, this.f36979e, this.f36980f, (Long) obj, this.f36981g, this.f36983j);
                if (!pfVar.f36995a.r1(bdVar2)) {
                    bdVar2.run();
                    return;
                }
                return;
        }
    }

    public pd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.f36982i = document;
        this.f36981g = str;
        this.f36983j = ejVar;
        this.f36978c = z9;
        this.d = i7;
        this.f36979e = i10;
        this.f36977b = obj;
        this.f36980f = z10;
    }
}
