package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public final class k extends FrameLayout {
    public final j f33878a;
    public final TransitionSet f33879b;
    public boolean f33880c;

    public k(Activity activity) {
        super(activity);
        this.f33880c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f33878a = jVar;
        addView(jVar, gb1.i(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f33879b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) ds.f27586f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f33880c) {
            return;
        }
        this.f33880c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f33879b);
        }
        j jVar = this.f33878a;
        jVar.v = 255;
        jVar.f33868n = -1;
        jVar.f33870s = 0;
        jVar.f33869r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new c71(13, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f33878a;
    }
}
