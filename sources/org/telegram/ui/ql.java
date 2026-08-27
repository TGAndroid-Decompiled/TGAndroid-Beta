package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

public final class ql extends AnimatorListenerAdapter {

    public final boolean f41698a;

    public final boolean f41699b;

    public final org.telegram.ui.Components.n9 f41700c;
    public final qn d;

    public final org.telegram.ui.ActionBar.h5 f41701e;

    public final boolean f41702f;
    public final cg.q h;

    public final rn f41703n;

    public ql(rn rnVar, boolean z10, boolean z11, org.telegram.ui.Components.n9 n9Var, qn qnVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, cg.q qVar) {
        this.f41703n = rnVar;
        this.f41698a = z10;
        this.f41699b = z11;
        this.f41700c = n9Var;
        this.d = qnVar;
        this.f41701e = h5Var;
        this.f41702f = z12;
        this.h = qVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        rn rnVar = this.f41703n;
        rnVar.D2[1] = null;
        rnVar.f42266x2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.f41703n.D2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.n9 n9Var = this.f41700c;
            boolean z10 = this.f41699b;
            boolean z11 = this.f41698a;
            if (!z11 && !z10 && n9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.er.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<qn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f41701e, (Property<org.telegram.ui.ActionBar.h5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f41702f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<cg.q, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (n9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(n9Var, (Property<org.telegram.ui.Components.n9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new lh.h9(this, 28));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
