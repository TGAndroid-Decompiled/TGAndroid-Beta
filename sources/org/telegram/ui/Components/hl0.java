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
public final class hl0 extends View {
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final RectF H;
    public final RectF I;
    public final RectF J;
    public int K;
    public byte[] L;
    public final Path M;
    public final g6 N;
    public final g6 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public final org.telegram.ui.ActionBar.c6 f25700a;
    public final Paint f25701b;
    public final Paint f25702c;
    public final Paint d;
    public final Paint e;
    public final gh0 f25703f;
    public final r6 h;
    public h81 f25704n;
    public float f25705r;
    public float f25706s;
    public float v;
    public boolean f25707w;
    public final yc0 f25708x;
    public final RectF f25709y;

    public hl0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25701b = new Paint(1);
        this.f25702c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f25706s = 0.0f;
        this.v = 1.0f;
        this.f25707w = false;
        this.f25708x = new yc0(this, 19);
        this.f25709y = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new RectF();
        this.M = new Path();
        es esVar = es.h;
        this.N = new g6(this, 0L, 340L, esVar);
        this.O = new g6(this, 0L, 340L, esVar);
        this.P = true;
        this.f25700a = c6Var;
        gh0 gh0Var = new gh0(12);
        this.f25703f = gh0Var;
        gh0Var.f25282f = this;
        gh0Var.setCallback(this);
        r6 r6Var = new r6(false, false, false);
        this.h = r6Var;
        r6Var.n(0.5f, 200L, esVar);
        r6Var.setCallback(this);
        r6Var.w(AndroidUtilities.dp(12.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.M = AndroidUtilities.displaySize.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        Paint paint2;
        r6 r6Var;
        gh0 gh0Var;
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
        int i14 = org.telegram.ui.ActionBar.g6.kf;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25700a;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i14, c6Var);
        Paint paint4 = this.f25701b;
        paint4.setColor(w02);
        int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20054lf, c6Var);
        Paint paint5 = this.f25702c;
        paint5.setColor(w03);
        int i15 = org.telegram.ui.ActionBar.g6.f19979hf;
        int w04 = org.telegram.ui.ActionBar.g6.w0(i15, c6Var);
        r6 r6Var2 = this.h;
        r6Var2.u(w04);
        int w05 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19944ff, c6Var);
        gh0 gh0Var2 = this.f25703f;
        gh0Var2.f25279a.setColor(w05);
        int w06 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19963gf, c6Var);
        Paint paint6 = this.d;
        paint6.setColor(w06);
        int w07 = org.telegram.ui.ActionBar.g6.w0(i15, c6Var);
        Paint paint7 = this.e;
        paint7.setColor(w07);
        int lerp = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.f25706s));
        int lerp2 = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.v));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(27.0f);
        int i16 = this.K;
        Path path = this.M;
        if (i16 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            r6Var = r6Var2;
            gh0Var = gh0Var2;
            paint3 = paint7;
            i10 = lerp2;
        } else {
            int dp = measuredWidth / AndroidUtilities.dp(3.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            paint = paint5;
            int dp3 = AndroidUtilities.dp(12.0f);
            paint2 = paint4;
            byte b12 = Byte.MAX_VALUE;
            r6Var = r6Var2;
            byte b13 = Byte.MIN_VALUE;
            gh0Var = gh0Var2;
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
        int i19 = org.telegram.ui.ActionBar.g6.f19963gf;
        paint6.setColor(org.telegram.ui.ActionBar.g6.m1(0.3f, org.telegram.ui.ActionBar.g6.w0(i19, c6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f10 = lerp;
        float f11 = i10;
        canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint2);
        if (this.U) {
            clamp = this.V;
        } else {
            h81 h81Var = this.f25704n;
            if (h81Var != null) {
                f7 = ((float) h81Var.n()) / ((float) this.f25704n.p());
            } else {
                f7 = 1.0f;
            }
            clamp = Utilities.clamp(f7, this.v, this.f25706s);
        }
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(13.0f), rectF.right - AndroidUtilities.dp(14.0f), clamp), f11, f10);
        if (clamp2 < f11) {
            canvas.save();
            canvas.clipRect(clamp2, rectF.top, f11, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (this.f25707w && clamp < this.f25706s && !this.U) {
                paint6.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19979hf, c6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.g6.w0(i19, c6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (clamp2 > f10) {
            canvas.save();
            canvas.clipRect(f10, rectF.top, clamp2, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (!b() && !this.f25707w && !this.U) {
                paint6.setColor(org.telegram.ui.ActionBar.g6.w0(i19, c6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19979hf, c6Var));
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
            float c10 = (int) (r6Var.c() + AndroidUtilities.dp(30.0f));
            if (c10 <= (i10 - lerp) - AndroidUtilities.dp(8.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = this.N.e(z10);
            float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), c10, e7);
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
            gh0 gh0Var3 = gh0Var;
            gh0Var3.setBounds(0, (-dp6) / 2, dp6, dp6 / 2);
            gh0Var3.f25283g = (int) (e * 255.0f);
            gh0Var3.draw(canvas);
            canvas.restore();
            if (e7 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + AndroidUtilities.dp(21.66f), rectF4.centerY() - AndroidUtilities.dp(1.0f));
                r6 r6Var3 = r6Var;
                r6Var3.setBounds(-1, -1, 1, 1);
                r6Var3.B = (int) (e7 * 255.0f * e);
                r6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        h81 h81Var = this.f25704n;
        if (h81Var != null && h81Var.y()) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.P) {
            a(canvas, this.f25709y);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        float clamp;
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
                h81 h81Var = this.f25704n;
                if (h81Var != null) {
                    f7 = ((float) h81Var.n()) / ((float) this.f25704n.p());
                }
                this.V = f7;
                setPlaying(false);
            }
            if (getParent() != null && (this.T || this.R || this.S || this.U)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z13 = this.R;
            RectF rectF3 = this.f25709y;
            if (z13) {
                this.f25706s = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), Utilities.clamp01(this.v - Math.max(1.0f / this.f25705r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f)))), 0.0f);
                invalidate();
            } else if (this.S) {
                this.v = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), 1.0f, Utilities.clamp01(Math.max(1.0f / this.f25705r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f))) + this.f25706s));
                invalidate();
            } else if (this.U) {
                h81 h81Var2 = this.f25704n;
                if (h81Var2 != null) {
                    this.V = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), this.v, this.f25706s);
                    h81Var2.L(clamp * ((float) this.f25704n.p()), false);
                }
                invalidate();
            }
            this.h.t(AndroidUtilities.formatDuration(Math.round(Math.max(1.0f, (this.v - this.f25706s) * this.f25705r)), false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.T) {
                setPlaying(!b());
            } else if (this.R && this.f25707w) {
                h81 h81Var3 = this.f25704n;
                if (h81Var3 != null) {
                    h81Var3.L(this.f25706s * ((float) h81Var3.p()), false);
                }
                setPlaying(true);
            } else if (this.S && this.f25707w) {
                h81 h81Var4 = this.f25704n;
                if (h81Var4 != null) {
                    h81Var4.L(Math.max(this.f25706s * ((float) h81Var4.p()), (this.v * ((float) this.f25704n.p())) - 1500), false);
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
        return this.f25706s;
    }

    public long getAudioLeftMs() {
        return this.f25706s * ((float) getDuration());
    }

    public float getAudioRight() {
        return this.v;
    }

    public long getAudioRightMs() {
        return this.v * ((float) getDuration());
    }

    public long getDuration() {
        h81 h81Var = this.f25704n;
        if (h81Var == null) {
            return 0L;
        }
        return h81Var.p();
    }

    public double getNewDuration() {
        return ((this.v - this.f25706s) * ((float) getDuration())) / 1000.0d;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(32.0f);
        this.f25709y.set(0.0f, (getHeight() - dp) / 2.0f, getWidth(), (getHeight() + dp) / 2.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(32.0f);
        this.f25709y.set(0.0f, (getMeasuredHeight() - dp) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + dp) / 2.0f);
    }

    public void setAllowDraw(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            invalidate();
        }
    }

    public void setPlaying(boolean z10) {
        float f7;
        h81 h81Var;
        if (this.Q) {
            z10 = false;
        }
        h81 h81Var2 = this.f25704n;
        if (h81Var2 != null) {
            float n10 = ((float) h81Var2.n()) / ((float) this.f25704n.p());
            if (n10 < this.f25706s || n10 > this.v) {
                this.f25704n.L(f7 * ((float) h81Var.p()), false);
            }
            this.f25704n.P(z10);
        }
        this.f25703f.a(z10, true);
        yc0 yc0Var = this.f25708x;
        AndroidUtilities.cancelRunOnUIThread(yc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(yc0Var, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && this.f25703f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
