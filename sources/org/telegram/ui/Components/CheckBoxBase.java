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
    public ep D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.b6 F;
    public GenericProvider G;
    public long H;
    public View f26299a;
    public final Paint d;
    public final Paint f26303f;
    public TextPaint f26304g;
    public boolean f26305i;
    public boolean f26308l;
    public boolean f26310n;
    public float f26311o;
    public ObjectAnimator f26312p;
    public boolean f26313q;
    public int f26315s;
    public int f26316t;
    public int f26317u;
    public float v;
    public float f26318w;
    public int f26319x;
    public boolean f26320y;
    public boolean f26321z;
    public final Rect f26300b = new Rect();
    public final RectF f26301c = new RectF();
    public float f26302e = 1.0f;
    public float h = 1.0f;
    public final Path f26306j = new Path();
    public boolean f26307k = true;
    public float f26309m = 1.0f;
    public int f26314r = org.telegram.ui.ActionBar.f6.f23128k7;

    public CheckBoxBase(int i9, View view, org.telegram.ui.ActionBar.b6 b6Var) {
        int i10 = org.telegram.ui.ActionBar.f6.f23150lc;
        this.f26315s = i10;
        this.f26316t = i10;
        this.f26317u = org.telegram.ui.ActionBar.f6.f23072h5;
        this.v = 0.0f;
        this.f26318w = 1.0f;
        this.f26321z = true;
        this.G = new g2(13);
        this.H = 200L;
        this.F = b6Var;
        this.f26299a = view;
        this.B = i9;
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
        this.f26303f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f26299a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f26299a.getParent()).invalidate();
        }
        this.f26299a.invalidate();
    }

    public final void c(float f10) {
        if (this.f26309m == f10) {
            return;
        }
        this.f26309m = f10;
        b();
    }

    public final void d(int i9) {
        if (this.A == i9) {
            return;
        }
        this.A = i9;
        Paint paint = this.f26303f;
        if (i9 != 12 && i9 != 13) {
            if (i9 != 4 && i9 != 5) {
                if (i9 == 3) {
                    paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
                } else if (i9 != 0) {
                    paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
                }
            } else {
                paint.setStrokeWidth(AndroidUtilities.dp(1.9f));
                if (i9 == 5) {
                    this.d.setStrokeWidth(AndroidUtilities.dp(1.5f));
                }
            }
        } else {
            paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        }
        b();
    }

    public final void e(int i9, int i10, int i11, int i12) {
        int i13 = i11 + i9;
        int i14 = i12 + i10;
        Rect rect = this.f26300b;
        if (rect.left == i9 && rect.top == i10 && rect.right == i13 && rect.bottom == i14) {
            return;
        }
        rect.left = i9;
        rect.top = i10;
        rect.right = i13;
        rect.bottom = i14;
        b();
    }

    public final void f(int i9, boolean z10, boolean z11) {
        if (i9 >= 0) {
            String str = "" + (i9 + 1);
            String str2 = this.C;
            if (str2 == null || !str2.equals(str)) {
                this.C = str;
                b();
            }
        }
        if (z10 == this.f26313q) {
            return;
        }
        this.f26313q = z10;
        float f10 = 0.0f;
        if (this.f26308l && z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f26312p = ofFloat;
            ofFloat.addListener(new org.telegram.ui.xp(this, 19));
            this.f26312p.setInterpolator(gr.f28845g);
            this.f26312p.setDuration(this.H);
            this.f26312p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f26312p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f26312p = null;
        }
        if (z10) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public final void g(boolean z10, boolean z11) {
        f(-1, z10, z11);
    }

    public float getProgress() {
        return this.f26311o;
    }

    public final void h(int i9, int i10, int i11) {
        if (this.f26315s == i9 && this.f26316t == i10 && this.f26314r == i11) {
            return;
        }
        this.f26315s = i9;
        this.f26316t = i10;
        this.f26314r = i11;
        b();
    }

    public final void i(float f10) {
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        b();
    }

    public final void j(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f26305i == z10) {
            return;
        }
        this.f26305i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f26321z == z10) {
            return;
        }
        this.f26321z = z10;
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
        if (this.f26311o != f10) {
            this.f26311o = f10;
            b();
            ep epVar = this.D;
            if (epVar != null) {
                epVar.b();
            }
        }
    }
}
