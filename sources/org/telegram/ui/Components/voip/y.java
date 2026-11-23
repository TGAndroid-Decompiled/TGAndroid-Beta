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
import hi.o4;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.u10;
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
    public final m5 M;
    public int N;
    public final org.telegram.ui.ActionBar.n2 O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public final Paint U;
    public final rh0 V;
    public final ImageView W;
    public final u f41462a;
    public boolean f41463a0;
    public boolean f41464b;
    public float f41465b0;
    public r f41466c;
    public final x f41467c0;
    public u10 d;
    public ValueAnimator f41468d0;
    public r f41469e;
    public boolean f41470e0;
    public boolean f41471f;
    public float f41472f0;
    public float f41473g0;
    public boolean h;
    public float f41474h0;
    public float f41475i0;
    public float f41476j0;
    public boolean f41477k0;
    public float f41478l0;
    public final ImageReceiver m0;
    public boolean f41479n;
    public final ArrayList f41480n0;
    public n0 f41481o0;
    public boolean f41482p0;
    public float f41483q0;
    public boolean f41484r;
    public Bitmap f41485r0;
    public boolean f41486s;
    public Paint f41487s0;
    public boolean f41488t0;
    public float f41489u0;
    public final kr f41490v0;
    public boolean f41491w;
    public final Drawable f41492w0;
    public u3 f41493x;
    public float f41494x0;
    public final k0 f41495y;
    public ImageView f41496y0;
    public boolean f41497z0;

    public y(k0 k0Var, t3 t3Var, f40 f40Var) {
        super(k0Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.U = paint;
        this.f41465b0 = 1.0f;
        this.m0 = new ImageReceiver(null);
        this.f41480n0 = new ArrayList();
        this.B0 = new s(this, 1);
        this.C0 = new Rect();
        this.G = t3Var;
        int i7 = f40Var.f30173a;
        this.L = i7;
        kr krVar = new kr(k0Var.getContext(), 2131230926, -1);
        this.f41490v0 = krVar;
        krVar.a(true, false);
        krVar.f36958i = -org.telegram.messenger.g0.L(4.0f);
        krVar.f36959j = org.telegram.messenger.g0.L(6.0f);
        krVar.f36960k = org.telegram.messenger.g0.L(6.0f);
        krVar.invalidateSelf();
        float N = org.telegram.messenger.g0.N(3.4f);
        krVar.f36954c.setStrokeWidth(N);
        krVar.d.setStrokeWidth(N * 1.47f);
        this.f41492w0 = k0Var.getContext().getResources().getDrawable(2131232681).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        String N0 = hd.N0(2131742979, null);
        String N02 = hd.N0(2131742976, null);
        int L = org.telegram.messenger.g0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(N02, textPaint, L, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(t3Var.f26951c));
        StaticLayout staticLayout2 = new StaticLayout(hd.a0("VoipVideoNotAvailable", null, 2131742981, hd.G(np.u1(i7).f25817c4, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String N03 = hd.N0(2131742977, null);
        u uVar = new u(this, k0Var.getContext(), t3Var, k0Var, textPaint, staticLayout2, textPaint2, N03, textPaint2.measureText(N03), staticLayout, f40Var, N0, textPaint.measureText(N0));
        this.f41462a = uVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        m2 m2Var = uVar.d;
        m2Var.setScalingType(scalingType);
        this.f41495y = k0Var;
        this.H = f40Var;
        m2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new v(this));
        TextureView textureView = uVar.f41218e;
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
        this.f41467c0 = xVar;
        addView(xVar);
        m5 m5Var = new m5(k0Var.getContext());
        this.M = m5Var;
        m5Var.setTextSize(13);
        m5Var.setTextColor(i0.a.o(-1, 229));
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setFullTextMaxLines(1);
        m5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(m5Var, ma.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, ma.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(m6.x0(null, m6.f29464hh, false));
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
        org.telegram.ui.Cells.y k02 = m6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(4, k0Var.getContext(), this);
        this.O = n2Var;
        n2Var.setText(hd.N0(2131742975, null));
        n2Var.setTextSize(1, 15.0f);
        n2Var.setTypeface(org.telegram.messenger.g0.o());
        n2Var.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        n2Var.setTextColor(-1);
        n2Var.setBackground(k02);
        n2Var.setGravity(17);
        n2Var.setOnClickListener(new o4(this, 24));
        addView(n2Var, ma.e(-2, 38, 51));
        TextView textView = new TextView(k0Var.getContext());
        this.P = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        t6.U(textView, m6.f29427fh, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (v3.w(14, O0)) {
            textView.setText(org.telegram.messenger.g0.W2(hd.N0(2131747970, null)));
        } else {
            org.telegram.messenger.f3.q("NoRtmpStreamFromAppViewer", null, 2131747969, new Object[]{O0.title}, textView);
        }
        addView(textView, ma.e(-2, -2, 51));
    }

    public static y c(ArrayList arrayList, b20 b20Var, r rVar, u10 u10Var, r rVar2, u3 u3Var, t3 t3Var, f40 f40Var) {
        y yVar;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (u3Var.equals(((y) arrayList.get(i7)).f41493x)) {
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
        if (u10Var != null) {
            yVar.setSecondaryView(u10Var);
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
        x xVar = this.f41467c0;
        if (xVar.getVisibility() == 0) {
            x.a(xVar, true);
        }
    }

    public final void b(boolean z10) {
        this.Q = true;
        this.f41491w = false;
        this.f41495y.f(this);
        if (z10) {
            if (this.f41493x.f27155a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f41493x.f27156b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                u3 u3Var = this.f41493x;
                sharedInstance.removeRemoteSink(u3Var.f27155a, u3Var.f27156b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f41468d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f41468d0.cancel();
        }
        this.f41462a.d.release();
    }

    public final void d() {
        String str;
        int f10;
        int f11;
        if (this.f41485r0 == null) {
            HashMap hashMap = this.G.h;
            u3 u3Var = this.f41493x;
            boolean z10 = u3Var.f27156b;
            TLRPC.GroupCallParticipant groupCallParticipant = u3Var.f27155a;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.f41485r0 = bitmap;
            this.f41462a.setThumb(bitmap);
            if (this.f41485r0 == null) {
                long B1 = gj.B1(this.f41493x.f27155a.peer);
                u3 u3Var2 = this.f41493x;
                boolean z11 = u3Var2.f27155a.self;
                ImageReceiver imageReceiver = this.m0;
                if (z11 && u3Var2.f27156b) {
                    imageReceiver.w0(new cb0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                int i10 = this.L;
                if (i7 > 0) {
                    TLRPC.User c22 = np.u1(i10).c2(Long.valueOf(B1));
                    gc l10 = gc.l(i10, 1, c22);
                    if (c22 != null) {
                        f11 = b9.d(c22.f28583id);
                    } else {
                        f11 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f11, -16777216), i0.a.f(0.4f, f11, -16777216)}), null, c22, 0);
                    return;
                }
                TLRPC.Chat O0 = np.u1(i10).O0(Long.valueOf(-B1));
                gc a10 = gc.a(1, O0);
                if (O0 != null) {
                    f10 = b9.d(O0.f28434id);
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
        boolean z10 = this.f41491w;
        k0 k0Var = this.f41495y;
        u uVar = this.f41462a;
        if (z10) {
            float y10 = (uVar.getY() + uVar.getMeasuredHeight()) - uVar.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.f41483q0;
            boolean z11 = this.h;
            rh0 rh0Var = this.V;
            if (!z11 && !this.f41471f) {
                if (!this.f41464b && !this.f41484r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - k0Var.f41112c);
                        rh0Var.setAlpha(1.0f - k0Var.f41112c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        rh0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!f40.E5 && !f40.F5) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.t(1.0f, k0Var.f41109a0, org.telegram.messenger.g0.L(90.0f) * k0Var.f41112c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    rh0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - k0Var.f41125n);
                rh0Var.setAlpha(1.0f - k0Var.f41125n);
            }
            boolean z12 = this.f41464b;
            m5 m5Var = this.M;
            if (!z12 && !this.f41484r) {
                m5Var.setFullAlpha(0.0f);
            } else {
                m5Var.setFullAlpha(k0Var.f41112c);
            }
            rh0Var.setTranslationX(frameLayout.getX());
            rh0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.W;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((uVar.getMeasuredWidth() - (uVar.P * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.f41112c, 1.0f - k0Var.f41125n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f41497z0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(6.0f) * k0Var.f41112c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.f41491w) {
            n0 n0Var = this.f41481o0;
            if (n0Var != null) {
                boolean z13 = n0Var.f41200e;
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
            float f15 = (1.0f - k0Var.f41125n) * (1.0f - k0Var.f41112c) * f14;
            if (f14 > 0.0f) {
                int i7 = (int) (f15 * 255.0f);
                Paint paint = this.U;
                paint.setAlpha(i7);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f41483q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(uVar.getX() + uVar.P, uVar.getY() + uVar.O, (uVar.getX() + uVar.getMeasuredWidth()) - uVar.P, (uVar.getY() + uVar.getMeasuredHeight()) - uVar.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f41483q0);
                float f16 = uVar.f41213b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f41482p0 && (view == this.f41462a || view == this.f41467c0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f41483q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f41483q0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f41462a.d.release();
        n0 n0Var = this.f41481o0;
        if (n0Var != null) {
            this.H.f47548s4.add(n0Var);
            this.f41481o0.b();
            n0 n0Var2 = this.f41481o0;
            n0Var2.f41199c = null;
            n0Var2.c(false);
        }
        this.f41481o0 = null;
    }

    public final void f() {
        if (this.f41493x != null) {
            u uVar = this.f41462a;
            m2 m2Var = uVar.d;
            m2 m2Var2 = uVar.d;
            if (m2Var.getMeasuredHeight() != 0 && m2Var2.getMeasuredWidth() != 0) {
                m2Var2.getRenderBufferBitmap(new org.telegram.tgnet.u(this, 7));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f41479n != z10) {
            this.f41479n = z10;
            if ((this.f41466c != null || this.f41469e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long B1 = gj.B1(this.f41493x.f27155a.peer);
        if (n5.E(B1)) {
            return p10.q(np.u1(org.telegram.messenger.c.a(k10.f24968t0).f23202a).c2(Long.valueOf(B1)));
        }
        return np.u1(org.telegram.messenger.c.a(k10.f24968t0).f23202a).O0(Long.valueOf(-B1)).title;
    }

    public r getPrimaryView() {
        return this.f41466c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f41464b != z10) {
            this.f41464b = z10;
            this.S = true;
            j(z11);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f41472f0 == f10 && this.f41473g0 == f11 && this.f41474h0 == f12 && this.f41475i0 == f13 && this.f41476j0 == f14) {
            return;
        }
        this.f41477k0 = z10;
        this.f41472f0 = f10;
        this.f41473g0 = f11;
        this.f41474h0 = f12;
        this.f41475i0 = f13;
        this.f41476j0 = f14;
        this.f41462a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.R) {
            this.f41462a.invalidate();
        }
        r rVar = this.f41466c;
        if (rVar != null) {
            rVar.invalidate();
            f40 f40Var = this.H;
            if (f40Var.W4 == this.f41466c) {
                f40Var.f30176b.invalidate();
            }
        }
        u10 u10Var = this.d;
        if (u10Var != null) {
            u10Var.invalidate();
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
        int measuredWidth = this.f41495y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
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
        if (this.f41466c != rVar) {
            this.f41466c = rVar;
            this.S = true;
            j(true);
        }
    }

    public void setSecondaryView(u10 u10Var) {
        if (this.d != u10Var) {
            this.d = u10Var;
            this.S = true;
            j(true);
        }
    }

    public void setTabletGridView(r rVar) {
        if (this.f41469e != rVar) {
            this.f41469e = rVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }
}
