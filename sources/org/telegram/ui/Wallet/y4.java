package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.w61;
public final class y4 extends y2 {
    public final ViewGroup T1;
    public final View[] U1;
    public final Context V1;

    public y4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.g6 g6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, g6Var);
        this.T1 = viewGroup2;
        this.U1 = viewArr;
        this.V1 = context2;
    }

    @Override
    public final void T0(float f10) {
        super.T0(f10);
        if (this.T1 instanceof w61) {
            this.f28651r0.setBounds(0, (int) f10, this.f28624b.getWidth(), this.f28624b.getHeight());
        }
    }

    @Override
    public final boolean Z0() {
        return !(this.T1 instanceof w61);
    }

    @Override
    public final int d1() {
        return org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.I0);
    }

    @Override
    public final void show() {
        super.show();
        if (this.T1 instanceof w61) {
            View[] viewArr = this.U1;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.V1);
                viewArr[0] = hVar;
                this.f28624b.addView(hVar, 0, c8.ha.e(-1, 50, 80));
            }
            this.f28624b.setBackground(null);
            this.f28624b.setPadding(0, 0, 0, 0);
            this.f36303k1.setPadding(0, 0, 0, 0);
        }
    }
}
