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
import org.telegram.ui.Components.k31;
import w7.a6;
public final class k extends FrameLayout {
    public final j f30260a;
    public final TransitionSet f30261b;
    public boolean f30262c;

    public k(Activity activity) {
        super(activity);
        this.f30262c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f30260a = jVar;
        addView(jVar, a6.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f30261b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) es.f24771f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f30262c) {
            return;
        }
        this.f30262c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f30261b);
        }
        j jVar = this.f30260a;
        jVar.v = 255;
        jVar.f30244n = -1;
        jVar.f30246s = 0;
        jVar.f30245r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new k31(12, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f30260a;
    }
}
