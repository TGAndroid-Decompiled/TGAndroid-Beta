package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class q3 implements y10 {
    public final y10 f29936a;
    public final TLRPC.WallPaper f29937b;
    public final int f29938c;
    public final int d;
    public final long f29939e;

    public q3(y10 y10Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.f29936a = y10Var;
        this.f29937b = wallPaper;
        this.f29938c = i7;
        this.d = i10;
        this.f29939e = j3;
    }

    @Override
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        y10 y10Var = this.f29936a;
        if (aVar != null) {
            y10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f29937b;
        gc b10 = gc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.f24046q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        imageReceiver.q0(b10, (min / org.telegram.messenger.g0.f24045p) + "_" + (max / org.telegram.messenger.g0.f24045p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.f22670h1 = new org.telegram.tgnet.f(this.f29938c, this.d, this.f29939e, y10Var);
        fc.D().M(imageReceiver, null);
    }
}
