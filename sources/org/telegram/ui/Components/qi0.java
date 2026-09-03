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
import org.telegram.ui.pf1;
public abstract class qi0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.q2 H;
    public rl0 I;
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
    public int f28165a;
    public final oi0 f28166a0;
    public final oi0 f28168b0;
    public int f28170c0;
    public final m2.b f28171d0;
    public boolean f28172e0;
    public final TextPaint f28177k;
    public final pi0 f28178l;
    public final Drawable f28179m;
    public final Path f28180n;
    public float f28181o;
    public float f28182p;
    public boolean f28183q;
    public boolean f28184r;
    public ValueAnimator f28185s;
    public ValueAnimator f28186t;
    public ValueAnimator f28187u;
    public float v;
    public float f28188w;
    public float f28189x;
    public boolean f28190y;
    public ValueAnimator f28191z;
    public final int f28167b = org.telegram.ui.ActionBar.j6.R9;
    public final int f28169c = org.telegram.ui.ActionBar.j6.S9;
    public final int d = org.telegram.ui.ActionBar.j6.N7;
    public final boolean e = true;
    public final Paint f28173f = new Paint(1);
    public final Paint f28174g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f28175i = new Paint();
    public final RectF f28176j = new RectF();

    public qi0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.f28177k = textPaint;
        ?? drawable = new Drawable();
        drawable.f27860a = new Path();
        drawable.f27861b = new Paint(1);
        drawable.a();
        this.f28178l = drawable;
        this.f28180n = new Path();
        this.f28181o = 1.0f;
        this.f28182p = 1.0f;
        this.v = 1.0f;
        this.f28188w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.f28166a0 = new oi0(this, 3);
        this.f28168b0 = new oi0(this, 4);
        this.f28171d0 = new m2.b(this, 27);
        this.f28172e0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.Z = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.f28179m = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z4) {
        if (this.G != z4) {
            this.G = z4;
            if (z4) {
                ValueAnimator valueAnimator = this.f28186t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f28186t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f28186t = ofFloat;
                ofFloat.addUpdateListener(new oi0(this, 0));
                this.f28186t.setInterpolator(AndroidUtilities.accelerateInterpolator);
                this.f28186t.setDuration(230L);
                this.f28186t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f28187u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f28187u = null;
            }
            this.f28188w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f28187u = ofFloat2;
            ofFloat2.addUpdateListener(new oi0(this, 1));
            this.f28187u.setInterpolator(AndroidUtilities.accelerateInterpolator);
            this.f28187u.setDuration(230L);
            this.f28187u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f28185s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f28191z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        org.telegram.ui.Cells.q2 q2Var = this.H;
        if (q2Var != null) {
            q2Var.removeCallbacks(this.f28171d0);
        }
        ValueAnimator valueAnimator3 = this.f28186t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f28181o = 1.0f;
        this.f28182p = 1.0f;
        this.f28183q = false;
        this.f28184r = false;
        this.f28190y = false;
        this.f28172e0 = false;
        this.f28189x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    public final void c(Canvas canvas, boolean z4) {
        org.telegram.ui.Cells.q2 q2Var;
        float f10;
        float f11;
        int i10;
        char c3;
        boolean z10;
        float f12;
        int i11;
        boolean z11;
        int i12;
        float f13;
        int i13;
        float f14;
        int i14;
        float f15;
        int i15;
        int w02;
        int i16;
        int i17;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        if (this.X && !this.Y && (q2Var = this.H) != null && this.I != null) {
            boolean z12 = q2Var instanceof pf1;
            if (z12) {
                f10 = 15.0f;
            } else {
                f10 = 28.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            int dp2 = AndroidUtilities.dp(8.0f);
            int dp3 = AndroidUtilities.dp(9.0f);
            int dp4 = AndroidUtilities.dp(18.0f);
            int d = (int) d();
            int height = (int) (this.H.getHeight() * this.J);
            if (this.F) {
                f11 = (this.D * 0.07f) - 0.05f;
            } else {
                f11 = this.D * 0.02f;
            }
            int width = (this.H.getWidth() - (dp * 4)) - AndroidUtilities.dp(16.0f);
            if (width != this.f28170c0) {
                int i18 = AndroidUtilities.displaySize.x;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                c3 = 0;
                CharSequence charSequence = this.N;
                TextPaint textPaint = this.f28177k;
                this.O = new StaticLayout(charSequence, textPaint, i18, alignment, 1.0f, 0.0f, false);
                float f21 = 0.0f;
                for (int i19 = 0; i19 < this.O.getLineCount(); i19++) {
                    f21 = Math.max(f21, this.O.getLineWidth(i19));
                }
                float f22 = width;
                this.P = Math.min(1.0f, f22 / f21);
                int ceil = (int) Math.ceil(f21);
                if (this.P < 0.8f) {
                    this.P = 0.8f;
                    ceil = ph.f3.a(this.N, textPaint);
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
                float f23 = 0.0f;
                for (int i22 = 0; i22 < this.T.getLineCount(); i22++) {
                    f23 = Math.max(f23, this.T.getLineWidth(i22));
                }
                this.U = Math.min(1.0f, f22 / f23);
                i10 = dp4;
                int ceil2 = (int) Math.ceil(f23);
                if (this.U < 0.8f) {
                    this.U = 0.8f;
                    ceil2 = ph.f3.a(this.S, textPaint);
                }
                int i23 = ceil2;
                this.T = new StaticLayout(this.S, textPaint, i23, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.V = i23;
                this.W = 0.0f;
                for (int i24 = 0; i24 < this.T.getLineCount(); i24++) {
                    this.V = Math.min(this.V, this.T.getLineLeft(i24));
                    this.W = Math.max(this.W, this.T.getLineWidth(i24));
                }
                this.f28170c0 = width;
            } else {
                i10 = dp4;
                c3 = 0;
            }
            if (this.J > 0.85f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f28183q != z10) {
                this.f28183q = z10;
                if (this.f28189x == 0.0f) {
                    ValueAnimator valueAnimator = this.f28185s;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z10) {
                        f20 = 0.0f;
                    } else {
                        f20 = 1.0f;
                    }
                    this.f28181o = f20;
                } else {
                    ValueAnimator valueAnimator2 = this.f28185s;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f24 = this.f28181o;
                    if (z10) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    float[] fArr = new float[2];
                    fArr[c3] = f24;
                    fArr[1] = f19;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.f28185s = ofFloat;
                    ofFloat.addUpdateListener(this.f28166a0);
                    this.f28185s.setInterpolator(new LinearInterpolator());
                    this.f28185s.setDuration(170L);
                    this.f28185s.start();
                }
            }
            if (z10 != this.f28184r) {
                this.f28184r = z10;
                ValueAnimator valueAnimator3 = this.A;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                float f25 = this.f28182p;
                if (this.f28184r) {
                    f18 = 0.0f;
                } else {
                    f18 = 1.0f;
                }
                float[] fArr2 = new float[2];
                fArr2[c3] = f25;
                fArr2[1] = f18;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                this.A = ofFloat2;
                ofFloat2.addUpdateListener(new oi0(this, 2));
                this.A.setInterpolator(mr.f27125j);
                this.A.setDuration(250L);
                this.A.start();
            }
            float f26 = this.C * 2.0f;
            if (f26 > 1.0f) {
                f26 = 1.0f;
            }
            float f27 = this.L;
            float f28 = this.K;
            if (z4) {
                f28 += d;
            }
            int i25 = dp + dp3;
            int measuredHeight = (this.H.getMeasuredHeight() - dp2) - dp3;
            if (z4) {
                measuredHeight += d;
            }
            int i26 = (dp2 * 2) + i10;
            float f29 = f26;
            if (height > i26) {
                f12 = 1.0f;
            } else {
                f12 = height / i26;
            }
            canvas.save();
            float f30 = f12;
            if (z4) {
                i11 = d;
                z11 = z12;
                canvas.clipRect(0, 0, this.I.getMeasuredWidth(), i11 + 1);
            } else {
                i11 = d;
                z11 = z12;
            }
            float f31 = this.C;
            Paint paint = this.f28175i;
            RectF rectF = this.f28176j;
            if (f31 == 0.0f) {
                if (this.v != 1.0f && this.f28188w != 1.0f) {
                    canvas.drawPaint(paint);
                }
                f14 = f28;
                i12 = i10;
                i13 = dp3;
                f13 = f11;
            } else {
                float f32 = this.M;
                i12 = i10;
                f13 = f11;
                i13 = dp3;
                float w10 = e2.c.w(1.0f, this.C, this.H.getWidth() - this.M, (f32 * f11) + f32);
                if (this.v != 1.0f && this.f28188w != 1.0f) {
                    canvas.drawCircle(f27, f28, w10, paint);
                }
                Path path = this.f28180n;
                path.reset();
                f14 = f28;
                rectF.set(f27 - w10, f28 - w10, f27 + w10, f14 + w10);
                path.addOval(rectF, Path.Direction.CW);
                canvas.clipPath(path);
            }
            boolean z13 = this.G;
            Paint paint2 = this.h;
            if (z13) {
                if (this.f28188w > this.v) {
                    canvas.save();
                    float f33 = i25;
                    float f34 = this.C;
                    float f35 = measuredHeight;
                    canvas.translate((f27 - f33) * f34, f34 * (f14 - f35));
                    canvas.drawCircle(f33, f35, this.H.getWidth() * this.f28188w, paint);
                    canvas.restore();
                }
                if (this.v > 0.0f) {
                    canvas.save();
                    float f36 = i25;
                    float f37 = this.C;
                    float f38 = measuredHeight;
                    canvas.translate((f27 - f36) * f37, (f14 - f38) * f37);
                    canvas.drawCircle(f36, f38, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
            } else {
                if (this.v > this.f28188w) {
                    canvas.save();
                    float f39 = i25;
                    float f40 = this.C;
                    float f41 = measuredHeight;
                    canvas.translate((f27 - f39) * f40, f40 * (f14 - f41));
                    canvas.drawCircle(f39, f41, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
                if (this.f28188w > 0.0f) {
                    canvas.save();
                    float f42 = i25;
                    float f43 = this.C;
                    float f44 = measuredHeight;
                    canvas.translate((f27 - f42) * f43, f43 * (f14 - f44));
                    canvas.drawCircle(f42, f44, this.H.getWidth() * this.f28188w, paint);
                    canvas.restore();
                }
            }
            if (height > i26) {
                Paint paint3 = this.f28173f;
                paint3.setAlpha((int) ((1.0f - f29) * 0.4f * f30 * 255.0f));
                if (z4) {
                    rectF.set(dp, dp2, dp + i12, dp2 + i11 + i13);
                } else {
                    rectF.set(dp, ((this.H.getHeight() - height) + dp2) - i11, dp + i12, this.H.getHeight() - dp2);
                }
                i14 = i13;
                float f45 = i14;
                canvas.drawRoundRect(rectF, f45, f45, paint3);
            } else {
                i14 = i13;
            }
            if (z4) {
                canvas.restore();
                return;
            }
            if (z11) {
                measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - AndroidUtilities.dp(41.0f)) * this.C));
            }
            float f46 = this.C;
            if (f46 != 0.0f && !z11) {
                i15 = dp;
                f15 = 255.0f;
            } else {
                Paint paint4 = this.f28174g;
                paint4.setAlpha((int) ((1.0f - f46) * f30 * 255.0f));
                float f47 = i25;
                float f48 = measuredHeight;
                canvas.drawCircle(f47, f48, i14, paint4);
                pi0 pi0Var = this.f28178l;
                pi0Var.getClass();
                int dp5 = AndroidUtilities.dp(18.0f);
                int dp6 = AndroidUtilities.dp(18.0f) >> 1;
                f15 = 255.0f;
                int i27 = dp5 >> 1;
                i15 = dp;
                pi0Var.setBounds(i25 - dp6, measuredHeight - i27, i25 + dp6, measuredHeight + i27);
                float f49 = 1.0f - this.f28182p;
                if (f49 < 0.0f) {
                    f49 = 0.0f;
                }
                float f50 = 1.0f - f49;
                canvas.save();
                canvas.rotate(180.0f * f50, f47, f48);
                canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f50);
                if (this.G) {
                    w02 = paint2.getColor();
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f28167b, false);
                }
                pi0Var.f27861b.setColor(w02);
                pi0Var.draw(canvas);
                canvas.restore();
            }
            if (this.J > 0.0f && !this.f28190y) {
                if (Math.abs(this.f28165a) < this.Z * 0.5f) {
                    if (!this.f28172e0) {
                        this.f28189x = 1.0f;
                        this.f28190y = true;
                    }
                } else {
                    this.f28172e0 = true;
                    org.telegram.ui.Cells.q2 q2Var2 = this.H;
                    m2.b bVar = this.f28171d0;
                    q2Var2.removeCallbacks(bVar);
                    this.H.postDelayed(bVar, 200L);
                }
            }
            float height2 = (this.H.getHeight() - (i26 / 2.0f)) + AndroidUtilities.dp(6.0f);
            int width2 = this.H.getWidth();
            if (z11) {
                i16 = i15 * 2;
            } else {
                i16 = 0;
            }
            float f51 = (width2 + i16) / 2.0f;
            if (this.O != null) {
                float f52 = this.f28181o;
                if (f52 > 0.0f && f52 < 1.0f) {
                    canvas.save();
                    float f53 = (this.f28181o * 0.2f) + 0.8f;
                    canvas.scale(f53, f53, f51, e2.c.w(1.0f, this.f28181o, AndroidUtilities.dp(16.0f), height2));
                }
                i17 = i25;
                f16 = f30;
                f17 = f14;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.f28181o * f15 * f30 * this.f28189x), 31);
                canvas.translate((f51 - this.Q) - (this.R / 2.0f), e2.c.w(1.0f, this.f28181o, AndroidUtilities.dp(8.0f), height2) - this.O.getHeight());
                float f54 = this.P;
                canvas.scale(f54, f54, (this.R / 2.0f) + this.Q, this.O.getHeight());
                this.O.draw(canvas);
                canvas.restore();
                float f55 = this.f28181o;
                if (f55 > 0.0f && f55 < 1.0f) {
                    canvas.restore();
                }
            } else {
                i17 = i25;
                f16 = f30;
                f17 = f14;
            }
            if (this.T != null) {
                float f56 = this.f28181o;
                if (f56 > 0.0f && f56 < 1.0f) {
                    canvas.save();
                    float w11 = e2.c.w(1.0f, this.f28181o, 0.1f, 0.9f);
                    canvas.scale(w11, w11, f51, height2 - (AndroidUtilities.dp(8.0f) * this.f28181o));
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.y3.y(1.0f, this.f28181o, 255.0f, f16) * this.f28189x), 31);
                canvas.translate((f51 - this.V) - (this.W / 2.0f), ((AndroidUtilities.dp(8.0f) * this.f28181o) + height2) - this.T.getHeight());
                float f57 = this.U;
                canvas.scale(f57, f57, (this.W / 2.0f) + this.V, this.T.getHeight());
                this.T.draw(canvas);
                canvas.restore();
                float f58 = this.f28181o;
                if (f58 > 0.0f && f58 < 1.0f) {
                    canvas.restore();
                }
            }
            canvas.restore();
            if (!z11 && this.e && this.C > 0.0f) {
                canvas.save();
                float f59 = org.telegram.ui.ActionBar.j6.f20177u1.f25154b;
                float dp7 = AndroidUtilities.dp(24.0f) / f59;
                float f60 = this.C;
                float A = e2.c.A(1.0f - dp7, f60, dp7, f13);
                float f61 = 1.0f - f60;
                canvas.translate((i17 - f27) * f61, (((this.H.getHeight() - dp2) - i14) - f17) * f61);
                canvas.scale(A, A, f27, f17);
                org.telegram.ui.ActionBar.j6.f20177u1.Q(0.0f, true);
                if (!org.telegram.ui.ActionBar.j6.C1) {
                    gj0 gj0Var = org.telegram.ui.ActionBar.j6.f20177u1;
                    gj0Var.X = true;
                    int i28 = this.d;
                    gj0Var.O(org.telegram.ui.ActionBar.j6.w0(null, i28, true), "Arrow1");
                    org.telegram.ui.ActionBar.j6.f20177u1.O(org.telegram.ui.ActionBar.j6.w0(null, i28, true), "Arrow2");
                    org.telegram.ui.ActionBar.j6.f20177u1.m();
                    org.telegram.ui.ActionBar.j6.C1 = true;
                }
                float f62 = f59 / 2.0f;
                org.telegram.ui.ActionBar.j6.f20177u1.setBounds((int) (f27 - f62), (int) (f17 - f62), (int) (f27 + f62), (int) (f62 + f17));
                org.telegram.ui.ActionBar.j6.f20177u1.draw(canvas);
                canvas.restore();
            }
        }
    }

    public abstract float d();

    public final void e(float f10) {
        this.C = f10;
        int d = i0.a.d(1.0f - this.C, org.telegram.ui.ActionBar.j6.w0(null, this.d, true), org.telegram.ui.ActionBar.j6.w0(null, this.f28169c, true));
        this.h.setColor(d);
        if (this.e && this.X && !this.Y) {
            gj0 gj0Var = org.telegram.ui.ActionBar.j6.f20177u1;
            gj0Var.X = true;
            gj0Var.O(d, "Arrow1");
            org.telegram.ui.ActionBar.j6.f20177u1.O(d, "Arrow2");
            org.telegram.ui.ActionBar.j6.f20177u1.m();
            org.telegram.ui.ActionBar.j6.C1 = true;
        }
    }

    public final void f(float f10) {
        if (this.J != f10) {
            this.J = f10;
            org.telegram.ui.Cells.q2 q2Var = this.H;
            if (q2Var != null) {
                q2Var.invalidate();
            }
        }
    }

    public final void g(boolean z4) {
        this.X = z4;
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
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.f28167b, false);
        this.f28177k.setColor(-1);
        this.f28174g.setColor(-1);
        this.f28173f.setColor(i0.a.k(-1, 100));
        this.f28175i.setColor(w02);
        this.f28178l.f27861b.setColor(w02);
        this.h.setColor(org.telegram.ui.ActionBar.j6.w0(null, this.d, false));
    }
}
