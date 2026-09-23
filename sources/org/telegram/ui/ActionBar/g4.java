package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final w4 f18675a;
    public boolean f18676b;
    public boolean f18677c;
    public boolean d;
    public boolean e = true;
    public boolean f18678f;
    public long f18679g;

    public g4(w4 w4Var) {
        this.f18675a = w4Var;
    }

    public final void a() {
        if (this.f18678f) {
            boolean z10 = this.f18676b;
            w4 w4Var = this.f18675a;
            if (!z10 && !this.f18677c && !this.d && this.e) {
                View view = w4Var.f19649a;
                j4 j4Var = w4Var.f19657l;
                view.removeOnLayoutChangeListener(j4Var);
                w4Var.f19649a.addOnLayoutChangeListener(j4Var);
                w4Var.c();
                this.f18679g = System.currentTimeMillis();
                return;
            }
            u4 u4Var = w4Var.f19650b;
            if (!u4Var.f()) {
                return;
            }
            u4Var.G = true;
            u4Var.f19550x.start();
            u4Var.D.setEmpty();
        }
    }
}
