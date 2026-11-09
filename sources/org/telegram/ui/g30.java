package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g30 extends org.telegram.ui.ActionBar.g1 {
    public final e40 f45858o;

    public g30(e40 e40Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f45858o = e40Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        e40 e40Var = this.f45858o;
        if (e40Var.W4 != this) {
            return;
        }
        e40Var.W4 = null;
        AnimatorSet animatorSet = e40Var.V4;
        if (animatorSet != null) {
            animatorSet.cancel();
            e40Var.V4 = null;
        }
        e40Var.P1.X = true;
        e40Var.V4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(e40Var.N4, org.telegram.ui.Components.m6.f35965b, 0));
        e40Var.V4.playTogether(arrayList);
        e40Var.V4.setDuration(220L);
        e40Var.V4.addListener(new f30(this, 0));
        e40Var.V4.start();
    }
}
