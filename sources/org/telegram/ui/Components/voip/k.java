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
import org.telegram.ui.Components.yn0;
import w7.y5;
public final class k extends FrameLayout {
    public final j f29393a;
    public final TransitionSet f29394b;
    public boolean f29395c;

    public k(Activity activity) {
        super(activity);
        this.f29395c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f29393a = jVar;
        addView(jVar, y5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f29394b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) qr.f27653f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f29395c) {
            return;
        }
        this.f29395c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f29394b);
        }
        j jVar = this.f29393a;
        jVar.v = 255;
        jVar.f29363n = -1;
        jVar.f29365s = 0;
        jVar.f29364r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new yn0(26, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f29393a;
    }
}
