package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qd implements org.telegram.messenger.z10 {
    public final int f38628a = 0;
    public final Object f38629b;
    public final boolean f38630c;
    public final int d;
    public final int f38631e;
    public final boolean f38632f;
    public final String f38633g;
    public final Object h;
    public final Object f38634i;
    public final Object f38635j;

    public qd(wf wfVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = wfVar;
        this.f38629b = obj;
        this.f38634i = ffVar;
        this.f38630c = z10;
        this.d = i7;
        this.f38631e = i10;
        this.f38632f = z11;
        this.f38633g = str;
        this.f38635j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f38628a;
        Object obj2 = this.f38634i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.N6;
                ad adVar = new ad(chatActivityEnterView, (TLRPC.Document) obj2, this.f38633g, (org.telegram.messenger.cj) this.f38635j, this.f38630c, this.d, this.f38631e, this.f38629b, (Long) obj, this.f38632f);
                if (!chatActivityEnterView.J1(adVar)) {
                    adVar.run();
                    return;
                }
                return;
            default:
                wf wfVar = (wf) obj3;
                ad adVar2 = new ad(wfVar, this.f38629b, (org.telegram.messenger.ff) obj2, this.f38630c, this.d, this.f38631e, this.f38632f, (Long) obj, this.f38633g, this.f38635j);
                if (!wfVar.f41334a.J1(adVar2)) {
                    adVar2.run();
                    return;
                }
                return;
        }
    }

    public qd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f38634i = document;
        this.f38633g = str;
        this.f38635j = cjVar;
        this.f38630c = z10;
        this.d = i7;
        this.f38631e = i10;
        this.f38629b = obj;
        this.f38632f = z11;
    }
}
