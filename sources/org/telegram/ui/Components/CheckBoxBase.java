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
    public rp D;
    public org.telegram.ui.ActionBar.e5 E;
    public org.telegram.ui.ActionBar.d6 F;
    public GenericProvider G;
    public long H;
    public View f24080a;
    public final Paint d;
    public final Paint f24084f;
    public TextPaint f24085g;
    public boolean f24086i;
    public boolean f24089l;
    public boolean f24091n;
    public float f24092o;
    public ObjectAnimator f24093p;
    public boolean f24094q;
    public int f24096s;
    public int f24097t;
    public int f24098u;
    public float v;
    public float f24099w;
    public int f24100x;
    public boolean f24101y;
    public boolean f24102z;
    public final Rect f24081b = new Rect();
    public final RectF f24082c = new RectF();
    public float f24083e = 1.0f;
    public float h = 1.0f;
    public final Path f24087j = new Path();
    public boolean f24088k = true;
    public float f24090m = 1.0f;
    public int f24095r = org.telegram.ui.ActionBar.i6.f20948k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.i6.f20971lc;
        this.f24096s = i11;
        this.f24097t = i11;
        this.f24098u = org.telegram.ui.ActionBar.i6.f20890h5;
        this.v = 0.0f;
        this.f24099w = 1.0f;
        this.f24102z = true;
        this.G = new w1(28);
        this.H = 200L;
        this.F = d6Var;
        this.f24080a = view;
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
        this.f24084f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f24080a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f24080a.getParent()).invalidate();
        }
        this.f24080a.invalidate();
    }

    public final void c(float f7) {
        if (this.f24090m == f7) {
            return;
        }
        this.f24090m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f24084f;
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
        Rect rect = this.f24081b;
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
        if (z10 == this.f24094q) {
            return;
        }
        this.f24094q = z10;
        float f7 = 0.0f;
        if (this.f24089l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f24093p = ofFloat;
            ofFloat.addListener(new r8(this, 13));
            this.f24093p.setInterpolator(tr.f31142g);
            this.f24093p.setDuration(this.H);
            this.f24093p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24093p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f24093p = null;
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
        return this.f24092o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f24096s == i10 && this.f24097t == i11 && this.f24095r == i12) {
            return;
        }
        this.f24096s = i10;
        this.f24097t = i11;
        this.f24095r = i12;
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
        if (this.f24086i == z10) {
            return;
        }
        this.f24086i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f24102z == z10) {
            return;
        }
        this.f24102z = z10;
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
        if (this.f24092o != f7) {
            this.f24092o = f7;
            b();
            rp rpVar = this.D;
            if (rpVar != null) {
                rpVar.a();
            }
        }
    }
}
