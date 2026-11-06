package org.telegram.ui.ActionBar;

import android.view.View;
public final class v3 {
    public final k4 f28655a;
    public boolean f28656b;
    public boolean f28657c;
    public boolean d;
    public boolean f28658e = true;
    public boolean f28659f;
    public long f28660g;

    public v3(k4 k4Var) {
        this.f28655a = k4Var;
    }

    public final void a() {
        if (this.f28659f) {
            boolean z9 = this.f28656b;
            k4 k4Var = this.f28655a;
            if (!z9 && !this.f28657c && !this.d && this.f28658e) {
                View view = k4Var.f27735a;
                y3 y3Var = k4Var.f27744l;
                view.removeOnLayoutChangeListener(y3Var);
                k4Var.f27735a.addOnLayoutChangeListener(y3Var);
                k4Var.c();
                this.f28660g = System.currentTimeMillis();
                return;
            }
            i4 i4Var = k4Var.f27736b;
            if (!i4Var.f()) {
                return;
            }
            i4Var.G = true;
            i4Var.f27583x.start();
            i4Var.D.setEmpty();
        }
    }
}
