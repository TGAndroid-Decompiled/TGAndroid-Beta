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
    public View f24134a;
    public final Paint d;
    public final Paint f24137f;
    public TextPaint f24138g;
    public boolean f24139i;
    public boolean f24142l;
    public boolean f24144n;
    public float f24145o;
    public ObjectAnimator f24146p;
    public boolean f24147q;
    public int f24149s;
    public int f24150t;
    public int f24151u;
    public float v;
    public float f24152w;
    public int f24153x;
    public boolean f24154y;
    public boolean f24155z;
    public final Rect f24135b = new Rect();
    public final RectF f24136c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f24140j = new Path();
    public boolean f24141k = true;
    public float f24143m = 1.0f;
    public int f24148r = org.telegram.ui.ActionBar.h6.f21114k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.f21136lc;
        this.f24149s = i11;
        this.f24150t = i11;
        this.f24151u = org.telegram.ui.ActionBar.h6.f21057h5;
        this.v = 0.0f;
        this.f24152w = 1.0f;
        this.f24155z = true;
        this.G = new k2(14);
        this.H = 200L;
        this.F = d6Var;
        this.f24134a = view;
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
        this.f24137f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f24134a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f24134a.getParent()).invalidate();
        }
        this.f24134a.invalidate();
    }

    public final void c(float f7) {
        if (this.f24143m == f7) {
            return;
        }
        this.f24143m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f24137f;
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
        Rect rect = this.f24135b;
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
        if (z10 == this.f24147q) {
            return;
        }
        this.f24147q = z10;
        float f7 = 0.0f;
        if (this.f24142l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f24146p = ofFloat;
            ofFloat.addListener(new org.telegram.ui.pq(this, 18));
            this.f24146p.setInterpolator(bs.f25031g);
            this.f24146p.setDuration(this.H);
            this.f24146p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24146p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f24146p = null;
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
        return this.f24145o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f24149s == i10 && this.f24150t == i11 && this.f24148r == i12) {
            return;
        }
        this.f24149s = i10;
        this.f24150t = i11;
        this.f24148r = i12;
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
        if (this.f24139i == z10) {
            return;
        }
        this.f24139i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f24155z == z10) {
            return;
        }
        this.f24155z = z10;
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
        if (this.f24145o != f7) {
            this.f24145o = f7;
            b();
            yp ypVar = this.D;
            if (ypVar != null) {
                ypVar.b();
            }
        }
    }
}
