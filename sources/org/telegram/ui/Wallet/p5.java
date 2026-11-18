package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.g71;
public final class p5 extends e3 {
    public final ViewGroup X1;
    public final View[] Y1;
    public final Context Z1;

    public p5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, i6Var);
        this.X1 = viewGroup2;
        this.Y1 = viewArr;
        this.Z1 = context2;
    }

    @Override
    public final void U0(float f10) {
        super.U0(f10);
        if (this.X1 instanceof g71) {
            this.f30223s0.setBounds(0, (int) f10, this.f30190b.getWidth(), this.f30190b.getHeight());
        }
    }

    @Override
    public final boolean a1() {
        return !(this.X1 instanceof g71);
    }

    @Override
    public final int e1() {
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, this.J0);
    }

    @Override
    public final void show() {
        super.show();
        if (this.X1 instanceof g71) {
            View[] viewArr = this.Y1;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.Z1);
                viewArr[0] = hVar;
                this.f30190b.addView(hVar, 0, c8.ma.e(-1, 50, 80));
            }
            this.f30190b.setBackground(null);
            this.f30190b.setPadding(0, 0, 0, 0);
            this.f39534o1.setPadding(0, 0, 0, 0);
        }
    }
}
