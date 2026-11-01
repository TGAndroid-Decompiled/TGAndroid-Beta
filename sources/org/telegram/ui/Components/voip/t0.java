package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.r8;
import org.webrtc.RendererCommon;
import w7.b6;
public final class t0 implements vs, lf.a {
    public static final pu0 f31722b0 = new pu0(new a21(2), new a21(3));
    public static final pu0 f31723c0 = new pu0(new a21(4), new a21(5));
    public static final t0 f31724d0;
    public boolean D;
    public org.telegram.messenger.c E;
    public ScaleGestureDetector F;
    public m2.t G;
    public boolean H;
    public boolean I;
    public View J;
    public boolean K;
    public ValueAnimator L;
    public int M;
    public int N;
    public jf.f O;
    public float P;
    public float Q;
    public float R;
    public o1.j S;
    public o1.j T;
    public Float U;
    public boolean V;
    public boolean W;
    public w5 X;
    public com.google.android.gms.internal.cast.o Y;
    public z1 Z;
    public float f31725a;
    public boolean f31726a0;
    public WindowManager f31727b;
    public WindowManager.LayoutParams f31728c;
    public jf.g d;
    public fg.i e;
    public z1 f31729f;
    public FrameLayout h;
    public g f31730n;
    public g9 f31731r;
    public bi.t0 f31732s;
    public TLRPC.GroupCallParticipant f31733w;
    public boolean f31734x;
    public boolean f31735y;

    static {
        ?? obj = new Object();
        obj.f31725a = 1.4f;
        obj.f31730n = new g();
        obj.f31734x = true;
        obj.P = 1.0f;
        obj.X = new w5(obj, 4);
        f31724d0 = obj;
    }

