package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.lr;
public final class q extends FrameLayout {
    public final p f41130a;
    public final TransitionSet f41131b;
    public boolean f41132c;

    public q(Activity activity) {
        super(activity);
        this.f41132c = false;
        setWillNotDraw(false);
        p pVar = new p(activity);
        this.f41130a = pVar;
        addView(pVar, ma.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f41131b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) lr.f37208f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f41132c) {
            return;
        }
        this.f41132c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f41131b);
        }
        p pVar = this.f41130a;
        pVar.f41122w = 255;
        pVar.f41119n = -1;
        pVar.f41121s = 0;
        pVar.f41120r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.h3(new hn0(24, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.f41130a;
    }
}
