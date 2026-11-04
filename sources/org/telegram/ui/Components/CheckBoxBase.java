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
    public org.telegram.ui.ActionBar.t4 E;
    public org.telegram.ui.ActionBar.e6 F;
    public org.telegram.messenger.e9 G;
    public long H;
    public View f31320a;
    public final Paint d;
    public final Paint f31324f;
    public TextPaint f31325g;
    public boolean f31326i;
    public boolean f31329l;
    public boolean f31331n;
    public float f31332o;
    public ObjectAnimator f31333p;
    public boolean f31334q;
    public int f31336s;
    public int f31337t;
    public int f31338u;
    public float v;
    public float f31339w;
    public int f31340x;
    public boolean f31341y;
    public boolean f31342z;
    public final Rect f31321b = new Rect();
    public final RectF f31322c = new RectF();
    public float f31323e = 1.0f;
    public float h = 1.0f;
    public final Path f31327j = new Path();
    public boolean f31328k = true;
    public float f31330m = 1.0f;
    public int f31335r = org.telegram.ui.ActionBar.k6.f28008k7;

    public CheckBoxBase(int i3, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10 = org.telegram.ui.ActionBar.k6.Zc;
        this.f31336s = i10;
        this.f31337t = i10;
        this.f31338u = org.telegram.ui.ActionBar.k6.f27954h5;
        this.v = 0.0f;
        this.f31339w = 1.0f;
        this.f31342z = true;
        this.G = new a3(13);
        this.H = 200L;
        this.F = e6Var;
        this.f31320a = view;
        this.B = i3;
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
        this.f31324f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f31320a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f31320a.getParent()).invalidate();
        }
        this.f31320a.invalidate();
    }

    public final void c(float f10) {
        if (this.f31330m == f10) {
            return;
        }
        this.f31330m = f10;
        b();
    }

    public final void d(int i3) {
        if (this.A == i3) {
            return;
        }
        this.A = i3;
        Paint paint = this.f31324f;
        if (i3 != 12 && i3 != 13) {
            if (i3 != 4 && i3 != 5) {
                if (i3 == 3) {
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
                } else if (i3 != 0) {
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                }
            } else {
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.9f));
                if (i3 == 5) {
                    this.d.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                }
            }
        } else {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        }
        b();
    }

    public final void e(int i3, int i10, int i11, int i12) {
        int i13 = i11 + i3;
        int i14 = i12 + i10;
        Rect rect = this.f31321b;
        if (rect.left == i3 && rect.top == i10 && rect.right == i13 && rect.bottom == i14) {
            return;
        }
        rect.left = i3;
        rect.top = i10;
        rect.right = i13;
        rect.bottom = i14;
        b();
    }

    public final void f(int i3, boolean z10, boolean z11) {
        if (i3 >= 0) {
            String str = "" + (i3 + 1);
            String str2 = this.C;
            if (str2 == null || !str2.equals(str)) {
                this.C = str;
                b();
            }
        }
        if (z10 == this.f31334q) {
            return;
        }
        this.f31334q = z10;
        float f10 = 0.0f;
        if (this.f31329l && z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f31333p = ofFloat;
            ofFloat.addListener(new x5(this, 19));
            this.f31333p.setInterpolator(xq.f40453g);
            this.f31333p.setDuration(this.H);
            this.f31333p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f31333p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f31333p = null;
        }
        if (z10) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void g(boolean z10, boolean z11) {
        f(-1, z10, z11);
    }

    public float getProgress() {
        return this.f31332o;
    }

    public final void h(int i3, int i10, int i11) {
        if (this.f31336s == i3 && this.f31337t == i10 && this.f31335r == i11) {
            return;
        }
        this.f31336s = i3;
        this.f31337t = i10;
        this.f31335r = i11;
        b();
    }

    public final void i(float f10) {
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        b();
    }

    public final void j(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f31326i == z10) {
            return;
        }
        this.f31326i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f31342z == z10) {
            return;
        }
        this.f31342z = z10;
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
        if (this.f31332o != f10) {
            this.f31332o = f10;
            b();
            xo xoVar = this.D;
            if (xoVar != null) {
                xoVar.a();
            }
        }
    }
}
