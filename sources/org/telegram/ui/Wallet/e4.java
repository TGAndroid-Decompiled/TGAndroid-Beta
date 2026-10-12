package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.u91;
public final class e4 extends k2 {
    public final ViewGroup f34651b0;
    public final View[] f34652c0;
    public final Context f34653d0;

    public e4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, c6Var);
        this.f34651b0 = viewGroup2;
        this.f34652c0 = viewArr;
        this.f34653d0 = context2;
    }

    @Override
    public final void G(float f7) {
        super.G(f7);
        if (this.f34651b0 instanceof u91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override
    public final boolean M() {
        return !(this.f34651b0 instanceof u91);
    }

    @Override
    public final int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.h6.f20560d6);
    }

    @Override
    public final void show() {
        super.show();
        if (this.f34651b0 instanceof u91) {
            View[] viewArr = this.f34652c0;
            if (viewArr[0] == null) {
                gi.a aVar = new gi.a(this, this.f34653d0);
                viewArr[0] = aVar;
                this.containerView.addView(aVar, 0, w7.w5.e(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
