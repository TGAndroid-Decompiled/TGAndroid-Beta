package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final w4 f20647a;
    public boolean f20648b;
    public boolean f20649c;
    public boolean d;
    public boolean f20650e = true;
    public boolean f20651f;
    public long f20652g;

    public g4(w4 w4Var) {
        this.f20647a = w4Var;
    }

    public final void a() {
        if (this.f20651f) {
            boolean z10 = this.f20648b;
            w4 w4Var = this.f20647a;
            if (!z10 && !this.f20649c && !this.d && this.f20650e) {
                View view = w4Var.f21675a;
                j4 j4Var = w4Var.f21684l;
                view.removeOnLayoutChangeListener(j4Var);
                w4Var.f21675a.addOnLayoutChangeListener(j4Var);
                w4Var.c();
                this.f20652g = System.currentTimeMillis();
                return;
            }
            u4 u4Var = w4Var.f21676b;
            if (!u4Var.f()) {
                return;
            }
            u4Var.G = true;
            u4Var.f21574x.start();
            u4Var.D.setEmpty();
        }
    }
}
