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
public final class jx0 {
    public final e0.g0 f27658a;
    public final Paint f27659b;
    public final Paint f27660c;
    public final Paint d;
    public int f27663g;
    public final int h;
    public final int f27664i;
    public Bitmap f27665j;
    public long f27666k;
    public int f27669n;
    public final Paint f27661e = new Paint();
    public final int f27662f = org.telegram.ui.ActionBar.h6.A8;
    public final ArrayList f27667l = new ArrayList();
    public final ArrayList f27668m = new ArrayList();

    public jx0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f27664i = i11;
        Paint paint = new Paint(1);
        this.f27660c = paint;
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
            this.f27658a = new e0.g0(i11);
            this.f27659b = g0.a.a(a(true));
        } else {
            this.f27658a = null;
            this.f27659b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f27668m.add(new ix0(this));
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
            canvas.drawLine(f18, f19, f16 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) hg.c.e(d10, d12, Math.sin(d10) * d11)) + f17, paint);
            canvas.drawLine(f18, f19, f16 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) hg.c.e(d10, d12, (-Math.sin(d10)) * d11)) + f17, paint);
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
        ix0 ix0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            int i12 = this.f27664i;
            e0.g0 g0Var = this.f27658a;
            int i13 = 0;
            ArrayList arrayList = this.f27667l;
            if (g0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    ix0 ix0Var2 = (ix0) arrayList.get(i14);
                    float f7 = ix0Var2.f27300a;
                    float f10 = ix0Var2.f27301b;
                    int i15 = ix0Var2.f27307j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= ix0Var2.f27306i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    g0Var.e(i14, i0.a.k(this.f27669n, (int) (ix0Var2.f27304f * 255.0f)));
                    e0.g0.a((float[]) g0Var.f8410b, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.g0.a((float[]) g0Var.f8411c, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, g0Var, min, this.f27659b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    ix0 ix0Var3 = (ix0) arrayList.get(i16);
                    jx0 jx0Var = ix0Var3.f27308k;
                    Paint paint = jx0Var.f27660c;
                    if (ix0Var3.f27307j != 0) {
                        Bitmap bitmap = jx0Var.f27665j;
                        Paint paint2 = jx0Var.f27661e;
                        if (bitmap == null) {
                            jx0Var.f27665j = a(false);
                        }
                        paint2.setAlpha((int) (ix0Var3.f27304f * 255.0f));
                        canvas.save();
                        float f14 = ix0Var3.f27306i;
                        canvas.scale(f14, f14, ix0Var3.f27300a, ix0Var3.f27301b);
                        canvas.drawBitmap(jx0Var.f27665j, ix0Var3.f27300a, ix0Var3.f27301b, paint2);
                        canvas.restore();
                    } else {
                        paint.setAlpha((int) (ix0Var3.f27304f * 255.0f));
                        canvas.drawPoint(ix0Var3.f27300a, ix0Var3.f27301b, paint);
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
            ArrayList arrayList2 = this.f27668m;
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
                            ix0Var = (ix0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            ix0Var = new ix0(this);
                        }
                        ix0Var.f27300a = nextFloat2;
                        ix0Var.f27301b = nextFloat;
                        ix0Var.f27302c = cos;
                        ix0Var.d = sin;
                        ix0Var.f27304f = 0.0f;
                        ix0Var.h = 0.0f;
                        ix0Var.f27306i = Utilities.random.nextFloat() * 1.2f;
                        ix0Var.f27307j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            ix0Var.f27305g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            ix0Var.f27305g = Utilities.random.nextInt(2000) + 3000;
                        }
                        ix0Var.f27303e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(ix0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f27666k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                ix0 ix0Var4 = (ix0) arrayList.get(i13);
                float f15 = ix0Var4.h;
                float f16 = ix0Var4.f27305g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(ix0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            ix0Var4.f27304f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            ix0Var4.f27304f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        ix0Var4.f27304f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            ix0Var4.f27304f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = ix0Var4.f27300a;
                    float f19 = ix0Var4.f27302c;
                    float f20 = ix0Var4.f27303e;
                    float f21 = (float) min2;
                    ix0Var4.f27300a = a1.g.B(f19 * f20, f21, 500.0f, f18);
                    ix0Var4.f27301b = (((ix0Var4.d * f20) * f21) / 500.0f) + ix0Var4.f27301b;
                    ix0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f27666k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f27663g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.h6.x0(null, this.f27662f, false) & (-1644826);
        }
        if (this.f27669n != i10) {
            this.f27669n = i10;
            this.f27660c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
