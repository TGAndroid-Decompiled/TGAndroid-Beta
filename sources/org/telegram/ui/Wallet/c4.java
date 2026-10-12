package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.k91;
public final class c4 extends i2 {
    public final ViewGroup f33007b0;
    public final View[] f33008c0;
    public final Context f33009d0;

    public c4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, c6Var);
        this.f33007b0 = viewGroup2;
        this.f33008c0 = viewArr;
        this.f33009d0 = context2;
    }

    @Override
    public final void G(float f7) {
        super.G(f7);
        if (this.f33007b0 instanceof k91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override
    public final boolean M() {
        return !(this.f33007b0 instanceof k91);
    }

    @Override
    public final int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6);
    }

    @Override
    public final void show() {
        super.show();
        if (this.f33007b0 instanceof k91) {
            View[] viewArr = this.f33008c0;
            if (viewArr[0] == null) {
                hi.a aVar = new hi.a(this, this.f33009d0);
                viewArr[0] = aVar;
                this.containerView.addView(aVar, 0, w7.a6.e(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
