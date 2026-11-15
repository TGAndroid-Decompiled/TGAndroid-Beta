package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class e30 extends org.telegram.ui.ActionBar.g1 {
    public final c40 f46538o;

    public e30(c40 c40Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f46538o = c40Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        c40 c40Var = this.f46538o;
        if (c40Var.f45914e5 != this) {
            return;
        }
        c40Var.f45914e5 = null;
        AnimatorSet animatorSet = c40Var.f45910d5;
        if (animatorSet != null) {
            animatorSet.cancel();
            c40Var.f45910d5 = null;
        }
        c40Var.T1.X = true;
        c40Var.f45910d5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(c40Var.V4, org.telegram.ui.Components.k6.f36298b, 0));
        c40Var.f45910d5.playTogether(arrayList);
        c40Var.f45910d5.setDuration(220L);
        c40Var.f45910d5.addListener(new xx(this, 1));
        c40Var.f45910d5.start();
    }
}
