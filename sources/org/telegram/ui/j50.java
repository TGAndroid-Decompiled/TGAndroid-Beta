package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class j50 extends org.telegram.ui.ActionBar.n1 {
    public final j60 f37508o;

    public j50(j60 j60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37508o = j60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        j60 j60Var = this.f37508o;
        if (j60Var.f37538f3 != this) {
            return;
        }
        j60Var.f37538f3 = null;
        AnimatorSet animatorSet = j60Var.f37533e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            j60Var.f37533e3 = null;
        }
        j60Var.Y.X = true;
        j60Var.f37533e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(j60Var.W2, org.telegram.ui.Components.t6.f30536b, 0));
        j60Var.f37533e3.playTogether(arrayList);
        j60Var.f37533e3.setDuration(220L);
        j60Var.f37533e3.addListener(new org.telegram.ui.Components.k61(this, 24));
        j60Var.f37533e3.start();
    }
}
