package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoFrame;
public final class dt implements Runnable {
    public final int f33072a;
    public final Object f33073b;

    public dt(Object obj, int i7) {
        this.f33072a = i7;
        this.f33073b = obj;
    }

    private final void a() {
        s8.a aVar = (s8.a) this.f33073b;
        synchronized (aVar.f54983a) {
            try {
                if (!aVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.f54990j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (!aVar.b()) {
                    return;
                }
                aVar.f54985c = 1;
                aVar.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        int L;
        boolean z9;
        boolean z10;
        float f10;
        float f11;
        String str;
        int i7;
        int i10;
        long j3 = 17;
        float f12 = 0.0f;
        switch (this.f33072a) {
            case 0:
                kt ktVar = (kt) this.f33073b;
                dt dtVar = ktVar.P;
                et etVar = ktVar.f35433a;
                if (!ktVar.D && etVar != null && ktVar.N && !ktVar.f35441w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    etVar.requestFocus();
                    org.telegram.messenger.g0.K3(etVar);
                    org.telegram.messenger.g0.r(dtVar);
                    org.telegram.messenger.g0.i3(dtVar, 100L);
                    return;
                }
                return;
            case 1:
                ab.q qVar = (ab.q) ((di.h3) this.f33073b).d;
                if (qVar.f989a && !((ArrayList) qVar.d).isEmpty() && !((AnimatorSet) qVar.f991c).isRunning()) {
                    try {
                        ((AnimatorSet) qVar.f991c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                gy gyVar = (gy) this.f33073b;
                if (gyVar.B0.f37704s == null) {
                    gyVar.X1 = false;
                    gyVar.Z();
                    return;
                }
                return;
            case 3:
                ez ezVar = (ez) this.f33073b;
                if (ezVar.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 17) {
                        j3 = elapsedRealtime;
                    }
                    float f13 = ezVar.f33383p0 + (((float) j3) / 320.0f);
                    ezVar.f33383p0 = f13;
                    ezVar.setAnimationIdicatorProgress(ezVar.f33376i0.getInterpolation(f13));
                    if (ezVar.f33383p0 > 1.0f) {
                        ezVar.f33383p0 = 1.0f;
                    }
                    if (ezVar.f33383p0 < 1.0f) {
                        org.telegram.messenger.g0.h3(ezVar.f33391v0);
                        return;
                    }
                    ezVar.O = false;
                    ezVar.setEnabled(true);
                    az azVar = ezVar.J;
                    if (azVar != null) {
                        ((org.telegram.ui.qw) azVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f33073b;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                org.telegram.messenger.g0.i3(fragmentContextView.f31419t0, 1000L);
                return;
            case 5:
                TextureView textureView = ((g40) this.f33073b).H0.f36502p0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.h3(new ro(23, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 6:
                l50 l50Var = (l50) this.f33073b;
                m50 m50Var = l50Var.D;
                z40 z40Var = m50Var.P1;
                if (z40Var != null && z40Var.getAdapter() != null) {
                    m50Var.P1.getClass();
                    int R = RecyclerView.R(l50Var);
                    if (R >= 0) {
                        m50Var.N1.t(m50Var.P1.T(l50Var), R);
                    }
                }
                org.telegram.messenger.g0.h3(this);
                return;
            case 7:
                ia0 ia0Var = (ia0) this.f33073b;
                ValueAnimator valueAnimator = ia0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ia0Var.h.start();
                    return;
                }
                return;
            case 8:
                ((ec0) this.f33073b).e();
                return;
            case 9:
                kg0 kg0Var = (kg0) this.f33073b;
                kg0Var.f35346y = true;
                ValueAnimator valueAnimator2 = kg0Var.f35347z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                kg0Var.f35345x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                kg0Var.f35347z = ofFloat;
                ofFloat.addUpdateListener(kg0Var.f35323b0);
                kg0Var.f35347z.setInterpolator(new LinearInterpolator());
                kg0Var.f35347z.setDuration(150L);
                kg0Var.f35347z.start();
                return;
            case 10:
                pj0 pj0Var = (pj0) this.f33073b;
                m.c3 c3Var = pj0Var.f36966f2;
                int[] iArr = pj0Var.f36976k2;
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) c3Var.d;
                iArr[0] = (int) cnVar.N9;
                iArr[1] = cnVar.Wa;
                if (pj0Var.f36970h2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    pj0Var.M0(0.0f, pj0Var.f36976k2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    pj0Var.M0(0.0f, pj0Var.getMeasuredHeight() - pj0Var.f36976k2[1]);
                }
                ((org.telegram.ui.cn) pj0Var.f36966f2.d).f44741z0.scrollBy(0, L);
                if (pj0Var.f36968g2) {
                    org.telegram.messenger.g0.h3(pj0Var.C2);
                    return;
                }
                return;
            case 11:
                ui0 ui0Var = (ui0) this.f33073b;
                dt dtVar2 = ui0Var.f38677i0;
                if (ui0Var.f38681n) {
                    org.telegram.messenger.g0.r(dtVar2);
                    org.telegram.messenger.g0.i3(dtVar2, 4000L);
                    return;
                }
                ui0Var.U = false;
                ui0Var.invalidate();
                return;
            case 12:
                tj0 tj0Var = (tj0) this.f33073b;
                RecyclerView recyclerView = tj0Var.f38323a;
                if (recyclerView != null) {
                    if (tj0Var.f38328g) {
                        recyclerView.scrollBy(0, -tj0Var.f38329i);
                        org.telegram.messenger.g0.h3(this);
                        return;
                    } else if (tj0Var.h) {
                        recyclerView.scrollBy(0, tj0Var.f38329i);
                        org.telegram.messenger.g0.h3(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f33073b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 <= 17) {
                        j3 = elapsedRealtime2;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) j3) / ((float) scrollSlidingTextTabStrip.f31540b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        org.telegram.messenger.g0.h3(scrollSlidingTextTabStrip.f31543d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    uk0 uk0Var = scrollSlidingTextTabStrip.f31539b;
                    if (uk0Var != null) {
                        uk0Var.F0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ShutterButton shutterButton = (ShutterButton) this.f33073b;
                ct0 ct0Var = shutterButton.f31564e;
                if (ct0Var != null) {
                    final gl glVar = (gl) ct0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = glVar.f33932e;
                    ci ciVar = chatAttachAlertPhotoLayout.f38656b;
                    nl nlVar = chatAttachAlertPhotoLayout.R;
                    int i11 = ciVar.N2;
                    org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                    if ((i11 == 2 || (f2Var instanceof org.telegram.ui.cn)) && !chatAttachAlertPhotoLayout.f31243s0 && !ciVar.P1 && chatAttachAlertPhotoLayout.P != null && !ciVar.A1) {
                        if (f2Var == null) {
                            f2Var = LaunchActivity.Q();
                        }
                        if (f2Var != null && f2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f31248w0) {
                                org.telegram.messenger.k5.p(null, 2131749538, new gc(chatAttachAlertPhotoLayout.P, glVar.f33931c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                f2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    chatAttachAlertPhotoLayout.S[i12].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(wq.f40046f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f31241r0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                wq wqVar = wq.f40046f;
                                duration.setInterpolator(wqVar).start();
                                chatAttachAlertPhotoLayout.f31239q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(wqVar).start();
                                org.telegram.ui.ActionBar.f2 f2Var2 = ciVar.Z1;
                                if ((f2Var2 instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var2).z()) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                glVar.f33929a = org.telegram.messenger.g0.s0(z9);
                                org.telegram.messenger.g0.X3(nlVar, true);
                                nlVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                chatAttachAlertPhotoLayout.f31221g0 = 0;
                                chatAttachAlertPhotoLayout.f31223h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = glVar.f33932e;
                                                if (chatAttachAlertPhotoLayout2.f31223h0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f31221g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f31221g0 = i13;
                                                    chatAttachAlertPhotoLayout2.R.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.f31223h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.i3(glVar.f33932e.f31223h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                org.telegram.messenger.g0.f2(f2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = glVar.f33929a;
                                if (ciVar.N2 != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z10, new t(glVar, 21), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = glVar.f33932e;
                                                if (chatAttachAlertPhotoLayout2.f31223h0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f31221g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f31221g0 = i13;
                                                    chatAttachAlertPhotoLayout2.R.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.f31223h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.i3(glVar.f33932e.f31223h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f31229k0.a(dt0.f33075b);
                                chatAttachAlertPhotoLayout.P.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.f31569w = false;
                    return;
                }
                return;
            case 15:
                bv0 bv0Var = (bv0) this.f33073b;
                View view = bv0Var.f32372s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        bv0Var.f32372s.setVisibility(0);
                        bv0Var.f32372s.setAlpha(0.0f);
                    }
                    bv0Var.f32372s.animate().setListener(null).cancel();
                    bv0Var.f32372s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                bv0Var.f32367c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 16:
                ((ThemeEditorView) this.f33073b).f31583a = false;
                try {
                    org.telegram.ui.ActionBar.m6.l();
                    org.telegram.ui.ActionBar.m6.o();
                    org.telegram.ui.ActionBar.m6.q();
                    org.telegram.ui.ActionBar.m6.k(false, false);
                    org.telegram.ui.ActionBar.t6.b0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.c0();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 17:
                u61 u61Var = (u61) this.f33073b;
                if (u61Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 <= 17) {
                        j3 = elapsedRealtime3;
                    }
                    float f15 = u61Var.f38566f0 + (((float) j3) / 200.0f);
                    u61Var.f38566f0 = f15;
                    u61Var.setAnimationIdicatorProgress(u61Var.f38557a0.getInterpolation(f15));
                    if (u61Var.f38566f0 > 1.0f) {
                        u61Var.f38566f0 = 1.0f;
                    }
                    if (u61Var.f38566f0 < 1.0f) {
                        org.telegram.messenger.g0.h3(u61Var.f38569i0);
                        return;
                    }
                    u61Var.J = false;
                    u61Var.setEnabled(true);
                    t61 t61Var = u61Var.D;
                    if (t61Var != null) {
                        ((m) t61Var).y(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f33073b;
                if (a0Var.f39093w) {
                    a0Var.j(false);
                    org.telegram.messenger.g0.i3(this, 250L);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.c20 c20Var = (org.telegram.ui.c20) this.f33073b;
                if (c20Var.f39302b && c20Var.Q0.f45583t2 == null) {
                    c20Var.f39311g0 = false;
                    org.telegram.ui.Components.voip.k0.a(c20Var);
                    return;
                }
                org.telegram.messenger.g0.i3(c20Var.f39312h0, 3000L);
                return;
            case 20:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f33073b;
                org.telegram.ui.Components.voip.q0 q0Var = g1Var.f39230e;
                if (q0Var != null) {
                    if (!g1Var.f39228b.a(g1Var.f39234s)) {
                        if (g1Var.h == null) {
                            g1Var.h = new org.telegram.ui.Components.voip.e1();
                        }
                        VideoFrame videoFrame = g1Var.h.f39179b;
                        if (videoFrame != null) {
                            q0Var.onFrame(videoFrame);
                        }
                    }
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.voip.f1 f1Var = (org.telegram.ui.Components.voip.f1) this.f33073b;
                f1Var.a();
                if (f1Var.f39198b) {
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.voip.f2 f2Var3 = (org.telegram.ui.Components.voip.f2) this.f33073b;
                org.telegram.ui.Components.voip.m mVar = f2Var3.f39203b;
                if (mVar != null) {
                    mVar.b();
                }
                long c10 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c10 != f2Var3.f39204c || a10 != f2Var3.d) {
                    f2Var3.f39204c = c10;
                    f2Var3.d = a10;
                    ti.o oVar = f2Var3.f39202a;
                    if (oVar != null) {
                        oVar.c();
                    }
                }
                org.telegram.messenger.g0.i3(this, 500L);
                return;
            case 23:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) this.f33073b;
                if (y0Var.d && y0Var.f43363e && y0Var.f43368k != null) {
                    if (SystemClock.elapsedRealtime() - y0Var.f43369l >= 30000) {
                        y0Var.f("heartbeat timed out");
                        return;
                    }
                    y0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - y0Var.f43369l) + " ms ago");
                    y0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    org.telegram.messenger.g0.i3(this, 15000L);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.f33073b;
                if (z5Var.f36518a != null && z5Var.f43448e != null) {
                    z5Var.X0();
                    if (z5Var.f43465s) {
                        z5Var.f36518a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Wallet.d6 d6Var = (org.telegram.ui.Wallet.d6) this.f33073b;
                org.telegram.ui.Wallet.k6 k6Var = d6Var.G;
                if (d6Var.f42351a0) {
                    long nanoTime = System.nanoTime();
                    if (k6Var.f42721a) {
                        long j10 = k6Var.f42728j;
                        if (j10 == 0) {
                            k6Var.f42728j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, ((float) (nanoTime - j10)) * 1.0E-9f));
                            k6Var.f42728j = nanoTime;
                            if (k6Var.f42727i - k6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f16 = k6Var.d;
                                k6Var.d = com.google.android.recaptcha.internal.a.z(k6Var.f42722b, f16, exp, f16);
                                float f17 = k6Var.f42724e;
                                k6Var.f42724e = com.google.android.recaptcha.internal.a.z(k6Var.f42723c, f17, exp, f17);
                            }
                        }
                    }
                    if (k6Var.f42721a) {
                        f10 = Math.max(-15.0f, Math.min(15.0f, k6Var.f42722b - k6Var.d));
                    } else {
                        f10 = 0.0f;
                    }
                    d6Var.K = f10;
                    if (k6Var.f42721a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, k6Var.f42723c - k6Var.f42724e));
                    }
                    float c11 = org.telegram.ui.Wallet.d6.c(f12 * 1.5f, -15.0f, 15.0f);
                    float f18 = d6Var.K;
                    float f19 = d6Var.L;
                    float z11 = com.google.android.recaptcha.internal.a.z(f18, f19, 1.0f, f19);
                    d6Var.L = z11;
                    float f20 = d6Var.M;
                    float z12 = com.google.android.recaptcha.internal.a.z(c11, f20, 1.0f, f20);
                    d6Var.M = z12;
                    float f21 = d6Var.f42358e0;
                    d6Var.b((z11 * f21) + d6Var.N + d6Var.f42356d0, (z12 * f21) + d6Var.O);
                    d6Var.postOnAnimation(this);
                    return;
                }
                return;
            case 26:
                if (org.telegram.utils.twidget.n0.h.remove(this)) {
                    org.telegram.messenger.g0.r(this);
                    ((org.telegram.ui.ae) this.f33073b).run();
                    return;
                }
                return;
            case 27:
                ((qe.h) this.f33073b).o();
                return;
            case 28:
                a();
                return;
            default:
                sg.t0 t0Var = (sg.t0) this.f33073b;
                if (t0Var.f55218f && !t0Var.D.D) {
                    sg.t0.a(t0Var);
                    GLES20.glBindFramebuffer(36160, 0);
                    sg.t0 t0Var2 = (sg.t0) this.f33073b;
                    GLES20.glViewport(0, 0, t0Var2.f55219n, t0Var2.f55220r);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    sg.j0 j0Var = ((sg.t0) this.f33073b).D.f55235c;
                    if (j0Var.f55113r != null) {
                        if (j0Var.D != null && j0Var.F != null && j0Var.E) {
                            GLES20.glBindFramebuffer(36160, 0);
                            sg.w0 w0Var = (sg.w0) j0Var.f55113r.get("videoBlur");
                            if (w0Var != null) {
                                GLES20.glUseProgram(w0Var.f55267a);
                                GLES20.glUniformMatrix4fv(w0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(j0Var.f55119y));
                                GLES20.glUniform1f(w0Var.d("flipy"), 0.0f);
                                GLES20.glUniform1i(w0Var.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, j0Var.D.c());
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glUniform1i(w0Var.d("blured"), 1);
                                GLES20.glActiveTexture(33985);
                                ca caVar = j0Var.F.f40268m;
                                if (caVar != null) {
                                    i10 = caVar.f32516s[2];
                                } else {
                                    i10 = -1;
                                }
                                GLES20.glBindTexture(3553, i10);
                                if (j0Var.f55099b != null && (j0Var.f55104i instanceof sg.d)) {
                                    GLES20.glUniform1f(w0Var.d("eraser"), 1.0f);
                                    GLES20.glUniform1i(w0Var.d("mask"), 2);
                                    GLES20.glActiveTexture(33986);
                                    GLES20.glBindTexture(3553, j0Var.g());
                                } else {
                                    GLES20.glUniform1f(w0Var.d("eraser"), 0.0f);
                                }
                                GLES20.glBlendFunc(1, 0);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) j0Var.f55108m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) j0Var.f55109n);
                                GLES20.glEnableVertexAttribArray(1);
                                synchronized (j0Var.F.h) {
                                    GLES20.glDrawArrays(5, 0, 4);
                                }
                            }
                        }
                        if (j0Var.f55099b != null) {
                            j0Var.n(j0Var.g(), j0Var.f55099b, (1.0f - (j0Var.I * 0.5f)) - (j0Var.J * 0.5f));
                        } else if (j0Var.f55100c != null) {
                            j0Var.o(j0Var.j(), j0Var.g(), j0Var.f55100c, 1.0f);
                        } else {
                            int j11 = j0Var.j();
                            Map map = j0Var.f55113r;
                            f11 = 0.5f;
                            if (j0Var.G) {
                                str = "maskingBlit";
                            } else {
                                str = "blit";
                            }
                            sg.w0 w0Var2 = (sg.w0) map.get(str);
                            if (j11 != 0 && w0Var2 != null) {
                                GLES20.glUseProgram(w0Var2.f55267a);
                                GLES20.glUniformMatrix4fv(w0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(j0Var.f55119y));
                                GLES20.glUniform1f(w0Var2.d("alpha"), 1.0f);
                                if (j0Var.G) {
                                    GLES20.glUniform1i(w0Var2.d("texture"), 1);
                                    GLES20.glUniform1i(w0Var2.d("mask"), 0);
                                    GLES20.glUniform1f(w0Var2.d("preview"), 0.4f);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j11);
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(3553, j0Var.f55107l.c());
                                } else {
                                    GLES20.glUniform1i(w0Var2.d("texture"), 0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j11);
                                }
                                GLES20.glBlendFunc(1, 771);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) j0Var.f55108m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) j0Var.f55109n);
                                GLES20.glEnableVertexAttribArray(1);
                                GLES20.glDrawArrays(5, 0, 4);
                                c8.fc.a();
                            }
                            i7 = j0Var.f55112q;
                            if (i7 != 0 && j0Var.d != null && j0Var.I > 0.0f) {
                                j0Var.o(i7, j0Var.g(), j0Var.d, (j0Var.J * f11) + (j0Var.I * f11));
                            }
                        }
                        f11 = 0.5f;
                        i7 = j0Var.f55112q;
                        if (i7 != 0) {
                            j0Var.o(i7, j0Var.g(), j0Var.d, (j0Var.J * f11) + (j0Var.I * f11));
                        }
                    }
                    GLES20.glBlendFunc(1, 771);
                    sg.t0 t0Var3 = (sg.t0) this.f33073b;
                    t0Var3.f55215b.eglSwapBuffers(t0Var3.f55216c, t0Var3.f55217e);
                    sg.v0 v0Var = ((sg.t0) this.f33073b).D;
                    if (!v0Var.f55240s) {
                        v0Var.f55240s = true;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p5(this, 28));
                    }
                    if (!((sg.t0) this.f33073b).h) {
                        ((sg.t0) this.f33073b).h = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
