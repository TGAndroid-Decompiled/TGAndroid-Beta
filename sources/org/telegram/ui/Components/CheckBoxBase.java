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
    public pp D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.d6 F;
    public GenericProvider G;
    public long H;
    public View f22182a;
    public final Paint d;
    public final Paint f22185f;
    public TextPaint f22186g;
    public boolean f22187i;
    public boolean f22190l;
    public boolean f22192n;
    public float f22193o;
    public ObjectAnimator f22194p;
    public boolean f22195q;
    public int f22197s;
    public int f22198t;
    public int f22199u;
    public float v;
    public float f22200w;
    public int f22201x;
    public boolean f22202y;
    public boolean f22203z;
    public final Rect f22183b = new Rect();
    public final RectF f22184c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f22188j = new Path();
    public boolean f22189k = true;
    public float f22191m = 1.0f;
    public int f22196r = org.telegram.ui.ActionBar.h6.f19188k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.f19211lc;
        this.f22197s = i11;
        this.f22198t = i11;
        this.f22199u = org.telegram.ui.ActionBar.h6.f19130h5;
        this.v = 0.0f;
        this.f22200w = 1.0f;
        this.f22203z = true;
        this.G = new x1(26);
        this.H = 200L;
        this.F = d6Var;
        this.f22182a = view;
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
        this.f22185f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f22182a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f22182a.getParent()).invalidate();
        }
        this.f22182a.invalidate();
    }

    public final void c(float f7) {
        if (this.f22191m == f7) {
            return;
        }
        this.f22191m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f22185f;
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
        Rect rect = this.f22183b;
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
        if (z10 == this.f22195q) {
            return;
        }
        this.f22195q = z10;
        float f7 = 0.0f;
        if (this.f22190l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f22194p = ofFloat;
            ofFloat.addListener(new r8(this, 13));
            this.f22194p.setInterpolator(rr.f28032g);
            this.f22194p.setDuration(this.H);
            this.f22194p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f22194p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f22194p = null;
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
        return this.f22193o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f22197s == i10 && this.f22198t == i11 && this.f22196r == i12) {
            return;
        }
        this.f22197s = i10;
        this.f22198t = i11;
        this.f22196r = i12;
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
        if (this.f22187i == z10) {
            return;
        }
        this.f22187i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f22203z == z10) {
            return;
        }
        this.f22203z = z10;
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
        if (this.f22193o != f7) {
            this.f22193o = f7;
            b();
            pp ppVar = this.D;
            if (ppVar != null) {
                ppVar.a();
            }
        }
    }
}
