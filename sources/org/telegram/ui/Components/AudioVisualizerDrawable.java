package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;

public final class AudioVisualizerDrawable {
    public float idleScale;
    public boolean idleScaleInc;
    public int lastAmplitudeCount;
    public int lastAmplitudePointer;
    public final Paint p1;
    public ChatMessageCell parentView;
    public float rotation;
    public final int[] tmpWaveform = new int[3];
    public final float[] animateTo = new float[8];
    public final float[] current = new float[8];
    public final float[] dt = new float[8];
    public final Random random = new Random();
    public final float IDLE_RADIUS = AndroidUtilities.dp(6.0f) * 0.33f;
    public final float WAVE_RADIUS = AndroidUtilities.dp(12.0f) * 0.36f;
    public final float ANIMATION_DURATION = 120.0f;
    public final int ALPHA = 61;
    public final float[] lastAmplitude = new float[6];
    public final CircleBezierDrawable[] drawables = new CircleBezierDrawable[2];

    public AudioVisualizerDrawable() {
        for (int i = 0; i < 2; i++) {
            CircleBezierDrawable[] circleBezierDrawableArr = this.drawables;
            CircleBezierDrawable circleBezierDrawable = new CircleBezierDrawable();
            circleBezierDrawableArr[i] = circleBezierDrawable;
            circleBezierDrawable.radius = AndroidUtilities.dp(24.0f);
            circleBezierDrawable.randomK = 1.0f;
        }
        this.p1 = new Paint(1);
    }

    public final void draw(float f, float f2, float f3, int i, Canvas canvas) {
        if (LiteMode.isEnabled(32)) {
            Paint paint = this.p1;
            paint.setColor(i);
            paint.setAlpha((int) (this.ALPHA * f3));
            draw(canvas, f, f2);
        }
    }

    public final void setParentView(ChatMessageCell chatMessageCell) {
        this.parentView = chatMessageCell;
    }

