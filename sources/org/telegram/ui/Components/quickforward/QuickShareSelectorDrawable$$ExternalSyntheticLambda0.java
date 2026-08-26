package org.telegram.ui.Components.quickforward;

import android.view.animation.Interpolator;
import androidx.core.math.MathUtils;

public final class QuickShareSelectorDrawable$$ExternalSyntheticLambda0 implements Interpolator {
    public final boolean f$0;
    public final float f$1;
    public final float f$2;
    public final Interpolator f$3;

    public QuickShareSelectorDrawable$$ExternalSyntheticLambda0(boolean z, float f, float f2, Interpolator interpolator) {
        this.f$0 = z;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = interpolator;
    }

    @Override
    public final float getInterpolation(float f) {
        boolean z = this.f$0;
        float f2 = this.f$1;
        float f3 = this.f$2;
        Interpolator interpolator = this.f$3;
        return z ? 1.0f - interpolator.getInterpolation(1.0f - MathUtils.clamp((f - f2) / (f3 - f2), 0.0f, 1.0f)) : interpolator.getInterpolation(MathUtils.clamp((f - f2) / (f3 - f2), 0.0f, 1.0f));
    }
}
