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
public class n5 extends Drawable implements v5 {
    public xh.l8 E;
    public Integer F;
    public int G;
    public PorterDuffColorFilter H;
    public int I;
    public int J;
    public final Rect K;
    public final rg L;
    public boolean f25409a;
    public final int f25410b;
    public final OvershootInterpolator f25411c;
    public final d6 d;
    public final d6 e;
    public final Drawable[] f25412f;
    public View h;
    public org.telegram.ui.l71 f25413n;
    public final boolean f25414r;
    public final int f25415s;
    public int v;
    public boolean f25416w;
    public Integer f25417x;
    public boolean f25418y;

    public n5(int i10, View view) {
        this(i10, 7, view, false);
    }

    public final void a() {
        if (!this.f25416w) {
            this.f25416w = true;
            Drawable[] drawableArr = this.f25412f;
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
        if (this.f25416w) {
            this.f25416w = false;
            Drawable[] drawableArr = this.f25412f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof p5) {
                ((p5) drawable).p(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof p5) {
                ((p5) drawable2).p(this);
            }
        }
    }

    public final Drawable c() {
        return this.f25412f[0];
    }

    public final boolean d() {
        if (this.f25412f[0] != null) {
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
        float e = this.e.e(this.f25418y);
        rg rgVar = this.L;
        if (e > 0.0f) {
            xh.l8 l8Var = this.E;
            l8Var.f45677c.set(rect);
            l8Var.e();
            this.E.d();
            xh.l8 l8Var2 = this.E;
            Integer num = this.F;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            l8Var2.a(canvas, org.telegram.ui.ActionBar.j6.l1(e, intValue));
            xf.h.d().a(15, rgVar);
        } else {
            xf.h.d().f(rgVar);
        }
        Drawable[] drawableArr = this.f25412f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f25415s;
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
            if (drawable2 instanceof p5) {
                drawable2.setBounds(rect);
            } else if (this.f25409a) {
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
            boolean z10 = drawable3 instanceof p5;
            OvershootInterpolator overshootInterpolator = this.f25411c;
            if (z10) {
                gg.h1 h1Var = ((p5) drawable3).f26033k;
                if (h1Var != null) {
                    h1Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                }
                if (d < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f25409a) {
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
        Drawable[] drawableArr = this.f25412f;
        Drawable drawable = drawableArr[1];
        float f10 = 0.0f;
        d6 d6Var = this.d;
        if (drawable != null) {
            f7 = 1.0f - d6Var.f22295c;
        } else {
            f7 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f10 = d6Var.f22295c;
        }
        return f7 + f10;
    }

    public final void f() {
        p5 p5Var;
        gg.h1 h1Var;
        Drawable drawable = this.f25412f[0];
        if ((drawable instanceof p5) && (h1Var = (p5Var = (p5) drawable).f26033k) != null) {
            p5Var.w(h1Var);
            h1Var.startAnimation();
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f25412f;
        if (drawableArr[0] == drawable) {
            return;
        }
        d6 d6Var = this.d;
        if (z10) {
            d6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f25416w && (drawable2 instanceof p5)) {
                    ((p5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            d6Var.d(1.0f, true);
            boolean z11 = this.f25416w;
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
        return this.f25415s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25415s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i10, boolean z10) {
        int i11;
        int i12;
        Drawable[] drawableArr = this.f25412f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof p5) && document != null && ((p5) drawable).i() == document.f17201id) {
            return;
        }
        d6 d6Var = this.d;
        if (z10) {
            d6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof p5) {
                    ((p5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f25417x;
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = UserConfig.selectedAccount;
                }
                p5 m10 = p5.m(i12, i10, document);
                drawableArr[0] = m10;
                if (this.f25416w) {
                    m10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            d6Var.d(1.0f, true);
            boolean z11 = this.f25416w;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f25417x;
                if (num2 != null) {
                    i11 = num2.intValue();
                } else {
                    i11 = UserConfig.selectedAccount;
                }
                drawableArr[0] = p5.m(i11, i10, document);
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
        h(document, this.f25410b, z10);
    }

    @Override
    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f25414r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.l71 l71Var = this.f25413n;
        if (l71Var != null) {
            l71Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j3, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f25412f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof p5) && ((p5) drawable).i() == j3) {
            return false;
        }
        int i12 = this.f25410b;
        d6 d6Var = this.d;
        if (z10) {
            d6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f25416w && (drawable2 instanceof p5)) {
                    ((p5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f25417x;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = UserConfig.selectedAccount;
            }
            p5 n10 = p5.n(i11, j3, null, i12);
            drawableArr[0] = n10;
            if (this.f25416w) {
                n10.b(this);
            }
        } else {
            d6Var.d(1.0f, true);
            boolean z11 = this.f25416w;
            if (z11) {
                b();
            }
            Integer num2 = this.f25417x;
            if (num2 != null) {
                i10 = num2.intValue();
            } else {
                i10 = UserConfig.selectedAccount;
            }
            drawableArr[0] = p5.n(i10, j3, null, i12);
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
        this.d.f22293a = view;
        this.e.f22293a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.f25418y == z10) {
            return;
        }
        if (z11) {
            if (this.E == null) {
                this.E = new xh.l8(1, 8);
            }
            this.f25418y = z10;
            invalidate();
            return;
        }
        this.f25418y = z10;
        if (z10 && this.E == null) {
            this.E = new xh.l8(1, 8);
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

    public n5(View view, int i10, boolean z10) {
        this(i10, 7, view, z10);
    }

    public n5(int i10, int i11, View view, boolean z10) {
        this.f25409a = false;
        this.f25411c = new OvershootInterpolator(2.0f);
        wr wrVar = wr.f28820g;
        d6 d6Var = new d6((View) null, 300L, wrVar);
        this.d = d6Var;
        d6 d6Var2 = new d6((View) null, 300L, wrVar);
        this.e = d6Var2;
        this.f25412f = new Drawable[2];
        this.v = 255;
        this.K = new Rect();
        this.L = new rg(this, 6);
        d6Var.f22293a = view;
        this.h = view;
        d6Var2.f22293a = view;
        this.f25415s = i10;
        this.f25410b = i11;
        this.f25414r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
