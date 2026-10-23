package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.l91;
public final class o4 extends j2 {
    public final ViewGroup f34930b0;
    public final View[] f34931c0;
    public final Context f34932d0;

    public o4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.g6 g6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, g6Var);
        this.f34930b0 = viewGroup2;
        this.f34931c0 = viewArr;
        this.f34932d0 = context2;
    }

    @Override
    public final void E(float f7) {
        super.E(f7);
        if (this.f34930b0 instanceof l91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override
    public final boolean L() {
        return !(this.f34930b0 instanceof l91);
    }

    @Override
    public final int P() {
        return getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6);
    }

    @Override
    public final void show() {
        super.show();
        if (this.f34930b0 instanceof l91) {
            View[] viewArr = this.f34931c0;
            if (viewArr[0] == null) {
                ih.h hVar = new ih.h(this, this.f34932d0);
                viewArr[0] = hVar;
                this.containerView.addView(hVar, 0, w7.z5.e(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
