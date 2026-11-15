package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import org.telegram.messenger.Utilities;
public final class oi0 extends View {
    public float A0;
    public float B0;
    public float C0;
    public final RectF D0;
    public final RectF E;
    public final Paint E0;
    public final RectF F;
    public LinearGradient F0;
    public final RectF G;
    public final Matrix G0;
    public final Path H;
    public float[] H0;
    public final RectF I;
    public final nu0 I0;
    public final RectF J;
    public final nu0 J0;
    public final RectF K;
    public final int[] K0;
    public int L;
    public final float[][] L0;
    public byte[] M;
    public final Paint M0;
    public final Path N;
    public int N0;
    public final u5 O;
    public float[] O0;
    public final u5 P;
    public float[] P0;
    public final RectF Q;
    public int Q0;
    public float R;
    public byte[] R0;
    public boolean S;
    public long S0;
    public boolean T;
    public Bitmap T0;
    public boolean U;
    public int U0;
    public boolean V;
    public long V0;
    public boolean W;
    public me W0;
    public boolean X0;
    public final Paint Y0;
    public boolean Z0;
    public final org.telegram.ui.ActionBar.e6 f37960a;
    public boolean f37961a0;
    public boolean f37962a1;
    public final Paint f37963b;
    public boolean f37964b0;
    public float f37965b1;
    public final Paint f37966c;
    public float f37967c0;
    public boolean f37968c1;
    public final Paint d;
    public boolean f37969d0;
    public boolean f37970d1;
    public final Paint f37971e;
    public ni0 f37972e0;
    public int f37973e1;
    public final ke0 f37974f;
    public final RectF f37975f0;
    public float f37976f1;
    public final RectF f37977g0;
    public boolean f37978g1;
    public final g6 h;
    public final RectF f37979h0;
    public final Paint f37980i0;
    public final Paint f37981j0;
    public final Paint f37982k0;
    public final Paint f37983l0;
    public final u5 m0;
    public u51 f37984n;
    public final u5 f37985n0;
    public final u5 f37986o0;
    public boolean f37987p0;
    public float f37988q0;
    public float f37989r;
    public float f37990r0;
    public float f37991s;
    public float f37992s0;
    public final Path f37993t0;
    public final Path f37994u0;
    public final float[] f37995v0;
    public float f37996w;
    public final u5 f37997w0;
    public boolean f37998x;
    public final u5 f37999x0;
    public final wa0 f38000y;
    public final u5 f38001y0;
    public float f38002z0;

