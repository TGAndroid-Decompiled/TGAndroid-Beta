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
import c8.na;
import di.p6;
import hi.z4;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.za0;
import org.telegram.ui.a20;
import org.telegram.ui.e40;
import org.webrtc.RendererCommon;
public final class z extends FrameLayout implements n0 {
    public boolean A0;
    public final t B0;
    public final Rect C0;
    public p6 D0;
    public final Paint E;
    public int E0;
    public boolean F;
    public int F0;
    public final t3 G;
    public int G0;
    public final e40 H;
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
    public final org.telegram.ui.ActionBar.n2 O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public final Paint U;
    public final qh0 V;
    public final ImageView W;
    public final v f41357a;
    public boolean f41358a0;
    public boolean f41359b;
    public float f41360b0;
    public s f41361c;
    public final y f41362c0;
    public s10 d;
    public ValueAnimator f41363d0;
    public s f41364e;
    public boolean f41365e0;
    public boolean f41366f;
    public float f41367f0;
    public float f41368g0;
    public boolean h;
    public float f41369h0;
    public float f41370i0;
    public float f41371j0;
    public boolean f41372k0;
    public float f41373l0;
    public final ImageReceiver m0;
    public boolean f41374n;
    public final ArrayList f41375n0;
    public o0 f41376o0;
    public boolean f41377p0;
    public float f41378q0;
    public boolean f41379r;
    public Bitmap f41380r0;
    public boolean f41381s;
    public Paint f41382s0;
    public boolean f41383t0;
    public float f41384u0;
    public final hr f41385v0;
    public boolean f41386w;
    public final Drawable f41387w0;
    public u3 f41388x;
    public float f41389x0;
    public final l0 f41390y;
    public ImageView f41391y0;
    public boolean f41392z0;

