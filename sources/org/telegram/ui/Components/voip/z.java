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
import c8.ja;
import di.m6;
import hi.p5;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.t8;
import org.telegram.ui.c40;
import org.telegram.ui.y10;
import org.webrtc.RendererCommon;
public final class z extends FrameLayout implements n0 {
    public boolean A0;
    public final s B0;
    public final Rect C0;
    public m6 D0;
    public final Paint E;
    public int E0;
    public boolean F;
    public int F0;
    public final r3 G;
    public int G0;
    public final c40 H;
    public ValueAnimator H0;
    public boolean I;
    public int I0;
    public float J;
    public int J0;
    public final FrameLayout K;
    public ValueAnimator K0;
    public final int L;
    public boolean L0;
    public final j5 M;
    public int N;
    public final org.telegram.ui.ActionBar.l2 O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public final Paint U;
    public final fh0 V;
    public final ImageView W;
    public final v f41081a;
    public boolean f41082a0;
    public boolean f41083b;
    public float f41084b0;
    public r f41085c;
    public final y f41086c0;
    public k10 d;
    public ValueAnimator f41087d0;
    public r f41088e;
    public boolean f41089e0;
    public boolean f41090f;
    public float f41091f0;
    public float f41092g0;
    public boolean h;
    public float f41093h0;
    public float f41094i0;
    public float f41095j0;
    public boolean f41096k0;
    public float f41097l0;
    public final ImageReceiver m0;
    public boolean f41098n;
    public final ArrayList f41099n0;
    public o0 f41100o0;
    public boolean f41101p0;
    public float f41102q0;
    public boolean f41103r;
    public Bitmap f41104r0;
    public boolean f41105s;
    public Paint f41106s0;
    public boolean f41107t0;
    public float f41108u0;
    public final br f41109v0;
    public boolean f41110w;
    public final Drawable f41111w0;
    public s3 f41112x;
    public float f41113x0;
    public final l0 f41114y;
    public ImageView f41115y0;
    public boolean f41116z0;

