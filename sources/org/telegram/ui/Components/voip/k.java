package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q51;
public final class k extends FrameLayout {
    public final j f32121a;
    public final TransitionSet f32122b;
    public boolean f32123c;

    public k(Activity activity) {
        super(activity);
        this.f32123c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f32121a = jVar;
        addView(jVar, c6.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f32122b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) pr.f30168f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z4) {
        if (this.f32123c) {
            return;
        }
        this.f32123c = true;
        if (z4) {
            TransitionManager.beginDelayedTransition(this, this.f32122b);
        }
        j jVar = this.f32121a;
        jVar.v = 255;
        jVar.f32111n = -1;
        jVar.f32113s = 0;
        jVar.f32112r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new q51(6, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f32121a;
    }
}
