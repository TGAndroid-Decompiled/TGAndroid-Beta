package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public class i5 extends Drawable implements q5 {
    public hh.bb A;
    public Integer B;
    public int C;
    public PorterDuffColorFilter D;
    public int E;
    public int F;
    public final Rect G;
    public final bg H;

    public boolean f29225a;

    public final int f29226b;

    public final OvershootInterpolator f29227c;
    public final y5 d;

    public final y5 f29228e;

    public final Drawable[] f29229f;
    public View h;

    public org.telegram.ui.a61 f29230n;

    public final boolean f29231r;

    public final int f29232s;
    public int v;

    public boolean f29233w;

    public Integer f29234x;

    public boolean f29235y;

    public i5(int i10, View view) {
        this(i10, 7, view, false);
    }

    public final void a() {
        if (this.f29233w) {
            return;
        }
        this.f29233w = true;
        Drawable[] drawableArr = this.f29229f;
        Drawable drawable = drawableArr[0];
        if (drawable instanceof k5) {
            ((k5) drawable).b(this);
        }
        Drawable drawable2 = drawableArr[1];
        if (drawable2 instanceof k5) {
            ((k5) drawable2).b(this);
        }
    }

    public final void b() {
        if (this.f29233w) {
            this.f29233w = false;
            Drawable[] drawableArr = this.f29229f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof k5) {
                ((k5) drawable).p(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof k5) {
                ((k5) drawable2).p(this);
            }
        }
    }

    public final Drawable c() {
        return this.f29229f[0];
    }

    public final boolean d() {
        return this.f29229f[0] == null;
    }

    @Override
    public final void draw(Canvas canvas) {
        float fD = this.d.d(1.0f, false);
        Rect bounds = getBounds();
        Rect rect = this.G;
        rect.set(bounds);
        rect.offset(this.E, this.F);
        float fE = this.f29228e.e(this.f29235y);
        bg bgVar = this.H;
        if (fE > 0.0f) {
            hh.bb bbVar = this.A;
            bbVar.f9034c.set(rect);
            bbVar.e();
            this.A.d();
            hh.bb bbVar2 = this.A;
            Integer num = this.B;
            bbVar2.a(canvas, org.telegram.ui.ActionBar.g6.l1(fE, num == null ? -1 : num.intValue()));
            gf.k.d().a(15, bgVar);
        } else {
            gf.k.d().g(bgVar);
        }
        Drawable[] drawableArr = this.f29229f;
        Drawable drawable = drawableArr[1];
        int intrinsicHeight = this.f29232s;
        if (drawable != null && fD < 1.0f) {
            drawable.setAlpha((int) ((1.0f - fD) * this.v));
            int intrinsicWidth = drawableArr[1].getIntrinsicWidth() < 0 ? intrinsicHeight : drawableArr[1].getIntrinsicWidth();
            int intrinsicHeight2 = drawableArr[1].getIntrinsicHeight() < 0 ? intrinsicHeight : drawableArr[1].getIntrinsicHeight();
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof k5) {
                drawable2.setBounds(rect);
            } else if (this.f29225a) {
                int i10 = intrinsicWidth / 2;
                int i11 = intrinsicHeight2 / 2;
                drawable2.setBounds(rect.centerX() - i10, rect.centerY() - i11, rect.centerX() + i10, rect.centerY() + i11);
            } else {
                int i12 = intrinsicHeight2 / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i12, rect.left + intrinsicWidth, rect.centerY() + i12);
            }
            drawableArr[1].setColorFilter(this.D);
            drawableArr[1].draw(canvas);
            drawableArr[1].setColorFilter(null);
        }
        if (drawableArr[0] != null) {
            canvas.save();
            int intrinsicWidth2 = drawableArr[0].getIntrinsicWidth() < 0 ? intrinsicHeight : drawableArr[0].getIntrinsicWidth();
            if (drawableArr[0].getIntrinsicHeight() >= 0) {
                intrinsicHeight = drawableArr[0].getIntrinsicHeight();
            }
            Drawable drawable3 = drawableArr[0];
            boolean z10 = drawable3 instanceof k5;
            OvershootInterpolator overshootInterpolator = this.f29227c;
            if (z10) {
                jh.y2 y2Var = ((k5) drawable3).f29961k;
                if (y2Var != null) {
                    y2Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                }
                if (fD < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(fD);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f29225a) {
                if (fD < 1.0f) {
                    float interpolation2 = overshootInterpolator.getInterpolation(fD);
                    canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                }
                int i13 = intrinsicWidth2 / 2;
                int i14 = intrinsicHeight / 2;
                drawableArr[0].setBounds(rect.centerX() - i13, rect.centerY() - i14, rect.centerX() + i13, rect.centerY() + i14);
            } else {
                if (fD < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(fD);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth2 / 2.0f) + rect.left, rect.centerY());
                }
                int i15 = intrinsicHeight / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i15, rect.left + intrinsicWidth2, rect.centerY() + i15);
            }
            drawableArr[0].setAlpha(this.v);
            drawableArr[0].setColorFilter(this.D);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        Drawable[] drawableArr = this.f29229f;
        Drawable drawable = drawableArr[1];
        y5 y5Var = this.d;
        return (drawable != null ? 1.0f - y5Var.f34812c : 0.0f) + (drawableArr[0] != null ? y5Var.f34812c : 0.0f);
    }

    public final void f() {
        k5 k5Var;
        jh.y2 y2Var;
        Drawable drawable = this.f29229f[0];
        if (!(drawable instanceof k5) || (y2Var = (k5Var = (k5) drawable).f29961k) == null) {
            return;
        }
        k5Var.w(y2Var);
        y2Var.startAnimation();
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f29229f;
        if (drawableArr[0] == drawable) {
            return;
        }
        y5 y5Var = this.d;
        if (z10) {
            y5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f29233w && (drawable2 instanceof k5)) {
                    ((k5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            y5Var.d(1.0f, true);
            boolean z11 = this.f29233w;
            if (z11) {
                b();
            }
            drawableArr[0] = drawable;
            if (z11) {
                a();
            }
        }
        this.B = null;
        this.D = null;
        this.C = 0;
        f();
        invalidate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f29232s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29232s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i10, boolean z10) {
        Drawable[] drawableArr = this.f29229f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof k5) && document != null && ((k5) drawable).i() == document.f22386id) {
            return;
        }
        y5 y5Var = this.d;
        if (z10) {
            y5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof k5) {
                    ((k5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f29234x;
                k5 k5VarM = k5.m(num != null ? num.intValue() : UserConfig.selectedAccount, i10, document);
                drawableArr[0] = k5VarM;
                if (this.f29233w) {
                    k5VarM.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            y5Var.d(1.0f, true);
            boolean z11 = this.f29233w;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f29234x;
                drawableArr[0] = k5.m(num2 != null ? num2.intValue() : UserConfig.selectedAccount, i10, document);
            } else {
                drawableArr[0] = null;
            }
            if (z11) {
                a();
            }
        }
        this.B = null;
        this.D = null;
        this.C = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z10) {
        h(document, this.f29226b, z10);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f29231r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.a61 a61Var = this.f29230n;
        if (a61Var != null) {
            a61Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j10, boolean z10) {
        Drawable[] drawableArr = this.f29229f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof k5) && ((k5) drawable).i() == j10) {
            return false;
        }
        int i10 = this.f29226b;
        y5 y5Var = this.d;
        if (z10) {
            y5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f29233w && (drawable2 instanceof k5)) {
                    ((k5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f29234x;
            k5 k5VarN = k5.n(num != null ? num.intValue() : UserConfig.selectedAccount, j10, null, i10);
            drawableArr[0] = k5VarN;
            if (this.f29233w) {
                k5VarN.b(this);
            }
        } else {
            y5Var.d(1.0f, true);
            boolean z11 = this.f29233w;
            if (z11) {
                b();
            }
            Integer num2 = this.f29234x;
            drawableArr[0] = k5.n(num2 != null ? num2.intValue() : UserConfig.selectedAccount, j10, null, i10);
            if (z11) {
                a();
            }
        }
        this.B = null;
        this.D = null;
        this.C = 0;
        f();
        invalidate();
        return true;
    }

    public final void k(Integer num) {
        PorterDuffColorFilter porterDuffColorFilter;
        Integer num2 = this.B;
        if (num2 == null && num == null) {
            return;
        }
        if (num2 == null || !num2.equals(num)) {
            this.B = num;
            if (num == null || this.C != num.intValue()) {
                if (num != null) {
                    int iIntValue = num.intValue();
                    this.C = iIntValue;
                    porterDuffColorFilter = new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
                } else {
                    porterDuffColorFilter = null;
                }
                this.D = porterDuffColorFilter;
            }
        }
    }

    public final void l(View view) {
        this.d.f34810a = view;
        this.f29228e.f34810a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.f29235y == z10) {
            return;
        }
        if (z11) {
            if (this.A == null) {
                this.A = new hh.bb(1, 8);
            }
            this.f29235y = z10;
            invalidate();
            return;
        }
        this.f29235y = z10;
        if (z10 && this.A == null) {
            this.A = new hh.bb(1, 8);
        } else if (!z10 && this.A != null) {
            this.A = null;
        }
        this.f29228e.f(z10, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i10) {
        this.v = i10;
    }

    public i5(View view, int i10, boolean z10) {
        this(i10, 7, view, z10);
    }

    public i5(int i10, int i11, View view, boolean z10) {
        this.f29225a = false;
        this.f29227c = new OvershootInterpolator(2.0f);
        er erVar = er.f28123g;
        y5 y5Var = new y5((View) null, 300L, erVar);
        this.d = y5Var;
        y5 y5Var2 = new y5((View) null, 300L, erVar);
        this.f29228e = y5Var2;
        this.f29229f = new Drawable[2];
        this.v = 255;
        this.G = new Rect();
        this.H = new bg(this, 6);
        y5Var.f34810a = view;
        this.h = view;
        y5Var2.f34810a = view;
        this.f29232s = i10;
        this.f29226b = i11;
        this.f29231r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
