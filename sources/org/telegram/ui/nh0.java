package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class nh0 implements Runnable {
    public final int f39822a;
    public final long f39823b;
    public final Object f39824c;

    public nh0(Object obj, long j10, int i10) {
        this.f39822a = i10;
        this.f39824c = obj;
        this.f39823b = j10;
    }

    @Override
    public final void run() {
        ri.m mVar;
        switch (this.f39822a) {
            case 0:
                sn snVar = ((di) this.f39824c).f36632f;
                snVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f39823b;
                bundle.putLong("user_id", j10);
                if (j10 == snVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((org.telegram.ui.ActionBar.m3) this.f39824c).run(Long.valueOf(this.f39823b));
                return;
            case 2:
                org.telegram.ui.web.f0 f0Var = (org.telegram.ui.web.f0) this.f39824c;
                f0Var.getClass();
                f0Var.presentFragment(sn.W9(this.f39823b));
                return;
            case 3:
                ri.o oVar = (ri.o) ((cc.e) this.f39824c).f5098c;
                if (this.f39823b == oVar.f46268p && (mVar = oVar.f46266n) != ri.m.f46253r && mVar != ri.m.f46254s && mVar != ri.m.f46252n) {
                    SystemClock.elapsedRealtime();
                    oVar.f46275x = false;
                    oVar.r(ri.m.f46250c);
                    oVar.f46261i.removeCallbacks(oVar.E);
                    ri.b bVar = oVar.h;
                    bVar.b("recording started: retainedDurationMs=" + ri.o.q(oVar.f46269q));
                    return;
                }
                return;
            default:
                ug.x0 x0Var = (ug.x0) this.f39824c;
                HashSet hashSet = x0Var.f48222e0;
                hashSet.remove(Long.valueOf(this.f39823b));
                x0Var.Y.b(true, hashSet, new ug.r0(x0Var, 5), null);
                x0Var.b0(true, false);
                return;
        }
    }
}
