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
public class i5 extends Drawable implements q5 {
    public gh.bb A;
    public Integer B;
    public int C;
    public PorterDuffColorFilter D;
    public int E;
    public int F;
    public final Rect G;
    public final fg H;
    public boolean f29315a;
    public final int f29316b;
    public final OvershootInterpolator f29317c;
    public final y5 d;
    public final y5 f29318e;
    public final Drawable[] f29319f;
    public View h;
    public org.telegram.ui.b61 f29320n;
    public final boolean f29321r;
    public final int f29322s;
    public int v;
    public boolean f29323w;
    public Integer f29324x;
    public boolean f29325y;

    public i5(int i9, View view) {
        this(i9, 7, view, false);
    }

    public final void a() {
        if (!this.f29323w) {
            this.f29323w = true;
            Drawable[] drawableArr = this.f29319f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof k5) {
                ((k5) drawable).b(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof k5) {
                ((k5) drawable2).b(this);
            }
        }
    }

    public final void b() {
        if (this.f29323w) {
            this.f29323w = false;
            Drawable[] drawableArr = this.f29319f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof k5) {
                ((k5) drawable).p(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof k5) {
                ((k5) drawable2).p(this);
            }
        }
    }

    public final Drawable c() {
        return this.f29319f[0];
    }

    public final boolean d() {
        if (this.f29319f[0] != null) {
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
        float e10 = this.f29318e.e(this.f29325y);
        fg fgVar = this.H;
        if (e10 > 0.0f) {
            gh.bb bbVar = this.A;
            bbVar.f7879c.set(rect);
            bbVar.e();
            this.A.d();
            gh.bb bbVar2 = this.A;
            Integer num = this.B;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            bbVar2.a(canvas, org.telegram.ui.ActionBar.f6.l1(e10, intValue));
            ff.k.d().a(15, fgVar);
        } else {
            ff.k.d().g(fgVar);
        }
        Drawable[] drawableArr = this.f29319f;
        Drawable drawable = drawableArr[1];
        int i9 = this.f29322s;
        if (drawable != null && d < 1.0f) {
            drawable.setAlpha((int) ((1.0f - d) * this.v));
            if (drawableArr[1].getIntrinsicWidth() < 0) {
                intrinsicWidth2 = i9;
            } else {
                intrinsicWidth2 = drawableArr[1].getIntrinsicWidth();
            }
            if (drawableArr[1].getIntrinsicHeight() < 0) {
                intrinsicHeight = i9;
            } else {
                intrinsicHeight = drawableArr[1].getIntrinsicHeight();
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof k5) {
                drawable2.setBounds(rect);
            } else if (this.f29315a) {
                int i10 = intrinsicWidth2 / 2;
                int i11 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i10, rect.centerY() - i11, rect.centerX() + i10, rect.centerY() + i11);
            } else {
                int i12 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i12, rect.left + intrinsicWidth2, rect.centerY() + i12);
            }
            drawableArr[1].setColorFilter(this.D);
            drawableArr[1].draw(canvas);
            drawableArr[1].setColorFilter(null);
        }
        if (drawableArr[0] != null) {
            canvas.save();
            if (drawableArr[0].getIntrinsicWidth() < 0) {
                intrinsicWidth = i9;
            } else {
                intrinsicWidth = drawableArr[0].getIntrinsicWidth();
            }
            if (drawableArr[0].getIntrinsicHeight() >= 0) {
                i9 = drawableArr[0].getIntrinsicHeight();
            }
            Drawable drawable3 = drawableArr[0];
            boolean z10 = drawable3 instanceof k5;
            OvershootInterpolator overshootInterpolator = this.f29317c;
            if (z10) {
                ih.z2 z2Var = ((k5) drawable3).f29951k;
                if (z2Var != null) {
                    z2Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                }
                if (d < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f29315a) {
                if (d < 1.0f) {
                    float interpolation2 = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                }
                int i13 = intrinsicWidth / 2;
                int i14 = i9 / 2;
                drawableArr[0].setBounds(rect.centerX() - i13, rect.centerY() - i14, rect.centerX() + i13, rect.centerY() + i14);
            } else {
                if (d < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth / 2.0f) + rect.left, rect.centerY());
                }
                int i15 = i9 / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i15, rect.left + intrinsicWidth, rect.centerY() + i15);
            }
            drawableArr[0].setAlpha(this.v);
            drawableArr[0].setColorFilter(this.D);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f10;
        Drawable[] drawableArr = this.f29319f;
        Drawable drawable = drawableArr[1];
        float f11 = 0.0f;
        y5 y5Var = this.d;
        if (drawable != null) {
            f10 = 1.0f - y5Var.f34854c;
        } else {
            f10 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f11 = y5Var.f34854c;
        }
        return f10 + f11;
    }

    public final void f() {
        k5 k5Var;
        ih.z2 z2Var;
        Drawable drawable = this.f29319f[0];
        if ((drawable instanceof k5) && (z2Var = (k5Var = (k5) drawable).f29951k) != null) {
            k5Var.w(z2Var);
            z2Var.startAnimation();
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f29319f;
        if (drawableArr[0] == drawable) {
            return;
        }
        y5 y5Var = this.d;
        if (z10) {
            y5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f29323w && (drawable2 instanceof k5)) {
                    ((k5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            y5Var.d(1.0f, true);
            boolean z11 = this.f29323w;
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
        return this.f29322s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29322s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i9, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f29319f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof k5) && document != null && ((k5) drawable).i() == document.f22386id) {
            return;
        }
        y5 y5Var = this.d;
        if (z10) {
            y5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof k5) {
                    ((k5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f29324x;
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = UserConfig.selectedAccount;
                }
                k5 m10 = k5.m(i11, i9, document);
                drawableArr[0] = m10;
                if (this.f29323w) {
                    m10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            y5Var.d(1.0f, true);
            boolean z11 = this.f29323w;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f29324x;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = UserConfig.selectedAccount;
                }
                drawableArr[0] = k5.m(i10, i9, document);
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
        h(document, this.f29316b, z10);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f29321r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.b61 b61Var = this.f29320n;
        if (b61Var != null) {
            b61Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j10, boolean z10) {
        int i9;
        int i10;
        Drawable[] drawableArr = this.f29319f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof k5) && ((k5) drawable).i() == j10) {
            return false;
        }
        int i11 = this.f29316b;
        y5 y5Var = this.d;
        if (z10) {
            y5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f29323w && (drawable2 instanceof k5)) {
                    ((k5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f29324x;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = UserConfig.selectedAccount;
            }
            k5 n10 = k5.n(i10, j10, null, i11);
            drawableArr[0] = n10;
            if (this.f29323w) {
                n10.b(this);
            }
        } else {
            y5Var.d(1.0f, true);
            boolean z11 = this.f29323w;
            if (z11) {
                b();
            }
            Integer num2 = this.f29324x;
            if (num2 != null) {
                i9 = num2.intValue();
            } else {
                i9 = UserConfig.selectedAccount;
            }
            drawableArr[0] = k5.n(i9, j10, null, i11);
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
        this.d.f34852a = view;
        this.f29318e.f34852a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.f29325y == z10) {
            return;
        }
        if (z11) {
            if (this.A == null) {
                this.A = new gh.bb(1, 8);
            }
            this.f29325y = z10;
            invalidate();
            return;
        }
        this.f29325y = z10;
        if (z10 && this.A == null) {
            this.A = new gh.bb(1, 8);
        } else if (!z10 && this.A != null) {
            this.A = null;
        }
        this.f29318e.f(z10, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i9) {
        this.v = i9;
    }

    public i5(View view, int i9, boolean z10) {
        this(i9, 7, view, z10);
    }

    public i5(int i9, int i10, View view, boolean z10) {
        this.f29315a = false;
        this.f29317c = new OvershootInterpolator(2.0f);
        gr grVar = gr.f28845g;
        y5 y5Var = new y5((View) null, 300L, grVar);
        this.d = y5Var;
        y5 y5Var2 = new y5((View) null, 300L, grVar);
        this.f29318e = y5Var2;
        this.f29319f = new Drawable[2];
        this.v = 255;
        this.G = new Rect();
        this.H = new fg(this, 6);
        y5Var.f34852a = view;
        this.h = view;
        y5Var2.f34852a = view;
        this.f29322s = i9;
        this.f29316b = i10;
        this.f29321r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
