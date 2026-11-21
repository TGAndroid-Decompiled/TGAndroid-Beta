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
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.l9;
import c8.ma;
import di.n4;
import hi.p3;
import i5.c;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.t;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.uy;
import org.telegram.ui.c30;
import tg.z1;
import ug.a1;
import ug.o;
import ug.p;
import ug.q;
import ug.r;
import ug.s;
public class LimitPreviewView extends LinearLayout implements b6 {
    public static final int f33056p0 = 0;
    public ViewGroup E;
    public a1 F;
    public int G;
    public boolean H;
    public boolean I;
    public final n4 J;
    public boolean K;
    public final Paint L;
    public boolean M;
    public boolean N;
    public final o6 O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final h6 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f33057a;
    public boolean f33058a0;
    public int f33059b;
    public int f33060b0;
    public int f33061c;
    public float f33062c0;
    public boolean d;
    public boolean f33063d0;
    public final r f33064e;
    public boolean f33065e0;
    public boolean f33066f;
    public s f33067f0;
    public final p3 f33068g0;
    public float h;
    public final p3 f33069h0;
    public boolean f33070i0;
    public ValueAnimator f33071j0;
    public boolean f33072k0;
    public Runnable f33073l0;
    public boolean m0;
    public int f33074n;
    public int f33075n0;
    public boolean f33076o0;
    public final int f33077r;
    public float f33078s;
    public final o6 f33079w;
    public final TextView f33080x;
    public float f33081y;

