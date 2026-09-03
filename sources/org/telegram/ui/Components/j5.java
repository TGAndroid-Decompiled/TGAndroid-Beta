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
public class j5 extends Drawable implements r5 {
    public lh.wa B;
    public Integer C;
    public int D;
    public PorterDuffColorFilter E;
    public int F;
    public int G;
    public final Rect H;
    public final fg I;
    public boolean f25833a;
    public final int f25834b;
    public final OvershootInterpolator f25835c;
    public final z5 d;
    public final z5 e;
    public final Drawable[] f25836f;
    public View h;
    public org.telegram.ui.x61 f25837n;
    public final boolean f25838r;
    public final int f25839s;
    public int v;
    public boolean f25840w;
    public Integer f25841x;
    public boolean f25842y;

    public j5(int i10, View view) {
        this(i10, 7, view, false);
    }

    public final void a() {
        if (!this.f25840w) {
            this.f25840w = true;
            Drawable[] drawableArr = this.f25836f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof l5) {
                ((l5) drawable).b(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof l5) {
                ((l5) drawable2).b(this);
            }
        }
    }

    public final void b() {
        if (this.f25840w) {
            this.f25840w = false;
            Drawable[] drawableArr = this.f25836f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof l5) {
                ((l5) drawable).p(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof l5) {
                ((l5) drawable2).p(this);
            }
        }
    }

    public final Drawable c() {
        return this.f25836f[0];
    }

