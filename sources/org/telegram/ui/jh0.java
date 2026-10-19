package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class jh0 implements Runnable {
    public final int f38258a;
    public final long f38259b;
    public final Object f38260c;

    public jh0(Object obj, long j10, int i10) {
        this.f38258a = i10;
        this.f38260c = obj;
        this.f38259b = j10;
    }

    @Override
    public final void run() {
        ri.n nVar;
        switch (this.f38258a) {
            case 0:
                qn qnVar = ((di) this.f38260c).e;
                qnVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f38259b;
                bundle.putLong("user_id", j10);
                if (j10 == qnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((org.telegram.ui.ActionBar.j3) this.f38260c).run(Long.valueOf(this.f38259b));
                return;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.f38260c;
                e0Var.getClass();
                e0Var.presentFragment(qn.W9(this.f38259b));
                return;
            case 3:
                ri.p pVar = (ri.p) ((cc.e) this.f38260c).f5095c;
                if (this.f38259b == pVar.f45836o && (nVar = pVar.f45834m) != ri.n.f45822r && nVar != ri.n.f45823s && nVar != ri.n.f45821n) {
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
                ug.y0 y0Var = (ug.y0) this.f38260c;
                HashSet hashSet = y0Var.f47779e0;
                hashSet.remove(Long.valueOf(this.f38259b));
                y0Var.Y.b(true, hashSet, new ug.s0(y0Var, 5), null);
                y0Var.c0(true, false);
                return;
        }
    }
}
