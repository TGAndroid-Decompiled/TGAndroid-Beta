package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class aq0 implements org.telegram.ui.Components.y4, org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.c2 {
    public final int f32625a;
    public final mq0 f32626b;

    public aq0(mq0 mq0Var, int i10) {
        this.f32625a = i10;
        this.f32626b = mq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f32625a) {
            case 0:
                this.f32626b.e0(i10, z4);
                return;
            default:
                this.f32626b.e0(i10, z4);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        mq0 mq0Var = this.f32626b;
        if (mq0Var.V) {
            mq0Var.a0(view, mq0Var.G.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.s5) {
            org.telegram.ui.Components.ul0 ul0Var = mq0Var.S;
            boolean z4 = !((org.telegram.ui.Cells.s5) view).a();
            mq0Var.U = z4;
            ul0Var.d(view, i10, z4);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        mq0 mq0Var = this.f32626b;
        qq0 qq0Var = mq0Var.f36181q0;
        if (qq0Var != null) {
            switch (qq0Var.f37455a) {
                case 0:
                    rq0 rq0Var = qq0Var.f37456b;
                    rq0Var.f37946a.Z();
                    rq0Var.f37947b.Z();
                    return;
                default:
                    rq0 rq0Var2 = qq0Var.f37456b;
                    rq0Var2.f37946a.Z();
                    rq0Var2.f37947b.Z();
                    return;
            }
        }
        mq0Var.Z();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        mq0 mq0Var = this.f32626b;
        mq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = mq0Var.f36174j0) != null && p1Var.isShowing()) {
            mq0Var.f36174j0.d(true);
        }
    }
}
