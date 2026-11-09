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
public final class et implements Runnable {
    public final int f33492a;
    public final Object f33493b;

    public et(Object obj, int i7) {
        this.f33492a = i7;
        this.f33493b = obj;
    }

    private final void a() {
        s8.a aVar = (s8.a) this.f33493b;
        synchronized (aVar.f54984a) {
            try {
                if (!aVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.f54991j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (!aVar.b()) {
                    return;
                }
                aVar.f54986c = 1;
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
        switch (this.f33492a) {
            case 0:
                lt ltVar = (lt) this.f33493b;
                et etVar = ltVar.P;
                ft ftVar = ltVar.f35841a;
                if (!ltVar.D && ftVar != null && ltVar.N && !ltVar.f35849w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    ftVar.requestFocus();
                    org.telegram.messenger.g0.K3(ftVar);
                    org.telegram.messenger.g0.r(etVar);
                    org.telegram.messenger.g0.i3(etVar, 100L);
                    return;
                }
                return;
            case 1:
                ab.q qVar = (ab.q) ((di.h3) this.f33493b).d;
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
                hy hyVar = (hy) this.f33493b;
                if (hyVar.B0.f38118s == null) {
                    hyVar.X1 = false;
                    hyVar.Z();
                    return;
                }
                return;
            case 3:
                fz fzVar = (fz) this.f33493b;
                if (fzVar.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 17) {
                        j3 = elapsedRealtime;
                    }
                    float f13 = fzVar.f33785p0 + (((float) j3) / 320.0f);
                    fzVar.f33785p0 = f13;
                    fzVar.setAnimationIdicatorProgress(fzVar.f33778i0.getInterpolation(f13));
                    if (fzVar.f33785p0 > 1.0f) {
                        fzVar.f33785p0 = 1.0f;
                    }
                    if (fzVar.f33785p0 < 1.0f) {
                        org.telegram.messenger.g0.h3(fzVar.f33793v0);
                        return;
                    }
                    fzVar.O = false;
                    fzVar.setEnabled(true);
                    bz bzVar = fzVar.J;
                    if (bzVar != null) {
                        ((org.telegram.ui.pw) bzVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f33493b;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                org.telegram.messenger.g0.i3(fragmentContextView.f31408t0, 1000L);
                return;
            case 5:
                TextureView textureView = ((h40) this.f33493b).H0.f36911p0;
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
                m50 m50Var = (m50) this.f33493b;
                n50 n50Var = m50Var.D;
                a50 a50Var = n50Var.M1;
                if (a50Var != null && a50Var.getAdapter() != null) {
                    n50Var.M1.getClass();
                    int R = RecyclerView.R(m50Var);
                    if (R >= 0) {
                        n50Var.K1.t(n50Var.M1.T(m50Var), R);
                    }
                }
                org.telegram.messenger.g0.h3(this);
                return;
            case 7:
                ja0 ja0Var = (ja0) this.f33493b;
                ValueAnimator valueAnimator = ja0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ja0Var.h.start();
                    return;
                }
                return;
            case 8:
                ((fc0) this.f33493b).e();
                return;
            case 9:
                lg0 lg0Var = (lg0) this.f33493b;
                lg0Var.f35744y = true;
                ValueAnimator valueAnimator2 = lg0Var.f35745z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                lg0Var.f35743x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                lg0Var.f35745z = ofFloat;
                ofFloat.addUpdateListener(lg0Var.f35721b0);
                lg0Var.f35745z.setInterpolator(new LinearInterpolator());
                lg0Var.f35745z.setDuration(150L);
                lg0Var.f35745z.start();
                return;
            case 10:
                qj0 qj0Var = (qj0) this.f33493b;
                m.c3 c3Var = qj0Var.f37367f2;
                int[] iArr = qj0Var.f37377k2;
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) c3Var.d;
                iArr[0] = (int) cnVar.N9;
                iArr[1] = cnVar.Wa;
                if (qj0Var.f37371h2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    qj0Var.M0(0.0f, qj0Var.f37377k2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    qj0Var.M0(0.0f, qj0Var.getMeasuredHeight() - qj0Var.f37377k2[1]);
                }
                ((org.telegram.ui.cn) qj0Var.f37367f2.d).f44700z0.scrollBy(0, L);
                if (qj0Var.f37369g2) {
                    org.telegram.messenger.g0.h3(qj0Var.C2);
                    return;
                }
                return;
            case 11:
                vi0 vi0Var = (vi0) this.f33493b;
                et etVar2 = vi0Var.f39092i0;
                if (vi0Var.f39096n) {
                    org.telegram.messenger.g0.r(etVar2);
                    org.telegram.messenger.g0.i3(etVar2, 4000L);
                    return;
                }
                vi0Var.U = false;
                vi0Var.invalidate();
                return;
            case 12:
                uj0 uj0Var = (uj0) this.f33493b;
                RecyclerView recyclerView = uj0Var.f38735a;
                if (recyclerView != null) {
                    if (uj0Var.f38740g) {
                        recyclerView.scrollBy(0, -uj0Var.f38741i);
                        org.telegram.messenger.g0.h3(this);
                        return;
                    } else if (uj0Var.h) {
                        recyclerView.scrollBy(0, uj0Var.f38741i);
                        org.telegram.messenger.g0.h3(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f33493b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 <= 17) {
                        j3 = elapsedRealtime2;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) j3) / ((float) scrollSlidingTextTabStrip.f31529b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        org.telegram.messenger.g0.h3(scrollSlidingTextTabStrip.f31532d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    vk0 vk0Var = scrollSlidingTextTabStrip.f31528b;
                    if (vk0Var != null) {
                        vk0Var.F0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ShutterButton shutterButton = (ShutterButton) this.f33493b;
                dt0 dt0Var = shutterButton.f31553e;
                if (dt0Var != null) {
                    final hl hlVar = (hl) dt0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hlVar.f34332e;
                    di diVar = chatAttachAlertPhotoLayout.f39071b;
                    ol olVar = chatAttachAlertPhotoLayout.R;
                    int i11 = diVar.K2;
                    org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                    if ((i11 == 2 || (f2Var instanceof org.telegram.ui.cn)) && !chatAttachAlertPhotoLayout.f31232s0 && !diVar.M1 && chatAttachAlertPhotoLayout.P != null && !diVar.f33066x1) {
                        if (f2Var == null) {
                            f2Var = LaunchActivity.Q();
                        }
                        if (f2Var != null && f2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f31237w0) {
                                org.telegram.messenger.k5.p(null, 2131749538, new hc(chatAttachAlertPhotoLayout.P, hlVar.f34331c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                f2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    chatAttachAlertPhotoLayout.S[i12].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(xq.f40458f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f31230r0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                xq xqVar = xq.f40458f;
                                duration.setInterpolator(xqVar).start();
                                chatAttachAlertPhotoLayout.f31228q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                                org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                                if ((f2Var2 instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var2).z()) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                hlVar.f34329a = org.telegram.messenger.g0.s0(z9);
                                org.telegram.messenger.g0.X3(olVar, true);
                                olVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                chatAttachAlertPhotoLayout.f31210g0 = 0;
                                chatAttachAlertPhotoLayout.f31212h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = hlVar.f34332e;
                                                if (chatAttachAlertPhotoLayout2.f31212h0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f31210g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f31210g0 = i13;
                                                    chatAttachAlertPhotoLayout2.R.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.f31212h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.i3(hlVar.f34332e.f31212h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                org.telegram.messenger.g0.f2(f2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = hlVar.f34329a;
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
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = hlVar.f34332e;
                                                if (chatAttachAlertPhotoLayout2.f31212h0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f31210g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f31210g0 = i13;
                                                    chatAttachAlertPhotoLayout2.R.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.f31212h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.i3(hlVar.f34332e.f31212h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f31218k0.a(et0.f33495b);
                                chatAttachAlertPhotoLayout.P.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.f31558w = false;
                    return;
                }
                return;
            case 15:
                cv0 cv0Var = (cv0) this.f33493b;
                View view = cv0Var.f32772s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        cv0Var.f32772s.setVisibility(0);
                        cv0Var.f32772s.setAlpha(0.0f);
                    }
                    cv0Var.f32772s.animate().setListener(null).cancel();
                    cv0Var.f32772s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                cv0Var.f32767c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 16:
                ((ThemeEditorView) this.f33493b).f31572a = false;
                try {
                    org.telegram.ui.ActionBar.l6.l();
                    org.telegram.ui.ActionBar.l6.o();
                    org.telegram.ui.ActionBar.l6.q();
                    org.telegram.ui.ActionBar.l6.k(false, false);
                    org.telegram.ui.ActionBar.s6.b0(null, true);
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
                v61 v61Var = (v61) this.f33493b;
                if (v61Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 <= 17) {
                        j3 = elapsedRealtime3;
                    }
                    float f15 = v61Var.f38971f0 + (((float) j3) / 200.0f);
                    v61Var.f38971f0 = f15;
                    v61Var.setAnimationIdicatorProgress(v61Var.f38962a0.getInterpolation(f15));
                    if (v61Var.f38971f0 > 1.0f) {
                        v61Var.f38971f0 = 1.0f;
                    }
                    if (v61Var.f38971f0 < 1.0f) {
                        org.telegram.messenger.g0.h3(v61Var.f38974i0);
                        return;
                    }
                    v61Var.J = false;
                    v61Var.setEnabled(true);
                    u61 u61Var = v61Var.D;
                    if (u61Var != null) {
                        ((n) u61Var).y(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f33493b;
                if (a0Var.f39173w) {
                    a0Var.j(false);
                    org.telegram.messenger.g0.i3(this, 250L);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) this.f33493b;
                if (b20Var.f39382b && b20Var.Q0.f45256q2 == null) {
                    b20Var.f39391g0 = false;
                    org.telegram.ui.Components.voip.k0.a(b20Var);
                    return;
                }
                org.telegram.messenger.g0.i3(b20Var.f39392h0, 3000L);
                return;
            case 20:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f33493b;
                org.telegram.ui.Components.voip.q0 q0Var = g1Var.f39310e;
                if (q0Var != null) {
                    if (!g1Var.f39308b.a(g1Var.f39314s)) {
                        if (g1Var.h == null) {
                            g1Var.h = new org.telegram.ui.Components.voip.e1();
                        }
                        VideoFrame videoFrame = g1Var.h.f39259b;
                        if (videoFrame != null) {
                            q0Var.onFrame(videoFrame);
                        }
                    }
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.voip.f1 f1Var = (org.telegram.ui.Components.voip.f1) this.f33493b;
                f1Var.a();
                if (f1Var.f39278b) {
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.voip.f2 f2Var3 = (org.telegram.ui.Components.voip.f2) this.f33493b;
                org.telegram.ui.Components.voip.m mVar = f2Var3.f39283b;
                if (mVar != null) {
                    mVar.b();
                }
                long c10 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c10 != f2Var3.f39284c || a10 != f2Var3.d) {
                    f2Var3.f39284c = c10;
                    f2Var3.d = a10;
                    ti.o oVar = f2Var3.f39282a;
                    if (oVar != null) {
                        oVar.c();
                    }
                }
                org.telegram.messenger.g0.i3(this, 500L);
                return;
            case 23:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) this.f33493b;
                if (y0Var.d && y0Var.f43369e && y0Var.f43374k != null) {
                    if (SystemClock.elapsedRealtime() - y0Var.f43375l >= 30000) {
                        y0Var.f("heartbeat timed out");
                        return;
                    }
                    y0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - y0Var.f43375l) + " ms ago");
                    y0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    org.telegram.messenger.g0.i3(this, 15000L);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f33493b;
                if (w5Var.f36649a != null && w5Var.f43253e != null) {
                    w5Var.W0();
                    if (w5Var.f43270s) {
                        w5Var.f36649a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) this.f33493b;
                org.telegram.ui.Wallet.h6 h6Var = a6Var.G;
                if (a6Var.f42112a0) {
                    long nanoTime = System.nanoTime();
                    if (h6Var.f42548a) {
                        long j10 = h6Var.f42555j;
                        if (j10 == 0) {
                            h6Var.f42555j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, ((float) (nanoTime - j10)) * 1.0E-9f));
                            h6Var.f42555j = nanoTime;
                            if (h6Var.f42554i - h6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f16 = h6Var.d;
                                h6Var.d = com.google.android.recaptcha.internal.a.z(h6Var.f42549b, f16, exp, f16);
                                float f17 = h6Var.f42551e;
                                h6Var.f42551e = com.google.android.recaptcha.internal.a.z(h6Var.f42550c, f17, exp, f17);
                            }
                        }
                    }
                    if (h6Var.f42548a) {
                        f10 = Math.max(-15.0f, Math.min(15.0f, h6Var.f42549b - h6Var.d));
                    } else {
                        f10 = 0.0f;
                    }
                    a6Var.K = f10;
                    if (h6Var.f42548a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, h6Var.f42550c - h6Var.f42551e));
                    }
                    float c11 = org.telegram.ui.Wallet.a6.c(f12 * 1.5f, -15.0f, 15.0f);
                    float f18 = a6Var.K;
                    float f19 = a6Var.L;
                    float z11 = com.google.android.recaptcha.internal.a.z(f18, f19, 1.0f, f19);
                    a6Var.L = z11;
                    float f20 = a6Var.M;
                    float z12 = com.google.android.recaptcha.internal.a.z(c11, f20, 1.0f, f20);
                    a6Var.M = z12;
                    float f21 = a6Var.f42119e0;
                    a6Var.b((z11 * f21) + a6Var.N + a6Var.f42117d0, (z12 * f21) + a6Var.O);
                    a6Var.postOnAnimation(this);
                    return;
                }
                return;
            case 26:
                if (org.telegram.utils.twidget.n0.h.remove(this)) {
                    org.telegram.messenger.g0.r(this);
                    ((org.telegram.ui.ae) this.f33493b).run();
                    return;
                }
                return;
            case 27:
                ((qe.h) this.f33493b).o();
                return;
            case 28:
                a();
                return;
            default:
                sg.t0 t0Var = (sg.t0) this.f33493b;
                if (t0Var.f55219f && !t0Var.D.D) {
                    sg.t0.a(t0Var);
                    GLES20.glBindFramebuffer(36160, 0);
                    sg.t0 t0Var2 = (sg.t0) this.f33493b;
                    GLES20.glViewport(0, 0, t0Var2.f55220n, t0Var2.f55221r);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    sg.j0 j0Var = ((sg.t0) this.f33493b).D.f55236c;
                    if (j0Var.f55114r != null) {
                        if (j0Var.D != null && j0Var.F != null && j0Var.E) {
                            GLES20.glBindFramebuffer(36160, 0);
                            sg.w0 w0Var = (sg.w0) j0Var.f55114r.get("videoBlur");
                            if (w0Var != null) {
                                GLES20.glUseProgram(w0Var.f55268a);
                                GLES20.glUniformMatrix4fv(w0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(j0Var.f55120y));
                                GLES20.glUniform1f(w0Var.d("flipy"), 0.0f);
                                GLES20.glUniform1i(w0Var.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, j0Var.D.c());
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glUniform1i(w0Var.d("blured"), 1);
                                GLES20.glActiveTexture(33985);
                                da daVar = j0Var.F.f40681m;
                                if (daVar != null) {
                                    i10 = daVar.f32912s[2];
                                } else {
                                    i10 = -1;
                                }
                                GLES20.glBindTexture(3553, i10);
                                if (j0Var.f55100b != null && (j0Var.f55105i instanceof sg.d)) {
                                    GLES20.glUniform1f(w0Var.d("eraser"), 1.0f);
                                    GLES20.glUniform1i(w0Var.d("mask"), 2);
                                    GLES20.glActiveTexture(33986);
                                    GLES20.glBindTexture(3553, j0Var.g());
                                } else {
                                    GLES20.glUniform1f(w0Var.d("eraser"), 0.0f);
                                }
                                GLES20.glBlendFunc(1, 0);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) j0Var.f55109m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) j0Var.f55110n);
                                GLES20.glEnableVertexAttribArray(1);
                                synchronized (j0Var.F.h) {
                                    GLES20.glDrawArrays(5, 0, 4);
                                }
                            }
                        }
                        if (j0Var.f55100b != null) {
                            j0Var.n(j0Var.g(), j0Var.f55100b, (1.0f - (j0Var.I * 0.5f)) - (j0Var.J * 0.5f));
                        } else if (j0Var.f55101c != null) {
                            j0Var.o(j0Var.j(), j0Var.g(), j0Var.f55101c, 1.0f);
                        } else {
                            int j11 = j0Var.j();
                            Map map = j0Var.f55114r;
                            f11 = 0.5f;
                            if (j0Var.G) {
                                str = "maskingBlit";
                            } else {
                                str = "blit";
                            }
                            sg.w0 w0Var2 = (sg.w0) map.get(str);
                            if (j11 != 0 && w0Var2 != null) {
                                GLES20.glUseProgram(w0Var2.f55268a);
                                GLES20.glUniformMatrix4fv(w0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(j0Var.f55120y));
                                GLES20.glUniform1f(w0Var2.d("alpha"), 1.0f);
                                if (j0Var.G) {
                                    GLES20.glUniform1i(w0Var2.d("texture"), 1);
                                    GLES20.glUniform1i(w0Var2.d("mask"), 0);
                                    GLES20.glUniform1f(w0Var2.d("preview"), 0.4f);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j11);
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(3553, j0Var.f55108l.c());
                                } else {
                                    GLES20.glUniform1i(w0Var2.d("texture"), 0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j11);
                                }
                                GLES20.glBlendFunc(1, 771);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) j0Var.f55109m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) j0Var.f55110n);
                                GLES20.glEnableVertexAttribArray(1);
                                GLES20.glDrawArrays(5, 0, 4);
                                c8.fc.a();
                            }
                            i7 = j0Var.f55113q;
                            if (i7 != 0 && j0Var.d != null && j0Var.I > 0.0f) {
                                j0Var.o(i7, j0Var.g(), j0Var.d, (j0Var.J * f11) + (j0Var.I * f11));
                            }
                        }
                        f11 = 0.5f;
                        i7 = j0Var.f55113q;
                        if (i7 != 0) {
                            j0Var.o(i7, j0Var.g(), j0Var.d, (j0Var.J * f11) + (j0Var.I * f11));
                        }
                    }
                    GLES20.glBlendFunc(1, 771);
                    sg.t0 t0Var3 = (sg.t0) this.f33493b;
                    t0Var3.f55216b.eglSwapBuffers(t0Var3.f55217c, t0Var3.f55218e);
                    sg.v0 v0Var = ((sg.t0) this.f33493b).D;
                    if (!v0Var.f55241s) {
                        v0Var.f55241s = true;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.o5(this, 28));
                    }
                    if (!((sg.t0) this.f33493b).h) {
                        ((sg.t0) this.f33493b).h = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
