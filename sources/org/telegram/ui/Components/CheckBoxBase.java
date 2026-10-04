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
    public View f24084a;
    public final Paint d;
    public final Paint f24088f;
    public TextPaint f24089g;
    public boolean f24090i;
    public boolean f24093l;
    public boolean f24095n;
    public float f24096o;
    public ObjectAnimator f24097p;
    public boolean f24098q;
    public int f24100s;
    public int f24101t;
    public int f24102u;
    public float v;
    public float f24103w;
    public int f24104x;
    public boolean f24105y;
    public boolean f24106z;
    public final Rect f24085b = new Rect();
    public final RectF f24086c = new RectF();
    public float f24087e = 1.0f;
    public float h = 1.0f;
    public final Path f24091j = new Path();
    public boolean f24092k = true;
    public float f24094m = 1.0f;
    public int f24099r = org.telegram.ui.ActionBar.i6.f20952k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.i6.f20975lc;
        this.f24100s = i11;
        this.f24101t = i11;
        this.f24102u = org.telegram.ui.ActionBar.i6.f20894h5;
        this.v = 0.0f;
        this.f24103w = 1.0f;
        this.f24106z = true;
        this.G = new w1(28);
        this.H = 200L;
        this.F = d6Var;
        this.f24084a = view;
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
        this.f24088f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f24084a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f24084a.getParent()).invalidate();
        }
        this.f24084a.invalidate();
    }

    public final void c(float f7) {
        if (this.f24094m == f7) {
            return;
        }
        this.f24094m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f24088f;
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
        Rect rect = this.f24085b;
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
        if (z10 == this.f24098q) {
            return;
        }
        this.f24098q = z10;
        float f7 = 0.0f;
        if (this.f24093l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f24097p = ofFloat;
            ofFloat.addListener(new r8(this, 13));
            this.f24097p.setInterpolator(tr.f31148g);
            this.f24097p.setDuration(this.H);
            this.f24097p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24097p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f24097p = null;
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
        return this.f24096o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f24100s == i10 && this.f24101t == i11 && this.f24099r == i12) {
            return;
        }
        this.f24100s = i10;
        this.f24101t = i11;
        this.f24099r = i12;
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
        if (this.f24090i == z10) {
            return;
        }
        this.f24090i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f24106z == z10) {
            return;
        }
        this.f24106z = z10;
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
        if (this.f24096o != f7) {
            this.f24096o = f7;
            b();
            rp rpVar = this.D;
            if (rpVar != null) {
                rpVar.a();
            }
        }
    }
}