    public z(l0 l0Var, t3 t3Var, e40 e40Var) {
        super(l0Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.U = paint;
        this.f41360b0 = 1.0f;
        this.m0 = new ImageReceiver(null);
        this.f41375n0 = new ArrayList();
        this.B0 = new t(this, 1);
        this.C0 = new Rect();
        this.G = t3Var;
        int i7 = e40Var.f30223a;
        this.L = i7;
        hr hrVar = new hr(l0Var.getContext(), 2131230926, -1);
        this.f41385v0 = hrVar;
        hrVar.a(true, false);
        hrVar.f35797i = -org.telegram.messenger.g0.L(4.0f);
        hrVar.f35798j = org.telegram.messenger.g0.L(6.0f);
        hrVar.f35799k = org.telegram.messenger.g0.L(6.0f);
        hrVar.invalidateSelf();
        float N = org.telegram.messenger.g0.N(3.4f);
        hrVar.f35793c.setStrokeWidth(N);
        hrVar.d.setStrokeWidth(N * 1.47f);
        this.f41387w0 = l0Var.getContext().getResources().getDrawable(2131232684).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        String N0 = gd.N0(2131742974, null);
        String N02 = gd.N0(2131742971, null);
        int L = org.telegram.messenger.g0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(N02, textPaint, L, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(t3Var.f27035c));
        StaticLayout staticLayout2 = new StaticLayout(gd.a0("VoipVideoNotAvailable", null, 2131742976, gd.G(mp.u1(i7).f25713c4, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String N03 = gd.N0(2131742972, null);
        v vVar = new v(this, l0Var.getContext(), t3Var, l0Var, textPaint, staticLayout2, textPaint2, N03, textPaint2.measureText(N03), staticLayout, e40Var, N0, textPaint.measureText(N0));
        this.f41357a = vVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        n2 n2Var = vVar.d;
        n2Var.setScalingType(scalingType);
        this.f41390y = l0Var;
        this.H = e40Var;
        n2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new w(this));
        TextureView textureView = vVar.f41113e;
        if (textureView != null) {
            n2Var.setBackgroundRenderer(textureView);
            if (!n2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        n2Var.setAlpha(0.0f);
        addView(vVar);
        y yVar = new y(this, getContext());
        this.f41362c0 = yVar;
        addView(yVar);
        n5 n5Var = new n5(l0Var.getContext());
        this.M = n5Var;
        n5Var.setTextSize(13);
        n5Var.setTextColor(i0.a.o(-1, 229));
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setFullTextMaxLines(1);
        n5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(n5Var, na.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, na.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(n6.x0(null, n6.f29534hh, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(l0Var.getContext());
        this.V = imageView;
        addView((View) imageView, na.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(l0Var.getContext());
        this.W = imageView2;
        addView(imageView2, na.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        imageView2.setImageDrawable(l0Var.getContext().getDrawable(2131232810));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L2 = org.telegram.messenger.g0.L(19.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = n6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.n2 n2Var2 = new org.telegram.ui.ActionBar.n2(4, l0Var.getContext(), this);
        this.O = n2Var2;
        n2Var2.setText(gd.N0(2131742970, null));
        n2Var2.setTextSize(1, 15.0f);
        n2Var2.setTypeface(org.telegram.messenger.g0.o());
        n2Var2.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        n2Var2.setTextColor(-1);
        n2Var2.setBackground(k02);
        n2Var2.setGravity(17);
        n2Var2.setOnClickListener(new z4(this, 24));
        addView(n2Var2, na.e(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.P = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        u6.U(textView, n6.f29497fh, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (v3.w(14, O0)) {
            textView.setText(org.telegram.messenger.g0.W2(gd.N0(2131747970, null)));
        } else {
            org.telegram.messenger.f3.q("NoRtmpStreamFromAppViewer", null, 2131747969, new Object[]{O0.title}, textView);
        }
        addView(textView, na.e(-2, -2, 51));
    }

    public static z c(ArrayList arrayList, a20 a20Var, s sVar, s10 s10Var, s sVar2, u3 u3Var, t3 t3Var, e40 e40Var) {
        z zVar;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (u3Var.equals(((z) arrayList.get(i7)).f41388x)) {
                    zVar = (z) arrayList.get(i7);
                    break;
                }
                i7++;
            } else {
                zVar = null;
                break;
            }
        }
        if (zVar == null) {
            zVar = new z(a20Var, t3Var, e40Var);
        }
        if (sVar != null) {
            zVar.setPrimaryView(sVar);
        }
        if (s10Var != null) {
            zVar.setSecondaryView(s10Var);
        }
        if (sVar2 != null) {
            zVar.setTabletGridView(sVar2);
        }
        return zVar;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        y yVar = this.f41362c0;
        if (yVar.getVisibility() == 0) {
            y.a(yVar, true);
        }
    }

    public final void b(boolean z10) {
        this.Q = true;
        this.f41386w = false;
        this.f41390y.f(this);
        if (z10) {
            if (this.f41388x.f27215a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f41388x.f27216b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                u3 u3Var = this.f41388x;
                sharedInstance.removeRemoteSink(u3Var.f27215a, u3Var.f27216b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f41363d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f41363d0.cancel();
        }
        this.f41357a.d.release();
    }

    public final void d() {
        String str;
        int f10;
        int f11;
        if (this.f41380r0 == null) {
            HashMap hashMap = this.G.h;
            u3 u3Var = this.f41388x;
            boolean z10 = u3Var.f27216b;
            TLRPC.GroupCallParticipant groupCallParticipant = u3Var.f27215a;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.f41380r0 = bitmap;
            this.f41357a.setThumb(bitmap);
            if (this.f41380r0 == null) {
                long B1 = fj.B1(this.f41388x.f27215a.peer);
                u3 u3Var2 = this.f41388x;
                boolean z11 = u3Var2.f27215a.self;
                ImageReceiver imageReceiver = this.m0;
                if (z11 && u3Var2.f27216b) {
                    imageReceiver.x0(new za0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                int i10 = this.L;
                if (i7 > 0) {
                    TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(B1));
                    fc l10 = fc.l(i10, 1, c22);
                    if (c22 != null) {
                        f11 = a9.d(c22.f28641id);
                    } else {
                        f11 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.r0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f11, -16777216), i0.a.f(0.4f, f11, -16777216)}), null, c22, 0);
                    return;
                }
                TLRPC.Chat O0 = mp.u1(i10).O0(Long.valueOf(-B1));
                fc a10 = fc.a(1, O0);
                if (O0 != null) {
                    f10 = a9.d(O0.f28492id);
                } else {
                    f10 = i0.a.f(0.2f, -16777216, -1);
                }
                imageReceiver.r0(a10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f10, -16777216), i0.a.f(0.4f, f10, -16777216)}), null, O0, 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        boolean z10 = this.f41386w;
        l0 l0Var = this.f41390y;
        v vVar = this.f41357a;
        if (z10) {
            float y10 = (vVar.getY() + vVar.getMeasuredHeight()) - vVar.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.f41378q0;
            boolean z11 = this.h;
            qh0 qh0Var = this.V;
            if (!z11 && !this.f41366f) {
                if (!this.f41359b && !this.f41379r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - l0Var.f41005c);
                        qh0Var.setAlpha(1.0f - l0Var.f41005c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        qh0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!e40.E5 && !e40.F5) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.t(1.0f, l0Var.f41002a0, org.telegram.messenger.g0.L(90.0f) * l0Var.f41005c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    qh0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - l0Var.f41018n);
                qh0Var.setAlpha(1.0f - l0Var.f41018n);
            }
            boolean z12 = this.f41359b;
            n5 n5Var = this.M;
            if (!z12 && !this.f41379r) {
                n5Var.setFullAlpha(0.0f);
            } else {
                n5Var.setFullAlpha(l0Var.f41005c);
            }
            qh0Var.setTranslationX(frameLayout.getX());
            qh0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.W;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((vVar.getMeasuredWidth() - (vVar.P * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.f41005c, 1.0f - l0Var.f41018n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f41392z0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(6.0f) * l0Var.f41005c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.f41386w) {
            o0 o0Var = this.f41376o0;
            if (o0Var != null) {
                boolean z13 = o0Var.f41095e;
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
            float f15 = (1.0f - l0Var.f41018n) * (1.0f - l0Var.f41005c) * f14;
            if (f14 > 0.0f) {
                int i7 = (int) (f15 * 255.0f);
                Paint paint = this.U;
                paint.setAlpha(i7);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f41378q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(vVar.getX() + vVar.P, vVar.getY() + vVar.O, (vVar.getX() + vVar.getMeasuredWidth()) - vVar.P, (vVar.getY() + vVar.getMeasuredHeight()) - vVar.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f41378q0);
                float f16 = vVar.f41108b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f41377p0 && (view == this.f41357a || view == this.f41362c0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f41378q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f41378q0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f41357a.d.release();
        o0 o0Var = this.f41376o0;
        if (o0Var != null) {
            this.H.f47398s4.add(o0Var);
            this.f41376o0.b();
            o0 o0Var2 = this.f41376o0;
            o0Var2.f41094c = null;
            o0Var2.c(false);
        }
        this.f41376o0 = null;
    }

    public final void f() {
        if (this.f41388x != null) {
            v vVar = this.f41357a;
            n2 n2Var = vVar.d;
            n2 n2Var2 = vVar.d;
            if (n2Var.getMeasuredHeight() != 0 && n2Var2.getMeasuredWidth() != 0) {
                n2Var2.getRenderBufferBitmap(new org.telegram.tgnet.g(this, 9));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f41374n != z10) {
            this.f41374n = z10;
            if ((this.f41361c != null || this.f41364e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long B1 = fj.B1(this.f41388x.f27215a.peer);
        if (org.telegram.messenger.n5.E(B1)) {
            return n10.q(mp.u1(org.telegram.messenger.c.a(i10.f24637t0).f23343a).c2(Long.valueOf(B1)));
        }
        return mp.u1(org.telegram.messenger.c.a(i10.f24637t0).f23343a).O0(Long.valueOf(-B1)).title;
    }

    public s getPrimaryView() {
        return this.f41361c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f41359b != z10) {
            this.f41359b = z10;
            this.S = true;
            j(z11);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f41367f0 == f10 && this.f41368g0 == f11 && this.f41369h0 == f12 && this.f41370i0 == f13 && this.f41371j0 == f14) {
            return;
        }
        this.f41372k0 = z10;
        this.f41367f0 = f10;
        this.f41368g0 = f11;
        this.f41369h0 = f12;
        this.f41370i0 = f13;
        this.f41371j0 = f14;
        this.f41357a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.R) {
            this.f41357a.invalidate();
        }
        s sVar = this.f41361c;
        if (sVar != null) {
            sVar.invalidate();
            e40 e40Var = this.H;
            if (e40Var.W4 == this.f41361c) {
                e40Var.f30226b.invalidate();
            }
        }
        s10 s10Var = this.d;
        if (s10Var != null) {
            s10Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void j(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.z.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.z.k(boolean):void");
    }

    public final void l(int i7) {
        int measuredWidth = this.f41390y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
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
        this.m0.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0.S();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.z.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.z.setAmplitude(double):void");
    }

    public void setPrimaryView(s sVar) {
        if (this.f41361c != sVar) {
            this.f41361c = sVar;
            this.S = true;
            j(true);
        }
    }

    public void setSecondaryView(s10 s10Var) {
        if (this.d != s10Var) {
            this.d = s10Var;
            this.S = true;
            j(true);
        }
    }

    public void setTabletGridView(s sVar) {
        if (this.f41364e != sVar) {
            this.f41364e = sVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }
}
