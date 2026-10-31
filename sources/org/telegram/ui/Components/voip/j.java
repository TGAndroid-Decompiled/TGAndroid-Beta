package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.gr;
import w7.b6;
public final class j extends FrameLayout {
    public final i f31480a;
    public final TransitionSet f31481b;
    public boolean f31482c;

    public j(Activity activity) {
        super(activity);
        this.f31482c = false;
        setWillNotDraw(false);
        i iVar = new i(activity);
        this.f31480a = iVar;
        addView(iVar, b6.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f31481b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) gr.f26495f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f31482c) {
            return;
        }
        this.f31482c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f31481b);
        }
        i iVar = this.f31480a;
        iVar.f31473w = 255;
        iVar.f31470n = -1;
        iVar.f31472s = 0;
        iVar.f31471r = org.telegram.messenger.i0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
        layoutParams.width = -1;
        iVar.setLayoutParams(layoutParams);
        org.telegram.messenger.i0.h3(new gi0(27, this, onClickListener), 500L);
    }

    public i getEndCloseView() {
        return this.f31480a;
    }
}
