package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class jd implements org.telegram.messenger.q20 {
    public final int f27325a = 0;
    public final Object f27326b;
    public final boolean f27327c;
    public final int d;
    public final int e;
    public final boolean f27328f;
    public final String f27329g;
    public final Object h;
    public final Object f27330i;
    public final Object f27331j;

    public jd(lf lfVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = lfVar;
        this.f27326b = obj;
        this.f27330i = efVar;
        this.f27327c = z10;
        this.d = i10;
        this.e = i11;
        this.f27328f = z11;
        this.f27329g = str;
        this.f27331j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f27325a;
        Object obj2 = this.f27330i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23672s5;
                uc ucVar = new uc(chatActivityEnterView, (TLRPC.Document) obj2, this.f27329g, (org.telegram.messenger.fj) this.f27331j, this.f27327c, this.d, this.e, this.f27326b, (Long) obj, this.f27328f);
                if (!chatActivityEnterView.p1(ucVar)) {
                    ucVar.run();
                    return;
                }
                return;
            default:
                lf lfVar = (lf) obj3;
                uc ucVar2 = new uc(lfVar, this.f27326b, (org.telegram.messenger.ef) obj2, this.f27327c, this.d, this.e, this.f27328f, (Long) obj, this.f27329g, this.f27331j);
                if (!lfVar.f28100a.p1(ucVar2)) {
                    ucVar2.run();
                    return;
                }
                return;
        }
    }

    public jd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.fj fjVar, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27330i = document;
        this.f27329g = str;
        this.f27331j = fjVar;
        this.f27327c = z10;
        this.d = i10;
        this.e = i11;
        this.f27326b = obj;
        this.f27328f = z11;
    }
}