    public final void setWaveform(boolean z, boolean z2, float[] fArr) {
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.current;
            float[] fArr4 = this.animateTo;
            int i = 0;
            if (!z && !z2) {
                while (i < 8) {
                    fArr3[i] = 0.0f;
                    fArr4[i] = 0.0f;
                    i++;
                }
                return;
            }
            boolean z3 = fArr != null && fArr[6] == 0.0f;
            float f = fArr == null ? 0.0f : fArr[6];
            float[] fArr5 = this.lastAmplitude;
            if (fArr == null || f <= 0.4d) {
                this.lastAmplitudeCount = 0;
            } else {
                int i2 = this.lastAmplitudePointer;
                fArr5[i2] = f;
                int i3 = i2 + 1;
                this.lastAmplitudePointer = i3;
                if (i3 > 5) {
                    this.lastAmplitudePointer = 0;
                }
                this.lastAmplitudeCount++;
            }
            if (z3) {
                for (int i4 = 0; i4 < 6; i4++) {
                    fArr[i4] = (this.random.nextInt() % 500) / 1000.0f;
                }
            }
            float f2 = this.ANIMATION_DURATION;
            float fM = z3 ? 2.0f * f2 : f2;
            if (this.lastAmplitudeCount > 6) {
                float f3 = 0.0f;
                for (int i5 = 0; i5 < 6; i5++) {
                    f3 += fArr5[i5];
                }
                float f4 = f3 / 6.0f;
                if (f4 > 0.52f) {
                    fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(f4, 0.4f, f2, fM);
                }
            }
            while (true) {
                fArr2 = this.dt;
                if (i >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i] = 0.0f;
                } else {
                    fArr4[i] = fArr[i];
                }
                if (this.parentView == null) {
                    fArr3[i] = fArr4[i];
                } else if (i == 6) {
                    fArr2[i] = (fArr4[i] - fArr3[i]) / (80.0f + f2);
                } else {
                    fArr2[i] = (fArr4[i] - fArr3[i]) / fM;
                }
                i++;
            }
            float f5 = z ? 1.0f : 0.0f;
            fArr4[7] = f5;
            fArr2[7] = (f5 - fArr3[7]) / 120.0f;
        }
    }

    public final void draw(Canvas canvas, float f, float f2, boolean z, float f3, Theme.ResourcesProvider resourcesProvider) {
        if (LiteMode.isEnabled(32)) {
            Paint paint = this.p1;
            int i = this.ALPHA;
            if (z) {
                paint.setColor(Theme.getColor(Theme.key_chat_outLoader, resourcesProvider));
                paint.setAlpha((int) (i * f3));
            } else {
                paint.setColor(Theme.getColor(Theme.key_chat_inLoader, resourcesProvider));
                paint.setAlpha((int) (i * f3));
            }
            draw(canvas, f, f2);
        }
    }

    public final void draw(Canvas canvas, float f, float f2) {
        float[] fArr;
        int[] iArr;
        float f3;
        if (LiteMode.isEnabled(32)) {
            int i = 0;
            while (true) {
                fArr = this.current;
                if (i >= 8) {
                    break;
                }
                float[] fArr2 = this.animateTo;
                float f4 = fArr2[i];
                float f5 = fArr[i];
                if (f4 != f5) {
                    float[] fArr3 = this.dt;
                    float f6 = (fArr3[i] * 16.0f) + f5;
                    fArr[i] = f6;
                    float f7 = fArr3[i];
                    if ((f7 > 0.0f && f6 > fArr2[i]) || (f7 < 0.0f && f6 < fArr2[i])) {
                        fArr[i] = fArr2[i];
                    }
                    this.parentView.invalidate();
                }
                i++;
            }
            if (this.idleScaleInc) {
                float f8 = this.idleScale + 0.02f;
                this.idleScale = f8;
                if (f8 > 1.0f) {
                    this.idleScaleInc = false;
                    this.idleScale = 1.0f;
                }
            } else {
                float f9 = this.idleScale - 0.02f;
                this.idleScale = f9;
                if (f9 < 0.0f) {
                    this.idleScaleInc = true;
                    this.idleScale = 0.0f;
                }
            }
            float f10 = fArr[7];
            float f11 = fArr[6] * fArr[0];
            if (f10 == 0.0f && f11 == 0.0f) {
                return;
            }
            int i2 = 0;
            while (true) {
                iArr = this.tmpWaveform;
                f3 = this.WAVE_RADIUS;
                if (i2 >= 3) {
                    break;
                }
                iArr[i2] = (int) (fArr[i2] * f3);
                i2++;
            }
            CircleBezierDrawable[] circleBezierDrawableArr = this.drawables;
            CircleBezierDrawable circleBezierDrawable = circleBezierDrawableArr[0];
            for (int i3 = 0; i3 < circleBezierDrawable.N; i3 += 2) {
                float f12 = iArr[i3 / 2];
                float[] fArr4 = circleBezierDrawable.randomAdditionals;
                fArr4[i3] = f12;
                fArr4[i3 + 1] = 0.0f;
            }
            for (int i4 = 0; i4 < 3; i4++) {
                iArr[i4] = (int) (fArr[i4 + 3] * f3);
            }
            CircleBezierDrawable circleBezierDrawable2 = circleBezierDrawableArr[1];
            for (int i5 = 0; i5 < circleBezierDrawable2.N; i5 += 2) {
                float f13 = iArr[i5 / 2];
                float[] fArr5 = circleBezierDrawable2.randomAdditionals;
                fArr5[i5] = f13;
                fArr5[i5 + 1] = 0.0f;
            }
            float fDp = (this.IDLE_RADIUS * f10) + (AndroidUtilities.dp(4.0f) * f11) + AndroidUtilities.dp(22.0f);
            if (fDp > AndroidUtilities.dp(26.0f)) {
                fDp = AndroidUtilities.dp(26.0f);
            }
            CircleBezierDrawable circleBezierDrawable3 = circleBezierDrawableArr[0];
            circleBezierDrawableArr[1].radius = fDp;
            circleBezierDrawable3.radius = fDp;
            canvas.save();
            float f14 = (float) (((double) this.rotation) + 0.6d);
            this.rotation = f14;
            canvas.rotate(f14, f, f2);
            canvas.save();
            float f15 = (this.idleScale * 0.04f) + 1.0f;
            canvas.scale(f15, f15, f, f2);
            CircleBezierDrawable circleBezierDrawable4 = circleBezierDrawableArr[0];
            Paint paint = this.p1;
            circleBezierDrawable4.draw(f, f2, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f, f2);
            float fM = DiffUtil.m(1.0f, this.idleScale, 0.04f, 1.0f);
            canvas.scale(fM, fM, f, f2);
            circleBezierDrawableArr[1].draw(f, f2, canvas, paint);
            canvas.restore();
        }
    }
}
