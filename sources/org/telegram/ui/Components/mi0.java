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
public final class mi0 extends View {
    public final RectF E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public final RectF I;
    public final RectF J;
    public final RectF K;
    public int L;
    public byte[] M;
    public final Path N;
    public final u5 O;
    public final u5 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final org.telegram.ui.ActionBar.e6 f36158a;
    public final Paint f36159b;
    public final Paint f36160c;
    public final Paint d;
    public final Paint f36161e;
    public final je0 f36162f;
    public final g6 h;
    public m51 f36163n;
    public float f36164r;
    public float f36165s;
    public float f36166w;
    public boolean f36167x;
    public final jb0 f36168y;

    public mi0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f36159b = new Paint(1);
        this.f36160c = new Paint(1);
        this.d = new Paint(1);
        this.f36161e = new Paint(1);
        this.f36165s = 0.0f;
        this.f36166w = 1.0f;
        this.f36167x = false;
        this.f36168y = new jb0(this, 15);
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.N = new Path();
        xq xqVar = xq.h;
        this.O = new u5(this, 0L, 340L, xqVar);
        this.P = new u5(this, 0L, 340L, xqVar);
        this.Q = true;
        this.f36158a = e6Var;
        je0 je0Var = new je0(12);
        this.f36162f = je0Var;
        je0Var.f35054f = this;
        je0Var.setCallback(this);
        g6 g6Var = new g6(false, false, false);
        this.h = g6Var;
        g6Var.n(0.5f, 200L, xqVar);
        g6Var.setCallback(this);
        g6Var.w(org.telegram.messenger.g0.L(12.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.M = org.telegram.messenger.g0.f22608q.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        Paint paint2;
        g6 g6Var;
        je0 je0Var;
        Paint paint3;
        int i3;
        byte b10;
        byte b11;
        int i10;
        int i11;
        byte b12;
        float f10;
        float i12;
        boolean z10;
        int i13 = org.telegram.ui.ActionBar.k6.Yf;
        org.telegram.ui.ActionBar.e6 e6Var = this.f36158a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, e6Var);
        Paint paint4 = this.f36159b;
        paint4.setColor(w02);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Zf, e6Var);
        Paint paint5 = this.f36160c;
        paint5.setColor(w03);
        int i14 = org.telegram.ui.ActionBar.k6.Wf;
        int w04 = org.telegram.ui.ActionBar.k6.w0(i14, e6Var);
        g6 g6Var2 = this.h;
        g6Var2.u(w04);
        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uf, e6Var);
        je0 je0Var2 = this.f36162f;
        je0Var2.f35050a.setColor(w05);
        int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vf, e6Var);
        Paint paint6 = this.d;
        paint6.setColor(w06);
        int w07 = org.telegram.ui.ActionBar.k6.w0(i14, e6Var);
        Paint paint7 = this.f36161e;
        paint7.setColor(w07);
        int T1 = (int) org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(11.33f), rectF.right - org.telegram.messenger.g0.L(11.33f), Utilities.l(this.f36165s));
        int T12 = (int) org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(11.33f), rectF.right - org.telegram.messenger.g0.L(11.33f), Utilities.l(this.f36166w));
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(27.0f);
        int i15 = this.L;
        Path path = this.N;
        if (i15 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            g6Var = g6Var2;
            je0Var = je0Var2;
            paint3 = paint7;
            i3 = T12;
        } else {
            int L = measuredWidth / org.telegram.messenger.g0.L(3.0f);
            int L2 = org.telegram.messenger.g0.L(2.0f);
            paint = paint5;
            int L3 = org.telegram.messenger.g0.L(12.0f);
            paint2 = paint4;
            byte b13 = Byte.MAX_VALUE;
            g6Var = g6Var2;
            byte b14 = Byte.MIN_VALUE;
            je0Var = je0Var2;
            int i16 = 0;
            while (i16 < L) {
                Paint paint8 = paint7;
                byte[] bArr = this.M;
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
            i3 = T12;
            path.rewind();
            int i17 = 0;
            while (i17 < L) {
                byte[] bArr2 = this.M;
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
            this.L = measuredWidth;
        }
        canvas.save();
        Path path2 = this.H;
        path2.rewind();
        path2.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint9 = paint;
        canvas.drawRect(rectF.left, rectF.top, T1 - org.telegram.messenger.g0.L(1.33f), rectF.bottom, paint9);
        canvas.drawRect(org.telegram.messenger.g0.L(1.33f) + i3, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
        int i18 = org.telegram.ui.ActionBar.k6.Vf;
        paint6.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.w0(i18, e6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f11 = T1;
        float f12 = i3;
        canvas.drawRect(f11, rectF.top, f12, rectF.bottom, paint2);
        if (this.V) {
            i12 = this.W;
        } else {
            m51 m51Var = this.f36163n;
            if (m51Var != null) {
                f10 = ((float) m51Var.S()) / ((float) this.f36163n.U());
            } else {
                f10 = 1.0f;
            }
            i12 = Utilities.i(f10, this.f36166w, this.f36165s);
        }
        float i19 = Utilities.i(org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.right - org.telegram.messenger.g0.L(14.0f), i12), f12, f11);
        if (i19 < f12) {
            canvas.save();
            canvas.clipRect(i19, rectF.top, f12, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
            if (this.f36167x && i12 < this.f36165s && !this.V) {
                paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wf, e6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.k6.w0(i18, e6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (i19 > f11) {
            canvas.save();
            canvas.clipRect(f11, rectF.top, i19, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
            if (!b() && !this.f36167x && !this.V) {
                paint6.setColor(org.telegram.ui.ActionBar.k6.w0(i18, e6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wf, e6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float centerY = rectF.centerY() + org.telegram.messenger.g0.L(5.33f);
        RectF rectF3 = this.G;
        rectF3.set(T1 - org.telegram.messenger.g0.L(7.0f), rectF.centerY() - org.telegram.messenger.g0.L(5.33f), T1 - org.telegram.messenger.g0.L(5.33f), centerY);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(org.telegram.messenger.g0.L(5.33f) + i3, rectF.centerY() - org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(7.0f) + i3, rectF.centerY() + org.telegram.messenger.g0.L(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.J.set(T1 - org.telegram.messenger.g0.L(24.0f), 0.0f, org.telegram.messenger.g0.L(6.0f) + T1, getHeight());
        this.K.set(i3 - org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(24.0f) + i3, getHeight());
        float d = this.P.d(!this.V);
        if (d > 0.0f) {
            float c2 = (int) (g6Var.c() + org.telegram.messenger.g0.L(30.0f));
            if (c2 <= (i3 - T1) - org.telegram.messenger.g0.L(8.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d10 = this.O.d(z10);
            float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(24.0f), c2, d10);
            float f13 = T1 + i3;
            float L5 = org.telegram.messenger.g0.L(20.0f) / 2.0f;
            float centerY2 = rectF.centerY() + L5;
            RectF rectF4 = this.F;
            rectF4.set((f13 - T13) / 2.0f, rectF.centerY() - L5, (f13 + T13) / 2.0f, centerY2);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * d));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.I;
            rectF5.set(rectF4);
            rectF5.inset(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            int L6 = org.telegram.messenger.g0.L(12.0f);
            canvas.translate(org.telegram.messenger.g0.T1(rectF4.centerX() - (L6 / 2.0f), rectF4.left + org.telegram.messenger.g0.L(6.0f), d10), rectF4.centerY());
            je0 je0Var3 = je0Var;
            je0Var3.setBounds(0, (-L6) / 2, L6, L6 / 2);
            je0Var3.f35055g = (int) (d * 255.0f);
            je0Var3.draw(canvas);
            canvas.restore();
            if (d10 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + org.telegram.messenger.g0.L(21.66f), rectF4.centerY() - org.telegram.messenger.g0.L(1.0f));
                g6 g6Var3 = g6Var;
                g6Var3.setBounds(-1, -1, 1, 1);
                g6Var3.B = (int) (d10 * 255.0f * d);
                g6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        m51 m51Var = this.f36163n;
        if (m51Var != null && m51Var.d0()) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.Q) {
            a(canvas, this.E);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        float i3;
        boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF = this.J;
        if (!contains && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF2 = this.K;
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
        float f10 = 1.0f;
        if (motionEvent.getAction() == 0) {
            this.U = contains;
            this.S = z10;
            this.T = z11;
            if (z10 || z11) {
                b();
                setPlaying(false);
            }
            this.V = z12;
            if (z12) {
                b();
                m51 m51Var = this.f36163n;
                if (m51Var != null) {
                    f10 = ((float) m51Var.S()) / ((float) this.f36163n.U());
                }
                this.W = f10;
                setPlaying(false);
            }
            if (getParent() != null && (this.U || this.S || this.T || this.V)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z13 = this.S;
            RectF rectF3 = this.E;
            if (z13) {
                this.f36165s = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.g0.L(11.33f), rectF3.right - org.telegram.messenger.g0.L(11.33f)), Utilities.l(this.f36166w - Math.max(1.0f / this.f36164r, org.telegram.messenger.g0.L(30.0f) / (rectF3.width() - org.telegram.messenger.g0.L(22.66f)))), 0.0f);
                invalidate();
            } else if (this.T) {
                this.f36166w = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.g0.L(11.33f), rectF3.right - org.telegram.messenger.g0.L(11.33f)), 1.0f, Utilities.l(Math.max(1.0f / this.f36164r, org.telegram.messenger.g0.L(30.0f) / (rectF3.width() - org.telegram.messenger.g0.L(22.66f))) + this.f36165s));
                invalidate();
            } else if (this.V) {
                m51 m51Var2 = this.f36163n;
                if (m51Var2 != null) {
                    this.W = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.g0.L(11.33f), rectF3.right - org.telegram.messenger.g0.L(11.33f)), this.f36166w, this.f36165s);
                    m51Var2.q0(i3 * ((float) this.f36163n.U()), false);
                }
                invalidate();
            }
            this.h.t(org.telegram.messenger.g0.g0(Math.round(Math.max(1.0f, (this.f36166w - this.f36165s) * this.f36164r)), false, false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.U) {
                setPlaying(!b());
            } else if (this.S && this.f36167x) {
                m51 m51Var3 = this.f36163n;
                if (m51Var3 != null) {
                    m51Var3.q0(this.f36165s * ((float) m51Var3.U()), false);
                }
                setPlaying(true);
            } else if (this.T && this.f36167x) {
                m51 m51Var4 = this.f36163n;
                if (m51Var4 != null) {
                    m51Var4.q0(Math.max(this.f36165s * ((float) m51Var4.U()), (this.f36166w * ((float) this.f36163n.U())) - 1500), false);
                }
                setPlaying(true);
            } else if (this.V && !b()) {
                setPlaying(true);
            }
            this.U = false;
            this.S = false;
            this.T = false;
            this.V = false;
        }
        if (this.U || this.S || this.T || this.V || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public float getAudioLeft() {
        return this.f36165s;
    }

    public long getAudioLeftMs() {
        return this.f36165s * ((float) getDuration());
    }

    public float getAudioRight() {
        return this.f36166w;
    }

    public long getAudioRightMs() {
        return this.f36166w * ((float) getDuration());
    }

    public long getDuration() {
        m51 m51Var = this.f36163n;
        if (m51Var == null) {
            return 0L;
        }
        return m51Var.U();
    }

    public double getNewDuration() {
        return ((this.f36166w - this.f36165s) * ((float) getDuration())) / 1000.0d;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(32.0f);
        this.E.set(0.0f, (getHeight() - L) / 2.0f, getWidth(), (getHeight() + L) / 2.0f);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        float L = org.telegram.messenger.g0.L(32.0f);
        this.E.set(0.0f, (getMeasuredHeight() - L) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + L) / 2.0f);
    }

    public void setAllowDraw(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            invalidate();
        }
    }

    public void setPlaying(boolean z10) {
        float f10;
        m51 m51Var;
        if (this.R) {
            z10 = false;
        }
        m51 m51Var2 = this.f36163n;
        if (m51Var2 != null) {
            float S = ((float) m51Var2.S()) / ((float) this.f36163n.U());
            if (S < this.f36165s || S > this.f36166w) {
                this.f36163n.q0(f10 * ((float) m51Var.U()), false);
            }
            this.f36163n.u0(z10);
        }
        this.f36162f.a(z10, true);
        jb0 jb0Var = this.f36168y;
        org.telegram.messenger.g0.r(jb0Var);
        if (z10) {
            org.telegram.messenger.g0.i3(jb0Var, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && this.f36162f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
