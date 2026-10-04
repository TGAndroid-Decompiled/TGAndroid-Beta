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
import org.telegram.ui.Components.uo0;
import w7.z5;
public final class k extends FrameLayout {
    public final j f31923a;
    public final TransitionSet f31924b;
    public boolean f31925c;

    public k(Activity activity) {
        super(activity);
        this.f31925c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f31923a = jVar;
        addView(jVar, z5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f31924b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) tr.f31141f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f31925c) {
            return;
        }
        this.f31925c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f31924b);
        }
        j jVar = this.f31923a;
        jVar.v = 255;
        jVar.f31915n = -1;
        jVar.f31917s = 0;
        jVar.f31916r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new uo0(24, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f31923a;
    }
}
