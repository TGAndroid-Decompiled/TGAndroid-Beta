package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class n3 implements z10 {
    public final z10 f29403a;
    public final TLRPC.WallPaper f29404b;
    public final int f29405c;
    public final int d;
    public final long f29406e;

    public n3(z10 z10Var, TLRPC.WallPaper wallPaper, int i7, int i10, long j3) {
        this.f29403a = z10Var;
        this.f29404b = wallPaper;
        this.f29405c = i7;
        this.d = i10;
        this.f29406e = j3;
    }

    @Override
    public final void a(Object obj) {
        gg.a aVar = (gg.a) obj;
        z10 z10Var = this.f29403a;
        if (aVar != null) {
            z10Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f29404b;
        gc b10 = gc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.A1 = false;
        Point point = org.telegram.messenger.g0.f23611q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        imageReceiver.q0(b10, (min / org.telegram.messenger.g0.f23610p) + "_" + (max / org.telegram.messenger.g0.f23610p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.f22276h1 = new org.telegram.tgnet.f(this.f29405c, this.d, this.f29406e, z10Var);
        fc.D().M(imageReceiver, null);
    }
}
