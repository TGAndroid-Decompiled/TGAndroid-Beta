package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class kh0 implements Runnable {
    public final int f38610a;
    public final long f38611b;
    public final Object f38612c;

    public kh0(Object obj, long j10, int i10) {
        this.f38610a = i10;
        this.f38612c = obj;
        this.f38611b = j10;
    }

    @Override
    public final void run() {
        ri.m mVar;
        switch (this.f38610a) {
            case 0:
                qn qnVar = ((di) this.f38612c).e;
                qnVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f38611b;
                bundle.putLong("user_id", j10);
                if (j10 == qnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((org.telegram.ui.ActionBar.j3) this.f38612c).run(Long.valueOf(this.f38611b));
                return;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.f38612c;
                e0Var.getClass();
                e0Var.presentFragment(qn.W9(this.f38611b));
                return;
            case 3:
                ri.o oVar = (ri.o) ((cc.e) this.f38612c).f5093c;
                if (this.f38611b == oVar.f45844p && (mVar = oVar.f45842n) != ri.m.f45829r && mVar != ri.m.f45830s && mVar != ri.m.f45828n) {
                    SystemClock.elapsedRealtime();
                    oVar.f45851x = false;
                    oVar.r(ri.m.f45826c);
                    oVar.f45837i.removeCallbacks(oVar.E);
                    ri.b bVar = oVar.h;
                    bVar.b("recording started: retainedDurationMs=" + ri.o.q(oVar.f45845q));
                    return;
                }
                return;
            default:
                ug.y0 y0Var = (ug.y0) this.f38612c;
                HashSet hashSet = y0Var.f47786e0;
                hashSet.remove(Long.valueOf(this.f38611b));
                y0Var.Y.b(true, hashSet, new ug.s0(y0Var, 5), null);
                y0Var.c0(true, false);
                return;
        }
    }
}
