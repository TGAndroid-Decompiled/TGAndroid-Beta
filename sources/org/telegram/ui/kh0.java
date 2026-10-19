package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class kh0 implements Runnable {
    public final int f38604a;
    public final long f38605b;
    public final Object f38606c;

    public kh0(Object obj, long j10, int i10) {
        this.f38604a = i10;
        this.f38606c = obj;
        this.f38605b = j10;
    }

    @Override
    public final void run() {
        ri.n nVar;
        switch (this.f38604a) {
            case 0:
                qn qnVar = ((di) this.f38606c).e;
                qnVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f38605b;
                bundle.putLong("user_id", j10);
                if (j10 == qnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((org.telegram.ui.ActionBar.j3) this.f38606c).run(Long.valueOf(this.f38605b));
                return;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.f38606c;
                e0Var.getClass();
                e0Var.presentFragment(qn.W9(this.f38605b));
                return;
            case 3:
                ri.p pVar = (ri.p) ((cc.e) this.f38606c).f5093c;
                if (this.f38605b == pVar.f45838o && (nVar = pVar.f45836m) != ri.n.f45824r && nVar != ri.n.f45825s && nVar != ri.n.f45823n) {
                    SystemClock.elapsedRealtime();
                    pVar.f45845w = false;
                    pVar.r(ri.n.f45821c);
                    pVar.h.removeCallbacks(pVar.D);
                    ri.b bVar = pVar.f45831g;
                    bVar.b("recording started: retainedDurationMs=" + ri.p.q(pVar.f45839p));
                    return;
                }
                return;
            default:
                ug.y0 y0Var = (ug.y0) this.f38606c;
                HashSet hashSet = y0Var.f47781e0;
                hashSet.remove(Long.valueOf(this.f38605b));
                y0Var.Y.b(true, hashSet, new ug.s0(y0Var, 5), null);
                y0Var.c0(true, false);
                return;
        }
    }
}
