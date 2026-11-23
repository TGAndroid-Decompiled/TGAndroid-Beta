package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.k71;
public final class q5 extends f3 {
    public final ViewGroup X1;
    public final View[] Y1;
    public final Context Z1;

    public q5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, i6Var);
        this.X1 = viewGroup2;
        this.Y1 = viewArr;
        this.Z1 = context2;
    }

    @Override
    public final void U0(float f10) {
        super.U0(f10);
        if (this.X1 instanceof k71) {
            this.f30259s0.setBounds(0, (int) f10, this.f30226b.getWidth(), this.f30226b.getHeight());
        }
    }

    @Override
    public final boolean a1() {
        return !(this.X1 instanceof k71);
    }

    @Override
    public final int e1() {
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.J0);
    }

    @Override
    public final void show() {
        super.show();
        if (this.X1 instanceof k71) {
            View[] viewArr = this.Y1;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.Z1);
                viewArr[0] = hVar;
                this.f30226b.addView(hVar, 0, c8.na.e(-1, 50, 80));
            }
            this.f30226b.setBackground(null);
            this.f30226b.setPadding(0, 0, 0, 0);
            this.f39246o1.setPadding(0, 0, 0, 0);
        }
    }
}