    public oi0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f37963b = new Paint(1);
        this.f37966c = new Paint(1);
        this.d = new Paint(1);
        this.f37971e = new Paint(1);
        this.f37991s = 0.0f;
        this.f37996w = 1.0f;
        this.f37998x = false;
        this.f38000y = new wa0(this, 16);
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.N = new Path();
        er erVar = er.h;
        this.O = new u5(this, 0L, 340L, erVar);
        this.P = new u5(this, 0L, 340L, erVar);
        this.Q = new RectF();
        this.R = -1.0f;
        this.S = true;
        this.f37975f0 = new RectF();
        this.f37977g0 = new RectF();
        this.f37979h0 = new RectF();
        this.f37980i0 = new Paint(1);
        this.f37981j0 = new Paint(1);
        this.f37982k0 = new Paint(1);
        this.f37983l0 = new Paint(1);
        this.m0 = new u5(this, 0L, 340L, erVar);
        this.f37985n0 = new u5(this, 0L, 220L, erVar);
        this.f37986o0 = new u5(this, 0L, 260L, erVar);
        this.f37992s0 = 1.0f;
        this.f37993t0 = new Path();
        this.f37994u0 = new Path();
        this.f37995v0 = new float[8];
        this.f37997w0 = new u5(this, 0L, 160L, er.f34421g);
        this.f37999x0 = new u5(this, 0L, 260L, erVar);
        this.f38001y0 = new u5(this, 0L, 200L, erVar);
        this.D0 = new RectF();
        this.E0 = new Paint(1);
        this.G0 = new Matrix();
        this.H0 = new float[0];
        this.I0 = new nu0(2400);
        this.J0 = new nu0(2200);
        this.K0 = new int[6];
        this.L0 = (float[][]) Array.newInstance(Float.TYPE, 6, 0);
        this.M0 = new Paint(1);
        this.N0 = 625341585;
        this.O0 = new float[0];
        this.P0 = new float[0];
        this.Q0 = -1;
        this.Y0 = new Paint(2);
        this.f37973e1 = -1;
        this.f37960a = e6Var;
        ke0 ke0Var = new ke0(12);
        this.f37974f = ke0Var;
        ke0Var.f36406f = this;
        ke0Var.setCallback(this);
        g6 g6Var = new g6(false, false, false);
        this.h = g6Var;
        g6Var.n(0.5f, 200L, erVar);
        g6Var.setCallback(this);
        g6Var.w(org.telegram.messenger.g0.L(12.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.N = org.telegram.messenger.g0.f23609q.x;
    }

    public static float c(int i7) {
        int i10 = i7 * (-1640531535);
        int i11 = (i10 ^ (i10 >>> 15)) * (-2048144777);
        int i12 = (i11 ^ (i11 >>> 13)) * (-1028477379);
        return ((i12 ^ (i12 >>> 16)) >>> 8) / 1.6777216E7f;
    }

    public final void a(Canvas canvas, RectF rectF, float f10) {
        Paint paint;
        Paint paint2;
        g6 g6Var;
        ke0 ke0Var;
        Paint paint3;
        int i7;
        byte b10;
        byte b11;
        int i10;
        int i11;
        byte b12;
        float f11;
        float i12;
        boolean z10;
        if (this.f37969d0) {
            b(canvas, rectF, f10);
            return;
        }
        int i13 = org.telegram.ui.ActionBar.j6.f28821bg;
        org.telegram.ui.ActionBar.e6 e6Var = this.f37960a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i13, e6Var);
        Paint paint4 = this.f37963b;
        paint4.setColor(w02);
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28841cg, e6Var);
        Paint paint5 = this.f37966c;
        paint5.setColor(w03);
        int i14 = org.telegram.ui.ActionBar.j6.Zf;
        int w04 = org.telegram.ui.ActionBar.j6.w0(i14, e6Var);
        g6 g6Var2 = this.h;
        g6Var2.u(w04);
        int w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Xf, e6Var);
        ke0 ke0Var2 = this.f37974f;
        ke0Var2.f36402a.setColor(w05);
        int w06 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Yf, e6Var);
        Paint paint6 = this.d;
        paint6.setColor(w06);
        int w07 = org.telegram.ui.ActionBar.j6.w0(i14, e6Var);
        Paint paint7 = this.f37971e;
        paint7.setColor(w07);
        int T1 = (int) org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(11.33f), rectF.right - org.telegram.messenger.g0.L(11.33f), Utilities.l(this.f37991s));
        int T12 = (int) org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(11.33f), rectF.right - org.telegram.messenger.g0.L(11.33f), Utilities.l(this.f37996w));
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(27.0f);
        int i15 = this.L;
        Path path = this.N;
        if (i15 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            g6Var = g6Var2;
            ke0Var = ke0Var2;
            paint3 = paint7;
            i7 = T12;
        } else {
            int L = measuredWidth / org.telegram.messenger.g0.L(3.0f);
            int L2 = org.telegram.messenger.g0.L(2.0f);
            paint = paint5;
            int L3 = org.telegram.messenger.g0.L(12.0f);
            paint2 = paint4;
            byte b13 = Byte.MAX_VALUE;
            g6Var = g6Var2;
            byte b14 = Byte.MIN_VALUE;
            ke0Var = ke0Var2;
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
            i7 = T12;
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
        canvas.drawRect(org.telegram.messenger.g0.L(1.33f) + i7, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
        int i18 = org.telegram.ui.ActionBar.j6.Yf;
        paint6.setColor(org.telegram.ui.ActionBar.j6.r1(0.3f, org.telegram.ui.ActionBar.j6.w0(i18, e6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f12 = T1;
        float f13 = i7;
        canvas.drawRect(f12, rectF.top, f13, rectF.bottom, paint2);
        if (this.f37961a0) {
            i12 = this.f37967c0;
        } else {
            u51 u51Var = this.f37984n;
            if (u51Var != null) {
                f11 = ((float) u51Var.S()) / ((float) this.f37984n.U());
            } else {
                f11 = 1.0f;
            }
            i12 = Utilities.i(f11, this.f37996w, this.f37991s);
        }
        float i19 = Utilities.i(org.telegram.messenger.g0.T1(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.right - org.telegram.messenger.g0.L(14.0f), i12), f13, f12);
        if (i19 < f13) {
            canvas.save();
            canvas.clipRect(i19, rectF.top, f13, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
            if (this.f37998x && i12 < this.f37991s && !this.f37961a0) {
                paint6.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zf, e6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.j6.w0(i18, e6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (i19 > f12) {
            canvas.save();
            canvas.clipRect(f12, rectF.top, i19, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.g0.L(14.0f), rectF.centerY());
            if (!g() && !this.f37998x && !this.f37961a0) {
                paint6.setColor(org.telegram.ui.ActionBar.j6.w0(i18, e6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zf, e6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float centerY = rectF.centerY() + org.telegram.messenger.g0.L(5.33f);
        RectF rectF3 = this.G;
        rectF3.set(T1 - org.telegram.messenger.g0.L(7.0f), rectF.centerY() - org.telegram.messenger.g0.L(5.33f), T1 - org.telegram.messenger.g0.L(5.33f), centerY);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(org.telegram.messenger.g0.L(5.33f) + i7, rectF.centerY() - org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(7.0f) + i7, rectF.centerY() + org.telegram.messenger.g0.L(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.J.set(T1 - org.telegram.messenger.g0.L(24.0f), 0.0f, org.telegram.messenger.g0.L(6.0f) + T1, getHeight());
        this.K.set(i7 - org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(24.0f) + i7, getHeight());
        float d = this.P.d(!this.f37961a0);
        if (d > 0.0f) {
            float c10 = (int) (g6Var.c() + org.telegram.messenger.g0.L(30.0f));
            if (c10 <= (i7 - T1) - org.telegram.messenger.g0.L(8.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d2 = this.O.d(z10);
            float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(24.0f), c10, d2);
            float f14 = T1 + i7;
            float L5 = org.telegram.messenger.g0.L(20.0f) / 2.0f;
            float centerY2 = rectF.centerY() + L5;
            RectF rectF4 = this.F;
            rectF4.set((f14 - T13) / 2.0f, rectF.centerY() - L5, (f14 + T13) / 2.0f, centerY2);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * d));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.I;
            rectF5.set(rectF4);
            rectF5.inset(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            int L6 = org.telegram.messenger.g0.L(12.0f);
            canvas.translate(org.telegram.messenger.g0.T1(rectF4.centerX() - (L6 / 2.0f), rectF4.left + org.telegram.messenger.g0.L(6.0f), d2), rectF4.centerY());
            ke0 ke0Var3 = ke0Var;
            ke0Var3.setBounds(0, (-L6) / 2, L6, L6 / 2);
            ke0Var3.f36407g = (int) (d * 255.0f);
            ke0Var3.draw(canvas);
            canvas.restore();
            if (d2 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + org.telegram.messenger.g0.L(21.66f), rectF4.centerY() - org.telegram.messenger.g0.L(1.0f));
                g6 g6Var3 = g6Var;
                g6Var3.setBounds(-1, -1, 1, 1);
                g6Var3.C = (int) (d2 * 255.0f * d);
                g6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final void b(android.graphics.Canvas r84, android.graphics.RectF r85, float r86) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oi0.b(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void d(int i7) {
        for (int i10 = 0; i10 < 18; i10++) {
            int i11 = ((18 * i7) + i10) * 10;
            this.H0[i11 + 9] = h() - 0.5f;
            float[] fArr = this.H0;
            fArr[i11 + 5] = 0.0f;
            fArr[i11 + 4] = 1.0f;
            fArr[i11 + 6] = Float.NaN;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = this.f37969d0;
        if (z10 && !this.S) {
            float f10 = this.R;
            if (f10 >= 0.0f) {
                a(canvas, this.Q, f10);
                return;
            }
        }
        if (this.S) {
            if (z10) {
                RectF rectF = this.f37975f0;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                a(canvas, rectF, 1.0f);
                return;
            }
            a(canvas, this.E, 1.0f);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        float i7;
        u51 u51Var;
        u51 u51Var2;
        u51 u51Var3;
        int i10;
        float f10;
        float f11 = 1.0f;
        if (this.f37969d0) {
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.T0 == null && !this.X0) {
                if (actionMasked == 0) {
                    RectF rectF = this.f37977g0;
                    if (y10 >= rectF.top - org.telegram.messenger.g0.L(10.0f) && y10 <= rectF.bottom + org.telegram.messenger.g0.L(10.0f) && x10 >= rectF.left - org.telegram.messenger.g0.L(8.0f) && x10 <= rectF.right + org.telegram.messenger.g0.L(8.0f)) {
                        this.f37965b1 = x10;
                        this.f37970d1 = false;
                        this.f37973e1 = -1;
                        float L = org.telegram.messenger.g0.L(10.0f) / 2.0f;
                        float f12 = this.A0 + L;
                        float abs = Math.abs(x10 - (this.f38002z0 - L));
                        float abs2 = Math.abs(x10 - f12);
                        if (Math.min(abs, abs2) < org.telegram.messenger.g0.L(22.0f) && !this.D0.contains(x10, y10)) {
                            if (abs <= abs2) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            this.f37973e1 = i10;
                            if (i10 == 0) {
                                f10 = this.f38002z0;
                            } else {
                                f10 = this.A0;
                            }
                            this.f37976f1 = x10 - f10;
                            this.f37987p0 = true;
                            this.f37978g1 = g();
                            setPlaying(false);
                            ni0 ni0Var = this.f37972e0;
                            if (ni0Var != null) {
                                ((ae) ni0Var).c(true);
                            }
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        } else {
                            this.W = true;
                        }
                        this.f37968c1 = true;
                        if (getParent() != null) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 2) {
                    if (this.f37968c1) {
                        float max = Math.max(1.0f, this.C0 - this.B0);
                        if (this.f37987p0) {
                            float max2 = Math.max(1.0f / Math.max(1.0f, this.f37989r), org.telegram.messenger.g0.L(40.0f) / max);
                            float f13 = x10 - this.f37976f1;
                            if (this.f37973e1 == 0) {
                                this.f37991s = Utilities.i(((f13 + org.telegram.messenger.g0.L(4.0f)) - this.B0) / max, this.f37996w - max2, 0.0f);
                            } else {
                                this.f37996w = Utilities.i(((f13 - org.telegram.messenger.g0.L(4.0f)) - this.B0) / max, 1.0f, this.f37991s + max2);
                            }
                            i(true);
                            invalidate();
                            return true;
                        }
                        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                        if (!this.f37970d1 && Math.abs(x10 - this.f37965b1) > scaledTouchSlop) {
                            this.W = false;
                            this.f37970d1 = true;
                            this.f37961a0 = true;
                            this.f37964b0 = g();
                            u51 u51Var4 = this.f37984n;
                            if (u51Var4 != null) {
                                u51Var4.u0(false);
                            }
                        }
                        if (this.f37970d1) {
                            this.f37967c0 = Utilities.i((x10 - this.B0) / max, this.f37996w, this.f37991s);
                            u51 u51Var5 = this.f37984n;
                            if (u51Var5 != null && u51Var5.U() > 0) {
                                this.f37984n.q0(this.f37967c0 * ((float) u51Var3.U()), false);
                            }
                            this.f37998x = true;
                            invalidate();
                            return true;
                        }
                        return true;
                    }
                } else if (actionMasked != 1 && actionMasked != 3) {
                    return this.f37968c1;
                } else {
                    if (this.f37968c1) {
                        if (this.f37987p0) {
                            this.f37987p0 = false;
                            u51 u51Var6 = this.f37984n;
                            if (u51Var6 != null && u51Var6.U() > 0) {
                                this.f37984n.q0(this.f37991s * ((float) u51Var2.U()), false);
                            }
                            if (this.f37978g1) {
                                setPlaying(true);
                            }
                            ni0 ni0Var2 = this.f37972e0;
                            if (ni0Var2 != null) {
                                ((ae) ni0Var2).c(false);
                            }
                        } else if (this.f37970d1) {
                            this.f37961a0 = false;
                            if (this.f37964b0 && (u51Var = this.f37984n) != null) {
                                u51Var.u0(true);
                                wa0 wa0Var = this.f38000y;
                                org.telegram.messenger.g0.r(wa0Var);
                                org.telegram.messenger.g0.i3(wa0Var, 16L);
                            }
                        } else if (actionMasked == 1) {
                            setPlaying(!g());
                        }
                        i(true);
                        this.f37968c1 = false;
                        this.f37970d1 = false;
                        this.W = false;
                        invalidate();
                        return true;
                    }
                }
            } else if (actionMasked != 0) {
                return this.f37968c1;
            }
            return false;
        }
        boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF2 = this.J;
        if (!contains && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF3 = this.K;
        if (!contains && rectF3.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!contains && !z10 && !z11 && motionEvent.getX() > rectF2.right && motionEvent.getX() < rectF3.left) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (motionEvent.getAction() == 0) {
            this.W = contains;
            this.U = z10;
            this.V = z11;
            if (z10 || z11) {
                this.f37964b0 = g();
                setPlaying(false);
            }
            this.f37961a0 = z12;
            if (z12) {
                this.f37964b0 = g();
                u51 u51Var7 = this.f37984n;
                if (u51Var7 != null) {
                    f11 = ((float) u51Var7.S()) / ((float) this.f37984n.U());
                }
                this.f37967c0 = f11;
                setPlaying(false);
            }
            if (getParent() != null && (this.W || this.U || this.V || this.f37961a0)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z13 = this.U;
            RectF rectF4 = this.E;
            if (z13) {
                this.f37991s = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF4.left + org.telegram.messenger.g0.L(11.33f), rectF4.right - org.telegram.messenger.g0.L(11.33f)), Utilities.l(this.f37996w - Math.max(1.0f / this.f37989r, org.telegram.messenger.g0.L(30.0f) / (rectF4.width() - org.telegram.messenger.g0.L(22.66f)))), 0.0f);
                invalidate();
            } else if (this.V) {
                this.f37996w = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF4.left + org.telegram.messenger.g0.L(11.33f), rectF4.right - org.telegram.messenger.g0.L(11.33f)), 1.0f, Utilities.l(Math.max(1.0f / this.f37989r, org.telegram.messenger.g0.L(30.0f) / (rectF4.width() - org.telegram.messenger.g0.L(22.66f))) + this.f37991s));
                invalidate();
            } else if (this.f37961a0) {
                u51 u51Var8 = this.f37984n;
                if (u51Var8 != null) {
                    this.f37967c0 = Utilities.i(org.telegram.messenger.g0.z1(motionEvent.getX(), rectF4.left + org.telegram.messenger.g0.L(11.33f), rectF4.right - org.telegram.messenger.g0.L(11.33f)), this.f37996w, this.f37991s);
                    u51Var8.q0(i7 * ((float) this.f37984n.U()), false);
                }
                invalidate();
            }
            this.h.t(org.telegram.messenger.g0.g0(Math.round(Math.max(1.0f, (this.f37996w - this.f37991s) * this.f37989r)), false, false), false, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.W) {
                setPlaying(!g());
            } else if (this.U && this.f37998x) {
                u51 u51Var9 = this.f37984n;
                if (u51Var9 != null) {
                    u51Var9.q0(this.f37991s * ((float) u51Var9.U()), false);
                }
                setPlaying(true);
            } else if (this.V && this.f37998x) {
                u51 u51Var10 = this.f37984n;
                if (u51Var10 != null) {
                    u51Var10.q0(Math.max(this.f37991s * ((float) u51Var10.U()), (this.f37996w * ((float) this.f37984n.U())) - 1500), false);
                }
                setPlaying(true);
            } else if (this.f37961a0 && !g()) {
                setPlaying(true);
            }
            this.W = false;
            this.U = false;
            this.V = false;
            this.f37961a0 = false;
        }
        if (this.W || this.U || this.V || this.f37961a0 || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean e(int i7) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Uf, this.f37960a);
        int green = Color.green(i7) * 6;
        int blue = (Color.blue(i7) + (green + (Color.red(i7) * 3))) / 10;
        int green2 = Color.green(w02) * 6;
        if (blue > ((Color.blue(w02) + (green2 + (Color.red(w02) * 3))) / 10) + 40) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.f37960a)) < 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        u51 u51Var = this.f37984n;
        if (u51Var != null && u51Var.d0()) {
            return true;
        }
        return false;
    }

    public float getAudioLeft() {
        return this.f37991s;
    }

    public long getAudioLeftMs() {
        return this.f37991s * ((float) getDuration());
    }

    public float getAudioRight() {
        return this.f37996w;
    }

    public long getAudioRightMs() {
        return this.f37996w * ((float) getDuration());
    }

    public long getDuration() {
        u51 u51Var = this.f37984n;
        if (u51Var == null) {
            return 0L;
        }
        return u51Var.U();
    }

    public double getNewDuration() {
        return ((this.f37996w - this.f37991s) * ((float) getDuration())) / 1000.0d;
    }

    public String getTrimBubbleText() {
        float f10 = this.f37989r;
        return org.telegram.messenger.g0.g0((int) Math.floor(this.f37991s * f10), false, false) + " - " + org.telegram.messenger.g0.g0(Math.round(f10 * this.f37996w), false, false);
    }

    public float getTrimHandleX() {
        float L = org.telegram.messenger.g0.L(10.0f);
        if (this.f37973e1 == 1) {
            return (L / 2.0f) + this.A0;
        }
        return this.f38002z0 - (L / 2.0f);
    }

    public float getTrimProgress() {
        return this.m0.f39903c;
    }

    public float getTrimWindowCenterX() {
        return this.f37988q0;
    }

    public float getTrimWindowTop() {
        return this.f37990r0;
    }

    public final float h() {
        int i7 = this.N0;
        int i10 = i7 ^ (i7 << 13);
        int i11 = i10 ^ (i10 >>> 17);
        int i12 = i11 ^ (i11 << 5);
        this.N0 = i12;
        return (i12 >>> 8) / 1.6777216E7f;
    }

    public final void i(boolean z10) {
        int round;
        if (!this.f37969d0) {
            return;
        }
        if (this.f37984n != null && (g() || (this.f37998x && this.f37974f != null && ((float) this.f37984n.S()) > (this.f37991s * ((float) this.f37984n.U())) + 30.0f && ((float) this.f37984n.S()) < (this.f37996w * ((float) this.f37984n.U())) - 60.0f))) {
            round = (int) Math.floor(Math.max(0.0f, ((float) this.f37984n.S()) - (this.f37991s * ((float) this.f37984n.U()))) / 1000.0f);
        } else {
            round = Math.round(Math.max(1.0f, (this.f37996w - this.f37991s) * this.f37989r));
        }
        boolean z11 = false;
        String g02 = org.telegram.messenger.g0.g0(round, false, false);
        if (z10 && !org.telegram.messenger.hd.f24101a0) {
            z11 = true;
        }
        this.h.t(g02, z11, true);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(32.0f);
        this.E.set(0.0f, (getHeight() - L) / 2.0f, getWidth(), (getHeight() + L) / 2.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(32.0f);
        this.E.set(0.0f, (getMeasuredHeight() - L) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + L) / 2.0f);
    }

    public void setAllowDraw(boolean z10) {
        this.R = -1.0f;
        if (this.S != z10) {
            this.S = z10;
            invalidate();
        }
    }

    public void setNewContentAlpha(float f10) {
        if (this.f37992s0 != f10) {
            this.f37992s0 = f10;
            invalidate();
        }
    }

    public void setNewStyle(boolean z10) {
        if (this.f37969d0 == z10) {
            return;
        }
        this.f37969d0 = z10;
        if (z10) {
            g6 g6Var = this.h;
            g6Var.w(org.telegram.messenger.g0.L(14.0f));
            g6Var.x(org.telegram.messenger.g0.o());
            g6Var.n(0.35f, 260L, er.h);
            this.f37974f.h = 260;
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f37982k0;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint paint2 = this.f37983l0;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint2.setColor(-1);
        invalidate();
    }

    public void setNewStyleDelegate(ni0 ni0Var) {
        this.f37972e0 = ni0Var;
    }

    public void setPlaying(boolean z10) {
        u51 u51Var;
        if (this.T) {
            z10 = false;
        }
        u51 u51Var2 = this.f37984n;
        if (u51Var2 != null) {
            float S = ((float) u51Var2.S()) / ((float) this.f37984n.U());
            if (S < this.f37991s || S > this.f37996w || (this.f37969d0 && z10 && this.f37984n.S() >= (this.f37996w * ((float) this.f37984n.U())) - 60)) {
                this.f37984n.q0(this.f37991s * ((float) u51Var.U()), false);
            }
            this.f37984n.u0(z10);
        }
        this.f37974f.a(z10, true);
        if (this.f37969d0) {
            if (z10) {
                this.f37998x = true;
            }
            i(true);
        }
        wa0 wa0Var = this.f38000y;
        org.telegram.messenger.g0.r(wa0Var);
        if (z10) {
            org.telegram.messenger.g0.i3(wa0Var, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && this.f37974f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
