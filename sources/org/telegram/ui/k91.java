package org.telegram.ui;

import android.view.View;
public final class k91 extends v4.k {
    public Runnable F;
    public int G;
    public final v91 H;

    public k91(v91 v91Var) {
        this.H = v91Var;
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
        j91 j91Var = new j91(this, 0);
        this.F = j91Var;
        org.telegram.messenger.g0.h3(j91Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        j91 j91Var = new j91(this, 1);
        this.F = j91Var;
        org.telegram.messenger.g0.h3(j91Var);
    }

    @Override
    public final void z(v4.d1 d1Var) {
        v91 v91Var = this.H;
        View view = v91Var.f50627c1;
        if (view == d1Var.f56927a) {
            view.setTranslationX(0.0f);
            b91 b91Var = v91Var.O;
            if (b91Var != null) {
                b91Var.F.clear();
            }
            View view2 = v91Var.f50627c1;
            if (view2 instanceof s91) {
                s91 s91Var = (s91) view2;
                s91Var.setTopicIcon(s91Var.f49686c5);
            }
            v91Var.f50627c1 = null;
        }
    }
}
