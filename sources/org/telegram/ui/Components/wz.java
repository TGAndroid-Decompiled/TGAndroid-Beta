package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;
public final class wz implements yz {
    public final MediaController.SavedFilterState f32394a;

    public wz(MediaController.SavedFilterState savedFilterState) {
        this.f32394a = savedFilterState;
    }

    @Override
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.f32394a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.f26058e;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return !this.f32394a.curvesToolValue.b();
    }

    @Override
    public final float getBlurAngle() {
        return this.f32394a.blurAngle;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return this.f32394a.blurExcludeBlurSize;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return this.f32394a.blurExcludePoint;
    }

    @Override
    public final float getBlurExcludeSize() {
        return this.f32394a.blurExcludeSize;
    }

    @Override
    public final int getBlurType() {
        return this.f32394a.blurType;
    }

    @Override
    public final float getContrastValue() {
        return a4.a.e(this.f32394a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return this.f32394a.enhanceValue / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return this.f32394a.exposureValue / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return this.f32394a.fadeValue / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (this.f32394a.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.f32394a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f7 = this.f32394a.saturationValue / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.f32394a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return a4.a.e(this.f32394a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return this.f32394a.softenSkinValue / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return this.f32394a.tintHighlightsColor;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (this.f32394a.tintHighlightsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return this.f32394a.tintShadowsColor;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (this.f32394a.tintShadowsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return this.f32394a.vignetteValue / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return this.f32394a.warmthValue / 100.0f;
    }
}
