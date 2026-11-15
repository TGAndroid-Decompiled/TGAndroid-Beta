package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoFrame;
public final class zj implements Runnable {
    public final int f42395a;
    public final Object f42396b;

    public zj(Object obj, int i7) {
        this.f42395a = i7;
        this.f42396b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        float f10;
        int L;
        boolean z11;
        boolean z12;
        float f11;
        int i7 = this.f42395a;
        float f12 = 0.0f;
        Object obj = this.f42396b;
        switch (i7) {
            case 0:
                ck ckVar = (ck) obj;
                if (ckVar.T) {
                    ckVar.O.clear();
                    ckVar.Q.clear();
                    ckVar.R.clear();
                    ckVar.f();
                    return;
                }
                return;
            case 1:
                hm hmVar = (hm) obj;
                im imVar = hmVar.Q;
                if (imVar.K != null && !imVar.L) {
                    int computeVerticalScrollOffset = imVar.f35650r.computeVerticalScrollOffset();
                    if (imVar.f35650r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (hmVar.e() - hmVar.f35294r) + hmVar.f35293n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (imVar.F - Math.max(0, computeVerticalScrollOffset - imVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
                    float max2 = Math.max(0.0f, ((imVar.f35650r.getMeasuredHeight() - (imVar.F - computeVerticalScrollOffset)) - imVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
                    float L2 = org.telegram.messenger.g0.L(32.0f);
                    if (max < L2 && computeVerticalScrollOffset > imVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / L2))) * org.telegram.messenger.g0.L(6.0f);
                    } else if (max2 < L2) {
                        f10 = org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i10 = (int) f10;
                    if (Math.abs(i10) > 0 && imVar.f35650r.canScrollVertically(i10) && (f10 <= 0.0f || !z10)) {
                        imVar.F += f10;
                        imVar.f35650r.scrollBy(0, i10);
                        hmVar.invalidate();
                    }
                    hmVar.M = true;
                    hmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 2:
                jn jnVar = (jn) obj;
                zj zjVar = jnVar.V0;
                org.telegram.ui.Cells.z5 z5Var = jnVar.f36077h1;
                if (z5Var != null) {
                    EditTextBoldCursor editField = z5Var.getEditField();
                    if (!jnVar.I && editField != null && jnVar.H && !jnVar.f36073f1 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.J3(editField);
                        org.telegram.messenger.g0.r(zjVar);
                        org.telegram.messenger.g0.i3(zjVar, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                rt rtVar = (rt) obj;
                zj zjVar2 = rtVar.Q;
                mt mtVar = rtVar.f39053a;
                if (!rtVar.E && mtVar != null && rtVar.O && !rtVar.f39061w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    mtVar.requestFocus();
                    org.telegram.messenger.g0.J3(mtVar);
                    org.telegram.messenger.g0.r(zjVar2);
                    org.telegram.messenger.g0.i3(zjVar2, 100L);
                    return;
                }
                return;
            case 4:
                ab.q qVar = (ab.q) ((fi.c3) obj).d;
                if (qVar.f988a && !((ArrayList) qVar.d).isEmpty() && !((AnimatorSet) qVar.f990c).isRunning()) {
                    try {
                        ((AnimatorSet) qVar.f990c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 5:
                ly lyVar = (ly) obj;
                if (lyVar.C0.f41400s == null) {
                    lyVar.Y1 = false;
                    lyVar.Z();
                    return;
                }
                return;
            case 6:
                iz izVar = (iz) obj;
                if (izVar.P) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = izVar.f35789q0 + (((float) elapsedRealtime) / 320.0f);
                    izVar.f35789q0 = f13;
                    izVar.setAnimationIdicatorProgress(izVar.f35782j0.getInterpolation(f13));
                    if (izVar.f35789q0 > 1.0f) {
                        izVar.f35789q0 = 1.0f;
                    }
                    if (izVar.f35789q0 < 1.0f) {
                        org.telegram.messenger.g0.h3(izVar.f35798w0);
                        return;
                    }
                    izVar.P = false;
                    izVar.setEnabled(true);
                    ez ezVar = izVar.K;
                    if (ezVar != null) {
                        ((org.telegram.ui.pw) ezVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.f();
                org.telegram.messenger.g0.i3(fragmentContextView.f32582u0, 1000L);
                return;
            case 8:
                TextureView textureView = ((j40) obj).I0.f38865q0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.h3(new vs(16, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 9:
                o50 o50Var = (o50) obj;
                p50 p50Var = o50Var.E;
                c50 c50Var = p50Var.Q1;
                if (c50Var != null && c50Var.getAdapter() != null) {
                    p50Var.Q1.getClass();
                    int R = RecyclerView.R(o50Var);
                    if (R >= 0) {
                        p50Var.O1.t(p50Var.Q1.T(o50Var), R);
                    }
                }
                org.telegram.messenger.g0.h3(this);
                return;
            case 10:
                ka0 ka0Var = (ka0) obj;
                ValueAnimator valueAnimator = ka0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ka0Var.h.start();
                    return;
                }
                return;
            case 11:
                ((fc0) obj).e();
                return;
            case 12:
                ng0 ng0Var = (ng0) obj;
                ng0Var.f37600y = true;
                ValueAnimator valueAnimator2 = ng0Var.f37601z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ng0Var.f37599x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ng0Var.f37601z = ofFloat;
                ofFloat.addUpdateListener(ng0Var.f37577b0);
                ng0Var.f37601z.setInterpolator(new LinearInterpolator());
                ng0Var.f37601z.setDuration(150L);
                ng0Var.f37601z.start();
                return;
            case 13:
                uj0 uj0Var = (uj0) obj;
                m.b3 b3Var = uj0Var.f40055g2;
                int[] iArr = uj0Var.f40064l2;
                org.telegram.ui.an anVar = (org.telegram.ui.an) b3Var.d;
                iArr[0] = (int) anVar.O9;
                iArr[1] = anVar.Xa;
                if (uj0Var.f40059i2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    uj0Var.M0(0.0f, uj0Var.f40064l2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    uj0Var.M0(0.0f, uj0Var.getMeasuredHeight() - uj0Var.f40064l2[1]);
                }
                ((org.telegram.ui.an) uj0Var.f40055g2.d).A0.scrollBy(0, L);
                if (uj0Var.f40057h2) {
                    org.telegram.messenger.g0.h3(uj0Var.D2);
                    return;
                }
                return;
            case 14:
                zi0 zi0Var = (zi0) obj;
                zj zjVar3 = zi0Var.f42382j0;
                if (zi0Var.f42385n) {
                    org.telegram.messenger.g0.r(zjVar3);
                    org.telegram.messenger.g0.i3(zjVar3, 4000L);
                    return;
                }
                zi0Var.V = false;
                zi0Var.invalidate();
                return;
            case 15:
                yj0 yj0Var = (yj0) obj;
                RecyclerView recyclerView = yj0Var.f42020a;
                if (recyclerView != null) {
                    if (yj0Var.f42025g) {
                        recyclerView.scrollBy(0, -yj0Var.f42026i);
                        org.telegram.messenger.g0.h3(this);
                        return;
                    } else if (yj0Var.h) {
                        recyclerView.scrollBy(0, yj0Var.f42026i);
                        org.telegram.messenger.g0.h3(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.I) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f14 = scrollSlidingTextTabStrip.T + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f32705c0));
                    scrollSlidingTextTabStrip.T = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.O.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.T > 1.0f) {
                        scrollSlidingTextTabStrip.T = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.T < 1.0f) {
                        org.telegram.messenger.g0.h3(scrollSlidingTextTabStrip.f32708e0);
                        return;
                    }
                    scrollSlidingTextTabStrip.I = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    zk0 zk0Var = scrollSlidingTextTabStrip.f32702b;
                    if (zk0Var != null) {
                        zk0Var.D0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ShutterButton shutterButton = (ShutterButton) obj;
                ct0 ct0Var = shutterButton.f32728e;
                if (ct0Var != null) {
                    final ol olVar = (ol) ct0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = olVar.f38019e;
                    ki kiVar = chatAttachAlertPhotoLayout.f33609b;
                    vl vlVar = chatAttachAlertPhotoLayout.S;
                    int i11 = kiVar.O2;
                    org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
                    if ((i11 == 2 || (e2Var instanceof org.telegram.ui.an)) && !chatAttachAlertPhotoLayout.f32406t0 && !kiVar.Q1 && chatAttachAlertPhotoLayout.Q != null && !kiVar.B1) {
                        if (e2Var == null) {
                            e2Var = LaunchActivity.Q();
                        }
                        if (e2Var != null && e2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f32412x0) {
                                org.telegram.messenger.k5.o(null, 2131749538, new cc(chatAttachAlertPhotoLayout.Q, olVar.f38018c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.R0 = true;
                                e2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    chatAttachAlertPhotoLayout.T[i12].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(er.f34419f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f32405s0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                er erVar = er.f34419f;
                                duration.setInterpolator(erVar).start();
                                chatAttachAlertPhotoLayout.f32403r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
                                org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.f36424a2;
                                if ((e2Var2 instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var2).z()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                olVar.f38016a = org.telegram.messenger.g0.s0(z11);
                                org.telegram.messenger.g0.W3(vlVar, true);
                                vlVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                chatAttachAlertPhotoLayout.f32384h0 = 0;
                                chatAttachAlertPhotoLayout.f32386i0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = olVar.f38019e;
                                                if (chatAttachAlertPhotoLayout2.f32386i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f32384h0 + 1;
                                                    chatAttachAlertPhotoLayout2.f32384h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.f32386i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.i3(olVar.f38019e.f32386i0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                org.telegram.messenger.g0.f2(e2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.Q.getCameraSessionObject();
                                File file = olVar.f38016a;
                                if (kiVar.O2 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new s(olVar, 21), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = olVar.f38019e;
                                                if (chatAttachAlertPhotoLayout2.f32386i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f32384h0 + 1;
                                                    chatAttachAlertPhotoLayout2.f32384h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.i3(chatAttachAlertPhotoLayout2.f32386i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.i3(olVar.f38019e.f32386i0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.Q);
                                chatAttachAlertPhotoLayout.f32392l0.a(dt0.f34050b);
                                chatAttachAlertPhotoLayout.Q.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.f32733w = false;
                    return;
                }
                return;
            case 18:
                cv0 cv0Var = (cv0) obj;
                View view = cv0Var.f33713s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        cv0Var.f33713s.setVisibility(0);
                        cv0Var.f33713s.setAlpha(0.0f);
                    }
                    cv0Var.f33713s.animate().setListener(null).cancel();
                    cv0Var.f33713s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                cv0Var.f33708c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 19:
                ((ThemeEditorView) obj).f32748a = false;
                try {
                    org.telegram.ui.ActionBar.j6.l();
                    org.telegram.ui.ActionBar.j6.o();
                    org.telegram.ui.ActionBar.j6.q();
                    org.telegram.ui.ActionBar.j6.k(false, false);
                    org.telegram.ui.ActionBar.q6.b0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.c0();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 20:
                v61 v61Var = (v61) obj;
                if (v61Var.K) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f15 = v61Var.f40302g0 + (((float) elapsedRealtime3) / 200.0f);
                    v61Var.f40302g0 = f15;
                    v61Var.setAnimationIdicatorProgress(v61Var.f40294b0.getInterpolation(f15));
                    if (v61Var.f40302g0 > 1.0f) {
                        v61Var.f40302g0 = 1.0f;
                    }
                    if (v61Var.f40302g0 < 1.0f) {
                        org.telegram.messenger.g0.h3(v61Var.f40305j0);
                        return;
                    }
                    v61Var.K = false;
                    v61Var.setEnabled(true);
                    u61 u61Var = v61Var.E;
                    if (u61Var != null) {
                        ((cf) u61Var).q(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) obj;
                if (b0Var.f40513w) {
                    b0Var.j(false);
                    org.telegram.messenger.g0.i3(this, 250L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.y10 y10Var = (org.telegram.ui.y10) obj;
                if (y10Var.f40727b && y10Var.R0.f45969u2 == null) {
                    y10Var.f40737h0 = false;
                    org.telegram.ui.Components.voip.l0.a(y10Var);
                    return;
                }
                org.telegram.messenger.g0.i3(y10Var.f40738i0, 3000L);
                return;
            case 23:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                org.telegram.ui.Components.voip.u0 u0Var = k1Var.f40717e;
                if (u0Var != null) {
                    if (!k1Var.f40715b.a(k1Var.f40721s)) {
                        if (k1Var.h == null) {
                            k1Var.h = new org.telegram.ui.Components.voip.i1();
                        }
                        VideoFrame videoFrame = k1Var.h.f40656b;
                        if (videoFrame != null) {
                            u0Var.onFrame(videoFrame);
                        }
                    }
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                j1Var.a();
                if (j1Var.f40675b) {
                    org.telegram.messenger.g0.i3(this, 500L);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.j2 j2Var = (org.telegram.ui.Components.voip.j2) obj;
                org.telegram.ui.Components.voip.m mVar = j2Var.f40680b;
                if (mVar != null) {
                    mVar.b();
                }
                long c10 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c10 != j2Var.f40681c || a10 != j2Var.d) {
                    j2Var.f40681c = c10;
                    j2Var.d = a10;
                    wi.n nVar = j2Var.f40679a;
                    if (nVar != null) {
                        nVar.c();
                    }
                }
                org.telegram.messenger.g0.i3(this, 500L);
                return;
            case 26:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) obj;
                if (y0Var.d && y0Var.f44694e && y0Var.f44699k != null) {
                    if (SystemClock.elapsedRealtime() - y0Var.f44700l >= 30000) {
                        y0Var.f("heartbeat timed out");
                        return;
                    }
                    y0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - y0Var.f44700l) + " ms ago");
                    y0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    org.telegram.messenger.g0.i3(this, 15000L);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) obj;
                if (y5Var.f38880a != null && y5Var.f44731e != null) {
                    y5Var.X0();
                    if (y5Var.f44748s) {
                        y5Var.f38880a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                org.telegram.ui.Wallet.j6 j6Var = c6Var.H;
                if (c6Var.f43622b0) {
                    long nanoTime = System.nanoTime();
                    if (j6Var.f44017a) {
                        long j3 = j6Var.f44024j;
                        if (j3 == 0) {
                            j6Var.f44024j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, ((float) (nanoTime - j3)) * 1.0E-9f));
                            j6Var.f44024j = nanoTime;
                            if (j6Var.f44023i - j6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f16 = j6Var.d;
                                j6Var.d = com.google.android.gms.internal.vision.e2.z(j6Var.f44018b, f16, exp, f16);
                                float f17 = j6Var.f44020e;
                                j6Var.f44020e = com.google.android.gms.internal.vision.e2.z(j6Var.f44019c, f17, exp, f17);
                            }
                        }
                    }
                    if (j6Var.f44017a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, j6Var.f44018b - j6Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    c6Var.L = f11;
                    if (j6Var.f44017a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, j6Var.f44019c - j6Var.f44020e));
                    }
                    float c11 = org.telegram.ui.Wallet.c6.c(f12 * 1.5f, -15.0f, 15.0f);
                    float f18 = c6Var.L;
                    float f19 = c6Var.M;
                    float z13 = com.google.android.gms.internal.vision.e2.z(f18, f19, 1.0f, f19);
                    c6Var.M = z13;
                    float f20 = c6Var.N;
                    float z14 = com.google.android.gms.internal.vision.e2.z(c11, f20, 1.0f, f20);
                    c6Var.N = z14;
                    float f21 = c6Var.f43629f0;
                    c6Var.b((z13 * f21) + c6Var.O + c6Var.f43627e0, (z14 * f21) + c6Var.P);
                    c6Var.postOnAnimation(this);
                    return;
                }
                return;
            default:
                if (org.telegram.utils.twidget.n0.h.remove(this)) {
                    org.telegram.messenger.g0.r(this);
                    ((org.telegram.ui.yd) obj).run();
                    return;
                }
                return;
        }
    }
}
