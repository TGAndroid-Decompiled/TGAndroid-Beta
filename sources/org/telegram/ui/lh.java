package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class lh extends AnimatorListenerAdapter {
    public final boolean f47617a;
    public final boolean f47618b;
    public final org.telegram.ui.Components.l9 f47619c;
    public final bn d;
    public final org.telegram.ui.ActionBar.l5 f47620e;
    public final boolean f47621f;
    public final rm h;
    public final cn f47622n;

    public lh(cn cnVar, boolean z9, boolean z10, org.telegram.ui.Components.l9 l9Var, bn bnVar, org.telegram.ui.ActionBar.l5 l5Var, boolean z11, rm rmVar) {
        this.f47622n = cnVar;
        this.f47617a = z9;
        this.f47618b = z10;
        this.f47619c = l9Var;
        this.d = bnVar;
        this.f47620e = l5Var;
        this.f47621f = z11;
        this.h = rmVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        cn cnVar = this.f47622n;
        cnVar.V2[1] = null;
        cnVar.P2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f47622n.V2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.l9 l9Var = this.f47619c;
            boolean z9 = this.f47618b;
            boolean z10 = this.f47617a;
            if (!z10 && !z9 && l9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.xq.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z9) {
                arrayList.add(ObjectAnimator.ofFloat(this.f47620e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f47621f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (l9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(l9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new va(this, 4));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}
