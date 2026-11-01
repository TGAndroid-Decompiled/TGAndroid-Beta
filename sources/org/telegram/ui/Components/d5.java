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
public class d5 extends Drawable implements l5 {
    public boolean D;
    public rh.s8 E;
    public Integer F;
    public int G;
    public PorterDuffColorFilter H;
    public int I;
    public int J;
    public final Rect K;
    public final tf L;
    public boolean f25369a;
    public final int f25370b;
    public final OvershootInterpolator f25371c;
    public final t5 d;
    public final t5 e;
    public final Drawable[] f25372f;
    public View h;
    public org.telegram.ui.g31 f25373n;
    public final boolean f25374r;
    public final int f25375s;
    public int f25376w;
    public boolean f25377x;
    public Integer f25378y;

    public d5(int i10, View view) {
        this(i10, 7, view, false);
    }

    public final void a() {
        if (!this.f25377x) {
            this.f25377x = true;
            Drawable[] drawableArr = this.f25372f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof f5) {
                ((f5) drawable).b(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof f5) {
                ((f5) drawable2).b(this);
            }
        }
    }

    public final void b() {
        if (this.f25377x) {
            this.f25377x = false;
            Drawable[] drawableArr = this.f25372f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof f5) {
                ((f5) drawable).o(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof f5) {
                ((f5) drawable2).o(this);
            }
        }
    }

    public final Drawable c() {
        return this.f25372f[0];
    }

