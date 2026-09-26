package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class d50 extends org.telegram.ui.ActionBar.m1 {
    public final d60 f32927o;

    public d50(d60 d60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f32927o = d60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        d60 d60Var = this.f32927o;
        if (d60Var.f32959f3 != this) {
            return;
        }
        d60Var.f32959f3 = null;
        AnimatorSet animatorSet = d60Var.f32954e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            d60Var.f32954e3 = null;
        }
        d60Var.Y.X = true;
        d60Var.f32954e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(d60Var.W2, org.telegram.ui.Components.s6.f28161b, 0));
        d60Var.f32954e3.playTogether(arrayList);
        d60Var.f32954e3.setDuration(220L);
        d60Var.f32954e3.addListener(new org.telegram.ui.Components.q81(this, 22));
        d60Var.f32954e3.start();
    }
}
