package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.nr;
public final class k extends FrameLayout {
    public final j f29708a;
    public final TransitionSet f29709b;
    public boolean f29710c;

    public k(Activity activity) {
        super(activity);
        this.f29710c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f29708a = jVar;
        addView(jVar, b6.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f29709b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) nr.f27346f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z4) {
        if (this.f29710c) {
            return;
        }
        this.f29710c = true;
        if (z4) {
            TransitionManager.beginDelayedTransition(this, this.f29709b);
        }
        j jVar = this.f29708a;
        jVar.v = 255;
        jVar.f29692n = -1;
        jVar.f29694s = 0;
        jVar.f29693r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new k41(8, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f29708a;
    }
}
