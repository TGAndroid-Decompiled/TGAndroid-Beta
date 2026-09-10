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
public final class qk0 extends View {
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final RectF H;
    public final RectF I;
    public final RectF J;
    public int K;
    public byte[] L;
    public final Path M;
    public final d6 N;
    public final d6 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public final org.telegram.ui.ActionBar.f6 f26433a;
    public final Paint f26434b;
    public final Paint f26435c;
    public final Paint d;
    public final Paint e;
    public final pg0 f26436f;
    public final n6 h;
    public t71 f26437n;
    public float f26438r;
    public float f26439s;
    public float v;
    public boolean f26440w;
    public final kc0 f26441x;
    public final RectF f26442y;

    public qk0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f26434b = new Paint(1);
        this.f26435c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f26439s = 0.0f;
        this.v = 1.0f;
        this.f26440w = false;
        this.f26441x = new kc0(this, 18);
        this.f26442y = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new RectF();
        this.M = new Path();
        wr wrVar = wr.h;
        this.N = new d6(this, 0L, 340L, wrVar);
        this.O = new d6(this, 0L, 340L, wrVar);
        this.P = true;
        this.f26433a = f6Var;
        pg0 pg0Var = new pg0(12);
        this.f26436f = pg0Var;
        pg0Var.f26121f = this;
        pg0Var.setCallback(this);
        n6 n6Var = new n6(false, false, false, false);
        this.h = n6Var;
        n6Var.k(0.5f, 200L, wrVar);
        n6Var.setCallback(this);
        n6Var.t(AndroidUtilities.dp(12.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        Paint paint2;
        n6 n6Var;
        pg0 pg0Var;
        Paint paint3;
        int i10;
        int i11;
        byte b10;
        int i12;
        int i13;
        byte b11;
        float f7;
        float clamp;
        boolean z10;
        int i14 = org.telegram.ui.ActionBar.j6.f18064kf;
        org.telegram.ui.ActionBar.f6 f6Var = this.f26433a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
        Paint paint4 = this.f26434b;
        paint4.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18082lf, f6Var);
        Paint paint5 = this.f26435c;
        paint5.setColor(v03);
        int i15 = org.telegram.ui.ActionBar.j6.hf;
        int v04 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
        n6 n6Var2 = this.h;
        n6Var2.r(v04);
        int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17971ff, f6Var);
        pg0 pg0Var2 = this.f26436f;
        pg0Var2.f26118a.setColor(v05);
        int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17989gf, f6Var);
        Paint paint6 = this.d;
        paint6.setColor(v06);
        int v07 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
        Paint paint7 = this.e;
        paint7.setColor(v07);
        int lerp = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.f26439s));
        int lerp2 = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.v));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(27.0f);
        int i16 = this.K;
        Path path = this.M;
        if (i16 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            n6Var = n6Var2;
            pg0Var = pg0Var2;
            paint3 = paint7;
            i10 = lerp2;
        } else {
            int dp = measuredWidth / AndroidUtilities.dp(3.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            paint = paint5;
            int dp3 = AndroidUtilities.dp(12.0f);
            paint2 = paint4;
            n6Var = n6Var2;
            pg0Var = pg0Var2;
            byte b12 = Byte.MAX_VALUE;
            byte b13 = Byte.MIN_VALUE;
            int i17 = 0;
            while (i17 < dp) {
                Paint paint8 = paint7;
                byte[] bArr = this.L;
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
                byte[] bArr2 = this.L;
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
            this.K = measuredWidth;
        }
        canvas.save();
        Path path2 = this.G;
        path2.rewind();
        path2.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint9 = paint;
        canvas.drawRect(rectF.left, rectF.top, lerp - AndroidUtilities.dp(1.33f), rectF.bottom, paint9);
        canvas.drawRect(AndroidUtilities.dp(1.33f) + i10, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
        int i19 = org.telegram.ui.ActionBar.j6.f17989gf;
        paint6.setColor(org.telegram.ui.ActionBar.j6.l1(0.3f, org.telegram.ui.ActionBar.j6.v0(i19, f6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f10 = lerp;
        float f11 = i10;
        canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint2);
        if (this.U) {
            clamp = this.V;
        } else {
            t71 t71Var = this.f26437n;
            if (t71Var != null) {
                f7 = ((float) t71Var.n()) / ((float) this.f26437n.p());
            } else {
                f7 = 1.0f;
            }
            clamp = Utilities.clamp(f7, this.v, this.f26439s);
        }
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(13.0f), rectF.right - AndroidUtilities.dp(14.0f), clamp), f11, f10);
        if (clamp2 < f11) {
            canvas.save();
            canvas.clipRect(clamp2, rectF.top, f11, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (this.f26440w && clamp < this.f26439s && !this.U) {
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hf, f6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(i19, f6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (clamp2 > f10) {
            canvas.save();
            canvas.clipRect(f10, rectF.top, clamp2, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (!b() && !this.f26440w && !this.U) {
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(i19, f6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hf, f6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float centerY = rectF.centerY() + AndroidUtilities.dp(5.33f);
        RectF rectF3 = this.F;
        rectF3.set(lerp - AndroidUtilities.dp(7.0f), rectF.centerY() - AndroidUtilities.dp(5.33f), lerp - AndroidUtilities.dp(5.33f), centerY);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(AndroidUtilities.dp(5.33f) + i10, rectF.centerY() - AndroidUtilities.dp(5.33f), AndroidUtilities.dp(7.0f) + i10, rectF.centerY() + AndroidUtilities.dp(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.I.set(lerp - AndroidUtilities.dp(24.0f), 0.0f, AndroidUtilities.dp(6.0f) + lerp, getHeight());
        this.J.set(i10 - AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(24.0f) + i10, getHeight());
        float e = this.O.e(!this.U);
        if (e > 0.0f) {
            float d = (int) (n6Var.d() + AndroidUtilities.dp(30.0f));
            if (d <= (i10 - lerp) - AndroidUtilities.dp(8.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = this.N.e(z10);
            float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), d, e7);
            float f12 = lerp + i10;
            float dp5 = AndroidUtilities.dp(20.0f) / 2.0f;
            float centerY2 = rectF.centerY() + dp5;
            RectF rectF4 = this.E;
            rectF4.set((f12 - lerp4) / 2.0f, rectF.centerY() - dp5, (f12 + lerp4) / 2.0f, centerY2);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * e));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.H;
            rectF5.set(rectF4);
            rectF5.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas.save();
            int dp6 = AndroidUtilities.dp(12.0f);
            canvas.translate(AndroidUtilities.lerp(rectF4.centerX() - (dp6 / 2.0f), rectF4.left + AndroidUtilities.dp(6.0f), e7), rectF4.centerY());
            pg0 pg0Var3 = pg0Var;
            pg0Var3.setBounds(0, (-dp6) / 2, dp6, dp6 / 2);
            pg0Var3.f26122g = (int) (e * 255.0f);
            pg0Var3.draw(canvas);
            canvas.restore();
            if (e7 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + AndroidUtilities.dp(21.66f), rectF4.centerY() - AndroidUtilities.dp(1.0f));
                n6 n6Var3 = n6Var;
                n6Var3.setBounds(-1, -1, 1, 1);
                n6Var3.f25442w = (int) (e7 * 255.0f * e);
                n6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        t71 t71Var = this.f26437n;
        if (t71Var != null && t71Var.y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.P) {
            a(canvas, this.f26442y);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean contains = this.H.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF = this.I;
        if (!contains && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF2 = this.J;
        if (!contains && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!contains && !z10 && !z11 && motionEvent.getX() > rectF.right && motionEvent.getX() < rectF2.left) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f7 = 1.0f;
        if (motionEvent.getAction() == 0) {
            this.T = contains;
            this.R = z10;
            this.S = z11;
            if (z10 || z11) {
                b();
                setPlaying(false);
            }
            this.U = z12;
            if (z12) {
                b();
                t71 t71Var = this.f26437n;
                if (t71Var != null) {
                    f7 = ((float) t71Var.n()) / ((float) this.f26437n.p());
                }
                this.V = f7;
                setPlaying(false);
            }
            if (getParent() != null && (this.T || this.R || this.S || this.U)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z13 = this.R;
            RectF rectF3 = this.f26442y;
            if (z13) {
                this.f26439s = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), Utilities.clamp01(this.v - Math.max(1.0f / this.f26438r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f)))), 0.0f);
                invalidate();
            } else if (this.S) {
                this.v = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), 1.0f, Utilities.clamp01(Math.max(1.0f / this.f26438r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f))) + this.f26439s));
                invalidate();
            } else if (this.U) {
                t71 t71Var2 = this.f26437n;
                if (t71Var2 != null) {
                    float clamp = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), this.v, this.f26439s);
                    this.V = clamp;
                    t71Var2.L(clamp * ((float) this.f26437n.p()), false);
                }
                invalidate();
            }
            this.h.q(AndroidUtilities.formatDuration(Math.round(Math.max(1.0f, (this.v - this.f26439s) * this.f26438r)), false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.T) {
                setPlaying(!b());
            } else if (this.R && this.f26440w) {
                t71 t71Var3 = this.f26437n;
                if (t71Var3 != null) {
                    t71Var3.L(this.f26439s * ((float) t71Var3.p()), false);
                }
                setPlaying(true);
            } else if (this.S && this.f26440w) {
                t71 t71Var4 = this.f26437n;
                if (t71Var4 != null) {
                    t71Var4.L(Math.max(this.f26439s * ((float) t71Var4.p()), (this.v * ((float) this.f26437n.p())) - 1500), false);
                }
                setPlaying(true);
            } else if (this.U && !b()) {
                setPlaying(true);
            }
            this.T = false;
            this.R = false;
            this.S = false;
            this.U = false;
        }
        if (this.T || this.R || this.S || this.U || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public float getAudioLeft() {
        return this.f26439s;
    }

    public long getAudioLeftMs() {
        return this.f26439s * ((float) getDuration());
    }

    public float getAudioRight() {
        return this.v;
    }

    public long getAudioRightMs() {
        return this.v * ((float) getDuration());
    }

    public long getDuration() {
        t71 t71Var = this.f26437n;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.p();
    }

    public double getNewDuration() {
        return ((this.v - this.f26439s) * ((float) getDuration())) / 1000.0d;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(32.0f);
        this.f26442y.set(0.0f, (getHeight() - dp) / 2.0f, getWidth(), (getHeight() + dp) / 2.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(32.0f);
        this.f26442y.set(0.0f, (getMeasuredHeight() - dp) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + dp) / 2.0f);
    }

    public void setAllowDraw(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            invalidate();
        }
    }

    public void setPlaying(boolean z10) {
        if (this.Q) {
            z10 = false;
        }
        t71 t71Var = this.f26437n;
        if (t71Var != null) {
            float n10 = ((float) t71Var.n()) / ((float) this.f26437n.p());
            float f7 = this.f26439s;
            if (n10 < f7 || n10 > this.v) {
                t71 t71Var2 = this.f26437n;
                t71Var2.L(f7 * ((float) t71Var2.p()), false);
            }
            this.f26437n.P(z10);
        }
        this.f26436f.a(z10, true);
        kc0 kc0Var = this.f26441x;
        AndroidUtilities.cancelRunOnUIThread(kc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(kc0Var, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && this.f26436f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
