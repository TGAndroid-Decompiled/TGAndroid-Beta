package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final w4 f20661a;
    public boolean f20662b;
    public boolean f20663c;
    public boolean d;
    public boolean f20664e = true;
    public boolean f20665f;
    public long f20666g;

    public g4(w4 w4Var) {
        this.f20661a = w4Var;
    }

    public final void a() {
        if (this.f20665f) {
            boolean z10 = this.f20662b;
            w4 w4Var = this.f20661a;
            if (!z10 && !this.f20663c && !this.d && this.f20664e) {
                View view = w4Var.f21672a;
                j4 j4Var = w4Var.f21681l;
                view.removeOnLayoutChangeListener(j4Var);
                w4Var.f21672a.addOnLayoutChangeListener(j4Var);
                w4Var.c();
                this.f20666g = System.currentTimeMillis();
                return;
            }
            u4 u4Var = w4Var.f21673b;
            if (!u4Var.f()) {
                return;
            }
            u4Var.G = true;
            u4Var.f21566x.start();
            u4Var.D.setEmpty();
        }
    }
}
