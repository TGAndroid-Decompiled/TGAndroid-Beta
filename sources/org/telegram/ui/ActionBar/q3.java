package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.c20;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.tgnet.TLRPC;
public final class q3 implements c20 {
    public final c20 f28409a;
    public final TLRPC.WallPaper f28410b;
    public final int f28411c;
    public final int d;
    public final long f28412e;

    public q3(c20 c20Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.f28409a = c20Var;
        this.f28410b = wallPaper;
        this.f28411c = i7;
        this.d = i10;
        this.f28412e = j3;
    }

    @Override
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        c20 c20Var = this.f28409a;
        if (aVar != null) {
            c20Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f28410b;
        hc b10 = hc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.f21241z1 = false;
        Point point = org.telegram.messenger.g0.f22567q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        imageReceiver.q0(b10, (min / org.telegram.messenger.g0.f22566p) + "_" + (max / org.telegram.messenger.g0.f22566p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.f21200g1 = new org.telegram.tgnet.f(this.f28411c, this.d, this.f28412e, c20Var);
        gc.D().M(imageReceiver, null);
    }
}
