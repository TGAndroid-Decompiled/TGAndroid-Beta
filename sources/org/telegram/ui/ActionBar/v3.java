package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class v3 implements q20 {
    public final q20 f21408a;
    public final TLRPC.WallPaper f21409b;
    public final int f21410c;
    public final int d;
    public final long e;

    public v3(q20 q20Var, TLRPC.WallPaper wallPaper, int i10, int i11, long j10) {
        this.f21408a = q20Var;
        this.f21409b = wallPaper;
        this.f21410c = i10;
        this.d = i11;
        this.e = j10;
    }

    @Override
    public final void a(Object obj) {
        wf.a aVar = (wf.a) obj;
        q20 q20Var = this.f21408a;
        if (aVar != null) {
            q20Var.a(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.f21409b;
        ic b10 = ic.b(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.f14424z1 = false;
        Point point = org.telegram.messenger.i0.f16026q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        imageReceiver.q0(b10, (min / org.telegram.messenger.i0.f16025p) + "_" + (max / org.telegram.messenger.i0.f16025p) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.f14382g1 = new org.telegram.tgnet.g(this.f21410c, this.d, this.e, q20Var);
        hc.D().M(imageReceiver, null);
    }
}
