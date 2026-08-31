package org.telegram.ui.ActionBar;

import android.view.View;
public final class j4 {
    public final z4 f21495a;
    public boolean f21496b;
    public boolean f21497c;
    public boolean d;
    public boolean f21498e = true;
    public boolean f21499f;
    public long f21500g;

    public j4(z4 z4Var) {
        this.f21495a = z4Var;
    }

    public final void a() {
        if (this.f21499f) {
            boolean z4 = this.f21496b;
            z4 z4Var = this.f21495a;
            if (!z4 && !this.f21497c && !this.d && this.f21498e) {
                View view = z4Var.f22490a;
                m4 m4Var = z4Var.f22499l;
                view.removeOnLayoutChangeListener(m4Var);
                z4Var.f22490a.addOnLayoutChangeListener(m4Var);
                z4Var.c();
                this.f21500g = System.currentTimeMillis();
                return;
            }
            x4 x4Var = z4Var.f22491b;
            if (!x4Var.f()) {
                return;
            }
            x4Var.G = true;
            x4Var.f22443x.start();
            x4Var.D.setEmpty();
        }
    }
}
