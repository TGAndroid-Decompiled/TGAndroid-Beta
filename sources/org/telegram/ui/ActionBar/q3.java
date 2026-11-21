package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class q3 implements x10 {
    public final x10 f29933a;
    public final TLRPC.WallPaper f29934b;
    public final int f29935c;
    public final int d;
    public final long f29936e;

    public q3(x10 x10Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.f29933a = x10Var;
        this.f29934b = wallPaper;
        this.f29935c = i7;
        this.d = i10;
        this.f29936e = j3;
    }

    @Override
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        x10 x10Var = this.f29933a;
        if (aVar != null) {
            x10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f29934b;
        fc b10 = fc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.f24146q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        imageReceiver.q0(b10, (min / org.telegram.messenger.g0.f24145p) + "_" + (max / org.telegram.messenger.g0.f24145p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.f22667h1 = new org.telegram.tgnet.f(this.f29935c, this.d, this.f29936e, x10Var);
        ec.D().M(imageReceiver, null);
    }
}
