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
    public final k f32081a;
    public final TransitionSet f32082b;
    public boolean f32083c;

    public l(Activity activity) {
        super(activity);
        this.f32083c = false;
        setWillNotDraw(false);
        k kVar = new k(activity);
        this.f32081a = kVar;
        addView(kVar, x5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f32082b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) is.f27451f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f32083c) {
            return;
        }
        this.f32083c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f32082b);
        }
        k kVar = this.f32081a;
        kVar.v = 255;
        kVar.f32049n = -1;
        kVar.f32051s = 0;
        kVar.f32050r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        layoutParams.width = -1;
        kVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new i(0, this, onClickListener), 500L);
    }

    public k getEndCloseView() {
        return this.f32081a;
    }
}
