package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wn0;
import w7.y5;
public final class k extends FrameLayout {
    public final j f29431a;
    public final TransitionSet f29432b;
    public boolean f29433c;

    public k(Activity activity) {
        super(activity);
        this.f29433c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f29431a = jVar;
        addView(jVar, y5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f29432b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) qr.f27642f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f29433c) {
            return;
        }
        this.f29433c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f29432b);
        }
        j jVar = this.f29431a;
        jVar.v = 255;
        jVar.f29401n = -1;
        jVar.f29403s = 0;
        jVar.f29402r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new wn0(26, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f29431a;
    }
}
