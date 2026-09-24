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
public final class lw0 {
    public final e0.i0 f26196a;
    public final Paint f26197b;
    public final Paint f26198c;
    public final Paint d;
    public int f26200g;
    public final int h;
    public final int f26201i;
    public Bitmap f26202j;
    public long f26203k;
    public int f26206n;
    public final Paint e = new Paint();
    public final int f26199f = org.telegram.ui.ActionBar.h6.A8;
    public final ArrayList f26204l = new ArrayList();
    public final ArrayList f26205m = new ArrayList();

    public lw0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f26201i = i11;
        Paint paint = new Paint(1);
        this.f26198c = paint;
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
            this.f26196a = new e0.i0(i11);
            this.f26197b = g0.a.a(a(true));
        } else {
            this.f26196a = null;
            this.f26197b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f26205m.add(new kw0(this));
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
        kw0 kw0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            int i12 = this.f26201i;
            e0.i0 i0Var = this.f26196a;
            int i13 = 0;
            ArrayList arrayList = this.f26204l;
            if (i0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    kw0 kw0Var2 = (kw0) arrayList.get(i14);
                    float f7 = kw0Var2.f25888a;
                    float f10 = kw0Var2.f25889b;
                    int i15 = kw0Var2.f25894j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= kw0Var2.f25893i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    i0Var.e(i14, i0.a.k(this.f26206n, (int) (kw0Var2.f25891f * 255.0f)));
                    e0.i0.c((float[]) i0Var.f7772b, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.i0.c((float[]) i0Var.f7773c, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, i0Var, min, this.f26197b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    kw0 kw0Var3 = (kw0) arrayList.get(i16);
                    lw0 lw0Var = kw0Var3.f25895k;
                    Paint paint = lw0Var.f26198c;
                    if (kw0Var3.f25894j != 0) {
                        Bitmap bitmap = lw0Var.f26202j;
                        Paint paint2 = lw0Var.e;
                        if (bitmap == null) {
                            lw0Var.f26202j = a(false);
                        }
                        paint2.setAlpha((int) (kw0Var3.f25891f * 255.0f));
                        canvas.save();
                        float f14 = kw0Var3.f25893i;
                        canvas.scale(f14, f14, kw0Var3.f25888a, kw0Var3.f25889b);
                        canvas.drawBitmap(lw0Var.f26202j, kw0Var3.f25888a, kw0Var3.f25889b, paint2);
                        canvas.restore();
                    } else {
                        paint.setAlpha((int) (kw0Var3.f25891f * 255.0f));
                        canvas.drawPoint(kw0Var3.f25888a, kw0Var3.f25889b, paint);
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
            ArrayList arrayList2 = this.f26205m;
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
                            kw0Var = (kw0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            kw0Var = new kw0(this);
                        }
                        kw0Var.f25888a = nextFloat2;
                        kw0Var.f25889b = nextFloat;
                        kw0Var.f25890c = cos;
                        kw0Var.d = sin;
                        kw0Var.f25891f = 0.0f;
                        kw0Var.h = 0.0f;
                        kw0Var.f25893i = Utilities.random.nextFloat() * 1.2f;
                        kw0Var.f25894j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            kw0Var.f25892g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            kw0Var.f25892g = Utilities.random.nextInt(2000) + 3000;
                        }
                        kw0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(kw0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f26203k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                kw0 kw0Var4 = (kw0) arrayList.get(i13);
                float f15 = kw0Var4.h;
                float f16 = kw0Var4.f25892g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(kw0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            kw0Var4.f25891f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            kw0Var4.f25891f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        kw0Var4.f25891f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            kw0Var4.f25891f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = kw0Var4.f25888a;
                    float f19 = kw0Var4.f25890c;
                    float f20 = kw0Var4.e;
                    float f21 = (float) min2;
                    kw0Var4.f25888a = a4.a.B(f19 * f20, f21, 500.0f, f18);
                    kw0Var4.f25889b = (((kw0Var4.d * f20) * f21) / 500.0f) + kw0Var4.f25889b;
                    kw0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f26203k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f26200g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.h6.w0(null, this.f26199f, false) & (-1644826);
        }
        if (this.f26206n != i10) {
            this.f26206n = i10;
            this.f26198c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
