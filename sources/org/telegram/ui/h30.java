package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class h30 extends org.telegram.ui.ActionBar.g1 {
    public final f40 f48212o;

    public h30(f40 f40Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f48212o = f40Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        f40 f40Var = this.f48212o;
        if (f40Var.f47485e5 != this) {
            return;
        }
        f40Var.f47485e5 = null;
        AnimatorSet animatorSet = f40Var.f47481d5;
        if (animatorSet != null) {
            animatorSet.cancel();
            f40Var.f47481d5 = null;
        }
        f40Var.T1.X = true;
        f40Var.f47481d5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(f40Var.V4, org.telegram.ui.Components.r6.f39085b, 0));
        f40Var.f47481d5.playTogether(arrayList);
        f40Var.f47481d5.setDuration(220L);
        f40Var.f47481d5.addListener(new ay(this, 1));
        f40Var.f47481d5.start();
    }
}
