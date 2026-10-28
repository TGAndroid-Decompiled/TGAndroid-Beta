package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public final class k extends FrameLayout {
    public final j f33983a;
    public final TransitionSet f33984b;
    public boolean f33985c;

    public k(Activity activity) {
        super(activity);
        this.f33985c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f33983a = jVar;
        addView(jVar, kb1.i(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f33984b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) ds.f27530f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f33985c) {
            return;
        }
        this.f33985c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f33984b);
        }
        j jVar = this.f33983a;
        jVar.v = 255;
        jVar.f33973n = -1;
        jVar.f33975s = 0;
        jVar.f33974r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new d71(14, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f33983a;
    }
}
