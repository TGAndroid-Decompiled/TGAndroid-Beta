package org.telegram.ui.ActionBar;

import android.view.View;
public final class l4 {
    public final c5 f22825a;
    public boolean f22826b;
    public boolean f22827c;
    public boolean d;
    public boolean e = true;
    public boolean f22828f;
    public long f22829g;

    public l4(c5 c5Var) {
        this.f22825a = c5Var;
    }

    public final void a() {
        if (this.f22828f) {
            boolean z10 = this.f22826b;
            c5 c5Var = this.f22825a;
            if (!z10 && !this.f22827c && !this.d && this.e) {
                View view = c5Var.f22503a;
                p4 p4Var = c5Var.f22511l;
                view.removeOnLayoutChangeListener(p4Var);
                c5Var.f22503a.addOnLayoutChangeListener(p4Var);
                c5Var.c();
                this.f22829g = System.currentTimeMillis();
                return;
            }
            a5 a5Var = c5Var.f22504b;
            if (!a5Var.f()) {
                return;
            }
            a5Var.G = true;
            a5Var.f22414x.start();
            a5Var.D.setEmpty();
        }
    }
}
