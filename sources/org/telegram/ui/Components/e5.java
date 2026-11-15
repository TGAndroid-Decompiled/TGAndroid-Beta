package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.tgnet.TLRPC;
public class e5 extends Drawable implements m5 {
    public boolean E;
    public di.ac F;
    public Integer G;
    public int H;
    public PorterDuffColorFilter I;
    public int J;
    public int K;
    public final Rect L;
    public final dg M;
    public boolean f34177a;
    public final int f34178b;
    public final OvershootInterpolator f34179c;
    public final u5 d;
    public final u5 f34180e;
    public final Drawable[] f34181f;
    public View h;
    public org.telegram.ui.n11 f34182n;
    public final boolean f34183r;
    public final int f34184s;
    public int f34185w;
    public boolean f34186x;
    public Integer f34187y;

    public e5(int i7, View view) {
        this(i7, 7, view, false);
    }

    public final void a() {
        if (!this.f34186x) {
            this.f34186x = true;
            Drawable[] drawableArr = this.f34181f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof g5) {
                ((g5) drawable).b(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof g5) {
                ((g5) drawable2).b(this);
            }
        }
    }

    public final void b() {
        if (this.f34186x) {
            this.f34186x = false;
            Drawable[] drawableArr = this.f34181f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof g5) {
                ((g5) drawable).o(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof g5) {
                ((g5) drawable2).o(this);
            }
        }
    }

    public final Drawable c() {
        return this.f34181f[0];
    }

