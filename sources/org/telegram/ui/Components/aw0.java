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
public final class aw0 {
    public final e0.i0 f22513a;
    public final Paint f22514b;
    public final Paint f22515c;
    public final Paint d;
    public int f22517g;
    public final int h;
    public final int f22518i;
    public Bitmap f22519j;
    public long f22520k;
    public int f22523n;
    public final Paint e = new Paint();
    public final int f22516f = org.telegram.ui.ActionBar.h6.A8;
    public final ArrayList f22521l = new ArrayList();
    public final ArrayList f22522m = new ArrayList();

    public aw0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f22518i = i11;
        Paint paint = new Paint(1);
        this.f22515c = paint;
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
            this.f22513a = new e0.i0(i11);
            this.f22514b = g0.a.a(a(true));
        } else {
            this.f22513a = null;
            this.f22514b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f22522m.add(new zv0(this));
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
        zv0 zv0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            int i12 = this.f22518i;
            e0.i0 i0Var = this.f22513a;
            int i13 = 0;
            ArrayList arrayList = this.f22521l;
            if (i0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    zv0 zv0Var2 = (zv0) arrayList.get(i14);
                    float f7 = zv0Var2.f30670a;
                    float f10 = zv0Var2.f30671b;
                    int i15 = zv0Var2.f30676j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= zv0Var2.f30675i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    i0Var.e(i14, i0.a.k(this.f22523n, (int) (zv0Var2.f30673f * 255.0f)));
                    e0.i0.c((float[]) i0Var.f7773b, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.i0.c((float[]) i0Var.f7774c, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, i0Var, min, this.f22514b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    zv0 zv0Var3 = (zv0) arrayList.get(i16);
                    aw0 aw0Var = zv0Var3.f30677k;
                    Paint paint = aw0Var.f22515c;
                    if (zv0Var3.f30676j != 0) {
                        Bitmap bitmap = aw0Var.f22519j;
                        Paint paint2 = aw0Var.e;
                        if (bitmap == null) {
                            aw0Var.f22519j = a(false);
                        }
                        paint2.setAlpha((int) (zv0Var3.f30673f * 255.0f));
                        canvas.save();
                        float f14 = zv0Var3.f30675i;
                        canvas.scale(f14, f14, zv0Var3.f30670a, zv0Var3.f30671b);
                        canvas.drawBitmap(aw0Var.f22519j, zv0Var3.f30670a, zv0Var3.f30671b, paint2);
                        canvas.restore();
                    } else {
                        paint.setAlpha((int) (zv0Var3.f30673f * 255.0f));
                        canvas.drawPoint(zv0Var3.f30670a, zv0Var3.f30671b, paint);
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
            ArrayList arrayList2 = this.f22522m;
            if (size2 < i12) {
                int i19 = 0;
                while (i19 < i10) {
                    if (arrayList.size() < i12 && Utilities.random.nextFloat() > 0.7f) {
                        int i20 = AndroidUtilities.statusBarHeight;
                        float nextFloat2 = Utilities.random.nextFloat() * view.getMeasuredWidth();
                        if (i17 == 0) {
                            nextFloat = (Utilities.random.nextFloat() * org.telegram.messenger.z0.B(20.0f, view.getMeasuredHeight(), i20)) + i20;
                        } else {
                            nextFloat = Utilities.random.nextFloat() * view.getMeasuredHeight();
                        }
                        double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                        i11 = i12;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (!arrayList2.isEmpty()) {
                            zv0Var = (zv0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            zv0Var = new zv0(this);
                        }
                        zv0Var.f30670a = nextFloat2;
                        zv0Var.f30671b = nextFloat;
                        zv0Var.f30672c = cos;
                        zv0Var.d = sin;
                        zv0Var.f30673f = 0.0f;
                        zv0Var.h = 0.0f;
                        zv0Var.f30675i = Utilities.random.nextFloat() * 1.2f;
                        zv0Var.f30676j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            zv0Var.f30674g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            zv0Var.f30674g = Utilities.random.nextInt(2000) + 3000;
                        }
                        zv0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(zv0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f22520k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                zv0 zv0Var4 = (zv0) arrayList.get(i13);
                float f15 = zv0Var4.h;
                float f16 = zv0Var4.f30674g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(zv0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            zv0Var4.f30673f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            zv0Var4.f30673f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        zv0Var4.f30673f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            zv0Var4.f30673f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = zv0Var4.f30670a;
                    float f19 = zv0Var4.f30672c;
                    float f20 = zv0Var4.e;
                    float f21 = (float) min2;
                    zv0Var4.f30670a = a4.a.B(f19 * f20, f21, 500.0f, f18);
                    zv0Var4.f30671b = (((zv0Var4.d * f20) * f21) / 500.0f) + zv0Var4.f30671b;
                    zv0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f22520k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f22517g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.h6.w0(null, this.f22516f, false) & (-1644826);
        }
        if (this.f22523n != i10) {
            this.f22523n = i10;
            this.f22515c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
