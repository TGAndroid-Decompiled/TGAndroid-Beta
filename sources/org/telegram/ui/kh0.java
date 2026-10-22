package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class kh0 implements Runnable {
    public final int f38614a;
    public final long f38615b;
    public final Object f38616c;

    public kh0(Object obj, long j10, int i10) {
        this.f38614a = i10;
        this.f38616c = obj;
        this.f38615b = j10;
    }

    @Override
    public final void run() {
        ri.m mVar;
        switch (this.f38614a) {
            case 0:
                qn qnVar = ((di) this.f38616c).e;
                qnVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f38615b;
                bundle.putLong("user_id", j10);
                if (j10 == qnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((org.telegram.ui.ActionBar.j3) this.f38616c).run(Long.valueOf(this.f38615b));
                return;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.f38616c;
                e0Var.getClass();
                e0Var.presentFragment(qn.W9(this.f38615b));
                return;
            case 3:
                ri.o oVar = (ri.o) ((cc.e) this.f38616c).f5093c;
                if (this.f38615b == oVar.f45847p && (mVar = oVar.f45845n) != ri.m.f45832r && mVar != ri.m.f45833s && mVar != ri.m.f45831n) {
                    SystemClock.elapsedRealtime();
                    oVar.f45854x = false;
                    oVar.r(ri.m.f45829c);
                    oVar.f45840i.removeCallbacks(oVar.E);
                    ri.b bVar = oVar.h;
                    bVar.b("recording started: retainedDurationMs=" + ri.o.q(oVar.f45848q));
                    return;
                }
                return;
            default:
                ug.y0 y0Var = (ug.y0) this.f38616c;
                HashSet hashSet = y0Var.f47789e0;
                hashSet.remove(Long.valueOf(this.f38615b));
                y0Var.Y.b(true, hashSet, new ug.s0(y0Var, 5), null);
                y0Var.c0(true, false);
                return;
        }
    }
}
