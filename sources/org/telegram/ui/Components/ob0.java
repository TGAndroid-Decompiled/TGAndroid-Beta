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
public final class ob0 extends Drawable {
    public final int f29024a = 0;
    public final Paint f29025b;
    public final Paint f29026c;
    public final Paint d;
    public final Path e;
    public boolean f29027f;
    public final Object f29028g;

    public ob0() {
        Path path = new Path();
        this.e = path;
        Paint paint = new Paint(1);
        this.f29025b = paint;
        Paint paint2 = new Paint(1);
        this.f29026c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f29028g = new t5(new eb0(this, 1), 320L, gr.h, 0);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.N(2.0f)));
        paint2.setColor(-1);
        paint3.setStyle(style);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        path.moveTo(-org.telegram.messenger.i0.N(3.75f), -org.telegram.messenger.i0.N(5.4166f));
        path.lineTo(org.telegram.messenger.i0.N(3.75f), 0.0f);
        path.lineTo(-org.telegram.messenger.i0.N(3.75f), org.telegram.messenger.i0.N(5.4166f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f29024a) {
            case 0:
                float N = org.telegram.messenger.i0.N(1.66f);
                Paint paint = this.f29025b;
                paint.setStrokeWidth(N);
                float N2 = org.telegram.messenger.i0.N(3.32f);
                Paint paint2 = this.d;
                paint2.setStrokeWidth(N2);
                float d = ((t5) this.f29028g).d(this.f29027f);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float N3 = org.telegram.messenger.i0.N(10.66f);
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(centerX - N3, centerY - N3, centerX + N3, N3 + centerY);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(8.33f), org.telegram.messenger.i0.N(8.33f), paint);
                int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
                if (i10 > 0) {
                    canvas.saveLayerAlpha(rectF, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.N(1.0f) + centerX, centerY - org.telegram.messenger.i0.N(0.5f));
                canvas.drawPath(this.e, this.f29026c);
                canvas.restore();
                if (i10 > 0) {
                    if (this.f29027f) {
                        canvas.drawLine(centerX - org.telegram.messenger.i0.N(8.33f), centerY - org.telegram.messenger.i0.N(8.33f), org.telegram.ui.Cells.f1.d(16.66f, d, centerX - org.telegram.messenger.i0.N(8.33f)), org.telegram.ui.Cells.f1.d(16.66f, d, centerY - org.telegram.messenger.i0.N(8.33f)), paint2);
                        canvas.drawLine(centerX - org.telegram.messenger.i0.N(8.33f), centerY - org.telegram.messenger.i0.N(8.33f), org.telegram.ui.Cells.f1.d(16.66f, d, centerX - org.telegram.messenger.i0.N(8.33f)), org.telegram.ui.Cells.f1.d(16.66f, d, centerY - org.telegram.messenger.i0.N(8.33f)), paint);
                    } else {
                        canvas.drawLine(org.telegram.messenger.i0.N(8.33f) + centerX, org.telegram.messenger.i0.N(8.33f) + centerY, (org.telegram.messenger.i0.N(8.33f) + centerX) - (org.telegram.messenger.i0.N(16.66f) * d), (org.telegram.messenger.i0.N(8.33f) + centerY) - (org.telegram.messenger.i0.N(16.66f) * d), paint2);
                        canvas.drawLine(org.telegram.messenger.i0.N(8.33f) + centerX, org.telegram.messenger.i0.N(8.33f) + centerY, (org.telegram.messenger.i0.N(8.33f) + centerX) - (org.telegram.messenger.i0.N(16.66f) * d), (org.telegram.messenger.i0.N(8.33f) + centerY) - (org.telegram.messenger.i0.N(16.66f) * d), paint);
                    }
                }
                canvas.restore();
                return;
            default:
                boolean z10 = this.f29027f;
                if (z10) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.drawPath(this.e, this.f29025b);
                if (z10) {
                    canvas.drawLine(-org.telegram.messenger.i0.L(8.66f), -org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(8.66f), this.f29026c);
                    canvas.drawLine(-org.telegram.messenger.i0.L(8.66f), -org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(8.66f), this.d);
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f29024a) {
            case 0:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return org.telegram.messenger.i0.L(32.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f29024a) {
            case 0:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return org.telegram.messenger.i0.L(32.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f29024a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f29024a) {
            case 0:
                this.f29025b.setAlpha(i10);
                this.f29026c.setAlpha(i10);
                return;
            default:
                this.f29025b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f29024a) {
            case 0:
                this.f29026c.setColorFilter(colorFilter);
                this.f29025b.setColorFilter(colorFilter);
                return;
            default:
                this.f29025b.setColorFilter(colorFilter);
                return;
        }
    }

    public ob0(vh.r rVar, boolean z10) {
        vh.r rVar2 = rVar;
        Paint paint = new Paint(1);
        this.f29025b = paint;
        this.f29026c = new Paint(1);
        this.d = new Paint(1);
        Path path = new Path();
        this.e = path;
        this.f29028g = new float[8];
        this.f29027f = z10;
        paint.setColor(-1);
        float N = org.telegram.messenger.i0.N(13.333333f);
        float N2 = org.telegram.messenger.i0.N(18.666666f);
        float N3 = org.telegram.messenger.i0.N(3.0f);
        float N4 = org.telegram.messenger.i0.N(10.0f);
        float N5 = org.telegram.messenger.i0.N(15.333333f);
        float N6 = org.telegram.messenger.i0.N(1.0f);
        float f7 = 1.33f;
        float N7 = org.telegram.messenger.i0.N(1.33f);
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF = org.telegram.messenger.i0.P;
        float f10 = 2.0f;
        rectF.set((-N) / 2.0f, (-N2) / 2.0f, N / 2.0f, N2 / 2.0f);
        path.addRoundRect(rectF, N3, N3, Path.Direction.CW);
        ArrayList arrayList = rVar2.e;
        int i10 = rVar2.f51798c;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            int i13 = i12 + 1;
            vh.q qVar = (vh.q) obj;
            int[] iArr = rVar2.d;
            float f11 = f7;
            int i14 = qVar.f51777c;
            int i15 = qVar.f51776b;
            int i16 = iArr[i14];
            float f12 = f10;
            int i17 = i16 - 1;
            float max = (N4 - (Math.max(i11, i17) * N7)) / i16;
            int i18 = i10 - 1;
            int i19 = i11;
            float max2 = (N5 - (Math.max(i11, i18) * N7)) / i10;
            RectF rectF2 = org.telegram.messenger.i0.P;
            ArrayList arrayList2 = arrayList;
            float f13 = (-N4) / f12;
            int i20 = i10;
            float f14 = i15;
            float f15 = f14 * N7;
            int i21 = size;
            float f16 = (-N5) / f12;
            float f17 = N4;
            float f18 = i14;
            float f19 = f18 * N7;
            float f20 = N5;
            float f21 = N6;
            rectF2.set(f15 + (max * f14) + f13, f19 + (max2 * f18) + f16, sc.e.d(max, i15 + 1, f13, f15), sc.e.d(max2, i14 + 1, f16, f19));
            float[] fArr = (float[]) this.f29028g;
            float f22 = 0.0f;
            float f23 = (i15 == 0 && i14 == 0) ? f21 : 0.0f;
            fArr[1] = f23;
            fArr[i19] = f23;
            float f24 = (i15 == i17 && i14 == 0) ? f21 : 0.0f;
            fArr[3] = f24;
            fArr[2] = f24;
            float f25 = (i15 == i17 && i14 == i18) ? f21 : 0.0f;
            fArr[5] = f25;
            fArr[4] = f25;
            if (i15 == 0 && i14 == i18) {
                f22 = f21;
            }
            fArr[7] = f22;
            fArr[6] = f22;
            this.e.addRoundRect(rectF2, fArr, Path.Direction.CW);
            rVar2 = rVar;
            f7 = f11;
            f10 = f12;
            i11 = i19;
            arrayList = arrayList2;
            i10 = i20;
            i12 = i13;
            size = i21;
            N4 = f17;
            N6 = f21;
            N5 = f20;
        }
        Paint paint2 = this.f29026c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f29026c.setStrokeWidth(org.telegram.messenger.i0.L(3.33f));
        this.f29026c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d.setStyle(style);
        this.d.setStrokeWidth(org.telegram.messenger.i0.L(f7));
        this.d.setColor(-1);
        this.d.setStrokeCap(Paint.Cap.ROUND);
        this.d.setStrokeJoin(Paint.Join.ROUND);
    }
}
