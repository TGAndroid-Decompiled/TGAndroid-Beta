package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class cc implements org.telegram.messenger.r20 {
    public final int f36284a;
    public final zc f36285b;

    public cc(zc zcVar, int i10) {
        this.f36284a = i10;
        this.f36285b = zcVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f36284a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                zc zcVar = this.f36285b;
                zcVar.E = wallPaper;
                zcVar.F = wallPaper;
                zcVar.G = wallPaper;
                zcVar.e1(false);
                zcVar.h1(false);
                org.telegram.messenger.i0.h3(new dc(zcVar, 1), 350L);
                return;
            case 1:
                zc.a0(this.f36285b, (org.telegram.messenger.h3) obj);
                return;
            default:
                this.f36285b.d1((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
