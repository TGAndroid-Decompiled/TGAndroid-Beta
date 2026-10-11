package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
import w7.x5;
public final class l extends FrameLayout {
    public final k f32145a;
    public final TransitionSet f32146b;
    public boolean f32147c;

    public l(Activity activity) {
        super(activity);
        this.f32147c = false;
        setWillNotDraw(false);
        k kVar = new k(activity);
        this.f32145a = kVar;
        addView(kVar, x5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f32146b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) is.f27500f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f32147c) {
            return;
        }
        this.f32147c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f32146b);
        }
        k kVar = this.f32145a;
        kVar.v = 255;
        kVar.f32113n = -1;
        kVar.f32115s = 0;
        kVar.f32114r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        layoutParams.width = -1;
        kVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new i(0, this, onClickListener), 500L);
    }

    public k getEndCloseView() {
        return this.f32145a;
    }
}
