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
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w8;
import org.telegram.ui.c40;
import org.telegram.ui.z10;
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
    public final c40 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final k5 L;
    public int M;
    public final org.telegram.ui.ActionBar.m2 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final ch0 U;
    public final ImageView V;
    public boolean W;
    public final u f39590a;
    public float f39591a0;
    public boolean f39592b;
    public final x f39593b0;
    public r f39594c;
    public ValueAnimator f39595c0;
    public g10 d;
    public boolean f39596d0;
    public r f39597e;
    public float f39598e0;
    public boolean f39599f;
    public float f39600f0;
    public float f39601g0;
    public boolean h;
    public float f39602h0;
    public float f39603i0;
    public boolean f39604j0;
    public float f39605k0;
    public final ImageReceiver f39606l0;
    public final ArrayList m0;
    public boolean f39607n;
    public n0 f39608n0;
    public boolean f39609o0;
    public float f39610p0;
    public Bitmap f39611q0;
    public boolean f39612r;
    public Paint f39613r0;
    public boolean f39614s;
    public boolean f39615s0;
    public float f39616t0;
    public final uq f39617u0;
    public final Drawable f39618v0;
    public boolean f39619w;
    public float f39620w0;
    public s3 f39621x;
    public ImageView f39622x0;
    public final k0 f39623y;
    public boolean f39624y0;
    public boolean f39625z0;

    public y(k0 k0Var, r3 r3Var, c40 c40Var) {
        super(k0Var.getContext());
        this.D = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f39591a0 = 1.0f;
        this.f39606l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.A0 = new s(this, 1);
        this.B0 = new Rect();
        this.F = r3Var;
        int i7 = c40Var.f28613a;
        this.K = i7;
        uq uqVar = new uq(k0Var.getContext(), 2131230926, -1);
        this.f39617u0 = uqVar;
        uqVar.a(true, false);
        uqVar.f38694i = -org.telegram.messenger.g0.L(4.0f);
        uqVar.f38695j = org.telegram.messenger.g0.L(6.0f);
        uqVar.f38696k = org.telegram.messenger.g0.L(6.0f);
        uqVar.invalidateSelf();
        float N = org.telegram.messenger.g0.N(3.4f);
        uqVar.f38690c.setStrokeWidth(N);
        uqVar.d.setStrokeWidth(N * 1.47f);
        this.f39618v0 = k0Var.getContext().getResources().getDrawable(2131232679).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = hd.M0(2131743225, null);
        String M02 = hd.M0(2131743222, null);
        int L = org.telegram.messenger.g0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat M03 = qp.s1(i7).M0(Long.valueOf(r3Var.f25210c));
        StaticLayout staticLayout2 = new StaticLayout(hd.a0("VoipVideoNotAvailable", null, 2131743227, hd.G(qp.s1(i7).Z3, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M04 = hd.M0(2131743223, null);
        u uVar = new u(this, k0Var.getContext(), r3Var, k0Var, textPaint, staticLayout2, textPaint2, M04, textPaint2.measureText(M04), staticLayout, c40Var, M0, textPaint.measureText(M0));
        this.f39590a = uVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        j2 j2Var = uVar.d;
        j2Var.setScalingType(scalingType);
        this.f39623y = k0Var;
        this.G = c40Var;
        j2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new v(this));
        TextureView textureView = uVar.f39302e;
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
        this.f39593b0 = xVar;
        addView(xVar);
        k5 k5Var = new k5(k0Var.getContext());
        this.L = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(i0.a.o(-1, 229));
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setFullTextMaxLines(1);
        k5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(k5Var, ha.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, ha.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(k6.x0(null, k6.f27878eh, false));
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
        org.telegram.ui.Cells.y k02 = k6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(4, k0Var.getContext(), this);
        this.N = m2Var;
        m2Var.setText(hd.M0(2131743221, null));
        m2Var.setTextSize(1, 15.0f);
        m2Var.setTypeface(org.telegram.messenger.g0.o());
        m2Var.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        m2Var.setTextColor(-1);
        m2Var.setBackground(k02);
        m2Var.setGravity(17);
        m2Var.setOnClickListener(new ii.g(this, 17));
        addView(m2Var, ha.e(-2, 38, 51));
        TextView textView = new TextView(k0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        r6.V(textView, k6.f27842ch, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (t3.w(14, M03)) {
            textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131748162, null)));
        } else {
            org.telegram.messenger.k5.r("NoRtmpStreamFromAppViewer", null, 2131748161, new Object[]{M03.title}, textView);
        }
        addView(textView, ha.e(-2, -2, 51));
    }

    public static y c(ArrayList arrayList, z10 z10Var, r rVar, g10 g10Var, r rVar2, s3 s3Var, r3 r3Var, c40 c40Var) {
        y yVar;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (s3Var.equals(((y) arrayList.get(i7)).f39621x)) {
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
            yVar = new y(z10Var, r3Var, c40Var);
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
        x xVar = this.f39593b0;
        if (xVar.getVisibility() == 0) {
            x.a(xVar, true);
        }
    }

    public final void b(boolean z9) {
        this.P = true;
        this.f39619w = false;
        this.f39623y.f(this);
        if (z9) {
            if (this.f39621x.f25413a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f39621x.f25414b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                s3 s3Var = this.f39621x;
                sharedInstance.removeRemoteSink(s3Var.f25413a, s3Var.f25414b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f39595c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f39595c0.cancel();
        }
        this.f39590a.d.release();
    }

    public final void d() {
        String str;
        int f10;
        int f11;
        if (this.f39611q0 == null) {
            HashMap hashMap = this.F.h;
            s3 s3Var = this.f39621x;
            boolean z9 = s3Var.f25414b;
            TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f25413a;
            if (z9) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.f39611q0 = bitmap;
            this.f39590a.setThumb(bitmap);
            if (this.f39611q0 == null) {
                long C1 = ij.C1(this.f39621x.f25413a.peer);
                s3 s3Var2 = this.f39621x;
                boolean z10 = s3Var2.f25413a.self;
                ImageReceiver imageReceiver = this.f39606l0;
                if (z10 && s3Var2.f25414b) {
                    imageReceiver.w0(new qa0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i7 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
                int i10 = this.K;
                if (i7 > 0) {
                    TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(C1));
                    hc l10 = hc.l(i10, 1, a22);
                    if (a22 != null) {
                        f11 = w8.d(a22.f27102id);
                    } else {
                        f11 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f11, -16777216), i0.a.f(0.4f, f11, -16777216)}), null, a22, 0);
                    return;
                }
                TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-C1));
                hc a10 = hc.a(1, M0);
                if (M0 != null) {
                    f10 = w8.d(M0.f26953id);
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
        boolean z9 = this.f39619w;
        k0 k0Var = this.f39623y;
        u uVar = this.f39590a;
        if (z9) {
            float y10 = (uVar.getY() + uVar.getMeasuredHeight()) - uVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.f39610p0;
            boolean z10 = this.h;
            ch0 ch0Var = this.U;
            if (!z10 && !this.f39599f) {
                if (!this.f39592b && !this.f39612r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - k0Var.f39260c);
                        ch0Var.setAlpha(1.0f - k0Var.f39260c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        ch0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!c40.f44541w5 && !c40.f44542x5) {
                        measuredHeight = com.google.android.recaptcha.internal.a.v(1.0f, k0Var.W, org.telegram.messenger.g0.L(90.0f) * k0Var.f39260c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    ch0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - k0Var.f39273n);
                ch0Var.setAlpha(1.0f - k0Var.f39273n);
            }
            boolean z11 = this.f39592b;
            k5 k5Var = this.L;
            if (!z11 && !this.f39612r) {
                k5Var.setFullAlpha(0.0f);
            } else {
                k5Var.setFullAlpha(k0Var.f39260c);
            }
            ch0Var.setTranslationX(frameLayout.getX());
            ch0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((uVar.getMeasuredWidth() - (uVar.O * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.f39260c, 1.0f - k0Var.f39273n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f39624y0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(6.0f) * k0Var.f39260c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.f39619w) {
            n0 n0Var = this.f39608n0;
            if (n0Var != null) {
                boolean z12 = n0Var.f39352e;
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
            float f15 = (1.0f - k0Var.f39273n) * (1.0f - k0Var.f39260c) * f14;
            if (f14 > 0.0f) {
                int i7 = (int) (f15 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i7);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f39610p0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(uVar.getX() + uVar.O, uVar.getY() + uVar.N, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.O, (uVar.getY() + uVar.getMeasuredHeight()) - uVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f39610p0);
                float f16 = uVar.f39297b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f39609o0 && (view == this.f39590a || view == this.f39593b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f39610p0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f39610p0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f39590a.d.release();
        n0 n0Var = this.f39608n0;
        if (n0Var != null) {
            this.G.f44588k4.add(n0Var);
            this.f39608n0.b();
            n0 n0Var2 = this.f39608n0;
            n0Var2.f39351c = null;
            n0Var2.c(false);
        }
        this.f39608n0 = null;
    }

    public final void f() {
        if (this.f39621x != null) {
            u uVar = this.f39590a;
            j2 j2Var = uVar.d;
            j2 j2Var2 = uVar.d;
            if (j2Var.getMeasuredHeight() != 0 && j2Var2.getMeasuredWidth() != 0) {
                j2Var2.getRenderBufferBitmap(new m3(this, 1));
            }
        }
    }

    public final void g(boolean z9, boolean z10) {
        boolean z11;
        if (this.f39607n != z9) {
            this.f39607n = z9;
            if ((this.f39594c != null || this.f39597e != null) && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            j(z11);
        }
    }

    public String getName() {
        long C1 = ij.C1(this.f39621x.f25413a.peer);
        if (m5.E(C1)) {
            return t10.p(qp.s1(org.telegram.messenger.c.a(p10.f24467s0).f21729a).a2(Long.valueOf(C1)));
        }
        return qp.s1(org.telegram.messenger.c.a(p10.f24467s0).f21729a).M0(Long.valueOf(-C1)).title;
    }

    public r getPrimaryView() {
        return this.f39594c;
    }

    public final void h(boolean z9, boolean z10) {
        if (this.f39592b != z9) {
            this.f39592b = z9;
            this.R = true;
            j(z10);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z9) {
        if (this.f39598e0 == f10 && this.f39600f0 == f11 && this.f39601g0 == f12 && this.f39602h0 == f13 && this.f39603i0 == f14) {
            return;
        }
        this.f39604j0 = z9;
        this.f39598e0 = f10;
        this.f39600f0 = f11;
        this.f39601g0 = f12;
        this.f39602h0 = f13;
        this.f39603i0 = f14;
        this.f39590a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f39590a.invalidate();
        }
        r rVar = this.f39594c;
        if (rVar != null) {
            rVar.invalidate();
            c40 c40Var = this.G;
            if (c40Var.O4 == this.f39594c) {
                c40Var.f28616b.invalidate();
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
        int measuredWidth = this.f39623y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
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
        this.f39606l0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39606l0.R();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.y.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.y.setAmplitude(double):void");
    }

    public void setPrimaryView(r rVar) {
        if (this.f39594c != rVar) {
            this.f39594c = rVar;
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
        if (this.f39597e != rVar) {
            this.f39597e = rVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }
}
