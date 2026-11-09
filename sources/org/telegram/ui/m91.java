package org.telegram.ui;

import android.view.View;
public final class m91 extends v4.k {
    public Runnable F;
    public int G;
    public final y91 H;

    public m91(y91 y91Var) {
        this.H = y91Var;
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
        l91 l91Var = new l91(this, 0);
        this.F = l91Var;
        org.telegram.messenger.g0.h3(l91Var);
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.F;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        l91 l91Var = new l91(this, 1);
        this.F = l91Var;
        org.telegram.messenger.g0.h3(l91Var);
    }

    @Override
    public final void z(v4.d1 d1Var) {
        y91 y91Var = this.H;
        View view = y91Var.f52021c1;
        if (view == d1Var.f57056a) {
            view.setTranslationX(0.0f);
            d91 d91Var = y91Var.O;
            if (d91Var != null) {
                d91Var.F.clear();
            }
            View view2 = y91Var.f52021c1;
            if (view2 instanceof v91) {
                v91 v91Var = (v91) view2;
                v91Var.setTopicIcon(v91Var.f50613c5);
            }
            y91Var.f52021c1 = null;
        }
    }
}
