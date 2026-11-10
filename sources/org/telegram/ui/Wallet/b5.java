package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.v61;
public final class b5 extends y2 {
    public final ViewGroup W1;
    public final View[] X1;
    public final Context Y1;

    public b5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, h6Var);
        this.W1 = viewGroup2;
        this.X1 = viewArr;
        this.Y1 = context2;
    }

    @Override
    public final void T0(float f10) {
        super.T0(f10);
        if (this.W1 instanceof v61) {
            this.f28702r0.setBounds(0, (int) f10, this.f28672b.getWidth(), this.f28672b.getHeight());
        }
    }

    @Override
    public final boolean Z0() {
        return !(this.W1 instanceof v61);
    }

    @Override
    public final int d1() {
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, this.I0);
    }

    @Override
    public final void show() {
        super.show();
        if (this.W1 instanceof v61) {
            View[] viewArr = this.X1;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.Y1);
                viewArr[0] = hVar;
                this.f28672b.addView(hVar, 0, c8.ha.e(-1, 50, 80));
            }
            this.f28672b.setBackground(null);
            this.f28672b.setPadding(0, 0, 0, 0);
            this.n1.setPadding(0, 0, 0, 0);
        }
    }
}
