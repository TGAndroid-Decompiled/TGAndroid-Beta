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
import hg.c;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.f70;
import org.telegram.ui.t5;
import rg.a1;
import rg.p;
import rg.q;
import rg.r;
import rg.s;
import rg.t;
import w7.o;
import w7.x5;
public class LimitPreviewView extends LinearLayout {
    public static final int f24234l0 = 0;
    public a1 E;
    public int F;
    public boolean G;
    public boolean H;
    public final t5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final r6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final e6 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f24235a;
    public int f24236a0;
    public int f24237b;
    public float f24238b0;
    public int f24239c;
    public boolean f24240c0;
    public boolean d;
    public boolean f24241d0;
    public final s f24242e;
    public t f24243e0;
    public boolean f24244f;
    public final kh0 f24245f0;
    public final kh0 f24246g0;
    public float h;
    public boolean f24247h0;
    public ValueAnimator f24248i0;
    public boolean f24249j0;
    public Runnable f24250k0;
    public int f24251n;
    public final int f24252r;
    public float f24253s;
    public final r6 v;
    public final TextView f24254w;
    public float f24255x;
    public ViewGroup f24256y;

    public LimitPreviewView(Context context, int i10, int i11, e6 e6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, e6Var);
    }

    public static void a(org.telegram.ui.Components.Premium.LimitPreviewView r18, org.telegram.tgnet.tl.TL_stars.Tl_starsRating r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.a(org.telegram.ui.Components.Premium.LimitPreviewView, org.telegram.tgnet.tl.TL_stars$Tl_starsRating):void");
    }

    public static void b(org.telegram.ui.Components.Premium.LimitPreviewView r18, org.telegram.tgnet.tl.TL_stars.Tl_starsRating r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.b(org.telegram.ui.Components.Premium.LimitPreviewView, org.telegram.tgnet.tl.TL_stars$Tl_starsRating):void");
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
        this.f24251n = i10;
        float dp2 = AndroidUtilities.dp(14.0f);
        s sVar = this.f24242e;
        sVar.setTranslationX(Utilities.clamp((Math.max(this.f24251n, (getMeasuredWidth() - (dp * 2)) * f7) + dp2) - (sVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - dp) - sVar.getMeasuredWidth(), dp2));
        if (sVar.f47431s != f7) {
            sVar.f47431s = f7;
            sVar.v = true;
            sVar.invalidate();
        }
        sVar.setPivotX(sVar.getMeasuredWidth() * f7);
    }

    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        int w02;
        boolean z11;
        int w03;
        boolean z12;
        boolean z13;
        int w04;
        AndroidUtilities.cancelRunOnUIThread(this.f24250k0);
        this.f24250k0 = null;
        int i10 = i6.Oh;
        e6 e6Var = this.S;
        int w05 = i6.w0(i10, e6Var);
        Paint paint = this.K;
        paint.setColor(w05);
        this.L = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        t5 t5Var = this.I;
        r6 r6Var = this.v;
        r6 r6Var2 = this.N;
        if (i11 == i12) {
            long j3 = tl_starsRating2.stars;
            if (j3 <= 0) {
                this.f24235a = 0.0f;
                r6Var2.setText("");
                r6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(i6.w0(i6.wj, e6Var));
                this.L = true;
                z12 = false;
                z13 = true;
            } else {
                long j10 = tl_starsRating2.next_level_stars;
                if (j10 == 0) {
                    this.f24235a = 1.0f;
                    r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i12 - 1)));
                    r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    z12 = false;
                    z13 = true;
                } else {
                    z12 = false;
                    long j11 = tl_starsRating2.current_level_stars;
                    this.f24235a = o.a(((float) (j3 - j11)) / ((float) (j10 - j11)), 0.0f, 1.0f);
                    z13 = true;
                    r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.T = z13;
            boolean z14 = z12;
            this.U = z14;
            this.V = z14;
            this.f24236a0 = this.f24251n;
            t5Var.requestLayout();
            requestLayout();
            if (this.L) {
                w04 = -1;
            } else {
                w04 = i6.w0(i6.G6, e6Var);
            }
            r6Var.setTextColor(w04);
            r6Var2.setTextColor(-1);
            f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
        } else if (i12 > i11) {
            if (tl_starsRating.stars <= 0) {
                z11 = true;
                this.L = true;
            } else {
                z11 = true;
            }
            this.f24235a = 1.0f;
            this.T = z11;
            this.U = false;
            this.V = z11;
            this.f24236a0 = this.f24251n;
            t5Var.requestLayout();
            requestLayout();
            if (this.L) {
                w03 = -1;
            } else {
                w03 = i6.w0(i6.G6, e6Var);
            }
            r6Var.setTextColor(w03);
            r6Var2.setTextColor(-1);
            ViewPropertyAnimator duration = r6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            hs hsVar = hs.h;
            duration.setInterpolator(hsVar).start();
            r6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(hsVar).start();
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable = new Runnable(this) {
                public final LimitPreviewView f47365b;

                {
                    this.f47365b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f47365b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f47365b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f24250k0 = runnable;
            AndroidUtilities.runOnUIThread(runnable, 600L);
        } else if (i12 < i11) {
            paint.setColor(i6.w0(i10, e6Var));
            this.L = false;
            if (tl_starsRating.stars <= 0) {
                z10 = true;
                this.L = true;
            } else {
                z10 = true;
            }
            this.f24235a = 0.0f;
            this.T = z10;
            this.U = false;
            this.V = z10;
            this.f24236a0 = this.f24251n;
            t5Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = r6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            hs hsVar2 = hs.h;
            duration2.setInterpolator(hsVar2).start();
            r6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(hsVar2).start();
            if (this.L) {
                w02 = -1;
            } else {
                w02 = i6.w0(i6.G6, e6Var);
            }
            r6Var.setTextColor(w02);
            r6Var2.setTextColor(-1);
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) {
                public final LimitPreviewView f47365b;

                {
                    this.f47365b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            LimitPreviewView.b(this.f47365b, tl_starsRating2);
                            return;
                        default:
                            LimitPreviewView.a(this.f47365b, tl_starsRating2);
                            return;
                    }
                }
            };
            this.f24250k0 = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.E == null) {
            if (this.f24244f) {
                float f7 = this.h + 0.016f;
                this.h = f7;
                if (f7 > 3.0f) {
                    this.f24244f = false;
                }
            } else {
                float f10 = this.h - 0.016f;
                this.h = f10;
                if (f10 < 1.0f) {
                    this.f24244f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i10;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.boosts;
        r6 r6Var = this.N;
        r6 r6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f24235a = 1.0f;
            r6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            r6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f24235a = o.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            r6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            r6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) r6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24254w.setVisibility(8);
        this.O.setVisibility(8);
        r6Var2.setTextColor(i6.w0(i6.G6, this.S));
        r6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.P = true;
    }

    public final void f(int i10, int i11) {
        String formatNumber;
        String formatNumber2;
        if (i10 < 0) {
            g(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new er(this.f24252r, 0), 0, 1, 0);
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
        spannableStringBuilder.setSpan(new bv(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s sVar = this.f24242e;
        sVar.f47428f = spannableStringBuilder;
        sVar.requestLayout();
    }

    public final void g(int i10, boolean z10) {
        er erVar;
        char c10;
        int i11;
        int i12 = 0;
        if (i10 < 0) {
            erVar = new er(R.drawable.warning_sign, 0);
        } else {
            erVar = new er(this.f24252r, 0);
            float f7 = this.f24253s;
            erVar.setScale(f7, f7);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(erVar, 0, 1, 0);
        if (i10 >= 0 || !this.f24247h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        s sVar = this.f24242e;
        if (!z10) {
            sVar.f47428f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = sVar.f47428f;
            sVar.f47428f = spannableStringBuilder;
            TextPaint textPaint = sVar.f47426c;
            ArrayList arrayList = sVar.h;
            if (sVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sVar.f47428f);
                int length = sVar.f47428f.length() - 1;
                int i13 = 0;
                while (length >= 0) {
                    if (length < spannableStringBuilder2.length()) {
                        c10 = spannableStringBuilder2.charAt(length);
                    } else {
                        c10 = ' ';
                    }
                    if (c10 != sVar.f47428f.charAt(length) && Character.isDigit(sVar.f47428f.charAt(length))) {
                        r rVar = new r();
                        arrayList.add(rVar);
                        rVar.f47420e = sVar.d.getSecondaryHorizontal(length);
                        rVar.f47417a = r62;
                        if (i13 >= r62) {
                            i13 = i12;
                        }
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + c10, textPaint, (int) sVar.f47427e, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = rVar.f47418b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + sVar.f47428f.charAt(i11), textPaint, (int) sVar.f47427e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new b00(false), i11, i11 + 1, 0);
                        i13++;
                    } else {
                        i11 = length;
                    }
                    length = i11 - 1;
                    i12 = 0;
                    r62 = 1;
                }
                sVar.f47429n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) sVar.f47427e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    sVar.f47430r = true;
                    r rVar2 = (r) arrayList.get(i14);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f47421f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 0));
                    rVar2.f47421f.addListener(new q(sVar, rVar2, 1));
                    rVar2.f47421f.setInterpolator(hs.f27119g);
                    rVar2.f47421f.setDuration(250L);
                    rVar2.f47421f.setStartDelay(((arrayList.size() - 1) - i14) * 60);
                    rVar2.f47421f.start();
                }
            }
        }
        sVar.requestLayout();
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
        s sVar = this.f24242e;
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
        float max = (Math.max(this.f24251n, (getMeasuredWidth() - i19) * this.f24255x) + f17) - (sVar.getMeasuredWidth() / 2.0f);
        if (this.Q) {
            float f18 = sVar.f47431s;
            measuredWidth = Utilities.clamp(max, (getMeasuredWidth() - dp2) - sVar.getMeasuredWidth(), f17);
            int i20 = this.f24251n;
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
                f13 = Utilities.clamp((this.f24251n - (measuredWidth - f17)) / sVar.getMeasuredWidth(), 1.0f, 0.0f);
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
            TextPaint textPaint2 = sVar.f47426c;
            ArrayList arrayList = sVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = sVar.f47434y;
            if (limitPreviewView.P && limitPreviewView.f24237b == 0) {
                f15 = f12;
                z12 = z11;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f47428f);
                int i21 = 0;
                boolean z18 = true;
                while (i21 < sVar.f47428f.length()) {
                    if (Character.isDigit(sVar.f47428f.charAt(i21))) {
                        r rVar = new r();
                        arrayList.add(rVar);
                        f16 = f12;
                        rVar.f47420e = sVar.d.getSecondaryHorizontal(i21);
                        rVar.d = z18;
                        if (i18 >= 1) {
                            z18 = !z18;
                            i18 = 0;
                        }
                        i18++;
                        int charAt = sVar.f47428f.charAt(i21) - '0';
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
                            rVar.f47418b.add(new StaticLayout(c.h(i16, ""), textPaint2, (int) sVar.f47427e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i22 = i17 + 1;
                            i15 = i23;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new b00(false), i21, i21 + 1, 0);
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
                sVar.f47429n = new StaticLayout(spannableStringBuilder, textPaint2, AndroidUtilities.dp(12.0f) + ((int) sVar.f47427e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    sVar.f47430r = true;
                    r rVar2 = (r) arrayList.get(i24);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f47421f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 1));
                    rVar2.f47421f.addListener(new q(sVar, rVar2, 0));
                    rVar2.f47421f.setInterpolator(hs.f27119g);
                    rVar2.f47421f.setDuration(750L);
                    rVar2.f47421f.setStartDelay(((arrayList.size() - 1) - i24) * 60);
                    rVar2.f47421f.start();
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
        this.f24248i0 = ofFloat2;
        final float f19 = this.f24251n;
        if (z12) {
            this.f24251n = this.f24236a0;
        }
        final boolean z19 = !this.f24249j0;
        this.f24249j0 = true;
        final float f20 = f13;
        final float f21 = f7;
        final float f22 = f15;
        final boolean z20 = z12;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                s sVar2 = limitPreviewView2.f24242e;
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
                    sVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.f24238b0);
                } else if (!limitPreviewView2.f24249j0) {
                    sVar2.setRotation(limitPreviewView2.f24238b0);
                }
                if (valueAnimator == limitPreviewView2.f24248i0) {
                    sVar2.setTranslationX(AndroidUtilities.lerp(f21, f14, min));
                    float lerp = AndroidUtilities.lerp(f22, f20, min);
                    if (sVar2.f47431s != lerp) {
                        sVar2.f47431s = lerp;
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
                    limitPreviewView2.f24251n = (int) AndroidUtilities.lerp(limitPreviewView2.f24236a0, f19, min);
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
        this.f24248i0.addListener(new f70(15, this, z19));
        this.f24248i0.setInterpolator(new OvershootInterpolator());
        if (this.W) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new r0(this, 14));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.f24248i0.setDuration(600L);
        } else if (z17) {
            this.f24248i0.setInterpolator(hs.f27120i);
            this.f24248i0.setDuration(320L);
        } else if (z16) {
            this.f24248i0.setInterpolator(hs.h);
            this.f24248i0.setDuration(500L);
        } else {
            this.f24248i0.setDuration(1000L);
            this.f24248i0.setStartDelay(200L);
        }
        this.f24248i0.start();
        this.d = true;
    }

    public void setBagePosition(float f7) {
        this.f24255x = o.a(f7, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(t tVar) {
        this.f24243e0 = tVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f24247h0 = z10;
    }

    public void setIconScale(float f7) {
        this.f24253s = f7;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f24256y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        int w02;
        this.L = false;
        int i10 = i6.Oh;
        e6 e6Var = this.S;
        int w03 = i6.w0(i10, e6Var);
        Paint paint = this.K;
        paint.setColor(w03);
        long j3 = tl_starsRating.current_level_stars;
        long j10 = tl_starsRating.stars;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        r6 r6Var = this.N;
        r6 r6Var2 = this.v;
        if (i11 <= 0) {
            this.f24235a = 0.5f;
            r6Var.setText("");
            r6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(i6.w0(i6.wj, e6Var));
            this.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                this.f24235a = 1.0f;
                r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f24235a = o.a(((float) (j10 - j3)) / ((float) (j11 - j3)), 0.0f, 1.0f);
                r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) r6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24254w.setVisibility(8);
        this.O.setVisibility(8);
        if (this.L) {
            w02 = -1;
        } else {
            w02 = i6.w0(i6.G6, e6Var);
        }
        r6Var2.setTextColor(w02);
        r6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    public void setStaticGradinet(a1 a1Var) {
        this.E = a1Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.f24237b == i10) {
            z10 = false;
        }
        this.f24237b = i10;
        this.f24235a = o.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.f24236a0 = this.f24251n;
            this.I.requestLayout();
            requestLayout();
        }
        r6 r6Var = this.v;
        ((FrameLayout.LayoutParams) r6Var.getLayoutParams()).gravity = 5;
        this.f24254w.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        r6Var.setText("" + i11);
        g(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        String str;
        r6 r6Var = this.v;
        int i11 = this.f24252r;
        s sVar = this.f24242e;
        if (i10 == 6) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new er(i11, 0), 0, 1, 0);
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                sVar.f47428f = spannableStringBuilder;
            }
            r6Var.setText("4 GB");
        } else if (i10 == 11) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new er(i11, 0), 0, 1, 0);
                sVar.f47428f = spannableStringBuilder2;
            }
            r6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, e6 e6Var) {
        super(context);
        this.f24253s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.f24241d0 = true;
        this.S = e6Var;
        this.f24235a = o.a(f7, 0.1f, 0.9f);
        this.f24252r = i10;
        this.f24237b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            s sVar = new s(this, context);
            this.f24242e = sVar;
            g(i11, false);
            sVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(sVar, x5.o(-2, -2, 0.0f, 3));
        }
        kh0 kh0Var = new kh0(this, context, true);
        this.f24245f0 = kh0Var;
        r6 r6Var = new r6(context, false, false, false);
        this.N = r6Var;
        r6Var.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setText(LocaleController.getString(R.string.LimitFree));
        r6Var.setGravity(16);
        int i13 = i6.G6;
        r6Var.setTextColor(i6.w0(i13, e6Var));
        TextView textView = new TextView(context);
        this.f24254w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(i6.w0(i13, e6Var));
        if (LocaleController.isRTL) {
            kh0Var.addView(r6Var, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 5));
            kh0Var.addView(textView, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 3));
        } else {
            kh0Var.addView(r6Var, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 3));
            kh0Var.addView(textView, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 5));
        }
        kh0 kh0Var2 = new kh0(this, context, false);
        this.f24246g0 = kh0Var2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        r6 r6Var2 = new r6(context, false, false, false);
        this.v = r6Var2;
        r6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var2.setTypeface(AndroidUtilities.bold());
        r6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        r6Var2.setGravity(21);
        r6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            kh0Var2.addView(textView2, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 5));
            kh0Var2.addView(r6Var2, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 3));
        } else {
            kh0Var2.addView(textView2, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 3));
            kh0Var2.addView(r6Var2, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 5));
        }
        t5 t5Var = new t5(this, context, e6Var);
        this.I = t5Var;
        t5Var.addView(kh0Var, x5.d(30.0f, -1));
        t5Var.addView(kh0Var2, x5.d(30.0f, -1));
        addView(t5Var, x5.p(-1, 30, 0.0f, 0, 14, i10 != 0 ? 12 : 0, 14, 0));
    }
}
