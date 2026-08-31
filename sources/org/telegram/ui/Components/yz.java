package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;
public final class yz implements a00 {
    public final MediaController.SavedFilterState f33653a;

    public yz(MediaController.SavedFilterState savedFilterState) {
        this.f33653a = savedFilterState;
    }

    @Override
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.f33653a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.f28709e;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return !this.f33653a.curvesToolValue.b();
    }

    @Override
    public final float getBlurAngle() {
        return this.f33653a.blurAngle;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return this.f33653a.blurExcludeBlurSize;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return this.f33653a.blurExcludePoint;
    }

    @Override
    public final float getBlurExcludeSize() {
        return this.f33653a.blurExcludeSize;
    }

    @Override
    public final int getBlurType() {
        return this.f33653a.blurType;
    }

    @Override
    public final float getContrastValue() {
        return w.c.c(this.f33653a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return this.f33653a.enhanceValue / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return this.f33653a.exposureValue / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return this.f33653a.fadeValue / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (this.f33653a.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return e2.c.v(this.f33653a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f10 = this.f33653a.saturationValue / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return e2.c.v(this.f33653a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return w.c.c(this.f33653a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return this.f33653a.softenSkinValue / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return this.f33653a.tintHighlightsColor;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (this.f33653a.tintHighlightsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return this.f33653a.tintShadowsColor;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (this.f33653a.tintShadowsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return this.f33653a.vignetteValue / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return this.f33653a.warmthValue / 100.0f;
    }
}
