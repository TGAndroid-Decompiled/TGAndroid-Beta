package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class lh0 implements Runnable {
    public final int f41282a;
    public final long f41283b;
    public final Object f41284c;

    public lh0(Object obj, long j10, int i10) {
        this.f41282a = i10;
        this.f41284c = obj;
        this.f41283b = j10;
    }

    @Override
    public final void run() {
        ui.m mVar;
        switch (this.f41282a) {
            case 0:
                un unVar = ((ei) this.f41284c).f39110f;
                unVar.H7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f41283b;
                bundle.putLong("user_id", j10);
                if (j10 == unVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((li.s2) this.f41284c).run(Long.valueOf(this.f41283b));
                return;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.f41284c;
                e0Var.getClass();
                e0Var.presentFragment(un.ba(this.f41283b));
                return;
            case 3:
                ui.o oVar = (ui.o) ((dc.e) this.f41284c).f8321c;
                if (this.f41283b == oVar.f49958p && (mVar = oVar.f49956n) != ui.m.f49943r && mVar != ui.m.f49944s && mVar != ui.m.f49942n) {
                    SystemClock.elapsedRealtime();
                    oVar.f49965x = false;
                    oVar.r(ui.m.f49940c);
                    oVar.f49951i.removeCallbacks(oVar.E);
                    ui.b bVar = oVar.h;
                    bVar.b("recording started: retainedDurationMs=" + ui.o.q(oVar.f49959q));
                    return;
                }
                return;
            default:
                vg.z0 z0Var = (vg.z0) this.f41284c;
                HashSet hashSet = z0Var.f50282e0;
                hashSet.remove(Long.valueOf(this.f41283b));
                z0Var.Y.b(true, hashSet, new vg.t0(z0Var, 5), null);
                z0Var.b0(true, false);
                return;
        }
    }
}
