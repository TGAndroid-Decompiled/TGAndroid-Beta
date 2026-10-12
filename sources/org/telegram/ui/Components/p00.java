package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;
public final class p00 implements r00 {
    public final MediaController.SavedFilterState f29342a;

    public p00(MediaController.SavedFilterState savedFilterState) {
        this.f29342a = savedFilterState;
    }

    @Override
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.f29342a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.f27858e;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return !this.f29342a.curvesToolValue.b();
    }

    @Override
    public final float getBlurAngle() {
        return this.f29342a.blurAngle;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return this.f29342a.blurExcludeBlurSize;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return this.f29342a.blurExcludePoint;
    }

    @Override
    public final float getBlurExcludeSize() {
        return this.f29342a.blurExcludeSize;
    }

    @Override
    public final int getBlurType() {
        return this.f29342a.blurType;
    }

    @Override
    public final float getContrastValue() {
        return a1.g.e(this.f29342a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return this.f29342a.enhanceValue / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return this.f29342a.exposureValue / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return this.f29342a.fadeValue / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (this.f29342a.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.x(this.f29342a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f7 = this.f29342a.saturationValue / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.x(this.f29342a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return a1.g.e(this.f29342a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return this.f29342a.softenSkinValue / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return this.f29342a.tintHighlightsColor;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (this.f29342a.tintHighlightsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return this.f29342a.tintShadowsColor;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (this.f29342a.tintShadowsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return this.f29342a.vignetteValue / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return this.f29342a.warmthValue / 100.0f;
    }
}
