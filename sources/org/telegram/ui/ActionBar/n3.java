package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.u10;
import org.telegram.messenger.zb;
import org.telegram.tgnet.TLRPC;
public final class n3 implements u10 {
    public final u10 f28353a;
    public final TLRPC.WallPaper f28354b;
    public final int f28355c;
    public final int d;
    public final long f28356e;

    public n3(u10 u10Var, TLRPC.WallPaper wallPaper, int i3, int i10, long j10) {
        this.f28353a = u10Var;
        this.f28354b = wallPaper;
        this.f28355c = i3;
        this.d = i10;
        this.f28356e = j10;
    }

    @Override
    public final void a(Object obj) {
        hg.a aVar = (hg.a) obj;
        u10 u10Var = this.f28353a;
        if (aVar != null) {
            u10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f28354b;
        ac b10 = ac.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.f22608q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        imageReceiver.q0(b10, (min / org.telegram.messenger.g0.f22607p) + "_" + (max / org.telegram.messenger.g0.f22607p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.f21247h1 = new org.telegram.tgnet.f(this.f28355c, this.d, this.f28356e, u10Var);
        zb.D().M(imageReceiver, null);
    }
}
