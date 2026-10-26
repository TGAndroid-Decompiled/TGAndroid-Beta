package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class lh0 implements Runnable {
    public final int f41285a;
    public final long f41286b;
    public final Object f41287c;

    public lh0(Object obj, long j10, int i10) {
        this.f41285a = i10;
        this.f41287c = obj;
        this.f41286b = j10;
    }

    @Override
    public final void run() {
        ui.m mVar;
        switch (this.f41285a) {
            case 0:
                un unVar = ((ei) this.f41287c).f39113f;
                unVar.H7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f41286b;
                bundle.putLong("user_id", j10);
                if (j10 == unVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((li.s2) this.f41287c).run(Long.valueOf(this.f41286b));
                return;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.f41287c;
                e0Var.getClass();
                e0Var.presentFragment(un.ba(this.f41286b));
                return;
            case 3:
                ui.o oVar = (ui.o) ((dc.e) this.f41287c).f8321c;
                if (this.f41286b == oVar.f49961p && (mVar = oVar.f49959n) != ui.m.f49946r && mVar != ui.m.f49947s && mVar != ui.m.f49945n) {
                    SystemClock.elapsedRealtime();
                    oVar.f49968x = false;
                    oVar.r(ui.m.f49943c);
                    oVar.f49954i.removeCallbacks(oVar.E);
                    ui.b bVar = oVar.h;
                    bVar.b("recording started: retainedDurationMs=" + ui.o.q(oVar.f49962q));
                    return;
                }
                return;
            default:
                vg.z0 z0Var = (vg.z0) this.f41287c;
                HashSet hashSet = z0Var.f50285e0;
                hashSet.remove(Long.valueOf(this.f41286b));
                z0Var.Y.b(true, hashSet, new vg.t0(z0Var, 5), null);
                z0Var.b0(true, false);
                return;
        }
    }
}
