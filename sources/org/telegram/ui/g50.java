package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g50 extends org.telegram.ui.ActionBar.n1 {
    public final g60 f37785o;

    public g50(g60 g60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37785o = g60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        g60 g60Var = this.f37785o;
        if (g60Var.f37814f3 != this) {
            return;
        }
        g60Var.f37814f3 = null;
        AnimatorSet animatorSet = g60Var.f37809e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            g60Var.f37809e3 = null;
        }
        g60Var.Y.X = true;
        g60Var.f37809e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(g60Var.W2, org.telegram.ui.Components.u6.f31379b, 0));
        g60Var.f37809e3.playTogether(arrayList);
        g60Var.f37809e3.setDuration(220L);
        g60Var.f37809e3.addListener(new org.telegram.ui.Components.i91(this, 22));
        g60Var.f37809e3.start();
    }
}
