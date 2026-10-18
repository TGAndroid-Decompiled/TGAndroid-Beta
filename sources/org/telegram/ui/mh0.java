package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class mh0 implements Runnable {
    public final int f39216a;
    public final long f39217b;
    public final Object f39218c;

    public mh0(Object obj, long j10, int i10) {
        this.f39216a = i10;
        this.f39218c = obj;
        this.f39217b = j10;
    }

    @Override
    public final void run() {
        ri.n nVar;
        switch (this.f39216a) {
            case 0:
                sn snVar = ((fi) this.f39218c).e;
                snVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f39217b;
                bundle.putLong("user_id", j10);
                if (j10 == snVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((org.telegram.ui.ActionBar.j3) this.f39218c).run(Long.valueOf(this.f39217b));
                return;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.f39218c;
                e0Var.getClass();
                e0Var.presentFragment(sn.W9(this.f39217b));
                return;
            case 3:
                ri.p pVar = (ri.p) ((cc.e) this.f39218c).f5096c;
                if (this.f39217b == pVar.f45884o && (nVar = pVar.f45882m) != ri.n.f45870r && nVar != ri.n.f45871s && nVar != ri.n.f45869n) {
                    SystemClock.elapsedRealtime();
                    pVar.f45891w = false;
                    pVar.r(ri.n.f45867c);
                    pVar.h.removeCallbacks(pVar.D);
                    ri.b bVar = pVar.f45877g;
                    bVar.b("recording started: retainedDurationMs=" + ri.p.q(pVar.f45885p));
                    return;
                }
                return;
            default:
                ug.y0 y0Var = (ug.y0) this.f39218c;
                HashSet hashSet = y0Var.f47826e0;
                hashSet.remove(Long.valueOf(this.f39217b));
                y0Var.Y.b(true, hashSet, new ug.s0(y0Var, 5), null);
                y0Var.c0(true, false);
                return;
        }
    }
}
