package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ko0;
import w7.z5;
public final class k extends FrameLayout {
    public final j f31677a;
    public final TransitionSet f31678b;
    public boolean f31679c;

    public k(Activity activity) {
        super(activity);
        this.f31679c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f31677a = jVar;
        addView(jVar, z5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f31678b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) bs.f25133f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f31679c) {
            return;
        }
        this.f31679c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f31678b);
        }
        j jVar = this.f31677a;
        jVar.v = 255;
        jVar.f31665n = -1;
        jVar.f31667s = 0;
        jVar.f31666r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new ko0(25, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f31677a;
    }
}
