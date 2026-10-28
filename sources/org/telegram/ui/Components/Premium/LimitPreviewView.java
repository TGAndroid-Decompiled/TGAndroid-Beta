package org.telegram.ui.Components.Premium;

import a8.ee;
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
import bi.j5;
import fi.e4;
import ic.a;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.zq;
import org.telegram.ui.s40;
import tg.a1;
import tg.p;
import tg.q;
import tg.r;
import tg.s;
import tg.t;
public class LimitPreviewView extends LinearLayout implements p6 {
    public static final int f26218o0 = 0;
    public a1 E;
    public int F;
    public boolean G;
    public boolean H;
    public final j5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final s6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final u6 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f26219a;
    public int f26220a0;
    public int f26221b;
    public float f26222b0;
    public int f26223c;
    public boolean f26224c0;
    public boolean d;
    public boolean f26225d0;
    public final s e;
    public t f26226e0;
    public boolean f26227f;
    public final hh0 f26228f0;
    public final hh0 f26229g0;
    public float h;
    public boolean f26230h0;
    public ValueAnimator f26231i0;
    public boolean f26232j0;
    public Runnable f26233k0;
    public boolean f26234l0;
    public int m0;
    public int f26235n;
    public boolean f26236n0;
    public final int f26237r;
    public float f26238s;
    public final s6 v;
    public final TextView f26239w;
    public float f26240x;
    public ViewGroup f26241y;

    public LimitPreviewView(Context context, int i10, int i11, u6 u6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, u6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        s sVar = limitPreviewView.e;
        s6 s6Var = limitPreviewView.v;
        s6 s6Var2 = limitPreviewView.N;
        limitPreviewView.f26233k0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f26231i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.L = false;
        limitPreviewView.setRatingPaintColorKey(y6.Oh);
        long j10 = tl_starsRating.stars;
        if (j10 <= 0) {
            limitPreviewView.f26219a = 0.5f;
            s6Var2.setText("");
            s6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            limitPreviewView.setRatingPaintColorKey(y6.wj);
            limitPreviewView.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                limitPreviewView.f26219a = 1.0f;
                s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j12 = tl_starsRating.current_level_stars;
                limitPreviewView.f26219a = ee.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        limitPreviewView.setArrowX(1.0f);
        sVar.setScaleX(0.6f);
        sVar.setScaleY(0.6f);
        sVar.setAlpha(0.0f);
        limitPreviewView.T = true;
        limitPreviewView.U = true;
        limitPreviewView.V = false;
        limitPreviewView.f26220a0 = limitPreviewView.f26235n;
        limitPreviewView.I.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration = s6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        ds dsVar = ds.h;
        duration.setInterpolator(dsVar).start();
        s6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(dsVar).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.L);
        limitPreviewView.setDefaultTextColor(true);
        limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        s sVar = limitPreviewView.e;
        s6 s6Var = limitPreviewView.v;
        s6 s6Var2 = limitPreviewView.N;
        limitPreviewView.f26233k0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f26231i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.L = false;
        limitPreviewView.setRatingPaintColorKey(y6.Oh);
        long j10 = tl_starsRating.stars;
        if (j10 <= 0) {
            limitPreviewView.f26219a = 0.0f;
            s6Var2.setText("");
            s6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            limitPreviewView.setRatingPaintColorKey(y6.wj);
            limitPreviewView.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                limitPreviewView.f26219a = 1.0f;
                s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j12 = tl_starsRating.current_level_stars;
                limitPreviewView.f26219a = ee.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        limitPreviewView.setArrowX(0.0f);
        sVar.setScaleX(0.6f);
        sVar.setScaleY(0.6f);
        sVar.setAlpha(0.0f);
        limitPreviewView.T = true;
        limitPreviewView.U = true;
        limitPreviewView.V = false;
        limitPreviewView.f26220a0 = limitPreviewView.f26235n;
        limitPreviewView.I.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration = s6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        ds dsVar = ds.h;
        duration.setInterpolator(dsVar).start();
        s6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(dsVar).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.L);
        limitPreviewView.setDefaultTextColor(true);
        limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f7) {
        int i10;
        int dp;
        if (f7 >= 1.0f) {
            i10 = this.I.getMeasuredWidth();
        } else {
            i10 = 0;
        }
        this.f26235n = i10;
        float dp2 = AndroidUtilities.dp(14.0f);
        s sVar = this.e;
        sVar.setTranslationX(Utilities.clamp((Math.max(this.f26235n, (getMeasuredWidth() - (dp * 2)) * f7) + dp2) - (sVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - dp) - sVar.getMeasuredWidth(), dp2));
        if (sVar.f49074s != f7) {
            sVar.f49074s = f7;
            sVar.v = true;
            sVar.invalidate();
        }
        sVar.setPivotX(sVar.getMeasuredWidth() * f7);
    }

