package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final w4 f20643a;
    public boolean f20644b;
    public boolean f20645c;
    public boolean d;
    public boolean f20646e = true;
    public boolean f20647f;
    public long f20648g;

    public g4(w4 w4Var) {
        this.f20643a = w4Var;
    }

    public final void a() {
        if (this.f20647f) {
            boolean z10 = this.f20644b;
            w4 w4Var = this.f20643a;
            if (!z10 && !this.f20645c && !this.d && this.f20646e) {
                View view = w4Var.f21671a;
                j4 j4Var = w4Var.f21680l;
                view.removeOnLayoutChangeListener(j4Var);
                w4Var.f21671a.addOnLayoutChangeListener(j4Var);
                w4Var.c();
                this.f20648g = System.currentTimeMillis();
                return;
            }
            u4 u4Var = w4Var.f21672b;
            if (!u4Var.f()) {
                return;
            }
            u4Var.G = true;
            u4Var.f21570x.start();
            u4Var.D.setEmpty();
        }
    }
}
