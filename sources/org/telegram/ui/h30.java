package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class h30 extends org.telegram.ui.ActionBar.g1 {
    public final f40 f46217o;

    public h30(f40 f40Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f46217o = f40Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        f40 f40Var = this.f46217o;
        if (f40Var.Z4 != this) {
            return;
        }
        f40Var.Z4 = null;
        AnimatorSet animatorSet = f40Var.Y4;
        if (animatorSet != null) {
            animatorSet.cancel();
            f40Var.Y4 = null;
        }
        f40Var.S1.X = true;
        f40Var.Y4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(f40Var.Q4, org.telegram.ui.Components.l6.f35549b, 0));
        f40Var.Y4.playTogether(arrayList);
        f40Var.Y4.setDuration(220L);
        f40Var.Y4.addListener(new g30(this, 0));
        f40Var.Y4.start();
    }
}
