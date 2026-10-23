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
public final class zw0 {
    public final e0.f0 f33345a;
    public final Paint f33346b;
    public final Paint f33347c;
    public final Paint d;
    public int f33349g;
    public final int h;
    public final int f33350i;
    public Bitmap f33351j;
    public long f33352k;
    public int f33355n;
    public final Paint e = new Paint();
    public final int f33348f = org.telegram.ui.ActionBar.k6.A8;
    public final ArrayList f33353l = new ArrayList();
    public final ArrayList f33354m = new ArrayList();

    public zw0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f33350i = i11;
        Paint paint = new Paint(1);
        this.f33347c = paint;
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
            this.f33345a = new e0.f0(i11);
            this.f33346b = g0.a.a(a(true));
        } else {
            this.f33345a = null;
            this.f33346b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f33354m.add(new yw0(this));
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
        float f10 = 5.0f;
        float dp2 = AndroidUtilities.dp(5.0f);
        float dp3 = AndroidUtilities.dp(5.0f);
        float f11 = -1.5707964f;
        int i10 = 0;
        while (i10 < 6) {
            double d = f11;
            float f12 = f10;
            float f13 = f11;
            float cos = ((float) Math.cos(d)) * dpf2;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * dpf2;
            float f14 = cos * 0.66f;
            float f15 = 0.66f * sin;
            canvas.drawLine(dp2, dp3, cos + dp2, sin + dp3, paint);
            float f16 = dp2;
            float f17 = dp3;
            double d10 = (float) (d - 1.5707963267948966d);
            double d11 = f7;
            double d12 = dpf22;
            float f18 = f16 + f14;
            float f19 = f17 + f15;
            canvas.drawLine(f18, f19, f16 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) i2.o1.f(d10, d12, Math.sin(d10) * d11)) + f17, paint);
            canvas.drawLine(f18, f19, f16 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) i2.o1.f(d10, d12, (-Math.sin(d10)) * d11)) + f17, paint);
            f11 = f13 + 1.0471976f;
            i10++;
            dp3 = f17;
            f10 = f12;
            createBitmap = bitmap;
            dp2 = f16;
        }
        Bitmap bitmap2 = createBitmap;
        float f20 = f10;
        if (z10) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(f20), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        int i10;
        int i11;
        float nextFloat;
        yw0 yw0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            c();
            int i12 = this.f33350i;
            e0.f0 f0Var = this.f33345a;
            int i13 = 0;
            ArrayList arrayList = this.f33353l;
            if (f0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    yw0 yw0Var2 = (yw0) arrayList.get(i14);
                    float f7 = yw0Var2.f33047a;
                    float f10 = yw0Var2.f33048b;
                    int i15 = yw0Var2.f33053j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= yw0Var2.f33052i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    f0Var.e(i14, i0.a.o(this.f33355n, (int) (yw0Var2.f33050f * 255.0f)));
                    e0.f0.c((float[]) f0Var.f8103c, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.f0.c((float[]) f0Var.d, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, f0Var, min, this.f33346b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    yw0 yw0Var3 = (yw0) arrayList.get(i16);
                    zw0 zw0Var = yw0Var3.f33054k;
                    if (yw0Var3.f33053j != 0) {
                        Bitmap bitmap = zw0Var.f33351j;
                        Paint paint = zw0Var.e;
                        if (bitmap == null) {
                            zw0Var.f33351j = a(false);
                        }
                        paint.setAlpha((int) (yw0Var3.f33050f * 255.0f));
                        canvas.save();
                        float f14 = yw0Var3.f33052i;
                        canvas.scale(f14, f14, yw0Var3.f33047a, yw0Var3.f33048b);
                        canvas.drawBitmap(zw0Var.f33351j, yw0Var3.f33047a, yw0Var3.f33048b, paint);
                        canvas.restore();
                    } else {
                        zw0Var.f33347c.setAlpha((int) (yw0Var3.f33050f * 255.0f));
                        canvas.drawPoint(yw0Var3.f33047a, yw0Var3.f33048b, zw0Var.f33347c);
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
            ArrayList arrayList2 = this.f33354m;
            if (size2 < i12) {
                int i19 = 0;
                while (i19 < i10) {
                    if (arrayList.size() < i12 && Utilities.random.nextFloat() > 0.7f) {
                        int i20 = AndroidUtilities.statusBarHeight;
                        float nextFloat2 = Utilities.random.nextFloat() * view.getMeasuredWidth();
                        if (i17 == 0) {
                            nextFloat = (Utilities.random.nextFloat() * org.telegram.messenger.v0.B(20.0f, view.getMeasuredHeight(), i20)) + i20;
                        } else {
                            nextFloat = Utilities.random.nextFloat() * view.getMeasuredHeight();
                        }
                        double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                        i11 = i12;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (!arrayList2.isEmpty()) {
                            yw0Var = (yw0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            yw0Var = new yw0(this);
                        }
                        yw0Var.f33047a = nextFloat2;
                        yw0Var.f33048b = nextFloat;
                        yw0Var.f33049c = cos;
                        yw0Var.d = sin;
                        yw0Var.f33050f = 0.0f;
                        yw0Var.h = 0.0f;
                        yw0Var.f33052i = Utilities.random.nextFloat() * 1.2f;
                        yw0Var.f33053j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            yw0Var.f33051g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            yw0Var.f33051g = Utilities.random.nextInt(2000) + 3000;
                        }
                        yw0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(yw0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f33352k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                yw0 yw0Var4 = (yw0) arrayList.get(i13);
                float f15 = yw0Var4.h;
                float f16 = yw0Var4.f33051g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(yw0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            yw0Var4.f33050f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            yw0Var4.f33050f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        yw0Var4.f33050f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            yw0Var4.f33050f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = yw0Var4.f33047a;
                    float f19 = yw0Var4.f33049c;
                    float f20 = yw0Var4.e;
                    float f21 = (float) min2;
                    yw0Var4.f33047a = a1.g.B(f19 * f20, f21, 500.0f, f18);
                    yw0Var4.f33048b = (((yw0Var4.d * f20) * f21) / 500.0f) + yw0Var4.f33048b;
                    yw0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f33352k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f33349g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.k6.x0(null, this.f33348f, false) & (-1644826);
        }
        if (this.f33355n != i10) {
            this.f33355n = i10;
            this.f33347c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
