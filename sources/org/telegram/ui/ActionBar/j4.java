package org.telegram.ui.ActionBar;

import android.view.View;
public final class j4 {
    public final z4 f21497a;
    public boolean f21498b;
    public boolean f21499c;
    public boolean d;
    public boolean f21500e = true;
    public boolean f21501f;
    public long f21502g;

    public j4(z4 z4Var) {
        this.f21497a = z4Var;
    }

    public final void a() {
        if (this.f21501f) {
            boolean z4 = this.f21498b;
            z4 z4Var = this.f21497a;
            if (!z4 && !this.f21499c && !this.d && this.f21500e) {
                View view = z4Var.f22492a;
                m4 m4Var = z4Var.f22501l;
                view.removeOnLayoutChangeListener(m4Var);
                z4Var.f22492a.addOnLayoutChangeListener(m4Var);
                z4Var.c();
                this.f21502g = System.currentTimeMillis();
                return;
            }
            x4 x4Var = z4Var.f22493b;
            if (!x4Var.f()) {
                return;
            }
            x4Var.G = true;
            x4Var.f22445x.start();
            x4Var.D.setEmpty();
        }
    }
}
