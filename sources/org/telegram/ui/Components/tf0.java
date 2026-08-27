package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;

public final class tf0 extends Drawable {

    public final Paint f32762a;

    public final int f32763b;

    public boolean f32764c;
    public float d;

    public long f32765e;

    public View f32766f;

    public int f32767g = 255;
    public float h = 300.0f;

    public tf0(int i10) {
        this.f32763b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f32762a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f32764c != z10) {
            this.f32764c = z10;
            if (!z11) {
                this.d = z10 ? 1.0f : 0.0f;
            }
            this.f32765e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        View view;
        Canvas canvas2;
        float interpolation;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j10 = jCurrentAnimationTimeMillis - this.f32765e;
        this.f32765e = jCurrentAnimationTimeMillis;
        if (j10 > 18) {
            j10 = 16;
        }
        boolean z10 = this.f32764c;
        if (z10) {
            float f12 = this.d;
            if (f12 < 1.0f) {
                float f13 = (j10 / this.h) + f12;
                this.d = f13;
                if (f13 >= 1.0f) {
                    this.d = 1.0f;
                } else {
                    View view2 = this.f32766f;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    invalidateSelf();
                }
            } else if (!z10) {
                f10 = this.d;
                if (f10 > 0.0f) {
                    f11 = f10 - (j10 / this.h);
                    this.d = f11;
                    if (f11 <= 0.0f) {
                        this.d = 0.0f;
                    } else {
                        view = this.f32766f;
                        if (view != null) {
                            view.invalidate();
                        }
                        invalidateSelf();
                    }
                }
            }
        } else if (!z10) {
            f10 = this.d;
            if (f10 > 0.0f) {
                f11 = f10 - (j10 / this.h);
                this.d = f11;
                if (f11 <= 0.0f) {
                    this.d = 0.0f;
                } else {
                    view = this.f32766f;
                    if (view != null) {
                        view.invalidate();
                    }
                    invalidateSelf();
                }
            }
        }
        Rect bounds = getBounds();
        int i10 = this.f32767g;
        if (i10 == 255) {
            canvas.save();
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10, 31);
        }
        canvas2.translate(com.google.android.recaptcha.internal.a.z(1.0f, this.d, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
        float f14 = this.d * 500.0f;
        if (f14 < 100.0f) {
            interpolation = er.f28125j.getInterpolation(f14 / 100.0f) * (-5.0f);
        } else {
            interpolation = f14 < 484.0f ? (er.f28125j.getInterpolation((f14 - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
        }
        int i11 = this.f32763b;
        canvas2.scale((i11 * 1.45f) / AndroidUtilities.dp(28.0f), (i11 * 1.5f) / AndroidUtilities.dp(28.0f));
        canvas2.rotate(interpolation);
        kd0 kd0Var = org.telegram.ui.ActionBar.g6.f23403x3;
        if (kd0Var != null) {
            Paint paint = this.f32762a;
            kd0Var.b(canvas2, paint, f14);
            canvas2.scale(1.0f, -1.0f);
            org.telegram.ui.ActionBar.g6.f23403x3.b(canvas2, paint, f14);
        }
        canvas2.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f32763b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f32763b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32767g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32762a.setColorFilter(colorFilter);
    }
}
