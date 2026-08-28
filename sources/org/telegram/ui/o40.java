package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class o40 extends org.telegram.ui.ActionBar.o1 {
    public final o50 f40878o;

    public o40(o50 o50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f40878o = o50Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        o50 o50Var = this.f40878o;
        if (o50Var.f40887b3 != this) {
            return;
        }
        o50Var.f40887b3 = null;
        AnimatorSet animatorSet = o50Var.a3;
        if (animatorSet != null) {
            animatorSet.cancel();
            o50Var.a3 = null;
        }
        o50Var.U.X = true;
        o50Var.a3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(o50Var.S2, org.telegram.ui.Components.m6.f30701b, 0));
        o50Var.a3.playTogether(arrayList);
        o50Var.a3.setDuration(220L);
        o50Var.a3.addListener(new org.telegram.ui.Components.y11(this, 27));
        o50Var.a3.start();
    }
}
