package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class d50 extends org.telegram.ui.ActionBar.p1 {
    public final c60 f33517o;

    public d50(c60 c60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33517o = c60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        c60 c60Var = this.f33517o;
        if (c60Var.c3 != this) {
            return;
        }
        c60Var.c3 = null;
        AnimatorSet animatorSet = c60Var.f33105b3;
        if (animatorSet != null) {
            animatorSet.cancel();
            c60Var.f33105b3 = null;
        }
        c60Var.V.X = true;
        c60Var.f33105b3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(c60Var.T2, org.telegram.ui.Components.n6.f27200b, 0));
        c60Var.f33105b3.playTogether(arrayList);
        c60Var.f33105b3.setDuration(220L);
        c60Var.f33105b3.addListener(new org.telegram.ui.Components.f91(this, 20));
        c60Var.f33105b3.start();
    }
}
