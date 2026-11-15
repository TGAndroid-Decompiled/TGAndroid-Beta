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
    public gp D;
    public org.telegram.ui.ActionBar.r4 E;
    public org.telegram.ui.ActionBar.e6 F;
    public org.telegram.messenger.j9 G;
    public long H;
    public View f32427a;
    public final Paint d;
    public final Paint f32431f;
    public TextPaint f32432g;
    public boolean f32433i;
    public boolean f32436l;
    public boolean f32438n;
    public float f32439o;
    public ObjectAnimator f32440p;
    public boolean f32441q;
    public int f32443s;
    public int f32444t;
    public int f32445u;
    public float v;
    public float f32446w;
    public int f32447x;
    public boolean f32448y;
    public boolean f32449z;
    public final Rect f32428b = new Rect();
    public final RectF f32429c = new RectF();
    public float f32430e = 1.0f;
    public float h = 1.0f;
    public final Path f32434j = new Path();
    public boolean f32435k = true;
    public float f32437m = 1.0f;
    public int f32442r = org.telegram.ui.ActionBar.j6.f28979k7;

    public CheckBoxBase(int i7, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10 = org.telegram.ui.ActionBar.j6.f28838cd;
        this.f32443s = i10;
        this.f32444t = i10;
        this.f32445u = org.telegram.ui.ActionBar.j6.f28922h5;
        this.v = 0.0f;
        this.f32446w = 1.0f;
        this.f32449z = true;
        this.G = new e2(20);
        this.H = 200L;
        this.F = e6Var;
        this.f32427a = view;
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
        this.f32431f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f32427a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f32427a.getParent()).invalidate();
        }
        this.f32427a.invalidate();
    }

    public final void c(float f10) {
        if (this.f32437m == f10) {
            return;
        }
        this.f32437m = f10;
        b();
    }

    public final void d(int i7) {
        if (this.A == i7) {
            return;
        }
        this.A = i7;
        Paint paint = this.f32431f;
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
        Rect rect = this.f32428b;
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
        if (z10 == this.f32441q) {
            return;
        }
        this.f32441q = z10;
        float f10 = 0.0f;
        if (this.f32436l && z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f32440p = ofFloat;
            ofFloat.addListener(new x5(this, 19));
            this.f32440p.setInterpolator(er.f34421g);
            this.f32440p.setDuration(this.H);
            this.f32440p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f32440p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f32440p = null;
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
        return this.f32439o;
    }

    public final void h(int i7, int i10, int i11) {
        if (this.f32443s == i7 && this.f32444t == i10 && this.f32442r == i11) {
            return;
        }
        this.f32443s = i7;
        this.f32444t = i10;
        this.f32442r = i11;
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
        if (this.f32433i == z10) {
            return;
        }
        this.f32433i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f32449z == z10) {
            return;
        }
        this.f32449z = z10;
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
        if (this.f32439o != f10) {
            this.f32439o = f10;
            b();
            gp gpVar = this.D;
            if (gpVar != null) {
                gpVar.a();
            }
        }
    }
}
