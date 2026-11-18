package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yd implements org.telegram.messenger.x10 {
    public final int f42470a = 0;
    public final Object f42471b;
    public final boolean f42472c;
    public final int d;
    public final int f42473e;
    public final boolean f42474f;
    public final String f42475g;
    public final Object h;
    public final Object f42476i;
    public final Object f42477j;

    public yd(fg fgVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = fgVar;
        this.f42471b = obj;
        this.f42476i = efVar;
        this.f42472c = z10;
        this.d = i7;
        this.f42473e = i10;
        this.f42474f = z11;
        this.f42475g = str;
        this.f42477j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42470a;
        Object obj2 = this.f42476i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.f32538n7;
                jd jdVar = new jd(chatActivityEnterView, (TLRPC.Document) obj2, this.f42475g, (org.telegram.messenger.bj) this.f42477j, this.f42472c, this.d, this.f42473e, this.f42471b, (Long) obj, this.f42474f);
                if (!chatActivityEnterView.R1(jdVar)) {
                    jdVar.run();
                    return;
                }
                return;
            default:
                fg fgVar = (fg) obj3;
                jd jdVar2 = new jd(fgVar, this.f42471b, (org.telegram.messenger.ef) obj2, this.f42472c, this.d, this.f42473e, this.f42474f, (Long) obj, this.f42475g, this.f42477j);
                if (!fgVar.f35077a.R1(jdVar2)) {
                    jdVar2.run();
                    return;
                }
                return;
        }
    }

    public yd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f42476i = document;
        this.f42475g = str;
        this.f42477j = bjVar;
        this.f42472c = z10;
        this.d = i7;
        this.f42473e = i10;
        this.f42471b = obj;
        this.f42474f = z11;
    }
}