    public final boolean d() {
        if (this.f25372f[0] != null) {
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
        float e = this.d.e(false, 1.0f);
        Rect bounds = getBounds();
        Rect rect = this.K;
        rect.set(bounds);
        rect.offset(this.I, this.J);
        float d = this.e.d(this.D);
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        tf tfVar = this.L;
        if (i10 > 0) {
            rh.s8 s8Var = this.E;
            s8Var.f47472c.set(rect);
            s8Var.e();
            this.E.d();
            rh.s8 s8Var2 = this.E;
            Integer num = this.F;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            s8Var2.a(canvas, org.telegram.ui.ActionBar.t6.r1(d, intValue));
            rf.g.d().a(15, tfVar);
        } else {
            rf.g.d().f(tfVar);
        }
        Drawable[] drawableArr = this.f25372f;
        Drawable drawable = drawableArr[1];
        int i11 = this.f25375s;
        if (drawable != null && e < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e) * this.f25376w));
            if (drawableArr[1].getIntrinsicWidth() < 0) {
                intrinsicWidth2 = i11;
            } else {
                intrinsicWidth2 = drawableArr[1].getIntrinsicWidth();
            }
            if (drawableArr[1].getIntrinsicHeight() < 0) {
                intrinsicHeight = i11;
            } else {
                intrinsicHeight = drawableArr[1].getIntrinsicHeight();
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof f5) {
                drawable2.setBounds(rect);
            } else if (this.f25369a) {
                int i12 = intrinsicWidth2 / 2;
                int i13 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i12, rect.centerY() - i13, rect.centerX() + i12, rect.centerY() + i13);
            } else {
                int i14 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i14, rect.left + intrinsicWidth2, rect.centerY() + i14);
            }
            drawableArr[1].setColorFilter(this.H);
            drawableArr[1].draw(canvas);
            drawableArr[1].setColorFilter(null);
        }
        if (drawableArr[0] != null) {
            canvas.save();
            if (drawableArr[0].getIntrinsicWidth() < 0) {
                intrinsicWidth = i11;
            } else {
                intrinsicWidth = drawableArr[0].getIntrinsicWidth();
            }
            if (drawableArr[0].getIntrinsicHeight() >= 0) {
                i11 = drawableArr[0].getIntrinsicHeight();
            }
            Drawable drawable3 = drawableArr[0];
            boolean z10 = drawable3 instanceof f5;
            OvershootInterpolator overshootInterpolator = this.f25371c;
            if (z10) {
                ag.c2 c2Var = ((f5) drawable3).f26070k;
                if (c2Var != null) {
                    c2Var.J0(org.telegram.messenger.i0.L(4.0f));
                }
                if (e < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f25369a) {
                if (e < 1.0f) {
                    float interpolation2 = overshootInterpolator.getInterpolation(e);
                    canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                }
                int i15 = intrinsicWidth / 2;
                int i16 = i11 / 2;
                drawableArr[0].setBounds(rect.centerX() - i15, rect.centerY() - i16, rect.centerX() + i15, rect.centerY() + i16);
            } else {
                if (e < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(e);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth / 2.0f) + rect.left, rect.centerY());
                }
                int i17 = i11 / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i17, rect.left + intrinsicWidth, rect.centerY() + i17);
            }
            drawableArr[0].setAlpha(this.f25376w);
            drawableArr[0].setColorFilter(this.H);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f7;
        Drawable[] drawableArr = this.f25372f;
        Drawable drawable = drawableArr[1];
        float f10 = 0.0f;
        t5 t5Var = this.d;
        if (drawable != null) {
            f7 = 1.0f - t5Var.f30530c;
        } else {
            f7 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f10 = t5Var.f30530c;
        }
        return f7 + f10;
    }

    public final void f() {
        f5 f5Var;
        ag.c2 c2Var;
        Drawable drawable = this.f25372f[0];
        if ((drawable instanceof f5) && (c2Var = (f5Var = (f5) drawable).f26070k) != null) {
            f5Var.v(c2Var);
            c2Var.P0(false);
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f25372f;
        if (drawableArr[0] == drawable) {
            return;
        }
        t5 t5Var = this.d;
        if (z10) {
            t5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f25377x && (drawable2 instanceof f5)) {
                    ((f5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            t5Var.e(true, 1.0f);
            boolean z11 = this.f25377x;
            if (z11) {
                b();
            }
            drawableArr[0] = drawable;
            if (z11) {
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
        return this.f25375s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25375s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i10, boolean z10) {
        int i11;
        int i12;
        Drawable[] drawableArr = this.f25372f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof f5) && document != null && ((f5) drawable).h() == document.f19800id) {
            return;
        }
        t5 t5Var = this.d;
        if (z10) {
            t5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof f5) {
                    ((f5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f25378y;
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = org.telegram.messenger.e20.f15506s0;
                }
                f5 l4 = f5.l(i12, i10, document);
                drawableArr[0] = l4;
                if (this.f25377x) {
                    l4.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            t5Var.e(true, 1.0f);
            boolean z11 = this.f25377x;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f25378y;
                if (num2 != null) {
                    i11 = num2.intValue();
                } else {
                    i11 = org.telegram.messenger.e20.f15506s0;
                }
                drawableArr[0] = f5.l(i11, i10, document);
            } else {
                drawableArr[0] = null;
            }
            if (z11) {
                a();
            }
        }
        this.F = null;
        this.H = null;
        this.G = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z10) {
        h(document, this.f25370b, z10);
    }

    @Override
    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f25374r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.g31 g31Var = this.f25373n;
        if (g31Var != null) {
            g31Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j10, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f25372f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof f5) && ((f5) drawable).h() == j10) {
            return false;
        }
        int i12 = this.f25370b;
        t5 t5Var = this.d;
        if (z10) {
            t5Var.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f25377x && (drawable2 instanceof f5)) {
                    ((f5) drawable2).o(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f25378y;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = org.telegram.messenger.e20.f15506s0;
            }
            f5 m10 = f5.m(i11, j10, null, i12);
            drawableArr[0] = m10;
            if (this.f25377x) {
                m10.b(this);
            }
        } else {
            t5Var.e(true, 1.0f);
            boolean z11 = this.f25377x;
            if (z11) {
                b();
            }
            Integer num2 = this.f25378y;
            if (num2 != null) {
                i10 = num2.intValue();
            } else {
                i10 = org.telegram.messenger.e20.f15506s0;
            }
            drawableArr[0] = f5.m(i10, j10, null, i12);
            if (z11) {
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
        this.d.f30528a = view;
        this.e.f30528a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.D == z10) {
            return;
        }
        if (z11) {
            if (this.E == null) {
                this.E = new rh.s8(1, 8);
            }
            this.D = z10;
            invalidate();
            return;
        }
        this.D = z10;
        if (z10 && this.E == null) {
            this.E = new rh.s8(1, 8);
        } else if (!z10 && this.E != null) {
            this.E = null;
        }
        this.e.f(z10, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25376w = i10;
    }

    public d5(int i10, View view, boolean z10) {
        this(i10, 7, view, z10);
    }

    public d5(int i10, int i11, View view, boolean z10) {
        this.f25369a = false;
        this.f25371c = new OvershootInterpolator(2.0f);
        gr grVar = gr.f26524g;
        t5 t5Var = new t5((View) null, 300L, grVar);
        this.d = t5Var;
        t5 t5Var2 = new t5((View) null, 300L, grVar);
        this.e = t5Var2;
        this.f25372f = new Drawable[2];
        this.f25376w = 255;
        this.K = new Rect();
        this.L = new tf(this, 7);
        t5Var.f30528a = view;
        this.h = view;
        t5Var2.f30528a = view;
        this.f25375s = i10;
        this.f25370b = i11;
        this.f25374r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
