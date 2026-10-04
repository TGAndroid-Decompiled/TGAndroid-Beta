package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;
public final class zz implements b00 {
    public final MediaController.SavedFilterState f33685a;

    public zz(MediaController.SavedFilterState savedFilterState) {
        this.f33685a = savedFilterState;
    }

    @Override
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.f33685a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.f30377e;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return !this.f33685a.curvesToolValue.b();
    }

    @Override
    public final float getBlurAngle() {
        return this.f33685a.blurAngle;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return this.f33685a.blurExcludeBlurSize;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return this.f33685a.blurExcludePoint;
    }

    @Override
    public final float getBlurExcludeSize() {
        return this.f33685a.blurExcludeSize;
    }

    @Override
    public final int getBlurType() {
        return this.f33685a.blurType;
    }

    @Override
    public final float getContrastValue() {
        return a4.a.e(this.f33685a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return this.f33685a.enhanceValue / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return this.f33685a.exposureValue / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return this.f33685a.fadeValue / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (this.f33685a.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.f33685a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f7 = this.f33685a.saturationValue / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.f33685a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return a4.a.e(this.f33685a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return this.f33685a.softenSkinValue / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return this.f33685a.tintHighlightsColor;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (this.f33685a.tintHighlightsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return this.f33685a.tintShadowsColor;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (this.f33685a.tintShadowsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return this.f33685a.vignetteValue / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return this.f33685a.warmthValue / 100.0f;
    }
}
