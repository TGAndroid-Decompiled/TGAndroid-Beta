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
    public qp D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.d6 F;
    public GenericProvider G;
    public long H;
    public View f22181a;
    public final Paint d;
    public final Paint f22184f;
    public TextPaint f22185g;
    public boolean f22186i;
    public boolean f22189l;
    public boolean f22191n;
    public float f22192o;
    public ObjectAnimator f22193p;
    public boolean f22194q;
    public int f22196s;
    public int f22197t;
    public int f22198u;
    public float v;
    public float f22199w;
    public int f22200x;
    public boolean f22201y;
    public boolean f22202z;
    public final Rect f22182b = new Rect();
    public final RectF f22183c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f22187j = new Path();
    public boolean f22188k = true;
    public float f22190m = 1.0f;
    public int f22195r = org.telegram.ui.ActionBar.h6.f19187k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.f19210lc;
        this.f22196s = i11;
        this.f22197t = i11;
        this.f22198u = org.telegram.ui.ActionBar.h6.f19129h5;
        this.v = 0.0f;
        this.f22199w = 1.0f;
        this.f22202z = true;
        this.G = new x1(26);
        this.H = 200L;
        this.F = d6Var;
        this.f22181a = view;
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
        this.f22184f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f22181a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f22181a.getParent()).invalidate();
        }
        this.f22181a.invalidate();
    }

    public final void c(float f7) {
        if (this.f22190m == f7) {
            return;
        }
        this.f22190m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f22184f;
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
        Rect rect = this.f22182b;
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
        if (z10 == this.f22194q) {
            return;
        }
        this.f22194q = z10;
        float f7 = 0.0f;
        if (this.f22189l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f22193p = ofFloat;
            ofFloat.addListener(new r8(this, 13));
            this.f22193p.setInterpolator(sr.f28340g);
            this.f22193p.setDuration(this.H);
            this.f22193p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f22193p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f22193p = null;
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
        return this.f22192o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f22196s == i10 && this.f22197t == i11 && this.f22195r == i12) {
            return;
        }
        this.f22196s = i10;
        this.f22197t = i11;
        this.f22195r = i12;
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
        if (this.f22186i == z10) {
            return;
        }
        this.f22186i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f22202z == z10) {
            return;
        }
        this.f22202z = z10;
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
        if (this.f22192o != f7) {
            this.f22192o = f7;
            b();
            qp qpVar = this.D;
            if (qpVar != null) {
                qpVar.a();
            }
        }
    }
}
