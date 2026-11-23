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
    public final p f41266a;
    public final TransitionSet f41267b;
    public boolean f41268c;

    public q(Activity activity) {
        super(activity);
        this.f41268c = false;
        setWillNotDraw(false);
        p pVar = new p(activity);
        this.f41266a = pVar;
        addView(pVar, ma.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f41267b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) nr.f37960f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f41268c) {
            return;
        }
        this.f41268c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f41267b);
        }
        p pVar = this.f41266a;
        pVar.f41258w = 255;
        pVar.f41255n = -1;
        pVar.f41257s = 0;
        pVar.f41256r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.h3(new fm0(26, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.f41266a;
    }
}
