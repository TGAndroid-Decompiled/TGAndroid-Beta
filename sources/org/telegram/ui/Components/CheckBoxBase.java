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
    public xf2 D;
    public m17 E;
    public wjb F;
    public js4 G;
    public long H;
    public View a;
    public final Paint d;
    public final Paint f;
    public TextPaint g;
    public boolean i;
    public boolean l;
    public boolean n;
    public float o;
    public ObjectAnimator p;
    public boolean q;
    public int s;
    public int t;
    public int u;
    public float v;
    public float w;
    public int x;
    public boolean y;
    public boolean z;
    public final Rect b = new Rect();
    public final RectF c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path j = new Path();
    public boolean k = true;
    public float m = 1.0f;
    public int r = bkb.j7;

    public CheckBoxBase(int i, wjb wjbVar, View view) {
        int i2 = bkb.bd;
        this.s = i2;
        this.t = i2;
        this.u = bkb.g5;
        this.v = 0.0f;
        this.w = 1.0f;
        this.z = true;
        this.G = new k32((byte) 4);
        this.H = 200L;
        this.F = wjbVar;
        this.a = view;
        this.B = i;
        if (I == null) {
            I = new Paint(1);
        }
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gl.L(1.9f));
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gl.L(1.2f));
    }

    public final void a(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.a.getParent()).invalidate();
        }
        this.a.invalidate();
    }

    public final void c(float f) {
        if (this.m == f) {
            return;
        }
        this.m = f;
        b();
    }

    public final void d(int i) {
        if (this.A == i) {
            return;
        }
        this.A = i;
        Paint paint = this.f;
        if (i != 12 && i != 13) {
            if (i != 4 && i != 5) {
                if (i == 3) {
                    paint.setStrokeWidth(gl.L(3.0f));
                } else if (i != 0) {
                    paint.setStrokeWidth(gl.L(1.5f));
                }
            } else {
                paint.setStrokeWidth(gl.L(1.9f));
                if (i == 5) {
                    this.d.setStrokeWidth(gl.L(1.5f));
                }
            }
        } else {
            paint.setStrokeWidth(gl.L(1.0f));
        }
        b();
    }

    public final void e(int i, int i2, int i3, int i4) {
        int i5 = i3 + i;
        int i6 = i4 + i2;
        Rect rect = this.b;
        if (rect.left == i && rect.top == i2 && rect.right == i5 && rect.bottom == i6) {
            return;
        }
        rect.left = i;
        rect.top = i2;
        rect.right = i5;
        rect.bottom = i6;
        b();
    }

    public final void f(int i, boolean z, boolean z2) {
        if (i >= 0) {
            String valueOf = String.valueOf(i + 1);
            String str = this.C;
            if (str == null || !str.equals(valueOf)) {
                this.C = valueOf;
                b();
            }
        }
        if (z == this.q) {
            return;
        }
        this.q = z;
        float f = 0.0f;
        if (this.l && z2) {
            if (z) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f);
            this.p = ofFloat;
            ofFloat.addListener(new bb1(this, (byte) 28));
            this.p.setInterpolator(s33.g);
            this.p.setDuration(this.H);
            this.p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.p = null;
        }
        if (z) {
            f = 1.0f;
        }
        setProgress(f);
    }

    public final void g(boolean z, boolean z2) {
        f(-1, z, z2);
    }

    public float getProgress() {
        return this.o;
    }

    public final void h(int i, int i2, int i3) {
        if (this.s == i && this.t == i2 && this.r == i3) {
            return;
        }
        this.s = i;
        this.t = i2;
        this.r = i3;
        b();
    }

    public final void i(float f) {
        if (this.v == f) {
            return;
        }
        this.v = f;
        b();
    }

    public final void j(boolean z) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.i == z) {
            return;
        }
        this.i = z;
        if (z) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z) {
        if (this.z == z) {
            return;
        }
        this.z = z;
        b();
    }

    public final void l(float f) {
        if (this.B == f) {
            return;
        }
        this.B = f;
        b();
    }

    public void setProgress(float f) {
        if (this.o != f) {
            this.o = f;
            b();
            xf2 xf2Var = this.D;
            if (xf2Var != null) {
                xf2Var.f();
            }
        }
    }
}
