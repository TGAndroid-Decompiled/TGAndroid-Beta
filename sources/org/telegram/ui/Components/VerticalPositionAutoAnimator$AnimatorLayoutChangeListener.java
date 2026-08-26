package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

public final class VerticalPositionAutoAnimator$AnimatorLayoutChangeListener implements View.OnLayoutChangeListener {
    public boolean ignoreNextLayout;
    public Boolean orientation;
    public final PhotoViewer.AnonymousClass14 this$0;

    public VerticalPositionAutoAnimator$AnimatorLayoutChangeListener(PhotoViewer.AnonymousClass14 anonymousClass14, View view) {
        this.this$0 = anonymousClass14;
        DynamicAnimation.AnonymousClass1 anonymousClass1 = DynamicAnimation.TRANSLATION_Y;
        anonymousClass14.getClass();
        SpringAnimation springAnimation = new SpringAnimation(view, anonymousClass1, 0.0f);
        anonymousClass14.this$0 = springAnimation;
        springAnimation.mSpring.setDampingRatio(1.0f);
        ((SpringAnimation) anonymousClass14.this$0).mSpring.setStiffness(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Point point = AndroidUtilities.displaySize;
        boolean z = point.x > point.y;
        Boolean bool = this.orientation;
        if (bool == null || bool.booleanValue() != z) {
            this.orientation = Boolean.valueOf(z);
            this.ignoreNextLayout = true;
        }
        if (i6 == 0 || i6 == i2 || this.ignoreNextLayout) {
            this.ignoreNextLayout = false;
            return;
        }
        PhotoViewer.AnonymousClass14 anonymousClass14 = this.this$0;
        ((SpringAnimation) anonymousClass14.this$0).cancel();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((SpringAnimation) anonymousClass14.this$0).mSpring.mFinalPosition = 0.0f;
        view.setTranslationY((i6 - i2) + 0.0f);
        ((SpringAnimation) anonymousClass14.this$0).start();
    }
}
