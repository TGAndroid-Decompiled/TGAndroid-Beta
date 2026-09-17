package org.telegram.ui.ActionBar;

import android.view.View;
public final class i4 {
    public final y4 f18749a;
    public boolean f18750b;
    public boolean f18751c;
    public boolean d;
    public boolean e = true;
    public boolean f18752f;
    public long f18753g;

    public i4(y4 y4Var) {
        this.f18749a = y4Var;
    }

    public final void a() {
        if (this.f18752f) {
            boolean z10 = this.f18750b;
            y4 y4Var = this.f18749a;
            if (!z10 && !this.f18751c && !this.d && this.e) {
                View view = y4Var.f19727a;
                l4 l4Var = y4Var.f19735l;
                view.removeOnLayoutChangeListener(l4Var);
                y4Var.f19727a.addOnLayoutChangeListener(l4Var);
                y4Var.c();
                this.f18753g = System.currentTimeMillis();
                return;
            }
            w4 w4Var = y4Var.f19728b;
            if (!w4Var.f()) {
                return;
            }
            w4Var.G = true;
            w4Var.f19656x.start();
            w4Var.D.setEmpty();
        }
    }
}
