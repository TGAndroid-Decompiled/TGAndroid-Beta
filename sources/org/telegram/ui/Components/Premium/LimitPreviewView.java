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
import b8.be;
import b8.mf;
import ci.t4;
import gi.q3;
import java.util.ArrayList;
import java.util.HashSet;
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.t;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.u40;
import ug.f2;
import vg.o;
import vg.p;
import vg.q;
import vg.r;
import vg.s;
import vg.x0;
public class LimitPreviewView extends LinearLayout implements z5 {
    public static final int f31519p0 = 0;
    public ViewGroup E;
    public x0 F;
    public int G;
    public boolean H;
    public boolean I;
    public final t4 J;
    public boolean K;
    public final Paint L;
    public boolean M;
    public boolean N;
    public final h6 O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final e6 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f31520a;
    public boolean f31521a0;
    public int f31522b;
    public int f31523b0;
    public int f31524c;
    public float f31525c0;
    public boolean d;
    public boolean f31526d0;
    public final r f31527e;
    public boolean f31528e0;
    public boolean f31529f;
    public s f31530f0;
    public final q3 f31531g0;
    public float h;
    public final q3 f31532h0;
    public boolean f31533i0;
    public ValueAnimator f31534j0;
    public boolean f31535k0;
    public Runnable f31536l0;
    public boolean m0;
    public int f31537n;
    public int f31538n0;
    public boolean f31539o0;
    public final int f31540r;
    public float f31541s;
    public final h6 f31542w;
    public final TextView f31543x;
    public float f31544y;

