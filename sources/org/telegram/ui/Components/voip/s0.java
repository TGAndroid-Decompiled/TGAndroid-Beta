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
import b8.be;
import b8.cg;
import b8.mf;
import gi.j3;
import org.telegram.messenger.ac;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y00;
import org.webrtc.RendererCommon;
public final class s0 implements cs, wf.a {
    public static final kt0 f39587c0 = new kt0(new lf0(16), new lf0(17));
    public static final kt0 f39588d0 = new kt0(new lf0(18), new lf0(19));
    public static final s0 f39589e0;
    public boolean E;
    public org.telegram.messenger.c F;
    public ScaleGestureDetector G;
    public y00 H;
    public boolean I;
    public boolean J;
    public View K;
    public boolean L;
    public ValueAnimator M;
    public int N;
    public int O;
    public uf.d P;
    public float Q;
    public float R;
    public float S;
    public q1.g T;
    public q1.g U;
    public Float V;
    public boolean W;
    public boolean X;
    public d4 Y;
    public cg Z;
    public float f39590a;
    public z1 f39591a0;
    public WindowManager f39592b;
    public boolean f39593b0;
    public WindowManager.LayoutParams f39594c;
    public org.telegram.ui.e d;
    public ai.c0 f39595e;
    public z1 f39596f;
    public FrameLayout h;
    public g f39597n;
    public k9 f39598r;
    public r0 f39599s;
    public TLRPC.GroupCallParticipant f39600w;
    public boolean f39601x;
    public boolean f39602y;

    static {
        ?? obj = new Object();
        obj.f39590a = 1.4f;
        obj.f39597n = new g();
        obj.f39601x = true;
        obj.Q = 1.0f;
        obj.Y = new d4(obj, 8);
        f39589e0 = obj;
    }

