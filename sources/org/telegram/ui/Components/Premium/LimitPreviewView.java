package org.telegram.ui.Components.Premium;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public class LimitPreviewView extends LinearLayout implements tjb {
    public static final int p0 = 0;
    public ViewGroup E;
    public mh8 F;
    public int G;
    public boolean H;
    public boolean I;
    public final jo0 J;
    public boolean K;
    public final Paint L;
    public boolean M;
    public boolean N;
    public final hn O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final wjb T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float a;
    public boolean a0;
    public int b;
    public int b0;
    public int c;
    public float c0;
    public boolean d;
    public boolean d0;
    public final o16 e;
    public boolean e0;
    public boolean f;
    public p16 f0;
    public final oi3 g0;
    public float h;
    public final oi3 h0;
    public boolean i0;
    public ValueAnimator j0;
    public boolean k0;
    public Runnable l0;
    public boolean m0;
    public int n;
    public int n0;
    public boolean o0;
    public final int r;
    public float s;
    public final hn w;
    public final TextView x;
    public float y;

    public LimitPreviewView(Context context, int i, int i2, int i3, float f, wjb wjbVar) {
        super(context);
        this.s = 1.0f;
        this.I = true;
        this.L = new Paint(1);
        this.e0 = true;
        this.n0 = -1;
        this.T = wjbVar;
        this.a = moe.a(f, 0.1f, 0.9f);
        this.r = i;
        this.b = i2;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i != 0) {
            setPadding(0, gl.L(16.0f), 0, 0);
            o16 o16Var = new o16(this, context);
            this.e = o16Var;
            j(i2, false);
            o16Var.setPadding(gl.L(19.0f), gl.L(6.0f), gl.L(19.0f), gl.L(14.0f));
            addView(o16Var, nme.p(-2, -2, 0.0f, 3));
        }
        oi3 oi3Var = new oi3(this, context, true);
        this.g0 = oi3Var;
        hn hnVar = new hn(context, false, false, false);
        this.O = hnVar;
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setTypeface(gl.o());
        hnVar.setText(k96.M0(2131748789, null));
        hnVar.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTypeface(gl.o());
        textView.setText(String.format("%d", Integer.valueOf(i3)));
        textView.setGravity(16);
        zkb.X(textView, bkb.F6, wjbVar);
        if (k96.a0) {
            oi3Var.addView(hnVar, nme.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            oi3Var.addView(textView, nme.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            oi3Var.addView(hnVar, nme.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            oi3Var.addView(textView, nme.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        oi3 oi3Var2 = new oi3(this, context, false);
        this.h0 = oi3Var2;
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setTypeface(gl.o());
        textView2.setText(k96.M0(2131748787, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        hn hnVar2 = new hn(context, false, false, false);
        this.w = hnVar2;
        hnVar2.setTextSize(gl.L(14.0f));
        hnVar2.setTypeface(gl.o());
        hnVar2.setText(String.format("%d", Integer.valueOf(i3)));
        hnVar2.setGravity(21);
        setPremiumCountColor(true);
        if (k96.a0) {
            oi3Var2.addView(textView2, nme.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            oi3Var2.addView(hnVar2, nme.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            oi3Var2.addView(textView2, nme.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            oi3Var2.addView(hnVar2, nme.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        jo0 jo0Var = new jo0(this, context, wjbVar);
        this.J = jo0Var;
        jo0Var.addView(oi3Var, nme.c(30.0f, -1));
        jo0Var.addView(oi3Var2, nme.c(30.0f, -1));
        addView(jo0Var, nme.q(-1, 30, 0.0f, 0, 14, i != 0 ? 12 : 0, 14, 0));
    }

    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f) {
        int i;
        int L;
        if (f >= 1.0f) {
            i = this.J.getMeasuredWidth();
        } else {
            i = 0;
        }
        this.n = i;
        float L2 = gl.L(14.0f);
        o16 o16Var = this.e;
        o16Var.setTranslationX(Utilities.i((Math.max(this.n, (getMeasuredWidth() - (L << 1)) * f) + L2) - (o16Var.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - L) - o16Var.getMeasuredWidth(), L2));
        if (o16Var.s != f) {
            o16Var.s = f;
            o16Var.w = true;
            o16Var.invalidate();
        }
        o16Var.setPivotX(o16Var.getMeasuredWidth() * f);
    }

    public void setDefaultTextColor(boolean z) {
        int v0;
        this.o0 = !z;
        if (z) {
            v0 = -1;
        } else {
            v0 = bkb.v0(bkb.F6, this.T);
        }
        this.O.setTextColor(v0);
    }

    public void setPremiumCountColor(boolean z) {
        int v0;
        this.m0 = !z;
        if (z) {
            v0 = -1;
        } else {
            v0 = bkb.v0(bkb.F6, this.T);
        }
        this.w.setTextColor(v0);
    }

    private void setRatingPaintColorKey(int i) {
        this.n0 = i;
        this.L.setColor(bkb.v0(i, this.T));
    }

    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z;
        gl.r(this.l0);
        this.l0 = null;
        int i = bkb.Ei;
        setRatingPaintColorKey(i);
        this.M = false;
        int i2 = tl_starsRating.level;
        int i3 = tl_starsRating2.level;
        jo0 jo0Var = this.J;
        hn hnVar = this.w;
        hn hnVar2 = this.O;
        if (i2 == i3) {
            long j = tl_starsRating2.stars;
            if (j <= 0) {
                this.a = 0.0f;
                hnVar2.setText("");
                hnVar.setText(k96.M0(2131744936, null));
                setRatingPaintColorKey(bkb.mk);
                this.M = true;
                z = false;
            } else {
                z = false;
                long j2 = tl_starsRating2.next_level_stars;
                if (j2 == 0) {
                    this.a = 1.0f;
                    hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(i3 - 1)));
                    hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j3 = tl_starsRating2.current_level_stars;
                    this.a = moe.a(((float) (j - j3)) / ((float) (j2 - j3)), 0.0f, 1.0f);
                    hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating2.level)));
                    hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.U = true;
            boolean z2 = z;
            this.V = z2;
            this.W = z2;
            this.b0 = this.n;
            jo0Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            i((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
        } else if (i3 > i2) {
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.a = 1.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.b0 = this.n;
            jo0Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = hnVar2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).start();
            hnVar.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(s33Var).start();
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable = new Runnable(this) {
                public final LimitPreviewView b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    TL_stars.Tl_starsRating tl_starsRating3 = tl_starsRating2;
                    LimitPreviewView limitPreviewView = this.b;
                    switch (b) {
                        case 0:
                            int i4 = LimitPreviewView.p0;
                            limitPreviewView.f(tl_starsRating3);
                            return;
                        default:
                            int i5 = LimitPreviewView.p0;
                            limitPreviewView.g(tl_starsRating3);
                            return;
                    }
                }
            };
            this.l0 = runnable;
            gl.d3(runnable, 600L);
        } else if (i3 < i2) {
            setRatingPaintColorKey(i);
            this.M = false;
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.a = 0.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.b0 = this.n;
            jo0Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = hnVar2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            s33 s33Var2 = s33.h;
            duration2.setInterpolator(s33Var2).start();
            hnVar.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(s33Var2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) {
                public final LimitPreviewView b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    TL_stars.Tl_starsRating tl_starsRating3 = tl_starsRating2;
                    LimitPreviewView limitPreviewView = this.b;
                    switch (b) {
                        case 0:
                            int i4 = LimitPreviewView.p0;
                            limitPreviewView.f(tl_starsRating3);
                            return;
                        default:
                            int i5 = LimitPreviewView.p0;
                            limitPreviewView.g(tl_starsRating3);
                            return;
                    }
                }
            };
            this.l0 = runnable2;
            gl.d3(runnable2, 600L);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.F == null) {
            boolean z = this.f;
            float f = this.h;
            if (z) {
                float f2 = f + 0.016f;
                this.h = f2;
                if (f2 > 3.0f) {
                    this.f = false;
                }
            } else {
                float f3 = f - 0.016f;
                this.h = f3;
                if (f3 < 1.0f) {
                    this.f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        if (this.f0 != null) {
            return true;
        }
        return false;
    }

    public final void f(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z;
        this.l0 = null;
        if (!isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.M = false;
        setRatingPaintColorKey(bkb.Ei);
        long j = tl_starsRating.stars;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        hn hnVar = this.w;
        hn hnVar2 = this.O;
        if (i <= 0) {
            this.a = 0.0f;
            hnVar2.setText("");
            hnVar.setText(k96.M0(2131744936, null));
            setRatingPaintColorKey(bkb.mk);
            this.M = true;
        } else {
            long j2 = tl_starsRating.next_level_stars;
            if (j2 == 0) {
                this.a = 1.0f;
                hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level - 1)));
                hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j3 = tl_starsRating.current_level_stars;
                z = false;
                this.a = moe.a(((float) (j - j3)) / ((float) (j2 - j3)), 0.0f, 1.0f);
                hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
                hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level + 1)));
                setArrowX(0.0f);
                o16 o16Var = this.e;
                o16Var.setScaleX(0.6f);
                o16Var.setScaleY(0.6f);
                o16Var.setAlpha(0.0f);
                this.U = true;
                this.V = true;
                this.W = z;
                this.b0 = this.n;
                this.J.requestLayout();
                requestLayout();
                ViewPropertyAnimator duration = hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                s33 s33Var = s33.h;
                duration.setInterpolator(s33Var).start();
                hnVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(s33Var).start();
                setPremiumCountColor(this.M);
                setDefaultTextColor(true);
                i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
        }
        z = false;
        setArrowX(0.0f);
        o16 o16Var2 = this.e;
        o16Var2.setScaleX(0.6f);
        o16Var2.setScaleY(0.6f);
        o16Var2.setAlpha(0.0f);
        this.U = true;
        this.V = true;
        this.W = z;
        this.b0 = this.n;
        this.J.requestLayout();
        requestLayout();
        ViewPropertyAnimator duration2 = hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        s33 s33Var2 = s33.h;
        duration2.setInterpolator(s33Var2).start();
        hnVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(s33Var2).start();
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public final void g(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z;
        this.l0 = null;
        if (!isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.M = false;
        setRatingPaintColorKey(bkb.Ei);
        long j = tl_starsRating.stars;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        hn hnVar = this.w;
        hn hnVar2 = this.O;
        if (i <= 0) {
            this.a = 0.5f;
            hnVar2.setText("");
            hnVar.setText(k96.M0(2131744936, null));
            setRatingPaintColorKey(bkb.mk);
            this.M = true;
        } else {
            long j2 = tl_starsRating.next_level_stars;
            if (j2 == 0) {
                this.a = 1.0f;
                hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level - 1)));
                hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j3 = tl_starsRating.current_level_stars;
                z = false;
                this.a = moe.a(((float) (j - j3)) / ((float) (j2 - j3)), 0.0f, 1.0f);
                hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
                hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level + 1)));
                setArrowX(1.0f);
                o16 o16Var = this.e;
                o16Var.setScaleX(0.6f);
                o16Var.setScaleY(0.6f);
                o16Var.setAlpha(0.0f);
                this.U = true;
                this.V = true;
                this.W = z;
                this.b0 = this.n;
                this.J.requestLayout();
                requestLayout();
                ViewPropertyAnimator duration = hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                s33 s33Var = s33.h;
                duration.setInterpolator(s33Var).start();
                hnVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(s33Var).start();
                setPremiumCountColor(this.M);
                setDefaultTextColor(true);
                i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
        }
        z = false;
        setArrowX(1.0f);
        o16 o16Var2 = this.e;
        o16Var2.setScaleX(0.6f);
        o16Var2.setScaleY(0.6f);
        o16Var2.setAlpha(0.0f);
        this.U = true;
        this.V = true;
        this.W = z;
        this.b0 = this.n;
        this.J.requestLayout();
        requestLayout();
        ViewPropertyAnimator duration2 = hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        s33 s33Var2 = s33.h;
        duration2.setInterpolator(s33Var2).start();
        hnVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(s33Var2).start();
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public final void h(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        int i;
        int i2 = tL_premium_boostsStatus.current_level_boosts;
        int i3 = tL_premium_boostsStatus.boosts;
        hn hnVar = this.O;
        hn hnVar2 = this.w;
        if ((i2 == i3 && z) || (i = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            hnVar.setText(k96.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            hnVar2.setText(k96.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = moe.a((i3 - i2) / (i - i2), 0.0f, 1.0f);
            hnVar.setText(k96.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level)));
            hnVar2.setText(k96.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) hnVar2.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(false);
        setDefaultTextColor(true);
        j(tL_premium_boostsStatus.boosts, false);
        this.Q = true;
    }

    public final void i(int i, int i2) {
        String E;
        String E2;
        if (i < 0) {
            j(i, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new cm2(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        if (i > 1200) {
            E = k96.S(null, i);
        } else {
            E = k96.E(i, ',');
        }
        spannableStringBuilder.append((CharSequence) E);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        if (i2 > 1200) {
            E2 = k96.S(null, i2);
        } else {
            E2 = k96.E(i2, ',');
        }
        spannableStringBuilder.append((CharSequence) E2);
        spannableStringBuilder.setSpan(new rk((byte) 2, 170, false), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        o16 o16Var = this.e;
        o16Var.f = spannableStringBuilder;
        o16Var.requestLayout();
    }

    public final void j(int i, boolean z) {
        cm2 cm2Var;
        char c;
        if (i < 0) {
            cm2Var = new cm2(2131232855, 0);
        } else {
            cm2Var = new cm2(this.r, 0);
            float f = this.s;
            cm2Var.I = f;
            cm2Var.J = f;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(cm2Var, 0, 1, 0);
        if (i >= 0 || !this.i0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) k96.E(i, ','));
        }
        o16 o16Var = this.e;
        if (!z) {
            o16Var.f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = o16Var.f;
            o16Var.f = spannableStringBuilder;
            TextPaint textPaint = o16Var.c;
            ArrayList arrayList = o16Var.h;
            if (o16Var.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(o16Var.f);
                int i2 = 0;
                for (int length = o16Var.f.length() - 1; length >= 0; length--) {
                    if (length < spannableStringBuilder2.length()) {
                        c = spannableStringBuilder2.charAt(length);
                    } else {
                        c = ' ';
                    }
                    if (c != o16Var.f.charAt(length) && Character.isDigit(o16Var.f.charAt(length))) {
                        n16 n16Var = new n16();
                        arrayList.add(n16Var);
                        n16Var.e = o16Var.d.getSecondaryHorizontal(length);
                        n16Var.a = true;
                        if (i2 >= 1) {
                            i2 = 0;
                        }
                        int i3 = i2 + 1;
                        String valueOf = String.valueOf(c);
                        int i4 = (int) o16Var.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        StaticLayout staticLayout = new StaticLayout(valueOf, textPaint, i4, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = n16Var.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout(String.valueOf(o16Var.f.charAt(length)), textPaint, (int) o16Var.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new lx2((byte) 1), length, length + 1, 0);
                        i2 = i3;
                    }
                }
                o16Var.n = new StaticLayout(spannableStringBuilder3, textPaint, gl.L(12.0f) + ((int) o16Var.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    o16Var.r = true;
                    n16 n16Var2 = (n16) arrayList.get(i5);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n16Var2.f = ofFloat;
                    ofFloat.addUpdateListener(new l16(o16Var, n16Var2, (byte) 0));
                    n16Var2.f.addListener(new m16(o16Var, n16Var2, (byte) 1));
                    n16Var2.f.setInterpolator(s33.g);
                    n16Var2.f.setDuration(250L);
                    n16Var2.f.setStartDelay(((arrayList.size() - 1) - i5) * 60);
                    n16Var2.f.start();
                }
            }
        }
        o16Var.requestLayout();
    }

    public final void k(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.N = true;
        setRatingPaintColorKey(bkb.Ei);
        this.a = gl.x1((float) j, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
        this.O.setText(k96.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = k96.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        hn hnVar = this.w;
        hnVar.setText(H);
        ((FrameLayout.LayoutParams) hnVar.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        j((int) j, false);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    @Override
    public final void onLayout(boolean r30, int r31, int r32, int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.onLayout(boolean, int, int, int, int):void");
    }

    public void setBagePosition(float f) {
        this.y = moe.a(f, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(p16 p16Var) {
        this.f0 = p16Var;
    }

    public void setHideNegativeValues(boolean z) {
        this.i0 = z;
    }

    public void setIconScale(float f) {
        this.s = f;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.E = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.M = false;
        setRatingPaintColorKey(bkb.Ei);
        long j = tl_starsRating.current_level_stars;
        long j2 = tl_starsRating.stars;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        hn hnVar = this.O;
        hn hnVar2 = this.w;
        if (i <= 0) {
            this.a = 0.5f;
            hnVar.setText("");
            hnVar2.setText(k96.M0(2131744936, null));
            setRatingPaintColorKey(bkb.mk);
            this.M = true;
        } else {
            long j3 = tl_starsRating.next_level_stars;
            if (j3 == 0) {
                this.a = 1.0f;
                hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level - 1)));
                hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = moe.a(((float) (j2 - j)) / ((float) (j3 - j)), 0.0f, 1.0f);
                hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
                hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) hnVar2.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    public void setStaticGradinet(mh8 mh8Var) {
        this.F = mh8Var;
    }

    public void setStatus(int i, int i2, boolean z) {
        if (this.b == i) {
            z = false;
        }
        this.b = i;
        this.a = moe.a(i / i2, 0.0f, 1.0f);
        if (z) {
            this.a0 = true;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
        }
        hn hnVar = this.w;
        ((FrameLayout.LayoutParams) hnVar.getLayoutParams()).gravity = 5;
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        this.O.setText("0");
        hnVar.setText(String.valueOf(i2));
        j(i, false);
        this.Q = true;
        this.R = true;
    }

    public void setType(int i) {
        String str;
        hn hnVar = this.w;
        int i2 = this.r;
        o16 o16Var = this.e;
        if (i == 6) {
            if (o16Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new cm2(i2, 0), 0, 1, 0);
                if (y6c.h(y6c.t0).p()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                o16Var.f = spannableStringBuilder;
            }
            hnVar.setText("4 GB");
        } else if (i == 11) {
            if (o16Var != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new cm2(i2, 0), 0, 1, 0);
                o16Var.f = spannableStringBuilder2;
            }
            hnVar.setText("");
        }
    }

    @Override
    public final void updateColors() {
        hn hnVar;
        hn hnVar2;
        wjb wjbVar = this.T;
        try {
            if (this.o0 && (hnVar2 = this.O) != null) {
                hnVar2.setTextColor(bkb.v0(bkb.F6, wjbVar));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            if (this.m0 && (hnVar = this.w) != null) {
                hnVar.setTextColor(bkb.v0(bkb.F6, wjbVar));
            }
            int i = this.n0;
            if (i >= 0) {
                this.L.setColor(bkb.v0(i, wjbVar));
                jo0 jo0Var = this.J;
                if (jo0Var != null) {
                    jo0Var.invalidate();
                }
                o16 o16Var = this.e;
                if (o16Var != null) {
                    o16Var.invalidate();
                }
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public LimitPreviewView(Context context, int i, int i2, int i3, wjb wjbVar) {
        this(context, i, i2, i3, 0.5f, wjbVar);
    }
}
