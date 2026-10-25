package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.u91;
public final class m4 extends j2 {
    public final ViewGroup f36930b0;
    public final View[] f36931c0;
    public final Context f36932d0;

    public m4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.u6 u6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, u6Var);
        this.f36930b0 = viewGroup2;
        this.f36931c0 = viewArr;
        this.f36932d0 = context2;
    }

    @Override
    public final void F(float f7) {
        super.F(f7);
        if (this.f36930b0 instanceof u91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override
    public final boolean L() {
        return !(this.f36930b0 instanceof u91);
    }

    @Override
    public final int P() {
        return getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6);
    }

    @Override
    public final void show() {
        super.show();
        if (this.f36930b0 instanceof u91) {
            View[] viewArr = this.f36931c0;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.f36932d0);
                viewArr[0] = hVar;
                this.containerView.addView(hVar, 0, gb1.i(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
