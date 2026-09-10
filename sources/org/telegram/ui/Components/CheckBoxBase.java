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
    public up D;
    public org.telegram.ui.ActionBar.h5 E;
    public org.telegram.ui.ActionBar.f6 F;
    public GenericProvider G;
    public long H;
    public View f21044a;
    public final Paint d;
    public final Paint f21047f;
    public TextPaint f21048g;
    public boolean f21049i;
    public boolean f21052l;
    public boolean f21054n;
    public float f21055o;
    public ObjectAnimator f21056p;
    public boolean f21057q;
    public int f21059s;
    public int f21060t;
    public int f21061u;
    public float v;
    public float f21062w;
    public int f21063x;
    public boolean f21064y;
    public boolean f21065z;
    public final Rect f21045b = new Rect();
    public final RectF f21046c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f21050j = new Path();
    public boolean f21051k = true;
    public float f21053m = 1.0f;
    public int f21058r = org.telegram.ui.ActionBar.j6.f18056k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.f18079lc;
        this.f21059s = i11;
        this.f21060t = i11;
        this.f21061u = org.telegram.ui.ActionBar.j6.f17998h5;
        this.v = 0.0f;
        this.f21062w = 1.0f;
        this.f21065z = true;
        this.G = new q2(9);
        this.H = 200L;
        this.F = f6Var;
        this.f21044a = view;
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
        this.f21047f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f21044a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f21044a.getParent()).invalidate();
        }
        this.f21044a.invalidate();
    }

    public final void c(float f7) {
        if (this.f21053m == f7) {
            return;
        }
        this.f21053m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f21047f;
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
        Rect rect = this.f21045b;
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
        if (z10 == this.f21057q) {
            return;
        }
        this.f21057q = z10;
        float f7 = 0.0f;
        if (this.f21052l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f21056p = ofFloat;
            ofFloat.addListener(new rm(this, 3));
            this.f21056p.setInterpolator(wr.f28820g);
            this.f21056p.setDuration(this.H);
            this.f21056p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f21056p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f21056p = null;
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
        return this.f21055o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f21059s == i10 && this.f21060t == i11 && this.f21058r == i12) {
            return;
        }
        this.f21059s = i10;
        this.f21060t = i11;
        this.f21058r = i12;
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
        if (this.f21049i == z10) {
            return;
        }
        this.f21049i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f21065z == z10) {
            return;
        }
        this.f21065z = z10;
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
        if (this.f21055o != f7) {
            this.f21055o = f7;
            b();
            up upVar = this.D;
            if (upVar != null) {
                upVar.a();
            }
        }
    }
}
