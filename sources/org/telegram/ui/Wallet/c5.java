package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.x71;
public final class c5 extends a3 {
    public final ViewGroup T1;
    public final View[] U1;
    public final Context V1;

    public c5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, p6Var);
        this.T1 = viewGroup2;
        this.U1 = viewArr;
        this.V1 = context2;
    }

    @Override
    public final void T0(float f7) {
        super.T0(f7);
        if (this.T1 instanceof x71) {
            this.f21613r0.setBounds(0, (int) f7, this.f21587b.getWidth(), this.f21587b.getHeight());
        }
    }

    @Override
    public final boolean Z0() {
        return !(this.T1 instanceof x71);
    }

    @Override
    public final int d1() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.I0);
    }

    @Override
    public final void show() {
        super.show();
        if (this.T1 instanceof x71) {
            View[] viewArr = this.U1;
            if (viewArr[0] == null) {
                b5 b5Var = new b5(this, this.V1);
                viewArr[0] = b5Var;
                this.f21587b.addView(b5Var, 0, w7.b6.e(-1, 50, 80));
            }
            this.f21587b.setBackground(null);
            this.f21587b.setPadding(0, 0, 0, 0);
            this.f26724k1.setPadding(0, 0, 0, 0);
        }
    }
}
