package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zd implements org.telegram.messenger.w10 {
    public final int f42828a = 0;
    public final Object f42829b;
    public final boolean f42830c;
    public final int d;
    public final int f42831e;
    public final boolean f42832f;
    public final String f42833g;
    public final Object h;
    public final Object f42834i;
    public final Object f42835j;

    public zd(hg hgVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f42829b = obj;
        this.f42834i = efVar;
        this.f42830c = z10;
        this.d = i7;
        this.f42831e = i10;
        this.f42832f = z11;
        this.f42833g = str;
        this.f42835j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42828a;
        Object obj2 = this.f42834i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.f32633s7;
                jd jdVar = new jd(chatActivityEnterView, (TLRPC.Document) obj2, this.f42833g, (org.telegram.messenger.bj) this.f42835j, this.f42830c, this.d, this.f42831e, this.f42829b, (Long) obj, this.f42832f);
                if (!chatActivityEnterView.X1(jdVar)) {
                    jdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                jd jdVar2 = new jd(hgVar, this.f42829b, (org.telegram.messenger.ef) obj2, this.f42830c, this.d, this.f42831e, this.f42832f, (Long) obj, this.f42833g, this.f42835j);
                if (!hgVar.f35730a.X1(jdVar2)) {
                    jdVar2.run();
                    return;
                }
                return;
        }
    }

    public zd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f42834i = document;
        this.f42833g = str;
        this.f42835j = bjVar;
        this.f42830c = z10;
        this.d = i7;
        this.f42831e = i10;
        this.f42829b = obj;
        this.f42832f = z11;
    }
}
