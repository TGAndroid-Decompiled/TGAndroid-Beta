package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class r3 implements x10 {
    public final x10 f29952a;
    public final TLRPC.WallPaper f29953b;
    public final int f29954c;
    public final int d;
    public final long f29955e;

    public r3(x10 x10Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.f29952a = x10Var;
        this.f29953b = wallPaper;
        this.f29954c = i7;
        this.d = i10;
        this.f29955e = j3;
    }

    @Override
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        x10 x10Var = this.f29952a;
        if (aVar != null) {
            x10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f29953b;
        fc b10 = fc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.f24121q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        imageReceiver.q0(b10, (min / org.telegram.messenger.g0.f24120p) + "_" + (max / org.telegram.messenger.g0.f24120p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.f22642h1 = new org.telegram.tgnet.f(this.f29954c, this.d, this.f29955e, x10Var);
        ec.D().M(imageReceiver, null);
    }
}
