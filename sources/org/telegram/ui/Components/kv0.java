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

public final class kv0 {

    public final e0.i0 f30191a;

    public final Paint f30192b;

    public final Paint f30193c;
    public final Paint d;

    public int f30196g;
    public final int h;

    public final int f30197i;

    public Bitmap f30198j;

    public long f30199k;

    public int f30202n;

    public final Paint f30194e = new Paint();

    public final int f30195f = org.telegram.ui.ActionBar.g6.A8;

    public final ArrayList f30200l = new ArrayList();

    public final ArrayList f30201m = new ArrayList();

    public kv0(int i10) {
        this.h = i10;
        int i11 = i10 == 0 ? 100 : 300;
        this.f30197i = i11;
        Paint paint = new Paint(1);
        this.f30193c = paint;
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
            this.f30191a = new e0.i0(i11);
            this.f30192b = g0.a.a(a(true));
        } else {
            this.f30191a = null;
            this.f30192b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f30201m.add(new jv0(this));
        }
    }

    public static Bitmap a(boolean z10) {
        Paint paint = new Paint(1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(z10 ? AndroidUtilities.dp(20.0f) : AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float fDpf2 = AndroidUtilities.dpf2(2.0f) * 2.0f;
        float f10 = (-AndroidUtilities.dpf2(0.57f)) * 2.0f;
        float fDpf3 = AndroidUtilities.dpf2(1.55f) * 2.0f;
        float fDp = AndroidUtilities.dp(5.0f);
        float fDp2 = AndroidUtilities.dp(5.0f);
        float f11 = -1.5707964f;
        int i10 = 0;
        while (i10 < 6) {
            double d = f11;
            float f12 = f11;
            float fCos = ((float) Math.cos(d)) * fDpf2;
            Bitmap bitmap = bitmapCreateBitmap;
            float fSin = ((float) Math.sin(d)) * fDpf2;
            float f13 = fCos * 0.66f;
            float f14 = 0.66f * fSin;
            canvas.drawLine(fDp, fDp2, fCos + fDp, fSin + fDp2, paint);
            float f15 = fDp;
            float f16 = fDp2;
            double d10 = (float) (d - 1.5707963267948966d);
            double d11 = f10;
            double d12 = fDpf3;
            float f17 = f15 + f13;
            float f18 = f16 + f14;
            canvas.drawLine(f17, f18, f15 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) i0.a.b(d10, d12, Math.sin(d10) * d11)) + f16, paint);
            canvas.drawLine(f17, f18, f15 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) i0.a.b(d10, d12, (-Math.sin(d10)) * d11)) + f16, paint);
            f11 = f12 + 1.0471976f;
            i10++;
            fDp2 = f16;
            bitmapCreateBitmap = bitmap;
            fDp = f15;
        }
        Bitmap bitmap2 = bitmapCreateBitmap;
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
        jv0 jv0Var;
        if (view == null || canvas == null || !LiteMode.isEnabled(32)) {
            return;
        }
        int i10 = this.f30197i;
        e0.i0 i0Var = this.f30191a;
        int i11 = 0;
        ArrayList arrayList = this.f30200l;
        if (i0Var != null) {
            int iMin = Math.min(i10, arrayList.size());
            int iDp = AndroidUtilities.dp(10.0f);
            for (int i12 = 0; i12 < iMin; i12++) {
                jv0 jv0Var2 = (jv0) arrayList.get(i12);
                float f10 = jv0Var2.f29815a;
                float f11 = jv0Var2.f29816b;
                int i13 = jv0Var2.f29822j;
                float f12 = iDp / 2.0f;
                if (i13 != 0) {
                    f12 *= jv0Var2.f29821i;
                }
                float f13 = i13 == 0 ? iDp : 0.0f;
                i0Var.e(i12, i0.b.k(this.f30202n, (int) (jv0Var2.f29819f * 255.0f)));
                e0.i0.c((float[]) i0Var.f5065b, i12, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                float f14 = iDp;
                e0.i0.c((float[]) i0Var.f5066c, i12, f13, 0.0f, f13 + f14, f14);
            }
            g0.a.b(canvas, i0Var, iMin, this.f30192b);
        } else {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                jv0 jv0Var3 = (jv0) arrayList.get(i14);
                kv0 kv0Var = jv0Var3.f29823k;
                Paint paint = kv0Var.f30193c;
                if (jv0Var3.f29822j != 0) {
                    Bitmap bitmap = kv0Var.f30198j;
                    Paint paint2 = kv0Var.f30194e;
                    if (bitmap == null) {
                        kv0Var.f30198j = a(false);
                    }
                    paint2.setAlpha((int) (jv0Var3.f29819f * 255.0f));
                    canvas.save();
                    float f15 = jv0Var3.f29821i;
                    canvas.scale(f15, f15, jv0Var3.f29815a, jv0Var3.f29816b);
                    canvas.drawBitmap(kv0Var.f30198j, jv0Var3.f29815a, jv0Var3.f29816b, paint2);
                    canvas.restore();
                } else {
                    paint.setAlpha((int) (jv0Var3.f29819f * 255.0f));
                    canvas.drawPoint(jv0Var3.f29815a, jv0Var3.f29816b, paint);
                }
            }
        }
        int i15 = this.h;
        int i16 = i15 == 0 ? 1 : 10;
        int size2 = arrayList.size();
        int i17 = 40;
        ArrayList arrayList2 = this.f30201m;
        if (size2 < i10) {
            int i18 = 0;
            while (i18 < i16) {
                if (arrayList.size() < i10 && Utilities.random.nextFloat() > 0.7f) {
                    int i19 = AndroidUtilities.statusBarHeight;
                    float fNextFloat = Utilities.random.nextFloat() * view.getMeasuredWidth();
                    float fNextFloat2 = i15 == 0 ? (Utilities.random.nextFloat() * org.telegram.messenger.y1.B(20.0f, view.getMeasuredHeight(), i19)) + i19 : Utilities.random.nextFloat() * view.getMeasuredHeight();
                    double dNextInt = ((double) (Utilities.random.nextInt(40) + 70)) * 0.017453292519943295d;
                    float fCos = (float) Math.cos(dNextInt);
                    float fSin = (float) Math.sin(dNextInt);
                    if (arrayList2.isEmpty()) {
                        jv0Var = new jv0(this);
                    } else {
                        jv0Var = (jv0) arrayList2.get(0);
                        arrayList2.remove(0);
                    }
                    jv0Var.f29815a = fNextFloat;
                    jv0Var.f29816b = fNextFloat2;
                    jv0Var.f29817c = fCos;
                    jv0Var.d = fSin;
                    jv0Var.f29819f = 0.0f;
                    jv0Var.h = 0.0f;
                    jv0Var.f29821i = Utilities.random.nextFloat() * 1.2f;
                    jv0Var.f29822j = Utilities.random.nextInt(2);
                    if (i15 == 0) {
                        jv0Var.f29820g = Utilities.random.nextInt(100) + 2000;
                    } else {
                        jv0Var.f29820g = Utilities.random.nextInt(2000) + 3000;
                    }
                    jv0Var.f29818e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                    arrayList.add(jv0Var);
                }
                i18++;
                i10 = i10;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMin = Math.min(17L, jCurrentTimeMillis - this.f30199k);
        int size3 = arrayList.size();
        while (i11 < size3) {
            jv0 jv0Var4 = (jv0) arrayList.get(i11);
            float f16 = jv0Var4.h;
            float f17 = jv0Var4.f29820g;
            if (f16 >= f17) {
                if (arrayList2.size() < i17) {
                    arrayList2.add(jv0Var4);
                }
                arrayList.remove(i11);
                i11--;
                size3--;
            } else {
                if (i15 == 0) {
                    if (f16 < 200.0f) {
                        jv0Var4.f29819f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                    } else {
                        jv0Var4.f29819f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f16 - 200.0f) / (f17 - 200.0f));
                    }
                } else if (f16 < 200.0f) {
                    jv0Var4.f29819f = AndroidUtilities.accelerateInterpolator.getInterpolation(f16 / 200.0f);
                } else {
                    float f18 = f17 - f16;
                    if (f18 < 2000.0f) {
                        jv0Var4.f29819f = AndroidUtilities.decelerateInterpolator.getInterpolation(f18 / 2000.0f);
                    }
                }
                float f19 = jv0Var4.f29815a;
                float f20 = jv0Var4.f29817c;
                float f21 = jv0Var4.f29818e;
                float f22 = jMin;
                jv0Var4.f29815a = a9.p.d(f20 * f21, f22, 500.0f, f19);
                jv0Var4.f29816b = (((jv0Var4.d * f21) * f22) / 500.0f) + jv0Var4.f29816b;
                jv0Var4.h += f22;
            }
            i11++;
            i17 = 40;
        }
        this.f30199k = jCurrentTimeMillis;
        view.invalidate();
    }

    public final void c() {
        int iW0 = this.f30196g;
        if (iW0 == 0) {
            iW0 = org.telegram.ui.ActionBar.g6.w0(null, this.f30195f, false) & (-1644826);
        }
        if (this.f30202n != iW0) {
            this.f30202n = iW0;
            this.f30193c.setColor(iW0);
            this.d.setColor(iW0);
        }
    }
}
