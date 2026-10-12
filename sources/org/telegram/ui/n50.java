package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class n50 extends org.telegram.ui.ActionBar.m1 {
    public final n60 f38428o;

    public n50(n60 n60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38428o = n60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        n60 n60Var = this.f38428o;
        if (n60Var.f38466f3 != this) {
            return;
        }
        n60Var.f38466f3 = null;
        AnimatorSet animatorSet = n60Var.f38461e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            n60Var.f38461e3 = null;
        }
        n60Var.Y.X = true;
        n60Var.f38461e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(n60Var.W2, org.telegram.ui.Components.v6.f29900b, 0));
        n60Var.f38461e3.playTogether(arrayList);
        n60Var.f38461e3.setDuration(220L);
        n60Var.f38461e3.addListener(new org.telegram.ui.Components.u61(this, 25));
        n60Var.f38461e3.start();
    }
}
