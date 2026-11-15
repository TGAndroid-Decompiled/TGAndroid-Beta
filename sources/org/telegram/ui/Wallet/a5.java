package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.w61;
public final class a5 extends x2 {
    public final ViewGroup X1;
    public final View[] Y1;
    public final Context Z1;

    public a5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, e6Var);
        this.X1 = viewGroup2;
        this.Y1 = viewArr;
        this.Z1 = context2;
    }

    @Override
    public final void T0(float f10) {
        super.T0(f10);
        if (this.X1 instanceof w61) {
            this.f29715s0.setBounds(0, (int) f10, this.f29682b.getWidth(), this.f29682b.getHeight());
        }
    }

    @Override
    public final boolean Z0() {
        return !(this.X1 instanceof w61);
    }

    @Override
    public final int d1() {
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.J0);
    }

    @Override
    public final void show() {
        super.show();
        if (this.X1 instanceof w61) {
            View[] viewArr = this.Y1;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.Z1);
                viewArr[0] = hVar;
                this.f29682b.addView(hVar, 0, c8.ja.e(-1, 50, 80));
            }
            this.f29682b.setBackground(null);
            this.f29682b.setPadding(0, 0, 0, 0);
            this.f35931o1.setPadding(0, 0, 0, 0);
        }
    }
}
