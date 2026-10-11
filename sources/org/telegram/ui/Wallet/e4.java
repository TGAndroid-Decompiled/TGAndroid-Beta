package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.q91;
public final class e4 extends k2 {
    public final ViewGroup f34840b0;
    public final View[] f34841c0;
    public final Context f34842d0;

    public e4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, d6Var);
        this.f34840b0 = viewGroup2;
        this.f34841c0 = viewArr;
        this.f34842d0 = context2;
    }

    @Override
    public final void G(float f7) {
        super.G(f7);
        if (this.f34840b0 instanceof q91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override
    public final boolean M() {
        return !(this.f34840b0 instanceof q91);
    }

    @Override
    public final int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6);
    }

    @Override
    public final void show() {
        super.show();
        if (this.f34840b0 instanceof q91) {
            View[] viewArr = this.f34841c0;
            if (viewArr[0] == null) {
                gi.a aVar = new gi.a(this, this.f34842d0);
                viewArr[0] = aVar;
                this.containerView.addView(aVar, 0, w7.x5.e(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
