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
import bg.u1;
import cg.r1;
import cg.t;
import cg.u;
import cg.v;
import cg.w;
import cg.x;
import cg.y;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.o6;
public class LimitPreviewView extends LinearLayout {
    public static final int f26457h0 = 0;
    public r1 A;
    public int B;
    public boolean C;
    public boolean D;
    public final u1 E;
    public boolean F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public final o6 J;
    public final TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final c6 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public boolean W;
    public float f26458a;
    public x f26459a0;
    public int f26460b;
    public final y f26461b0;
    public int f26462c;
    public final y f26463c0;
    public boolean d;
    public boolean f26464d0;
    public final w f26465e;
    public ValueAnimator f26466e0;
    public boolean f26467f;
    public boolean f26468f0;
    public Runnable f26469g0;
    public float h;
    public int f26470n;
    public final int f26471r;
    public float f26472s;
    public final o6 v;
    public final TextView f26473w;
    public float f26474x;
    public ViewGroup f26475y;

    public LimitPreviewView(Context context, int i10, int i11, c6 c6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, c6Var);
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

    private void setArrowX(float f9) {
        int i10;
        int dp;
        if (f9 >= 1.0f) {
            i10 = this.E.getMeasuredWidth();
        } else {
            i10 = 0;
        }
        this.f26470n = i10;
        float dp2 = AndroidUtilities.dp(14.0f);
        w wVar = this.f26465e;
        wVar.setTranslationX(Utilities.clamp((Math.max(this.f26470n, (getMeasuredWidth() - (dp * 2)) * f9) + dp2) - (wVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - dp) - wVar.getMeasuredWidth(), dp2));
        if (wVar.f3437s != f9) {
            wVar.f3437s = f9;
            wVar.v = true;
            wVar.invalidate();
        }
        wVar.setPivotX(wVar.getMeasuredWidth() * f9);
    }

