package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.u7;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.v8;
import org.telegram.ui.c20;
import org.telegram.ui.f40;
import org.webrtc.RendererCommon;
public final class y extends FrameLayout implements m0 {
    public final s A0;
    public final Rect B0;
    public u7 C0;
    public final Paint D;
    public int D0;
    public boolean E;
    public int E0;
    public final r3 F;
    public int F0;
    public final f40 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final m5 L;
    public int M;
    public final org.telegram.ui.ActionBar.n2 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final ch0 U;
    public final ImageView V;
    public boolean W;
    public final u f39636a;
    public float f39637a0;
    public boolean f39638b;
    public final x f39639b0;
    public r f39640c;
    public ValueAnimator f39641c0;
    public g10 d;
    public boolean f39642d0;
    public r f39643e;
    public float f39644e0;
    public boolean f39645f;
    public float f39646f0;
    public float f39647g0;
    public boolean h;
    public float f39648h0;
    public float f39649i0;
    public boolean f39650j0;
    public float f39651k0;
    public final ImageReceiver f39652l0;
    public final ArrayList m0;
    public boolean f39653n;
    public n0 f39654n0;
    public boolean f39655o0;
    public float f39656p0;
    public Bitmap f39657q0;
    public boolean f39658r;
    public Paint f39659r0;
    public boolean f39660s;
    public boolean f39661s0;
    public float f39662t0;
    public final tq f39663u0;
    public final Drawable f39664v0;
    public boolean f39665w;
    public float f39666w0;
    public s3 f39667x;
    public ImageView f39668x0;
    public final k0 f39669y;
    public boolean f39670y0;
    public boolean f39671z0;

