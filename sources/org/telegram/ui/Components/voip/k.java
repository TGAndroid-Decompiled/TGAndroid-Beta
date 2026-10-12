package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.sj0;
import w7.w5;
public final class k extends FrameLayout {
    public final j f31750a;
    public final TransitionSet f31751b;
    public boolean f31752c;

    public k(Activity activity) {
        super(activity);
        this.f31752c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f31750a = jVar;
        addView(jVar, w5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f31751b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) js.f27627f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f31752c) {
            return;
        }
        this.f31752c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f31751b);
        }
        j jVar = this.f31750a;
        jVar.v = 255;
        jVar.f31743n = -1;
        jVar.f31745s = 0;
        jVar.f31744r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new sj0(28, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f31750a;
    }
}
