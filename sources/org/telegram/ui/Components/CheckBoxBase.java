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
    public eq D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.d6 F;
    public GenericProvider G;
    public long H;
    public View f24111a;
    public final Paint d;
    public final Paint f24115f;
    public TextPaint f24116g;
    public boolean f24117i;
    public boolean f24120l;
    public boolean f24122n;
    public float f24123o;
    public ObjectAnimator f24124p;
    public boolean f24125q;
    public int f24127s;
    public int f24128t;
    public int f24129u;
    public float v;
    public float f24130w;
    public int f24131x;
    public boolean f24132y;
    public boolean f24133z;
    public final Rect f24112b = new Rect();
    public final RectF f24113c = new RectF();
    public float f24114e = 1.0f;
    public float h = 1.0f;
    public final Path f24118j = new Path();
    public boolean f24119k = true;
    public float f24121m = 1.0f;
    public int f24126r = org.telegram.ui.ActionBar.h6.f20951k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.f20974lc;
        this.f24127s = i11;
        this.f24128t = i11;
        this.f24129u = org.telegram.ui.ActionBar.h6.f20893h5;
        this.v = 0.0f;
        this.f24130w = 1.0f;
        this.f24133z = true;
        this.G = new e2(21);
        this.H = 200L;
        this.F = d6Var;
        this.f24111a = view;
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
        this.f24115f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f24111a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f24111a.getParent()).invalidate();
        }
        this.f24111a.invalidate();
    }

    public final void c(float f7) {
        if (this.f24121m == f7) {
            return;
        }
        this.f24121m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f24115f;
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
        Rect rect = this.f24112b;
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
        if (z10 == this.f24125q) {
            return;
        }
        this.f24125q = z10;
        float f7 = 0.0f;
        if (this.f24120l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f24124p = ofFloat;
            ofFloat.addListener(new t8(this, 13));
            this.f24124p.setInterpolator(is.f27501g);
            this.f24124p.setDuration(this.H);
            this.f24124p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24124p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f24124p = null;
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
        return this.f24123o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f24127s == i10 && this.f24128t == i11 && this.f24126r == i12) {
            return;
        }
        this.f24127s = i10;
        this.f24128t = i11;
        this.f24126r = i12;
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
        if (this.f24117i == z10) {
            return;
        }
        this.f24117i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f24133z == z10) {
            return;
        }
        this.f24133z = z10;
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
        if (this.f24123o != f7) {
            this.f24123o = f7;
            b();
            eq eqVar = this.D;
            if (eqVar != null) {
                eqVar.a();
            }
        }
    }
}
