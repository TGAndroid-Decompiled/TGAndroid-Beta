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
    public final j f31600a;
    public final TransitionSet f31601b;
    public boolean f31602c;

    public k(Activity activity) {
        super(activity);
        this.f31602c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f31600a = jVar;
        addView(jVar, x5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f31601b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) pr.f29494f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f31602c) {
            return;
        }
        this.f31602c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f31601b);
        }
        j jVar = this.f31600a;
        jVar.v = 255;
        jVar.f31587n = -1;
        jVar.f31589s = 0;
        jVar.f31588r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new jn0(26, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f31600a;
    }
}
