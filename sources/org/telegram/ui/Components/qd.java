package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qd implements org.telegram.messenger.z10 {
    public final int f38630a = 0;
    public final Object f38631b;
    public final boolean f38632c;
    public final int d;
    public final int f38633e;
    public final boolean f38634f;
    public final String f38635g;
    public final Object h;
    public final Object f38636i;
    public final Object f38637j;

    public qd(wf wfVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = wfVar;
        this.f38631b = obj;
        this.f38636i = ffVar;
        this.f38632c = z10;
        this.d = i7;
        this.f38633e = i10;
        this.f38634f = z11;
        this.f38635g = str;
        this.f38637j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f38630a;
        Object obj2 = this.f38636i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.N6;
                ad adVar = new ad(chatActivityEnterView, (TLRPC.Document) obj2, this.f38635g, (org.telegram.messenger.cj) this.f38637j, this.f38632c, this.d, this.f38633e, this.f38631b, (Long) obj, this.f38634f);
                if (!chatActivityEnterView.J1(adVar)) {
                    adVar.run();
                    return;
                }
                return;
            default:
                wf wfVar = (wf) obj3;
                ad adVar2 = new ad(wfVar, this.f38631b, (org.telegram.messenger.ff) obj2, this.f38632c, this.d, this.f38633e, this.f38634f, (Long) obj, this.f38635g, this.f38637j);
                if (!wfVar.f41331a.J1(adVar2)) {
                    adVar2.run();
                    return;
                }
                return;
        }
    }

    public qd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f38636i = document;
        this.f38635g = str;
        this.f38637j = cjVar;
        this.f38632c = z10;
        this.d = i7;
        this.f38633e = i10;
        this.f38631b = obj;
        this.f38634f = z11;
    }
}
