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
public final class rg extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public fh.g A0;
    public boolean B0;
    public int C0;
    public final Paint D0;
    public final hi.l E;
    public final Paint E0;
    public final Drawable F;
    public final Paint F0;
    public final Drawable G;
    public final Path G0;
    public final qg H;
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
    public final d6 P;
    public boolean P0;
    public final RectF Q;
    public final ChatActivityEnterView Q0;
    public fh.g R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final d6 V;
    public final d6 W;
    public hi.l3 f39144a;
    public final d6 f39145a0;
    public hi.l3 f39146b;
    public final d6 f39147b0;
    public ShapeDrawable f39148c;
    public boolean f39149c0;
    public final Drawable d;
    public final Path f39150d0;
    public final String f39151e;
    public final Path f39152e0;
    public StaticLayout f39153f;
    public final Path f39154f0;
    public final Paint f39155g0;
    public float h;
    public final d6 f39156h0;
    public final d6 f39157i0;
    public final Paint f39158j0;
    public final Paint f39159k0;
    public final Path f39160l0;
    public final Matrix m0;
    public final TextPaint f39161n;
    public float f39162n0;
    public fh.g f39163o0;
    public final RectF f39164p0;
    public final Paint f39165q0;
    public final Paint f39166r;
    public final d6 f39167r0;
    public final Paint f39168s;
    public final d6 f39169s0;
    public final d6 f39170t0;
    public int f39171u0;
    public final int[] f39172v0;
    public final Paint f39173w;
    public final int[] f39174w0;
    public final Path f39175x;
    public gh.b f39176x0;
    public final Paint f39177y;
    public boolean f39178y0;
    public fh.g f39179z0;

    public rg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.Q0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f39161n = textPaint;
        this.f39166r = new Paint(1);
        this.f39168s = new Paint(1);
        Paint paint = new Paint(1);
        this.f39173w = paint;
        this.f39175x = new Path();
        this.f39177y = new Paint(1);
        this.J = new RectF();
        this.K = new RectF();
        this.M = new Path();
        this.N = r12;
        this.O = r13;
        nr nrVar = nr.h;
        this.P = new d6(this, 0L, 350L, nrVar);
        this.Q = new RectF();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new d6(this, 0L, 320L, nrVar);
        this.W = new d6(this, 0L, 260L, nr.f37921k);
        this.f39145a0 = new d6(this, 0L, 60L, nrVar);
        this.f39147b0 = new d6(this, 0L, 180L, nrVar);
        this.f39150d0 = new Path();
        this.f39152e0 = new Path();
        this.f39154f0 = new Path();
        this.f39155g0 = new Paint(1);
        this.f39156h0 = new d6(this, 0L, 220L, nrVar);
        this.f39157i0 = new d6(this, 0L, 220L, nrVar);
        this.f39158j0 = new Paint(1);
        this.f39159k0 = new Paint(1);
        this.f39160l0 = new Path();
        this.m0 = new Matrix();
        this.f39164p0 = new RectF();
        new TextPaint(1);
        new Paint(1);
        new Paint(1);
        this.f39165q0 = new Paint(1);
        new Path();
        new Path();
        this.f39167r0 = new d6(this, 0L, 380L, nrVar);
        this.f39169s0 = new d6(this, 0L, 300L, nrVar);
        this.f39170t0 = new d6(this, 0L, 180L, nrVar);
        this.f39171u0 = -1;
        this.f39172v0 = new int[2];
        this.f39174w0 = new int[2];
        this.D0 = new Paint(1);
        this.E0 = new Paint(1);
        this.F0 = new Paint(1);
        this.G0 = new Path();
        this.H0 = new Matrix();
        this.I0 = new RectF();
        this.J0 = new fh.g[3];
        this.K0 = new pb.b(18);
        qg qgVar = new qg(this, this);
        this.H = qgVar;
        r0.i0.j(this, qgVar);
        hi.l lVar = new hi.l(5);
        this.E = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        Drawable drawable = getResources().getDrawable(2131231642);
        chatActivityEnterView.L4 = drawable;
        org.telegram.ui.ActionBar.t6.x(this, drawable, org.telegram.ui.ActionBar.m6.Se, chatActivityEnterView.M4, PorterDuff.Mode.MULTIPLY);
        this.f39148c = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.hg));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.d = context.getDrawable(2131232785);
        this.f39151e = org.telegram.messenger.hd.N0(2131745116, "SlideUpToLock");
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
        int G0;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f39155g0;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        int i7 = org.telegram.ui.ActionBar.m6.f29347d6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (org.telegram.messenger.g0.B(chatActivityEnterView.G0(i7)) < 0.5f) {
            G0 = this.f39168s.getColor();
        } else {
            G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.f29375eg);
        }
        paint.setColor(G0);
        paint.setAlpha((int) (Color.alpha(G0) * f10));
    }

    public final void b() {
        Path path = this.f39150d0;
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
        Path path2 = this.f39152e0;
        path2.moveTo(N6, f11);
        path2.lineTo(N5, f11);
        path2.moveTo(N5 - org.telegram.messenger.g0.N(3.2f), f11 - org.telegram.messenger.g0.N(4.0f));
        path2.lineTo(N5, f11);
        path2.lineTo(N5 - org.telegram.messenger.g0.N(3.2f), org.telegram.messenger.g0.N(4.0f) + f11);
        float N7 = org.telegram.messenger.g0.N(4.0f);
        Path path3 = this.f39154f0;
        path3.moveTo(-org.telegram.messenger.g0.N(5.0f), N7);
        path3.lineTo(0.0f, 0.0f);
        path3.lineTo(org.telegram.messenger.g0.N(5.0f), org.telegram.messenger.g0.N(4.0f));
    }

    public final void c(float r35, float r36, float r37, float r38, android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rg.c(float, float, float, float, android.graphics.Canvas):void");
    }

    public final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, fh.g gVar) {
        boolean z10;
        float f14;
        int i7;
        int i10;
        int i11;
        float f15;
        int i12 = org.telegram.ui.ActionBar.m6.f29347d6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (org.telegram.messenger.g0.B(chatActivityEnterView.G0(i12)) < 0.5f) {
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
        ji.n nVar = chatActivityEnterView.f32672r1;
        if (nVar != null && (((i11 = nVar.f17960c) == 2 || i11 == 3) && !nVar.J)) {
            float N = org.telegram.messenger.g0.N(1.2f);
            if (z10) {
                f15 = 0.36f;
            } else {
                f15 = 0.12f;
            }
            paint.setShadowLayer(N, 0.0f, 0.0f, org.telegram.ui.ActionBar.m6.r1(f15 * 1.0f, -16777216));
        } else {
            float N2 = org.telegram.messenger.g0.N(8.0f);
            float N3 = org.telegram.messenger.g0.N(2.0f);
            if (z10) {
                f14 = 0.4f;
            } else {
                f14 = 0.16f;
            }
            paint.setShadowLayer(N2, 0.0f, N3, org.telegram.ui.ActionBar.m6.r1(f14 * 1.0f, -16777216));
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
        dh.c cVar = this.Q0.L1;
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
        hi.l3 l3Var = this.f39144a;
        if (l3Var != null) {
            l3Var.f14868r0 = new pg(this, l3Var, 1);
            l3Var.f(true);
            this.f39144a = null;
        }
        hi.l3 l3Var2 = this.f39146b;
        if (l3Var2 != null) {
            l3Var2.f14868r0 = new pg(this, l3Var2, 2);
            l3Var2.f(true);
            this.f39146b = null;
        }
    }

    public final int h(float f10, float f11) {
        RectF rectF = this.f39164p0;
        if (!rectF.isEmpty() && this.f39167r0.f34349c >= 0.8f) {
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
        hi.l3 l3Var = new hi.l3(getContext(), 2);
        this.f39146b = l3Var;
        l3Var.o(1.0f, 0.0f);
        hi.l3 l3Var2 = this.f39146b;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.setHintGlass(l3Var2);
        this.f39146b.r(true);
        if (chatActivityEnterView.f32564d1) {
            if (chatActivityEnterView.P) {
                i7 = 2131743339;
            } else {
                i7 = 2131743340;
            }
        } else if (chatActivityEnterView.P) {
            i7 = 2131743267;
        } else {
            i7 = 2131743268;
        }
        this.f39146b.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i7, null)));
        hi.l3 l3Var3 = this.f39146b;
        l3Var3.h = hi.l3.a(l3Var3.getText(), this.f39146b.getTextPaint());
        if (chatActivityEnterView.P) {
            hi.l3 l3Var4 = this.f39146b;
            l3Var4.getClass();
            oh0 oh0Var = new oh0(2131624021, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
            oh0Var.start();
            l3Var4.m(oh0Var);
        } else {
            org.telegram.messenger.np.g1().edit().putInt("voiceoncehint", org.telegram.messenger.np.g1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f39146b, c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        hi.l3 l3Var5 = this.f39146b;
        l3Var5.f14868r0 = new pg(this, l3Var5, 0);
        l3Var5.x();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rg.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.f39151e, this.f39161n, org.telegram.messenger.g0.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f39153f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i11 = 0; i11 < lineCount; i11++) {
                float lineWidth = this.f39153f.getLineWidth(i11);
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
        RectF rectF = chatActivityEnterView.I4;
        if (chatActivityEnterView.K1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                int h = h(x10, y10);
                this.f39171u0 = h;
                if (h >= 0) {
                    invalidate();
                    return true;
                }
            } else if (this.f39171u0 >= 0) {
                if (actionMasked == 1) {
                    if (h(x10, y10) >= 0) {
                        chatActivityEnterView.S1(!chatActivityEnterView.U1, true);
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                    this.f39171u0 = -1;
                    invalidate();
                    return true;
                }
                if (actionMasked == 3) {
                    this.f39171u0 = -1;
                    invalidate();
                    return true;
                }
                return true;
            }
        }
        int action = motionEvent.getAction();
        RectF rectF2 = this.K;
        if (action == 0) {
            if (chatActivityEnterView.f32608i5) {
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
            if (chatActivityEnterView.Q && chatActivityEnterView.D2 != null && chatActivityEnterView.f32567d5 > 0.1f) {
                this.O0 = rectF2.contains(x10, y10);
            }
        } else if (motionEvent.getAction() == 1) {
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(rectF);
            rectF4.inset(-org.telegram.messenger.g0.L(10.0f), -org.telegram.messenger.g0.L(10.0f));
            if (this.P0 && rectF4.contains(x10, y10)) {
                if (chatActivityEnterView.l1 && !chatActivityEnterView.f32564d1) {
                    this.O0 = false;
                    this.P0 = false;
                    if (chatActivityEnterView.f32702v3) {
                        if (!chatActivityEnterView.A6) {
                            gf gfVar = chatActivityEnterView.F0;
                            if (gfVar != null && gfVar.length() != 0) {
                                chatActivityEnterView.n0(true, true);
                                ai.k0 k0Var = chatActivityEnterView.f32611j1;
                                if (k0Var != null && k0Var.f1332o0 && k0Var.f1335r == 1) {
                                    k0Var.t();
                                }
                            } else {
                                chatActivityEnterView.l0();
                                return true;
                            }
                        } else {
                            chatActivityEnterView.n0(false, true);
                            chatActivityEnterView.A0().I(true);
                        }
                        try {
                            chatActivityEnterView.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                    return true;
                }
                if (chatActivityEnterView.f32564d1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f32539a2;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.P3.l1();
                } else {
                    ng ngVar = new ng(this, 0);
                    hi.l3 l3Var = this.f39144a;
                    if (l3Var != null && l3Var.W) {
                        f();
                    }
                    if (chatActivityEnterView.K1) {
                        chatActivityEnterView.S1(false, false);
                        org.telegram.messenger.g0.r(chatActivityEnterView.X1);
                        chatActivityEnterView.L1(true);
                    }
                    zi0 zi0Var = chatActivityEnterView.f32604i1;
                    if (zi0Var != null) {
                        zi0Var.setPlaying(false);
                    }
                    if (MediaController.B().K() && (chatActivityEnterView.f32604i1.getAudioLeft() > 0.01f || chatActivityEnterView.f32604i1.getAudioRight() < 0.99f)) {
                        og ogVar = new og(0, this, ngVar);
                        if (org.telegram.messenger.np.g1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), chatActivityEnterView.M4);
                            String N0 = org.telegram.messenger.hd.N0(2131746152, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                            t1Var.S = N0;
                            t1Var.U = org.telegram.messenger.hd.N0(2131746153, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), new c0(ogVar, 18));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                        } else {
                            ogVar.run();
                        }
                    } else {
                        ngVar.run();
                    }
                }
                this.O0 = false;
                this.P0 = false;
                return true;
            } else if (this.O0 && rectF2.contains(x10, y10)) {
                boolean z11 = !chatActivityEnterView.P;
                chatActivityEnterView.P = z11;
                this.E.d(1, z11, true);
                org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(chatActivityEnterView.R);
                long j10 = chatActivityEnterView.G3;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                if (bnVar != null && bnVar.f46207x4) {
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
        this.f39178y0 = true;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.L1 = cVar;
        if (this.f39176x0 == null) {
            this.f39176x0 = new gh.b(org.telegram.ui.ActionBar.m6.Re, chatActivityEnterView.M4);
        }
        fh.g c10 = cVar.c(this, this.f39176x0, false);
        this.f39179z0 = c10;
        c10.r(org.telegram.messenger.g0.L(18.0f));
        this.f39179z0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c11 = cVar.c(this, this.f39176x0, false);
        this.A0 = c11;
        c11.r(org.telegram.messenger.g0.L(18.0f));
        this.A0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c12 = cVar.c(this, this.f39176x0, false);
        this.f39163o0 = c12;
        c12.r(org.telegram.messenger.g0.L(18.0f));
        this.f39163o0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c13 = cVar.c(this, this.f39176x0, false);
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
        hi.l lVar = this.E;
        if (lVar != null && (textPaint = this.f39161n) != null && (drawable = this.F) != null && (drawable2 = this.G) != null) {
            gh.b bVar = this.f39176x0;
            if (bVar != null) {
                bVar.d();
            }
            fh.g gVar = this.f39179z0;
            if (gVar != null) {
                gVar.updateColors();
            }
            fh.g gVar2 = this.A0;
            if (gVar2 != null) {
                gVar2.updateColors();
            }
            fh.g gVar3 = this.f39163o0;
            if (gVar3 != null) {
                gVar3.updateColors();
            }
            fh.g gVar4 = this.R;
            if (gVar4 != null) {
                gVar4.updateColors();
            }
            if (this.f39178y0) {
                i7 = org.telegram.ui.ActionBar.m6.Nl;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.Qe;
            }
            ChatActivityEnterView chatActivityEnterView = this.Q0;
            lVar.e(chatActivityEnterView.G0(i7), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Uf), -1);
            textPaint.setColor(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.f29412gg));
            ShapeDrawable shapeDrawable = this.f39148c;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.m6.C1(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.hg), shapeDrawable);
            } else {
                this.f39148c = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.hg));
            }
            int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.hg);
            Drawable drawable3 = this.d;
            if (drawable3 != null && G0 != this.L0) {
                this.L0 = G0;
                drawable3.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
            }
            this.f39166r.setColor(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Re));
            if (this.f39178y0) {
                i10 = org.telegram.ui.ActionBar.m6.Nl;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.Qe;
            }
            this.f39168s.setColor(chatActivityEnterView.G0(i10));
            if (this.f39178y0) {
                i11 = org.telegram.ui.ActionBar.m6.Nl;
            } else {
                i11 = org.telegram.ui.ActionBar.m6.Qe;
            }
            this.f39173w.setColor(chatActivityEnterView.G0(i11));
            if (this.f39178y0) {
                i12 = org.telegram.ui.ActionBar.m6.Nl;
            } else {
                i12 = org.telegram.ui.ActionBar.m6.Qe;
            }
            int G02 = chatActivityEnterView.G0(i12);
            if (!this.N0 || G02 != this.M0) {
                this.N0 = true;
                this.M0 = G02;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(G02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(G02, mode));
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
