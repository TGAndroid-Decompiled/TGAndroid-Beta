package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p61;
public final class k extends FrameLayout {
    public final j f33593a;
    public final TransitionSet f33594b;
    public boolean f33595c;

    public k(Activity activity) {
        super(activity);
        this.f33595c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f33593a = jVar;
        addView(jVar, e6.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f33594b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) gr.f28844f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f33595c) {
            return;
        }
        this.f33595c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f33594b);
        }
        j jVar = this.f33593a;
        jVar.v = 255;
        jVar.f33582n = -1;
        jVar.f33584s = 0;
        jVar.f33583r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new p61(2, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f33593a;
    }
}
