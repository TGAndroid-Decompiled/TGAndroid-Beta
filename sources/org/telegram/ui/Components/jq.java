package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;

public final class jq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.c6 J;

    public boolean f29775a;
    public Paint d;

    public boolean f29780g;
    public int h;

    public String f29781i;

    public boolean f29782j;

    public ValueAnimator f29783k;

    public float f29785m;

    public StaticLayout f29786n;

    public StaticLayout f29787o;

    public StaticLayout f29788p;

    public StaticLayout f29789q;

    public int f29790r;

    public int f29791s;

    public int f29792t;

    public int f29793u;

    public int f29795x;

    public int f29796y;

    public float f29776b = 1.0f;

    public int f29777c = -1;

    public TextPaint f29778e = new TextPaint(1);

    public final RectF f29779f = new RectF();

    public float f29784l = 1.0f;
    public int v = org.telegram.ui.ActionBar.g6.f23329sf;

    public int f29794w = org.telegram.ui.ActionBar.g6.f23348tf;

    public int f29797z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public jq(View view, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.H = view;
        this.J = c6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f29778e.setTypeface(AndroidUtilities.bold());
        this.f29778e.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(Canvas canvas) {
        float interpolation;
        boolean z10;
        Paint paint;
        int i10 = this.I;
        if (i10 != 1 && i10 != 2) {
            int i11 = this.v;
            org.telegram.ui.ActionBar.c6 c6Var = this.J;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
            int iV1 = org.telegram.ui.ActionBar.g6.v0(this.f29794w, c6Var);
            if (this.f29793u != iV0) {
                this.f29793u = iV0;
                this.f29778e.setColor(iV0);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f29792t != iV1) {
                this.f29792t = iV1;
                paint2.setColor(iV1);
            }
        }
        float f10 = this.f29784l;
        if (f10 == 1.0f) {
            b(canvas);
            return;
        }
        int i12 = this.f29777c;
        if (i12 == 0 || i12 == 1) {
            e(this.f29791s);
            float f11 = (this.f29791s / 2.0f) + this.A;
            float f12 = this.f29795x / 2.0f;
            canvas.save();
            float f13 = this.f29777c == 0 ? this.f29784l : 1.0f - this.f29784l;
            canvas.scale(f13, f13, f11, f12);
            b(canvas);
            canvas.restore();
            return;
        }
        float f14 = f10 * 2.0f;
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        int i13 = this.f29795x;
        float f15 = this.C;
        float f16 = f15 * 2.0f;
        float fDp = (i13 - AndroidUtilities.dp(f16)) / 2.0f;
        int i14 = this.f29791s;
        int i15 = this.f29790r;
        float fZ = i14 == i15 ? i14 : com.google.android.recaptcha.internal.a.z(1.0f, f14, i15, i14 * f14);
        e(fZ);
        if (this.f29782j) {
            float f17 = this.f29784l;
            interpolation = ((f17 <= 0.5f ? er.f28123g.getInterpolation(f17 * 2.0f) : er.f28124i.getInterpolation(1.0f - ((f17 - 0.5f) * 2.0f))) * 0.1f) + 1.0f;
        } else {
            interpolation = 1.0f;
        }
        float f18 = this.B;
        float fDp2 = fZ + f18 + AndroidUtilities.dp(f15 - 0.5f);
        float fDp3 = AndroidUtilities.dp(f16) + fDp;
        RectF rectF = this.f29779f;
        rectF.set(f18, fDp, fDp2, fDp3);
        canvas.save();
        canvas.scale(interpolation, interpolation, rectF.centerX(), rectF.centerY());
        if (this.f29776b != 1.0f) {
            canvas.save();
            float f19 = this.f29776b;
            canvas.scale(f19, f19, rectF.centerX(), rectF.centerY());
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.F && (paint = this.d) != null) {
            float f20 = AndroidUtilities.density * f15;
            canvas.drawRoundRect(rectF, f20, f20, paint);
            if (this.f29780g && org.telegram.ui.ActionBar.g6.a1()) {
                float f21 = f15 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f21, f21, org.telegram.ui.ActionBar.g6.f23121h2);
            }
        }
        if (z10) {
            canvas.restore();
        }
        canvas.clipRect(rectF);
        boolean z11 = this.D != this.f29782j;
        if (this.f29789q != null) {
            canvas.save();
            float f22 = this.A;
            float fDp4 = AndroidUtilities.dp(4.0f) + fDp;
            int iDp = AndroidUtilities.dp(13.0f);
            if (!z11) {
                iDp = -iDp;
            }
            canvas.translate(f22, com.google.android.recaptcha.internal.a.z(1.0f, f14, iDp, fDp4));
            this.f29778e.setAlpha((int) (f14 * 255.0f));
            this.f29789q.draw(canvas);
            canvas.restore();
        } else if (this.f29786n != null) {
            canvas.save();
            float f23 = this.A;
            float fDp5 = AndroidUtilities.dp(4.0f) + fDp;
            int iDp2 = AndroidUtilities.dp(13.0f);
            if (!z11) {
                iDp2 = -iDp2;
            }
            canvas.translate(f23, com.google.android.recaptcha.internal.a.z(1.0f, f14, iDp2, fDp5));
            this.f29778e.setAlpha((int) (f14 * 255.0f));
            this.f29786n.draw(canvas);
            canvas.restore();
        }
        if (this.f29787o != null) {
            canvas.save();
            canvas.translate(this.A, ((z11 ? -AndroidUtilities.dp(13.0f) : AndroidUtilities.dp(13.0f)) * f14) + AndroidUtilities.dp(4.0f) + fDp);
            this.f29778e.setAlpha((int) ((1.0f - f14) * 255.0f));
            this.f29787o.draw(canvas);
            canvas.restore();
        }
        if (this.f29788p != null) {
            canvas.save();
            canvas.translate(this.A, fDp + AndroidUtilities.dp(4.0f));
            this.f29778e.setAlpha(255);
            this.f29788p.draw(canvas);
            canvas.restore();
        }
        this.f29778e.setAlpha(255);
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z10;
        float f10 = this.C;
        float f11 = f10 * 2.0f;
        float fDp = (this.f29795x - AndroidUtilities.dp(f11)) / 2.0f;
        e(this.f29791s);
        float f12 = this.B;
        float fDp2 = this.f29791s + f12 + AndroidUtilities.dp(f10 - 0.5f);
        float fDp3 = AndroidUtilities.dp(f11) + fDp;
        RectF rectF = this.f29779f;
        rectF.set(f12, fDp, fDp2, fDp3);
        if (this.d != null && this.F) {
            if (this.f29776b != 1.0f) {
                canvas.save();
                float f13 = this.f29776b;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f14 = AndroidUtilities.density * f10;
            canvas.drawRoundRect(rectF, f14, f14, this.d);
            if (this.f29780g && org.telegram.ui.ActionBar.g6.a1()) {
                float f15 = f10 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f15, f15, org.telegram.ui.ActionBar.g6.f23121h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f29786n != null) {
            canvas.save();
            canvas.translate(this.A, fDp + AndroidUtilities.dp(4.0f));
            this.f29786n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z10) {
        View view;
        View view2;
        boolean z11 = false;
        String wholeNumber = this.f29775a ? AndroidUtilities.formatWholeNumber(i10, 0) : String.valueOf(i10);
        if (TextUtils.equals(wholeNumber, this.f29781i)) {
            return;
        }
        ValueAnimator valueAnimator = this.f29783k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (i10 > 0 && this.G && (view2 = this.H) != null) {
            view2.setVisibility(0);
        }
        boolean z12 = Math.abs(i10 - this.h) > 99 ? false : z10;
        if (!z12) {
            this.h = i10;
            this.f29781i = wholeNumber;
            if (i10 == 0) {
                if (!this.G || (view = this.H) == null) {
                    return;
                }
                view.setVisibility(8);
                return;
            }
            this.f29791s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f29778e.measureText(wholeNumber.toString())));
            StaticLayout staticLayout = new StaticLayout(wholeNumber, this.f29778e, this.f29791s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f29786n = staticLayout;
            this.f29785m = staticLayout.getLineCount() >= 1 ? this.f29786n.getLineWidth(0) : 0.0f;
            View view3 = this.H;
            if (view3 != null) {
                view3.invalidate();
                return;
            }
            return;
        }
        if (z12) {
            ValueAnimator valueAnimator2 = this.f29783k;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.f29784l = 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f29783k = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new e6(this, 14));
            this.f29783k.addListener(new org.telegram.ui.am(this, 23));
            if (this.h <= 0) {
                this.f29777c = 0;
                this.f29783k.setDuration(220L);
                this.f29783k.setInterpolator(new OvershootInterpolator());
            } else if (i10 == 0) {
                this.f29777c = 1;
                this.f29783k.setDuration(150L);
                this.f29783k.setInterpolator(er.f28122f);
            } else {
                this.f29777c = 2;
                this.f29783k.setDuration(430L);
                this.f29783k.setInterpolator(er.f28122f);
            }
            if (this.f29786n != null) {
                String str = this.f29781i;
                if (str.length() == wholeNumber.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wholeNumber);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(wholeNumber);
                    for (int i11 = 0; i11 < str.length(); i11++) {
                        if (str.charAt(i11) == wholeNumber.charAt(i11)) {
                            int i12 = i11 + 1;
                            spannableStringBuilder.setSpan(new zy(z11), i11, i12, 0);
                            spannableStringBuilder2.setSpan(new zy(z11), i11, i12, 0);
                        } else {
                            spannableStringBuilder3.setSpan(new zy(z11), i11, i11 + 1, 0);
                        }
                    }
                    int iMax = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f29778e.measureText(str.toString())));
                    TextPaint textPaint = this.f29778e;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    this.f29787o = new StaticLayout(spannableStringBuilder, textPaint, iMax, alignment, 1.0f, 0.0f, false);
                    this.f29788p = new StaticLayout(spannableStringBuilder3, this.f29778e, iMax, alignment, 1.0f, 0.0f, false);
                    this.f29789q = new StaticLayout(spannableStringBuilder2, this.f29778e, iMax, alignment, 1.0f, 0.0f, false);
                } else {
                    this.f29787o = this.f29786n;
                }
            }
            this.f29790r = this.f29791s;
            this.f29782j = i10 > this.h;
            this.f29783k.start();
        }
        if (i10 > 0) {
            this.f29791s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f29778e.measureText(wholeNumber.toString())));
            StaticLayout staticLayout2 = new StaticLayout(wholeNumber, this.f29778e, this.f29791s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f29786n = staticLayout2;
            this.f29785m = staticLayout2.getLineCount() >= 1 ? this.f29786n.getLineWidth(0) : 0.0f;
        }
        this.h = i10;
        this.f29781i = wholeNumber;
        View view4 = this.H;
        if (view4 != null) {
            view4.invalidate();
        }
    }

    public final void d(int i10, int i11) {
        if (i10 != this.f29795x) {
            int i12 = this.h;
            this.h = -1;
            c(i12, this.f29777c == 0);
            this.f29795x = i10;
        }
        this.f29796y = i11;
    }

    public final void e(float f10) {
        float fDp = this.F ? AndroidUtilities.dp(5.5f) : 0.0f;
        int i10 = this.f29797z;
        if (i10 == 5) {
            float f11 = this.f29796y - fDp;
            this.A = f11;
            float f12 = this.E;
            if (f12 != 0.0f) {
                this.A = f11 - Math.max((f10 / 2.0f) + f12, f10);
            } else {
                this.A = f11 - f10;
            }
        } else if (i10 == 3) {
            this.A = fDp;
        } else {
            this.A = (int) ((this.f29796y - f10) / 2.0f);
        }
        this.B = this.A - fDp;
    }
}
