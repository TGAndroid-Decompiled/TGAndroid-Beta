package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class lu0 {
    public final a4.k f37231a;
    public final Paint f37232b;
    public final Paint f37233c;
    public final Paint d;
    public int f37236g;
    public final int h;
    public final int f37237i;
    public Bitmap f37238j;
    public long f37239k;
    public int f37242n;
    public final Paint f37234e = new Paint();
    public final int f37235f = org.telegram.ui.ActionBar.n6.A8;
    public final ArrayList f37240l = new ArrayList();
    public final ArrayList f37241m = new ArrayList();

    public lu0(int i7) {
        int i10;
        this.h = i7;
        if (i7 == 0) {
            i10 = 100;
        } else {
            i10 = 300;
        }
        this.f37237i = i10;
        Paint paint = new Paint(1);
        this.f37233c = paint;
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
            this.f37231a = new a4.k(i10);
            this.f37232b = ai.d.b(a(true));
        } else {
            this.f37231a = null;
            this.f37232b = null;
        }
        c();
        for (int i11 = 0; i11 < 20; i11++) {
            this.f37241m.add(new ku0(this));
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
        ku0 ku0Var;
        if (view != null && canvas != null && org.telegram.messenger.pc.e(32)) {
            c();
            int i11 = this.f37237i;
            a4.k kVar = this.f37231a;
            int i12 = 0;
            ArrayList arrayList = this.f37240l;
            if (kVar != null) {
                int min = Math.min(i11, arrayList.size());
                int L = org.telegram.messenger.g0.L(10.0f);
                for (int i13 = 0; i13 < min; i13++) {
                    ku0 ku0Var2 = (ku0) arrayList.get(i13);
                    float f10 = ku0Var2.f36881a;
                    float f11 = ku0Var2.f36882b;
                    int i14 = ku0Var2.f36888j;
                    float f12 = L / 2.0f;
                    if (i14 != 0) {
                        f12 *= ku0Var2.f36887i;
                    }
                    float f13 = i14 == 0 ? L : 0.0f;
                    kVar.s(i13, i0.a.o(this.f37242n, (int) (ku0Var2.f36885f * 255.0f)));
                    a4.k.d((float[]) kVar.f192c, i13, f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                    float f14 = L;
                    a4.k.d((float[]) kVar.d, i13, f13, 0.0f, f13 + f14, f14);
                }
                ai.d.c(canvas, kVar, min, this.f37232b);
            } else {
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    ku0 ku0Var3 = (ku0) arrayList.get(i15);
                    lu0 lu0Var = ku0Var3.f36889k;
                    if (ku0Var3.f36888j != 0) {
                        Bitmap bitmap = lu0Var.f37238j;
                        Paint paint = lu0Var.f37234e;
                        if (bitmap == null) {
                            lu0Var.f37238j = a(false);
                        }
                        paint.setAlpha((int) (ku0Var3.f36885f * 255.0f));
                        canvas.save();
                        float f15 = ku0Var3.f36887i;
                        canvas.scale(f15, f15, ku0Var3.f36881a, ku0Var3.f36882b);
                        canvas.drawBitmap(lu0Var.f37238j, ku0Var3.f36881a, ku0Var3.f36882b, paint);
                        canvas.restore();
                    } else {
                        lu0Var.f37233c.setAlpha((int) (ku0Var3.f36885f * 255.0f));
                        canvas.drawPoint(ku0Var3.f36881a, ku0Var3.f36882b, lu0Var.f37233c);
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
            ArrayList arrayList2 = this.f37241m;
            if (size2 < i11) {
                int i18 = 0;
                while (i18 < i7) {
                    if (arrayList.size() < i11) {
                        SecureRandom secureRandom = Utilities.f22777b;
                        if (secureRandom.nextFloat() > 0.7f) {
                            int i19 = org.telegram.messenger.g0.f24112m;
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
                                ku0Var = (ku0) arrayList2.get(0);
                                arrayList2.remove(0);
                            } else {
                                ku0Var = new ku0(this);
                            }
                            ku0Var.f36881a = nextFloat2;
                            ku0Var.f36882b = f16;
                            ku0Var.f36883c = cos;
                            ku0Var.d = sin;
                            ku0Var.f36885f = 0.0f;
                            ku0Var.h = 0.0f;
                            ku0Var.f36887i = secureRandom.nextFloat() * 1.2f;
                            ku0Var.f36888j = secureRandom.nextInt(2);
                            if (i16 == 0) {
                                ku0Var.f36886g = secureRandom.nextInt(100) + 2000;
                            } else {
                                ku0Var.f36886g = secureRandom.nextInt(2000) + 3000;
                            }
                            ku0Var.f36884e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                            arrayList.add(ku0Var);
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
            long min2 = Math.min(17L, currentTimeMillis - this.f37239k);
            int size3 = arrayList.size();
            while (i12 < size3) {
                ku0 ku0Var4 = (ku0) arrayList.get(i12);
                float f17 = ku0Var4.h;
                float f18 = ku0Var4.f36886g;
                if (f17 >= f18) {
                    if (arrayList2.size() < i17) {
                        arrayList2.add(ku0Var4);
                    }
                    arrayList.remove(i12);
                    i12--;
                    size3--;
                } else {
                    if (i16 == 0) {
                        if (f17 < 200.0f) {
                            ku0Var4.f36885f = org.telegram.messenger.g0.G.getInterpolation(f17 / 200.0f);
                        } else {
                            ku0Var4.f36885f = 1.0f - org.telegram.messenger.g0.F.getInterpolation((f17 - 200.0f) / (f18 - 200.0f));
                        }
                    } else if (f17 < 200.0f) {
                        ku0Var4.f36885f = org.telegram.messenger.g0.G.getInterpolation(f17 / 200.0f);
                    } else {
                        float f19 = f18 - f17;
                        if (f19 < 2000.0f) {
                            ku0Var4.f36885f = org.telegram.messenger.g0.F.getInterpolation(f19 / 2000.0f);
                        }
                    }
                    float f20 = ku0Var4.f36881a;
                    float f21 = ku0Var4.f36883c;
                    float f22 = ku0Var4.f36884e;
                    float f23 = (float) min2;
                    ku0Var4.f36881a = a8.p0.f(f21 * f22, f23, 500.0f, f20);
                    ku0Var4.f36882b = (((ku0Var4.d * f22) * f23) / 500.0f) + ku0Var4.f36882b;
                    ku0Var4.h += f23;
                }
                i12++;
                i17 = 40;
            }
            this.f37239k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i7 = this.f37236g;
        if (i7 == 0) {
            i7 = org.telegram.ui.ActionBar.n6.x0(null, this.f37235f, false) & (-1644826);
        }
        if (this.f37242n != i7) {
            this.f37242n = i7;
            this.f37233c.setColor(i7);
            this.d.setColor(i7);
        }
    }
}
