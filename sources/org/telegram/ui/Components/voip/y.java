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
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w8;
import org.telegram.ui.b20;
import org.telegram.ui.e40;
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
    public final e40 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final l5 L;
    public int M;
    public final org.telegram.ui.ActionBar.m2 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final dh0 U;
    public final ImageView V;
    public boolean W;
    public final u f39714a;
    public float f39715a0;
    public boolean f39716b;
    public final x f39717b0;
    public r f39718c;
    public ValueAnimator f39719c0;
    public h10 d;
    public boolean f39720d0;
    public r f39721e;
    public float f39722e0;
    public boolean f39723f;
    public float f39724f0;
    public float f39725g0;
    public boolean h;
    public float f39726h0;
    public float f39727i0;
    public boolean f39728j0;
    public float f39729k0;
    public final ImageReceiver f39730l0;
    public final ArrayList m0;
    public boolean f39731n;
    public n0 f39732n0;
    public boolean f39733o0;
    public float f39734p0;
    public Bitmap f39735q0;
    public boolean f39736r;
    public Paint f39737r0;
    public boolean f39738s;
    public boolean f39739s0;
    public float f39740t0;
    public final uq f39741u0;
    public final Drawable f39742v0;
    public boolean f39743w;
    public float f39744w0;
    public s3 f39745x;
    public ImageView f39746x0;
    public final k0 f39747y;
    public boolean f39748y0;
    public boolean f39749z0;

    public y(k0 k0Var, r3 r3Var, e40 e40Var) {
        super(k0Var.getContext());
        this.D = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f39715a0 = 1.0f;
        this.f39730l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.A0 = new s(this, 1);
        this.B0 = new Rect();
        this.F = r3Var;
        int i7 = e40Var.f28621a;
        this.K = i7;
        uq uqVar = new uq(k0Var.getContext(), 2131230926, -1);
        this.f39741u0 = uqVar;
        uqVar.a(true, false);
        uqVar.f38774i = -org.telegram.messenger.g0.L(4.0f);
        uqVar.f38775j = org.telegram.messenger.g0.L(6.0f);
        uqVar.f38776k = org.telegram.messenger.g0.L(6.0f);
        uqVar.invalidateSelf();
        float N = org.telegram.messenger.g0.N(3.4f);
        uqVar.f38770c.setStrokeWidth(N);
        uqVar.d.setStrokeWidth(N * 1.47f);
        this.f39742v0 = k0Var.getContext().getResources().getDrawable(2131232679).mutate();
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
        TLRPC.Chat M03 = qp.s1(i7).M0(Long.valueOf(r3Var.f25223c));
        StaticLayout staticLayout2 = new StaticLayout(id.a0("VoipVideoNotAvailable", null, 2131743226, id.G(qp.s1(i7).Z3, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M04 = id.M0(2131743222, null);
        u uVar = new u(this, k0Var.getContext(), r3Var, k0Var, textPaint, staticLayout2, textPaint2, M04, textPaint2.measureText(M04), staticLayout, e40Var, M0, textPaint.measureText(M0));
        this.f39714a = uVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        j2 j2Var = uVar.d;
        j2Var.setScalingType(scalingType);
        this.f39747y = k0Var;
        this.G = e40Var;
        j2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new v(this));
        TextureView textureView = uVar.f39426e;
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
        this.f39717b0 = xVar;
        addView(xVar);
        l5 l5Var = new l5(k0Var.getContext());
        this.L = l5Var;
        l5Var.setTextSize(13);
        l5Var.setTextColor(i0.a.o(-1, 229));
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        l5Var.setFullTextMaxLines(1);
        l5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(l5Var, ha.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, ha.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(l6.x0(null, l6.f27894eh, false));
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
        org.telegram.ui.Cells.y k02 = l6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(4, k0Var.getContext(), this);
        this.N = m2Var;
        m2Var.setText(id.M0(2131743220, null));
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
        s6.U(textView, l6.f27858ch, null);
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

    public static y c(ArrayList arrayList, b20 b20Var, r rVar, h10 h10Var, r rVar2, s3 s3Var, r3 r3Var, e40 e40Var) {
        y yVar;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (s3Var.equals(((y) arrayList.get(i7)).f39745x)) {
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
            yVar = new y(b20Var, r3Var, e40Var);
        }
        if (rVar != null) {
            yVar.setPrimaryView(rVar);
        }
        if (h10Var != null) {
            yVar.setSecondaryView(h10Var);
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
        x xVar = this.f39717b0;
        if (xVar.getVisibility() == 0) {
            x.a(xVar, true);
        }
    }

    public final void b(boolean z9) {
        this.P = true;
        this.f39743w = false;
        this.f39747y.f(this);
        if (z9) {
            if (this.f39745x.f25409a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f39745x.f25410b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                s3 s3Var = this.f39745x;
                sharedInstance.removeRemoteSink(s3Var.f25409a, s3Var.f25410b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f39719c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f39719c0.cancel();
        }
        this.f39714a.d.release();
    }

    public final void d() {
        String str;
        int f10;
        int f11;
        if (this.f39735q0 == null) {
            HashMap hashMap = this.F.h;
            s3 s3Var = this.f39745x;
            boolean z9 = s3Var.f25410b;
            TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f25409a;
            if (z9) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.f39735q0 = bitmap;
            this.f39714a.setThumb(bitmap);
            if (this.f39735q0 == null) {
                long B1 = ij.B1(this.f39745x.f25409a.peer);
                s3 s3Var2 = this.f39745x;
                boolean z10 = s3Var2.f25409a.self;
                ImageReceiver imageReceiver = this.f39730l0;
                if (z10 && s3Var2.f25410b) {
                    imageReceiver.w0(new ra0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                int i10 = this.K;
                if (i7 > 0) {
                    TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(B1));
                    hc l10 = hc.l(i10, 1, a22);
                    if (a22 != null) {
                        f11 = w8.d(a22.f27105id);
                    } else {
                        f11 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f11, -16777216), i0.a.f(0.4f, f11, -16777216)}), null, a22, 0);
                    return;
                }
                TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-B1));
                hc a10 = hc.a(1, M0);
                if (M0 != null) {
                    f10 = w8.d(M0.f26956id);
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
        boolean z9 = this.f39743w;
        k0 k0Var = this.f39747y;
        u uVar = this.f39714a;
        if (z9) {
            float y10 = (uVar.getY() + uVar.getMeasuredHeight()) - uVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.f39734p0;
            boolean z10 = this.h;
            dh0 dh0Var = this.U;
            if (!z10 && !this.f39723f) {
                if (!this.f39716b && !this.f39736r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - k0Var.f39384c);
                        dh0Var.setAlpha(1.0f - k0Var.f39384c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        dh0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!e40.f45184w5 && !e40.f45185x5) {
                        measuredHeight = com.google.android.recaptcha.internal.a.v(1.0f, k0Var.W, org.telegram.messenger.g0.L(90.0f) * k0Var.f39384c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    dh0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - k0Var.f39397n);
                dh0Var.setAlpha(1.0f - k0Var.f39397n);
            }
            boolean z11 = this.f39716b;
            l5 l5Var = this.L;
            if (!z11 && !this.f39736r) {
                l5Var.setFullAlpha(0.0f);
            } else {
                l5Var.setFullAlpha(k0Var.f39384c);
            }
            dh0Var.setTranslationX(frameLayout.getX());
            dh0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((uVar.getMeasuredWidth() - (uVar.O * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.f39384c, 1.0f - k0Var.f39397n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f39748y0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(6.0f) * k0Var.f39384c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.f39743w) {
            n0 n0Var = this.f39732n0;
            if (n0Var != null) {
                boolean z12 = n0Var.f39476e;
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
            float f15 = (1.0f - k0Var.f39397n) * (1.0f - k0Var.f39384c) * f14;
            if (f14 > 0.0f) {
                int i7 = (int) (f15 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i7);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f39734p0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(uVar.getX() + uVar.O, uVar.getY() + uVar.N, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.O, (uVar.getY() + uVar.getMeasuredHeight()) - uVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f39734p0);
                float f16 = uVar.f39421b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f39733o0 && (view == this.f39714a || view == this.f39717b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f39734p0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f39734p0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f39714a.d.release();
        n0 n0Var = this.f39732n0;
        if (n0Var != null) {
            this.G.f45231k4.add(n0Var);
            this.f39732n0.b();
            n0 n0Var2 = this.f39732n0;
            n0Var2.f39475c = null;
            n0Var2.c(false);
        }
        this.f39732n0 = null;
    }

    public final void f() {
        if (this.f39745x != null) {
            u uVar = this.f39714a;
            j2 j2Var = uVar.d;
            j2 j2Var2 = uVar.d;
            if (j2Var.getMeasuredHeight() != 0 && j2Var2.getMeasuredWidth() != 0) {
                j2Var2.getRenderBufferBitmap(new m3(this, 1));
            }
        }
    }

    public final void g(boolean z9, boolean z10) {
        boolean z11;
        if (this.f39731n != z9) {
            this.f39731n = z9;
            if ((this.f39718c != null || this.f39721e != null) && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            j(z11);
        }
    }

    public String getName() {
        long B1 = ij.B1(this.f39745x.f25409a.peer);
        if (m5.E(B1)) {
            return t10.p(qp.s1(org.telegram.messenger.c.a(p10.f24470s0).f21765a).a2(Long.valueOf(B1)));
        }
        return qp.s1(org.telegram.messenger.c.a(p10.f24470s0).f21765a).M0(Long.valueOf(-B1)).title;
    }

    public r getPrimaryView() {
        return this.f39718c;
    }

    public final void h(boolean z9, boolean z10) {
        if (this.f39716b != z9) {
            this.f39716b = z9;
            this.R = true;
            j(z10);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z9) {
        if (this.f39722e0 == f10 && this.f39724f0 == f11 && this.f39725g0 == f12 && this.f39726h0 == f13 && this.f39727i0 == f14) {
            return;
        }
        this.f39728j0 = z9;
        this.f39722e0 = f10;
        this.f39724f0 = f11;
        this.f39725g0 = f12;
        this.f39726h0 = f13;
        this.f39727i0 = f14;
        this.f39714a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f39714a.invalidate();
        }
        r rVar = this.f39718c;
        if (rVar != null) {
            rVar.invalidate();
            e40 e40Var = this.G;
            if (e40Var.O4 == this.f39718c) {
                e40Var.f28624b.invalidate();
            }
        }
        h10 h10Var = this.d;
        if (h10Var != null) {
            h10Var.invalidate();
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
        int measuredWidth = this.f39747y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
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
        this.f39730l0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39730l0.R();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.y.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.y.setAmplitude(double):void");
    }

    public void setPrimaryView(r rVar) {
        if (this.f39718c != rVar) {
            this.f39718c = rVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(h10 h10Var) {
        if (this.d != h10Var) {
            this.d = h10Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(r rVar) {
        if (this.f39721e != rVar) {
            this.f39721e = rVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }
}
