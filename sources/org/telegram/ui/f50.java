package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f50 extends org.telegram.ui.ActionBar.p1 {
    public final e60 f33951o;

    public f50(e60 e60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33951o = e60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        e60 e60Var = this.f33951o;
        if (e60Var.c3 != this) {
            return;
        }
        e60Var.c3 = null;
        AnimatorSet animatorSet = e60Var.f33624b3;
        if (animatorSet != null) {
            animatorSet.cancel();
            e60Var.f33624b3 = null;
        }
        e60Var.V.X = true;
        e60Var.f33624b3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(e60Var.T2, org.telegram.ui.Components.n6.f27196b, 0));
        e60Var.f33624b3.playTogether(arrayList);
        e60Var.f33624b3.setDuration(220L);
        e60Var.f33624b3.addListener(new org.telegram.ui.Components.f91(this, 20));
        e60Var.f33624b3.start();
    }
}
