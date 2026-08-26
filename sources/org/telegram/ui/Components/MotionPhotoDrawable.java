package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Stories.recorder.CollageLayout;

public final class MotionPhotoDrawable extends Drawable {
    public final int $r8$classId = 0;
    public final Object animatedDisabled;
    public final Paint clearPaint;
    public boolean disabled;
    public final Path play;
    public final Paint playPaint;
    public final Paint strokePaint;

    public MotionPhotoDrawable() {
        Path path = new Path();
        this.play = path;
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        Paint paint2 = new Paint(1);
        this.playPaint = paint2;
        Paint paint3 = new Paint(1);
        this.clearPaint = paint3;
        this.animatedDisabled = new AnimatedFloat(new HintView$1$$ExternalSyntheticLambda0(this, 23), 320L, CubicBezierInterpolator.EASE_OUT_QUINT, 0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.0f)));
        paint2.setColor(-1);
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-AndroidUtilities.dpf2(3.75f), -AndroidUtilities.dpf2(5.4166f));
        path.lineTo(AndroidUtilities.dpf2(3.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dpf2(3.75f), AndroidUtilities.dpf2(5.4166f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.$r8$classId) {
            case 0:
                Paint paint = this.strokePaint;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
                Paint paint2 = this.clearPaint;
                paint2.setStrokeWidth(AndroidUtilities.dpf2(3.32f));
                float f = ((AnimatedFloat) this.animatedDisabled).set(this.disabled);
                float fCenterX = getBounds().centerX();
                float fCenterY = getBounds().centerY();
                float fDpf2 = AndroidUtilities.dpf2(10.66f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(fCenterX - fDpf2, fCenterY - fDpf2, fCenterX + fDpf2, fDpf2 + fCenterY);
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.33f), AndroidUtilities.dpf2(8.33f), paint);
                if (f > 0.0f) {
                    canvas.saveLayerAlpha(rectF, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(1.0f) + fCenterX, fCenterY - AndroidUtilities.dpf2(0.5f));
                canvas.drawPath(this.play, this.playPaint);
                canvas.restore();
                if (f > 0.0f) {
                    if (this.disabled) {
                        canvas.drawLine(fCenterX - AndroidUtilities.dpf2(8.33f), fCenterY - AndroidUtilities.dpf2(8.33f), (fCenterX - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * f), (fCenterY - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * f), paint2);
                        canvas.drawLine(fCenterX - AndroidUtilities.dpf2(8.33f), fCenterY - AndroidUtilities.dpf2(8.33f), (AndroidUtilities.dpf2(16.66f) * f) + (fCenterX - AndroidUtilities.dpf2(8.33f)), (AndroidUtilities.dpf2(16.66f) * f) + (fCenterY - AndroidUtilities.dpf2(8.33f)), paint);
                    } else {
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + fCenterX, AndroidUtilities.dpf2(8.33f) + fCenterY, (AndroidUtilities.dpf2(8.33f) + fCenterX) - (AndroidUtilities.dpf2(16.66f) * f), (AndroidUtilities.dpf2(8.33f) + fCenterY) - (AndroidUtilities.dpf2(16.66f) * f), paint2);
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + fCenterX, AndroidUtilities.dpf2(8.33f) + fCenterY, (AndroidUtilities.dpf2(8.33f) + fCenterX) - (AndroidUtilities.dpf2(16.66f) * f), (AndroidUtilities.dpf2(8.33f) + fCenterY) - (AndroidUtilities.dpf2(16.66f) * f), paint);
                    }
                }
                canvas.restore();
                break;
            default:
                boolean z = this.disabled;
                if (z) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.play, this.strokePaint);
                if (z) {
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.playPaint);
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.clearPaint);
                }
                canvas.restore();
                break;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.$r8$classId) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return AndroidUtilities.dp(32.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.$r8$classId) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return AndroidUtilities.dp(32.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.$r8$classId) {
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.$r8$classId) {
            case 0:
                this.strokePaint.setAlpha(i);
                this.playPaint.setAlpha(i);
                break;
            default:
                this.strokePaint.setAlpha(i);
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.$r8$classId) {
            case 0:
                this.playPaint.setColorFilter(colorFilter);
                this.strokePaint.setColorFilter(colorFilter);
                break;
            default:
                this.strokePaint.setColorFilter(colorFilter);
                break;
        }
    }

    public MotionPhotoDrawable(CollageLayout collageLayout, boolean z) {
        CollageLayout collageLayout2 = collageLayout;
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        this.playPaint = new Paint(1);
        this.clearPaint = new Paint(1);
        Path path = new Path();
        this.play = path;
        this.animatedDisabled = new float[8];
        this.disabled = z;
        paint.setColor(-1);
        float fDpf2 = AndroidUtilities.dpf2(13.333333f);
        float fDpf3 = AndroidUtilities.dpf2(18.666666f);
        float fDpf4 = AndroidUtilities.dpf2(3.0f);
        float fDpf5 = AndroidUtilities.dpf2(10.0f);
        float fDpf6 = AndroidUtilities.dpf2(15.333333f);
        float fDpf7 = AndroidUtilities.dpf2(1.0f);
        float fDpf8 = AndroidUtilities.dpf2(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((-fDpf2) / 2.0f, (-fDpf3) / 2.0f, fDpf2 / 2.0f, fDpf3 / 2.0f);
        path.addRoundRect(rectF, fDpf4, fDpf4, Path.Direction.CW);
        ArrayList arrayList = collageLayout2.parts;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            int i3 = i2 + 1;
            CollageLayout.Part part = (CollageLayout.Part) obj;
            int i4 = collageLayout2.columns[part.y];
            int i5 = i4 - 1;
            float fMax = (fDpf5 - (Math.max(i, i5) * fDpf8)) / i4;
            int i6 = collageLayout2.h;
            int i7 = i6 - 1;
            float fMax2 = (fDpf6 - (Math.max(i, i7) * fDpf8)) / i6;
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f = (-fDpf5) / 2.0f;
            int i8 = part.x;
            ArrayList arrayList2 = arrayList;
            float f2 = i8;
            float f3 = (fMax * f2) + f;
            float f4 = f2 * fDpf8;
            int i9 = size;
            float f5 = (-fDpf6) / 2.0f;
            int i10 = part.y;
            float f6 = fDpf5;
            float f7 = i10;
            float f8 = (fMax2 * f7) + f5;
            float f9 = f7 * fDpf8;
            float f10 = fDpf6;
            float f11 = f9 + f8;
            float f12 = fDpf7;
            rectF2.set(f4 + f3, f11, OKLCH.m(fMax, i8 + 1, f, f4), OKLCH.m(fMax2, i10 + 1, f5, f9));
            float[] fArr = (float[]) this.animatedDisabled;
            float f13 = 0.0f;
            float f14 = (i8 == 0 && i10 == 0) ? f12 : 0.0f;
            fArr[1] = f14;
            fArr[0] = f14;
            float f15 = (i8 == i5 && i10 == 0) ? f12 : 0.0f;
            fArr[3] = f15;
            fArr[2] = f15;
            float f16 = (i8 == i5 && i10 == i7) ? f12 : 0.0f;
            fArr[5] = f16;
            fArr[4] = f16;
            if (i8 == 0 && i10 == i7) {
                f13 = f12;
            }
            fArr[7] = f13;
            fArr[6] = f13;
            this.play.addRoundRect(rectF2, fArr, Path.Direction.CW);
            collageLayout2 = collageLayout;
            arrayList = arrayList2;
            i2 = i3;
            size = i9;
            fDpf5 = f6;
            fDpf7 = f12;
            fDpf6 = f10;
            i = 0;
        }
        Paint paint2 = this.playPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.playPaint.setStrokeWidth(AndroidUtilities.dp(3.33f));
        this.playPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clearPaint.setStyle(style);
        this.clearPaint.setStrokeWidth(AndroidUtilities.dp(1.33f));
        this.clearPaint.setColor(-1);
        this.clearPaint.setStrokeCap(Paint.Cap.ROUND);
        this.clearPaint.setStrokeJoin(Paint.Join.ROUND);
    }
}
