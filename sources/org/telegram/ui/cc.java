package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class cc implements org.telegram.messenger.q20 {
    public final int f36435a;
    public final zc f36436b;

    public cc(zc zcVar, int i10) {
        this.f36435a = i10;
        this.f36436b = zcVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f36435a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                zc zcVar = this.f36436b;
                zcVar.E = wallPaper;
                zcVar.F = wallPaper;
                zcVar.G = wallPaper;
                zcVar.d1(false);
                zcVar.g1(false);
                org.telegram.messenger.i0.h3(new dc(zcVar, 1), 350L);
                return;
            case 1:
                zc.Z(this.f36436b, (org.telegram.messenger.h3) obj);
                return;
            default:
                this.f36436b.c1((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