    public LimitPreviewView(int i7, int i10, int i11, Context context, h6 h6Var) {
        this(context, i7, i10, i11, 0.5f, h6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        r rVar = limitPreviewView.f33064e;
        o6 o6Var = limitPreviewView.f33079w;
        o6 o6Var2 = limitPreviewView.O;
        limitPreviewView.f33073l0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f33071j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.M = false;
        limitPreviewView.setRatingPaintColorKey(m6.Fi);
        long j3 = tl_starsRating.stars;
        if (j3 <= 0) {
            limitPreviewView.f33057a = 0.5f;
            o6Var2.setText("");
            o6Var.setText(gd.N0(2131744932, null));
            limitPreviewView.setRatingPaintColorKey(m6.nk);
            limitPreviewView.M = true;
        } else {
            long j10 = tl_starsRating.next_level_stars;
            if (j10 == 0) {
                limitPreviewView.f33057a = 1.0f;
                o6Var2.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j11 = tl_starsRating.current_level_stars;
                z10 = false;
                limitPreviewView.f33057a = l9.a(((float) (j3 - j11)) / ((float) (j10 - j11)), 0.0f, 1.0f);
                o6Var2.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level)));
                o6Var.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level + 1)));
                limitPreviewView.setArrowX(1.0f);
                rVar.setScaleX(0.6f);
                rVar.setScaleY(0.6f);
                rVar.setAlpha(0.0f);
                limitPreviewView.U = true;
                limitPreviewView.V = true;
                limitPreviewView.W = z10;
                limitPreviewView.f33060b0 = limitPreviewView.f33074n;
                limitPreviewView.J.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                nr nrVar = nr.h;
                duration.setInterpolator(nrVar).start();
                o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(nrVar).start();
                limitPreviewView.setPremiumCountColor(limitPreviewView.M);
                limitPreviewView.setDefaultTextColor(true);
                limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
        }
        z10 = false;
        limitPreviewView.setArrowX(1.0f);
        rVar.setScaleX(0.6f);
        rVar.setScaleY(0.6f);
        rVar.setAlpha(0.0f);
        limitPreviewView.U = true;
        limitPreviewView.V = true;
        limitPreviewView.W = z10;
        limitPreviewView.f33060b0 = limitPreviewView.f33074n;
        limitPreviewView.J.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration2 = o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        nr nrVar2 = nr.h;
        duration2.setInterpolator(nrVar2).start();
        o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(nrVar2).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.M);
        limitPreviewView.setDefaultTextColor(true);
        limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        float f10;
        r rVar = limitPreviewView.f33064e;
        o6 o6Var = limitPreviewView.f33079w;
        o6 o6Var2 = limitPreviewView.O;
        limitPreviewView.f33073l0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f33071j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.M = false;
        limitPreviewView.setRatingPaintColorKey(m6.Fi);
        long j3 = tl_starsRating.stars;
        if (j3 <= 0) {
            limitPreviewView.f33057a = 0.0f;
            o6Var2.setText("");
            o6Var.setText(gd.N0(2131744932, null));
            limitPreviewView.setRatingPaintColorKey(m6.nk);
            limitPreviewView.M = true;
        } else {
            long j10 = tl_starsRating.next_level_stars;
            if (j10 == 0) {
                limitPreviewView.f33057a = 1.0f;
                o6Var2.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j11 = tl_starsRating.current_level_stars;
                z10 = false;
                limitPreviewView.f33057a = l9.a(((float) (j3 - j11)) / ((float) (j10 - j11)), 0.0f, 1.0f);
                o6Var2.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level)));
                o6Var.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level + 1)));
                f10 = 0.0f;
                limitPreviewView.setArrowX(f10);
                rVar.setScaleX(0.6f);
                rVar.setScaleY(0.6f);
                rVar.setAlpha(f10);
                limitPreviewView.U = true;
                limitPreviewView.V = true;
                limitPreviewView.W = z10;
                limitPreviewView.f33060b0 = limitPreviewView.f33074n;
                limitPreviewView.J.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                nr nrVar = nr.h;
                duration.setInterpolator(nrVar).start();
                o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(nrVar).start();
                limitPreviewView.setPremiumCountColor(limitPreviewView.M);
                limitPreviewView.setDefaultTextColor(true);
                limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
        }
        z10 = false;
        f10 = 0.0f;
        limitPreviewView.setArrowX(f10);
        rVar.setScaleX(0.6f);
        rVar.setScaleY(0.6f);
        rVar.setAlpha(f10);
        limitPreviewView.U = true;
        limitPreviewView.V = true;
        limitPreviewView.W = z10;
        limitPreviewView.f33060b0 = limitPreviewView.f33074n;
        limitPreviewView.J.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration2 = o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        nr nrVar2 = nr.h;
        duration2.setInterpolator(nrVar2).start();
        o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(nrVar2).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.M);
        limitPreviewView.setDefaultTextColor(true);
        limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public static void c(LimitPreviewView limitPreviewView, boolean z10) {
        limitPreviewView.setPremiumCountColor(z10);
    }

    public static void d(LimitPreviewView limitPreviewView, boolean z10) {
        limitPreviewView.setDefaultTextColor(z10);
    }

    public static float e(LimitPreviewView limitPreviewView) {
        return limitPreviewView.getGlobalXOffset();
    }

    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f10) {
        int i7;
        int L;
        if (f10 >= 1.0f) {
            i7 = this.J.getMeasuredWidth();
        } else {
            i7 = 0;
        }
        this.f33074n = i7;
        float L2 = g0.L(14.0f);
        r rVar = this.f33064e;
        rVar.setTranslationX(Utilities.i((Math.max(this.f33074n, (getMeasuredWidth() - (L * 2)) * f10) + L2) - (rVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - L) - rVar.getMeasuredWidth(), L2));
        if (rVar.f58892s != f10) {
            rVar.f58892s = f10;
            rVar.f58893w = true;
            rVar.invalidate();
        }
        rVar.setPivotX(rVar.getMeasuredWidth() * f10);
    }

    public void setDefaultTextColor(boolean z10) {
        int w02;
        this.f33076o0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = m6.w0(m6.G6, this.T);
        }
        this.O.setTextColor(w02);
    }

    public void setPremiumCountColor(boolean z10) {
        int w02;
        this.m0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = m6.w0(m6.G6, this.T);
        }
        this.f33079w.setTextColor(w02);
    }

    private void setRatingPaintColorKey(int i7) {
        this.f33075n0 = i7;
        this.L.setColor(m6.w0(i7, this.T));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.F == null) {
            if (this.f33066f) {
                float f10 = this.h + 0.016f;
                this.h = f10;
                if (f10 > 3.0f) {
                    this.f33066f = false;
                }
            } else {
                float f11 = this.h - 0.016f;
                this.h = f11;
                if (f11 < 1.0f) {
                    this.f33066f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        g0.r(this.f33073l0);
        this.f33073l0 = null;
        int i7 = m6.Fi;
        setRatingPaintColorKey(i7);
        this.M = false;
        int i10 = tl_starsRating.level;
        int i11 = tl_starsRating2.level;
        n4 n4Var = this.J;
        o6 o6Var = this.f33079w;
        o6 o6Var2 = this.O;
        if (i10 == i11) {
            long j3 = tl_starsRating2.stars;
            if (j3 <= 0) {
                this.f33057a = 0.0f;
                o6Var2.setText("");
                o6Var.setText(gd.N0(2131744932, null));
                setRatingPaintColorKey(m6.nk);
                this.M = true;
                z10 = false;
            } else {
                z10 = false;
                long j10 = tl_starsRating2.next_level_stars;
                if (j10 == 0) {
                    this.f33057a = 1.0f;
                    o6Var2.setText(gd.a0(null, null, 2131744933, Integer.valueOf(i11 - 1)));
                    o6Var.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j11 = tl_starsRating2.current_level_stars;
                    this.f33057a = l9.a(((float) (j3 - j11)) / ((float) (j10 - j11)), 0.0f, 1.0f);
                    o6Var2.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating2.level)));
                    o6Var.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.U = true;
            boolean z11 = z10;
            this.V = z11;
            this.W = z11;
            this.f33060b0 = this.f33074n;
            n4Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
        } else if (i11 > i10) {
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.f33057a = 1.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.f33060b0 = this.f33074n;
            n4Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = o6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).start();
            o6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(nrVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable = new Runnable(this) {
                public final LimitPreviewView f58835b;

                {
                    this.f58835b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f58835b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f58835b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f33073l0 = runnable;
            g0.h3(runnable, 600L);
        } else if (i11 < i10) {
            setRatingPaintColorKey(i7);
            this.M = false;
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.f33057a = 0.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.f33060b0 = this.f33074n;
            n4Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = o6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            nr nrVar2 = nr.h;
            duration2.setInterpolator(nrVar2).start();
            o6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(nrVar2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) {
                public final LimitPreviewView f58835b;

                {
                    this.f58835b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f58835b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f58835b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f33073l0 = runnable2;
            g0.h3(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i7;
        int i10 = tL_premium_boostsStatus.current_level_boosts;
        int i11 = tL_premium_boostsStatus.boosts;
        o6 o6Var = this.O;
        o6 o6Var2 = this.f33079w;
        if ((i10 == i11 && z10) || (i7 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f33057a = 1.0f;
            o6Var.setText(gd.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            o6Var2.setText(gd.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f33057a = l9.a((i11 - i10) / (i7 - i10), 0.0f, 1.0f);
            o6Var.setText(gd.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level)));
            o6Var2.setText(gd.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f33080x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(false);
        setDefaultTextColor(true);
        i(tL_premium_boostsStatus.boosts, false);
        this.Q = true;
    }

    public final void h(int i7, int i10) {
        String E;
        String E2;
        if (i7 < 0) {
            i(i7, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new nq(this.f33077r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        if (i7 > 1200) {
            E = gd.S(null, i7);
        } else {
            E = gd.E(i7, ',');
        }
        spannableStringBuilder.append((CharSequence) E);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        if (i10 > 1200) {
            E2 = gd.S(null, i10);
        } else {
            E2 = gd.E(i10, ',');
        }
        spannableStringBuilder.append((CharSequence) E2);
        spannableStringBuilder.setSpan(new t(170, 2, false), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        r rVar = this.f33064e;
        rVar.b(spannableStringBuilder, false);
        rVar.requestLayout();
    }

    public final void i(int i7, boolean z10) {
        nq nqVar;
        if (i7 < 0) {
            nqVar = new nq(2131232852, 0);
        } else {
            nqVar = new nq(this.f33077r, 0);
            float f10 = this.f33078s;
            nqVar.I = f10;
            nqVar.J = f10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(nqVar, 0, 1, 0);
        if (i7 >= 0 || !this.f33070i0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) gd.E(i7, ','));
        }
        r rVar = this.f33064e;
        rVar.b(spannableStringBuilder, z10);
        rVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j3, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.N = true;
        setRatingPaintColorKey(m6.Fi);
        this.f33057a = g0.z1((float) j3, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
        this.O.setText(gd.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = gd.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        o6 o6Var = this.f33079w;
        o6Var.setText(H);
        ((FrameLayout.LayoutParams) o6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.f33080x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        i((int) j3, false);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        final float f15;
        float measuredWidth;
        float f16;
        boolean z12;
        int i13;
        float f17;
        boolean z13;
        TextPaint textPaint;
        int i14;
        int i15;
        int i16;
        int L;
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z14 = this.f33058a0;
        r rVar = this.f33064e;
        if (!z14 && !this.U && (this.d || rVar == null || !this.I || this.K)) {
            if (this.Q) {
                if (!this.V && !this.W) {
                    rVar.setAlpha(1.0f);
                    rVar.setScaleX(1.0f);
                    rVar.setScaleY(1.0f);
                    return;
                }
                return;
            } else if (this.K) {
                float measuredWidth2 = (((getMeasuredWidth() - (L * 2)) * 0.5f) + g0.L(14.0f)) - (rVar.getMeasuredWidth() / 2.0f);
                boolean z15 = this.d;
                if (!z15 && this.I) {
                    this.d = true;
                    rVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
                } else if (!z15) {
                    rVar.setAlpha(0.0f);
                    rVar.setScaleX(0.0f);
                    rVar.setScaleY(0.0f);
                } else {
                    rVar.setAlpha(1.0f);
                    rVar.setScaleX(1.0f);
                    rVar.setScaleY(1.0f);
                }
                rVar.setTranslationX(measuredWidth2);
                return;
            } else if (rVar != null) {
                rVar.setAlpha(0.0f);
                return;
            } else {
                return;
            }
        }
        int L2 = g0.L(14.0f);
        int i17 = 0;
        if (!this.U && !this.f33058a0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f33058a0 = false;
        this.U = false;
        if (z11) {
            f10 = rVar.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        float f18 = L2;
        int i18 = L2 * 2;
        float max = (Math.max(this.f33074n, (getMeasuredWidth() - i18) * this.f33081y) + f18) - (rVar.getMeasuredWidth() / 2.0f);
        if (this.R) {
            float f19 = rVar.f58892s;
            measuredWidth = Utilities.i(max, (getMeasuredWidth() - L2) - rVar.getMeasuredWidth(), f18);
            int i19 = this.f33074n;
            if (i19 <= 0) {
                f15 = measuredWidth;
                f13 = f19;
                f14 = 0.0f;
            } else if (i19 >= getMeasuredWidth() - i18) {
                f11 = f19;
                f15 = measuredWidth;
                f13 = f11;
                f14 = 1.0f;
            } else {
                f14 = Utilities.i((this.f33074n - (measuredWidth - f18)) / rVar.getMeasuredWidth(), 1.0f, 0.0f);
                f15 = measuredWidth;
                f13 = f19;
            }
        } else {
            if (max < f18) {
                f11 = 0.0f;
                f12 = 0.0f;
            } else {
                f18 = max;
                f11 = 0.5f;
                f12 = 0.5f;
            }
            if (f18 > (getMeasuredWidth() - L2) - rVar.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - L2) - rVar.getMeasuredWidth();
                f15 = measuredWidth;
                f13 = f11;
                f14 = 1.0f;
            } else {
                f13 = f11;
                f14 = f12;
                f15 = f18;
            }
        }
        final boolean z16 = this.V;
        final boolean z17 = this.W;
        if (!z16 && !z17) {
            rVar.setAlpha(1.0f);
        }
        rVar.setTranslationX(f10);
        rVar.setPivotX(rVar.getMeasuredWidth() / 2.0f);
        rVar.setPivotY(rVar.getMeasuredHeight());
        if (!z11) {
            rVar.setScaleX(0.0f);
            rVar.setScaleY(0.0f);
            TextPaint textPaint2 = rVar.f58887c;
            ArrayList arrayList = rVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = rVar.E;
            if (limitPreviewView.Q && limitPreviewView.f33059b == 0) {
                f16 = f13;
                z12 = z11;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rVar.f58889f);
                int i20 = 0;
                boolean z18 = true;
                while (i20 < rVar.f58889f.length()) {
                    if (Character.isDigit(rVar.f58889f.charAt(i20))) {
                        q qVar = new q();
                        arrayList.add(qVar);
                        f17 = f13;
                        qVar.f58873e = rVar.d.getSecondaryHorizontal(i20);
                        qVar.d = z18;
                        if (i17 >= 1) {
                            z18 = !z18;
                            i17 = 0;
                        }
                        i17++;
                        int charAt = rVar.f58889f.charAt(i20) - '0';
                        if (charAt == 0) {
                            i14 = 10;
                        } else {
                            i14 = charAt;
                        }
                        z13 = z11;
                        int i21 = 1;
                        while (i21 <= i14) {
                            int i22 = i14;
                            if (i21 == 10) {
                                i16 = i21;
                                i15 = 0;
                            } else {
                                i15 = i21;
                                i16 = i15;
                            }
                            qVar.f58871b.add(new StaticLayout(c.i(i15, ""), textPaint2, (int) rVar.f58888e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i16 + 1;
                            i14 = i22;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new uy(false), i20, i20 + 1, 0);
                    } else {
                        f17 = f13;
                        z13 = z11;
                        textPaint = textPaint2;
                    }
                    i20++;
                    textPaint2 = textPaint;
                    f13 = f17;
                    z11 = z13;
                }
                f16 = f13;
                z12 = z11;
                rVar.f58890n = new StaticLayout(spannableStringBuilder, textPaint2, g0.L(12.0f) + ((int) rVar.f58888e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    rVar.f58891r = true;
                    q qVar2 = (q) arrayList.get(i23);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qVar2.f58874f = ofFloat;
                    ofFloat.addUpdateListener(new o(rVar, qVar2, 1));
                    qVar2.f58874f.addListener(new p(rVar, qVar2, 0));
                    qVar2.f58874f.setInterpolator(nr.f37957g);
                    qVar2.f58874f.setDuration(750L);
                    qVar2.f58874f.setStartDelay(((arrayList.size() - 1) - i23) * 60);
                    qVar2.f58874f.start();
                }
            }
            i13 = 2;
        } else {
            f16 = f13;
            z12 = z11;
            i13 = 2;
        }
        float[] fArr = new float[i13];
        
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
        this.f33071j0 = ofFloat2;
        final float f20 = this.f33074n;
        if (z12) {
            this.f33074n = this.f33060b0;
        }
        final boolean z19 = !this.f33072k0;
        this.f33072k0 = true;
        final float f21 = f14;
        final float f22 = f10;
        final float f23 = f16;
        final boolean z20 = z12;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                r rVar2 = limitPreviewView2.f33064e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z19) {
                    if (!limitPreviewView2.H) {
                        limitPreviewView2.H = true;
                        try {
                            rVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    rVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.f33062c0);
                } else if (!limitPreviewView2.f33072k0) {
                    rVar2.setRotation(limitPreviewView2.f33062c0);
                }
                if (valueAnimator == limitPreviewView2.f33071j0) {
                    rVar2.setTranslationX(org.telegram.messenger.g0.T1(f22, f15, min));
                    float T1 = org.telegram.messenger.g0.T1(f23, f21, min);
                    if (rVar2.f58892s != T1) {
                        rVar2.f58892s = T1;
                        rVar2.f58893w = true;
                        rVar2.invalidate();
                    }
                    rVar2.setPivotX(rVar2.getMeasuredWidth() * T1);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (!z20) {
                    rVar2.setScaleX(min2);
                    rVar2.setScaleY(min2);
                } else {
                    limitPreviewView2.f33074n = (int) org.telegram.messenger.g0.T1(limitPreviewView2.f33060b0, f20, min);
                    limitPreviewView2.J.invalidate();
                }
                if (z16) {
                    rVar2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                    rVar2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                    rVar2.setAlpha(floatValue);
                } else if (z17) {
                    float f24 = 1.0f - floatValue;
                    rVar2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f24));
                    rVar2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f24));
                    rVar2.setAlpha(f24);
                }
            }
        });
        this.f33071j0.addListener(new c30(16, this, z19));
        this.f33071j0.setInterpolator(new OvershootInterpolator());
        if (this.f33058a0) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new z1(this, 2));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.f33071j0.setDuration(600L);
        } else if (z17) {
            this.f33071j0.setInterpolator(nr.f37958i);
            this.f33071j0.setDuration(320L);
        } else if (z16) {
            this.f33071j0.setInterpolator(nr.h);
            this.f33071j0.setDuration(500L);
        } else {
            this.f33071j0.setDuration(1000L);
            this.f33071j0.setStartDelay(200L);
        }
        this.f33071j0.start();
        this.d = true;
    }

    public void setBagePosition(float f10) {
        this.f33081y = l9.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(s sVar) {
        this.f33067f0 = sVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f33070i0 = z10;
    }

    public void setIconScale(float f10) {
        this.f33078s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.E = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.M = false;
        setRatingPaintColorKey(m6.Fi);
        long j3 = tl_starsRating.current_level_stars;
        long j10 = tl_starsRating.stars;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        o6 o6Var = this.O;
        o6 o6Var2 = this.f33079w;
        if (i7 <= 0) {
            this.f33057a = 0.5f;
            o6Var.setText("");
            o6Var2.setText(gd.N0(2131744932, null));
            setRatingPaintColorKey(m6.nk);
            this.M = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                this.f33057a = 1.0f;
                o6Var.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var2.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f33057a = l9.a(((float) (j10 - j3)) / ((float) (j11 - j3)), 0.0f, 1.0f);
                o6Var.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level)));
                o6Var2.setText(gd.a0(null, null, 2131744933, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f33080x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    public void setStaticGradinet(a1 a1Var) {
        this.F = a1Var;
    }

    public void setStatus(int i7, int i10, boolean z10) {
        if (this.f33059b == i7) {
            z10 = false;
        }
        this.f33059b = i7;
        this.f33057a = l9.a(i7 / i10, 0.0f, 1.0f);
        if (z10) {
            this.f33058a0 = true;
            this.f33060b0 = this.f33074n;
            this.J.requestLayout();
            requestLayout();
        }
        o6 o6Var = this.f33079w;
        ((FrameLayout.LayoutParams) o6Var.getLayoutParams()).gravity = 5;
        this.f33080x.setVisibility(8);
        this.P.setVisibility(8);
        this.O.setText("0");
        o6Var.setText("" + i10);
        i(i7, false);
        this.Q = true;
        this.R = true;
    }

    public void setType(int i7) {
        String str;
        o6 o6Var = this.f33079w;
        int i10 = this.f33077r;
        r rVar = this.f33064e;
        if (i7 == 6) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new nq(i10, 0), 0, 1, 0);
                if (j10.i(j10.f24798t0).q()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                rVar.b(spannableStringBuilder, false);
            }
            o6Var.setText("4 GB");
        } else if (i7 == 11) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new nq(i10, 0), 0, 1, 0);
                rVar.b(spannableStringBuilder2, false);
            }
            o6Var.setText("");
        }
    }

    @Override
    public final void updateColors() {
        o6 o6Var;
        o6 o6Var2;
        h6 h6Var = this.T;
        try {
            if (this.f33076o0 && (o6Var2 = this.O) != null) {
                o6Var2.setTextColor(m6.w0(m6.G6, h6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            if (this.m0 && (o6Var = this.f33079w) != null) {
                o6Var.setTextColor(m6.w0(m6.G6, h6Var));
            }
            int i7 = this.f33075n0;
            if (i7 >= 0) {
                this.L.setColor(m6.w0(i7, h6Var));
                n4 n4Var = this.J;
                if (n4Var != null) {
                    n4Var.invalidate();
                }
                r rVar = this.f33064e;
                if (rVar != null) {
                    rVar.invalidate();
                }
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public LimitPreviewView(Context context, int i7, int i10, int i11, float f10, h6 h6Var) {
        super(context);
        this.f33078s = 1.0f;
        this.I = true;
        this.L = new Paint(1);
        this.f33065e0 = true;
        this.f33075n0 = -1;
        this.T = h6Var;
        this.f33057a = l9.a(f10, 0.1f, 0.9f);
        this.f33077r = i7;
        this.f33059b = i10;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i7 != 0) {
            setPadding(0, g0.L(16.0f), 0, 0);
            r rVar = new r(this, context);
            this.f33064e = rVar;
            i(i10, false);
            rVar.setPadding(g0.L(19.0f), g0.L(6.0f), g0.L(19.0f), g0.L(14.0f));
            addView(rVar, ma.p(-2, -2, 0.0f, 3));
        }
        p3 p3Var = new p3(this, context, true);
        this.f33068g0 = p3Var;
        o6 o6Var = new o6(context, false, false, false);
        this.O = o6Var;
        o6Var.setTextSize(g0.L(14.0f));
        o6Var.setTypeface(g0.o());
        o6Var.setText(gd.N0(2131748788, null));
        o6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.f33080x = textView;
        textView.setTypeface(g0.o());
        textView.setText(String.format("%d", Integer.valueOf(i11)));
        textView.setGravity(16);
        t6.U(textView, m6.G6, h6Var);
        if (gd.f24241a0) {
            p3Var.addView(o6Var, ma.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            p3Var.addView(textView, ma.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            p3Var.addView(o6Var, ma.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            p3Var.addView(textView, ma.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        p3 p3Var2 = new p3(this, context, false);
        this.f33069h0 = p3Var2;
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setTypeface(g0.o());
        textView2.setText(gd.N0(2131748786, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        o6 o6Var2 = new o6(context, false, false, false);
        this.f33079w = o6Var2;
        o6Var2.setTextSize(g0.L(14.0f));
        o6Var2.setTypeface(g0.o());
        o6Var2.setText(String.format("%d", Integer.valueOf(i11)));
        o6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (gd.f24241a0) {
            p3Var2.addView(textView2, ma.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            p3Var2.addView(o6Var2, ma.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            p3Var2.addView(textView2, ma.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            p3Var2.addView(o6Var2, ma.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        n4 n4Var = new n4(this, context, h6Var);
        this.J = n4Var;
        n4Var.addView(p3Var, ma.c(30.0f, -1));
        n4Var.addView(p3Var2, ma.c(30.0f, -1));
        addView(n4Var, ma.q(-1, 30, 0.0f, 0, 14, i7 != 0 ? 12 : 0, 14, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
