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
public final class gx0 {
    public final e0.e0 f28737a;
    public final Paint f28738b;
    public final Paint f28739c;
    public final Paint d;
    public int f28741g;
    public final int h;
    public final int f28742i;
    public Bitmap f28743j;
    public long f28744k;
    public int f28747n;
    public final Paint e = new Paint();
    public final int f28740f = org.telegram.ui.ActionBar.y6.A8;
    public final ArrayList f28745l = new ArrayList();
    public final ArrayList f28746m = new ArrayList();

    public gx0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f28742i = i11;
        Paint paint = new Paint(1);
        this.f28739c = paint;
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
            this.f28737a = new e0.e0(i11);
            this.f28738b = aa.a(a(true));
        } else {
            this.f28737a = null;
            this.f28738b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f28746m.add(new fx0(this));
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
            canvas.drawLine(f18, f19, f16 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) org.telegram.messenger.t.a(d10, d12, Math.sin(d10) * d11)) + f17, paint);
            canvas.drawLine(f18, f19, f16 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) org.telegram.messenger.t.a(d10, d12, (-Math.sin(d10)) * d11)) + f17, paint);
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
        fx0 fx0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            c();
            int i12 = this.f28742i;
            e0.e0 e0Var = this.f28737a;
            int i13 = 0;
            ArrayList arrayList = this.f28745l;
            if (e0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    fx0 fx0Var2 = (fx0) arrayList.get(i14);
                    float f7 = fx0Var2.f28325a;
                    float f10 = fx0Var2.f28326b;
                    int i15 = fx0Var2.f28331j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= fx0Var2.f28330i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    e0Var.f(i14, i0.a.o(this.f28747n, (int) (fx0Var2.f28328f * 255.0f)));
                    e0.e0.c((float[]) e0Var.f9530c, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.e0.c((float[]) e0Var.d, i14, f12, 0.0f, f12 + f13, f13);
                }
                aa.b(canvas, e0Var, min, this.f28738b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    fx0 fx0Var3 = (fx0) arrayList.get(i16);
                    gx0 gx0Var = fx0Var3.f28332k;
                    if (fx0Var3.f28331j != 0) {
                        Bitmap bitmap = gx0Var.f28743j;
                        Paint paint = gx0Var.e;
                        if (bitmap == null) {
                            gx0Var.f28743j = a(false);
                        }
                        paint.setAlpha((int) (fx0Var3.f28328f * 255.0f));
                        canvas.save();
                        float f14 = fx0Var3.f28330i;
                        canvas.scale(f14, f14, fx0Var3.f28325a, fx0Var3.f28326b);
                        canvas.drawBitmap(gx0Var.f28743j, fx0Var3.f28325a, fx0Var3.f28326b, paint);
                        canvas.restore();
                    } else {
                        gx0Var.f28739c.setAlpha((int) (fx0Var3.f28328f * 255.0f));
                        canvas.drawPoint(fx0Var3.f28325a, fx0Var3.f28326b, gx0Var.f28739c);
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
            ArrayList arrayList2 = this.f28746m;
            if (size2 < i12) {
                int i19 = 0;
                while (i19 < i10) {
                    if (arrayList.size() < i12 && Utilities.random.nextFloat() > 0.7f) {
                        int i20 = AndroidUtilities.statusBarHeight;
                        float nextFloat2 = Utilities.random.nextFloat() * view.getMeasuredWidth();
                        if (i17 == 0) {
                            nextFloat = (Utilities.random.nextFloat() * org.telegram.messenger.t.C(20.0f, view.getMeasuredHeight(), i20)) + i20;
                        } else {
                            nextFloat = Utilities.random.nextFloat() * view.getMeasuredHeight();
                        }
                        double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                        i11 = i12;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (!arrayList2.isEmpty()) {
                            fx0Var = (fx0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            fx0Var = new fx0(this);
                        }
                        fx0Var.f28325a = nextFloat2;
                        fx0Var.f28326b = nextFloat;
                        fx0Var.f28327c = cos;
                        fx0Var.d = sin;
                        fx0Var.f28328f = 0.0f;
                        fx0Var.h = 0.0f;
                        fx0Var.f28330i = Utilities.random.nextFloat() * 1.2f;
                        fx0Var.f28331j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            fx0Var.f28329g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            fx0Var.f28329g = Utilities.random.nextInt(2000) + 3000;
                        }
                        fx0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(fx0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f28744k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                fx0 fx0Var4 = (fx0) arrayList.get(i13);
                float f15 = fx0Var4.h;
                float f16 = fx0Var4.f28329g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(fx0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            fx0Var4.f28328f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            fx0Var4.f28328f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        fx0Var4.f28328f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            fx0Var4.f28328f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = fx0Var4.f28325a;
                    float f19 = fx0Var4.f28327c;
                    float f20 = fx0Var4.e;
                    float f21 = (float) min2;
                    fx0Var4.f28325a = a1.g.C(f19 * f20, f21, 500.0f, f18);
                    fx0Var4.f28326b = (((fx0Var4.d * f20) * f21) / 500.0f) + fx0Var4.f28326b;
                    fx0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f28744k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f28741g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.y6.x0(null, this.f28740f, false) & (-1644826);
        }
        if (this.f28747n != i10) {
            this.f28747n = i10;
            this.f28739c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
