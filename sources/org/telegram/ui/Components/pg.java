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
public final class pg extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public fh.g A0;
    public boolean B0;
    public int C0;
    public final Paint D0;
    public final hi.m E;
    public final Paint E0;
    public final Drawable F;
    public final Paint F0;
    public final Drawable G;
    public final Path G0;
    public final og H;
    public final Matrix H0;
    public int I;
    public final RectF I0;
    public final RectF J;
    public final fh.g[] J0;
    public final RectF K;
    public final pb.b K0;
    public long L;
    public int L0;
    public final Path M;
    public int M0;
    public final float[] N;
    public boolean N0;
    public final float[] O;
    public boolean O0;
    public final c6 P;
    public boolean P0;
    public final RectF Q;
    public final ChatActivityEnterView Q0;
    public fh.g R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final c6 V;
    public final c6 W;
    public hi.m3 f38396a;
    public final c6 f38397a0;
    public hi.m3 f38398b;
    public final c6 f38399b0;
    public ShapeDrawable f38400c;
    public boolean f38401c0;
    public final Drawable d;
    public final Path f38402d0;
    public final String f38403e;
    public final Path f38404e0;
    public StaticLayout f38405f;
    public final Path f38406f0;
    public final Paint f38407g0;
    public float h;
    public final c6 f38408h0;
    public final c6 f38409i0;
    public final Paint f38410j0;
    public final Paint f38411k0;
    public final Path f38412l0;
    public final Matrix m0;
    public final TextPaint f38413n;
    public float f38414n0;
    public fh.g f38415o0;
    public final RectF f38416p0;
    public final Paint f38417q0;
    public final Paint f38418r;
    public final c6 f38419r0;
    public final Paint f38420s;
    public final c6 f38421s0;
    public final c6 f38422t0;
    public int f38423u0;
    public final int[] f38424v0;
    public final Paint f38425w;
    public final int[] f38426w0;
    public final Path f38427x;
    public gh.b f38428x0;
    public final Paint f38429y;
    public boolean f38430y0;
    public fh.g f38431z0;

    public pg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.Q0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f38413n = textPaint;
        this.f38418r = new Paint(1);
        this.f38420s = new Paint(1);
        Paint paint = new Paint(1);
        this.f38425w = paint;
        this.f38427x = new Path();
        this.f38429y = new Paint(1);
        this.J = new RectF();
        this.K = new RectF();
        this.M = new Path();
        this.N = r12;
        this.O = r13;
        lr lrVar = lr.h;
        this.P = new c6(this, 0L, 350L, lrVar);
        this.Q = new RectF();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new c6(this, 0L, 320L, lrVar);
        this.W = new c6(this, 0L, 260L, lr.f37212k);
        this.f38397a0 = new c6(this, 0L, 60L, lrVar);
        this.f38399b0 = new c6(this, 0L, 180L, lrVar);
        this.f38402d0 = new Path();
        this.f38404e0 = new Path();
        this.f38406f0 = new Path();
        this.f38407g0 = new Paint(1);
        this.f38408h0 = new c6(this, 0L, 220L, lrVar);
        this.f38409i0 = new c6(this, 0L, 220L, lrVar);
        this.f38410j0 = new Paint(1);
        this.f38411k0 = new Paint(1);
        this.f38412l0 = new Path();
        this.m0 = new Matrix();
        this.f38416p0 = new RectF();
        new TextPaint(1);
        new Paint(1);
        new Paint(1);
        this.f38417q0 = new Paint(1);
        new Path();
        new Path();
        this.f38419r0 = new c6(this, 0L, 380L, lrVar);
        this.f38421s0 = new c6(this, 0L, 300L, lrVar);
        this.f38422t0 = new c6(this, 0L, 180L, lrVar);
        this.f38423u0 = -1;
        this.f38424v0 = new int[2];
        this.f38426w0 = new int[2];
        this.D0 = new Paint(1);
        this.E0 = new Paint(1);
        this.F0 = new Paint(1);
        this.G0 = new Path();
        this.H0 = new Matrix();
        this.I0 = new RectF();
        this.J0 = new fh.g[3];
        this.K0 = new pb.b(18);
        og ogVar = new og(this, this);
        this.H = ogVar;
        r0.i0.j(this, ogVar);
        hi.m mVar = new hi.m(5);
        this.E = mVar;
        mVar.setCallback(this);
        mVar.d(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        Drawable drawable = getResources().getDrawable(2131231642);
        chatActivityEnterView.J4 = drawable;
        org.telegram.ui.ActionBar.u6.x(this, drawable, org.telegram.ui.ActionBar.n6.Se, chatActivityEnterView.K4, PorterDuff.Mode.MULTIPLY);
        this.f38400c = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.hg));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.d = context.getDrawable(2131232785);
        this.f38403e = org.telegram.messenger.gd.M0(2131745117, "SlideUpToLock");
        float L = org.telegram.messenger.g0.L(3.0f);
        float[] fArr = {L, L, 0.0f, 0.0f, 0.0f, 0.0f, L, L};
        float[] fArr2 = {0.0f, 0.0f, r3, r3, r3, r3, 0.0f, 0.0f};
        float L2 = org.telegram.messenger.g0.L(3.0f);
        this.F = getResources().getDrawable(2131231507).mutate();
        this.G = getResources().getDrawable(2131231515).mutate();
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

    private void setupHintPaint(float f10) {
        int C0;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f38407g0;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (org.telegram.messenger.g0.B(chatActivityEnterView.C0(i7)) < 0.5f) {
            C0 = this.f38420s.getColor();
        } else {
            C0 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.f29424eg);
        }
        paint.setColor(C0);
        paint.setAlpha((int) (Color.alpha(C0) * f10));
    }

    public final void b() {
        Path path = this.f38402d0;
        if (!path.isEmpty()) {
            return;
        }
        float N = org.telegram.messenger.g0.N(0.3f);
        float N2 = org.telegram.messenger.g0.N(3.9f) + N;
        float N3 = org.telegram.messenger.g0.N(6.2f);
        float N4 = org.telegram.messenger.g0.N(4.6f);
        path.moveTo(N2 - N4, N3);
        path.lineTo(N2, -org.telegram.messenger.g0.N(6.2f));
        path.lineTo(N2 + N4, N3);
        float f10 = N4 * 0.6f;
        path.moveTo(N2 - f10, org.telegram.messenger.g0.N(2.1f));
        path.lineTo(N2 + f10, org.telegram.messenger.g0.N(2.1f));
        float f11 = -org.telegram.messenger.g0.N(0.6f);
        float N5 = N - org.telegram.messenger.g0.N(2.6f);
        float N6 = N - org.telegram.messenger.g0.N(9.2f);
        Path path2 = this.f38404e0;
        path2.moveTo(N6, f11);
        path2.lineTo(N5, f11);
        path2.moveTo(N5 - org.telegram.messenger.g0.N(3.2f), f11 - org.telegram.messenger.g0.N(4.0f));
        path2.lineTo(N5, f11);
        path2.lineTo(N5 - org.telegram.messenger.g0.N(3.2f), org.telegram.messenger.g0.N(4.0f) + f11);
        float N7 = org.telegram.messenger.g0.N(4.0f);
        Path path3 = this.f38406f0;
        path3.moveTo(-org.telegram.messenger.g0.N(5.0f), N7);
        path3.lineTo(0.0f, 0.0f);
        path3.lineTo(org.telegram.messenger.g0.N(5.0f), org.telegram.messenger.g0.N(4.0f));
    }

    public final void c(float r35, float r36, float r37, float r38, android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pg.c(float, float, float, float, android.graphics.Canvas):void");
    }

    public final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, fh.g gVar) {
        boolean z10;
        float f14;
        int i7;
        int i10;
        int i11;
        float f15;
        int i12 = org.telegram.ui.ActionBar.n6.f29396d6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (org.telegram.messenger.g0.B(chatActivityEnterView.C0(i12)) < 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Path path = this.G0;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        if (f11 != 0.0f) {
            Matrix matrix = this.H0;
            matrix.setRotate(f11, f12, f13);
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
        ji.m mVar = chatActivityEnterView.f32656p1;
        if (mVar != null && (((i11 = mVar.f17966c) == 2 || i11 == 3) && !mVar.J)) {
            float N = org.telegram.messenger.g0.N(1.2f);
            if (z10) {
                f15 = 0.36f;
            } else {
                f15 = 0.12f;
            }
            paint.setShadowLayer(N, 0.0f, 0.0f, org.telegram.ui.ActionBar.n6.r1(f15 * 1.0f, -16777216));
        } else {
            float N2 = org.telegram.messenger.g0.N(8.0f);
            float N3 = org.telegram.messenger.g0.N(2.0f);
            if (z10) {
                f14 = 0.4f;
            } else {
                f14 = 0.16f;
            }
            paint.setShadowLayer(N2, 0.0f, N3, org.telegram.ui.ActionBar.n6.r1(f14 * 1.0f, -16777216));
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        if (gVar != null) {
            RectF rectF2 = this.I0;
            path.computeBounds(rectF2, true);
            gVar.setBounds(((int) rectF2.left) - org.telegram.messenger.g0.L(3.0f), ((int) rectF2.top) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + ((int) rectF2.right), org.telegram.messenger.g0.L(3.0f) + ((int) rectF2.bottom));
            gVar.setAlpha((int) 255.0f);
            gVar.draw(canvas);
        }
        if (z10) {
            i7 = -1943655888;
        } else {
            i7 = -989855745;
        }
        Paint paint2 = this.D0;
        paint2.setColor(i7);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas.drawPaint(paint2);
        canvas.restore();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.E0;
        paint3.setStyle(style);
        paint3.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        if (z10) {
            i10 = 620756991;
        } else {
            i10 = 385875968;
        }
        paint3.setColor(i10);
        paint3.setAlpha((int) (Color.alpha(paint3.getColor()) * 1.0f));
        canvas.drawPath(path, paint3);
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.H.f(motionEvent)) {
            return false;
        }
        return true;
    }

    public final fh.g e(int i7) {
        dh.c cVar = this.Q0.J1;
        if (cVar == null) {
            return null;
        }
        fh.g[] gVarArr = this.J0;
        if (gVarArr[i7] == null) {
            fh.g c10 = cVar.c(this, this.K0, false);
            gVarArr[i7] = c10;
            c10.r(0.0f);
            gVarArr[i7].W = 0.0f;
        }
        return gVarArr[i7];
    }

    public final void f() {
        hi.m3 m3Var = this.f38396a;
        if (m3Var != null) {
            m3Var.f15014r0 = new ng(this, m3Var, 1);
            m3Var.f(true);
            this.f38396a = null;
        }
        hi.m3 m3Var2 = this.f38398b;
        if (m3Var2 != null) {
            m3Var2.f15014r0 = new ng(this, m3Var2, 2);
            m3Var2.f(true);
            this.f38398b = null;
        }
    }

    public final int h(float f10, float f11) {
        RectF rectF = this.f38416p0;
        if (!rectF.isEmpty() && this.f38419r0.f33892c >= 0.8f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF);
            rectF2.inset(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f));
            if (rectF2.contains(f10, f11)) {
                return 0;
            }
        }
        return -1;
    }

    public final void i() {
        int i7;
        f();
        hi.m3 m3Var = new hi.m3(getContext(), 2);
        this.f38398b = m3Var;
        m3Var.o(1.0f, 0.0f);
        hi.m3 m3Var2 = this.f38398b;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.setHintGlass(m3Var2);
        this.f38398b.r(true);
        if (chatActivityEnterView.f32567d1) {
            if (chatActivityEnterView.P) {
                i7 = 2131743345;
            } else {
                i7 = 2131743346;
            }
        } else if (chatActivityEnterView.P) {
            i7 = 2131743273;
        } else {
            i7 = 2131743274;
        }
        this.f38398b.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i7, null)));
        hi.m3 m3Var3 = this.f38398b;
        m3Var3.h = hi.m3.a(m3Var3.getText(), this.f38398b.getTextPaint());
        if (chatActivityEnterView.P) {
            hi.m3 m3Var4 = this.f38398b;
            m3Var4.getClass();
            mh0 mh0Var = new mh0(2131624021, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
            mh0Var.start();
            m3Var4.m(mh0Var);
        } else {
            org.telegram.messenger.mp.g1().edit().putInt("voiceoncehint", org.telegram.messenger.mp.g1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f38398b, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        hi.m3 m3Var5 = this.f38398b;
        m3Var5.f15014r0 = new ng(this, m3Var5, 0);
        m3Var5.x();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pg.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.f38403e, this.f38413n, org.telegram.messenger.g0.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f38405f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i11 = 0; i11 < lineCount; i11++) {
                float lineWidth = this.f38405f.getLineWidth(i11);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final boolean onSetAlpha(int i7) {
        return super.onSetAlpha(i7);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j3;
        boolean z10;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        RectF rectF = chatActivityEnterView.G4;
        if (chatActivityEnterView.I1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                int h = h(x10, y10);
                this.f38423u0 = h;
                if (h >= 0) {
                    invalidate();
                    return true;
                }
            } else if (this.f38423u0 >= 0) {
                if (actionMasked == 1) {
                    if (h(x10, y10) >= 0) {
                        chatActivityEnterView.O1(!chatActivityEnterView.S1, true);
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    this.f38423u0 = -1;
                    invalidate();
                    return true;
                }
                if (actionMasked == 3) {
                    this.f38423u0 = -1;
                    invalidate();
                    return true;
                }
                return true;
            }
        }
        int action = motionEvent.getAction();
        RectF rectF2 = this.K;
        if (action == 0) {
            if (chatActivityEnterView.f32596g5) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(rectF);
                rectF3.inset(-org.telegram.messenger.g0.L(10.0f), -org.telegram.messenger.g0.L(10.0f));
                if (!rectF.isEmpty() && rectF3.contains(x10, y10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.P0 = z10;
            }
            if (chatActivityEnterView.Q && chatActivityEnterView.B2 != null && chatActivityEnterView.f32554b5 > 0.1f) {
                this.O0 = rectF2.contains(x10, y10);
            }
        } else if (motionEvent.getAction() == 1) {
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(rectF);
            rectF4.inset(-org.telegram.messenger.g0.L(10.0f), -org.telegram.messenger.g0.L(10.0f));
            if (this.P0 && rectF4.contains(x10, y10)) {
                if (chatActivityEnterView.l1 && !chatActivityEnterView.f32567d1) {
                    this.O0 = false;
                    this.P0 = false;
                    if (chatActivityEnterView.f32687t3) {
                        if (!chatActivityEnterView.f32727y6) {
                            gf gfVar = chatActivityEnterView.F0;
                            if (gfVar != null && gfVar.length() != 0) {
                                chatActivityEnterView.l0(true, true);
                                ai.n0 n0Var = chatActivityEnterView.f32614j1;
                                if (n0Var != null && n0Var.f1374o0 && n0Var.f1377r == 1) {
                                    n0Var.s();
                                }
                            } else {
                                chatActivityEnterView.k0();
                                return true;
                            }
                        } else {
                            chatActivityEnterView.l0(false, true);
                            chatActivityEnterView.w0().F(true);
                        }
                        try {
                            chatActivityEnterView.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                    return true;
                }
                if (chatActivityEnterView.f32567d1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.N3.l1();
                } else {
                    lg lgVar = new lg(this, 0);
                    hi.m3 m3Var = this.f38396a;
                    if (m3Var != null && m3Var.W) {
                        f();
                    }
                    if (chatActivityEnterView.I1) {
                        chatActivityEnterView.O1(false, false);
                        org.telegram.messenger.g0.r(chatActivityEnterView.V1);
                        chatActivityEnterView.H1(true);
                    }
                    xi0 xi0Var = chatActivityEnterView.f32607i1;
                    if (xi0Var != null) {
                        xi0Var.setPlaying(false);
                    }
                    if (MediaController.B().K() && (chatActivityEnterView.f32607i1.getAudioLeft() > 0.01f || chatActivityEnterView.f32607i1.getAudioRight() < 0.99f)) {
                        mg mgVar = new mg(0, this, lgVar);
                        if (org.telegram.messenger.mp.g1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), chatActivityEnterView.K4);
                            String M0 = org.telegram.messenger.gd.M0(2131746153, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                            u1Var.S = M0;
                            u1Var.U = org.telegram.messenger.gd.M0(2131746154, null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new b0(mgVar, 18));
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                            alertDialog$Builder.p();
                        } else {
                            mgVar.run();
                        }
                    } else {
                        lgVar.run();
                    }
                }
                this.O0 = false;
                this.P0 = false;
                return true;
            } else if (this.O0 && rectF2.contains(x10, y10)) {
                boolean z11 = !chatActivityEnterView.P;
                chatActivityEnterView.P = z11;
                this.E.d(1, z11, true);
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(chatActivityEnterView.R);
                long j10 = chatActivityEnterView.E3;
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                if (bnVar != null && bnVar.f46236x4) {
                    j3 = bnVar.d();
                } else {
                    j3 = 0;
                }
                d02.j2(j10, j3, chatActivityEnterView.P);
                if (chatActivityEnterView.P) {
                    i();
                } else {
                    f();
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
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setBlurredBackgroundFactory(dh.c cVar) {
        this.f38430y0 = true;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.J1 = cVar;
        if (this.f38428x0 == null) {
            this.f38428x0 = new gh.b(org.telegram.ui.ActionBar.n6.Re, chatActivityEnterView.K4);
        }
        fh.g c10 = cVar.c(this, this.f38428x0, false);
        this.f38431z0 = c10;
        c10.r(org.telegram.messenger.g0.L(18.0f));
        this.f38431z0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c11 = cVar.c(this, this.f38428x0, false);
        this.A0 = c11;
        c11.r(org.telegram.messenger.g0.L(18.0f));
        this.A0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c12 = cVar.c(this, this.f38428x0, false);
        this.f38415o0 = c12;
        c12.r(org.telegram.messenger.g0.L(18.0f));
        this.f38415o0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c13 = cVar.c(this, this.f38428x0, false);
        this.R = c13;
        c13.r(org.telegram.messenger.g0.L(18.0f));
        fh.g gVar = this.R;
        gVar.W = 0.0f;
        gVar.q(org.telegram.messenger.g0.L(3.0f));
        this.B0 = false;
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        int i7;
        int i10;
        int i11;
        int i12;
        hi.m mVar = this.E;
        if (mVar != null && (textPaint = this.f38413n) != null && (drawable = this.F) != null && (drawable2 = this.G) != null) {
            gh.b bVar = this.f38428x0;
            if (bVar != null) {
                bVar.d();
            }
            fh.g gVar = this.f38431z0;
            if (gVar != null) {
                gVar.updateColors();
            }
            fh.g gVar2 = this.A0;
            if (gVar2 != null) {
                gVar2.updateColors();
            }
            fh.g gVar3 = this.f38415o0;
            if (gVar3 != null) {
                gVar3.updateColors();
            }
            fh.g gVar4 = this.R;
            if (gVar4 != null) {
                gVar4.updateColors();
            }
            if (this.f38430y0) {
                i7 = org.telegram.ui.ActionBar.n6.Nl;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.Qe;
            }
            ChatActivityEnterView chatActivityEnterView = this.Q0;
            mVar.e(chatActivityEnterView.C0(i7), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Uf), -1);
            textPaint.setColor(chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.f29461gg));
            ShapeDrawable shapeDrawable = this.f38400c;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.n6.C1(chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.hg), shapeDrawable);
            } else {
                this.f38400c = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.hg));
            }
            int C0 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.hg);
            Drawable drawable3 = this.d;
            if (drawable3 != null && C0 != this.L0) {
                this.L0 = C0;
                drawable3.setColorFilter(new PorterDuffColorFilter(C0, PorterDuff.Mode.SRC_IN));
            }
            this.f38418r.setColor(chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Re));
            if (this.f38430y0) {
                i10 = org.telegram.ui.ActionBar.n6.Nl;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.Qe;
            }
            this.f38420s.setColor(chatActivityEnterView.C0(i10));
            if (this.f38430y0) {
                i11 = org.telegram.ui.ActionBar.n6.Nl;
            } else {
                i11 = org.telegram.ui.ActionBar.n6.Qe;
            }
            this.f38425w.setColor(chatActivityEnterView.C0(i11));
            if (this.f38430y0) {
                i12 = org.telegram.ui.ActionBar.n6.Nl;
            } else {
                i12 = org.telegram.ui.ActionBar.n6.Qe;
            }
            int C02 = chatActivityEnterView.C0(i12);
            if (!this.N0 || C02 != this.M0) {
                this.N0 = true;
                this.M0 = C02;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(C02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(C02, mode));
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