    public final boolean d() {
        if (this.f25836f[0] != null) {
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
        Rect rect = this.H;
        rect.set(bounds);
        rect.offset(this.F, this.G);
        float e = this.e.e(this.f25842y);
        fg fgVar = this.I;
        if (e > 0.0f) {
            lh.wa waVar = this.B;
            waVar.f13298c.set(rect);
            waVar.e();
            this.B.d();
            lh.wa waVar2 = this.B;
            Integer num = this.C;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            waVar2.a(canvas, org.telegram.ui.ActionBar.j6.l1(e, intValue));
            kf.j.d().a(15, fgVar);
        } else {
            kf.j.d().f(fgVar);
        }
        Drawable[] drawableArr = this.f25836f;
        Drawable drawable = drawableArr[1];
        int i10 = this.f25839s;
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
            if (drawable2 instanceof l5) {
                drawable2.setBounds(rect);
            } else if (this.f25833a) {
                int i11 = intrinsicWidth2 / 2;
                int i12 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i11, rect.centerY() - i12, rect.centerX() + i11, rect.centerY() + i12);
            } else {
                int i13 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i13, rect.left + intrinsicWidth2, rect.centerY() + i13);
            }
            drawableArr[1].setColorFilter(this.E);
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
            boolean z4 = drawable3 instanceof l5;
            OvershootInterpolator overshootInterpolator = this.f25835c;
            if (z4) {
                nh.y2 y2Var = ((l5) drawable3).f26587k;
                if (y2Var != null) {
                    y2Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                }
                if (d < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(d);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.f25833a) {
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
            drawableArr[0].setColorFilter(this.E);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        float f10;
        Drawable[] drawableArr = this.f25836f;
        Drawable drawable = drawableArr[1];
        float f11 = 0.0f;
        z5 z5Var = this.d;
        if (drawable != null) {
            f10 = 1.0f - z5Var.f31253c;
        } else {
            f10 = 0.0f;
        }
        if (drawableArr[0] != null) {
            f11 = z5Var.f31253c;
        }
        return f10 + f11;
    }

    public final void f() {
        l5 l5Var;
        nh.y2 y2Var;
        Drawable drawable = this.f25836f[0];
        if ((drawable instanceof l5) && (y2Var = (l5Var = (l5) drawable).f26587k) != null) {
            l5Var.w(y2Var);
            y2Var.startAnimation();
        }
    }

    public final void g(Drawable drawable, boolean z4) {
        Drawable[] drawableArr = this.f25836f;
        if (drawableArr[0] == drawable) {
            return;
        }
        z5 z5Var = this.d;
        if (z4) {
            z5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f25840w && (drawable2 instanceof l5)) {
                    ((l5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            z5Var.d(1.0f, true);
            boolean z10 = this.f25840w;
            if (z10) {
                b();
            }
            drawableArr[0] = drawable;
            if (z10) {
                a();
            }
        }
        this.C = null;
        this.E = null;
        this.D = 0;
        f();
        invalidate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f25839s;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25839s;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i10, boolean z4) {
        int i11;
        int i12;
        Drawable[] drawableArr = this.f25836f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof l5) && document != null && ((l5) drawable).i() == document.f19165id) {
            return;
        }
        z5 z5Var = this.d;
        if (z4) {
            z5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof l5) {
                    ((l5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.f25841x;
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = UserConfig.selectedAccount;
                }
                l5 m9 = l5.m(i12, i10, document);
                drawableArr[0] = m9;
                if (this.f25840w) {
                    m9.b(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            z5Var.d(1.0f, true);
            boolean z10 = this.f25840w;
            if (z10) {
                b();
            }
            if (document != null) {
                Integer num2 = this.f25841x;
                if (num2 != null) {
                    i11 = num2.intValue();
                } else {
                    i11 = UserConfig.selectedAccount;
                }
                drawableArr[0] = l5.m(i11, i10, document);
            } else {
                drawableArr[0] = null;
            }
            if (z10) {
                a();
            }
        }
        this.C = null;
        this.E = null;
        this.D = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z4) {
        h(document, this.f25834b, z4);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.f25838r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        org.telegram.ui.x61 x61Var = this.f25837n;
        if (x61Var != null) {
            x61Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j10, boolean z4) {
        int i10;
        int i11;
        Drawable[] drawableArr = this.f25836f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof l5) && ((l5) drawable).i() == j10) {
            return false;
        }
        int i12 = this.f25834b;
        z5 z5Var = this.d;
        if (z4) {
            z5Var.d(0.0f, true);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.f25840w && (drawable2 instanceof l5)) {
                    ((l5) drawable2).p(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.f25841x;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = UserConfig.selectedAccount;
            }
            l5 n10 = l5.n(i11, j10, null, i12);
            drawableArr[0] = n10;
            if (this.f25840w) {
                n10.b(this);
            }
        } else {
            z5Var.d(1.0f, true);
            boolean z10 = this.f25840w;
            if (z10) {
                b();
            }
            Integer num2 = this.f25841x;
            if (num2 != null) {
                i10 = num2.intValue();
            } else {
                i10 = UserConfig.selectedAccount;
            }
            drawableArr[0] = l5.n(i10, j10, null, i12);
            if (z10) {
                a();
            }
        }
        this.C = null;
        this.E = null;
        this.D = 0;
        f();
        invalidate();
        return true;
    }

    public final void k(Integer num) {
        PorterDuffColorFilter porterDuffColorFilter;
        Integer num2 = this.C;
        if (num2 != null || num != null) {
            if (num2 == null || !num2.equals(num)) {
                this.C = num;
                if (num != null && this.D == num.intValue()) {
                    return;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    this.D = intValue;
                    porterDuffColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                } else {
                    porterDuffColorFilter = null;
                }
                this.E = porterDuffColorFilter;
            }
        }
    }

    public final void l(View view) {
        this.d.f31251a = view;
        this.e.f31251a = view;
        this.h = view;
    }

    public final void m(boolean z4, boolean z10) {
        if (this.f25842y == z4) {
            return;
        }
        if (z10) {
            if (this.B == null) {
                this.B = new lh.wa(1, 8);
            }
            this.f25842y = z4;
            invalidate();
            return;
        }
        this.f25842y = z4;
        if (z4 && this.B == null) {
            this.B = new lh.wa(1, 8);
        } else if (!z4 && this.B != null) {
            this.B = null;
        }
        this.e.f(z4, true);
        invalidate();
    }

    @Override
    public final void setAlpha(int i10) {
        this.v = i10;
    }

    public j5(View view, int i10, boolean z4) {
        this(i10, 7, view, z4);
    }

    public j5(int i10, int i11, View view, boolean z4) {
        this.f25833a = false;
        this.f25835c = new OvershootInterpolator(2.0f);
        mr mrVar = mr.f27123g;
        z5 z5Var = new z5((View) null, 300L, mrVar);
        this.d = z5Var;
        z5 z5Var2 = new z5((View) null, 300L, mrVar);
        this.e = z5Var2;
        this.f25836f = new Drawable[2];
        this.v = 255;
        this.H = new Rect();
        this.I = new fg(this, 6);
        z5Var.f31251a = view;
        this.h = view;
        z5Var2.f31251a = view;
        this.f25839s = i10;
        this.f25834b = i11;
        this.f25838r = z4;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
