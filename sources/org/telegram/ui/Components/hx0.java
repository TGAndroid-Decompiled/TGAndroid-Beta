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
public final class hx0 {
    public final e0.e0 f29089a;
    public final Paint f29090b;
    public final Paint f29091c;
    public final Paint d;
    public int f29093g;
    public final int h;
    public final int f29094i;
    public Bitmap f29095j;
    public long f29096k;
    public int f29099n;
    public final Paint e = new Paint();
    public final int f29092f = org.telegram.ui.ActionBar.y6.A8;
    public final ArrayList f29097l = new ArrayList();
    public final ArrayList f29098m = new ArrayList();

    public hx0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f29094i = i11;
        Paint paint = new Paint(1);
        this.f29091c = paint;
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
            this.f29089a = new e0.e0(i11);
            this.f29090b = aa.a(a(true));
        } else {
            this.f29089a = null;
            this.f29090b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f29098m.add(new gx0(this));
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
        gx0 gx0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            c();
            int i12 = this.f29094i;
            e0.e0 e0Var = this.f29089a;
            int i13 = 0;
            ArrayList arrayList = this.f29097l;
            if (e0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    gx0 gx0Var2 = (gx0) arrayList.get(i14);
                    float f7 = gx0Var2.f28774a;
                    float f10 = gx0Var2.f28775b;
                    int i15 = gx0Var2.f28780j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= gx0Var2.f28779i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    e0Var.f(i14, i0.a.o(this.f29099n, (int) (gx0Var2.f28777f * 255.0f)));
                    e0.e0.c((float[]) e0Var.f9529c, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.e0.c((float[]) e0Var.d, i14, f12, 0.0f, f12 + f13, f13);
                }
                aa.b(canvas, e0Var, min, this.f29090b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    gx0 gx0Var3 = (gx0) arrayList.get(i16);
                    hx0 hx0Var = gx0Var3.f28781k;
                    if (gx0Var3.f28780j != 0) {
                        Bitmap bitmap = hx0Var.f29095j;
                        Paint paint = hx0Var.e;
                        if (bitmap == null) {
                            hx0Var.f29095j = a(false);
                        }
                        paint.setAlpha((int) (gx0Var3.f28777f * 255.0f));
                        canvas.save();
                        float f14 = gx0Var3.f28779i;
                        canvas.scale(f14, f14, gx0Var3.f28774a, gx0Var3.f28775b);
                        canvas.drawBitmap(hx0Var.f29095j, gx0Var3.f28774a, gx0Var3.f28775b, paint);
                        canvas.restore();
                    } else {
                        hx0Var.f29091c.setAlpha((int) (gx0Var3.f28777f * 255.0f));
                        canvas.drawPoint(gx0Var3.f28774a, gx0Var3.f28775b, hx0Var.f29091c);
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
            ArrayList arrayList2 = this.f29098m;
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
                            gx0Var = (gx0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            gx0Var = new gx0(this);
                        }
                        gx0Var.f28774a = nextFloat2;
                        gx0Var.f28775b = nextFloat;
                        gx0Var.f28776c = cos;
                        gx0Var.d = sin;
                        gx0Var.f28777f = 0.0f;
                        gx0Var.h = 0.0f;
                        gx0Var.f28779i = Utilities.random.nextFloat() * 1.2f;
                        gx0Var.f28780j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            gx0Var.f28778g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            gx0Var.f28778g = Utilities.random.nextInt(2000) + 3000;
                        }
                        gx0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(gx0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f29096k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                gx0 gx0Var4 = (gx0) arrayList.get(i13);
                float f15 = gx0Var4.h;
                float f16 = gx0Var4.f28778g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(gx0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            gx0Var4.f28777f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            gx0Var4.f28777f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        gx0Var4.f28777f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            gx0Var4.f28777f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = gx0Var4.f28774a;
                    float f19 = gx0Var4.f28776c;
                    float f20 = gx0Var4.e;
                    float f21 = (float) min2;
                    gx0Var4.f28774a = a1.g.C(f19 * f20, f21, 500.0f, f18);
                    gx0Var4.f28775b = (((gx0Var4.d * f20) * f21) / 500.0f) + gx0Var4.f28775b;
                    gx0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f29096k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f29093g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.y6.x0(null, this.f29092f, false) & (-1644826);
        }
        if (this.f29099n != i10) {
            this.f29099n = i10;
            this.f29091c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
