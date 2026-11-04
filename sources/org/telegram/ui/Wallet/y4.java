package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import b8.mf;
import org.telegram.ui.Components.n61;
public final class y4 extends y2 {
    public final ViewGroup U1;
    public final View[] V1;
    public final Context W1;

    public y4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, e6Var);
        this.U1 = viewGroup2;
        this.V1 = viewArr;
        this.W1 = context2;
    }

    @Override
    public final void T0(float f10) {
        super.T0(f10);
        if (this.U1 instanceof n61) {
            this.f28616s0.setBounds(0, (int) f10, this.f28586b.getWidth(), this.f28586b.getHeight());
        }
    }

    @Override
    public final boolean Z0() {
        return !(this.U1 instanceof n61);
    }

    @Override
    public final int d1() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.J0);
    }

    @Override
    public final void show() {
        super.show();
        if (this.U1 instanceof n61) {
            View[] viewArr = this.V1;
            if (viewArr[0] == null) {
                kh.h hVar = new kh.h(this, this.W1);
                viewArr[0] = hVar;
                this.f28586b.addView(hVar, 0, mf.e(-1, 50, 80));
            }
            this.f28586b.setBackground(null);
            this.f28586b.setPadding(0, 0, 0, 0);
            this.f36102l1.setPadding(0, 0, 0, 0);
        }
    }
}
