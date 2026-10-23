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
public final class er {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.g6 J;
    public boolean f26031a;
    public Paint d;
    public boolean f26035g;
    public int h;
    public String f26036i;
    public boolean f26037j;
    public ValueAnimator f26038k;
    public float f26040m;
    public StaticLayout f26041n;
    public StaticLayout f26042o;
    public StaticLayout f26043p;
    public StaticLayout f26044q;
    public int f26045r;
    public int f26046s;
    public int f26047t;
    public int f26048u;
    public int f26050x;
    public int f26051y;
    public float f26032b = 1.0f;
    public int f26033c = -1;
    public TextPaint e = new TextPaint(1);
    public final RectF f26034f = new RectF();
    public float f26039l = 1.0f;
    public int v = org.telegram.ui.ActionBar.k6.f21468sf;
    public int f26049w = org.telegram.ui.ActionBar.k6.f21488tf;
    public int f26052z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public er(View view, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.H = view;
        this.J = g6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(Canvas canvas) {
        float f7;
        float y3;
        float f10;
        boolean z10;
        int dp;
        Paint paint;
        float interpolation;
        int i10 = this.I;
        boolean z11 = true;
        if (i10 != 1 && i10 != 2) {
            int i11 = this.v;
            org.telegram.ui.ActionBar.g6 g6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(this.f26049w, g6Var);
            if (this.f26048u != w02) {
                this.f26048u = w02;
                this.e.setColor(w02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f26047t != w03) {
                this.f26047t = w03;
                paint2.setColor(w03);
            }
        }
        float f11 = this.f26039l;
        if (f11 != 1.0f) {
            int i12 = this.f26033c;
            if (i12 != 0 && i12 != 1) {
                float f12 = f11 * 2.0f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                int i13 = this.f26050x;
                float f13 = this.C;
                float f14 = f13 * 2.0f;
                float dp2 = (i13 - AndroidUtilities.dp(f14)) / 2.0f;
                int i14 = this.f26046s;
                int i15 = this.f26045r;
                if (i14 == i15) {
                    y3 = i14;
                } else {
                    y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f12, i15, i14 * f12);
                }
                e(y3);
                if (this.f26037j) {
                    float f15 = this.f26039l;
                    if (f15 <= 0.5f) {
                        interpolation = bs.f25134g.getInterpolation(f15 * 2.0f);
                    } else {
                        interpolation = bs.f25135i.getInterpolation(1.0f - ((f15 - 0.5f) * 2.0f));
                    }
                    f10 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f10 = 1.0f;
                }
                float f16 = this.B;
                RectF rectF = this.f26034f;
                rectF.set(f16, dp2, y3 + f16 + AndroidUtilities.dp(f13 - 0.5f), AndroidUtilities.dp(f14) + dp2);
                canvas.save();
                canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                if (this.f26032b != 1.0f) {
                    canvas.save();
                    float f17 = this.f26032b;
                    canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f18 = AndroidUtilities.density * f13;
                    canvas.drawRoundRect(rectF, f18, f18, paint);
                    if (this.f26035g && org.telegram.ui.ActionBar.k6.c1()) {
                        float f19 = f13 * AndroidUtilities.density;
                        canvas.drawRoundRect(rectF, f19, f19, org.telegram.ui.ActionBar.k6.f21251h2);
                    }
                }
                if (z10) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f26037j) {
                    z11 = false;
                }
                if (this.f26044q != null) {
                    canvas.save();
                    float f20 = this.A;
                    float dp3 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp4 = AndroidUtilities.dp(13.0f);
                    if (!z11) {
                        dp4 = -dp4;
                    }
                    canvas.translate(f20, com.google.android.gms.internal.play_billing.k3.y(1.0f, f12, dp4, dp3));
                    this.e.setAlpha((int) (f12 * 255.0f));
                    this.f26044q.draw(canvas);
                    canvas.restore();
                } else if (this.f26041n != null) {
                    canvas.save();
                    float f21 = this.A;
                    float dp5 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp6 = AndroidUtilities.dp(13.0f);
                    if (!z11) {
                        dp6 = -dp6;
                    }
                    canvas.translate(f21, com.google.android.gms.internal.play_billing.k3.y(1.0f, f12, dp6, dp5));
                    this.e.setAlpha((int) (f12 * 255.0f));
                    this.f26041n.draw(canvas);
                    canvas.restore();
                }
                if (this.f26042o != null) {
                    canvas.save();
                    float f22 = this.A;
                    float dp7 = AndroidUtilities.dp(4.0f) + dp2;
                    if (z11) {
                        dp = -AndroidUtilities.dp(13.0f);
                    } else {
                        dp = AndroidUtilities.dp(13.0f);
                    }
                    canvas.translate(f22, (dp * f12) + dp7);
                    this.e.setAlpha((int) ((1.0f - f12) * 255.0f));
                    this.f26042o.draw(canvas);
                    canvas.restore();
                }
                if (this.f26043p != null) {
                    canvas.save();
                    canvas.translate(this.A, dp2 + AndroidUtilities.dp(4.0f));
                    this.e.setAlpha(255);
                    this.f26043p.draw(canvas);
                    canvas.restore();
                }
                this.e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f26046s);
            float f23 = (this.f26046s / 2.0f) + this.A;
            float f24 = this.f26050x / 2.0f;
            canvas.save();
            if (this.f26033c == 0) {
                f7 = this.f26039l;
            } else {
                f7 = 1.0f - this.f26039l;
            }
            canvas.scale(f7, f7, f23, f24);
            b(canvas);
            canvas.restore();
            return;
        }
        b(canvas);
    }

