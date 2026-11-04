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
    public ci.lc F;
    public Integer G;
    public int H;
    public PorterDuffColorFilter I;
    public int J;
    public int K;
    public final Rect L;
    public final vf M;
    public boolean f33282a;
    public final int f33283b;
    public final OvershootInterpolator f33284c;
    public final u5 d;
    public final u5 f33285e;
    public final Drawable[] f33286f;
    public View h;
    public org.telegram.ui.g11 f33287n;
    public final boolean f33288r;
    public final int f33289s;
    public int f33290w;
    public boolean f33291x;
    public Integer f33292y;

    public e5(int i3, View view) {
        this(i3, 7, view, false);
    }

    public final void a() {
        if (!this.f33291x) {
            this.f33291x = true;
            Drawable[] drawableArr = this.f33286f;
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
        if (this.f33291x) {
            this.f33291x = false;
            Drawable[] drawableArr = this.f33286f;
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
        return this.f33286f[0];
    }

    public final boolean d() {
        if (this.f33286f[0] != null) {
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
        float d = this.f33285e.d(this.E);
        int i3 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        vf vfVar = this.M;
        if (i3 > 0) {
            ci.lc lcVar = this.F;
            lcVar.f5515c.set(rect);
            lcVar.e();
            this.F.d();
            ci.lc lcVar2 = this.F;
            Integer num = this.G;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            lcVar2.a(canvas, org.telegram.ui.ActionBar.k6.r1(d, intValue));
            cg.j.d().a(15, vfVar);
        } else {
            cg.j.d().f(vfVar);
        }
        Drawable[] drawableArr = this.f33286f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f33289s;
        if (drawable != null && e10 < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e10) * this.f33290w));
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
            } else if (this.f33282a) {
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
            OvershootInterpolator overshootInterpolator = this.f33284c;
            if (z10) {
                ei.c3 c3Var = ((g5) drawable3).f33971k;
                if (c3Var != null) {
                    c3Var.J0(org.telegram.messenger.g0.L(4.0f));
                }
                if (e10 < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f33282a) {
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
            drawableArr[0].setAlpha(this.f33290w);
            drawableArr[0].setColorFilter(this.I);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f10;
        Drawable[] drawableArr = this.f33286f;
        Drawable drawable = drawableArr[1];
        float f11 = 0.0f;
        u5 u5Var = this.d;
        if (drawable != null) {
            f10 = 1.0f - u5Var.f38645c;
        } else {
            f10 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f11 = u5Var.f38645c;
        }
        return f10 + f11;
    }

    public final void f() {
        g5 g5Var;
        ei.c3 c3Var;
        Drawable drawable = this.f33286f[0];
        if ((drawable instanceof g5) && (c3Var = (g5Var = (g5) drawable).f33971k) != null) {
            g5Var.v(c3Var);
            c3Var.P0(false);
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f33286f;
        if (drawableArr[0] == drawable) {
            return;
        }
        u5 u5Var = this.d;
        if (z10) {
            u5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f33291x && (drawable2 instanceof g5)) {
                    ((g5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            u5Var.e(true, 1.0f);
            boolean z11 = this.f33291x;
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
        return this.f33289s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f33289s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i3, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f33286f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof g5) && document != null && ((g5) drawable).h() == document.f27007id) {
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
                Integer num = this.f33292y;
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = org.telegram.messenger.h10.f22829t0;
                }
                g5 l10 = g5.l(i11, i3, document);
                drawableArr[0] = l10;
                if (this.f33291x) {
                    l10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            u5Var.e(true, 1.0f);
            boolean z11 = this.f33291x;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f33292y;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = org.telegram.messenger.h10.f22829t0;
                }
                drawableArr[0] = g5.l(i10, i3, document);
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
        h(document, this.f33283b, z10);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f33288r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.g11 g11Var = this.f33287n;
        if (g11Var != null) {
            g11Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j10, boolean z10) {
        int i3;
        int i10;
        Drawable[] drawableArr = this.f33286f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof g5) && ((g5) drawable).h() == j10) {
            return false;
        }
        int i11 = this.f33283b;
        u5 u5Var = this.d;
        if (z10) {
            u5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f33291x && (drawable2 instanceof g5)) {
                    ((g5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f33292y;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = org.telegram.messenger.h10.f22829t0;
            }
            g5 m10 = g5.m(i10, j10, null, i11);
            drawableArr[0] = m10;
            if (this.f33291x) {
                m10.b(this);
            }
        } else {
            u5Var.e(true, 1.0f);
            boolean z11 = this.f33291x;
            if (z11) {
                b();
            }
            Integer num2 = this.f33292y;
            if (num2 != null) {
                i3 = num2.intValue();
            } else {
                i3 = org.telegram.messenger.h10.f22829t0;
            }
            drawableArr[0] = g5.m(i3, j10, null, i11);
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
        this.d.f38643a = view;
        this.f33285e.f38643a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.E == z10) {
            return;
        }
        if (z11) {
            if (this.F == null) {
                this.F = new ci.lc(1, 8);
            }
            this.E = z10;
            invalidate();
            return;
        }
        this.E = z10;
        if (z10 && this.F == null) {
            this.F = new ci.lc(1, 8);
        } else if (!z10 && this.F != null) {
            this.F = null;
        }
        this.f33285e.f(z10, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i3) {
        this.f33290w = i3;
    }

    public e5(int i3, View view, boolean z10) {
        this(i3, 7, view, z10);
    }

    public e5(int i3, int i10, View view, boolean z10) {
        this.f33282a = false;
        this.f33284c = new OvershootInterpolator(2.0f);
        xq xqVar = xq.f40453g;
        u5 u5Var = new u5((View) null, 300L, xqVar);
        this.d = u5Var;
        u5 u5Var2 = new u5((View) null, 300L, xqVar);
        this.f33285e = u5Var2;
        this.f33286f = new Drawable[2];
        this.f33290w = 255;
        this.L = new Rect();
        this.M = new vf(this, 6);
        u5Var.f38643a = view;
        this.h = view;
        u5Var2.f38643a = view;
        this.f33289s = i3;
        this.f33283b = i10;
        this.f33288r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
