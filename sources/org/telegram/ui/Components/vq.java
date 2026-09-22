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
public final class vq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.e6 J;
    public boolean f29390a;
    public Paint d;
    public boolean f29394g;
    public int h;
    public String f29395i;
    public boolean f29396j;
    public ValueAnimator f29397k;
    public float f29399m;
    public StaticLayout f29400n;
    public StaticLayout f29401o;
    public StaticLayout f29402p;
    public StaticLayout f29403q;
    public int f29404r;
    public int f29405s;
    public int f29406t;
    public int f29407u;
    public int f29409x;
    public int f29410y;
    public float f29391b = 1.0f;
    public int f29392c = -1;
    public TextPaint e = new TextPaint(1);
    public final RectF f29393f = new RectF();
    public float f29398l = 1.0f;
    public int v = org.telegram.ui.ActionBar.i6.f19117sf;
    public int f29408w = org.telegram.ui.ActionBar.i6.f19135tf;
    public int f29411z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public vq(View view, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.H = view;
        this.J = e6Var;
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
            org.telegram.ui.ActionBar.e6 e6Var = this.J;
            int v02 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
            int v03 = org.telegram.ui.ActionBar.i6.v0(this.f29408w, e6Var);
            if (this.f29407u != v02) {
                this.f29407u = v02;
                this.e.setColor(v02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.f29406t != v03) {
                this.f29406t = v03;
                paint2.setColor(v03);
            }
        }
        float f11 = this.f29398l;
        if (f11 != 1.0f) {
            int i12 = this.f29392c;
            if (i12 != 0 && i12 != 1) {
                float f12 = f11 * 2.0f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                int i13 = this.f29409x;
                float f13 = this.C;
                float f14 = f13 * 2.0f;
                float dp2 = (i13 - AndroidUtilities.dp(f14)) / 2.0f;
                int i14 = this.f29405s;
                int i15 = this.f29404r;
                if (i14 == i15) {
                    z10 = i14;
                } else {
                    z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f12, i15, i14 * f12);
                }
                e(z10);
                if (this.f29396j) {
                    float f15 = this.f29398l;
                    if (f15 <= 0.5f) {
                        interpolation = qr.f27421g.getInterpolation(f15 * 2.0f);
                    } else {
                        interpolation = qr.f27422i.getInterpolation(1.0f - ((f15 - 0.5f) * 2.0f));
                    }
                    f10 = (interpolation * 0.1f) + 1.0f;
                } else {
                    f10 = 1.0f;
                }
                float f16 = this.B;
                RectF rectF = this.f29393f;
                rectF.set(f16, dp2, z10 + f16 + AndroidUtilities.dp(f13 - 0.5f), AndroidUtilities.dp(f14) + dp2);
                canvas.save();
                canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                if (this.f29391b != 1.0f) {
                    canvas.save();
                    float f17 = this.f29391b;
                    canvas.scale(f17, f17, rectF.centerX(), rectF.centerY());
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.F && (paint = this.d) != null) {
                    float f18 = AndroidUtilities.density * f13;
                    canvas.drawRoundRect(rectF, f18, f18, paint);
                    if (this.f29394g && org.telegram.ui.ActionBar.i6.a1()) {
                        float f19 = f13 * AndroidUtilities.density;
                        canvas.drawRoundRect(rectF, f19, f19, org.telegram.ui.ActionBar.i6.f18901h2);
                    }
                }
                if (z11) {
                    canvas.restore();
                }
                canvas.clipRect(rectF);
                if (this.D == this.f29396j) {
                    z12 = false;
                }
                if (this.f29403q != null) {
                    canvas.save();
                    float f20 = this.A;
                    float dp3 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp4 = AndroidUtilities.dp(13.0f);
                    if (!z12) {
                        dp4 = -dp4;
                    }
                    canvas.translate(f20, com.google.android.gms.internal.vision.e2.z(1.0f, f12, dp4, dp3));
                    this.e.setAlpha((int) (f12 * 255.0f));
                    this.f29403q.draw(canvas);
                    canvas.restore();
                } else if (this.f29400n != null) {
                    canvas.save();
                    float f21 = this.A;
                    float dp5 = AndroidUtilities.dp(4.0f) + dp2;
                    int dp6 = AndroidUtilities.dp(13.0f);
                    if (!z12) {
                        dp6 = -dp6;
                    }
                    canvas.translate(f21, com.google.android.gms.internal.vision.e2.z(1.0f, f12, dp6, dp5));
                    this.e.setAlpha((int) (f12 * 255.0f));
                    this.f29400n.draw(canvas);
                    canvas.restore();
                }
                if (this.f29401o != null) {
                    canvas.save();
                    float f22 = this.A;
                    float dp7 = AndroidUtilities.dp(4.0f) + dp2;
                    if (z12) {
                        dp = -AndroidUtilities.dp(13.0f);
                    } else {
                        dp = AndroidUtilities.dp(13.0f);
                    }
                    canvas.translate(f22, (dp * f12) + dp7);
                    this.e.setAlpha((int) ((1.0f - f12) * 255.0f));
                    this.f29401o.draw(canvas);
                    canvas.restore();
                }
                if (this.f29402p != null) {
                    canvas.save();
                    canvas.translate(this.A, dp2 + AndroidUtilities.dp(4.0f));
                    this.e.setAlpha(255);
                    this.f29402p.draw(canvas);
                    canvas.restore();
                }
                this.e.setAlpha(255);
                canvas.restore();
                return;
            }
            e(this.f29405s);
            float f23 = (this.f29405s / 2.0f) + this.A;
            float f24 = this.f29409x / 2.0f;
            canvas.save();
            if (this.f29392c == 0) {
                f7 = this.f29398l;
            } else {
                f7 = 1.0f - this.f29398l;
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
        float dp = (this.f29409x - AndroidUtilities.dp(f10)) / 2.0f;
        e(this.f29405s);
        float f11 = this.B;
        RectF rectF = this.f29393f;
        rectF.set(f11, dp, this.f29405s + f11 + AndroidUtilities.dp(f7 - 0.5f), AndroidUtilities.dp(f10) + dp);
        if (this.d != null && this.F) {
            if (this.f29391b != 1.0f) {
                canvas.save();
                float f12 = this.f29391b;
                canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f13 = AndroidUtilities.density * f7;
            canvas.drawRoundRect(rectF, f13, f13, this.d);
            if (this.f29394g && org.telegram.ui.ActionBar.i6.a1()) {
                float f14 = f7 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f14, f14, org.telegram.ui.ActionBar.i6.f18901h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f29400n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.f29400n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z10) {
        String valueOf;
        boolean z11;
        boolean z12;
        View view;
        View view2;
        if (this.f29390a) {
            valueOf = AndroidUtilities.formatWholeNumber(i10, 0);
        } else {
            valueOf = String.valueOf(i10);
        }
        String str = valueOf;
        if (!TextUtils.equals(str, this.f29395i)) {
            ValueAnimator valueAnimator = this.f29397k;
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
                this.f29395i = str;
                if (i10 == 0) {
                    if (this.G && (view = this.H) != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f29405s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                StaticLayout staticLayout = new StaticLayout(str, this.e, this.f29405s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f29400n = staticLayout;
                if (staticLayout.getLineCount() >= 1) {
                    f7 = this.f29400n.getLineWidth(0);
                }
                this.f29399m = f7;
                View view3 = this.H;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (z11) {
                ValueAnimator valueAnimator2 = this.f29397k;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.f29398l = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f29397k = ofFloat;
                ofFloat.addUpdateListener(new i6(this, 14));
                this.f29397k.addListener(new p8(this, 15));
                if (this.h <= 0) {
                    this.f29392c = 0;
                    this.f29397k.setDuration(220L);
                    this.f29397k.setInterpolator(new OvershootInterpolator());
                } else if (i10 == 0) {
                    this.f29392c = 1;
                    this.f29397k.setDuration(150L);
                    this.f29397k.setInterpolator(qr.f27420f);
                } else {
                    this.f29392c = 2;
                    this.f29397k.setDuration(430L);
                    this.f29397k.setInterpolator(qr.f27420f);
                }
                if (this.f29400n != null) {
                    String str2 = this.f29395i;
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
                        this.f29401o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                        this.f29402p = new StaticLayout(spannableStringBuilder3, this.e, max, alignment, 1.0f, 0.0f, false);
                        this.f29403q = new StaticLayout(spannableStringBuilder2, this.e, max, alignment, 1.0f, 0.0f, false);
                    } else {
                        this.f29401o = this.f29400n;
                    }
                }
                this.f29404r = this.f29405s;
                if (i10 > this.h) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f29396j = z12;
                this.f29397k.start();
            }
            if (i10 > 0) {
                this.f29405s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                StaticLayout staticLayout2 = new StaticLayout(str, this.e, this.f29405s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f29400n = staticLayout2;
                if (staticLayout2.getLineCount() >= 1) {
                    f7 = this.f29400n.getLineWidth(0);
                }
                this.f29399m = f7;
            }
            this.h = i10;
            this.f29395i = str;
            View view4 = this.H;
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        if (i10 != this.f29409x) {
            int i12 = this.h;
            this.h = -1;
            if (this.f29392c == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c(i12, z10);
            this.f29409x = i10;
        }
        this.f29410y = i11;
    }

    public final void e(float f7) {
        float f10;
        if (this.F) {
            f10 = AndroidUtilities.dp(5.5f);
        } else {
            f10 = 0.0f;
        }
        int i10 = this.f29411z;
        if (i10 == 5) {
            float f11 = this.f29410y - f10;
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
            this.A = (int) ((this.f29410y - f7) / 2.0f);
        }
        this.B = this.A - f10;
    }
}