    public final void b(Canvas canvas) {
        boolean z10;
        float f7 = this.C;
        float f10 = f7 * 2.0f;
        float dp = (this.f26050x - AndroidUtilities.dp(f10)) / 2.0f;
        e(this.f26046s);
        float f11 = this.B;
        RectF rectF = this.f26034f;
        rectF.set(f11, dp, this.f26046s + f11 + AndroidUtilities.dp(f7 - 0.5f), AndroidUtilities.dp(f10) + dp);
        if (this.d != null && this.F) {
            if (this.f26032b != 1.0f) {
                canvas.save();
                float f12 = this.f26032b;
                canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f13 = AndroidUtilities.density * f7;
            canvas.drawRoundRect(rectF, f13, f13, this.d);
            if (this.f26035g && org.telegram.ui.ActionBar.k6.c1()) {
                float f14 = f7 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f14, f14, org.telegram.ui.ActionBar.k6.f21251h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f26041n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.f26041n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f26031a) {
            valueOf = AndroidUtilities.formatWholeNumber(i10, 0);
        } else {
            valueOf = String.valueOf(i10);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f26036i)) {
            ValueAnimator valueAnimator = this.f26038k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i10 > 0 && this.G && (view2 = this.H) != null) {
                view2.setVisibility(0);
            }
            if (Math.abs(i10 - this.h) > 99) {
                z11 = false;
            } else {
                z11 = z10;
            }
            float f7 = 0.0f;
            if (!z11) {
                this.h = i10;
                this.f26036i = str;
                if (i10 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f26046s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.e, this.f26046s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f26041n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f7 = this.f26041n.getLineWidth(0);
                }
                this.f26040m = f7;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f26038k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f26039l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f26038k = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 15));
                this.f26038k.addListener(new org.telegram.ui.pq(this, 21));
                if (this.h <= 0) {
                    this.f26033c = 0;
                    this.f26038k.setDuration(220L);
                    this.f26038k.setInterpolator(new OvershootInterpolator());
                } else if (i10 == 0) {
                    this.f26033c = 1;
                    this.f26038k.setDuration(150L);
                    this.f26038k.setInterpolator(bs.f25133f);
                } else {
                    this.f26033c = 2;
                    this.f26038k.setDuration(430L);
                    this.f26038k.setInterpolator(bs.f25133f);
                }
                if (this.f26041n != null) {
                    String str2 = this.f26036i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i11 = 0; i11 < str2.length(); i11++) {
                            if (str2.charAt(i11) == str.charAt(i11)) {
                                int i12 = i11 + 1;
                                spannableStringBuilder.setSpan(new uz(false), i11, i12, 0);
                                spannableStringBuilder2.setSpan(new uz(false), i11, i12, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new uz(false), i11, i11 + 1, 0);
                            }
                        }
                        int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(str2.toString())));
                        TextPaint textPaint = this.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f26042o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f26043p = new StaticLayout(spannableStringBuilder3, this.e, max, alignment, 1.0f, 0.0f, false);
                        this.f26044q = new StaticLayout(spannableStringBuilder2, this.e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f26042o = this.f26041n;
                    }
                }
                this.f26045r = this.f26046s;
                if (i10 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f26037j = z12;
                this.f26038k.start();
            }
            if (i10 > 0) {
                this.f26046s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.e, this.f26046s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f26041n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f7 = this.f26041n.getLineWidth(0);
                }
                this.f26040m = f7;
            }
            this.h = i10;
            this.f26036i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        if (i10 != this.f26050x) {
            int i12 = this.h;
            this.h = -1;
            if (this.f26033c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i12, z10);
            this.f26050x = i10;
        }
        this.f26051y = i11;
    }

    public final void e(float f7) {
        float f10;
        if (this.F) {
            f10 = AndroidUtilities.dp(5.5f);
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f26052z;
        if (i10 == 5) {
            float f11 = this.f26051y - f10;
            this.A = f11;
            float f12 = this.E;
            if (f12 != 0.0f) {
                this.A = f11 - Math.max((f7 / 2.0f) + f12, f7);
            } else {
                this.A = f11 - f7;
            }
        } else if (i10 == 3) {
            this.A = f10;
        } else {
            this.A = (int) ((this.f26051y - f7) / 2.0f);
        }
        this.B = this.A - f10;
    }
}
