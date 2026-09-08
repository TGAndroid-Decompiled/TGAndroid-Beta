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
public final class zv0 {
    public final e0.i0 f33265a;
    public final Paint f33266b;
    public final Paint f33267c;
    public final Paint d;
    public int f33270g;
    public final int h;
    public final int f33271i;
    public Bitmap f33272j;
    public long f33273k;
    public int f33276n;
    public final Paint f33268e = new Paint();
    public final int f33269f = org.telegram.ui.ActionBar.j6.A8;
    public final ArrayList f33274l = new ArrayList();
    public final ArrayList f33275m = new ArrayList();

    public zv0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f33271i = i11;
        Paint paint = new Paint(1);
        this.f33267c = paint;
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
            this.f33265a = new e0.i0(i11);
            this.f33266b = g0.a.a(a(true));
        } else {
            this.f33265a = null;
            this.f33266b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f33275m.add(new yv0(this));
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
            canvas.drawLine(f16, f17, f14 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) i2.g.e(d10, d12, Math.sin(d10) * d11)) + f15, paint);
            canvas.drawLine(f16, f17, f14 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) i2.g.e(d10, d12, (-Math.sin(d10)) * d11)) + f15, paint);
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
        yv0 yv0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            int i12 = this.f33271i;
            e0.i0 i0Var = this.f33265a;
            int i13 = 0;
            ArrayList arrayList = this.f33274l;
            if (i0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    yv0 yv0Var2 = (yv0) arrayList.get(i14);
                    float f7 = yv0Var2.f33036a;
                    float f10 = yv0Var2.f33037b;
                    int i15 = yv0Var2.f33043j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= yv0Var2.f33042i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    i0Var.e(i14, i0.a.k(this.f33276n, (int) (yv0Var2.f33040f * 255.0f)));
                    e0.i0.a((float[]) i0Var.f8654b, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.i0.a((float[]) i0Var.f8655c, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, i0Var, min, this.f33266b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    yv0 yv0Var3 = (yv0) arrayList.get(i16);
                    zv0 zv0Var = yv0Var3.f33044k;
                    Paint paint = zv0Var.f33267c;
                    if (yv0Var3.f33043j != 0) {
                        Bitmap bitmap = zv0Var.f33272j;
                        Paint paint2 = zv0Var.f33268e;
                        if (bitmap == null) {
                            zv0Var.f33272j = a(false);
                        }
                        paint2.setAlpha((int) (yv0Var3.f33040f * 255.0f));
                        canvas.save();
                        float f14 = yv0Var3.f33042i;
                        canvas.scale(f14, f14, yv0Var3.f33036a, yv0Var3.f33037b);
                        canvas.drawBitmap(zv0Var.f33272j, yv0Var3.f33036a, yv0Var3.f33037b, paint2);
                        canvas.restore();
                    } else {
                        paint.setAlpha((int) (yv0Var3.f33040f * 255.0f));
                        canvas.drawPoint(yv0Var3.f33036a, yv0Var3.f33037b, paint);
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
            ArrayList arrayList2 = this.f33275m;
            if (size2 < i12) {
                int i19 = 0;
                while (i19 < i10) {
                    if (arrayList.size() < i12 && Utilities.random.nextFloat() > 0.7f) {
                        int i20 = AndroidUtilities.statusBarHeight;
                        float nextFloat2 = Utilities.random.nextFloat() * view.getMeasuredWidth();
                        if (i17 == 0) {
                            nextFloat = (Utilities.random.nextFloat() * org.telegram.messenger.w1.B(20.0f, view.getMeasuredHeight(), i20)) + i20;
                        } else {
                            nextFloat = Utilities.random.nextFloat() * view.getMeasuredHeight();
                        }
                        double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                        i11 = i12;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (!arrayList2.isEmpty()) {
                            yv0Var = (yv0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            yv0Var = new yv0(this);
                        }
                        yv0Var.f33036a = nextFloat2;
                        yv0Var.f33037b = nextFloat;
                        yv0Var.f33038c = cos;
                        yv0Var.d = sin;
                        yv0Var.f33040f = 0.0f;
                        yv0Var.h = 0.0f;
                        yv0Var.f33042i = Utilities.random.nextFloat() * 1.2f;
                        yv0Var.f33043j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            yv0Var.f33041g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            yv0Var.f33041g = Utilities.random.nextInt(2000) + 3000;
                        }
                        yv0Var.f33039e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(yv0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f33273k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                yv0 yv0Var4 = (yv0) arrayList.get(i13);
                float f15 = yv0Var4.h;
                float f16 = yv0Var4.f33041g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(yv0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            yv0Var4.f33040f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            yv0Var4.f33040f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        yv0Var4.f33040f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            yv0Var4.f33040f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = yv0Var4.f33036a;
                    float f19 = yv0Var4.f33038c;
                    float f20 = yv0Var4.f33039e;
                    float f21 = (float) min2;
                    yv0Var4.f33036a = a4.a.A(f19 * f20, f21, 500.0f, f18);
                    yv0Var4.f33037b = (((yv0Var4.d * f20) * f21) / 500.0f) + yv0Var4.f33037b;
                    yv0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f33273k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f33270g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.j6.w0(null, this.f33269f, false) & (-1644826);
        }
        if (this.f33276n != i10) {
            this.f33276n = i10;
            this.f33267c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
