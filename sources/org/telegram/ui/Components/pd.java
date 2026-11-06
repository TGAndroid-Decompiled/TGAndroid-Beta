package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pd implements org.telegram.messenger.c20 {
    public final int f36855a = 0;
    public final Object f36856b;
    public final boolean f36857c;
    public final int d;
    public final int f36858e;
    public final boolean f36859f;
    public final String f36860g;
    public final Object h;
    public final Object f36861i;
    public final Object f36862j;

    public pd(pf pfVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, String str, Object obj2) {
        this.h = pfVar;
        this.f36856b = obj;
        this.f36861i = gfVar;
        this.f36857c = z9;
        this.d = i7;
        this.f36858e = i10;
        this.f36859f = z10;
        this.f36860g = str;
        this.f36862j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f36855a;
        Object obj2 = this.f36861i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.s5;
                bd bdVar = new bd(chatActivityEnterView, (TLRPC.Document) obj2, this.f36860g, (org.telegram.messenger.ej) this.f36862j, this.f36857c, this.d, this.f36858e, this.f36856b, (Long) obj, this.f36859f);
                if (!chatActivityEnterView.r1(bdVar)) {
                    bdVar.run();
                    return;
                }
                return;
            default:
                pf pfVar = (pf) obj3;
                bd bdVar2 = new bd(pfVar, this.f36856b, (org.telegram.messenger.gf) obj2, this.f36857c, this.d, this.f36858e, this.f36859f, (Long) obj, this.f36860g, this.f36862j);
                if (!pfVar.f36874a.r1(bdVar2)) {
                    bdVar2.run();
                    return;
                }
                return;
        }
    }

    public pd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.f36861i = document;
        this.f36860g = str;
        this.f36862j = ejVar;
        this.f36857c = z9;
        this.d = i7;
        this.f36858e = i10;
        this.f36856b = obj;
        this.f36859f = z10;
    }
}
