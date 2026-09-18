package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class am extends AnimatorListenerAdapter {
    public final boolean f31927a;
    public final boolean f31928b;
    public final org.telegram.ui.Components.u9 f31929c;
    public final ao d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final boolean f31930f;
    public final ai.p4 h;
    public final bo f31931n;

    public am(bo boVar, boolean z10, boolean z11, org.telegram.ui.Components.u9 u9Var, ao aoVar, org.telegram.ui.ActionBar.k5 k5Var, boolean z12, ai.p4 p4Var) {
        this.f31931n = boVar;
        this.f31927a = z10;
        this.f31928b = z11;
        this.f31929c = u9Var;
        this.d = aoVar;
        this.e = k5Var;
        this.f31930f = z12;
        this.h = p4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        bo boVar = this.f31931n;
        boVar.H2[1] = null;
        boVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f31931n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.u9 u9Var = this.f31929c;
            boolean z10 = this.f31928b;
            boolean z11 = this.f31927a;
            if (!z11 && !z10 && u9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.qr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f31930f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (u9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(u9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new t4(this, 20));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
