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
public final class lc0 extends Drawable {
    public final int f28713a = 0;
    public final Paint f28714b;
    public final Paint f28715c;
    public final Paint d;
    public final Path f28716e;
    public boolean f28717f;
    public final Object f28718g;

    public lc0() {
        Path path = new Path();
        this.f28716e = path;
        Paint paint = new Paint(1);
        this.f28714b = paint;
        Paint paint2 = new Paint(1);
        this.f28715c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f28718g = new z5(new ec0(this, 1), 320L, pr.h, 0);
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
        switch (this.f28713a) {
            case 0:
                float dpf2 = AndroidUtilities.dpf2(1.66f);
                Paint paint = this.f28714b;
                paint.setStrokeWidth(dpf2);
                float dpf22 = AndroidUtilities.dpf2(3.32f);
                Paint paint2 = this.d;
                paint2.setStrokeWidth(dpf22);
                float e6 = ((z5) this.f28718g).e(this.f28717f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float dpf23 = AndroidUtilities.dpf2(10.66f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(centerX - dpf23, centerY - dpf23, centerX + dpf23, dpf23 + centerY);
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.33f), AndroidUtilities.dpf2(8.33f), paint);
                int i10 = (e6 > 0.0f ? 1 : (e6 == 0.0f ? 0 : -1));
                if (i10 > 0) {
                    canvas.saveLayerAlpha(rectF, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(1.0f) + centerX, centerY - AndroidUtilities.dpf2(0.5f));
                canvas.drawPath(this.f28716e, this.f28715c);
                canvas.restore();
                if (i10 > 0) {
                    if (this.f28717f) {
                        canvas.drawLine(centerX - AndroidUtilities.dpf2(8.33f), centerY - AndroidUtilities.dpf2(8.33f), (centerX - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * e6), (centerY - AndroidUtilities.dpf2(8.33f)) + (AndroidUtilities.dpf2(16.66f) * e6), paint2);
                        canvas.drawLine(centerX - AndroidUtilities.dpf2(8.33f), centerY - AndroidUtilities.dpf2(8.33f), (AndroidUtilities.dpf2(16.66f) * e6) + (centerX - AndroidUtilities.dpf2(8.33f)), (AndroidUtilities.dpf2(16.66f) * e6) + (centerY - AndroidUtilities.dpf2(8.33f)), paint);
                    } else {
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + centerX, AndroidUtilities.dpf2(8.33f) + centerY, (AndroidUtilities.dpf2(8.33f) + centerX) - (AndroidUtilities.dpf2(16.66f) * e6), (AndroidUtilities.dpf2(8.33f) + centerY) - (AndroidUtilities.dpf2(16.66f) * e6), paint2);
                        canvas.drawLine(AndroidUtilities.dpf2(8.33f) + centerX, AndroidUtilities.dpf2(8.33f) + centerY, (AndroidUtilities.dpf2(8.33f) + centerX) - (AndroidUtilities.dpf2(16.66f) * e6), (AndroidUtilities.dpf2(8.33f) + centerY) - (AndroidUtilities.dpf2(16.66f) * e6), paint);
                    }
                }
                canvas.restore();
                return;
            default:
                boolean z4 = this.f28717f;
                if (z4) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.f28716e, this.f28714b);
                if (z4) {
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.f28715c);
                    canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.d);
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f28713a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return AndroidUtilities.dp(32.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f28713a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return AndroidUtilities.dp(32.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f28713a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28713a) {
            case 0:
                this.f28714b.setAlpha(i10);
                this.f28715c.setAlpha(i10);
                return;
            default:
                this.f28714b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f28713a) {
            case 0:
                this.f28715c.setColorFilter(colorFilter);
                this.f28714b.setColorFilter(colorFilter);
                return;
            default:
                this.f28714b.setColorFilter(colorFilter);
                return;
        }
    }

    public lc0(qh.r rVar, boolean z4) {
        qh.r rVar2 = rVar;
        Paint paint = new Paint(1);
        this.f28714b = paint;
        this.f28715c = new Paint(1);
        this.d = new Paint(1);
        Path path = new Path();
        this.f28716e = path;
        this.f28718g = new float[8];
        this.f28717f = z4;
        paint.setColor(-1);
        float dpf2 = AndroidUtilities.dpf2(13.333333f);
        float dpf22 = AndroidUtilities.dpf2(18.666666f);
        float dpf23 = AndroidUtilities.dpf2(3.0f);
        float dpf24 = AndroidUtilities.dpf2(10.0f);
        float dpf25 = AndroidUtilities.dpf2(15.333333f);
        float dpf26 = AndroidUtilities.dpf2(1.0f);
        float dpf27 = AndroidUtilities.dpf2(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((-dpf2) / 2.0f, (-dpf22) / 2.0f, dpf2 / 2.0f, dpf22 / 2.0f);
        path.addRoundRect(rectF, dpf23, dpf23, Path.Direction.CW);
        ArrayList arrayList = rVar2.f45974e;
        int i10 = rVar2.f45973c;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            int i13 = i12 + 1;
            qh.q qVar = (qh.q) obj;
            int[] iArr = rVar2.d;
            int i14 = qVar.f45907c;
            int i15 = qVar.f45906b;
            int i16 = iArr[i14];
            int i17 = i16 - 1;
            float max = (dpf24 - (Math.max(i11, i17) * dpf27)) / i16;
            int i18 = i10 - 1;
            float max2 = (dpf25 - (Math.max(i11, i18) * dpf27)) / i10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            ArrayList arrayList2 = arrayList;
            float f10 = (-dpf24) / 2.0f;
            int i19 = i10;
            float f11 = i15;
            float f12 = f11 * dpf27;
            int i20 = size;
            float f13 = (-dpf25) / 2.0f;
            float f14 = dpf24;
            float f15 = i14;
            float f16 = f15 * dpf27;
            float f17 = dpf25;
            float f18 = dpf26;
            rectF2.set(f12 + (max * f11) + f10, f16 + (max2 * f15) + f13, e2.c.A(max, i15 + 1, f10, f12), e2.c.A(max2, i14 + 1, f13, f16));
            float[] fArr = (float[]) this.f28718g;
            float f19 = 0.0f;
            float f20 = (i15 == 0 && i14 == 0) ? f18 : 0.0f;
            fArr[1] = f20;
            fArr[0] = f20;
            float f21 = (i15 == i17 && i14 == 0) ? f18 : 0.0f;
            fArr[3] = f21;
            fArr[2] = f21;
            float f22 = (i15 == i17 && i14 == i18) ? f18 : 0.0f;
            fArr[5] = f22;
            fArr[4] = f22;
            if (i15 == 0 && i14 == i18) {
                f19 = f18;
            }
            fArr[7] = f19;
            fArr[6] = f19;
            this.f28716e.addRoundRect(rectF2, fArr, Path.Direction.CW);
            rVar2 = rVar;
            arrayList = arrayList2;
            i10 = i19;
            i12 = i13;
            size = i20;
            dpf24 = f14;
            dpf26 = f18;
            dpf25 = f17;
            i11 = 0;
        }
        Paint paint2 = this.f28715c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f28715c.setStrokeWidth(AndroidUtilities.dp(3.33f));
        this.f28715c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d.setStyle(style);
        this.d.setStrokeWidth(AndroidUtilities.dp(1.33f));
        this.d.setColor(-1);
        this.d.setStrokeCap(Paint.Cap.ROUND);
        this.d.setStrokeJoin(Paint.Join.ROUND);
    }
}
