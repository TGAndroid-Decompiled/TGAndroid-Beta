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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.u5;
import rg.a1;
import rg.p;
import rg.r;
import rg.s;
import rg.t;
import w7.q;
import w7.z5;
public class LimitPreviewView extends LinearLayout {
    public static final int f24230l0 = 0;
    public a1 E;
    public int F;
    public boolean G;
    public boolean H;
    public final u5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final p6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final d6 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f24231a;
    public int f24232a0;
    public int f24233b;
    public float f24234b0;
    public int f24235c;
    public boolean f24236c0;
    public boolean d;
    public boolean f24237d0;
    public final s f24238e;
    public t f24239e0;
    public boolean f24240f;
    public final vg0 f24241f0;
    public final vg0 f24242g0;
    public float h;
    public boolean f24243h0;
    public ValueAnimator f24244i0;
    public boolean f24245j0;
    public Runnable f24246k0;
    public int f24247n;
    public final int f24248r;
    public float f24249s;
    public final p6 v;
    public final TextView f24250w;
    public float f24251x;
    public ViewGroup f24252y;

    public LimitPreviewView(Context context, int i10, int i11, d6 d6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, d6Var);
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
        this.f24247n = i10;
        float dp2 = AndroidUtilities.dp(14.0f);
        s sVar = this.f24238e;
        sVar.setTranslationX(Utilities.clamp((Math.max(this.f24247n, (getMeasuredWidth() - (dp * 2)) * f7) + dp2) - (sVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - dp) - sVar.getMeasuredWidth(), dp2));
        if (sVar.f46297s != f7) {
            sVar.f46297s = f7;
            sVar.v = true;
            sVar.invalidate();
        }
        sVar.setPivotX(sVar.getMeasuredWidth() * f7);
    }

    public final void d(org.telegram.tgnet.tl.TL_stars.Tl_starsRating r22, final org.telegram.tgnet.tl.TL_stars.Tl_starsRating r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.d(org.telegram.tgnet.tl.TL_stars$Tl_starsRating, org.telegram.tgnet.tl.TL_stars$Tl_starsRating):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.E == null) {
            if (this.f24240f) {
                float f7 = this.h + 0.016f;
                this.h = f7;
                if (f7 > 3.0f) {
                    this.f24240f = false;
                }
            } else {
                float f10 = this.h - 0.016f;
                this.h = f10;
                if (f10 < 1.0f) {
                    this.f24240f = true;
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
        p6 p6Var = this.N;
        p6 p6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f24231a = 1.0f;
            p6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            p6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f24231a = q.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            p6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            p6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) p6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24250w.setVisibility(8);
        this.O.setVisibility(8);
        p6Var2.setTextColor(i6.v0(i6.G6, this.S));
        p6Var.setTextColor(-1);
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
        spannableStringBuilder.append((CharSequence) "d").setSpan(new rq(this.f24248r, 0), 0, 1, 0);
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
        spannableStringBuilder.setSpan(new ou(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s sVar = this.f24238e;
        sVar.f46294f = spannableStringBuilder;
        sVar.requestLayout();
    }

    public final void g(int i10, boolean z10) {
        rq rqVar;
        char c10;
        int i11;
        if (i10 < 0) {
            rqVar = new rq(R.drawable.warning_sign, 0);
        } else {
            rqVar = new rq(this.f24248r, 0);
            float f7 = this.f24249s;
            rqVar.setScale(f7, f7);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(rqVar, 0, 1, 0);
        if (i10 >= 0 || !this.f24243h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        s sVar = this.f24238e;
        if (!z10) {
            sVar.f46294f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = sVar.f46294f;
            sVar.f46294f = spannableStringBuilder;
            TextPaint textPaint = sVar.f46292c;
            ArrayList arrayList = sVar.h;
            if (sVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sVar.f46294f);
                int length = sVar.f46294f.length() - 1;
                int i12 = 0;
                while (length >= 0) {
                    if (length < spannableStringBuilder2.length()) {
                        c10 = spannableStringBuilder2.charAt(length);
                    } else {
                        c10 = ' ';
                    }
                    if (c10 != sVar.f46294f.charAt(length) && Character.isDigit(sVar.f46294f.charAt(length))) {
                        r rVar = new r();
                        arrayList.add(rVar);
                        rVar.f46275e = sVar.d.getSecondaryHorizontal(length);
                        rVar.f46272a = r62;
                        if (i12 >= r62) {
                            i12 = 0;
                        }
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + c10, textPaint, (int) sVar.f46293e, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = rVar.f46273b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + sVar.f46294f.charAt(i11), textPaint, (int) sVar.f46293e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new oz(false), i11, i11 + 1, 0);
                        i12++;
                    } else {
                        i11 = length;
                    }
                    length = i11 - 1;
                    r62 = 1;
                }
                sVar.f46295n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) sVar.f46293e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    sVar.f46296r = true;
                    r rVar2 = (r) arrayList.get(i13);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f46276f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 0));
                    rVar2.f46276f.addListener(new rg.q(sVar, rVar2, 1));
                    rVar2.f46276f.setInterpolator(tr.f31141g);
                    rVar2.f46276f.setDuration(250L);
                    rVar2.f46276f.setStartDelay(((arrayList.size() - 1) - i13) * 60);
                    rVar2.f46276f.start();
                }
            }
        }
        sVar.requestLayout();
    }

    @Override
    public final void onLayout(boolean r30, int r31, int r32, int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.onLayout(boolean, int, int, int, int):void");
    }

    public void setBagePosition(float f7) {
        this.f24251x = q.a(f7, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(t tVar) {
        this.f24239e0 = tVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f24243h0 = z10;
    }

    public void setIconScale(float f7) {
        this.f24249s = f7;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f24252y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        int v02;
        this.L = false;
        int i10 = i6.Oh;
        d6 d6Var = this.S;
        int v03 = i6.v0(i10, d6Var);
        Paint paint = this.K;
        paint.setColor(v03);
        long j3 = tl_starsRating.current_level_stars;
        long j10 = tl_starsRating.stars;
        p6 p6Var = this.N;
        p6 p6Var2 = this.v;
        if (j10 <= 0) {
            this.f24231a = 0.5f;
            p6Var.setText("");
            p6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(i6.v0(i6.wj, d6Var));
            this.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                this.f24231a = 1.0f;
                p6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                p6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f24231a = q.a(((float) (j10 - j3)) / ((float) (j11 - j3)), 0.0f, 1.0f);
                p6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                p6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) p6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24250w.setVisibility(8);
        this.O.setVisibility(8);
        if (this.L) {
            v02 = -1;
        } else {
            v02 = i6.v0(i6.G6, d6Var);
        }
        p6Var2.setTextColor(v02);
        p6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    public void setStaticGradinet(a1 a1Var) {
        this.E = a1Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.f24233b == i10) {
            z10 = false;
        }
        this.f24233b = i10;
        this.f24231a = q.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.f24232a0 = this.f24247n;
            this.I.requestLayout();
            requestLayout();
        }
        p6 p6Var = this.v;
        ((FrameLayout.LayoutParams) p6Var.getLayoutParams()).gravity = 5;
        this.f24250w.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        p6Var.setText("" + i11);
        g(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        String str;
        p6 p6Var = this.v;
        int i11 = this.f24248r;
        s sVar = this.f24238e;
        if (i10 == 6) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new rq(i11, 0), 0, 1, 0);
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                sVar.f46294f = spannableStringBuilder;
            }
            p6Var.setText("4 GB");
        } else if (i10 == 11) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new rq(i11, 0), 0, 1, 0);
                sVar.f46294f = spannableStringBuilder2;
            }
            p6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, d6 d6Var) {
        super(context);
        this.f24249s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.f24237d0 = true;
        this.S = d6Var;
        this.f24231a = q.a(f7, 0.1f, 0.9f);
        this.f24248r = i10;
        this.f24233b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            s sVar = new s(this, context);
            this.f24238e = sVar;
            g(i11, false);
            sVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(sVar, z5.o(-2, -2, 0.0f, 3));
        }
        vg0 vg0Var = new vg0(this, context, true);
        this.f24241f0 = vg0Var;
        p6 p6Var = new p6(context, false, false, false);
        this.N = p6Var;
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setText(LocaleController.getString(R.string.LimitFree));
        p6Var.setGravity(16);
        int i13 = i6.G6;
        p6Var.setTextColor(i6.v0(i13, d6Var));
        TextView textView = new TextView(context);
        this.f24250w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(i6.v0(i13, d6Var));
        if (LocaleController.isRTL) {
            vg0Var.addView(p6Var, z5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            vg0Var.addView(textView, z5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            vg0Var.addView(p6Var, z5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            vg0Var.addView(textView, z5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        vg0 vg0Var2 = new vg0(this, context, false);
        this.f24242g0 = vg0Var2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        p6 p6Var2 = new p6(context, false, false, false);
        this.v = p6Var2;
        p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var2.setTypeface(AndroidUtilities.bold());
        p6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        p6Var2.setGravity(21);
        p6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            vg0Var2.addView(textView2, z5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            vg0Var2.addView(p6Var2, z5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            vg0Var2.addView(textView2, z5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            vg0Var2.addView(p6Var2, z5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        u5 u5Var = new u5(this, context, d6Var);
        this.I = u5Var;
        u5Var.addView(vg0Var, z5.c(30.0f, -1));
        u5Var.addView(vg0Var2, z5.c(30.0f, -1));
        addView(u5Var, z5.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
