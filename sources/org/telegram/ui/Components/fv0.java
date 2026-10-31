package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class fv0 {
    public final cc.f f26139a;
    public final Paint f26140b;
    public final Paint f26141c;
    public final Paint d;
    public int f26143g;
    public final int h;
    public final int f26144i;
    public Bitmap f26145j;
    public long f26146k;
    public int f26149n;
    public final Paint e = new Paint();
    public final int f26142f = org.telegram.ui.ActionBar.t6.A8;
    public final ArrayList f26147l = new ArrayList();
    public final ArrayList f26148m = new ArrayList();

    public fv0(int i10) {
        int i11;
        this.h = i10;
        if (i10 == 0) {
            i11 = 100;
        } else {
            i11 = 300;
        }
        this.f26144i = i11;
        Paint paint = new Paint(1);
        this.f26141c = paint;
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
            this.f26139a = new cc.f(i11);
            this.f26140b = g0.a.a(a(true));
        } else {
            this.f26139a = null;
            this.f26140b = null;
        }
        c();
        for (int i12 = 0; i12 < 20; i12++) {
            this.f26148m.add(new ev0(this));
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
        ev0 ev0Var;
        if (view != null && canvas != null && org.telegram.messenger.sc.e(32)) {
            c();
            int i12 = this.f26144i;
            cc.f fVar = this.f26139a;
            int i13 = 0;
            ArrayList arrayList = this.f26147l;
            if (fVar != null) {
                int min = Math.min(i12, arrayList.size());
                int L = org.telegram.messenger.i0.L(10.0f);
                for (int i14 = 0; i14 < min; i14++) {
                    ev0 ev0Var2 = (ev0) arrayList.get(i14);
                    float f7 = ev0Var2.f25869a;
                    float f10 = ev0Var2.f25870b;
                    int i15 = ev0Var2.f25875j;
                    float f11 = L / 2.0f;
                    if (i15 != 0) {
                        f11 *= ev0Var2.f25874i;
                    }
                    float f12 = i15 == 0 ? L : 0.0f;
                    fVar.f(i14, i0.b.o(this.f26149n, (int) (ev0Var2.f25872f * 255.0f)));
                    cc.f.a((float[]) fVar.f4117c, i14, f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                    float f13 = L;
                    cc.f.a((float[]) fVar.d, i14, f12, 0.0f, f12 + f13, f13);
                }
                g0.a.b(canvas, fVar, min, this.f26140b);
            } else {
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    ev0 ev0Var3 = (ev0) arrayList.get(i16);
                    fv0 fv0Var = ev0Var3.f25876k;
                    if (ev0Var3.f25875j != 0) {
                        Bitmap bitmap = fv0Var.f26145j;
                        Paint paint = fv0Var.e;
                        if (bitmap == null) {
                            fv0Var.f26145j = a(false);
                        }
                        paint.setAlpha((int) (ev0Var3.f25872f * 255.0f));
                        canvas.save();
                        float f14 = ev0Var3.f25874i;
                        canvas.scale(f14, f14, ev0Var3.f25869a, ev0Var3.f25870b);
                        canvas.drawBitmap(fv0Var.f26145j, ev0Var3.f25869a, ev0Var3.f25870b, paint);
                        canvas.restore();
                    } else {
                        fv0Var.f26141c.setAlpha((int) (ev0Var3.f25872f * 255.0f));
                        canvas.drawPoint(ev0Var3.f25869a, ev0Var3.f25870b, fv0Var.f26141c);
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
            ArrayList arrayList2 = this.f26148m;
            if (size2 < i12) {
                int i19 = 0;
                while (i19 < i10) {
                    if (arrayList.size() < i12) {
                        SecureRandom secureRandom = Utilities.f14519b;
                        if (secureRandom.nextFloat() > 0.7f) {
                            int i20 = org.telegram.messenger.i0.f16020m;
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
                                ev0Var = (ev0) arrayList2.get(0);
                                arrayList2.remove(0);
                            } else {
                                ev0Var = new ev0(this);
                            }
                            ev0Var.f25869a = nextFloat2;
                            ev0Var.f25870b = f15;
                            ev0Var.f25871c = cos;
                            ev0Var.d = sin;
                            ev0Var.f25872f = 0.0f;
                            ev0Var.h = 0.0f;
                            ev0Var.f25874i = secureRandom.nextFloat() * 1.2f;
                            ev0Var.f25875j = secureRandom.nextInt(2);
                            if (i17 == 0) {
                                ev0Var.f25873g = secureRandom.nextInt(100) + 2000;
                            } else {
                                ev0Var.f25873g = secureRandom.nextInt(2000) + 3000;
                            }
                            ev0Var.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                            arrayList.add(ev0Var);
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
            long min2 = Math.min(17L, currentTimeMillis - this.f26146k);
            int size3 = arrayList.size();
            while (i13 < size3) {
                ev0 ev0Var4 = (ev0) arrayList.get(i13);
                float f16 = ev0Var4.h;
                float f17 = ev0Var4.f25873g;
                if (f16 >= f17) {
                    if (arrayList2.size() < i18) {
                        arrayList2.add(ev0Var4);
                    }
                    arrayList.remove(i13);
                    i13--;
                    size3--;
                } else {
                    if (i17 == 0) {
                        if (f16 < 200.0f) {
                            ev0Var4.f25872f = org.telegram.messenger.i0.G.getInterpolation(f16 / 200.0f);
                        } else {
                            ev0Var4.f25872f = 1.0f - org.telegram.messenger.i0.F.getInterpolation((f16 - 200.0f) / (f17 - 200.0f));
                        }
                    } else if (f16 < 200.0f) {
                        ev0Var4.f25872f = org.telegram.messenger.i0.G.getInterpolation(f16 / 200.0f);
                    } else {
                        float f18 = f17 - f16;
                        if (f18 < 2000.0f) {
                            ev0Var4.f25872f = org.telegram.messenger.i0.F.getInterpolation(f18 / 2000.0f);
                        }
                    }
                    float f19 = ev0Var4.f25869a;
                    float f20 = ev0Var4.f25871c;
                    float f21 = ev0Var4.e;
                    float f22 = (float) min2;
                    ev0Var4.f25869a = a1.g.A(f20 * f21, f22, 500.0f, f19);
                    ev0Var4.f25870b = (((ev0Var4.d * f21) * f22) / 500.0f) + ev0Var4.f25870b;
                    ev0Var4.h += f22;
                }
                i13++;
                i18 = 40;
            }
            this.f26146k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i10 = this.f26143g;
        if (i10 == 0) {
            i10 = org.telegram.ui.ActionBar.t6.x0(null, this.f26142f, false) & (-1644826);
        }
        if (this.f26149n != i10) {
            this.f26149n = i10;
            this.f26141c.setColor(i10);
            this.d.setColor(i10);
        }
    }
}
