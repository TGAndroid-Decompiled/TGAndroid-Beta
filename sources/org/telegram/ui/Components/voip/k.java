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
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pr;
public final class k extends FrameLayout {
    public final j f32116a;
    public final TransitionSet f32117b;
    public boolean f32118c;

    public k(Activity activity) {
        super(activity);
        this.f32118c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f32116a = jVar;
        addView(jVar, c6.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f32117b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) pr.f30183f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z4) {
        if (this.f32118c) {
            return;
        }
        this.f32118c = true;
        if (z4) {
            TransitionManager.beginDelayedTransition(this, this.f32117b);
        }
        j jVar = this.f32116a;
        jVar.v = 255;
        jVar.f32106n = -1;
        jVar.f32108s = 0;
        jVar.f32107r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new l41(7, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f32116a;
    }
}
