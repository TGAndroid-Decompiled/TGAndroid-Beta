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
import org.telegram.ui.te1;

public abstract class wh0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.p2 H;
    public zk0 I;
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

    public int f34183a;

    public final uh0 f34184a0;

    public final uh0 f34186b0;

    public int f34188c0;

    public final m.i3 f34189d0;

    public boolean f34191e0;

    public final TextPaint f34196k;

    public final vh0 f34197l;

    public final Drawable f34198m;

    public final Path f34199n;

    public float f34200o;

    public float f34201p;

    public boolean f34202q;

    public boolean f34203r;

    public ValueAnimator f34204s;

    public ValueAnimator f34205t;

    public ValueAnimator f34206u;
    public float v;

    public float f34207w;

    public float f34208x;

    public boolean f34209y;

    public ValueAnimator f34210z;

    public final int f34185b = org.telegram.ui.ActionBar.g6.R9;

    public final int f34187c = org.telegram.ui.ActionBar.g6.S9;
    public final int d = org.telegram.ui.ActionBar.g6.N7;

    public final boolean f34190e = true;

    public final Paint f34192f = new Paint(1);

    public final Paint f34193g = new Paint(1);
    public final Paint h = new Paint(1);

    public final Paint f34194i = new Paint();

    public final RectF f34195j = new RectF();

    public wh0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.f34196k = textPaint;
        vh0 vh0Var = new vh0();
        vh0Var.f33420a = new Path();
        vh0Var.f33421b = new Paint(1);
        vh0Var.a();
        this.f34197l = vh0Var;
        this.f34199n = new Path();
        this.f34200o = 1.0f;
        this.f34201p = 1.0f;
        this.v = 1.0f;
        this.f34207w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.f34184a0 = new uh0(this, 3);
        this.f34186b0 = new uh0(this, 4);
        this.f34189d0 = new m.i3(this, 25);
        this.f34191e0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.Z = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.f34198m = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            if (z10) {
                ValueAnimator valueAnimator = this.f34205t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f34205t = null;
                }
                this.v = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f34205t = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new uh0(this, 0));
                this.f34205t.setInterpolator(AndroidUtilities.accelerateInterpolator);
                this.f34205t.setDuration(230L);
                this.f34205t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f34206u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f34206u = null;
            }
            this.f34207w = 0.0f;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f34206u = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new uh0(this, 1));
            this.f34206u.setInterpolator(AndroidUtilities.accelerateInterpolator);
            this.f34206u.setDuration(230L);
            this.f34206u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f34204s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f34210z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        org.telegram.ui.Cells.p2 p2Var = this.H;
        if (p2Var != null) {
            p2Var.removeCallbacks(this.f34189d0);
        }
        ValueAnimator valueAnimator3 = this.f34205t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f34200o = 1.0f;
        this.f34201p = 1.0f;
        this.f34202q = false;
        this.f34203r = false;
        this.f34209y = false;
        this.f34191e0 = false;
        this.f34208x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    public final void c(Canvas canvas, boolean z10) {
        org.telegram.ui.Cells.p2 p2Var;
        char c10;
        int i10;
        float f10;
        int i11;
        float f11;
        int i12;
        float f12;
        float f13;
        if (!this.X || this.Y || (p2Var = this.H) == null || this.I == null) {
            return;
        }
        boolean z11 = p2Var instanceof te1;
        int iDp = AndroidUtilities.dp(z11 ? 15.0f : 28.0f);
        int iDp2 = AndroidUtilities.dp(8.0f);
        int iDp3 = AndroidUtilities.dp(9.0f);
        int iDp4 = AndroidUtilities.dp(18.0f);
        int iD = (int) d();
        int height = (int) (this.H.getHeight() * this.J);
        float f14 = this.F ? (this.D * 0.07f) - 0.05f : this.D * 0.02f;
        int width = (this.H.getWidth() - (iDp * 4)) - AndroidUtilities.dp(16.0f);
        if (width != this.f34188c0) {
            int i13 = AndroidUtilities.displaySize.x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            c10 = 0;
            CharSequence charSequence = this.N;
            TextPaint textPaint = this.f34196k;
            this.O = new StaticLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, false);
            float fMax = 0.0f;
            for (int i14 = 0; i14 < this.O.getLineCount(); i14++) {
                fMax = Math.max(fMax, this.O.getLineWidth(i14));
            }
            float f15 = width;
            this.P = Math.min(1.0f, f15 / fMax);
            int iCeil = (int) Math.ceil(fMax);
            if (this.P < 0.8f) {
                this.P = 0.8f;
                iCeil = lh.w3.a(this.N, textPaint);
            }
            int i15 = iCeil;
            this.O = new StaticLayout(this.N, textPaint, i15, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.Q = i15;
            this.R = 0.0f;
            for (int i16 = 0; i16 < this.O.getLineCount(); i16++) {
                this.Q = Math.min(this.Q, this.O.getLineLeft(i16));
                this.R = Math.max(this.R, this.O.getLineWidth(i16));
            }
            this.T = new StaticLayout(this.S, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float fMax2 = 0.0f;
            for (int i17 = 0; i17 < this.T.getLineCount(); i17++) {
                fMax2 = Math.max(fMax2, this.T.getLineWidth(i17));
            }
            this.U = Math.min(1.0f, f15 / fMax2);
            int iCeil2 = (int) Math.ceil(fMax2);
            if (this.U < 0.8f) {
                this.U = 0.8f;
                iCeil2 = lh.w3.a(this.S, textPaint);
            }
            int i18 = iCeil2;
            this.T = new StaticLayout(this.S, textPaint, i18, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.V = i18;
            this.W = 0.0f;
            for (int i19 = 0; i19 < this.T.getLineCount(); i19++) {
                this.V = Math.min(this.V, this.T.getLineLeft(i19));
                this.W = Math.max(this.W, this.T.getLineWidth(i19));
            }
            this.f34188c0 = width;
        } else {
            c10 = 0;
        }
        boolean z12 = this.J > 0.85f;
        if (this.f34202q != z12) {
            this.f34202q = z12;
            if (this.f34208x == 0.0f) {
                ValueAnimator valueAnimator = this.f34204s;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f34200o = z12 ? 0.0f : 1.0f;
            } else {
                ValueAnimator valueAnimator2 = this.f34204s;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f16 = this.f34200o;
                float f17 = z12 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[c10] = f16;
                fArr[1] = f17;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                this.f34204s = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(this.f34184a0);
                this.f34204s.setInterpolator(new LinearInterpolator());
                this.f34204s.setDuration(170L);
                this.f34204s.start();
            }
        }
        if (z12 != this.f34203r) {
            this.f34203r = z12;
            ValueAnimator valueAnimator3 = this.A;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            float f18 = this.f34201p;
            float f19 = this.f34203r ? 0.0f : 1.0f;
            float[] fArr2 = new float[2];
            fArr2[c10] = f18;
            fArr2[1] = f19;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2);
            this.A = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new uh0(this, 2));
            this.A.setInterpolator(er.f28125j);
            this.A.setDuration(250L);
            this.A.start();
        }
        float f20 = this.C * 2.0f;
        if (f20 > 1.0f) {
            f20 = 1.0f;
        }
        float f21 = this.L;
        float f22 = this.K;
        if (z10) {
            f22 += iD;
        }
        int i20 = iDp + iDp3;
        int measuredHeight = (this.H.getMeasuredHeight() - iDp2) - iDp3;
        if (z10) {
            measuredHeight += iD;
        }
        int i21 = (iDp2 * 2) + iDp4;
        float f23 = f20;
        float f24 = height > i21 ? 1.0f : height / i21;
        canvas.save();
        float f25 = f24;
        if (z10) {
            i10 = iD;
            canvas.clipRect(0, 0, this.I.getMeasuredWidth(), i10 + 1);
        } else {
            i10 = iD;
        }
        float f26 = this.C;
        Paint paint = this.f34194i;
        RectF rectF = this.f34195j;
        if (f26 == 0.0f) {
            if (this.v != 1.0f && this.f34207w != 1.0f) {
                canvas.drawPaint(paint);
            }
            f10 = f22;
        } else {
            float f27 = this.M;
            float fZ = com.google.android.recaptcha.internal.a.z(1.0f, this.C, this.H.getWidth() - this.M, (f27 * f14) + f27);
            if (this.v != 1.0f && this.f34207w != 1.0f) {
                canvas.drawCircle(f21, f22, fZ, paint);
            }
            Path path = this.f34199n;
            path.reset();
            f10 = f22;
            rectF.set(f21 - fZ, f22 - fZ, f21 + fZ, f10 + fZ);
            path.addOval(rectF, Path.Direction.CW);
            canvas.clipPath(path);
        }
        boolean z13 = this.G;
        Paint paint2 = this.h;
        if (z13) {
            if (this.f34207w > this.v) {
                canvas.save();
                float f28 = i20;
                float f29 = this.C;
                float f30 = measuredHeight;
                canvas.translate((f21 - f28) * f29, f29 * (f10 - f30));
                canvas.drawCircle(f28, f30, this.H.getWidth() * this.f34207w, paint);
                canvas.restore();
            }
            if (this.v > 0.0f) {
                canvas.save();
                float f31 = i20;
                float f32 = this.C;
                float f33 = measuredHeight;
                canvas.translate((f21 - f31) * f32, (f10 - f33) * f32);
                canvas.drawCircle(f31, f33, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
        } else {
            if (this.v > this.f34207w) {
                canvas.save();
                float f34 = i20;
                float f35 = this.C;
                float f36 = measuredHeight;
                canvas.translate((f21 - f34) * f35, f35 * (f10 - f36));
                canvas.drawCircle(f34, f36, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
            if (this.f34207w > 0.0f) {
                canvas.save();
                float f37 = i20;
                float f38 = this.C;
                float f39 = measuredHeight;
                canvas.translate((f21 - f37) * f38, f38 * (f10 - f39));
                canvas.drawCircle(f37, f39, this.H.getWidth() * this.f34207w, paint);
                canvas.restore();
            }
        }
        if (height > i21) {
            Paint paint3 = this.f34192f;
            paint3.setAlpha((int) ((1.0f - f23) * 0.4f * f25 * 255.0f));
            if (z10) {
                rectF.set(iDp, iDp2, iDp + iDp4, iDp2 + i10 + iDp3);
            } else {
                rectF.set(iDp, ((this.H.getHeight() - height) + iDp2) - i10, iDp + iDp4, this.H.getHeight() - iDp2);
            }
            i11 = iDp3;
            float f40 = i11;
            canvas.drawRoundRect(rectF, f40, f40, paint3);
        }
        if (z10) {
            i11 = iDp3;
            canvas.restore();
            return;
        }
        if (z11 != 0) {
            measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - AndroidUtilities.dp(41.0f)) * this.C));
        }
        float f41 = this.C;
        if (f41 == 0.0f || z11) {
            Paint paint4 = this.f34193g;
            paint4.setAlpha((int) ((1.0f - f41) * f25 * 255.0f));
            float f42 = i20;
            float f43 = measuredHeight;
            canvas.drawCircle(f42, f43, i11, paint4);
            vh0 vh0Var = this.f34197l;
            vh0Var.getClass();
            int iDp5 = AndroidUtilities.dp(18.0f);
            int iDp6 = AndroidUtilities.dp(18.0f) >> 1;
            f11 = 255.0f;
            int i22 = iDp5 >> 1;
            vh0Var.setBounds(i20 - iDp6, measuredHeight - i22, i20 + iDp6, measuredHeight + i22);
            float f44 = 1.0f - this.f34201p;
            if (f44 < 0.0f) {
                f44 = 0.0f;
            }
            float f45 = 1.0f - f44;
            canvas.save();
            canvas.rotate(180.0f * f45, f42, f43);
            canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f45);
            vh0Var.f33421b.setColor(this.G ? paint2.getColor() : org.telegram.ui.ActionBar.g6.w0(null, this.f34185b, false));
            vh0Var.draw(canvas);
            canvas.restore();
        } else {
            f11 = 255.0f;
        }
        if (this.J > 0.0f && !this.f34209y) {
            if (Math.abs(this.f34183a) >= this.Z * 0.5f) {
                this.f34191e0 = true;
                org.telegram.ui.Cells.p2 p2Var2 = this.H;
                m.i3 i3Var = this.f34189d0;
                p2Var2.removeCallbacks(i3Var);
                this.H.postDelayed(i3Var, 200L);
            } else if (!this.f34191e0) {
                this.f34208x = 1.0f;
                this.f34209y = true;
            }
        }
        float height2 = (this.H.getHeight() - (i21 / 2.0f)) + AndroidUtilities.dp(6.0f);
        float width2 = (this.H.getWidth() + (z11 != 0 ? iDp * 2 : 0)) / 2.0f;
        if (this.O != null) {
            float f46 = this.f34200o;
            if (f46 > 0.0f && f46 < 1.0f) {
                canvas.save();
                float f47 = (this.f34200o * 0.2f) + 0.8f;
                canvas.scale(f47, f47, width2, com.google.android.recaptcha.internal.a.z(1.0f, this.f34200o, AndroidUtilities.dp(16.0f), height2));
            }
            i12 = i20;
            f12 = f25;
            f13 = f10;
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.f34200o * f11 * f25 * this.f34208x), 31);
            canvas.translate((width2 - this.Q) - (this.R / 2.0f), com.google.android.recaptcha.internal.a.z(1.0f, this.f34200o, AndroidUtilities.dp(8.0f), height2) - this.O.getHeight());
            float f48 = this.P;
            canvas.scale(f48, f48, (this.R / 2.0f) + this.Q, this.O.getHeight());
            this.O.draw(canvas);
            canvas.restore();
            float f49 = this.f34200o;
            if (f49 > 0.0f && f49 < 1.0f) {
                canvas.restore();
            }
        } else {
            i12 = i20;
            f12 = f25;
            f13 = f10;
        }
        if (this.T != null) {
            float f50 = this.f34200o;
            if (f50 > 0.0f && f50 < 1.0f) {
                canvas.save();
                float fZ2 = com.google.android.recaptcha.internal.a.z(1.0f, this.f34200o, 0.1f, 0.9f);
                canvas.scale(fZ2, fZ2, width2, height2 - (AndroidUtilities.dp(8.0f) * this.f34200o));
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.y1.z(1.0f, this.f34200o, 255.0f, f12) * this.f34208x), 31);
            canvas.translate((width2 - this.V) - (this.W / 2.0f), ((AndroidUtilities.dp(8.0f) * this.f34200o) + height2) - this.T.getHeight());
            float f51 = this.U;
            canvas.scale(f51, f51, (this.W / 2.0f) + this.V, this.T.getHeight());
            this.T.draw(canvas);
            canvas.restore();
            float f52 = this.f34200o;
            if (f52 > 0.0f && f52 < 1.0f) {
                canvas.restore();
            }
        }
        canvas.restore();
        if (z11 == 0 && this.f34190e && this.C > 0.0f) {
            canvas.save();
            int i23 = org.telegram.ui.ActionBar.g6.f23352u1.f31307b;
            int height3 = (this.H.getHeight() - iDp2) - i11;
            float f53 = i23;
            float fDp = AndroidUtilities.dp(24.0f) / f53;
            float f54 = this.C;
            float fD = com.google.android.recaptcha.internal.a.d(1.0f - fDp, f54, fDp, f14);
            float f55 = i12 - f21;
            float f56 = 1.0f - f54;
            canvas.translate(f55 * f56, (height3 - f13) * f56);
            canvas.scale(fD, fD, f21, f13);
            org.telegram.ui.ActionBar.g6.f23352u1.Q(0.0f, true);
            if (!org.telegram.ui.ActionBar.g6.C1) {
                oi0 oi0Var = org.telegram.ui.ActionBar.g6.f23352u1;
                oi0Var.W = true;
                int i24 = this.d;
                oi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i24, true), "Arrow1");
                org.telegram.ui.ActionBar.g6.f23352u1.O(org.telegram.ui.ActionBar.g6.w0(null, i24, true), "Arrow2");
                org.telegram.ui.ActionBar.g6.f23352u1.m();
                org.telegram.ui.ActionBar.g6.C1 = true;
            }
            float f57 = f53 / 2.0f;
            org.telegram.ui.ActionBar.g6.f23352u1.setBounds((int) (f21 - f57), (int) (f13 - f57), (int) (f21 + f57), (int) (f57 + f13));
            org.telegram.ui.ActionBar.g6.f23352u1.draw(canvas);
            canvas.restore();
        }
    }

    public abstract float d();

    public final void e(float f10) {
        this.C = f10;
        int iD = i0.b.d(1.0f - this.C, org.telegram.ui.ActionBar.g6.w0(null, this.d, true), org.telegram.ui.ActionBar.g6.w0(null, this.f34187c, true));
        this.h.setColor(iD);
        if (this.f34190e && this.X && !this.Y) {
            oi0 oi0Var = org.telegram.ui.ActionBar.g6.f23352u1;
            oi0Var.W = true;
            oi0Var.O(iD, "Arrow1");
            org.telegram.ui.ActionBar.g6.f23352u1.O(iD, "Arrow2");
            org.telegram.ui.ActionBar.g6.f23352u1.m();
            org.telegram.ui.ActionBar.g6.C1 = true;
        }
    }

    public final void f(float f10) {
        if (this.J != f10) {
            this.J = f10;
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
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, this.f34185b, false);
        this.f34196k.setColor(-1);
        this.f34193g.setColor(-1);
        this.f34192f.setColor(i0.b.k(-1, 100));
        this.f34194i.setColor(iW0);
        this.f34197l.f33421b.setColor(iW0);
        this.h.setColor(org.telegram.ui.ActionBar.g6.w0(null, this.d, false));
    }
}
