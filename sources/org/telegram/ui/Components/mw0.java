package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class mw0 {
    public final e0.i0 f26515a;
    public final Paint f26516b;
    public final Paint f26517c;
    public final Paint d;
    public int f26519g;
    public final int h;
    public final int f26520i;
    public Bitmap f26521j;
    public long f26522k;
    public int f26525n;
    public final Paint e = new Paint();
    public final int f26518f = org.telegram.ui.ActionBar.h6.A8;
    public final ArrayList f26523l = new ArrayList();
    public final ArrayList f26524m = new ArrayList();

    public mw0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f26520i = i11;
        Paint paint = new Paint(1);
        this.f26517c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26515a = new e0.i0(i11);
            this.f26516b = g0.a.a(a(true));
        } else {
            this.f26515a = null;
            this.f26516b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f26524m.add(new lw0(this));
        }
    }

    public static Bitmap a(boolean z10) {
        int dp;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        if (z10) {
            dp = AndroidUtilities.dp(20.0f);
        } else {
            dp = AndroidUtilities.dp(10.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(dp, AndroidUtilities.dp(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float dpf2 = AndroidUtilities.dpf2(2.0f) * 2.0f;
        float f7 = (-AndroidUtilities.dpf2(0.57f)) * 2.0f;
        float dpf22 = AndroidUtilities.dpf2(1.55f) * 2.0f;
        float dp2 = AndroidUtilities.dp(5.0f);
        float dp3 = AndroidUtilities.dp(5.0f);
        float f10 = -1.5707964f;
        int i10 = 0;
        while (i10 < 6) {
            double d = f10;
            float f11 = f10;
            float cos = ((float) Math.cos(d)) * dpf2;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * dpf2;
            float f12 = cos * 0.66f;
            float f13 = 0.66f * sin;
            canvas.drawLine(dp2, dp3, cos + dp2, sin + dp3, paint);
            float f14 = dp2;
            float f15 = dp3;
            double d10 = (float) (d - 1.5707963267948966d);
            double d11 = f7;
            double d12 = dpf22;
            float f16 = f14 + f12;
            float f17 = f15 + f13;
            canvas.drawLine(f16, f17, f14 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) hg.c.e(d10, d12, Math.sin(d10) * d11)) + f15, paint);
            canvas.drawLine(f16, f17, f14 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) hg.c.e(d10, d12, (-Math.sin(d10)) * d11)) + f15, paint);
            f10 = f11 + 1.0471976f;
            i10++;
            dp3 = f15;
            createBitmap = bitmap;
            dp2 = f14;
        }
        Bitmap bitmap2 = createBitmap;
        if (z10) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(5.0f), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        int i10;
        int i11;
        float nextFloat;
        lw0 lw0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            int i12 = this.f26520i;
            e0.i0 i0Var = this.f26515a;
            int i13 = 0;
            ArrayList arrayList = this.f26523l;
            if (i0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    lw0 lw0Var2 = (lw0) arrayList.get(i14);
                    float f7 = lw0Var2.f26187a;
                    float f10 = lw0Var2.f26188b;
                    int i15 = lw0Var2.f26193j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= lw0Var2.f26192i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    i0Var.e(i14, i0.a.k(this.f26525n, (int) (lw0Var2.f26190f * 255.0f)));
                    e0.i0.c((float[]) i0Var.f7772b, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.i0.c((float[]) i0Var.f7773c, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, i0Var, min, this.f26516b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    lw0 lw0Var3 = (lw0) arrayList.get(i16);
                    mw0 mw0Var = lw0Var3.f26194k;
                    Paint paint = mw0Var.f26517c;
                    if (lw0Var3.f26193j != 0) {
                        Bitmap bitmap = mw0Var.f26521j;
                        Paint paint2 = mw0Var.e;
                        if (bitmap == null) {
                            mw0Var.f26521j = a(false);
                        }
                        paint2.setAlpha((int) (lw0Var3.f26190f * 255.0f));
                        canvas.save();
                        float f14 = lw0Var3.f26192i;
                        canvas.scale(f14, f14, lw0Var3.f26187a, lw0Var3.f26188b);
                        canvas.drawBitmap(mw0Var.f26521j, lw0Var3.f26187a, lw0Var3.f26188b, paint2);
                        canvas.restore();
                    } else {
                        paint.setAlpha((int) (lw0Var3.f26190f * 255.0f));
                        canvas.drawPoint(lw0Var3.f26187a, lw0Var3.f26188b, paint);
                    }
                }
            }
            int i17 = this.h;
            if (i17 == 0) {
                i10 = 1;
            } else {
                i10 = 10;
            }
            int size2 = arrayList.size();
            int i18 = 40;
            ArrayList arrayList2 = this.f26524m;
            if (size2 < i12) {
                int i19 = 0;
                while (i19 < i10) {
                    if (arrayList.size() < i12 && Utilities.random.nextFloat() > 0.7f) {
                        int i20 = AndroidUtilities.statusBarHeight;
                        float nextFloat2 = Utilities.random.nextFloat() * view.getMeasuredWidth();
                        if (i17 == 0) {
                            nextFloat = (Utilities.random.nextFloat() * org.telegram.messenger.f0.B(20.0f, view.getMeasuredHeight(), i20)) + i20;
                        } else {
                            nextFloat = Utilities.random.nextFloat() * view.getMeasuredHeight();
                        }
                        double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                        i11 = i12;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (!arrayList2.isEmpty()) {
                            lw0Var = (lw0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            lw0Var = new lw0(this);
                        }
                        lw0Var.f26187a = nextFloat2;
                        lw0Var.f26188b = nextFloat;
                        lw0Var.f26189c = cos;
                        lw0Var.d = sin;
                        lw0Var.f26190f = 0.0f;
                        lw0Var.h = 0.0f;
                        lw0Var.f26192i = Utilities.random.nextFloat() * 1.2f;
                        lw0Var.f26193j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            lw0Var.f26191g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            lw0Var.f26191g = Utilities.random.nextInt(2000) + 3000;
                        }
                        lw0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(lw0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f26522k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                lw0 lw0Var4 = (lw0) arrayList.get(i13);
                float f15 = lw0Var4.h;
                float f16 = lw0Var4.f26191g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(lw0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            lw0Var4.f26190f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            lw0Var4.f26190f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        lw0Var4.f26190f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            lw0Var4.f26190f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = lw0Var4.f26187a;
                    float f19 = lw0Var4.f26189c;
                    float f20 = lw0Var4.e;
                    float f21 = (float) min2;
                    lw0Var4.f26187a = a4.a.B(f19 * f20, f21, 500.0f, f18);
                    lw0Var4.f26188b = (((lw0Var4.d * f20) * f21) / 500.0f) + lw0Var4.f26188b;
                    lw0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f26522k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f26519g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.h6.w0(null, this.f26518f, false) & (-1644826);
        }
        if (this.f26525n != i10) {
            this.f26525n = i10;
            this.f26517c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
