package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;
public final class i00 implements k00 {
    public final MediaController.SavedFilterState f25788a;

    public i00(MediaController.SavedFilterState savedFilterState) {
        this.f25788a = savedFilterState;
    }

    @Override
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.f25788a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.e;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return !this.f25788a.curvesToolValue.b();
    }

    @Override
    public final float getBlurAngle() {
        return this.f25788a.blurAngle;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return this.f25788a.blurExcludeBlurSize;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return this.f25788a.blurExcludePoint;
    }

    @Override
    public final float getBlurExcludeSize() {
        return this.f25788a.blurExcludeSize;
    }

    @Override
    public final int getBlurType() {
        return this.f25788a.blurType;
    }

    @Override
    public final float getContrastValue() {
        return a1.g.d(this.f25788a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return this.f25788a.enhanceValue / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return this.f25788a.exposureValue / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return this.f25788a.fadeValue / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (this.f25788a.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return com.google.android.gms.internal.play_billing.k3.w(this.f25788a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f7 = this.f25788a.saturationValue / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return com.google.android.gms.internal.play_billing.k3.w(this.f25788a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return a1.g.d(this.f25788a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return this.f25788a.softenSkinValue / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return this.f25788a.tintHighlightsColor;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (this.f25788a.tintHighlightsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return this.f25788a.tintShadowsColor;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (this.f25788a.tintShadowsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return this.f25788a.vignetteValue / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return this.f25788a.warmthValue / 100.0f;
    }
}
