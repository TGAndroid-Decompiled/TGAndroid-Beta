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
public class f5 extends Drawable implements n5 {
    public boolean D;
    public bi.ud E;
    public Integer F;
    public int G;
    public PorterDuffColorFilter H;
    public int I;
    public int J;
    public final Rect K;
    public final wf L;
    public boolean f33460a;
    public final int f33461b;
    public final OvershootInterpolator f33462c;
    public final v5 d;
    public final v5 f33463e;
    public final Drawable[] f33464f;
    public View h;
    public org.telegram.ui.t11 f33465n;
    public final boolean f33466r;
    public final int f33467s;
    public int f33468w;
    public boolean f33469x;
    public Integer f33470y;

    public f5(int i7, View view) {
        this(i7, 7, view, false);
    }

    public final void a() {
        if (!this.f33469x) {
            this.f33469x = true;
            Drawable[] drawableArr = this.f33464f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof h5) {
                ((h5) drawable).b(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof h5) {
                ((h5) drawable2).b(this);
            }
        }
    }

    public final void b() {
        if (this.f33469x) {
            this.f33469x = false;
            Drawable[] drawableArr = this.f33464f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof h5) {
                ((h5) drawable).o(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof h5) {
                ((h5) drawable2).o(this);
            }
        }
    }

    public final Drawable c() {
        return this.f33464f[0];
    }

