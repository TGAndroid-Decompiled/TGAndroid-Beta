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
import org.telegram.ui.Components.go0;
import w7.z5;
public final class k extends FrameLayout {
    public final j f31540a;
    public final TransitionSet f31541b;
    public boolean f31542c;

    public k(Activity activity) {
        super(activity);
        this.f31542c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f31540a = jVar;
        addView(jVar, z5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f31541b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) bs.f25012f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f31542c) {
            return;
        }
        this.f31542c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f31541b);
        }
        j jVar = this.f31540a;
        jVar.v = 255;
        jVar.f31528n = -1;
        jVar.f31530s = 0;
        jVar.f31529r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new go0(25, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f31540a;
    }
}
