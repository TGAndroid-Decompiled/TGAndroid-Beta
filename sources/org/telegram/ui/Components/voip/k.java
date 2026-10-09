package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ea1;
import org.telegram.ui.Components.hs;
import w7.x5;
public final class k extends FrameLayout {
    public final j f32022a;
    public final TransitionSet f32023b;
    public boolean f32024c;

    public k(Activity activity) {
        super(activity);
        this.f32024c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f32022a = jVar;
        addView(jVar, x5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f32023b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) hs.f27118f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f32024c) {
            return;
        }
        this.f32024c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f32023b);
        }
        j jVar = this.f32022a;
        jVar.v = 255;
        jVar.f31990n = -1;
        jVar.f31992s = 0;
        jVar.f31991r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new ea1(1, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f32022a;
    }
}
