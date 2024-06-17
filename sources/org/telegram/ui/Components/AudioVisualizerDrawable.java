package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.Theme;

public class AudioVisualizerDrawable {
    private float idleScale;
    private boolean idleScaleInc;
    private int lastAmplitudeCount;
    private int lastAmplitudePointer;
    private final Paint p1;
    private View parentView;
    float rotation;
    private final int[] tmpWaveform = new int[3];
    private final float[] animateTo = new float[8];
    private final float[] current = new float[8];
    private final float[] dt = new float[8];
    private final Random random = new Random();
    public float IDLE_RADIUS = AndroidUtilities.dp(6.0f) * 0.33f;
    public float WAVE_RADIUS = AndroidUtilities.dp(12.0f) * 0.36f;
    public float ANIMATION_DURATION = 120.0f;
    public int ALPHA = 61;
    private float[] lastAmplitude = new float[6];
    private final CircleBezierDrawable[] drawables = new CircleBezierDrawable[2];

    public AudioVisualizerDrawable() {
        for (int i = 0; i < 2; i++) {
            CircleBezierDrawable[] circleBezierDrawableArr = this.drawables;
            CircleBezierDrawable circleBezierDrawable = new CircleBezierDrawable(6);
            circleBezierDrawableArr[i] = circleBezierDrawable;
            circleBezierDrawable.idleStateDiff = 0.0f;
            circleBezierDrawable.radius = AndroidUtilities.dp(24.0f);
            circleBezierDrawable.radiusDiff = 0.0f;
            circleBezierDrawable.randomK = 1.0f;
        }
        this.p1 = new Paint(1);
    }

    public void setWaveform(boolean z, boolean z2, float[] fArr) {
        if (LiteMode.isEnabled(32)) {
            int i = 0;
            if (!z && !z2) {
                while (i < 8) {
                    float[] fArr2 = this.animateTo;
                    this.current[i] = 0.0f;
                    fArr2[i] = 0.0f;
                    i++;
                }
                return;
            }
            boolean z3 = fArr != null && fArr[6] == 0.0f;
            float f = fArr == null ? 0.0f : fArr[6];
            if (fArr != null && f > 0.4d) {
                float[] fArr3 = this.lastAmplitude;
                int i2 = this.lastAmplitudePointer;
                fArr3[i2] = f;
                int i3 = i2 + 1;
                this.lastAmplitudePointer = i3;
                if (i3 > 5) {
                    this.lastAmplitudePointer = 0;
                }
                this.lastAmplitudeCount++;
            } else {
                this.lastAmplitudeCount = 0;
            }
            if (z3) {
                for (int i4 = 0; i4 < 6; i4++) {
                    fArr[i4] = (this.random.nextInt() % 500) / 1000.0f;
                }
            }
            float f2 = this.ANIMATION_DURATION;
            if (z3) {
                f2 *= 2.0f;
            }
            if (this.lastAmplitudeCount > 6) {
                float f3 = 0.0f;
                for (int i5 = 0; i5 < 6; i5++) {
                    f3 += this.lastAmplitude[i5];
                }
                float f4 = f3 / 6.0f;
                if (f4 > 0.52f) {
                    f2 -= this.ANIMATION_DURATION * (f4 - 0.4f);
                }
            }
            while (i < 7) {
                if (fArr == null) {
                    this.animateTo[i] = 0.0f;
                } else {
                    this.animateTo[i] = fArr[i];
                }
                if (this.parentView == null) {
                    this.current[i] = this.animateTo[i];
                } else if (i == 6) {
                    this.dt[i] = (this.animateTo[i] - this.current[i]) / (this.ANIMATION_DURATION + 80.0f);
                } else {
                    this.dt[i] = (this.animateTo[i] - this.current[i]) / f2;
                }
                i++;
            }
            float[] fArr4 = this.animateTo;
            fArr4[7] = z ? 1.0f : 0.0f;
            this.dt[7] = (fArr4[7] - this.current[7]) / 120.0f;
        }
    }

