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
public class m5 extends Drawable implements u5 {
    public boolean E;
    public di.ec F;
    public Integer G;
    public int H;
    public PorterDuffColorFilter I;
    public int J;
    public int K;
    public final Rect L;
    public final lg M;
    public boolean f37357a;
    public final int f37358b;
    public final OvershootInterpolator f37359c;
    public final c6 d;
    public final c6 f37360e;
    public final Drawable[] f37361f;
    public View h;
    public org.telegram.ui.r11 f37362n;
    public final boolean f37363r;
    public final int f37364s;
    public int f37365w;
    public boolean f37366x;
    public Integer f37367y;

    public m5(int i7, View view) {
        this(i7, 7, view, false);
    }

    public final void a() {
        if (!this.f37366x) {
            this.f37366x = true;
            Drawable[] drawableArr = this.f37361f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof o5) {
                ((o5) drawable).b(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof o5) {
                ((o5) drawable2).b(this);
            }
        }
    }

    public final void b() {
        if (this.f37366x) {
            this.f37366x = false;
            Drawable[] drawableArr = this.f37361f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof o5) {
                ((o5) drawable).o(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof o5) {
                ((o5) drawable2).o(this);
            }
        }
    }

    public final Drawable c() {
        return this.f37361f[0];
    }

    public final boolean d() {
        if (this.f37361f[0] != null) {
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
        float d = this.f37360e.d(this.E);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        lg lgVar = this.M;
        if (i7 > 0) {
            di.ec ecVar = this.F;
            ecVar.f8735c.set(rect);
            ecVar.e();
            this.F.d();
            di.ec ecVar2 = this.F;
            Integer num = this.G;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            ecVar2.a(canvas, org.telegram.ui.ActionBar.n6.r1(d, intValue));
            bg.k.d().a(15, lgVar);
        } else {
            bg.k.d().f(lgVar);
        }
        Drawable[] drawableArr = this.f37361f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f37364s;
        if (drawable != null && e10 < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e10) * this.f37365w));
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
            if (drawable2 instanceof o5) {
                drawable2.setBounds(rect);
            } else if (this.f37357a) {
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
            boolean z10 = drawable3 instanceof o5;
            OvershootInterpolator overshootInterpolator = this.f37359c;
            if (z10) {
                fi.s2 s2Var = ((o5) drawable3).f37976k;
                if (s2Var != null) {
                    s2Var.J0(org.telegram.messenger.g0.L(4.0f));
                }
                if (e10 < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e10);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f37357a) {
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
            drawableArr[0].setAlpha(this.f37365w);
            drawableArr[0].setColorFilter(this.I);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f10;
        Drawable[] drawableArr = this.f37361f;
        Drawable drawable = drawableArr[1];
        float f11 = 0.0f;
        c6 c6Var = this.d;
        if (drawable != null) {
            f10 = 1.0f - c6Var.f33892c;
        } else {
            f10 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f11 = c6Var.f33892c;
        }
        return f10 + f11;
    }

    public final void f() {
        o5 o5Var;
        fi.s2 s2Var;
        Drawable drawable = this.f37361f[0];
        if ((drawable instanceof o5) && (s2Var = (o5Var = (o5) drawable).f37976k) != null) {
            o5Var.v(s2Var);
            s2Var.P0(false);
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f37361f;
        if (drawableArr[0] == drawable) {
            return;
        }
        c6 c6Var = this.d;
        if (z10) {
            c6Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f37366x && (drawable2 instanceof o5)) {
                    ((o5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            c6Var.e(true, 1.0f);
            boolean z11 = this.f37366x;
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
        return this.f37364s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f37364s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i7, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f37361f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof o5) && document != null && ((o5) drawable).h() == document.f28411id) {
            return;
        }
        c6 c6Var = this.d;
        if (z10) {
            c6Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof o5) {
                    ((o5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f37367y;
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = org.telegram.messenger.j10.f24773t0;
                }
                o5 l10 = o5.l(i11, i7, document);
                drawableArr[0] = l10;
                if (this.f37366x) {
                    l10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            c6Var.e(true, 1.0f);
            boolean z11 = this.f37366x;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f37367y;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = org.telegram.messenger.j10.f24773t0;
                }
                drawableArr[0] = o5.l(i10, i7, document);
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
        h(document, this.f37358b, z10);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f37363r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.r11 r11Var = this.f37362n;
        if (r11Var != null) {
            r11Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j3, boolean z10) {
        int i7;
        int i10;
        Drawable[] drawableArr = this.f37361f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof o5) && ((o5) drawable).h() == j3) {
            return false;
        }
        int i11 = this.f37358b;
        c6 c6Var = this.d;
        if (z10) {
            c6Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f37366x && (drawable2 instanceof o5)) {
                    ((o5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f37367y;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = org.telegram.messenger.j10.f24773t0;
            }
            o5 m10 = o5.m(i10, j3, null, i11);
            drawableArr[0] = m10;
            if (this.f37366x) {
                m10.b(this);
            }
        } else {
            c6Var.e(true, 1.0f);
            boolean z11 = this.f37366x;
            if (z11) {
                b();
            }
            Integer num2 = this.f37367y;
            if (num2 != null) {
                i7 = num2.intValue();
            } else {
                i7 = org.telegram.messenger.j10.f24773t0;
            }
            drawableArr[0] = o5.m(i7, j3, null, i11);
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
        this.d.f33890a = view;
        this.f37360e.f33890a = view;
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
        this.f37360e.f(z10, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f37365w = i7;
    }

    public m5(int i7, View view, boolean z10) {
        this(i7, 7, view, z10);
    }

    public m5(int i7, int i10, View view, boolean z10) {
        this.f37357a = false;
        this.f37359c = new OvershootInterpolator(2.0f);
        lr lrVar = lr.f37209g;
        c6 c6Var = new c6((View) null, 300L, lrVar);
        this.d = c6Var;
        c6 c6Var2 = new c6((View) null, 300L, lrVar);
        this.f37360e = c6Var2;
        this.f37361f = new Drawable[2];
        this.f37365w = 255;
        this.L = new Rect();
        this.M = new lg(this, 6);
        c6Var.f33890a = view;
        this.h = view;
        c6Var2.f33890a = view;
        this.f37364s = i7;
        this.f37358b = i10;
        this.f37363r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
