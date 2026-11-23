package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yd implements org.telegram.messenger.y10 {
    public final int f42390a = 0;
    public final Object f42391b;
    public final boolean f42392c;
    public final int d;
    public final int f42393e;
    public final boolean f42394f;
    public final String f42395g;
    public final Object h;
    public final Object f42396i;
    public final Object f42397j;

    public yd(hg hgVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f42391b = obj;
        this.f42396i = ffVar;
        this.f42392c = z10;
        this.d = i7;
        this.f42393e = i10;
        this.f42394f = z11;
        this.f42395g = str;
        this.f42397j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42390a;
        Object obj2 = this.f42396i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.f32535s7;
                jd jdVar = new jd(chatActivityEnterView, (TLRPC.Document) obj2, this.f42395g, (org.telegram.messenger.cj) this.f42397j, this.f42392c, this.d, this.f42393e, this.f42391b, (Long) obj, this.f42394f);
                if (!chatActivityEnterView.V1(jdVar)) {
                    jdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                jd jdVar2 = new jd(hgVar, this.f42391b, (org.telegram.messenger.ff) obj2, this.f42392c, this.d, this.f42393e, this.f42394f, (Long) obj, this.f42395g, this.f42397j);
                if (!hgVar.f35830a.V1(jdVar2)) {
                    jdVar2.run();
                    return;
                }
                return;
        }
    }

    public yd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f42396i = document;
        this.f42395g = str;
        this.f42397j = cjVar;
        this.f42392c = z10;
        this.d = i7;
        this.f42393e = i10;
        this.f42391b = obj;
        this.f42394f = z11;
    }
}
