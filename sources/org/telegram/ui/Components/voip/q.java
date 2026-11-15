package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hh0;
public final class q extends FrameLayout {
    public final p f40873a;
    public final TransitionSet f40874b;
    public boolean f40875c;

    public q(Activity activity) {
        super(activity);
        this.f40875c = false;
        setWillNotDraw(false);
        p pVar = new p(activity);
        this.f40873a = pVar;
        addView(pVar, ja.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f40874b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) er.f34420f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f40875c) {
            return;
        }
        this.f40875c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f40874b);
        }
        p pVar = this.f40873a;
        pVar.f40852w = 255;
        pVar.f40849n = -1;
        pVar.f40851s = 0;
        pVar.f40850r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.i3(new hh0(29, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.f40873a;
    }
}
