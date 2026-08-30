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
import dg.s1;
import eg.q1;
import eg.t;
import eg.u;
import eg.v;
import eg.w;
import eg.x;
import eg.y;
import java.util.ArrayList;
import k7.b6;
import k7.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
public class LimitPreviewView extends LinearLayout {
    public static final int f23090i0 = 0;
    public q1 B;
    public int C;
    public boolean D;
    public boolean E;
    public final s1 F;
    public boolean G;
    public final Paint H;
    public boolean I;
    public boolean J;
    public final k6 K;
    public final TextView L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final f6 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public float f23091a;
    public boolean f23092a0;
    public int f23093b;
    public x f23094b0;
    public int f23095c;
    public final y f23096c0;
    public boolean d;
    public final y f23097d0;
    public final w e;
    public boolean f23098e0;
    public boolean f23099f;
    public ValueAnimator f23100f0;
    public boolean f23101g0;
    public float h;
    public Runnable f23102h0;
    public int f23103n;
    public final int f23104r;
    public float f23105s;
    public final k6 v;
    public final TextView f23106w;
    public float f23107x;
    public ViewGroup f23108y;

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

    private void setArrowX(float f10) {
        int i10;
        int dp;
        if (f10 >= 1.0f) {
            i10 = this.F.getMeasuredWidth();
        } else {
            i10 = 0;
        }
        this.f23103n = i10;
        float dp2 = AndroidUtilities.dp(14.0f);
        w wVar = this.e;
        wVar.setTranslationX(Utilities.clamp((Math.max(this.f23103n, (getMeasuredWidth() - (dp * 2)) * f10) + dp2) - (wVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - dp) - wVar.getMeasuredWidth(), dp2));
        if (wVar.f5566s != f10) {
            wVar.f5566s = f10;
            wVar.v = true;
            wVar.invalidate();
        }
        wVar.setPivotX(wVar.getMeasuredWidth() * f10);
    }

