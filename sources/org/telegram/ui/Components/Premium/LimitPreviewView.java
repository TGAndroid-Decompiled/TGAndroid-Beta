package org.telegram.ui.Components.Premium;

import ag.a0;
import ag.b0;
import ag.c0;
import ag.d0;
import ag.i2;
import ag.u;
import ag.w;
import ag.x;
import ag.y;
import ag.z;
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
import h7.n;
import h7.z5;
import i0.a;
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
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.zy;

public class LimitPreviewView extends LinearLayout {

    public static final int f26442h0 = 0;
    public i2 A;
    public int B;
    public boolean C;
    public boolean D;
    public final w E;
    public boolean F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public final j6 J;
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

    public float f26443a;

    public c0 f26444a0;

    public int f26445b;

    public final d0 f26446b0;

    public int f26447c;

    public final d0 f26448c0;
    public boolean d;

    public boolean f26449d0;

    public final b0 f26450e;

    public ValueAnimator f26451e0;

    public boolean f26452f;

    public boolean f26453f0;

    public Runnable f26454g0;
    public float h;

    public int f26455n;

    public final int f26456r;

    public float f26457s;
    public final j6 v;

    public final TextView f26458w;

    public float f26459x;

    public ViewGroup f26460y;

    public LimitPreviewView(Context context, int i10, int i11, c6 c6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, c6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        int iV0;
        Paint paint = limitPreviewView.G;
        b0 b0Var = limitPreviewView.f26450e;
        c6 c6Var = limitPreviewView.O;
        j6 j6Var = limitPreviewView.v;
        j6 j6Var2 = limitPreviewView.J;
        limitPreviewView.f26454g0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.f26451e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.H = false;
            paint.setColor(g6.v0(g6.Oh, c6Var));
            long j10 = tl_starsRating.stars;
            if (j10 > 0) {
                long j11 = tl_starsRating.next_level_stars;
                if (j11 == 0) {
                    limitPreviewView.f26443a = 1.0f;
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                } else {
                    long j12 = tl_starsRating.current_level_stars;
                    limitPreviewView.f26443a = n.a((j10 - j12) / (j11 - j12), 0.0f, 1.0f);
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                }
                limitPreviewView.setArrowX(1.0f);
                b0Var.setScaleX(0.6f);
                b0Var.setScaleY(0.6f);
                b0Var.setAlpha(0.0f);
                limitPreviewView.P = true;
                limitPreviewView.Q = true;
                limitPreviewView.R = false;
                limitPreviewView.T = limitPreviewView.f26455n;
                limitPreviewView.E.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                er erVar = er.h;
                duration.setInterpolator(erVar).start();
                j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar).start();
                if (limitPreviewView.H) {
                    iV0 = -1;
                } else {
                    iV0 = g6.v0(g6.G6, c6Var);
                }
                j6Var.setTextColor(iV0);
                j6Var2.setTextColor(-1);
                limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
            limitPreviewView.f26443a = 0.5f;
            j6Var2.setText("");
            j6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(g6.v0(g6.wj, c6Var));
            limitPreviewView.H = true;
            limitPreviewView.setArrowX(1.0f);
            b0Var.setScaleX(0.6f);
            b0Var.setScaleY(0.6f);
            b0Var.setAlpha(0.0f);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = false;
            limitPreviewView.T = limitPreviewView.f26455n;
            limitPreviewView.E.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            er erVar2 = er.h;
            duration2.setInterpolator(erVar2).start();
            j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar2).start();
            if (limitPreviewView.H) {
                iV0 = -1;
            } else {
                iV0 = g6.v0(g6.G6, c6Var);
            }
            j6Var.setTextColor(iV0);
            j6Var2.setTextColor(-1);
            limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        int iV0;
        Paint paint = limitPreviewView.G;
        b0 b0Var = limitPreviewView.f26450e;
        c6 c6Var = limitPreviewView.O;
        j6 j6Var = limitPreviewView.v;
        j6 j6Var2 = limitPreviewView.J;
        limitPreviewView.f26454g0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.f26451e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.H = false;
            paint.setColor(g6.v0(g6.Oh, c6Var));
            long j10 = tl_starsRating.stars;
            if (j10 > 0) {
                long j11 = tl_starsRating.next_level_stars;
                if (j11 == 0) {
                    limitPreviewView.f26443a = 1.0f;
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                } else {
                    long j12 = tl_starsRating.current_level_stars;
                    limitPreviewView.f26443a = n.a((j10 - j12) / (j11 - j12), 0.0f, 1.0f);
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                }
                limitPreviewView.setArrowX(0.0f);
                b0Var.setScaleX(0.6f);
                b0Var.setScaleY(0.6f);
                b0Var.setAlpha(0.0f);
                limitPreviewView.P = true;
                limitPreviewView.Q = true;
                limitPreviewView.R = false;
                limitPreviewView.T = limitPreviewView.f26455n;
                limitPreviewView.E.requestLayout();
                limitPreviewView.requestLayout();
                ViewPropertyAnimator duration = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                er erVar = er.h;
                duration.setInterpolator(erVar).start();
                j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar).start();
                if (limitPreviewView.H) {
                    iV0 = -1;
                } else {
                    iV0 = g6.v0(g6.G6, c6Var);
                }
                j6Var.setTextColor(iV0);
                j6Var2.setTextColor(-1);
                limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            }
            limitPreviewView.f26443a = 0.0f;
            j6Var2.setText("");
            j6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(g6.v0(g6.wj, c6Var));
            limitPreviewView.H = true;
            limitPreviewView.setArrowX(0.0f);
            b0Var.setScaleX(0.6f);
            b0Var.setScaleY(0.6f);
            b0Var.setAlpha(0.0f);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = false;
            limitPreviewView.T = limitPreviewView.f26455n;
            limitPreviewView.E.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            er erVar2 = er.h;
            duration2.setInterpolator(erVar2).start();
            j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar2).start();
            if (limitPreviewView.H) {
                iV0 = -1;
            } else {
                iV0 = g6.v0(g6.G6, c6Var);
            }
            j6Var.setTextColor(iV0);
            j6Var2.setTextColor(-1);
            limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f10) {
        this.f26455n = f10 >= 1.0f ? this.E.getMeasuredWidth() : 0;
        int iDp = AndroidUtilities.dp(14.0f);
        float f11 = iDp;
        float fMax = Math.max(this.f26455n, (getMeasuredWidth() - (iDp * 2)) * f10) + f11;
        b0 b0Var = this.f26450e;
        b0Var.setTranslationX(Utilities.clamp(fMax - (b0Var.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - iDp) - b0Var.getMeasuredWidth(), f11));
        if (b0Var.f301s != f10) {
            b0Var.f301s = f10;
            b0Var.v = true;
            b0Var.invalidate();
        }
        b0Var.setPivotX(b0Var.getMeasuredWidth() * f10);
    }

    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        boolean z11;
        boolean z12;
        int iV0;
        AndroidUtilities.cancelRunOnUIThread(this.f26454g0);
        this.f26454g0 = null;
        int i10 = g6.Oh;
        c6 c6Var = this.O;
        int iV1 = g6.v0(i10, c6Var);
        Paint paint = this.G;
        paint.setColor(iV1);
        this.H = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        w wVar = this.E;
        j6 j6Var = this.v;
        j6 j6Var2 = this.J;
        if (i11 == i12) {
            long j10 = tl_starsRating2.stars;
            if (j10 > 0) {
                long j11 = tl_starsRating2.next_level_stars;
                if (j11 == 0) {
                    this.f26443a = 1.0f;
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i12 - 1)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j12 = tl_starsRating2.current_level_stars;
                    this.f26443a = n.a((j10 - j12) / (j11 - j12), 0.0f, 1.0f);
                    z12 = true;
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level + 1)));
                }
                this.P = z12;
                this.Q = false;
                this.R = false;
                this.T = this.f26455n;
                wVar.requestLayout();
                requestLayout();
                if (this.H) {
                    iV0 = -1;
                } else {
                    iV0 = g6.v0(g6.G6, c6Var);
                }
                j6Var.setTextColor(iV0);
                j6Var2.setTextColor(-1);
                f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
                return;
            }
            this.f26443a = 0.0f;
            j6Var2.setText("");
            j6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(g6.v0(g6.wj, c6Var));
            this.H = true;
            z12 = true;
            this.P = z12;
            this.Q = false;
            this.R = false;
            this.T = this.f26455n;
            wVar.requestLayout();
            requestLayout();
            if (this.H) {
                iV0 = -1;
            } else {
                iV0 = g6.v0(g6.G6, c6Var);
            }
            j6Var.setTextColor(iV0);
            j6Var2.setTextColor(-1);
            f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
            return;
        }
        if (i12 > i11) {
            if (tl_starsRating.stars <= 0) {
                z11 = true;
                this.H = true;
            } else {
                z11 = true;
            }
            this.f26443a = 1.0f;
            this.P = z11;
            this.Q = false;
            this.R = z11;
            this.T = this.f26455n;
            wVar.requestLayout();
            requestLayout();
            j6Var.setTextColor(this.H ? -1 : g6.v0(g6.G6, c6Var));
            j6Var2.setTextColor(-1);
            ViewPropertyAnimator duration = j6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            j6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(erVar).start();
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i13 = 0;
            Runnable runnable = new Runnable(this) {

                public final LimitPreviewView f678b;

                {
                    this.f678b = this;
                }

                @Override
                public final void run() {
                    switch (i13) {
                        case 0:
                            LimitPreviewView.b(this.f678b, tl_starsRating2);
                            break;
                        default:
                            LimitPreviewView.a(this.f678b, tl_starsRating2);
                            break;
                    }
                }
            };
            this.f26454g0 = runnable;
            AndroidUtilities.runOnUIThread(runnable, 600L);
            return;
        }
        if (i12 < i11) {
            paint.setColor(g6.v0(i10, c6Var));
            this.H = false;
            if (tl_starsRating.stars <= 0) {
                z10 = true;
                this.H = true;
            } else {
                z10 = true;
            }
            this.f26443a = 0.0f;
            this.P = z10;
            this.Q = false;
            this.R = z10;
            this.T = this.f26455n;
            wVar.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            er erVar2 = er.h;
            duration2.setInterpolator(erVar2).start();
            j6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(erVar2).start();
            j6Var.setTextColor(this.H ? -1 : g6.v0(g6.G6, c6Var));
            j6Var2.setTextColor(-1);
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i14 = 1;
            Runnable runnable2 = new Runnable(this) {

                public final LimitPreviewView f678b;

                {
                    this.f678b = this;
                }

                @Override
                public final void run() {
                    switch (i14) {
                        case 0:
                            LimitPreviewView.b(this.f678b, tl_starsRating2);
                            break;
                        default:
                            LimitPreviewView.a(this.f678b, tl_starsRating2);
                            break;
                    }
                }
            };
            this.f26454g0 = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.A == null) {
            if (this.f26452f) {
                float f10 = this.h + 0.016f;
                this.h = f10;
                if (f10 > 3.0f) {
                    this.f26452f = false;
                }
            } else {
                float f11 = this.h - 0.016f;
                this.h = f11;
                if (f11 < 1.0f) {
                    this.f26452f = true;
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
        j6 j6Var = this.J;
        j6 j6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.f26443a = 1.0f;
            j6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            j6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.f26443a = n.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            j6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            j6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f26458w.setVisibility(8);
        this.K.setVisibility(8);
        j6Var2.setTextColor(g6.v0(g6.G6, this.O));
        j6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.L = true;
    }

    public final void f(int i10, int i11) {
        if (i10 < 0) {
            g(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new cq(this.f26456r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? LocaleController.formatShortNumber(i10, null) : LocaleController.formatNumber(i10, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i11 > 1200 ? LocaleController.formatShortNumber(i11, null) : LocaleController.formatNumber(i11, ',')));
        spannableStringBuilder.setSpan(new vt(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        b0 b0Var = this.f26450e;
        b0Var.f298f = spannableStringBuilder;
        b0Var.requestLayout();
    }

    public final void g(int i10, boolean z10) {
        cq cqVar;
        int i11;
        if (i10 < 0) {
            cqVar = new cq(R.drawable.warning_sign, 0);
        } else {
            cqVar = new cq(this.f26456r, 0);
            float f10 = this.f26457s;
            cqVar.setScale(f10, f10);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r10 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(cqVar, 0, 1, 0);
        if (i10 >= 0 || !this.f26449d0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        b0 b0Var = this.f26450e;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder2 = b0Var.f298f;
            b0Var.f298f = spannableStringBuilder;
            TextPaint textPaint = b0Var.f296c;
            ArrayList arrayList = b0Var.h;
            if (b0Var.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(b0Var.f298f);
                int length = b0Var.f298f.length() - 1;
                int i12 = 0;
                while (length >= 0) {
                    char cCharAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
                    if (cCharAt == b0Var.f298f.charAt(length) || !Character.isDigit(b0Var.f298f.charAt(length))) {
                        i11 = length;
                    } else {
                        a0 a0Var = new a0();
                        arrayList.add(a0Var);
                        a0Var.f283e = b0Var.d.getSecondaryHorizontal(length);
                        a0Var.f280a = r10;
                        if (i12 >= r10) {
                            i12 = 0;
                        }
                        int i13 = (int) b0Var.f297e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + cCharAt, textPaint, i13, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = a0Var.f281b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + b0Var.f298f.charAt(i11), textPaint, (int) b0Var.f297e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new zy(false), i11, i11 + 1, 0);
                        i12++;
                    }
                    length = i11 - 1;
                    r10 = 1;
                }
                b0Var.f299n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) b0Var.f297e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    b0Var.f300r = true;
                    a0 a0Var2 = (a0) arrayList.get(i14);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    a0Var2.f284f = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new y(b0Var, a0Var2, 0));
                    a0Var2.f284f.addListener(new z(b0Var, a0Var2, 1));
                    a0Var2.f284f.setInterpolator(er.f28123g);
                    a0Var2.f284f.setDuration(250L);
                    a0Var2.f284f.setStartDelay(((long) ((arrayList.size() - 1) - i14)) * 60);
                    a0Var2.f284f.start();
                }
            }
        } else {
            b0Var.f298f = spannableStringBuilder;
        }
        b0Var.requestLayout();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float fClamp;
        final float f13;
        float measuredWidth;
        float f14;
        boolean z11;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z12 = this.S;
        b0 b0Var = this.f26450e;
        if (!z12 && !this.P && (this.d || b0Var == null || !this.D || this.F)) {
            if (this.L) {
                if (this.Q || this.R) {
                    return;
                }
                b0Var.setAlpha(1.0f);
                b0Var.setScaleX(1.0f);
                b0Var.setScaleY(1.0f);
                return;
            }
            if (!this.F) {
                if (b0Var != null) {
                    b0Var.setAlpha(0.0f);
                    return;
                }
                return;
            }
            int iDp = AndroidUtilities.dp(14.0f);
            float measuredWidth2 = (((getMeasuredWidth() - (iDp * 2)) * 0.5f) + iDp) - (b0Var.getMeasuredWidth() / 2.0f);
            boolean z13 = this.d;
            if (!z13 && this.D) {
                this.d = true;
                b0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (z13) {
                b0Var.setAlpha(1.0f);
                b0Var.setScaleX(1.0f);
                b0Var.setScaleY(1.0f);
            } else {
                b0Var.setAlpha(0.0f);
                b0Var.setScaleX(0.0f);
                b0Var.setScaleY(0.0f);
            }
            b0Var.setTranslationX(measuredWidth2);
            return;
        }
        int iDp2 = AndroidUtilities.dp(14.0f);
        int i16 = 0;
        boolean z14 = this.P || this.S;
        this.S = false;
        this.P = false;
        float translationX = z14 ? b0Var.getTranslationX() : 0.0f;
        float f15 = iDp2;
        int i17 = iDp2 * 2;
        float fMax = (Math.max(this.f26455n, (getMeasuredWidth() - i17) * this.f26459x) + f15) - (b0Var.getMeasuredWidth() / 2.0f);
        if (this.M) {
            float f16 = b0Var.f301s;
            measuredWidth = Utilities.clamp(fMax, (getMeasuredWidth() - iDp2) - b0Var.getMeasuredWidth(), f15);
            int i18 = this.f26455n;
            if (i18 <= 0) {
                f13 = measuredWidth;
                f12 = f16;
                fClamp = 0.0f;
            } else if (i18 >= getMeasuredWidth() - i17) {
                f10 = f16;
                f13 = measuredWidth;
                f12 = f10;
                fClamp = 1.0f;
            } else {
                fClamp = Utilities.clamp((this.f26455n - (measuredWidth - f15)) / b0Var.getMeasuredWidth(), 1.0f, 0.0f);
                f13 = measuredWidth;
                f12 = f16;
            }
        } else {
            if (fMax < f15) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f15 = fMax;
                f10 = 0.5f;
                f11 = 0.5f;
            }
            if (f15 > (getMeasuredWidth() - iDp2) - b0Var.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - iDp2) - b0Var.getMeasuredWidth();
                f13 = measuredWidth;
                f12 = f10;
                fClamp = 1.0f;
            } else {
                f12 = f10;
                fClamp = f11;
                f13 = f15;
            }
        }
        final boolean z15 = this.Q;
        final boolean z16 = this.R;
        if (!z15 && !z16) {
            b0Var.setAlpha(1.0f);
        }
        b0Var.setTranslationX(translationX);
        b0Var.setPivotX(b0Var.getMeasuredWidth() / 2.0f);
        b0Var.setPivotY(b0Var.getMeasuredHeight());
        if (z14) {
            f14 = f12;
            z11 = z14;
        } else {
            b0Var.setScaleX(0.0f);
            b0Var.setScaleY(0.0f);
            TextPaint textPaint = b0Var.f296c;
            ArrayList arrayList = b0Var.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = b0Var.f304y;
            if (limitPreviewView.L && limitPreviewView.f26445b == 0) {
                f14 = f12;
                z11 = z14;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b0Var.f298f);
                int i19 = 0;
                boolean z17 = true;
                while (i19 < b0Var.f298f.length()) {
                    if (Character.isDigit(b0Var.f298f.charAt(i19))) {
                        a0 a0Var = new a0();
                        arrayList.add(a0Var);
                        a0Var.f283e = b0Var.d.getSecondaryHorizontal(i19);
                        a0Var.d = z17;
                        if (i16 >= 1) {
                            z17 = !z17;
                            i16 = 0;
                        }
                        i16++;
                        int iCharAt = b0Var.f298f.charAt(i19) - '0';
                        int i20 = iCharAt == 0 ? 10 : iCharAt;
                        int i21 = 1;
                        while (i21 <= i20) {
                            int i22 = i20;
                            if (i21 == 10) {
                                i15 = i21;
                                i14 = 0;
                            } else {
                                i14 = i21;
                                i15 = i14;
                            }
                            a0Var.f281b.add(new StaticLayout(a.k(i14, ""), textPaint, (int) b0Var.f297e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i15 + 1;
                            i20 = i22;
                        }
                        spannableStringBuilder.setSpan(new zy(false), i19, i19 + 1, 0);
                    }
                    i19++;
                    textPaint = textPaint;
                    f12 = f12;
                    z14 = z14;
                }
                f14 = f12;
                z11 = z14;
                b0Var.f299n = new StaticLayout(spannableStringBuilder, textPaint, AndroidUtilities.dp(12.0f) + ((int) b0Var.f297e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    b0Var.f300r = true;
                    a0 a0Var2 = (a0) arrayList.get(i23);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    a0Var2.f284f = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new y(b0Var, a0Var2, 1));
                    a0Var2.f284f.addListener(new z(b0Var, a0Var2, 0));
                    a0Var2.f284f.setInterpolator(er.f28123g);
                    a0Var2.f284f.setDuration(750L);
                    a0Var2.f284f.setStartDelay(((long) ((arrayList.size() - 1) - i23)) * 60);
                    a0Var2.f284f.start();
                }
            }
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f26451e0 = valueAnimatorOfFloat2;
        final float f17 = this.f26455n;
        if (z11) {
            this.f26455n = this.T;
        }
        final boolean z18 = !this.f26453f0;
        this.f26453f0 = true;
        final float f18 = fClamp;
        final float f19 = translationX;
        final float f20 = f14;
        final boolean z19 = z11;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = this.f652a;
                b0 b0Var2 = limitPreviewView2.f26450e;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fMin = Math.min(1.0f, fFloatValue);
                if (fFloatValue > 1.0f && z18) {
                    if (!limitPreviewView2.C) {
                        limitPreviewView2.C = true;
                        try {
                            b0Var2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    b0Var2.setRotation(((fFloatValue - 1.0f) * 60.0f) + limitPreviewView2.U);
                } else if (!limitPreviewView2.f26453f0) {
                    b0Var2.setRotation(limitPreviewView2.U);
                }
                if (valueAnimator == limitPreviewView2.f26451e0) {
                    b0Var2.setTranslationX(AndroidUtilities.lerp(f19, f13, fMin));
                    float fLerp = AndroidUtilities.lerp(f20, f18, fMin);
                    if (b0Var2.f301s != fLerp) {
                        b0Var2.f301s = fLerp;
                        b0Var2.v = true;
                        b0Var2.invalidate();
                    }
                    b0Var2.setPivotX(b0Var2.getMeasuredWidth() * fLerp);
                }
                float fMin2 = Math.min(1.0f, 2.0f * fMin);
                if (z19) {
                    limitPreviewView2.f26455n = (int) AndroidUtilities.lerp(limitPreviewView2.T, f17, fMin);
                    limitPreviewView2.E.invalidate();
                } else {
                    b0Var2.setScaleX(fMin2);
                    b0Var2.setScaleY(fMin2);
                }
                if (z15) {
                    b0Var2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
                    b0Var2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
                    b0Var2.setAlpha(fFloatValue);
                } else if (z16) {
                    float f21 = 1.0f - fFloatValue;
                    b0Var2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f21));
                    b0Var2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f21));
                    b0Var2.setAlpha(f21);
                }
            }
        });
        this.f26451e0.addListener(new x(0, this, z18));
        this.f26451e0.setInterpolator(new OvershootInterpolator());
        if (this.S) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat3.addUpdateListener(new u(this, 0));
            valueAnimatorOfFloat3.setDuration(500L);
            valueAnimatorOfFloat3.start();
            this.f26451e0.setDuration(600L);
        } else if (z16) {
            this.f26451e0.setInterpolator(er.f28124i);
            this.f26451e0.setDuration(320L);
        } else if (z15) {
            this.f26451e0.setInterpolator(er.h);
            this.f26451e0.setDuration(500L);
        } else {
            this.f26451e0.setDuration(1000L);
            this.f26451e0.setStartDelay(200L);
        }
        this.f26451e0.start();
        this.d = true;
    }

    public void setBagePosition(float f10) {
        this.f26459x = n.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(c0 c0Var) {
        this.f26444a0 = c0Var;
    }

    public void setHideNegativeValues(boolean z10) {
        this.f26449d0 = z10;
    }

    public void setIconScale(float f10) {
        this.f26457s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.f26460y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.H = false;
        int i10 = g6.Oh;
        c6 c6Var = this.O;
        int iV0 = g6.v0(i10, c6Var);
        Paint paint = this.G;
        paint.setColor(iV0);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        j6 j6Var = this.J;
        j6 j6Var2 = this.v;
        if (j11 <= 0) {
            this.f26443a = 0.5f;
            j6Var.setText("");
            j6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(g6.v0(g6.wj, c6Var));
            this.H = true;
        } else {
            long j12 = tl_starsRating.next_level_stars;
            if (j12 == 0) {
                this.f26443a = 1.0f;
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.f26443a = n.a((j11 - j10) / (j12 - j10), 0.0f, 1.0f);
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.f26458w.setVisibility(8);
        this.K.setVisibility(8);
        j6Var2.setTextColor(this.H ? -1 : g6.v0(g6.G6, c6Var));
        j6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.L = true;
        this.M = true;
        this.N = true;
    }

    public void setStaticGradinet(i2 i2Var) {
        this.A = i2Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.f26445b == i10) {
            z10 = false;
        }
        this.f26445b = i10;
        this.f26443a = n.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.S = true;
            this.T = this.f26455n;
            this.E.requestLayout();
            requestLayout();
        }
        j6 j6Var = this.v;
        ((FrameLayout.LayoutParams) j6Var.getLayoutParams()).gravity = 5;
        this.f26458w.setVisibility(8);
        this.K.setVisibility(8);
        this.J.setText("0");
        j6Var.setText("" + i11);
        g(i10, false);
        this.L = true;
        this.M = true;
    }

    public void setType(int i10) {
        j6 j6Var = this.v;
        int i11 = this.f26456r;
        b0 b0Var = this.f26450e;
        if (i10 == 6) {
            if (b0Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new cq(i11, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                b0Var.f298f = spannableStringBuilder;
            }
            j6Var.setText("4 GB");
            return;
        }
        if (i10 == 11) {
            if (b0Var != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new cq(i11, 0), 0, 1, 0);
                b0Var.f298f = spannableStringBuilder2;
            }
            j6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f10, c6 c6Var) {
        super(context);
        this.f26457s = 1.0f;
        this.D = true;
        this.G = new Paint(1);
        this.W = true;
        this.O = c6Var;
        this.f26443a = n.a(f10, 0.1f, 0.9f);
        this.f26456r = i10;
        this.f26445b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            b0 b0Var = new b0(this, context);
            this.f26450e = b0Var;
            g(i11, false);
            b0Var.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(b0Var, z5.o(-2, -2, 0.0f, 3));
        }
        d0 d0Var = new d0(this, context, true);
        this.f26446b0 = d0Var;
        j6 j6Var = new j6(context, false, false, false);
        this.J = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setText(LocaleController.getString(R.string.LimitFree));
        j6Var.setGravity(16);
        int i13 = g6.G6;
        j6Var.setTextColor(g6.v0(i13, c6Var));
        TextView textView = new TextView(context);
        this.f26458w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(g6.v0(i13, c6Var));
        if (LocaleController.isRTL) {
            d0Var.addView(j6Var, z5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            d0Var.addView(textView, z5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            d0Var.addView(j6Var, z5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            d0Var.addView(textView, z5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        d0 d0Var2 = new d0(this, context, false);
        this.f26448c0 = d0Var2;
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
        j6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        j6Var2.setGravity(21);
        j6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            d0Var2.addView(textView2, z5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            d0Var2.addView(j6Var2, z5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            d0Var2.addView(textView2, z5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            d0Var2.addView(j6Var2, z5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        w wVar = new w(this, context, c6Var);
        this.E = wVar;
        wVar.addView(d0Var, z5.c(30.0f, -1));
        wVar.addView(d0Var2, z5.c(30.0f, -1));
        addView(wVar, z5.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
