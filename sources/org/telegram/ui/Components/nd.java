package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nd implements org.telegram.messenger.u10 {
    public final int f36449a = 0;
    public final Object f36450b;
    public final boolean f36451c;
    public final int d;
    public final int f36452e;
    public final boolean f36453f;
    public final String f36454g;
    public final Object h;
    public final Object f36455i;
    public final Object f36456j;

    public nd(nf nfVar, Object obj, org.telegram.messenger.ye yeVar, boolean z10, int i3, int i10, boolean z11, String str, Object obj2) {
        this.h = nfVar;
        this.f36450b = obj;
        this.f36455i = yeVar;
        this.f36451c = z10;
        this.d = i3;
        this.f36452e = i10;
        this.f36453f = z11;
        this.f36454g = str;
        this.f36456j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f36449a;
        Object obj2 = this.f36455i;
        Object obj3 = this.h;
        switch (i3) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.f31082t5;
                zc zcVar = new zc(chatActivityEnterView, (TLRPC.Document) obj2, this.f36454g, (org.telegram.messenger.vi) this.f36456j, this.f36451c, this.d, this.f36452e, this.f36450b, (Long) obj, this.f36453f);
                if (!chatActivityEnterView.q1(zcVar)) {
                    zcVar.run();
                    return;
                }
                return;
            default:
                nf nfVar = (nf) obj3;
                zc zcVar2 = new zc(nfVar, this.f36450b, (org.telegram.messenger.ye) obj2, this.f36451c, this.d, this.f36452e, this.f36453f, (Long) obj, this.f36454g, this.f36456j);
                if (!nfVar.f36497a.q1(zcVar2)) {
                    zcVar2.run();
                    return;
                }
                return;
        }
    }

    public nd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.vi viVar, boolean z10, int i3, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f36455i = document;
        this.f36454g = str;
        this.f36456j = viVar;
        this.f36451c = z10;
        this.d = i3;
        this.f36452e = i10;
        this.f36450b = obj;
        this.f36453f = z11;
    }
}
