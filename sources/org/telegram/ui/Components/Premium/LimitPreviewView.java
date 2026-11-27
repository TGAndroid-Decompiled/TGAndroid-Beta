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
public class LimitPreviewView extends LinearLayout implements snb {
    public static final int p0 = 0;
    public ViewGroup E;
    public al8 F;
    public int G;
    public boolean H;
    public boolean I;
    public final jo0 J;
    public boolean K;
    public final Paint L;
    public boolean M;
    public boolean N;
    public final in O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final vnb T;
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
    public final s36 e;
    public boolean e0;
    public boolean f;
    public t36 f0;
    public final gj3 g0;
    public float h;
    public final gj3 h0;
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
    public final in w;
    public final TextView x;
    public float y;

    public LimitPreviewView(Context context, int i, int i2, int i3, float f, vnb vnbVar) {
        super(context);
        this.s = 1.0f;
        this.I = true;
        this.L = new Paint(1);
        this.e0 = true;
        this.n0 = -1;
        this.T = vnbVar;
        this.a = ete.a(f, 0.1f, 0.9f);
        this.r = i;
        this.b = i2;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i != 0) {
            setPadding(0, hl.L(16.0f), 0, 0);
            s36 s36Var = new s36(this, context);
            this.e = s36Var;
            j(i2, false);
            s36Var.setPadding(hl.L(19.0f), hl.L(6.0f), hl.L(19.0f), hl.L(14.0f));
            addView(s36Var, tre.p(-2, -2, 0.0f, 3));
        }
        gj3 gj3Var = new gj3(this, context, true);
        this.g0 = gj3Var;
        in inVar = new in(context, false, false, false);
        this.O = inVar;
        inVar.setTextSize(hl.L(14.0f));
        inVar.setTypeface(hl.o());
        inVar.setText(ob6.M0(2131748735, null));
        inVar.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTypeface(hl.o());
        textView.setText(String.format("%d", Integer.valueOf(i3)));
        textView.setGravity(16);
        yob.X(textView, aob.G6, vnbVar);
        if (ob6.a0) {
            gj3Var.addView(inVar, tre.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            gj3Var.addView(textView, tre.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            gj3Var.addView(inVar, tre.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            gj3Var.addView(textView, tre.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        gj3 gj3Var2 = new gj3(this, context, false);
        this.h0 = gj3Var2;
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setTypeface(hl.o());
        textView2.setText(ob6.M0(2131748733, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        in inVar2 = new in(context, false, false, false);
        this.w = inVar2;
        inVar2.setTextSize(hl.L(14.0f));
        inVar2.setTypeface(hl.o());
        inVar2.setText(String.format("%d", Integer.valueOf(i3)));
        inVar2.setGravity(21);
        setPremiumCountColor(true);
        if (ob6.a0) {
            gj3Var2.addView(textView2, tre.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            gj3Var2.addView(inVar2, tre.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            gj3Var2.addView(textView2, tre.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            gj3Var2.addView(inVar2, tre.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        jo0 jo0Var = new jo0(this, context, vnbVar);
        this.J = jo0Var;
        jo0Var.addView(gj3Var, tre.c(30.0f, -1));
        jo0Var.addView(gj3Var2, tre.c(30.0f, -1));
        addView(jo0Var, tre.q(-1, 30, 0.0f, 0, 14, i != 0 ? 12 : 0, 14, 0));
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
        float L2 = hl.L(14.0f);
        s36 s36Var = this.e;
        s36Var.setTranslationX(Utilities.i((Math.max(this.n, (getMeasuredWidth() - (L << 1)) * f) + L2) - (s36Var.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - L) - s36Var.getMeasuredWidth(), L2));
        if (s36Var.s != f) {
            s36Var.s = f;
            s36Var.w = true;
            s36Var.invalidate();
        }
        s36Var.setPivotX(s36Var.getMeasuredWidth() * f);
    }

    public void setDefaultTextColor(boolean z) {
        int v0;
        this.o0 = !z;
        if (z) {
            v0 = -1;
        } else {
            v0 = aob.v0(aob.G6, this.T);
        }
        this.O.setTextColor(v0);
    }

    public void setPremiumCountColor(boolean z) {
        int v0;
        this.m0 = !z;
        if (z) {
            v0 = -1;
        } else {
            v0 = aob.v0(aob.G6, this.T);
        }
        this.w.setTextColor(v0);
    }

    private void setRatingPaintColorKey(int i) {
        this.n0 = i;
        this.L.setColor(aob.v0(i, this.T));
    }

    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z;
        hl.r(this.l0);
        this.l0 = null;
        int i = aob.Fi;
        setRatingPaintColorKey(i);
        this.M = false;
        int i2 = tl_starsRating.level;
        int i3 = tl_starsRating2.level;
        jo0 jo0Var = this.J;
        in inVar = this.w;
        in inVar2 = this.O;
        if (i2 == i3) {
            long j = tl_starsRating2.stars;
            if (j <= 0) {
                this.a = 0.0f;
                inVar2.setText("");
                inVar.setText(ob6.M0(2131744830, null));
                setRatingPaintColorKey(aob.nk);
                this.M = true;
                z = false;
            } else {
                z = false;
                long j2 = tl_starsRating2.next_level_stars;
                if (j2 == 0) {
                    this.a = 1.0f;
                    inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(i3 - 1)));
                    inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j3 = tl_starsRating2.current_level_stars;
                    this.a = ete.a(((float) (j - j3)) / ((float) (j2 - j3)), 0.0f, 1.0f);
                    inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating2.level)));
                    inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating2.level + 1)));
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
            ViewPropertyAnimator duration = inVar2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).start();
            inVar.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(k43Var).start();
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
            hl.d3(runnable, 600L);
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
            ViewPropertyAnimator duration2 = inVar2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            k43 k43Var2 = k43.h;
            duration2.setInterpolator(k43Var2).start();
            inVar.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(k43Var2).start();
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
            hl.d3(runnable2, 600L);
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
        setRatingPaintColorKey(aob.Fi);
        long j = tl_starsRating.stars;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        in inVar = this.w;
        in inVar2 = this.O;
        if (i <= 0) {
            this.a = 0.0f;
            inVar2.setText("");
            inVar.setText(ob6.M0(2131744830, null));
            setRatingPaintColorKey(aob.nk);
            this.M = true;
        } else {
            long j2 = tl_starsRating.next_level_stars;
            if (j2 == 0) {
                this.a = 1.0f;
                inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level - 1)));
                inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j3 = tl_starsRating.current_level_stars;
                z = false;
                this.a = ete.a(((float) (j - j3)) / ((float) (j2 - j3)), 0.0f, 1.0f);
                inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
                inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level + 1)));
                setArrowX(0.0f);
                s36 s36Var = this.e;
                s36Var.setScaleX(0.6f);
                s36Var.setScaleY(0.6f);
                s36Var.setAlpha(0.0f);
                this.U = true;
                this.V = true;
                this.W = z;
                this.b0 = this.n;
                this.J.requestLayout();
                requestLayout();
                ViewPropertyAnimator duration = inVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                k43 k43Var = k43.h;
                duration.setInterpolator(k43Var).start();
                inVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(k43Var).start();
                setPremiumCountColor(this.M);
                setDefaultTextColor(true);
                i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
        }
        z = false;
        setArrowX(0.0f);
        s36 s36Var2 = this.e;
        s36Var2.setScaleX(0.6f);
        s36Var2.setScaleY(0.6f);
        s36Var2.setAlpha(0.0f);
        this.U = true;
        this.V = true;
        this.W = z;
        this.b0 = this.n;
        this.J.requestLayout();
        requestLayout();
        ViewPropertyAnimator duration2 = inVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        k43 k43Var2 = k43.h;
        duration2.setInterpolator(k43Var2).start();
        inVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(k43Var2).start();
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
        setRatingPaintColorKey(aob.Fi);
        long j = tl_starsRating.stars;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        in inVar = this.w;
        in inVar2 = this.O;
        if (i <= 0) {
            this.a = 0.5f;
            inVar2.setText("");
            inVar.setText(ob6.M0(2131744830, null));
            setRatingPaintColorKey(aob.nk);
            this.M = true;
        } else {
            long j2 = tl_starsRating.next_level_stars;
            if (j2 == 0) {
                this.a = 1.0f;
                inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level - 1)));
                inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j3 = tl_starsRating.current_level_stars;
                z = false;
                this.a = ete.a(((float) (j - j3)) / ((float) (j2 - j3)), 0.0f, 1.0f);
                inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
                inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level + 1)));
                setArrowX(1.0f);
                s36 s36Var = this.e;
                s36Var.setScaleX(0.6f);
                s36Var.setScaleY(0.6f);
                s36Var.setAlpha(0.0f);
                this.U = true;
                this.V = true;
                this.W = z;
                this.b0 = this.n;
                this.J.requestLayout();
                requestLayout();
                ViewPropertyAnimator duration = inVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                k43 k43Var = k43.h;
                duration.setInterpolator(k43Var).start();
                inVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(k43Var).start();
                setPremiumCountColor(this.M);
                setDefaultTextColor(true);
                i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
        }
        z = false;
        setArrowX(1.0f);
        s36 s36Var2 = this.e;
        s36Var2.setScaleX(0.6f);
        s36Var2.setScaleY(0.6f);
        s36Var2.setAlpha(0.0f);
        this.U = true;
        this.V = true;
        this.W = z;
        this.b0 = this.n;
        this.J.requestLayout();
        requestLayout();
        ViewPropertyAnimator duration2 = inVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        k43 k43Var2 = k43.h;
        duration2.setInterpolator(k43Var2).start();
        inVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(k43Var2).start();
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public final void h(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        int i;
        int i2 = tL_premium_boostsStatus.current_level_boosts;
        int i3 = tL_premium_boostsStatus.boosts;
        in inVar = this.O;
        in inVar2 = this.w;
        if ((i2 == i3 && z) || (i = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            inVar.setText(ob6.a0("BoostsLevel", null, 2131753153, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            inVar2.setText(ob6.a0("BoostsLevel", null, 2131753153, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = ete.a((i3 - i2) / (i - i2), 0.0f, 1.0f);
            inVar.setText(ob6.a0("BoostsLevel", null, 2131753153, Integer.valueOf(tL_premium_boostsStatus.level)));
            inVar2.setText(ob6.a0("BoostsLevel", null, 2131753153, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) inVar2.getLayoutParams()).gravity = 5;
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
        spannableStringBuilder.append((CharSequence) "d").setSpan(new wm2(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        if (i > 1200) {
            E = ob6.S(null, i);
        } else {
            E = ob6.E(i, ',');
        }
        spannableStringBuilder.append((CharSequence) E);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        if (i2 > 1200) {
            E2 = ob6.S(null, i2);
        } else {
            E2 = ob6.E(i2, ',');
        }
        spannableStringBuilder.append((CharSequence) E2);
        spannableStringBuilder.setSpan(new sk((byte) 2, 170, false), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s36 s36Var = this.e;
        s36Var.f = spannableStringBuilder;
        s36Var.requestLayout();
    }

    public final void j(int i, boolean z) {
        wm2 wm2Var;
        char c;
        if (i < 0) {
            wm2Var = new wm2(2131232874, 0);
        } else {
            wm2Var = new wm2(this.r, 0);
            float f = this.s;
            wm2Var.I = f;
            wm2Var.J = f;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(wm2Var, 0, 1, 0);
        if (i >= 0 || !this.i0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) ob6.E(i, ','));
        }
        s36 s36Var = this.e;
        if (!z) {
            s36Var.f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = s36Var.f;
            s36Var.f = spannableStringBuilder;
            TextPaint textPaint = s36Var.c;
            ArrayList arrayList = s36Var.h;
            if (s36Var.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(s36Var.f);
                int i2 = 0;
                for (int length = s36Var.f.length() - 1; length >= 0; length--) {
                    if (length < spannableStringBuilder2.length()) {
                        c = spannableStringBuilder2.charAt(length);
                    } else {
                        c = ' ';
                    }
                    if (c != s36Var.f.charAt(length) && Character.isDigit(s36Var.f.charAt(length))) {
                        r36 r36Var = new r36();
                        arrayList.add(r36Var);
                        r36Var.e = s36Var.d.getSecondaryHorizontal(length);
                        r36Var.a = true;
                        if (i2 >= 1) {
                            i2 = 0;
                        }
                        int i3 = i2 + 1;
                        String valueOf = String.valueOf(c);
                        int i4 = (int) s36Var.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        StaticLayout staticLayout = new StaticLayout(valueOf, textPaint, i4, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = r36Var.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout(String.valueOf(s36Var.f.charAt(length)), textPaint, (int) s36Var.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new fy2((byte) 1), length, length + 1, 0);
                        i2 = i3;
                    }
                }
                s36Var.n = new StaticLayout(spannableStringBuilder3, textPaint, hl.L(12.0f) + ((int) s36Var.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    s36Var.r = true;
                    r36 r36Var2 = (r36) arrayList.get(i5);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    r36Var2.f = ofFloat;
                    ofFloat.addUpdateListener(new p36(s36Var, r36Var2, (byte) 0));
                    r36Var2.f.addListener(new q36(s36Var, r36Var2, (byte) 1));
                    r36Var2.f.setInterpolator(k43.g);
                    r36Var2.f.setDuration(250L);
                    r36Var2.f.setStartDelay(((arrayList.size() - 1) - i5) * 60);
                    r36Var2.f.start();
                }
            }
        }
        s36Var.requestLayout();
    }

    public final void k(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.N = true;
        setRatingPaintColorKey(aob.Fi);
        this.a = hl.x1((float) j, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
        this.O.setText(ob6.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = ob6.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        in inVar = this.w;
        inVar.setText(H);
        ((FrameLayout.LayoutParams) inVar.getLayoutParams()).gravity = 5;
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
        this.y = ete.a(f, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(t36 t36Var) {
        this.f0 = t36Var;
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
        setRatingPaintColorKey(aob.Fi);
        long j = tl_starsRating.current_level_stars;
        long j2 = tl_starsRating.stars;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        in inVar = this.O;
        in inVar2 = this.w;
        if (i <= 0) {
            this.a = 0.5f;
            inVar.setText("");
            inVar2.setText(ob6.M0(2131744830, null));
            setRatingPaintColorKey(aob.nk);
            this.M = true;
        } else {
            long j3 = tl_starsRating.next_level_stars;
            if (j3 == 0) {
                this.a = 1.0f;
                inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level - 1)));
                inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = ete.a(((float) (j2 - j)) / ((float) (j3 - j)), 0.0f, 1.0f);
                inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
                inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) inVar2.getLayoutParams()).gravity = 5;
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

    public void setStaticGradinet(al8 al8Var) {
        this.F = al8Var;
    }

    public void setStatus(int i, int i2, boolean z) {
        if (this.b == i) {
            z = false;
        }
        this.b = i;
        this.a = ete.a(i / i2, 0.0f, 1.0f);
        if (z) {
            this.a0 = true;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
        }
        in inVar = this.w;
        ((FrameLayout.LayoutParams) inVar.getLayoutParams()).gravity = 5;
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        this.O.setText("0");
        inVar.setText(String.valueOf(i2));
        j(i, false);
        this.Q = true;
        this.R = true;
    }

    public void setType(int i) {
        String str;
        in inVar = this.w;
        int i2 = this.r;
        s36 s36Var = this.e;
        if (i == 6) {
            if (s36Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new wm2(i2, 0), 0, 1, 0);
                if (yac.h(yac.t0).p()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                s36Var.f = spannableStringBuilder;
            }
            inVar.setText("4 GB");
        } else if (i == 11) {
            if (s36Var != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new wm2(i2, 0), 0, 1, 0);
                s36Var.f = spannableStringBuilder2;
            }
            inVar.setText("");
        }
    }

    @Override
    public final void updateColors() {
        in inVar;
        in inVar2;
        vnb vnbVar = this.T;
        try {
            if (this.o0 && (inVar2 = this.O) != null) {
                inVar2.setTextColor(aob.v0(aob.G6, vnbVar));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            if (this.m0 && (inVar = this.w) != null) {
                inVar.setTextColor(aob.v0(aob.G6, vnbVar));
            }
            int i = this.n0;
            if (i >= 0) {
                this.L.setColor(aob.v0(i, vnbVar));
                jo0 jo0Var = this.J;
                if (jo0Var != null) {
                    jo0Var.invalidate();
                }
                s36 s36Var = this.e;
                if (s36Var != null) {
                    s36Var.invalidate();
                }
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public LimitPreviewView(Context context, int i, int i2, int i3, vnb vnbVar) {
        this(context, i, i2, i3, 0.5f, vnbVar);
    }
}
