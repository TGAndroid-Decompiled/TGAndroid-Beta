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
    public final p f40876a;
    public final TransitionSet f40877b;
    public boolean f40878c;

    public q(Activity activity) {
        super(activity);
        this.f40878c = false;
        setWillNotDraw(false);
        p pVar = new p(activity);
        this.f40876a = pVar;
        addView(pVar, ja.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f40877b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) er.f34419f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f40878c) {
            return;
        }
        this.f40878c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f40877b);
        }
        p pVar = this.f40876a;
        pVar.f40855w = 255;
        pVar.f40852n = -1;
        pVar.f40854s = 0;
        pVar.f40853r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.i3(new hh0(29, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.f40876a;
    }
}
