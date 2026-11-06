package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.xq;
public final class q extends FrameLayout {
    public final p f39440a;
    public final TransitionSet f39441b;
    public boolean f39442c;

    public q(Activity activity) {
        super(activity);
        this.f39442c = false;
        setWillNotDraw(false);
        p pVar = new p(activity);
        this.f39440a = pVar;
        addView(pVar, ha.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f39441b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) xq.f40345f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z9) {
        if (this.f39442c) {
            return;
        }
        this.f39442c = true;
        if (z9) {
            TransitionManager.beginDelayedTransition(this, this.f39441b);
        }
        p pVar = this.f39440a;
        pVar.f39419w = 255;
        pVar.f39416n = -1;
        pVar.f39418s = 0;
        pVar.f39417r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.i3(new l51(4, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.f39440a;
    }
}
