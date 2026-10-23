package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class kh0 implements Runnable {
    public final int f38615a;
    public final long f38616b;
    public final Object f38617c;

    public kh0(Object obj, long j10, int i10) {
        this.f38615a = i10;
        this.f38617c = obj;
        this.f38616b = j10;
    }

    @Override
    public final void run() {
        ri.m mVar;
        switch (this.f38615a) {
            case 0:
                qn qnVar = ((di) this.f38617c).e;
                qnVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f38616b;
                bundle.putLong("user_id", j10);
                if (j10 == qnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((org.telegram.ui.ActionBar.j3) this.f38617c).run(Long.valueOf(this.f38616b));
                return;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.f38617c;
                e0Var.getClass();
                e0Var.presentFragment(qn.W9(this.f38616b));
                return;
            case 3:
                ri.o oVar = (ri.o) ((cc.e) this.f38617c).f5093c;
                if (this.f38616b == oVar.f45848p && (mVar = oVar.f45846n) != ri.m.f45833r && mVar != ri.m.f45834s && mVar != ri.m.f45832n) {
                    SystemClock.elapsedRealtime();
                    oVar.f45855x = false;
                    oVar.r(ri.m.f45830c);
                    oVar.f45841i.removeCallbacks(oVar.E);
                    ri.b bVar = oVar.h;
                    bVar.b("recording started: retainedDurationMs=" + ri.o.q(oVar.f45849q));
                    return;
                }
                return;
            default:
                ug.y0 y0Var = (ug.y0) this.f38617c;
                HashSet hashSet = y0Var.f47790e0;
                hashSet.remove(Long.valueOf(this.f38616b));
                y0Var.Y.b(true, hashSet, new ug.s0(y0Var, 5), null);
                y0Var.c0(true, false);
                return;
        }
    }
}
