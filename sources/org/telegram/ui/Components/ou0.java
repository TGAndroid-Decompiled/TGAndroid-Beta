package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ou0 {
    public final a4.k f38354a;
    public final Paint f38355b;
    public final Paint f38356c;
    public final Paint d;
    public int f38359g;
    public final int h;
    public final int f38360i;
    public Bitmap f38361j;
    public long f38362k;
    public int f38365n;
    public final Paint f38357e = new Paint();
    public final int f38358f = org.telegram.ui.ActionBar.m6.A8;
    public final ArrayList f38363l = new ArrayList();
    public final ArrayList f38364m = new ArrayList();

    public ou0(int i7) {
        int i10;
        this.h = i7;
        if (i7 == 0) {
            i10 = 100;
        } else {
            i10 = 300;
        }
        this.f38360i = i10;
        Paint paint = new Paint(1);
        this.f38356c = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f38354a = new a4.k(i10);
            this.f38355b = ai.d.c(a(true));
        } else {
            this.f38354a = null;
            this.f38355b = null;
        }
        c();
        for (int i11 = 0; i11 < 20; i11++) {
            this.f38364m.add(new nu0(this));
        }
    }

    public static Bitmap a(boolean z10) {
        int L;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        if (z10) {
            L = org.telegram.messenger.g0.L(20.0f);
        } else {
            L = org.telegram.messenger.g0.L(10.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(L, org.telegram.messenger.g0.L(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float N = org.telegram.messenger.g0.N(2.0f) * 2.0f;
        float f10 = (-org.telegram.messenger.g0.N(0.57f)) * 2.0f;
        float N2 = org.telegram.messenger.g0.N(1.55f) * 2.0f;
        float f11 = 5.0f;
        float L2 = org.telegram.messenger.g0.L(5.0f);
        float L3 = org.telegram.messenger.g0.L(5.0f);
        float f12 = -1.5707964f;
        int i7 = 0;
        while (i7 < 6) {
            double d = f12;
            float f13 = f11;
            float f14 = f12;
            float cos = ((float) Math.cos(d)) * N;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * N;
            float f15 = cos * 0.66f;
            float f16 = 0.66f * sin;
            canvas.drawLine(L2, L3, cos + L2, sin + L3, paint);
            float f17 = L2;
            float f18 = L3;
            double d2 = (float) (d - 1.5707963267948966d);
            double d10 = f10;
            double d11 = N2;
            float f19 = f17 + f15;
            float f20 = f18 + f16;
            canvas.drawLine(f19, f20, f17 + ((float) ((Math.cos(d2) * d10) - (Math.sin(d2) * d11))), ((float) i5.c.c(d2, d11, Math.sin(d2) * d10)) + f18, paint);
            canvas.drawLine(f19, f20, f17 + ((float) (((-Math.cos(d2)) * d10) - (Math.sin(d2) * d11))), ((float) i5.c.c(d2, d11, (-Math.sin(d2)) * d10)) + f18, paint);
            f12 = f14 + 1.0471976f;
            i7++;
            L3 = f18;
            f11 = f13;
            createBitmap = bitmap;
            L2 = f17;
        }
        Bitmap bitmap2 = createBitmap;
        float f21 = f11;
        if (z10) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(f21), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        int i7;
        int i10;
        float nextFloat;
        nu0 nu0Var;
        if (view != null && canvas != null && org.telegram.messenger.qc.e(32)) {
            c();
            int i11 = this.f38360i;
            a4.k kVar = this.f38354a;
            int i12 = 0;
            ArrayList arrayList = this.f38363l;
            if (kVar != null) {
                int min = Math.min(i11, arrayList.size());
                int L = org.telegram.messenger.g0.L(10.0f);
                for (int i13 = 0; i13 < min; i13++) {
                    nu0 nu0Var2 = (nu0) arrayList.get(i13);
                    float f10 = nu0Var2.f37980a;
                    float f11 = nu0Var2.f37981b;
                    int i14 = nu0Var2.f37987j;
                    float f12 = L / 2.0f;
                    if (i14 != 0) {
                        f12 *= nu0Var2.f37986i;
                    }
                    float f13 = i14 == 0 ? L : 0.0f;
                    kVar.s(i13, i0.a.o(this.f38365n, (int) (nu0Var2.f37984f * 255.0f)));
                    a4.k.d((float[]) kVar.f192c, i13, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                    float f14 = L;
                    a4.k.d((float[]) kVar.d, i13, f13, 0.0f, f13 + f14, f14);
                }
                ai.d.d(canvas, kVar, min, this.f38355b);
            } else {
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    nu0 nu0Var3 = (nu0) arrayList.get(i15);
                    ou0 ou0Var = nu0Var3.f37988k;
                    if (nu0Var3.f37987j != 0) {
                        Bitmap bitmap = ou0Var.f38361j;
                        Paint paint = ou0Var.f38357e;
                        if (bitmap == null) {
                            ou0Var.f38361j = a(false);
                        }
                        paint.setAlpha((int) (nu0Var3.f37984f * 255.0f));
                        canvas.save();
                        float f15 = nu0Var3.f37986i;
                        canvas.scale(f15, f15, nu0Var3.f37980a, nu0Var3.f37981b);
                        canvas.drawBitmap(ou0Var.f38361j, nu0Var3.f37980a, nu0Var3.f37981b, paint);
                        canvas.restore();
                    } else {
                        ou0Var.f38356c.setAlpha((int) (nu0Var3.f37984f * 255.0f));
                        canvas.drawPoint(nu0Var3.f37980a, nu0Var3.f37981b, ou0Var.f38356c);
                    }
                }
            }
            int i16 = this.h;
            if (i16 == 0) {
                i7 = 1;
            } else {
                i7 = 10;
            }
            int size2 = arrayList.size();
            int i17 = 40;
            ArrayList arrayList2 = this.f38364m;
            if (size2 < i11) {
                int i18 = 0;
                while (i18 < i7) {
                    if (arrayList.size() < i11) {
                        SecureRandom secureRandom = Utilities.f22808b;
                        if (secureRandom.nextFloat() > 0.7f) {
                            int i19 = org.telegram.messenger.g0.f24040m;
                            float nextFloat2 = secureRandom.nextFloat() * view.getMeasuredWidth();
                            if (i16 == 0) {
                                nextFloat = (secureRandom.nextFloat() * org.telegram.messenger.f3.z(20.0f, view.getMeasuredHeight(), i19)) + i19;
                            } else {
                                nextFloat = secureRandom.nextFloat() * view.getMeasuredHeight();
                            }
                            float f16 = nextFloat;
                            double nextInt = (secureRandom.nextInt(40) + 70) * 0.017453292519943295d;
                            i10 = i11;
                            float cos = (float) Math.cos(nextInt);
                            float sin = (float) Math.sin(nextInt);
                            if (!arrayList2.isEmpty()) {
                                nu0Var = (nu0) arrayList2.get(0);
                                arrayList2.remove(0);
                            } else {
                                nu0Var = new nu0(this);
                            }
                            nu0Var.f37980a = nextFloat2;
                            nu0Var.f37981b = f16;
                            nu0Var.f37982c = cos;
                            nu0Var.d = sin;
                            nu0Var.f37984f = 0.0f;
                            nu0Var.h = 0.0f;
                            nu0Var.f37986i = secureRandom.nextFloat() * 1.2f;
                            nu0Var.f37987j = secureRandom.nextInt(2);
                            if (i16 == 0) {
                                nu0Var.f37985g = secureRandom.nextInt(100) + 2000;
                            } else {
                                nu0Var.f37985g = secureRandom.nextInt(2000) + 3000;
                            }
                            nu0Var.f37983e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                            arrayList.add(nu0Var);
                            i18++;
                            i11 = i10;
                        }
                    }
                    i10 = i11;
                    i18++;
                    i11 = i10;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f38362k);
            int size3 = arrayList.size();
            while (i12 < size3) {
                nu0 nu0Var4 = (nu0) arrayList.get(i12);
                float f17 = nu0Var4.h;
                float f18 = nu0Var4.f37985g;
                if (f17 >= f18) {
                    if (arrayList2.size() < i17) {
                        arrayList2.add(nu0Var4);
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    if (i16 == 0) {
                        if (f17 < 200.0f) {
                            nu0Var4.f37984f = org.telegram.messenger.g0.G.getInterpolation(f17 / 200.0f);
                        } else {
                            nu0Var4.f37984f = 1.0f - org.telegram.messenger.g0.F.getInterpolation((f17 - 200.0f) / (f18 - 200.0f));
                        }
                    } else if (f17 < 200.0f) {
                        nu0Var4.f37984f = org.telegram.messenger.g0.G.getInterpolation(f17 / 200.0f);
                    } else {
                        float f19 = f18 - f17;
                        if (f19 < 2000.0f) {
                            nu0Var4.f37984f = org.telegram.messenger.g0.F.getInterpolation(f19 / 2000.0f);
                        }
                    }
                    float f20 = nu0Var4.f37980a;
                    float f21 = nu0Var4.f37982c;
                    float f22 = nu0Var4.f37983e;
                    float f23 = (float) min2;
                    nu0Var4.f37980a = a8.p0.f(f21 * f22, f23, 500.0f, f20);
                    nu0Var4.f37981b = (((nu0Var4.d * f22) * f23) / 500.0f) + nu0Var4.f37981b;
                    nu0Var4.h += f23;
                }
                i12++;
                i17 = 40;
            }
            this.f38362k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i7 = this.f38359g;
        if (i7 == 0) {
            i7 = org.telegram.ui.ActionBar.m6.x0(null, this.f38358f, false) & (-1644826);
        }
        if (this.f38365n != i7) {
            this.f38365n = i7;
            this.f38356c.setColor(i7);
            this.d.setColor(i7);
        }
    }
}