    public void setDefaultTextColor(boolean z10) {
        int w02;
        this.f26236n0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = y6.w0(y6.G6, this.S);
        }
        this.N.setTextColor(w02);
    }

    public void setPremiumCountColor(boolean z10) {
        int w02;
        this.f26234l0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = y6.w0(y6.G6, this.S);
        }
        this.v.setTextColor(w02);
    }

    private void setRatingPaintColorKey(int i10) {
        this.m0 = i10;
        this.K.setColor(y6.w0(i10, this.S));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.E == null) {
            if (this.f26227f) {
                float f7 = this.h + 0.016f;
                this.h = f7;
                if (f7 > 3.0f) {
                    this.f26227f = false;
                }
            } else {
                float f10 = this.h - 0.016f;
                this.h = f10;
                if (f10 < 1.0f) {
                    this.f26227f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AndroidUtilities.cancelRunOnUIThread(this.f26233k0);
        this.f26233k0 = null;
        int i10 = y6.Oh;
        setRatingPaintColorKey(i10);
        this.L = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        j5 j5Var = this.I;
        s6 s6Var = this.v;
        s6 s6Var2 = this.N;
        if (i11 == i12) {
            long j10 = tl_starsRating2.stars;
            if (j10 <= 0) {
                this.f26219a = 0.0f;
                s6Var2.setText("");
                s6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                setRatingPaintColorKey(y6.wj);
                this.L = true;
                z12 = false;
            } else {
                z12 = false;
                long j11 = tl_starsRating2.next_level_stars;
                if (j11 == 0) {
                    this.f26219a = 1.0f;
                    s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i12 - 1)));
                    s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j12 = tl_starsRating2.current_level_stars;
                    this.f26219a = ee.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                    z13 = true;
                    s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level + 1)));
                    this.T = z13;
                    boolean z14 = z12;
                    this.U = z14;
                    this.V = z14;
                    this.f26220a0 = this.f26235n;
                    j5Var.requestLayout();
                    requestLayout();
                    setPremiumCountColor(this.L);
                    setDefaultTextColor(z13);
                    h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
                }
            }
            z13 = true;
            this.T = z13;
            boolean z142 = z12;
            this.U = z142;
            this.V = z142;
            this.f26220a0 = this.f26235n;
            j5Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(z13);
            h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
        } else if (i12 > i11) {
            if (tl_starsRating.stars <= 0) {
                z11 = true;
                this.L = true;
            } else {
                z11 = true;
            }
            this.f26219a = 1.0f;
            this.T = z11;
            this.U = false;
            this.V = z11;
            this.f26220a0 = this.f26235n;
            j5Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(z11);
            ViewPropertyAnimator duration = s6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).start();
            s6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(dsVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable = new Runnable(this) {
                public final LimitPreviewView f49006b;

                {
                    this.f49006b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f49006b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f49006b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f26233k0 = runnable;
            AndroidUtilities.runOnUIThread(runnable, 600L);
        } else if (i12 < i11) {
            setRatingPaintColorKey(i10);
            this.L = false;
            if (tl_starsRating.stars <= 0) {
                z10 = true;
                this.L = true;
            } else {
                z10 = true;
            }
            this.f26219a = 0.0f;
            this.T = z10;
            this.U = false;
            this.V = z10;
            this.f26220a0 = this.f26235n;
            j5Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = s6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            ds dsVar2 = ds.h;
            duration2.setInterpolator(dsVar2).start();
            s6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(dsVar2).start();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) {
                public final LimitPreviewView f49006b;

                {
                    this.f49006b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f49006b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f49006b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f26233k0 = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i10;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.boosts;
        s6 s6Var = this.N;
        s6 s6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f26219a = 1.0f;
            s6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            s6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f26219a = ee.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            s6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            s6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) s6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f26239w.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(false);
        setDefaultTextColor(true);
        i(tL_premium_boostsStatus.boosts, false);
        this.P = true;
    }

    public final void h(int i10, int i11) {
        String formatNumber;
        String formatNumber2;
        if (i10 < 0) {
            i(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new zq(this.f26237r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        if (i10 > 1200) {
            formatNumber = LocaleController.formatShortNumber(i10, null);
        } else {
            formatNumber = LocaleController.formatNumber(i10, ',');
        }
        spannableStringBuilder.append((CharSequence) formatNumber);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        if (i11 > 1200) {
            formatNumber2 = LocaleController.formatShortNumber(i11, null);
        } else {
            formatNumber2 = LocaleController.formatNumber(i11, ',');
        }
        spannableStringBuilder.append((CharSequence) formatNumber2);
        spannableStringBuilder.setSpan(new tu(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s sVar = this.e;
        sVar.f49071f = spannableStringBuilder;
        sVar.requestLayout();
    }

    public final void i(int i10, boolean z10) {
        zq zqVar;
        char c10;
        int i11;
        int i12 = 0;
        if (i10 < 0) {
            zqVar = new zq(R.drawable.warning_sign, 0);
        } else {
            zqVar = new zq(this.f26237r, 0);
            float f7 = this.f26238s;
            zqVar.setScale(f7, f7);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r6 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(zqVar, 0, 1, 0);
        if (i10 >= 0 || !this.f26230h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        s sVar = this.e;
        if (!z10) {
            sVar.f49071f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = sVar.f49071f;
            sVar.f49071f = spannableStringBuilder;
            TextPaint textPaint = sVar.f49070c;
            ArrayList arrayList = sVar.h;
            if (sVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sVar.f49071f);
                int length = sVar.f49071f.length() - 1;
                int i13 = 0;
                while (length >= 0) {
                    if (length < spannableStringBuilder2.length()) {
                        c10 = spannableStringBuilder2.charAt(length);
                    } else {
                        c10 = ' ';
                    }
                    if (c10 != sVar.f49071f.charAt(length) && Character.isDigit(sVar.f49071f.charAt(length))) {
                        r rVar = new r();
                        arrayList.add(rVar);
                        rVar.e = sVar.d.getSecondaryHorizontal(length);
                        rVar.f49052a = r6;
                        if (i13 >= r6) {
                            i13 = i12;
                        }
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + c10, textPaint, (int) sVar.e, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = rVar.f49053b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + sVar.f49071f.charAt(i11), textPaint, (int) sVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new tz(0), i11, i11 + 1, 0);
                        i13++;
                    } else {
                        i11 = length;
                    }
                    length = i11 - 1;
                    i12 = 0;
                    r6 = 1;
                }
                sVar.f49072n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    sVar.f49073r = true;
                    r rVar2 = (r) arrayList.get(i14);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f49055f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 0));
                    rVar2.f49055f.addListener(new q(sVar, rVar2, 1));
                    rVar2.f49055f.setInterpolator(ds.f27531g);
                    rVar2.f49055f.setDuration(250L);
                    rVar2.f49055f.setStartDelay(((arrayList.size() - 1) - i14) * 60);
                    rVar2.f49055f.start();
                }
            }
        }
        sVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j10, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.M = true;
        setRatingPaintColorKey(y6.Oh);
        this.f26219a = AndroidUtilities.ilerp((float) j10, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
        this.N.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String formatPluralStringComma = LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        s6 s6Var = this.v;
        s6Var.setText(formatPluralStringComma);
        ((FrameLayout.LayoutParams) s6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.f26239w.setVisibility(8);
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
        int dp;
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z14 = this.W;
        s sVar = this.e;
        if (!z14 && !this.T && (this.d || sVar == null || !this.H || this.J)) {
            if (this.P) {
                if (!this.U && !this.V) {
                    sVar.setAlpha(1.0f);
                    sVar.setScaleX(1.0f);
                    sVar.setScaleY(1.0f);
                    return;
                }
                return;
            } else if (this.J) {
                float measuredWidth2 = (((getMeasuredWidth() - (dp * 2)) * 0.5f) + AndroidUtilities.dp(14.0f)) - (sVar.getMeasuredWidth() / 2.0f);
                boolean z15 = this.d;
                if (!z15 && this.H) {
                    this.d = true;
                    sVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
                } else if (!z15) {
                    sVar.setAlpha(0.0f);
                    sVar.setScaleX(0.0f);
                    sVar.setScaleY(0.0f);
                } else {
                    sVar.setAlpha(1.0f);
                    sVar.setScaleX(1.0f);
                    sVar.setScaleY(1.0f);
                }
                sVar.setTranslationX(measuredWidth2);
                return;
            } else if (sVar != null) {
                sVar.setAlpha(0.0f);
                return;
            } else {
                return;
            }
        }
        int dp2 = AndroidUtilities.dp(14.0f);
        int i18 = 0;
        if (!this.T && !this.W) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.W = false;
        this.T = false;
        if (z11) {
            f7 = sVar.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        float f17 = dp2;
        int i19 = dp2 * 2;
        float max = (Math.max(this.f26235n, (getMeasuredWidth() - i19) * this.f26240x) + f17) - (sVar.getMeasuredWidth() / 2.0f);
        if (this.Q) {
            float f18 = sVar.f49074s;
            measuredWidth = Utilities.clamp(max, (getMeasuredWidth() - dp2) - sVar.getMeasuredWidth(), f17);
            int i20 = this.f26235n;
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
                f13 = Utilities.clamp((this.f26235n - (measuredWidth - f17)) / sVar.getMeasuredWidth(), 1.0f, 0.0f);
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
            if (f17 > (getMeasuredWidth() - dp2) - sVar.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - dp2) - sVar.getMeasuredWidth();
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
            sVar.setAlpha(1.0f);
        }
        sVar.setTranslationX(f7);
        sVar.setPivotX(sVar.getMeasuredWidth() / 2.0f);
        sVar.setPivotY(sVar.getMeasuredHeight());
        if (!z11) {
            sVar.setScaleX(0.0f);
            sVar.setScaleY(0.0f);
            TextPaint textPaint2 = sVar.f49070c;
            ArrayList arrayList = sVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = sVar.f49077y;
            if (limitPreviewView.P && limitPreviewView.f26221b == 0) {
                f15 = f12;
                z12 = z11;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f49071f);
                int i21 = 0;
                boolean z18 = true;
                while (i21 < sVar.f49071f.length()) {
                    if (Character.isDigit(sVar.f49071f.charAt(i21))) {
                        r rVar = new r();
                        arrayList.add(rVar);
                        f16 = f12;
                        rVar.e = sVar.d.getSecondaryHorizontal(i21);
                        rVar.d = z18;
                        if (i18 >= 1) {
                            z18 = !z18;
                            i18 = 0;
                        }
                        i18++;
                        int charAt = sVar.f49071f.charAt(i21) - '0';
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
                            rVar.f49053b.add(new StaticLayout(a.i(i16, ""), textPaint2, (int) sVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i22 = i17 + 1;
                            i15 = i23;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new tz(0), i21, i21 + 1, 0);
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
                sVar.f49072n = new StaticLayout(spannableStringBuilder, textPaint2, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    sVar.f49073r = true;
                    r rVar2 = (r) arrayList.get(i24);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f49055f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 1));
                    rVar2.f49055f.addListener(new q(sVar, rVar2, 0));
                    rVar2.f49055f.setInterpolator(ds.f27531g);
                    rVar2.f49055f.setDuration(750L);
                    rVar2.f49055f.setStartDelay(((arrayList.size() - 1) - i24) * 60);
                    rVar2.f49055f.start();
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
        this.f26231i0 = ofFloat2;
        final float f19 = this.f26235n;
        if (z12) {
            this.f26235n = this.f26220a0;
        }
        final boolean z19 = !this.f26232j0;
        this.f26232j0 = true;
        final float f20 = f13;
        final float f21 = f7;
        final float f22 = f15;
        final boolean z20 = z12;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                s sVar2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z19) {
                    if (!limitPreviewView2.G) {
                        limitPreviewView2.G = true;
                        try {
                            sVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    sVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.f26222b0);
                } else if (!limitPreviewView2.f26232j0) {
                    sVar2.setRotation(limitPreviewView2.f26222b0);
                }
                if (valueAnimator == limitPreviewView2.f26231i0) {
                    sVar2.setTranslationX(AndroidUtilities.lerp(f21, f14, min));
                    float lerp = AndroidUtilities.lerp(f22, f20, min);
                    if (sVar2.f49074s != lerp) {
                        sVar2.f49074s = lerp;
                        sVar2.v = true;
                        sVar2.invalidate();
                    }
                    sVar2.setPivotX(sVar2.getMeasuredWidth() * lerp);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (!z20) {
                    sVar2.setScaleX(min2);
                    sVar2.setScaleY(min2);
                } else {
                    limitPreviewView2.f26235n = (int) AndroidUtilities.lerp(limitPreviewView2.f26220a0, f19, min);
                    limitPreviewView2.I.invalidate();
                }
                if (z16) {
                    sVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    sVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    sVar2.setAlpha(floatValue);
                } else if (z17) {
                    float f23 = 1.0f - floatValue;
                    sVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                    sVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                    sVar2.setAlpha(f23);
                }
            }
        });
        this.f26231i0.addListener(new s40(16, this, z19));
        this.f26231i0.setInterpolator(new OvershootInterpolator());
        if (this.W) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new e4(this, 25));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.f26231i0.setDuration(600L);
        } else if (z17) {
            this.f26231i0.setInterpolator(ds.f27532i);
            this.f26231i0.setDuration(320L);
        } else if (z16) {
            this.f26231i0.setInterpolator(ds.h);
            this.f26231i0.setDuration(500L);
        } else {
            this.f26231i0.setDuration(1000L);
            this.f26231i0.setStartDelay(200L);
        }
        this.f26231i0.start();
        this.d = true;
    }

    public void setBagePosition(float f7) {
        this.f26240x = ee.a(f7, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(t tVar) {
        this.f26226e0 = tVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f26230h0 = z10;
    }

    public void setIconScale(float f7) {
        this.f26238s = f7;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f26241y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.L = false;
        setRatingPaintColorKey(y6.Oh);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        s6 s6Var = this.N;
        s6 s6Var2 = this.v;
        if (i10 <= 0) {
            this.f26219a = 0.5f;
            s6Var.setText("");
            s6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            setRatingPaintColorKey(y6.wj);
            this.L = true;
        } else {
            long j12 = tl_starsRating.next_level_stars;
            if (j12 == 0) {
                this.f26219a = 1.0f;
                s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f26219a = ee.a(((float) (j11 - j10)) / ((float) (j12 - j10)), 0.0f, 1.0f);
                s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) s6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f26239w.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(this.L);
        setDefaultTextColor(true);
        h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    public void setStaticGradinet(a1 a1Var) {
        this.E = a1Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.f26221b == i10) {
            z10 = false;
        }
        this.f26221b = i10;
        this.f26219a = ee.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.f26220a0 = this.f26235n;
            this.I.requestLayout();
            requestLayout();
        }
        s6 s6Var = this.v;
        ((FrameLayout.LayoutParams) s6Var.getLayoutParams()).gravity = 5;
        this.f26239w.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        s6Var.setText("" + i11);
        i(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        String str;
        s6 s6Var = this.v;
        int i11 = this.f26237r;
        s sVar = this.e;
        if (i10 == 6) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new zq(i11, 0), 0, 1, 0);
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                sVar.f49071f = spannableStringBuilder;
            }
            s6Var.setText("4 GB");
        } else if (i10 == 11) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new zq(i11, 0), 0, 1, 0);
                sVar.f49071f = spannableStringBuilder2;
            }
            s6Var.setText("");
        }
    }

    @Override
    public final void updateColors() {
        s6 s6Var;
        s6 s6Var2;
        u6 u6Var = this.S;
        try {
            if (this.f26236n0 && (s6Var2 = this.N) != null) {
                s6Var2.setTextColor(y6.w0(y6.G6, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            if (this.f26234l0 && (s6Var = this.v) != null) {
                s6Var.setTextColor(y6.w0(y6.G6, u6Var));
            }
            int i10 = this.m0;
            if (i10 >= 0) {
                this.K.setColor(y6.w0(i10, u6Var));
                j5 j5Var = this.I;
                if (j5Var != null) {
                    j5Var.invalidate();
                }
                s sVar = this.e;
                if (sVar != null) {
                    sVar.invalidate();
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, u6 u6Var) {
        super(context);
        this.f26238s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.f26225d0 = true;
        this.m0 = -1;
        this.S = u6Var;
        this.f26219a = ee.a(f7, 0.1f, 0.9f);
        this.f26237r = i10;
        this.f26221b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            s sVar = new s(this, context);
            this.e = sVar;
            i(i11, false);
            sVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(sVar, kb1.s(-2, -2, 0.0f, 3));
        }
        hh0 hh0Var = new hh0(this, context, true);
        this.f26228f0 = hh0Var;
        s6 s6Var = new s6(context, false, false, false);
        this.N = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setText(LocaleController.getString(R.string.LimitFree));
        s6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.f26239w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        f7.V(textView, y6.G6, u6Var);
        if (LocaleController.isRTL) {
            hh0Var.addView(s6Var, kb1.h(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            hh0Var.addView(textView, kb1.h(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            hh0Var.addView(s6Var, kb1.h(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            hh0Var.addView(textView, kb1.h(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        hh0 hh0Var2 = new hh0(this, context, false);
        this.f26229g0 = hh0Var2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        s6 s6Var2 = new s6(context, false, false, false);
        this.v = s6Var2;
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var2.setTypeface(AndroidUtilities.bold());
        s6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        s6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (LocaleController.isRTL) {
            hh0Var2.addView(textView2, kb1.h(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            hh0Var2.addView(s6Var2, kb1.h(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            hh0Var2.addView(textView2, kb1.h(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            hh0Var2.addView(s6Var2, kb1.h(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        j5 j5Var = new j5(this, context, u6Var);
        this.I = j5Var;
        j5Var.addView(hh0Var, kb1.g(30.0f, -1));
        j5Var.addView(hh0Var2, kb1.g(30.0f, -1));
        addView(j5Var, kb1.t(-1, 30, 0.0f, 0, 14, i10 != 0 ? 12 : 0, 14, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
