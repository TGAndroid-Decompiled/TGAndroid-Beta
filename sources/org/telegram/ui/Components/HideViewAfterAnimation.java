package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public class HideViewAfterAnimation extends AnimatorListenerAdapter {
    private final boolean goneOnHide;
    private final View view;

    public HideViewAfterAnimation(View view) {
        this.view = view;
        this.goneOnHide = true;
    }

    public HideViewAfterAnimation(View view, boolean z) {
        this.view = view;
        this.goneOnHide = z;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.view.setVisibility(this.goneOnHide ? 8 : 4);
    }
}