    public LimitPreviewView(int i3, int i10, int i11, Context context, e6 e6Var) {
        this(context, i3, i10, i11, 0.5f, e6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        r rVar = limitPreviewView.f31527e;
        h6 h6Var = limitPreviewView.f31542w;
        h6 h6Var2 = limitPreviewView.O;
        limitPreviewView.f31536l0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f31534j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.M = false;
        limitPreviewView.setRatingPaintColorKey(k6.Ci);
        long j10 = tl_starsRating.stars;
        if (j10 <= 0) {
            limitPreviewView.f31520a = 0.5f;
            h6Var2.setText("");
            h6Var.setText(bd.M0(2131745183, null));
            limitPreviewView.setRatingPaintColorKey(k6.kk);
            limitPreviewView.M = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                limitPreviewView.f31520a = 1.0f;
                h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level - 1)));
                h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j12 = tl_starsRating.current_level_stars;
                z10 = false;
                limitPreviewView.f31520a = be.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
                h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level + 1)));
                limitPreviewView.setArrowX(1.0f);
                rVar.setScaleX(0.6f);
                rVar.setScaleY(0.6f);
                rVar.setAlpha(0.0f);
                limitPreviewView.U = true;
                limitPreviewView.V = true;
                limitPreviewView.W = z10;
                limitPreviewView.f31523b0 = limitPreviewView.f31537n;
                limitPreviewView.J.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar).start();
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
        limitPreviewView.f31523b0 = limitPreviewView.f31537n;
        limitPreviewView.J.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration2 = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        xq xqVar2 = xq.h;
        duration2.setInterpolator(xqVar2).start();
        h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar2).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.M);
        limitPreviewView.setDefaultTextColor(true);
        limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        float f10;
        r rVar = limitPreviewView.f31527e;
        h6 h6Var = limitPreviewView.f31542w;
        h6 h6Var2 = limitPreviewView.O;
        limitPreviewView.f31536l0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f31534j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.M = false;
        limitPreviewView.setRatingPaintColorKey(k6.Ci);
        long j10 = tl_starsRating.stars;
        if (j10 <= 0) {
            limitPreviewView.f31520a = 0.0f;
            h6Var2.setText("");
            h6Var.setText(bd.M0(2131745183, null));
            limitPreviewView.setRatingPaintColorKey(k6.kk);
            limitPreviewView.M = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                limitPreviewView.f31520a = 1.0f;
                h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level - 1)));
                h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j12 = tl_starsRating.current_level_stars;
                z10 = false;
                limitPreviewView.f31520a = be.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
                h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level + 1)));
                f10 = 0.0f;
                limitPreviewView.setArrowX(f10);
                rVar.setScaleX(0.6f);
                rVar.setScaleY(0.6f);
                rVar.setAlpha(f10);
                limitPreviewView.U = true;
                limitPreviewView.V = true;
                limitPreviewView.W = z10;
                limitPreviewView.f31523b0 = limitPreviewView.f31537n;
                limitPreviewView.J.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar).start();
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
        limitPreviewView.f31523b0 = limitPreviewView.f31537n;
        limitPreviewView.J.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration2 = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        xq xqVar2 = xq.h;
        duration2.setInterpolator(xqVar2).start();
        h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar2).start();
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
        int i3;
        int L;
        if (f10 >= 1.0f) {
            i3 = this.J.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        this.f31537n = i3;
        float L2 = g0.L(14.0f);
        r rVar = this.f31527e;
        rVar.setTranslationX(Utilities.i((Math.max(this.f31537n, (getMeasuredWidth() - (L * 2)) * f10) + L2) - (rVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - L) - rVar.getMeasuredWidth(), L2));
        if (rVar.f56806s != f10) {
            rVar.f56806s = f10;
            rVar.f56807w = true;
            rVar.invalidate();
        }
        rVar.setPivotX(rVar.getMeasuredWidth() * f10);
    }

    public void setDefaultTextColor(boolean z10) {
        int w02;
        this.f31539o0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = k6.w0(k6.G6, this.T);
        }
        this.O.setTextColor(w02);
    }

    public void setPremiumCountColor(boolean z10) {
        int w02;
        this.m0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = k6.w0(k6.G6, this.T);
        }
        this.f31542w.setTextColor(w02);
    }

    private void setRatingPaintColorKey(int i3) {
        this.f31538n0 = i3;
        this.L.setColor(k6.w0(i3, this.T));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.F == null) {
            if (this.f31529f) {
                float f10 = this.h + 0.016f;
                this.h = f10;
                if (f10 > 3.0f) {
                    this.f31529f = false;
                }
            } else {
                float f11 = this.h - 0.016f;
                this.h = f11;
                if (f11 < 1.0f) {
                    this.f31529f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        g0.r(this.f31536l0);
        this.f31536l0 = null;
        int i3 = k6.Ci;
        setRatingPaintColorKey(i3);
        this.M = false;
        int i10 = tl_starsRating.level;
        int i11 = tl_starsRating2.level;
        t4 t4Var = this.J;
        h6 h6Var = this.f31542w;
        h6 h6Var2 = this.O;
        if (i10 == i11) {
            long j10 = tl_starsRating2.stars;
            if (j10 <= 0) {
                this.f31520a = 0.0f;
                h6Var2.setText("");
                h6Var.setText(bd.M0(2131745183, null));
                setRatingPaintColorKey(k6.kk);
                this.M = true;
                z10 = false;
            } else {
                z10 = false;
                long j11 = tl_starsRating2.next_level_stars;
                if (j11 == 0) {
                    this.f31520a = 1.0f;
                    h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(i11 - 1)));
                    h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j12 = tl_starsRating2.current_level_stars;
                    this.f31520a = be.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                    h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating2.level)));
                    h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.U = true;
            boolean z11 = z10;
            this.V = z11;
            this.W = z11;
            this.f31523b0 = this.f31537n;
            t4Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
        } else if (i11 > i10) {
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.f31520a = 1.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.f31523b0 = this.f31537n;
            t4Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = h6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            h6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(xqVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable = new Runnable(this) {
                public final LimitPreviewView f56741b;

                {
                    this.f56741b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f56741b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f56741b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f31536l0 = runnable;
            g0.i3(runnable, 600L);
        } else if (i11 < i10) {
            setRatingPaintColorKey(i3);
            this.M = false;
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.f31520a = 0.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.f31523b0 = this.f31537n;
            t4Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = h6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).start();
            h6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(xqVar2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) {
                public final LimitPreviewView f56741b;

                {
                    this.f56741b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f56741b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f56741b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f31536l0 = runnable2;
            g0.i3(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i3;
        int i10 = tL_premium_boostsStatus.current_level_boosts;
        int i11 = tL_premium_boostsStatus.boosts;
        h6 h6Var = this.O;
        h6 h6Var2 = this.f31542w;
        if ((i10 == i11 && z10) || (i3 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f31520a = 1.0f;
            h6Var.setText(bd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            h6Var2.setText(bd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f31520a = be.a((i11 - i10) / (i3 - i10), 0.0f, 1.0f);
            h6Var.setText(bd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
            h6Var2.setText(bd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) h6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f31543x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(false);
        setDefaultTextColor(true);
        i(tL_premium_boostsStatus.boosts, false);
        this.Q = true;
    }

    public final void h(int i3, int i10) {
        String E;
        String E2;
        if (i3 < 0) {
            i(i3, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new wp(this.f31540r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        if (i3 > 1200) {
            E = bd.S(null, i3);
        } else {
            E = bd.E(i3, ',');
        }
        spannableStringBuilder.append((CharSequence) E);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        if (i10 > 1200) {
            E2 = bd.S(null, i10);
        } else {
            E2 = bd.E(i10, ',');
        }
        spannableStringBuilder.append((CharSequence) E2);
        spannableStringBuilder.setSpan(new t(170, 2, false), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        r rVar = this.f31527e;
        rVar.b(spannableStringBuilder, false);
        rVar.requestLayout();
    }

    public final void i(int i3, boolean z10) {
        wp wpVar;
        if (i3 < 0) {
            wpVar = new wp(2131232845, 0);
        } else {
            wpVar = new wp(this.f31540r, 0);
            float f10 = this.f31541s;
            wpVar.I = f10;
            wpVar.J = f10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(wpVar, 0, 1, 0);
        if (i3 >= 0 || !this.f31533i0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) bd.E(i3, ','));
        }
        r rVar = this.f31527e;
        rVar.b(spannableStringBuilder, z10);
        rVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j10, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.N = true;
        setRatingPaintColorKey(k6.Ci);
        this.f31520a = g0.z1((float) j10, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
        this.O.setText(bd.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = bd.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        h6 h6Var = this.f31542w;
        h6Var.setText(H);
        ((FrameLayout.LayoutParams) h6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.f31543x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        i((int) j10, false);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
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
        super.onLayout(z10, i3, i10, i11, i12);
        boolean z14 = this.f31521a0;
        r rVar = this.f31527e;
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
        if (!this.U && !this.f31521a0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f31521a0 = false;
        this.U = false;
        if (z11) {
            f10 = rVar.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        float f18 = L2;
        int i18 = L2 * 2;
        float max = (Math.max(this.f31537n, (getMeasuredWidth() - i18) * this.f31544y) + f18) - (rVar.getMeasuredWidth() / 2.0f);
        if (this.R) {
            float f19 = rVar.f56806s;
            measuredWidth = Utilities.i(max, (getMeasuredWidth() - L2) - rVar.getMeasuredWidth(), f18);
            int i19 = this.f31537n;
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
                f14 = Utilities.i((this.f31537n - (measuredWidth - f18)) / rVar.getMeasuredWidth(), 1.0f, 0.0f);
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
            TextPaint textPaint2 = rVar.f56801c;
            ArrayList arrayList = rVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = rVar.E;
            if (limitPreviewView.Q && limitPreviewView.f31522b == 0) {
                f16 = f13;
                z12 = z11;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rVar.f56803f);
                int i20 = 0;
                boolean z18 = true;
                while (i20 < rVar.f56803f.length()) {
                    if (Character.isDigit(rVar.f56803f.charAt(i20))) {
                        q qVar = new q();
                        arrayList.add(qVar);
                        f17 = f13;
                        qVar.f56787e = rVar.d.getSecondaryHorizontal(i20);
                        qVar.d = z18;
                        if (i17 >= 1) {
                            z18 = !z18;
                            i17 = 0;
                        }
                        i17++;
                        int charAt = rVar.f56803f.charAt(i20) - '0';
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
                            qVar.f56785b.add(new StaticLayout(p1.i(i15, ""), textPaint2, (int) rVar.f56802e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i16 + 1;
                            i14 = i22;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new fy(false), i20, i20 + 1, 0);
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
                rVar.f56804n = new StaticLayout(spannableStringBuilder, textPaint2, g0.L(12.0f) + ((int) rVar.f56802e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    rVar.f56805r = true;
                    q qVar2 = (q) arrayList.get(i23);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qVar2.f56788f = ofFloat;
                    ofFloat.addUpdateListener(new o(rVar, qVar2, 1));
                    qVar2.f56788f.addListener(new p(rVar, qVar2, 0));
                    qVar2.f56788f.setInterpolator(xq.f40453g);
                    qVar2.f56788f.setDuration(750L);
                    qVar2.f56788f.setStartDelay(((arrayList.size() - 1) - i23) * 60);
                    qVar2.f56788f.start();
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
        this.f31534j0 = ofFloat2;
        final float f20 = this.f31537n;
        if (z12) {
            this.f31537n = this.f31523b0;
        }
        final boolean z19 = !this.f31535k0;
        this.f31535k0 = true;
        final float f21 = f14;
        final float f22 = f10;
        final float f23 = f16;
        final boolean z20 = z12;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                r rVar2 = limitPreviewView2.f31527e;
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
                    rVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.f31525c0);
                } else if (!limitPreviewView2.f31535k0) {
                    rVar2.setRotation(limitPreviewView2.f31525c0);
                }
                if (valueAnimator == limitPreviewView2.f31534j0) {
                    rVar2.setTranslationX(org.telegram.messenger.g0.T1(f22, f15, min));
                    float T1 = org.telegram.messenger.g0.T1(f23, f21, min);
                    if (rVar2.f56806s != T1) {
                        rVar2.f56806s = T1;
                        rVar2.f56807w = true;
                        rVar2.invalidate();
                    }
                    rVar2.setPivotX(rVar2.getMeasuredWidth() * T1);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (!z20) {
                    rVar2.setScaleX(min2);
                    rVar2.setScaleY(min2);
                } else {
                    limitPreviewView2.f31537n = (int) org.telegram.messenger.g0.T1(limitPreviewView2.f31523b0, f20, min);
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
        this.f31534j0.addListener(new u40(16, this, z19));
        this.f31534j0.setInterpolator(new OvershootInterpolator());
        if (this.f31521a0) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new f2(this, 1));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.f31534j0.setDuration(600L);
        } else if (z17) {
            this.f31534j0.setInterpolator(xq.f40454i);
            this.f31534j0.setDuration(320L);
        } else if (z16) {
            this.f31534j0.setInterpolator(xq.h);
            this.f31534j0.setDuration(500L);
        } else {
            this.f31534j0.setDuration(1000L);
            this.f31534j0.setStartDelay(200L);
        }
        this.f31534j0.start();
        this.d = true;
    }

    public void setBagePosition(float f10) {
        this.f31544y = be.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(s sVar) {
        this.f31530f0 = sVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f31533i0 = z10;
    }

    public void setIconScale(float f10) {
        this.f31541s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.E = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.M = false;
        setRatingPaintColorKey(k6.Ci);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        int i3 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        h6 h6Var = this.O;
        h6 h6Var2 = this.f31542w;
        if (i3 <= 0) {
            this.f31520a = 0.5f;
            h6Var.setText("");
            h6Var2.setText(bd.M0(2131745183, null));
            setRatingPaintColorKey(k6.kk);
            this.M = true;
        } else {
            long j12 = tl_starsRating.next_level_stars;
            if (j12 == 0) {
                this.f31520a = 1.0f;
                h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level - 1)));
                h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f31520a = be.a(((float) (j11 - j10)) / ((float) (j12 - j10)), 0.0f, 1.0f);
                h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
                h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) h6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f31543x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    public void setStaticGradinet(x0 x0Var) {
        this.F = x0Var;
    }

    public void setStatus(int i3, int i10, boolean z10) {
        if (this.f31522b == i3) {
            z10 = false;
        }
        this.f31522b = i3;
        this.f31520a = be.a(i3 / i10, 0.0f, 1.0f);
        if (z10) {
            this.f31521a0 = true;
            this.f31523b0 = this.f31537n;
            this.J.requestLayout();
            requestLayout();
        }
        h6 h6Var = this.f31542w;
        ((FrameLayout.LayoutParams) h6Var.getLayoutParams()).gravity = 5;
        this.f31543x.setVisibility(8);
        this.P.setVisibility(8);
        this.O.setText("0");
        h6Var.setText("" + i10);
        i(i3, false);
        this.Q = true;
        this.R = true;
    }

    public void setType(int i3) {
        String str;
        h6 h6Var = this.f31542w;
        int i10 = this.f31540r;
        r rVar = this.f31527e;
        if (i3 == 6) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new wp(i10, 0), 0, 1, 0);
                if (h10.i(h10.f22829t0).q()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                rVar.b(spannableStringBuilder, false);
            }
            h6Var.setText("4 GB");
        } else if (i3 == 11) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new wp(i10, 0), 0, 1, 0);
                rVar.b(spannableStringBuilder2, false);
            }
            h6Var.setText("");
        }
    }

    @Override
    public final void updateColors() {
        h6 h6Var;
        h6 h6Var2;
        e6 e6Var = this.T;
        try {
            if (this.f31539o0 && (h6Var2 = this.O) != null) {
                h6Var2.setTextColor(k6.w0(k6.G6, e6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            if (this.m0 && (h6Var = this.f31542w) != null) {
                h6Var.setTextColor(k6.w0(k6.G6, e6Var));
            }
            int i3 = this.f31538n0;
            if (i3 >= 0) {
                this.L.setColor(k6.w0(i3, e6Var));
                t4 t4Var = this.J;
                if (t4Var != null) {
                    t4Var.invalidate();
                }
                r rVar = this.f31527e;
                if (rVar != null) {
                    rVar.invalidate();
                }
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public LimitPreviewView(Context context, int i3, int i10, int i11, float f10, e6 e6Var) {
        super(context);
        this.f31541s = 1.0f;
        this.I = true;
        this.L = new Paint(1);
        this.f31528e0 = true;
        this.f31538n0 = -1;
        this.T = e6Var;
        this.f31520a = be.a(f10, 0.1f, 0.9f);
        this.f31540r = i3;
        this.f31522b = i10;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i3 != 0) {
            setPadding(0, g0.L(16.0f), 0, 0);
            r rVar = new r(this, context);
            this.f31527e = rVar;
            i(i10, false);
            rVar.setPadding(g0.L(19.0f), g0.L(6.0f), g0.L(19.0f), g0.L(14.0f));
            addView(rVar, mf.p(-2, -2, 0.0f, 3));
        }
        q3 q3Var = new q3(this, context, true);
        this.f31531g0 = q3Var;
        h6 h6Var = new h6(context, false, false, false);
        this.O = h6Var;
        h6Var.setTextSize(g0.L(14.0f));
        h6Var.setTypeface(g0.o());
        h6Var.setText(bd.M0(2131748989, null));
        h6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.f31543x = textView;
        textView.setTypeface(g0.o());
        textView.setText(String.format("%d", Integer.valueOf(i11)));
        textView.setGravity(16);
        r6.V(textView, k6.G6, e6Var);
        if (bd.f21784a0) {
            q3Var.addView(h6Var, mf.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var.addView(textView, mf.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            q3Var.addView(h6Var, mf.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var.addView(textView, mf.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        q3 q3Var2 = new q3(this, context, false);
        this.f31532h0 = q3Var2;
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setTypeface(g0.o());
        textView2.setText(bd.M0(2131748987, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        h6 h6Var2 = new h6(context, false, false, false);
        this.f31542w = h6Var2;
        h6Var2.setTextSize(g0.L(14.0f));
        h6Var2.setTypeface(g0.o());
        h6Var2.setText(String.format("%d", Integer.valueOf(i11)));
        h6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (bd.f21784a0) {
            q3Var2.addView(textView2, mf.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var2.addView(h6Var2, mf.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            q3Var2.addView(textView2, mf.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var2.addView(h6Var2, mf.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        t4 t4Var = new t4(this, context, e6Var);
        this.J = t4Var;
        t4Var.addView(q3Var, mf.c(30.0f, -1));
        t4Var.addView(q3Var2, mf.c(30.0f, -1));
        addView(t4Var, mf.q(-1, 30, 0.0f, 0, 14, i3 != 0 ? 12 : 0, 14, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
