package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.nr;
public final class q extends FrameLayout {
    public final p f41228a;
    public final TransitionSet f41229b;
    public boolean f41230c;

    public q(Activity activity) {
        super(activity);
        this.f41230c = false;
        setWillNotDraw(false);
        p pVar = new p(activity);
        this.f41228a = pVar;
        addView(pVar, na.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f41229b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) nr.f37917f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f41230c) {
            return;
        }
        this.f41230c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f41229b);
        }
        p pVar = this.f41228a;
        pVar.f41220w = 255;
        pVar.f41217n = -1;
        pVar.f41219s = 0;
        pVar.f41218r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.h3(new jn0(24, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.f41228a;
    }
}
