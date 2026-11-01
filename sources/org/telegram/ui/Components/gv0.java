package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class gv0 {
    public final cc.f f26552a;
    public final Paint f26553b;
    public final Paint f26554c;
    public final Paint d;
    public int f26556g;
    public final int h;
    public final int f26557i;
    public Bitmap f26558j;
    public long f26559k;
    public int f26562n;
    public final Paint e = new Paint();
    public final int f26555f = org.telegram.ui.ActionBar.t6.A8;
    public final ArrayList f26560l = new ArrayList();
    public final ArrayList f26561m = new ArrayList();

    public gv0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f26557i = i11;
        Paint paint = new Paint(1);
        this.f26554c = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26552a = new cc.f(i11);
            this.f26553b = g0.a.a(a(true));
        } else {
            this.f26552a = null;
            this.f26553b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f26561m.add(new fv0(this));
        }
    }

    public static Bitmap a(boolean z10) {
        int L;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        if (z10) {
            L = org.telegram.messenger.i0.L(20.0f);
        } else {
            L = org.telegram.messenger.i0.L(10.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(L, org.telegram.messenger.i0.L(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float N = org.telegram.messenger.i0.N(2.0f) * 2.0f;
        float f7 = (-org.telegram.messenger.i0.N(0.57f)) * 2.0f;
        float N2 = org.telegram.messenger.i0.N(1.55f) * 2.0f;
        float f10 = 5.0f;
        float L2 = org.telegram.messenger.i0.L(5.0f);
        float L3 = org.telegram.messenger.i0.L(5.0f);
        float f11 = -1.5707964f;
        int i10 = 0;
        while (i10 < 6) {
            double d = f11;
            float f12 = f10;
            float f13 = f11;
            float cos = ((float) Math.cos(d)) * N;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * N;
            float f14 = cos * 0.66f;
            float f15 = 0.66f * sin;
            canvas.drawLine(L2, L3, cos + L2, sin + L3, paint);
            float f16 = L2;
            float f17 = L3;
            double d10 = (float) (d - 1.5707963267948966d);
            double d11 = f7;
            double d12 = N2;
            float f18 = f16 + f14;
            float f19 = f17 + f15;
            canvas.drawLine(f18, f19, f16 + ((float) ((Math.cos(d10) * d11) - (Math.sin(d10) * d12))), ((float) i0.a.c(d10, d12, Math.sin(d10) * d11)) + f17, paint);
            canvas.drawLine(f18, f19, f16 + ((float) (((-Math.cos(d10)) * d11) - (Math.sin(d10) * d12))), ((float) i0.a.c(d10, d12, (-Math.sin(d10)) * d11)) + f17, paint);
            f11 = f13 + 1.0471976f;
            i10++;
            L3 = f17;
            f10 = f12;
            createBitmap = bitmap;
            L2 = f16;
        }
        Bitmap bitmap2 = createBitmap;
        float f20 = f10;
        if (z10) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(f20), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        int i10;
        int i11;
        float nextFloat;
        fv0 fv0Var;
        if (view != null && canvas != null && org.telegram.messenger.tc.e(32)) {
            c();
            int i12 = this.f26557i;
            cc.f fVar = this.f26552a;
            int i13 = 0;
            ArrayList arrayList = this.f26560l;
            if (fVar != null) {
                int min = Math.min(i12, arrayList.size());
                int L = org.telegram.messenger.i0.L(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    fv0 fv0Var2 = (fv0) arrayList.get(i14);
                    float f7 = fv0Var2.f26222a;
                    float f10 = fv0Var2.f26223b;
                    int i15 = fv0Var2.f26228j;
                    float f11 = L / 2.0f;
                    if (i15 != 0) {
                        f11 *= fv0Var2.f26227i;
                    }
                    float f12 = i15 == 0 ? L : 0.0f;
                    fVar.f(i14, i0.b.o(this.f26562n, (int) (fv0Var2.f26225f * 255.0f)));
                    cc.f.a((float[]) fVar.f4117c, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = L;
                    cc.f.a((float[]) fVar.d, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, fVar, min, this.f26553b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    fv0 fv0Var3 = (fv0) arrayList.get(i16);
                    gv0 gv0Var = fv0Var3.f26229k;
                    if (fv0Var3.f26228j != 0) {
                        Bitmap bitmap = gv0Var.f26558j;
                        Paint paint = gv0Var.e;
                        if (bitmap == null) {
                            gv0Var.f26558j = a(false);
                        }
                        paint.setAlpha((int) (fv0Var3.f26225f * 255.0f));
                        canvas.save();
                        float f14 = fv0Var3.f26227i;
                        canvas.scale(f14, f14, fv0Var3.f26222a, fv0Var3.f26223b);
                        canvas.drawBitmap(gv0Var.f26558j, fv0Var3.f26222a, fv0Var3.f26223b, paint);
                        canvas.restore();
                    } else {
                        gv0Var.f26554c.setAlpha((int) (fv0Var3.f26225f * 255.0f));
                        canvas.drawPoint(fv0Var3.f26222a, fv0Var3.f26223b, gv0Var.f26554c);
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
            ArrayList arrayList2 = this.f26561m;
            if (size2 < i12) {
                int i19 = 0;
                while (i19 < i10) {
                    if (arrayList.size() < i12) {
                        SecureRandom secureRandom = Utilities.f14520b;
                        if (secureRandom.nextFloat() > 0.7f) {
                            int i20 = org.telegram.messenger.i0.f16166m;
                            float nextFloat2 = secureRandom.nextFloat() * view.getMeasuredWidth();
                            if (i17 == 0) {
                                nextFloat = (secureRandom.nextFloat() * org.telegram.messenger.m5.z(20.0f, view.getMeasuredHeight(), i20)) + i20;
                            } else {
                                nextFloat = secureRandom.nextFloat() * view.getMeasuredHeight();
                            }
                            float f15 = nextFloat;
                            double nextInt = (secureRandom.nextInt(40) + 70) * 0.017453292519943295d;
                            i11 = i12;
                            float cos = (float) Math.cos(nextInt);
                            float sin = (float) Math.sin(nextInt);
                            if (!arrayList2.isEmpty()) {
                                fv0Var = (fv0) arrayList2.get(0);
                                arrayList2.remove(0);
                            } else {
                                fv0Var = new fv0(this);
                            }
                            fv0Var.f26222a = nextFloat2;
                            fv0Var.f26223b = f15;
                            fv0Var.f26224c = cos;
                            fv0Var.d = sin;
                            fv0Var.f26225f = 0.0f;
                            fv0Var.h = 0.0f;
                            fv0Var.f26227i = secureRandom.nextFloat() * 1.2f;
                            fv0Var.f26228j = secureRandom.nextInt(2);
                            if (i17 == 0) {
                                fv0Var.f26226g = secureRandom.nextInt(100) + 2000;
                            } else {
                                fv0Var.f26226g = secureRandom.nextInt(2000) + 3000;
                            }
                            fv0Var.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                            arrayList.add(fv0Var);
                            i19++;
                            i12 = i11;
                        }
                    }
                    i11 = i12;
                    i19++;
                    i12 = i11;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.f26559k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                fv0 fv0Var4 = (fv0) arrayList.get(i13);
                float f16 = fv0Var4.h;
                float f17 = fv0Var4.f26226g;
                if (f16 >= f17) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(fv0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f16 < 200.0f) {
                            fv0Var4.f26225f = org.telegram.messenger.i0.G.getInterpolation(f16 / 200.0f);
                        } else {
                            fv0Var4.f26225f = 1.0f - org.telegram.messenger.i0.F.getInterpolation((f16 - 200.0f) / (f17 - 200.0f));
                        }
                    } else if (f16 < 200.0f) {
                        fv0Var4.f26225f = org.telegram.messenger.i0.G.getInterpolation(f16 / 200.0f);
                    } else {
                        float f18 = f17 - f16;
                        if (f18 < 2000.0f) {
                            fv0Var4.f26225f = org.telegram.messenger.i0.F.getInterpolation(f18 / 2000.0f);
                        }
                    }
                    float f19 = fv0Var4.f26222a;
                    float f20 = fv0Var4.f26224c;
                    float f21 = fv0Var4.e;
                    float f22 = (float) min2;
                    fv0Var4.f26222a = a1.g.A(f20 * f21, f22, 500.0f, f19);
                    fv0Var4.f26223b = (((fv0Var4.d * f21) * f22) / 500.0f) + fv0Var4.f26223b;
                    fv0Var4.h += f22;
                }
                i13++;
                i18 = 40;
            }
            this.f26559k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f26556g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.t6.x0(null, this.f26555f, false) & (-1644826);
        }
        if (this.f26562n != i10) {
            this.f26562n = i10;
            this.f26554c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
