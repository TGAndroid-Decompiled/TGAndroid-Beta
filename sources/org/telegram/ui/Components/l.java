package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
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
public final class l extends FrameLayout implements snb {
    public final int[] A0;
    public cl0 B0;
    public boolean C0;
    public jl0 D0;
    public final pb1 E;
    public jl0 E0;
    public final Drawable F;
    public boolean F0;
    public final Drawable G;
    public int G0;
    public final k H;
    public final Paint H0;
    public int I;
    public final Paint I0;
    public final RectF J;
    public final Paint J0;
    public final RectF K;
    public final Path K0;
    public long L;
    public final Matrix L0;
    public final Path M;
    public final RectF M0;
    public final float[] N;
    public final jl0[] N0;
    public final float[] O;
    public final sg7 O0;
    public final mm P;
    public int P0;
    public final RectF Q;
    public int Q0;
    public jl0 R;
    public boolean R0;
    public final Paint S;
    public boolean S0;
    public final Paint T;
    public boolean T0;
    public final Paint U;
    public final ChatActivityEnterView U0;
    public final mm V;
    public final mm W;
    public dz1 a;
    public final mm a0;
    public dz1 b;
    public final mm b0;
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
    public final mm h0;
    public final mm i0;
    public final Paint j0;
    public final Paint k0;
    public final Path l0;
    public final Matrix m0;
    public final TextPaint n;
    public float n0;
    public final Paint o0;
    public final Paint p0;
    public final Paint q0;
    public final Paint r;
    public final RectF r0;
    public final Paint s;
    public jl0 s0;
    public final RectF t0;
    public final Paint u0;
    public final mm v0;
    public final Paint w;
    public final mm w0;
    public final Path x;
    public final mm x0;
    public final Paint y;
    public int y0;
    public final int[] z0;

