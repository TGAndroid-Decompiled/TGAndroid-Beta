package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.r61;

public final class k extends FrameLayout {

    public final j f33643a;

    public final TransitionSet f33644b;

    public boolean f33645c;

    public k(Activity activity) {
        super(activity);
        this.f33645c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f33643a = jVar;
        addView(jVar, z5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f33644b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) er.f28122f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f33645c) {
            return;
        }
        this.f33645c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f33644b);
        }
        j jVar = this.f33643a;
        jVar.v = 255;
        jVar.f33632n = -1;
        jVar.f33634s = 0;
        jVar.f33633r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new r61(2, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f33643a;
    }
}
