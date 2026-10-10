package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.p91;
public final class d4 extends j2 {
    public final ViewGroup f34810b0;
    public final View[] f34811c0;
    public final Context f34812d0;

    public d4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, e6Var);
        this.f34810b0 = viewGroup2;
        this.f34811c0 = viewArr;
        this.f34812d0 = context2;
    }

    @Override
    public final void G(float f7) {
        super.G(f7);
        if (this.f34810b0 instanceof p91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override
    public final boolean M() {
        return !(this.f34810b0 instanceof p91);
    }

    @Override
    public final int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6);
    }

    @Override
    public final void show() {
        super.show();
        if (this.f34810b0 instanceof p91) {
            View[] viewArr = this.f34811c0;
            if (viewArr[0] == null) {
                gi.a aVar = new gi.a(this, this.f34812d0);
                viewArr[0] = aVar;
                this.containerView.addView(aVar, 0, w7.x5.e(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
