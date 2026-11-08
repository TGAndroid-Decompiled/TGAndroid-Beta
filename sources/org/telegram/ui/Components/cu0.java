package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class cu0 {
    public final a4.k f32681a;
    public final Paint f32682b;
    public final Paint f32683c;
    public final Paint d;
    public int f32686g;
    public final int h;
    public final int f32687i;
    public Bitmap f32688j;
    public long f32689k;
    public int f32692n;
    public final Paint f32684e = new Paint();
    public final int f32685f = org.telegram.ui.ActionBar.k6.A8;
    public final ArrayList f32690l = new ArrayList();
    public final ArrayList f32691m = new ArrayList();

    public cu0(int i7) {
        int i10;
        this.h = i7;
        if (i7 == 0) {
            i10 = 100;
        } else {
            i10 = 300;
        }
        this.f32687i = i10;
        Paint paint = new Paint(1);
        this.f32683c = paint;
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
            this.f32681a = new a4.k(i10);
            this.f32682b = g0.a.a(a(true));
        } else {
            this.f32681a = null;
            this.f32682b = null;
        }
        c();
        for (int i11 = 0; i11 < 20; i11++) {
            this.f32691m.add(new bu0(this));
        }
    }

    public static Bitmap a(boolean z9) {
        int L;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        if (z9) {
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
            canvas.drawLine(f19, f20, f17 + ((float) ((Math.cos(d2) * d10) - (Math.sin(d2) * d11))), ((float) jg.g.d(d2, d11, Math.sin(d2) * d10)) + f18, paint);
            canvas.drawLine(f19, f20, f17 + ((float) (((-Math.cos(d2)) * d10) - (Math.sin(d2) * d11))), ((float) jg.g.d(d2, d11, (-Math.sin(d2)) * d10)) + f18, paint);
            f12 = f14 + 1.0471976f;
            i7++;
            L3 = f18;
            f11 = f13;
            createBitmap = bitmap;
            L2 = f17;
        }
        Bitmap bitmap2 = createBitmap;
        float f21 = f11;
        if (z9) {
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
        bu0 bu0Var;
        if (view != null && canvas != null && org.telegram.messenger.sc.e(32)) {
            c();
            int i11 = this.f32687i;
            a4.k kVar = this.f32681a;
            int i12 = 0;
            ArrayList arrayList = this.f32690l;
            if (kVar != null) {
                int min = Math.min(i11, arrayList.size());
                int L = org.telegram.messenger.g0.L(10.0f);
                for (int i13 = 0; i13 < min; i13++) {
                    bu0 bu0Var2 = (bu0) arrayList.get(i13);
                    float f10 = bu0Var2.f32352a;
                    float f11 = bu0Var2.f32353b;
                    int i14 = bu0Var2.f32359j;
                    float f12 = L / 2.0f;
                    if (i14 != 0) {
                        f12 *= bu0Var2.f32358i;
                    }
                    float f13 = i14 == 0 ? L : 0.0f;
                    kVar.t(i13, i0.a.o(this.f32692n, (int) (bu0Var2.f32356f * 255.0f)));
                    a4.k.d((float[]) kVar.f192c, i13, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                    float f14 = L;
                    a4.k.d((float[]) kVar.d, i13, f13, 0.0f, f13 + f14, f14);
                }
                g0.a.b(canvas, kVar, min, this.f32682b);
            } else {
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    bu0 bu0Var3 = (bu0) arrayList.get(i15);
                    cu0 cu0Var = bu0Var3.f32360k;
                    if (bu0Var3.f32359j != 0) {
                        Bitmap bitmap = cu0Var.f32688j;
                        Paint paint = cu0Var.f32684e;
                        if (bitmap == null) {
                            cu0Var.f32688j = a(false);
                        }
                        paint.setAlpha((int) (bu0Var3.f32356f * 255.0f));
                        canvas.save();
                        float f15 = bu0Var3.f32358i;
                        canvas.scale(f15, f15, bu0Var3.f32352a, bu0Var3.f32353b);
                        canvas.drawBitmap(cu0Var.f32688j, bu0Var3.f32352a, bu0Var3.f32353b, paint);
                        canvas.restore();
                    } else {
                        cu0Var.f32683c.setAlpha((int) (bu0Var3.f32356f * 255.0f));
                        canvas.drawPoint(bu0Var3.f32352a, bu0Var3.f32353b, cu0Var.f32683c);
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
            ArrayList arrayList2 = this.f32691m;
            if (size2 < i11) {
                int i18 = 0;
                while (i18 < i7) {
                    if (arrayList.size() < i11) {
                        SecureRandom secureRandom = Utilities.f21334b;
                        if (secureRandom.nextFloat() > 0.7f) {
                            int i19 = org.telegram.messenger.g0.f22557m;
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
                                bu0Var = (bu0) arrayList2.get(0);
                                arrayList2.remove(0);
                            } else {
                                bu0Var = new bu0(this);
                            }
                            bu0Var.f32352a = nextFloat2;
                            bu0Var.f32353b = f16;
                            bu0Var.f32354c = cos;
                            bu0Var.d = sin;
                            bu0Var.f32356f = 0.0f;
                            bu0Var.h = 0.0f;
                            bu0Var.f32358i = secureRandom.nextFloat() * 1.2f;
                            bu0Var.f32359j = secureRandom.nextInt(2);
                            if (i16 == 0) {
                                bu0Var.f32357g = secureRandom.nextInt(100) + 2000;
                            } else {
                                bu0Var.f32357g = secureRandom.nextInt(2000) + 3000;
                            }
                            bu0Var.f32355e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                            arrayList.add(bu0Var);
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
            long min2 = Math.min(17L, currentTimeMillis - this.f32689k);
            int size3 = arrayList.size();
            while (i12 < size3) {
                bu0 bu0Var4 = (bu0) arrayList.get(i12);
                float f17 = bu0Var4.h;
                float f18 = bu0Var4.f32357g;
                if (f17 >= f18) {
                    if (arrayList2.size() < i17) {
                        arrayList2.add(bu0Var4);
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    if (i16 == 0) {
                        if (f17 < 200.0f) {
                            bu0Var4.f32356f = org.telegram.messenger.g0.G.getInterpolation(f17 / 200.0f);
                        } else {
                            bu0Var4.f32356f = 1.0f - org.telegram.messenger.g0.F.getInterpolation((f17 - 200.0f) / (f18 - 200.0f));
                        }
                    } else if (f17 < 200.0f) {
                        bu0Var4.f32356f = org.telegram.messenger.g0.G.getInterpolation(f17 / 200.0f);
                    } else {
                        float f19 = f18 - f17;
                        if (f19 < 2000.0f) {
                            bu0Var4.f32356f = org.telegram.messenger.g0.F.getInterpolation(f19 / 2000.0f);
                        }
                    }
                    float f20 = bu0Var4.f32352a;
                    float f21 = bu0Var4.f32354c;
                    float f22 = bu0Var4.f32355e;
                    float f23 = (float) min2;
                    bu0Var4.f32352a = a8.p0.f(f21 * f22, f23, 500.0f, f20);
                    bu0Var4.f32353b = (((bu0Var4.d * f22) * f23) / 500.0f) + bu0Var4.f32353b;
                    bu0Var4.h += f23;
                }
                i12++;
                i17 = 40;
            }
            this.f32689k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i7 = this.f32686g;
        if (i7 == 0) {
            i7 = org.telegram.ui.ActionBar.k6.x0(null, this.f32685f, false) & (-1644826);
        }
        if (this.f32692n != i7) {
            this.f32692n = i7;
            this.f32683c.setColor(i7);
            this.d.setColor(i7);
        }
    }
}
