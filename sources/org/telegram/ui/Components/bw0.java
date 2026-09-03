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
public final class bw0 {
    public final a4.k f23760a;
    public final Paint f23761b;
    public final Paint f23762c;
    public final Paint d;
    public int f23764g;
    public final int h;
    public final int f23765i;
    public Bitmap f23766j;
    public long f23767k;
    public int f23770n;
    public final Paint e = new Paint();
    public final int f23763f = org.telegram.ui.ActionBar.j6.A8;
    public final ArrayList f23768l = new ArrayList();
    public final ArrayList f23769m = new ArrayList();

    public bw0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f23765i = i11;
        Paint paint = new Paint(1);
        this.f23762c = paint;
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
            this.f23760a = new a4.k(i11);
            this.f23761b = g0.a.a(a(true));
        } else {
            this.f23760a = null;
            this.f23761b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f23769m.add(new aw0(this));
        }
    }

    public static Bitmap a(boolean z4) {
        int dp;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        if (z4) {
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
        int i10 = 0;
        while (i10 < 6) {
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
            double d10 = (float) (d - 1.5707963267948966d);
            double d11 = f10;
            double d12 = dpf22;
            float f17 = f15 + f13;
            float f18 = f16 + f14;
            canvas.drawLine(f17, f18, f15 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) kf.k0.a(d10, d12, Math.sin(d10) * d11)) + f16, paint);
            canvas.drawLine(f17, f18, f15 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) kf.k0.a(d10, d12, (-Math.sin(d10)) * d11)) + f16, paint);
            f11 = f12 + 1.0471976f;
            i10++;
            dp3 = f16;
            createBitmap = bitmap;
            dp2 = f15;
        }
        Bitmap bitmap2 = createBitmap;
        if (z4) {
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
        aw0 aw0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            int i12 = this.f23765i;
            a4.k kVar = this.f23760a;
            int i13 = 0;
            ArrayList arrayList = this.f23768l;
            if (kVar != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    aw0 aw0Var2 = (aw0) arrayList.get(i14);
                    float f10 = aw0Var2.f23486a;
                    float f11 = aw0Var2.f23487b;
                    int i15 = aw0Var2.f23492j;
                    float f12 = dp / 2.0f;
                    if (i15 != 0) {
                        f12 *= aw0Var2.f23491i;
                    }
                    float f13 = i15 == 0 ? dp : 0.0f;
                    kVar.e(i14, i0.a.k(this.f23770n, (int) (aw0Var2.f23489f * 255.0f)));
                    a4.k.b((float[]) kVar.f85b, i14, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                    float f14 = dp;
                    a4.k.b((float[]) kVar.f86c, i14, f13, 0.0f, f13 + f14, f14);
                }
                g0.a.b(canvas, kVar, min, this.f23761b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    aw0 aw0Var3 = (aw0) arrayList.get(i16);
                    bw0 bw0Var = aw0Var3.f23493k;
                    Paint paint = bw0Var.f23762c;
                    if (aw0Var3.f23492j != 0) {
                        Bitmap bitmap = bw0Var.f23766j;
                        Paint paint2 = bw0Var.e;
                        if (bitmap == null) {
                            bw0Var.f23766j = a(false);
                        }
                        paint2.setAlpha((int) (aw0Var3.f23489f * 255.0f));
                        canvas.save();
                        float f15 = aw0Var3.f23491i;
                        canvas.scale(f15, f15, aw0Var3.f23486a, aw0Var3.f23487b);
                        canvas.drawBitmap(bw0Var.f23766j, aw0Var3.f23486a, aw0Var3.f23487b, paint2);
                        canvas.restore();
                    } else {
                        paint.setAlpha((int) (aw0Var3.f23489f * 255.0f));
                        canvas.drawPoint(aw0Var3.f23486a, aw0Var3.f23487b, paint);
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
            ArrayList arrayList2 = this.f23769m;
            if (size2 < i12) {
                int i19 = 0;
                while (i19 < i10) {
                    if (arrayList.size() < i12 && Utilities.random.nextFloat() > 0.7f) {
                        int i20 = AndroidUtilities.statusBarHeight;
                        float nextFloat2 = Utilities.random.nextFloat() * view.getMeasuredWidth();
                        if (i17 == 0) {
                            nextFloat = (Utilities.random.nextFloat() * org.telegram.messenger.y3.B(20.0f, view.getMeasuredHeight(), i20)) + i20;
                        } else {
                            nextFloat = Utilities.random.nextFloat() * view.getMeasuredHeight();
                        }
                        double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                        i11 = i12;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (!arrayList2.isEmpty()) {
                            aw0Var = (aw0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            aw0Var = new aw0(this);
                        }
                        aw0Var.f23486a = nextFloat2;
                        aw0Var.f23487b = nextFloat;
                        aw0Var.f23488c = cos;
                        aw0Var.d = sin;
                        aw0Var.f23489f = 0.0f;
                        aw0Var.h = 0.0f;
                        aw0Var.f23491i = Utilities.random.nextFloat() * 1.2f;
                        aw0Var.f23492j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            aw0Var.f23490g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            aw0Var.f23490g = Utilities.random.nextInt(2000) + 3000;
                        }
                        aw0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(aw0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f23767k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                aw0 aw0Var4 = (aw0) arrayList.get(i13);
                float f16 = aw0Var4.h;
                float f17 = aw0Var4.f23490g;
                if (f16 >= f17) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(aw0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f16 < 200.0f) {
                            aw0Var4.f23489f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                        } else {
                            aw0Var4.f23489f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f16 - 200.0f) / (f17 - 200.0f));
                        }
                    } else if (f16 < 200.0f) {
                        aw0Var4.f23489f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                    } else {
                        float f18 = f17 - f16;
                        if (f18 < 2000.0f) {
                            aw0Var4.f23489f = AndroidUtilities.decelerateInterpolator.getInterpolation(f18 / 2000.0f);
                        }
                    }
                    float f19 = aw0Var4.f23486a;
                    float f20 = aw0Var4.f23488c;
                    float f21 = aw0Var4.e;
                    float f22 = (float) min2;
                    aw0Var4.f23486a = android.support.v4.media.a.d(f20 * f21, f22, 500.0f, f19);
                    aw0Var4.f23487b = (((aw0Var4.d * f21) * f22) / 500.0f) + aw0Var4.f23487b;
                    aw0Var4.h += f22;
                }
                i13++;
                i18 = 40;
            }
            this.f23767k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f23764g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.j6.w0(null, this.f23763f, false) & (-1644826);
        }
        if (this.f23770n != i10) {
            this.f23770n = i10;
            this.f23762c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
