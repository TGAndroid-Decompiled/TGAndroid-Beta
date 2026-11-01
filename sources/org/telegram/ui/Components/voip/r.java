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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.y10;
import org.telegram.ui.a50;
import org.telegram.ui.x20;
import org.webrtc.RendererCommon;
import w7.b6;
public final class r extends FrameLayout implements z {
    public final l A0;
    public final Rect B0;
    public ag.j0 C0;
    public final Paint D;
    public int D0;
    public boolean E;
    public int E0;
    public final u3 F;
    public int F0;
    public final a50 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final u5 L;
    public int M;
    public final org.telegram.ui.ActionBar.q2 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final fi0 U;
    public final ImageView V;
    public boolean W;
    public final n f31663a;
    public float f31664a0;
    public boolean f31665b;
    public final q f31666b0;
    public k f31667c;
    public ValueAnimator f31668c0;
    public y10 d;
    public boolean f31669d0;
    public k e;
    public float f31670e0;
    public boolean f31671f;
    public float f31672f0;
    public float f31673g0;
    public boolean h;
    public float f31674h0;
    public float f31675i0;
    public boolean f31676j0;
    public float f31677k0;
    public final ImageReceiver f31678l0;
    public final ArrayList m0;
    public boolean f31679n;
    public a0 f31680n0;
    public boolean f31681o0;
    public float f31682p0;
    public Bitmap f31683q0;
    public boolean f31684r;
    public Paint f31685r0;
    public boolean f31686s;
    public boolean f31687s0;
    public float f31688t0;
    public final dr f31689u0;
    public final Drawable f31690v0;
    public boolean f31691w;
    public float f31692w0;
    public v3 f31693x;
    public ImageView f31694x0;
    public final x f31695y;
    public boolean f31696y0;
    public boolean f31697z0;

