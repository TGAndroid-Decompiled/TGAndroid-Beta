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
    public op D;
    public org.telegram.ui.ActionBar.f5 E;
    public org.telegram.ui.ActionBar.e6 F;
    public GenericProvider G;
    public long H;
    public View f21956a;
    public final Paint d;
    public final Paint f21959f;
    public TextPaint f21960g;
    public boolean f21961i;
    public boolean f21964l;
    public boolean f21966n;
    public float f21967o;
    public ObjectAnimator f21968p;
    public boolean f21969q;
    public int f21971s;
    public int f21972t;
    public int f21973u;
    public float v;
    public float f21974w;
    public int f21975x;
    public boolean f21976y;
    public boolean f21977z;
    public final Rect f21957b = new Rect();
    public final RectF f21958c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f21962j = new Path();
    public boolean f21963k = true;
    public float f21965m = 1.0f;
    public int f21970r = org.telegram.ui.ActionBar.i6.f18962k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11 = org.telegram.ui.ActionBar.i6.f18985lc;
        this.f21971s = i11;
        this.f21972t = i11;
        this.f21973u = org.telegram.ui.ActionBar.i6.f18904h5;
        this.v = 0.0f;
        this.f21974w = 1.0f;
        this.f21977z = true;
        this.G = new o2(10);
        this.H = 200L;
        this.F = e6Var;
        this.f21956a = view;
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
        this.f21959f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f21956a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f21956a.getParent()).invalidate();
        }
        this.f21956a.invalidate();
    }

    public final void c(float f7) {
        if (this.f21965m == f7) {
            return;
        }
        this.f21965m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f21959f;
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
        Rect rect = this.f21957b;
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
        if (z10 == this.f21969q) {
            return;
        }
        this.f21969q = z10;
        float f7 = 0.0f;
        if (this.f21964l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f21968p = ofFloat;
            ofFloat.addListener(new p8(this, 13));
            this.f21968p.setInterpolator(qr.f27421g);
            this.f21968p.setDuration(this.H);
            this.f21968p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f21968p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f21968p = null;
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
        return this.f21967o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f21971s == i10 && this.f21972t == i11 && this.f21970r == i12) {
            return;
        }
        this.f21971s = i10;
        this.f21972t = i11;
        this.f21970r = i12;
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
        if (this.f21961i == z10) {
            return;
        }
        this.f21961i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f21977z == z10) {
            return;
        }
        this.f21977z = z10;
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
        if (this.f21967o != f7) {
            this.f21967o = f7;
            b();
            op opVar = this.D;
            if (opVar != null) {
                opVar.a();
            }
        }
    }
}
