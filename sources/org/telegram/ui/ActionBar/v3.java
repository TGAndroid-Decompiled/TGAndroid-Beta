package org.telegram.ui.ActionBar;

import android.view.View;
public final class v3 {
    public final k4 f28659a;
    public boolean f28660b;
    public boolean f28661c;
    public boolean d;
    public boolean f28662e = true;
    public boolean f28663f;
    public long f28664g;

    public v3(k4 k4Var) {
        this.f28659a = k4Var;
    }

    public final void a() {
        if (this.f28663f) {
            boolean z9 = this.f28660b;
            k4 k4Var = this.f28659a;
            if (!z9 && !this.f28661c && !this.d && this.f28662e) {
                View view = k4Var.f27739a;
                y3 y3Var = k4Var.f27748l;
                view.removeOnLayoutChangeListener(y3Var);
                k4Var.f27739a.addOnLayoutChangeListener(y3Var);
                k4Var.c();
                this.f28664g = System.currentTimeMillis();
                return;
            }
            i4 i4Var = k4Var.f27740b;
            if (!i4Var.f()) {
                return;
            }
            i4Var.G = true;
            i4Var.f27587x.start();
            i4Var.D.setEmpty();
        }
    }
}
