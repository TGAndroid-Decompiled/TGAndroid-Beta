package org.telegram.ui.Components.Paint.Views;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class LPhotoPaintView$$ExternalSyntheticLambda15 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final LPhotoPaintView f$0;
    public final boolean f$1;

    public LPhotoPaintView$$ExternalSyntheticLambda15(LPhotoPaintView lPhotoPaintView, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = lPhotoPaintView;
        this.f$1 = z;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showColorList$30(this.f$1, dynamicAnimation, z, f, f2);
                break;
            default:
                this.f$0.lambda$showTypefaceMenu$28(this.f$1, dynamicAnimation, z, f, f2);
                break;
        }
    }
}
