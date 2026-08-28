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
public final class lq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.b6 J;
    public boolean f30514a;
    public Paint d;
    public boolean f30519g;
    public int h;
    public String f30520i;
    public boolean f30521j;
    public ValueAnimator f30522k;
    public float f30524m;
    public StaticLayout f30525n;
    public StaticLayout f30526o;
    public StaticLayout f30527p;
    public StaticLayout f30528q;
    public int f30529r;
    public int f30530s;
    public int f30531t;
    public int f30532u;
    public int f30534x;
    public int f30535y;
    public float f30515b = 1.0f;
    public int f30516c = -1;
    public TextPaint f30517e = new TextPaint(1);
    public final RectF f30518f = new RectF();
    public float f30523l = 1.0f;
    public int v = org.telegram.ui.ActionBar.f6.f23276sf;
    public int f30533w = org.telegram.ui.ActionBar.f6.f23294tf;
    public int f30536z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public lq(View view, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        this.H = view;
        this.J = b6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f30517e.setTypeface(AndroidUtilities.bold());
        this.f30517e.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(Canvas canvas) {
        float f10;
        float z10;
        float f11;
        boolean z11;
        int dp;
        Paint paint;
        float interpolation;
        int i9 = this.I;
        boolean z12 = true;
        if (i9 != 1 && i9 != 2) {
            int i10 = this.v;
            org.telegram.ui.ActionBar.b6 b6Var = this.J;
            int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
            int v03 = org.telegram.ui.ActionBar.f6.v0(this.f30533w, b6Var);
            if (this.f30532u != v02) {
                this.f30532u = v02;
                this.f30517e.setColor(v02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f30531t != v03) {
                this.f30531t = v03;
                paint2.setColor(v03);
            }
        }
        float f12 = this.f30523l;
        if (f12 != 1.0f) {
            int i11 = this.f30516c;
            if (i11 != 0 && i11 != 1) {
                float f13 = f12 * 2.0f;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                int i12 = this.f30534x;
                float f14 = this.C;
                float f15 = f14 * 2.0f;
                float dp2 = (i12 - AndroidUtilities.dp(f15)) / 2.0f;
                int i13 = this.f30530s;
                int i14 = this.f30529r;
                if (i13 == i14) {
                    z10 = i13;
                } else {
                    z10 = e2.c.z(1.0f, f13, i14, i13 * f13);
                }
                e(z10);
                if (this.f30521j) {
                    float f16 = this.f30523l;
                    if (f16 <= 0.5f) {
                        interpolation = gr.f28845g.getInterpolation(f16 * 2.0f);
                    } else {
                        interpolation = gr.f28846i.getInterpolation(1.0f - ((f16 - 0.5f) * 2.0f));
                    }
                    f11 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f11 = 1.0f;
                }
                float f17 = this.B;
                RectF rectF = this.f30518f;
                rectF.set(f17, dp2, z10 + f17 + AndroidUtilities.dp(f14 - 0.5f), AndroidUtilities.dp(f15) + dp2);
                canvas.save();
                canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                if (this.f30515b != 1.0f) {
                    canvas.save();
                    float f18 = this.f30515b;
                    canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f19 = AndroidUtilities.density * f14;
                    canvas.drawRoundRect(rectF, f19, f19, paint);
                    if (this.f30519g && org.telegram.ui.ActionBar.f6.a1()) {
                        float f20 = f14 * AndroidUtilities.density;
                        canvas.drawRoundRect(rectF, f20, f20, org.telegram.ui.ActionBar.f6.f23069h2);
                    }
                }
                if (z11) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f30521j) {
                    z12 = false;
                }
                if (this.f30528q != null) {
                    canvas.save();
                    float f21 = this.A;
                    float dp3 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp4 = AndroidUtilities.dp(13.0f);
                    if (!z12) {
                        dp4 = -dp4;
                    }
                    canvas.translate(f21, e2.c.z(1.0f, f13, dp4, dp3));
                    this.f30517e.setAlpha((int) (f13 * 255.0f));
                    this.f30528q.draw(canvas);
                    canvas.restore();
                } else if (this.f30525n != null) {
                    canvas.save();
                    float f22 = this.A;
                    float dp5 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp6 = AndroidUtilities.dp(13.0f);
                    if (!z12) {
                        dp6 = -dp6;
                    }
                    canvas.translate(f22, e2.c.z(1.0f, f13, dp6, dp5));
                    this.f30517e.setAlpha((int) (f13 * 255.0f));
                    this.f30525n.draw(canvas);
                    canvas.restore();
                }
                if (this.f30526o != null) {
                    canvas.save();
                    float f23 = this.A;
                    float dp7 = AndroidUtilities.dp(4.0f) + dp2;
                    if (z12) {
                        dp = -AndroidUtilities.dp(13.0f);
                    } else {
                        dp = AndroidUtilities.dp(13.0f);
                    }
                    canvas.translate(f23, (dp * f13) + dp7);
                    this.f30517e.setAlpha((int) ((1.0f - f13) * 255.0f));
                    this.f30526o.draw(canvas);
                    canvas.restore();
                }
                if (this.f30527p != null) {
                    canvas.save();
                    canvas.translate(this.A, dp2 + AndroidUtilities.dp(4.0f));
                    this.f30517e.setAlpha(255);
                    this.f30527p.draw(canvas);
                    canvas.restore();
                }
                this.f30517e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f30530s);
            float f24 = (this.f30530s / 2.0f) + this.A;
            float f25 = this.f30534x / 2.0f;
            canvas.save();
            if (this.f30516c == 0) {
                f10 = this.f30523l;
            } else {
                f10 = 1.0f - this.f30523l;
            }
            canvas.scale(f10, f10, f24, f25);
            b(canvas);
            canvas.restore();
            return;
        }
        b(canvas);
    }

    public final void b(Canvas canvas) {
        boolean z10;
        float f10 = this.C;
        float f11 = f10 * 2.0f;
        float dp = (this.f30534x - AndroidUtilities.dp(f11)) / 2.0f;
        e(this.f30530s);
        float f12 = this.B;
        RectF rectF = this.f30518f;
        rectF.set(f12, dp, this.f30530s + f12 + AndroidUtilities.dp(f10 - 0.5f), AndroidUtilities.dp(f11) + dp);
        if (this.d != null && this.F) {
            if (this.f30515b != 1.0f) {
                canvas.save();
                float f13 = this.f30515b;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f14 = AndroidUtilities.density * f10;
            canvas.drawRoundRect(rectF, f14, f14, this.d);
            if (this.f30519g && org.telegram.ui.ActionBar.f6.a1()) {
                float f15 = f10 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f15, f15, org.telegram.ui.ActionBar.f6.f23069h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f30525n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.f30525n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i9, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f30514a) {
            valueOf = AndroidUtilities.formatWholeNumber(i9, 0);
        } else {
            valueOf = String.valueOf(i9);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f30520i)) {
            ValueAnimator valueAnimator = this.f30522k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i9 > 0 && this.G && (view2 = this.H) != null) {
                view2.setVisibility(0);
            }
            if (Math.abs(i9 - this.h) > 99) {
                z11 = false;
            } else {
                z11 = z10;
            }
            float f10 = 0.0f;
            if (!z11) {
                this.h = i9;
                this.f30520i = str;
                if (i9 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f30530s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f30517e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f30517e, this.f30530s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f30525n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f10 = this.f30525n.getLineWidth(0);
                }
                this.f30524m = f10;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f30522k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f30523l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f30522k = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 14));
                this.f30522k.addListener(new org.telegram.ui.xp(this, 21));
                if (this.h <= 0) {
                    this.f30516c = 0;
                    this.f30522k.setDuration(220L);
                    this.f30522k.setInterpolator(new OvershootInterpolator());
                } else if (i9 == 0) {
                    this.f30516c = 1;
                    this.f30522k.setDuration(150L);
                    this.f30522k.setInterpolator(gr.f28844f);
                } else {
                    this.f30516c = 2;
                    this.f30522k.setDuration(430L);
                    this.f30522k.setInterpolator(gr.f28844f);
                }
                if (this.f30525n != null) {
                    String str2 = this.f30520i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            if (str2.charAt(i10) == str.charAt(i10)) {
                                int i11 = i10 + 1;
                                spannableStringBuilder.setSpan(new xy(false), i10, i11, 0);
                                spannableStringBuilder2.setSpan(new xy(false), i10, i11, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new xy(false), i10, i10 + 1, 0);
                            }
                        }
                        int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f30517e.measureText(str2.toString())));
                        TextPaint textPaint = this.f30517e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f30526o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f30527p = new StaticLayout(spannableStringBuilder3, this.f30517e, max, alignment, 1.0f, 0.0f, false);
                        this.f30528q = new StaticLayout(spannableStringBuilder2, this.f30517e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f30526o = this.f30525n;
                    }
                }
                this.f30529r = this.f30530s;
                if (i9 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f30521j = z12;
                this.f30522k.start();
            }
            if (i9 > 0) {
                this.f30530s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f30517e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f30517e, this.f30530s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f30525n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f10 = this.f30525n.getLineWidth(0);
                }
                this.f30524m = f10;
            }
            this.h = i9;
            this.f30520i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i9, int i10) {
        boolean z10;
        if (i9 != this.f30534x) {
            int i11 = this.h;
            this.h = -1;
            if (this.f30516c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i11, z10);
            this.f30534x = i9;
        }
        this.f30535y = i10;
    }

    public final void e(float f10) {
        float f11;
        if (this.F) {
            f11 = AndroidUtilities.dp(5.5f);
        } else {
            f11 = 0.0f;
        }
        int i9 = this.f30536z;
        if (i9 == 5) {
            float f12 = this.f30535y - f11;
            this.A = f12;
            float f13 = this.E;
            if (f13 != 0.0f) {
                this.A = f12 - Math.max((f10 / 2.0f) + f13, f10);
            } else {
                this.A = f12 - f10;
            }
        } else if (i9 == 3) {
            this.A = f11;
        } else {
            this.A = (int) ((this.f30535y - f10) / 2.0f);
        }
        this.B = this.A - f11;
    }
}
