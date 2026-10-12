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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public class CheckBoxBase {
    public static Paint I;
    public static Paint J;
    public int A;
    public float B;
    public String C;
    public gq D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.c6 F;
    public GenericProvider G;
    public long H;
    public View f23861a;
    public final Paint d;
    public final Paint f23865f;
    public TextPaint f23866g;
    public boolean f23867i;
    public boolean f23870l;
    public boolean f23872n;
    public float f23873o;
    public ObjectAnimator f23874p;
    public boolean f23875q;
    public int f23877s;
    public int f23878t;
    public int f23879u;
    public float v;
    public float f23880w;
    public int f23881x;
    public boolean f23882y;
    public boolean f23883z;
    public final Rect f23862b = new Rect();
    public final RectF f23863c = new RectF();
    public float f23864e = 1.0f;
    public float h = 1.0f;
    public final Path f23868j = new Path();
    public boolean f23869k = true;
    public float f23871m = 1.0f;
    public int f23876r = org.telegram.ui.ActionBar.h6.f20689k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.f20712lc;
        this.f23877s = i11;
        this.f23878t = i11;
        this.f23879u = org.telegram.ui.ActionBar.h6.f20631h5;
        this.v = 0.0f;
        this.f23880w = 1.0f;
        this.f23883z = true;
        this.G = new f2(19);
        this.H = 200L;
        this.F = c6Var;
        this.f23861a = view;
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
        paint.setStrokeWidth(AndroidUtilities.dp(1.9f));
        Paint paint2 = new Paint(1);
        this.f23865f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f23861a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f23861a.getParent()).invalidate();
        }
        this.f23861a.invalidate();
    }

    public final void c(float f7) {
        if (this.f23871m == f7) {
            return;
        }
        this.f23871m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f23865f;
        if (i10 != 12 && i10 != 13) {
            if (i10 != 4 && i10 != 5) {
                if (i10 == 3) {
                    paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
                } else if (i10 != 0) {
                    paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                }
            } else {
                paint.setStrokeWidth(AndroidUtilities.dp(1.9f));
                if (i10 == 5) {
                    this.d.setStrokeWidth(AndroidUtilities.dp(1.5f));
                }
            }
        } else {
            paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        }
        b();
    }

    public final void e(int i10, int i11, int i12, int i13) {
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        Rect rect = this.f23862b;
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
        if (z10 == this.f23875q) {
            return;
        }
        this.f23875q = z10;
        float f7 = 0.0f;
        if (this.f23870l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f23874p = ofFloat;
            ofFloat.addListener(new t8(this, 13));
            this.f23874p.setInterpolator(js.f27635g);
            this.f23874p.setDuration(this.H);
            this.f23874p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f23874p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f23874p = null;
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
        return this.f23873o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f23877s == i10 && this.f23878t == i11 && this.f23876r == i12) {
            return;
        }
        this.f23877s = i10;
        this.f23878t = i11;
        this.f23876r = i12;
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
        if (this.f23867i == z10) {
            return;
        }
        this.f23867i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f23883z == z10) {
            return;
        }
        this.f23883z = z10;
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
        if (this.f23873o != f7) {
            this.f23873o = f7;
            b();
            gq gqVar = this.D;
            if (gqVar != null) {
                gqVar.a();
            }
        }
    }
}
