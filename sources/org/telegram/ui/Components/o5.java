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
    public zh.h8 E;
    public Integer F;
    public int G;
    public PorterDuffColorFilter H;
    public int I;
    public int J;
    public final Rect K;
    public final pg L;
    public boolean f28957a;
    public final int f28958b;
    public final OvershootInterpolator f28959c;
    public final e6 d;
    public final e6 f28960e;
    public final Drawable[] f28961f;
    public View h;
    public org.telegram.ui.j71 f28962n;
    public final boolean f28963r;
    public final int f28964s;
    public int v;
    public boolean f28965w;
    public Integer f28966x;
    public boolean f28967y;

    public o5(int i10, View view) {
        this(i10, 7, view, false);
    }

    public final void a() {
        if (!this.f28965w) {
            this.f28965w = true;
            Drawable[] drawableArr = this.f28961f;
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
        if (this.f28965w) {
            this.f28965w = false;
            Drawable[] drawableArr = this.f28961f;
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
        return this.f28961f[0];
    }

    public final boolean d() {
        if (this.f28961f[0] != null) {
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
        float e7 = this.f28960e.e(this.f28967y);
        pg pgVar = this.L;
        if (e7 > 0.0f) {
            zh.h8 h8Var = this.E;
            h8Var.f51993c.set(rect);
            h8Var.e();
            this.E.d();
            zh.h8 h8Var2 = this.E;
            Integer num = this.F;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            h8Var2.a(canvas, org.telegram.ui.ActionBar.j6.l1(e7, intValue));
            yf.h.d().a(15, pgVar);
        } else {
            yf.h.d().f(pgVar);
        }
        Drawable[] drawableArr = this.f28961f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f28964s;
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
            } else if (this.f28957a) {
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
            OvershootInterpolator overshootInterpolator = this.f28959c;
            if (z10) {
                bi.y3 y3Var = ((q5) drawable3).f29584k;
                if (y3Var != null) {
                    y3Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                }
                if (d < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f28957a) {
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
        Drawable[] drawableArr = this.f28961f;
        Drawable drawable = drawableArr[1];
        float f10 = 0.0f;
        e6 e6Var = this.d;
        if (drawable != null) {
            f7 = 1.0f - e6Var.f25565c;
        } else {
            f7 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f10 = e6Var.f25565c;
        }
        return f7 + f10;
    }

    public final void f() {
        q5 q5Var;
        bi.y3 y3Var;
        Drawable drawable = this.f28961f[0];
        if ((drawable instanceof q5) && (y3Var = (q5Var = (q5) drawable).f29584k) != null) {
            q5Var.w(y3Var);
            y3Var.startAnimation();
        }
    }

    public final void g(Drawable drawable, boolean z10) {
        Drawable[] drawableArr = this.f28961f;
        if (drawableArr[0] == drawable) {
            return;
        }
        e6 e6Var = this.d;
        if (z10) {
            e6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f28965w && (drawable2 instanceof q5)) {
                    ((q5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            e6Var.d(1.0f, true);
            boolean z11 = this.f28965w;
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
        return this.f28964s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f28964s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i10, boolean z10) {
        int i11;
        int i12;
        Drawable[] drawableArr = this.f28961f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof q5) && document != null && ((q5) drawable).i() == document.f19875id) {
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
                Integer num = this.f28966x;
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = UserConfig.selectedAccount;
                }
                q5 m10 = q5.m(i12, i10, document);
                drawableArr[0] = m10;
                if (this.f28965w) {
                    m10.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            e6Var.d(1.0f, true);
            boolean z11 = this.f28965w;
            if (z11) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f28966x;
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
        h(document, this.f28958b, z10);
    }

    @Override
    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f28963r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.j71 j71Var = this.f28962n;
        if (j71Var != null) {
            j71Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j3, boolean z10) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f28961f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof q5) && ((q5) drawable).i() == j3) {
            return false;
        }
        int i12 = this.f28958b;
        e6 e6Var = this.d;
        if (z10) {
            e6Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f28965w && (drawable2 instanceof q5)) {
                    ((q5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f28966x;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = UserConfig.selectedAccount;
            }
            q5 n10 = q5.n(i11, j3, null, i12);
            drawableArr[0] = n10;
            if (this.f28965w) {
                n10.b(this);
            }
        } else {
            e6Var.d(1.0f, true);
            boolean z11 = this.f28965w;
            if (z11) {
                b();
            }
            Integer num2 = this.f28966x;
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
        this.d.f25563a = view;
        this.f28960e.f25563a = view;
        this.h = view;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.f28967y == z10) {
            return;
        }
        if (z11) {
            if (this.E == null) {
                this.E = new zh.h8(1, 8);
            }
            this.f28967y = z10;
            invalidate();
            return;
        }
        this.f28967y = z10;
        if (z10 && this.E == null) {
            this.E = new zh.h8(1, 8);
        } else if (!z10 && this.E != null) {
            this.E = null;
        }
        this.f28960e.f(z10, true);
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
        this.f28957a = false;
        this.f28959c = new OvershootInterpolator(2.0f);
        pr prVar = pr.f29467g;
        e6 e6Var = new e6((View) null, 300L, prVar);
        this.d = e6Var;
        e6 e6Var2 = new e6((View) null, 300L, prVar);
        this.f28960e = e6Var2;
        this.f28961f = new Drawable[2];
        this.v = 255;
        this.K = new Rect();
        this.L = new pg(this, 6);
        e6Var.f25563a = view;
        this.h = view;
        e6Var2.f25563a = view;
        this.f28964s = i10;
        this.f28958b = i11;
        this.f28963r = z10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
