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
import b8.mf;
import ci.v6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.uq;
import org.telegram.ui.u10;
import org.telegram.ui.x30;
import org.webrtc.RendererCommon;
public final class r extends FrameLayout implements z {
    public boolean A0;
    public final l B0;
    public final Rect C0;
    public v6 D0;
    public final Paint E;
    public int E0;
    public boolean F;
    public int F0;
    public final r3 G;
    public int G0;
    public final x30 H;
    public ValueAnimator H0;
    public boolean I;
    public int I0;
    public float J;
    public int J0;
    public final FrameLayout K;
    public ValueAnimator K0;
    public final int L;
    public boolean L0;
    public final k5 M;
    public int N;
    public final org.telegram.ui.ActionBar.k2 O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public final Paint U;
    public final fh0 V;
    public final ImageView W;
    public final n f39546a;
    public boolean f39547a0;
    public boolean f39548b;
    public float f39549b0;
    public k f39550c;
    public final q f39551c0;
    public d10 d;
    public ValueAnimator f39552d0;
    public k f39553e;
    public boolean f39554e0;
    public boolean f39555f;
    public float f39556f0;
    public float f39557g0;
    public boolean h;
    public float f39558h0;
    public float f39559i0;
    public float f39560j0;
    public boolean f39561k0;
    public float f39562l0;
    public final ImageReceiver m0;
    public boolean f39563n;
    public final ArrayList f39564n0;
    public a0 f39565o0;
    public boolean f39566p0;
    public float f39567q0;
    public boolean f39568r;
    public Bitmap f39569r0;
    public boolean f39570s;
    public Paint f39571s0;
    public boolean f39572t0;
    public float f39573u0;
    public final uq f39574v0;
    public boolean f39575w;
    public final Drawable f39576w0;
    public s3 f39577x;
    public float f39578x0;
    public final x f39579y;
    public ImageView f39580y0;
    public boolean f39581z0;