    public r(x xVar, u3 u3Var, a50 a50Var) {
        super(xVar.getContext());
        this.D = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f31664a0 = 1.0f;
        this.f31678l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.A0 = new l(this, 1);
        this.B0 = new Rect();
        this.F = u3Var;
        int i10 = a50Var.f21584a;
        this.K = i10;
        dr drVar = new dr(xVar.getContext(), 2131230926, -1);
        this.f31689u0 = drVar;
        drVar.a(true, false);
        drVar.f25581i = -org.telegram.messenger.i0.L(4.0f);
        drVar.f25582j = org.telegram.messenger.i0.L(6.0f);
        drVar.f25583k = org.telegram.messenger.i0.L(6.0f);
        drVar.invalidateSelf();
        float N = org.telegram.messenger.i0.N(3.4f);
        drVar.f25578c.setStrokeWidth(N);
        drVar.d.setStrokeWidth(N * 1.47f);
        this.f31690v0 = xVar.getContext().getResources().getDrawable(2131232676).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint2.setColor(-1);
        String L0 = dd.L0(2131743250, null);
        String L02 = dd.L0(2131743247, null);
        int L = org.telegram.messenger.i0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(L02, textPaint, L, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat L03 = wp.r1(i10).L0(Long.valueOf(u3Var.f18362c));
        StaticLayout staticLayout2 = new StaticLayout(dd.a0("VoipVideoNotAvailable", null, 2131743252, dd.G(wp.r1(i10).f19090b4, "Participants", new Object[0])), textPaint, org.telegram.messenger.i0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String L04 = dd.L0(2131743248, null);
        n nVar = new n(this, xVar.getContext(), u3Var, xVar, textPaint, staticLayout2, textPaint2, L04, textPaint2.measureText(L04), staticLayout, a50Var, L0, textPaint.measureText(L0));
        this.f31663a = nVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        y1 y1Var = nVar.d;
        y1Var.setScalingType(scalingType);
        this.f31695y = xVar;
        this.G = a50Var;
        y1Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new o(this));
        TextureView textureView = nVar.e;
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
        this.f31666b0 = qVar;
        addView(qVar);
        u5 u5Var = new u5(xVar.getContext());
        this.L = u5Var;
        u5Var.setTextSize(13);
        u5Var.setTextColor(i0.b.o(-1, 229));
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setFullTextMaxLines(1);
        u5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(xVar.getContext());
        this.J = frameLayout;
        frameLayout.addView(u5Var, b6.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, b6.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setColor(t6.x0(null, t6.f20958eh, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(xVar.getContext());
        this.U = imageView;
        addView((View) imageView, b6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(xVar.getContext());
        this.V = imageView2;
        addView(imageView2, b6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        imageView2.setImageDrawable(xVar.getContext().getDrawable(2131232802));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L2 = org.telegram.messenger.i0.L(19.0f);
        int o10 = i0.b.o(-1, 100);
        org.telegram.ui.Cells.y k02 = t6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(this, xVar.getContext(), 4);
        this.N = q2Var;
        q2Var.setText(dd.L0(2131743246, null));
        q2Var.setTextSize(1, 15.0f);
        q2Var.setTypeface(org.telegram.messenger.i0.o());
        q2Var.setPadding(org.telegram.messenger.i0.L(21.0f), 0, org.telegram.messenger.i0.L(21.0f), 0);
        q2Var.setTextColor(-1);
        q2Var.setBackground(k02);
        q2Var.setGravity(17);
        q2Var.setOnClickListener(new ag.g(this, 20));
        addView(q2Var, b6.e(-2, 38, 51));
        TextView textView = new TextView(xVar.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.i0.L(21.0f), 0, org.telegram.messenger.i0.L(21.0f), 0);
        a7.V(textView, t6.f20922ch, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (w3.w(14, L03)) {
            textView.setText(org.telegram.messenger.i0.W2(dd.L0(2131748179, null)));
        } else {
            m5.q("NoRtmpStreamFromAppViewer", null, 2131748178, new Object[]{L03.title}, textView);
        }
        addView(textView, b6.e(-2, -2, 51));
    }

    public static r c(ArrayList arrayList, x20 x20Var, k kVar, y10 y10Var, k kVar2, v3 v3Var, u3 u3Var, a50 a50Var) {
        r rVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (v3Var.equals(((r) arrayList.get(i10)).f31693x)) {
                    rVar = (r) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar == null) {
            rVar = new r(x20Var, u3Var, a50Var);
        }
        if (kVar != null) {
            rVar.setPrimaryView(kVar);
        }
        if (y10Var != null) {
            rVar.setSecondaryView(y10Var);
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
        q qVar = this.f31666b0;
        if (qVar.getVisibility() == 0) {
            q.a(qVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.f31691w = false;
        this.f31695y.f(this);
        if (z10) {
            if (this.f31693x.f18588a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f31693x.f18589b);
                }
            } else if (VoIPService.getSharedInstance() != null && !t0.f31724d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                v3 v3Var = this.f31693x;
                sharedInstance.removeRemoteSink(v3Var.f18588a, v3Var.f18589b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f31668c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31668c0.cancel();
        }
        this.f31663a.d.release();
    }

    public final void d() {
        String str;
        int f7;
        int f10;
        if (this.f31683q0 == null) {
            HashMap hashMap = this.F.h;
            v3 v3Var = this.f31693x;
            boolean z10 = v3Var.f18589b;
            TLRPC.GroupCallParticipant groupCallParticipant = v3Var.f18588a;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.f31683q0 = bitmap;
            this.f31663a.setThumb(bitmap);
            if (this.f31683q0 == null) {
                long C1 = kj.C1(this.f31693x.f18588a.peer);
                v3 v3Var2 = this.f31693x;
                boolean z11 = v3Var2.f18588a.self;
                ImageReceiver imageReceiver = this.f31678l0;
                if (z11 && v3Var2.f18589b) {
                    imageReceiver.w0(new jb0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
                int i11 = this.K;
                if (i10 > 0) {
                    TLRPC.User Z1 = wp.r1(i11).Z1(Long.valueOf(C1));
                    jc l4 = jc.l(i11, 1, Z1);
                    if (Z1 != null) {
                        f10 = r8.d(Z1.f19943id);
                    } else {
                        f10 = i0.b.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.q0(l4, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.f(0.2f, f10, -16777216), i0.b.f(0.4f, f10, -16777216)}), null, Z1, 0);
                    return;
                }
                TLRPC.Chat L0 = wp.r1(i11).L0(Long.valueOf(-C1));
                jc a2 = jc.a(1, L0);
                if (L0 != null) {
                    f7 = r8.d(L0.f19794id);
                } else {
                    f7 = i0.b.f(0.2f, -16777216, -1);
                }
                imageReceiver.q0(a2, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.f(0.2f, f7, -16777216), i0.b.f(0.4f, f7, -16777216)}), null, L0, 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        boolean z10 = this.f31691w;
        x xVar = this.f31695y;
        n nVar = this.f31663a;
        if (z10) {
            float y3 = (nVar.getY() + nVar.getMeasuredHeight()) - nVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f31682p0;
            boolean z11 = this.h;
            fi0 fi0Var = this.U;
            if (!z11 && !this.f31671f) {
                if (!this.f31665b && !this.f31684r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - xVar.f31794c);
                        fi0Var.setAlpha(1.0f - xVar.f31794c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        fi0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!a50.f35575w5 && !a50.f35576x5) {
                        measuredHeight = sc.e.z(1.0f, xVar.W, org.telegram.messenger.i0.L(90.0f) * xVar.f31794c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    fi0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - xVar.f31806n);
                fi0Var.setAlpha(1.0f - xVar.f31806n);
            }
            boolean z12 = this.f31665b;
            u5 u5Var = this.L;
            if (!z12 && !this.f31684r) {
                u5Var.setFullAlpha(0.0f);
            } else {
                u5Var.setFullAlpha(xVar.f31794c);
            }
            fi0Var.setTranslationX(frameLayout.getX());
            fi0Var.setTranslationY(measuredHeight - org.telegram.messenger.i0.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((nVar.getMeasuredWidth() - (nVar.O * 2.0f)) - org.telegram.messenger.i0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.i0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - xVar.f31794c, 1.0f - xVar.f31806n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f31696y0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(6.0f) * xVar.f31794c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.f31691w) {
            a0 a0Var = this.f31680n0;
            if (a0Var != null) {
                boolean z13 = a0Var.e;
                if (z13) {
                    float f7 = this.S;
                    if (f7 != 1.0f) {
                        float f10 = f7 + 0.053333335f;
                        this.S = f10;
                        if (f10 > 1.0f) {
                            this.S = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f11 = this.S;
                    if (f11 != 0.0f) {
                        float f12 = f11 - 0.053333335f;
                        this.S = f12;
                        if (f12 < 0.0f) {
                            this.S = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f13 = this.S;
            float f14 = (1.0f - xVar.f31806n) * (1.0f - xVar.f31794c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f31682p0) / org.telegram.messenger.i0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(nVar.getX() + nVar.O, nVar.getY() + nVar.N, (nVar.getX() + nVar.getMeasuredWidth()) - nVar.O, (nVar.getY() + nVar.getMeasuredHeight()) - nVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f31682p0);
                float f15 = nVar.f31849b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f31681o0 && (view == this.f31663a || view == this.f31666b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f31682p0) / org.telegram.messenger.i0.L(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f31682p0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        this.f31663a.d.release();
        a0 a0Var = this.f31680n0;
        if (a0Var != null) {
            this.G.f35623k4.add(a0Var);
            this.f31680n0.b();
            a0 a0Var2 = this.f31680n0;
            a0Var2.f31365c = null;
            a0Var2.c(false);
        }
        this.f31680n0 = null;
    }

    public final void f() {
        if (this.f31693x != null) {
            n nVar = this.f31663a;
            y1 y1Var = nVar.d;
            y1 y1Var2 = nVar.d;
            if (y1Var.getMeasuredHeight() != 0 && y1Var2.getMeasuredWidth() != 0) {
                y1Var2.getRenderBufferBitmap(new mg.l(this, 14));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f31679n != z10) {
            this.f31679n = z10;
            if ((this.f31667c != null || this.e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long C1 = kj.C1(this.f31693x.f18588a.peer);
        if (o5.E(C1)) {
            return i20.p(wp.r1(org.telegram.messenger.c.a(e20.f15506s0).f15043a).Z1(Long.valueOf(C1)));
        }
        return wp.r1(org.telegram.messenger.c.a(e20.f15506s0).f15043a).L0(Long.valueOf(-C1)).title;
    }

    public k getPrimaryView() {
        return this.f31667c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f31665b != z10) {
            this.f31665b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f31670e0 == f7 && this.f31672f0 == f10 && this.f31673g0 == f11 && this.f31674h0 == f12 && this.f31675i0 == f13) {
            return;
        }
        this.f31676j0 = z10;
        this.f31670e0 = f7;
        this.f31672f0 = f10;
        this.f31673g0 = f11;
        this.f31674h0 = f12;
        this.f31675i0 = f13;
        this.f31663a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f31663a.invalidate();
        }
        k kVar = this.f31667c;
        if (kVar != null) {
            kVar.invalidate();
            a50 a50Var = this.G;
            if (a50Var.O4 == this.f31667c) {
                a50Var.f21587b.invalidate();
            }
        }
        y10 y10Var = this.d;
        if (y10Var != null) {
            y10Var.invalidate();
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

    public final void l(int i10) {
        int measuredWidth = this.f31695y.getMeasuredWidth() - org.telegram.messenger.i0.L(6.0f);
        if ((this.H0 != i10 && i10 > 0) || (this.I0 != measuredWidth && measuredWidth > 0)) {
            if (i10 != 0) {
                this.H0 = i10;
            }
            if (measuredWidth != 0) {
                this.I0 = measuredWidth;
            }
            this.L.h(measuredWidth - i10, 0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31678l0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31678l0.R();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.r.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.r.setAmplitude(double):void");
    }

    public void setPrimaryView(k kVar) {
        if (this.f31667c != kVar) {
            this.f31667c = kVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(y10 y10Var) {
        if (this.d != y10Var) {
            this.d = y10Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(k kVar) {
        if (this.e != kVar) {
            this.e = kVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
