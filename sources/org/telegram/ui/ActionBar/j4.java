package org.telegram.ui.ActionBar;

import android.view.View;
public final class j4 {
    public final a5 f20993a;
    public boolean f20994b;
    public boolean f20995c;
    public boolean d;
    public boolean e = true;
    public boolean f20996f;
    public long f20997g;

    public j4(a5 a5Var) {
        this.f20993a = a5Var;
    }

    public final void a() {
        if (this.f20996f) {
            boolean z10 = this.f20994b;
            a5 a5Var = this.f20993a;
            if (!z10 && !this.f20995c && !this.d && this.e) {
                View view = a5Var.f20692a;
                n4 n4Var = a5Var.f20700l;
                view.removeOnLayoutChangeListener(n4Var);
                a5Var.f20692a.addOnLayoutChangeListener(n4Var);
                a5Var.c();
                this.f20997g = System.currentTimeMillis();
                return;
            }
            y4 y4Var = a5Var.f20693b;
            if (!y4Var.f()) {
                return;
            }
            y4Var.G = true;
            y4Var.f22011x.start();
            y4Var.D.setEmpty();
        }
    }
}