    public y(k0 k0Var, r3 r3Var, f40 f40Var) {
        super(k0Var.getContext());
        this.D = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f39637a0 = 1.0f;
        this.f39652l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.A0 = new s(this, 1);
        this.B0 = new Rect();
        this.F = r3Var;
        int i7 = f40Var.f28669a;
        this.K = i7;
        tq tqVar = new tq(k0Var.getContext(), 2131230926, -1);
        this.f39663u0 = tqVar;
        tqVar.a(true, false);
        tqVar.f38368i = -org.telegram.messenger.g0.L(4.0f);
        tqVar.f38369j = org.telegram.messenger.g0.L(6.0f);
        tqVar.f38370k = org.telegram.messenger.g0.L(6.0f);
        tqVar.invalidateSelf();
        float N = org.telegram.messenger.g0.N(3.4f);
        tqVar.f38364c.setStrokeWidth(N);
        tqVar.d.setStrokeWidth(N * 1.47f);
        this.f39664v0 = k0Var.getContext().getResources().getDrawable(2131232679).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = id.M0(2131743224, null);
        String M02 = id.M0(2131743221, null);
        int L = org.telegram.messenger.g0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat M03 = qp.s1(i7).M0(Long.valueOf(r3Var.f25227c));
        StaticLayout staticLayout2 = new StaticLayout(id.a0("VoipVideoNotAvailable", null, 2131743226, id.G(qp.s1(i7).Z3, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M04 = id.M0(2131743222, null);
        u uVar = new u(this, k0Var.getContext(), r3Var, k0Var, textPaint, staticLayout2, textPaint2, M04, textPaint2.measureText(M04), staticLayout, f40Var, M0, textPaint.measureText(M0));
        this.f39636a = uVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        j2 j2Var = uVar.d;
        j2Var.setScalingType(scalingType);
        this.f39669y = k0Var;
        this.G = f40Var;
        j2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new v(this));
        TextureView textureView = uVar.f39346e;
        if (textureView != null) {
            j2Var.setBackgroundRenderer(textureView);
            if (!j2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        j2Var.setAlpha(0.0f);
        addView(uVar);
        x xVar = new x(this, getContext());
        this.f39639b0 = xVar;
        addView(xVar);
        m5 m5Var = new m5(k0Var.getContext());
        this.L = m5Var;
        m5Var.setTextSize(13);
        m5Var.setTextColor(i0.a.o(-1, 229));
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setFullTextMaxLines(1);
        m5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(m5Var, ha.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, ha.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(m6.x0(null, m6.f27919eh, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(k0Var.getContext());
        this.U = imageView;
        addView((View) imageView, ha.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(k0Var.getContext());
        this.V = imageView2;
        addView(imageView2, ha.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        imageView2.setImageDrawable(k0Var.getContext().getDrawable(2131232804));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L2 = org.telegram.messenger.g0.L(19.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = m6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(4, k0Var.getContext(), this);
        this.N = n2Var;
        n2Var.setText(id.M0(2131743220, null));
        n2Var.setTextSize(1, 15.0f);
        n2Var.setTypeface(org.telegram.messenger.g0.o());
        n2Var.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        n2Var.setTextColor(-1);
        n2Var.setBackground(k02);
        n2Var.setGravity(17);
        n2Var.setOnClickListener(new ii.g(this, 17));
        addView(n2Var, ha.e(-2, 38, 51));
        TextView textView = new TextView(k0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        t6.U(textView, m6.f27883ch, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (t3.w(14, M03)) {
            textView.setText(org.telegram.messenger.g0.X2(id.M0(2131748163, null)));
        } else {
            k5.r("NoRtmpStreamFromAppViewer", null, 2131748162, new Object[]{M03.title}, textView);
        }
        addView(textView, ha.e(-2, -2, 51));
    }

    public static y c(ArrayList arrayList, c20 c20Var, r rVar, g10 g10Var, r rVar2, s3 s3Var, r3 r3Var, f40 f40Var) {
        y yVar;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (s3Var.equals(((y) arrayList.get(i7)).f39667x)) {
                    yVar = (y) arrayList.get(i7);
                    break;
                }
                i7++;
            } else {
                yVar = null;
                break;
            }
        }
        if (yVar == null) {
            yVar = new y(c20Var, r3Var, f40Var);
        }
        if (rVar != null) {
            yVar.setPrimaryView(rVar);
        }
        if (g10Var != null) {
            yVar.setSecondaryView(g10Var);
        }
        if (rVar2 != null) {
            yVar.setTabletGridView(rVar2);
        }
        return yVar;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        x xVar = this.f39639b0;
        if (xVar.getVisibility() == 0) {
            x.a(xVar, true);
        }
    }

    public final void b(boolean z9) {
        this.P = true;
        this.f39665w = false;
        this.f39669y.f(this);
        if (z9) {
            if (this.f39667x.f25413a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f39667x.f25414b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                s3 s3Var = this.f39667x;
                sharedInstance.removeRemoteSink(s3Var.f25413a, s3Var.f25414b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f39641c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f39641c0.cancel();
        }
        this.f39636a.d.release();
    }

    public final void d() {
        String str;
        int f10;
        int f11;
        if (this.f39657q0 == null) {
            HashMap hashMap = this.F.h;
            s3 s3Var = this.f39667x;
            boolean z9 = s3Var.f25414b;
            TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f25413a;
            if (z9) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.f39657q0 = bitmap;
            this.f39636a.setThumb(bitmap);
            if (this.f39657q0 == null) {
                long B1 = ij.B1(this.f39667x.f25413a.peer);
                s3 s3Var2 = this.f39667x;
                boolean z10 = s3Var2.f25413a.self;
                ImageReceiver imageReceiver = this.f39652l0;
                if (z10 && s3Var2.f25414b) {
                    imageReceiver.w0(new qa0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                int i10 = this.K;
                if (i7 > 0) {
                    TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(B1));
                    hc l10 = hc.l(i10, 1, a22);
                    if (a22 != null) {
                        f11 = v8.d(a22.f27109id);
                    } else {
                        f11 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f11, -16777216), i0.a.f(0.4f, f11, -16777216)}), null, a22, 0);
                    return;
                }
                TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-B1));
                hc a10 = hc.a(1, M0);
                if (M0 != null) {
                    f10 = v8.d(M0.f26960id);
                } else {
                    f10 = i0.a.f(0.2f, -16777216, -1);
                }
                imageReceiver.q0(a10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f10, -16777216), i0.a.f(0.4f, f10, -16777216)}), null, M0, 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        boolean z9 = this.f39665w;
        k0 k0Var = this.f39669y;
        u uVar = this.f39636a;
        if (z9) {
            float y10 = (uVar.getY() + uVar.getMeasuredHeight()) - uVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.f39656p0;
            boolean z10 = this.h;
            ch0 ch0Var = this.U;
            if (!z10 && !this.f39645f) {
                if (!this.f39638b && !this.f39658r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - k0Var.f39304c);
                        ch0Var.setAlpha(1.0f - k0Var.f39304c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        ch0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!f40.f45503z5 && !f40.A5) {
                        measuredHeight = com.google.android.recaptcha.internal.a.v(1.0f, k0Var.W, org.telegram.messenger.g0.L(90.0f) * k0Var.f39304c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    ch0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - k0Var.f39317n);
                ch0Var.setAlpha(1.0f - k0Var.f39317n);
            }
            boolean z11 = this.f39638b;
            m5 m5Var = this.L;
            if (!z11 && !this.f39658r) {
                m5Var.setFullAlpha(0.0f);
            } else {
                m5Var.setFullAlpha(k0Var.f39304c);
            }
            ch0Var.setTranslationX(frameLayout.getX());
            ch0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((uVar.getMeasuredWidth() - (uVar.O * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.f39304c, 1.0f - k0Var.f39317n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f39670y0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(6.0f) * k0Var.f39304c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.f39665w) {
            n0 n0Var = this.f39654n0;
            if (n0Var != null) {
                boolean z12 = n0Var.f39396e;
                if (z12) {
                    float f10 = this.S;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.053333335f;
                        this.S = f11;
                        if (f11 > 1.0f) {
                            this.S = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z12) {
                    float f12 = this.S;
                    if (f12 != 0.0f) {
                        float f13 = f12 - 0.053333335f;
                        this.S = f13;
                        if (f13 < 0.0f) {
                            this.S = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f14 = this.S;
            float f15 = (1.0f - k0Var.f39317n) * (1.0f - k0Var.f39304c) * f14;
            if (f14 > 0.0f) {
                int i7 = (int) (f15 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i7);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f39656p0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(uVar.getX() + uVar.O, uVar.getY() + uVar.N, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.O, (uVar.getY() + uVar.getMeasuredHeight()) - uVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f39656p0);
                float f16 = uVar.f39341b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f39655o0 && (view == this.f39636a || view == this.f39639b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f39656p0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f39656p0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f39636a.d.release();
        n0 n0Var = this.f39654n0;
        if (n0Var != null) {
            this.G.f45557n4.add(n0Var);
            this.f39654n0.b();
            n0 n0Var2 = this.f39654n0;
            n0Var2.f39395c = null;
            n0Var2.c(false);
        }
        this.f39654n0 = null;
    }

    public final void f() {
        if (this.f39667x != null) {
            u uVar = this.f39636a;
            j2 j2Var = uVar.d;
            j2 j2Var2 = uVar.d;
            if (j2Var.getMeasuredHeight() != 0 && j2Var2.getMeasuredWidth() != 0) {
                j2Var2.getRenderBufferBitmap(new n3(this, 1));
            }
        }
    }

    public final void g(boolean z9, boolean z10) {
        boolean z11;
        if (this.f39653n != z9) {
            this.f39653n = z9;
            if ((this.f39640c != null || this.f39643e != null) && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            j(z11);
        }
    }

    public String getName() {
        long B1 = ij.B1(this.f39667x.f25413a.peer);
        if (org.telegram.messenger.m5.E(B1)) {
            return t10.p(qp.s1(org.telegram.messenger.c.a(p10.f24474s0).f21770a).a2(Long.valueOf(B1)));
        }
        return qp.s1(org.telegram.messenger.c.a(p10.f24474s0).f21770a).M0(Long.valueOf(-B1)).title;
    }

    public r getPrimaryView() {
        return this.f39640c;
    }

    public final void h(boolean z9, boolean z10) {
        if (this.f39638b != z9) {
            this.f39638b = z9;
            this.R = true;
            j(z10);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z9) {
        if (this.f39644e0 == f10 && this.f39646f0 == f11 && this.f39647g0 == f12 && this.f39648h0 == f13 && this.f39649i0 == f14) {
            return;
        }
        this.f39650j0 = z9;
        this.f39644e0 = f10;
        this.f39646f0 = f11;
        this.f39647g0 = f12;
        this.f39648h0 = f13;
        this.f39649i0 = f14;
        this.f39636a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f39636a.invalidate();
        }
        r rVar = this.f39640c;
        if (rVar != null) {
            rVar.invalidate();
            f40 f40Var = this.G;
            if (f40Var.R4 == this.f39640c) {
                f40Var.f28672b.invalidate();
            }
        }
        g10 g10Var = this.d;
        if (g10Var != null) {
            g10Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void j(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.y.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.y.k(boolean):void");
    }

    public final void l(int i7) {
        int measuredWidth = this.f39669y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
        if ((this.H0 != i7 && i7 > 0) || (this.I0 != measuredWidth && measuredWidth > 0)) {
            if (i7 != 0) {
                this.H0 = i7;
            }
            if (measuredWidth != 0) {
                this.I0 = measuredWidth;
            }
            this.L.h(measuredWidth - i7, 0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39652l0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39652l0.R();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.y.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.y.setAmplitude(double):void");
    }

    public void setPrimaryView(r rVar) {
        if (this.f39640c != rVar) {
            this.f39640c = rVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(g10 g10Var) {
        if (this.d != g10Var) {
            this.d = g10Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(r rVar) {
        if (this.f39643e != rVar) {
            this.f39643e = rVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }
}
