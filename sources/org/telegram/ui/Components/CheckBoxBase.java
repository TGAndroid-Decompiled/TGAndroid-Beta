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
    public bq D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.c6 F;
    public GenericProvider G;
    public long H;
    public View f23079a;
    public final Paint d;
    public final Paint f23082f;
    public TextPaint f23083g;
    public boolean f23084i;
    public boolean f23087l;
    public boolean f23089n;
    public float f23090o;
    public ObjectAnimator f23091p;
    public boolean f23092q;
    public int f23094s;
    public int f23095t;
    public int f23096u;
    public float v;
    public float f23097w;
    public int f23098x;
    public boolean f23099y;
    public boolean f23100z;
    public final Rect f23080b = new Rect();
    public final RectF f23081c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f23085j = new Path();
    public boolean f23086k = true;
    public float f23088m = 1.0f;
    public int f23093r = org.telegram.ui.ActionBar.g6.f20029k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11 = org.telegram.ui.ActionBar.g6.f20051lc;
        this.f23094s = i11;
        this.f23095t = i11;
        this.f23096u = org.telegram.ui.ActionBar.g6.f19972h5;
        this.v = 0.0f;
        this.f23097w = 1.0f;
        this.f23100z = true;
        this.G = new l2(14);
        this.H = 200L;
        this.F = c6Var;
        this.f23079a = view;
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
        this.f23082f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f23079a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f23079a.getParent()).invalidate();
        }
        this.f23079a.invalidate();
    }

    public final void c(float f7) {
        if (this.f23088m == f7) {
            return;
        }
        this.f23088m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f23082f;
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
        Rect rect = this.f23080b;
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
        if (z10 == this.f23092q) {
            return;
        }
        this.f23092q = z10;
        float f7 = 0.0f;
        if (this.f23087l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f23091p = ofFloat;
            ofFloat.addListener(new l6(this, 16));
            this.f23091p.setInterpolator(es.f24772g);
            this.f23091p.setDuration(this.H);
            this.f23091p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f23091p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f23091p = null;
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
        return this.f23090o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f23094s == i10 && this.f23095t == i11 && this.f23093r == i12) {
            return;
        }
        this.f23094s = i10;
        this.f23095t = i11;
        this.f23093r = i12;
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
        if (this.f23084i == z10) {
            return;
        }
        this.f23084i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f23100z == z10) {
            return;
        }
        this.f23100z = z10;
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
        if (this.f23090o != f7) {
            this.f23090o = f7;
            b();
            bq bqVar = this.D;
            if (bqVar != null) {
                bqVar.b();
            }
        }
    }
}