    public l(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.U0 = chatActivityEnterView;
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
        k43 k43Var = k43.h;
        this.P = new mm(this, 0L, 350L, k43Var);
        this.Q = new RectF();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new mm(this, 0L, 320L, k43Var);
        this.W = new mm(this, 0L, 260L, k43.k);
        this.a0 = new mm(this, 0L, 60L, k43Var);
        this.b0 = new mm(this, 0L, 180L, k43Var);
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new Paint(1);
        this.h0 = new mm(this, 0L, 220L, k43Var);
        this.i0 = new mm(this, 0L, 220L, k43Var);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Path();
        this.m0 = new Matrix();
        this.o0 = new Paint();
        this.p0 = new Paint();
        Paint paint2 = new Paint(1);
        this.q0 = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.r0 = new RectF();
        this.t0 = new RectF();
        new TextPaint(1);
        new Paint(1);
        new Paint(1);
        this.u0 = new Paint(1);
        this.v0 = new mm(this, 0L, 380L, k43Var);
        this.w0 = new mm(this, 0L, 300L, k43Var);
        this.x0 = new mm(this, 0L, 180L, k43Var);
        this.y0 = -1;
        this.z0 = new int[2];
        this.A0 = new int[2];
        this.H0 = new Paint(1);
        this.I0 = new Paint(1);
        this.J0 = new Paint(1);
        this.K0 = new Path();
        this.L0 = new Matrix();
        this.M0 = new RectF();
        this.N0 = new jl0[3];
        this.O0 = new sg7((byte) 15);
        k kVar = new k(this, this);
        this.H = kVar;
        ihc.l(this, kVar);
        pb1 pb1Var = new pb1(5);
        this.E = pb1Var;
        pb1Var.setCallback(this);
        pb1Var.p = true;
        pb1Var.f(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.N(1.7f));
        Drawable drawable = getResources().getDrawable(2131231645);
        chatActivityEnterView.J4 = drawable;
        yob.x(this, drawable, aob.Se, chatActivityEnterView.K4, PorterDuff.Mode.MULTIPLY);
        this.c = aob.b0(hl.L(5.0f), chatActivityEnterView.J0(aob.hg));
        textPaint.setTextSize(hl.L(14.0f));
        this.d = context.getDrawable(2131232807);
        this.e = ob6.M0(2131745040, "SlideUpToLock");
        float L = hl.L(3.0f);
        float[] fArr = {L, L, 0.0f, 0.0f, 0.0f, 0.0f, L, L};
        float[] fArr2 = {0.0f, 0.0f, r3, r3, r3, r3, 0.0f, 0.0f};
        float L2 = hl.L(3.0f);
        this.F = getResources().getDrawable(2131231510).mutate();
        this.G = getResources().getDrawable(2131231518).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public static float g() {
        float currentTimeMillis = ((float) (System.currentTimeMillis() % 2000)) / 2000.0f;
        if (currentTimeMillis < 0.5f) {
            return (currentTimeMillis * 4.0f) - 1.0f;
        }
        return 3.0f - (currentTimeMillis * 4.0f);
    }

    private void setupHintPaint(float f) {
        int J0;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.g0;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.N(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        int i = aob.d6;
        ChatActivityEnterView chatActivityEnterView = this.U0;
        if (hl.B(chatActivityEnterView.J0(i)) < 0.5f) {
            J0 = this.s.getColor();
        } else {
            J0 = chatActivityEnterView.J0(aob.eg);
        }
        paint.setColor(J0);
        paint.setAlpha((int) (Color.alpha(J0) * f));
    }

    public final void a() {
        Path path = this.d0;
        if (!path.isEmpty()) {
            return;
        }
        float N = hl.N(0.3f);
        float N2 = hl.N(3.9f) + N;
        float N3 = hl.N(6.2f);
        float N4 = hl.N(4.6f);
        path.moveTo(N2 - N4, N3);
        path.lineTo(N2, -hl.N(6.2f));
        path.lineTo(N2 + N4, N3);
        float f = N4 * 0.6f;
        path.moveTo(N2 - f, hl.N(2.1f));
        path.lineTo(N2 + f, hl.N(2.1f));
        float f2 = -hl.N(0.6f);
        float N5 = N - hl.N(2.6f);
        float N6 = N - hl.N(9.2f);
        Path path2 = this.e0;
        path2.moveTo(N6, f2);
        path2.lineTo(N5, f2);
        path2.moveTo(N5 - hl.N(3.2f), f2 - hl.N(4.0f));
        path2.lineTo(N5, f2);
        path2.lineTo(N5 - hl.N(3.2f), hl.N(4.0f) + f2);
        float N7 = hl.N(4.0f);
        Path path3 = this.f0;
        path3.moveTo(-hl.N(5.0f), N7);
        path3.lineTo(0.0f, 0.0f);
        path3.lineTo(hl.N(5.0f), hl.N(4.0f));
    }

    public final void b(float r33, float r34, float r35, float r36, android.graphics.Canvas r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l.b(float, float, float, float, android.graphics.Canvas):void");
    }

    public final void c(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, jl0 jl0Var) {
        boolean z;
        float f5;
        int i;
        int i2;
        byte b;
        float f6;
        int i3 = aob.d6;
        ChatActivityEnterView chatActivityEnterView = this.U0;
        if (hl.B(chatActivityEnterView.J0(i3)) < 0.5f) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.K0;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        if (f2 != 0.0f) {
            Matrix matrix = this.L0;
            matrix.setRotate(f2, f3, f4);
            path.transform(matrix);
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        Paint paint = this.J0;
        paint.setColor(-16777216);
        snc sncVar = chatActivityEnterView.r1;
        if (sncVar != null && (((b = sncVar.c) == 2 || b == 3) && !sncVar.K)) {
            float N = hl.N(1.2f);
            if (z) {
                f6 = 0.36f;
            } else {
                f6 = 0.12f;
            }
            paint.setShadowLayer(N, 0.0f, 0.0f, aob.p1(f6 * 1.0f, -16777216));
        } else {
            float N2 = hl.N(8.0f);
            float N3 = hl.N(2.0f);
            if (z) {
                f5 = 0.4f;
            } else {
                f5 = 0.16f;
            }
            paint.setShadowLayer(N2, 0.0f, N3, aob.p1(f5 * 1.0f, -16777216));
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        if (jl0Var != null) {
            RectF rectF2 = this.M0;
            path.computeBounds(rectF2, true);
            jl0Var.setBounds(((int) rectF2.left) - hl.L(3.0f), ((int) rectF2.top) - hl.L(3.0f), hl.L(3.0f) + ((int) rectF2.right), hl.L(3.0f) + ((int) rectF2.bottom));
            jl0Var.setAlpha(255);
            jl0Var.draw(canvas);
        }
        if (z) {
            i = -1943655888;
        } else {
            i = -989855745;
        }
        Paint paint2 = this.H0;
        paint2.setColor(i);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas.drawPaint(paint2);
        canvas.restore();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.I0;
        paint3.setStyle(style);
        paint3.setStrokeWidth(Math.max(1.0f, hl.N(0.5f)));
        if (z) {
            i2 = 620756991;
        } else {
            i2 = 385875968;
        }
        paint3.setColor(i2);
        paint3.setAlpha((int) (Color.alpha(paint3.getColor()) * 1.0f));
        canvas.drawPath(path, paint3);
    }

    public final void d(Canvas canvas) {
        Paint paint;
        ChatActivityEnterView chatActivityEnterView = this.U0;
        if (chatActivityEnterView.r7) {
            paint = chatActivityEnterView.p7;
        } else {
            paint = null;
        }
        Paint paint2 = this.g0;
        Path path = this.f0;
        if (paint == null) {
            canvas.drawPath(path, paint2);
            return;
        }
        RectF rectF = this.r0;
        path.computeBounds(rectF, true);
        rectF.inset(-hl.L(3.0f), -hl.L(3.0f));
        Paint paint3 = this.p0;
        paint3.set(paint);
        int saveLayer = canvas.saveLayer(rectF, paint3);
        canvas.drawPath(path, paint2);
        canvas.restoreToCount(saveLayer);
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.H.f(motionEvent)) {
            return false;
        }
        return true;
    }

    public final jl0 e(int i) {
        ll0 ll0Var = this.U0.K1;
        if (ll0Var == null) {
            return null;
        }
        jl0[] jl0VarArr = this.N0;
        if (jl0VarArr[i] == null) {
            jl0 c = ll0Var.c(this, this.O0, false);
            jl0VarArr[i] = c;
            c.r(0.0f);
            jl0VarArr[i].X = 0.0f;
        }
        return jl0VarArr[i];
    }

    public final void f() {
        dz1 dz1Var = this.a;
        if (dz1Var != null) {
            dz1Var.r0 = new yy1(this, dz1Var, (byte) 0);
            dz1Var.f(true);
            this.a = null;
        }
        dz1 dz1Var2 = this.b;
        if (dz1Var2 != null) {
            dz1Var2.r0 = new yy1(this, dz1Var2, (byte) 1);
            dz1Var2.f(true);
            this.b = null;
        }
    }

    public final int h(float f, float f2) {
        RectF rectF = this.t0;
        if (!rectF.isEmpty() && this.v0.c >= 0.8f) {
            RectF rectF2 = hl.P;
            rectF2.set(rectF);
            rectF2.inset(-hl.L(6.0f), -hl.L(6.0f));
            if (rectF2.contains(f, f2)) {
                return 0;
            }
        }
        return -1;
    }

    public final void i() {
        int i;
        f();
        dz1 dz1Var = new dz1(getContext());
        this.b = dz1Var;
        dz1Var.n(1.0f, 0.0f);
        this.b.p(true);
        this.b.m(15.0f, 8.0f, 8.0f, 8.0f);
        ChatActivityEnterView chatActivityEnterView = this.U0;
        boolean z = chatActivityEnterView.d1;
        boolean z2 = chatActivityEnterView.P;
        if (z) {
            if (z2) {
                i = 2131743234;
            } else {
                i = 2131743235;
            }
        } else if (z2) {
            i = 2131743162;
        } else {
            i = 2131743163;
        }
        this.b.t(hl.S2(ob6.M0(i, null)));
        dz1 dz1Var2 = this.b;
        dz1Var2.h = kg5.a(dz1Var2.getText(), this.b.getTextPaint());
        if (chatActivityEnterView.P) {
            dz1 dz1Var3 = this.b;
            dz1Var3.getClass();
            b29 b29Var = new b29(2131624021, hl.L(34.0f), hl.L(34.0f));
            b29Var.start();
            dz1Var3.l(b29Var);
        } else {
            uc7.e1().edit().putInt("voiceoncehint", uc7.e1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, tre.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        dz1 dz1Var4 = this.b;
        dz1Var4.r0 = new yy1(this, dz1Var4, (byte) 3);
        dz1Var4.v();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, hl.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
        ChatActivityEnterView chatActivityEnterView = this.U0;
        RectF rectF = chatActivityEnterView.G4;
        if (chatActivityEnterView.J1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                int h = h(x, y);
                this.y0 = h;
                if (h >= 0) {
                    invalidate();
                    return true;
                }
            } else if (this.y0 >= 0) {
                if (actionMasked == 1) {
                    if (h(x, y) >= 0) {
                        chatActivityEnterView.c2(!chatActivityEnterView.T1, true);
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    this.y0 = -1;
                    invalidate();
                    return true;
                }
                if (actionMasked == 3) {
                    this.y0 = -1;
                    invalidate();
                    return true;
                }
                return true;
            }
        }
        int action = motionEvent.getAction();
        RectF rectF2 = this.K;
        if (action == 0) {
            if (chatActivityEnterView.j5) {
                RectF rectF3 = hl.P;
                rectF3.set(rectF);
                rectF3.inset(-hl.L(10.0f), -hl.L(10.0f));
                if (!rectF.isEmpty() && rectF3.contains(x, y)) {
                    z = true;
                } else {
                    z = false;
                }
                this.T0 = z;
            }
            if (chatActivityEnterView.Q && chatActivityEnterView.C2 != null && chatActivityEnterView.b5 > 0.1f) {
                this.S0 = rectF2.contains(x, y);
            }
        } else if (motionEvent.getAction() == 1) {
            RectF rectF4 = hl.P;
            rectF4.set(rectF);
            rectF4.inset(-hl.L(10.0f), -hl.L(10.0f));
            if (this.T0 && rectF4.contains(x, y)) {
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    this.S0 = false;
                    this.T0 = false;
                    if (chatActivityEnterView.u3) {
                        if (!chatActivityEnterView.T6) {
                            tx1 tx1Var = chatActivityEnterView.F0;
                            if (tx1Var != null && tx1Var.length() != 0) {
                                chatActivityEnterView.p0(true, true);
                                bn3 bn3Var = chatActivityEnterView.j1;
                                if (bn3Var != null && bn3Var.p0 && bn3Var.r == 1) {
                                    bn3Var.w();
                                }
                            } else {
                                chatActivityEnterView.n0();
                                return true;
                            }
                        } else {
                            chatActivityEnterView.p0(false, true);
                            chatActivityEnterView.D0().M(true);
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
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Z1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.O3.S0();
                } else {
                    go1 go1Var = new go1(this, (byte) 16);
                    dz1 dz1Var = this.a;
                    if (dz1Var != null && dz1Var.W) {
                        f();
                    }
                    if (chatActivityEnterView.J1) {
                        chatActivityEnterView.c2(false, false);
                        hl.r(chatActivityEnterView.W1);
                        chatActivityEnterView.V1(true);
                    }
                    x59 x59Var = chatActivityEnterView.i1;
                    if (x59Var != null) {
                        x59Var.setPlaying(false);
                    }
                    if (MediaController.z().J() && (chatActivityEnterView.i1.getAudioLeft() > 0.01f || chatActivityEnterView.i1.getAudioRight() < 0.99f)) {
                        dy1 dy1Var = new dy1(this, go1Var, (byte) 3);
                        if (uc7.e1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.K4, getContext());
                            String M0 = ob6.M0(2131746075, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            idVar.U = ob6.M0(2131746076, null);
                            alertDialog$Builder.j(ob6.M0(2131747558, null), new rd1(dy1Var, (byte) 15));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                        } else {
                            dy1Var.run();
                        }
                    } else {
                        go1Var.run();
                    }
                }
                this.S0 = false;
                this.T0 = false;
                return true;
            } else if (this.S0 && rectF2.contains(x, y)) {
                boolean z2 = !chatActivityEnterView.P;
                chatActivityEnterView.P = z2;
                this.E.f(1, z2, true);
                ls6 d0 = ls6.d0(chatActivityEnterView.R);
                long j2 = chatActivityEnterView.F3;
                zu1 zu1Var = chatActivityEnterView.E3;
                if (zu1Var != null && zu1Var.x4) {
                    j = zu1Var.c();
                } else {
                    j = 0;
                }
                d0.g2(j2, j, chatActivityEnterView.P);
                if (chatActivityEnterView.P) {
                    i();
                } else {
                    f();
                }
                invalidate();
                this.S0 = false;
                this.T0 = false;
                return true;
            } else {
                this.S0 = false;
                this.T0 = false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.S0 = false;
            this.T0 = false;
        }
        if (this.T0 || this.S0) {
            return true;
        }
        return false;
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setBlurredBackgroundFactory(ll0 ll0Var) {
        this.C0 = true;
        ChatActivityEnterView chatActivityEnterView = this.U0;
        chatActivityEnterView.K1 = ll0Var;
        cl0 cl0Var = this.B0;
        if (cl0Var == null) {
            cl0Var = new cl0(aob.Re, chatActivityEnterView.K4);
            this.B0 = cl0Var;
        }
        jl0 c = ll0Var.c(this, cl0Var, false);
        this.D0 = c;
        c.r(hl.L(18.0f));
        this.D0.q(hl.L(3.0f));
        jl0 c2 = ll0Var.c(this, this.B0, false);
        this.E0 = c2;
        c2.r(hl.L(18.0f));
        this.E0.q(hl.L(3.0f));
        jl0 c3 = ll0Var.c(this, this.B0, false);
        this.s0 = c3;
        c3.r(hl.L(18.0f));
        this.s0.q(hl.L(3.0f));
        jl0 c4 = ll0Var.c(this, this.B0, false);
        this.R = c4;
        c4.r(hl.L(18.0f));
        jl0 jl0Var = this.R;
        jl0Var.X = 0.0f;
        jl0Var.q(hl.L(3.0f));
        this.F0 = false;
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
        pb1 pb1Var = this.E;
        if (pb1Var != null && (textPaint = this.n) != null && (drawable = this.F) != null && (drawable2 = this.G) != null) {
            cl0 cl0Var = this.B0;
            if (cl0Var != null) {
                cl0Var.d();
            }
            jl0 jl0Var = this.D0;
            if (jl0Var != null) {
                jl0Var.updateColors();
            }
            jl0 jl0Var2 = this.E0;
            if (jl0Var2 != null) {
                jl0Var2.updateColors();
            }
            jl0 jl0Var3 = this.s0;
            if (jl0Var3 != null) {
                jl0Var3.updateColors();
            }
            jl0 jl0Var4 = this.R;
            if (jl0Var4 != null) {
                jl0Var4.updateColors();
            }
            if (this.C0) {
                i = aob.Nl;
            } else {
                i = aob.Qe;
            }
            ChatActivityEnterView chatActivityEnterView = this.U0;
            pb1Var.g(chatActivityEnterView.J0(i), chatActivityEnterView.J0(aob.Uf), -1);
            textPaint.setColor(chatActivityEnterView.J0(aob.gg));
            ShapeDrawable shapeDrawable = this.c;
            if (shapeDrawable != null) {
                i2 = aob.hg;
                aob.A1(chatActivityEnterView.J0(i2), shapeDrawable);
            } else {
                int L = hl.L(5.0f);
                i2 = aob.hg;
                this.c = aob.b0(L, chatActivityEnterView.J0(i2));
            }
            int J0 = chatActivityEnterView.J0(i2);
            Drawable drawable3 = this.d;
            if (drawable3 != null && J0 != this.P0) {
                this.P0 = J0;
                drawable3.setColorFilter(new PorterDuffColorFilter(J0, PorterDuff.Mode.SRC_IN));
            }
            this.r.setColor(chatActivityEnterView.J0(aob.Re));
            if (this.C0) {
                i3 = aob.Nl;
            } else {
                i3 = aob.Qe;
            }
            this.s.setColor(chatActivityEnterView.J0(i3));
            if (this.C0) {
                i4 = aob.Nl;
            } else {
                i4 = aob.Qe;
            }
            this.w.setColor(chatActivityEnterView.J0(i4));
            if (this.C0) {
                i5 = aob.Nl;
            } else {
                i5 = aob.Qe;
            }
            int J02 = chatActivityEnterView.J0(i5);
            if (!this.R0 || J02 != this.Q0) {
                this.R0 = true;
                this.Q0 = J02;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(J02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(J02, mode));
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
