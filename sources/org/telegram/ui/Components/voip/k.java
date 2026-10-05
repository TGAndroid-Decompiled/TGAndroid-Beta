package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.vo0;
import w7.z5;
public final class k extends FrameLayout {
    public final j f31996a;
    public final TransitionSet f31997b;
    public boolean f31998c;

    public k(Activity activity) {
        super(activity);
        this.f31998c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f31996a = jVar;
        addView(jVar, z5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f31997b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) tr.f31215f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f31998c) {
            return;
        }
        this.f31998c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f31997b);
        }
        j jVar = this.f31996a;
        jVar.v = 255;
        jVar.f31988n = -1;
        jVar.f31990s = 0;
        jVar.f31989r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new vo0(24, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f31996a;
    }
}
