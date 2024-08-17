package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.os.Build;
import android.util.Property;
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
        Property property = View.SCALE_X;
        float f3 = 1.0f - f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f3);
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f3));
        animatorSet.setDuration(80L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f));
        animatorSet2.setInterpolator(new OvershootInterpolator(f2));
        animatorSet2.setDuration(350L);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842919}, animatorSet);
        stateListAnimator.addState(new int[0], animatorSet2);
        view.setStateListAnimator(stateListAnimator);
    }

    public static void reset(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setStateListAnimator(null);
        }
    }
}
