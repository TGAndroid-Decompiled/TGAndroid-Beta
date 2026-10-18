package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class lh0 implements Runnable {
    public final int f38832a;
    public final long f38833b;
    public final Object f38834c;

    public lh0(Object obj, long j10, int i10) {
        this.f38832a = i10;
        this.f38834c = obj;
        this.f38833b = j10;
    }

    @Override
    public final void run() {
        ri.n nVar;
        switch (this.f38832a) {
            case 0:
                sn snVar = ((fi) this.f38834c).e;
                snVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f38833b;
                bundle.putLong("user_id", j10);
                if (j10 == snVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((org.telegram.ui.ActionBar.j3) this.f38834c).run(Long.valueOf(this.f38833b));
                return;
            case 2:
                org.telegram.ui.web.f0 f0Var = (org.telegram.ui.web.f0) this.f38834c;
                f0Var.getClass();
                f0Var.presentFragment(sn.W9(this.f38833b));
                return;
            case 3:
                ri.p pVar = (ri.p) ((cc.e) this.f38834c).f5096c;
                if (this.f38833b == pVar.f45836o && (nVar = pVar.f45834m) != ri.n.f45822r && nVar != ri.n.f45823s && nVar != ri.n.f45821n) {
                    SystemClock.elapsedRealtime();
                    pVar.f45843w = false;
                    pVar.r(ri.n.f45819c);
                    pVar.h.removeCallbacks(pVar.D);
                    ri.b bVar = pVar.f45829g;
                    bVar.b("recording started: retainedDurationMs=" + ri.p.q(pVar.f45837p));
                    return;
                }
                return;
            default:
                ug.y0 y0Var = (ug.y0) this.f38834c;
                HashSet hashSet = y0Var.f47779e0;
                hashSet.remove(Long.valueOf(this.f38833b));
                y0Var.Y.b(true, hashSet, new ug.s0(y0Var, 5), null);
                y0Var.c0(true, false);
                return;
        }
    }
}
