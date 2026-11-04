package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.xq;
public final class j extends FrameLayout {
    public final i f39413a;
    public final TransitionSet f39414b;
    public boolean f39415c;

    public j(Activity activity) {
        super(activity);
        this.f39415c = false;
        setWillNotDraw(false);
        i iVar = new i(activity);
        this.f39413a = iVar;
        addView(iVar, mf.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f39414b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) xq.f40452f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f39415c) {
            return;
        }
        this.f39415c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f39414b);
        }
        i iVar = this.f39413a;
        iVar.f39401w = 255;
        iVar.f39398n = -1;
        iVar.f39400s = 0;
        iVar.f39399r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
        layoutParams.width = -1;
        iVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.i3(new p11(9, this, onClickListener), 500L);
    }

    public i getEndCloseView() {
        return this.f39413a;
    }
}