    public final boolean d() {
        if (this.f33464f[0] != null) {
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
        Rect rect = this.K;
        rect.set(bounds);
        rect.offset(this.I, this.J);
        float d = this.f33463e.d(this.D);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        wf wfVar = this.L;
        if (i7 > 0) {
            bi.ud udVar = this.E;
            udVar.f4844c.set(rect);
            udVar.e();
            this.E.d();
            bi.ud udVar2 = this.E;
            Integer num = this.F;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            udVar2.a(canvas, org.telegram.ui.ActionBar.m6.r1(d, intValue));
            bg.k.d().a(15, wfVar);
        } else {
            bg.k.d().f(wfVar);
        }
        Drawable[] drawableArr = this.f33464f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f33467s;
        if (drawable != null && e10 < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e10) * this.f33468w));
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
            if (drawable2 instanceof h5) {
                drawable2.setBounds(rect);
            } else if (this.f33460a) {
                int i11 = intrinsicWidth2 / 2;
                int i12 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i11, rect.centerY() - i12, rect.centerX() + i11, rect.centerY() + i12);
            } else {
                int i13 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i13, rect.left + intrinsicWidth2, rect.centerY() + i13);
            }
            drawableArr[1].setColorFilter(this.H);
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
            boolean z9 = drawable3 instanceof h5;
            OvershootInterpolator overshootInterpolator = this.f33462c;
            if (z9) {
                di.z2 z2Var = ((h5) drawable3).f34176k;
                if (z2Var != null) {
                    z2Var.J0(org.telegram.messenger.g0.L(4.0f));
                }
                if (e10 < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f33460a) {
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
            drawableArr[0].setAlpha(this.f33468w);
            drawableArr[0].setColorFilter(this.H);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f10;
        Drawable[] drawableArr = this.f33464f;
        Drawable drawable = drawableArr[1];
        float f11 = 0.0f;
        v5 v5Var = this.d;
        if (drawable != null) {
            f10 = 1.0f - v5Var.f38854c;
        } else {
            f10 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f11 = v5Var.f38854c;
        }
        return f10 + f11;
    }

    public final void f() {
        h5 h5Var;
        di.z2 z2Var;
        Drawable drawable = this.f33464f[0];
        if ((drawable instanceof h5) && (z2Var = (h5Var = (h5) drawable).f34176k) != null) {
            h5Var.v(z2Var);
            z2Var.P0(false);
        }
    }

    public final void g(Drawable drawable, boolean z9) {
        Drawable[] drawableArr = this.f33464f;
        if (drawableArr[0] == drawable) {
            return;
        }
        v5 v5Var = this.d;
        if (z9) {
            v5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f33469x && (drawable2 instanceof h5)) {
                    ((h5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            v5Var.e(true, 1.0f);
            boolean z10 = this.f33469x;
            if (z10) {
                b();
            }
            drawableArr[0] = drawable;
            if (z10) {
                a();
            }
        }
        this.F = null;
        this.H = null;
        this.G = 0;
        f();
        invalidate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f33467s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f33467s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i7, boolean z9) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f33464f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof h5) && document != null && ((h5) drawable).h() == document.f26966id) {
            return;
        }
        v5 v5Var = this.d;
        if (z9) {
            v5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof h5) {
                    ((h5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f33470y;
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = org.telegram.messenger.p10.f24474s0;
                }
                h5 l10 = h5.l(i11, i7, document);
                drawableArr[0] = l10;
                if (this.f33469x) {
                    l10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            v5Var.e(true, 1.0f);
            boolean z10 = this.f33469x;
            if (z10) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f33470y;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = org.telegram.messenger.p10.f24474s0;
                }
                drawableArr[0] = h5.l(i10, i7, document);
            } else {
                drawableArr[0] = null;
            }
            if (z10) {
                a();
            }
        }
        this.F = null;
        this.H = null;
        this.G = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z9) {
        h(document, this.f33461b, z9);
    }

    @Override
    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f33466r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.t11 t11Var = this.f33465n;
        if (t11Var != null) {
            t11Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j3, boolean z9) {
        int i7;
        int i10;
        Drawable[] drawableArr = this.f33464f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof h5) && ((h5) drawable).h() == j3) {
            return false;
        }
        int i11 = this.f33461b;
        v5 v5Var = this.d;
        if (z9) {
            v5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f33469x && (drawable2 instanceof h5)) {
                    ((h5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f33470y;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = org.telegram.messenger.p10.f24474s0;
            }
            h5 m10 = h5.m(i10, j3, null, i11);
            drawableArr[0] = m10;
            if (this.f33469x) {
                m10.b(this);
            }
        } else {
            v5Var.e(true, 1.0f);
            boolean z10 = this.f33469x;
            if (z10) {
                b();
            }
            Integer num2 = this.f33470y;
            if (num2 != null) {
                i7 = num2.intValue();
            } else {
                i7 = org.telegram.messenger.p10.f24474s0;
            }
            drawableArr[0] = h5.m(i7, j3, null, i11);
            if (z10) {
                a();
            }
        }
        this.F = null;
        this.H = null;
        this.G = 0;
        f();
        invalidate();
        return true;
    }

    public final void k(Integer num) {
        PorterDuffColorFilter porterDuffColorFilter;
        Integer num2 = this.F;
        if (num2 != null || num != null) {
            if (num2 == null || !num2.equals(num)) {
                this.F = num;
                if (num != null && this.G == num.intValue()) {
                    return;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    this.G = intValue;
                    porterDuffColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                } else {
                    porterDuffColorFilter = null;
                }
                this.H = porterDuffColorFilter;
            }
        }
    }

    public final void l(View view) {
        this.d.f38852a = view;
        this.f33463e.f38852a = view;
        this.h = view;
    }

    public final void m(boolean z9, boolean z10) {
        if (this.D == z9) {
            return;
        }
        if (z10) {
            if (this.E == null) {
                this.E = new bi.ud(1, 8);
            }
            this.D = z9;
            invalidate();
            return;
        }
        this.D = z9;
        if (z9 && this.E == null) {
            this.E = new bi.ud(1, 8);
        } else if (!z9 && this.E != null) {
            this.E = null;
        }
        this.f33463e.f(z9, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f33468w = i7;
    }

    public f5(int i7, View view, boolean z9) {
        this(i7, 7, view, z9);
    }

    public f5(int i7, int i10, View view, boolean z9) {
        this.f33460a = false;
        this.f33462c = new OvershootInterpolator(2.0f);
        wq wqVar = wq.f40047g;
        v5 v5Var = new v5((View) null, 300L, wqVar);
        this.d = v5Var;
        v5 v5Var2 = new v5((View) null, 300L, wqVar);
        this.f33463e = v5Var2;
        this.f33464f = new Drawable[2];
        this.f33468w = 255;
        this.K = new Rect();
        this.L = new wf(this, 6);
        v5Var.f38852a = view;
        this.h = view;
        v5Var2.f38852a = view;
        this.f33467s = i7;
        this.f33461b = i10;
        this.f33466r = z9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