    public final boolean d() {
        if (this.f34181f[0] != null) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        int intrinsicWidth;
        int intrinsicWidth2;
        int intrinsicHeight;
        int intValue;
        float e10 = this.d.e(false, 1.0f);
        Rect bounds = getBounds();
        Rect rect = this.L;
        rect.set(bounds);
        rect.offset(this.J, this.K);
        float d = this.f34180e.d(this.E);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        dg dgVar = this.M;
        if (i7 > 0) {
            di.ac acVar = this.F;
            acVar.f8219c.set(rect);
            acVar.e();
            this.F.d();
            di.ac acVar2 = this.F;
            Integer num = this.G;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            acVar2.a(canvas, org.telegram.ui.ActionBar.j6.r1(d, intValue));
            bg.k.d().a(15, dgVar);
        } else {
            bg.k.d().f(dgVar);
        }
        Drawable[] drawableArr = this.f34181f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f34184s;
        if (drawable != null && e10 < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e10) * this.f34185w));
            if (drawableArr[1].getIntrinsicWidth() < 0) {
                intrinsicWidth2 = i10;
            } else {
                intrinsicWidth2 = drawableArr[1].getIntrinsicWidth();
            }
            if (drawableArr[1].getIntrinsicHeight() < 0) {
                intrinsicHeight = i10;
            } else {
                intrinsicHeight = drawableArr[1].getIntrinsicHeight();
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof g5) {
                drawable2.setBounds(rect);
            } else if (this.f34177a) {
                int i11 = intrinsicWidth2 / 2;
                int i12 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i11, rect.centerY() - i12, rect.centerX() + i11, rect.centerY() + i12);
            } else {
                int i13 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i13, rect.left + intrinsicWidth2, rect.centerY() + i13);
            }
            drawableArr[1].setColorFilter(this.I);
            drawableArr[1].draw(canvas);
            drawableArr[1].setColorFilter(null);
        }
        if (drawableArr[0] != null) {
            canvas.save();
            if (drawableArr[0].getIntrinsicWidth() < 0) {
                intrinsicWidth = i10;
            } else {
                intrinsicWidth = drawableArr[0].getIntrinsicWidth();
            }
            if (drawableArr[0].getIntrinsicHeight() >= 0) {
                i10 = drawableArr[0].getIntrinsicHeight();
            }
            Drawable drawable3 = drawableArr[0];
            boolean z10 = drawable3 instanceof g5;
            OvershootInterpolator overshootInterpolator = this.f34179c;
            if (z10) {
                fi.u2 u2Var = ((g5) drawable3).f34813k;
                if (u2Var != null) {
                    u2Var.J0(org.telegram.messenger.g0.L(4.0f));
                }
                if (e10 < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f34177a) {
                if (e10 < 1.0f) {
                    float interpolation2 = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                }
                int i14 = intrinsicWidth / 2;
                int i15 = i10 / 2;
                drawableArr[0].setBounds(rect.centerX() - i14, rect.centerY() - i15, rect.centerX() + i14, rect.centerY() + i15);
            } else {
                if (e10 < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth / 2.0f) + rect.left, rect.centerY());
                }
                int i16 = i10 / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i16, rect.left + intrinsicWidth, rect.centerY() + i16);
            }
            drawableArr[0].setAlpha(this.f34185w);
            drawableArr[0].setColorFilter(this.I);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f10;
        Drawable[] drawableArr = this.f34181f;
        Drawable drawable = drawableArr[1];
        float f11 = 0.0f;
        u5 u5Var = this.d;
        if (drawable != null) {
            f10 = 1.0f - u5Var.f39900c;
        } else {
            f10 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f11 = u5Var.f39900c;
        }
        return f10 + f11;
    }

    public final void f() {
        g5 g5Var;
        fi.u2 u2Var;
        Drawable drawable = this.f34181f[0];
        if ((drawable instanceof g5) && (u2Var = (g5Var = (g5) drawable).f34813k) != null) {
            g5Var.v(u2Var);
            u2Var.P0(false);
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f34181f;
        if (drawableArr[0] == drawable) {
            return;
        }
        u5 u5Var = this.d;
        if (z10) {
            u5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f34186x && (drawable2 instanceof g5)) {
                    ((g5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            u5Var.e(true, 1.0f);
            boolean z11 = this.f34186x;
            if (z11) {
                b();
            }
            drawableArr[0] = drawable;
            if (z11) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34184s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34184s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i7, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f34181f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof g5) && document != null && ((g5) drawable).h() == document.f28057id) {
            return;
        }
        u5 u5Var = this.d;
        if (z10) {
            u5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof g5) {
                    ((g5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f34187y;
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = org.telegram.messenger.m10.f24940t0;
                }
                g5 l10 = g5.l(i11, i7, document);
                drawableArr[0] = l10;
                if (this.f34186x) {
                    l10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            u5Var.e(true, 1.0f);
            boolean z11 = this.f34186x;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f34187y;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = org.telegram.messenger.m10.f24940t0;
                }
                drawableArr[0] = g5.l(i10, i7, document);
            } else {
                drawableArr[0] = null;
            }
            if (z11) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z10) {
        h(document, this.f34178b, z10);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f34183r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.n11 n11Var = this.f34182n;
        if (n11Var != null) {
            n11Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j3, boolean z10) {
        int i7;
        int i10;
        Drawable[] drawableArr = this.f34181f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof g5) && ((g5) drawable).h() == j3) {
            return false;
        }
        int i11 = this.f34178b;
        u5 u5Var = this.d;
        if (z10) {
            u5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f34186x && (drawable2 instanceof g5)) {
                    ((g5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f34187y;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = org.telegram.messenger.m10.f24940t0;
            }
            g5 m10 = g5.m(i10, j3, null, i11);
            drawableArr[0] = m10;
            if (this.f34186x) {
                m10.b(this);
            }
        } else {
            u5Var.e(true, 1.0f);
            boolean z11 = this.f34186x;
            if (z11) {
                b();
            }
            Integer num2 = this.f34187y;
            if (num2 != null) {
                i7 = num2.intValue();
            } else {
                i7 = org.telegram.messenger.m10.f24940t0;
            }
            drawableArr[0] = g5.m(i7, j3, null, i11);
            if (z11) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
        return true;
    }

    public final void k(Integer num) {
        PorterDuffColorFilter porterDuffColorFilter;
        Integer num2 = this.G;
        if (num2 != null || num != null) {
            if (num2 == null || !num2.equals(num)) {
                this.G = num;
                if (num != null && this.H == num.intValue()) {
                    return;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    this.H = intValue;
                    porterDuffColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                } else {
                    porterDuffColorFilter = null;
                }
                this.I = porterDuffColorFilter;
            }
        }
    }

    public final void l(View view) {
        this.d.f39898a = view;
        this.f34180e.f39898a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.E == z10) {
            return;
        }
        if (z11) {
            if (this.F == null) {
                this.F = new di.ac(1, 8);
            }
            this.E = z10;
            invalidate();
            return;
        }
        this.E = z10;
        if (z10 && this.F == null) {
            this.F = new di.ac(1, 8);
        } else if (!z10 && this.F != null) {
            this.F = null;
        }
        this.f34180e.f(z10, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34185w = i7;
    }

    public e5(int i7, View view, boolean z10) {
        this(i7, 7, view, z10);
    }

    public e5(int i7, int i10, View view, boolean z10) {
        this.f34177a = false;
        this.f34179c = new OvershootInterpolator(2.0f);
        er erVar = er.f34420g;
        u5 u5Var = new u5((View) null, 300L, erVar);
        this.d = u5Var;
        u5 u5Var2 = new u5((View) null, 300L, erVar);
        this.f34180e = u5Var2;
        this.f34181f = new Drawable[2];
        this.f34185w = 255;
        this.L = new Rect();
        this.M = new dg(this, 6);
        u5Var.f39898a = view;
        this.h = view;
        u5Var2.f39898a = view;
        this.f34184s = i7;
        this.f34178b = i10;
        this.f34183r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
