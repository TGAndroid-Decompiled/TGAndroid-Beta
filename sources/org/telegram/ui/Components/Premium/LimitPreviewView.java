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
import bi.m5;
import c8.ha;
import c8.j9;
import fi.r3;
import java.util.ArrayList;
import java.util.HashSet;
import jg.g;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.t;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.z40;
import ti.d;
import ug.o;
import ug.p;
import ug.q;
import ug.r;
import ug.s;
import ug.y0;
public class LimitPreviewView extends LinearLayout implements a6 {
    public static final int f31444o0 = 0;
    public ViewGroup D;
    public y0 E;
    public int F;
    public boolean G;
    public boolean H;
    public final m5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final j6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final f6 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f31445a;
    public int f31446a0;
    public int f31447b;
    public float f31448b0;
    public int f31449c;
    public boolean f31450c0;
    public boolean d;
    public boolean f31451d0;
    public final r f31452e;
    public s f31453e0;
    public boolean f31454f;
    public final r3 f31455f0;
    public final r3 f31456g0;
    public float h;
    public boolean f31457h0;
    public ValueAnimator f31458i0;
    public boolean f31459j0;
    public Runnable f31460k0;
    public boolean f31461l0;
    public int m0;
    public int f31462n;
    public boolean f31463n0;
    public final int f31464r;
    public float f31465s;
    public final j6 f31466w;
    public final TextView f31467x;
    public float f31468y;

