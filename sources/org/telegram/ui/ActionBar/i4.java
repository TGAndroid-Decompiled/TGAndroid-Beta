package org.telegram.ui.ActionBar;

import android.view.View;
public final class i4 {
    public final y4 f19798a;
    public boolean f19799b;
    public boolean f19800c;
    public boolean d;
    public boolean e = true;
    public boolean f19801f;
    public long f19802g;

    public i4(y4 y4Var) {
        this.f19798a = y4Var;
    }

    public final void a() {
        if (this.f19801f) {
            boolean z4 = this.f19799b;
            y4 y4Var = this.f19798a;
            if (!z4 && !this.f19800c && !this.d && this.e) {
                View view = y4Var.f20757a;
                l4 l4Var = y4Var.f20765l;
                view.removeOnLayoutChangeListener(l4Var);
                y4Var.f20757a.addOnLayoutChangeListener(l4Var);
                y4Var.c();
                this.f19802g = System.currentTimeMillis();
                return;
            }
            w4 w4Var = y4Var.f20758b;
            if (!w4Var.f()) {
                return;
            }
            w4Var.G = true;
            w4Var.f20715x.start();
            w4Var.D.setEmpty();
        }
    }
}
