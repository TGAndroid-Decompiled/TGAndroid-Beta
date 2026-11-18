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
import c8.ma;
import di.p6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.r10;
import org.telegram.ui.b20;
import org.telegram.ui.f40;
import org.webrtc.RendererCommon;
public final class y extends FrameLayout implements m0 {
    public boolean A0;
    public final s B0;
    public final Rect C0;
    public p6 D0;
    public final Paint E;
    public int E0;
    public boolean F;
    public int F0;
    public final t3 G;
    public int G0;
    public final f40 H;
    public ValueAnimator H0;
    public boolean I;
    public int I0;
    public float J;
    public int J0;
    public final FrameLayout K;
    public ValueAnimator K0;
    public final int L;
    public boolean L0;
    public final n5 M;
    public int N;
    public final org.telegram.ui.ActionBar.o2 O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public final Paint U;
    public final ph0 V;
    public final ImageView W;
    public final u f41325a;
    public boolean f41326a0;
    public boolean f41327b;
    public float f41328b0;
    public r f41329c;
    public final x f41330c0;
    public r10 d;
    public ValueAnimator f41331d0;
    public r f41332e;
    public boolean f41333e0;
    public boolean f41334f;
    public float f41335f0;
    public float f41336g0;
    public boolean h;
    public float f41337h0;
    public float f41338i0;
    public float f41339j0;
    public boolean f41340k0;
    public float f41341l0;
    public final ImageReceiver m0;
    public boolean f41342n;
    public final ArrayList f41343n0;
    public n0 f41344o0;
    public boolean f41345p0;
    public float f41346q0;
    public boolean f41347r;
    public Bitmap f41348r0;
    public boolean f41349s;
    public Paint f41350s0;
    public boolean f41351t0;
    public float f41352u0;
    public final ir f41353v0;
    public boolean f41354w;
    public final Drawable f41355w0;
    public u3 f41356x;
    public float f41357x0;
    public final k0 f41358y;
    public ImageView f41359y0;
    public boolean f41360z0;

