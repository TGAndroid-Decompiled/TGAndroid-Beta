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
public class r5 extends Drawable implements z5 {
    public bi.td E;
    public Integer F;
    public int G;
    public PorterDuffColorFilter H;
    public int I;
    public int J;
    public final Rect K;
    public final pg L;
    public boolean f32120a;
    public final int f32121b;
    public final OvershootInterpolator f32122c;
    public final h6 d;
    public final h6 e;
    public final Drawable[] f32123f;
    public View h;
    public org.telegram.ui.f61 f32124n;
    public final boolean f32125r;
    public final int f32126s;
    public int v;
    public boolean f32127w;
    public Integer f32128x;
    public boolean f32129y;

    public r5(int i10, View view) {
        this(i10, 7, view, false);
    }

    public final void a() {
        if (!this.f32127w) {
            this.f32127w = true;
            Drawable[] drawableArr = this.f32123f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof t5) {
                ((t5) drawable).b(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof t5) {
                ((t5) drawable2).b(this);
            }
        }
    }

    public final void b() {
        if (this.f32127w) {
            this.f32127w = false;
            Drawable[] drawableArr = this.f32123f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof t5) {
                ((t5) drawable).p(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof t5) {
                ((t5) drawable2).p(this);
            }
        }
    }

    public final Drawable c() {
        return this.f32123f[0];
    }

    public final boolean d() {
        if (this.f32123f[0] != null) {
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
        float e = this.e.e(this.f32129y);
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        pg pgVar = this.L;
        if (i10 > 0) {
            bi.td tdVar = this.E;
            tdVar.f5491c.set(rect);
            tdVar.e();
            this.E.d();
            bi.td tdVar2 = this.E;
            Integer num = this.F;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            tdVar2.a(canvas, org.telegram.ui.ActionBar.y6.o1(e, intValue));
            ag.n.d().a(15, pgVar);
        } else {
            ag.n.d().g(pgVar);
        }
        Drawable[] drawableArr = this.f32123f;
        Drawable drawable = drawableArr[1];
        int i11 = this.f32126s;
        if (drawable != null && d < 1.0f) {
            drawable.setAlpha((int) ((1.0f - d) * this.v));
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
            if (drawable2 instanceof t5) {
                drawable2.setBounds(rect);
            } else if (this.f32120a) {
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
            boolean z10 = drawable3 instanceof t5;
            OvershootInterpolator overshootInterpolator = this.f32122c;
            if (z10) {
                di.f3 f3Var = ((t5) drawable3).f32860k;
                if (f3Var != null) {
                    f3Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                }
                if (d < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f32120a) {
                if (d < 1.0f) {
                    float interpolation2 = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                }
                int i15 = intrinsicWidth / 2;
                int i16 = i11 / 2;
                drawableArr[0].setBounds(rect.centerX() - i15, rect.centerY() - i16, rect.centerX() + i15, rect.centerY() + i16);
            } else {
                if (d < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth / 2.0f) + rect.left, rect.centerY());
                }
                int i17 = i11 / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i17, rect.left + intrinsicWidth, rect.centerY() + i17);
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
        Drawable[] drawableArr = this.f32123f;
        Drawable drawable = drawableArr[1];
        float f10 = 0.0f;
        h6 h6Var = this.d;
        if (drawable != null) {
            f7 = 1.0f - h6Var.f28864c;
        } else {
            f7 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f10 = h6Var.f28864c;
        }
        return f7 + f10;
    }

    public final void f() {
        t5 t5Var;
        di.f3 f3Var;
        Drawable drawable = this.f32123f[0];
        if ((drawable instanceof t5) && (f3Var = (t5Var = (t5) drawable).f32860k) != null) {
            t5Var.w(f3Var);
            f3Var.startAnimation();
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f32123f;
        if (drawableArr[0] == drawable) {
            return;
        }
        h6 h6Var = this.d;
        if (z10) {
            h6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f32127w && (drawable2 instanceof t5)) {
                    ((t5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            h6Var.d(1.0f, true);
            boolean z11 = this.f32127w;
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
        return this.f32126s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f32126s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i10, boolean z10) {
        int i11;
        int i12;
        Drawable[] drawableArr = this.f32123f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof t5) && document != null && ((t5) drawable).i() == document.f22034id) {
            return;
        }
        h6 h6Var = this.d;
        if (z10) {
            h6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof t5) {
                    ((t5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f32128x;
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = UserConfig.selectedAccount;
                }
                t5 m10 = t5.m(i12, i10, document);
                drawableArr[0] = m10;
                if (this.f32127w) {
                    m10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            h6Var.d(1.0f, true);
            boolean z11 = this.f32127w;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f32128x;
                if (num2 != null) {
                    i11 = num2.intValue();
                } else {
                    i11 = UserConfig.selectedAccount;
                }
                drawableArr[0] = t5.m(i11, i10, document);
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
        h(document, this.f32121b, z10);
    }

    @Override
    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f32125r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.f61 f61Var = this.f32124n;
        if (f61Var != null) {
            f61Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j10, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f32123f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof t5) && ((t5) drawable).i() == j10) {
            return false;
        }
        int i12 = this.f32121b;
        h6 h6Var = this.d;
        if (z10) {
            h6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f32127w && (drawable2 instanceof t5)) {
                    ((t5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f32128x;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = UserConfig.selectedAccount;
            }
            t5 n10 = t5.n(i11, j10, null, i12);
            drawableArr[0] = n10;
            if (this.f32127w) {
                n10.b(this);
            }
        } else {
            h6Var.d(1.0f, true);
            boolean z11 = this.f32127w;
            if (z11) {
                b();
            }
            Integer num2 = this.f32128x;
            if (num2 != null) {
                i10 = num2.intValue();
            } else {
                i10 = UserConfig.selectedAccount;
            }
            drawableArr[0] = t5.n(i10, j10, null, i12);
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
        this.d.f28862a = view;
        this.e.f28862a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.f32129y == z10) {
            return;
        }
        if (z11) {
            if (this.E == null) {
                this.E = new bi.td(1, 8);
            }
            this.f32129y = z10;
            invalidate();
            return;
        }
        this.f32129y = z10;
        if (z10 && this.E == null) {
            this.E = new bi.td(1, 8);
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

    public r5(View view, int i10, boolean z10) {
        this(i10, 7, view, z10);
    }

    public r5(int i10, int i11, View view, boolean z10) {
        this.f32120a = false;
        this.f32122c = new OvershootInterpolator(2.0f);
        ds dsVar = ds.f27531g;
        h6 h6Var = new h6((View) null, 300L, dsVar);
        this.d = h6Var;
        h6 h6Var2 = new h6((View) null, 300L, dsVar);
        this.e = h6Var2;
        this.f32123f = new Drawable[2];
        this.v = 255;
        this.K = new Rect();
        this.L = new pg(this, 7);
        h6Var.f28862a = view;
        this.h = view;
        h6Var2.f28862a = view;
        this.f32126s = i10;
        this.f32121b = i11;
        this.f32125r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
