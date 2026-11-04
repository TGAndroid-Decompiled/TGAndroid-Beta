package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.w70;
public final class yt {
    public static final Paint C;
    public final int B;
    public final bv f26633a;
    public final boolean f26634b;
    public final TL_keyboard.PageButton f26635c;
    public int d;
    public int f26636e;
    public final boolean f26637f;
    public final boolean h;
    public final Drawable f26639i;
    public final int f26640j;
    public final int f26641k;
    public final int f26642l;
    public final PorterDuffColorFilter f26643m;
    public PorterDuffColorFilter f26644n;
    public int f26645o;
    public final cv f26646p;
    public final boolean f26647q;
    public final boolean f26648r;
    public final boolean f26649s;
    public final Runnable f26650t;
    public boolean f26651u;
    public float v;
    public ValueAnimator f26652w;
    public w70 f26653x;
    public boolean f26654y;
    public final Paint f26638g = new Paint(1);
    public final RectF f26655z = new RectF();
    public final RectF A = new RectF();

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint = new Paint();
        C = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    public yt(org.telegram.messenger.cv r17, int r18, android.text.SpannableStringBuilder r19, org.telegram.tgnet.tl.TL_keyboard.PageButton r20, org.telegram.tgnet.tl.TL_keyboard.InlineButtonType r21, org.telegram.tgnet.tl.TL_keyboard.RichButtonStyle r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yt.<init>(org.telegram.messenger.cv, int, android.text.SpannableStringBuilder, org.telegram.tgnet.tl.TL_keyboard$PageButton, org.telegram.tgnet.tl.TL_keyboard$InlineButtonType, org.telegram.tgnet.tl.TL_keyboard$RichButtonStyle, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, java.lang.Runnable):void");
    }

