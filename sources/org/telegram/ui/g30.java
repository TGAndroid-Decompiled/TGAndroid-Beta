package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g30 extends org.telegram.ui.ActionBar.g1 {
    public final e40 f48039o;

    public g30(e40 e40Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f48039o = e40Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        e40 e40Var = this.f48039o;
        if (e40Var.f47339e5 != this) {
            return;
        }
        e40Var.f47339e5 = null;
        AnimatorSet animatorSet = e40Var.f47335d5;
        if (animatorSet != null) {
            animatorSet.cancel();
            e40Var.f47335d5 = null;
        }
        e40Var.T1.X = true;
        e40Var.f47335d5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(e40Var.V4, org.telegram.ui.Components.q6.f38711b, 0));
        e40Var.f47335d5.playTogether(arrayList);
        e40Var.f47335d5.setDuration(220L);
        e40Var.f47335d5.addListener(new zx(this, 1));
        e40Var.f47335d5.start();
    }
}
