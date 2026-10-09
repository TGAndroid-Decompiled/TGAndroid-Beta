package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;
public final class m00 implements o00 {
    public final MediaController.SavedFilterState f28638a;

    public m00(MediaController.SavedFilterState savedFilterState) {
        this.f28638a = savedFilterState;
    }

    @Override
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.f28638a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.f26694e;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return !this.f28638a.curvesToolValue.b();
    }

    @Override
    public final float getBlurAngle() {
        return this.f28638a.blurAngle;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return this.f28638a.blurExcludeBlurSize;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return this.f28638a.blurExcludePoint;
    }

    @Override
    public final float getBlurExcludeSize() {
        return this.f28638a.blurExcludeSize;
    }

    @Override
    public final int getBlurType() {
        return this.f28638a.blurType;
    }

    @Override
    public final float getContrastValue() {
        return a1.g.e(this.f28638a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return this.f28638a.enhanceValue / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return this.f28638a.exposureValue / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return this.f28638a.fadeValue / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (this.f28638a.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.x(this.f28638a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f7 = this.f28638a.saturationValue / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.x(this.f28638a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return a1.g.e(this.f28638a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return this.f28638a.softenSkinValue / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return this.f28638a.tintHighlightsColor;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (this.f28638a.tintHighlightsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return this.f28638a.tintShadowsColor;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (this.f28638a.tintShadowsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return this.f28638a.vignetteValue / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return this.f28638a.warmthValue / 100.0f;
    }
}
