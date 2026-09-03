package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rk0 extends View {
    public final RectF B;
    public final RectF C;
    public final Path D;
    public final RectF E;
    public final RectF F;
    public final RectF G;
    public int H;
    public byte[] I;
    public final Path J;
    public final z5 K;
    public final z5 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final org.telegram.ui.ActionBar.g6 f30795a;
    public final Paint f30796b;
    public final Paint f30797c;
    public final Paint d;
    public final Paint f30798e;
    public final og0 f30799f;
    public final j6 h;
    public j71 f30800n;
    public float f30801r;
    public float f30802s;
    public float v;
    public boolean f30803w;
    public final ec0 f30804x;
    public final RectF f30805y;

    public rk0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30796b = new Paint(1);
        this.f30797c = new Paint(1);
        this.d = new Paint(1);
        this.f30798e = new Paint(1);
        this.f30802s = 0.0f;
        this.v = 1.0f;
        this.f30803w = false;
        this.f30804x = new ec0(this, 18);
        this.f30805y = new RectF();
        this.B = new RectF();
        this.C = new RectF();
        this.D = new Path();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.J = new Path();
        pr prVar = pr.h;
        this.K = new z5(this, 0L, 340L, prVar);
        this.L = new z5(this, 0L, 340L, prVar);
        this.M = true;
        this.f30795a = g6Var;
        og0 og0Var = new og0(12);
        this.f30799f = og0Var;
        og0Var.f29757f = this;
        og0Var.setCallback(this);
        j6 j6Var = new j6(false, false, false, false);
        this.h = j6Var;
        j6Var.k(0.5f, 200L, prVar);
        j6Var.setCallback(this);
        j6Var.t(AndroidUtilities.dp(12.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        Paint paint2;
        j6 j6Var;
        og0 og0Var;
        Paint paint3;
        int i10;
        int i11;
        byte b10;
        int i12;
        int i13;
        byte b11;
        float f10;
        float clamp;
        boolean z4;
        int i14 = org.telegram.ui.ActionBar.k6.f21796kf;
        org.telegram.ui.ActionBar.g6 g6Var = this.f30795a;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i14, g6Var);
        Paint paint4 = this.f30796b;
        paint4.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21814lf, g6Var);
        Paint paint5 = this.f30797c;
        paint5.setColor(v03);
        int i15 = org.telegram.ui.ActionBar.k6.f21742hf;
        int v04 = org.telegram.ui.ActionBar.k6.v0(i15, g6Var);
        j6 j6Var2 = this.h;
        j6Var2.r(v04);
        int v05 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21706ff, g6Var);
        og0 og0Var2 = this.f30799f;
        og0Var2.f29753a.setColor(v05);
        int v06 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21725gf, g6Var);
        Paint paint6 = this.d;
        paint6.setColor(v06);
        int v07 = org.telegram.ui.ActionBar.k6.v0(i15, g6Var);
        Paint paint7 = this.f30798e;
        paint7.setColor(v07);
        int lerp = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.f30802s));
        int lerp2 = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.v));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(27.0f);
        int i16 = this.H;
        Path path = this.J;
        if (i16 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            j6Var = j6Var2;
            og0Var = og0Var2;
            paint3 = paint7;
            i10 = lerp2;
        } else {
            int dp = measuredWidth / AndroidUtilities.dp(3.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            paint = paint5;
            int dp3 = AndroidUtilities.dp(12.0f);
            paint2 = paint4;
            j6Var = j6Var2;
            og0Var = og0Var2;
            byte b12 = Byte.MAX_VALUE;
            byte b13 = Byte.MIN_VALUE;
            int i17 = 0;
            while (i17 < dp) {
                Paint paint8 = paint7;
                byte[] bArr = this.I;
                if (bArr == null) {
                    i13 = i17;
                    i12 = lerp2;
                    b11 = 0;
                } else {
                    i12 = lerp2;
                    i13 = i17;
                    b11 = bArr[(int) ((i17 / dp) * bArr.length)];
                }
                b12 = (byte) Math.min((int) b12, (int) b11);
                b13 = (byte) Math.max((int) b13, (int) b11);
                i17 = i13 + 1;
                paint7 = paint8;
                lerp2 = i12;
            }
            paint3 = paint7;
            i10 = lerp2;
            path.rewind();
            int i18 = 0;
            while (i18 < dp) {
                byte[] bArr2 = this.I;
                if (bArr2 == null) {
                    i11 = i18;
                    b10 = 0;
                } else {
                    i11 = i18;
                    b10 = bArr2[(int) ((i18 / dp) * bArr2.length)];
                }
                float lerp3 = AndroidUtilities.lerp(dp2, dp3, Utilities.clamp01(AndroidUtilities.ilerp((int) b10, (int) b12, (int) b13)));
                float dp4 = AndroidUtilities.dp(3.0f) * i11;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(dp4, (-lerp3) / 2.0f, AndroidUtilities.dp(2.0f) + dp4, lerp3 / 2.0f);
                path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                i18 = i11 + 1;
                dp = dp;
                dp2 = dp2;
            }
            this.H = measuredWidth;
        }
        canvas.save();
        Path path2 = this.D;
        path2.rewind();
        path2.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint9 = paint;
        canvas.drawRect(rectF.left, rectF.top, lerp - AndroidUtilities.dp(1.33f), rectF.bottom, paint9);
        canvas.drawRect(AndroidUtilities.dp(1.33f) + i10, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
        int i19 = org.telegram.ui.ActionBar.k6.f21725gf;
        paint6.setColor(org.telegram.ui.ActionBar.k6.l1(0.3f, org.telegram.ui.ActionBar.k6.v0(i19, g6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f11 = lerp;
        float f12 = i10;
        canvas.drawRect(f11, rectF.top, f12, rectF.bottom, paint2);
        if (this.R) {
            clamp = this.S;
        } else {
            j71 j71Var = this.f30800n;
            if (j71Var != null) {
                f10 = ((float) j71Var.n()) / ((float) this.f30800n.p());
            } else {
                f10 = 1.0f;
            }
            clamp = Utilities.clamp(f10, this.v, this.f30802s);
        }
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(13.0f), rectF.right - AndroidUtilities.dp(14.0f), clamp), f12, f11);
        if (clamp2 < f12) {
            canvas.save();
            canvas.clipRect(clamp2, rectF.top, f12, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (this.f30803w && clamp < this.f30802s && !this.R) {
                paint6.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21742hf, g6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.k6.v0(i19, g6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (clamp2 > f11) {
            canvas.save();
            canvas.clipRect(f11, rectF.top, clamp2, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (!b() && !this.f30803w && !this.R) {
                paint6.setColor(org.telegram.ui.ActionBar.k6.v0(i19, g6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21742hf, g6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float centerY = rectF.centerY() + AndroidUtilities.dp(5.33f);
        RectF rectF3 = this.C;
        rectF3.set(lerp - AndroidUtilities.dp(7.0f), rectF.centerY() - AndroidUtilities.dp(5.33f), lerp - AndroidUtilities.dp(5.33f), centerY);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(AndroidUtilities.dp(5.33f) + i10, rectF.centerY() - AndroidUtilities.dp(5.33f), AndroidUtilities.dp(7.0f) + i10, rectF.centerY() + AndroidUtilities.dp(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.F.set(lerp - AndroidUtilities.dp(24.0f), 0.0f, AndroidUtilities.dp(6.0f) + lerp, getHeight());
        this.G.set(i10 - AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(24.0f) + i10, getHeight());
        float e6 = this.L.e(!this.R);
        if (e6 > 0.0f) {
            float d = (int) (j6Var.d() + AndroidUtilities.dp(30.0f));
            if (d <= (i10 - lerp) - AndroidUtilities.dp(8.0f)) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e10 = this.K.e(z4);
            float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), d, e10);
            float f13 = lerp + i10;
            float dp5 = AndroidUtilities.dp(20.0f) / 2.0f;
            float centerY2 = rectF.centerY() + dp5;
            RectF rectF4 = this.B;
            rectF4.set((f13 - lerp4) / 2.0f, rectF.centerY() - dp5, (f13 + lerp4) / 2.0f, centerY2);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * e6));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.E;
            rectF5.set(rectF4);
            rectF5.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas.save();
            int dp6 = AndroidUtilities.dp(12.0f);
            canvas.translate(AndroidUtilities.lerp(rectF4.centerX() - (dp6 / 2.0f), rectF4.left + AndroidUtilities.dp(6.0f), e10), rectF4.centerY());
            og0 og0Var3 = og0Var;
            og0Var3.setBounds(0, (-dp6) / 2, dp6, dp6 / 2);
            og0Var3.f29758g = (int) (e6 * 255.0f);
            og0Var3.draw(canvas);
            canvas.restore();
            if (e10 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + AndroidUtilities.dp(21.66f), rectF4.centerY() - AndroidUtilities.dp(1.0f));
                j6 j6Var3 = j6Var;
                j6Var3.setBounds(-1, -1, 1, 1);
                j6Var3.f28017w = (int) (e10 * 255.0f * e6);
                j6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        j71 j71Var = this.f30800n;
        if (j71Var != null && j71Var.y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.M) {
            a(canvas, this.f30805y);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean contains = this.E.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF = this.F;
        if (!contains && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            z4 = true;
        } else {
            z4 = false;
        }
        RectF rectF2 = this.G;
        if (!contains && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!contains && !z4 && !z10 && motionEvent.getX() > rectF.right && motionEvent.getX() < rectF2.left) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f10 = 1.0f;
        if (motionEvent.getAction() == 0) {
            this.Q = contains;
            this.O = z4;
            this.P = z10;
            if (z4 || z10) {
                b();
                setPlaying(false);
            }
            this.R = z11;
            if (z11) {
                b();
                j71 j71Var = this.f30800n;
                if (j71Var != null) {
                    f10 = ((float) j71Var.n()) / ((float) this.f30800n.p());
                }
                this.S = f10;
                setPlaying(false);
            }
            if (getParent() != null && (this.Q || this.O || this.P || this.R)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z12 = this.O;
            RectF rectF3 = this.f30805y;
            if (z12) {
                this.f30802s = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), Utilities.clamp01(this.v - Math.max(1.0f / this.f30801r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f)))), 0.0f);
                invalidate();
            } else if (this.P) {
                this.v = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), 1.0f, Utilities.clamp01(Math.max(1.0f / this.f30801r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f))) + this.f30802s));
                invalidate();
            } else if (this.R) {
                j71 j71Var2 = this.f30800n;
                if (j71Var2 != null) {
                    float clamp = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), this.v, this.f30802s);
                    this.S = clamp;
                    j71Var2.L(clamp * ((float) this.f30800n.p()), false);
                }
                invalidate();
            }
            this.h.q(AndroidUtilities.formatDuration(Math.round(Math.max(1.0f, (this.v - this.f30802s) * this.f30801r)), false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.Q) {
                setPlaying(!b());
            } else if (this.O && this.f30803w) {
                j71 j71Var3 = this.f30800n;
                if (j71Var3 != null) {
                    j71Var3.L(this.f30802s * ((float) j71Var3.p()), false);
                }
                setPlaying(true);
            } else if (this.P && this.f30803w) {
                j71 j71Var4 = this.f30800n;
                if (j71Var4 != null) {
                    j71Var4.L(Math.max(this.f30802s * ((float) j71Var4.p()), (this.v * ((float) this.f30800n.p())) - 1500), false);
                }
                setPlaying(true);
            } else if (this.R && !b()) {
                setPlaying(true);
            }
            this.Q = false;
            this.O = false;
            this.P = false;
            this.R = false;
        }
        if (this.Q || this.O || this.P || this.R || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public float getAudioLeft() {
        return this.f30802s;
    }

    public long getAudioLeftMs() {
        return this.f30802s * ((float) getDuration());
    }

    public float getAudioRight() {
        return this.v;
    }

    public long getAudioRightMs() {
        return this.v * ((float) getDuration());
    }

    public long getDuration() {
        j71 j71Var = this.f30800n;
        if (j71Var == null) {
            return 0L;
        }
        return j71Var.p();
    }

    public double getNewDuration() {
        return ((this.v - this.f30802s) * ((float) getDuration())) / 1000.0d;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(32.0f);
        this.f30805y.set(0.0f, (getHeight() - dp) / 2.0f, getWidth(), (getHeight() + dp) / 2.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(32.0f);
        this.f30805y.set(0.0f, (getMeasuredHeight() - dp) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + dp) / 2.0f);
    }

    public void setAllowDraw(boolean z4) {
        if (this.M != z4) {
            this.M = z4;
            invalidate();
        }
    }

    public void setPlaying(boolean z4) {
        if (this.N) {
            z4 = false;
        }
        j71 j71Var = this.f30800n;
        if (j71Var != null) {
            float n10 = ((float) j71Var.n()) / ((float) this.f30800n.p());
            float f10 = this.f30802s;
            if (n10 < f10 || n10 > this.v) {
                j71 j71Var2 = this.f30800n;
                j71Var2.L(f10 * ((float) j71Var2.p()), false);
            }
            this.f30800n.P(z4);
        }
        this.f30799f.a(z4, true);
        ec0 ec0Var = this.f30804x;
        AndroidUtilities.cancelRunOnUIThread(ec0Var);
        if (z4) {
            AndroidUtilities.runOnUIThread(ec0Var, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && this.f30799f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
