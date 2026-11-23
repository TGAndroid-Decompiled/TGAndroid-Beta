package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yd implements org.telegram.messenger.y10 {
    public final int f42412a = 0;
    public final Object f42413b;
    public final boolean f42414c;
    public final int d;
    public final int f42415e;
    public final boolean f42416f;
    public final String f42417g;
    public final Object h;
    public final Object f42418i;
    public final Object f42419j;

    public yd(ig igVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = igVar;
        this.f42413b = obj;
        this.f42418i = ffVar;
        this.f42414c = z10;
        this.d = i7;
        this.f42415e = i10;
        this.f42416f = z11;
        this.f42417g = str;
        this.f42419j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42412a;
        Object obj2 = this.f42418i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.f32569s7;
                jd jdVar = new jd(chatActivityEnterView, (TLRPC.Document) obj2, this.f42417g, (org.telegram.messenger.cj) this.f42419j, this.f42414c, this.d, this.f42415e, this.f42413b, (Long) obj, this.f42416f);
                if (!chatActivityEnterView.V1(jdVar)) {
                    jdVar.run();
                    return;
                }
                return;
            default:
                ig igVar = (ig) obj3;
                jd jdVar2 = new jd(igVar, this.f42413b, (org.telegram.messenger.ff) obj2, this.f42414c, this.d, this.f42415e, this.f42416f, (Long) obj, this.f42417g, this.f42419j);
                if (!igVar.f36245a.V1(jdVar2)) {
                    jdVar2.run();
                    return;
                }
                return;
        }
    }

    public yd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f42418i = document;
        this.f42417g = str;
        this.f42419j = cjVar;
        this.f42414c = z10;
        this.d = i7;
        this.f42415e = i10;
        this.f42413b = obj;
        this.f42416f = z11;
    }
}
