package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.wq;
public final class q extends FrameLayout {
    public final p f39484a;
    public final TransitionSet f39485b;
    public boolean f39486c;

    public q(Activity activity) {
        super(activity);
        this.f39486c = false;
        setWillNotDraw(false);
        p pVar = new p(activity);
        this.f39484a = pVar;
        addView(pVar, ha.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f39485b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.j(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) wq.f40046f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z9) {
        if (this.f39486c) {
            return;
        }
        this.f39486c = true;
        if (z9) {
            TransitionManager.beginDelayedTransition(this, this.f39485b);
        }
        p pVar = this.f39484a;
        pVar.f39463w = 255;
        pVar.f39460n = -1;
        pVar.f39462s = 0;
        pVar.f39461r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.i3(new h41(5, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.f39484a;
    }
}
