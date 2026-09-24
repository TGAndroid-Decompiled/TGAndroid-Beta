package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wn0;
import w7.y5;
public final class k extends FrameLayout {
    public final j f29403a;
    public final TransitionSet f29404b;
    public boolean f29405c;

    public k(Activity activity) {
        super(activity);
        this.f29405c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f29403a = jVar;
        addView(jVar, y5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f29404b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) rr.f28022f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f29405c) {
            return;
        }
        this.f29405c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f29404b);
        }
        j jVar = this.f29403a;
        jVar.v = 255;
        jVar.f29395n = -1;
        jVar.f29397s = 0;
        jVar.f29396r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new wn0(26, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f29403a;
    }
}
