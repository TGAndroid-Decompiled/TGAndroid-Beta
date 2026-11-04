package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class bu0 {
    public final e0.e0 f32396a;
    public final Paint f32397b;
    public final Paint f32398c;
    public final Paint d;
    public int f32401g;
    public final int h;
    public final int f32402i;
    public Bitmap f32403j;
    public long f32404k;
    public int f32407n;
    public final Paint f32399e = new Paint();
    public final int f32400f = org.telegram.ui.ActionBar.k6.A8;
    public final ArrayList f32405l = new ArrayList();
    public final ArrayList f32406m = new ArrayList();

    public bu0(int i3) {
        int i10;
        this.h = i3;
        if (i3 == 0) {
            i10 = 100;
        } else {
            i10 = 300;
        }
        this.f32402i = i10;
        Paint paint = new Paint(1);
        this.f32398c = paint;
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
            this.f32396a = new e0.e0(i10);
            this.f32397b = g0.a.a(a(true));
        } else {
            this.f32396a = null;
            this.f32397b = null;
        }
        c();
        for (int i11 = 0; i11 < 20; i11++) {
            this.f32406m.add(new au0(this));
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
        int i3 = 0;
        while (i3 < 6) {
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
            double d10 = (float) (d - 1.5707963267948966d);
            double d11 = f10;
            double d12 = N2;
            float f19 = f17 + f15;
            float f20 = f18 + f16;
            canvas.drawLine(f19, f20, f17 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) k2.p1.c(d10, d12, Math.sin(d10) * d11)) + f18, paint);
            canvas.drawLine(f19, f20, f17 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) k2.p1.c(d10, d12, (-Math.sin(d10)) * d11)) + f18, paint);
            f12 = f14 + 1.0471976f;
            i3++;
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
        int i3;
        int i10;
        float nextFloat;
        au0 au0Var;
        if (view != null && canvas != null && org.telegram.messenger.lc.e(32)) {
            c();
            int i11 = this.f32402i;
            e0.e0 e0Var = this.f32396a;
            int i12 = 0;
            ArrayList arrayList = this.f32405l;
            if (e0Var != null) {
                int min = Math.min(i11, arrayList.size());
                int L = org.telegram.messenger.g0.L(10.0f);
                for (int i13 = 0; i13 < min; i13++) {
                    au0 au0Var2 = (au0) arrayList.get(i13);
                    float f10 = au0Var2.f31989a;
                    float f11 = au0Var2.f31990b;
                    int i14 = au0Var2.f31996j;
                    float f12 = L / 2.0f;
                    if (i14 != 0) {
                        f12 *= au0Var2.f31995i;
                    }
                    float f13 = i14 == 0 ? L : 0.0f;
                    e0Var.t(i13, i0.a.o(this.f32407n, (int) (au0Var2.f31993f * 255.0f)));
                    e0.e0.d((float[]) e0Var.f9226c, i13, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                    float f14 = L;
                    e0.e0.d((float[]) e0Var.d, i13, f13, 0.0f, f13 + f14, f14);
                }
                g0.a.b(canvas, e0Var, min, this.f32397b);
            } else {
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    au0 au0Var3 = (au0) arrayList.get(i15);
                    bu0 bu0Var = au0Var3.f31997k;
                    if (au0Var3.f31996j != 0) {
                        Bitmap bitmap = bu0Var.f32403j;
                        Paint paint = bu0Var.f32399e;
                        if (bitmap == null) {
                            bu0Var.f32403j = a(false);
                        }
                        paint.setAlpha((int) (au0Var3.f31993f * 255.0f));
                        canvas.save();
                        float f15 = au0Var3.f31995i;
                        canvas.scale(f15, f15, au0Var3.f31989a, au0Var3.f31990b);
                        canvas.drawBitmap(bu0Var.f32403j, au0Var3.f31989a, au0Var3.f31990b, paint);
                        canvas.restore();
                    } else {
                        bu0Var.f32398c.setAlpha((int) (au0Var3.f31993f * 255.0f));
                        canvas.drawPoint(au0Var3.f31989a, au0Var3.f31990b, bu0Var.f32398c);
                    }
                }
            }
            int i16 = this.h;
            if (i16 == 0) {
                i3 = 1;
            } else {
                i3 = 10;
            }
            int size2 = arrayList.size();
            int i17 = 40;
            ArrayList arrayList2 = this.f32406m;
            if (size2 < i11) {
                int i18 = 0;
                while (i18 < i3) {
                    if (arrayList.size() < i11) {
                        SecureRandom secureRandom = Utilities.f21385b;
                        if (secureRandom.nextFloat() > 0.7f) {
                            int i19 = org.telegram.messenger.g0.f22602m;
                            float nextFloat2 = secureRandom.nextFloat() * view.getMeasuredWidth();
                            if (i16 == 0) {
                                nextFloat = (secureRandom.nextFloat() * org.telegram.messenger.k5.z(20.0f, view.getMeasuredHeight(), i19)) + i19;
                            } else {
                                nextFloat = secureRandom.nextFloat() * view.getMeasuredHeight();
                            }
                            float f16 = nextFloat;
                            double nextInt = (secureRandom.nextInt(40) + 70) * 0.017453292519943295d;
                            i10 = i11;
                            float cos = (float) Math.cos(nextInt);
                            float sin = (float) Math.sin(nextInt);
                            if (!arrayList2.isEmpty()) {
                                au0Var = (au0) arrayList2.get(0);
                                arrayList2.remove(0);
                            } else {
                                au0Var = new au0(this);
                            }
                            au0Var.f31989a = nextFloat2;
                            au0Var.f31990b = f16;
                            au0Var.f31991c = cos;
                            au0Var.d = sin;
                            au0Var.f31993f = 0.0f;
                            au0Var.h = 0.0f;
                            au0Var.f31995i = secureRandom.nextFloat() * 1.2f;
                            au0Var.f31996j = secureRandom.nextInt(2);
                            if (i16 == 0) {
                                au0Var.f31994g = secureRandom.nextInt(100) + 2000;
                            } else {
                                au0Var.f31994g = secureRandom.nextInt(2000) + 3000;
                            }
                            au0Var.f31992e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                            arrayList.add(au0Var);
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
            long min2 = Math.min(17L, currentTimeMillis - this.f32404k);
            int size3 = arrayList.size();
            while (i12 < size3) {
                au0 au0Var4 = (au0) arrayList.get(i12);
                float f17 = au0Var4.h;
                float f18 = au0Var4.f31994g;
                if (f17 >= f18) {
                    if (arrayList2.size() < i17) {
                        arrayList2.add(au0Var4);
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    if (i16 == 0) {
                        if (f17 < 200.0f) {
                            au0Var4.f31993f = org.telegram.messenger.g0.G.getInterpolation(f17 / 200.0f);
                        } else {
                            au0Var4.f31993f = 1.0f - org.telegram.messenger.g0.F.getInterpolation((f17 - 200.0f) / (f18 - 200.0f));
                        }
                    } else if (f17 < 200.0f) {
                        au0Var4.f31993f = org.telegram.messenger.g0.G.getInterpolation(f17 / 200.0f);
                    } else {
                        float f19 = f18 - f17;
                        if (f19 < 2000.0f) {
                            au0Var4.f31993f = org.telegram.messenger.g0.F.getInterpolation(f19 / 2000.0f);
                        }
                    }
                    float f20 = au0Var4.f31989a;
                    float f21 = au0Var4.f31991c;
                    float f22 = au0Var4.f31992e;
                    float f23 = (float) min2;
                    au0Var4.f31989a = a1.g.e(f21 * f22, f23, 500.0f, f20);
                    au0Var4.f31990b = (((au0Var4.d * f22) * f23) / 500.0f) + au0Var4.f31990b;
                    au0Var4.h += f23;
                }
                i12++;
                i17 = 40;
            }
            this.f32404k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i3 = this.f32401g;
        if (i3 == 0) {
            i3 = org.telegram.ui.ActionBar.k6.x0(null, this.f32400f, false) & (-1644826);
        }
        if (this.f32407n != i3) {
            this.f32407n = i3;
            this.f32398c.setColor(i3);
            this.d.setColor(i3);
        }
    }
}
