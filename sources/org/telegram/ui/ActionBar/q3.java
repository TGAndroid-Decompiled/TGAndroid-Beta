package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class q3 implements w10 {
    public final w10 f29993a;
    public final TLRPC.WallPaper f29994b;
    public final int f29995c;
    public final int d;
    public final long f29996e;

    public q3(w10 w10Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.f29993a = w10Var;
        this.f29994b = wallPaper;
        this.f29995c = i7;
        this.d = i10;
        this.f29996e = j3;
    }

    @Override
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        w10 w10Var = this.f29993a;
        if (aVar != null) {
            w10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f29994b;
        fc b10 = fc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.f24226q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        imageReceiver.r0(b10, (min / org.telegram.messenger.g0.f24225p) + "_" + (max / org.telegram.messenger.g0.f24225p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.f22737h1 = new org.telegram.tgnet.f(this.f29995c, this.d, this.f29996e, w10Var);
        ec.D().M(imageReceiver, null);
    }
}
