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
import c8.i9;
import c8.ja;
import di.k4;
import hi.q3;
import i5.c;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.t;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.my;
import org.telegram.ui.z20;
import tg.x1;
import ug.o;
import ug.p;
import ug.q;
import ug.r;
import ug.s;
import ug.z0;
public class LimitPreviewView extends LinearLayout implements z5 {
    public static final int f32626p0 = 0;
    public ViewGroup E;
    public z0 F;
    public int G;
    public boolean H;
    public boolean I;
    public final k4 J;
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
    public float f32627a;
    public boolean f32628a0;
    public int f32629b;
    public int f32630b0;
    public int f32631c;
    public float f32632c0;
    public boolean d;
    public boolean f32633d0;
    public final r f32634e;
    public boolean f32635e0;
    public boolean f32636f;
    public s f32637f0;
    public final q3 f32638g0;
    public float h;
    public final q3 f32639h0;
    public boolean f32640i0;
    public ValueAnimator f32641j0;
    public boolean f32642k0;
    public Runnable f32643l0;
    public boolean m0;
    public int f32644n;
    public int f32645n0;
    public boolean f32646o0;
    public final int f32647r;
    public float f32648s;
    public final h6 f32649w;
    public final TextView f32650x;
    public float f32651y;

    public LimitPreviewView(int i7, int i10, int i11, Context context, e6 e6Var) {
        this(context, i7, i10, i11, 0.5f, e6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        r rVar = limitPreviewView.f32634e;
        h6 h6Var = limitPreviewView.f32649w;
        h6 h6Var2 = limitPreviewView.O;
        limitPreviewView.f32643l0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f32641j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.M = false;
        limitPreviewView.setRatingPaintColorKey(j6.Fi);
        long j3 = tl_starsRating.stars;
        if (j3 <= 0) {
            limitPreviewView.f32627a = 0.5f;
            h6Var2.setText("");
            h6Var.setText(hd.M0(2131745173, null));
            limitPreviewView.setRatingPaintColorKey(j6.nk);
            limitPreviewView.M = true;
        } else {
            long j10 = tl_starsRating.next_level_stars;
            if (j10 == 0) {
                limitPreviewView.f32627a = 1.0f;
                h6Var2.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level - 1)));
                h6Var.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j11 = tl_starsRating.current_level_stars;
                z10 = false;
                limitPreviewView.f32627a = i9.a(((float) (j3 - j11)) / ((float) (j10 - j11)), 0.0f, 1.0f);
                h6Var2.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level)));
                h6Var.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level + 1)));
                limitPreviewView.setArrowX(1.0f);
                rVar.setScaleX(0.6f);
                rVar.setScaleY(0.6f);
                rVar.setAlpha(0.0f);
                limitPreviewView.U = true;
                limitPreviewView.V = true;
                limitPreviewView.W = z10;
                limitPreviewView.f32630b0 = limitPreviewView.f32644n;
                limitPreviewView.J.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                er erVar = er.h;
                duration.setInterpolator(erVar).start();
                h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar).start();
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
        limitPreviewView.f32630b0 = limitPreviewView.f32644n;
        limitPreviewView.J.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration2 = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        er erVar2 = er.h;
        duration2.setInterpolator(erVar2).start();
        h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar2).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.M);
        limitPreviewView.setDefaultTextColor(true);
        limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        float f10;
        r rVar = limitPreviewView.f32634e;
        h6 h6Var = limitPreviewView.f32649w;
        h6 h6Var2 = limitPreviewView.O;
        limitPreviewView.f32643l0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f32641j0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.M = false;
        limitPreviewView.setRatingPaintColorKey(j6.Fi);
        long j3 = tl_starsRating.stars;
        if (j3 <= 0) {
            limitPreviewView.f32627a = 0.0f;
            h6Var2.setText("");
            h6Var.setText(hd.M0(2131745173, null));
            limitPreviewView.setRatingPaintColorKey(j6.nk);
            limitPreviewView.M = true;
        } else {
            long j10 = tl_starsRating.next_level_stars;
            if (j10 == 0) {
                limitPreviewView.f32627a = 1.0f;
                h6Var2.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level - 1)));
                h6Var.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j11 = tl_starsRating.current_level_stars;
                z10 = false;
                limitPreviewView.f32627a = i9.a(((float) (j3 - j11)) / ((float) (j10 - j11)), 0.0f, 1.0f);
                h6Var2.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level)));
                h6Var.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level + 1)));
                f10 = 0.0f;
                limitPreviewView.setArrowX(f10);
                rVar.setScaleX(0.6f);
                rVar.setScaleY(0.6f);
                rVar.setAlpha(f10);
                limitPreviewView.U = true;
                limitPreviewView.V = true;
                limitPreviewView.W = z10;
                limitPreviewView.f32630b0 = limitPreviewView.f32644n;
                limitPreviewView.J.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                er erVar = er.h;
                duration.setInterpolator(erVar).start();
                h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar).start();
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
        limitPreviewView.f32630b0 = limitPreviewView.f32644n;
        limitPreviewView.J.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration2 = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        er erVar2 = er.h;
        duration2.setInterpolator(erVar2).start();
        h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar2).start();
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
        this.f32644n = i7;
        float L2 = g0.L(14.0f);
        r rVar = this.f32634e;
        rVar.setTranslationX(Utilities.i((Math.max(this.f32644n, (getMeasuredWidth() - (L * 2)) * f10) + L2) - (rVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - L) - rVar.getMeasuredWidth(), L2));
        if (rVar.f58299s != f10) {
            rVar.f58299s = f10;
            rVar.f58300w = true;
            rVar.invalidate();
        }
        rVar.setPivotX(rVar.getMeasuredWidth() * f10);
    }

    public void setDefaultTextColor(boolean z10) {
        int w02;
        this.f32646o0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = j6.w0(j6.G6, this.T);
        }
        this.O.setTextColor(w02);
    }

    public void setPremiumCountColor(boolean z10) {
        int w02;
        this.m0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = j6.w0(j6.G6, this.T);
        }
        this.f32649w.setTextColor(w02);
    }

    private void setRatingPaintColorKey(int i7) {
        this.f32645n0 = i7;
        this.L.setColor(j6.w0(i7, this.T));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.F == null) {
            if (this.f32636f) {
                float f10 = this.h + 0.016f;
                this.h = f10;
                if (f10 > 3.0f) {
                    this.f32636f = false;
                }
            } else {
                float f11 = this.h - 0.016f;
                this.h = f11;
                if (f11 < 1.0f) {
                    this.f32636f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        g0.r(this.f32643l0);
        this.f32643l0 = null;
        int i7 = j6.Fi;
        setRatingPaintColorKey(i7);
        this.M = false;
        int i10 = tl_starsRating.level;
        int i11 = tl_starsRating2.level;
        k4 k4Var = this.J;
        h6 h6Var = this.f32649w;
        h6 h6Var2 = this.O;
        if (i10 == i11) {
            long j3 = tl_starsRating2.stars;
            if (j3 <= 0) {
                this.f32627a = 0.0f;
                h6Var2.setText("");
                h6Var.setText(hd.M0(2131745173, null));
                setRatingPaintColorKey(j6.nk);
                this.M = true;
                z10 = false;
            } else {
                z10 = false;
                long j10 = tl_starsRating2.next_level_stars;
                if (j10 == 0) {
                    this.f32627a = 1.0f;
                    h6Var2.setText(hd.a0(null, null, 2131745174, Integer.valueOf(i11 - 1)));
                    h6Var.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j11 = tl_starsRating2.current_level_stars;
                    this.f32627a = i9.a(((float) (j3 - j11)) / ((float) (j10 - j11)), 0.0f, 1.0f);
                    h6Var2.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating2.level)));
                    h6Var.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.U = true;
            boolean z11 = z10;
            this.V = z11;
            this.W = z11;
            this.f32630b0 = this.f32644n;
            k4Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
        } else if (i11 > i10) {
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.f32627a = 1.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.f32630b0 = this.f32644n;
            k4Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = h6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            h6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(erVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable = new Runnable(this) {
                public final LimitPreviewView f58225b;

                {
                    this.f58225b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f58225b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f58225b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f32643l0 = runnable;
            g0.i3(runnable, 600L);
        } else if (i11 < i10) {
            setRatingPaintColorKey(i7);
            this.M = false;
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.f32627a = 0.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.f32630b0 = this.f32644n;
            k4Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = h6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            er erVar2 = er.h;
            duration2.setInterpolator(erVar2).start();
            h6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(erVar2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) {
                public final LimitPreviewView f58225b;

                {
                    this.f58225b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f58225b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f58225b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f32643l0 = runnable2;
            g0.i3(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i7;
        int i10 = tL_premium_boostsStatus.current_level_boosts;
        int i11 = tL_premium_boostsStatus.boosts;
        h6 h6Var = this.O;
        h6 h6Var2 = this.f32649w;
        if ((i10 == i11 && z10) || (i7 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f32627a = 1.0f;
            h6Var.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            h6Var2.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f32627a = i9.a((i11 - i10) / (i7 - i10), 0.0f, 1.0f);
            h6Var.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
            h6Var2.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) h6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f32650x.setVisibility(8);
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
        spannableStringBuilder.append((CharSequence) "d").setSpan(new eq(this.f32647r, 0), 0, 1, 0);
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
        r rVar = this.f32634e;
        rVar.b(spannableStringBuilder, false);
        rVar.requestLayout();
    }

    public final void i(int i7, boolean z10) {
        eq eqVar;
        if (i7 < 0) {
            eqVar = new eq(2131232848, 0);
        } else {
            eqVar = new eq(this.f32647r, 0);
            float f10 = this.f32648s;
            eqVar.I = f10;
            eqVar.J = f10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(eqVar, 0, 1, 0);
        if (i7 >= 0 || !this.f32640i0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) hd.E(i7, ','));
        }
        r rVar = this.f32634e;
        rVar.b(spannableStringBuilder, z10);
        rVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j3, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.N = true;
        setRatingPaintColorKey(j6.Fi);
        this.f32627a = g0.z1((float) j3, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
        this.O.setText(hd.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = hd.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        h6 h6Var = this.f32649w;
        h6Var.setText(H);
        ((FrameLayout.LayoutParams) h6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.f32650x.setVisibility(8);
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
        boolean z14 = this.f32628a0;
        r rVar = this.f32634e;
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
        if (!this.U && !this.f32628a0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f32628a0 = false;
        this.U = false;
        if (z11) {
            f10 = rVar.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        float f18 = L2;
        int i18 = L2 * 2;
        float max = (Math.max(this.f32644n, (getMeasuredWidth() - i18) * this.f32651y) + f18) - (rVar.getMeasuredWidth() / 2.0f);
        if (this.R) {
            float f19 = rVar.f58299s;
            measuredWidth = Utilities.i(max, (getMeasuredWidth() - L2) - rVar.getMeasuredWidth(), f18);
            int i19 = this.f32644n;
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
                f14 = Utilities.i((this.f32644n - (measuredWidth - f18)) / rVar.getMeasuredWidth(), 1.0f, 0.0f);
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
            TextPaint textPaint2 = rVar.f58294c;
            ArrayList arrayList = rVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = rVar.E;
            if (limitPreviewView.Q && limitPreviewView.f32629b == 0) {
                f16 = f13;
                z12 = z11;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rVar.f58296f);
                int i20 = 0;
                boolean z18 = true;
                while (i20 < rVar.f58296f.length()) {
                    if (Character.isDigit(rVar.f58296f.charAt(i20))) {
                        q qVar = new q();
                        arrayList.add(qVar);
                        f17 = f13;
                        qVar.f58261e = rVar.d.getSecondaryHorizontal(i20);
                        qVar.d = z18;
                        if (i17 >= 1) {
                            z18 = !z18;
                            i17 = 0;
                        }
                        i17++;
                        int charAt = rVar.f58296f.charAt(i20) - '0';
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
                            qVar.f58259b.add(new StaticLayout(c.i(i15, ""), textPaint2, (int) rVar.f58295e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i16 + 1;
                            i14 = i22;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new my(false), i20, i20 + 1, 0);
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
                rVar.f58297n = new StaticLayout(spannableStringBuilder, textPaint2, g0.L(12.0f) + ((int) rVar.f58295e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    rVar.f58298r = true;
                    q qVar2 = (q) arrayList.get(i23);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qVar2.f58262f = ofFloat;
                    ofFloat.addUpdateListener(new o(rVar, qVar2, 1));
                    qVar2.f58262f.addListener(new p(rVar, qVar2, 0));
                    qVar2.f58262f.setInterpolator(er.f34420g);
                    qVar2.f58262f.setDuration(750L);
                    qVar2.f58262f.setStartDelay(((arrayList.size() - 1) - i23) * 60);
                    qVar2.f58262f.start();
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
        this.f32641j0 = ofFloat2;
        final float f20 = this.f32644n;
        if (z12) {
            this.f32644n = this.f32630b0;
        }
        final boolean z19 = !this.f32642k0;
        this.f32642k0 = true;
        final float f21 = f14;
        final float f22 = f10;
        final float f23 = f16;
        final boolean z20 = z12;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                r rVar2 = limitPreviewView2.f32634e;
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
                    rVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.f32632c0);
                } else if (!limitPreviewView2.f32642k0) {
                    rVar2.setRotation(limitPreviewView2.f32632c0);
                }
                if (valueAnimator == limitPreviewView2.f32641j0) {
                    rVar2.setTranslationX(org.telegram.messenger.g0.T1(f22, f15, min));
                    float T1 = org.telegram.messenger.g0.T1(f23, f21, min);
                    if (rVar2.f58299s != T1) {
                        rVar2.f58299s = T1;
                        rVar2.f58300w = true;
                        rVar2.invalidate();
                    }
                    rVar2.setPivotX(rVar2.getMeasuredWidth() * T1);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (!z20) {
                    rVar2.setScaleX(min2);
                    rVar2.setScaleY(min2);
                } else {
                    limitPreviewView2.f32644n = (int) org.telegram.messenger.g0.T1(limitPreviewView2.f32630b0, f20, min);
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
        this.f32641j0.addListener(new z20(16, this, z19));
        this.f32641j0.setInterpolator(new OvershootInterpolator());
        if (this.f32628a0) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new x1(this, 2));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.f32641j0.setDuration(600L);
        } else if (z17) {
            this.f32641j0.setInterpolator(er.f34421i);
            this.f32641j0.setDuration(320L);
        } else if (z16) {
            this.f32641j0.setInterpolator(er.h);
            this.f32641j0.setDuration(500L);
        } else {
            this.f32641j0.setDuration(1000L);
            this.f32641j0.setStartDelay(200L);
        }
        this.f32641j0.start();
        this.d = true;
    }

    public void setBagePosition(float f10) {
        this.f32651y = i9.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(s sVar) {
        this.f32637f0 = sVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f32640i0 = z10;
    }

    public void setIconScale(float f10) {
        this.f32648s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.E = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.M = false;
        setRatingPaintColorKey(j6.Fi);
        long j3 = tl_starsRating.current_level_stars;
        long j10 = tl_starsRating.stars;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        h6 h6Var = this.O;
        h6 h6Var2 = this.f32649w;
        if (i7 <= 0) {
            this.f32627a = 0.5f;
            h6Var.setText("");
            h6Var2.setText(hd.M0(2131745173, null));
            setRatingPaintColorKey(j6.nk);
            this.M = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                this.f32627a = 1.0f;
                h6Var.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level - 1)));
                h6Var2.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f32627a = i9.a(((float) (j10 - j3)) / ((float) (j11 - j3)), 0.0f, 1.0f);
                h6Var.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level)));
                h6Var2.setText(hd.a0(null, null, 2131745174, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) h6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f32650x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    public void setStaticGradinet(z0 z0Var) {
        this.F = z0Var;
    }

    public void setStatus(int i7, int i10, boolean z10) {
        if (this.f32629b == i7) {
            z10 = false;
        }
        this.f32629b = i7;
        this.f32627a = i9.a(i7 / i10, 0.0f, 1.0f);
        if (z10) {
            this.f32628a0 = true;
            this.f32630b0 = this.f32644n;
            this.J.requestLayout();
            requestLayout();
        }
        h6 h6Var = this.f32649w;
        ((FrameLayout.LayoutParams) h6Var.getLayoutParams()).gravity = 5;
        this.f32650x.setVisibility(8);
        this.P.setVisibility(8);
        this.O.setText("0");
        h6Var.setText("" + i10);
        i(i7, false);
        this.Q = true;
        this.R = true;
    }

    public void setType(int i7) {
        String str;
        h6 h6Var = this.f32649w;
        int i10 = this.f32647r;
        r rVar = this.f32634e;
        if (i7 == 6) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new eq(i10, 0), 0, 1, 0);
                if (m10.i(m10.f24940t0).q()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                rVar.b(spannableStringBuilder, false);
            }
            h6Var.setText("4 GB");
        } else if (i7 == 11) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new eq(i10, 0), 0, 1, 0);
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
            if (this.f32646o0 && (h6Var2 = this.O) != null) {
                h6Var2.setTextColor(j6.w0(j6.G6, e6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            if (this.m0 && (h6Var = this.f32649w) != null) {
                h6Var.setTextColor(j6.w0(j6.G6, e6Var));
            }
            int i7 = this.f32645n0;
            if (i7 >= 0) {
                this.L.setColor(j6.w0(i7, e6Var));
                k4 k4Var = this.J;
                if (k4Var != null) {
                    k4Var.invalidate();
                }
                r rVar = this.f32634e;
                if (rVar != null) {
                    rVar.invalidate();
                }
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public LimitPreviewView(Context context, int i7, int i10, int i11, float f10, e6 e6Var) {
        super(context);
        this.f32648s = 1.0f;
        this.I = true;
        this.L = new Paint(1);
        this.f32635e0 = true;
        this.f32645n0 = -1;
        this.T = e6Var;
        this.f32627a = i9.a(f10, 0.1f, 0.9f);
        this.f32647r = i7;
        this.f32629b = i10;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i7 != 0) {
            setPadding(0, g0.L(16.0f), 0, 0);
            r rVar = new r(this, context);
            this.f32634e = rVar;
            i(i10, false);
            rVar.setPadding(g0.L(19.0f), g0.L(6.0f), g0.L(19.0f), g0.L(14.0f));
            addView(rVar, ja.p(-2, -2, 0.0f, 3));
        }
        q3 q3Var = new q3(this, context, true);
        this.f32638g0 = q3Var;
        h6 h6Var = new h6(context, false, false, false);
        this.O = h6Var;
        h6Var.setTextSize(g0.L(14.0f));
        h6Var.setTypeface(g0.o());
        h6Var.setText(hd.M0(2131748981, null));
        h6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.f32650x = textView;
        textView.setTypeface(g0.o());
        textView.setText(String.format("%d", Integer.valueOf(i11)));
        textView.setGravity(16);
        q6.U(textView, j6.G6, e6Var);
        if (hd.f24104a0) {
            q3Var.addView(h6Var, ja.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var.addView(textView, ja.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            q3Var.addView(h6Var, ja.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var.addView(textView, ja.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        q3 q3Var2 = new q3(this, context, false);
        this.f32639h0 = q3Var2;
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setTypeface(g0.o());
        textView2.setText(hd.M0(2131748979, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        h6 h6Var2 = new h6(context, false, false, false);
        this.f32649w = h6Var2;
        h6Var2.setTextSize(g0.L(14.0f));
        h6Var2.setTypeface(g0.o());
        h6Var2.setText(String.format("%d", Integer.valueOf(i11)));
        h6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (hd.f24104a0) {
            q3Var2.addView(textView2, ja.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var2.addView(h6Var2, ja.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            q3Var2.addView(textView2, ja.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var2.addView(h6Var2, ja.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        k4 k4Var = new k4(this, context, e6Var);
        this.J = k4Var;
        k4Var.addView(q3Var, ja.c(30.0f, -1));
        k4Var.addView(q3Var2, ja.c(30.0f, -1));
        addView(k4Var, ja.q(-1, 30, 0.0f, 0, 14, i7 != 0 ? 12 : 0, 14, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
