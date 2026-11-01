package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hi0;
import w7.b6;
public final class j extends FrameLayout {
    public final i f31551a;
    public final TransitionSet f31552b;
    public boolean f31553c;

    public j(Activity activity) {
        super(activity);
        this.f31553c = false;
        setWillNotDraw(false);
        i iVar = new i(activity);
        this.f31551a = iVar;
        addView(iVar, b6.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f31552b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) gr.f26523f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f31553c) {
            return;
        }
        this.f31553c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f31552b);
        }
        i iVar = this.f31551a;
        iVar.f31542w = 255;
        iVar.f31539n = -1;
        iVar.f31541s = 0;
        iVar.f31540r = org.telegram.messenger.i0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
        layoutParams.width = -1;
        iVar.setLayoutParams(layoutParams);
        org.telegram.messenger.i0.h3(new hi0(28, this, onClickListener), 500L);
    }

    public i getEndCloseView() {
        return this.f31551a;
    }
}
