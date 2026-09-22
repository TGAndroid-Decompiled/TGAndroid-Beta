package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.qr;
import w7.x5;
public final class k extends FrameLayout {
    public final j f29025a;
    public final TransitionSet f29026b;
    public boolean f29027c;

    public k(Activity activity) {
        super(activity);
        this.f29027c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f29025a = jVar;
        addView(jVar, x5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f29026b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) qr.f27420f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f29027c) {
            return;
        }
        this.f29027c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f29026b);
        }
        j jVar = this.f29025a;
        jVar.v = 255;
        jVar.f28995n = -1;
        jVar.f28997s = 0;
        jVar.f28996r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new ar0(20, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f29025a;
    }
}
