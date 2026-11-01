package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b40 extends org.telegram.ui.ActionBar.k1 {
    public final a50 f35936o;

    public b40(a50 a50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35936o = a50Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        a50 a50Var = this.f35936o;
        if (a50Var.W4 != this) {
            return;
        }
        a50Var.W4 = null;
        AnimatorSet animatorSet = a50Var.V4;
        if (animatorSet != null) {
            animatorSet.cancel();
            a50Var.V4 = null;
        }
        a50Var.P1.X = true;
        a50Var.V4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(a50Var.N4, org.telegram.ui.Components.i6.f27007b, 0));
        a50Var.V4.playTogether(arrayList);
        a50Var.V4.setDuration(220L);
        a50Var.V4.addListener(new org.telegram.ui.Components.voip.i2(this, 11));
        a50Var.V4.start();
    }
}
