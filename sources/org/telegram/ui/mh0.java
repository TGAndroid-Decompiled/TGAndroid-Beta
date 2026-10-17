package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class mh0 implements Runnable {
    public final int f39191a;
    public final long f39192b;
    public final Object f39193c;

    public mh0(Object obj, long j10, int i10) {
        this.f39191a = i10;
        this.f39193c = obj;
        this.f39192b = j10;
    }

    @Override
    public final void run() {
        ri.n nVar;
        switch (this.f39191a) {
            case 0:
                sn snVar = ((fi) this.f39193c).e;
                snVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f39192b;
                bundle.putLong("user_id", j10);
                if (j10 == snVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((org.telegram.ui.ActionBar.j3) this.f39193c).run(Long.valueOf(this.f39192b));
                return;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.f39193c;
                e0Var.getClass();
                e0Var.presentFragment(sn.W9(this.f39192b));
                return;
            case 3:
                ri.p pVar = (ri.p) ((cc.e) this.f39193c).f5095c;
                if (this.f39192b == pVar.f45864o && (nVar = pVar.f45862m) != ri.n.f45850r && nVar != ri.n.f45851s && nVar != ri.n.f45849n) {
                    SystemClock.elapsedRealtime();
                    pVar.f45871w = false;
                    pVar.r(ri.n.f45847c);
                    pVar.h.removeCallbacks(pVar.D);
                    ri.b bVar = pVar.f45857g;
                    bVar.b("recording started: retainedDurationMs=" + ri.p.q(pVar.f45865p));
                    return;
                }
                return;
            default:
                ug.x0 x0Var = (ug.x0) this.f39193c;
                HashSet hashSet = x0Var.f47798e0;
                hashSet.remove(Long.valueOf(this.f39192b));
                x0Var.Y.b(true, hashSet, new ug.r0(x0Var, 5), null);
                x0Var.c0(true, false);
                return;
        }
    }
}
