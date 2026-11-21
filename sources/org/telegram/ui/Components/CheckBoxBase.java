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
    public pp D;
    public org.telegram.ui.ActionBar.u4 E;
    public org.telegram.ui.ActionBar.h6 F;
    public org.telegram.messenger.i9 G;
    public long H;
    public View f32857a;
    public final Paint d;
    public final Paint f32861f;
    public TextPaint f32862g;
    public boolean f32863i;
    public boolean f32866l;
    public boolean f32868n;
    public float f32869o;
    public ObjectAnimator f32870p;
    public boolean f32871q;
    public int f32873s;
    public int f32874t;
    public int f32875u;
    public float v;
    public float f32876w;
    public int f32877x;
    public boolean f32878y;
    public boolean f32879z;
    public final Rect f32858b = new Rect();
    public final RectF f32859c = new RectF();
    public float f32860e = 1.0f;
    public float h = 1.0f;
    public final Path f32864j = new Path();
    public boolean f32865k = true;
    public float f32867m = 1.0f;
    public int f32872r = org.telegram.ui.ActionBar.m6.f29508k7;

    public CheckBoxBase(int i7, View view, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10 = org.telegram.ui.ActionBar.m6.f29367cd;
        this.f32873s = i10;
        this.f32874t = i10;
        this.f32875u = org.telegram.ui.ActionBar.m6.f29451h5;
        this.v = 0.0f;
        this.f32876w = 1.0f;
        this.f32879z = true;
        this.G = new l2(21);
        this.H = 200L;
        this.F = h6Var;
        this.f32857a = view;
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
        this.f32861f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f32857a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f32857a.getParent()).invalidate();
        }
        this.f32857a.invalidate();
    }

    public final void c(float f10) {
        if (this.f32867m == f10) {
            return;
        }
        this.f32867m = f10;
        b();
    }

    public final void d(int i7) {
        if (this.A == i7) {
            return;
        }
        this.A = i7;
        Paint paint = this.f32861f;
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
        Rect rect = this.f32858b;
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
        if (z10 == this.f32871q) {
            return;
        }
        this.f32871q = z10;
        float f10 = 0.0f;
        if (this.f32866l && z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f32870p = ofFloat;
            ofFloat.addListener(new y(this, 20));
            this.f32870p.setInterpolator(nr.f37957g);
            this.f32870p.setDuration(this.H);
            this.f32870p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f32870p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f32870p = null;
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
        return this.f32869o;
    }

    public final void h(int i7, int i10, int i11) {
        if (this.f32873s == i7 && this.f32874t == i10 && this.f32872r == i11) {
            return;
        }
        this.f32873s = i7;
        this.f32874t = i10;
        this.f32872r = i11;
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
        if (this.f32863i == z10) {
            return;
        }
        this.f32863i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f32879z == z10) {
            return;
        }
        this.f32879z = z10;
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
        if (this.f32869o != f10) {
            this.f32869o = f10;
            b();
            pp ppVar = this.D;
            if (ppVar != null) {
                ppVar.a();
            }
        }
    }
}
