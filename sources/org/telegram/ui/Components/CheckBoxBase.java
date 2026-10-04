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
    public View f24079a;
    public final Paint d;
    public final Paint f24083f;
    public TextPaint f24084g;
    public boolean f24085i;
    public boolean f24088l;
    public boolean f24090n;
    public float f24091o;
    public ObjectAnimator f24092p;
    public boolean f24093q;
    public int f24095s;
    public int f24096t;
    public int f24097u;
    public float v;
    public float f24098w;
    public int f24099x;
    public boolean f24100y;
    public boolean f24101z;
    public final Rect f24080b = new Rect();
    public final RectF f24081c = new RectF();
    public float f24082e = 1.0f;
    public float h = 1.0f;
    public final Path f24086j = new Path();
    public boolean f24087k = true;
    public float f24089m = 1.0f;
    public int f24094r = org.telegram.ui.ActionBar.i6.f20947k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.i6.f20970lc;
        this.f24095s = i11;
        this.f24096t = i11;
        this.f24097u = org.telegram.ui.ActionBar.i6.f20889h5;
        this.v = 0.0f;
        this.f24098w = 1.0f;
        this.f24101z = true;
        this.G = new w1(28);
        this.H = 200L;
        this.F = d6Var;
        this.f24079a = view;
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
        this.f24083f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f24079a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f24079a.getParent()).invalidate();
        }
        this.f24079a.invalidate();
    }

    public final void c(float f7) {
        if (this.f24089m == f7) {
            return;
        }
        this.f24089m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f24083f;
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
        Rect rect = this.f24080b;
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
        if (z10 == this.f24093q) {
            return;
        }
        this.f24093q = z10;
        float f7 = 0.0f;
        if (this.f24088l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f24092p = ofFloat;
            ofFloat.addListener(new r8(this, 13));
            this.f24092p.setInterpolator(tr.f31141g);
            this.f24092p.setDuration(this.H);
            this.f24092p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24092p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f24092p = null;
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
        return this.f24091o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f24095s == i10 && this.f24096t == i11 && this.f24094r == i12) {
            return;
        }
        this.f24095s = i10;
        this.f24096t = i11;
        this.f24094r = i12;
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
        if (this.f24085i == z10) {
            return;
        }
        this.f24085i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f24101z == z10) {
            return;
        }
        this.f24101z = z10;
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
        if (this.f24091o != f7) {
            this.f24091o = f7;
            b();
            rp rpVar = this.D;
            if (rpVar != null) {
                rpVar.a();
            }
        }
    }
}
