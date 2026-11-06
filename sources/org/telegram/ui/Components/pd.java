package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pd implements org.telegram.messenger.c20 {
    public final int f36871a = 0;
    public final Object f36872b;
    public final boolean f36873c;
    public final int d;
    public final int f36874e;
    public final boolean f36875f;
    public final String f36876g;
    public final Object h;
    public final Object f36877i;
    public final Object f36878j;

    public pd(pf pfVar, Object obj, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10, String str, Object obj2) {
        this.h = pfVar;
        this.f36872b = obj;
        this.f36877i = gfVar;
        this.f36873c = z9;
        this.d = i7;
        this.f36874e = i10;
        this.f36875f = z10;
        this.f36876g = str;
        this.f36878j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f36871a;
        Object obj2 = this.f36877i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.s5;
                bd bdVar = new bd(chatActivityEnterView, (TLRPC.Document) obj2, this.f36876g, (org.telegram.messenger.ej) this.f36878j, this.f36873c, this.d, this.f36874e, this.f36872b, (Long) obj, this.f36875f);
                if (!chatActivityEnterView.r1(bdVar)) {
                    bdVar.run();
                    return;
                }
                return;
            default:
                pf pfVar = (pf) obj3;
                bd bdVar2 = new bd(pfVar, this.f36872b, (org.telegram.messenger.gf) obj2, this.f36873c, this.d, this.f36874e, this.f36875f, (Long) obj, this.f36876g, this.f36878j);
                if (!pfVar.f36890a.r1(bdVar2)) {
                    bdVar2.run();
                    return;
                }
                return;
        }
    }

    public pd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.f36877i = document;
        this.f36876g = str;
        this.f36878j = ejVar;
        this.f36873c = z9;
        this.d = i7;
        this.f36874e = i10;
        this.f36872b = obj;
        this.f36875f = z10;
    }
}