    public static void b() {
        s0 s0Var = f39589e0;
        if (s0Var.W) {
            s0Var.W = false;
            org.telegram.messenger.g0.i3(new go(13), 100L);
            hs.f(s0Var.F.f21919a).n(s0Var, hs.f23328w2);
            hs.f(s0Var.F.f21919a).n(s0Var, hs.B2);
            hs.e().n(s0Var, hs.D2);
            ValueAnimator valueAnimator = s0Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (s0Var.X) {
                org.telegram.messenger.g0.r(s0Var.Y);
                s0Var.X = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(xq.f40452f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(s0Var.d, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s0Var.d, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(s0Var.d, View.SCALE_Y, 0.1f));
            animatorSet.addListener(new o0(s0Var));
            animatorSet.start();
            uf.d dVar = s0Var.P;
            if (dVar != null) {
                dVar.c();
                s0Var.P = null;
            }
        }
    }

    public static void h(Activity activity) {
        Activity activity2;
        s0 s0Var = f39589e0;
        s0Var.getClass();
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !s0Var.W) {
            s0Var.W = true;
            org.telegram.messenger.c cVar = VoIPService.getSharedInstance().groupCall.C;
            s0Var.F = cVar;
            hs.f(cVar.f21919a).b(s0Var, hs.f23328w2);
            hs.f(s0Var.F.f21919a).b(s0Var, hs.B2);
            hs.e().b(s0Var, hs.D2);
            s0Var.N = s0Var.f();
            s0Var.O = s0Var.e();
            s0Var.Q = 1.0f;
            s0Var.L = false;
            q1.g gVar = new q1.g(s0Var, f39587c0);
            q1.h hVar = new q1.h();
            hVar.a(0.75f);
            hVar.b(650.0f);
            gVar.f53653m = hVar;
            s0Var.T = gVar;
            q1.g gVar2 = new q1.g(s0Var, f39588d0);
            q1.h hVar2 = new q1.h();
            hVar2.a(0.75f);
            hVar2.b(650.0f);
            gVar2.f53653m = hVar2;
            s0Var.U = gVar2;
            if (activity != null) {
                activity2 = activity;
            } else {
                activity2 = org.telegram.messenger.t0.f25457b;
            }
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new ee0(s0Var, 1));
            s0Var.G = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            s0Var.G.setStylusScaleEnabled(false);
            s0Var.H = new y00(activity2, new p0(s0Var, scaledTouchSlop));
            s0Var.f39595e = new ai.c0(s0Var, activity2);
            org.telegram.ui.e eVar = new org.telegram.ui.e(2, activity2, s0Var);
            s0Var.d = eVar;
            eVar.addView(s0Var.f39595e, mf.c(-1.0f, -1));
            s0Var.f39595e.setOutlineProvider(new cg.p0(20));
            s0Var.f39595e.setClipToOutline(true);
            r6.i(k6.Ug, s0Var.f39595e, null);
            k9 k9Var = new k9(activity2);
            s0Var.f39598r = k9Var;
            s0Var.f39595e.addView(k9Var, mf.c(-1.0f, -1));
            z1 z1Var = new z1(activity2, false, false, false, false);
            s0Var.f39596f = z1Var;
            z1Var.setAlpha(0.0f);
            s0Var.f39596f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
            z1 z1Var2 = s0Var.f39596f;
            z1Var2.f39733b0 = 0;
            z1Var2.d.setRotateTextureWithScreen(true);
            s0Var.f39596f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new q0(s0Var));
            s0Var.f39595e.addView(s0Var.f39596f, mf.c(-1.0f, -1));
            r0 r0Var = new r0(0, activity2, s0Var);
            s0Var.f39599s = r0Var;
            s0Var.f39595e.addView(r0Var, mf.c(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(activity2);
            s0Var.h = frameLayout;
            frameLayout.setAlpha(0.0f);
            View view = new View(activity2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1140850688, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
            s0Var.h.addView(view, mf.c(-1.0f, -1));
            int L = org.telegram.messenger.g0.L(8.0f);
            ImageView e10 = org.telegram.messenger.camera.q.e(activity2, 2131232545);
            int i3 = k6.Vg;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            r6.t(e10, i3, null, mode);
            int i10 = k6.f27972i6;
            e10.setBackground(k6.h0(k6.x0(null, i10, false), 1, -1));
            e10.setPadding(L, L, L, L);
            e10.setOnClickListener(new ai.t(18));
            float f10 = 38;
            float f11 = 4;
            s0Var.h.addView(e10, mf.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
            ImageView imageView = new ImageView(activity2);
            imageView.setImageResource(2131232546);
            r6.t(imageView, i3, null, mode);
            imageView.setBackground(k6.h0(k6.x0(null, i10, false), 1, -1));
            imageView.setPadding(L, L, L, L);
            imageView.setOnClickListener(new ii.m(activity2, 23));
            s0Var.h.addView(imageView, mf.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
            s0Var.f39595e.addView(s0Var.h, mf.c(-1.0f, -1));
            s0Var.f39592b = (WindowManager) activity2.getSystemService("window");
            WindowManager.LayoutParams b10 = xf.b.b(activity2, false);
            s0Var.f39594c = b10;
            int i11 = s0Var.N;
            b10.width = i11;
            b10.height = s0Var.O;
            Point point = org.telegram.messenger.g0.f22608q;
            float L2 = (point.x - i11) - org.telegram.messenger.g0.L(16.0f);
            s0Var.R = L2;
            b10.x = (int) L2;
            WindowManager.LayoutParams layoutParams = s0Var.f39594c;
            float L3 = (point.y - s0Var.O) - org.telegram.messenger.g0.L(16.0f);
            s0Var.S = L3;
            layoutParams.y = (int) L3;
            WindowManager.LayoutParams layoutParams2 = s0Var.f39594c;
            layoutParams2.dimAmount = 0.0f;
            layoutParams2.flags = 520;
            s0Var.d.setAlpha(0.0f);
            s0Var.d.setScaleX(0.1f);
            s0Var.d.setScaleY(0.1f);
            org.telegram.messenger.g0.y3(s0Var.f39592b, s0Var.d, s0Var.f39594c);
            s0Var.f39592b.addView(s0Var.d, s0Var.f39594c);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(xq.f40452f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(s0Var.d, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(s0Var.d, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(s0Var.d, View.SCALE_Y, 1.0f));
            animatorSet.addListener(new m0(s0Var, 0));
            animatorSet.start();
            s0Var.a(false);
            hs.e().k(hs.F2, new Object[0]);
            uf.d dVar = s0Var.P;
            if (dVar != null) {
                dVar.c();
                s0Var.P = null;
            }
            if (activity != null && xf.b.a(activity) == 1) {
                uf.c cVar2 = new uf.c(activity, s0Var);
                cVar2.f55840c = "pip-rtmp-video";
                cVar2.f55841e = 1;
                cVar2.d = org.telegram.messenger.g0.L(10.0f);
                cVar2.f55845j = s0Var.d;
                cVar2.f55846k = s0Var.f39596f.getPlaceholderView();
                s0Var.P = cVar2.a();
            }
        }
    }

    public final void a(boolean z10) {
        Point point;
        float L;
        float f10;
        float f11;
        float f12;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        boolean z11;
        int f13;
        int f14;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z12 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.f25052f.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = ((s3) VoIPService.getSharedInstance().groupCall.f25052f.get(0)).f25270a;
            if (z10 || (groupCallParticipant2 = this.f39600w) == null || zi.C1(groupCallParticipant2.peer) != zi.C1(groupCallParticipant3.peer)) {
                if (this.f39600w != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.f39600w, this.E);
                }
                z1 z1Var = this.f39591a0;
                if (z1Var == null) {
                    z1Var = this.f39596f;
                }
                if (groupCallParticipant3.presentation != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.E = z11;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(z1Var.d, this.E, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.E, z1Var.d, null);
                }
                int i3 = VoIPService.getSharedInstance().groupCall.C.f21919a;
                hp s12 = hp.s1(i3);
                long C1 = zi.C1(groupCallParticipant3.peer);
                if (C1 > 0) {
                    TLRPC.User a22 = s12.a2(Long.valueOf(C1));
                    ac l10 = ac.l(i3, 1, a22);
                    if (a22 != null) {
                        f14 = u8.d(a22.f27150id);
                    } else {
                        f14 = i0.a.f(0.2f, -16777216, -1);
                    }
                    this.f39598r.getImageReceiver().q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f14, -16777216), i0.a.f(0.4f, f14, -16777216)}), null, a22, 0);
                } else {
                    TLRPC.Chat M0 = s12.M0(Long.valueOf(-C1));
                    ac a10 = ac.a(1, M0);
                    if (M0 != null) {
                        f13 = u8.d(M0.f27001id);
                    } else {
                        f13 = i0.a.f(0.2f, -16777216, -1);
                    }
                    this.f39598r.getImageReceiver().q0(a10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f13, -16777216), i0.a.f(0.4f, f13, -16777216)}), null, M0, 0);
                }
                this.f39600w = groupCallParticipant3;
            }
        } else if (this.f39600w != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.f39600w, false);
            }
            this.f39600w = null;
        }
        if (!this.f39602y || (groupCallParticipant = this.f39600w) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z12 = true;
        }
        if (this.f39601x != z12) {
            this.f39599s.animate().cancel();
            ViewPropertyAnimator animate = this.f39599s.animate();
            float f15 = 0.0f;
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f11).setDuration(150L);
            xq xqVar = xq.f40452f;
            duration.setInterpolator(xqVar).start();
            this.f39598r.animate().cancel();
            ViewPropertyAnimator animate2 = this.f39598r.animate();
            if (z12) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            animate2.alpha(f12).setDuration(150L).setInterpolator(xqVar).start();
            this.f39596f.animate().cancel();
            ViewPropertyAnimator animate3 = this.f39596f.animate();
            if (!z12) {
                f15 = 1.0f;
            }
            animate3.alpha(f15).setDuration(150L).setInterpolator(xqVar).start();
            this.f39601x = z12;
        }
        if (this.N == f() * this.Q && this.O == e() * this.Q) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f39594c;
        int f16 = (int) (f() * this.Q);
        this.N = f16;
        layoutParams.width = f16;
        WindowManager.LayoutParams layoutParams2 = this.f39594c;
        int e10 = (int) (e() * this.Q);
        this.O = e10;
        layoutParams2.height = e10;
        org.telegram.messenger.g0.T3(this.f39592b, this.d, this.f39594c);
        q1.g gVar = this.T;
        float f17 = this.R;
        gVar.f53644b = f17;
        gVar.f53645c = true;
        q1.h hVar = gVar.f53653m;
        float e11 = a1.g.e(f(), this.Q, 2.0f, f17);
        float f18 = org.telegram.messenger.g0.f22608q.x;
        if (e11 >= f18 / 2.0f) {
            L = (f18 - (f() * this.Q)) - org.telegram.messenger.g0.L(16.0f);
        } else {
            L = org.telegram.messenger.g0.L(16.0f);
        }
        hVar.f53661i = L;
        this.T.h();
        q1.g gVar2 = this.U;
        gVar2.f53644b = this.S;
        gVar2.f53645c = true;
        gVar2.f53653m.f53661i = be.a(f10, org.telegram.messenger.g0.L(16.0f), (point.y - (e() * this.Q)) - org.telegram.messenger.g0.L(16.0f));
        this.U.h();
    }

    @Override
    public final void c(cg cgVar) {
        this.Z = cgVar;
        z1 z1Var = this.f39596f;
        if (z1Var != null) {
            z1Var.d.clearFirstFrame();
        }
        a(true);
        this.f39593b0 = true;
        this.f39592b.removeView(this.d);
        this.d.invalidate();
    }

    public final float d() {
        float f10;
        if (this.V == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.f25052f.isEmpty()) {
                float f11 = ((s3) VoIPService.getSharedInstance().groupCall.f25052f.get(0)).f25272c;
                if (f11 != 0.0f) {
                    f10 = 1.0f / f11;
                    this.V = Float.valueOf(f10);
                    Point point = org.telegram.messenger.g0.f22608q;
                    this.f39590a = (Math.min(point.x, point.y) - org.telegram.messenger.g0.L(32.0f)) / f();
                }
            }
            f10 = 0.5625f;
            this.V = Float.valueOf(f10);
            Point point2 = org.telegram.messenger.g0.f22608q;
            this.f39590a = (Math.min(point2.x, point2.y) - org.telegram.messenger.g0.L(32.0f)) / f();
        }
        return this.V.floatValue();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.D2) {
            b();
        } else if (i3 == hs.f23328w2) {
            a(false);
        }
    }

    public final int e() {
        return (int) (d() * f());
    }

    public final int f() {
        float min;
        float f10;
        if (d() >= 1.0f) {
            Point point = org.telegram.messenger.g0.f22608q;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.g0.f22608q;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    @Override
    public final Bitmap g() {
        z1 z1Var = this.f39591a0;
        if (z1Var != null && z1Var.d.isAvailable()) {
            return this.f39591a0.d.getBitmap();
        }
        return null;
    }

    public final void j(boolean z10) {
        float f10;
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(200L);
        this.M = duration;
        duration.setInterpolator(xq.f40452f);
        this.M.addUpdateListener(new j3(this, 19));
        this.M.addListener(new m0(this, 1));
        this.M.start();
    }

    @Override
    public final Bitmap l() {
        z1 z1Var = this.f39596f;
        if (z1Var != null && z1Var.d.isAvailable()) {
            return this.f39596f.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final View q() {
        z1 z1Var = new z1(this.f39596f.getContext(), false, false, false, false);
        this.f39591a0 = z1Var;
        z1Var.d.setOpaque(false);
        this.f39591a0.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        z1 z1Var2 = this.f39591a0;
        z1Var2.f39733b0 = 0;
        z1Var2.d.setRotateTextureWithScreen(true);
        this.f39591a0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new n0(this));
        View view = this.f39591a0.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f39591a0;
    }

    @Override
    public final void r(cg cgVar) {
        this.Z = cgVar;
        uf.d dVar = this.P;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.f39594c;
            int width = ((Rect) this.P.h.f18942a).width();
            this.N = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.f39594c;
            int height = ((Rect) this.P.h.f18942a).height();
            this.O = height;
            layoutParams2.height = height;
        }
        this.f39593b0 = false;
        this.f39592b.addView(this.d, this.f39594c);
        this.d.invalidate();
        z1 z1Var = this.f39591a0;
        if (z1Var != null) {
            z1Var.d.release();
            this.f39591a0 = null;
        }
        a(true);
    }

    @Override
    public final void i(Canvas canvas) {
    }

    @Override
    public final void m(Canvas canvas) {
    }
}
