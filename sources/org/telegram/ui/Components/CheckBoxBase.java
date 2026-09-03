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
    public lp D;
    public org.telegram.ui.ActionBar.g5 E;
    public org.telegram.ui.ActionBar.f6 F;
    public GenericProvider G;
    public long H;
    public View f22925a;
    public final Paint d;
    public final Paint f22928f;
    public TextPaint f22929g;
    public boolean f22930i;
    public boolean f22933l;
    public boolean f22935n;
    public float f22936o;
    public ObjectAnimator f22937p;
    public boolean f22938q;
    public int f22940s;
    public int f22941t;
    public int f22942u;
    public float v;
    public float f22943w;
    public int f22944x;
    public boolean f22945y;
    public boolean f22946z;
    public final Rect f22926b = new Rect();
    public final RectF f22927c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f22931j = new Path();
    public boolean f22932k = true;
    public float f22934m = 1.0f;
    public int f22939r = org.telegram.ui.ActionBar.j6.f20007k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.f20030lc;
        this.f22940s = i11;
        this.f22941t = i11;
        this.f22942u = org.telegram.ui.ActionBar.j6.f19952h5;
        this.v = 0.0f;
        this.f22943w = 1.0f;
        this.f22946z = true;
        this.G = new k2(12);
        this.H = 200L;
        this.F = f6Var;
        this.f22925a = view;
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
        this.f22928f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f22925a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f22925a.getParent()).invalidate();
        }
        this.f22925a.invalidate();
    }

    public final void c(float f10) {
        if (this.f22934m == f10) {
            return;
        }
        this.f22934m = f10;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f22928f;
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
        Rect rect = this.f22926b;
        if (rect.left == i10 && rect.top == i11 && rect.right == i14 && rect.bottom == i15) {
            return;
        }
        rect.left = i10;
        rect.top = i11;
        rect.right = i14;
        rect.bottom = i15;
        b();
    }

    public final void f(int i10, boolean z4, boolean z10) {
        if (i10 >= 0) {
            String str = "" + (i10 + 1);
            String str2 = this.C;
            if (str2 == null || !str2.equals(str)) {
                this.C = str;
                b();
            }
        }
        if (z4 == this.f22938q) {
            return;
        }
        this.f22938q = z4;
        float f10 = 0.0f;
        if (this.f22933l && z10) {
            if (z4) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f22937p = ofFloat;
            ofFloat.addListener(new a9(this, 12));
            this.f22937p.setInterpolator(mr.f27123g);
            this.f22937p.setDuration(this.H);
            this.f22937p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f22937p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f22937p = null;
        }
        if (z4) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void g(boolean z4, boolean z10) {
        f(-1, z4, z10);
    }

    public float getProgress() {
        return this.f22936o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f22940s == i10 && this.f22941t == i11 && this.f22939r == i12) {
            return;
        }
        this.f22940s = i10;
        this.f22941t = i11;
        this.f22939r = i12;
        b();
    }

    public final void i(float f10) {
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        b();
    }

    public final void j(boolean z4) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f22930i == z4) {
            return;
        }
        this.f22930i = z4;
        if (z4) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z4) {
        if (this.f22946z == z4) {
            return;
        }
        this.f22946z = z4;
        b();
    }

    public final void l(float f10) {
        if (this.B == f10) {
            return;
        }
        this.B = f10;
        b();
    }

    public void setProgress(float f10) {
        if (this.f22936o != f10) {
            this.f22936o = f10;
            b();
            lp lpVar = this.D;
            if (lpVar != null) {
                lpVar.a();
            }
        }
    }
}
