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
public final class yw0 {
    public final e0.f0 f33059a;
    public final Paint f33060b;
    public final Paint f33061c;
    public final Paint d;
    public int f33063g;
    public final int h;
    public final int f33064i;
    public Bitmap f33065j;
    public long f33066k;
    public int f33069n;
    public final Paint e = new Paint();
    public final int f33062f = org.telegram.ui.ActionBar.k6.A8;
    public final ArrayList f33067l = new ArrayList();
    public final ArrayList f33068m = new ArrayList();

    public yw0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f33064i = i11;
        Paint paint = new Paint(1);
        this.f33061c = paint;
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
            this.f33059a = new e0.f0(i11);
            this.f33060b = g0.a.a(a(true));
        } else {
            this.f33059a = null;
            this.f33060b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f33068m.add(new xw0(this));
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
        xw0 xw0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            c();
            int i12 = this.f33064i;
            e0.f0 f0Var = this.f33059a;
            int i13 = 0;
            ArrayList arrayList = this.f33067l;
            if (f0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    xw0 xw0Var2 = (xw0) arrayList.get(i14);
                    float f7 = xw0Var2.f32710a;
                    float f10 = xw0Var2.f32711b;
                    int i15 = xw0Var2.f32716j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= xw0Var2.f32715i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    f0Var.e(i14, i0.a.o(this.f33069n, (int) (xw0Var2.f32713f * 255.0f)));
                    e0.f0.c((float[]) f0Var.f8103c, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.f0.c((float[]) f0Var.d, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, f0Var, min, this.f33060b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    xw0 xw0Var3 = (xw0) arrayList.get(i16);
                    yw0 yw0Var = xw0Var3.f32717k;
                    if (xw0Var3.f32716j != 0) {
                        Bitmap bitmap = yw0Var.f33065j;
                        Paint paint = yw0Var.e;
                        if (bitmap == null) {
                            yw0Var.f33065j = a(false);
                        }
                        paint.setAlpha((int) (xw0Var3.f32713f * 255.0f));
                        canvas.save();
                        float f14 = xw0Var3.f32715i;
                        canvas.scale(f14, f14, xw0Var3.f32710a, xw0Var3.f32711b);
                        canvas.drawBitmap(yw0Var.f33065j, xw0Var3.f32710a, xw0Var3.f32711b, paint);
                        canvas.restore();
                    } else {
                        yw0Var.f33061c.setAlpha((int) (xw0Var3.f32713f * 255.0f));
                        canvas.drawPoint(xw0Var3.f32710a, xw0Var3.f32711b, yw0Var.f33061c);
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
            ArrayList arrayList2 = this.f33068m;
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
                            xw0Var = (xw0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            xw0Var = new xw0(this);
                        }
                        xw0Var.f32710a = nextFloat2;
                        xw0Var.f32711b = nextFloat;
                        xw0Var.f32712c = cos;
                        xw0Var.d = sin;
                        xw0Var.f32713f = 0.0f;
                        xw0Var.h = 0.0f;
                        xw0Var.f32715i = Utilities.random.nextFloat() * 1.2f;
                        xw0Var.f32716j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            xw0Var.f32714g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            xw0Var.f32714g = Utilities.random.nextInt(2000) + 3000;
                        }
                        xw0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(xw0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f33066k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                xw0 xw0Var4 = (xw0) arrayList.get(i13);
                float f15 = xw0Var4.h;
                float f16 = xw0Var4.f32714g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(xw0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            xw0Var4.f32713f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            xw0Var4.f32713f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        xw0Var4.f32713f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            xw0Var4.f32713f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = xw0Var4.f32710a;
                    float f19 = xw0Var4.f32712c;
                    float f20 = xw0Var4.e;
                    float f21 = (float) min2;
                    xw0Var4.f32710a = a1.g.B(f19 * f20, f21, 500.0f, f18);
                    xw0Var4.f32711b = (((xw0Var4.d * f20) * f21) / 500.0f) + xw0Var4.f32711b;
                    xw0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f33066k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f33063g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.k6.x0(null, this.f33062f, false) & (-1644826);
        }
        if (this.f33069n != i10) {
            this.f33069n = i10;
            this.f33061c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
