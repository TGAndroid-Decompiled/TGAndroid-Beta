package org.telegram.ui.ActionBar;

import android.view.View;
public final class i4 {
    public final y4 f19773a;
    public boolean f19774b;
    public boolean f19775c;
    public boolean d;
    public boolean e = true;
    public boolean f19776f;
    public long f19777g;

    public i4(y4 y4Var) {
        this.f19773a = y4Var;
    }

    public final void a() {
        if (this.f19776f) {
            boolean z4 = this.f19774b;
            y4 y4Var = this.f19773a;
            if (!z4 && !this.f19775c && !this.d && this.e) {
                View view = y4Var.f20732a;
                l4 l4Var = y4Var.f20740l;
                view.removeOnLayoutChangeListener(l4Var);
                y4Var.f20732a.addOnLayoutChangeListener(l4Var);
                y4Var.c();
                this.f19777g = System.currentTimeMillis();
                return;
            }
            w4 w4Var = y4Var.f20733b;
            if (!w4Var.f()) {
                return;
            }
            w4Var.G = true;
            w4Var.f20690x.start();
            w4Var.D.setEmpty();
        }
    }
}
