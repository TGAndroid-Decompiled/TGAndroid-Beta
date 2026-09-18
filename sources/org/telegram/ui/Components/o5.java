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
public class o5 extends Drawable implements w5 {
    public yh.i8 E;
    public Integer F;
    public int G;
    public PorterDuffColorFilter H;
    public int I;
    public int J;
    public final Rect K;
    public final og L;
    public boolean f26852a;
    public final int f26853b;
    public final OvershootInterpolator f26854c;
    public final e6 d;
    public final e6 e;
    public final Drawable[] f26855f;
    public View h;
    public org.telegram.ui.g71 f26856n;
    public final boolean f26857r;
    public final int f26858s;
    public int v;
    public boolean f26859w;
    public Integer f26860x;
    public boolean f26861y;

    public o5(int i10, View view) {
        this(i10, 7, view, false);
    }

    public final void a() {
        if (!this.f26859w) {
            this.f26859w = true;
            Drawable[] drawableArr = this.f26855f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof q5) {
                ((q5) drawable).b(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof q5) {
                ((q5) drawable2).b(this);
            }
        }
    }

    public final void b() {
        if (this.f26859w) {
            this.f26859w = false;
            Drawable[] drawableArr = this.f26855f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof q5) {
                ((q5) drawable).p(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof q5) {
                ((q5) drawable2).p(this);
            }
        }
    }

    public final Drawable c() {
        return this.f26855f[0];
    }

    public final boolean d() {
        if (this.f26855f[0] != null) {
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
        float d = this.d.d(1.0f, false);
        Rect bounds = getBounds();
        Rect rect = this.K;
        rect.set(bounds);
        rect.offset(this.I, this.J);
        float e = this.e.e(this.f26861y);
        og ogVar = this.L;
        if (e > 0.0f) {
            yh.i8 i8Var = this.E;
            i8Var.f47529c.set(rect);
            i8Var.e();
            this.E.d();
            yh.i8 i8Var2 = this.E;
            Integer num = this.F;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            i8Var2.a(canvas, org.telegram.ui.ActionBar.j6.l1(e, intValue));
            yf.h.d().a(15, ogVar);
        } else {
            yf.h.d().f(ogVar);
        }
        Drawable[] drawableArr = this.f26855f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f26858s;
        if (drawable != null && d < 1.0f) {
            drawable.setAlpha((int) ((1.0f - d) * this.v));
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
            if (drawable2 instanceof q5) {
                drawable2.setBounds(rect);
            } else if (this.f26852a) {
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
            boolean z10 = drawable3 instanceof q5;
            OvershootInterpolator overshootInterpolator = this.f26854c;
            if (z10) {
                ai.l4 l4Var = ((q5) drawable3).f27461k;
                if (l4Var != null) {
                    l4Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                }
                if (d < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f26852a) {
                if (d < 1.0f) {
                    float interpolation2 = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                }
                int i14 = intrinsicWidth / 2;
                int i15 = i10 / 2;
                drawableArr[0].setBounds(rect.centerX() - i14, rect.centerY() - i15, rect.centerX() + i14, rect.centerY() + i15);
            } else {
                if (d < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth / 2.0f) + rect.left, rect.centerY());
                }
                int i16 = i10 / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i16, rect.left + intrinsicWidth, rect.centerY() + i16);
            }
            drawableArr[0].setAlpha(this.v);
            drawableArr[0].setColorFilter(this.H);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f7;
        Drawable[] drawableArr = this.f26855f;
        Drawable drawable = drawableArr[1];
        float f10 = 0.0f;
        e6 e6Var = this.d;
        if (drawable != null) {
            f7 = 1.0f - e6Var.f23794c;
        } else {
            f7 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f10 = e6Var.f23794c;
        }
        return f7 + f10;
    }

    public final void f() {
        q5 q5Var;
        ai.l4 l4Var;
        Drawable drawable = this.f26855f[0];
        if ((drawable instanceof q5) && (l4Var = (q5Var = (q5) drawable).f27461k) != null) {
            q5Var.w(l4Var);
            l4Var.startAnimation();
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f26855f;
        if (drawableArr[0] == drawable) {
            return;
        }
        e6 e6Var = this.d;
        if (z10) {
            e6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f26859w && (drawable2 instanceof q5)) {
                    ((q5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            e6Var.d(1.0f, true);
            boolean z11 = this.f26859w;
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
        return this.f26858s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f26858s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i10, boolean z10) {
        int i11;
        int i12;
        Drawable[] drawableArr = this.f26855f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof q5) && document != null && ((q5) drawable).i() == document.f18302id) {
            return;
        }
        e6 e6Var = this.d;
        if (z10) {
            e6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof q5) {
                    ((q5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f26860x;
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = UserConfig.selectedAccount;
                }
                q5 m10 = q5.m(i12, i10, document);
                drawableArr[0] = m10;
                if (this.f26859w) {
                    m10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            e6Var.d(1.0f, true);
            boolean z11 = this.f26859w;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f26860x;
                if (num2 != null) {
                    i11 = num2.intValue();
                } else {
                    i11 = UserConfig.selectedAccount;
                }
                drawableArr[0] = q5.m(i11, i10, document);
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
        h(document, this.f26853b, z10);
    }

    @Override
    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f26857r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.g71 g71Var = this.f26856n;
        if (g71Var != null) {
            g71Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j3, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f26855f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof q5) && ((q5) drawable).i() == j3) {
            return false;
        }
        int i12 = this.f26853b;
        e6 e6Var = this.d;
        if (z10) {
            e6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f26859w && (drawable2 instanceof q5)) {
                    ((q5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f26860x;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = UserConfig.selectedAccount;
            }
            q5 n10 = q5.n(i11, j3, null, i12);
            drawableArr[0] = n10;
            if (this.f26859w) {
                n10.b(this);
            }
        } else {
            e6Var.d(1.0f, true);
            boolean z11 = this.f26859w;
            if (z11) {
                b();
            }
            Integer num2 = this.f26860x;
            if (num2 != null) {
                i10 = num2.intValue();
            } else {
                i10 = UserConfig.selectedAccount;
            }
            drawableArr[0] = q5.n(i10, j3, null, i12);
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
        this.d.f23792a = view;
        this.e.f23792a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.f26861y == z10) {
            return;
        }
        if (z11) {
            if (this.E == null) {
                this.E = new yh.i8(1, 8);
            }
            this.f26861y = z10;
            invalidate();
            return;
        }
        this.f26861y = z10;
        if (z10 && this.E == null) {
            this.E = new yh.i8(1, 8);
        } else if (!z10 && this.E != null) {
            this.E = null;
        }
        this.e.f(z10, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i10) {
        this.v = i10;
    }

    public o5(View view, int i10, boolean z10) {
        this(i10, 7, view, z10);
    }

    public o5(int i10, int i11, View view, boolean z10) {
        this.f26852a = false;
        this.f26854c = new OvershootInterpolator(2.0f);
        qr qrVar = qr.f27716g;
        e6 e6Var = new e6((View) null, 300L, qrVar);
        this.d = e6Var;
        e6 e6Var2 = new e6((View) null, 300L, qrVar);
        this.e = e6Var2;
        this.f26855f = new Drawable[2];
        this.v = 255;
        this.K = new Rect();
        this.L = new og(this, 6);
        e6Var.f23792a = view;
        this.h = view;
        e6Var2.f23792a = view;
        this.f26858s = i10;
        this.f26853b = i11;
        this.f26857r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