    public final void d(org.telegram.tgnet.tl.TL_stars.Tl_starsRating r22, final org.telegram.tgnet.tl.TL_stars.Tl_starsRating r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.d(org.telegram.tgnet.tl.TL_stars$Tl_starsRating, org.telegram.tgnet.tl.TL_stars$Tl_starsRating):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.A == null) {
            if (this.f26467f) {
                float f9 = this.h + 0.016f;
                this.h = f9;
                if (f9 > 3.0f) {
                    this.f26467f = false;
                }
            } else {
                float f10 = this.h - 0.016f;
                this.h = f10;
                if (f10 < 1.0f) {
                    this.f26467f = true;
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
        o6 o6Var = this.J;
        o6 o6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f26458a = 1.0f;
            o6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            o6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f26458a = i7.w.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            o6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            o6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f26473w.setVisibility(8);
        this.K.setVisibility(8);
        o6Var2.setTextColor(g6.v0(g6.G6, this.O));
        o6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.L = true;
    }

    public final void f(int i10, int i11) {
        String formatNumber;
        String formatNumber2;
        if (i10 < 0) {
            g(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new iq(this.f26471r, 0), 0, 1, 0);
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
        spannableStringBuilder.setSpan(new cu(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        w wVar = this.f26465e;
        wVar.f3434f = spannableStringBuilder;
        wVar.requestLayout();
    }

    public final void g(int i10, boolean z10) {
        iq iqVar;
        char c3;
        int i11;
        if (i10 < 0) {
            iqVar = new iq(R.drawable.warning_sign, 0);
        } else {
            iqVar = new iq(this.f26471r, 0);
            float f9 = this.f26472s;
            iqVar.setScale(f9, f9);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r6 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(iqVar, 0, 1, 0);
        if (i10 >= 0 || !this.f26464d0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        w wVar = this.f26465e;
        if (!z10) {
            wVar.f3434f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = wVar.f3434f;
            wVar.f3434f = spannableStringBuilder;
            TextPaint textPaint = wVar.f3432c;
            ArrayList arrayList = wVar.h;
            if (wVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(wVar.f3434f);
                int length = wVar.f3434f.length() - 1;
                int i12 = 0;
                while (length >= 0) {
                    if (length < spannableStringBuilder2.length()) {
                        c3 = spannableStringBuilder2.charAt(length);
                    } else {
                        c3 = ' ';
                    }
                    if (c3 != wVar.f3434f.charAt(length) && Character.isDigit(wVar.f3434f.charAt(length))) {
                        v vVar = new v();
                        arrayList.add(vVar);
                        vVar.f3399e = wVar.d.getSecondaryHorizontal(length);
                        vVar.f3396a = r6;
                        if (i12 >= r6) {
                            i12 = 0;
                        }
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + c3, textPaint, (int) wVar.f3433e, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = vVar.f3397b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + wVar.f3434f.charAt(i11), textPaint, (int) wVar.f3433e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new gz(false), i11, i11 + 1, 0);
                        i12++;
                    } else {
                        i11 = length;
                    }
                    length = i11 - 1;
                    r6 = 1;
                }
                wVar.f3435n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) wVar.f3433e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    wVar.f3436r = true;
                    v vVar2 = (v) arrayList.get(i13);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vVar2.f3400f = ofFloat;
                    ofFloat.addUpdateListener(new t(wVar, vVar2, 0));
                    vVar2.f3400f.addListener(new u(wVar, vVar2, 1));
                    vVar2.f3400f.setInterpolator(jr.f29801g);
                    vVar2.f3400f.setDuration(250L);
                    vVar2.f3400f.setStartDelay(((arrayList.size() - 1) - i13) * 60);
                    vVar2.f3400f.start();
                }
            }
        }
        wVar.requestLayout();
    }

    @Override
    public final void onLayout(boolean r30, int r31, int r32, int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.LimitPreviewView.onLayout(boolean, int, int, int, int):void");
    }

    public void setBagePosition(float f9) {
        this.f26474x = i7.w.a(f9, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(x xVar) {
        this.f26459a0 = xVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f26464d0 = z10;
    }

    public void setIconScale(float f9) {
        this.f26472s = f9;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f26475y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        int v02;
        this.H = false;
        int i10 = g6.Oh;
        c6 c6Var = this.O;
        int v03 = g6.v0(i10, c6Var);
        Paint paint = this.G;
        paint.setColor(v03);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        o6 o6Var = this.J;
        o6 o6Var2 = this.v;
        if (j11 <= 0) {
            this.f26458a = 0.5f;
            o6Var.setText("");
            o6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(g6.v0(g6.wj, c6Var));
            this.H = true;
        } else {
            long j12 = tl_starsRating.next_level_stars;
            if (j12 == 0) {
                this.f26458a = 1.0f;
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f26458a = i7.w.a(((float) (j11 - j10)) / ((float) (j12 - j10)), 0.0f, 1.0f);
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f26473w.setVisibility(8);
        this.K.setVisibility(8);
        if (this.H) {
            v02 = -1;
        } else {
            v02 = g6.v0(g6.G6, c6Var);
        }
        o6Var2.setTextColor(v02);
        o6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.L = true;
        this.M = true;
        this.N = true;
    }

    public void setStaticGradinet(r1 r1Var) {
        this.A = r1Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.f26460b == i10) {
            z10 = false;
        }
        this.f26460b = i10;
        this.f26458a = i7.w.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.S = true;
            this.T = this.f26470n;
            this.E.requestLayout();
            requestLayout();
        }
        o6 o6Var = this.v;
        ((FrameLayout.LayoutParams) o6Var.getLayoutParams()).gravity = 5;
        this.f26473w.setVisibility(8);
        this.K.setVisibility(8);
        this.J.setText("0");
        o6Var.setText("" + i11);
        g(i10, false);
        this.L = true;
        this.M = true;
    }

    public void setType(int i10) {
        String str;
        o6 o6Var = this.v;
        int i11 = this.f26471r;
        w wVar = this.f26465e;
        if (i10 == 6) {
            if (wVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new iq(i11, 0), 0, 1, 0);
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                wVar.f3434f = spannableStringBuilder;
            }
            o6Var.setText("4 GB");
        } else if (i10 == 11) {
            if (wVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new iq(i11, 0), 0, 1, 0);
                wVar.f3434f = spannableStringBuilder2;
            }
            o6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f9, c6 c6Var) {
        super(context);
        this.f26472s = 1.0f;
        this.D = true;
        this.G = new Paint(1);
        this.W = true;
        this.O = c6Var;
        this.f26458a = i7.w.a(f9, 0.1f, 0.9f);
        this.f26471r = i10;
        this.f26460b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            w wVar = new w(this, context);
            this.f26465e = wVar;
            g(i11, false);
            wVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(wVar, f6.o(-2, -2, 0.0f, 3));
        }
        y yVar = new y(this, context, true);
        this.f26461b0 = yVar;
        o6 o6Var = new o6(context, false, false, false);
        this.J = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setText(LocaleController.getString(R.string.LimitFree));
        o6Var.setGravity(16);
        int i13 = g6.G6;
        o6Var.setTextColor(g6.v0(i13, c6Var));
        TextView textView = new TextView(context);
        this.f26473w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(g6.v0(i13, c6Var));
        if (LocaleController.isRTL) {
            yVar.addView(o6Var, f6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar.addView(textView, f6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yVar.addView(o6Var, f6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar.addView(textView, f6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        y yVar2 = new y(this, context, false);
        this.f26463c0 = yVar2;
        TextView textView2 = new TextView(context);
        this.K = textView2;
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
            yVar2.addView(textView2, f6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar2.addView(o6Var2, f6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yVar2.addView(textView2, f6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar2.addView(o6Var2, f6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        u1 u1Var = new u1(this, context, c6Var);
        this.E = u1Var;
        u1Var.addView(yVar, f6.c(30.0f, -1));
        u1Var.addView(yVar2, f6.c(30.0f, -1));
        addView(u1Var, f6.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
