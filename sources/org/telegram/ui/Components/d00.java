package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;
public final class d00 implements f00 {
    public final MediaController.SavedFilterState f22264a;

    public d00(MediaController.SavedFilterState savedFilterState) {
        this.f22264a = savedFilterState;
    }

    @Override
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.f22264a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.e;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return !this.f22264a.curvesToolValue.b();
    }

    @Override
    public final float getBlurAngle() {
        return this.f22264a.blurAngle;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return this.f22264a.blurExcludeBlurSize;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return this.f22264a.blurExcludePoint;
    }

    @Override
    public final float getBlurExcludeSize() {
        return this.f22264a.blurExcludeSize;
    }

    @Override
    public final int getBlurType() {
        return this.f22264a.blurType;
    }

    @Override
    public final float getContrastValue() {
        return a4.a.e(this.f22264a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return this.f22264a.enhanceValue / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return this.f22264a.exposureValue / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return this.f22264a.fadeValue / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (this.f22264a.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.f22264a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f7 = this.f22264a.saturationValue / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.f22264a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return a4.a.e(this.f22264a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return this.f22264a.softenSkinValue / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return this.f22264a.tintHighlightsColor;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (this.f22264a.tintHighlightsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return this.f22264a.tintShadowsColor;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (this.f22264a.tintShadowsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return this.f22264a.vignetteValue / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return this.f22264a.warmthValue / 100.0f;
    }
}
