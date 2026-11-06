package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.xq;
public final class q extends FrameLayout {
    public final p f39419a;
    public final TransitionSet f39420b;
    public boolean f39421c;

    public q(Activity activity) {
        super(activity);
        this.f39421c = false;
        setWillNotDraw(false);
        p pVar = new p(activity);
        this.f39419a = pVar;
        addView(pVar, ha.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f39420b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) xq.f40329f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z9) {
        if (this.f39421c) {
            return;
        }
        this.f39421c = true;
        if (z9) {
            TransitionManager.beginDelayedTransition(this, this.f39420b);
        }
        p pVar = this.f39419a;
        pVar.f39398w = 255;
        pVar.f39395n = -1;
        pVar.f39397s = 0;
        pVar.f39396r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.i3(new k51(4, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.f39419a;
    }
}
