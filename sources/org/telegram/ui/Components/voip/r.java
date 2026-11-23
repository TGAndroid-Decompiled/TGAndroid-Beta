package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.ui.Components.kr;
public final class r extends FrameLayout {
    public final q f41162a;
    public final TransitionSet f41163b;
    public boolean f41164c;

    public r(Activity activity) {
        super(activity);
        this.f41164c = false;
        setWillNotDraw(false);
        q qVar = new q(activity);
        this.f41162a = qVar;
        addView(qVar, na.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f41163b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) kr.f36858f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f41164c) {
            return;
        }
        this.f41164c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f41163b);
        }
        q qVar = this.f41162a;
        qVar.f41154w = 255;
        qVar.f41151n = -1;
        qVar.f41153s = 0;
        qVar.f41152r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        layoutParams.width = -1;
        qVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.h3(new o(0, this, onClickListener), 500L);
    }

    public q getEndCloseView() {
        return this.f41162a;
    }
}
