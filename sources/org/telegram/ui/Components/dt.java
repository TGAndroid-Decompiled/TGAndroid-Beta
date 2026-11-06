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
    public final int f33030a;
    public final Object f33031b;

    public dt(Object obj, int i7) {
        this.f33030a = i7;
        this.f33031b = obj;
    }

    private final void a() {
        s8.a aVar = (s8.a) this.f33031b;
        synchronized (aVar.f54855a) {
            try {
                if (!aVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.f54862j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (!aVar.b()) {
                    return;
                }
                aVar.f54857c = 1;
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
        switch (this.f33030a) {
            case 0:
                kt ktVar = (kt) this.f33031b;
                dt dtVar = ktVar.P;
                et etVar = ktVar.f35413a;
                if (!ktVar.D && etVar != null && ktVar.N && !ktVar.f35421w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    etVar.requestFocus();
                    org.telegram.messenger.g0.K3(etVar);
                    org.telegram.messenger.g0.r(dtVar);
                    org.telegram.messenger.g0.i3(dtVar, 100L);
                    return;
                }
                return;
            case 1:
                ab.q qVar = (ab.q) ((di.h3) this.f33031b).d;
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
                gy gyVar = (gy) this.f33031b;
                if (gyVar.B0.f37793s == null) {
                    gyVar.X1 = false;
                    gyVar.Z();
                    return;
                }
                return;
            case 3:
                ez ezVar = (ez) this.f33031b;
                if (ezVar.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 17) {
                        j3 = elapsedRealtime;
                    }
                    float f13 = ezVar.f33395p0 + (((float) j3) / 320.0f);
                    ezVar.f33395p0 = f13;
                    ezVar.setAnimationIdicatorProgress(ezVar.f33388i0.getInterpolation(f13));
                    if (ezVar.f33395p0 > 1.0f) {
                        ezVar.f33395p0 = 1.0f;
                    }
                    if (ezVar.f33395p0 < 1.0f) {
                        org.telegram.messenger.g0.h3(ezVar.f33403v0);
                        return;
                    }
                    ezVar.O = false;
                    ezVar.setEnabled(true);
                    az azVar = ezVar.J;
                    if (azVar != null) {
                        ((org.telegram.ui.nw) azVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f33031b;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                org.telegram.messenger.g0.i3(fragmentContextView.f31398t0, 1000L);
                return;
            case 5:
                TextureView textureView = ((g40) this.f33031b).H0.f36616p0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.h3(new fq(22, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 6:
                l50 l50Var = (l50) this.f33031b;
                m50 m50Var = l50Var.D;
                z40 z40Var = m50Var.M1;
                if (z40Var != null && z40Var.getAdapter() != null) {
                    m50Var.M1.getClass();
                    int R = RecyclerView.R(l50Var);
                    if (R >= 0) {
                        m50Var.K1.t(m50Var.M1.T(l50Var), R);
                    }
                }
                org.telegram.messenger.g0.h3(this);
                return;
            case 7:
                ia0 ia0Var = (ia0) this.f33031b;
                ValueAnimator valueAnimator = ia0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ia0Var.h.start();
                    return;
                }
                return;
            case 8:
                ((ec0) this.f33031b).e();
                return;
            case 9:
                kg0 kg0Var = (kg0) this.f33031b;
                kg0Var.f35311y = true;
                ValueAnimator valueAnimator2 = kg0Var.f35312z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                kg0Var.f35310x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                kg0Var.f35312z = ofFloat;
                ofFloat.addUpdateListener(kg0Var.f35288b0);
                kg0Var.f35312z.setInterpolator(new LinearInterpolator());
                kg0Var.f35312z.setDuration(150L);
                kg0Var.f35312z.start();
                return;
            case 10:
                pj0 pj0Var = (pj0) this.f33031b;
                m.c3 c3Var = pj0Var.f37046f2;
                int[] iArr = pj0Var.f37056k2;
                org.telegram.ui.an anVar = (org.telegram.ui.an) c3Var.d;
                iArr[0] = (int) anVar.L9;
                iArr[1] = anVar.Ua;
                if (pj0Var.f37050h2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    pj0Var.M0(0.0f, pj0Var.f37056k2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    pj0Var.M0(0.0f, pj0Var.getMeasuredHeight() - pj0Var.f37056k2[1]);
                }
                ((org.telegram.ui.an) pj0Var.f37046f2.d).f44013z0.scrollBy(0, L);
                if (pj0Var.f37048g2) {
                    org.telegram.messenger.g0.h3(pj0Var.C2);
                    return;
                }
                return;
            case 11:
                ui0 ui0Var = (ui0) this.f33031b;
                dt dtVar2 = ui0Var.f38663i0;
                if (ui0Var.f38667n) {
                    org.telegram.messenger.g0.r(dtVar2);
                    org.telegram.messenger.g0.i3(dtVar2, 4000L);
                    return;
                }
                ui0Var.U = false;
                ui0Var.invalidate();
                return;
            case 12:
                tj0 tj0Var = (tj0) this.f33031b;
                RecyclerView recyclerView = tj0Var.f38358a;
                if (recyclerView != null) {
                    if (tj0Var.f38363g) {
                        recyclerView.scrollBy(0, -tj0Var.f38364i);
                        org.telegram.messenger.g0.h3(this);
                        return;
                    } else if (tj0Var.h) {
                        recyclerView.scrollBy(0, tj0Var.f38364i);
                        org.telegram.messenger.g0.h3(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f33031b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 <= 17) {
                        j3 = elapsedRealtime2;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) j3) / ((float) scrollSlidingTextTabStrip.f31519b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        org.telegram.messenger.g0.h3(scrollSlidingTextTabStrip.f31522d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    uk0 uk0Var = scrollSlidingTextTabStrip.f31518b;
                    if (uk0Var != null) {
                        uk0Var.F0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ShutterButton shutterButton = (ShutterButton) this.f33031b;
                bt0 bt0Var = shutterButton.f31543e;
                if (bt0Var != null) {
                    final hl hlVar = (hl) bt0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hlVar.f34365e;
                    di diVar = chatAttachAlertPhotoLayout.f38951b;
                    ol olVar = chatAttachAlertPhotoLayout.R;
                    int i11 = diVar.K2;
                    org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                    if ((i11 == 2 || (f2Var instanceof org.telegram.ui.an)) && !chatAttachAlertPhotoLayout.f31222s0 && !diVar.M1 && chatAttachAlertPhotoLayout.P != null && !diVar.f32961x1) {
                        if (f2Var == null) {
                            f2Var = LaunchActivity.Q();
                        }
                        if (f2Var != null && f2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f31227w0) {
                                org.telegram.messenger.k5.p(null, 2131749537, new hc(chatAttachAlertPhotoLayout.P, hlVar.f34364c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                f2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    chatAttachAlertPhotoLayout.S[i12].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(xq.f40310f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f31220r0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                xq xqVar = xq.f40310f;
                                duration.setInterpolator(xqVar).start();
                                chatAttachAlertPhotoLayout.f31218q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                                org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                                if ((f2Var2 instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var2).z()) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                hlVar.f34362a = org.telegram.messenger.g0.s0(z9);
                                org.telegram.messenger.g0.X3(olVar, true);
                                olVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                chatAttachAlertPhotoLayout.f31200g0 = 0;
                                chatAttachAlertPhotoLayout.f31202h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = hlVar.f34365e;
                                                if (chatAttachAlertPhotoLayout2.f31202h0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f31200g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f31200g0 = i13;
                                                    chatAttachAlertPhotoLayout2.R.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.f31202h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.i3(hlVar.f34365e.f31202h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                org.telegram.messenger.g0.f2(f2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = hlVar.f34362a;
                                if (diVar.K2 != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z10, new u(hlVar, 21), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = hlVar.f34365e;
                                                if (chatAttachAlertPhotoLayout2.f31202h0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f31200g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f31200g0 = i13;
                                                    chatAttachAlertPhotoLayout2.R.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.f31202h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.i3(hlVar.f34365e.f31202h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f31208k0.a(ct0.f32666b);
                                chatAttachAlertPhotoLayout.P.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.f31548w = false;
                    return;
                }
                return;
            case 15:
                av0 av0Var = (av0) this.f33031b;
                View view = av0Var.f31921s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        av0Var.f31921s.setVisibility(0);
                        av0Var.f31921s.setAlpha(0.0f);
                    }
                    av0Var.f31921s.animate().setListener(null).cancel();
                    av0Var.f31921s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                av0Var.f31916c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 16:
                ((ThemeEditorView) this.f33031b).f31562a = false;
                try {
                    org.telegram.ui.ActionBar.k6.l();
                    org.telegram.ui.ActionBar.k6.o();
                    org.telegram.ui.ActionBar.k6.q();
                    org.telegram.ui.ActionBar.k6.k(false, false);
                    org.telegram.ui.ActionBar.r6.c0(null, true);
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
                o61 o61Var = (o61) this.f33031b;
                if (o61Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 <= 17) {
                        j3 = elapsedRealtime3;
                    }
                    float f15 = o61Var.f36650f0 + (((float) j3) / 200.0f);
                    o61Var.f36650f0 = f15;
                    o61Var.setAnimationIdicatorProgress(o61Var.f36641a0.getInterpolation(f15));
                    if (o61Var.f36650f0 > 1.0f) {
                        o61Var.f36650f0 = 1.0f;
                    }
                    if (o61Var.f36650f0 < 1.0f) {
                        org.telegram.messenger.g0.h3(o61Var.f36653i0);
                        return;
                    }
                    o61Var.J = false;
                    o61Var.setEnabled(true);
                    n61 n61Var = o61Var.D;
                    if (n61Var != null) {
                        ((n) n61Var).y(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f33031b;
                if (a0Var.f39031w) {
                    a0Var.j(false);
                    org.telegram.messenger.g0.i3(this, 250L);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.f33031b;
                if (z10Var.f39240b && z10Var.Q0.f44593q2 == null) {
                    z10Var.f39249g0 = false;
                    org.telegram.ui.Components.voip.k0.a(z10Var);
                    return;
                }
                org.telegram.messenger.g0.i3(z10Var.f39250h0, 3000L);
                return;
            case 20:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f33031b;
                org.telegram.ui.Components.voip.q0 q0Var = g1Var.f39168e;
                if (q0Var != null) {
                    if (!g1Var.f39166b.a(g1Var.f39172s)) {
                        if (g1Var.h == null) {
                            g1Var.h = new org.telegram.ui.Components.voip.e1();
                        }
                        VideoFrame videoFrame = g1Var.h.f39117b;
                        if (videoFrame != null) {
                            q0Var.onFrame(videoFrame);
                        }
                    }
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.voip.f1 f1Var = (org.telegram.ui.Components.voip.f1) this.f33031b;
                f1Var.a();
                if (f1Var.f39136b) {
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.voip.f2 f2Var3 = (org.telegram.ui.Components.voip.f2) this.f33031b;
                org.telegram.ui.Components.voip.m mVar = f2Var3.f39141b;
                if (mVar != null) {
                    mVar.b();
                }
                long c10 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c10 != f2Var3.f39142c || a10 != f2Var3.d) {
                    f2Var3.f39142c = c10;
                    f2Var3.d = a10;
                    ti.o oVar = f2Var3.f39140a;
                    if (oVar != null) {
                        oVar.c();
                    }
                }
                org.telegram.messenger.g0.i3(this, 500L);
                return;
            case 23:
                org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) this.f33031b;
                if (a1Var.d && a1Var.f42060e && a1Var.f42065k != null) {
                    if (SystemClock.elapsedRealtime() - a1Var.f42066l >= 30000) {
                        a1Var.f("heartbeat timed out");
                        return;
                    }
                    a1Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - a1Var.f42066l) + " ms ago");
                    a1Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    org.telegram.messenger.g0.i3(this, 15000L);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f33031b;
                if (y5Var.f34211a != null && y5Var.f43345e != null) {
                    y5Var.W0();
                    if (y5Var.f43362s) {
                        y5Var.f34211a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) this.f33031b;
                org.telegram.ui.Wallet.j6 j6Var = c6Var.G;
                if (c6Var.f42202a0) {
                    long nanoTime = System.nanoTime();
                    if (j6Var.f42635a) {
                        long j10 = j6Var.f42642j;
                        if (j10 == 0) {
                            j6Var.f42642j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, ((float) (nanoTime - j10)) * 1.0E-9f));
                            j6Var.f42642j = nanoTime;
                            if (j6Var.f42641i - j6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f16 = j6Var.d;
                                j6Var.d = com.google.android.recaptcha.internal.a.z(j6Var.f42636b, f16, exp, f16);
                                float f17 = j6Var.f42638e;
                                j6Var.f42638e = com.google.android.recaptcha.internal.a.z(j6Var.f42637c, f17, exp, f17);
                            }
                        }
                    }
                    if (j6Var.f42635a) {
                        f10 = Math.max(-15.0f, Math.min(15.0f, j6Var.f42636b - j6Var.d));
                    } else {
                        f10 = 0.0f;
                    }
                    c6Var.K = f10;
                    if (j6Var.f42635a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, j6Var.f42637c - j6Var.f42638e));
                    }
                    float c11 = org.telegram.ui.Wallet.c6.c(f12 * 1.5f, -15.0f, 15.0f);
                    float f18 = c6Var.K;
                    float f19 = c6Var.L;
                    float z11 = com.google.android.recaptcha.internal.a.z(f18, f19, 1.0f, f19);
                    c6Var.L = z11;
                    float f20 = c6Var.M;
                    float z12 = com.google.android.recaptcha.internal.a.z(c11, f20, 1.0f, f20);
                    c6Var.M = z12;
                    float f21 = c6Var.f42209e0;
                    c6Var.b((z11 * f21) + c6Var.N + c6Var.f42207d0, (z12 * f21) + c6Var.O);
                    c6Var.postOnAnimation(this);
                    return;
                }
                return;
            case 26:
                if (org.telegram.utils.twidget.p.h.remove(this)) {
                    org.telegram.messenger.g0.r(this);
                    ((org.telegram.ui.ae) this.f33031b).run();
                    return;
                }
                return;
            case 27:
                ((qe.h) this.f33031b).o();
                return;
            case 28:
                a();
                return;
            default:
                sg.u0 u0Var = (sg.u0) this.f33031b;
                if (u0Var.f55097f && !u0Var.D.D) {
                    sg.u0.a(u0Var);
                    GLES20.glBindFramebuffer(36160, 0);
                    sg.u0 u0Var2 = (sg.u0) this.f33031b;
                    GLES20.glViewport(0, 0, u0Var2.f55098n, u0Var2.f55099r);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    sg.j0 j0Var = ((sg.u0) this.f33031b).D.f55134c;
                    if (j0Var.f54984r != null) {
                        if (j0Var.D != null && j0Var.F != null && j0Var.E) {
                            GLES20.glBindFramebuffer(36160, 0);
                            sg.x0 x0Var = (sg.x0) j0Var.f54984r.get("videoBlur");
                            if (x0Var != null) {
                                GLES20.glUseProgram(x0Var.f55144a);
                                GLES20.glUniformMatrix4fv(x0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(j0Var.f54990y));
                                GLES20.glUniform1f(x0Var.d("flipy"), 0.0f);
                                GLES20.glUniform1i(x0Var.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, j0Var.D.c());
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glUniform1i(x0Var.d("blured"), 1);
                                GLES20.glActiveTexture(33985);
                                da daVar = j0Var.F.f40578m;
                                if (daVar != null) {
                                    i10 = daVar.f32803s[2];
                                } else {
                                    i10 = -1;
                                }
                                GLES20.glBindTexture(3553, i10);
                                if (j0Var.f54970b != null && (j0Var.f54975i instanceof sg.d)) {
                                    GLES20.glUniform1f(x0Var.d("eraser"), 1.0f);
                                    GLES20.glUniform1i(x0Var.d("mask"), 2);
                                    GLES20.glActiveTexture(33986);
                                    GLES20.glBindTexture(3553, j0Var.g());
                                } else {
                                    GLES20.glUniform1f(x0Var.d("eraser"), 0.0f);
                                }
                                GLES20.glBlendFunc(1, 0);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) j0Var.f54979m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) j0Var.f54980n);
                                GLES20.glEnableVertexAttribArray(1);
                                synchronized (j0Var.F.h) {
                                    GLES20.glDrawArrays(5, 0, 4);
                                }
                            }
                        }
                        if (j0Var.f54970b != null) {
                            j0Var.n(j0Var.g(), j0Var.f54970b, (1.0f - (j0Var.I * 0.5f)) - (j0Var.J * 0.5f));
                        } else if (j0Var.f54971c != null) {
                            j0Var.o(j0Var.j(), j0Var.g(), j0Var.f54971c, 1.0f);
                        } else {
                            int j11 = j0Var.j();
                            Map map = j0Var.f54984r;
                            f11 = 0.5f;
                            if (j0Var.G) {
                                str = "maskingBlit";
                            } else {
                                str = "blit";
                            }
                            sg.x0 x0Var2 = (sg.x0) map.get(str);
                            if (j11 != 0 && x0Var2 != null) {
                                GLES20.glUseProgram(x0Var2.f55144a);
                                GLES20.glUniformMatrix4fv(x0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(j0Var.f54990y));
                                GLES20.glUniform1f(x0Var2.d("alpha"), 1.0f);
                                if (j0Var.G) {
                                    GLES20.glUniform1i(x0Var2.d("texture"), 1);
                                    GLES20.glUniform1i(x0Var2.d("mask"), 0);
                                    GLES20.glUniform1f(x0Var2.d("preview"), 0.4f);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j11);
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(3553, j0Var.f54978l.c());
                                } else {
                                    GLES20.glUniform1i(x0Var2.d("texture"), 0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j11);
                                }
                                GLES20.glBlendFunc(1, 771);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) j0Var.f54979m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) j0Var.f54980n);
                                GLES20.glEnableVertexAttribArray(1);
                                GLES20.glDrawArrays(5, 0, 4);
                                c8.ec.a();
                            }
                            i7 = j0Var.f54983q;
                            if (i7 != 0 && j0Var.d != null && j0Var.I > 0.0f) {
                                j0Var.o(i7, j0Var.g(), j0Var.d, (j0Var.J * f11) + (j0Var.I * f11));
                            }
                        }
                        f11 = 0.5f;
                        i7 = j0Var.f54983q;
                        if (i7 != 0) {
                            j0Var.o(i7, j0Var.g(), j0Var.d, (j0Var.J * f11) + (j0Var.I * f11));
                        }
                    }
                    GLES20.glBlendFunc(1, 771);
                    sg.u0 u0Var3 = (sg.u0) this.f33031b;
                    u0Var3.f55094b.eglSwapBuffers(u0Var3.f55095c, u0Var3.f55096e);
                    sg.w0 w0Var = ((sg.u0) this.f33031b).D;
                    if (!w0Var.f55139s) {
                        w0Var.f55139s = true;
                        org.telegram.messenger.g0.h3(new sg.t0(this, 0));
                    }
                    if (!((sg.u0) this.f33031b).h) {
                        ((sg.u0) this.f33031b).h = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
