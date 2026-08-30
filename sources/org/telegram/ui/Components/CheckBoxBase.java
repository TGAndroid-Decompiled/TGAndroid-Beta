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
    public mp D;
    public org.telegram.ui.ActionBar.g5 E;
    public org.telegram.ui.ActionBar.f6 F;
    public GenericProvider G;
    public long H;
    public View f22952a;
    public final Paint d;
    public final Paint f22955f;
    public TextPaint f22956g;
    public boolean f22957i;
    public boolean f22960l;
    public boolean f22962n;
    public float f22963o;
    public ObjectAnimator f22964p;
    public boolean f22965q;
    public int f22967s;
    public int f22968t;
    public int f22969u;
    public float v;
    public float f22970w;
    public int f22971x;
    public boolean f22972y;
    public boolean f22973z;
    public final Rect f22953b = new Rect();
    public final RectF f22954c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f22958j = new Path();
    public boolean f22959k = true;
    public float f22961m = 1.0f;
    public int f22966r = org.telegram.ui.ActionBar.j6.f20032k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.f20055lc;
        this.f22967s = i11;
        this.f22968t = i11;
        this.f22969u = org.telegram.ui.ActionBar.j6.f19977h5;
        this.v = 0.0f;
        this.f22970w = 1.0f;
        this.f22973z = true;
        this.G = new k2(12);
        this.H = 200L;
        this.F = f6Var;
        this.f22952a = view;
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
        this.f22955f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f22952a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f22952a.getParent()).invalidate();
        }
        this.f22952a.invalidate();
    }

    public final void c(float f10) {
        if (this.f22961m == f10) {
            return;
        }
        this.f22961m = f10;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f22955f;
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
        Rect rect = this.f22953b;
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
        if (z4 == this.f22965q) {
            return;
        }
        this.f22965q = z4;
        float f10 = 0.0f;
        if (this.f22960l && z10) {
            if (z4) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f22964p = ofFloat;
            ofFloat.addListener(new a9(this, 12));
            this.f22964p.setInterpolator(nr.f27347g);
            this.f22964p.setDuration(this.H);
            this.f22964p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f22964p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f22964p = null;
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
        return this.f22963o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f22967s == i10 && this.f22968t == i11 && this.f22966r == i12) {
            return;
        }
        this.f22967s = i10;
        this.f22968t = i11;
        this.f22966r = i12;
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
        if (this.f22957i == z4) {
            return;
        }
        this.f22957i = z4;
        if (z4) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z4) {
        if (this.f22973z == z4) {
            return;
        }
        this.f22973z = z4;
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
        if (this.f22963o != f10) {
            this.f22963o = f10;
            b();
            mp mpVar = this.D;
            if (mpVar != null) {
                mpVar.a();
            }
        }
    }
}
