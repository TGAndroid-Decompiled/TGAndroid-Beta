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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bh.g;
import g7.e6;
import g7.n;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xy;
import zf.p;
import zf.q;
import zf.r;
import zf.s;
import zf.t;
import zf.z0;
public class LimitPreviewView extends LinearLayout {
    public static final int f26446h0 = 0;
    public z0 A;
    public int B;
    public boolean C;
    public boolean D;
    public final g E;
    public boolean F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public final j6 J;
    public final TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final b6 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public boolean W;
    public float f26447a;
    public t f26448a0;
    public int f26449b;
    public final tf0 f26450b0;
    public int f26451c;
    public final tf0 f26452c0;
    public boolean d;
    public boolean f26453d0;
    public final s f26454e;
    public ValueAnimator f26455e0;
    public boolean f26456f;
    public boolean f26457f0;
    public Runnable f26458g0;
    public float h;
    public int f26459n;
    public final int f26460r;
    public float f26461s;
    public final j6 v;
    public final TextView f26462w;
    public float f26463x;
    public ViewGroup f26464y;

    public LimitPreviewView(Context context, int i9, int i10, b6 b6Var, int i11) {
        this(context, i9, i10, i11, 0.5f, b6Var);
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

    private void setArrowX(float f10) {
        int i9;
        int dp;
        if (f10 >= 1.0f) {
            i9 = this.E.getMeasuredWidth();
        } else {
            i9 = 0;
        }
        this.f26459n = i9;
        float dp2 = AndroidUtilities.dp(14.0f);
        s sVar = this.f26454e;
        sVar.setTranslationX(Utilities.clamp((Math.max(this.f26459n, (getMeasuredWidth() - (dp * 2)) * f10) + dp2) - (sVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - dp) - sVar.getMeasuredWidth(), dp2));
        if (sVar.f50688s != f10) {
            sVar.f50688s = f10;
            sVar.v = true;
            sVar.invalidate();
        }
        sVar.setPivotX(sVar.getMeasuredWidth() * f10);
    }

    public final void d(org.telegram.tgnet.tl.TL_stars.Tl_starsRating r22, final org.telegram.tgnet.tl.TL_stars.Tl_starsRating r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.d(org.telegram.tgnet.tl.TL_stars$Tl_starsRating, org.telegram.tgnet.tl.TL_stars$Tl_starsRating):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.A == null) {
            if (this.f26456f) {
                float f10 = this.h + 0.016f;
                this.h = f10;
                if (f10 > 3.0f) {
                    this.f26456f = false;
                }
            } else {
                float f11 = this.h - 0.016f;
                this.h = f11;
                if (f11 < 1.0f) {
                    this.f26456f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i9;
        int i10 = tL_premium_boostsStatus.current_level_boosts;
        int i11 = tL_premium_boostsStatus.boosts;
        j6 j6Var = this.J;
        j6 j6Var2 = this.v;
        if ((i10 == i11 && z10) || (i9 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f26447a = 1.0f;
            j6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            j6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f26447a = n.a((i11 - i10) / (i9 - i10), 0.0f, 1.0f);
            j6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            j6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f26462w.setVisibility(8);
        this.K.setVisibility(8);
        j6Var2.setTextColor(f6.v0(f6.G6, this.O));
        j6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.L = true;
    }

    public final void f(int i9, int i10) {
        String formatNumber;
        String formatNumber2;
        if (i9 < 0) {
            g(i9, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new eq(this.f26460r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        if (i9 > 1200) {
            formatNumber = LocaleController.formatShortNumber(i9, null);
        } else {
            formatNumber = LocaleController.formatNumber(i9, ',');
        }
        spannableStringBuilder.append((CharSequence) formatNumber);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        if (i10 > 1200) {
            formatNumber2 = LocaleController.formatShortNumber(i10, null);
        } else {
            formatNumber2 = LocaleController.formatNumber(i10, ',');
        }
        spannableStringBuilder.append((CharSequence) formatNumber2);
        spannableStringBuilder.setSpan(new wt(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s sVar = this.f26454e;
        sVar.f50685f = spannableStringBuilder;
        sVar.requestLayout();
    }

    public final void g(int i9, boolean z10) {
        eq eqVar;
        char c10;
        int i10;
        if (i9 < 0) {
            eqVar = new eq(R.drawable.warning_sign, 0);
        } else {
            eqVar = new eq(this.f26460r, 0);
            float f10 = this.f26461s;
            eqVar.setScale(f10, f10);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(eqVar, 0, 1, 0);
        if (i9 >= 0 || !this.f26453d0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i9, ','));
        }
        s sVar = this.f26454e;
        if (!z10) {
            sVar.f50685f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = sVar.f50685f;
            sVar.f50685f = spannableStringBuilder;
            TextPaint textPaint = sVar.f50683c;
            ArrayList arrayList = sVar.h;
            if (sVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sVar.f50685f);
                int length = sVar.f50685f.length() - 1;
                int i11 = 0;
                while (length >= 0) {
                    if (length < spannableStringBuilder2.length()) {
                        c10 = spannableStringBuilder2.charAt(length);
                    } else {
                        c10 = ' ';
                    }
                    if (c10 != sVar.f50685f.charAt(length) && Character.isDigit(sVar.f50685f.charAt(length))) {
                        r rVar = new r();
                        arrayList.add(rVar);
                        rVar.f50677e = sVar.d.getSecondaryHorizontal(length);
                        rVar.f50674a = r62;
                        if (i11 >= r62) {
                            i11 = 0;
                        }
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i10 = length;
                        StaticLayout staticLayout = new StaticLayout("" + c10, textPaint, (int) sVar.f50684e, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = rVar.f50675b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + sVar.f50685f.charAt(i10), textPaint, (int) sVar.f50684e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new xy(false), i10, i10 + 1, 0);
                        i11++;
                    } else {
                        i10 = length;
                    }
                    length = i10 - 1;
                    r62 = 1;
                }
                sVar.f50686n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) sVar.f50684e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    sVar.f50687r = true;
                    r rVar2 = (r) arrayList.get(i12);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f50678f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 0));
                    rVar2.f50678f.addListener(new q(sVar, rVar2, 1));
                    rVar2.f50678f.setInterpolator(gr.f28845g);
                    rVar2.f50678f.setDuration(250L);
                    rVar2.f50678f.setStartDelay(((arrayList.size() - 1) - i12) * 60);
                    rVar2.f50678f.start();
                }
            }
        }
        sVar.requestLayout();
    }

    @Override
    public final void onLayout(boolean r30, int r31, int r32, int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.onLayout(boolean, int, int, int, int):void");
    }

    public void setBagePosition(float f10) {
        this.f26463x = n.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(t tVar) {
        this.f26448a0 = tVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f26453d0 = z10;
    }

    public void setIconScale(float f10) {
        this.f26461s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f26464y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        int v02;
        this.H = false;
        int i9 = f6.Oh;
        b6 b6Var = this.O;
        int v03 = f6.v0(i9, b6Var);
        Paint paint = this.G;
        paint.setColor(v03);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        j6 j6Var = this.J;
        j6 j6Var2 = this.v;
        if (j11 <= 0) {
            this.f26447a = 0.5f;
            j6Var.setText("");
            j6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(f6.v0(f6.wj, b6Var));
            this.H = true;
        } else {
            long j12 = tl_starsRating.next_level_stars;
            if (j12 == 0) {
                this.f26447a = 1.0f;
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f26447a = n.a(((float) (j11 - j10)) / ((float) (j12 - j10)), 0.0f, 1.0f);
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f26462w.setVisibility(8);
        this.K.setVisibility(8);
        if (this.H) {
            v02 = -1;
        } else {
            v02 = f6.v0(f6.G6, b6Var);
        }
        j6Var2.setTextColor(v02);
        j6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.L = true;
        this.M = true;
        this.N = true;
    }

    public void setStaticGradinet(z0 z0Var) {
        this.A = z0Var;
    }

    public void setStatus(int i9, int i10, boolean z10) {
        if (this.f26449b == i9) {
            z10 = false;
        }
        this.f26449b = i9;
        this.f26447a = n.a(i9 / i10, 0.0f, 1.0f);
        if (z10) {
            this.S = true;
            this.T = this.f26459n;
            this.E.requestLayout();
            requestLayout();
        }
        j6 j6Var = this.v;
        ((FrameLayout.LayoutParams) j6Var.getLayoutParams()).gravity = 5;
        this.f26462w.setVisibility(8);
        this.K.setVisibility(8);
        this.J.setText("0");
        j6Var.setText("" + i10);
        g(i9, false);
        this.L = true;
        this.M = true;
    }

    public void setType(int i9) {
        String str;
        j6 j6Var = this.v;
        int i10 = this.f26460r;
        s sVar = this.f26454e;
        if (i9 == 6) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new eq(i10, 0), 0, 1, 0);
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                sVar.f50685f = spannableStringBuilder;
            }
            j6Var.setText("4 GB");
        } else if (i9 == 11) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new eq(i10, 0), 0, 1, 0);
                sVar.f50685f = spannableStringBuilder2;
            }
            j6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i9, int i10, int i11, float f10, b6 b6Var) {
        super(context);
        this.f26461s = 1.0f;
        this.D = true;
        this.G = new Paint(1);
        this.W = true;
        this.O = b6Var;
        this.f26447a = n.a(f10, 0.1f, 0.9f);
        this.f26460r = i9;
        this.f26449b = i10;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i9 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            s sVar = new s(this, context);
            this.f26454e = sVar;
            g(i10, false);
            sVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(sVar, e6.o(-2, -2, 0.0f, 3));
        }
        tf0 tf0Var = new tf0(this, context, true);
        this.f26450b0 = tf0Var;
        j6 j6Var = new j6(context, false, false, false);
        this.J = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setText(LocaleController.getString(R.string.LimitFree));
        j6Var.setGravity(16);
        int i12 = f6.G6;
        j6Var.setTextColor(f6.v0(i12, b6Var));
        TextView textView = new TextView(context);
        this.f26462w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i11)));
        textView.setGravity(16);
        textView.setTextColor(f6.v0(i12, b6Var));
        if (LocaleController.isRTL) {
            tf0Var.addView(j6Var, e6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            tf0Var.addView(textView, e6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            tf0Var.addView(j6Var, e6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            tf0Var.addView(textView, e6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        tf0 tf0Var2 = new tf0(this, context, false);
        this.f26452c0 = tf0Var2;
        TextView textView2 = new TextView(context);
        this.K = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        j6 j6Var2 = new j6(context, false, false, false);
        this.v = j6Var2;
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var2.setTypeface(AndroidUtilities.bold());
        j6Var2.setText(String.format("%d", Integer.valueOf(i11)));
        j6Var2.setGravity(21);
        j6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            tf0Var2.addView(textView2, e6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            tf0Var2.addView(j6Var2, e6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            tf0Var2.addView(textView2, e6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            tf0Var2.addView(j6Var2, e6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        g gVar = new g(this, context, b6Var);
        this.E = gVar;
        gVar.addView(tf0Var, e6.c(30.0f, -1));
        gVar.addView(tf0Var2, e6.c(30.0f, -1));
        addView(gVar, e6.p(-1, 30, 0.0f, 0, 14, i9 == 0 ? 0 : 12, 14, 0));
    }
}
