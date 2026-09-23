package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f50 extends org.telegram.ui.ActionBar.n1 {
    public final f60 f33091o;

    public f50(f60 f60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33091o = f60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        f60 f60Var = this.f33091o;
        if (f60Var.f33123f3 != this) {
            return;
        }
        f60Var.f33123f3 = null;
        AnimatorSet animatorSet = f60Var.f33118e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            f60Var.f33118e3 = null;
        }
        f60Var.Y.X = true;
        f60Var.f33118e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(f60Var.W2, org.telegram.ui.Components.s6.f27835b, 0));
        f60Var.f33118e3.playTogether(arrayList);
        f60Var.f33118e3.setDuration(220L);
        f60Var.f33118e3.addListener(new org.telegram.ui.Components.u81(this, 21));
        f60Var.f33118e3.start();
    }
}
