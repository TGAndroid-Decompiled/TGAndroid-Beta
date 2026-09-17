package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class k50 extends org.telegram.ui.ActionBar.o1 {
    public final k60 f34993o;

    public k50(k60 k60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34993o = k60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        k60 k60Var = this.f34993o;
        if (k60Var.f35036f3 != this) {
            return;
        }
        k60Var.f35036f3 = null;
        AnimatorSet animatorSet = k60Var.f35031e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            k60Var.f35031e3 = null;
        }
        k60Var.Y.X = true;
        k60Var.f35031e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(k60Var.W2, org.telegram.ui.Components.q6.f27222b, 0));
        k60Var.f35031e3.playTogether(arrayList);
        k60Var.f35031e3.setDuration(220L);
        k60Var.f35031e3.addListener(new org.telegram.ui.Components.w81(this, 21));
        k60Var.f35031e3.start();
    }
}
