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
import org.telegram.ui.se1;
public abstract class uh0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.r2 H;
    public wk0 I;
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
    public int f33001a;
    public final sh0 f33002a0;
    public final sh0 f33004b0;
    public int f33006c0;
    public final m.i3 f33007d0;
    public boolean f33009e0;
    public final TextPaint f33014k;
    public final th0 f33015l;
    public final Drawable f33016m;
    public final Path f33017n;
    public float f33018o;
    public float f33019p;
    public boolean f33020q;
    public boolean f33021r;
    public ValueAnimator f33022s;
    public ValueAnimator f33023t;
    public ValueAnimator f33024u;
    public float v;
    public float f33025w;
    public float f33026x;
    public boolean f33027y;
    public ValueAnimator f33028z;
    public final int f33003b = org.telegram.ui.ActionBar.f6.R9;
    public final int f33005c = org.telegram.ui.ActionBar.f6.S9;
    public final int d = org.telegram.ui.ActionBar.f6.N7;
    public final boolean f33008e = true;
    public final Paint f33010f = new Paint(1);
    public final Paint f33011g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f33012i = new Paint();
    public final RectF f33013j = new RectF();

    public uh0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.f33014k = textPaint;
        ?? drawable = new Drawable();
        drawable.f32698a = new Path();
        drawable.f32699b = new Paint(1);
        drawable.a();
        this.f33015l = drawable;
        this.f33017n = new Path();
        this.f33018o = 1.0f;
        this.f33019p = 1.0f;
        this.v = 1.0f;
        this.f33025w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.f33002a0 = new sh0(this, 3);
        this.f33004b0 = new sh0(this, 4);
        this.f33007d0 = new m.i3(this, 25);
        this.f33009e0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.Z = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.f33016m = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            if (z10) {
                ValueAnimator valueAnimator = this.f33023t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f33023t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f33023t = ofFloat;
                ofFloat.addUpdateListener(new sh0(this, 0));
                this.f33023t.setInterpolator(AndroidUtilities.accelerateInterpolator);
                this.f33023t.setDuration(230L);
                this.f33023t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f33024u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f33024u = null;
            }
            this.f33025w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f33024u = ofFloat2;
            ofFloat2.addUpdateListener(new sh0(this, 1));
            this.f33024u.setInterpolator(AndroidUtilities.accelerateInterpolator);
            this.f33024u.setDuration(230L);
            this.f33024u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f33022s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f33028z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        org.telegram.ui.Cells.r2 r2Var = this.H;
        if (r2Var != null) {
            r2Var.removeCallbacks(this.f33007d0);
        }
        ValueAnimator valueAnimator3 = this.f33023t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f33018o = 1.0f;
        this.f33019p = 1.0f;
        this.f33020q = false;
        this.f33021r = false;
        this.f33027y = false;
        this.f33009e0 = false;
        this.f33026x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    public final void c(Canvas canvas, boolean z10) {
        org.telegram.ui.Cells.r2 r2Var;
        float f10;
        float f11;
        int i9;
        char c10;
        boolean z11;
        float f12;
        int i10;
        boolean z12;
        int i11;
        float f13;
        int i12;
        float f14;
        int i13;
        float f15;
        int i14;
        int w02;
        int i15;
        int i16;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        if (this.X && !this.Y && (r2Var = this.H) != null && this.I != null) {
            boolean z13 = r2Var instanceof se1;
            if (z13) {
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
            if (width != this.f33006c0) {
                int i17 = AndroidUtilities.displaySize.x;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                c10 = 0;
                CharSequence charSequence = this.N;
                TextPaint textPaint = this.f33014k;
                this.O = new StaticLayout(charSequence, textPaint, i17, alignment, 1.0f, 0.0f, false);
                float f21 = 0.0f;
                for (int i18 = 0; i18 < this.O.getLineCount(); i18++) {
                    f21 = Math.max(f21, this.O.getLineWidth(i18));
                }
                float f22 = width;
                this.P = Math.min(1.0f, f22 / f21);
                int ceil = (int) Math.ceil(f21);
                if (this.P < 0.8f) {
                    this.P = 0.8f;
                    ceil = kh.x3.a(this.N, textPaint);
                }
                int i19 = ceil;
                this.O = new StaticLayout(this.N, textPaint, i19, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.Q = i19;
                this.R = 0.0f;
                for (int i20 = 0; i20 < this.O.getLineCount(); i20++) {
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i20));
                    this.R = Math.max(this.R, this.O.getLineWidth(i20));
                }
                this.T = new StaticLayout(this.S, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                float f23 = 0.0f;
                for (int i21 = 0; i21 < this.T.getLineCount(); i21++) {
                    f23 = Math.max(f23, this.T.getLineWidth(i21));
                }
                this.U = Math.min(1.0f, f22 / f23);
                i9 = dp4;
                int ceil2 = (int) Math.ceil(f23);
                if (this.U < 0.8f) {
                    this.U = 0.8f;
                    ceil2 = kh.x3.a(this.S, textPaint);
                }
                int i22 = ceil2;
                this.T = new StaticLayout(this.S, textPaint, i22, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.V = i22;
                this.W = 0.0f;
                for (int i23 = 0; i23 < this.T.getLineCount(); i23++) {
                    this.V = Math.min(this.V, this.T.getLineLeft(i23));
                    this.W = Math.max(this.W, this.T.getLineWidth(i23));
                }
                this.f33006c0 = width;
            } else {
                i9 = dp4;
                c10 = 0;
            }
            if (this.J > 0.85f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f33020q != z11) {
                this.f33020q = z11;
                if (this.f33026x == 0.0f) {
                    ValueAnimator valueAnimator = this.f33022s;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z11) {
                        f20 = 0.0f;
                    } else {
                        f20 = 1.0f;
                    }
                    this.f33018o = f20;
                } else {
                    ValueAnimator valueAnimator2 = this.f33022s;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f24 = this.f33018o;
                    if (z11) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    float[] fArr = new float[2];
                    fArr[c10] = f24;
                    fArr[1] = f19;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.f33022s = ofFloat;
                    ofFloat.addUpdateListener(this.f33002a0);
                    this.f33022s.setInterpolator(new LinearInterpolator());
                    this.f33022s.setDuration(170L);
                    this.f33022s.start();
                }
            }
            if (z11 != this.f33021r) {
                this.f33021r = z11;
                ValueAnimator valueAnimator3 = this.A;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                float f25 = this.f33019p;
                if (this.f33021r) {
                    f18 = 0.0f;
                } else {
                    f18 = 1.0f;
                }
                float[] fArr2 = new float[2];
                fArr2[c10] = f25;
                fArr2[1] = f18;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                this.A = ofFloat2;
                ofFloat2.addUpdateListener(new sh0(this, 2));
                this.A.setInterpolator(gr.f28847j);
                this.A.setDuration(250L);
                this.A.start();
            }
            float f26 = this.C * 2.0f;
            if (f26 > 1.0f) {
                f26 = 1.0f;
            }
            float f27 = this.L;
            float f28 = this.K;
            if (z10) {
                f28 += d;
            }
            int i24 = dp + dp3;
            int measuredHeight = (this.H.getMeasuredHeight() - dp2) - dp3;
            if (z10) {
                measuredHeight += d;
            }
            int i25 = (dp2 * 2) + i9;
            float f29 = f26;
            if (height > i25) {
                f12 = 1.0f;
            } else {
                f12 = height / i25;
            }
            canvas.save();
            float f30 = f12;
            if (z10) {
                i10 = d;
                z12 = z13;
                canvas.clipRect(0, 0, this.I.getMeasuredWidth(), i10 + 1);
            } else {
                i10 = d;
                z12 = z13;
            }
            float f31 = this.C;
            Paint paint = this.f33012i;
            RectF rectF = this.f33013j;
            if (f31 == 0.0f) {
                if (this.v != 1.0f && this.f33025w != 1.0f) {
                    canvas.drawPaint(paint);
                }
                f14 = f28;
                i11 = i9;
                i12 = dp3;
                f13 = f11;
            } else {
                float f32 = this.M;
                i11 = i9;
                f13 = f11;
                i12 = dp3;
                float z14 = e2.c.z(1.0f, this.C, this.H.getWidth() - this.M, (f32 * f11) + f32);
                if (this.v != 1.0f && this.f33025w != 1.0f) {
                    canvas.drawCircle(f27, f28, z14, paint);
                }
                Path path = this.f33017n;
                path.reset();
                f14 = f28;
                rectF.set(f27 - z14, f28 - z14, f27 + z14, f14 + z14);
                path.addOval(rectF, Path.Direction.CW);
                canvas.clipPath(path);
            }
            boolean z15 = this.G;
            Paint paint2 = this.h;
            if (z15) {
                if (this.f33025w > this.v) {
                    canvas.save();
                    float f33 = i24;
                    float f34 = this.C;
                    float f35 = measuredHeight;
                    canvas.translate((f27 - f33) * f34, f34 * (f14 - f35));
                    canvas.drawCircle(f33, f35, this.H.getWidth() * this.f33025w, paint);
                    canvas.restore();
                }
                if (this.v > 0.0f) {
                    canvas.save();
                    float f36 = i24;
                    float f37 = this.C;
                    float f38 = measuredHeight;
                    canvas.translate((f27 - f36) * f37, (f14 - f38) * f37);
                    canvas.drawCircle(f36, f38, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
            } else {
                if (this.v > this.f33025w) {
                    canvas.save();
                    float f39 = i24;
                    float f40 = this.C;
                    float f41 = measuredHeight;
                    canvas.translate((f27 - f39) * f40, f40 * (f14 - f41));
                    canvas.drawCircle(f39, f41, this.H.getWidth() * this.v, paint2);
                    canvas.restore();
                }
                if (this.f33025w > 0.0f) {
                    canvas.save();
                    float f42 = i24;
                    float f43 = this.C;
                    float f44 = measuredHeight;
                    canvas.translate((f27 - f42) * f43, f43 * (f14 - f44));
                    canvas.drawCircle(f42, f44, this.H.getWidth() * this.f33025w, paint);
                    canvas.restore();
                }
            }
            if (height > i25) {
                Paint paint3 = this.f33010f;
                paint3.setAlpha((int) ((1.0f - f29) * 0.4f * f30 * 255.0f));
                if (z10) {
                    rectF.set(dp, dp2, dp + i11, dp2 + i10 + i12);
                } else {
                    rectF.set(dp, ((this.H.getHeight() - height) + dp2) - i10, dp + i11, this.H.getHeight() - dp2);
                }
                i13 = i12;
                float f45 = i13;
                canvas.drawRoundRect(rectF, f45, f45, paint3);
            } else {
                i13 = i12;
            }
            if (z10) {
                canvas.restore();
                return;
            }
            if (z12) {
                measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - AndroidUtilities.dp(41.0f)) * this.C));
            }
            float f46 = this.C;
            if (f46 != 0.0f && !z12) {
                i14 = dp;
                f15 = 255.0f;
            } else {
                Paint paint4 = this.f33011g;
                paint4.setAlpha((int) ((1.0f - f46) * f30 * 255.0f));
                float f47 = i24;
                float f48 = measuredHeight;
                canvas.drawCircle(f47, f48, i13, paint4);
                th0 th0Var = this.f33015l;
                th0Var.getClass();
                int dp5 = AndroidUtilities.dp(18.0f);
                int dp6 = AndroidUtilities.dp(18.0f) >> 1;
                f15 = 255.0f;
                int i26 = dp5 >> 1;
                i14 = dp;
                th0Var.setBounds(i24 - dp6, measuredHeight - i26, i24 + dp6, measuredHeight + i26);
                float f49 = 1.0f - this.f33019p;
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
                    w02 = org.telegram.ui.ActionBar.f6.w0(null, this.f33003b, false);
                }
                th0Var.f32699b.setColor(w02);
                th0Var.draw(canvas);
                canvas.restore();
            }
            if (this.J > 0.0f && !this.f33027y) {
                if (Math.abs(this.f33001a) < this.Z * 0.5f) {
                    if (!this.f33009e0) {
                        this.f33026x = 1.0f;
                        this.f33027y = true;
                    }
                } else {
                    this.f33009e0 = true;
                    org.telegram.ui.Cells.r2 r2Var2 = this.H;
                    m.i3 i3Var = this.f33007d0;
                    r2Var2.removeCallbacks(i3Var);
                    this.H.postDelayed(i3Var, 200L);
                }
            }
            float height2 = (this.H.getHeight() - (i25 / 2.0f)) + AndroidUtilities.dp(6.0f);
            int width2 = this.H.getWidth();
            if (z12) {
                i15 = i14 * 2;
            } else {
                i15 = 0;
            }
            float f51 = (width2 + i15) / 2.0f;
            if (this.O != null) {
                float f52 = this.f33018o;
                if (f52 > 0.0f && f52 < 1.0f) {
                    canvas.save();
                    float f53 = (this.f33018o * 0.2f) + 0.8f;
                    canvas.scale(f53, f53, f51, e2.c.z(1.0f, this.f33018o, AndroidUtilities.dp(16.0f), height2));
                }
                i16 = i24;
                f16 = f30;
                f17 = f14;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.f33018o * f15 * f30 * this.f33026x), 31);
                canvas.translate((f51 - this.Q) - (this.R / 2.0f), e2.c.z(1.0f, this.f33018o, AndroidUtilities.dp(8.0f), height2) - this.O.getHeight());
                float f54 = this.P;
                canvas.scale(f54, f54, (this.R / 2.0f) + this.Q, this.O.getHeight());
                this.O.draw(canvas);
                canvas.restore();
                float f55 = this.f33018o;
                if (f55 > 0.0f && f55 < 1.0f) {
                    canvas.restore();
                }
            } else {
                i16 = i24;
                f16 = f30;
                f17 = f14;
            }
            if (this.T != null) {
                float f56 = this.f33018o;
                if (f56 > 0.0f && f56 < 1.0f) {
                    canvas.save();
                    float z16 = e2.c.z(1.0f, this.f33018o, 0.1f, 0.9f);
                    canvas.scale(z16, z16, f51, height2 - (AndroidUtilities.dp(8.0f) * this.f33018o));
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.l0.y(1.0f, this.f33018o, 255.0f, f16) * this.f33026x), 31);
                canvas.translate((f51 - this.V) - (this.W / 2.0f), ((AndroidUtilities.dp(8.0f) * this.f33018o) + height2) - this.T.getHeight());
                float f57 = this.U;
                canvas.scale(f57, f57, (this.W / 2.0f) + this.V, this.T.getHeight());
                this.T.draw(canvas);
                canvas.restore();
                float f58 = this.f33018o;
                if (f58 > 0.0f && f58 < 1.0f) {
                    canvas.restore();
                }
            }
            canvas.restore();
            if (!z12 && this.f33008e && this.C > 0.0f) {
                canvas.save();
                float f59 = org.telegram.ui.ActionBar.f6.f23298u1.f30842b;
                float dp7 = AndroidUtilities.dp(24.0f) / f59;
                float f60 = this.C;
                float w8 = aa.d.w(1.0f - dp7, f60, dp7, f13);
                float f61 = 1.0f - f60;
                canvas.translate((i16 - f27) * f61, (((this.H.getHeight() - dp2) - i13) - f17) * f61);
                canvas.scale(w8, w8, f27, f17);
                org.telegram.ui.ActionBar.f6.f23298u1.Q(0.0f, true);
                if (!org.telegram.ui.ActionBar.f6.C1) {
                    mi0 mi0Var = org.telegram.ui.ActionBar.f6.f23298u1;
                    mi0Var.W = true;
                    int i27 = this.d;
                    mi0Var.O(org.telegram.ui.ActionBar.f6.w0(null, i27, true), "Arrow1");
                    org.telegram.ui.ActionBar.f6.f23298u1.O(org.telegram.ui.ActionBar.f6.w0(null, i27, true), "Arrow2");
                    org.telegram.ui.ActionBar.f6.f23298u1.m();
                    org.telegram.ui.ActionBar.f6.C1 = true;
                }
                float f62 = f59 / 2.0f;
                org.telegram.ui.ActionBar.f6.f23298u1.setBounds((int) (f27 - f62), (int) (f17 - f62), (int) (f27 + f62), (int) (f62 + f17));
                org.telegram.ui.ActionBar.f6.f23298u1.draw(canvas);
                canvas.restore();
            }
        }
    }

    public abstract float d();

    public final void e(float f10) {
        this.C = f10;
        int d = i0.a.d(1.0f - this.C, org.telegram.ui.ActionBar.f6.w0(null, this.d, true), org.telegram.ui.ActionBar.f6.w0(null, this.f33005c, true));
        this.h.setColor(d);
        if (this.f33008e && this.X && !this.Y) {
            mi0 mi0Var = org.telegram.ui.ActionBar.f6.f23298u1;
            mi0Var.W = true;
            mi0Var.O(d, "Arrow1");
            org.telegram.ui.ActionBar.f6.f23298u1.O(d, "Arrow2");
            org.telegram.ui.ActionBar.f6.f23298u1.m();
            org.telegram.ui.ActionBar.f6.C1 = true;
        }
    }

    public final void f(float f10) {
        if (this.J != f10) {
            this.J = f10;
            org.telegram.ui.Cells.r2 r2Var = this.H;
            if (r2Var != null) {
                r2Var.invalidate();
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
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, this.f33003b, false);
        this.f33014k.setColor(-1);
        this.f33011g.setColor(-1);
        this.f33010f.setColor(i0.a.k(-1, 100));
        this.f33012i.setColor(w02);
        this.f33015l.f32699b.setColor(w02);
        this.h.setColor(org.telegram.ui.ActionBar.f6.w0(null, this.d, false));
    }
}
