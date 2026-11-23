package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.nr;
public final class q extends FrameLayout {
    public final p f41267a;
    public final TransitionSet f41268b;
    public boolean f41269c;

    public q(Activity activity) {
        super(activity);
        this.f41269c = false;
        setWillNotDraw(false);
        p pVar = new p(activity);
        this.f41267a = pVar;
        addView(pVar, ma.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f41268b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) nr.f37961f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f41269c) {
            return;
        }
        this.f41269c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f41268b);
        }
        p pVar = this.f41267a;
        pVar.f41259w = 255;
        pVar.f41256n = -1;
        pVar.f41258s = 0;
        pVar.f41257r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.h3(new fm0(26, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.f41267a;
    }
}
