package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class ji0 extends View {
    public final RectF D;
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final RectF H;
    public final RectF I;
    public final RectF J;
    public int K;
    public byte[] L;
    public final Path M;
    public final w5 N;
    public final w5 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public final org.telegram.ui.ActionBar.f6 f34937a;
    public final Paint f34938b;
    public final Paint f34939c;
    public final Paint d;
    public final Paint f34940e;
    public final he0 f34941f;
    public final i6 h;
    public s51 f34942n;
    public float f34943r;
    public float f34944s;
    public float f34945w;
    public boolean f34946x;
    public final ob0 f34947y;

    public ji0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f34938b = new Paint(1);
        this.f34939c = new Paint(1);
        this.d = new Paint(1);
        this.f34940e = new Paint(1);
        this.f34944s = 0.0f;
        this.f34945w = 1.0f;
        this.f34946x = false;
        this.f34947y = new ob0(this, 13);
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new RectF();
        this.M = new Path();
        xq xqVar = xq.h;
        this.N = new w5(this, 0L, 340L, xqVar);
        this.O = new w5(this, 0L, 340L, xqVar);
        this.P = true;
        this.f34937a = f6Var;
        he0 he0Var = new he0(12);
        this.f34941f = he0Var;
        he0Var.f34261f = this;
        he0Var.setCallback(this);
        i6 i6Var = new i6(false, false, false);
        this.h = i6Var;
        i6Var.n(0.5f, 200L, xqVar);
        i6Var.setCallback(this);
        i6Var.w(org.telegram.messenger.g0.L(12.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.M = org.telegram.messenger.g0.f22537q.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        Paint paint2;
        i6 i6Var;
        he0 he0Var;
        Paint paint3;
        int i7;
        byte b10;
        byte b11;
        int i10;
        int i11;
        byte b12;
        float f10;
        float i12;
        boolean z9;
        int i13 = org.telegram.ui.ActionBar.k6.Yf;
        org.telegram.ui.ActionBar.f6 f6Var = this.f34937a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, f6Var);
        Paint paint4 = this.f34938b;
        paint4.setColor(w02);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Zf, f6Var);
        Paint paint5 = this.f34939c;
        paint5.setColor(w03);
        int i14 = org.telegram.ui.ActionBar.k6.Wf;
        int w04 = org.telegram.ui.ActionBar.k6.w0(i14, f6Var);
        i6 i6Var2 = this.h;
        i6Var2.u(w04);
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uf, f6Var);
        he0 he0Var2 = this.f34941f;
        he0Var2.f34257a.setColor(w05);
        int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vf, f6Var);
        Paint paint6 = this.d;
        paint6.setColor(w06);
        int w07 = org.telegram.ui.ActionBar.k6.w0(i14, f6Var);
        Paint paint7 = this.f34940e;
        paint7.setColor(w07);
        int T1 = (int) org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(11.33f), rectF.right - org.telegram.messenger.g0.L(11.33f), Utilities.l(this.f34944s));
        int T12 = (int) org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(11.33f), rectF.right - org.telegram.messenger.g0.L(11.33f), Utilities.l(this.f34945w));
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(27.0f);
        int i15 = this.K;
        Path path = this.M;
        if (i15 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            i6Var = i6Var2;
            he0Var = he0Var2;
            paint3 = paint7;
            i7 = T12;
        } else {
            int L = measuredWidth / org.telegram.messenger.g0.L(3.0f);
            int L2 = org.telegram.messenger.g0.L(2.0f);
            paint = paint5;
            int L3 = org.telegram.messenger.g0.L(12.0f);
            paint2 = paint4;
            byte b13 = Byte.MAX_VALUE;
            i6Var = i6Var2;
            byte b14 = Byte.MIN_VALUE;
            he0Var = he0Var2;
            int i16 = 0;
            while (i16 < L) {
                Paint paint8 = paint7;
                byte[] bArr = this.L;
                if (bArr == null) {
                    i11 = i16;
                    i10 = T12;
                    b12 = 0;
                } else {
                    i10 = T12;
                    i11 = i16;
                    b12 = bArr[(int) ((i16 / L) * bArr.length)];
                }
                b13 = (byte) Math.min((int) b13, (int) b12);
                b14 = (byte) Math.max((int) b14, (int) b12);
                i16 = i11 + 1;
                paint7 = paint8;
                T12 = i10;
            }
            paint3 = paint7;
            i7 = T12;
            path.rewind();
            int i17 = 0;
            while (i17 < L) {
                byte[] bArr2 = this.L;
                if (bArr2 == null) {
                    b10 = b13;
                    b11 = 0;
                } else {
                    b10 = b13;
                    b11 = bArr2[(int) ((i17 / L) * bArr2.length)];
                }
                float W1 = org.telegram.messenger.g0.W1(Utilities.l((b11 - b10) / (b14 - b10)), L2, L3);
                float L4 = org.telegram.messenger.g0.L(3.0f) * i17;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(L4, (-W1) / 2.0f, org.telegram.messenger.g0.L(2.0f) + L4, W1 / 2.0f);
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), Path.Direction.CW);
                i17++;
                b13 = b10;
                L = L;
                L2 = L2;
            }
            this.K = measuredWidth;
        }
        canvas.save();
        Path path2 = this.G;
        path2.rewind();
        path2.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint9 = paint;
        canvas.drawRect(rectF.left, rectF.top, T1 - org.telegram.messenger.g0.L(1.33f), rectF.bottom, paint9);
        canvas.drawRect(org.telegram.messenger.g0.L(1.33f) + i7, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
        int i18 = org.telegram.ui.ActionBar.k6.Vf;
        paint6.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.w0(i18, f6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f11 = T1;
        float f12 = i7;
        canvas.drawRect(f11, rectF.top, f12, rectF.bottom, paint2);
        if (this.U) {
            i12 = this.V;
        } else {
            s51 s51Var = this.f34942n;
            if (s51Var != null) {
                f10 = ((float) s51Var.S()) / ((float) this.f34942n.U());
            } else {
                f10 = 1.0f;
            }
            i12 = Utilities.i(f10, this.f34945w, this.f34944s);
        }
        float i19 = Utilities.i(org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.right - org.telegram.messenger.g0.L(14.0f), i12), f12, f11);
        if (i19 < f12) {
            canvas.save();
            canvas.clipRect(i19, rectF.top, f12, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
            if (this.f34946x && i12 < this.f34944s && !this.U) {
                paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wf, f6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.k6.w0(i18, f6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (i19 > f11) {
            canvas.save();
            canvas.clipRect(f11, rectF.top, i19, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
            if (!b() && !this.f34946x && !this.U) {
                paint6.setColor(org.telegram.ui.ActionBar.k6.w0(i18, f6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wf, f6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float centerY = rectF.centerY() + org.telegram.messenger.g0.L(5.33f);
        RectF rectF3 = this.F;
        rectF3.set(T1 - org.telegram.messenger.g0.L(7.0f), rectF.centerY() - org.telegram.messenger.g0.L(5.33f), T1 - org.telegram.messenger.g0.L(5.33f), centerY);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(org.telegram.messenger.g0.L(5.33f) + i7, rectF.centerY() - org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(7.0f) + i7, rectF.centerY() + org.telegram.messenger.g0.L(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.I.set(T1 - org.telegram.messenger.g0.L(24.0f), 0.0f, org.telegram.messenger.g0.L(6.0f) + T1, getHeight());
        this.J.set(i7 - org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(24.0f) + i7, getHeight());
        float d = this.O.d(!this.U);
        if (d > 0.0f) {
            float c10 = (int) (i6Var.c() + org.telegram.messenger.g0.L(30.0f));
            if (c10 <= (i7 - T1) - org.telegram.messenger.g0.L(8.0f)) {
                z9 = true;
            } else {
                z9 = false;
            }
            float d2 = this.N.d(z9);
            float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(24.0f), c10, d2);
            float f13 = T1 + i7;
            float L5 = org.telegram.messenger.g0.L(20.0f) / 2.0f;
            float centerY2 = rectF.centerY() + L5;
            RectF rectF4 = this.E;
            rectF4.set((f13 - T13) / 2.0f, rectF.centerY() - L5, (f13 + T13) / 2.0f, centerY2);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * d));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.H;
            rectF5.set(rectF4);
            rectF5.inset(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            int L6 = org.telegram.messenger.g0.L(12.0f);
            canvas.translate(org.telegram.messenger.g0.T1(rectF4.centerX() - (L6 / 2.0f), rectF4.left + org.telegram.messenger.g0.L(6.0f), d2), rectF4.centerY());
            he0 he0Var3 = he0Var;
            he0Var3.setBounds(0, (-L6) / 2, L6, L6 / 2);
            he0Var3.f34262g = (int) (d * 255.0f);
            he0Var3.draw(canvas);
            canvas.restore();
            if (d2 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + org.telegram.messenger.g0.L(21.66f), rectF4.centerY() - org.telegram.messenger.g0.L(1.0f));
                i6 i6Var3 = i6Var;
                i6Var3.setBounds(-1, -1, 1, 1);
                i6Var3.B = (int) (d2 * 255.0f * d);
                i6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        s51 s51Var = this.f34942n;
        if (s51Var != null && s51Var.d0()) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.P) {
            a(canvas, this.D);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        float i7;
        boolean contains = this.H.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF = this.I;
        if (!contains && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            z9 = true;
        } else {
            z9 = false;
        }
        RectF rectF2 = this.J;
        if (!contains && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!contains && !z9 && !z10 && motionEvent.getX() > rectF.right && motionEvent.getX() < rectF2.left) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f10 = 1.0f;
        if (motionEvent.getAction() == 0) {
            this.T = contains;
            this.R = z9;
            this.S = z10;
            if (z9 || z10) {
                b();
                setPlaying(false);
            }
            this.U = z11;
            if (z11) {
                b();
                s51 s51Var = this.f34942n;
                if (s51Var != null) {
                    f10 = ((float) s51Var.S()) / ((float) this.f34942n.U());
                }
                this.V = f10;
                setPlaying(false);
            }
            if (getParent() != null && (this.T || this.R || this.S || this.U)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z12 = this.R;
            RectF rectF3 = this.D;
            if (z12) {
                this.f34944s = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.g0.L(11.33f), rectF3.right - org.telegram.messenger.g0.L(11.33f)), Utilities.l(this.f34945w - Math.max(1.0f / this.f34943r, org.telegram.messenger.g0.L(30.0f) / (rectF3.width() - org.telegram.messenger.g0.L(22.66f)))), 0.0f);
                invalidate();
            } else if (this.S) {
                this.f34945w = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.g0.L(11.33f), rectF3.right - org.telegram.messenger.g0.L(11.33f)), 1.0f, Utilities.l(Math.max(1.0f / this.f34943r, org.telegram.messenger.g0.L(30.0f) / (rectF3.width() - org.telegram.messenger.g0.L(22.66f))) + this.f34944s));
                invalidate();
            } else if (this.U) {
                s51 s51Var2 = this.f34942n;
                if (s51Var2 != null) {
                    this.V = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.g0.L(11.33f), rectF3.right - org.telegram.messenger.g0.L(11.33f)), this.f34945w, this.f34944s);
                    s51Var2.q0(i7 * ((float) this.f34942n.U()), false);
                }
                invalidate();
            }
            this.h.t(org.telegram.messenger.g0.g0(Math.round(Math.max(1.0f, (this.f34945w - this.f34944s) * this.f34943r)), false, false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.T) {
                setPlaying(!b());
            } else if (this.R && this.f34946x) {
                s51 s51Var3 = this.f34942n;
                if (s51Var3 != null) {
                    s51Var3.q0(this.f34944s * ((float) s51Var3.U()), false);
                }
                setPlaying(true);
            } else if (this.S && this.f34946x) {
                s51 s51Var4 = this.f34942n;
                if (s51Var4 != null) {
                    s51Var4.q0(Math.max(this.f34944s * ((float) s51Var4.U()), (this.f34945w * ((float) this.f34942n.U())) - 1500), false);
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
        return this.f34944s;
    }

    public long getAudioLeftMs() {
        return this.f34944s * ((float) getDuration());
    }

    public float getAudioRight() {
        return this.f34945w;
    }

    public long getAudioRightMs() {
        return this.f34945w * ((float) getDuration());
    }

    public long getDuration() {
        s51 s51Var = this.f34942n;
        if (s51Var == null) {
            return 0L;
        }
        return s51Var.U();
    }

    public double getNewDuration() {
        return ((this.f34945w - this.f34944s) * ((float) getDuration())) / 1000.0d;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(32.0f);
        this.D.set(0.0f, (getHeight() - L) / 2.0f, getWidth(), (getHeight() + L) / 2.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(32.0f);
        this.D.set(0.0f, (getMeasuredHeight() - L) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + L) / 2.0f);
    }

    public void setAllowDraw(boolean z9) {
        if (this.P != z9) {
            this.P = z9;
            invalidate();
        }
    }

    public void setPlaying(boolean z9) {
        float f10;
        s51 s51Var;
        if (this.Q) {
            z9 = false;
        }
        s51 s51Var2 = this.f34942n;
        if (s51Var2 != null) {
            float S = ((float) s51Var2.S()) / ((float) this.f34942n.U());
            if (S < this.f34944s || S > this.f34945w) {
                this.f34942n.q0(f10 * ((float) s51Var.U()), false);
            }
            this.f34942n.u0(z9);
        }
        this.f34941f.a(z9, true);
        ob0 ob0Var = this.f34947y;
        org.telegram.messenger.g0.r(ob0Var);
        if (z9) {
            org.telegram.messenger.g0.i3(ob0Var, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && this.f34941f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
