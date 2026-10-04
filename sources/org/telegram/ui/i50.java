package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i50 extends org.telegram.ui.ActionBar.n1 {
    public final h60 f37282o;

    public i50(h60 h60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37282o = h60Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        h60 h60Var = this.f37282o;
        if (h60Var.f36899f3 != this) {
            return;
        }
        h60Var.f36899f3 = null;
        AnimatorSet animatorSet = h60Var.f36894e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            h60Var.f36894e3 = null;
        }
        h60Var.Y.X = true;
        h60Var.f36894e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(h60Var.W2, org.telegram.ui.Components.s6.f30631b, 0));
        h60Var.f36894e3.playTogether(arrayList);
        h60Var.f36894e3.setDuration(220L);
        h60Var.f36894e3.addListener(new org.telegram.ui.Components.a91(this, 22));
        h60Var.f36894e3.start();
    }
}
