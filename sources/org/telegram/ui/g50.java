package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g50 extends org.telegram.ui.ActionBar.o1 {
    public final g60 f33718o;

    public g50(g60 g60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33718o = g60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        g60 g60Var = this.f33718o;
        if (g60Var.f33750f3 != this) {
            return;
        }
        g60Var.f33750f3 = null;
        AnimatorSet animatorSet = g60Var.f33745e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            g60Var.f33745e3 = null;
        }
        g60Var.Y.X = true;
        g60Var.f33745e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(g60Var.W2, org.telegram.ui.Components.s6.f28173b, 0));
        g60Var.f33745e3.playTogether(arrayList);
        g60Var.f33745e3.setDuration(220L);
        g60Var.f33745e3.addListener(new org.telegram.ui.Components.s81(this, 22));
        g60Var.f33745e3.start();
    }
}
