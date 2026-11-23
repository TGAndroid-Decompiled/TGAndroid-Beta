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
public class n5 extends Drawable implements v5 {
    public boolean E;
    public di.ec F;
    public Integer G;
    public int H;
    public PorterDuffColorFilter I;
    public int J;
    public int K;
    public final Rect L;
    public final og M;
    public boolean f37773a;
    public final int f37774b;
    public final OvershootInterpolator f37775c;
    public final d6 d;
    public final d6 f37776e;
    public final Drawable[] f37777f;
    public View h;
    public org.telegram.ui.s11 f37778n;
    public final boolean f37779r;
    public final int f37780s;
    public int f37781w;
    public boolean f37782x;
    public Integer f37783y;

    public n5(int i7, View view) {
        this(i7, 7, view, false);
    }

    public final void a() {
        if (!this.f37782x) {
            this.f37782x = true;
            Drawable[] drawableArr = this.f37777f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof p5) {
                ((p5) drawable).b(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof p5) {
                ((p5) drawable2).b(this);
            }
        }
    }

    public final void b() {
        if (this.f37782x) {
            this.f37782x = false;
            Drawable[] drawableArr = this.f37777f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof p5) {
                ((p5) drawable).o(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof p5) {
                ((p5) drawable2).o(this);
            }
        }
    }

    public final Drawable c() {
        return this.f37777f[0];
    }

    public final boolean d() {
        if (this.f37777f[0] != null) {
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
        float d = this.f37776e.d(this.E);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        og ogVar = this.M;
        if (i7 > 0) {
            di.ec ecVar = this.F;
            ecVar.f8758c.set(rect);
            ecVar.e();
            this.F.d();
            di.ec ecVar2 = this.F;
            Integer num = this.G;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            ecVar2.a(canvas, org.telegram.ui.ActionBar.m6.r1(d, intValue));
            bg.k.d().a(15, ogVar);
        } else {
            bg.k.d().f(ogVar);
        }
        Drawable[] drawableArr = this.f37777f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f37780s;
        if (drawable != null && e10 < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e10) * this.f37781w));
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
            if (drawable2 instanceof p5) {
                drawable2.setBounds(rect);
            } else if (this.f37773a) {
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
            boolean z10 = drawable3 instanceof p5;
            OvershootInterpolator overshootInterpolator = this.f37775c;
            if (z10) {
                fi.s2 s2Var = ((p5) drawable3).f38499k;
                if (s2Var != null) {
                    s2Var.J0(org.telegram.messenger.g0.L(4.0f));
                }
                if (e10 < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f37773a) {
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
            drawableArr[0].setAlpha(this.f37781w);
            drawableArr[0].setColorFilter(this.I);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f10;
        Drawable[] drawableArr = this.f37777f;
        Drawable drawable = drawableArr[1];
        float f11 = 0.0f;
        d6 d6Var = this.d;
        if (drawable != null) {
            f10 = 1.0f - d6Var.f34386c;
        } else {
            f10 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f11 = d6Var.f34386c;
        }
        return f10 + f11;
    }

    public final void f() {
        p5 p5Var;
        fi.s2 s2Var;
        Drawable drawable = this.f37777f[0];
        if ((drawable instanceof p5) && (s2Var = (p5Var = (p5) drawable).f38499k) != null) {
            p5Var.v(s2Var);
            s2Var.P0(false);
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f37777f;
        if (drawableArr[0] == drawable) {
            return;
        }
        d6 d6Var = this.d;
        if (z10) {
            d6Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f37782x && (drawable2 instanceof p5)) {
                    ((p5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            d6Var.e(true, 1.0f);
            boolean z11 = this.f37782x;
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
        return this.f37780s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f37780s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i7, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f37777f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof p5) && document != null && ((p5) drawable).h() == document.f28440id) {
            return;
        }
        d6 d6Var = this.d;
        if (z10) {
            d6Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof p5) {
                    ((p5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f37783y;
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = org.telegram.messenger.k10.f24968t0;
                }
                p5 l10 = p5.l(i11, i7, document);
                drawableArr[0] = l10;
                if (this.f37782x) {
                    l10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            d6Var.e(true, 1.0f);
            boolean z11 = this.f37782x;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f37783y;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = org.telegram.messenger.k10.f24968t0;
                }
                drawableArr[0] = p5.l(i10, i7, document);
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
        h(document, this.f37774b, z10);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f37779r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.s11 s11Var = this.f37778n;
        if (s11Var != null) {
            s11Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j3, boolean z10) {
        int i7;
        int i10;
        Drawable[] drawableArr = this.f37777f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof p5) && ((p5) drawable).h() == j3) {
            return false;
        }
        int i11 = this.f37774b;
        d6 d6Var = this.d;
        if (z10) {
            d6Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f37782x && (drawable2 instanceof p5)) {
                    ((p5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f37783y;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = org.telegram.messenger.k10.f24968t0;
            }
            p5 m10 = p5.m(i10, j3, null, i11);
            drawableArr[0] = m10;
            if (this.f37782x) {
                m10.b(this);
            }
        } else {
            d6Var.e(true, 1.0f);
            boolean z11 = this.f37782x;
            if (z11) {
                b();
            }
            Integer num2 = this.f37783y;
            if (num2 != null) {
                i7 = num2.intValue();
            } else {
                i7 = org.telegram.messenger.k10.f24968t0;
            }
            drawableArr[0] = p5.m(i7, j3, null, i11);
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
        this.d.f34384a = view;
        this.f37776e.f34384a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.E == z10) {
            return;
        }
        if (z11) {
            if (this.F == null) {
                this.F = new di.ec(1, 8);
            }
            this.E = z10;
            invalidate();
            return;
        }
        this.E = z10;
        if (z10 && this.F == null) {
            this.F = new di.ec(1, 8);
        } else if (!z10 && this.F != null) {
            this.F = null;
        }
        this.f37776e.f(z10, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f37781w = i7;
    }

    public n5(int i7, View view, boolean z10) {
        this(i7, 7, view, z10);
    }

    public n5(int i7, int i10, View view, boolean z10) {
        this.f37773a = false;
        this.f37775c = new OvershootInterpolator(2.0f);
        nr nrVar = nr.f37961g;
        d6 d6Var = new d6((View) null, 300L, nrVar);
        this.d = d6Var;
        d6 d6Var2 = new d6((View) null, 300L, nrVar);
        this.f37776e = d6Var2;
        this.f37777f = new Drawable[2];
        this.f37781w = 255;
        this.L = new Rect();
        this.M = new og(this, 6);
        d6Var.f34384a = view;
        this.h = view;
        d6Var2.f34384a = view;
        this.f37780s = i7;
        this.f37774b = i10;
        this.f37779r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
