package org.telegram.ui.ActionBar;

import android.view.View;
public final class v3 {
    public final k4 f28656a;
    public boolean f28657b;
    public boolean f28658c;
    public boolean d;
    public boolean f28659e = true;
    public boolean f28660f;
    public long f28661g;

    public v3(k4 k4Var) {
        this.f28656a = k4Var;
    }

    public final void a() {
        if (this.f28660f) {
            boolean z9 = this.f28657b;
            k4 k4Var = this.f28656a;
            if (!z9 && !this.f28658c && !this.d && this.f28659e) {
                View view = k4Var.f27736a;
                y3 y3Var = k4Var.f27745l;
                view.removeOnLayoutChangeListener(y3Var);
                k4Var.f27736a.addOnLayoutChangeListener(y3Var);
                k4Var.c();
                this.f28661g = System.currentTimeMillis();
                return;
            }
            i4 i4Var = k4Var.f27737b;
            if (!i4Var.f()) {
                return;
            }
            i4Var.G = true;
            i4Var.f27584x.start();
            i4Var.D.setEmpty();
        }
    }
}
