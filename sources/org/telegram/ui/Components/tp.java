package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

public abstract class tp extends Drawable {

    public final Paint f32848a;

    public long f32849b;

    public final RectF f32850c;
    public float d;

    public boolean f32851e;

    public int f32852f;

    public int f32853g;

    public tp() {
        this(2.0f);
    }

    public abstract int a();

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float fA;
        float fA2;
        float fA3;
        float f11;
        Paint paint;
        float f12;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = a();
        Paint paint2 = this.f32848a;
        if (iA != 0) {
            this.f32853g = Color.alpha(iA);
            paint2.setColor(i0.b.k(iA, 255));
        }
        long j10 = this.f32849b;
        if (j10 != 0) {
            long j11 = jCurrentTimeMillis - j10;
            boolean z10 = this.f32851e;
            if (z10 || this.d != 0.0f) {
                float f13 = ((j11 * 360) / 500.0f) + this.d;
                this.d = f13;
                if (z10 || f13 < 720.0f) {
                    this.d = f13 - (((int) (f13 / 720.0f)) * 720);
                } else {
                    this.d = 0.0f;
                }
                invalidateSelf();
            }
        }
        if (this.f32853g == 255 || getBounds() == null || getBounds().isEmpty()) {
            canvas2 = canvas;
            canvas2.save();
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.f32853g, 31);
        }
        canvas2.translate(AndroidUtilities.dp(24.0f) / 2, AndroidUtilities.dp(24.0f) / 2);
        canvas2.rotate(-45.0f);
        float f14 = this.d;
        if (f14 < 0.0f || f14 >= 90.0f) {
            if (f14 < 90.0f || f14 >= 180.0f) {
                if (f14 < 180.0f || f14 >= 270.0f) {
                    if (f14 >= 270.0f && f14 < 360.0f) {
                        fA3 = (f14 - 270.0f) / 90.0f;
                    } else if (f14 < 360.0f || f14 >= 450.0f) {
                        if (f14 >= 450.0f && f14 < 540.0f) {
                            f10 = (f14 - 450.0f) / 90.0f;
                            fA2 = 0.0f;
                        } else if (f14 >= 540.0f && f14 < 630.0f) {
                            fA2 = (f14 - 540.0f) / 90.0f;
                            f10 = 1.0f;
                        } else if (f14 < 630.0f || f14 >= 720.0f) {
                            f10 = 1.0f;
                        } else {
                            fA = (f14 - 630.0f) / 90.0f;
                            f10 = 1.0f;
                            fA2 = 1.0f;
                        }
                        fA = 0.0f;
                    } else {
                        fA3 = org.telegram.messenger.y1.a(f14, 360.0f, 90.0f, 1.0f);
                    }
                    f11 = fA3;
                    f10 = 0.0f;
                    fA2 = 0.0f;
                    fA = 0.0f;
                } else {
                    fA = org.telegram.messenger.y1.a(f14, 180.0f, 90.0f, 1.0f);
                    f10 = 0.0f;
                    fA2 = 0.0f;
                }
                f11 = 0.0f;
            } else {
                fA2 = org.telegram.messenger.y1.a(f14, 90.0f, 90.0f, 1.0f);
                f10 = 0.0f;
                fA = 1.0f;
                f11 = 0.0f;
            }
            if (f10 != 0.0f) {
                paint = paint2;
                canvas2.drawLine(0.0f, 0.0f, 0.0f, this.f32852f * f10, paint);
            } else {
                paint = paint2;
            }
            if (fA2 != 0.0f) {
                canvas.drawLine((-this.f32852f) * fA2, 0.0f, 0.0f, 0.0f, paint);
            }
            if (fA != 0.0f) {
                canvas.drawLine(0.0f, (-this.f32852f) * fA, 0.0f, 0.0f, paint);
            }
            if (f11 != 1.0f) {
                float f15 = this.f32852f;
                canvas.drawLine(f15 * f11, 0.0f, f15, 0.0f, paint);
            }
            canvas.restore();
            int iCenterX = getBounds().centerX();
            int iCenterY = getBounds().centerY();
            int i10 = this.f32852f;
            float f16 = iCenterX - i10;
            float f17 = iCenterY - i10;
            float f18 = iCenterX + i10;
            float f19 = iCenterY + i10;
            RectF rectF = this.f32850c;
            rectF.set(f16, f17, f18, f19);
            f12 = this.d;
            float f20 = (f12 >= 360.0f ? f12 - 360.0f : 0.0f) - 45.0f;
            if (f12 >= 360.0f) {
                f12 = 720.0f - f12;
            }
            canvas.drawArc(rectF, f20, f12, false, paint);
            this.f32849b = jCurrentTimeMillis;
        }
        f10 = 1.0f - (f14 / 90.0f);
        fA2 = 1.0f;
        fA = 1.0f;
        f11 = 0.0f;
        if (f10 != 0.0f) {
            paint = paint2;
            canvas2.drawLine(0.0f, 0.0f, 0.0f, this.f32852f * f10, paint);
        } else {
            paint = paint2;
        }
        if (fA2 != 0.0f) {
            canvas.drawLine((-this.f32852f) * fA2, 0.0f, 0.0f, 0.0f, paint);
        }
        if (fA != 0.0f) {
            canvas.drawLine(0.0f, (-this.f32852f) * fA, 0.0f, 0.0f, paint);
        }
        if (f11 != 1.0f) {
            float f110 = this.f32852f;
            canvas.drawLine(f110 * f11, 0.0f, f110, 0.0f, paint);
        }
        canvas.restore();
        int iCenterX2 = getBounds().centerX();
        int iCenterY2 = getBounds().centerY();
        int i11 = this.f32852f;
        float f111 = iCenterX2 - i11;
        float f112 = iCenterY2 - i11;
        float f113 = iCenterX2 + i11;
        float f114 = iCenterY2 + i11;
        RectF rectF2 = this.f32850c;
        rectF2.set(f111, f112, f113, f114);
        f12 = this.d;
        float f21 = (f12 >= 360.0f ? f12 - 360.0f : 0.0f) - 45.0f;
        if (f12 >= 360.0f) {
            f12 = 720.0f - f12;
        }
        canvas.drawArc(rectF2, f21, f12, false, paint);
        this.f32849b = jCurrentTimeMillis;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public tp(float f10) {
        Paint paint = new Paint(1);
        this.f32848a = paint;
        new DecelerateInterpolator();
        this.f32850c = new RectF();
        this.f32853g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(f10));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f32852f = AndroidUtilities.dp(8.0f);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
