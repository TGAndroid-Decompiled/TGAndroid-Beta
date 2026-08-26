package org.telegram.ui;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;

public final class VoIPFragment$$ExternalSyntheticLambda35 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;
    public final float f$2;
    public final float f$3;

    public VoIPFragment$$ExternalSyntheticLambda35(Object obj, float f, float f2, float f3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = f3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                VoIPFragment voIPFragment = (VoIPFragment) this.f$0;
                voIPFragment.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIPFragment.pinchScale = DiffUtil.m(1.0f, fFloatValue, 1.0f, this.f$1 * fFloatValue);
                voIPFragment.pinchTranslationX = this.f$2 * fFloatValue;
                voIPFragment.pinchTranslationY = this.f$3 * fFloatValue;
                voIPFragment.fragmentView.invalidate();
                break;
            case 1:
                GLIconTextureView gLIconTextureView = (GLIconTextureView) this.f$0;
                gLIconTextureView.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
                gLIconRenderer.angleX = this.f$1 * fFloatValue2;
                gLIconRenderer.angleX2 = this.f$2 * fFloatValue2;
                gLIconRenderer.angleY = fFloatValue2 * this.f$3;
                break;
            default:
                GroupCallRenderersContainer groupCallRenderersContainer = (GroupCallRenderersContainer) this.f$0;
                groupCallRenderersContainer.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                groupCallRenderersContainer.pinchScale = DiffUtil.m(1.0f, fFloatValue3, 1.0f, this.f$1 * fFloatValue3);
                groupCallRenderersContainer.pinchTranslationX = this.f$2 * fFloatValue3;
                groupCallRenderersContainer.pinchTranslationY = this.f$3 * fFloatValue3;
                groupCallRenderersContainer.invalidate();
                break;
        }
    }
}
