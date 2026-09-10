package org.telegram.ui.ActionBar;

import android.view.View;
public final class j4 {
    public final z4 f17858a;
    public boolean f17859b;
    public boolean f17860c;
    public boolean d;
    public boolean e = true;
    public boolean f17861f;
    public long f17862g;

    public j4(z4 z4Var) {
        this.f17858a = z4Var;
    }

    public final void a() {
        if (this.f17861f) {
            boolean z10 = this.f17859b;
            z4 z4Var = this.f17858a;
            if (!z10 && !this.f17860c && !this.d && this.e) {
                View view = z4Var.f18824a;
                m4 m4Var = z4Var.f18832l;
                view.removeOnLayoutChangeListener(m4Var);
                z4Var.f18824a.addOnLayoutChangeListener(m4Var);
                z4Var.c();
                this.f17862g = System.currentTimeMillis();
                return;
            }
            x4 x4Var = z4Var.f18825b;
            if (!x4Var.f()) {
                return;
            }
            x4Var.G = true;
            x4Var.f18751x.start();
            x4Var.D.setEmpty();
        }
    }
}