    public z(l0 l0Var, r3 r3Var, c40 c40Var) {
        super(l0Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.U = paint;
        this.f41084b0 = 1.0f;
        this.m0 = new ImageReceiver(null);
        this.f41099n0 = new ArrayList();
        this.B0 = new s(this, 1);
        this.C0 = new Rect();
        this.G = r3Var;
        int i7 = c40Var.f29679a;
        this.L = i7;
        br brVar = new br(l0Var.getContext(), 2131230926, -1);
        this.f41109v0 = brVar;
        brVar.a(true, false);
        brVar.f33352i = -org.telegram.messenger.g0.L(4.0f);
        brVar.f33353j = org.telegram.messenger.g0.L(6.0f);
        brVar.f33354k = org.telegram.messenger.g0.L(6.0f);
        brVar.invalidateSelf();
        float N = org.telegram.messenger.g0.N(3.4f);
        brVar.f33348c.setStrokeWidth(N);
        brVar.d.setStrokeWidth(N * 1.47f);
        this.f41111w0 = l0Var.getContext().getResources().getDrawable(2131232680).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = hd.M0(2131743224, null);
        String M02 = hd.M0(2131743221, null);
        int L = org.telegram.messenger.g0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat M03 = np.s1(i7).M0(Long.valueOf(r3Var.f26217c));
        StaticLayout staticLayout2 = new StaticLayout(hd.a0("VoipVideoNotAvailable", null, 2131743226, hd.G(np.s1(i7).f25232a4, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M04 = hd.M0(2131743222, null);
        v vVar = new v(this, l0Var.getContext(), r3Var, l0Var, textPaint, staticLayout2, textPaint2, M04, textPaint2.measureText(M04), staticLayout, c40Var, M0, textPaint.measureText(M0));
        this.f41081a = vVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        n2 n2Var = vVar.d;
        n2Var.setScalingType(scalingType);
        this.f41114y = l0Var;
        this.H = c40Var;
        n2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new w(this));
        TextureView textureView = vVar.f40836e;
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
        this.f41086c0 = yVar;
        addView(yVar);
        j5 j5Var = new j5(l0Var.getContext());
        this.M = j5Var;
        j5Var.setTextSize(13);
        j5Var.setTextColor(i0.a.o(-1, 229));
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setFullTextMaxLines(1);
        j5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(j5Var, ja.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, ja.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(j6.x0(null, j6.f28932hh, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(l0Var.getContext());
        this.V = imageView;
        addView((View) imageView, ja.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(l0Var.getContext());
        this.W = imageView2;
        addView(imageView2, ja.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        imageView2.setImageDrawable(l0Var.getContext().getDrawable(2131232805));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L2 = org.telegram.messenger.g0.L(19.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = j6.k0(L2, L2, L2, L2, 0, o4, o4);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2(4, l0Var.getContext(), this);
        this.O = l2Var;
        l2Var.setText(hd.M0(2131743220, null));
        l2Var.setTextSize(1, 15.0f);
        l2Var.setTypeface(org.telegram.messenger.g0.o());
        l2Var.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        l2Var.setTextColor(-1);
        l2Var.setBackground(k02);
        l2Var.setGravity(17);
        l2Var.setOnClickListener(new p5(this, 23));
        addView(l2Var, ja.e(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.P = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        q6.U(textView, j6.f28895fh, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (t3.w(14, M03)) {
            textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131748163, null)));
        } else {
            k5.q("NoRtmpStreamFromAppViewer", null, 2131748162, new Object[]{M03.title}, textView);
        }
        addView(textView, ja.e(-2, -2, 51));
    }

    public static z c(ArrayList arrayList, y10 y10Var, r rVar, k10 k10Var, r rVar2, s3 s3Var, r3 r3Var, c40 c40Var) {
        z zVar;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (s3Var.equals(((z) arrayList.get(i7)).f41112x)) {
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
            zVar = new z(y10Var, r3Var, c40Var);
        }
        if (rVar != null) {
            zVar.setPrimaryView(rVar);
        }
        if (k10Var != null) {
            zVar.setSecondaryView(k10Var);
        }
        if (rVar2 != null) {
            zVar.setTabletGridView(rVar2);
        }
        return zVar;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        y yVar = this.f41086c0;
        if (yVar.getVisibility() == 0) {
            y.a(yVar, true);
        }
    }

    public final void b(boolean z10) {
        this.Q = true;
        this.f41110w = false;
        this.f41114y.f(this);
        if (z10) {
            if (this.f41112x.f26403a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f41112x.f26404b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                s3 s3Var = this.f41112x;
                sharedInstance.removeRemoteSink(s3Var.f26403a, s3Var.f26404b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f41087d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f41087d0.cancel();
        }
        this.f41081a.d.release();
    }

    public final void d() {
        String str;
        int f10;
        int f11;
        if (this.f41104r0 == null) {
            HashMap hashMap = this.G.h;
            s3 s3Var = this.f41112x;
            boolean z10 = s3Var.f26404b;
            TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f26403a;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.f41104r0 = bitmap;
            this.f41081a.setThumb(bitmap);
            if (this.f41104r0 == null) {
                long B1 = gj.B1(this.f41112x.f26403a.peer);
                s3 s3Var2 = this.f41112x;
                boolean z11 = s3Var2.f26403a.self;
                ImageReceiver imageReceiver = this.m0;
                if (z11 && s3Var2.f26404b) {
                    imageReceiver.w0(new ra0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                int i10 = this.L;
                if (i7 > 0) {
                    TLRPC.User a22 = np.s1(i10).a2(Long.valueOf(B1));
                    gc l10 = gc.l(i10, 1, a22);
                    if (a22 != null) {
                        f11 = t8.d(a22.f28200id);
                    } else {
                        f11 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f11, -16777216), i0.a.f(0.4f, f11, -16777216)}), null, a22, 0);
                    return;
                }
                TLRPC.Chat M0 = np.s1(i10).M0(Long.valueOf(-B1));
                gc a10 = gc.a(1, M0);
                if (M0 != null) {
                    f10 = t8.d(M0.f28051id);
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
        boolean z10 = this.f41110w;
        l0 l0Var = this.f41114y;
        v vVar = this.f41081a;
        if (z10) {
            float y10 = (vVar.getY() + vVar.getMeasuredHeight()) - vVar.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.f41102q0;
            boolean z11 = this.h;
            fh0 fh0Var = this.V;
            if (!z11 && !this.f41090f) {
                if (!this.f41083b && !this.f41103r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - l0Var.f40729c);
                        fh0Var.setAlpha(1.0f - l0Var.f40729c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        fh0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!c40.E5 && !c40.F5) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.t(1.0f, l0Var.f40726a0, org.telegram.messenger.g0.L(90.0f) * l0Var.f40729c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    fh0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - l0Var.f40742n);
                fh0Var.setAlpha(1.0f - l0Var.f40742n);
            }
            boolean z12 = this.f41083b;
            j5 j5Var = this.M;
            if (!z12 && !this.f41103r) {
                j5Var.setFullAlpha(0.0f);
            } else {
                j5Var.setFullAlpha(l0Var.f40729c);
            }
            fh0Var.setTranslationX(frameLayout.getX());
            fh0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.W;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((vVar.getMeasuredWidth() - (vVar.P * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.f40729c, 1.0f - l0Var.f40742n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f41116z0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(6.0f) * l0Var.f40729c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.f41110w) {
            o0 o0Var = this.f41100o0;
            if (o0Var != null) {
                boolean z13 = o0Var.f40818e;
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
            float f15 = (1.0f - l0Var.f40742n) * (1.0f - l0Var.f40729c) * f14;
            if (f14 > 0.0f) {
                int i7 = (int) (f15 * 255.0f);
                Paint paint = this.U;
                paint.setAlpha(i7);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f41102q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(vVar.getX() + vVar.P, vVar.getY() + vVar.O, (vVar.getX() + vVar.getMeasuredWidth()) - vVar.P, (vVar.getY() + vVar.getMeasuredHeight()) - vVar.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f41102q0);
                float f16 = vVar.f40831b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f41101p0 && (view == this.f41081a || view == this.f41086c0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f41102q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f41102q0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f41081a.d.release();
        o0 o0Var = this.f41100o0;
        if (o0Var != null) {
            this.H.f45962s4.add(o0Var);
            this.f41100o0.b();
            o0 o0Var2 = this.f41100o0;
            o0Var2.f40817c = null;
            o0Var2.c(false);
        }
        this.f41100o0 = null;
    }

    public final void f() {
        if (this.f41112x != null) {
            v vVar = this.f41081a;
            n2 n2Var = vVar.d;
            n2 n2Var2 = vVar.d;
            if (n2Var.getMeasuredHeight() != 0 && n2Var2.getMeasuredWidth() != 0) {
                n2Var2.getRenderBufferBitmap(new org.telegram.ui.ActionBar.z(this, 5));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f41098n != z10) {
            this.f41098n = z10;
            if ((this.f41085c != null || this.f41088e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long B1 = gj.B1(this.f41112x.f26403a.peer);
        if (m5.E(B1)) {
            return q10.p(np.s1(org.telegram.messenger.c.a(m10.f24940t0).f22782a).a2(Long.valueOf(B1)));
        }
        return np.s1(org.telegram.messenger.c.a(m10.f24940t0).f22782a).M0(Long.valueOf(-B1)).title;
    }

    public r getPrimaryView() {
        return this.f41085c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f41083b != z10) {
            this.f41083b = z10;
            this.S = true;
            j(z11);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f41091f0 == f10 && this.f41092g0 == f11 && this.f41093h0 == f12 && this.f41094i0 == f13 && this.f41095j0 == f14) {
            return;
        }
        this.f41096k0 = z10;
        this.f41091f0 = f10;
        this.f41092g0 = f11;
        this.f41093h0 = f12;
        this.f41094i0 = f13;
        this.f41095j0 = f14;
        this.f41081a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.R) {
            this.f41081a.invalidate();
        }
        r rVar = this.f41085c;
        if (rVar != null) {
            rVar.invalidate();
            c40 c40Var = this.H;
            if (c40Var.W4 == this.f41085c) {
                c40Var.f29682b.invalidate();
            }
        }
        k10 k10Var = this.d;
        if (k10Var != null) {
            k10Var.invalidate();
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
        int measuredWidth = this.f41114y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.z.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.z.setAmplitude(double):void");
    }

    public void setPrimaryView(r rVar) {
        if (this.f41085c != rVar) {
            this.f41085c = rVar;
            this.S = true;
            j(true);
        }
    }

    public void setSecondaryView(k10 k10Var) {
        if (this.d != k10Var) {
            this.d = k10Var;
            this.S = true;
            j(true);
        }
    }

    public void setTabletGridView(r rVar) {
        if (this.f41088e != rVar) {
            this.f41088e = rVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }
}
