package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class br extends Drawable {

    public final Drawable f27194a;

    public final RectF f27195b = new RectF();

    public final Paint f27196c;
    public final Paint d;

    public int f27197e;

    public final int f27198f;

    public float f27199g;
    public boolean h;

    public float f27200i;

    public float f27201j;

    public float f27202k;

    public br(Context context, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f27196c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f27194a = context.getDrawable(i10);
        this.f27198f = i11;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            if (z11) {
                this.f27199g = z10 ? 0.0f : 1.0f;
            } else {
                this.f27199g = z10 ? 1.0f : 0.0f;
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        boolean z10 = this.h;
        if (z10) {
            float f11 = this.f27199g;
            if (f11 != 1.0f) {
                this.f27199g = f11 + 0.10666667f;
                invalidateSelf();
                if (this.f27199g > 1.0f) {
                    this.f27199g = 1.0f;
                }
            } else if (!z10) {
                f10 = this.f27199g;
                if (f10 != 0.0f) {
                    this.f27199g = f10 - 0.10666667f;
                    invalidateSelf();
                    if (this.f27199g < 0.0f) {
                        this.f27199g = 0.0f;
                    }
                }
            }
        } else if (!z10) {
            f10 = this.f27199g;
            if (f10 != 0.0f) {
                this.f27199g = f10 - 0.10666667f;
                invalidateSelf();
                if (this.f27199g < 0.0f) {
                    this.f27199g = 0.0f;
                }
            }
        }
        int i10 = this.f27198f;
        int iW0 = i10 < 0 ? -1 : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int i11 = this.f27197e;
        Drawable drawable = this.f27194a;
        Paint paint = this.f27196c;
        if (i11 != iW0) {
            this.f27197e = iW0;
            paint.setColor(iW0);
            drawable.setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.MULTIPLY));
        }
        if (this.f27199g == 0.0f) {
            drawable.draw(canvas);
            return;
        }
        Rect bounds = drawable.getBounds();
        RectF rectF = this.f27195b;
        rectF.set(bounds);
        canvas.saveLayerAlpha(rectF, 255, 31);
        drawable.draw(canvas);
        float fDpf2 = AndroidUtilities.dpf2(4.5f) + rectF.left + this.f27200i + this.f27201j;
        float fDpf3 = ((AndroidUtilities.dpf2(4.5f) + rectF.top) - AndroidUtilities.dp(1.0f)) + this.f27201j;
        float fDp = ((rectF.right - AndroidUtilities.dp(3.0f)) + this.f27200i) - this.f27202k;
        float fDp2 = ((rectF.bottom - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(3.0f)) - this.f27202k;
        if (this.h) {
            float f12 = this.f27199g;
            fDp = ((fDp - fDpf2) * f12) + fDpf2;
            fDp2 = com.google.android.recaptcha.internal.a.z(fDp2, fDpf3, f12, fDpf3);
        } else {
            float f13 = this.f27199g;
            fDpf2 = com.google.android.recaptcha.internal.a.z(1.0f, f13, fDp - fDpf2, fDpf2);
            fDpf3 = com.google.android.recaptcha.internal.a.z(1.0f, f13, fDp2 - fDpf3, fDpf3);
        }
        float f14 = fDp2;
        float f15 = fDpf3;
        float f16 = fDp;
        float f17 = fDpf2;
        float strokeWidth = f15 - paint.getStrokeWidth();
        float strokeWidth2 = f14 - paint.getStrokeWidth();
        Paint paint2 = this.d;
        canvas.drawLine(f17, strokeWidth, f16, strokeWidth2, paint2);
        float strokeWidth3 = ((paint2.getStrokeWidth() - paint.getStrokeWidth()) / 2.0f) + 1.0f;
        canvas.drawLine(f17, f15 - strokeWidth3, f16, f14 - strokeWidth3, paint2);
        canvas.drawLine(f17, f15, f16, f14, paint);
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f27194a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27194a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f27194a.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
