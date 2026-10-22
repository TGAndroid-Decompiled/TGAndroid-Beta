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
    public yp D;
    public org.telegram.ui.ActionBar.f5 E;
    public org.telegram.ui.ActionBar.d6 F;
    public GenericProvider G;
    public long H;
    public View f24141a;
    public final Paint d;
    public final Paint f24144f;
    public TextPaint f24145g;
    public boolean f24146i;
    public boolean f24149l;
    public boolean f24151n;
    public float f24152o;
    public ObjectAnimator f24153p;
    public boolean f24154q;
    public int f24156s;
    public int f24157t;
    public int f24158u;
    public float v;
    public float f24159w;
    public int f24160x;
    public boolean f24161y;
    public boolean f24162z;
    public final Rect f24142b = new Rect();
    public final RectF f24143c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f24147j = new Path();
    public boolean f24148k = true;
    public float f24150m = 1.0f;
    public int f24155r = org.telegram.ui.ActionBar.h6.f21121k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.f21143lc;
        this.f24156s = i11;
        this.f24157t = i11;
        this.f24158u = org.telegram.ui.ActionBar.h6.f21064h5;
        this.v = 0.0f;
        this.f24159w = 1.0f;
        this.f24162z = true;
        this.G = new k2(14);
        this.H = 200L;
        this.F = d6Var;
        this.f24141a = view;
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
        this.f24144f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f24141a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f24141a.getParent()).invalidate();
        }
        this.f24141a.invalidate();
    }

    public final void c(float f7) {
        if (this.f24150m == f7) {
            return;
        }
        this.f24150m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f24144f;
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
        Rect rect = this.f24142b;
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
        if (z10 == this.f24154q) {
            return;
        }
        this.f24154q = z10;
        float f7 = 0.0f;
        if (this.f24149l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f24153p = ofFloat;
            ofFloat.addListener(new org.telegram.ui.nq(this, 18));
            this.f24153p.setInterpolator(bs.f25025g);
            this.f24153p.setDuration(this.H);
            this.f24153p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24153p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f24153p = null;
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
        return this.f24152o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f24156s == i10 && this.f24157t == i11 && this.f24155r == i12) {
            return;
        }
        this.f24156s = i10;
        this.f24157t = i11;
        this.f24155r = i12;
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
        if (this.f24146i == z10) {
            return;
        }
        this.f24146i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f24162z == z10) {
            return;
        }
        this.f24162z = z10;
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
        if (this.f24152o != f7) {
            this.f24152o = f7;
            b();
            yp ypVar = this.D;
            if (ypVar != null) {
                ypVar.b();
            }
        }
    }
}
