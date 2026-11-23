package org.telegram.ui;

import android.view.View;
public final class k91 extends v4.l {
    public Runnable F;
    public int G;
    public final w91 H;

    public k91(w91 w91Var) {
        this.H = w91Var;
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
        org.telegram.messenger.g0.g3(j91Var);
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
        org.telegram.messenger.g0.g3(j91Var);
    }

    @Override
    public final void z(v4.f1 f1Var) {
        w91 w91Var = this.H;
        View view = w91Var.f53226d1;
        if (view == f1Var.f59245a) {
            view.setTranslationX(0.0f);
            b91 b91Var = w91Var.P;
            if (b91Var != null) {
                b91Var.G.clear();
            }
            View view2 = w91Var.f53226d1;
            if (view2 instanceof t91) {
                t91 t91Var = (t91) view2;
                t91Var.setTopicIcon(t91Var.f52319d5);
            }
            w91Var.f53226d1 = null;
        }
    }
}