    public static void b() {
        t0 t0Var = f31724d0;
        if (t0Var.V) {
            t0Var.V = false;
            org.telegram.messenger.i0.h3(new n0(0), 100L);
            at.f(t0Var.E.f15043a).n(t0Var, at.f14809w2);
            at.f(t0Var.E.f15043a).n(t0Var, at.B2);
            at.e().n(t0Var, at.D2);
            ValueAnimator valueAnimator = t0Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (t0Var.W) {
                org.telegram.messenger.i0.r(t0Var.X);
                t0Var.W = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f26523f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(t0Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t0Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(t0Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new q0(t0Var));
            animatorSet.start();
            jf.f fVar = t0Var.O;
            if (fVar != null) {
                fVar.c();
                t0Var.O = null;
            }
        }
    }

    public static void h(Activity activity) {
        Activity activity2;
        t0 t0Var = f31724d0;
        t0Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !t0Var.V) {
            t0Var.V = true;
            org.telegram.messenger.c cVar = VoIPService.getSharedInstance().groupCall.C;
            t0Var.E = cVar;
            at.f(cVar.f15043a).b(t0Var, at.f14809w2);
            at.f(t0Var.E.f15043a).b(t0Var, at.B2);
            at.e().b(t0Var, at.D2);
            t0Var.M = t0Var.f();
            t0Var.N = t0Var.e();
            t0Var.P = 1.0f;
            t0Var.K = false;
            o1.j jVar = new o1.j(t0Var, f31722b0);
            o1.k kVar = new o1.k();
            kVar.a(0.75f);
            kVar.b(650.0f);
            jVar.f13958m = kVar;
            t0Var.S = jVar;
            o1.j jVar2 = new o1.j(t0Var, f31723c0);
            o1.k kVar2 = new o1.k();
            kVar2.a(0.75f);
            kVar2.b(650.0f);
            jVar2.f13958m = kVar2;
            t0Var.T = jVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = org.telegram.messenger.w0.f18945b;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new eg.b(t0Var, 2));
            t0Var.F = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            t0Var.F.setStylusScaleEnabled(false);
            t0Var.G = new m2.t(activity2, new r0(t0Var, scaledTouchSlop));
            t0Var.e = new fg.i(t0Var, activity2);
            jf.g gVar = new jf.g(t0Var, activity2, 3);
            t0Var.d = gVar;
            gVar.addView(t0Var.e, b6.c(-1.0f, -1));
            t0Var.e.setOutlineProvider(new bi.d2(17));
            t0Var.e.setClipToOutline(true);
            a7.i(t6.Ug, t0Var.e, null);
            g9 g9Var = new g9(activity2);
            t0Var.f31731r = g9Var;
            t0Var.e.addView(g9Var, b6.c(-1.0f, -1));
            z1 z1Var = new z1(activity2, false, false, false, false);
            t0Var.f31729f = z1Var;
            z1Var.setAlpha(0.0f);
            t0Var.f31729f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            z1 z1Var2 = t0Var.f31729f;
            z1Var2.f31848a0 = 0;
            z1Var2.d.setRotateTextureWithScreen(true);
            t0Var.f31729f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new s0(t0Var));
            t0Var.e.addView(t0Var.f31729f, b6.c(-1.0f, -1));
            bi.t0 t0Var2 = new bi.t0(t0Var, activity2, 24);
            t0Var.f31732s = t0Var2;
            t0Var.e.addView(t0Var2, b6.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            t0Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            t0Var.h.addView(view, b6.c(-1.0f, -1));
            int L = org.telegram.messenger.i0.L(8.0f);
            ImageView e = a30.e(activity2, 2131232544);
            int i10 = t6.Vg;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            a7.t(e, i10, null, mode);
            int i11 = t6.f21021i6;
            e.setBackground(t6.h0(t6.x0(null, i11, false), 1, -1));
            e.setPadding(L, L, L, L);
            e.setOnClickListener(new bh.c(10));
            float f7 = 38;
            float f10 = 4;
            t0Var.h.addView(e, b6.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(2131232545);
            a7.t(imageView, i10, null, mode);
            imageView.setBackground(t6.h0(t6.x0(null, i11, false), 1, -1));
            imageView.setPadding(L, L, L, L);
            imageView.setOnClickListener(new ag.g(activity2, 23));
            t0Var.h.addView(imageView, b6.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
            t0Var.e.addView(t0Var.h, b6.c(-1.0f, -1));
            t0Var.f31727b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = mf.b.b(activity2, false);
            t0Var.f31728c = b10;
            int i12 = t0Var.M;
            b10.width = i12;
            b10.height = t0Var.N;
            Point point = org.telegram.messenger.i0.f16172q;
            float L2 = (point.x - i12) - org.telegram.messenger.i0.L(16.0f);
            t0Var.Q = L2;
            b10.x = (int) L2;
            WindowManager.LayoutParams layoutParams = t0Var.f31728c;
            float L3 = (point.y - t0Var.N) - org.telegram.messenger.i0.L(16.0f);
            t0Var.R = L3;
            layoutParams.y = (int) L3;
            WindowManager.LayoutParams layoutParams2 = t0Var.f31728c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            t0Var.d.setAlpha(0.0f);
            t0Var.d.setScaleX(0.1f);
            t0Var.d.setScaleY(0.1f);
            org.telegram.messenger.i0.x3(t0Var.f31727b, t0Var.d, t0Var.f31728c);
            t0Var.f31727b.addView(t0Var.d, t0Var.f31728c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f26523f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(t0Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(t0Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(t0Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new o0(t0Var, 0));
            animatorSet.start();
            t0Var.a(false);
            at.e().k(at.F2, new Object[0]);
            jf.f fVar = t0Var.O;
            if (fVar != null) {
                fVar.c();
                t0Var.O = null;
            }
            if (activity != null && mf.b.a(activity) == 1) {
                jf.e eVar = new jf.e(activity, t0Var);
                eVar.f9855c = "pip-rtmp-video";
                eVar.e = 1;
                eVar.d = org.telegram.messenger.i0.L(10.0f);
                eVar.f9859j = t0Var.d;
                eVar.f9860k = t0Var.f31729f.getPlaceholderView();
                t0Var.O = eVar.a();
            }
        }
    }

    public final void a(boolean z10) {
        Point point;
        float L;
        float f7;
        float f10;
        float f11;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        boolean z11;
        int f12;
        int f13;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z12 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.f18363f.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = ((v3) VoIPService.getSharedInstance().groupCall.f18363f.get(0)).f18588a;
            if (z10 || (groupCallParticipant2 = this.f31733w) == null || kj.C1(groupCallParticipant2.peer) != kj.C1(groupCallParticipant3.peer)) {
                if (this.f31733w != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.f31733w, this.D);
                }
                z1 z1Var = this.Z;
                if (z1Var == null) {
                    z1Var = this.f31729f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.D = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(z1Var.d, this.D, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.D, z1Var.d, null);
                }
                int i10 = VoIPService.getSharedInstance().groupCall.C.f15043a;
                wp r12 = wp.r1(i10);
                long C1 = kj.C1(groupCallParticipant3.peer);
                if (C1 > 0) {
                    TLRPC.User Z1 = r12.Z1(Long.valueOf(C1));
                    jc l4 = jc.l(i10, 1, Z1);
                    if (Z1 != null) {
                        f13 = r8.d(Z1.f19943id);
                    } else {
                        f13 = i0.b.f(0.2f, -16777216, -1);
                    }
                    this.f31731r.getImageReceiver().q0(l4, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.f(0.2f, f13, -16777216), i0.b.f(0.4f, f13, -16777216)}), null, Z1, 0);
                } else {
                    TLRPC.Chat L0 = r12.L0(Long.valueOf(-C1));
                    jc a2 = jc.a(1, L0);
                    if (L0 != null) {
                        f12 = r8.d(L0.f19794id);
                    } else {
                        f12 = i0.b.f(0.2f, -16777216, -1);
                    }
                    this.f31731r.getImageReceiver().q0(a2, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.f(0.2f, f12, -16777216), i0.b.f(0.4f, f12, -16777216)}), null, L0, 0);
                }
                this.f31733w = groupCallParticipant3;
            }
        } else if (this.f31733w != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.f31733w, false);
            }
            this.f31733w = null;
        }
        if (!this.f31735y || (groupCallParticipant = this.f31733w) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f31734x != z12) {
            this.f31732s.animate().cancel();
            ViewPropertyAnimator animate = this.f31732s.animate();
            float f14 = 0.0f;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
            gr grVar = gr.f26523f;
            duration.setInterpolator(grVar).start();
            this.f31731r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f31731r.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate2.alpha(f11).setDuration(150L).setInterpolator(grVar).start();
            this.f31729f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f31729f.animate();
            if (!z12) {
                f14 = 1.0f;
            }
            animate3.alpha(f14).setDuration(150L).setInterpolator(grVar).start();
            this.f31734x = z12;
        }
        if (this.M == f() * this.P && this.N == e() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f31728c;
        int f15 = (int) (f() * this.P);
        this.M = f15;
        layoutParams.width = f15;
        WindowManager.LayoutParams layoutParams2 = this.f31728c;
        int e = (int) (e() * this.P);
        this.N = e;
        layoutParams2.height = e;
        org.telegram.messenger.i0.S3(this.f31727b, this.d, this.f31728c);
        o1.j jVar = this.S;
        float f16 = this.Q;
        jVar.f13950b = f16;
        jVar.f13951c = true;
        o1.k kVar = jVar.f13958m;
        float A = a1.g.A(f(), this.P, 2.0f, f16);
        float f17 = org.telegram.messenger.i0.f16172q.x;
        if (A >= f17 / 2.0f) {
            L = (f17 - (f() * this.P)) - org.telegram.messenger.i0.L(16.0f);
        } else {
            L = org.telegram.messenger.i0.L(16.0f);
        }
        kVar.f13965i = L;
        this.S.h();
        o1.j jVar2 = this.T;
        jVar2.f13950b = this.R;
        jVar2.f13951c = true;
        jVar2.f13958m.f13965i = w7.u.a(f7, org.telegram.messenger.i0.L(16.0f), (point.y - (e() * this.P)) - org.telegram.messenger.i0.L(16.0f));
        this.T.h();
    }

    @Override
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        this.Y = oVar;
        z1 z1Var = this.f31729f;
        if (z1Var != null) {
            z1Var.d.clearFirstFrame();
        }
        a(true);
        this.f31726a0 = true;
        this.f31727b.removeView(this.d);
        this.d.invalidate();
    }

    public final float d() {
        float f7;
        if (this.U == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.f18363f.isEmpty()) {
                float f10 = ((v3) VoIPService.getSharedInstance().groupCall.f18363f.get(0)).f18590c;
                if (f10 != 0.0f) {
                    f7 = 1.0f / f10;
                    this.U = Float.valueOf(f7);
                    Point point = org.telegram.messenger.i0.f16172q;
                    this.f31725a = (Math.min(point.x, point.y) - org.telegram.messenger.i0.L(32.0f)) / f();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = org.telegram.messenger.i0.f16172q;
            this.f31725a = (Math.min(point2.x, point2.y) - org.telegram.messenger.i0.L(32.0f)) / f();
        }
        return this.U.floatValue();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.D2) {
            b();
        } else if (i10 == at.f14809w2) {
            a(false);
        }
    }

    public final int e() {
        return (int) (d() * f());
    }

    public final int f() {
        float min;
        float f7;
        if (d() >= 1.0f) {
            Point point = org.telegram.messenger.i0.f16172q;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.i0.f16172q;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    @Override
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        this.Y = oVar;
        jf.f fVar = this.O;
        if (fVar != null && fVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f31728c;
            int width = ((Rect) this.O.h.f10753a).width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f31728c;
            int height = ((Rect) this.O.h.f10753a).height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.f31726a0 = false;
        this.f31727b.addView(this.d, this.f31728c);
        this.d.invalidate();
        z1 z1Var = this.Z;
        if (z1Var != null) {
            z1Var.d.release();
            this.Z = null;
        }
        a(true);
    }

    @Override
    public final Bitmap i() {
        z1 z1Var = this.Z;
        if (z1Var != null && z1Var.d.isAvailable()) {
            return this.Z.d.getBitmap();
        }
        return null;
    }

    public final void j(boolean z10) {
        float f7;
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(200L);
        this.L = duration;
        duration.setInterpolator(gr.f26523f);
        this.L.addUpdateListener(new bg.k(this, 22));
        this.L.addListener(new o0(this, 1));
        this.L.start();
    }

    @Override
    public final Bitmap m() {
        z1 z1Var = this.f31729f;
        if (z1Var != null && z1Var.d.isAvailable()) {
            return this.f31729f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final View r() {
        z1 z1Var = new z1(this.f31729f.getContext(), false, false, false, false);
        this.Z = z1Var;
        z1Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        z1 z1Var2 = this.Z;
        z1Var2.f31848a0 = 0;
        z1Var2.d.setRotateTextureWithScreen(true);
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p0(this));
        View view = this.Z.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.Z;
    }

    @Override
    public final void l(Canvas canvas) {
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
