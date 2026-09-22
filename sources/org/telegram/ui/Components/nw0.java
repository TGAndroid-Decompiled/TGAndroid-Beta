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
public final class nw0 {
    public final e0.i0 f26891a;
    public final Paint f26892b;
    public final Paint f26893c;
    public final Paint d;
    public int f26895g;
    public final int h;
    public final int f26896i;
    public Bitmap f26897j;
    public long f26898k;
    public int f26901n;
    public final Paint e = new Paint();
    public final int f26894f = org.telegram.ui.ActionBar.j6.A8;
    public final ArrayList f26899l = new ArrayList();
    public final ArrayList f26900m = new ArrayList();

    public nw0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f26896i = i11;
        Paint paint = new Paint(1);
        this.f26893c = paint;
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
            this.f26891a = new e0.i0(i11);
            this.f26892b = g0.a.a(a(true));
        } else {
            this.f26891a = null;
            this.f26892b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f26900m.add(new mw0(this));
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
            canvas.drawLine(f16, f17, f14 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) hg.k0.e(d10, d12, Math.sin(d10) * d11)) + f15, paint);
            canvas.drawLine(f16, f17, f14 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) hg.k0.e(d10, d12, (-Math.sin(d10)) * d11)) + f15, paint);
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
        mw0 mw0Var;
        if (view != null && canvas != null && LiteMode.isEnabled(32)) {
            int i12 = this.f26896i;
            e0.i0 i0Var = this.f26891a;
            int i13 = 0;
            ArrayList arrayList = this.f26899l;
            if (i0Var != null) {
                int min = Math.min(i12, arrayList.size());
                int dp = AndroidUtilities.dp(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    mw0 mw0Var2 = (mw0) arrayList.get(i14);
                    float f7 = mw0Var2.f26553a;
                    float f10 = mw0Var2.f26554b;
                    int i15 = mw0Var2.f26559j;
                    float f11 = dp / 2.0f;
                    if (i15 != 0) {
                        f11 *= mw0Var2.f26558i;
                    }
                    float f12 = i15 == 0 ? dp : 0.0f;
                    i0Var.e(i14, i0.a.k(this.f26901n, (int) (mw0Var2.f26556f * 255.0f)));
                    e0.i0.a((float[]) i0Var.f7789b, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = dp;
                    e0.i0.a((float[]) i0Var.f7790c, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, i0Var, min, this.f26892b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    mw0 mw0Var3 = (mw0) arrayList.get(i16);
                    nw0 nw0Var = mw0Var3.f26560k;
                    Paint paint = nw0Var.f26893c;
                    if (mw0Var3.f26559j != 0) {
                        Bitmap bitmap = nw0Var.f26897j;
                        Paint paint2 = nw0Var.e;
                        if (bitmap == null) {
                            nw0Var.f26897j = a(false);
                        }
                        paint2.setAlpha((int) (mw0Var3.f26556f * 255.0f));
                        canvas.save();
                        float f14 = mw0Var3.f26558i;
                        canvas.scale(f14, f14, mw0Var3.f26553a, mw0Var3.f26554b);
                        canvas.drawBitmap(nw0Var.f26897j, mw0Var3.f26553a, mw0Var3.f26554b, paint2);
                        canvas.restore();
                    } else {
                        paint.setAlpha((int) (mw0Var3.f26556f * 255.0f));
                        canvas.drawPoint(mw0Var3.f26553a, mw0Var3.f26554b, paint);
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
            ArrayList arrayList2 = this.f26900m;
            if (size2 < i12) {
                int i19 = 0;
                while (i19 < i10) {
                    if (arrayList.size() < i12 && Utilities.random.nextFloat() > 0.7f) {
                        int i20 = AndroidUtilities.statusBarHeight;
                        float nextFloat2 = Utilities.random.nextFloat() * view.getMeasuredWidth();
                        if (i17 == 0) {
                            nextFloat = (Utilities.random.nextFloat() * org.telegram.messenger.l0.B(20.0f, view.getMeasuredHeight(), i20)) + i20;
                        } else {
                            nextFloat = Utilities.random.nextFloat() * view.getMeasuredHeight();
                        }
                        double nextInt = (Utilities.random.nextInt(40) + 70) * 0.017453292519943295d;
                        i11 = i12;
                        float cos = (float) Math.cos(nextInt);
                        float sin = (float) Math.sin(nextInt);
                        if (!arrayList2.isEmpty()) {
                            mw0Var = (mw0) arrayList2.get(0);
                            arrayList2.remove(0);
                        } else {
                            mw0Var = new mw0(this);
                        }
                        mw0Var.f26553a = nextFloat2;
                        mw0Var.f26554b = nextFloat;
                        mw0Var.f26555c = cos;
                        mw0Var.d = sin;
                        mw0Var.f26556f = 0.0f;
                        mw0Var.h = 0.0f;
                        mw0Var.f26558i = Utilities.random.nextFloat() * 1.2f;
                        mw0Var.f26559j = Utilities.random.nextInt(2);
                        if (i17 == 0) {
                            mw0Var.f26557g = Utilities.random.nextInt(100) + 2000;
                        } else {
                            mw0Var.f26557g = Utilities.random.nextInt(2000) + 3000;
                        }
                        mw0Var.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                        arrayList.add(mw0Var);
                    } else {
                        i11 = i12;
                    }
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f26898k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                mw0 mw0Var4 = (mw0) arrayList.get(i13);
                float f15 = mw0Var4.h;
                float f16 = mw0Var4.f26557g;
                if (f15 >= f16) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(mw0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f15 < 200.0f) {
                            mw0Var4.f26556f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                        } else {
                            mw0Var4.f26556f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation((f15 - 200.0f) / (f16 - 200.0f));
                        }
                    } else if (f15 < 200.0f) {
                        mw0Var4.f26556f = AndroidUtilities.accelerateInterpolator.getInterpolation(f15 / 200.0f);
                    } else {
                        float f17 = f16 - f15;
                        if (f17 < 2000.0f) {
                            mw0Var4.f26556f = AndroidUtilities.decelerateInterpolator.getInterpolation(f17 / 2000.0f);
                        }
                    }
                    float f18 = mw0Var4.f26553a;
                    float f19 = mw0Var4.f26555c;
                    float f20 = mw0Var4.e;
                    float f21 = (float) min2;
                    mw0Var4.f26553a = a4.a.A(f19 * f20, f21, 500.0f, f18);
                    mw0Var4.f26554b = (((mw0Var4.d * f20) * f21) / 500.0f) + mw0Var4.f26554b;
                    mw0Var4.h += f21;
                }
                i13++;
                i18 = 40;
            }
            this.f26898k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f26895g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.j6.w0(null, this.f26894f, false) & (-1644826);
        }
        if (this.f26901n != i10) {
            this.f26901n = i10;
            this.f26893c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
