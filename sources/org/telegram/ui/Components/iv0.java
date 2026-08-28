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
public final class iv0 {
    public final e0.i0 f29529a;
    public final Paint f29530b;
    public final Paint f29531c;
    public final Paint d;
    public int f29534g;
    public final int h;
    public final int f29535i;
    public Bitmap f29536j;
    public long f29537k;
    public int f29540n;
    public final Paint f29532e = new Paint();
    public final int f29533f = org.telegram.ui.ActionBar.f6.A8;
    public final ArrayList f29538l = new ArrayList();
    public final ArrayList f29539m = new ArrayList();

    public iv0(int i9) {
        int i10;
        this.h = i9;
        if (i9 == 0) {
            i10 = 100;
        } else {
            i10 = 300;
        }
        this.f29535i = i10;
        Paint paint = new Paint(1);
        this.f29531c = paint;
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
            this.f29529a = new e0.i0(i10);
            this.f29530b = g0.a.a(a(true));
        } else {
            this.f29529a = null;
            this.f29530b = null;
        }
        c();
        for (int i11 = 0; i11 < 20; i11++) {
            this.f29539m.add(new hv0(this));
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
        float f10 = (-AndroidUtilities.dpf2(0.57f)) * 2.0f;
        float dpf22 = AndroidUtilities.dpf2(1.55f) * 2.0f;
        float dp2 = AndroidUtilities.dp(5.0f);
        float dp3 = AndroidUtilities.dp(5.0f);
        float f11 = -1.5707964f;
        int i9 = 0;
        while (i9 < 6) {
            double d = f11;
            float f12 = f11;
            float cos = ((float) Math.cos(d)) * dpf2;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * dpf2;
            float f13 = cos * 0.66f;
            float f14 = 0.66f * sin;
            canvas.drawLine(dp2, dp3, cos + dp2, sin + dp3, paint);
            float f15 = dp2;
            float f16 = dp3;
            double d9 = (float) (d - 1.5707963267948966d);
            double d10 = f10;
            double d11 = dpf22;
            float f17 = f15 + f13;
            float f18 = f16 + f14;
            canvas.drawLine(f17, f18, f15 + ((float) ((Math.cos(d9) * d10) - (Math.sin(d9) * d11))), ((float) j3.r0.b(d9, d11, Math.sin(d9) * d10)) + f16, paint);
            canvas.drawLine(f17, f18, f15 + ((float) (((-Math.cos(d9)) * d10) - (Math.sin(d9) * d11))), ((float) j3.r0.b(d9, d11, (-Math.sin(d9)) * d10)) + f16, paint);
            f11 = f12 + 1.0471976f;
            i9++;
            dp3 = f16;
            createBitmap = bitmap;
            dp2 = f15;
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
        int i9;
        int i10;
        float nextFloat;
        hv0 hv0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            int i11 = this.f29535i;
            e0.i0 i0Var = this.f29529a;
            int i12 = 0;
            ArrayList arrayList = this.f29538l;
            if (i0Var != null) {
                int min = Math.min(i11, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i13 = 0; i13 < min; i13++) {
                    hv0 hv0Var2 = (hv0) arrayList.get(i13);
                    float f10 = hv0Var2.f29196a;
                    float f11 = hv0Var2.f29197b;
                    int i14 = hv0Var2.f29203j;
                    float f12 = dp / 2.0f;
                    if (i14 != 0) {
                        f12 *= hv0Var2.f29202i;
                    }
                    float f13 = i14 == 0 ? dp : 0.0f;
                    i0Var.c(i13, i0.a.k(this.f29540n, (int) (hv0Var2.f29200f * 255.0f)));
                    e0.i0.a((float[]) i0Var.f4708b, i13, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                    float f14 = dp;
                    e0.i0.a((float[]) i0Var.f4709c, i13, f13, 0.0f, f13 + f14, f14);
                }
                g0.a.b(canvas, i0Var, min, this.f29530b);
            } else {
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    hv0 hv0Var3 = (hv0) arrayList.get(i15);
                    iv0 iv0Var = hv0Var3.f29204k;
                    Paint paint = iv0Var.f29531c;
                    if (hv0Var3.f29203j != 0) {
                        Bitmap bitmap = iv0Var.f29536j;
                        Paint paint2 = iv0Var.f29532e;
                        if (bitmap == null) {
                            iv0Var.f29536j = a(false);
                        }
                        paint2.setAlpha((int) (hv0Var3.f29200f * 255.0f));
                        canvas.save();
                        float f15 = hv0Var3.f29202i;
                        canvas.scale(f15, f15, hv0Var3.f29196a, hv0Var3.f29197b);
                        canvas.drawBitmap(iv0Var.f29536j, hv0Var3.f29196a, hv0Var3.f29197b, paint2);
                        canvas.restore();
                    } else {
                        paint.setAlpha((int) (hv0Var3.f29200f * 255.0f));
                        canvas.drawPoint(hv0Var3.f29196a, hv0Var3.f29197b, paint);
                    }
                }
            }
            int i16 = this.h;
            if (i16 == 0) {
                i9 = 1;
            } else {
                i9 = 10;
            }
            int size2 = arrayList.size();
            int i17 = 40;
            ArrayList arrayList2 = this.f29539m;
            if (size2 < i11) {
                int i18 = 0;
                while (i18 < i9) {
                    if (arrayList.size() < i11 && Utilities.random.nextFloat() > 0.7f) {
                        int i19 = AndroidUtilities.statusBarHeight;
                        float nextFloat2 = Utilities.random.nextFloat() * view.getMeasuredWidth();
                        if (i16 == 0) {
                            nextFloat = (Utilities.random.nextFloat() * org.telegram.messenger.l0.B(20.0f, view.getMeasuredHeight(), i19)) + i19;
                        } else {
                            nextFloat = Utilities.random.nextFloat() * view.getMeasuredHeight();
                        }
                        double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                        i10 = i11;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (!arrayList2.isEmpty()) {
                            hv0Var = (hv0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            hv0Var = new hv0(this);
                        }
                        hv0Var.f29196a = nextFloat2;
                        hv0Var.f29197b = nextFloat;
                        hv0Var.f29198c = cos;
                        hv0Var.d = sin;
                        hv0Var.f29200f = 0.0f;
                        hv0Var.h = 0.0f;
                        hv0Var.f29202i = Utilities.random.nextFloat() * 1.2f;
                        hv0Var.f29203j = Utilities.random.nextInt(2);
                        if (i16 == 0) {
                            hv0Var.f29201g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            hv0Var.f29201g = Utilities.random.nextInt(2000) + 3000;
                        }
                        hv0Var.f29199e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(hv0Var);
                    } else {
                        i10 = i11;
                    }
                    i18++;
                    i11 = i10;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f29537k);
            int size3 = arrayList.size();
            while (i12 < size3) {
                hv0 hv0Var4 = (hv0) arrayList.get(i12);
                float f16 = hv0Var4.h;
                float f17 = hv0Var4.f29201g;
                if (f16 >= f17) {
                    if (arrayList2.size() < i17) {
                        arrayList2.add(hv0Var4);
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    if (i16 == 0) {
                        if (f16 < 200.0f) {
                            hv0Var4.f29200f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                        } else {
                            hv0Var4.f29200f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f16 - 200.0f) / (f17 - 200.0f));
                        }
                    } else if (f16 < 200.0f) {
                        hv0Var4.f29200f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                    } else {
                        float f18 = f17 - f16;
                        if (f18 < 2000.0f) {
                            hv0Var4.f29200f = AndroidUtilities.decelerateInterpolator.getInterpolation(f18 / 2000.0f);
                        }
                    }
                    float f19 = hv0Var4.f29196a;
                    float f20 = hv0Var4.f29198c;
                    float f21 = hv0Var4.f29199e;
                    float f22 = (float) min2;
                    hv0Var4.f29196a = aa.d.d(f20 * f21, f22, 500.0f, f19);
                    hv0Var4.f29197b = (((hv0Var4.d * f21) * f22) / 500.0f) + hv0Var4.f29197b;
                    hv0Var4.h += f22;
                }
                i12++;
                i17 = 40;
            }
            this.f29537k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i9 = this.f29534g;
        if (i9 == 0) {
            i9 = org.telegram.ui.ActionBar.f6.w0(null, this.f29533f, false) & (-1644826);
        }
        if (this.f29540n != i9) {
            this.f29540n = i9;
            this.f29531c.setColor(i9);
            this.d.setColor(i9);
        }
    }
}
