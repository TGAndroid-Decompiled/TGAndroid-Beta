package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.qr;
import w7.x5;
public final class k extends FrameLayout {
    public final j f29008a;
    public final TransitionSet f29009b;
    public boolean f29010c;

    public k(Activity activity) {
        super(activity);
        this.f29010c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f29008a = jVar;
        addView(jVar, x5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f29009b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) qr.f27383f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f29010c) {
            return;
        }
        this.f29010c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f29009b);
        }
        j jVar = this.f29008a;
        jVar.v = 255;
        jVar.f28978n = -1;
        jVar.f28980s = 0;
        jVar.f28979r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new br0(20, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f29008a;
    }
}
