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
public final class oj0 extends View {
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
    public final t5 N;
    public final t5 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public final org.telegram.ui.ActionBar.p6 f29148a;
    public final Paint f29149b;
    public final Paint f29150c;
    public final Paint d;
    public final Paint e;
    public final kf0 f29151f;
    public final e6 h;
    public v61 f29152n;
    public float f29153r;
    public float f29154s;
    public float f29155w;
    public boolean f29156x;
    public final eb0 f29157y;

    public oj0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f29149b = new Paint(1);
        this.f29150c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f29154s = 0.0f;
        this.f29155w = 1.0f;
        this.f29156x = false;
        this.f29157y = new eb0(this, 18);
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new RectF();
        this.M = new Path();
        gr grVar = gr.h;
        this.N = new t5(this, 0L, 340L, grVar);
        this.O = new t5(this, 0L, 340L, grVar);
        this.P = true;
        this.f29148a = p6Var;
        kf0 kf0Var = new kf0(12);
        this.f29151f = kf0Var;
        kf0Var.f27837f = this;
        kf0Var.setCallback(this);
        e6 e6Var = new e6(false, false, false);
        this.h = e6Var;
        e6Var.n(0.5f, 200L, grVar);
        e6Var.setCallback(this);
        e6Var.w(org.telegram.messenger.i0.L(12.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.M = org.telegram.messenger.i0.f16172q.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        Paint paint2;
        e6 e6Var;
        kf0 kf0Var;
        Paint paint3;
        int i10;
        byte b10;
        byte b11;
        int i11;
        int i12;
        byte b12;
        float f7;
        float i13;
        boolean z10;
        int i14 = org.telegram.ui.ActionBar.t6.Yf;
        org.telegram.ui.ActionBar.p6 p6Var = this.f29148a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i14, p6Var);
        Paint paint4 = this.f29149b;
        paint4.setColor(w02);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Zf, p6Var);
        Paint paint5 = this.f29150c;
        paint5.setColor(w03);
        int i15 = org.telegram.ui.ActionBar.t6.Wf;
        int w04 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
        e6 e6Var2 = this.h;
        e6Var2.u(w04);
        int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uf, p6Var);
        kf0 kf0Var2 = this.f29151f;
        kf0Var2.f27834a.setColor(w05);
        int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vf, p6Var);
        Paint paint6 = this.d;
        paint6.setColor(w06);
        int w07 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
        Paint paint7 = this.e;
        paint7.setColor(w07);
        int T1 = (int) org.telegram.messenger.i0.T1(rectF.left + org.telegram.messenger.i0.L(11.33f), rectF.right - org.telegram.messenger.i0.L(11.33f), Utilities.l(this.f29154s));
        int T12 = (int) org.telegram.messenger.i0.T1(rectF.left + org.telegram.messenger.i0.L(11.33f), rectF.right - org.telegram.messenger.i0.L(11.33f), Utilities.l(this.f29155w));
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(27.0f);
        int i16 = this.K;
        Path path = this.M;
        if (i16 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            e6Var = e6Var2;
            kf0Var = kf0Var2;
            paint3 = paint7;
            i10 = T12;
        } else {
            int L = measuredWidth / org.telegram.messenger.i0.L(3.0f);
            int L2 = org.telegram.messenger.i0.L(2.0f);
            paint = paint5;
            int L3 = org.telegram.messenger.i0.L(12.0f);
            paint2 = paint4;
            byte b13 = Byte.MAX_VALUE;
            e6Var = e6Var2;
            byte b14 = Byte.MIN_VALUE;
            kf0Var = kf0Var2;
            int i17 = 0;
            while (i17 < L) {
                Paint paint8 = paint7;
                byte[] bArr = this.L;
                if (bArr == null) {
                    i12 = i17;
                    i11 = T12;
                    b12 = 0;
                } else {
                    i11 = T12;
                    i12 = i17;
                    b12 = bArr[(int) ((i17 / L) * bArr.length)];
                }
                b13 = (byte) Math.min((int) b13, (int) b12);
                b14 = (byte) Math.max((int) b14, (int) b12);
                i17 = i12 + 1;
                paint7 = paint8;
                T12 = i11;
            }
            paint3 = paint7;
            i10 = T12;
            path.rewind();
            int i18 = 0;
            while (i18 < L) {
                byte[] bArr2 = this.L;
                if (bArr2 == null) {
                    b10 = b13;
                    b11 = 0;
                } else {
                    b10 = b13;
                    b11 = bArr2[(int) ((i18 / L) * bArr2.length)];
                }
                float W1 = org.telegram.messenger.i0.W1(Utilities.l((b11 - b10) / (b14 - b10)), L2, L3);
                float L4 = org.telegram.messenger.i0.L(3.0f) * i18;
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(L4, (-W1) / 2.0f, org.telegram.messenger.i0.L(2.0f) + L4, W1 / 2.0f);
                path.addRoundRect(rectF2, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), Path.Direction.CW);
                i18++;
                b13 = b10;
                L = L;
                L2 = L2;
            }
            this.K = measuredWidth;
        }
        canvas.save();
        Path path2 = this.G;
        path2.rewind();
        path2.addRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint9 = paint;
        canvas.drawRect(rectF.left, rectF.top, T1 - org.telegram.messenger.i0.L(1.33f), rectF.bottom, paint9);
        canvas.drawRect(org.telegram.messenger.i0.L(1.33f) + i10, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.i0.L(14.0f), rectF.centerY());
        int i19 = org.telegram.ui.ActionBar.t6.Vf;
        paint6.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.w0(i19, p6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f10 = T1;
        float f11 = i10;
        canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint2);
        if (this.U) {
            i13 = this.V;
        } else {
            v61 v61Var = this.f29152n;
            if (v61Var != null) {
                f7 = ((float) v61Var.S()) / ((float) this.f29152n.U());
            } else {
                f7 = 1.0f;
            }
            i13 = Utilities.i(f7, this.f29155w, this.f29154s);
        }
        float i20 = Utilities.i(org.telegram.messenger.i0.T1(rectF.left + org.telegram.messenger.i0.L(13.0f), rectF.right - org.telegram.messenger.i0.L(14.0f), i13), f11, f10);
        if (i20 < f11) {
            canvas.save();
            canvas.clipRect(i20, rectF.top, f11, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.i0.L(14.0f), rectF.centerY());
            if (this.f29156x && i13 < this.f29154s && !this.U) {
                paint6.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wf, p6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.t6.w0(i19, p6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (i20 > f10) {
            canvas.save();
            canvas.clipRect(f10, rectF.top, i20, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.i0.L(14.0f), rectF.centerY());
            if (!b() && !this.f29156x && !this.U) {
                paint6.setColor(org.telegram.ui.ActionBar.t6.w0(i19, p6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wf, p6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float centerY = rectF.centerY() + org.telegram.messenger.i0.L(5.33f);
        RectF rectF3 = this.F;
        rectF3.set(T1 - org.telegram.messenger.i0.L(7.0f), rectF.centerY() - org.telegram.messenger.i0.L(5.33f), T1 - org.telegram.messenger.i0.L(5.33f), centerY);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(org.telegram.messenger.i0.L(5.33f) + i10, rectF.centerY() - org.telegram.messenger.i0.L(5.33f), org.telegram.messenger.i0.L(7.0f) + i10, rectF.centerY() + org.telegram.messenger.i0.L(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.I.set(T1 - org.telegram.messenger.i0.L(24.0f), 0.0f, org.telegram.messenger.i0.L(6.0f) + T1, getHeight());
        this.J.set(i10 - org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(24.0f) + i10, getHeight());
        float d = this.O.d(!this.U);
        if (d > 0.0f) {
            float c10 = (int) (e6Var.c() + org.telegram.messenger.i0.L(30.0f));
            if (c10 <= (i10 - T1) - org.telegram.messenger.i0.L(8.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d10 = this.N.d(z10);
            float T13 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(24.0f), c10, d10);
            float f12 = T1 + i10;
            float L5 = org.telegram.messenger.i0.L(20.0f) / 2.0f;
            float centerY2 = rectF.centerY() + L5;
            RectF rectF4 = this.E;
            rectF4.set((f12 - T13) / 2.0f, rectF.centerY() - L5, (f12 + T13) / 2.0f, centerY2);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * d));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.H;
            rectF5.set(rectF4);
            rectF5.inset(-org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(6.0f));
            canvas.save();
            int L6 = org.telegram.messenger.i0.L(12.0f);
            canvas.translate(org.telegram.messenger.i0.T1(rectF4.centerX() - (L6 / 2.0f), rectF4.left + org.telegram.messenger.i0.L(6.0f), d10), rectF4.centerY());
            kf0 kf0Var3 = kf0Var;
            kf0Var3.setBounds(0, (-L6) / 2, L6, L6 / 2);
            kf0Var3.f27838g = (int) (d * 255.0f);
            kf0Var3.draw(canvas);
            canvas.restore();
            if (d10 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + org.telegram.messenger.i0.L(21.66f), rectF4.centerY() - org.telegram.messenger.i0.L(1.0f));
                e6 e6Var3 = e6Var;
                e6Var3.setBounds(-1, -1, 1, 1);
                e6Var3.B = (int) (d10 * 255.0f * d);
                e6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        v61 v61Var = this.f29152n;
        if (v61Var != null && v61Var.d0()) {
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
        boolean z10;
        boolean z11;
        boolean z12;
        float i10;
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
                v61 v61Var = this.f29152n;
                if (v61Var != null) {
                    f7 = ((float) v61Var.S()) / ((float) this.f29152n.U());
                }
                this.V = f7;
                setPlaying(false);
            }
            if (getParent() != null && (this.T || this.R || this.S || this.U)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z13 = this.R;
            RectF rectF3 = this.D;
            if (z13) {
                this.f29154s = Utilities.i(org.telegram.messenger.i0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.i0.L(11.33f), rectF3.right - org.telegram.messenger.i0.L(11.33f)), Utilities.l(this.f29155w - Math.max(1.0f / this.f29153r, org.telegram.messenger.i0.L(30.0f) / (rectF3.width() - org.telegram.messenger.i0.L(22.66f)))), 0.0f);
                invalidate();
            } else if (this.S) {
                this.f29155w = Utilities.i(org.telegram.messenger.i0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.i0.L(11.33f), rectF3.right - org.telegram.messenger.i0.L(11.33f)), 1.0f, Utilities.l(Math.max(1.0f / this.f29153r, org.telegram.messenger.i0.L(30.0f) / (rectF3.width() - org.telegram.messenger.i0.L(22.66f))) + this.f29154s));
                invalidate();
            } else if (this.U) {
                v61 v61Var2 = this.f29152n;
                if (v61Var2 != null) {
                    this.V = Utilities.i(org.telegram.messenger.i0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.i0.L(11.33f), rectF3.right - org.telegram.messenger.i0.L(11.33f)), this.f29155w, this.f29154s);
                    v61Var2.q0(i10 * ((float) this.f29152n.U()), false);
                }
                invalidate();
            }
            this.h.t(org.telegram.messenger.i0.g0(Math.round(Math.max(1.0f, (this.f29155w - this.f29154s) * this.f29153r)), false, false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.T) {
                setPlaying(!b());
            } else if (this.R && this.f29156x) {
                v61 v61Var3 = this.f29152n;
                if (v61Var3 != null) {
                    v61Var3.q0(this.f29154s * ((float) v61Var3.U()), false);
                }
                setPlaying(true);
            } else if (this.S && this.f29156x) {
                v61 v61Var4 = this.f29152n;
                if (v61Var4 != null) {
                    v61Var4.q0(Math.max(this.f29154s * ((float) v61Var4.U()), (this.f29155w * ((float) this.f29152n.U())) - 1500), false);
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
        return this.f29154s;
    }

    public long getAudioLeftMs() {
        return this.f29154s * ((float) getDuration());
    }

    public float getAudioRight() {
        return this.f29155w;
    }

    public long getAudioRightMs() {
        return this.f29155w * ((float) getDuration());
    }

    public long getDuration() {
        v61 v61Var = this.f29152n;
        if (v61Var == null) {
            return 0L;
        }
        return v61Var.U();
    }

    public double getNewDuration() {
        return ((this.f29155w - this.f29154s) * ((float) getDuration())) / 1000.0d;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float L = org.telegram.messenger.i0.L(32.0f);
        this.D.set(0.0f, (getHeight() - L) / 2.0f, getWidth(), (getHeight() + L) / 2.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float L = org.telegram.messenger.i0.L(32.0f);
        this.D.set(0.0f, (getMeasuredHeight() - L) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + L) / 2.0f);
    }

    public void setAllowDraw(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            invalidate();
        }
    }

    public void setPlaying(boolean z10) {
        float f7;
        v61 v61Var;
        if (this.Q) {
            z10 = false;
        }
        v61 v61Var2 = this.f29152n;
        if (v61Var2 != null) {
            float S = ((float) v61Var2.S()) / ((float) this.f29152n.U());
            if (S < this.f29154s || S > this.f29155w) {
                this.f29152n.q0(f7 * ((float) v61Var.U()), false);
            }
            this.f29152n.u0(z10);
        }
        this.f29151f.a(z10, true);
        eb0 eb0Var = this.f29157y;
        org.telegram.messenger.i0.r(eb0Var);
        if (z10) {
            org.telegram.messenger.i0.h3(eb0Var, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && this.f29151f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