    public y(k0 k0Var, t3 t3Var, f40 f40Var) {
        super(k0Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.U = paint;
        this.f41328b0 = 1.0f;
        this.m0 = new ImageReceiver(null);
        this.f41343n0 = new ArrayList();
        this.B0 = new s(this, 1);
        this.C0 = new Rect();
        this.G = t3Var;
        int i7 = f40Var.f30189a;
        this.L = i7;
        ir irVar = new ir(k0Var.getContext(), 2131230926, -1);
        this.f41353v0 = irVar;
        irVar.a(true, false);
        irVar.f36174i = -org.telegram.messenger.g0.L(4.0f);
        irVar.f36175j = org.telegram.messenger.g0.L(6.0f);
        irVar.f36176k = org.telegram.messenger.g0.L(6.0f);
        irVar.invalidateSelf();
        float N = org.telegram.messenger.g0.N(3.4f);
        irVar.f36170c.setStrokeWidth(N);
        irVar.d.setStrokeWidth(N * 1.47f);
        this.f41355w0 = k0Var.getContext().getResources().getDrawable(2131232681).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = gd.M0(2131742987, null);
        String M02 = gd.M0(2131742984, null);
        int L = org.telegram.messenger.g0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(t3Var.f26938c));
        StaticLayout staticLayout2 = new StaticLayout(gd.a0("VoipVideoNotAvailable", null, 2131742989, gd.G(mp.u1(i7).f25620c4, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M03 = gd.M0(2131742985, null);
        u uVar = new u(this, k0Var.getContext(), t3Var, k0Var, textPaint, staticLayout2, textPaint2, M03, textPaint2.measureText(M03), staticLayout, f40Var, M0, textPaint.measureText(M0));
        this.f41325a = uVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        m2 m2Var = uVar.d;
        m2Var.setScalingType(scalingType);
        this.f41358y = k0Var;
        this.H = f40Var;
        m2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new v(this));
        TextureView textureView = uVar.f41081e;
        if (textureView != null) {
            m2Var.setBackgroundRenderer(textureView);
            if (!m2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        m2Var.setAlpha(0.0f);
        addView(uVar);
        x xVar = new x(this, getContext());
        this.f41330c0 = xVar;
        addView(xVar);
        n5 n5Var = new n5(k0Var.getContext());
        this.M = n5Var;
        n5Var.setTextSize(13);
        n5Var.setTextColor(i0.a.o(-1, 229));
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setFullTextMaxLines(1);
        n5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(n5Var, ma.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, ma.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(n6.x0(null, n6.f29479hh, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(k0Var.getContext());
        this.V = imageView;
        addView((View) imageView, ma.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(k0Var.getContext());
        this.W = imageView2;
        addView(imageView2, ma.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        imageView2.setImageDrawable(k0Var.getContext().getDrawable(2131232807));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L2 = org.telegram.messenger.g0.L(19.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = n6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.o2 o2Var = new org.telegram.ui.ActionBar.o2(4, k0Var.getContext(), this);
        this.O = o2Var;
        o2Var.setText(gd.M0(2131742983, null));
        o2Var.setTextSize(1, 15.0f);
        o2Var.setTypeface(org.telegram.messenger.g0.o());
        o2Var.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        o2Var.setTextColor(-1);
        o2Var.setBackground(k02);
        o2Var.setGravity(17);
        o2Var.setOnClickListener(new hi.o0(this, 25));
        addView(o2Var, ma.e(-2, 38, 51));
        TextView textView = new TextView(k0Var.getContext());
        this.P = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        u6.U(textView, n6.f29442fh, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (v3.w(14, O0)) {
            textView.setText(org.telegram.messenger.g0.W2(gd.M0(2131747971, null)));
        } else {
            org.telegram.messenger.f3.q("NoRtmpStreamFromAppViewer", null, 2131747970, new Object[]{O0.title}, textView);
        }
        addView(textView, ma.e(-2, -2, 51));
    }

    public static y c(ArrayList arrayList, b20 b20Var, r rVar, r10 r10Var, r rVar2, u3 u3Var, t3 t3Var, f40 f40Var) {
        y yVar;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (u3Var.equals(((y) arrayList.get(i7)).f41356x)) {
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
            yVar = new y(b20Var, t3Var, f40Var);
        }
        if (rVar != null) {
            yVar.setPrimaryView(rVar);
        }
        if (r10Var != null) {
            yVar.setSecondaryView(r10Var);
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
        x xVar = this.f41330c0;
        if (xVar.getVisibility() == 0) {
            x.a(xVar, true);
        }
    }

    public final void b(boolean z10) {
        this.Q = true;
        this.f41354w = false;
        this.f41358y.f(this);
        if (z10) {
            if (this.f41356x.f27119a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f41356x.f27120b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                u3 u3Var = this.f41356x;
                sharedInstance.removeRemoteSink(u3Var.f27119a, u3Var.f27120b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f41331d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f41331d0.cancel();
        }
        this.f41325a.d.release();
    }

    public final void d() {
        String str;
        int f10;
        int f11;
        if (this.f41348r0 == null) {
            HashMap hashMap = this.G.h;
            u3 u3Var = this.f41356x;
            boolean z10 = u3Var.f27120b;
            TLRPC.GroupCallParticipant groupCallParticipant = u3Var.f27119a;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.f41348r0 = bitmap;
            this.f41325a.setThumb(bitmap);
            if (this.f41348r0 == null) {
                long B1 = fj.B1(this.f41356x.f27119a.peer);
                u3 u3Var2 = this.f41356x;
                boolean z11 = u3Var2.f27119a.self;
                ImageReceiver imageReceiver = this.m0;
                if (z11 && u3Var2.f27120b) {
                    imageReceiver.w0(new bb0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                int i10 = this.L;
                if (i7 > 0) {
                    TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(B1));
                    fc l10 = fc.l(i10, 1, c22);
                    if (c22 != null) {
                        f11 = b9.d(c22.f28554id);
                    } else {
                        f11 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f11, -16777216), i0.a.f(0.4f, f11, -16777216)}), null, c22, 0);
                    return;
                }
                TLRPC.Chat O0 = mp.u1(i10).O0(Long.valueOf(-B1));
                fc a10 = fc.a(1, O0);
                if (O0 != null) {
                    f10 = b9.d(O0.f28405id);
                } else {
                    f10 = i0.a.f(0.2f, -16777216, -1);
                }
                imageReceiver.q0(a10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f10, -16777216), i0.a.f(0.4f, f10, -16777216)}), null, O0, 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        boolean z10 = this.f41354w;
        k0 k0Var = this.f41358y;
        u uVar = this.f41325a;
        if (z10) {
            float y10 = (uVar.getY() + uVar.getMeasuredHeight()) - uVar.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.f41346q0;
            boolean z11 = this.h;
            ph0 ph0Var = this.V;
            if (!z11 && !this.f41334f) {
                if (!this.f41327b && !this.f41347r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - k0Var.f40975c);
                        ph0Var.setAlpha(1.0f - k0Var.f40975c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        ph0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!f40.E5 && !f40.F5) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.t(1.0f, k0Var.f40972a0, org.telegram.messenger.g0.L(90.0f) * k0Var.f40975c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    ph0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - k0Var.f40988n);
                ph0Var.setAlpha(1.0f - k0Var.f40988n);
            }
            boolean z12 = this.f41327b;
            n5 n5Var = this.M;
            if (!z12 && !this.f41347r) {
                n5Var.setFullAlpha(0.0f);
            } else {
                n5Var.setFullAlpha(k0Var.f40975c);
            }
            ph0Var.setTranslationX(frameLayout.getX());
            ph0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.W;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((uVar.getMeasuredWidth() - (uVar.P * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.f40975c, 1.0f - k0Var.f40988n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f41360z0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(6.0f) * k0Var.f40975c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.f41354w) {
            n0 n0Var = this.f41344o0;
            if (n0Var != null) {
                boolean z13 = n0Var.f41063e;
                if (z13) {
                    float f10 = this.T;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.053333335f;
                        this.T = f11;
                        if (f11 > 1.0f) {
                            this.T = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f12 = this.T;
                    if (f12 != 0.0f) {
                        float f13 = f12 - 0.053333335f;
                        this.T = f13;
                        if (f13 < 0.0f) {
                            this.T = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f14 = this.T;
            float f15 = (1.0f - k0Var.f40988n) * (1.0f - k0Var.f40975c) * f14;
            if (f14 > 0.0f) {
                int i7 = (int) (f15 * 255.0f);
                Paint paint = this.U;
                paint.setAlpha(i7);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f41346q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(uVar.getX() + uVar.P, uVar.getY() + uVar.O, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.P, (uVar.getY() + uVar.getMeasuredHeight()) - uVar.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f41346q0);
                float f16 = uVar.f41076b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f41345p0 && (view == this.f41325a || view == this.f41330c0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f41346q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f41346q0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f41325a.d.release();
        n0 n0Var = this.f41344o0;
        if (n0Var != null) {
            this.H.f47520s4.add(n0Var);
            this.f41344o0.b();
            n0 n0Var2 = this.f41344o0;
            n0Var2.f41062c = null;
            n0Var2.c(false);
        }
        this.f41344o0 = null;
    }

    public final void f() {
        if (this.f41356x != null) {
            u uVar = this.f41325a;
            m2 m2Var = uVar.d;
            m2 m2Var2 = uVar.d;
            if (m2Var.getMeasuredHeight() != 0 && m2Var2.getMeasuredWidth() != 0) {
                m2Var2.getRenderBufferBitmap(new org.telegram.ui.ActionBar.p(this, 6));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f41342n != z10) {
            this.f41342n = z10;
            if ((this.f41329c != null || this.f41332e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long B1 = fj.B1(this.f41356x.f27119a.peer);
        if (org.telegram.messenger.n5.E(B1)) {
            return o10.q(mp.u1(org.telegram.messenger.c.a(j10.f24773t0).f23221a).c2(Long.valueOf(B1)));
        }
        return mp.u1(org.telegram.messenger.c.a(j10.f24773t0).f23221a).O0(Long.valueOf(-B1)).title;
    }

    public r getPrimaryView() {
        return this.f41329c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f41327b != z10) {
            this.f41327b = z10;
            this.S = true;
            j(z11);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f41335f0 == f10 && this.f41336g0 == f11 && this.f41337h0 == f12 && this.f41338i0 == f13 && this.f41339j0 == f14) {
            return;
        }
        this.f41340k0 = z10;
        this.f41335f0 = f10;
        this.f41336g0 = f11;
        this.f41337h0 = f12;
        this.f41338i0 = f13;
        this.f41339j0 = f14;
        this.f41325a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.R) {
            this.f41325a.invalidate();
        }
        r rVar = this.f41329c;
        if (rVar != null) {
            rVar.invalidate();
            f40 f40Var = this.H;
            if (f40Var.W4 == this.f41329c) {
                f40Var.f30192b.invalidate();
            }
        }
        r10 r10Var = this.d;
        if (r10Var != null) {
            r10Var.invalidate();
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
        int measuredWidth = this.f41358y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
        if ((this.I0 != i7 && i7 > 0) || (this.J0 != measuredWidth && measuredWidth > 0)) {
            if (i7 != 0) {
                this.I0 = i7;
            }
            if (measuredWidth != 0) {
                this.J0 = measuredWidth;
            }
            this.M.h(measuredWidth - i7, 0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0.R();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.y.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.y.setAmplitude(double):void");
    }

    public void setPrimaryView(r rVar) {
        if (this.f41329c != rVar) {
            this.f41329c = rVar;
            this.S = true;
            j(true);
        }
    }

    public void setSecondaryView(r10 r10Var) {
        if (this.d != r10Var) {
            this.d = r10Var;
            this.S = true;
            j(true);
        }
    }

    public void setTabletGridView(r rVar) {
        if (this.f41332e != rVar) {
            this.f41332e = rVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }
}
