package org.telegram.ui.Components.Premium;

import ai.o5;
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
import ei.i6;
import i2.o1;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.zr;
import org.telegram.ui.o40;
import sg.a1;
import sg.p;
import sg.q;
import sg.s;
import sg.t;
import w7.r;
import w7.z5;
public class LimitPreviewView extends LinearLayout implements b6 {
    public static final int f24424o0 = 0;
    public a1 E;
    public int F;
    public boolean G;
    public boolean H;
    public final o5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final o6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final g6 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f24425a;
    public int f24426a0;
    public int f24427b;
    public float f24428b0;
    public int f24429c;
    public boolean f24430c0;
    public boolean d;
    public boolean f24431d0;
    public final s e;
    public t f24432e0;
    public boolean f24433f;
    public final gh0 f24434f0;
    public final gh0 f24435g0;
    public float h;
    public boolean f24436h0;
    public ValueAnimator f24437i0;
    public boolean f24438j0;
    public Runnable f24439k0;
    public boolean f24440l0;
    public int m0;
    public int f24441n;
    public boolean f24442n0;
    public final int f24443r;
    public float f24444s;
    public final o6 v;
    public final TextView f24445w;
    public float f24446x;
    public ViewGroup f24447y;

    public LimitPreviewView(Context context, int i10, int i11, g6 g6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, g6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        s sVar = limitPreviewView.e;
        o6 o6Var = limitPreviewView.v;
        o6 o6Var2 = limitPreviewView.N;
        limitPreviewView.f24439k0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f24437i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.L = false;
        limitPreviewView.setRatingPaintColorKey(k6.Oh);
        long j10 = tl_starsRating.stars;
        if (j10 <= 0) {
            limitPreviewView.f24425a = 0.5f;
            o6Var2.setText("");
            o6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            limitPreviewView.setRatingPaintColorKey(k6.wj);
            limitPreviewView.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                limitPreviewView.f24425a = 1.0f;
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j12 = tl_starsRating.current_level_stars;
                limitPreviewView.f24425a = r.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        limitPreviewView.setArrowX(1.0f);
        sVar.setScaleX(0.6f);
        sVar.setScaleY(0.6f);
        sVar.setAlpha(0.0f);
        limitPreviewView.T = true;
        limitPreviewView.U = true;
        limitPreviewView.V = false;
        limitPreviewView.f24426a0 = limitPreviewView.f24441n;
        limitPreviewView.I.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration = o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        zr zrVar = zr.h;
        duration.setInterpolator(zrVar).start();
        o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(zrVar).start();
        limitPreviewView.setPremiumCountColor(limitPreviewView.L);
        limitPreviewView.setDefaultTextColor(true);
        limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        s sVar = limitPreviewView.e;
        o6 o6Var = limitPreviewView.v;
        o6 o6Var2 = limitPreviewView.N;
        limitPreviewView.f24439k0 = null;
        if (!limitPreviewView.isAttachedToWindow()) {
            return;
        }
        ValueAnimator valueAnimator = limitPreviewView.f24437i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        limitPreviewView.L = false;
        limitPreviewView.setRatingPaintColorKey(k6.Oh);
        long j10 = tl_starsRating.stars;
        if (j10 <= 0) {
            limitPreviewView.f24425a = 0.0f;
            o6Var2.setText("");
            o6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            limitPreviewView.setRatingPaintColorKey(k6.wj);
            limitPreviewView.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                limitPreviewView.f24425a = 1.0f;
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                long j12 = tl_starsRating.current_level_stars;
                limitPreviewView.f24425a = r.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        limitPreviewView.setArrowX(0.0f);
        sVar.setScaleX(0.6f);
        sVar.setScaleY(0.6f);
        sVar.setAlpha(0.0f);
        limitPreviewView.T = true;
        limitPreviewView.U = true;
        limitPreviewView.V = false;
        limitPreviewView.f24426a0 = limitPreviewView.f24441n;
        limitPreviewView.I.requestLayout();
        limitPreviewView.requestLayout();
        ViewPropertyAnimator duration = o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
        zr zrVar = zr.h;
        duration.setInterpolator(zrVar).start();
        o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(zrVar).start();
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
        this.f24441n = i10;
        float dp2 = AndroidUtilities.dp(14.0f);
        s sVar = this.e;
        sVar.setTranslationX(Utilities.clamp((Math.max(this.f24441n, (getMeasuredWidth() - (dp * 2)) * f7) + dp2) - (sVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - dp) - sVar.getMeasuredWidth(), dp2));
        if (sVar.f46858s != f7) {
            sVar.f46858s = f7;
            sVar.v = true;
            sVar.invalidate();
        }
        sVar.setPivotX(sVar.getMeasuredWidth() * f7);
    }

    public void setDefaultTextColor(boolean z10) {
        int w02;
        this.f24442n0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = k6.w0(k6.G6, this.S);
        }
        this.N.setTextColor(w02);
    }

    public void setPremiumCountColor(boolean z10) {
        int w02;
        this.f24440l0 = !z10;
        if (z10) {
            w02 = -1;
        } else {
            w02 = k6.w0(k6.G6, this.S);
        }
        this.v.setTextColor(w02);
    }

    private void setRatingPaintColorKey(int i10) {
        this.m0 = i10;
        this.K.setColor(k6.w0(i10, this.S));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.E == null) {
            if (this.f24433f) {
                float f7 = this.h + 0.016f;
                this.h = f7;
                if (f7 > 3.0f) {
                    this.f24433f = false;
                }
            } else {
                float f10 = this.h - 0.016f;
                this.h = f10;
                if (f10 < 1.0f) {
                    this.f24433f = true;
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
        AndroidUtilities.cancelRunOnUIThread(this.f24439k0);
        this.f24439k0 = null;
        int i10 = k6.Oh;
        setRatingPaintColorKey(i10);
        this.L = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        o5 o5Var = this.I;
        o6 o6Var = this.v;
        o6 o6Var2 = this.N;
        if (i11 == i12) {
            long j10 = tl_starsRating2.stars;
            if (j10 <= 0) {
                this.f24425a = 0.0f;
                o6Var2.setText("");
                o6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                setRatingPaintColorKey(k6.wj);
                this.L = true;
                z12 = false;
            } else {
                z12 = false;
                long j11 = tl_starsRating2.next_level_stars;
                if (j11 == 0) {
                    this.f24425a = 1.0f;
                    o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i12 - 1)));
                    o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j12 = tl_starsRating2.current_level_stars;
                    this.f24425a = r.a(((float) (j10 - j12)) / ((float) (j11 - j12)), 0.0f, 1.0f);
                    z13 = true;
                    o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level + 1)));
                    this.T = z13;
                    boolean z14 = z12;
                    this.U = z14;
                    this.V = z14;
                    this.f24426a0 = this.f24441n;
                    o5Var.requestLayout();
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
            this.f24426a0 = this.f24441n;
            o5Var.requestLayout();
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
            this.f24425a = 1.0f;
            this.T = z11;
            this.U = false;
            this.V = z11;
            this.f24426a0 = this.f24441n;
            o5Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(z11);
            ViewPropertyAnimator duration = o6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            zr zrVar = zr.h;
            duration.setInterpolator(zrVar).start();
            o6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(zrVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable = new Runnable(this) {
                public final LimitPreviewView f46792b;

                {
                    this.f46792b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f46792b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f46792b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f24439k0 = runnable;
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
            this.f24425a = 0.0f;
            this.T = z10;
            this.U = false;
            this.V = z10;
            this.f24426a0 = this.f24441n;
            o5Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = o6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            zr zrVar2 = zr.h;
            duration2.setInterpolator(zrVar2).start();
            o6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(zrVar2).start();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) {
                public final LimitPreviewView f46792b;

                {
                    this.f46792b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f46792b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f46792b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f24439k0 = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i10;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.boosts;
        o6 o6Var = this.N;
        o6 o6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f24425a = 1.0f;
            o6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            o6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f24425a = r.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            o6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            o6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24445w.setVisibility(8);
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
        spannableStringBuilder.append((CharSequence) "d").setSpan(new vq(this.f24443r, 0), 0, 1, 0);
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
        spannableStringBuilder.setSpan(new qu(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s sVar = this.e;
        sVar.f46855f = spannableStringBuilder;
        sVar.requestLayout();
    }

    public final void i(int i10, boolean z10) {
        vq vqVar;
        char c10;
        int i11;
        int i12 = 0;
        if (i10 < 0) {
            vqVar = new vq(R.drawable.warning_sign, 0);
        } else {
            vqVar = new vq(this.f24443r, 0);
            float f7 = this.f24444s;
            vqVar.setScale(f7, f7);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(vqVar, 0, 1, 0);
        if (i10 >= 0 || !this.f24436h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        s sVar = this.e;
        if (!z10) {
            sVar.f46855f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = sVar.f46855f;
            sVar.f46855f = spannableStringBuilder;
            TextPaint textPaint = sVar.f46854c;
            ArrayList arrayList = sVar.h;
            if (sVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sVar.f46855f);
                int length = sVar.f46855f.length() - 1;
                int i13 = 0;
                while (length >= 0) {
                    if (length < spannableStringBuilder2.length()) {
                        c10 = spannableStringBuilder2.charAt(length);
                    } else {
                        c10 = ' ';
                    }
                    if (c10 != sVar.f46855f.charAt(length) && Character.isDigit(sVar.f46855f.charAt(length))) {
                        sg.r rVar = new sg.r();
                        arrayList.add(rVar);
                        rVar.e = sVar.d.getSecondaryHorizontal(length);
                        rVar.f46836a = r62;
                        if (i13 >= r62) {
                            i13 = i12;
                        }
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + c10, textPaint, (int) sVar.e, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = rVar.f46837b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + sVar.f46855f.charAt(i11), textPaint, (int) sVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new sz(false), i11, i11 + 1, 0);
                        i13++;
                    } else {
                        i11 = length;
                    }
                    length = i11 - 1;
                    i12 = 0;
                    r62 = 1;
                }
                sVar.f46856n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    sVar.f46857r = true;
                    sg.r rVar2 = (sg.r) arrayList.get(i14);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f46839f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 0));
                    rVar2.f46839f.addListener(new q(sVar, rVar2, 1));
                    rVar2.f46839f.setInterpolator(zr.f33338g);
                    rVar2.f46839f.setDuration(250L);
                    rVar2.f46839f.setStartDelay(((arrayList.size() - 1) - i14) * 60);
                    rVar2.f46839f.start();
                }
            }
        }
        sVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j10, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.M = true;
        setRatingPaintColorKey(k6.Oh);
        this.f24425a = AndroidUtilities.ilerp((float) j10, (float) starGiftUpgradePrice.upgrade_stars, (float) starGiftUpgradePrice2.upgrade_stars);
        this.N.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String formatPluralStringComma = LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        o6 o6Var = this.v;
        o6Var.setText(formatPluralStringComma);
        ((FrameLayout.LayoutParams) o6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24445w.setVisibility(8);
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
        float max = (Math.max(this.f24441n, (getMeasuredWidth() - i19) * this.f24446x) + f17) - (sVar.getMeasuredWidth() / 2.0f);
        if (this.Q) {
            float f18 = sVar.f46858s;
            measuredWidth = Utilities.clamp(max, (getMeasuredWidth() - dp2) - sVar.getMeasuredWidth(), f17);
            int i20 = this.f24441n;
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
                f13 = Utilities.clamp((this.f24441n - (measuredWidth - f17)) / sVar.getMeasuredWidth(), 1.0f, 0.0f);
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
            TextPaint textPaint2 = sVar.f46854c;
            ArrayList arrayList = sVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = sVar.f46861y;
            if (limitPreviewView.P && limitPreviewView.f24427b == 0) {
                f15 = f12;
                z12 = z11;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f46855f);
                int i21 = 0;
                boolean z18 = true;
                while (i21 < sVar.f46855f.length()) {
                    if (Character.isDigit(sVar.f46855f.charAt(i21))) {
                        sg.r rVar = new sg.r();
                        arrayList.add(rVar);
                        f16 = f12;
                        rVar.e = sVar.d.getSecondaryHorizontal(i21);
                        rVar.d = z18;
                        if (i18 >= 1) {
                            z18 = !z18;
                            i18 = 0;
                        }
                        i18++;
                        int charAt = sVar.f46855f.charAt(i21) - '0';
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
                            rVar.f46837b.add(new StaticLayout(o1.k(i16, ""), textPaint2, (int) sVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i22 = i17 + 1;
                            i15 = i23;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new sz(false), i21, i21 + 1, 0);
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
                sVar.f46856n = new StaticLayout(spannableStringBuilder, textPaint2, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    sVar.f46857r = true;
                    sg.r rVar2 = (sg.r) arrayList.get(i24);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f46839f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 1));
                    rVar2.f46839f.addListener(new q(sVar, rVar2, 0));
                    rVar2.f46839f.setInterpolator(zr.f33338g);
                    rVar2.f46839f.setDuration(750L);
                    rVar2.f46839f.setStartDelay(((arrayList.size() - 1) - i24) * 60);
                    rVar2.f46839f.start();
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
        this.f24437i0 = ofFloat2;
        final float f19 = this.f24441n;
        if (z12) {
            this.f24441n = this.f24426a0;
        }
        final boolean z19 = !this.f24438j0;
        this.f24438j0 = true;
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
                    sVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.f24428b0);
                } else if (!limitPreviewView2.f24438j0) {
                    sVar2.setRotation(limitPreviewView2.f24428b0);
                }
                if (valueAnimator == limitPreviewView2.f24437i0) {
                    sVar2.setTranslationX(AndroidUtilities.lerp(f21, f14, min));
                    float lerp = AndroidUtilities.lerp(f22, f20, min);
                    if (sVar2.f46858s != lerp) {
                        sVar2.f46858s = lerp;
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
                    limitPreviewView2.f24441n = (int) AndroidUtilities.lerp(limitPreviewView2.f24426a0, f19, min);
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
        this.f24437i0.addListener(new o40(16, this, z19));
        this.f24437i0.setInterpolator(new OvershootInterpolator());
        if (this.W) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new i6(this, 22));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.f24437i0.setDuration(600L);
        } else if (z17) {
            this.f24437i0.setInterpolator(zr.f33339i);
            this.f24437i0.setDuration(320L);
        } else if (z16) {
            this.f24437i0.setInterpolator(zr.h);
            this.f24437i0.setDuration(500L);
        } else {
            this.f24437i0.setDuration(1000L);
            this.f24437i0.setStartDelay(200L);
        }
        this.f24437i0.start();
        this.d = true;
    }

    public void setBagePosition(float f7) {
        this.f24446x = r.a(f7, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(t tVar) {
        this.f24432e0 = tVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f24436h0 = z10;
    }

    public void setIconScale(float f7) {
        this.f24444s = f7;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f24447y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.L = false;
        setRatingPaintColorKey(k6.Oh);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        o6 o6Var = this.N;
        o6 o6Var2 = this.v;
        if (i10 <= 0) {
            this.f24425a = 0.5f;
            o6Var.setText("");
            o6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            setRatingPaintColorKey(k6.wj);
            this.L = true;
        } else {
            long j12 = tl_starsRating.next_level_stars;
            if (j12 == 0) {
                this.f24425a = 1.0f;
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f24425a = r.a(((float) (j11 - j10)) / ((float) (j12 - j10)), 0.0f, 1.0f);
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24445w.setVisibility(8);
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
        if (this.f24427b == i10) {
            z10 = false;
        }
        this.f24427b = i10;
        this.f24425a = r.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.f24426a0 = this.f24441n;
            this.I.requestLayout();
            requestLayout();
        }
        o6 o6Var = this.v;
        ((FrameLayout.LayoutParams) o6Var.getLayoutParams()).gravity = 5;
        this.f24445w.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        o6Var.setText("" + i11);
        i(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        String str;
        o6 o6Var = this.v;
        int i11 = this.f24443r;
        s sVar = this.e;
        if (i10 == 6) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new vq(i11, 0), 0, 1, 0);
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                sVar.f46855f = spannableStringBuilder;
            }
            o6Var.setText("4 GB");
        } else if (i10 == 11) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new vq(i11, 0), 0, 1, 0);
                sVar.f46855f = spannableStringBuilder2;
            }
            o6Var.setText("");
        }
    }

    @Override
    public final void updateColors() {
        o6 o6Var;
        o6 o6Var2;
        g6 g6Var = this.S;
        try {
            if (this.f24442n0 && (o6Var2 = this.N) != null) {
                o6Var2.setTextColor(k6.w0(k6.G6, g6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            if (this.f24440l0 && (o6Var = this.v) != null) {
                o6Var.setTextColor(k6.w0(k6.G6, g6Var));
            }
            int i10 = this.m0;
            if (i10 >= 0) {
                this.K.setColor(k6.w0(i10, g6Var));
                o5 o5Var = this.I;
                if (o5Var != null) {
                    o5Var.invalidate();
                }
                s sVar = this.e;
                if (sVar != null) {
                    sVar.invalidate();
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, g6 g6Var) {
        super(context);
        this.f24444s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.f24431d0 = true;
        this.m0 = -1;
        this.S = g6Var;
        this.f24425a = r.a(f7, 0.1f, 0.9f);
        this.f24443r = i10;
        this.f24427b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            s sVar = new s(this, context);
            this.e = sVar;
            i(i11, false);
            sVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(sVar, z5.o(-2, -2, 0.0f, 3));
        }
        gh0 gh0Var = new gh0(this, context, true);
        this.f24434f0 = gh0Var;
        o6 o6Var = new o6(context, false, false, false);
        this.N = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setText(LocaleController.getString(R.string.LimitFree));
        o6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.f24445w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        r6.W(textView, k6.G6, g6Var);
        if (LocaleController.isRTL) {
            gh0Var.addView(o6Var, z5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            gh0Var.addView(textView, z5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            gh0Var.addView(o6Var, z5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            gh0Var.addView(textView, z5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        gh0 gh0Var2 = new gh0(this, context, false);
        this.f24435g0 = gh0Var2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        o6 o6Var2 = new o6(context, false, false, false);
        this.v = o6Var2;
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        o6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (LocaleController.isRTL) {
            gh0Var2.addView(textView2, z5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            gh0Var2.addView(o6Var2, z5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            gh0Var2.addView(textView2, z5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            gh0Var2.addView(o6Var2, z5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        o5 o5Var = new o5(this, context, g6Var);
        this.I = o5Var;
        o5Var.addView(gh0Var, z5.c(30.0f, -1));
        o5Var.addView(gh0Var2, z5.c(30.0f, -1));
        addView(o5Var, z5.p(-1, 30, 0.0f, 0, 14, i10 != 0 ? 12 : 0, 14, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
