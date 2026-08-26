package org.telegram.ui.Stars;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;

public final class StarsReactionsSheet$StarsSlider$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final View f$0;
    public final int f$1;
    public final int f$2;
    public final int f$3;
    public final int f$4;

    public StarsReactionsSheet$StarsSlider$$ExternalSyntheticLambda1(View view, int i, int i2, int i3, int i4, int i5) {
        this.$r8$classId = i5;
        this.f$0 = view;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$4 = i4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f$4;
        int i2 = this.f$3;
        int i3 = this.f$2;
        int i4 = this.f$1;
        View view = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                StarsReactionsSheet.StarsSlider starsSlider = (StarsReactionsSheet.StarsSlider) view;
                starsSlider.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                starsSlider.gradientColor1 = ColorUtils.blendARGB(fFloatValue, i4, i3);
                starsSlider.gradientColor2 = ColorUtils.blendARGB(fFloatValue, i2, i);
                starsSlider.gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{starsSlider.gradientColor1, starsSlider.gradientColor2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                starsSlider.invalidate();
                break;
            case 1:
                ((GroupCallFullscreenAdapter.GroupCallUserCell) view).lambda$updateState$0(this.f$1, this.f$2, this.f$3, this.f$4, valueAnimator);
                break;
            default:
                GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) view;
                groupCallMiniTextureView.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                groupCallMiniTextureView.lastIconColor = ColorUtils.blendARGB(fFloatValue2, i4, i3);
                int iBlendARGB = ColorUtils.blendARGB(fFloatValue2, i2, i);
                groupCallMiniTextureView.lastSpeakingFrameColor = iBlendARGB;
                groupCallMiniTextureView.speakingPaint.setColor(iBlendARGB);
                if (groupCallMiniTextureView.progressToSpeaking > 0.0f) {
                    groupCallMiniTextureView.invalidate();
                }
                break;
        }
    }
}
