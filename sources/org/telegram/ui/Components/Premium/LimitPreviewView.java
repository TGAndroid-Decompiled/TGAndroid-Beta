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
import eg.q1;
import fg.p1;
import fg.t;
import fg.u;
import fg.v;
import fg.w;
import fg.x;
import fg.y;
import java.util.ArrayList;
import k7.c6;
import k7.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
public class LimitPreviewView extends LinearLayout {
    public static final int f24943i0 = 0;
    public p1 B;
    public int C;
    public boolean D;
    public boolean E;
    public final q1 F;
    public boolean G;
    public final Paint H;
    public boolean I;
    public boolean J;
    public final k6 K;
    public final TextView L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final g6 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public float f24944a;
    public boolean f24945a0;
    public int f24946b;
    public x f24947b0;
    public int f24948c;
    public final y f24949c0;
    public boolean d;
    public final y f24950d0;
    public final w f24951e;
    public boolean f24952e0;
    public boolean f24953f;
    public ValueAnimator f24954f0;
    public boolean f24955g0;
    public float h;
    public Runnable f24956h0;
    public int f24957n;
    public final int f24958r;
    public float f24959s;
    public final k6 v;
    public final TextView f24960w;
    public float f24961x;
    public ViewGroup f24962y;

    public LimitPreviewView(Context context, int i10, int i11, g6 g6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, g6Var);
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
        this.f24957n = i10;
        float dp2 = AndroidUtilities.dp(14.0f);
        w wVar = this.f24951e;
        wVar.setTranslationX(Utilities.clamp((Math.max(this.f24957n, (getMeasuredWidth() - (dp * 2)) * f10) + dp2) - (wVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - dp) - wVar.getMeasuredWidth(), dp2));
        if (wVar.f6616s != f10) {
            wVar.f6616s = f10;
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
            if (this.f24953f) {
                float f10 = this.h + 0.016f;
                this.h = f10;
                if (f10 > 3.0f) {
                    this.f24953f = false;
                }
            } else {
                float f11 = this.h - 0.016f;
                this.h = f11;
                if (f11 < 1.0f) {
                    this.f24953f = true;
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
            this.f24944a = 1.0f;
            k6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            k6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f24944a = o.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            k6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            k6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) k6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24960w.setVisibility(8);
        this.L.setVisibility(8);
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.P));
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
        spannableStringBuilder.append((CharSequence) "d").setSpan(new oq(this.f24958r, 0), 0, 1, 0);
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
        spannableStringBuilder.setSpan(new hu(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        w wVar = this.f24951e;
        wVar.f6613f = spannableStringBuilder;
        wVar.requestLayout();
    }

    public final void g(int i10, boolean z4) {
        oq oqVar;
        char c3;
        int i11;
        if (i10 < 0) {
            oqVar = new oq(R.drawable.warning_sign, 0);
        } else {
            oqVar = new oq(this.f24958r, 0);
            float f10 = this.f24959s;
            oqVar.setScale(f10, f10);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(oqVar, 0, 1, 0);
        if (i10 >= 0 || !this.f24952e0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        w wVar = this.f24951e;
        if (!z4) {
            wVar.f6613f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = wVar.f6613f;
            wVar.f6613f = spannableStringBuilder;
            TextPaint textPaint = wVar.f6611c;
            ArrayList arrayList = wVar.h;
            if (wVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(wVar.f6613f);
                int length = wVar.f6613f.length() - 1;
                int i12 = 0;
                while (length >= 0) {
                    if (length < spannableStringBuilder2.length()) {
                        c3 = spannableStringBuilder2.charAt(length);
                    } else {
                        c3 = ' ';
                    }
                    if (c3 != wVar.f6613f.charAt(length) && Character.isDigit(wVar.f6613f.charAt(length))) {
                        v vVar = new v();
                        arrayList.add(vVar);
                        vVar.f6579e = wVar.d.getSecondaryHorizontal(length);
                        vVar.f6576a = r62;
                        if (i12 >= r62) {
                            i12 = 0;
                        }
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + c3, textPaint, (int) wVar.f6612e, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = vVar.f6577b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + wVar.f6613f.charAt(i11), textPaint, (int) wVar.f6612e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new nz(false), i11, i11 + 1, 0);
                        i12++;
                    } else {
                        i11 = length;
                    }
                    length = i11 - 1;
                    r62 = 1;
                }
                wVar.f6614n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) wVar.f6612e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    wVar.f6615r = true;
                    v vVar2 = (v) arrayList.get(i13);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vVar2.f6580f = ofFloat;
                    ofFloat.addUpdateListener(new t(wVar, vVar2, 0));
                    vVar2.f6580f.addListener(new u(wVar, vVar2, 1));
                    vVar2.f6580f.setInterpolator(pr.f30184g);
                    vVar2.f6580f.setDuration(250L);
                    vVar2.f6580f.setStartDelay(((arrayList.size() - 1) - i13) * 60);
                    vVar2.f6580f.start();
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
        this.f24961x = o.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(x xVar) {
        this.f24947b0 = xVar;
    }

    public void setHideNegativeValues(boolean z4) {
        this.f24952e0 = z4;
    }

    public void setIconScale(float f10) {
        this.f24959s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f24962y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        int v02;
        this.I = false;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        g6 g6Var = this.P;
        int v03 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        Paint paint = this.H;
        paint.setColor(v03);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        k6 k6Var = this.K;
        k6 k6Var2 = this.v;
        if (j11 <= 0) {
            this.f24944a = 0.5f;
            k6Var.setText("");
            k6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.wj, g6Var));
            this.I = true;
        } else {
            long j12 = tl_starsRating.next_level_stars;
            if (j12 == 0) {
                this.f24944a = 1.0f;
                k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f24944a = o.a(((float) (j11 - j10)) / ((float) (j12 - j10)), 0.0f, 1.0f);
                k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) k6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f24960w.setVisibility(8);
        this.L.setVisibility(8);
        if (this.I) {
            v02 = -1;
        } else {
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var);
        }
        k6Var2.setTextColor(v02);
        k6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.M = true;
        this.N = true;
        this.O = true;
    }

    public void setStaticGradinet(p1 p1Var) {
        this.B = p1Var;
    }

    public void setStatus(int i10, int i11, boolean z4) {
        if (this.f24946b == i10) {
            z4 = false;
        }
        this.f24946b = i10;
        this.f24944a = o.a(i10 / i11, 0.0f, 1.0f);
        if (z4) {
            this.T = true;
            this.U = this.f24957n;
            this.F.requestLayout();
            requestLayout();
        }
        k6 k6Var = this.v;
        ((FrameLayout.LayoutParams) k6Var.getLayoutParams()).gravity = 5;
        this.f24960w.setVisibility(8);
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
        int i11 = this.f24958r;
        w wVar = this.f24951e;
        if (i10 == 6) {
            if (wVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new oq(i11, 0), 0, 1, 0);
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                wVar.f6613f = spannableStringBuilder;
            }
            k6Var.setText("4 GB");
        } else if (i10 == 11) {
            if (wVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new oq(i11, 0), 0, 1, 0);
                wVar.f6613f = spannableStringBuilder2;
            }
            k6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f10, g6 g6Var) {
        super(context);
        this.f24959s = 1.0f;
        this.E = true;
        this.H = new Paint(1);
        this.f24945a0 = true;
        this.P = g6Var;
        this.f24944a = o.a(f10, 0.1f, 0.9f);
        this.f24958r = i10;
        this.f24946b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            w wVar = new w(this, context);
            this.f24951e = wVar;
            g(i11, false);
            wVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(wVar, c6.o(-2, -2, 0.0f, 3));
        }
        y yVar = new y(this, context, true);
        this.f24949c0 = yVar;
        k6 k6Var = new k6(context, false, false, false);
        this.K = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setText(LocaleController.getString(R.string.LimitFree));
        k6Var.setGravity(16);
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        TextView textView = new TextView(context);
        this.f24960w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        if (LocaleController.isRTL) {
            yVar.addView(k6Var, c6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar.addView(textView, c6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yVar.addView(k6Var, c6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar.addView(textView, c6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        y yVar2 = new y(this, context, false);
        this.f24950d0 = yVar2;
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
            yVar2.addView(textView2, c6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar2.addView(k6Var2, c6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yVar2.addView(textView2, c6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar2.addView(k6Var2, c6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        q1 q1Var = new q1(this, context, g6Var);
        this.F = q1Var;
        q1Var.addView(yVar, c6.c(30.0f, -1));
        q1Var.addView(yVar2, c6.c(30.0f, -1));
        addView(q1Var, c6.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
