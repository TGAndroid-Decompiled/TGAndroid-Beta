package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class ei extends AnimatorListenerAdapter {
    public final boolean f37059a;
    public final boolean f37060b;
    public final org.telegram.ui.Components.g9 f37061c;
    public final tn d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final boolean f37062f;
    public final jn h;
    public final un f37063n;

    public ei(un unVar, boolean z10, boolean z11, org.telegram.ui.Components.g9 g9Var, tn tnVar, org.telegram.ui.ActionBar.u5 u5Var, boolean z12, jn jnVar) {
        this.f37063n = unVar;
        this.f37059a = z10;
        this.f37060b = z11;
        this.f37061c = g9Var;
        this.d = tnVar;
        this.e = u5Var;
        this.f37062f = z12;
        this.h = jnVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        un unVar = this.f37063n;
        unVar.V2[1] = null;
        unVar.P2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f37063n.V2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.g9 g9Var = this.f37061c;
            boolean z10 = this.f37060b;
            boolean z11 = this.f37059a;
            if (!z11 && !z10 && g9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.gr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f37062f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (g9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(g9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new s9(this, 15));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
