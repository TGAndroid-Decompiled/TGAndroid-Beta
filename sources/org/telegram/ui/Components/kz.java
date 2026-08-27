package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;

public final class kz implements mz {

    public final MediaController.SavedFilterState f30226a;

    public kz(MediaController.SavedFilterState savedFilterState) {
        this.f30226a = savedFilterState;
    }

    @Override
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.f30226a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.f32146e;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return !this.f30226a.curvesToolValue.b();
    }

    @Override
    public final float getBlurAngle() {
        return this.f30226a.blurAngle;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return this.f30226a.blurExcludeBlurSize;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return this.f30226a.blurExcludePoint;
    }

    @Override
    public final float getBlurExcludeSize() {
        return this.f30226a.blurExcludeSize;
    }

    @Override
    public final int getBlurType() {
        return this.f30226a.blurType;
    }

    @Override
    public final float getContrastValue() {
        return s3.c.c(this.f30226a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return this.f30226a.enhanceValue / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return this.f30226a.exposureValue / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return this.f30226a.fadeValue / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (this.f30226a.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return com.google.android.recaptcha.internal.a.y(this.f30226a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f10 = this.f30226a.saturationValue / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.y(this.f30226a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return s3.c.c(this.f30226a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return this.f30226a.softenSkinValue / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return this.f30226a.tintHighlightsColor;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        return this.f30226a.tintHighlightsColor == 0 ? 0.0f : 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return this.f30226a.tintShadowsColor;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        return this.f30226a.tintShadowsColor == 0 ? 0.0f : 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return this.f30226a.vignetteValue / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return this.f30226a.warmthValue / 100.0f;
    }
}
