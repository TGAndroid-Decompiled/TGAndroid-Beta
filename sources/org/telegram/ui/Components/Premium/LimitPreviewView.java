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
import bg.k;
import eg.m;
import i0.a;
import java.util.ArrayList;
import java.util.HashSet;
import jg.b1;
import kg.k1;
import kg.s;
import kg.t;
import kg.v;
import kg.w;
import kg.x;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wy;
import w7.b6;
import w7.u;
public class LimitPreviewView extends LinearLayout implements k6 {
    public static final int f24096o0 = 0;
    public ViewGroup D;
    public k1 E;
    public int F;
    public boolean G;
    public boolean H;
    public final b1 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final f6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final p6 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f24097a;
    public int f24098a0;
    public int f24099b;
    public float f24100b0;
    public int f24101c;
    public boolean f24102c0;
    public boolean d;
    public boolean f24103d0;
    public final v e;
    public w f24104e0;
    public boolean f24105f;
    public final x f24106f0;
    public final x f24107g0;
    public float h;
    public boolean f24108h0;
    public ValueAnimator f24109i0;
    public boolean f24110j0;
    public Runnable f24111k0;
    public boolean f24112l0;
    public int m0;
    public int f24113n;
    public boolean f24114n0;
    public final int f24115r;
    public float f24116s;
    public final f6 f24117w;
    public final TextView f24118x;
    public float f24119y;

