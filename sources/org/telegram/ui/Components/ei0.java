package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.we1;
public abstract class ei0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.p2 H;
    public jl0 I;
    public float J;
    public float K;
    public float L;
    public float M;
    public final CharSequence N;
    public StaticLayout O;
    public float P;
    public float Q;
    public float R;
    public final CharSequence S;
    public StaticLayout T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public boolean Y;
    public final float Z;
    public int f28064a;
    public final ci0 f28065a0;
    public final ci0 f28067b0;
    public int f28069c0;
    public final lh.m7 f28070d0;
    public boolean f28072e0;
    public final TextPaint f28077k;
    public final di0 f28078l;
    public final Drawable f28079m;
    public final Path f28080n;
    public float f28081o;
    public float f28082p;
    public boolean f28083q;
    public boolean f28084r;
    public ValueAnimator f28085s;
    public ValueAnimator f28086t;
    public ValueAnimator f28087u;
    public float v;
    public float f28088w;
    public float f28089x;
    public boolean f28090y;
    public ValueAnimator f28091z;
    public final int f28066b = org.telegram.ui.ActionBar.g6.R9;
    public final int f28068c = org.telegram.ui.ActionBar.g6.S9;
    public final int d = org.telegram.ui.ActionBar.g6.N7;
    public final boolean f28071e = true;
    public final Paint f28073f = new Paint(1);
    public final Paint f28074g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f28075i = new Paint();
    public final RectF f28076j = new RectF();

    public ei0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.f28077k = textPaint;
        ?? drawable = new Drawable();
        drawable.f27774a = new Path();
        drawable.f27775b = new Paint(1);
        drawable.a();
        this.f28078l = drawable;
        this.f28080n = new Path();
        this.f28081o = 1.0f;
        this.f28082p = 1.0f;
        this.v = 1.0f;
        this.f28088w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.f28065a0 = new ci0(this, 3);
        this.f28067b0 = new ci0(this, 4);
        this.f28070d0 = new lh.m7(this, 28);
        this.f28072e0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.Z = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.f28079m = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            if (z10) {
                ValueAnimator valueAnimator = this.f28086t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f28086t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f28086t = ofFloat;
                ofFloat.addUpdateListener(new ci0(this, 0));
                this.f28086t.setInterpolator(AndroidUtilities.accelerateInterpolator);
                this.f28086t.setDuration(230L);
                this.f28086t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f28087u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f28087u = null;
            }
            this.f28088w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f28087u = ofFloat2;
            ofFloat2.addUpdateListener(new ci0(this, 1));
            this.f28087u.setInterpolator(AndroidUtilities.accelerateInterpolator);
            this.f28087u.setDuration(230L);
            this.f28087u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f28085s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f28091z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        org.telegram.ui.Cells.p2 p2Var = this.H;
        if (p2Var != null) {
            p2Var.removeCallbacks(this.f28070d0);
        }
        ValueAnimator valueAnimator3 = this.f28086t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f28081o = 1.0f;
        this.f28082p = 1.0f;
        this.f28083q = false;
        this.f28084r = false;
        this.f28090y = false;
        this.f28072e0 = false;
        this.f28089x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    public final void c(Canvas canvas, boolean z10) {
        org.telegram.ui.Cells.p2 p2Var;
        float f9;
        float f10;
        int i10;
        char c3;
        boolean z11;
        float f11;
        int i11;
        boolean z12;
        int i12;
        float f12;
        int i13;
        float f13;
        int i14;
        float f14;
        int i15;
        int w02;
        int i16;
        int i17;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        if (this.X && !this.Y && (p2Var = this.H) != null && this.I != null) {
            boolean z13 = p2Var instanceof we1;
            if (z13) {
                f9 = 15.0f;
            } else {
                f9 = 28.0f;
            }
            int dp = AndroidUtilities.dp(f9);
            int dp2 = AndroidUtilities.dp(8.0f);
            int dp3 = AndroidUtilities.dp(9.0f);
            int dp4 = AndroidUtilities.dp(18.0f);
            int d = (int) d();
            int height = (int) (this.H.getHeight() * this.J);
            if (this.F) {
                f10 = (this.D * 0.07f) - 0.05f;
            } else {
                f10 = this.D * 0.02f;
            }
            int width = (this.H.getWidth() - (dp * 4)) - AndroidUtilities.dp(16.0f);
            if (width != this.f28069c0) {
                int i18 = AndroidUtilities.displaySize.x;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                c3 = 0;
                CharSequence charSequence = this.N;
                TextPaint textPaint = this.f28077k;
                this.O = new StaticLayout(charSequence, textPaint, i18, alignment, 1.0f, 0.0f, false);
                float f20 = 0.0f;
                for (int i19 = 0; i19 < this.O.getLineCount(); i19++) {
                    f20 = Math.max(f20, this.O.getLineWidth(i19));
                }
                float f21 = width;
                this.P = Math.min(1.0f, f21 / f20);
                int ceil = (int) Math.ceil(f20);
                if (this.P < 0.8f) {
                    this.P = 0.8f;
                    ceil = nh.t3.a(this.N, textPaint);
                }
                int i20 = ceil;
                this.O = new StaticLayout(this.N, textPaint, i20, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.Q = i20;
                this.R = 0.0f;
                for (int i21 = 0; i21 < this.O.getLineCount(); i21++) {
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i21));
                    this.R = Math.max(this.R, this.O.getLineWidth(i21));
                }
                this.T = new StaticLayout(this.S, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                float f22 = 0.0f;
                for (int i22 = 0; i22 < this.T.getLineCount(); i22++) {
                    f22 = Math.max(f22, this.T.getLineWidth(i22));
                }
                this.U = Math.min(1.0f, f21 / f22);
                i10 = dp4;
                int ceil2 = (int) Math.ceil(f22);
                if (this.U < 0.8f) {
                    this.U = 0.8f;
                    ceil2 = nh.t3.a(this.S, textPaint);
                }
                int i23 = ceil2;
                this.T = new StaticLayout(this.S, textPaint, i23, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.V = i23;
                this.W = 0.0f;
                for (int i24 = 0; i24 < this.T.getLineCount(); i24++) {
                    this.V = Math.min(this.V, this.T.getLineLeft(i24));
                    this.W = Math.max(this.W, this.T.getLineWidth(i24));
                }
                this.f28069c0 = width;
            } else {
                i10 = dp4;
                c3 = 0;
            }
            if (this.J > 0.85f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f28083q != z11) {
                this.f28083q = z11;
                if (this.f28089x == 0.0f) {
                    ValueAnimator valueAnimator = this.f28085s;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z11) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    this.f28081o = f19;
                } else {
                    ValueAnimator valueAnimator2 = this.f28085s;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f23 = this.f28081o;
                    if (z11) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    float[] fArr = new float[2];
                    fArr[c3] = f23;
                    fArr[1] = f18;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.f28085s = ofFloat;
                    ofFloat.addUpdateListener(this.f28065a0);
                    this.f28085s.setInterpolator(new LinearInterpolator());
                    this.f28085s.setDuration(170L);
                    this.f28085s.start();
                }
            }
            if (z11 != this.f28084r) {
                this.f28084r = z11;
                ValueAnimator valueAnimator3 = this.A;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                float f24 = this.f28082p;
                if (this.f28084r) {
                    f17 = 0.0f;
                } else {
                    f17 = 1.0f;
                }
                float[] fArr2 = new float[2];
                fArr2[c3] = f24;
                fArr2[1] = f17;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                this.A = ofFloat2;
                ofFloat2.addUpdateListener(new ci0(this, 2));
                this.A.setInterpolator(jr.f29803j);
                this.A.setDuration(250L);
                this.A.start();
            }
            float f25 = this.C * 2.0f;
            if (f25 > 1.0f) {
                f25 = 1.0f;
            }
            float f26 = this.L;
            float f27 = this.K;
            if (z10) {
                f27 += d;
            }
            int i25 = dp + dp3;
            int measuredHeight = (this.H.getMeasuredHeight() - dp2) - dp3;
            if (z10) {
                measuredHeight += d;
            }
            int i26 = (dp2 * 2) + i10;
            float f28 = f25;
            if (height > i26) {
                f11 = 1.0f;
            } else {
                f11 = height / i26;
            }
            canvas.save();
            float f29 = f11;
            if (z10) {
                i11 = d;
                z12 = z13;
                canvas.clipRect(0, 0, this.I.getMeasuredWidth(), i11 + 1);
            } else {
                i11 = d;
                z12 = z13;
            }
            float f30 = this.C;
            Paint paint = this.f28075i;
            RectF rectF = this.f28076j;
            if (f30 == 0.0f) {
                if (this.v != 1.0f && this.f28088w != 1.0f) {
                    canvas.drawPaint(paint);
                }
                f13 = f27;
                i12 = i10;
                i13 = dp3;
                f12 = f10;
            } else {
                float f31 = this.M;
                i12 = i10;
                f12 = f10;
                i13 = dp3;
                float z14 = com.google.android.recaptcha.internal.a.z(1.0f, this.C, this.H.getWidth() - this.M, (f31 * f10) + f31);
                if (this.v != 1.0f && this.f28088w != 1.0f) {
                    canvas.drawCircle(f26, f27, z14, paint);
                }
                Path path = this.f28080n;
                path.reset();
                f13 = f27;
                rectF.set(f26 - z14, f27 - z14, f26 + z14, f13 + z14);
                path.addOval(rectF, Path.Direction.CW);
                canvas.clipPath(path);
            }
            boolean z15 = this.G;
            Paint paint2 = this.h;
            if (z15) {
                if (this.f28088w > this.v) {
                    canvas.save();
                    float f32 = i25;
                    float f33 = this.C;
                    float f34 = measuredHeight;
                    canvas.translate((f26 - f32) * f33, f33 * (f13 - f34));
                    canvas.drawCircle(f32, f34, this.H.getWidth() * this.f28088w, paint);
                    canvas.restore();
                }
                if (this.v > 0.0f) {
                    canvas.save();
                    float f35 = i25;
                    float f36 = this.C;
                    float f37 = measuredHeight;
                    canvas.translate((f26 - f35) * f36, (f13 - f37) * f36);
                    canvas.drawCircle(f35, f37, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
            } else {
                if (this.v > this.f28088w) {
                    canvas.save();
                    float f38 = i25;
                    float f39 = this.C;
                    float f40 = measuredHeight;
                    canvas.translate((f26 - f38) * f39, f39 * (f13 - f40));
                    canvas.drawCircle(f38, f40, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
                if (this.f28088w > 0.0f) {
                    canvas.save();
                    float f41 = i25;
                    float f42 = this.C;
                    float f43 = measuredHeight;
                    canvas.translate((f26 - f41) * f42, f42 * (f13 - f43));
                    canvas.drawCircle(f41, f43, this.H.getWidth() * this.f28088w, paint);
                    canvas.restore();
                }
            }
            if (height > i26) {
                Paint paint3 = this.f28073f;
                paint3.setAlpha((int) ((1.0f - f28) * 0.4f * f29 * 255.0f));
                if (z10) {
                    rectF.set(dp, dp2, dp + i12, dp2 + i11 + i13);
                } else {
                    rectF.set(dp, ((this.H.getHeight() - height) + dp2) - i11, dp + i12, this.H.getHeight() - dp2);
                }
                i14 = i13;
                float f44 = i14;
                canvas.drawRoundRect(rectF, f44, f44, paint3);
            } else {
                i14 = i13;
            }
            if (z10) {
                canvas.restore();
                return;
            }
            if (z12) {
                measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - AndroidUtilities.dp(41.0f)) * this.C));
            }
            float f45 = this.C;
            if (f45 != 0.0f && !z12) {
                i15 = dp;
                f14 = 255.0f;
            } else {
                Paint paint4 = this.f28074g;
                paint4.setAlpha((int) ((1.0f - f45) * f29 * 255.0f));
                float f46 = i25;
                float f47 = measuredHeight;
                canvas.drawCircle(f46, f47, i14, paint4);
                di0 di0Var = this.f28078l;
                di0Var.getClass();
                int dp5 = AndroidUtilities.dp(18.0f);
                int dp6 = AndroidUtilities.dp(18.0f) >> 1;
                f14 = 255.0f;
                int i27 = dp5 >> 1;
                i15 = dp;
                di0Var.setBounds(i25 - dp6, measuredHeight - i27, i25 + dp6, measuredHeight + i27);
                float f48 = 1.0f - this.f28082p;
                if (f48 < 0.0f) {
                    f48 = 0.0f;
                }
                float f49 = 1.0f - f48;
                canvas.save();
                canvas.rotate(180.0f * f49, f46, f47);
                canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f49);
                if (this.G) {
                    w02 = paint2.getColor();
                } else {
                    w02 = org.telegram.ui.ActionBar.g6.w0(null, this.f28066b, false);
                }
                di0Var.f27775b.setColor(w02);
                di0Var.draw(canvas);
                canvas.restore();
            }
            if (this.J > 0.0f && !this.f28090y) {
                if (Math.abs(this.f28064a) < this.Z * 0.5f) {
                    if (!this.f28072e0) {
                        this.f28089x = 1.0f;
                        this.f28090y = true;
                    }
                } else {
                    this.f28072e0 = true;
                    org.telegram.ui.Cells.p2 p2Var2 = this.H;
                    lh.m7 m7Var = this.f28070d0;
                    p2Var2.removeCallbacks(m7Var);
                    this.H.postDelayed(m7Var, 200L);
                }
            }
            float height2 = (this.H.getHeight() - (i26 / 2.0f)) + AndroidUtilities.dp(6.0f);
            int width2 = this.H.getWidth();
            if (z12) {
                i16 = i15 * 2;
            } else {
                i16 = 0;
            }
            float f50 = (width2 + i16) / 2.0f;
            if (this.O != null) {
                float f51 = this.f28081o;
                if (f51 > 0.0f && f51 < 1.0f) {
                    canvas.save();
                    float f52 = (this.f28081o * 0.2f) + 0.8f;
                    canvas.scale(f52, f52, f50, com.google.android.recaptcha.internal.a.z(1.0f, this.f28081o, AndroidUtilities.dp(16.0f), height2));
                }
                i17 = i25;
                f15 = f29;
                f16 = f13;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.f28081o * f14 * f29 * this.f28089x), 31);
                canvas.translate((f50 - this.Q) - (this.R / 2.0f), com.google.android.recaptcha.internal.a.z(1.0f, this.f28081o, AndroidUtilities.dp(8.0f), height2) - this.O.getHeight());
                float f53 = this.P;
                canvas.scale(f53, f53, (this.R / 2.0f) + this.Q, this.O.getHeight());
                this.O.draw(canvas);
                canvas.restore();
                float f54 = this.f28081o;
                if (f54 > 0.0f && f54 < 1.0f) {
                    canvas.restore();
                }
            } else {
                i17 = i25;
                f15 = f29;
                f16 = f13;
            }
            if (this.T != null) {
                float f55 = this.f28081o;
                if (f55 > 0.0f && f55 < 1.0f) {
                    canvas.save();
                    float z16 = com.google.android.recaptcha.internal.a.z(1.0f, this.f28081o, 0.1f, 0.9f);
                    canvas.scale(z16, z16, f50, height2 - (AndroidUtilities.dp(8.0f) * this.f28081o));
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.x3.y(1.0f, this.f28081o, 255.0f, f15) * this.f28089x), 31);
                canvas.translate((f50 - this.V) - (this.W / 2.0f), ((AndroidUtilities.dp(8.0f) * this.f28081o) + height2) - this.T.getHeight());
                float f56 = this.U;
                canvas.scale(f56, f56, (this.W / 2.0f) + this.V, this.T.getHeight());
                this.T.draw(canvas);
                canvas.restore();
                float f57 = this.f28081o;
                if (f57 > 0.0f && f57 < 1.0f) {
                    canvas.restore();
                }
            }
            canvas.restore();
            if (!z12 && this.f28071e && this.C > 0.0f) {
                canvas.save();
                float f58 = org.telegram.ui.ActionBar.g6.f23360u1.f34732b;
                float dp7 = AndroidUtilities.dp(24.0f) / f58;
                float f59 = this.C;
                float d10 = com.google.android.recaptcha.internal.a.d(1.0f - dp7, f59, dp7, f12);
                float f60 = 1.0f - f59;
                canvas.translate((i17 - f26) * f60, (((this.H.getHeight() - dp2) - i14) - f16) * f60);
                canvas.scale(d10, d10, f26, f16);
                org.telegram.ui.ActionBar.g6.f23360u1.Q(0.0f, true);
                if (!org.telegram.ui.ActionBar.g6.C1) {
                    xi0 xi0Var = org.telegram.ui.ActionBar.g6.f23360u1;
                    xi0Var.W = true;
                    int i28 = this.d;
                    xi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i28, true), "Arrow1");
                    org.telegram.ui.ActionBar.g6.f23360u1.O(org.telegram.ui.ActionBar.g6.w0(null, i28, true), "Arrow2");
                    org.telegram.ui.ActionBar.g6.f23360u1.m();
                    org.telegram.ui.ActionBar.g6.C1 = true;
                }
                float f61 = f58 / 2.0f;
                org.telegram.ui.ActionBar.g6.f23360u1.setBounds((int) (f26 - f61), (int) (f16 - f61), (int) (f26 + f61), (int) (f61 + f16));
                org.telegram.ui.ActionBar.g6.f23360u1.draw(canvas);
                canvas.restore();
            }
        }
    }

    public abstract float d();

    public final void e(float f9) {
        this.C = f9;
        int d = i0.a.d(1.0f - this.C, org.telegram.ui.ActionBar.g6.w0(null, this.d, true), org.telegram.ui.ActionBar.g6.w0(null, this.f28068c, true));
        this.h.setColor(d);
        if (this.f28071e && this.X && !this.Y) {
            xi0 xi0Var = org.telegram.ui.ActionBar.g6.f23360u1;
            xi0Var.W = true;
            xi0Var.O(d, "Arrow1");
            org.telegram.ui.ActionBar.g6.f23360u1.O(d, "Arrow2");
            org.telegram.ui.ActionBar.g6.f23360u1.m();
            org.telegram.ui.ActionBar.g6.C1 = true;
        }
    }

    public final void f(float f9) {
        if (this.J != f9) {
            this.J = f9;
            org.telegram.ui.Cells.p2 p2Var = this.H;
            if (p2Var != null) {
                p2Var.invalidate();
            }
        }
    }

    public final void g(boolean z10) {
        this.X = z10;
    }

    public final void h() {
        AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.B.cancel();
        }
        e(0.0f);
        this.Y = false;
        this.E = false;
    }

    public final void i() {
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, this.f28066b, false);
        this.f28077k.setColor(-1);
        this.f28074g.setColor(-1);
        this.f28073f.setColor(i0.a.k(-1, 100));
        this.f28075i.setColor(w02);
        this.f28078l.f27775b.setColor(w02);
        this.h.setColor(org.telegram.ui.ActionBar.g6.w0(null, this.d, false));
    }
}
