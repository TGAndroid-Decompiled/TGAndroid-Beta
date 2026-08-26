package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class GroupCallMiniTextureView$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final GroupCallMiniTextureView f$0;

    public GroupCallMiniTextureView$$ExternalSyntheticLambda3(GroupCallMiniTextureView groupCallMiniTextureView, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallMiniTextureView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                GroupCallMiniTextureView groupCallMiniTextureView = this.f$0;
                groupCallMiniTextureView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                groupCallMiniTextureView.progressToNoVideoStub = fFloatValue;
                groupCallMiniTextureView.noVideoStubLayout.setAlpha(fFloatValue);
                groupCallMiniTextureView.textureView.invalidate();
                break;
            default:
                GroupCallMiniTextureView groupCallMiniTextureView2 = this.f$0;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue2 < 0.5f) {
                    z = false;
                } else {
                    fFloatValue2 -= 1.0f;
                    z = true;
                }
                GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = groupCallMiniTextureView2.textureView;
                if (z && !groupCallMiniTextureView2.flipHalfReached) {
                    groupCallMiniTextureView2.blurredFlippingStub.setAlpha(1.0f);
                    groupCallMiniTextureView2.flipHalfReached = true;
                    anonymousClass1.renderer.clearImage();
                }
                float f = fFloatValue2 * 180.0f;
                groupCallMiniTextureView2.blurredFlippingStub.setRotationY(f);
                anonymousClass1.renderer.setRotationY(f);
                break;
        }
    }
}
