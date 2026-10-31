package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c40 extends org.telegram.ui.ActionBar.k1 {
    public final b50 f36383o;

    public c40(b50 b50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36383o = b50Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        b50 b50Var = this.f36383o;
        if (b50Var.W4 != this) {
            return;
        }
        b50Var.W4 = null;
        AnimatorSet animatorSet = b50Var.V4;
        if (animatorSet != null) {
            animatorSet.cancel();
            b50Var.V4 = null;
        }
        b50Var.P1.X = true;
        b50Var.V4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(b50Var.N4, org.telegram.ui.Components.i6.f26888b, 0));
        b50Var.V4.playTogether(arrayList);
        b50Var.V4.setDuration(220L);
        b50Var.V4.addListener(new org.telegram.ui.Components.voip.h2(this, 11));
        b50Var.V4.start();
    }
}
