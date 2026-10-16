package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.n51;
import w7.z5;
public final class k extends FrameLayout {
    public final j f29929a;
    public final TransitionSet f29930b;
    public boolean f29931c;

    public k(Activity activity) {
        super(activity);
        this.f29931c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f29929a = jVar;
        addView(jVar, z5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f29930b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) es.f24465f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f29931c) {
            return;
        }
        this.f29931c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f29930b);
        }
        j jVar = this.f29929a;
        jVar.v = 255;
        jVar.f29913n = -1;
        jVar.f29915s = 0;
        jVar.f29914r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new n51(7, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f29929a;
    }
}
