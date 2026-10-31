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
    public fp D;
    public org.telegram.ui.ActionBar.c5 E;
    public org.telegram.ui.ActionBar.p6 F;
    public org.telegram.messenger.l9 G;
    public long H;
    public View f23906a;
    public final Paint d;
    public final Paint f23909f;
    public TextPaint f23910g;
    public boolean f23911i;
    public boolean f23914l;
    public boolean f23916n;
    public float f23917o;
    public ObjectAnimator f23918p;
    public boolean f23919q;
    public int f23921s;
    public int f23922t;
    public int f23923u;
    public float v;
    public float f23924w;
    public int f23925x;
    public boolean f23926y;
    public boolean f23927z;
    public final Rect f23907b = new Rect();
    public final RectF f23908c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f23912j = new Path();
    public boolean f23913k = true;
    public float f23915m = 1.0f;
    public int f23920r = org.telegram.ui.ActionBar.t6.f21059k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11 = org.telegram.ui.ActionBar.t6.Zc;
        this.f23921s = i11;
        this.f23922t = i11;
        this.f23923u = org.telegram.ui.ActionBar.t6.f21001h5;
        this.v = 0.0f;
        this.f23924w = 1.0f;
        this.f23927z = true;
        this.G = new v1(29);
        this.H = 200L;
        this.F = p6Var;
        this.f23906a = view;
        this.B = i10;
        if (I == null) {
            I = new Paint(1);
        }
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.9f));
        Paint paint2 = new Paint(1);
        this.f23909f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f23906a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f23906a.getParent()).invalidate();
        }
        this.f23906a.invalidate();
    }

    public final void c(float f7) {
        if (this.f23915m == f7) {
            return;
        }
        this.f23915m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f23909f;
        if (i10 != 12 && i10 != 13) {
            if (i10 != 4 && i10 != 5) {
                if (i10 == 3) {
                    paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
                } else if (i10 != 0) {
                    paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
                }
            } else {
                paint.setStrokeWidth(org.telegram.messenger.i0.L(1.9f));
                if (i10 == 5) {
                    this.d.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
                }
            }
        } else {
            paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        }
        b();
    }

    public final void e(int i10, int i11, int i12, int i13) {
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        Rect rect = this.f23907b;
        if (rect.left == i10 && rect.top == i11 && rect.right == i14 && rect.bottom == i15) {
            return;
        }
        rect.left = i10;
        rect.top = i11;
        rect.right = i14;
        rect.bottom = i15;
        b();
    }

    public final void f(int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            String str = "" + (i10 + 1);
            String str2 = this.C;
            if (str2 == null || !str2.equals(str)) {
                this.C = str;
                b();
            }
        }
        if (z10 == this.f23919q) {
            return;
        }
        this.f23919q = z10;
        float f7 = 0.0f;
        if (this.f23914l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f23918p = ofFloat;
            ofFloat.addListener(new w5(this, 19));
            this.f23918p.setInterpolator(gr.f26496g);
            this.f23918p.setDuration(this.H);
            this.f23918p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f23918p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f23918p = null;
        }
        if (z10) {
            f7 = 1.0f;
        }
        setProgress(f7);
    }

    public final void g(boolean z10, boolean z11) {
        f(-1, z10, z11);
    }

    public float getProgress() {
        return this.f23917o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f23921s == i10 && this.f23922t == i11 && this.f23920r == i12) {
            return;
        }
        this.f23921s = i10;
        this.f23922t = i11;
        this.f23920r = i12;
        b();
    }

    public final void i(float f7) {
        if (this.v == f7) {
            return;
        }
        this.v = f7;
        b();
    }

    public final void j(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f23911i == z10) {
            return;
        }
        this.f23911i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f23927z == z10) {
            return;
        }
        this.f23927z = z10;
        b();
    }

    public final void l(float f7) {
        if (this.B == f7) {
            return;
        }
        this.B = f7;
        b();
    }

    public void setProgress(float f7) {
        if (this.f23917o != f7) {
            this.f23917o = f7;
            b();
            fp fpVar = this.D;
            if (fpVar != null) {
                fpVar.a();
            }
        }
    }
}
