package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class e50 extends org.telegram.ui.ActionBar.p1 {
    public final d60 f36371o;

    public e50(d60 d60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36371o = d60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        d60 d60Var = this.f36371o;
        if (d60Var.c3 != this) {
            return;
        }
        d60Var.c3 = null;
        AnimatorSet animatorSet = d60Var.f35997b3;
        if (animatorSet != null) {
            animatorSet.cancel();
            d60Var.f35997b3 = null;
        }
        d60Var.V.X = true;
        d60Var.f35997b3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(d60Var.T2, org.telegram.ui.Components.n6.f29395b, 0));
        d60Var.f35997b3.playTogether(arrayList);
        d60Var.f35997b3.setDuration(220L);
        d60Var.f35997b3.addListener(new org.telegram.ui.Components.f91(this, 20));
        d60Var.f35997b3.start();
    }
}
