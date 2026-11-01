package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class jd implements org.telegram.messenger.r20 {
    public final int f27380a = 0;
    public final Object f27381b;
    public final boolean f27382c;
    public final int d;
    public final int e;
    public final boolean f27383f;
    public final String f27384g;
    public final Object h;
    public final Object f27385i;
    public final Object f27386j;

    public jd(lf lfVar, Object obj, org.telegram.messenger.ff ffVar, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = lfVar;
        this.f27381b = obj;
        this.f27385i = ffVar;
        this.f27382c = z10;
        this.d = i10;
        this.e = i11;
        this.f27383f = z11;
        this.f27384g = str;
        this.f27386j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f27380a;
        Object obj2 = this.f27385i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23673s5;
                uc ucVar = new uc(chatActivityEnterView, (TLRPC.Document) obj2, this.f27384g, (org.telegram.messenger.gj) this.f27386j, this.f27382c, this.d, this.e, this.f27381b, (Long) obj, this.f27383f);
                if (!chatActivityEnterView.p1(ucVar)) {
                    ucVar.run();
                    return;
                }
                return;
            default:
                lf lfVar = (lf) obj3;
                uc ucVar2 = new uc(lfVar, this.f27381b, (org.telegram.messenger.ff) obj2, this.f27382c, this.d, this.e, this.f27383f, (Long) obj, this.f27384g, this.f27386j);
                if (!lfVar.f28144a.p1(ucVar2)) {
                    ucVar2.run();
                    return;
                }
                return;
        }
    }

    public jd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.gj gjVar, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27385i = document;
        this.f27384g = str;
        this.f27386j = gjVar;
        this.f27382c = z10;
        this.d = i10;
        this.e = i11;
        this.f27381b = obj;
        this.f27383f = z11;
    }
}
