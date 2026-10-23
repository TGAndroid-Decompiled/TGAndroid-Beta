package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class oh0 implements Runnable {
    public final int f40159a;
    public final long f40160b;
    public final Object f40161c;

    public oh0(Object obj, long j10, int i10) {
        this.f40159a = i10;
        this.f40161c = obj;
        this.f40160b = j10;
    }

    @Override
    public final void run() {
        ri.m mVar;
        switch (this.f40159a) {
            case 0:
                sn snVar = ((di) this.f40161c).f36637f;
                snVar.D7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f40160b;
                bundle.putLong("user_id", j10);
                if (j10 == snVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((org.telegram.ui.ActionBar.m3) this.f40161c).run(Long.valueOf(this.f40160b));
                return;
            case 2:
                org.telegram.ui.web.f0 f0Var = (org.telegram.ui.web.f0) this.f40161c;
                f0Var.getClass();
                f0Var.presentFragment(sn.W9(this.f40160b));
                return;
            case 3:
                ri.o oVar = (ri.o) ((cc.e) this.f40161c).f5098c;
                if (this.f40160b == oVar.f46269p && (mVar = oVar.f46267n) != ri.m.f46254r && mVar != ri.m.f46255s && mVar != ri.m.f46253n) {
                    SystemClock.elapsedRealtime();
                    oVar.f46276x = false;
                    oVar.r(ri.m.f46251c);
                    oVar.f46262i.removeCallbacks(oVar.E);
                    ri.b bVar = oVar.h;
                    bVar.b("recording started: retainedDurationMs=" + ri.o.q(oVar.f46270q));
                    return;
                }
                return;
            default:
                ug.x0 x0Var = (ug.x0) this.f40161c;
                HashSet hashSet = x0Var.f48223e0;
                hashSet.remove(Long.valueOf(this.f40160b));
                x0Var.Y.b(true, hashSet, new ug.r0(x0Var, 5), null);
                x0Var.b0(true, false);
                return;
        }
    }
}
