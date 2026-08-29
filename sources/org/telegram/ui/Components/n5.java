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
    public jh.va A;
    public Integer B;
    public int C;
    public PorterDuffColorFilter D;
    public int E;
    public int F;
    public final Rect G;
    public final ig H;
    public boolean f30845a;
    public final int f30846b;
    public final OvershootInterpolator f30847c;
    public final d6 d;
    public final d6 f30848e;
    public final Drawable[] f30849f;
    public View h;
    public org.telegram.ui.d61 f30850n;
    public final boolean f30851r;
    public final int f30852s;
    public int v;
    public boolean f30853w;
    public Integer f30854x;
    public boolean f30855y;

    public n5(int i10, View view) {
        this(i10, 7, view, false);
    }

    public final void a() {
        if (!this.f30853w) {
            this.f30853w = true;
            Drawable[] drawableArr = this.f30849f;
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
        if (this.f30853w) {
            this.f30853w = false;
            Drawable[] drawableArr = this.f30849f;
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
        return this.f30849f[0];
    }

    public final boolean d() {
        if (this.f30849f[0] != null) {
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
        Rect rect = this.G;
        rect.set(bounds);
        rect.offset(this.E, this.F);
        float e10 = this.f30848e.e(this.f30855y);
        ig igVar = this.H;
        if (e10 > 0.0f) {
            jh.va vaVar = this.A;
            vaVar.f12988c.set(rect);
            vaVar.e();
            this.A.d();
            jh.va vaVar2 = this.A;
            Integer num = this.B;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            vaVar2.a(canvas, org.telegram.ui.ActionBar.g6.l1(e10, intValue));
            jf.j.d().a(15, igVar);
        } else {
            jf.j.d().f(igVar);
        }
        Drawable[] drawableArr = this.f30849f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f30852s;
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
            } else if (this.f30845a) {
                int i11 = intrinsicWidth2 / 2;
                int i12 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i11, rect.centerY() - i12, rect.centerX() + i11, rect.centerY() + i12);
            } else {
                int i13 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i13, rect.left + intrinsicWidth2, rect.centerY() + i13);
            }
            drawableArr[1].setColorFilter(this.D);
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
            OvershootInterpolator overshootInterpolator = this.f30847c;
            if (z10) {
                lh.x2 x2Var = ((p5) drawable3).f31593k;
                if (x2Var != null) {
                    x2Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                }
                if (d < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f30845a) {
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
            drawableArr[0].setColorFilter(this.D);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f9;
        Drawable[] drawableArr = this.f30849f;
        Drawable drawable = drawableArr[1];
        float f10 = 0.0f;
        d6 d6Var = this.d;
        if (drawable != null) {
            f9 = 1.0f - d6Var.f27666c;
        } else {
            f9 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f10 = d6Var.f27666c;
        }
        return f9 + f10;
    }

    public final void f() {
        p5 p5Var;
        lh.x2 x2Var;
        Drawable drawable = this.f30849f[0];
        if ((drawable instanceof p5) && (x2Var = (p5Var = (p5) drawable).f31593k) != null) {
            p5Var.w(x2Var);
            x2Var.startAnimation();
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f30849f;
        if (drawableArr[0] == drawable) {
            return;
        }
        d6 d6Var = this.d;
        if (z10) {
            d6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f30853w && (drawable2 instanceof p5)) {
                    ((p5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            d6Var.d(1.0f, true);
            boolean z11 = this.f30853w;
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
        return this.f30852s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f30852s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i10, boolean z10) {
        int i11;
        int i12;
        Drawable[] drawableArr = this.f30849f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof p5) && document != null && ((p5) drawable).i() == document.f22398id) {
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
                Integer num = this.f30854x;
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = UserConfig.selectedAccount;
                }
                p5 m10 = p5.m(i12, i10, document);
                drawableArr[0] = m10;
                if (this.f30853w) {
                    m10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            d6Var.d(1.0f, true);
            boolean z11 = this.f30853w;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f30854x;
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
        this.B = null;
        this.D = null;
        this.C = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z10) {
        h(document, this.f30846b, z10);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f30851r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.d61 d61Var = this.f30850n;
        if (d61Var != null) {
            d61Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j10, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f30849f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof p5) && ((p5) drawable).i() == j10) {
            return false;
        }
        int i12 = this.f30846b;
        d6 d6Var = this.d;
        if (z10) {
            d6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f30853w && (drawable2 instanceof p5)) {
                    ((p5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f30854x;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = UserConfig.selectedAccount;
            }
            p5 n10 = p5.n(i11, j10, null, i12);
            drawableArr[0] = n10;
            if (this.f30853w) {
                n10.b(this);
            }
        } else {
            d6Var.d(1.0f, true);
            boolean z11 = this.f30853w;
            if (z11) {
                b();
            }
            Integer num2 = this.f30854x;
            if (num2 != null) {
                i10 = num2.intValue();
            } else {
                i10 = UserConfig.selectedAccount;
            }
            drawableArr[0] = p5.n(i10, j10, null, i12);
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
        if (num2 != null || num != null) {
            if (num2 == null || !num2.equals(num)) {
                this.B = num;
                if (num != null && this.C == num.intValue()) {
                    return;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    this.C = intValue;
                    porterDuffColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                } else {
                    porterDuffColorFilter = null;
                }
                this.D = porterDuffColorFilter;
            }
        }
    }

    public final void l(View view) {
        this.d.f27664a = view;
        this.f30848e.f27664a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.f30855y == z10) {
            return;
        }
        if (z11) {
            if (this.A == null) {
                this.A = new jh.va(1, 8);
            }
            this.f30855y = z10;
            invalidate();
            return;
        }
        this.f30855y = z10;
        if (z10 && this.A == null) {
            this.A = new jh.va(1, 8);
        } else if (!z10 && this.A != null) {
            this.A = null;
        }
        this.f30848e.f(z10, true);
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
        this.f30845a = false;
        this.f30847c = new OvershootInterpolator(2.0f);
        jr jrVar = jr.f29801g;
        d6 d6Var = new d6((View) null, 300L, jrVar);
        this.d = d6Var;
        d6 d6Var2 = new d6((View) null, 300L, jrVar);
        this.f30848e = d6Var2;
        this.f30849f = new Drawable[2];
        this.v = 255;
        this.G = new Rect();
        this.H = new ig(this, 6);
        d6Var.f27664a = view;
        this.h = view;
        d6Var2.f27664a = view;
        this.f30852s = i10;
        this.f30846b = i11;
        this.f30851r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
