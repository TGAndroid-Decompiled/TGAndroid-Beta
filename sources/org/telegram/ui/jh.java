package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class jh extends AnimatorListenerAdapter {
    public final boolean f46976a;
    public final boolean f46977b;
    public final org.telegram.ui.Components.l9 f46978c;
    public final zm d;
    public final org.telegram.ui.ActionBar.k5 f46979e;
    public final boolean f46980f;
    public final pm h;
    public final an f46981n;

    public jh(an anVar, boolean z9, boolean z10, org.telegram.ui.Components.l9 l9Var, zm zmVar, org.telegram.ui.ActionBar.k5 k5Var, boolean z11, pm pmVar) {
        this.f46981n = anVar;
        this.f46976a = z9;
        this.f46977b = z10;
        this.f46978c = l9Var;
        this.d = zmVar;
        this.f46979e = k5Var;
        this.f46980f = z11;
        this.h = pmVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        an anVar = this.f46981n;
        anVar.V2[1] = null;
        anVar.P2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f46981n.V2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.l9 l9Var = this.f46978c;
            boolean z9 = this.f46977b;
            boolean z10 = this.f46976a;
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
                arrayList.add(ObjectAnimator.ofFloat(this.f46979e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f46980f) {
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
