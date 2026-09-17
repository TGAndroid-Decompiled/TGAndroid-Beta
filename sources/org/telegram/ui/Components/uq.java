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
public final class uq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.f6 J;
    public boolean f30963a;
    public Paint d;
    public boolean f30968g;
    public int h;
    public String f30969i;
    public boolean f30970j;
    public ValueAnimator f30971k;
    public float f30973m;
    public StaticLayout f30974n;
    public StaticLayout f30975o;
    public StaticLayout f30976p;
    public StaticLayout f30977q;
    public int f30978r;
    public int f30979s;
    public int f30980t;
    public int f30981u;
    public int f30983x;
    public int f30984y;
    public float f30964b = 1.0f;
    public int f30965c = -1;
    public TextPaint f30966e = new TextPaint(1);
    public final RectF f30967f = new RectF();
    public float f30972l = 1.0f;
    public int v = org.telegram.ui.ActionBar.j6.f20972sf;
    public int f30982w = org.telegram.ui.ActionBar.j6.f20990tf;
    public int f30985z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public uq(View view, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.H = view;
        this.J = f6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.f30966e.setTypeface(AndroidUtilities.bold());
        this.f30966e.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(Canvas canvas) {
        float f7;
        float z10;
        float f10;
        boolean z11;
        int dp;
        Paint paint;
        float interpolation;
        int i10 = this.I;
        boolean z12 = true;
        if (i10 != 1 && i10 != 2) {
            int i11 = this.v;
            org.telegram.ui.ActionBar.f6 f6Var = this.J;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
            int v03 = org.telegram.ui.ActionBar.j6.v0(this.f30982w, f6Var);
            if (this.f30981u != v02) {
                this.f30981u = v02;
                this.f30966e.setColor(v02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f30980t != v03) {
                this.f30980t = v03;
                paint2.setColor(v03);
            }
        }
        float f11 = this.f30972l;
        if (f11 != 1.0f) {
            int i12 = this.f30965c;
            if (i12 != 0 && i12 != 1) {
                float f12 = f11 * 2.0f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                int i13 = this.f30983x;
                float f13 = this.C;
                float f14 = f13 * 2.0f;
                float dp2 = (i13 - AndroidUtilities.dp(f14)) / 2.0f;
                int i14 = this.f30979s;
                int i15 = this.f30978r;
                if (i14 == i15) {
                    z10 = i14;
                } else {
                    z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f12, i15, i14 * f12);
                }
                e(z10);
                if (this.f30970j) {
                    float f15 = this.f30972l;
                    if (f15 <= 0.5f) {
                        interpolation = pr.f29495g.getInterpolation(f15 * 2.0f);
                    } else {
                        interpolation = pr.f29496i.getInterpolation(1.0f - ((f15 - 0.5f) * 2.0f));
                    }
                    f10 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f10 = 1.0f;
                }
                float f16 = this.B;
                RectF rectF = this.f30967f;
                rectF.set(f16, dp2, z10 + f16 + AndroidUtilities.dp(f13 - 0.5f), AndroidUtilities.dp(f14) + dp2);
                canvas.save();
                canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                if (this.f30964b != 1.0f) {
                    canvas.save();
                    float f17 = this.f30964b;
                    canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f18 = AndroidUtilities.density * f13;
                    canvas.drawRoundRect(rectF, f18, f18, paint);
                    if (this.f30968g && org.telegram.ui.ActionBar.j6.a1()) {
                        float f19 = f13 * AndroidUtilities.density;
                        canvas.drawRoundRect(rectF, f19, f19, org.telegram.ui.ActionBar.j6.f20759h2);
                    }
                }
                if (z11) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f30970j) {
                    z12 = false;
                }
                if (this.f30977q != null) {
                    canvas.save();
                    float f20 = this.A;
                    float dp3 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp4 = AndroidUtilities.dp(13.0f);
                    if (!z12) {
                        dp4 = -dp4;
                    }
                    canvas.translate(f20, com.google.android.gms.internal.vision.e2.z(1.0f, f12, dp4, dp3));
                    this.f30966e.setAlpha((int) (f12 * 255.0f));
                    this.f30977q.draw(canvas);
                    canvas.restore();
                } else if (this.f30974n != null) {
                    canvas.save();
                    float f21 = this.A;
                    float dp5 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp6 = AndroidUtilities.dp(13.0f);
                    if (!z12) {
                        dp6 = -dp6;
                    }
                    canvas.translate(f21, com.google.android.gms.internal.vision.e2.z(1.0f, f12, dp6, dp5));
                    this.f30966e.setAlpha((int) (f12 * 255.0f));
                    this.f30974n.draw(canvas);
                    canvas.restore();
                }
                if (this.f30975o != null) {
                    canvas.save();
                    float f22 = this.A;
                    float dp7 = AndroidUtilities.dp(4.0f) + dp2;
                    if (z12) {
                        dp = -AndroidUtilities.dp(13.0f);
                    } else {
                        dp = AndroidUtilities.dp(13.0f);
                    }
                    canvas.translate(f22, (dp * f12) + dp7);
                    this.f30966e.setAlpha((int) ((1.0f - f12) * 255.0f));
                    this.f30975o.draw(canvas);
                    canvas.restore();
                }
                if (this.f30976p != null) {
                    canvas.save();
                    canvas.translate(this.A, dp2 + AndroidUtilities.dp(4.0f));
                    this.f30966e.setAlpha(255);
                    this.f30976p.draw(canvas);
                    canvas.restore();
                }
                this.f30966e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f30979s);
            float f23 = (this.f30979s / 2.0f) + this.A;
            float f24 = this.f30983x / 2.0f;
            canvas.save();
            if (this.f30965c == 0) {
                f7 = this.f30972l;
            } else {
                f7 = 1.0f - this.f30972l;
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
        float dp = (this.f30983x - AndroidUtilities.dp(f10)) / 2.0f;
        e(this.f30979s);
        float f11 = this.B;
        RectF rectF = this.f30967f;
        rectF.set(f11, dp, this.f30979s + f11 + AndroidUtilities.dp(f7 - 0.5f), AndroidUtilities.dp(f10) + dp);
        if (this.d != null && this.F) {
            if (this.f30964b != 1.0f) {
                canvas.save();
                float f12 = this.f30964b;
                canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f13 = AndroidUtilities.density * f7;
            canvas.drawRoundRect(rectF, f13, f13, this.d);
            if (this.f30968g && org.telegram.ui.ActionBar.j6.a1()) {
                float f14 = f7 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f14, f14, org.telegram.ui.ActionBar.j6.f20759h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f30974n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.f30974n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f30963a) {
            valueOf = AndroidUtilities.formatWholeNumber(i10, 0);
        } else {
            valueOf = String.valueOf(i10);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f30969i)) {
            ValueAnimator valueAnimator = this.f30971k;
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
                this.f30969i = str;
                if (i10 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f30979s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f30966e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.f30966e, this.f30979s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f30974n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f7 = this.f30974n.getLineWidth(0);
                }
                this.f30973m = f7;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f30971k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f30972l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f30971k = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 14));
                this.f30971k.addListener(new j6(this, 18));
                if (this.h <= 0) {
                    this.f30965c = 0;
                    this.f30971k.setDuration(220L);
                    this.f30971k.setInterpolator(new OvershootInterpolator());
                } else if (i10 == 0) {
                    this.f30965c = 1;
                    this.f30971k.setDuration(150L);
                    this.f30971k.setInterpolator(pr.f29494f);
                } else {
                    this.f30965c = 2;
                    this.f30971k.setDuration(430L);
                    this.f30971k.setInterpolator(pr.f29494f);
                }
                if (this.f30974n != null) {
                    String str2 = this.f30969i;
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
                        int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f30966e.measureText(str2.toString())));
                        TextPaint textPaint = this.f30966e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f30975o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f30976p = new StaticLayout(spannableStringBuilder3, this.f30966e, max, alignment, 1.0f, 0.0f, false);
                        this.f30977q = new StaticLayout(spannableStringBuilder2, this.f30966e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f30975o = this.f30974n;
                    }
                }
                this.f30978r = this.f30979s;
                if (i10 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f30970j = z12;
                this.f30971k.start();
            }
            if (i10 > 0) {
                this.f30979s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.f30966e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.f30966e, this.f30979s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f30974n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f7 = this.f30974n.getLineWidth(0);
                }
                this.f30973m = f7;
            }
            this.h = i10;
            this.f30969i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        if (i10 != this.f30983x) {
            int i12 = this.h;
            this.h = -1;
            if (this.f30965c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i12, z10);
            this.f30983x = i10;
        }
        this.f30984y = i11;
    }

    public final void e(float f7) {
        float f10;
        if (this.F) {
            f10 = AndroidUtilities.dp(5.5f);
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f30985z;
        if (i10 == 5) {
            float f11 = this.f30984y - f10;
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
            this.A = (int) ((this.f30984y - f7) / 2.0f);
        }
        this.B = this.A - f10;
    }
}
