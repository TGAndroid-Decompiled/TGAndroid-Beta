package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i50 extends org.telegram.ui.ActionBar.m1 {
    public final i60 f38671o;

    public i50(i60 i60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38671o = i60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        i60 i60Var = this.f38671o;
        if (i60Var.f38703f3 != this) {
            return;
        }
        i60Var.f38703f3 = null;
        AnimatorSet animatorSet = i60Var.f38698e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            i60Var.f38698e3 = null;
        }
        i60Var.Y.X = true;
        i60Var.f38698e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(i60Var.W2, org.telegram.ui.Components.u6.f31060b, 0));
        i60Var.f38698e3.playTogether(arrayList);
        i60Var.f38698e3.setDuration(220L);
        i60Var.f38698e3.addListener(new org.telegram.ui.Components.o91(this, 22));
        i60Var.f38698e3.start();
    }
}
