package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
public final class v3 implements r20 {
    public final r20 f21409a;
    public final TLRPC.WallPaper f21410b;
    public final int f21411c;
    public final int d;
    public final long e;

    public v3(r20 r20Var, TLRPC.WallPaper wallPaper, int i10, int i11, long j10) {
        this.f21409a = r20Var;
        this.f21410b = wallPaper;
        this.f21411c = i10;
        this.d = i11;
        this.e = j10;
    }

    @Override
    public final void a(Object obj) {
        wf.a aVar = (wf.a) obj;
        r20 r20Var = this.f21409a;
        if (aVar != null) {
            r20Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f21410b;
        jc b10 = jc.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.f14425z1 = false;
        Point point = org.telegram.messenger.i0.f16172q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        imageReceiver.q0(b10, (min / org.telegram.messenger.i0.f16171p) + "_" + (max / org.telegram.messenger.i0.f16171p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.f14383g1 = new org.telegram.tgnet.g(this.f21411c, this.d, this.e, r20Var);
        ic.D().M(imageReceiver, null);
    }
}
