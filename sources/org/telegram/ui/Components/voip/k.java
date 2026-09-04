package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.pr;
import w7.x5;
public final class k extends FrameLayout {
    public final j f31572a;
    public final TransitionSet f31573b;
    public boolean f31574c;

    public k(Activity activity) {
        super(activity);
        this.f31574c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f31572a = jVar;
        addView(jVar, x5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f31573b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) pr.f29466f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f31574c) {
            return;
        }
        this.f31574c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f31573b);
        }
        j jVar = this.f31572a;
        jVar.v = 255;
        jVar.f31559n = -1;
        jVar.f31561s = 0;
        jVar.f31560r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new jn0(26, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f31572a;
    }
}
