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
    public org.telegram.ui.ActionBar.f6 F;
    public org.telegram.messenger.k9 G;
    public long H;
    public View f31244a;
    public final Paint d;
    public final Paint f31248f;
    public TextPaint f31249g;
    public boolean f31250i;
    public boolean f31253l;
    public boolean f31255n;
    public float f31256o;
    public ObjectAnimator f31257p;
    public boolean f31258q;
    public int f31260s;
    public int f31261t;
    public int f31262u;
    public float v;
    public float f31263w;
    public int f31264x;
    public boolean f31265y;
    public boolean f31266z;
    public final Rect f31245b = new Rect();
    public final RectF f31246c = new RectF();
    public float f31247e = 1.0f;
    public float h = 1.0f;
    public final Path f31251j = new Path();
    public boolean f31252k = true;
    public float f31254m = 1.0f;
    public int f31259r = org.telegram.ui.ActionBar.k6.f27978k7;

    public CheckBoxBase(int i7, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10 = org.telegram.ui.ActionBar.k6.Zc;
        this.f31260s = i10;
        this.f31261t = i10;
        this.f31262u = org.telegram.ui.ActionBar.k6.f27921h5;
        this.v = 0.0f;
        this.f31263w = 1.0f;
        this.f31266z = true;
        this.G = new k2(16);
        this.H = 200L;
        this.F = f6Var;
        this.f31244a = view;
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
        this.f31248f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f31244a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f31244a.getParent()).invalidate();
        }
        this.f31244a.invalidate();
    }

    public final void c(float f10) {
        if (this.f31254m == f10) {
            return;
        }
        this.f31254m = f10;
        b();
    }

    public final void d(int i7) {
        if (this.A == i7) {
            return;
        }
        this.A = i7;
        Paint paint = this.f31248f;
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
        Rect rect = this.f31245b;
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
        if (z9 == this.f31258q) {
            return;
        }
        this.f31258q = z9;
        float f10 = 0.0f;
        if (this.f31253l && z10) {
            if (z9) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f31257p = ofFloat;
            ofFloat.addListener(new z5(this, 19));
            this.f31257p.setInterpolator(xq.f40330g);
            this.f31257p.setDuration(this.H);
            this.f31257p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f31257p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f31257p = null;
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
        return this.f31256o;
    }

    public final void h(int i7, int i10, int i11) {
        if (this.f31260s == i7 && this.f31261t == i10 && this.f31259r == i11) {
            return;
        }
        this.f31260s = i7;
        this.f31261t = i10;
        this.f31259r = i11;
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
        if (this.f31250i == z9) {
            return;
        }
        this.f31250i = z9;
        if (z9) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z9) {
        if (this.f31266z == z9) {
            return;
        }
        this.f31266z = z9;
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
        if (this.f31256o != f10) {
            this.f31256o = f10;
            b();
            xo xoVar = this.D;
            if (xoVar != null) {
                xoVar.a();
            }
        }
    }
}
