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
public final class lr {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.d6 J;
    public boolean f28420a;
    public Paint d;
    public boolean f28425g;
    public int h;
    public String f28426i;
    public boolean f28427j;
    public ValueAnimator f28428k;
    public float f28430m;
    public StaticLayout f28431n;
    public StaticLayout f28432o;
    public StaticLayout f28433p;
    public StaticLayout f28434q;
    public int f28435r;
    public int f28436s;
    public int f28437t;
    public int f28438u;
    public int f28440x;
    public int f28441y;
    public float f28421b = 1.0f;
    public int f28422c = -1;
    public TextPaint f28423e = new TextPaint(1);
    public final RectF f28424f = new RectF();
    public float f28429l = 1.0f;
    public int v = org.telegram.ui.ActionBar.h6.f21072sf;
    public int f28439w = org.telegram.ui.ActionBar.h6.f21090tf;
    public int f28442z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public lr(View view, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.H = view;
        this.J = d6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f28423e.setTypeface(AndroidUtilities.bold());
        this.f28423e.setTextSize(AndroidUtilities.dp(13.0f));
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
            org.telegram.ui.ActionBar.d6 d6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
            int w03 = org.telegram.ui.ActionBar.h6.w0(this.f28439w, d6Var);
            if (this.f28438u != w02) {
                this.f28438u = w02;
                this.f28423e.setColor(w02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f28437t != w03) {
                this.f28437t = w03;
                paint2.setColor(w03);
            }
        }
        float f11 = this.f28429l;
        if (f11 != 1.0f) {
            int i12 = this.f28422c;
            if (i12 != 0 && i12 != 1) {
                float f12 = f11 * 2.0f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                int i13 = this.f28440x;
                float f13 = this.C;
                float f14 = f13 * 2.0f;
                float dp2 = (i13 - AndroidUtilities.dp(f14)) / 2.0f;
                int i14 = this.f28436s;
                int i15 = this.f28435r;
                if (i14 == i15) {
                    y3 = i14;
                } else {
                    y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f12, i15, i14 * f12);
                }
                e(y3);
                if (this.f28427j) {
                    float f15 = this.f28429l;
                    if (f15 <= 0.5f) {
                        interpolation = is.f27452g.getInterpolation(f15 * 2.0f);
                    } else {
                        interpolation = is.f27453i.getInterpolation(1.0f - ((f15 - 0.5f) * 2.0f));
                    }
                    f10 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f10 = 1.0f;
                }
                float f16 = this.B;
                RectF rectF = this.f28424f;
                rectF.set(f16, dp2, y3 + f16 + AndroidUtilities.dp(f13 - 0.5f), AndroidUtilities.dp(f14) + dp2);
                canvas.save();
                canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                if (this.f28421b != 1.0f) {
                    canvas.save();
                    float f17 = this.f28421b;
                    canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f18 = AndroidUtilities.density * f13;
                    canvas.drawRoundRect(rectF, f18, f18, paint);
                    if (this.f28425g && org.telegram.ui.ActionBar.h6.b1()) {
                        float f19 = f13 * AndroidUtilities.density;
                        canvas.drawRoundRect(rectF, f19, f19, org.telegram.ui.ActionBar.h6.f20854h2);
                    }
                }
                if (z10) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f28427j) {
                    z11 = false;
                }
                if (this.f28434q != null) {
                    canvas.save();
                    float f20 = this.A;
                    float dp3 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp4 = AndroidUtilities.dp(13.0f);
                    if (!z11) {
                        dp4 = -dp4;
                    }
                    canvas.translate(f20, com.google.android.gms.internal.vision.e2.y(1.0f, f12, dp4, dp3));
                    this.f28423e.setAlpha((int) (f12 * 255.0f));
                    this.f28434q.draw(canvas);
                    canvas.restore();
                } else if (this.f28431n != null) {
                    canvas.save();
                    float f21 = this.A;
                    float dp5 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp6 = AndroidUtilities.dp(13.0f);
                    if (!z11) {
                        dp6 = -dp6;
                    }
                    canvas.translate(f21, com.google.android.gms.internal.vision.e2.y(1.0f, f12, dp6, dp5));
                    this.f28423e.setAlpha((int) (f12 * 255.0f));
                    this.f28431n.draw(canvas);
                    canvas.restore();
                }
                if (this.f28432o != null) {
                    canvas.save();
                    float f22 = this.A;
                    float dp7 = AndroidUtilities.dp(4.0f) + dp2;
                    if (z11) {
                        dp = -AndroidUtilities.dp(13.0f);
                    } else {
                        dp = AndroidUtilities.dp(13.0f);
                    }
                    canvas.translate(f22, (dp * f12) + dp7);
                    this.f28423e.setAlpha((int) ((1.0f - f12) * 255.0f));
                    this.f28432o.draw(canvas);
                    canvas.restore();
                }
                if (this.f28433p != null) {
                    canvas.save();
                    canvas.translate(this.A, dp2 + AndroidUtilities.dp(4.0f));
                    this.f28423e.setAlpha(255);
                    this.f28433p.draw(canvas);
                    canvas.restore();
                }
                this.f28423e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f28436s);
            float f23 = (this.f28436s / 2.0f) + this.A;
            float f24 = this.f28440x / 2.0f;
            canvas.save();
            if (this.f28422c == 0) {
                f7 = this.f28429l;
            } else {
                f7 = 1.0f - this.f28429l;
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
        float dp = (this.f28440x - AndroidUtilities.dp(f10)) / 2.0f;
        e(this.f28436s);
        float f11 = this.B;
        RectF rectF = this.f28424f;
        rectF.set(f11, dp, this.f28436s + f11 + AndroidUtilities.dp(f7 - 0.5f), AndroidUtilities.dp(f10) + dp);
        if (this.d != null && this.F) {
            if (this.f28421b != 1.0f) {
                canvas.save();
                float f12 = this.f28421b;
                canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f13 = AndroidUtilities.density * f7;
            canvas.drawRoundRect(rectF, f13, f13, this.d);
            if (this.f28425g && org.telegram.ui.ActionBar.h6.b1()) {
                float f14 = f7 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f14, f14, org.telegram.ui.ActionBar.h6.f20854h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f28431n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.f28431n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f28420a) {
            valueOf = AndroidUtilities.formatWholeNumber(i10, 0);
        } else {
            valueOf = String.valueOf(i10);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f28426i)) {
            ValueAnimator valueAnimator = this.f28428k;
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
                this.f28426i = str;
                if (i10 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f28436s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f28423e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f28423e, this.f28436s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f28431n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f7 = this.f28431n.getLineWidth(0);
                }
                this.f28430m = f7;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f28428k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f28429l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f28428k = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 15));
                this.f28428k.addListener(new t8(this, 15));
                if (this.h <= 0) {
                    this.f28422c = 0;
                    this.f28428k.setDuration(220L);
                    this.f28428k.setInterpolator(new OvershootInterpolator());
                } else if (i10 == 0) {
                    this.f28422c = 1;
                    this.f28428k.setDuration(150L);
                    this.f28428k.setInterpolator(is.f27451f);
                } else {
                    this.f28422c = 2;
                    this.f28428k.setDuration(430L);
                    this.f28428k.setInterpolator(is.f27451f);
                }
                if (this.f28431n != null) {
                    String str2 = this.f28426i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i11 = 0; i11 < str2.length(); i11++) {
                            if (str2.charAt(i11) == str.charAt(i11)) {
                                int i12 = i11 + 1;
                                spannableStringBuilder.setSpan(new c00(false), i11, i12, 0);
                                spannableStringBuilder2.setSpan(new c00(false), i11, i12, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new c00(false), i11, i11 + 1, 0);
                            }
                        }
                        int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f28423e.measureText(str2.toString())));
                        TextPaint textPaint = this.f28423e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f28432o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f28433p = new StaticLayout(spannableStringBuilder3, this.f28423e, max, alignment, 1.0f, 0.0f, false);
                        this.f28434q = new StaticLayout(spannableStringBuilder2, this.f28423e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f28432o = this.f28431n;
                    }
                }
                this.f28435r = this.f28436s;
                if (i10 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f28427j = z12;
                this.f28428k.start();
            }
            if (i10 > 0) {
                this.f28436s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f28423e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f28423e, this.f28436s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f28431n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f7 = this.f28431n.getLineWidth(0);
                }
                this.f28430m = f7;
            }
            this.h = i10;
            this.f28426i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        if (i10 != this.f28440x) {
            int i12 = this.h;
            this.h = -1;
            if (this.f28422c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i12, z10);
            this.f28440x = i10;
        }
        this.f28441y = i11;
    }

    public final void e(float f7) {
        float f10;
        if (this.F) {
            f10 = AndroidUtilities.dp(5.5f);
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f28442z;
        if (i10 == 5) {
            float f11 = this.f28441y - f10;
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
            this.A = (int) ((this.f28441y - f7) / 2.0f);
        }
        this.B = this.A - f10;
    }
}
