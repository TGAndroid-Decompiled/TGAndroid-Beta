package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class l extends FrameLayout implements tjb {
    public il0 A0;
    public boolean B0;
    public int C0;
    public final Paint D0;
    public final hb1 E;
    public final Paint E0;
    public final Drawable F;
    public final Paint F0;
    public final Drawable G;
    public final Path G0;
    public final k H;
    public final Matrix H0;
    public int I;
    public final RectF I0;
    public final RectF J;
    public final il0[] J0;
    public final RectF K;
    public final ie7 K0;
    public long L;
    public int L0;
    public final Path M;
    public int M0;
    public final float[] N;
    public boolean N0;
    public final float[] O;
    public boolean O0;
    public final lm P;
    public boolean P0;
    public final RectF Q;
    public final ChatActivityEnterView Q0;
    public il0 R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final lm V;
    public final lm W;
    public je5 a;
    public final lm a0;
    public je5 b;
    public final lm b0;
    public ShapeDrawable c;
    public boolean c0;
    public final Drawable d;
    public final Path d0;
    public final String e;
    public final Path e0;
    public StaticLayout f;
    public final Path f0;
    public final Paint g0;
    public float h;
    public final lm h0;
    public final lm i0;
    public final Paint j0;
    public final Paint k0;
    public final Path l0;
    public final Matrix m0;
    public final TextPaint n;
    public float n0;
    public il0 o0;
    public final RectF p0;
    public final Paint q0;
    public final Paint r;
    public final lm r0;
    public final Paint s;
    public final lm s0;
    public final lm t0;
    public int u0;
    public final int[] v0;
    public final Paint w;
    public final int[] w0;
    public final Path x;
    public bl0 x0;
    public final Paint y;
    public boolean y0;
    public il0 z0;

    public l(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.Q0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new Paint(1);
        this.J = new RectF();
        this.K = new RectF();
        this.M = new Path();
        this.N = r12;
        this.O = r13;
        s33 s33Var = s33.h;
        this.P = new lm(this, 0L, 350L, s33Var);
        this.Q = new RectF();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new lm(this, 0L, 320L, s33Var);
        this.W = new lm(this, 0L, 260L, s33.k);
        this.a0 = new lm(this, 0L, 60L, s33Var);
        this.b0 = new lm(this, 0L, 180L, s33Var);
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new Paint(1);
        this.h0 = new lm(this, 0L, 220L, s33Var);
        this.i0 = new lm(this, 0L, 220L, s33Var);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Path();
        this.m0 = new Matrix();
        this.p0 = new RectF();
        new TextPaint(1);
        new Paint(1);
        new Paint(1);
        this.q0 = new Paint(1);
        this.r0 = new lm(this, 0L, 380L, s33Var);
        this.s0 = new lm(this, 0L, 300L, s33Var);
        this.t0 = new lm(this, 0L, 180L, s33Var);
        this.u0 = -1;
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.D0 = new Paint(1);
        this.E0 = new Paint(1);
        this.F0 = new Paint(1);
        this.G0 = new Path();
        this.H0 = new Matrix();
        this.I0 = new RectF();
        this.J0 = new il0[3];
        this.K0 = new ie7((byte) 15);
        k kVar = new k(this, this);
        this.H = kVar;
        jdc.k(this, kVar);
        hb1 hb1Var = new hb1(5);
        this.E = hb1Var;
        hb1Var.setCallback(this);
        hb1Var.d(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.N(1.7f));
        Drawable drawable = getResources().getDrawable(2131231645);
        chatActivityEnterView.K4 = drawable;
        zkb.x(this, drawable, bkb.Re, chatActivityEnterView.L4, PorterDuff.Mode.MULTIPLY);
        this.c = bkb.b0(gl.L(5.0f), chatActivityEnterView.F0(bkb.gg));
        textPaint.setTextSize(gl.L(14.0f));
        this.d = context.getDrawable(2131232788);
        this.e = k96.M0(2131745120, "SlideUpToLock");
        float L = gl.L(3.0f);
        float[] fArr = {L, L, 0.0f, 0.0f, 0.0f, 0.0f, L, L};
        float[] fArr2 = {0.0f, 0.0f, r3, r3, r3, r3, 0.0f, 0.0f};
        float L2 = gl.L(3.0f);
        this.F = getResources().getDrawable(2131231510).mutate();
        this.G = getResources().getDrawable(2131231518).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public static float f() {
        float currentTimeMillis = ((float) (System.currentTimeMillis() % 2000)) / 2000.0f;
        if (currentTimeMillis < 0.5f) {
            return (currentTimeMillis * 4.0f) - 1.0f;
        }
        return 3.0f - (currentTimeMillis * 4.0f);
    }

    private void setupHintPaint(float f) {
        int F0;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.g0;
        paint.setStyle(style);
        paint.setStrokeWidth(gl.N(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        int i = bkb.c6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (gl.B(chatActivityEnterView.F0(i)) < 0.5f) {
            F0 = this.s.getColor();
        } else {
            F0 = chatActivityEnterView.F0(bkb.dg);
        }
        paint.setColor(F0);
        paint.setAlpha((int) (Color.alpha(F0) * f));
    }

    public final void a() {
        Path path = this.d0;
        if (!path.isEmpty()) {
            return;
        }
        float N = gl.N(0.3f);
        float N2 = gl.N(3.9f) + N;
        float N3 = gl.N(6.2f);
        float N4 = gl.N(4.6f);
        path.moveTo(N2 - N4, N3);
        path.lineTo(N2, -gl.N(6.2f));
        path.lineTo(N2 + N4, N3);
        float f = N4 * 0.6f;
        path.moveTo(N2 - f, gl.N(2.1f));
        path.lineTo(N2 + f, gl.N(2.1f));
        float f2 = -gl.N(0.6f);
        float N5 = N - gl.N(2.6f);
        float N6 = N - gl.N(9.2f);
        Path path2 = this.e0;
        path2.moveTo(N6, f2);
        path2.lineTo(N5, f2);
        path2.moveTo(N5 - gl.N(3.2f), f2 - gl.N(4.0f));
        path2.lineTo(N5, f2);
        path2.lineTo(N5 - gl.N(3.2f), gl.N(4.0f) + f2);
        float N7 = gl.N(4.0f);
        Path path3 = this.f0;
        path3.moveTo(-gl.N(5.0f), N7);
        path3.lineTo(0.0f, 0.0f);
        path3.lineTo(gl.N(5.0f), gl.N(4.0f));
    }

    public final void b(float r33, float r34, float r35, float r36, android.graphics.Canvas r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l.b(float, float, float, float, android.graphics.Canvas):void");
    }

    public final void c(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, il0 il0Var) {
        boolean z;
        float f5;
        int i;
        int i2;
        byte b;
        float f6;
        int i3 = bkb.c6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (gl.B(chatActivityEnterView.F0(i3)) < 0.5f) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.G0;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        if (f2 != 0.0f) {
            Matrix matrix = this.H0;
            matrix.setRotate(f2, f3, f4);
            path.transform(matrix);
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        Paint paint = this.F0;
        paint.setColor(-16777216);
        gjc gjcVar = chatActivityEnterView.r1;
        if (gjcVar != null && (((b = gjcVar.c) == 2 || b == 3) && !gjcVar.J)) {
            float N = gl.N(1.2f);
            if (z) {
                f6 = 0.36f;
            } else {
                f6 = 0.12f;
            }
            paint.setShadowLayer(N, 0.0f, 0.0f, bkb.p1(f6 * 1.0f, -16777216));
        } else {
            float N2 = gl.N(8.0f);
            float N3 = gl.N(2.0f);
            if (z) {
                f5 = 0.4f;
            } else {
                f5 = 0.16f;
            }
            paint.setShadowLayer(N2, 0.0f, N3, bkb.p1(f5 * 1.0f, -16777216));
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        if (il0Var != null) {
            RectF rectF2 = this.I0;
            path.computeBounds(rectF2, true);
            il0Var.setBounds(((int) rectF2.left) - gl.L(3.0f), ((int) rectF2.top) - gl.L(3.0f), gl.L(3.0f) + ((int) rectF2.right), gl.L(3.0f) + ((int) rectF2.bottom));
            il0Var.setAlpha(255);
            il0Var.draw(canvas);
        }
        if (z) {
            i = -1943655888;
        } else {
            i = -989855745;
        }
        Paint paint2 = this.D0;
        paint2.setColor(i);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas.drawPaint(paint2);
        canvas.restore();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.E0;
        paint3.setStyle(style);
        paint3.setStrokeWidth(Math.max(1.0f, gl.N(0.5f)));
        if (z) {
            i2 = 620756991;
        } else {
            i2 = 385875968;
        }
        paint3.setColor(i2);
        paint3.setAlpha((int) (Color.alpha(paint3.getColor()) * 1.0f));
        canvas.drawPath(path, paint3);
    }

    public final il0 d(int i) {
        kl0 kl0Var = this.Q0.L1;
        if (kl0Var == null) {
            return null;
        }
        il0[] il0VarArr = this.J0;
        if (il0VarArr[i] == null) {
            il0 c = kl0Var.c(this, this.K0, false);
            il0VarArr[i] = c;
            c.r(0.0f);
            il0VarArr[i].X = 0.0f;
        }
        return il0VarArr[i];
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.H.f(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void e() {
        je5 je5Var = this.a;
        if (je5Var != null) {
            je5Var.r0 = new iy1(this, je5Var, (byte) 1);
            je5Var.f(true);
            this.a = null;
        }
        je5 je5Var2 = this.b;
        if (je5Var2 != null) {
            je5Var2.r0 = new iy1(this, je5Var2, (byte) 2);
            je5Var2.f(true);
            this.b = null;
        }
    }

    public final int g(float f, float f2) {
        RectF rectF = this.p0;
        if (!rectF.isEmpty() && this.r0.c >= 0.8f) {
            RectF rectF2 = gl.P;
            rectF2.set(rectF);
            rectF2.inset(-gl.L(6.0f), -gl.L(6.0f));
            if (rectF2.contains(f, f2)) {
                return 0;
            }
        }
        return -1;
    }

    public final void h() {
        int i;
        e();
        je5 je5Var = new je5(getContext(), 2);
        this.b = je5Var;
        je5Var.n(1.0f, 0.0f);
        je5 je5Var2 = this.b;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.setHintGlass(je5Var2);
        this.b.p(true);
        boolean z = chatActivityEnterView.d1;
        boolean z2 = chatActivityEnterView.P;
        if (z) {
            if (z2) {
                i = 2131743340;
            } else {
                i = 2131743341;
            }
        } else if (z2) {
            i = 2131743268;
        } else {
            i = 2131743269;
        }
        this.b.t(gl.S2(k96.M0(i, null)));
        je5 je5Var3 = this.b;
        je5Var3.h = je5.a(je5Var3.getText(), this.b.getTextPaint());
        if (chatActivityEnterView.P) {
            je5 je5Var4 = this.b;
            je5Var4.getClass();
            oy8 oy8Var = new oy8(2131624021, gl.L(34.0f), gl.L(34.0f));
            oy8Var.start();
            je5Var4.l(oy8Var);
        } else {
            na7.c1().edit().putInt("voiceoncehint", na7.c1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, nme.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        je5 je5Var5 = this.b;
        je5Var5.r0 = new iy1(this, je5Var5, (byte) 0);
        je5Var5.v();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, gl.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                float lineWidth = this.f.getLineWidth(i3);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final boolean onSetAlpha(int i) {
        return super.onSetAlpha(i);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j;
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        RectF rectF = chatActivityEnterView.H4;
        if (chatActivityEnterView.K1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                int g = g(x, y);
                this.u0 = g;
                if (g >= 0) {
                    invalidate();
                    return true;
                }
            } else if (this.u0 >= 0) {
                if (actionMasked == 1) {
                    if (g(x, y) >= 0) {
                        chatActivityEnterView.R1(!chatActivityEnterView.U1, true);
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    this.u0 = -1;
                    invalidate();
                    return true;
                }
                if (actionMasked == 3) {
                    this.u0 = -1;
                    invalidate();
                    return true;
                }
                return true;
            }
        }
        int action = motionEvent.getAction();
        RectF rectF2 = this.K;
        if (action == 0) {
            if (chatActivityEnterView.h5) {
                RectF rectF3 = gl.P;
                rectF3.set(rectF);
                rectF3.inset(-gl.L(10.0f), -gl.L(10.0f));
                if (!rectF.isEmpty() && rectF3.contains(x, y)) {
                    z = true;
                } else {
                    z = false;
                }
                this.P0 = z;
            }
            if (chatActivityEnterView.Q && chatActivityEnterView.D2 != null && chatActivityEnterView.c5 > 0.1f) {
                this.O0 = rectF2.contains(x, y);
            }
        } else if (motionEvent.getAction() == 1) {
            RectF rectF4 = gl.P;
            rectF4.set(rectF);
            rectF4.inset(-gl.L(10.0f), -gl.L(10.0f));
            if (this.P0 && rectF4.contains(x, y)) {
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    this.O0 = false;
                    this.P0 = false;
                    if (chatActivityEnterView.v3) {
                        if (!chatActivityEnterView.z6) {
                            ex1 ex1Var = chatActivityEnterView.F0;
                            if (ex1Var != null && ex1Var.length() != 0) {
                                chatActivityEnterView.m0(true, true);
                                jm3 jm3Var = chatActivityEnterView.j1;
                                if (jm3Var != null && jm3Var.o0 && jm3Var.r == 1) {
                                    jm3Var.u();
                                }
                            } else {
                                chatActivityEnterView.k0();
                                return true;
                            }
                        } else {
                            chatActivityEnterView.m0(false, true);
                            chatActivityEnterView.z0().I(true);
                        }
                        try {
                            chatActivityEnterView.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                    return true;
                }
                if (chatActivityEnterView.d1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.P3.G0();
                } else {
                    hq1 hq1Var = new hq1(this, (byte) 11);
                    je5 je5Var = this.a;
                    if (je5Var != null && je5Var.W) {
                        e();
                    }
                    if (chatActivityEnterView.K1) {
                        chatActivityEnterView.R1(false, false);
                        gl.r(chatActivityEnterView.X1);
                        chatActivityEnterView.K1(true);
                    }
                    i29 i29Var = chatActivityEnterView.i1;
                    if (i29Var != null) {
                        i29Var.setPlaying(false);
                    }
                    if (MediaController.w().F() && (chatActivityEnterView.i1.getAudioLeft() > 0.01f || chatActivityEnterView.i1.getAudioRight() < 0.99f)) {
                        kx1 kx1Var = new kx1(this, hq1Var, (byte) 3);
                        if (na7.c1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.L4, getContext());
                            String M0 = k96.M0(2131746155, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            hdVar.U = k96.M0(2131746156, null);
                            alertDialog$Builder.j(k96.M0(2131747638, null), new rh1(kx1Var, (byte) 13));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                        } else {
                            kx1Var.run();
                        }
                    } else {
                        hq1Var.run();
                    }
                }
                this.O0 = false;
                this.P0 = false;
                return true;
            } else if (this.O0 && rectF2.contains(x, y)) {
                boolean z2 = !chatActivityEnterView.P;
                chatActivityEnterView.P = z2;
                this.E.d(1, z2, true);
                hq6 d0 = hq6.d0(chatActivityEnterView.R);
                long j2 = chatActivityEnterView.G3;
                mu1 mu1Var = chatActivityEnterView.F3;
                if (mu1Var != null && mu1Var.x4) {
                    j = mu1Var.d();
                } else {
                    j = 0;
                }
                d0.g2(j2, j, chatActivityEnterView.P);
                if (chatActivityEnterView.P) {
                    h();
                } else {
                    e();
                }
                invalidate();
                this.O0 = false;
                this.P0 = false;
                return true;
            } else {
                this.O0 = false;
                this.P0 = false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.O0 = false;
            this.P0 = false;
        }
        if (this.P0 || this.O0) {
            return true;
        }
        return false;
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setBlurredBackgroundFactory(kl0 kl0Var) {
        this.y0 = true;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.L1 = kl0Var;
        bl0 bl0Var = this.x0;
        if (bl0Var == null) {
            bl0Var = new bl0(bkb.Qe, chatActivityEnterView.L4);
            this.x0 = bl0Var;
        }
        il0 c = kl0Var.c(this, bl0Var, false);
        this.z0 = c;
        c.r(gl.L(18.0f));
        this.z0.q(gl.L(3.0f));
        il0 c2 = kl0Var.c(this, this.x0, false);
        this.A0 = c2;
        c2.r(gl.L(18.0f));
        this.A0.q(gl.L(3.0f));
        il0 c3 = kl0Var.c(this, this.x0, false);
        this.o0 = c3;
        c3.r(gl.L(18.0f));
        this.o0.q(gl.L(3.0f));
        il0 c4 = kl0Var.c(this, this.x0, false);
        this.R = c4;
        c4.r(gl.L(18.0f));
        il0 il0Var = this.R;
        il0Var.X = 0.0f;
        il0Var.q(gl.L(3.0f));
        this.B0 = false;
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        hb1 hb1Var = this.E;
        if (hb1Var != null && (textPaint = this.n) != null && (drawable = this.F) != null && (drawable2 = this.G) != null) {
            bl0 bl0Var = this.x0;
            if (bl0Var != null) {
                bl0Var.d();
            }
            il0 il0Var = this.z0;
            if (il0Var != null) {
                il0Var.updateColors();
            }
            il0 il0Var2 = this.A0;
            if (il0Var2 != null) {
                il0Var2.updateColors();
            }
            il0 il0Var3 = this.o0;
            if (il0Var3 != null) {
                il0Var3.updateColors();
            }
            il0 il0Var4 = this.R;
            if (il0Var4 != null) {
                il0Var4.updateColors();
            }
            if (this.y0) {
                i = bkb.Ml;
            } else {
                i = bkb.Pe;
            }
            ChatActivityEnterView chatActivityEnterView = this.Q0;
            hb1Var.e(chatActivityEnterView.F0(i), chatActivityEnterView.F0(bkb.Tf), -1);
            textPaint.setColor(chatActivityEnterView.F0(bkb.fg));
            ShapeDrawable shapeDrawable = this.c;
            if (shapeDrawable != null) {
                i2 = bkb.gg;
                bkb.A1(chatActivityEnterView.F0(i2), shapeDrawable);
            } else {
                int L = gl.L(5.0f);
                i2 = bkb.gg;
                this.c = bkb.b0(L, chatActivityEnterView.F0(i2));
            }
            int F0 = chatActivityEnterView.F0(i2);
            Drawable drawable3 = this.d;
            if (drawable3 != null && F0 != this.L0) {
                this.L0 = F0;
                drawable3.setColorFilter(new PorterDuffColorFilter(F0, PorterDuff.Mode.SRC_IN));
            }
            this.r.setColor(chatActivityEnterView.F0(bkb.Qe));
            if (this.y0) {
                i3 = bkb.Ml;
            } else {
                i3 = bkb.Pe;
            }
            this.s.setColor(chatActivityEnterView.F0(i3));
            if (this.y0) {
                i4 = bkb.Ml;
            } else {
                i4 = bkb.Pe;
            }
            this.w.setColor(chatActivityEnterView.F0(i4));
            if (this.y0) {
                i5 = bkb.Ml;
            } else {
                i5 = bkb.Pe;
            }
            int F02 = chatActivityEnterView.F0(i5);
            if (!this.N0 || F02 != this.M0) {
                this.N0 = true;
                this.M0 = F02;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(F02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(F02, mode));
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
