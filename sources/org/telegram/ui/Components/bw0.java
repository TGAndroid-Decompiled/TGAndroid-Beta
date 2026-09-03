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
    public final a4.k f25695a;
    public final Paint f25696b;
    public final Paint f25697c;
    public final Paint d;
    public int f25700g;
    public final int h;
    public final int f25701i;
    public Bitmap f25702j;
    public long f25703k;
    public int f25706n;
    public final Paint f25698e = new Paint();
    public final int f25699f = org.telegram.ui.ActionBar.k6.A8;
    public final ArrayList f25704l = new ArrayList();
    public final ArrayList f25705m = new ArrayList();

    public bw0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f25701i = i11;
        Paint paint = new Paint(1);
        this.f25697c = paint;
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
            this.f25695a = new a4.k(i11);
            this.f25696b = g0.a.a(a(true));
        } else {
            this.f25695a = null;
            this.f25696b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f25705m.add(new aw0(this));
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
            canvas.drawLine(f17, f18, f15 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) l.d.a(d10, d12, Math.sin(d10) * d11)) + f16, paint);
            canvas.drawLine(f17, f18, f15 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) l.d.a(d10, d12, (-Math.sin(d10)) * d11)) + f16, paint);
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
            int i12 = this.f25701i;
            a4.k kVar = this.f25695a;
            int i13 = 0;
            ArrayList arrayList = this.f25704l;
            if (kVar != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    aw0 aw0Var2 = (aw0) arrayList.get(i14);
                    float f10 = aw0Var2.f25379a;
                    float f11 = aw0Var2.f25380b;
                    int i15 = aw0Var2.f25386j;
                    float f12 = dp / 2.0f;
                    if (i15 != 0) {
                        f12 *= aw0Var2.f25385i;
                    }
                    float f13 = i15 == 0 ? dp : 0.0f;
                    kVar.e(i14, i0.a.k(this.f25706n, (int) (aw0Var2.f25383f * 255.0f)));
                    a4.k.b((float[]) kVar.f93b, i14, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                    float f14 = dp;
                    a4.k.b((float[]) kVar.f94c, i14, f13, 0.0f, f13 + f14, f14);
                }
                g0.a.b(canvas, kVar, min, this.f25696b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    aw0 aw0Var3 = (aw0) arrayList.get(i16);
                    bw0 bw0Var = aw0Var3.f25387k;
                    Paint paint = bw0Var.f25697c;
                    if (aw0Var3.f25386j != 0) {
                        Bitmap bitmap = bw0Var.f25702j;
                        Paint paint2 = bw0Var.f25698e;
                        if (bitmap == null) {
                            bw0Var.f25702j = a(false);
                        }
                        paint2.setAlpha((int) (aw0Var3.f25383f * 255.0f));
                        canvas.save();
                        float f15 = aw0Var3.f25385i;
                        canvas.scale(f15, f15, aw0Var3.f25379a, aw0Var3.f25380b);
                        canvas.drawBitmap(bw0Var.f25702j, aw0Var3.f25379a, aw0Var3.f25380b, paint2);
                        canvas.restore();
                    } else {
                        paint.setAlpha((int) (aw0Var3.f25383f * 255.0f));
                        canvas.drawPoint(aw0Var3.f25379a, aw0Var3.f25380b, paint);
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
            ArrayList arrayList2 = this.f25705m;
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
                        aw0Var.f25379a = nextFloat2;
                        aw0Var.f25380b = nextFloat;
                        aw0Var.f25381c = cos;
                        aw0Var.d = sin;
                        aw0Var.f25383f = 0.0f;
                        aw0Var.h = 0.0f;
                        aw0Var.f25385i = Utilities.random.nextFloat() * 1.2f;
                        aw0Var.f25386j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            aw0Var.f25384g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            aw0Var.f25384g = Utilities.random.nextInt(2000) + 3000;
                        }
                        aw0Var.f25382e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(aw0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f25703k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                aw0 aw0Var4 = (aw0) arrayList.get(i13);
                float f16 = aw0Var4.h;
                float f17 = aw0Var4.f25384g;
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
                            aw0Var4.f25383f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                        } else {
                            aw0Var4.f25383f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f16 - 200.0f) / (f17 - 200.0f));
                        }
                    } else if (f16 < 200.0f) {
                        aw0Var4.f25383f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                    } else {
                        float f18 = f17 - f16;
                        if (f18 < 2000.0f) {
                            aw0Var4.f25383f = AndroidUtilities.decelerateInterpolator.getInterpolation(f18 / 2000.0f);
                        }
                    }
                    float f19 = aw0Var4.f25379a;
                    float f20 = aw0Var4.f25381c;
                    float f21 = aw0Var4.f25382e;
                    float f22 = (float) min2;
                    aw0Var4.f25379a = android.support.v4.media.a.d(f20 * f21, f22, 500.0f, f19);
                    aw0Var4.f25380b = (((aw0Var4.d * f21) * f22) / 500.0f) + aw0Var4.f25380b;
                    aw0Var4.h += f22;
                }
                i13++;
                i18 = 40;
            }
            this.f25703k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f25700g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.k6.w0(null, this.f25699f, false) & (-1644826);
        }
        if (this.f25706n != i10) {
            this.f25706n = i10;
            this.f25697c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
