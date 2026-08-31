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
    public org.telegram.ui.ActionBar.h5 E;
    public org.telegram.ui.ActionBar.g6 F;
    public GenericProvider G;
    public long H;
    public View f24795a;
    public final Paint d;
    public final Paint f24799f;
    public TextPaint f24800g;
    public boolean f24801i;
    public boolean f24804l;
    public boolean f24806n;
    public float f24807o;
    public ObjectAnimator f24808p;
    public boolean f24809q;
    public int f24811s;
    public int f24812t;
    public int f24813u;
    public float v;
    public float f24814w;
    public int f24815x;
    public boolean f24816y;
    public boolean f24817z;
    public final Rect f24796b = new Rect();
    public final RectF f24797c = new RectF();
    public float f24798e = 1.0f;
    public float h = 1.0f;
    public final Path f24802j = new Path();
    public boolean f24803k = true;
    public float f24805m = 1.0f;
    public int f24810r = org.telegram.ui.ActionBar.k6.f21786k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11 = org.telegram.ui.ActionBar.k6.f21809lc;
        this.f24811s = i11;
        this.f24812t = i11;
        this.f24813u = org.telegram.ui.ActionBar.k6.f21731h5;
        this.v = 0.0f;
        this.f24814w = 1.0f;
        this.f24817z = true;
        this.G = new k2(12);
        this.H = 200L;
        this.F = g6Var;
        this.f24795a = view;
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
        this.f24799f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f24795a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f24795a.getParent()).invalidate();
        }
        this.f24795a.invalidate();
    }

    public final void c(float f10) {
        if (this.f24805m == f10) {
            return;
        }
        this.f24805m = f10;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f24799f;
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
        Rect rect = this.f24796b;
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
        if (z4 == this.f24809q) {
            return;
        }
        this.f24809q = z4;
        float f10 = 0.0f;
        if (this.f24804l && z10) {
            if (z4) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f24808p = ofFloat;
            ofFloat.addListener(new a9(this, 12));
            this.f24808p.setInterpolator(pr.f30184g);
            this.f24808p.setDuration(this.H);
            this.f24808p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24808p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f24808p = null;
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
        return this.f24807o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f24811s == i10 && this.f24812t == i11 && this.f24810r == i12) {
            return;
        }
        this.f24811s = i10;
        this.f24812t = i11;
        this.f24810r = i12;
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
        if (this.f24801i == z4) {
            return;
        }
        this.f24801i = z4;
        if (z4) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z4) {
        if (this.f24817z == z4) {
            return;
        }
        this.f24817z = z4;
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
        if (this.f24807o != f10) {
            this.f24807o = f10;
            b();
            op opVar = this.D;
            if (opVar != null) {
                opVar.a();
            }
        }
    }
}
