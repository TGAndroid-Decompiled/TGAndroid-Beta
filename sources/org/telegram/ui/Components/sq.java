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
public final class sq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.f6 J;
    public boolean f28775a;
    public Paint d;
    public boolean f28779g;
    public int h;
    public String f28780i;
    public boolean f28781j;
    public ValueAnimator f28782k;
    public float f28784m;
    public StaticLayout f28785n;
    public StaticLayout f28786o;
    public StaticLayout f28787p;
    public StaticLayout f28788q;
    public int f28789r;
    public int f28790s;
    public int f28791t;
    public int f28792u;
    public int f28794x;
    public int f28795y;
    public float f28776b = 1.0f;
    public int f28777c = -1;
    public TextPaint e = new TextPaint(1);
    public final RectF f28778f = new RectF();
    public float f28783l = 1.0f;
    public int v = org.telegram.ui.ActionBar.j6.f20156sf;
    public int f28793w = org.telegram.ui.ActionBar.j6.f20172tf;
    public int f28796z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public sq(View view, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        this.H = view;
        this.J = f6Var;
        this.F = z4;
        if (z4) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(Canvas canvas) {
        float f10;
        float w10;
        float f11;
        boolean z4;
        int dp;
        Paint paint;
        float interpolation;
        int i10 = this.I;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            int i11 = this.v;
            org.telegram.ui.ActionBar.f6 f6Var = this.J;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
            int v03 = org.telegram.ui.ActionBar.j6.v0(this.f28793w, f6Var);
            if (this.f28792u != v02) {
                this.f28792u = v02;
                this.e.setColor(v02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f28791t != v03) {
                this.f28791t = v03;
                paint2.setColor(v03);
            }
        }
        float f12 = this.f28783l;
        if (f12 != 1.0f) {
            int i12 = this.f28777c;
            if (i12 != 0 && i12 != 1) {
                float f13 = f12 * 2.0f;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                int i13 = this.f28794x;
                float f14 = this.C;
                float f15 = f14 * 2.0f;
                float dp2 = (i13 - AndroidUtilities.dp(f15)) / 2.0f;
                int i14 = this.f28790s;
                int i15 = this.f28789r;
                if (i14 == i15) {
                    w10 = i14;
                } else {
                    w10 = e2.c.w(1.0f, f13, i15, i14 * f13);
                }
                e(w10);
                if (this.f28781j) {
                    float f16 = this.f28783l;
                    if (f16 <= 0.5f) {
                        interpolation = mr.f27123g.getInterpolation(f16 * 2.0f);
                    } else {
                        interpolation = mr.f27124i.getInterpolation(1.0f - ((f16 - 0.5f) * 2.0f));
                    }
                    f11 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f11 = 1.0f;
                }
                float f17 = this.B;
                RectF rectF = this.f28778f;
                rectF.set(f17, dp2, w10 + f17 + AndroidUtilities.dp(f14 - 0.5f), AndroidUtilities.dp(f15) + dp2);
                canvas.save();
                canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                if (this.f28776b != 1.0f) {
                    canvas.save();
                    float f18 = this.f28776b;
                    canvas.scale(f18, f18, rectF.centerX(), rectF.centerY());
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f19 = AndroidUtilities.density * f14;
                    canvas.drawRoundRect(rectF, f19, f19, paint);
                    if (this.f28779g && org.telegram.ui.ActionBar.j6.a1()) {
                        float f20 = f14 * AndroidUtilities.density;
                        canvas.drawRoundRect(rectF, f20, f20, org.telegram.ui.ActionBar.j6.f19949h2);
                    }
                }
                if (z4) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f28781j) {
                    z10 = false;
                }
                if (this.f28788q != null) {
                    canvas.save();
                    float f21 = this.A;
                    float dp3 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp4 = AndroidUtilities.dp(13.0f);
                    if (!z10) {
                        dp4 = -dp4;
                    }
                    canvas.translate(f21, e2.c.w(1.0f, f13, dp4, dp3));
                    this.e.setAlpha((int) (f13 * 255.0f));
                    this.f28788q.draw(canvas);
                    canvas.restore();
                } else if (this.f28785n != null) {
                    canvas.save();
                    float f22 = this.A;
                    float dp5 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp6 = AndroidUtilities.dp(13.0f);
                    if (!z10) {
                        dp6 = -dp6;
                    }
                    canvas.translate(f22, e2.c.w(1.0f, f13, dp6, dp5));
                    this.e.setAlpha((int) (f13 * 255.0f));
                    this.f28785n.draw(canvas);
                    canvas.restore();
                }
                if (this.f28786o != null) {
                    canvas.save();
                    float f23 = this.A;
                    float dp7 = AndroidUtilities.dp(4.0f) + dp2;
                    if (z10) {
                        dp = -AndroidUtilities.dp(13.0f);
                    } else {
                        dp = AndroidUtilities.dp(13.0f);
                    }
                    canvas.translate(f23, (dp * f13) + dp7);
                    this.e.setAlpha((int) ((1.0f - f13) * 255.0f));
                    this.f28786o.draw(canvas);
                    canvas.restore();
                }
                if (this.f28787p != null) {
                    canvas.save();
                    canvas.translate(this.A, dp2 + AndroidUtilities.dp(4.0f));
                    this.e.setAlpha(255);
                    this.f28787p.draw(canvas);
                    canvas.restore();
                }
                this.e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f28790s);
            float f24 = (this.f28790s / 2.0f) + this.A;
            float f25 = this.f28794x / 2.0f;
            canvas.save();
            if (this.f28777c == 0) {
                f10 = this.f28783l;
            } else {
                f10 = 1.0f - this.f28783l;
            }
            canvas.scale(f10, f10, f24, f25);
            b(canvas);
            canvas.restore();
            return;
        }
        b(canvas);
    }

    public final void b(Canvas canvas) {
        boolean z4;
        float f10 = this.C;
        float f11 = f10 * 2.0f;
        float dp = (this.f28794x - AndroidUtilities.dp(f11)) / 2.0f;
        e(this.f28790s);
        float f12 = this.B;
        RectF rectF = this.f28778f;
        rectF.set(f12, dp, this.f28790s + f12 + AndroidUtilities.dp(f10 - 0.5f), AndroidUtilities.dp(f11) + dp);
        if (this.d != null && this.F) {
            if (this.f28776b != 1.0f) {
                canvas.save();
                float f13 = this.f28776b;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                z4 = true;
            } else {
                z4 = false;
            }
            float f14 = AndroidUtilities.density * f10;
            canvas.drawRoundRect(rectF, f14, f14, this.d);
            if (this.f28779g && org.telegram.ui.ActionBar.j6.a1()) {
                float f15 = f10 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f15, f15, org.telegram.ui.ActionBar.j6.f19949h2);
            }
            if (z4) {
                canvas.restore();
            }
        }
        if (this.f28785n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.f28785n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z4) {
        String valueOf;
        boolean z10;
        boolean z11;
        View view;
        View view2;
        if (this.f28775a) {
            valueOf = AndroidUtilities.formatWholeNumber(i10, 0);
        } else {
            valueOf = String.valueOf(i10);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f28780i)) {
            ValueAnimator valueAnimator = this.f28782k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i10 > 0 && this.G && (view2 = this.H) != null) {
                view2.setVisibility(0);
            }
            if (Math.abs(i10 - this.h) > 99) {
                z10 = false;
            } else {
                z10 = z4;
            }
            float f10 = 0.0f;
            if (!z10) {
                this.h = i10;
                this.f28780i = str;
                if (i10 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f28790s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.e, this.f28790s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f28785n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f10 = this.f28785n.getLineWidth(0);
                }
                this.f28784m = f10;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z10) {
                ValueAnimator valueAnimator2 = this.f28782k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f28783l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f28782k = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 14));
                this.f28782k.addListener(new a9(this, 14));
                if (this.h <= 0) {
                    this.f28777c = 0;
                    this.f28782k.setDuration(220L);
                    this.f28782k.setInterpolator(new OvershootInterpolator());
                } else if (i10 == 0) {
                    this.f28777c = 1;
                    this.f28782k.setDuration(150L);
                    this.f28782k.setInterpolator(mr.f27122f);
                } else {
                    this.f28777c = 2;
                    this.f28782k.setDuration(430L);
                    this.f28782k.setInterpolator(mr.f27122f);
                }
                if (this.f28785n != null) {
                    String str2 = this.f28780i;
                    if (str2.length() == str.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        for (int i11 = 0; i11 < str2.length(); i11++) {
                            if (str2.charAt(i11) == str.charAt(i11)) {
                                int i12 = i11 + 1;
                                spannableStringBuilder.setSpan(new lz(false), i11, i12, 0);
                                spannableStringBuilder2.setSpan(new lz(false), i11, i12, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new lz(false), i11, i11 + 1, 0);
                            }
                        }
                        int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(str2.toString())));
                        TextPaint textPaint = this.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f28786o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f28787p = new StaticLayout(spannableStringBuilder3, this.e, max, alignment, 1.0f, 0.0f, false);
                        this.f28788q = new StaticLayout(spannableStringBuilder2, this.e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f28786o = this.f28785n;
                    }
                }
                this.f28789r = this.f28790s;
                if (i10 > this.h) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f28781j = z11;
                this.f28782k.start();
            }
            if (i10 > 0) {
                this.f28790s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.e, this.f28790s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f28785n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f10 = this.f28785n.getLineWidth(0);
                }
                this.f28784m = f10;
            }
            this.h = i10;
            this.f28780i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z4;
        if (i10 != this.f28794x) {
            int i12 = this.h;
            this.h = -1;
            if (this.f28777c == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            c(i12, z4);
            this.f28794x = i10;
        }
        this.f28795y = i11;
    }

    public final void e(float f10) {
        float f11;
        if (this.F) {
            f11 = AndroidUtilities.dp(5.5f);
        } else {
            f11 = 0.0f;
        }
        int i10 = this.f28796z;
        if (i10 == 5) {
            float f12 = this.f28795y - f11;
            this.A = f12;
            float f13 = this.E;
            if (f13 != 0.0f) {
                this.A = f12 - Math.max((f10 / 2.0f) + f13, f10);
            } else {
                this.A = f12 - f10;
            }
        } else if (i10 == 3) {
            this.A = f11;
        } else {
            this.A = (int) ((this.f28795y - f10) / 2.0f);
        }
        this.B = this.A - f11;
    }
}
