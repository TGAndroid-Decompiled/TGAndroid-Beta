package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.yo0;
import w7.a6;
public final class k extends FrameLayout {
    public final j f28205a;
    public final TransitionSet f28206b;
    public boolean f28207c;

    public k(Activity activity) {
        super(activity);
        this.f28207c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f28205a = jVar;
        addView(jVar, a6.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f28206b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) wr.f28819f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f28207c) {
            return;
        }
        this.f28207c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f28206b);
        }
        j jVar = this.f28205a;
        jVar.v = 255;
        jVar.f28186n = -1;
        jVar.f28188s = 0;
        jVar.f28187r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new yo0(23, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f28205a;
    }
}
