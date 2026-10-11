package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g50 extends org.telegram.ui.ActionBar.m1 {
    public final g60 f37899o;

    public g50(g60 g60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37899o = g60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        g60 g60Var = this.f37899o;
        if (g60Var.f37928f3 != this) {
            return;
        }
        g60Var.f37928f3 = null;
        AnimatorSet animatorSet = g60Var.f37923e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            g60Var.f37923e3 = null;
        }
        g60Var.Y.X = true;
        g60Var.f37923e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(g60Var.W2, org.telegram.ui.Components.u6.f31449b, 0));
        g60Var.f37923e3.playTogether(arrayList);
        g60Var.f37923e3.setDuration(220L);
        g60Var.f37923e3.addListener(new org.telegram.ui.Components.j91(this, 22));
        g60Var.f37923e3.start();
    }
}
