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
public class g5 extends Drawable implements o5 {
    public boolean D;
    public bi.ud E;
    public Integer F;
    public int G;
    public PorterDuffColorFilter H;
    public int I;
    public int J;
    public final Rect K;
    public final xf L;
    public boolean f33785a;
    public final int f33786b;
    public final OvershootInterpolator f33787c;
    public final w5 d;
    public final w5 f33788e;
    public final Drawable[] f33789f;
    public View h;
    public org.telegram.ui.q11 f33790n;
    public final boolean f33791r;
    public final int f33792s;
    public int f33793w;
    public boolean f33794x;
    public Integer f33795y;

    public g5(int i7, View view) {
        this(i7, 7, view, false);
    }

    public final void a() {
        if (!this.f33794x) {
            this.f33794x = true;
            Drawable[] drawableArr = this.f33789f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof i5) {
                ((i5) drawable).b(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof i5) {
                ((i5) drawable2).b(this);
            }
        }
    }

    public final void b() {
        if (this.f33794x) {
            this.f33794x = false;
            Drawable[] drawableArr = this.f33789f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof i5) {
                ((i5) drawable).o(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof i5) {
                ((i5) drawable2).o(this);
            }
        }
    }

    public final Drawable c() {
        return this.f33789f[0];
    }

    public final boolean d() {
        if (this.f33789f[0] != null) {
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
        float d = this.f33788e.d(this.D);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        xf xfVar = this.L;
        if (i7 > 0) {
            bi.ud udVar = this.E;
            udVar.f4845c.set(rect);
            udVar.e();
            this.E.d();
            bi.ud udVar2 = this.E;
            Integer num = this.F;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            udVar2.a(canvas, org.telegram.ui.ActionBar.k6.r1(d, intValue));
            bg.k.d().a(15, xfVar);
        } else {
            bg.k.d().f(xfVar);
        }
        Drawable[] drawableArr = this.f33789f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f33792s;
        if (drawable != null && e10 < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e10) * this.f33793w));
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
            if (drawable2 instanceof i5) {
                drawable2.setBounds(rect);
            } else if (this.f33785a) {
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
            boolean z9 = drawable3 instanceof i5;
            OvershootInterpolator overshootInterpolator = this.f33787c;
            if (z9) {
                di.z2 z2Var = ((i5) drawable3).f34450k;
                if (z2Var != null) {
                    z2Var.J0(org.telegram.messenger.g0.L(4.0f));
                }
                if (e10 < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f33785a) {
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
            drawableArr[0].setAlpha(this.f33793w);
            drawableArr[0].setColorFilter(this.H);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f10;
        Drawable[] drawableArr = this.f33789f;
        Drawable drawable = drawableArr[1];
        float f11 = 0.0f;
        w5 w5Var = this.d;
        if (drawable != null) {
            f10 = 1.0f - w5Var.f39857c;
        } else {
            f10 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f11 = w5Var.f39857c;
        }
        return f10 + f11;
    }

    public final void f() {
        i5 i5Var;
        di.z2 z2Var;
        Drawable drawable = this.f33789f[0];
        if ((drawable instanceof i5) && (z2Var = (i5Var = (i5) drawable).f34450k) != null) {
            i5Var.v(z2Var);
            z2Var.P0(false);
        }
    }

    public final void g(Drawable drawable, boolean z9) {
        Drawable[] drawableArr = this.f33789f;
        if (drawableArr[0] == drawable) {
            return;
        }
        w5 w5Var = this.d;
        if (z9) {
            w5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f33794x && (drawable2 instanceof i5)) {
                    ((i5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            w5Var.e(true, 1.0f);
            boolean z10 = this.f33794x;
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
        return this.f33792s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f33792s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i7, boolean z9) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f33789f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof i5) && document != null && ((i5) drawable).h() == document.f26958id) {
            return;
        }
        w5 w5Var = this.d;
        if (z9) {
            w5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof i5) {
                    ((i5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f33795y;
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = org.telegram.messenger.p10.f24459s0;
                }
                i5 l10 = i5.l(i11, i7, document);
                drawableArr[0] = l10;
                if (this.f33794x) {
                    l10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            w5Var.e(true, 1.0f);
            boolean z10 = this.f33794x;
            if (z10) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f33795y;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = org.telegram.messenger.p10.f24459s0;
                }
                drawableArr[0] = i5.l(i10, i7, document);
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
        h(document, this.f33786b, z9);
    }

    @Override
    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f33791r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.q11 q11Var = this.f33790n;
        if (q11Var != null) {
            q11Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j3, boolean z9) {
        int i7;
        int i10;
        Drawable[] drawableArr = this.f33789f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof i5) && ((i5) drawable).h() == j3) {
            return false;
        }
        int i11 = this.f33786b;
        w5 w5Var = this.d;
        if (z9) {
            w5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f33794x && (drawable2 instanceof i5)) {
                    ((i5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f33795y;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = org.telegram.messenger.p10.f24459s0;
            }
            i5 m10 = i5.m(i10, j3, null, i11);
            drawableArr[0] = m10;
            if (this.f33794x) {
                m10.b(this);
            }
        } else {
            w5Var.e(true, 1.0f);
            boolean z10 = this.f33794x;
            if (z10) {
                b();
            }
            Integer num2 = this.f33795y;
            if (num2 != null) {
                i7 = num2.intValue();
            } else {
                i7 = org.telegram.messenger.p10.f24459s0;
            }
            drawableArr[0] = i5.m(i7, j3, null, i11);
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
        this.d.f39855a = view;
        this.f33788e.f39855a = view;
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
        this.f33788e.f(z9, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f33793w = i7;
    }

    public g5(int i7, View view, boolean z9) {
        this(i7, 7, view, z9);
    }

    public g5(int i7, int i10, View view, boolean z9) {
        this.f33785a = false;
        this.f33787c = new OvershootInterpolator(2.0f);
        xq xqVar = xq.f40330g;
        w5 w5Var = new w5((View) null, 300L, xqVar);
        this.d = w5Var;
        w5 w5Var2 = new w5((View) null, 300L, xqVar);
        this.f33788e = w5Var2;
        this.f33789f = new Drawable[2];
        this.f33793w = 255;
        this.K = new Rect();
        this.L = new xf(this, 6);
        w5Var.f39855a = view;
        this.h = view;
        w5Var2.f39855a = view;
        this.f33792s = i7;
        this.f33786b = i10;
        this.f33791r = z9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
