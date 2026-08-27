package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class wz extends View {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public StaticLayout G;
    public StaticLayout H;
    public StaticLayout I;
    public CharSequence J;
    public p5 K;
    public StaticLayout L;
    public p5 M;
    public StaticLayout N;
    public p5 O;
    public StaticLayout P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;

    public ValueAnimator f34378a;

    public float f34379a0;

    public vz f34380b;

    public float f34381b0;

    public int f34382c;

    public float f34383c0;
    public int d;

    public float f34384d0;

    public int f34385e;

    public float f34386e0;

    public final RectF f34387f;

    public float f34388f0;

    public float f34389g0;
    public CharSequence h;

    public boolean f34390h0;

    public final yz f34391i0;

    public boolean f34392n;

    public p5 f34393r;

    public StaticLayout f34394s;
    public int v;

    public boolean f34395w;

    public float f34396x;

    public float f34397y;

    public wz(yz yzVar, Context context) {
        super(context);
        this.f34391i0 = yzVar;
        this.f34387f = new RectF();
        this.E = -1;
    }

    public final void a() {
        this.f34395w = false;
        this.D = false;
        this.Q = false;
        this.C = false;
        this.S = false;
        this.f34378a = null;
        invalidate();
    }

    public final void b(float f10, int i10) {
        if (i10 == 6) {
            this.f34397y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f10));
        valueAnimatorOfFloat.addUpdateListener(new pz(this, 1));
        animatorSet.playTogether(valueAnimatorOfFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new hh.fb(this, i10, f10, 1));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.f34380b.f34072a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f34390h0 = true;
        super.onAttachedToWindow();
        this.f34393r = t5.update(this.f34380b.f34077g ? 26 : 0, this, this.f34393r, this.f34394s);
        this.K = t5.update(this.f34380b.f34077g ? 26 : 0, this, this.K, this.L);
        this.M = t5.update(this.f34380b.f34077g ? 26 : 0, this, this.M, this.N);
        this.O = t5.update(this.f34380b.f34077g ? 26 : 0, this, this.O, this.P);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34390h0 = false;
        super.onDetachedFromWindow();
        this.f34395w = false;
        this.D = false;
        this.Q = false;
        this.C = false;
        this.S = false;
        ValueAnimator valueAnimator = this.f34378a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34378a.removeAllUpdateListeners();
            this.f34378a.cancel();
            this.f34378a = null;
        }
        invalidate();
        t5.release(this, this.f34393r);
        t5.release(this, this.K);
        t5.release(this, this.M);
        t5.release(this, this.O);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.c6 c6Var;
        boolean z10;
        String str;
        float f12;
        int iDp;
        int iDp2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i18;
        String str2;
        int i19;
        float f13;
        float f14;
        TextPaint textPaint;
        float f15;
        float f16;
        float f17;
        boolean z11;
        float fDp;
        int iX;
        int i20;
        float f18;
        float f19;
        float f20;
        RectF rectF;
        float f21;
        int iDp3;
        int lineBottom;
        int lineTop;
        float fDp2;
        float f22;
        float f23;
        float f24;
        int i21;
        TextPaint textPaint2;
        float f25;
        Canvas canvas2 = canvas;
        boolean z12 = this.f34380b.f34075e;
        yz yzVar = this.f34391i0;
        TextPaint textPaint3 = yzVar.d;
        Paint paint = yzVar.f35075e;
        TextPaint textPaint4 = yzVar.f35072c;
        TextPaint textPaint5 = yzVar.f35070b;
        org.telegram.ui.ActionBar.c6 c6Var3 = yzVar.f35068a;
        if (yzVar.v != 0.0f) {
            canvas2.save();
            float f26 = yzVar.v;
            int i22 = this.f34385e % 2;
            f10 = 0.0f;
            float fSin = (float) Math.sin(((double) ((f26 * (i22 == 0 ? 1.0f : -1.0f)) + i22)) * 3.141592653589793d * 2.5d);
            f11 = 400.0f;
            double dElapsedRealtime = (float) (((double) (SystemClock.elapsedRealtime() / 400.0f)) * 3.141592653589793d * ((double) (this.f34385e % 2 == 0 ? 1.0f : -1.0f)));
            canvas2.translate((float) (Math.cos(dElapsedRealtime) * ((double) AndroidUtilities.dp(0.33f)) * ((double) (this.f34385e % 2 == 0 ? 1.0f : -1.0f))), (float) (Math.sin(dElapsedRealtime) * ((double) (-AndroidUtilities.dp(0.33f)))));
            canvas2.rotate(fSin * 1.4f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        } else {
            f10 = 0.0f;
            f11 = 400.0f;
        }
        int i23 = yzVar.N;
        if (i23 != -1) {
            i11 = yzVar.H;
            i10 = i23;
        } else {
            i10 = yzVar.H;
            i11 = yzVar.f35086n0;
        }
        int i24 = this.f34380b.f34072a;
        if (i24 == i10) {
            i12 = yzVar.R;
            i13 = yzVar.W;
            i14 = yzVar.S;
            i17 = yzVar.f35069a0;
            i15 = org.telegram.ui.ActionBar.g6.T9;
            i16 = org.telegram.ui.ActionBar.g6.U9;
        } else {
            i12 = yzVar.S;
            i13 = yzVar.f35069a0;
            i14 = yzVar.R;
            i15 = org.telegram.ui.ActionBar.g6.U9;
            i16 = org.telegram.ui.ActionBar.g6.T9;
            i17 = i13;
        }
        if (i13 < 0) {
            if ((yzVar.K || i23 != -1) && (i24 == i10 || i24 == i11)) {
                c6Var = c6Var3;
                textPaint5.setColor(i0.b.d(yzVar.L, org.telegram.ui.ActionBar.g6.v0(i14, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
            } else {
                c6Var = c6Var3;
                textPaint5.setColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
            }
            z10 = z12;
        } else {
            c6Var = c6Var3;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
            int iV1 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
            if (yzVar.K) {
                z10 = z12;
            } else {
                z10 = z12;
                if (yzVar.M == -1) {
                    textPaint5.setColor(i0.b.d(yzVar.f35093s0, iV0, iV1));
                }
            }
            int i25 = this.f34380b.f34072a;
            if (i25 == i10 || i25 == i11) {
                textPaint5.setColor(i0.b.d(yzVar.L, i0.b.d(yzVar.f35093s0, org.telegram.ui.ActionBar.g6.v0(i14, c6Var), org.telegram.ui.ActionBar.g6.v0(i17, c6Var)), i0.b.d(yzVar.f35093s0, iV0, iV1)));
            } else {
                textPaint5.setColor(i0.b.d(yzVar.f35093s0, iV0, iV1));
            }
        }
        yzVar.f35077f = new PorterDuffColorFilter(textPaint5.getColor(), PorterDuff.Mode.SRC_IN);
        int i26 = this.F;
        boolean z13 = i26 == 0 && this.D;
        boolean z14 = i26 > 0 && this.f34380b.d == 0 && this.D;
        boolean z15 = i26 > 0 && this.f34380b.d > 0 && this.D;
        int i27 = this.f34380b.d;
        if (i27 > 0 || z14) {
            str = z14 ? String.format("%d", Integer.valueOf(i26)) : String.format("%d", Integer.valueOf(i27));
            float fCeil = (int) Math.ceil(textPaint4.measureText(str));
            f12 = fCeil;
            iDp = AndroidUtilities.dp(10.0f) + ((int) Math.max(AndroidUtilities.dp(7.333f), fCeil));
        } else {
            str = null;
            iDp = 0;
            f12 = 0.0f;
        }
        if (!z10 && (yzVar.f35085n || yzVar.f35097w != f10)) {
            iDp = (int) (((AndroidUtilities.dp(17.333f) - iDp) * yzVar.f35097w) + iDp);
        }
        int i28 = this.f34380b.f34074c;
        if (iDp == 0 || z14) {
            iDp2 = 0;
        } else {
            iDp2 = AndroidUtilities.dp((str != null ? 1.0f : yzVar.f35097w) * (-2.0f)) + iDp;
        }
        this.d = i28 + iDp2;
        float measuredWidth = (getMeasuredWidth() - this.d) / 2.0f;
        if (this.C) {
            float f27 = this.f34396x;
            measuredWidth = com.google.android.recaptcha.internal.a.z(1.0f, f27, this.B, measuredWidth * f27);
        }
        float f28 = measuredWidth;
        if (TextUtils.equals(this.f34380b.f34073b, this.h)) {
            c6Var2 = c6Var;
            i18 = i10;
            str2 = str;
            i19 = iDp;
            f13 = 1.0f;
        } else {
            this.h = this.f34380b.f34073b;
            c6Var2 = c6Var;
            str2 = str;
            i19 = iDp;
            i18 = i10;
            f13 = 1.0f;
            StaticLayout staticLayout = new StaticLayout(this.h, textPaint5, AndroidUtilities.dp(f11), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f34394s = staticLayout;
            this.f34393r = t5.update(this.f34380b.f34077g ? 26 : 0, this, this.f34393r, staticLayout);
            this.f34382c = this.f34394s.getHeight();
            this.v = (int) (-this.f34394s.getLineLeft(0));
        }
        if (this.Q) {
            float f29 = this.T * (this.R ? this.f34396x : f13 - this.f34396x);
            if (this.P != null) {
                canvas2.save();
                canvas2.translate(this.v + f28 + f29, ((getMeasuredHeight() - this.f34382c) / 2.0f) + f13);
                this.P.draw(canvas2);
                textPaint2 = textPaint5;
                f25 = 1.0f;
                t5.drawAnimatedEmojis(canvas2, this.P, this.O, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, yzVar.f35077f);
                canvas2.restore();
            } else {
                textPaint2 = textPaint5;
                f25 = 1.0f;
            }
            if (this.L != null) {
                canvas2.save();
                int alpha = textPaint2.getAlpha();
                TextPaint textPaint6 = textPaint2;
                textPaint6.setAlpha((int) (alpha * (this.R ? f25 - this.f34396x : this.f34396x)));
                canvas2.translate(f28 + this.v + f29, ((getMeasuredHeight() - this.f34382c) / 2.0f) + f25);
                this.L.draw(canvas2);
                StaticLayout staticLayout2 = this.L;
                p5 p5Var = this.K;
                float fComputeVerticalScrollOffset = computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f);
                float fComputeVerticalScrollOffset2 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                float f30 = this.R ? f25 - this.f34396x : this.f34396x;
                textPaint = textPaint6;
                f14 = 1.0f;
                t5.drawAnimatedEmojis(canvas2, staticLayout2, p5Var, 0.0f, null, fComputeVerticalScrollOffset, fComputeVerticalScrollOffset2, 0.0f, f30, yzVar.f35077f);
                canvas2.restore();
                textPaint.setAlpha(alpha);
            } else {
                textPaint = textPaint2;
                f14 = 1.0f;
            }
            if (this.N != null) {
                canvas2.save();
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha2 * (this.R ? this.f34396x : f14 - this.f34396x)));
                canvas2.translate(f28 + this.v + f29, ((getMeasuredHeight() - this.f34382c) / 2.0f) + f14);
                this.N.draw(canvas2);
                t5.drawAnimatedEmojis(canvas2, this.N, this.M, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.R ? this.f34396x : f14 - this.f34396x, yzVar.f35077f);
                canvas2.restore();
                textPaint.setAlpha(alpha2);
            }
            f15 = f29;
        } else {
            f28 = f28;
            textPaint3 = textPaint3;
            paint = paint;
            c6Var2 = c6Var2;
            f14 = 1.0f;
            textPaint = textPaint5;
            if (this.f34394s != null) {
                canvas2.save();
                canvas2.translate(f28 + this.v, ((getMeasuredHeight() - this.f34382c) / 2.0f) + 1.0f);
                this.f34394s.draw(canvas2);
                t5.drawAnimatedEmojis(canvas2, this.f34394s, this.f34393r, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, yzVar.f35077f);
                canvas2.restore();
            }
            f15 = 0.0f;
        }
        String str3 = str2;
        if (z13 || str3 != null) {
            f16 = 0.0f;
            if (yzVar.f35071b0 < 0) {
                textPaint4.setColor(org.telegram.ui.ActionBar.g6.v0(yzVar.U, c6Var2));
            } else {
                textPaint4.setColor(i0.b.d(yzVar.f35093s0, org.telegram.ui.ActionBar.g6.v0(yzVar.U, c6Var2), org.telegram.ui.ActionBar.g6.v0(yzVar.f35071b0, c6Var2)));
            }
            if (org.telegram.ui.ActionBar.g6.c1(i15) || !org.telegram.ui.ActionBar.g6.c1(i16)) {
                paint = paint;
                paint.setColor(textPaint.getColor());
            } else {
                int iV2 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var2);
                if (yzVar.K || yzVar.M != -1) {
                    int i29 = this.f34380b.f34072a;
                    if (i29 != i18) {
                        if (i29 == i21) {
                            i21 = i11;
                        } else {
                            i21 = i11;
                            paint = paint;
                            paint.setColor(iV2);
                        }
                    }
                    paint.setColor(i0.b.d(yzVar.L, org.telegram.ui.ActionBar.g6.v0(i16, c6Var2), iV2));
                } else {
                    i21 = i11;
                    paint = paint;
                    paint.setColor(iV2);
                }
            }
            f17 = this.f34380b.f34074c;
            z11 = this.Q;
            if (z11) {
                float f31 = this.V;
                float f32 = this.f34396x;
                f17 = (f17 * f32) + ((f14 - f32) * f31);
            }
            if (z11 || this.N != null) {
                fDp = AndroidUtilities.dp(5.0f) + f28 + f17;
            } else {
                fDp = (f28 - this.T) + f15 + f17 + AndroidUtilities.dp(5.0f);
            }
            iX = org.telegram.messenger.rl.x(17.333f, getMeasuredHeight(), 2);
            if (!z10 || ((!yzVar.f35085n && yzVar.f35097w == f16) || str3 != null)) {
                paint.setAlpha(255);
            } else {
                paint.setAlpha((int) (yzVar.f35097w * 255.0f));
            }
            if (z15) {
                f23 = this.f34381b0;
                i20 = i19;
                f24 = i20;
                f18 = 17.333f;
                if (f23 != f24) {
                    float f33 = this.f34396x;
                    f19 = (f24 * f33) + ((f14 - f33) * f23);
                }
                if (z15) {
                    float f34 = this.f34383c0;
                    float f35 = this.f34396x;
                    f12 = (f12 * f35) + ((f14 - f35) * f34);
                }
                f20 = iX;
                float fDp3 = AndroidUtilities.dp(f18) + iX;
                rectF = this.f34387f;
                rectF.set(fDp, f20, f19 + fDp, fDp3);
                if (z13 || z14) {
                    canvas2.save();
                    f21 = this.f34396x;
                    if (!z13) {
                        f21 = f14 - f21;
                    }
                    canvas2.scale(f21, f21, rectF.centerX(), rectF.centerY());
                }
                float f36 = AndroidUtilities.density * 11.5f;
                canvas2.drawRoundRect(rectF, f36, f36, paint);
                if (z15) {
                    if (this.G != null) {
                        iDp3 = AndroidUtilities.dp(f18);
                        lineBottom = this.G.getLineBottom(0);
                        lineTop = this.G.getLineTop(0);
                    } else if (this.H != null) {
                        iDp3 = AndroidUtilities.dp(f18);
                        lineBottom = this.H.getLineBottom(0);
                        lineTop = this.H.getLineTop(0);
                    } else {
                        if (this.I != null) {
                            iDp3 = AndroidUtilities.dp(f18);
                            lineBottom = this.I.getLineBottom(0);
                            lineTop = this.I.getLineTop(0);
                        }
                        fDp2 = f20 - AndroidUtilities.dp(0.5f);
                        if (z10) {
                            f22 = 1.0f;
                        } else {
                            f22 = f14 - yzVar.f35097w;
                        }
                        if (this.G != null) {
                            canvas2.save();
                            textPaint4.setAlpha((int) (f22 * 255.0f * this.f34396x));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f14 - this.f34396x) * AndroidUtilities.dp(15.0f)) + fDp2);
                            this.G.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.H != null) {
                            canvas2.save();
                            textPaint4.setAlpha((int) ((f14 - this.f34396x) * f22 * 255.0f));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.f34396x * (-AndroidUtilities.dp(15.0f))) + fDp2);
                            this.H.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.I != null) {
                            canvas2.save();
                            textPaint4.setAlpha((int) (f22 * 255.0f));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, fDp2);
                            this.I.draw(canvas2);
                            canvas2.restore();
                        }
                        textPaint4.setAlpha(255);
                    }
                    f20 += (iDp3 - (lineBottom - lineTop)) / 2.0f;
                    fDp2 = f20 - AndroidUtilities.dp(0.5f);
                    if (z10) {
                        f22 = f14 - yzVar.f35097w;
                    } else {
                        f22 = 1.0f;
                    }
                    if (this.G != null) {
                        canvas2.save();
                        textPaint4.setAlpha((int) (f22 * 255.0f * this.f34396x));
                        canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f14 - this.f34396x) * AndroidUtilities.dp(15.0f)) + fDp2);
                        this.G.draw(canvas2);
                        canvas2.restore();
                    }
                    if (this.H != null) {
                        canvas2.save();
                        textPaint4.setAlpha((int) ((f14 - this.f34396x) * f22 * 255.0f));
                        canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.f34396x * (-AndroidUtilities.dp(15.0f))) + fDp2);
                        this.H.draw(canvas2);
                        canvas2.restore();
                    }
                    if (this.I != null) {
                        canvas2.save();
                        textPaint4.setAlpha((int) (f22 * 255.0f));
                        canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, fDp2);
                        this.I.draw(canvas2);
                        canvas2.restore();
                    }
                    textPaint4.setAlpha(255);
                } else if (str3 != null) {
                    if (!z10) {
                        textPaint4.setAlpha((int) ((f14 - yzVar.f35097w) * 255.0f));
                    }
                    canvas2.drawText(str3, ((rectF.width() - f12) / 2.0f) + rectF.left, AndroidUtilities.dp(12.5f) + iX, textPaint4);
                }
                if (z13 || z14) {
                    canvas2.restore();
                }
                if (!z10 && (yzVar.f35085n || yzVar.f35097w != f16)) {
                    TextPaint textPaint7 = textPaint3;
                    textPaint7.setColor(textPaint4.getColor());
                    textPaint7.setAlpha((int) (yzVar.f35097w * 255.0f));
                    float fDp4 = AndroidUtilities.dp(3.0f);
                    canvas2.drawLine(rectF.centerX() - fDp4, rectF.centerY() - fDp4, rectF.centerX() + fDp4, rectF.centerY() + fDp4, textPaint7);
                    canvas2 = canvas;
                    canvas2.drawLine(rectF.centerX() - fDp4, rectF.centerY() + fDp4, rectF.centerX() + fDp4, rectF.centerY() - fDp4, textPaint7);
                }
            } else {
                i20 = i19;
                f18 = 17.333f;
            }
            f19 = i20;
            if (z15) {
                float f37 = this.f34383c0;
                float f38 = this.f34396x;
                f12 = (f12 * f38) + ((f14 - f38) * f37);
            }
            f20 = iX;
            float fDp5 = AndroidUtilities.dp(f18) + iX;
            rectF = this.f34387f;
            rectF.set(fDp, f20, f19 + fDp, fDp5);
            if (z13) {
                canvas2.save();
                f21 = this.f34396x;
                if (!z13) {
                    f21 = f14 - f21;
                }
                canvas2.scale(f21, f21, rectF.centerX(), rectF.centerY());
            } else {
                canvas2.save();
                f21 = this.f34396x;
                if (!z13) {
                    f21 = f14 - f21;
                }
                canvas2.scale(f21, f21, rectF.centerX(), rectF.centerY());
            }
            float f39 = AndroidUtilities.density * 11.5f;
            canvas2.drawRoundRect(rectF, f39, f39, paint);
            if (z15) {
                if (this.G != null) {
                    iDp3 = AndroidUtilities.dp(f18);
                    lineBottom = this.G.getLineBottom(0);
                    lineTop = this.G.getLineTop(0);
                } else if (this.H != null) {
                    iDp3 = AndroidUtilities.dp(f18);
                    lineBottom = this.H.getLineBottom(0);
                    lineTop = this.H.getLineTop(0);
                } else {
                    if (this.I != null) {
                        iDp3 = AndroidUtilities.dp(f18);
                        lineBottom = this.I.getLineBottom(0);
                        lineTop = this.I.getLineTop(0);
                    }
                    fDp2 = f20 - AndroidUtilities.dp(0.5f);
                    if (z10) {
                        f22 = f14 - yzVar.f35097w;
                    } else {
                        f22 = 1.0f;
                    }
                    if (this.G != null) {
                        canvas2.save();
                        textPaint4.setAlpha((int) (f22 * 255.0f * this.f34396x));
                        canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f14 - this.f34396x) * AndroidUtilities.dp(15.0f)) + fDp2);
                        this.G.draw(canvas2);
                        canvas2.restore();
                    }
                    if (this.H != null) {
                        canvas2.save();
                        textPaint4.setAlpha((int) ((f14 - this.f34396x) * f22 * 255.0f));
                        canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.f34396x * (-AndroidUtilities.dp(15.0f))) + fDp2);
                        this.H.draw(canvas2);
                        canvas2.restore();
                    }
                    if (this.I != null) {
                        canvas2.save();
                        textPaint4.setAlpha((int) (f22 * 255.0f));
                        canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, fDp2);
                        this.I.draw(canvas2);
                        canvas2.restore();
                    }
                    textPaint4.setAlpha(255);
                }
                f20 += (iDp3 - (lineBottom - lineTop)) / 2.0f;
                fDp2 = f20 - AndroidUtilities.dp(0.5f);
                if (z10) {
                    f22 = f14 - yzVar.f35097w;
                } else {
                    f22 = 1.0f;
                }
                if (this.G != null) {
                    canvas2.save();
                    textPaint4.setAlpha((int) (f22 * 255.0f * this.f34396x));
                    canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f14 - this.f34396x) * AndroidUtilities.dp(15.0f)) + fDp2);
                    this.G.draw(canvas2);
                    canvas2.restore();
                }
                if (this.H != null) {
                    canvas2.save();
                    textPaint4.setAlpha((int) ((f14 - this.f34396x) * f22 * 255.0f));
                    canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.f34396x * (-AndroidUtilities.dp(15.0f))) + fDp2);
                    this.H.draw(canvas2);
                    canvas2.restore();
                }
                if (this.I != null) {
                    canvas2.save();
                    textPaint4.setAlpha((int) (f22 * 255.0f));
                    canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, fDp2);
                    this.I.draw(canvas2);
                    canvas2.restore();
                }
                textPaint4.setAlpha(255);
            } else if (str3 != null) {
                if (!z10) {
                    textPaint4.setAlpha((int) ((f14 - yzVar.f35097w) * 255.0f));
                }
                canvas2.drawText(str3, ((rectF.width() - f12) / 2.0f) + rectF.left, AndroidUtilities.dp(12.5f) + iX, textPaint4);
            }
            if (z13) {
                canvas2.restore();
            } else {
                canvas2.restore();
            }
            if (!z10) {
                TextPaint textPaint8 = textPaint3;
                textPaint8.setColor(textPaint4.getColor());
                textPaint8.setAlpha((int) (yzVar.f35097w * 255.0f));
                float fDp6 = AndroidUtilities.dp(3.0f);
                canvas2.drawLine(rectF.centerX() - fDp6, rectF.centerY() - fDp6, rectF.centerX() + fDp6, rectF.centerY() + fDp6, textPaint8);
                canvas2 = canvas;
                canvas2.drawLine(rectF.centerX() - fDp6, rectF.centerY() + fDp6, rectF.centerX() + fDp6, rectF.centerY() - fDp6, textPaint8);
            }
        } else {
            if (z10) {
                f16 = 0.0f;
            } else {
                if (yzVar.f35085n) {
                    f16 = 0.0f;
                } else {
                    f16 = 0.0f;
                    if (yzVar.f35097w != 0.0f) {
                    }
                }
                if (yzVar.f35071b0 < 0) {
                    textPaint4.setColor(org.telegram.ui.ActionBar.g6.v0(yzVar.U, c6Var2));
                } else {
                    textPaint4.setColor(i0.b.d(yzVar.f35093s0, org.telegram.ui.ActionBar.g6.v0(yzVar.U, c6Var2), org.telegram.ui.ActionBar.g6.v0(yzVar.f35071b0, c6Var2)));
                }
                if (org.telegram.ui.ActionBar.g6.c1(i15)) {
                    paint = paint;
                    paint.setColor(textPaint.getColor());
                } else {
                    paint = paint;
                    paint.setColor(textPaint.getColor());
                }
                f17 = this.f34380b.f34074c;
                z11 = this.Q;
                if (z11) {
                    float f310 = this.V;
                    float f311 = this.f34396x;
                    f17 = (f17 * f311) + ((f14 - f311) * f310);
                }
                if (z11) {
                    fDp = AndroidUtilities.dp(5.0f) + f28 + f17;
                } else {
                    fDp = AndroidUtilities.dp(5.0f) + f28 + f17;
                }
                iX = org.telegram.messenger.rl.x(17.333f, getMeasuredHeight(), 2);
                if (z10) {
                    paint.setAlpha(255);
                } else {
                    paint.setAlpha(255);
                }
                if (z15) {
                    f23 = this.f34381b0;
                    i20 = i19;
                    f24 = i20;
                    f18 = 17.333f;
                    if (f23 != f24) {
                        float f312 = this.f34396x;
                        f19 = (f24 * f312) + ((f14 - f312) * f23);
                    }
                    if (z15) {
                        float f313 = this.f34383c0;
                        float f314 = this.f34396x;
                        f12 = (f12 * f314) + ((f14 - f314) * f313);
                    }
                    f20 = iX;
                    float fDp7 = AndroidUtilities.dp(f18) + iX;
                    rectF = this.f34387f;
                    rectF.set(fDp, f20, f19 + fDp, fDp7);
                    if (z13) {
                        canvas2.save();
                        f21 = this.f34396x;
                        if (!z13) {
                            f21 = f14 - f21;
                        }
                        canvas2.scale(f21, f21, rectF.centerX(), rectF.centerY());
                    } else {
                        canvas2.save();
                        f21 = this.f34396x;
                        if (!z13) {
                            f21 = f14 - f21;
                        }
                        canvas2.scale(f21, f21, rectF.centerX(), rectF.centerY());
                    }
                    float f315 = AndroidUtilities.density * 11.5f;
                    canvas2.drawRoundRect(rectF, f315, f315, paint);
                    if (z15) {
                        if (this.G != null) {
                            iDp3 = AndroidUtilities.dp(f18);
                            lineBottom = this.G.getLineBottom(0);
                            lineTop = this.G.getLineTop(0);
                        } else if (this.H != null) {
                            iDp3 = AndroidUtilities.dp(f18);
                            lineBottom = this.H.getLineBottom(0);
                            lineTop = this.H.getLineTop(0);
                        } else {
                            if (this.I != null) {
                                iDp3 = AndroidUtilities.dp(f18);
                                lineBottom = this.I.getLineBottom(0);
                                lineTop = this.I.getLineTop(0);
                            }
                            fDp2 = f20 - AndroidUtilities.dp(0.5f);
                            if (z10) {
                                f22 = f14 - yzVar.f35097w;
                            } else {
                                f22 = 1.0f;
                            }
                            if (this.G != null) {
                                canvas2.save();
                                textPaint4.setAlpha((int) (f22 * 255.0f * this.f34396x));
                                canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f14 - this.f34396x) * AndroidUtilities.dp(15.0f)) + fDp2);
                                this.G.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.H != null) {
                                canvas2.save();
                                textPaint4.setAlpha((int) ((f14 - this.f34396x) * f22 * 255.0f));
                                canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.f34396x * (-AndroidUtilities.dp(15.0f))) + fDp2);
                                this.H.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.I != null) {
                                canvas2.save();
                                textPaint4.setAlpha((int) (f22 * 255.0f));
                                canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, fDp2);
                                this.I.draw(canvas2);
                                canvas2.restore();
                            }
                            textPaint4.setAlpha(255);
                        }
                        f20 += (iDp3 - (lineBottom - lineTop)) / 2.0f;
                        fDp2 = f20 - AndroidUtilities.dp(0.5f);
                        if (z10) {
                            f22 = f14 - yzVar.f35097w;
                        } else {
                            f22 = 1.0f;
                        }
                        if (this.G != null) {
                            canvas2.save();
                            textPaint4.setAlpha((int) (f22 * 255.0f * this.f34396x));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f14 - this.f34396x) * AndroidUtilities.dp(15.0f)) + fDp2);
                            this.G.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.H != null) {
                            canvas2.save();
                            textPaint4.setAlpha((int) ((f14 - this.f34396x) * f22 * 255.0f));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.f34396x * (-AndroidUtilities.dp(15.0f))) + fDp2);
                            this.H.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.I != null) {
                            canvas2.save();
                            textPaint4.setAlpha((int) (f22 * 255.0f));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, fDp2);
                            this.I.draw(canvas2);
                            canvas2.restore();
                        }
                        textPaint4.setAlpha(255);
                    } else if (str3 != null) {
                        if (!z10) {
                            textPaint4.setAlpha((int) ((f14 - yzVar.f35097w) * 255.0f));
                        }
                        canvas2.drawText(str3, ((rectF.width() - f12) / 2.0f) + rectF.left, AndroidUtilities.dp(12.5f) + iX, textPaint4);
                    }
                    if (z13) {
                        canvas2.restore();
                    } else {
                        canvas2.restore();
                    }
                    if (!z10) {
                        TextPaint textPaint9 = textPaint3;
                        textPaint9.setColor(textPaint4.getColor());
                        textPaint9.setAlpha((int) (yzVar.f35097w * 255.0f));
                        float fDp8 = AndroidUtilities.dp(3.0f);
                        canvas2.drawLine(rectF.centerX() - fDp8, rectF.centerY() - fDp8, rectF.centerX() + fDp8, rectF.centerY() + fDp8, textPaint9);
                        canvas2 = canvas;
                        canvas2.drawLine(rectF.centerX() - fDp8, rectF.centerY() + fDp8, rectF.centerX() + fDp8, rectF.centerY() - fDp8, textPaint9);
                    }
                } else {
                    i20 = i19;
                    f18 = 17.333f;
                }
                f19 = i20;
                if (z15) {
                    float f316 = this.f34383c0;
                    float f317 = this.f34396x;
                    f12 = (f12 * f317) + ((f14 - f317) * f316);
                }
                f20 = iX;
                float fDp9 = AndroidUtilities.dp(f18) + iX;
                rectF = this.f34387f;
                rectF.set(fDp, f20, f19 + fDp, fDp9);
                if (z13) {
                    canvas2.save();
                    f21 = this.f34396x;
                    if (!z13) {
                        f21 = f14 - f21;
                    }
                    canvas2.scale(f21, f21, rectF.centerX(), rectF.centerY());
                } else {
                    canvas2.save();
                    f21 = this.f34396x;
                    if (!z13) {
                        f21 = f14 - f21;
                    }
                    canvas2.scale(f21, f21, rectF.centerX(), rectF.centerY());
                }
                float f318 = AndroidUtilities.density * 11.5f;
                canvas2.drawRoundRect(rectF, f318, f318, paint);
                if (z15) {
                    if (this.G != null) {
                        iDp3 = AndroidUtilities.dp(f18);
                        lineBottom = this.G.getLineBottom(0);
                        lineTop = this.G.getLineTop(0);
                    } else if (this.H != null) {
                        iDp3 = AndroidUtilities.dp(f18);
                        lineBottom = this.H.getLineBottom(0);
                        lineTop = this.H.getLineTop(0);
                    } else {
                        if (this.I != null) {
                            iDp3 = AndroidUtilities.dp(f18);
                            lineBottom = this.I.getLineBottom(0);
                            lineTop = this.I.getLineTop(0);
                        }
                        fDp2 = f20 - AndroidUtilities.dp(0.5f);
                        if (z10) {
                            f22 = f14 - yzVar.f35097w;
                        } else {
                            f22 = 1.0f;
                        }
                        if (this.G != null) {
                            canvas2.save();
                            textPaint4.setAlpha((int) (f22 * 255.0f * this.f34396x));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f14 - this.f34396x) * AndroidUtilities.dp(15.0f)) + fDp2);
                            this.G.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.H != null) {
                            canvas2.save();
                            textPaint4.setAlpha((int) ((f14 - this.f34396x) * f22 * 255.0f));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.f34396x * (-AndroidUtilities.dp(15.0f))) + fDp2);
                            this.H.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.I != null) {
                            canvas2.save();
                            textPaint4.setAlpha((int) (f22 * 255.0f));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, fDp2);
                            this.I.draw(canvas2);
                            canvas2.restore();
                        }
                        textPaint4.setAlpha(255);
                    }
                    f20 += (iDp3 - (lineBottom - lineTop)) / 2.0f;
                    fDp2 = f20 - AndroidUtilities.dp(0.5f);
                    if (z10) {
                        f22 = f14 - yzVar.f35097w;
                    } else {
                        f22 = 1.0f;
                    }
                    if (this.G != null) {
                        canvas2.save();
                        textPaint4.setAlpha((int) (f22 * 255.0f * this.f34396x));
                        canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f14 - this.f34396x) * AndroidUtilities.dp(15.0f)) + fDp2);
                        this.G.draw(canvas2);
                        canvas2.restore();
                    }
                    if (this.H != null) {
                        canvas2.save();
                        textPaint4.setAlpha((int) ((f14 - this.f34396x) * f22 * 255.0f));
                        canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.f34396x * (-AndroidUtilities.dp(15.0f))) + fDp2);
                        this.H.draw(canvas2);
                        canvas2.restore();
                    }
                    if (this.I != null) {
                        canvas2.save();
                        textPaint4.setAlpha((int) (f22 * 255.0f));
                        canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, fDp2);
                        this.I.draw(canvas2);
                        canvas2.restore();
                    }
                    textPaint4.setAlpha(255);
                } else if (str3 != null) {
                    if (!z10) {
                        textPaint4.setAlpha((int) ((f14 - yzVar.f35097w) * 255.0f));
                    }
                    canvas2.drawText(str3, ((rectF.width() - f12) / 2.0f) + rectF.left, AndroidUtilities.dp(12.5f) + iX, textPaint4);
                }
                if (z13) {
                    canvas2.restore();
                } else {
                    canvas2.restore();
                }
                if (!z10) {
                    TextPaint textPaint10 = textPaint3;
                    textPaint10.setColor(textPaint4.getColor());
                    textPaint10.setAlpha((int) (yzVar.f35097w * 255.0f));
                    float fDp10 = AndroidUtilities.dp(3.0f);
                    canvas2.drawLine(rectF.centerX() - fDp10, rectF.centerY() - fDp10, rectF.centerX() + fDp10, rectF.centerY() + fDp10, textPaint10);
                    canvas2 = canvas;
                    canvas2.drawLine(rectF.centerX() - fDp10, rectF.centerY() + fDp10, rectF.centerX() + fDp10, rectF.centerY() - fDp10, textPaint10);
                }
            }
            i20 = i19;
        }
        float f40 = f12;
        if (yzVar.v != f16) {
            canvas2.restore();
        }
        this.A = f28;
        vz vzVar = this.f34380b;
        this.E = vzVar.d;
        this.J = this.h;
        this.U = vzVar.f34074c;
        this.W = i20;
        this.f34379a0 = f40;
        this.f34384d0 = this.d;
        this.f34388f0 = getMeasuredWidth();
        if (this.f34380b.f34076f || this.f34389g0 != f16) {
            if (yzVar.f35088p0 == null) {
                yzVar.f35088p0 = getContext().getDrawable(R.drawable.other_lockedfolders);
            }
            boolean z16 = this.f34380b.f34076f;
            if (z16) {
                float f41 = this.f34389g0;
                if (f41 != f14) {
                    this.f34389g0 = f41 + 0.10666667f;
                } else if (!z16) {
                    this.f34389g0 -= 0.10666667f;
                }
            } else if (!z16) {
                this.f34389g0 -= 0.10666667f;
            }
            this.f34389g0 = Utilities.clamp(this.f34389g0, 1.0f, f16);
            int iV3 = org.telegram.ui.ActionBar.g6.v0(yzVar.S, c6Var2);
            int i30 = yzVar.f35069a0;
            if (i30 >= 0) {
                iV3 = i0.b.d(yzVar.f35093s0, iV3, org.telegram.ui.ActionBar.g6.v0(i30, c6Var2));
            }
            if (yzVar.f35089q0 != iV3) {
                yzVar.f35089q0 = iV3;
                yzVar.f35088p0.setColorFilter(new PorterDuffColorFilter(iV3, PorterDuff.Mode.MULTIPLY));
            }
            int measuredWidth2 = (int) (((getMeasuredWidth() - yzVar.f35088p0.getIntrinsicWidth()) / 2.0f) + this.f34397y);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            Drawable drawable = yzVar.f35088p0;
            drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, yzVar.f35088p0.getIntrinsicHeight() + measuredHeight);
            if (this.f34389g0 == 1.0f) {
                yzVar.f35088p0.draw(canvas2);
                return;
            }
            canvas2.save();
            float f42 = this.f34389g0;
            canvas2.scale(f42, f42, yzVar.f35088p0.getBounds().centerX(), yzVar.f35088p0.getBounds().centerY());
            yzVar.f35088p0.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        vz vzVar = this.f34380b;
        accessibilityNodeInfo.setSelected((vzVar == null || (i10 = this.f34391i0.H) == -1 || vzVar.f34072a != i10) ? false : true);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.f34380b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f34380b.f34073b);
            vz vzVar2 = this.f34380b;
            int i11 = vzVar2 != null ? vzVar2.d : 0;
            if (i11 > 0) {
                sb2.append("\n");
                sb2.append(LocaleController.formatPluralString("AccDescrUnreadCount", i11, new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.f34380b.a(false) + this.f34391i0.J, View.MeasureSpec.getSize(i11));
    }
}
