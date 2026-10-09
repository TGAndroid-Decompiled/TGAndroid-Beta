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
    public final org.telegram.ui.ActionBar.e6 J;
    public boolean f28550a;
    public Paint d;
    public boolean f28555g;
    public int h;
    public String f28556i;
    public boolean f28557j;
    public ValueAnimator f28558k;
    public float f28560m;
    public StaticLayout f28561n;
    public StaticLayout f28562o;
    public StaticLayout f28563p;
    public StaticLayout f28564q;
    public int f28565r;
    public int f28566s;
    public int f28567t;
    public int f28568u;
    public int f28570x;
    public int f28571y;
    public float f28551b = 1.0f;
    public int f28552c = -1;
    public TextPaint f28553e = new TextPaint(1);
    public final RectF f28554f = new RectF();
    public float f28559l = 1.0f;
    public int v = org.telegram.ui.ActionBar.i6.f21082sf;
    public int f28569w = org.telegram.ui.ActionBar.i6.f21100tf;
    public int f28572z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public lr(View view, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.H = view;
        this.J = e6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f28553e.setTypeface(AndroidUtilities.bold());
        this.f28553e.setTextSize(AndroidUtilities.dp(13.0f));
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
            org.telegram.ui.ActionBar.e6 e6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
            int w03 = org.telegram.ui.ActionBar.i6.w0(this.f28569w, e6Var);
            if (this.f28568u != w02) {
                this.f28568u = w02;
                this.f28553e.setColor(w02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f28567t != w03) {
                this.f28567t = w03;
                paint2.setColor(w03);
            }
        }
        float f11 = this.f28559l;
        if (f11 != 1.0f) {
            int i12 = this.f28552c;
            if (i12 != 0 && i12 != 1) {
                float f12 = f11 * 2.0f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                int i13 = this.f28570x;
                float f13 = this.C;
                float f14 = f13 * 2.0f;
                float dp2 = (i13 - AndroidUtilities.dp(f14)) / 2.0f;
                int i14 = this.f28566s;
                int i15 = this.f28565r;
                if (i14 == i15) {
                    y3 = i14;
                } else {
                    y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f12, i15, i14 * f12);
                }
                e(y3);
                if (this.f28557j) {
                    float f15 = this.f28559l;
                    if (f15 <= 0.5f) {
                        interpolation = hs.f27119g.getInterpolation(f15 * 2.0f);
                    } else {
                        interpolation = hs.f27120i.getInterpolation(1.0f - ((f15 - 0.5f) * 2.0f));
                    }
                    f10 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f10 = 1.0f;
                }
                float f16 = this.B;
                RectF rectF = this.f28554f;
                rectF.set(f16, dp2, y3 + f16 + AndroidUtilities.dp(f13 - 0.5f), AndroidUtilities.dp(f14) + dp2);
                canvas.save();
                canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                if (this.f28551b != 1.0f) {
                    canvas.save();
                    float f17 = this.f28551b;
                    canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f18 = AndroidUtilities.density * f13;
                    canvas.drawRoundRect(rectF, f18, f18, paint);
                    if (this.f28555g && org.telegram.ui.ActionBar.i6.b1()) {
                        float f19 = f13 * AndroidUtilities.density;
                        canvas.drawRoundRect(rectF, f19, f19, org.telegram.ui.ActionBar.i6.f20865h2);
                    }
                }
                if (z10) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f28557j) {
                    z11 = false;
                }
                if (this.f28564q != null) {
                    canvas.save();
                    float f20 = this.A;
                    float dp3 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp4 = AndroidUtilities.dp(13.0f);
                    if (!z11) {
                        dp4 = -dp4;
                    }
                    canvas.translate(f20, com.google.android.gms.internal.vision.e2.y(1.0f, f12, dp4, dp3));
                    this.f28553e.setAlpha((int) (f12 * 255.0f));
                    this.f28564q.draw(canvas);
                    canvas.restore();
                } else if (this.f28561n != null) {
                    canvas.save();
                    float f21 = this.A;
                    float dp5 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp6 = AndroidUtilities.dp(13.0f);
                    if (!z11) {
                        dp6 = -dp6;
                    }
                    canvas.translate(f21, com.google.android.gms.internal.vision.e2.y(1.0f, f12, dp6, dp5));
                    this.f28553e.setAlpha((int) (f12 * 255.0f));
                    this.f28561n.draw(canvas);
                    canvas.restore();
                }
                if (this.f28562o != null) {
                    canvas.save();
                    float f22 = this.A;
                    float dp7 = AndroidUtilities.dp(4.0f) + dp2;
                    if (z11) {
                        dp = -AndroidUtilities.dp(13.0f);
                    } else {
                        dp = AndroidUtilities.dp(13.0f);
                    }
                    canvas.translate(f22, (dp * f12) + dp7);
                    this.f28553e.setAlpha((int) ((1.0f - f12) * 255.0f));
                    this.f28562o.draw(canvas);
                    canvas.restore();
                }
                if (this.f28563p != null) {
                    canvas.save();
                    canvas.translate(this.A, dp2 + AndroidUtilities.dp(4.0f));
                    this.f28553e.setAlpha(255);
                    this.f28563p.draw(canvas);
                    canvas.restore();
                }
                this.f28553e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f28566s);
            float f23 = (this.f28566s / 2.0f) + this.A;
            float f24 = this.f28570x / 2.0f;
            canvas.save();
            if (this.f28552c == 0) {
                f7 = this.f28559l;
            } else {
                f7 = 1.0f - this.f28559l;
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
        float dp = (this.f28570x - AndroidUtilities.dp(f10)) / 2.0f;
        e(this.f28566s);
        float f11 = this.B;
        RectF rectF = this.f28554f;
        rectF.set(f11, dp, this.f28566s + f11 + AndroidUtilities.dp(f7 - 0.5f), AndroidUtilities.dp(f10) + dp);
        if (this.d != null && this.F) {
            if (this.f28551b != 1.0f) {
                canvas.save();
                float f12 = this.f28551b;
                canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f13 = AndroidUtilities.density * f7;
            canvas.drawRoundRect(rectF, f13, f13, this.d);
            if (this.f28555g && org.telegram.ui.ActionBar.i6.b1()) {
                float f14 = f7 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f14, f14, org.telegram.ui.ActionBar.i6.f20865h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f28561n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.f28561n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f28550a) {
            valueOf = AndroidUtilities.formatWholeNumber(i10, 0);
        } else {
            valueOf = String.valueOf(i10);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f28556i)) {
            ValueAnimator valueAnimator = this.f28558k;
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
                this.f28556i = str;
                if (i10 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f28566s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f28553e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f28553e, this.f28566s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f28561n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f7 = this.f28561n.getLineWidth(0);
                }
                this.f28560m = f7;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f28558k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f28559l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f28558k = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 15));
                this.f28558k.addListener(new t8(this, 15));
                if (this.h <= 0) {
                    this.f28552c = 0;
                    this.f28558k.setDuration(220L);
                    this.f28558k.setInterpolator(new OvershootInterpolator());
                } else if (i10 == 0) {
                    this.f28552c = 1;
                    this.f28558k.setDuration(150L);
                    this.f28558k.setInterpolator(hs.f27118f);
                } else {
                    this.f28552c = 2;
                    this.f28558k.setDuration(430L);
                    this.f28558k.setInterpolator(hs.f27118f);
                }
                if (this.f28561n != null) {
                    String str2 = this.f28556i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i11 = 0; i11 < str2.length(); i11++) {
                            if (str2.charAt(i11) == str.charAt(i11)) {
                                int i12 = i11 + 1;
                                spannableStringBuilder.setSpan(new b00(false), i11, i12, 0);
                                spannableStringBuilder2.setSpan(new b00(false), i11, i12, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new b00(false), i11, i11 + 1, 0);
                            }
                        }
                        int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f28553e.measureText(str2.toString())));
                        TextPaint textPaint = this.f28553e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f28562o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f28563p = new StaticLayout(spannableStringBuilder3, this.f28553e, max, alignment, 1.0f, 0.0f, false);
                        this.f28564q = new StaticLayout(spannableStringBuilder2, this.f28553e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f28562o = this.f28561n;
                    }
                }
                this.f28565r = this.f28566s;
                if (i10 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f28557j = z12;
                this.f28558k.start();
            }
            if (i10 > 0) {
                this.f28566s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f28553e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f28553e, this.f28566s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f28561n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f7 = this.f28561n.getLineWidth(0);
                }
                this.f28560m = f7;
            }
            this.h = i10;
            this.f28556i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        if (i10 != this.f28570x) {
            int i12 = this.h;
            this.h = -1;
            if (this.f28552c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i12, z10);
            this.f28570x = i10;
        }
        this.f28571y = i11;
    }

    public final void e(float f7) {
        float f10;
        if (this.F) {
            f10 = AndroidUtilities.dp(5.5f);
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f28572z;
        if (i10 == 5) {
            float f11 = this.f28571y - f10;
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
            this.A = (int) ((this.f28571y - f7) / 2.0f);
        }
        this.B = this.A - f10;
    }
}
