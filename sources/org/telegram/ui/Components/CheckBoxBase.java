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
    public op D;
    public org.telegram.ui.ActionBar.f5 E;
    public org.telegram.ui.ActionBar.f6 F;
    public GenericProvider G;
    public long H;
    public View f22180a;
    public final Paint d;
    public final Paint f22183f;
    public TextPaint f22184g;
    public boolean f22185i;
    public boolean f22188l;
    public boolean f22190n;
    public float f22191o;
    public ObjectAnimator f22192p;
    public boolean f22193q;
    public int f22195s;
    public int f22196t;
    public int f22197u;
    public float v;
    public float f22198w;
    public int f22199x;
    public boolean f22200y;
    public boolean f22201z;
    public final Rect f22181b = new Rect();
    public final RectF f22182c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path f22186j = new Path();
    public boolean f22187k = true;
    public float f22189m = 1.0f;
    public int f22194r = org.telegram.ui.ActionBar.j6.f19223k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.f19246lc;
        this.f22195s = i11;
        this.f22196t = i11;
        this.f22197u = org.telegram.ui.ActionBar.j6.f19165h5;
        this.v = 0.0f;
        this.f22198w = 1.0f;
        this.f22201z = true;
        this.G = new i2(15);
        this.H = 200L;
        this.F = f6Var;
        this.f22180a = view;
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
        this.f22183f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f22180a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f22180a.getParent()).invalidate();
        }
        this.f22180a.invalidate();
    }

    public final void c(float f7) {
        if (this.f22189m == f7) {
            return;
        }
        this.f22189m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f22183f;
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
        Rect rect = this.f22181b;
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
        if (z10 == this.f22193q) {
            return;
        }
        this.f22193q = z10;
        float f7 = 0.0f;
        if (this.f22188l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f22192p = ofFloat;
            ofFloat.addListener(new q8(this, 13));
            this.f22192p.setInterpolator(qr.f27643g);
            this.f22192p.setDuration(this.H);
            this.f22192p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f22192p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f22192p = null;
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
        return this.f22191o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f22195s == i10 && this.f22196t == i11 && this.f22194r == i12) {
            return;
        }
        this.f22195s = i10;
        this.f22196t = i11;
        this.f22194r = i12;
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
        if (this.f22185i == z10) {
            return;
        }
        this.f22185i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f22201z == z10) {
            return;
        }
        this.f22201z = z10;
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
        if (this.f22191o != f7) {
            this.f22191o = f7;
            b();
            op opVar = this.D;
            if (opVar != null) {
                opVar.a();
            }
        }
    }
}