    public r(x xVar, r3 r3Var, x30 x30Var) {
        super(xVar.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.U = paint;
        this.f39549b0 = 1.0f;
        this.m0 = new ImageReceiver(null);
        this.f39564n0 = new ArrayList();
        this.B0 = new l(this, 1);
        this.C0 = new Rect();
        this.G = r3Var;
        int i3 = x30Var.f28583a;
        this.L = i3;
        uq uqVar = new uq(xVar.getContext(), 2131230926, -1);
        this.f39574v0 = uqVar;
        uqVar.a(true, false);
        uqVar.f38846i = -org.telegram.messenger.g0.L(4.0f);
        uqVar.f38847j = org.telegram.messenger.g0.L(6.0f);
        uqVar.f38848k = org.telegram.messenger.g0.L(6.0f);
        uqVar.invalidateSelf();
        float N = org.telegram.messenger.g0.N(3.4f);
        uqVar.f38842c.setStrokeWidth(N);
        uqVar.d.setStrokeWidth(N * 1.47f);
        this.f39576w0 = xVar.getContext().getResources().getDrawable(2131232677).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = bd.M0(2131743234, null);
        String M02 = bd.M0(2131743231, null);
        int L = org.telegram.messenger.g0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat M03 = hp.s1(i3).M0(Long.valueOf(r3Var.f25050c));
        StaticLayout staticLayout2 = new StaticLayout(bd.a0("VoipVideoNotAvailable", null, 2131743236, bd.G(hp.s1(i3).f22958a4, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M04 = bd.M0(2131743232, null);
        n nVar = new n(this, xVar.getContext(), r3Var, xVar, textPaint, staticLayout2, textPaint2, M04, textPaint2.measureText(M04), staticLayout, x30Var, M0, textPaint.measureText(M0));
        this.f39546a = nVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        y1 y1Var = nVar.d;
        y1Var.setScalingType(scalingType);
        this.f39579y = xVar;
        this.H = x30Var;
        y1Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new o(this));
        TextureView textureView = nVar.f39737e;
        if (textureView != null) {
            y1Var.setBackgroundRenderer(textureView);
            if (!y1Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        y1Var.setAlpha(0.0f);
        addView(nVar);
        q qVar = new q(this, getContext());
        this.f39551c0 = qVar;
        addView(qVar);
        k5 k5Var = new k5(xVar.getContext());
        this.M = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(i0.a.o(-1, 229));
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setFullTextMaxLines(1);
        k5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(xVar.getContext());
        this.K = frameLayout;
        frameLayout.addView(k5Var, mf.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, mf.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(k6.x0(null, k6.f27908eh, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(xVar.getContext());
        this.V = imageView;
        addView((View) imageView, mf.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(xVar.getContext());
        this.W = imageView2;
        addView(imageView2, mf.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        imageView2.setImageDrawable(xVar.getContext().getDrawable(2131232802));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L2 = org.telegram.messenger.g0.L(19.0f);
        int o10 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = k6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(4, xVar.getContext(), this);
        this.O = k2Var;
        k2Var.setText(bd.M0(2131743230, null));
        k2Var.setTextSize(1, 15.0f);
        k2Var.setTypeface(org.telegram.messenger.g0.o());
        k2Var.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        k2Var.setTextColor(-1);
        k2Var.setBackground(k02);
        k2Var.setGravity(17);
        k2Var.setOnClickListener(new ii.m(this, 20));
        addView(k2Var, mf.e(-2, 38, 51));
        TextView textView = new TextView(xVar.getContext());
        this.P = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        r6.V(textView, k6.f27870ch, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (t3.w(14, M03)) {
            textView.setText(org.telegram.messenger.g0.X2(bd.M0(2131748171, null)));
        } else {
            org.telegram.messenger.k5.r("NoRtmpStreamFromAppViewer", null, 2131748170, new Object[]{M03.title}, textView);
        }
        addView(textView, mf.e(-2, -2, 51));
    }

    public static r c(ArrayList arrayList, u10 u10Var, k kVar, d10 d10Var, k kVar2, s3 s3Var, r3 r3Var, x30 x30Var) {
        r rVar;
        int i3 = 0;
        while (true) {
            if (i3 < arrayList.size()) {
                if (s3Var.equals(((r) arrayList.get(i3)).f39577x)) {
                    rVar = (r) arrayList.get(i3);
                    break;
                }
                i3++;
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar == null) {
            rVar = new r(u10Var, r3Var, x30Var);
        }
        if (kVar != null) {
            rVar.setPrimaryView(kVar);
        }
        if (d10Var != null) {
            rVar.setSecondaryView(d10Var);
        }
        if (kVar2 != null) {
            rVar.setTabletGridView(kVar2);
        }
        return rVar;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        q qVar = this.f39551c0;
        if (qVar.getVisibility() == 0) {
            q.a(qVar, true);
        }
    }

    public final void b(boolean z10) {
        this.Q = true;
        this.f39575w = false;
        this.f39579y.f(this);
        if (z10) {
            if (this.f39577x.f25270a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f39577x.f25271b);
                }
            } else if (VoIPService.getSharedInstance() != null && !s0.f39589e0.W) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                s3 s3Var = this.f39577x;
                sharedInstance.removeRemoteSink(s3Var.f25270a, s3Var.f25271b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f39552d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f39552d0.cancel();
        }
        this.f39546a.d.release();
    }

    public final void d() {
        String str;
        int f10;
        int f11;
        if (this.f39569r0 == null) {
            HashMap hashMap = this.G.h;
            s3 s3Var = this.f39577x;
            boolean z10 = s3Var.f25271b;
            TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f25270a;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.f39569r0 = bitmap;
            this.f39546a.setThumb(bitmap);
            if (this.f39569r0 == null) {
                long C1 = zi.C1(this.f39577x.f25270a.peer);
                s3 s3Var2 = this.f39577x;
                boolean z11 = s3Var2.f25270a.self;
                ImageReceiver imageReceiver = this.m0;
                if (z11 && s3Var2.f25271b) {
                    imageReceiver.w0(new la0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i3 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
                int i10 = this.L;
                if (i3 > 0) {
                    TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(C1));
                    ac l10 = ac.l(i10, 1, a22);
                    if (a22 != null) {
                        f11 = u8.d(a22.f27150id);
                    } else {
                        f11 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f11, -16777216), i0.a.f(0.4f, f11, -16777216)}), null, a22, 0);
                    return;
                }
                TLRPC.Chat M0 = hp.s1(i10).M0(Long.valueOf(-C1));
                ac a10 = ac.a(1, M0);
                if (M0 != null) {
                    f10 = u8.d(M0.f27001id);
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
        boolean z10 = this.f39575w;
        x xVar = this.f39579y;
        n nVar = this.f39546a;
        if (z10) {
            float y9 = (nVar.getY() + nVar.getMeasuredHeight()) - nVar.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y9 - frameLayout.getMeasuredHeight()) + this.f39567q0;
            boolean z11 = this.h;
            fh0 fh0Var = this.V;
            if (!z11 && !this.f39555f) {
                if (!this.f39548b && !this.f39568r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - xVar.f39672c);
                        fh0Var.setAlpha(1.0f - xVar.f39672c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        fh0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!x30.f51713x5 && !x30.f51714y5) {
                        measuredHeight = a1.g.D(1.0f, xVar.f39669a0, org.telegram.messenger.g0.L(90.0f) * xVar.f39672c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    fh0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - xVar.f39685n);
                fh0Var.setAlpha(1.0f - xVar.f39685n);
            }
            boolean z12 = this.f39548b;
            k5 k5Var = this.M;
            if (!z12 && !this.f39568r) {
                k5Var.setFullAlpha(0.0f);
            } else {
                k5Var.setFullAlpha(xVar.f39672c);
            }
            fh0Var.setTranslationX(frameLayout.getX());
            fh0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.W;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((nVar.getMeasuredWidth() - (nVar.P * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - xVar.f39672c, 1.0f - xVar.f39685n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f39581z0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(6.0f) * xVar.f39672c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.f39575w) {
            a0 a0Var = this.f39565o0;
            if (a0Var != null) {
                boolean z13 = a0Var.f39209e;
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
            float f15 = (1.0f - xVar.f39685n) * (1.0f - xVar.f39672c) * f14;
            if (f14 > 0.0f) {
                int i3 = (int) (f15 * 255.0f);
                Paint paint = this.U;
                paint.setAlpha(i3);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f39567q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(nVar.getX() + nVar.P, nVar.getY() + nVar.O, (nVar.getX() + nVar.getMeasuredWidth()) - nVar.P, (nVar.getY() + nVar.getMeasuredHeight()) - nVar.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f39567q0);
                float f16 = nVar.f39732b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f39566p0 && (view == this.f39546a || view == this.f39551c0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f39567q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f39567q0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        this.f39546a.d.release();
        a0 a0Var = this.f39565o0;
        if (a0Var != null) {
            this.H.f51762l4.add(a0Var);
            this.f39565o0.b();
            a0 a0Var2 = this.f39565o0;
            a0Var2.f39208c = null;
            a0Var2.c(false);
        }
        this.f39565o0 = null;
    }

    public final void f() {
        if (this.f39577x != null) {
            n nVar = this.f39546a;
            y1 y1Var = nVar.d;
            y1 y1Var2 = nVar.d;
            if (y1Var.getMeasuredHeight() != 0 && y1Var2.getMeasuredWidth() != 0) {
                y1Var2.getRenderBufferBitmap(new e3(this, 2));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f39563n != z10) {
            this.f39563n = z10;
            if ((this.f39550c != null || this.f39553e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long C1 = zi.C1(this.f39577x.f25270a.peer);
        if (m5.E(C1)) {
            return l10.p(hp.s1(org.telegram.messenger.c.a(h10.f22829t0).f21919a).a2(Long.valueOf(C1)));
        }
        return hp.s1(org.telegram.messenger.c.a(h10.f22829t0).f21919a).M0(Long.valueOf(-C1)).title;
    }

    public k getPrimaryView() {
        return this.f39550c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f39548b != z10) {
            this.f39548b = z10;
            this.S = true;
            j(z11);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f39556f0 == f10 && this.f39557g0 == f11 && this.f39558h0 == f12 && this.f39559i0 == f13 && this.f39560j0 == f14) {
            return;
        }
        this.f39561k0 = z10;
        this.f39556f0 = f10;
        this.f39557g0 = f11;
        this.f39558h0 = f12;
        this.f39559i0 = f13;
        this.f39560j0 = f14;
        this.f39546a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.R) {
            this.f39546a.invalidate();
        }
        k kVar = this.f39550c;
        if (kVar != null) {
            kVar.invalidate();
            x30 x30Var = this.H;
            if (x30Var.P4 == this.f39550c) {
                x30Var.f28586b.invalidate();
            }
        }
        d10 d10Var = this.d;
        if (d10Var != null) {
            d10Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void j(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.r.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.r.k(boolean):void");
    }

    public final void l(int i3) {
        int measuredWidth = this.f39579y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
        if ((this.I0 != i3 && i3 > 0) || (this.J0 != measuredWidth && measuredWidth > 0)) {
            if (i3 != 0) {
                this.I0 = i3;
            }
            if (measuredWidth != 0) {
                this.J0 = measuredWidth;
            }
            this.M.h(measuredWidth - i3, 0);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.r.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.r.setAmplitude(double):void");
    }

    public void setPrimaryView(k kVar) {
        if (this.f39550c != kVar) {
            this.f39550c = kVar;
            this.S = true;
            j(true);
        }
    }

    public void setSecondaryView(d10 d10Var) {
        if (this.d != d10Var) {
            this.d = d10Var;
            this.S = true;
            j(true);
        }
    }

    public void setTabletGridView(k kVar) {
        if (this.f39553e != kVar) {
            this.f39553e = kVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
    }
}
