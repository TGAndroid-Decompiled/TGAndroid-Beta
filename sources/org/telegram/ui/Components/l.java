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
public final class l extends FrameLayout implements vlb {
    public im0 A0;
    public boolean B0;
    public int C0;
    public final Paint D0;
    public final oc1 E;
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
    public final im0[] J0;
    public final RectF K;
    public final kg7 K0;
    public long L;
    public int L0;
    public final Path M;
    public int M0;
    public final float[] N;
    public boolean N0;
    public final float[] O;
    public boolean O0;
    public final ln P;
    public boolean P0;
    public final RectF Q;
    public final ChatActivityEnterView Q0;
    public im0 R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final ln V;
    public final ln W;
    public hg5 a;
    public final ln a0;
    public hg5 b;
    public final ln b0;
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
    public final ln h0;
    public final ln i0;
    public final Paint j0;
    public final Paint k0;
    public final Path l0;
    public final Matrix m0;
    public final TextPaint n;
    public float n0;
    public im0 o0;
    public final RectF p0;
    public final Paint q0;
    public final Paint r;
    public final ln r0;
    public final Paint s;
    public final ln s0;
    public final ln t0;
    public int u0;
    public final int[] v0;
    public final Paint w;
    public final int[] w0;
    public final Path x;
    public bm0 x0;
    public final Paint y;
    public boolean y0;
    public im0 z0;

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
        d53 d53Var = d53.h;
        this.P = new ln(this, 0L, 350L, d53Var);
        this.Q = new RectF();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new ln(this, 0L, 320L, d53Var);
        this.W = new ln(this, 0L, 260L, d53.k);
        this.a0 = new ln(this, 0L, 60L, d53Var);
        this.b0 = new ln(this, 0L, 180L, d53Var);
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new Paint(1);
        this.h0 = new ln(this, 0L, 220L, d53Var);
        this.i0 = new ln(this, 0L, 220L, d53Var);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Path();
        this.m0 = new Matrix();
        this.p0 = new RectF();
        new TextPaint(1);
        new Paint(1);
        new Paint(1);
        this.q0 = new Paint(1);
        this.r0 = new ln(this, 0L, 380L, d53Var);
        this.s0 = new ln(this, 0L, 300L, d53Var);
        this.t0 = new ln(this, 0L, 180L, d53Var);
        this.u0 = -1;
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.D0 = new Paint(1);
        this.E0 = new Paint(1);
        this.F0 = new Paint(1);
        this.G0 = new Path();
        this.H0 = new Matrix();
        this.I0 = new RectF();
        this.J0 = new im0[3];
        this.K0 = new kg7((byte) 15);
        k kVar = new k(this, this);
        this.H = kVar;
        kfc.k(this, kVar);
        oc1 oc1Var = new oc1(5);
        this.E = oc1Var;
        oc1Var.setCallback(this);
        oc1Var.d(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gm.N(1.7f));
        Drawable drawable = getResources().getDrawable(2131231646);
        chatActivityEnterView.K4 = drawable;
        anb.x(this, drawable, cmb.Re, chatActivityEnterView.L4, PorterDuff.Mode.MULTIPLY);
        this.c = cmb.b0(gm.L(5.0f), chatActivityEnterView.F0(cmb.gg));
        textPaint.setTextSize(gm.L(14.0f));
        this.d = context.getDrawable(2131232801);
        this.e = jb6.M0(2131745046, "SlideUpToLock");
        float L = gm.L(3.0f);
        float[] fArr = {L, L, 0.0f, 0.0f, 0.0f, 0.0f, L, L};
        float[] fArr2 = {0.0f, 0.0f, r3, r3, r3, r3, 0.0f, 0.0f};
        float L2 = gm.L(3.0f);
        this.F = getResources().getDrawable(2131231511).mutate();
        this.G = getResources().getDrawable(2131231519).mutate();
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
        paint.setStrokeWidth(gm.N(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        int i = cmb.c6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (gm.B(chatActivityEnterView.F0(i)) < 0.5f) {
            F0 = this.s.getColor();
        } else {
            F0 = chatActivityEnterView.F0(cmb.dg);
        }
        paint.setColor(F0);
        paint.setAlpha((int) (Color.alpha(F0) * f));
    }

    public final void a() {
        Path path = this.d0;
        if (!path.isEmpty()) {
            return;
        }
        float N = gm.N(0.3f);
        float N2 = gm.N(3.9f) + N;
        float N3 = gm.N(6.2f);
        float N4 = gm.N(4.6f);
        path.moveTo(N2 - N4, N3);
        path.lineTo(N2, -gm.N(6.2f));
        path.lineTo(N2 + N4, N3);
        float f = N4 * 0.6f;
        path.moveTo(N2 - f, gm.N(2.1f));
        path.lineTo(N2 + f, gm.N(2.1f));
        float f2 = -gm.N(0.6f);
        float N5 = N - gm.N(2.6f);
        float N6 = N - gm.N(9.2f);
        Path path2 = this.e0;
        path2.moveTo(N6, f2);
        path2.lineTo(N5, f2);
        path2.moveTo(N5 - gm.N(3.2f), f2 - gm.N(4.0f));
        path2.lineTo(N5, f2);
        path2.lineTo(N5 - gm.N(3.2f), gm.N(4.0f) + f2);
        float N7 = gm.N(4.0f);
        Path path3 = this.f0;
        path3.moveTo(-gm.N(5.0f), N7);
        path3.lineTo(0.0f, 0.0f);
        path3.lineTo(gm.N(5.0f), gm.N(4.0f));
    }

    public final void b(float r33, float r34, float r35, float r36, android.graphics.Canvas r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l.b(float, float, float, float, android.graphics.Canvas):void");
    }

    public final void c(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, im0 im0Var) {
        boolean z;
        float f5;
        int i;
        int i2;
        byte b;
        float f6;
        int i3 = cmb.c6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (gm.B(chatActivityEnterView.F0(i3)) < 0.5f) {
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
        glc glcVar = chatActivityEnterView.r1;
        if (glcVar != null && (((b = glcVar.c) == 2 || b == 3) && !glcVar.J)) {
            float N = gm.N(1.2f);
            if (z) {
                f6 = 0.36f;
            } else {
                f6 = 0.12f;
            }
            paint.setShadowLayer(N, 0.0f, 0.0f, cmb.p1(f6 * 1.0f, -16777216));
        } else {
            float N2 = gm.N(8.0f);
            float N3 = gm.N(2.0f);
            if (z) {
                f5 = 0.4f;
            } else {
                f5 = 0.16f;
            }
            paint.setShadowLayer(N2, 0.0f, N3, cmb.p1(f5 * 1.0f, -16777216));
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        if (im0Var != null) {
            RectF rectF2 = this.I0;
            path.computeBounds(rectF2, true);
            im0Var.setBounds(((int) rectF2.left) - gm.L(3.0f), ((int) rectF2.top) - gm.L(3.0f), gm.L(3.0f) + ((int) rectF2.right), gm.L(3.0f) + ((int) rectF2.bottom));
            im0Var.setAlpha(255);
            im0Var.draw(canvas);
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
        paint3.setStrokeWidth(Math.max(1.0f, gm.N(0.5f)));
        if (z) {
            i2 = 620756991;
        } else {
            i2 = 385875968;
        }
        paint3.setColor(i2);
        paint3.setAlpha((int) (Color.alpha(paint3.getColor()) * 1.0f));
        canvas.drawPath(path, paint3);
    }

    public final im0 d(int i) {
        km0 km0Var = this.Q0.L1;
        if (km0Var == null) {
            return null;
        }
        im0[] im0VarArr = this.J0;
        if (im0VarArr[i] == null) {
            im0 c = km0Var.c(this, this.K0, false);
            im0VarArr[i] = c;
            c.r(0.0f);
            im0VarArr[i].X = 0.0f;
        }
        return im0VarArr[i];
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.H.f(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void e() {
        hg5 hg5Var = this.a;
        if (hg5Var != null) {
            hg5Var.r0 = new vz1(this, hg5Var, (byte) 1);
            hg5Var.f(true);
            this.a = null;
        }
        hg5 hg5Var2 = this.b;
        if (hg5Var2 != null) {
            hg5Var2.r0 = new vz1(this, hg5Var2, (byte) 2);
            hg5Var2.f(true);
            this.b = null;
        }
    }

    public final int g(float f, float f2) {
        RectF rectF = this.p0;
        if (!rectF.isEmpty() && this.r0.c >= 0.8f) {
            RectF rectF2 = gm.P;
            rectF2.set(rectF);
            rectF2.inset(-gm.L(6.0f), -gm.L(6.0f));
            if (rectF2.contains(f, f2)) {
                return 0;
            }
        }
        return -1;
    }

    public final void h() {
        int i;
        e();
        hg5 hg5Var = new hg5(getContext(), 2);
        this.b = hg5Var;
        hg5Var.n(1.0f, 0.0f);
        hg5 hg5Var2 = this.b;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.setHintGlass(hg5Var2);
        this.b.p(true);
        boolean z = chatActivityEnterView.d1;
        boolean z2 = chatActivityEnterView.P;
        if (z) {
            if (z2) {
                i = 2131743266;
            } else {
                i = 2131743267;
            }
        } else if (z2) {
            i = 2131743194;
        } else {
            i = 2131743195;
        }
        this.b.t(gm.S2(jb6.M0(i, null)));
        hg5 hg5Var3 = this.b;
        hg5Var3.h = hg5.a(hg5Var3.getText(), this.b.getTextPaint());
        if (chatActivityEnterView.P) {
            hg5 hg5Var4 = this.b;
            hg5Var4.getClass();
            p09 p09Var = new p09(2131624021, gm.L(34.0f), gm.L(34.0f));
            p09Var.start();
            hg5Var4.l(p09Var);
        } else {
            oc7.d1().edit().putInt("voiceoncehint", oc7.d1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        hg5 hg5Var5 = this.b;
        hg5Var5.r0 = new vz1(this, hg5Var5, (byte) 0);
        hg5Var5.v();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, gm.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
                        chatActivityEnterView.U1(!chatActivityEnterView.U1, true);
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
                RectF rectF3 = gm.P;
                rectF3.set(rectF);
                rectF3.inset(-gm.L(10.0f), -gm.L(10.0f));
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
            RectF rectF4 = gm.P;
            rectF4.set(rectF);
            rectF4.inset(-gm.L(10.0f), -gm.L(10.0f));
            if (this.P0 && rectF4.contains(x, y)) {
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    this.O0 = false;
                    this.P0 = false;
                    if (chatActivityEnterView.v3) {
                        if (!chatActivityEnterView.z6) {
                            sy1 sy1Var = chatActivityEnterView.F0;
                            if (sy1Var != null && sy1Var.length() != 0) {
                                chatActivityEnterView.m0(true, true);
                                un3 un3Var = chatActivityEnterView.j1;
                                if (un3Var != null && un3Var.o0 && un3Var.r == 1) {
                                    un3Var.u();
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
                    chatActivityEnterView.P3.I0();
                } else {
                    fo1 fo1Var = new fo1(this, (byte) 15);
                    hg5 hg5Var = this.a;
                    if (hg5Var != null && hg5Var.W) {
                        e();
                    }
                    if (chatActivityEnterView.K1) {
                        chatActivityEnterView.U1(false, false);
                        gm.r(chatActivityEnterView.X1);
                        chatActivityEnterView.N1(true);
                    }
                    l49 l49Var = chatActivityEnterView.i1;
                    if (l49Var != null) {
                        l49Var.setPlaying(false);
                    }
                    if (MediaController.w().F() && (chatActivityEnterView.i1.getAudioLeft() > 0.01f || chatActivityEnterView.i1.getAudioRight() < 0.99f)) {
                        lx1 lx1Var = new lx1(this, fo1Var, (byte) 4);
                        if (oc7.d1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.L4, getContext());
                            String M0 = jb6.M0(2131746081, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            heVar.U = jb6.M0(2131746082, null);
                            alertDialog$Builder.j(jb6.M0(2131747564, null), new cd1(lx1Var, (byte) 16));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                        } else {
                            lx1Var.run();
                        }
                    } else {
                        fo1Var.run();
                    }
                }
                this.O0 = false;
                this.P0 = false;
                return true;
            } else if (this.O0 && rectF2.contains(x, y)) {
                boolean z2 = !chatActivityEnterView.P;
                chatActivityEnterView.P = z2;
                this.E.d(1, z2, true);
                hs6 d0 = hs6.d0(chatActivityEnterView.R);
                long j2 = chatActivityEnterView.G3;
                yv1 yv1Var = chatActivityEnterView.F3;
                if (yv1Var != null && yv1Var.x4) {
                    j = yv1Var.d();
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

    public void setBlurredBackgroundFactory(km0 km0Var) {
        this.y0 = true;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.L1 = km0Var;
        bm0 bm0Var = this.x0;
        if (bm0Var == null) {
            bm0Var = new bm0(cmb.Qe, chatActivityEnterView.L4);
            this.x0 = bm0Var;
        }
        im0 c = km0Var.c(this, bm0Var, false);
        this.z0 = c;
        c.r(gm.L(18.0f));
        this.z0.q(gm.L(3.0f));
        im0 c2 = km0Var.c(this, this.x0, false);
        this.A0 = c2;
        c2.r(gm.L(18.0f));
        this.A0.q(gm.L(3.0f));
        im0 c3 = km0Var.c(this, this.x0, false);
        this.o0 = c3;
        c3.r(gm.L(18.0f));
        this.o0.q(gm.L(3.0f));
        im0 c4 = km0Var.c(this, this.x0, false);
        this.R = c4;
        c4.r(gm.L(18.0f));
        im0 im0Var = this.R;
        im0Var.X = 0.0f;
        im0Var.q(gm.L(3.0f));
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
        oc1 oc1Var = this.E;
        if (oc1Var != null && (textPaint = this.n) != null && (drawable = this.F) != null && (drawable2 = this.G) != null) {
            bm0 bm0Var = this.x0;
            if (bm0Var != null) {
                bm0Var.d();
            }
            im0 im0Var = this.z0;
            if (im0Var != null) {
                im0Var.updateColors();
            }
            im0 im0Var2 = this.A0;
            if (im0Var2 != null) {
                im0Var2.updateColors();
            }
            im0 im0Var3 = this.o0;
            if (im0Var3 != null) {
                im0Var3.updateColors();
            }
            im0 im0Var4 = this.R;
            if (im0Var4 != null) {
                im0Var4.updateColors();
            }
            if (this.y0) {
                i = cmb.Ml;
            } else {
                i = cmb.Pe;
            }
            ChatActivityEnterView chatActivityEnterView = this.Q0;
            oc1Var.e(chatActivityEnterView.F0(i), chatActivityEnterView.F0(cmb.Tf), -1);
            textPaint.setColor(chatActivityEnterView.F0(cmb.fg));
            ShapeDrawable shapeDrawable = this.c;
            if (shapeDrawable != null) {
                i2 = cmb.gg;
                cmb.A1(chatActivityEnterView.F0(i2), shapeDrawable);
            } else {
                int L = gm.L(5.0f);
                i2 = cmb.gg;
                this.c = cmb.b0(L, chatActivityEnterView.F0(i2));
            }
            int F0 = chatActivityEnterView.F0(i2);
            Drawable drawable3 = this.d;
            if (drawable3 != null && F0 != this.L0) {
                this.L0 = F0;
                drawable3.setColorFilter(new PorterDuffColorFilter(F0, PorterDuff.Mode.SRC_IN));
            }
            this.r.setColor(chatActivityEnterView.F0(cmb.Qe));
            if (this.y0) {
                i3 = cmb.Ml;
            } else {
                i3 = cmb.Pe;
            }
            this.s.setColor(chatActivityEnterView.F0(i3));
            if (this.y0) {
                i4 = cmb.Ml;
            } else {
                i4 = cmb.Pe;
            }
            this.w.setColor(chatActivityEnterView.F0(i4));
            if (this.y0) {
                i5 = cmb.Ml;
            } else {
                i5 = cmb.Pe;
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
