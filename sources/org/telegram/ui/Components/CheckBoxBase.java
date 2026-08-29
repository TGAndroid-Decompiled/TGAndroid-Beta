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
    public ip D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.c6 F;
    public GenericProvider G;
    public long H;
    public View f26310a;
    public final Paint d;
    public final Paint f26314f;
    public TextPaint f26315g;
    public boolean f26316i;
    public boolean f26319l;
    public boolean f26321n;
    public float f26322o;
    public ObjectAnimator f26323p;
    public boolean f26324q;
    public int f26326s;
    public int f26327t;
    public int f26328u;
    public float v;
    public float f26329w;
    public int f26330x;
    public boolean f26331y;
    public boolean f26332z;
    public final Rect f26311b = new Rect();
    public final RectF f26312c = new RectF();
    public float f26313e = 1.0f;
    public float h = 1.0f;
    public final Path f26317j = new Path();
    public boolean f26318k = true;
    public float f26320m = 1.0f;
    public int f26325r = org.telegram.ui.ActionBar.g6.f23190k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11 = org.telegram.ui.ActionBar.g6.lc;
        this.f26326s = i11;
        this.f26327t = i11;
        this.f26328u = org.telegram.ui.ActionBar.g6.f23133h5;
        this.v = 0.0f;
        this.f26329w = 1.0f;
        this.f26332z = true;
        this.G = new r2(7);
        this.H = 200L;
        this.F = c6Var;
        this.f26310a = view;
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
        this.f26314f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f26310a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f26310a.getParent()).invalidate();
        }
        this.f26310a.invalidate();
    }

    public final void c(float f9) {
        if (this.f26320m == f9) {
            return;
        }
        this.f26320m = f9;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f26314f;
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
        Rect rect = this.f26311b;
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
        if (z10 == this.f26324q) {
            return;
        }
        this.f26324q = z10;
        float f9 = 0.0f;
        if (this.f26319l && z11) {
            if (z10) {
                f9 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f9);
            this.f26323p = ofFloat;
            ofFloat.addListener(new org.telegram.ui.bm(this, 21));
            this.f26323p.setInterpolator(jr.f29801g);
            this.f26323p.setDuration(this.H);
            this.f26323p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f26323p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f26323p = null;
        }
        if (z10) {
            f9 = 1.0f;
        }
        setProgress(f9);
    }

    public final void g(boolean z10, boolean z11) {
        f(-1, z10, z11);
    }

    public float getProgress() {
        return this.f26322o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f26326s == i10 && this.f26327t == i11 && this.f26325r == i12) {
            return;
        }
        this.f26326s = i10;
        this.f26327t = i11;
        this.f26325r = i12;
        b();
    }

    public final void i(float f9) {
        if (this.v == f9) {
            return;
        }
        this.v = f9;
        b();
    }

    public final void j(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f26316i == z10) {
            return;
        }
        this.f26316i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f26332z == z10) {
            return;
        }
        this.f26332z = z10;
        b();
    }

    public final void l(float f9) {
        if (this.B == f9) {
            return;
        }
        this.B = f9;
        b();
    }

    public void setProgress(float f9) {
        if (this.f26322o != f9) {
            this.f26322o = f9;
            b();
            ip ipVar = this.D;
            if (ipVar != null) {
                ipVar.a();
            }
        }
    }
}
