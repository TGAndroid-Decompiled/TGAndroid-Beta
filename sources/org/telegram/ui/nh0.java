package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashSet;
public final class nh0 implements Runnable {
    public final int f41808a;
    public final long f41809b;
    public final Object f41810c;

    public nh0(Object obj, long j10, int i10) {
        this.f41808a = i10;
        this.f41810c = obj;
        this.f41809b = j10;
    }

    @Override
    public final void run() {
        ui.m mVar;
        switch (this.f41808a) {
            case 0:
                wn wnVar = ((hi) this.f41810c).f39899f;
                wnVar.J7(true);
                Bundle bundle = new Bundle();
                long j10 = this.f41809b;
                bundle.putLong("user_id", j10);
                if (j10 == wnVar.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                ((li.s2) this.f41810c).run(Long.valueOf(this.f41809b));
                return;
            case 2:
                org.telegram.ui.web.e0 e0Var = (org.telegram.ui.web.e0) this.f41810c;
                e0Var.getClass();
                e0Var.presentFragment(wn.ea(this.f41809b));
                return;
            case 3:
                ui.o oVar = (ui.o) ((dc.e) this.f41810c).f8321c;
                if (this.f41809b == oVar.f49996p && (mVar = oVar.f49994n) != ui.m.f49981r && mVar != ui.m.f49982s && mVar != ui.m.f49980n) {
                    SystemClock.elapsedRealtime();
                    oVar.f50003x = false;
                    oVar.r(ui.m.f49978c);
                    oVar.f49989i.removeCallbacks(oVar.E);
                    ui.b bVar = oVar.h;
                    bVar.b("recording started: retainedDurationMs=" + ui.o.q(oVar.f49997q));
                    return;
                }
                return;
            default:
                vg.z0 z0Var = (vg.z0) this.f41810c;
                HashSet hashSet = z0Var.f50320e0;
                hashSet.remove(Long.valueOf(this.f41809b));
                z0Var.Y.b(true, hashSet, new vg.t0(z0Var, 5), null);
                z0Var.b0(true, false);
                return;
        }
    }
}
