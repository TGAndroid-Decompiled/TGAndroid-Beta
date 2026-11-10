package org.telegram.ui;

import android.view.View;
public final class n91 extends v4.k {
    public Runnable F;
    public int G;
    public final z91 H;

    public n91(z91 z91Var) {
        this.H = z91Var;
    }

    @Override
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().q(null, this.G, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.F = null;
            }
        }
    }

    @Override
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.F = null;
        }
        m91 m91Var = new m91(this, 0);
        this.F = m91Var;
        org.telegram.messenger.g0.h3(m91Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        m91 m91Var = new m91(this, 1);
        this.F = m91Var;
        org.telegram.messenger.g0.h3(m91Var);
    }

    @Override
    public final void z(v4.d1 d1Var) {
        z91 z91Var = this.H;
        View view = z91Var.f52351c1;
        if (view == d1Var.f57052a) {
            view.setTranslationX(0.0f);
            e91 e91Var = z91Var.O;
            if (e91Var != null) {
                e91Var.F.clear();
            }
            View view2 = z91Var.f52351c1;
            if (view2 instanceof w91) {
                w91 w91Var = (w91) view2;
                w91Var.setTopicIcon(w91Var.f50955c5);
            }
            z91Var.f52351c1 = null;
        }
    }
}
