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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.t5;
import rg.q;
import rg.r;
import rg.s;
import rg.t;
import rg.z0;
import w7.p;
import w7.x5;
public class LimitPreviewView extends LinearLayout {
    public static final int f22100l0 = 0;
    public z0 E;
    public int F;
    public boolean G;
    public boolean H;
    public final t5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final n6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final e6 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float f22101a;
    public int f22102a0;
    public int f22103b;
    public float f22104b0;
    public int f22105c;
    public boolean f22106c0;
    public boolean d;
    public boolean f22107d0;
    public final s e;
    public t f22108e0;
    public boolean f22109f;
    public final ig0 f22110f0;
    public final ig0 f22111g0;
    public float h;
    public boolean f22112h0;
    public ValueAnimator f22113i0;
    public boolean f22114j0;
    public Runnable f22115k0;
    public int f22116n;
    public final int f22117r;
    public float f22118s;
    public final n6 v;
    public final TextView f22119w;
    public float f22120x;
    public ViewGroup f22121y;

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
        this.f22116n = i10;
        float dp2 = AndroidUtilities.dp(14.0f);
        s sVar = this.e;
        sVar.setTranslationX(Utilities.clamp((Math.max(this.f22116n, (getMeasuredWidth() - (dp * 2)) * f7) + dp2) - (sVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - dp) - sVar.getMeasuredWidth(), dp2));
        if (sVar.f42463s != f7) {
            sVar.f42463s = f7;
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
            if (this.f22109f) {
                float f7 = this.h + 0.016f;
                this.h = f7;
                if (f7 > 3.0f) {
                    this.f22109f = false;
                }
            } else {
                float f10 = this.h - 0.016f;
                this.h = f10;
                if (f10 < 1.0f) {
                    this.f22109f = true;
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
        n6 n6Var = this.N;
        n6 n6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f22101a = 1.0f;
            n6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            n6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f22101a = p.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            n6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            n6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) n6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f22119w.setVisibility(8);
        this.O.setVisibility(8);
        n6Var2.setTextColor(i6.v0(i6.G6, this.S));
        n6Var.setTextColor(-1);
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
        spannableStringBuilder.append((CharSequence) "d").setSpan(new oq(this.f22117r, 0), 0, 1, 0);
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
        spannableStringBuilder.setSpan(new lu(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s sVar = this.e;
        sVar.f42460f = spannableStringBuilder;
        sVar.requestLayout();
    }

    public final void g(int i10, boolean z10) {
        oq oqVar;
        char c10;
        int i11;
        if (i10 < 0) {
            oqVar = new oq(R.drawable.warning_sign, 0);
        } else {
            oqVar = new oq(this.f22117r, 0);
            float f7 = this.f22118s;
            oqVar.setScale(f7, f7);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(oqVar, 0, 1, 0);
        if (i10 >= 0 || !this.f22112h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        s sVar = this.e;
        if (!z10) {
            sVar.f42460f = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = sVar.f42460f;
            sVar.f42460f = spannableStringBuilder;
            TextPaint textPaint = sVar.f42459c;
            ArrayList arrayList = sVar.h;
            if (sVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sVar.f42460f);
                int length = sVar.f42460f.length() - 1;
                int i12 = 0;
                while (length >= 0) {
                    if (length < spannableStringBuilder2.length()) {
                        c10 = spannableStringBuilder2.charAt(length);
                    } else {
                        c10 = ' ';
                    }
                    if (c10 != sVar.f42460f.charAt(length) && Character.isDigit(sVar.f42460f.charAt(length))) {
                        r rVar = new r();
                        arrayList.add(rVar);
                        rVar.e = sVar.d.getSecondaryHorizontal(length);
                        rVar.f42446a = r62;
                        if (i12 >= r62) {
                            i12 = 0;
                        }
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + c10, textPaint, (int) sVar.e, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = rVar.f42447b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + sVar.f42460f.charAt(i11), textPaint, (int) sVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new lz(false), i11, i11 + 1, 0);
                        i12++;
                    } else {
                        i11 = length;
                    }
                    length = i11 - 1;
                    r62 = 1;
                }
                sVar.f42461n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    sVar.f42462r = true;
                    r rVar2 = (r) arrayList.get(i13);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f42449f = ofFloat;
                    ofFloat.addUpdateListener(new rg.p(sVar, rVar2, 0));
                    rVar2.f42449f.addListener(new q(sVar, rVar2, 1));
                    rVar2.f42449f.setInterpolator(qr.f27424g);
                    rVar2.f42449f.setDuration(250L);
                    rVar2.f42449f.setStartDelay(((arrayList.size() - 1) - i13) * 60);
                    rVar2.f42449f.start();
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
        this.f22120x = p.a(f7, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(t tVar) {
        this.f22108e0 = tVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f22112h0 = z10;
    }

    public void setIconScale(float f7) {
        this.f22118s = f7;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f22121y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        int v02;
        this.L = false;
        int i10 = i6.Oh;
        e6 e6Var = this.S;
        int v03 = i6.v0(i10, e6Var);
        Paint paint = this.K;
        paint.setColor(v03);
        long j3 = tl_starsRating.current_level_stars;
        long j10 = tl_starsRating.stars;
        n6 n6Var = this.N;
        n6 n6Var2 = this.v;
        if (j10 <= 0) {
            this.f22101a = 0.5f;
            n6Var.setText("");
            n6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(i6.v0(i6.wj, e6Var));
            this.L = true;
        } else {
            long j11 = tl_starsRating.next_level_stars;
            if (j11 == 0) {
                this.f22101a = 1.0f;
                n6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                n6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f22101a = p.a(((float) (j10 - j3)) / ((float) (j11 - j3)), 0.0f, 1.0f);
                n6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                n6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) n6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f22119w.setVisibility(8);
        this.O.setVisibility(8);
        if (this.L) {
            v02 = -1;
        } else {
            v02 = i6.v0(i6.G6, e6Var);
        }
        n6Var2.setTextColor(v02);
        n6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    public void setStaticGradinet(z0 z0Var) {
        this.E = z0Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.f22103b == i10) {
            z10 = false;
        }
        this.f22103b = i10;
        this.f22101a = p.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.f22102a0 = this.f22116n;
            this.I.requestLayout();
            requestLayout();
        }
        n6 n6Var = this.v;
        ((FrameLayout.LayoutParams) n6Var.getLayoutParams()).gravity = 5;
        this.f22119w.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        n6Var.setText("" + i11);
        g(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        String str;
        n6 n6Var = this.v;
        int i11 = this.f22117r;
        s sVar = this.e;
        if (i10 == 6) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new oq(i11, 0), 0, 1, 0);
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    str = "4 GB";
                } else {
                    str = "2 GB";
                }
                spannableStringBuilder.append((CharSequence) str);
                sVar.f42460f = spannableStringBuilder;
            }
            n6Var.setText("4 GB");
        } else if (i10 == 11) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new oq(i11, 0), 0, 1, 0);
                sVar.f42460f = spannableStringBuilder2;
            }
            n6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, e6 e6Var) {
        super(context);
        this.f22118s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.f22107d0 = true;
        this.S = e6Var;
        this.f22101a = p.a(f7, 0.1f, 0.9f);
        this.f22117r = i10;
        this.f22103b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            s sVar = new s(this, context);
            this.e = sVar;
            g(i11, false);
            sVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(sVar, x5.o(-2, -2, 0.0f, 3));
        }
        ig0 ig0Var = new ig0(this, context, true);
        this.f22110f0 = ig0Var;
        n6 n6Var = new n6(context, false, false, false);
        this.N = n6Var;
        n6Var.setTextSize(AndroidUtilities.dp(14.0f));
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setText(LocaleController.getString(R.string.LimitFree));
        n6Var.setGravity(16);
        int i13 = i6.G6;
        n6Var.setTextColor(i6.v0(i13, e6Var));
        TextView textView = new TextView(context);
        this.f22119w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(i6.v0(i13, e6Var));
        if (LocaleController.isRTL) {
            ig0Var.addView(n6Var, x5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            ig0Var.addView(textView, x5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            ig0Var.addView(n6Var, x5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            ig0Var.addView(textView, x5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        ig0 ig0Var2 = new ig0(this, context, false);
        this.f22111g0 = ig0Var2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        n6 n6Var2 = new n6(context, false, false, false);
        this.v = n6Var2;
        n6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        n6Var2.setTypeface(AndroidUtilities.bold());
        n6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        n6Var2.setGravity(21);
        n6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            ig0Var2.addView(textView2, x5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            ig0Var2.addView(n6Var2, x5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            ig0Var2.addView(textView2, x5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            ig0Var2.addView(n6Var2, x5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        t5 t5Var = new t5(this, context, e6Var);
        this.I = t5Var;
        t5Var.addView(ig0Var, x5.c(30.0f, -1));
        t5Var.addView(ig0Var2, x5.c(30.0f, -1));
        addView(t5Var, x5.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