    public LimitPreviewView(int i7, int i10, int i11, Context context, f6 f6Var) {
        this(context, i7, i10, i11, 0.5f, f6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z9;
        r rVar = limitPreviewView.f31452e;
        j6 j6Var = limitPreviewView.f31466w;
        j6 j6Var2 = limitPreviewView.N;
        limitPreviewView.f31460k0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f31458i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.L = false;
        limitPreviewView.setRatingPaintColorKey(k6.Ci);
        long j3 = tl_starsRating.stars;
        if (j3 <= 0) {
            limitPreviewView.f31445a = 0.5f;
            j6Var2.setText("");
            j6Var.setText(hd.M0(2131745174, null));
            limitPreviewView.setRatingPaintColorKey(k6.kk);
            limitPreviewView.L = true;
        } else {
            long j10 = tl_starsRating.next_level_stars;
            if (j10 == 0) {
                limitPreviewView.f31445a = 1.0f;
                j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j11 = tl_starsRating.current_level_stars;
                z9 = false;
                limitPreviewView.f31445a = j9.a(((float) (j3 - j11)) / ((float) (j10 - j11)), 0.0f, 1.0f);
                j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
                j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level + 1)));
                limitPreviewView.setArrowX(1.0f);
                rVar.setScaleX(0.6f);
                rVar.setScaleY(0.6f);
                rVar.setAlpha(0.0f);
                limitPreviewView.T = true;
                limitPreviewView.U = true;
                limitPreviewView.V = z9;
                limitPreviewView.f31446a0 = limitPreviewView.f31462n;
                limitPreviewView.I.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar).start();
                limitPreviewView.setPremiumCountColor(limitPreviewView.L);
                limitPreviewView.setDefaultTextColor(true);
                limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
        }
        z9 = false;
        limitPreviewView.setArrowX(1.0f);
        rVar.setScaleX(0.6f);
        rVar.setScaleY(0.6f);
        rVar.setAlpha(0.0f);
        limitPreviewView.T = true;
        limitPreviewView.U = true;
        limitPreviewView.V = z9;
        limitPreviewView.f31446a0 = limitPreviewView.f31462n;
        limitPreviewView.I.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration2 = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        xq xqVar2 = xq.h;
        duration2.setInterpolator(xqVar2).start();
        j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar2).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.L);
        limitPreviewView.setDefaultTextColor(true);
        limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z9;
        float f10;
        r rVar = limitPreviewView.f31452e;
        j6 j6Var = limitPreviewView.f31466w;
        j6 j6Var2 = limitPreviewView.N;
        limitPreviewView.f31460k0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f31458i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.L = false;
        limitPreviewView.setRatingPaintColorKey(k6.Ci);
        long j3 = tl_starsRating.stars;
        if (j3 <= 0) {
            limitPreviewView.f31445a = 0.0f;
            j6Var2.setText("");
            j6Var.setText(hd.M0(2131745174, null));
            limitPreviewView.setRatingPaintColorKey(k6.kk);
            limitPreviewView.L = true;
        } else {
            long j10 = tl_starsRating.next_level_stars;
            if (j10 == 0) {
                limitPreviewView.f31445a = 1.0f;
                j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j11 = tl_starsRating.current_level_stars;
                z9 = false;
                limitPreviewView.f31445a = j9.a(((float) (j3 - j11)) / ((float) (j10 - j11)), 0.0f, 1.0f);
                j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
                j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level + 1)));
                f10 = 0.0f;
                limitPreviewView.setArrowX(f10);
                rVar.setScaleX(0.6f);
                rVar.setScaleY(0.6f);
                rVar.setAlpha(f10);
                limitPreviewView.T = true;
                limitPreviewView.U = true;
                limitPreviewView.V = z9;
                limitPreviewView.f31446a0 = limitPreviewView.f31462n;
                limitPreviewView.I.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar).start();
                limitPreviewView.setPremiumCountColor(limitPreviewView.L);
                limitPreviewView.setDefaultTextColor(true);
                limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
        }
        z9 = false;
        f10 = 0.0f;
        limitPreviewView.setArrowX(f10);
        rVar.setScaleX(0.6f);
        rVar.setScaleY(0.6f);
        rVar.setAlpha(f10);
        limitPreviewView.T = true;
        limitPreviewView.U = true;
        limitPreviewView.V = z9;
        limitPreviewView.f31446a0 = limitPreviewView.f31462n;
        limitPreviewView.I.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration2 = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        xq xqVar2 = xq.h;
        duration2.setInterpolator(xqVar2).start();
        j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar2).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.L);
        limitPreviewView.setDefaultTextColor(true);
        limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public static void c(LimitPreviewView limitPreviewView, boolean z9) {
        limitPreviewView.setPremiumCountColor(z9);
    }

    public static void d(LimitPreviewView limitPreviewView, boolean z9) {
        limitPreviewView.setDefaultTextColor(z9);
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
            i7 = this.I.getMeasuredWidth();
        } else {
            i7 = 0;
        }
        this.f31462n = i7;
        float L2 = g0.L(14.0f);
        r rVar = this.f31452e;
        rVar.setTranslationX(Utilities.i((Math.max(this.f31462n, (getMeasuredWidth() - (L * 2)) * f10) + L2) - (rVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - L) - rVar.getMeasuredWidth(), L2));
        if (rVar.f56714s != f10) {
            rVar.f56714s = f10;
            rVar.f56715w = true;
            rVar.invalidate();
        }
        rVar.setPivotX(rVar.getMeasuredWidth() * f10);
    }

    public void setDefaultTextColor(boolean z9) {
        int w02;
        this.f31463n0 = !z9;
        if (z9) {
            w02 = -1;
        } else {
            w02 = k6.w0(k6.G6, this.S);
        }
        this.N.setTextColor(w02);
    }

    public void setPremiumCountColor(boolean z9) {
        int w02;
        this.f31461l0 = !z9;
        if (z9) {
            w02 = -1;
        } else {
            w02 = k6.w0(k6.G6, this.S);
        }
        this.f31466w.setTextColor(w02);
    }

    private void setRatingPaintColorKey(int i7) {
        this.m0 = i7;
        this.K.setColor(k6.w0(i7, this.S));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.E == null) {
            if (this.f31454f) {
                float f10 = this.h + 0.016f;
                this.h = f10;
                if (f10 > 3.0f) {
                    this.f31454f = false;
                }
            } else {
                float f11 = this.h - 0.016f;
                this.h = f11;
                if (f11 < 1.0f) {
                    this.f31454f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z9;
        g0.r(this.f31460k0);
        this.f31460k0 = null;
        int i7 = k6.Ci;
        setRatingPaintColorKey(i7);
        this.L = false;
        int i10 = tl_starsRating.level;
        int i11 = tl_starsRating2.level;
        m5 m5Var = this.I;
        j6 j6Var = this.f31466w;
        j6 j6Var2 = this.N;
        if (i10 == i11) {
            long j3 = tl_starsRating2.stars;
            if (j3 <= 0) {
                this.f31445a = 0.0f;
                j6Var2.setText("");
                j6Var.setText(hd.M0(2131745174, null));
                setRatingPaintColorKey(k6.kk);
                this.L = true;
                z9 = false;
            } else {
                z9 = false;
                long j10 = tl_starsRating2.next_level_stars;
                if (j10 == 0) {
                    this.f31445a = 1.0f;
                    j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(i11 - 1)));
                    j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j11 = tl_starsRating2.current_level_stars;
                    this.f31445a = j9.a(((float) (j3 - j11)) / ((float) (j10 - j11)), 0.0f, 1.0f);
                    j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating2.level)));
                    j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.T = true;
            boolean z10 = z9;
            this.U = z10;
            this.V = z10;
            this.f31446a0 = this.f31462n;
            m5Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
        } else if (i11 > i10) {
            if (tl_starsRating.stars <= 0) {
                this.L = true;
            }
            this.f31445a = 1.0f;
            this.T = true;
            this.U = false;
            this.V = true;
            this.f31446a0 = this.f31462n;
            m5Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = j6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            j6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(xqVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable = new Runnable(this) {
                public final LimitPreviewView f56619b;

                {
                    this.f56619b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f56619b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f56619b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f31460k0 = runnable;
            g0.i3(runnable, 600L);
        } else if (i11 < i10) {
            setRatingPaintColorKey(i7);
            this.L = false;
            if (tl_starsRating.stars <= 0) {
                this.L = true;
            }
            this.f31445a = 0.0f;
            this.T = true;
            this.U = false;
            this.V = true;
            this.f31446a0 = this.f31462n;
            m5Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).start();
            j6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(xqVar2).start();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) {
                public final LimitPreviewView f56619b;

                {
                    this.f56619b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f56619b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f56619b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f31460k0 = runnable2;
            g0.i3(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z9) {
        int i7;
        int i10 = tL_premium_boostsStatus.current_level_boosts;
        int i11 = tL_premium_boostsStatus.boosts;
        j6 j6Var = this.N;
        j6 j6Var2 = this.f31466w;
        if ((i10 == i11 && z9) || (i7 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f31445a = 1.0f;
            j6Var.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            j6Var2.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f31445a = j9.a((i11 - i10) / (i7 - i10), 0.0f, 1.0f);
            j6Var.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
            j6Var2.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f31467x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(false);
        setDefaultTextColor(true);
        i(tL_premium_boostsStatus.boosts, false);
        this.P = true;
    }

    public final void h(int i7, int i10) {
        String E;
        String E2;
        if (i7 < 0) {
            i(i7, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new wp(this.f31464r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        if (i7 > 1200) {
            E = hd.S(null, i7);
        } else {
            E = hd.E(i7, ',');
        }
        spannableStringBuilder.append((CharSequence) E);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        if (i10 > 1200) {
            E2 = hd.S(null, i10);
        } else {
            E2 = hd.E(i10, ',');
        }
        spannableStringBuilder.append((CharSequence) E2);
        spannableStringBuilder.setSpan(new t(170, 2, false), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        r rVar = this.f31452e;
        rVar.b(spannableStringBuilder, false);
        rVar.requestLayout();
    }

    public final void i(int i7, boolean z9) {
        wp wpVar;
        if (i7 < 0) {
            wpVar = new wp(2131232847, 0);
        } else {
            wpVar = new wp(this.f31464r, 0);
            float f10 = this.f31465s;
            wpVar.H = f10;
            wpVar.I = f10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(wpVar, 0, 1, 0);
        if (i7 >= 0 || !this.f31457h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) hd.E(i7, ','));
        }
        r rVar = this.f31452e;
        rVar.b(spannableStringBuilder, z9);
        rVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j3, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.M = true;
        setRatingPaintColorKey(k6.Ci);
        this.f31445a = g0.z1((float) j3, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
        this.N.setText(hd.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = hd.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        j6 j6Var = this.f31466w;
        j6Var.setText(H);
        ((FrameLayout.LayoutParams) j6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.f31467x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(this.L);
        setDefaultTextColor(true);
        i((int) j3, false);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        final float f15;
        float measuredWidth;
        float f16;
        boolean z11;
        int i13;
        float f17;
        boolean z12;
        TextPaint textPaint;
        int i14;
        int i15;
        int i16;
        int L;
        super.onLayout(z9, i7, i10, i11, i12);
        boolean z13 = this.W;
        r rVar = this.f31452e;
        if (!z13 && !this.T && (this.d || rVar == null || !this.H || this.J)) {
            if (this.P) {
                if (!this.U && !this.V) {
                    rVar.setAlpha(1.0f);
                    rVar.setScaleX(1.0f);
                    rVar.setScaleY(1.0f);
                    return;
                }
                return;
            } else if (this.J) {
                float measuredWidth2 = (((getMeasuredWidth() - (L * 2)) * 0.5f) + g0.L(14.0f)) - (rVar.getMeasuredWidth() / 2.0f);
                boolean z14 = this.d;
                if (!z14 && this.H) {
                    this.d = true;
                    rVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
                } else if (!z14) {
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
        if (!this.T && !this.W) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.W = false;
        this.T = false;
        if (z10) {
            f10 = rVar.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        float f18 = L2;
        int i18 = L2 * 2;
        float max = (Math.max(this.f31462n, (getMeasuredWidth() - i18) * this.f31468y) + f18) - (rVar.getMeasuredWidth() / 2.0f);
        if (this.Q) {
            float f19 = rVar.f56714s;
            measuredWidth = Utilities.i(max, (getMeasuredWidth() - L2) - rVar.getMeasuredWidth(), f18);
            int i19 = this.f31462n;
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
                f14 = Utilities.i((this.f31462n - (measuredWidth - f18)) / rVar.getMeasuredWidth(), 1.0f, 0.0f);
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
        final boolean z15 = this.U;
        final boolean z16 = this.V;
        if (!z15 && !z16) {
            rVar.setAlpha(1.0f);
        }
        rVar.setTranslationX(f10);
        rVar.setPivotX(rVar.getMeasuredWidth() / 2.0f);
        rVar.setPivotY(rVar.getMeasuredHeight());
        if (!z10) {
            rVar.setScaleX(0.0f);
            rVar.setScaleY(0.0f);
            TextPaint textPaint2 = rVar.f56709c;
            ArrayList arrayList = rVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = rVar.D;
            if (limitPreviewView.P && limitPreviewView.f31447b == 0) {
                f16 = f13;
                z11 = z10;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rVar.f56711f);
                int i20 = 0;
                boolean z17 = true;
                while (i20 < rVar.f56711f.length()) {
                    if (Character.isDigit(rVar.f56711f.charAt(i20))) {
                        q qVar = new q();
                        arrayList.add(qVar);
                        f17 = f13;
                        qVar.f56697e = rVar.d.getSecondaryHorizontal(i20);
                        qVar.d = z17;
                        if (i17 >= 1) {
                            z17 = !z17;
                            i17 = 0;
                        }
                        i17++;
                        int charAt = rVar.f56711f.charAt(i20) - '0';
                        if (charAt == 0) {
                            i14 = 10;
                        } else {
                            i14 = charAt;
                        }
                        z12 = z10;
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
                            qVar.f56695b.add(new StaticLayout(g.j(i15, ""), textPaint2, (int) rVar.f56710e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i16 + 1;
                            i14 = i22;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new hy(false), i20, i20 + 1, 0);
                    } else {
                        f17 = f13;
                        z12 = z10;
                        textPaint = textPaint2;
                    }
                    i20++;
                    textPaint2 = textPaint;
                    f13 = f17;
                    z10 = z12;
                }
                f16 = f13;
                z11 = z10;
                rVar.f56712n = new StaticLayout(spannableStringBuilder, textPaint2, g0.L(12.0f) + ((int) rVar.f56710e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    rVar.f56713r = true;
                    q qVar2 = (q) arrayList.get(i23);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qVar2.f56698f = ofFloat;
                    ofFloat.addUpdateListener(new o(rVar, qVar2, 1));
                    qVar2.f56698f.addListener(new p(rVar, qVar2, 0));
                    qVar2.f56698f.setInterpolator(xq.f40346g);
                    qVar2.f56698f.setDuration(750L);
                    qVar2.f56698f.setStartDelay(((arrayList.size() - 1) - i23) * 60);
                    qVar2.f56698f.start();
                }
            }
            i13 = 2;
        } else {
            f16 = f13;
            z11 = z10;
            i13 = 2;
        }
        float[] fArr = new float[i13];
        
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
        this.f31458i0 = ofFloat2;
        final float f20 = this.f31462n;
        if (z11) {
            this.f31462n = this.f31446a0;
        }
        final boolean z18 = !this.f31459j0;
        this.f31459j0 = true;
        final float f21 = f14;
        final float f22 = f10;
        final float f23 = f16;
        final boolean z19 = z11;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                r rVar2 = limitPreviewView2.f31452e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z18) {
                    if (!limitPreviewView2.G) {
                        limitPreviewView2.G = true;
                        try {
                            rVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    rVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.f31448b0);
                } else if (!limitPreviewView2.f31459j0) {
                    rVar2.setRotation(limitPreviewView2.f31448b0);
                }
                if (valueAnimator == limitPreviewView2.f31458i0) {
                    rVar2.setTranslationX(org.telegram.messenger.g0.T1(f22, f15, min));
                    float T1 = org.telegram.messenger.g0.T1(f23, f21, min);
                    if (rVar2.f56714s != T1) {
                        rVar2.f56714s = T1;
                        rVar2.f56715w = true;
                        rVar2.invalidate();
                    }
                    rVar2.setPivotX(rVar2.getMeasuredWidth() * T1);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (!z19) {
                    rVar2.setScaleX(min2);
                    rVar2.setScaleY(min2);
                } else {
                    limitPreviewView2.f31462n = (int) org.telegram.messenger.g0.T1(limitPreviewView2.f31446a0, f20, min);
                    limitPreviewView2.I.invalidate();
                }
                if (z15) {
                    rVar2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                    rVar2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                    rVar2.setAlpha(floatValue);
                } else if (z16) {
                    float f24 = 1.0f - floatValue;
                    rVar2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f24));
                    rVar2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f24));
                    rVar2.setAlpha(f24);
                }
            }
        });
        this.f31458i0.addListener(new z40(15, this, z18));
        this.f31458i0.setInterpolator(new OvershootInterpolator());
        if (this.W) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new d(this, 1));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.f31458i0.setDuration(600L);
        } else if (z16) {
            this.f31458i0.setInterpolator(xq.f40347i);
            this.f31458i0.setDuration(320L);
        } else if (z15) {
            this.f31458i0.setInterpolator(xq.h);
            this.f31458i0.setDuration(500L);
        } else {
            this.f31458i0.setDuration(1000L);
            this.f31458i0.setStartDelay(200L);
        }
        this.f31458i0.start();
        this.d = true;
    }

    public void setBagePosition(float f10) {
        this.f31468y = j9.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(s sVar) {
        this.f31453e0 = sVar;
    }

    public void setHideNegativeValues(boolean z9) {
        this.f31457h0 = z9;
    }

    public void setIconScale(float f10) {
        this.f31465s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.D = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.L = false;
        setRatingPaintColorKey(k6.Ci);
        long j3 = tl_starsRating.current_level_stars;
        long j10 = tl_starsRating.stars;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        j6 j6Var = this.N;
        j6 j6Var2 = this.f31466w;
        if (i7 <= 0) {
            this.f31445a = 0.5f;
            j6Var.setText("");
            j6Var2.setText(hd.M0(2131745174, null));
            setRatingPaintColorKey(k6.kk);
            this.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                this.f31445a = 1.0f;
                j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f31445a = j9.a(((float) (j10 - j3)) / ((float) (j11 - j3)), 0.0f, 1.0f);
                j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
                j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f31467x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(this.L);
        setDefaultTextColor(true);
        h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    public void setStaticGradinet(y0 y0Var) {
        this.E = y0Var;
    }

    public void setStatus(int i7, int i10, boolean z9) {
        if (this.f31447b == i7) {
            z9 = false;
        }
        this.f31447b = i7;
        this.f31445a = j9.a(i7 / i10, 0.0f, 1.0f);
        if (z9) {
            this.W = true;
            this.f31446a0 = this.f31462n;
            this.I.requestLayout();
            requestLayout();
        }
        j6 j6Var = this.f31466w;
        ((FrameLayout.LayoutParams) j6Var.getLayoutParams()).gravity = 5;
        this.f31467x.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        j6Var.setText("" + i10);
        i(i7, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i7) {
        String str;
        j6 j6Var = this.f31466w;
        int i10 = this.f31464r;
        r rVar = this.f31452e;
        if (i7 == 6) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new wp(i10, 0), 0, 1, 0);
                if (p10.i(p10.f24467s0).q()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                rVar.b(spannableStringBuilder, false);
            }
            j6Var.setText("4 GB");
        } else if (i7 == 11) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new wp(i10, 0), 0, 1, 0);
                rVar.b(spannableStringBuilder2, false);
            }
            j6Var.setText("");
        }
    }

    @Override
    public final void updateColors() {
        j6 j6Var;
        j6 j6Var2;
        f6 f6Var = this.S;
        try {
            if (this.f31463n0 && (j6Var2 = this.N) != null) {
                j6Var2.setTextColor(k6.w0(k6.G6, f6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            if (this.f31461l0 && (j6Var = this.f31466w) != null) {
                j6Var.setTextColor(k6.w0(k6.G6, f6Var));
            }
            int i7 = this.m0;
            if (i7 >= 0) {
                this.K.setColor(k6.w0(i7, f6Var));
                m5 m5Var = this.I;
                if (m5Var != null) {
                    m5Var.invalidate();
                }
                r rVar = this.f31452e;
                if (rVar != null) {
                    rVar.invalidate();
                }
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public LimitPreviewView(Context context, int i7, int i10, int i11, float f10, f6 f6Var) {
        super(context);
        this.f31465s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.f31451d0 = true;
        this.m0 = -1;
        this.S = f6Var;
        this.f31445a = j9.a(f10, 0.1f, 0.9f);
        this.f31464r = i7;
        this.f31447b = i10;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i7 != 0) {
            setPadding(0, g0.L(16.0f), 0, 0);
            r rVar = new r(this, context);
            this.f31452e = rVar;
            i(i10, false);
            rVar.setPadding(g0.L(19.0f), g0.L(6.0f), g0.L(19.0f), g0.L(14.0f));
            addView(rVar, ha.p(-2, -2, 0.0f, 3));
        }
        r3 r3Var = new r3(this, context, true);
        this.f31455f0 = r3Var;
        j6 j6Var = new j6(context, false, false, false);
        this.N = j6Var;
        j6Var.setTextSize(g0.L(14.0f));
        j6Var.setTypeface(g0.o());
        j6Var.setText(hd.M0(2131748980, null));
        j6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.f31467x = textView;
        textView.setTypeface(g0.o());
        textView.setText(String.format("%d", Integer.valueOf(i11)));
        textView.setGravity(16);
        r6.V(textView, k6.G6, f6Var);
        if (hd.f22878a0) {
            r3Var.addView(j6Var, ha.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            r3Var.addView(textView, ha.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            r3Var.addView(j6Var, ha.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            r3Var.addView(textView, ha.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        r3 r3Var2 = new r3(this, context, false);
        this.f31456g0 = r3Var2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(g0.o());
        textView2.setText(hd.M0(2131748978, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        j6 j6Var2 = new j6(context, false, false, false);
        this.f31466w = j6Var2;
        j6Var2.setTextSize(g0.L(14.0f));
        j6Var2.setTypeface(g0.o());
        j6Var2.setText(String.format("%d", Integer.valueOf(i11)));
        j6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (hd.f22878a0) {
            r3Var2.addView(textView2, ha.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            r3Var2.addView(j6Var2, ha.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            r3Var2.addView(textView2, ha.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            r3Var2.addView(j6Var2, ha.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        m5 m5Var = new m5(this, context, f6Var);
        this.I = m5Var;
        m5Var.addView(r3Var, ha.c(30.0f, -1));
        m5Var.addView(r3Var2, ha.c(30.0f, -1));
        addView(m5Var, ha.q(-1, 30, 0.0f, 0, 14, i7 != 0 ? 12 : 0, 14, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
