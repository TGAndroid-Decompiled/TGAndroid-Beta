package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yd implements org.telegram.messenger.y10 {
    public final int f42413a = 0;
    public final Object f42414b;
    public final boolean f42415c;
    public final int d;
    public final int f42416e;
    public final boolean f42417f;
    public final String f42418g;
    public final Object h;
    public final Object f42419i;
    public final Object f42420j;

    public yd(ig igVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = igVar;
        this.f42414b = obj;
        this.f42419i = ffVar;
        this.f42415c = z10;
        this.d = i7;
        this.f42416e = i10;
        this.f42417f = z11;
        this.f42418g = str;
        this.f42420j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42413a;
        Object obj2 = this.f42419i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.f32569s7;
                jd jdVar = new jd(chatActivityEnterView, (TLRPC.Document) obj2, this.f42418g, (org.telegram.messenger.cj) this.f42420j, this.f42415c, this.d, this.f42416e, this.f42414b, (Long) obj, this.f42417f);
                if (!chatActivityEnterView.V1(jdVar)) {
                    jdVar.run();
                    return;
                }
                return;
            default:
                ig igVar = (ig) obj3;
                jd jdVar2 = new jd(igVar, this.f42414b, (org.telegram.messenger.ff) obj2, this.f42415c, this.d, this.f42416e, this.f42417f, (Long) obj, this.f42418g, this.f42420j);
                if (!igVar.f36246a.V1(jdVar2)) {
                    jdVar2.run();
                    return;
                }
                return;
        }
    }

    public yd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f42419i = document;
        this.f42418g = str;
        this.f42420j = cjVar;
        this.f42415c = z10;
        this.d = i7;
        this.f42416e = i10;
        this.f42414b = obj;
        this.f42417f = z11;
    }
}
