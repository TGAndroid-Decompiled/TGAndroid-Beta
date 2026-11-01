package org.telegram.ui;

import android.view.View;
public final class cb1 extends s4.j {
    public Runnable F;
    public int G;
    public final nb1 H;

    public cb1(nb1 nb1Var) {
        this.H = nb1Var;
    }

    @Override
    public final void F() {
        if (this.G == -1) {
            this.G = this.H.getNotificationCenter().q(null, this.G, false);
            Runnable runnable = this.F;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
                this.F = null;
            }
        }
    }

    @Override
    public final void N() {
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.F = null;
        }
        bb1 bb1Var = new bb1(this, 0);
        this.F = bb1Var;
        org.telegram.messenger.i0.g3(bb1Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        bb1 bb1Var = new bb1(this, 1);
        this.F = bb1Var;
        org.telegram.messenger.i0.g3(bb1Var);
    }

    @Override
    public final void z(s4.c1 c1Var) {
        nb1 nb1Var = this.H;
        View view = nb1Var.f39805c1;
        if (view == c1Var.f47909a) {
            view.setTranslationX(0.0f);
            sa1 sa1Var = nb1Var.O;
            if (sa1Var != null) {
                sa1Var.F.clear();
            }
            View view2 = nb1Var.f39805c1;
            if (view2 instanceof kb1) {
                kb1 kb1Var = (kb1) view2;
                kb1Var.setTopicIcon(kb1Var.f38790c5);
            }
            nb1Var.f39805c1 = null;
        }
    }
}
