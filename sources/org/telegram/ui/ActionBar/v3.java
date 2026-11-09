package org.telegram.ui.ActionBar;

import android.view.View;
public final class v3 {
    public final k4 f28664a;
    public boolean f28665b;
    public boolean f28666c;
    public boolean d;
    public boolean f28667e = true;
    public boolean f28668f;
    public long f28669g;

    public v3(k4 k4Var) {
        this.f28664a = k4Var;
    }

    public final void a() {
        if (this.f28668f) {
            boolean z9 = this.f28665b;
            k4 k4Var = this.f28664a;
            if (!z9 && !this.f28666c && !this.d && this.f28667e) {
                View view = k4Var.f27723a;
                y3 y3Var = k4Var.f27732l;
                view.removeOnLayoutChangeListener(y3Var);
                k4Var.f27723a.addOnLayoutChangeListener(y3Var);
                k4Var.c();
                this.f28669g = System.currentTimeMillis();
                return;
            }
            i4 i4Var = k4Var.f27724b;
            if (!i4Var.f()) {
                return;
            }
            i4Var.G = true;
            i4Var.f27562x.start();
            i4Var.D.setEmpty();
        }
    }
}
