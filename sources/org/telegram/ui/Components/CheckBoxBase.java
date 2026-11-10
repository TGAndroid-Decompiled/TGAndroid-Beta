package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public class CheckBoxBase {
    public static Paint I;
    public static Paint J;
    public int A;
    public float B;
    public String C;
    public xo D;
    public org.telegram.ui.ActionBar.u4 E;
    public org.telegram.ui.ActionBar.h6 F;
    public org.telegram.messenger.k9 G;
    public long H;
    public View f31265a;
    public final Paint d;
    public final Paint f31269f;
    public TextPaint f31270g;
    public boolean f31271i;
    public boolean f31274l;
    public boolean f31276n;
    public float f31277o;
    public ObjectAnimator f31278p;
    public boolean f31279q;
    public int f31281s;
    public int f31282t;
    public int f31283u;
    public float v;
    public float f31284w;
    public int f31285x;
    public boolean f31286y;
    public boolean f31287z;
    public final Rect f31266b = new Rect();
    public final RectF f31267c = new RectF();
    public float f31268e = 1.0f;
    public float h = 1.0f;
    public final Path f31272j = new Path();
    public boolean f31273k = true;
    public float f31275m = 1.0f;
    public int f31280r = org.telegram.ui.ActionBar.m6.f28020k7;

    public CheckBoxBase(int i7, View view, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10 = org.telegram.ui.ActionBar.m6.Zc;
        this.f31281s = i10;
        this.f31282t = i10;
        this.f31283u = org.telegram.ui.ActionBar.m6.f27963h5;
        this.v = 0.0f;
        this.f31284w = 1.0f;
        this.f31287z = true;
        this.G = new j2(16);
        this.H = 200L;
        this.F = h6Var;
        this.f31265a = view;
        this.B = i7;
        if (I == null) {
            I = new Paint(1);
        }
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.9f));
        Paint paint2 = new Paint(1);
        this.f31269f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f31265a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f31265a.getParent()).invalidate();
        }
        this.f31265a.invalidate();
    }

    public final void c(float f10) {
        if (this.f31275m == f10) {
            return;
        }
        this.f31275m = f10;
        b();
    }

    public final void d(int i7) {
        if (this.A == i7) {
            return;
        }
        this.A = i7;
        Paint paint = this.f31269f;
        if (i7 != 12 && i7 != 13) {
            if (i7 != 4 && i7 != 5) {
                if (i7 == 3) {
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
                } else if (i7 != 0) {
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                }
            } else {
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.9f));
                if (i7 == 5) {
                    this.d.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                }
            }
        } else {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        }
        b();
    }

    public final void e(int i7, int i10, int i11, int i12) {
        int i13 = i11 + i7;
        int i14 = i12 + i10;
        Rect rect = this.f31266b;
        if (rect.left == i7 && rect.top == i10 && rect.right == i13 && rect.bottom == i14) {
            return;
        }
        rect.left = i7;
        rect.top = i10;
        rect.right = i13;
        rect.bottom = i14;
        b();
    }

    public final void f(int i7, boolean z9, boolean z10) {
        if (i7 >= 0) {
            String str = "" + (i7 + 1);
            String str2 = this.C;
            if (str2 == null || !str2.equals(str)) {
                this.C = str;
                b();
            }
        }
        if (z9 == this.f31279q) {
            return;
        }
        this.f31279q = z9;
        float f10 = 0.0f;
        if (this.f31274l && z10) {
            if (z9) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f31278p = ofFloat;
            ofFloat.addListener(new y5(this, 19));
            this.f31278p.setInterpolator(wq.f40047g);
            this.f31278p.setDuration(this.H);
            this.f31278p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f31278p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f31278p = null;
        }
        if (z9) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void g(boolean z9, boolean z10) {
        f(-1, z9, z10);
    }

    public float getProgress() {
        return this.f31277o;
    }

    public final void h(int i7, int i10, int i11) {
        if (this.f31281s == i7 && this.f31282t == i10 && this.f31280r == i11) {
            return;
        }
        this.f31281s = i7;
        this.f31282t = i10;
        this.f31280r = i11;
        b();
    }

    public final void i(float f10) {
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        b();
    }

    public final void j(boolean z9) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f31271i == z9) {
            return;
        }
        this.f31271i = z9;
        if (z9) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z9) {
        if (this.f31287z == z9) {
            return;
        }
        this.f31287z = z9;
        b();
    }

    public final void l(float f10) {
        if (this.B == f10) {
            return;
        }
        this.B = f10;
        b();
    }

    public void setProgress(float f10) {
        if (this.f31277o != f10) {
            this.f31277o = f10;
            b();
            xo xoVar = this.D;
            if (xoVar != null) {
                xoVar.a();
            }
        }
    }
}
