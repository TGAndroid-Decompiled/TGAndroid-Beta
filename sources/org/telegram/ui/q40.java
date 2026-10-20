package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class q40 extends org.telegram.ui.ActionBar.m1 {
    public final q50 f40369o;

    public q40(q50 q50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f40369o = q50Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        q50 q50Var = this.f40369o;
        if (q50Var.f40400f3 != this) {
            return;
        }
        q50Var.f40400f3 = null;
        AnimatorSet animatorSet = q50Var.f40395e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            q50Var.f40395e3 = null;
        }
        q50Var.Y.X = true;
        q50Var.f40395e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(q50Var.W2, org.telegram.ui.Components.t6.f30444b, 0));
        q50Var.f40395e3.playTogether(arrayList);
        q50Var.f40395e3.setDuration(220L);
        q50Var.f40395e3.addListener(new org.telegram.ui.Components.p31(this, 27));
        q50Var.f40395e3.start();
    }
}
