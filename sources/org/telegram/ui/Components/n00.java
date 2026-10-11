package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;
public final class n00 implements p00 {
    public final MediaController.SavedFilterState f28885a;

    public n00(MediaController.SavedFilterState savedFilterState) {
        this.f28885a = savedFilterState;
    }

    @Override
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.f28885a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.f27318e;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return !this.f28885a.curvesToolValue.b();
    }

    @Override
    public final float getBlurAngle() {
        return this.f28885a.blurAngle;
    }

    @Override
    public final float getBlurExcludeBlurSize() {
        return this.f28885a.blurExcludeBlurSize;
    }

    @Override
    public final PointF getBlurExcludePoint() {
        return this.f28885a.blurExcludePoint;
    }

    @Override
    public final float getBlurExcludeSize() {
        return this.f28885a.blurExcludeSize;
    }

    @Override
    public final int getBlurType() {
        return this.f28885a.blurType;
    }

    @Override
    public final float getContrastValue() {
        return a1.g.e(this.f28885a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public final float getEnhanceValue() {
        return this.f28885a.enhanceValue / 100.0f;
    }

    @Override
    public final float getExposureValue() {
        return this.f28885a.exposureValue / 100.0f;
    }

    @Override
    public final float getFadeValue() {
        return this.f28885a.fadeValue / 100.0f;
    }

    @Override
    public final float getGrainValue() {
        return (this.f28885a.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public final float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.x(this.f28885a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public final float getSaturationValue() {
        float f7 = this.f28885a.saturationValue / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    @Override
    public final float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.x(this.f28885a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public final float getSharpenValue() {
        return a1.g.e(this.f28885a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public final float getSoftenSkinValue() {
        return this.f28885a.softenSkinValue / 100.0f;
    }

    @Override
    public final int getTintHighlightsColor() {
        return this.f28885a.tintHighlightsColor;
    }

    @Override
    public final float getTintHighlightsIntensityValue() {
        if (this.f28885a.tintHighlightsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final int getTintShadowsColor() {
        return this.f28885a.tintShadowsColor;
    }

    @Override
    public final float getTintShadowsIntensityValue() {
        if (this.f28885a.tintShadowsColor == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public final float getVignetteValue() {
        return this.f28885a.vignetteValue / 100.0f;
    }

    @Override
    public final float getWarmthValue() {
        return this.f28885a.warmthValue / 100.0f;
    }
}
