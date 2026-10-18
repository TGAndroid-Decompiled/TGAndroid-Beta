package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.c91;
public final class o4 extends k2 {
    public final ViewGroup f34644b0;
    public final View[] f34645c0;
    public final Context f34646d0;

    public o4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, d6Var);
        this.f34644b0 = viewGroup2;
        this.f34645c0 = viewArr;
        this.f34646d0 = context2;
    }

    @Override
    public final void G(float f7) {
        super.G(f7);
        if (this.f34644b0 instanceof c91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override
    public final boolean M() {
        return !(this.f34644b0 instanceof c91);
    }

    @Override
    public final int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6);
    }

    @Override
    public final void show() {
        super.show();
        if (this.f34644b0 instanceof c91) {
            View[] viewArr = this.f34645c0;
            if (viewArr[0] == null) {
                ai.h7 h7Var = new ai.h7(this, this.f34646d0);
                viewArr[0] = h7Var;
                this.containerView.addView(h7Var, 0, w7.z5.e(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
