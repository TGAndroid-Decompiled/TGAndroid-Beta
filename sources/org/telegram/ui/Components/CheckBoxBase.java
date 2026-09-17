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
    public np D;
    public org.telegram.ui.ActionBar.f5 E;
    public org.telegram.ui.ActionBar.f6 F;
    public GenericProvider G;
    public long H;
    public View f23921a;
    public final Paint d;
    public final Paint f23925f;
    public TextPaint f23926g;
    public boolean f23927i;
    public boolean f23930l;
    public boolean f23932n;
    public float f23933o;
    public ObjectAnimator f23934p;
    public boolean f23935q;
    public int f23937s;
    public int f23938t;
    public int f23939u;
    public float v;
    public float f23940w;
    public int f23941x;
    public boolean f23942y;
    public boolean f23943z;
    public final Rect f23922b = new Rect();
    public final RectF f23923c = new RectF();
    public float f23924e = 1.0f;
    public float h = 1.0f;
    public final Path f23928j = new Path();
    public boolean f23929k = true;
    public float f23931m = 1.0f;
    public int f23936r = org.telegram.ui.ActionBar.j6.f20820k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.f20843lc;
        this.f23937s = i11;
        this.f23938t = i11;
        this.f23939u = org.telegram.ui.ActionBar.j6.f20762h5;
        this.v = 0.0f;
        this.f23940w = 1.0f;
        this.f23943z = true;
        this.G = new p2(8);
        this.H = 200L;
        this.F = f6Var;
        this.f23921a = view;
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
        this.f23925f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f23921a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f23921a.getParent()).invalidate();
        }
        this.f23921a.invalidate();
    }

    public final void c(float f7) {
        if (this.f23931m == f7) {
            return;
        }
        this.f23931m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f23925f;
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
        Rect rect = this.f23922b;
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
        if (z10 == this.f23935q) {
            return;
        }
        this.f23935q = z10;
        float f7 = 0.0f;
        if (this.f23930l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f23934p = ofFloat;
            ofFloat.addListener(new j6(this, 16));
            this.f23934p.setInterpolator(pr.f29495g);
            this.f23934p.setDuration(this.H);
            this.f23934p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f23934p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f23934p = null;
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
        return this.f23933o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f23937s == i10 && this.f23938t == i11 && this.f23936r == i12) {
            return;
        }
        this.f23937s = i10;
        this.f23938t = i11;
        this.f23936r = i12;
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
        if (this.f23927i == z10) {
            return;
        }
        this.f23927i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f23943z == z10) {
            return;
        }
        this.f23943z = z10;
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
        if (this.f23933o != f7) {
            this.f23933o = f7;
            b();
            np npVar = this.D;
            if (npVar != null) {
                npVar.b();
            }
        }
    }
}
