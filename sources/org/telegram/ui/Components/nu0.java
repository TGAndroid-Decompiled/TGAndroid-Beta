package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class nu0 {
    public final a4.k f37912a;
    public final Paint f37913b;
    public final Paint f37914c;
    public final Paint d;
    public int f37917g;
    public final int h;
    public final int f37918i;
    public Bitmap f37919j;
    public long f37920k;
    public int f37923n;
    public final Paint f37915e = new Paint();
    public final int f37916f = org.telegram.ui.ActionBar.n6.A8;
    public final ArrayList f37921l = new ArrayList();
    public final ArrayList f37922m = new ArrayList();

    public nu0(int i7) {
        int i10;
        this.h = i7;
        if (i7 == 0) {
            i10 = 100;
        } else {
            i10 = 300;
        }
        this.f37918i = i10;
        Paint paint = new Paint(1);
        this.f37914c = paint;
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
            this.f37912a = new a4.k(i10);
            this.f37913b = g0.a.a(a(true));
        } else {
            this.f37912a = null;
            this.f37913b = null;
        }
        c();
        for (int i11 = 0; i11 < 20; i11++) {
            this.f37922m.add(new mu0(this));
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
        mu0 mu0Var;
        if (view != null && canvas != null && org.telegram.messenger.pc.e(32)) {
            c();
            int i11 = this.f37918i;
            a4.k kVar = this.f37912a;
            int i12 = 0;
            ArrayList arrayList = this.f37921l;
            if (kVar != null) {
                int min = Math.min(i11, arrayList.size());
                int L = org.telegram.messenger.g0.L(10.0f);
                for (int i13 = 0; i13 < min; i13++) {
                    mu0 mu0Var2 = (mu0) arrayList.get(i13);
                    float f10 = mu0Var2.f37539a;
                    float f11 = mu0Var2.f37540b;
                    int i14 = mu0Var2.f37546j;
                    float f12 = L / 2.0f;
                    if (i14 != 0) {
                        f12 *= mu0Var2.f37545i;
                    }
                    float f13 = i14 == 0 ? L : 0.0f;
                    kVar.s(i13, i0.a.o(this.f37923n, (int) (mu0Var2.f37543f * 255.0f)));
                    a4.k.d((float[]) kVar.f192c, i13, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                    float f14 = L;
                    a4.k.d((float[]) kVar.d, i13, f13, 0.0f, f13 + f14, f14);
                }
                g0.a.b(canvas, kVar, min, this.f37913b);
            } else {
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    mu0 mu0Var3 = (mu0) arrayList.get(i15);
                    nu0 nu0Var = mu0Var3.f37547k;
                    if (mu0Var3.f37546j != 0) {
                        Bitmap bitmap = nu0Var.f37919j;
                        Paint paint = nu0Var.f37915e;
                        if (bitmap == null) {
                            nu0Var.f37919j = a(false);
                        }
                        paint.setAlpha((int) (mu0Var3.f37543f * 255.0f));
                        canvas.save();
                        float f15 = mu0Var3.f37545i;
                        canvas.scale(f15, f15, mu0Var3.f37539a, mu0Var3.f37540b);
                        canvas.drawBitmap(nu0Var.f37919j, mu0Var3.f37539a, mu0Var3.f37540b, paint);
                        canvas.restore();
                    } else {
                        nu0Var.f37914c.setAlpha((int) (mu0Var3.f37543f * 255.0f));
                        canvas.drawPoint(mu0Var3.f37539a, mu0Var3.f37540b, nu0Var.f37914c);
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
            ArrayList arrayList2 = this.f37922m;
            if (size2 < i11) {
                int i18 = 0;
                while (i18 < i7) {
                    if (arrayList.size() < i11) {
                        SecureRandom secureRandom = Utilities.f22875b;
                        if (secureRandom.nextFloat() > 0.7f) {
                            int i19 = org.telegram.messenger.g0.f24220m;
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
                                mu0Var = (mu0) arrayList2.get(0);
                                arrayList2.remove(0);
                            } else {
                                mu0Var = new mu0(this);
                            }
                            mu0Var.f37539a = nextFloat2;
                            mu0Var.f37540b = f16;
                            mu0Var.f37541c = cos;
                            mu0Var.d = sin;
                            mu0Var.f37543f = 0.0f;
                            mu0Var.h = 0.0f;
                            mu0Var.f37545i = secureRandom.nextFloat() * 1.2f;
                            mu0Var.f37546j = secureRandom.nextInt(2);
                            if (i16 == 0) {
                                mu0Var.f37544g = secureRandom.nextInt(100) + 2000;
                            } else {
                                mu0Var.f37544g = secureRandom.nextInt(2000) + 3000;
                            }
                            mu0Var.f37542e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                            arrayList.add(mu0Var);
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
            long min2 = Math.min(17L, currentTimeMillis - this.f37920k);
            int size3 = arrayList.size();
            while (i12 < size3) {
                mu0 mu0Var4 = (mu0) arrayList.get(i12);
                float f17 = mu0Var4.h;
                float f18 = mu0Var4.f37544g;
                if (f17 >= f18) {
                    if (arrayList2.size() < i17) {
                        arrayList2.add(mu0Var4);
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    if (i16 == 0) {
                        if (f17 < 200.0f) {
                            mu0Var4.f37543f = org.telegram.messenger.g0.G.getInterpolation(f17 / 200.0f);
                        } else {
                            mu0Var4.f37543f = 1.0f - org.telegram.messenger.g0.F.getInterpolation((f17 - 200.0f) / (f18 - 200.0f));
                        }
                    } else if (f17 < 200.0f) {
                        mu0Var4.f37543f = org.telegram.messenger.g0.G.getInterpolation(f17 / 200.0f);
                    } else {
                        float f19 = f18 - f17;
                        if (f19 < 2000.0f) {
                            mu0Var4.f37543f = org.telegram.messenger.g0.F.getInterpolation(f19 / 2000.0f);
                        }
                    }
                    float f20 = mu0Var4.f37539a;
                    float f21 = mu0Var4.f37541c;
                    float f22 = mu0Var4.f37542e;
                    float f23 = (float) min2;
                    mu0Var4.f37539a = a8.p0.f(f21 * f22, f23, 500.0f, f20);
                    mu0Var4.f37540b = (((mu0Var4.d * f22) * f23) / 500.0f) + mu0Var4.f37540b;
                    mu0Var4.h += f23;
                }
                i12++;
                i17 = 40;
            }
            this.f37920k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i7 = this.f37917g;
        if (i7 == 0) {
            i7 = org.telegram.ui.ActionBar.n6.x0(null, this.f37916f, false) & (-1644826);
        }
        if (this.f37923n != i7) {
            this.f37923n = i7;
            this.f37914c.setColor(i7);
            this.d.setColor(i7);
        }
    }
}
