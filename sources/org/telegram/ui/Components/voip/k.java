package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.xn0;
import w7.y5;
public final class k extends FrameLayout {
    public final j f29329a;
    public final TransitionSet f29330b;
    public boolean f29331c;

    public k(Activity activity) {
        super(activity);
        this.f29331c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f29329a = jVar;
        addView(jVar, y5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f29330b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) sr.f28339f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f29331c) {
            return;
        }
        this.f29331c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f29330b);
        }
        j jVar = this.f29329a;
        jVar.v = 255;
        jVar.f29321n = -1;
        jVar.f29323s = 0;
        jVar.f29322r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new xn0(25, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f29329a;
    }
}
