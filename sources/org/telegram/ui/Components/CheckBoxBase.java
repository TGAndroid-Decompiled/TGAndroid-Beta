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
    public np D;
    public org.telegram.ui.ActionBar.v4 E;
    public org.telegram.ui.ActionBar.i6 F;
    public org.telegram.messenger.i9 G;
    public long H;
    public View f32824a;
    public final Paint d;
    public final Paint f32828f;
    public TextPaint f32829g;
    public boolean f32830i;
    public boolean f32833l;
    public boolean f32835n;
    public float f32836o;
    public ObjectAnimator f32837p;
    public boolean f32838q;
    public int f32840s;
    public int f32841t;
    public int f32842u;
    public float v;
    public float f32843w;
    public int f32844x;
    public boolean f32845y;
    public boolean f32846z;
    public final Rect f32825b = new Rect();
    public final RectF f32826c = new RectF();
    public float f32827e = 1.0f;
    public float h = 1.0f;
    public final Path f32831j = new Path();
    public boolean f32832k = true;
    public float f32834m = 1.0f;
    public int f32839r = org.telegram.ui.ActionBar.n6.f29524k7;

    public CheckBoxBase(int i7, View view, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10 = org.telegram.ui.ActionBar.n6.f29383cd;
        this.f32840s = i10;
        this.f32841t = i10;
        this.f32842u = org.telegram.ui.ActionBar.n6.f29467h5;
        this.v = 0.0f;
        this.f32843w = 1.0f;
        this.f32846z = true;
        this.G = new k2(21);
        this.H = 200L;
        this.F = i6Var;
        this.f32824a = view;
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
        this.f32828f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f32824a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f32824a.getParent()).invalidate();
        }
        this.f32824a.invalidate();
    }

    public final void c(float f10) {
        if (this.f32834m == f10) {
            return;
        }
        this.f32834m = f10;
        b();
    }

    public final void d(int i7) {
        if (this.A == i7) {
            return;
        }
        this.A = i7;
        Paint paint = this.f32828f;
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
        Rect rect = this.f32825b;
        if (rect.left == i7 && rect.top == i10 && rect.right == i13 && rect.bottom == i14) {
            return;
        }
        rect.left = i7;
        rect.top = i10;
        rect.right = i13;
        rect.bottom = i14;
        b();
    }

    public final void f(int i7, boolean z10, boolean z11) {
        if (i7 >= 0) {
            String str = "" + (i7 + 1);
            String str2 = this.C;
            if (str2 == null || !str2.equals(str)) {
                this.C = str;
                b();
            }
        }
        if (z10 == this.f32838q) {
            return;
        }
        this.f32838q = z10;
        float f10 = 0.0f;
        if (this.f32833l && z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f32837p = ofFloat;
            ofFloat.addListener(new x(this, 20));
            this.f32837p.setInterpolator(lr.f37209g);
            this.f32837p.setDuration(this.H);
            this.f32837p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f32837p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f32837p = null;
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
        return this.f32836o;
    }

    public final void h(int i7, int i10, int i11) {
        if (this.f32840s == i7 && this.f32841t == i10 && this.f32839r == i11) {
            return;
        }
        this.f32840s = i7;
        this.f32841t = i10;
        this.f32839r = i11;
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
        if (this.f32830i == z10) {
            return;
        }
        this.f32830i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f32846z == z10) {
            return;
        }
        this.f32846z = z10;
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
        if (this.f32836o != f10) {
            this.f32836o = f10;
            b();
            np npVar = this.D;
            if (npVar != null) {
                npVar.a();
            }
        }
    }
}
