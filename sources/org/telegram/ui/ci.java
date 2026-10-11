package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class ci extends AnimatorListenerAdapter {
    public final boolean f36747a;
    public final boolean f36748b;
    public final org.telegram.ui.Components.y9 f36749c;
    public final yn d;
    public final org.telegram.ui.ActionBar.h5 f36750e;
    public final boolean f36751f;
    public final ai.q4 h;
    public final zn f36752n;

    public ci(zn znVar, boolean z10, boolean z11, org.telegram.ui.Components.y9 y9Var, yn ynVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, ai.q4 q4Var) {
        this.f36752n = znVar;
        this.f36747a = z10;
        this.f36748b = z11;
        this.f36749c = y9Var;
        this.d = ynVar;
        this.f36750e = h5Var;
        this.f36751f = z12;
        this.h = q4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        zn znVar = this.f36752n;
        znVar.H2[1] = null;
        znVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f36752n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.y9 y9Var = this.f36749c;
            boolean z10 = this.f36748b;
            boolean z11 = this.f36747a;
            if (!z11 && !z10 && y9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.is.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f36750e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f36751f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (y9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(y9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new s4(this, 18));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
