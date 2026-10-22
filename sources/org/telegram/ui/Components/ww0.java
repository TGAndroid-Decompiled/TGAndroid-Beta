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
public final class ww0 {
    public final e0.f0 f32259a;
    public final Paint f32260b;
    public final Paint f32261c;
    public final Paint d;
    public int f32263g;
    public final int h;
    public final int f32264i;
    public Bitmap f32265j;
    public long f32266k;
    public int f32269n;
    public final Paint e = new Paint();
    public final int f32262f = org.telegram.ui.ActionBar.h6.A8;
    public final ArrayList f32267l = new ArrayList();
    public final ArrayList f32268m = new ArrayList();

    public ww0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f32264i = i11;
        Paint paint = new Paint(1);
        this.f32261c = paint;
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
            this.f32259a = new e0.f0(i11);
            this.f32260b = g0.a.a(a(true));
        } else {
            this.f32259a = null;
            this.f32260b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f32268m.add(new vw0(this));
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
            canvas.drawLine(f18, f19, f16 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) i2.e.f(d10, d12, Math.sin(d10) * d11)) + f17, paint);
            canvas.drawLine(f18, f19, f16 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) i2.e.f(d10, d12, (-Math.sin(d10)) * d11)) + f17, paint);
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
        vw0 vw0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            int i12 = this.f32264i;
            e0.f0 f0Var = this.f32259a;
            int i13 = 0;
            ArrayList arrayList = this.f32267l;
            if (f0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    vw0 vw0Var2 = (vw0) arrayList.get(i14);
                    float f7 = vw0Var2.f31885a;
                    float f10 = vw0Var2.f31886b;
                    int i15 = vw0Var2.f31891j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= vw0Var2.f31890i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    f0Var.e(i14, i0.a.o(this.f32269n, (int) (vw0Var2.f31888f * 255.0f)));
                    e0.f0.c((float[]) f0Var.f8096c, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.f0.c((float[]) f0Var.d, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, f0Var, min, this.f32260b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    vw0 vw0Var3 = (vw0) arrayList.get(i16);
                    ww0 ww0Var = vw0Var3.f31892k;
                    Paint paint = ww0Var.f32261c;
                    if (vw0Var3.f31891j != 0) {
                        Bitmap bitmap = ww0Var.f32265j;
                        Paint paint2 = ww0Var.e;
                        if (bitmap == null) {
                            ww0Var.f32265j = a(false);
                        }
                        paint2.setAlpha((int) (vw0Var3.f31888f * 255.0f));
                        canvas.save();
                        float f14 = vw0Var3.f31890i;
                        canvas.scale(f14, f14, vw0Var3.f31885a, vw0Var3.f31886b);
                        canvas.drawBitmap(ww0Var.f32265j, vw0Var3.f31885a, vw0Var3.f31886b, paint2);
                        canvas.restore();
                    } else {
                        paint.setAlpha((int) (vw0Var3.f31888f * 255.0f));
                        canvas.drawPoint(vw0Var3.f31885a, vw0Var3.f31886b, paint);
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
            ArrayList arrayList2 = this.f32268m;
            if (size2 < i12) {
                int i19 = 0;
                while (i19 < i10) {
                    if (arrayList.size() < i12 && Utilities.random.nextFloat() > 0.7f) {
                        int i20 = AndroidUtilities.statusBarHeight;
                        float nextFloat2 = Utilities.random.nextFloat() * view.getMeasuredWidth();
                        if (i17 == 0) {
                            nextFloat = (Utilities.random.nextFloat() * org.telegram.messenger.g0.B(20.0f, view.getMeasuredHeight(), i20)) + i20;
                        } else {
                            nextFloat = Utilities.random.nextFloat() * view.getMeasuredHeight();
                        }
                        double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                        i11 = i12;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (!arrayList2.isEmpty()) {
                            vw0Var = (vw0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            vw0Var = new vw0(this);
                        }
                        vw0Var.f31885a = nextFloat2;
                        vw0Var.f31886b = nextFloat;
                        vw0Var.f31887c = cos;
                        vw0Var.d = sin;
                        vw0Var.f31888f = 0.0f;
                        vw0Var.h = 0.0f;
                        vw0Var.f31890i = Utilities.random.nextFloat() * 1.2f;
                        vw0Var.f31891j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            vw0Var.f31889g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            vw0Var.f31889g = Utilities.random.nextInt(2000) + 3000;
                        }
                        vw0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(vw0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f32266k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                vw0 vw0Var4 = (vw0) arrayList.get(i13);
                float f15 = vw0Var4.h;
                float f16 = vw0Var4.f31889g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(vw0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            vw0Var4.f31888f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            vw0Var4.f31888f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        vw0Var4.f31888f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            vw0Var4.f31888f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = vw0Var4.f31885a;
                    float f19 = vw0Var4.f31887c;
                    float f20 = vw0Var4.e;
                    float f21 = (float) min2;
                    vw0Var4.f31885a = a1.g.B(f19 * f20, f21, 500.0f, f18);
                    vw0Var4.f31886b = (((vw0Var4.d * f20) * f21) / 500.0f) + vw0Var4.f31886b;
                    vw0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f32266k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f32263g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.h6.x0(null, this.f32262f, false) & (-1644826);
        }
        if (this.f32269n != i10) {
            this.f32269n = i10;
            this.f32261c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