    public void draw(Canvas canvas, float f, float f2, int i, float f3, Theme.ResourcesProvider resourcesProvider) {
        if (LiteMode.isEnabled(32)) {
            this.p1.setColor(i);
            this.p1.setAlpha((int) (this.ALPHA * f3));
            draw(canvas, f, f2);
        }
    }

    public void draw(Canvas canvas, float f, float f2, boolean z, float f3, Theme.ResourcesProvider resourcesProvider) {
        if (LiteMode.isEnabled(32)) {
            if (z) {
                this.p1.setColor(Theme.getColor(Theme.key_chat_outLoader, resourcesProvider));
                this.p1.setAlpha((int) (this.ALPHA * f3));
            } else {
                this.p1.setColor(Theme.getColor(Theme.key_chat_inLoader, resourcesProvider));
                this.p1.setAlpha((int) (this.ALPHA * f3));
            }
            draw(canvas, f, f2);
        }
    }

    public void draw(Canvas canvas, float f, float f2) {
        if (LiteMode.isEnabled(32)) {
            for (int i = 0; i < 8; i++) {
                float[] fArr = this.animateTo;
                float f3 = fArr[i];
                float[] fArr2 = this.current;
                if (f3 != fArr2[i]) {
                    float f4 = fArr2[i];
                    float[] fArr3 = this.dt;
                    fArr2[i] = f4 + (fArr3[i] * 16.0f);
                    if ((fArr3[i] > 0.0f && fArr2[i] > fArr[i]) || (fArr3[i] < 0.0f && fArr2[i] < fArr[i])) {
                        fArr2[i] = fArr[i];
                    }
                    this.parentView.invalidate();
                }
            }
            if (this.idleScaleInc) {
                float f5 = this.idleScale + 0.02f;
                this.idleScale = f5;
                if (f5 > 1.0f) {
                    this.idleScaleInc = false;
                    this.idleScale = 1.0f;
                }
            } else {
                float f6 = this.idleScale - 0.02f;
                this.idleScale = f6;
                if (f6 < 0.0f) {
                    this.idleScaleInc = true;
                    this.idleScale = 0.0f;
                }
            }
            float[] fArr4 = this.current;
            float f7 = fArr4[7];
            float f8 = fArr4[6] * fArr4[0];
            if (f7 == 0.0f && f8 == 0.0f) {
                return;
            }
            for (int i2 = 0; i2 < 3; i2++) {
                this.tmpWaveform[i2] = (int) (this.current[i2] * this.WAVE_RADIUS);
            }
            this.drawables[0].setAdditionals(this.tmpWaveform);
            for (int i3 = 0; i3 < 3; i3++) {
                this.tmpWaveform[i3] = (int) (this.current[i3 + 3] * this.WAVE_RADIUS);
            }
            this.drawables[1].setAdditionals(this.tmpWaveform);
            float dp = AndroidUtilities.dp(22.0f) + (AndroidUtilities.dp(4.0f) * f8) + (this.IDLE_RADIUS * f7);
            if (dp > AndroidUtilities.dp(26.0f)) {
                dp = AndroidUtilities.dp(26.0f);
            }
            CircleBezierDrawable[] circleBezierDrawableArr = this.drawables;
            CircleBezierDrawable circleBezierDrawable = circleBezierDrawableArr[0];
            circleBezierDrawableArr[1].radius = dp;
            circleBezierDrawable.radius = dp;
            canvas.save();
            double d = this.rotation;
            Double.isNaN(d);
            float f9 = (float) (d + 0.6d);
            this.rotation = f9;
            canvas.rotate(f9, f, f2);
            canvas.save();
            float f10 = (this.idleScale * 0.04f) + 1.0f;
            canvas.scale(f10, f10, f, f2);
            this.drawables[0].draw(f, f2, canvas, this.p1);
            canvas.restore();
            canvas.rotate(60.0f, f, f2);
            float f11 = ((1.0f - this.idleScale) * 0.04f) + 1.0f;
            canvas.scale(f11, f11, f, f2);
            this.drawables[1].draw(f, f2, canvas, this.p1);
            canvas.restore();
        }
    }

    public void setParentView(View view) {
        this.parentView = view;
    }

    public View getParentView() {
        return this.parentView;
    }
}