    public LimitPreviewView(int i10, int i11, int i12, Context context, p6 p6Var) {
        this(context, i10, i11, i12, 0.5f, p6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        v vVar = limitPreviewView.e;
        f6 f6Var = limitPreviewView.f24117w;
        f6 f6Var2 = limitPreviewView.N;
        limitPreviewView.f24111k0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f24109i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.L = false;
        limitPreviewView.setRatingPaintColorKey(t6.Ci);
        long j10 = tl_starsRating.stars;
        if (j10 <= 0) {
            limitPreviewView.f24097a = 0.5f;
            f6Var2.setText("");
            f6Var.setText(cd.L0(2131745191, null));
            limitPreviewView.setRatingPaintColorKey(t6.kk);
            limitPreviewView.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                limitPreviewView.f24097a = 1.0f;
                f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level - 1)));
                f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j12 = tl_starsRating.current_level_stars;
                z10 = false;
                limitPreviewView.f24097a = u.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
                f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level + 1)));
                limitPreviewView.setArrowX(1.0f);
                vVar.setScaleX(0.6f);
                vVar.setScaleY(0.6f);
                vVar.setAlpha(0.0f);
                limitPreviewView.T = true;
                limitPreviewView.U = true;
                limitPreviewView.V = z10;
                limitPreviewView.f24098a0 = limitPreviewView.f24113n;
                limitPreviewView.I.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                f6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar).start();
                limitPreviewView.setPremiumCountColor(limitPreviewView.L);
                limitPreviewView.setDefaultTextColor(true);
                limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
        }
        z10 = false;
        limitPreviewView.setArrowX(1.0f);
        vVar.setScaleX(0.6f);
        vVar.setScaleY(0.6f);
        vVar.setAlpha(0.0f);
        limitPreviewView.T = true;
        limitPreviewView.U = true;
        limitPreviewView.V = z10;
        limitPreviewView.f24098a0 = limitPreviewView.f24113n;
        limitPreviewView.I.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration2 = f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        gr grVar2 = gr.h;
        duration2.setInterpolator(grVar2).start();
        f6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar2).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.L);
        limitPreviewView.setDefaultTextColor(true);
        limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        float f7;
        v vVar = limitPreviewView.e;
        f6 f6Var = limitPreviewView.f24117w;
        f6 f6Var2 = limitPreviewView.N;
        limitPreviewView.f24111k0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f24109i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.L = false;
        limitPreviewView.setRatingPaintColorKey(t6.Ci);
        long j10 = tl_starsRating.stars;
        if (j10 <= 0) {
            limitPreviewView.f24097a = 0.0f;
            f6Var2.setText("");
            f6Var.setText(cd.L0(2131745191, null));
            limitPreviewView.setRatingPaintColorKey(t6.kk);
            limitPreviewView.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                limitPreviewView.f24097a = 1.0f;
                f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level - 1)));
                f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j12 = tl_starsRating.current_level_stars;
                z10 = false;
                limitPreviewView.f24097a = u.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
                f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level + 1)));
                f7 = 0.0f;
                limitPreviewView.setArrowX(f7);
                vVar.setScaleX(0.6f);
                vVar.setScaleY(0.6f);
                vVar.setAlpha(f7);
                limitPreviewView.T = true;
                limitPreviewView.U = true;
                limitPreviewView.V = z10;
                limitPreviewView.f24098a0 = limitPreviewView.f24113n;
                limitPreviewView.I.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                f6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar).start();
                limitPreviewView.setPremiumCountColor(limitPreviewView.L);
                limitPreviewView.setDefaultTextColor(true);
                limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
        }
        z10 = false;
        f7 = 0.0f;
        limitPreviewView.setArrowX(f7);
        vVar.setScaleX(0.6f);
        vVar.setScaleY(0.6f);
        vVar.setAlpha(f7);
        limitPreviewView.T = true;
        limitPreviewView.U = true;
        limitPreviewView.V = z10;
        limitPreviewView.f24098a0 = limitPreviewView.f24113n;
        limitPreviewView.I.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration2 = f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        gr grVar2 = gr.h;
        duration2.setInterpolator(grVar2).start();
        f6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar2).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.L);
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

    private void setArrowX(float f7) {
        int i10;
        int L;
        if (f7 >= 1.0f) {
            i10 = this.I.getMeasuredWidth();
        } else {
            i10 = 0;
        }
        this.f24113n = i10;
        float L2 = i0.L(14.0f);
        v vVar = this.e;
        vVar.setTranslationX(Utilities.i((Math.max(this.f24113n, (getMeasuredWidth() - (L * 2)) * f7) + L2) - (vVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - L) - vVar.getMeasuredWidth(), L2));
        if (vVar.f11285s != f7) {
            vVar.f11285s = f7;
            vVar.f11286w = true;
            vVar.invalidate();
        }
        vVar.setPivotX(vVar.getMeasuredWidth() * f7);
    }

    public void setDefaultTextColor(boolean z10) {
        int w02;
        this.f24114n0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = t6.w0(t6.G6, this.S);
        }
        this.N.setTextColor(w02);
    }

    public void setPremiumCountColor(boolean z10) {
        int w02;
        this.f24112l0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = t6.w0(t6.G6, this.S);
        }
        this.f24117w.setTextColor(w02);
    }

    private void setRatingPaintColorKey(int i10) {
        this.m0 = i10;
        this.K.setColor(t6.w0(i10, this.S));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.E == null) {
            if (this.f24105f) {
                float f7 = this.h + 0.016f;
                this.h = f7;
                if (f7 > 3.0f) {
                    this.f24105f = false;
                }
            } else {
                float f10 = this.h - 0.016f;
                this.h = f10;
                if (f10 < 1.0f) {
                    this.f24105f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        i0.r(this.f24111k0);
        this.f24111k0 = null;
        int i10 = t6.Ci;
        setRatingPaintColorKey(i10);
        this.L = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        b1 b1Var = this.I;
        f6 f6Var = this.f24117w;
        f6 f6Var2 = this.N;
        if (i11 == i12) {
            long j10 = tl_starsRating2.stars;
            if (j10 <= 0) {
                this.f24097a = 0.0f;
                f6Var2.setText("");
                f6Var.setText(cd.L0(2131745191, null));
                setRatingPaintColorKey(t6.kk);
                this.L = true;
                z10 = false;
            } else {
                z10 = false;
                long j11 = tl_starsRating2.next_level_stars;
                if (j11 == 0) {
                    this.f24097a = 1.0f;
                    f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(i12 - 1)));
                    f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j12 = tl_starsRating2.current_level_stars;
                    this.f24097a = u.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                    f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating2.level)));
                    f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.T = true;
            boolean z11 = z10;
            this.U = z11;
            this.V = z11;
            this.f24098a0 = this.f24113n;
            b1Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
        } else if (i12 > i11) {
            if (tl_starsRating.stars <= 0) {
                this.L = true;
            }
            this.f24097a = 1.0f;
            this.T = true;
            this.U = false;
            this.V = true;
            this.f24098a0 = this.f24113n;
            b1Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = f6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            f6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(grVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable = new Runnable(this) {
                public final LimitPreviewView f11253b;

                {
                    this.f11253b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f11253b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f11253b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f24111k0 = runnable;
            i0.h3(runnable, 600L);
        } else if (i12 < i11) {
            setRatingPaintColorKey(i10);
            this.L = false;
            if (tl_starsRating.stars <= 0) {
                this.L = true;
            }
            this.f24097a = 0.0f;
            this.T = true;
            this.U = false;
            this.V = true;
            this.f24098a0 = this.f24113n;
            b1Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = f6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            gr grVar2 = gr.h;
            duration2.setInterpolator(grVar2).start();
            f6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(grVar2).start();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) {
                public final LimitPreviewView f11253b;

                {
                    this.f11253b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f11253b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f11253b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f24111k0 = runnable2;
            i0.h3(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i10;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.boosts;
        f6 f6Var = this.N;
        f6 f6Var2 = this.f24117w;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f24097a = 1.0f;
            f6Var.setText(cd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            f6Var2.setText(cd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f24097a = u.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            f6Var.setText(cd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
            f6Var2.setText(cd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) f6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24118x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(false);
        setDefaultTextColor(true);
        i(tL_premium_boostsStatus.boosts, false);
        this.P = true;
    }

    public final void h(int i10, int i11) {
        String E;
        String E2;
        if (i10 < 0) {
            i(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new dq(this.f24115r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        if (i10 > 1200) {
            E = cd.S(null, i10);
        } else {
            E = cd.E(i10, ',');
        }
        spannableStringBuilder.append((CharSequence) E);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        if (i11 > 1200) {
            E2 = cd.S(null, i11);
        } else {
            E2 = cd.E(i11, ',');
        }
        spannableStringBuilder.append((CharSequence) E2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.u(170, 2, false), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        v vVar = this.e;
        vVar.b(spannableStringBuilder, false);
        vVar.requestLayout();
    }

    public final void i(int i10, boolean z10) {
        dq dqVar;
        if (i10 < 0) {
            dqVar = new dq(2131232845, 0);
        } else {
            dqVar = new dq(this.f24115r, 0);
            float f7 = this.f24116s;
            dqVar.H = f7;
            dqVar.I = f7;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(dqVar, 0, 1, 0);
        if (i10 >= 0 || !this.f24108h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) cd.E(i10, ','));
        }
        v vVar = this.e;
        vVar.b(spannableStringBuilder, z10);
        vVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j10, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.M = true;
        setRatingPaintColorKey(t6.Ci);
        this.f24097a = i0.z1((float) j10, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
        this.N.setText(cd.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = cd.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        f6 f6Var = this.f24117w;
        f6Var.setText(H);
        ((FrameLayout.LayoutParams) f6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24118x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(this.L);
        setDefaultTextColor(true);
        i((int) j10, false);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        final float f14;
        float measuredWidth;
        float f15;
        boolean z12;
        int i14;
        float f16;
        boolean z13;
        TextPaint textPaint;
        int i15;
        int i16;
        int i17;
        int L;
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z14 = this.W;
        v vVar = this.e;
        if (!z14 && !this.T && (this.d || vVar == null || !this.H || this.J)) {
            if (this.P) {
                if (!this.U && !this.V) {
                    vVar.setAlpha(1.0f);
                    vVar.setScaleX(1.0f);
                    vVar.setScaleY(1.0f);
                    return;
                }
                return;
            } else if (this.J) {
                float measuredWidth2 = (((getMeasuredWidth() - (L * 2)) * 0.5f) + i0.L(14.0f)) - (vVar.getMeasuredWidth() / 2.0f);
                boolean z15 = this.d;
                if (!z15 && this.H) {
                    this.d = true;
                    vVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
                } else if (!z15) {
                    vVar.setAlpha(0.0f);
                    vVar.setScaleX(0.0f);
                    vVar.setScaleY(0.0f);
                } else {
                    vVar.setAlpha(1.0f);
                    vVar.setScaleX(1.0f);
                    vVar.setScaleY(1.0f);
                }
                vVar.setTranslationX(measuredWidth2);
                return;
            } else if (vVar != null) {
                vVar.setAlpha(0.0f);
                return;
            } else {
                return;
            }
        }
        int L2 = i0.L(14.0f);
        int i18 = 0;
        if (!this.T && !this.W) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.W = false;
        this.T = false;
        if (z11) {
            f7 = vVar.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        float f17 = L2;
        int i19 = L2 * 2;
        float max = (Math.max(this.f24113n, (getMeasuredWidth() - i19) * this.f24119y) + f17) - (vVar.getMeasuredWidth() / 2.0f);
        if (this.Q) {
            float f18 = vVar.f11285s;
            measuredWidth = Utilities.i(max, (getMeasuredWidth() - L2) - vVar.getMeasuredWidth(), f17);
            int i20 = this.f24113n;
            if (i20 <= 0) {
                f14 = measuredWidth;
                f12 = f18;
                f13 = 0.0f;
            } else if (i20 >= getMeasuredWidth() - i19) {
                f10 = f18;
                f14 = measuredWidth;
                f12 = f10;
                f13 = 1.0f;
            } else {
                f13 = Utilities.i((this.f24113n - (measuredWidth - f17)) / vVar.getMeasuredWidth(), 1.0f, 0.0f);
                f14 = measuredWidth;
                f12 = f18;
            }
        } else {
            if (max < f17) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f17 = max;
                f10 = 0.5f;
                f11 = 0.5f;
            }
            if (f17 > (getMeasuredWidth() - L2) - vVar.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - L2) - vVar.getMeasuredWidth();
                f14 = measuredWidth;
                f12 = f10;
                f13 = 1.0f;
            } else {
                f12 = f10;
                f13 = f11;
                f14 = f17;
            }
        }
        final boolean z16 = this.U;
        final boolean z17 = this.V;
        if (!z16 && !z17) {
            vVar.setAlpha(1.0f);
        }
        vVar.setTranslationX(f7);
        vVar.setPivotX(vVar.getMeasuredWidth() / 2.0f);
        vVar.setPivotY(vVar.getMeasuredHeight());
        if (!z11) {
            vVar.setScaleX(0.0f);
            vVar.setScaleY(0.0f);
            TextPaint textPaint2 = vVar.f11281c;
            ArrayList arrayList = vVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = vVar.D;
            if (limitPreviewView.P && limitPreviewView.f24099b == 0) {
                f15 = f12;
                z12 = z11;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vVar.f11282f);
                int i21 = 0;
                boolean z18 = true;
                while (i21 < vVar.f11282f.length()) {
                    if (Character.isDigit(vVar.f11282f.charAt(i21))) {
                        kg.u uVar = new kg.u();
                        arrayList.add(uVar);
                        f16 = f12;
                        uVar.e = vVar.d.getSecondaryHorizontal(i21);
                        uVar.d = z18;
                        if (i18 >= 1) {
                            z18 = !z18;
                            i18 = 0;
                        }
                        i18++;
                        int charAt = vVar.f11282f.charAt(i21) - '0';
                        if (charAt == 0) {
                            i15 = 10;
                        } else {
                            i15 = charAt;
                        }
                        z13 = z11;
                        int i22 = 1;
                        while (i22 <= i15) {
                            int i23 = i15;
                            if (i22 == 10) {
                                i17 = i22;
                                i16 = 0;
                            } else {
                                i16 = i22;
                                i17 = i16;
                            }
                            uVar.f11273b.add(new StaticLayout(a.i(i16, ""), textPaint2, (int) vVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i22 = i17 + 1;
                            i15 = i23;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new wy(false), i21, i21 + 1, 0);
                    } else {
                        f16 = f12;
                        z13 = z11;
                        textPaint = textPaint2;
                    }
                    i21++;
                    textPaint2 = textPaint;
                    f12 = f16;
                    z11 = z13;
                }
                f15 = f12;
                z12 = z11;
                vVar.f11283n = new StaticLayout(spannableStringBuilder, textPaint2, i0.L(12.0f) + ((int) vVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    vVar.f11284r = true;
                    kg.u uVar2 = (kg.u) arrayList.get(i24);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    uVar2.f11275f = ofFloat;
                    ofFloat.addUpdateListener(new s(vVar, uVar2, 1));
                    uVar2.f11275f.addListener(new t(vVar, uVar2, 0));
                    uVar2.f11275f.setInterpolator(gr.f26496g);
                    uVar2.f11275f.setDuration(750L);
                    uVar2.f11275f.setStartDelay(((arrayList.size() - 1) - i24) * 60);
                    uVar2.f11275f.start();
                }
            }
            i14 = 2;
        } else {
            f15 = f12;
            z12 = z11;
            i14 = 2;
        }
        float[] fArr = new float[i14];
        
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
        this.f24109i0 = ofFloat2;
        final float f19 = this.f24113n;
        if (z12) {
            this.f24113n = this.f24098a0;
        }
        final boolean z19 = !this.f24110j0;
        this.f24110j0 = true;
        final float f20 = f13;
        final float f21 = f7;
        final float f22 = f15;
        final boolean z20 = z12;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                v vVar2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z19) {
                    if (!limitPreviewView2.G) {
                        limitPreviewView2.G = true;
                        try {
                            vVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    vVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.f24100b0);
                } else if (!limitPreviewView2.f24110j0) {
                    vVar2.setRotation(limitPreviewView2.f24100b0);
                }
                if (valueAnimator == limitPreviewView2.f24109i0) {
                    vVar2.setTranslationX(org.telegram.messenger.i0.T1(f21, f14, min));
                    float T1 = org.telegram.messenger.i0.T1(f22, f20, min);
                    if (vVar2.f11285s != T1) {
                        vVar2.f11285s = T1;
                        vVar2.f11286w = true;
                        vVar2.invalidate();
                    }
                    vVar2.setPivotX(vVar2.getMeasuredWidth() * T1);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (!z20) {
                    vVar2.setScaleX(min2);
                    vVar2.setScaleY(min2);
                } else {
                    limitPreviewView2.f24113n = (int) org.telegram.messenger.i0.T1(limitPreviewView2.f24098a0, f19, min);
                    limitPreviewView2.I.invalidate();
                }
                if (z16) {
                    vVar2.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, floatValue));
                    vVar2.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, floatValue));
                    vVar2.setAlpha(floatValue);
                } else if (z17) {
                    float f23 = 1.0f - floatValue;
                    vVar2.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, f23));
                    vVar2.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, f23));
                    vVar2.setAlpha(f23);
                }
            }
        });
        this.f24109i0.addListener(new m(2, this, z19));
        this.f24109i0.setInterpolator(new OvershootInterpolator());
        if (this.W) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new k(this, 9));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.f24109i0.setDuration(600L);
        } else if (z17) {
            this.f24109i0.setInterpolator(gr.f26497i);
            this.f24109i0.setDuration(320L);
        } else if (z16) {
            this.f24109i0.setInterpolator(gr.h);
            this.f24109i0.setDuration(500L);
        } else {
            this.f24109i0.setDuration(1000L);
            this.f24109i0.setStartDelay(200L);
        }
        this.f24109i0.start();
        this.d = true;
    }

    public void setBagePosition(float f7) {
        this.f24119y = u.a(f7, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(w wVar) {
        this.f24104e0 = wVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f24108h0 = z10;
    }

    public void setIconScale(float f7) {
        this.f24116s = f7;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.D = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.L = false;
        setRatingPaintColorKey(t6.Ci);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        f6 f6Var = this.N;
        f6 f6Var2 = this.f24117w;
        if (i10 <= 0) {
            this.f24097a = 0.5f;
            f6Var.setText("");
            f6Var2.setText(cd.L0(2131745191, null));
            setRatingPaintColorKey(t6.kk);
            this.L = true;
        } else {
            long j12 = tl_starsRating.next_level_stars;
            if (j12 == 0) {
                this.f24097a = 1.0f;
                f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level - 1)));
                f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f24097a = u.a(((float) (j11 - j10)) / ((float) (j12 - j10)), 0.0f, 1.0f);
                f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
                f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) f6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24118x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(this.L);
        setDefaultTextColor(true);
        h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    public void setStaticGradinet(k1 k1Var) {
        this.E = k1Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.f24099b == i10) {
            z10 = false;
        }
        this.f24099b = i10;
        this.f24097a = u.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.f24098a0 = this.f24113n;
            this.I.requestLayout();
            requestLayout();
        }
        f6 f6Var = this.f24117w;
        ((FrameLayout.LayoutParams) f6Var.getLayoutParams()).gravity = 5;
        this.f24118x.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        f6Var.setText("" + i11);
        i(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        String str;
        f6 f6Var = this.f24117w;
        int i11 = this.f24115r;
        v vVar = this.e;
        if (i10 == 6) {
            if (vVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new dq(i11, 0), 0, 1, 0);
                if (d20.i(d20.f15147s0).q()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                vVar.b(spannableStringBuilder, false);
            }
            f6Var.setText("4 GB");
        } else if (i10 == 11) {
            if (vVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new dq(i11, 0), 0, 1, 0);
                vVar.b(spannableStringBuilder2, false);
            }
            f6Var.setText("");
        }
    }

    @Override
    public final void updateColors() {
        f6 f6Var;
        f6 f6Var2;
        p6 p6Var = this.S;
        try {
            if (this.f24114n0 && (f6Var2 = this.N) != null) {
                f6Var2.setTextColor(t6.w0(t6.G6, p6Var));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            if (this.f24112l0 && (f6Var = this.f24117w) != null) {
                f6Var.setTextColor(t6.w0(t6.G6, p6Var));
            }
            int i10 = this.m0;
            if (i10 >= 0) {
                this.K.setColor(t6.w0(i10, p6Var));
                b1 b1Var = this.I;
                if (b1Var != null) {
                    b1Var.invalidate();
                }
                v vVar = this.e;
                if (vVar != null) {
                    vVar.invalidate();
                }
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, p6 p6Var) {
        super(context);
        this.f24116s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.f24103d0 = true;
        this.m0 = -1;
        this.S = p6Var;
        this.f24097a = u.a(f7, 0.1f, 0.9f);
        this.f24115r = i10;
        this.f24099b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, i0.L(16.0f), 0, 0);
            v vVar = new v(this, context);
            this.e = vVar;
            i(i11, false);
            vVar.setPadding(i0.L(19.0f), i0.L(6.0f), i0.L(19.0f), i0.L(14.0f));
            addView(vVar, b6.p(-2, -2, 0.0f, 3));
        }
        x xVar = new x(this, context, true);
        this.f24106f0 = xVar;
        f6 f6Var = new f6(context, false, false, false);
        this.N = f6Var;
        f6Var.setTextSize(i0.L(14.0f));
        f6Var.setTypeface(i0.o());
        f6Var.setText(cd.L0(2131748991, null));
        f6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.f24118x = textView;
        textView.setTypeface(i0.o());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        a7.V(textView, t6.G6, p6Var);
        if (cd.X) {
            xVar.addView(f6Var, b6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            xVar.addView(textView, b6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            xVar.addView(f6Var, b6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            xVar.addView(textView, b6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        x xVar2 = new x(this, context, false);
        this.f24107g0 = xVar2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(i0.o());
        textView2.setText(cd.L0(2131748989, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        f6 f6Var2 = new f6(context, false, false, false);
        this.f24117w = f6Var2;
        f6Var2.setTextSize(i0.L(14.0f));
        f6Var2.setTypeface(i0.o());
        f6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        f6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (cd.X) {
            xVar2.addView(textView2, b6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            xVar2.addView(f6Var2, b6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            xVar2.addView(textView2, b6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            xVar2.addView(f6Var2, b6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        b1 b1Var = new b1(this, context, p6Var);
        this.I = b1Var;
        b1Var.addView(xVar, b6.c(30.0f, -1));
        b1Var.addView(xVar2, b6.c(30.0f, -1));
        addView(b1Var, b6.q(-1, 30, 0.0f, 0, 14, i10 != 0 ? 12 : 0, 14, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
