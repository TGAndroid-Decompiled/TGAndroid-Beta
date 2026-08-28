package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;
public final class iz implements kz {
    public final MediaController.SavedFilterState f29547a;

    public iz(MediaController.SavedFilterState savedFilterState) {
        this.f29547a = savedFilterState;
    }

    @Override
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.f29547a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.f30805e;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return !this.f29547a.curvesToolValue.b();
    }

    @Override
    public final float getBlurAngle() {
        return this.f29547a.blurAngle;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return this.f29547a.blurExcludeBlurSize;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return this.f29547a.blurExcludePoint;
    }

    @Override
    public final float getBlurExcludeSize() {
        return this.f29547a.blurExcludeSize;
    }

    @Override
    public final int getBlurType() {
        return this.f29547a.blurType;
    }

    @Override
    public final float getContrastValue() {
        return org.telegram.ui.Cells.j2.b(this.f29547a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return this.f29547a.enhanceValue / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return this.f29547a.exposureValue / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return this.f29547a.fadeValue / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (this.f29547a.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return e2.c.y(this.f29547a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f10 = this.f29547a.saturationValue / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return e2.c.y(this.f29547a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return org.telegram.ui.Cells.j2.b(this.f29547a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return this.f29547a.softenSkinValue / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return this.f29547a.tintHighlightsColor;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (this.f29547a.tintHighlightsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return this.f29547a.tintShadowsColor;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (this.f29547a.tintShadowsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return this.f29547a.vignetteValue / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return this.f29547a.warmthValue / 100.0f;
    }
}