    public final void d(org.telegram.tgnet.tl.TL_stars.Tl_starsRating r22, final org.telegram.tgnet.tl.TL_stars.Tl_starsRating r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.d(org.telegram.tgnet.tl.TL_stars$Tl_starsRating, org.telegram.tgnet.tl.TL_stars$Tl_starsRating):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.B == null) {
            if (this.f23099f) {
                float f10 = this.h + 0.016f;
                this.h = f10;
                if (f10 > 3.0f) {
                    this.f23099f = false;
                }
            } else {
                float f11 = this.h - 0.016f;
                this.h = f11;
                if (f11 < 1.0f) {
                    this.f23099f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z4) {
        int i10;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.boosts;
        k6 k6Var = this.K;
        k6 k6Var2 = this.v;
        if ((i11 == i12 && z4) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f23091a = 1.0f;
            k6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            k6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f23091a = n.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            k6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            k6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) k6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f23106w.setVisibility(8);
        this.L.setVisibility(8);
        k6Var2.setTextColor(j6.v0(j6.G6, this.P));
        k6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.M = true;
    }

    public final void f(int i10, int i11) {
        String formatNumber;
        String formatNumber2;
        if (i10 < 0) {
            g(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new mq(this.f23104r, 0), 0, 1, 0);
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
        spannableStringBuilder.setSpan(new fu(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        w wVar = this.e;
        wVar.f5563f = spannableStringBuilder;
        wVar.requestLayout();
    }

    public final void g(int i10, boolean z4) {
        mq mqVar;
        char c3;
        int i11;
        if (i10 < 0) {
            mqVar = new mq(R.drawable.warning_sign, 0);
        } else {
            mqVar = new mq(this.f23104r, 0);
            float f10 = this.f23105s;
            mqVar.setScale(f10, f10);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(mqVar, 0, 1, 0);
        if (i10 >= 0 || !this.f23098e0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        w wVar = this.e;
        if (!z4) {
            wVar.f5563f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = wVar.f5563f;
            wVar.f5563f = spannableStringBuilder;
            TextPaint textPaint = wVar.f5562c;
            ArrayList arrayList = wVar.h;
            if (wVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(wVar.f5563f);
                int length = wVar.f5563f.length() - 1;
                int i12 = 0;
                while (length >= 0) {
                    if (length < spannableStringBuilder2.length()) {
                        c3 = spannableStringBuilder2.charAt(length);
                    } else {
                        c3 = ' ';
                    }
                    if (c3 != wVar.f5563f.charAt(length) && Character.isDigit(wVar.f5563f.charAt(length))) {
                        v vVar = new v();
                        arrayList.add(vVar);
                        vVar.e = wVar.d.getSecondaryHorizontal(length);
                        vVar.f5530a = r62;
                        if (i12 >= r62) {
                            i12 = 0;
                        }
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + c3, textPaint, (int) wVar.e, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = vVar.f5531b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + wVar.f5563f.charAt(i11), textPaint, (int) wVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new lz(false), i11, i11 + 1, 0);
                        i12++;
                    } else {
                        i11 = length;
                    }
                    length = i11 - 1;
                    r62 = 1;
                }
                wVar.f5564n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) wVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    wVar.f5565r = true;
                    v vVar2 = (v) arrayList.get(i13);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vVar2.f5533f = ofFloat;
                    ofFloat.addUpdateListener(new t(wVar, vVar2, 0));
                    vVar2.f5533f.addListener(new u(wVar, vVar2, 1));
                    vVar2.f5533f.setInterpolator(nr.f27347g);
                    vVar2.f5533f.setDuration(250L);
                    vVar2.f5533f.setStartDelay(((arrayList.size() - 1) - i13) * 60);
                    vVar2.f5533f.start();
                }
            }
        }
        wVar.requestLayout();
    }

    @Override
    public final void onLayout(boolean r30, int r31, int r32, int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.onLayout(boolean, int, int, int, int):void");
    }

    public void setBagePosition(float f10) {
        this.f23107x = n.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(x xVar) {
        this.f23094b0 = xVar;
    }

    public void setHideNegativeValues(boolean z4) {
        this.f23098e0 = z4;
    }

    public void setIconScale(float f10) {
        this.f23105s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f23108y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        int v02;
        this.I = false;
        int i10 = j6.Oh;
        f6 f6Var = this.P;
        int v03 = j6.v0(i10, f6Var);
        Paint paint = this.H;
        paint.setColor(v03);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        k6 k6Var = this.K;
        k6 k6Var2 = this.v;
        if (j11 <= 0) {
            this.f23091a = 0.5f;
            k6Var.setText("");
            k6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(j6.v0(j6.wj, f6Var));
            this.I = true;
        } else {
            long j12 = tl_starsRating.next_level_stars;
            if (j12 == 0) {
                this.f23091a = 1.0f;
                k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f23091a = n.a(((float) (j11 - j10)) / ((float) (j12 - j10)), 0.0f, 1.0f);
                k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) k6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f23106w.setVisibility(8);
        this.L.setVisibility(8);
        if (this.I) {
            v02 = -1;
        } else {
            v02 = j6.v0(j6.G6, f6Var);
        }
        k6Var2.setTextColor(v02);
        k6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.M = true;
        this.N = true;
        this.O = true;
    }

    public void setStaticGradinet(q1 q1Var) {
        this.B = q1Var;
    }

    public void setStatus(int i10, int i11, boolean z4) {
        if (this.f23093b == i10) {
            z4 = false;
        }
        this.f23093b = i10;
        this.f23091a = n.a(i10 / i11, 0.0f, 1.0f);
        if (z4) {
            this.T = true;
            this.U = this.f23103n;
            this.F.requestLayout();
            requestLayout();
        }
        k6 k6Var = this.v;
        ((FrameLayout.LayoutParams) k6Var.getLayoutParams()).gravity = 5;
        this.f23106w.setVisibility(8);
        this.L.setVisibility(8);
        this.K.setText("0");
        k6Var.setText("" + i11);
        g(i10, false);
        this.M = true;
        this.N = true;
    }

    public void setType(int i10) {
        String str;
        k6 k6Var = this.v;
        int i11 = this.f23104r;
        w wVar = this.e;
        if (i10 == 6) {
            if (wVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new mq(i11, 0), 0, 1, 0);
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                wVar.f5563f = spannableStringBuilder;
            }
            k6Var.setText("4 GB");
        } else if (i10 == 11) {
            if (wVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new mq(i11, 0), 0, 1, 0);
                wVar.f5563f = spannableStringBuilder2;
            }
            k6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f10, f6 f6Var) {
        super(context);
        this.f23105s = 1.0f;
        this.E = true;
        this.H = new Paint(1);
        this.f23092a0 = true;
        this.P = f6Var;
        this.f23091a = n.a(f10, 0.1f, 0.9f);
        this.f23104r = i10;
        this.f23093b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            w wVar = new w(this, context);
            this.e = wVar;
            g(i11, false);
            wVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(wVar, b6.o(-2, -2, 0.0f, 3));
        }
        y yVar = new y(this, context, true);
        this.f23096c0 = yVar;
        k6 k6Var = new k6(context, false, false, false);
        this.K = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setText(LocaleController.getString(R.string.LimitFree));
        k6Var.setGravity(16);
        int i13 = j6.G6;
        k6Var.setTextColor(j6.v0(i13, f6Var));
        TextView textView = new TextView(context);
        this.f23106w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(j6.v0(i13, f6Var));
        if (LocaleController.isRTL) {
            yVar.addView(k6Var, b6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar.addView(textView, b6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yVar.addView(k6Var, b6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar.addView(textView, b6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        y yVar2 = new y(this, context, false);
        this.f23097d0 = yVar2;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        k6 k6Var2 = new k6(context, false, false, false);
        this.v = k6Var2;
        k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var2.setTypeface(AndroidUtilities.bold());
        k6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        k6Var2.setGravity(21);
        k6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            yVar2.addView(textView2, b6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar2.addView(k6Var2, b6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yVar2.addView(textView2, b6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar2.addView(k6Var2, b6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        s1 s1Var = new s1(this, context, f6Var);
        this.F = s1Var;
        s1Var.addView(yVar, b6.c(30.0f, -1));
        s1Var.addView(yVar2, b6.c(30.0f, -1));
        addView(s1Var, b6.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
