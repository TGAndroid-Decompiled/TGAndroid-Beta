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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.wr;
import org.telegram.ui.u5;
import qg.c1;
import qg.r;
import qg.s;
import qg.t;
import qg.u;
import w7.a6;
import w7.q;
public class LimitPreviewView extends LinearLayout {
    public static final int f21185l0 = 0;
    public c1 E;
    public int F;
    public boolean G;
    public boolean H;
    public final u5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final o6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final f6 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f21186a;
    public int f21187a0;
    public int f21188b;
    public float f21189b0;
    public int f21190c;
    public boolean f21191c0;
    public boolean d;
    public boolean f21192d0;
    public final t e;
    public u f21193e0;
    public boolean f21194f;
    public final sg0 f21195f0;
    public final sg0 f21196g0;
    public float h;
    public boolean f21197h0;
    public ValueAnimator f21198i0;
    public boolean f21199j0;
    public Runnable f21200k0;
    public int f21201n;
    public final int f21202r;
    public float f21203s;
    public final o6 v;
    public final TextView f21204w;
    public float f21205x;
    public ViewGroup f21206y;

    public LimitPreviewView(Context context, int i10, int i11, f6 f6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, f6Var);
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
        this.f21201n = i10;
        float dp2 = AndroidUtilities.dp(14.0f);
        t tVar = this.e;
        tVar.setTranslationX(Utilities.clamp((Math.max(this.f21201n, (getMeasuredWidth() - (dp * 2)) * f7) + dp2) - (tVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - dp) - tVar.getMeasuredWidth(), dp2));
        if (tVar.f40915s != f7) {
            tVar.f40915s = f7;
            tVar.v = true;
            tVar.invalidate();
        }
        tVar.setPivotX(tVar.getMeasuredWidth() * f7);
    }

    public final void d(org.telegram.tgnet.tl.TL_stars.Tl_starsRating r22, final org.telegram.tgnet.tl.TL_stars.Tl_starsRating r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.d(org.telegram.tgnet.tl.TL_stars$Tl_starsRating, org.telegram.tgnet.tl.TL_stars$Tl_starsRating):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.E == null) {
            if (this.f21194f) {
                float f7 = this.h + 0.016f;
                this.h = f7;
                if (f7 > 3.0f) {
                    this.f21194f = false;
                }
            } else {
                float f10 = this.h - 0.016f;
                this.h = f10;
                if (f10 < 1.0f) {
                    this.f21194f = true;
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
        o6 o6Var = this.N;
        o6 o6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f21186a = 1.0f;
            o6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            o6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f21186a = q.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            o6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            o6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f21204w.setVisibility(8);
        this.O.setVisibility(8);
        o6Var2.setTextColor(j6.v0(j6.G6, this.S));
        o6Var.setTextColor(-1);
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
        spannableStringBuilder.append((CharSequence) "d").setSpan(new uq(this.f21202r, 0), 0, 1, 0);
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
        spannableStringBuilder.setSpan(new pu(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        t tVar = this.e;
        tVar.f40912f = spannableStringBuilder;
        tVar.requestLayout();
    }

    public final void g(int i10, boolean z10) {
        uq uqVar;
        char c10;
        int i11;
        if (i10 < 0) {
            uqVar = new uq(R.drawable.warning_sign, 0);
        } else {
            uqVar = new uq(this.f21202r, 0);
            float f7 = this.f21203s;
            uqVar.setScale(f7, f7);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(uqVar, 0, 1, 0);
        if (i10 >= 0 || !this.f21197h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        t tVar = this.e;
        if (!z10) {
            tVar.f40912f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = tVar.f40912f;
            tVar.f40912f = spannableStringBuilder;
            TextPaint textPaint = tVar.f40911c;
            ArrayList arrayList = tVar.h;
            if (tVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(tVar.f40912f);
                int length = tVar.f40912f.length() - 1;
                int i12 = 0;
                while (length >= 0) {
                    if (length < spannableStringBuilder2.length()) {
                        c10 = spannableStringBuilder2.charAt(length);
                    } else {
                        c10 = ' ';
                    }
                    if (c10 != tVar.f40912f.charAt(length) && Character.isDigit(tVar.f40912f.charAt(length))) {
                        s sVar = new s();
                        arrayList.add(sVar);
                        sVar.e = tVar.d.getSecondaryHorizontal(length);
                        sVar.f40895a = r62;
                        if (i12 >= r62) {
                            i12 = 0;
                        }
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + c10, textPaint, (int) tVar.e, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = sVar.f40896b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + tVar.f40912f.charAt(i11), textPaint, (int) tVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new sz(false), i11, i11 + 1, 0);
                        i12++;
                    } else {
                        i11 = length;
                    }
                    length = i11 - 1;
                    r62 = 1;
                }
                tVar.f40913n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) tVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    tVar.f40914r = true;
                    s sVar2 = (s) arrayList.get(i13);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    sVar2.f40898f = ofFloat;
                    ofFloat.addUpdateListener(new qg.q(tVar, sVar2, 0));
                    sVar2.f40898f.addListener(new r(tVar, sVar2, 1));
                    sVar2.f40898f.setInterpolator(wr.f28820g);
                    sVar2.f40898f.setDuration(250L);
                    sVar2.f40898f.setStartDelay(((arrayList.size() - 1) - i13) * 60);
                    sVar2.f40898f.start();
                }
            }
        }
        tVar.requestLayout();
    }

    @Override
    public final void onLayout(boolean r30, int r31, int r32, int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.onLayout(boolean, int, int, int, int):void");
    }

    public void setBagePosition(float f7) {
        this.f21205x = q.a(f7, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(u uVar) {
        this.f21193e0 = uVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f21197h0 = z10;
    }

    public void setIconScale(float f7) {
        this.f21203s = f7;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f21206y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        int v02;
        this.L = false;
        int i10 = j6.Oh;
        f6 f6Var = this.S;
        int v03 = j6.v0(i10, f6Var);
        Paint paint = this.K;
        paint.setColor(v03);
        long j3 = tl_starsRating.current_level_stars;
        long j10 = tl_starsRating.stars;
        o6 o6Var = this.N;
        o6 o6Var2 = this.v;
        if (j10 <= 0) {
            this.f21186a = 0.5f;
            o6Var.setText("");
            o6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(j6.v0(j6.wj, f6Var));
            this.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                this.f21186a = 1.0f;
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f21186a = q.a(((float) (j10 - j3)) / ((float) (j11 - j3)), 0.0f, 1.0f);
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f21204w.setVisibility(8);
        this.O.setVisibility(8);
        if (this.L) {
            v02 = -1;
        } else {
            v02 = j6.v0(j6.G6, f6Var);
        }
        o6Var2.setTextColor(v02);
        o6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    public void setStaticGradinet(c1 c1Var) {
        this.E = c1Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.f21188b == i10) {
            z10 = false;
        }
        this.f21188b = i10;
        this.f21186a = q.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.f21187a0 = this.f21201n;
            this.I.requestLayout();
            requestLayout();
        }
        o6 o6Var = this.v;
        ((FrameLayout.LayoutParams) o6Var.getLayoutParams()).gravity = 5;
        this.f21204w.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        o6Var.setText("" + i11);
        g(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        String str;
        o6 o6Var = this.v;
        int i11 = this.f21202r;
        t tVar = this.e;
        if (i10 == 6) {
            if (tVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new uq(i11, 0), 0, 1, 0);
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                tVar.f40912f = spannableStringBuilder;
            }
            o6Var.setText("4 GB");
        } else if (i10 == 11) {
            if (tVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new uq(i11, 0), 0, 1, 0);
                tVar.f40912f = spannableStringBuilder2;
            }
            o6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, f6 f6Var) {
        super(context);
        this.f21203s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.f21192d0 = true;
        this.S = f6Var;
        this.f21186a = q.a(f7, 0.1f, 0.9f);
        this.f21202r = i10;
        this.f21188b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            t tVar = new t(this, context);
            this.e = tVar;
            g(i11, false);
            tVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(tVar, a6.o(-2, -2, 0.0f, 3));
        }
        sg0 sg0Var = new sg0(this, context, true);
        this.f21195f0 = sg0Var;
        o6 o6Var = new o6(context, false, false, false);
        this.N = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setText(LocaleController.getString(R.string.LimitFree));
        o6Var.setGravity(16);
        int i13 = j6.G6;
        o6Var.setTextColor(j6.v0(i13, f6Var));
        TextView textView = new TextView(context);
        this.f21204w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(j6.v0(i13, f6Var));
        if (LocaleController.isRTL) {
            sg0Var.addView(o6Var, a6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            sg0Var.addView(textView, a6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            sg0Var.addView(o6Var, a6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            sg0Var.addView(textView, a6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        sg0 sg0Var2 = new sg0(this, context, false);
        this.f21196g0 = sg0Var2;
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
        o6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            sg0Var2.addView(textView2, a6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            sg0Var2.addView(o6Var2, a6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            sg0Var2.addView(textView2, a6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            sg0Var2.addView(o6Var2, a6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        u5 u5Var = new u5(this, context, f6Var);
        this.I = u5Var;
        u5Var.addView(sg0Var, a6.c(30.0f, -1));
        u5Var.addView(sg0Var2, a6.c(30.0f, -1));
        addView(u5Var, a6.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
