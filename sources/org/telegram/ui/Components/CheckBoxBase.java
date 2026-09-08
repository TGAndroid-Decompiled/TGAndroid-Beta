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
    public np D;
    public org.telegram.ui.ActionBar.f5 E;
    public org.telegram.ui.ActionBar.f6 F;
    public GenericProvider G;
    public long H;
    public View f23920a;
    public final Paint d;
    public final Paint f23924f;
    public TextPaint f23925g;
    public boolean f23926i;
    public boolean f23929l;
    public boolean f23931n;
    public float f23932o;
    public ObjectAnimator f23933p;
    public boolean f23934q;
    public int f23936s;
    public int f23937t;
    public int f23938u;
    public float v;
    public float f23939w;
    public int f23940x;
    public boolean f23941y;
    public boolean f23942z;
    public final Rect f23921b = new Rect();
    public final RectF f23922c = new RectF();
    public float f23923e = 1.0f;
    public float h = 1.0f;
    public final Path f23927j = new Path();
    public boolean f23928k = true;
    public float f23930m = 1.0f;
    public int f23935r = org.telegram.ui.ActionBar.j6.f20819k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.f20842lc;
        this.f23936s = i11;
        this.f23937t = i11;
        this.f23938u = org.telegram.ui.ActionBar.j6.f20761h5;
        this.v = 0.0f;
        this.f23939w = 1.0f;
        this.f23942z = true;
        this.G = new p2(8);
        this.H = 200L;
        this.F = f6Var;
        this.f23920a = view;
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
        this.f23924f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.a(android.graphics.Canvas):void");
    }

    public final void b() {
        View view = this.f23920a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f23920a.getParent()).invalidate();
        }
        this.f23920a.invalidate();
    }

    public final void c(float f7) {
        if (this.f23930m == f7) {
            return;
        }
        this.f23930m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f23924f;
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
        Rect rect = this.f23921b;
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
        if (z10 == this.f23934q) {
            return;
        }
        this.f23934q = z10;
        float f7 = 0.0f;
        if (this.f23929l && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f23933p = ofFloat;
            ofFloat.addListener(new j6(this, 16));
            this.f23933p.setInterpolator(pr.f29494g);
            this.f23933p.setDuration(this.H);
            this.f23933p.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f23933p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f23933p = null;
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
        return this.f23932o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f23936s == i10 && this.f23937t == i11 && this.f23935r == i12) {
            return;
        }
        this.f23936s = i10;
        this.f23937t = i11;
        this.f23935r = i12;
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
        if (this.f23926i == z10) {
            return;
        }
        this.f23926i = z10;
        if (z10) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        this.d.setXfermode(porterDuffXfermode);
        b();
    }

    public final void k(boolean z10) {
        if (this.f23942z == z10) {
            return;
        }
        this.f23942z = z10;
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
        if (this.f23932o != f7) {
            this.f23932o = f7;
            b();
            np npVar = this.D;
            if (npVar != null) {
                npVar.b();
            }
        }
    }
}
