package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.jr;
public final class k extends FrameLayout {
    public final j f33782a;
    public final TransitionSet f33783b;
    public boolean f33784c;

    public k(Activity activity) {
        super(activity);
        this.f33784c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.f33782a = jVar;
        addView(jVar, f6.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.f33783b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.j(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) jr.f29800f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.f33784c) {
            return;
        }
        this.f33784c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.f33783b);
        }
        j jVar = this.f33782a;
        jVar.v = 255;
        jVar.f33765n = -1;
        jVar.f33767s = 0;
        jVar.f33766r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new ii0(29, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.f33782a;
    }
}