    public final void a(Canvas canvas) {
        float f10;
        boolean z10;
        int i3;
        boolean z11;
        Canvas canvas2;
        int i10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        if (this.f26651u) {
            float f14 = this.v;
            if (f14 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / g0.f22609r) / 100.0f) + f14;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.f26650t.run();
            }
        }
        boolean z12 = this.f26637f;
        if (z12) {
            f10 = 0.09f;
        } else {
            f10 = 0.04f;
        }
        float f15 = ((1.0f - this.v) * f10) + (1.0f - f10);
        canvas.save();
        if (f15 != 1.0f) {
            canvas.scale(f15, f15, this.f26636e / 2.0f, c() / 2.0f);
        }
        boolean z13 = this.h;
        boolean z14 = true;
        boolean z15 = this.f26649s;
        if (z13 && !z15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, this.f26636e, c(), null);
        } else {
            if (this.f26651u) {
                i3 = this.f26641k;
            } else {
                i3 = this.f26640j;
            }
            Paint paint = this.f26638g;
            paint.setColor(i3);
            if (!z15) {
                canvas.drawRoundRect(0.0f, 0.0f, this.f26636e, c(), c() / 2.0f, c() / 2.0f, paint);
            }
            b(canvas);
        }
        canvas.save();
        int i13 = i();
        int j10 = j();
        if (k() > Math.max(1, j() - i())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            canvas2 = canvas;
            canvas2.saveLayer(i13, -g0.L(10.0f), j10, g0.L(10.0f) + c(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(i13, -g0.L(10.0f), j10, g0.L(10.0f) + c());
        canvas2.save();
        bv bvVar = this.f26633a;
        StaticLayout staticLayout = bvVar.f21888b;
        ArrayList arrayList = bvVar.f21896x;
        StaticLayout staticLayout2 = bvVar.f21888b;
        int i14 = bvVar.f21891f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            i10 = staticLayout.getLineBaseline(0);
        } else {
            i10 = -1;
        }
        if (bvVar.f21894s <= 0) {
            z14 = false;
        }
        if (z14) {
            canvas2.translate(l() - i14, (c() - staticLayout2.getHeight()) / 2.0f);
        } else if (i10 > 0) {
            if (z12) {
                canvas2.translate(l() - i14, (-i10) + ((c() * 43) / 56));
            } else {
                canvas2.translate(l() - i14, (-i10) + ((c() * 65) / 102));
            }
        } else {
            canvas2.translate(l() - i14, ((c() - staticLayout2.getHeight()) / 2.0f) - g0.L(1.0f));
        }
        bvVar.d(canvas2, bvVar.T);
        cv cvVar = this.f26646p;
        if (cvVar.F()) {
            if (z14) {
                f13 = 0.0f;
            } else if (z15) {
                f13 = 0.66f;
            } else {
                f13 = 2.0f;
            }
            canvas2.translate(0.0f, g0.L(f13));
            if (z15) {
                int i15 = staticLayout2.getPaint().linkColor;
                if (this.f26645o != i15 || this.f26644n == null) {
                    this.f26645o = i15;
                    this.f26644n = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
                }
                f11 = 2.0f;
                i11 = j10;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, bvVar.f21888b, bvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f26644n);
                canvas2 = canvas;
            } else {
                f11 = 2.0f;
                i11 = j10;
                canvas2 = canvas;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, bvVar.f21888b, bvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.f26643m);
            }
        } else {
            f11 = 2.0f;
            i11 = j10;
        }
        canvas2.restore();
        if (z11) {
            RectF rectF = this.A;
            rectF.set(i11 - g0.L(8.0f), 0.0f, i11, c());
            cvVar.f22087z.w(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.f26639i;
        if (drawable != null) {
            float L = this.f26636e - g0.L(12.33f);
            if (z12) {
                f12 = 9.33f;
            } else {
                f12 = 11.66f;
            }
            cg.r.d(drawable, L, g0.L(f12), 17);
            drawable.draw(canvas2);
        }
        if (z10) {
            if (this.f26651u) {
                i12 = this.f26641k;
            } else {
                i12 = this.f26640j;
            }
            Paint paint2 = C;
            paint2.setColor(i12);
            canvas2.drawRoundRect(0.0f, 0.0f, this.f26636e, c(), c() / f11, c() / f11, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        TL_keyboard.PageButton pageButton = this.f26635c;
        if (pageButton != null && (q1Var = this.f26646p.E) != null && q1Var.P0(pageButton)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f26654y;
        Runnable runnable = this.f26650t;
        if (z11 != z10) {
            this.f26654y = z10;
            if (z10) {
                w70 w70Var = this.f26653x;
                if (w70Var == null) {
                    w70 w70Var2 = new w70();
                    this.f26653x = w70Var2;
                    w70Var2.D = true;
                    w70Var2.f39944x.setStrokeWidth(g0.N(1.25f));
                } else {
                    w70Var.f39925b = -1L;
                    w70Var.f39926c = -1L;
                }
            } else {
                w70 w70Var3 = this.f26653x;
                if (w70Var3 != null) {
                    w70Var3.a();
                }
            }
            runnable.run();
        }
        w70 w70Var4 = this.f26653x;
        if (w70Var4 != null) {
            if (z10 || w70Var4.d()) {
                float strokeWidth = this.f26653x.f39944x.getStrokeWidth();
                RectF rectF = this.f26655z;
                rectF.set(0.0f, 0.0f, this.f26636e, c());
                float f10 = strokeWidth / 2.0f;
                rectF.inset(f10, f10);
                this.f26653x.i((c() / 2.0f) - f10);
                this.f26653x.e(rectF);
                this.f26653x.g(org.telegram.ui.ActionBar.k6.r1(0.07f, this.f26642l), org.telegram.ui.ActionBar.k6.r1(0.175f, this.f26642l), org.telegram.ui.ActionBar.k6.r1(0.175f, this.f26642l), org.telegram.ui.ActionBar.k6.r1(0.42f, this.f26642l));
                this.f26653x.setAlpha(255);
                this.f26653x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        float f10;
        boolean z10 = this.f26637f;
        cv cvVar = this.f26646p;
        if (z10) {
            f10 = cvVar.M * 1.166666f;
        } else {
            f10 = cvVar.M + 18;
        }
        return g0.L(f10);
    }

    public final int d() {
        if (this.f26639i != null) {
            return (g0.L(11.66f) / 2) + g0.L(12.33f);
        }
        return 0;
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        float f10;
        if (this.f26649s) {
            return 0;
        }
        boolean z10 = this.f26647q;
        boolean z11 = this.f26637f;
        if (z10 && z11) {
            return g0.L(4.0f);
        }
        if (z11) {
            return g0.L(7.0f);
        }
        if (this.f26639i != null) {
            f10 = 26.0f;
        } else {
            f10 = 20.0f;
        }
        return g0.L(f10);
    }

    public final int g() {
        float f10;
        int i3 = 0;
        if (this.f26649s) {
            return 0;
        }
        boolean z10 = this.f26648r;
        boolean z11 = this.f26637f;
        Drawable drawable = this.f26639i;
        if (z10 && z11) {
            if (drawable != null) {
                i3 = 14;
            }
            return g0.L(i3 + 4);
        } else if (z11) {
            if (drawable != null) {
                i3 = 14;
            }
            return g0.L(i3 + 7);
        } else {
            if (drawable != null) {
                f10 = 26.0f;
            } else {
                f10 = 20.0f;
            }
            return g0.L(f10);
        }
    }

    public final int h() {
        return Math.min(this.B, g() + f() + k());
    }

    public final int i() {
        if (this.f26649s) {
            return 0;
        }
        if (this.f26637f) {
            return f();
        }
        return g0.L(8.0f);
    }

    public final int j() {
        int i3;
        int max;
        if (this.f26649s) {
            return this.f26636e;
        }
        if (this.f26637f) {
            i3 = this.f26636e;
            max = g();
        } else {
            i3 = this.f26636e;
            max = Math.max(g0.L(8.0f), d());
        }
        return i3 - max;
    }

    public final int k() {
        bv bvVar = this.f26633a;
        return bvVar.h - bvVar.f21891f;
    }

    public final float l() {
        if (this.f26637f) {
            return f();
        }
        if (k() > Math.max(1, j() - i())) {
            return i();
        }
        if (this.f26639i == null) {
            return (this.f26636e - k()) / 2.0f;
        }
        return Math.max(Math.min((this.f26636e - k()) / 2.0f, (this.f26636e - d()) - k()), g0.L(8.0f));
    }

    public final void m(boolean z10) {
        float f10;
        long j10;
        if (this.f26651u != z10) {
            this.f26651u = z10;
            this.f26650t.run();
            if (z10) {
                ValueAnimator valueAnimator = this.f26652w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f26652w.cancel();
                    this.f26652w = null;
                    return;
                }
                return;
            }
            float f11 = this.v;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                this.f26652w = ofFloat;
                ofFloat.addUpdateListener(new g(this, 1));
                this.f26652w.addListener(new ii.v3(this, 8));
                ValueAnimator valueAnimator2 = this.f26652w;
                boolean z11 = this.f26637f;
                if (z11) {
                    f10 = 3.5f;
                } else {
                    f10 = 2.0f;
                }
                valueAnimator2.setInterpolator(new OvershootInterpolator(f10));
                ValueAnimator valueAnimator3 = this.f26652w;
                if (z11) {
                    j10 = 420;
                } else {
                    j10 = 350;
                }
                valueAnimator3.setDuration(j10);
                this.f26652w.start();
            }
        }
    }
}
