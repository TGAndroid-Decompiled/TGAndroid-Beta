package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i50 extends org.telegram.ui.ActionBar.n1 {
    public final i60 f34406o;

    public i50(i60 i60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34406o = i60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        i60 i60Var = this.f34406o;
        if (i60Var.f34434f3 != this) {
            return;
        }
        i60Var.f34434f3 = null;
        AnimatorSet animatorSet = i60Var.f34429e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            i60Var.f34429e3 = null;
        }
        i60Var.Y.X = true;
        i60Var.f34429e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(i60Var.W2, org.telegram.ui.Components.q6.f27260b, 0));
        i60Var.f34429e3.playTogether(arrayList);
        i60Var.f34429e3.setDuration(220L);
        i60Var.f34429e3.addListener(new org.telegram.ui.Components.v81(this, 21));
        i60Var.f34429e3.start();
    }
}
