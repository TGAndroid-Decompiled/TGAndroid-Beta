package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fa1;
import org.telegram.ui.Components.is;
import w7.x5;
public final class k extends FrameLayout {
    public final j f32087a;
    public final TransitionSet f32088b;
    public boolean f32089c;

    public k(Activity activity) {
        super(activity);
        this.f32089c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f32087a = jVar;
        addView(jVar, x5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f32088b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) is.f27443f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f32089c) {
            return;
        }
        this.f32089c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f32088b);
        }
        j jVar = this.f32087a;
        jVar.v = 255;
        jVar.f32055n = -1;
        jVar.f32057s = 0;
        jVar.f32056r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new fa1(1, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f32087a;
    }
}
