package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ScaleStateListAnimator {
    public static void apply(View view) {
        apply(view, 0.1f, 1.5f);
    }

    public static void apply(View view, float f, float f2) {
        if (view == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        view.setLayerType(2, null);
        AnimatorSet animatorSet = new AnimatorSet();
        float f3 = 1.0f - f;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f3), ObjectAnimator.ofFloat(view, View.SCALE_Y, f3));
        animatorSet.setDuration(80L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f));
        animatorSet2.setInterpolator(new OvershootInterpolator(f2));
        animatorSet2.setDuration(350L);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842919}, animatorSet);
        stateListAnimator.addState(new int[0], animatorSet2);
        view.setStateListAnimator(stateListAnimator);
    }
}
