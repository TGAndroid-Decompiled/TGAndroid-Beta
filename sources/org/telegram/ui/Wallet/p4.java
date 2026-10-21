package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.e91;
public final class p4 extends k2 {
    public final ViewGroup f34696b0;
    public final View[] f34697c0;
    public final Context f34698d0;

    public p4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, d6Var);
        this.f34696b0 = viewGroup2;
        this.f34697c0 = viewArr;
        this.f34698d0 = context2;
    }

    @Override
    public final void F(float f7) {
        super.F(f7);
        if (this.f34696b0 instanceof e91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override
    public final boolean M() {
        return !(this.f34696b0 instanceof e91);
    }

    @Override
    public final int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6);
    }

    @Override
    public final void show() {
        super.show();
        if (this.f34696b0 instanceof e91) {
            View[] viewArr = this.f34697c0;
            if (viewArr[0] == null) {
                ai.i7 i7Var = new ai.i7(this, this.f34698d0);
                viewArr[0] = i7Var;
                this.containerView.addView(i7Var, 0, w7.z5.e(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
