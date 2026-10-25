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
    public aq D;
    public org.telegram.ui.ActionBar.l5 E;
    public org.telegram.ui.ActionBar.u6 F;
    public GenericProvider G;
    public long H;
    public View f26074a;
    public final Paint d;
    public final Paint f26077f;
    public TextPaint f26078g;
    public boolean f26079i;
    public boolean f26082l;
    public boolean f26084n;
    public float f26085o;
    public ObjectAnimator f26086p;
    public boolean f26087q;
    public int f26089s;
    public int f26090t;
    public int f26091u;
    public float v;
    public float f26092w;
    public int f26093x;
    public boolean f26094y;
    public boolean f26095z;
    public final Rect f26075b = new Rect();
    public final RectF f26076c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f26080j = new Path();
    public boolean f26081k = true;
    public float f26083m = 1.0f;
    public int f26088r = org.telegram.ui.ActionBar.y6.f23483k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.u6 u6Var) {
        int i11 = org.telegram.ui.ActionBar.y6.f23506lc;
        this.f26089s = i11;
        this.f26090t = i11;
        this.f26091u = org.telegram.ui.ActionBar.y6.f23425h5;
        this.v = 0.0f;
        this.f26092w = 1.0f;
        this.f26095z = true;
        this.G = new f2(24);
        this.H = 200L;
        this.F = u6Var;
        this.f26074a = view;
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
        this.f26077f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f26074a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f26074a.getParent()).invalidate();
        }
        this.f26074a.invalidate();
    }

    public final void c(float f7) {
        if (this.f26083m == f7) {
            return;
        }
        this.f26083m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f26077f;
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
        Rect rect = this.f26075b;
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
        if (z10 == this.f26087q) {
            return;
        }
        this.f26087q = z10;
        float f7 = 0.0f;
        if (this.f26082l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f26086p = ofFloat;
            ofFloat.addListener(new org.telegram.ui.qp(this, 20));
            this.f26086p.setInterpolator(ds.f27585g);
            this.f26086p.setDuration(this.H);
            this.f26086p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f26086p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f26086p = null;
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
        return this.f26085o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f26089s == i10 && this.f26090t == i11 && this.f26088r == i12) {
            return;
        }
        this.f26089s = i10;
        this.f26090t = i11;
        this.f26088r = i12;
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
        if (this.f26079i == z10) {
            return;
        }
        this.f26079i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f26095z == z10) {
            return;
        }
        this.f26095z = z10;
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
        if (this.f26085o != f7) {
            this.f26085o = f7;
            b();
            aq aqVar = this.D;
            if (aqVar != null) {
                aqVar.a();
            }
        }
    }
}
