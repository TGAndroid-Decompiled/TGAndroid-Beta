package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.c20;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.tgnet.TLRPC;
public final class p3 implements c20 {
    public final c20 f28367a;
    public final TLRPC.WallPaper f28368b;
    public final int f28369c;
    public final int d;
    public final long f28370e;

    public p3(c20 c20Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.f28367a = c20Var;
        this.f28368b = wallPaper;
        this.f28369c = i7;
        this.d = i10;
        this.f28370e = j3;
    }

    @Override
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        c20 c20Var = this.f28367a;
        if (aVar != null) {
            c20Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f28368b;
        hc b10 = hc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.f21236z1 = false;
        Point point = org.telegram.messenger.g0.f22563q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        imageReceiver.q0(b10, (min / org.telegram.messenger.g0.f22562p) + "_" + (max / org.telegram.messenger.g0.f22562p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.f21195g1 = new org.telegram.tgnet.f(this.f28369c, this.d, this.f28370e, c20Var);
        gc.D().M(imageReceiver, null);
    }
}
