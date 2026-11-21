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
public final class ik implements Runnable {
    public final int f36272a;
    public final Object f36273b;

    public ik(Object obj, int i7) {
        this.f36272a = i7;
        this.f36273b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        float f10;
        int L;
        boolean z11;
        boolean z12;
        float f11;
        int i7 = this.f36272a;
        float f12 = 0.0f;
        Object obj = this.f36273b;
        switch (i7) {
            case 0:
                lk lkVar = (lk) obj;
                if (lkVar.T) {
                    lkVar.O.clear();
                    lkVar.Q.clear();
                    lkVar.R.clear();
                    lkVar.f();
                    return;
                }
                return;
            case 1:
                qm qmVar = (qm) obj;
                rm rmVar = qmVar.Q;
                if (rmVar.K != null && !rmVar.L) {
                    int computeVerticalScrollOffset = rmVar.f39271r.computeVerticalScrollOffset();
                    if (rmVar.f39271r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (qmVar.e() - qmVar.f38956r) + qmVar.f38955n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (rmVar.F - Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
                    float max2 = Math.max(0.0f, ((rmVar.f39271r.getMeasuredHeight() - (rmVar.F - computeVerticalScrollOffset)) - rmVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
                    float L2 = org.telegram.messenger.g0.L(32.0f);
                    if (max < L2 && computeVerticalScrollOffset > rmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / L2))) * org.telegram.messenger.g0.L(6.0f);
                    } else if (max2 < L2) {
                        f10 = org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i10 = (int) f10;
                    if (Math.abs(i10) > 0 && rmVar.f39271r.canScrollVertically(i10) && (f10 <= 0.0f || !z10)) {
                        rmVar.F += f10;
                        rmVar.f39271r.scrollBy(0, i10);
                        qmVar.invalidate();
                    }
                    qmVar.M = true;
                    qmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 2:
                tn tnVar = (tn) obj;
                ik ikVar = tnVar.V0;
                org.telegram.ui.Cells.b6 b6Var = tnVar.f39971h1;
                if (b6Var != null) {
                    EditTextBoldCursor editField = b6Var.getEditField();
                    if (!tnVar.I && editField != null && tnVar.H && !tnVar.f39967f1 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.I3(editField);
                        org.telegram.messenger.g0.r(ikVar);
                        org.telegram.messenger.g0.h3(ikVar, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                yt ytVar = (yt) obj;
                ik ikVar2 = ytVar.Q;
                tt ttVar = ytVar.f42542a;
                if (!ytVar.E && ttVar != null && ytVar.O && !ytVar.f42550w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    ttVar.requestFocus();
                    org.telegram.messenger.g0.I3(ttVar);
                    org.telegram.messenger.g0.r(ikVar2);
                    org.telegram.messenger.g0.h3(ikVar2, 100L);
                    return;
                }
                return;
            case 4:
                ab.q qVar = (ab.q) ((fi.a3) obj).d;
                if (qVar.f987a && !((ArrayList) qVar.d).isEmpty() && !((AnimatorSet) qVar.f989c).isRunning()) {
                    try {
                        ((AnimatorSet) qVar.f989c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 5:
                ty tyVar = (ty) obj;
                if (tyVar.C0.f35610s == null) {
                    tyVar.Y1 = false;
                    tyVar.Z();
                    return;
                }
                return;
            case 6:
                rz rzVar = (rz) obj;
                if (rzVar.P) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = rzVar.f39402q0 + (((float) elapsedRealtime) / 320.0f);
                    rzVar.f39402q0 = f13;
                    rzVar.setAnimationIdicatorProgress(rzVar.f39395j0.getInterpolation(f13));
                    if (rzVar.f39402q0 > 1.0f) {
                        rzVar.f39402q0 = 1.0f;
                    }
                    if (rzVar.f39402q0 < 1.0f) {
                        org.telegram.messenger.g0.g3(rzVar.f39411w0);
                        return;
                    }
                    rzVar.P = false;
                    rzVar.setEnabled(true);
                    nz nzVar = rzVar.K;
                    if (nzVar != null) {
                        ((org.telegram.ui.tw) nzVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.f();
                org.telegram.messenger.g0.h3(fragmentContextView.f33012u0, 1000L);
                return;
            case 8:
                TextureView textureView = ((u40) obj).I0.f34050q0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.g3(new ou(14, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 9:
                z50 z50Var = (z50) obj;
                a60 a60Var = z50Var.E;
                n50 n50Var = a60Var.Q1;
                if (n50Var != null && n50Var.getAdapter() != null) {
                    a60Var.Q1.getClass();
                    int R = RecyclerView.R(z50Var);
                    if (R >= 0) {
                        a60Var.O1.t(a60Var.Q1.T(z50Var), R);
                    }
                }
                org.telegram.messenger.g0.g3(this);
                return;
            case 10:
                wa0 wa0Var = (wa0) obj;
                ValueAnimator valueAnimator = wa0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    wa0Var.h.start();
                    return;
                }
                return;
            case 11:
                ((qc0) obj).e();
                return;
            case 12:
                zg0 zg0Var = (zg0) obj;
                zg0Var.f42834y = true;
                ValueAnimator valueAnimator2 = zg0Var.f42835z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                zg0Var.f42833x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zg0Var.f42835z = ofFloat;
                ofFloat.addUpdateListener(zg0Var.f42811b0);
                zg0Var.f42835z.setInterpolator(new LinearInterpolator());
                zg0Var.f42835z.setDuration(150L);
                zg0Var.f42835z.start();
                return;
            case 13:
                ek0 ek0Var = (ek0) obj;
                m.b3 b3Var = ek0Var.f34861g2;
                int[] iArr = ek0Var.f34870l2;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) b3Var.d;
                iArr[0] = (int) bnVar.P9;
                iArr[1] = bnVar.Ya;
                if (ek0Var.f34865i2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    ek0Var.M0(0.0f, ek0Var.f34870l2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    ek0Var.M0(0.0f, ek0Var.getMeasuredHeight() - ek0Var.f34870l2[1]);
                }
                ((org.telegram.ui.bn) ek0Var.f34861g2.d).A0.scrollBy(0, L);
                if (ek0Var.f34863h2) {
                    org.telegram.messenger.g0.g3(ek0Var.D2);
                    return;
                }
                return;
            case 14:
                jj0 jj0Var = (jj0) obj;
                ik ikVar3 = jj0Var.f36542j0;
                if (jj0Var.f36545n) {
                    org.telegram.messenger.g0.r(ikVar3);
                    org.telegram.messenger.g0.h3(ikVar3, 4000L);
                    return;
                }
                jj0Var.V = false;
                jj0Var.invalidate();
                return;
            case 15:
                ik0 ik0Var = (ik0) obj;
                RecyclerView recyclerView = ik0Var.f36274a;
                if (recyclerView != null) {
                    if (ik0Var.f36279g) {
                        recyclerView.scrollBy(0, -ik0Var.f36280i);
                        org.telegram.messenger.g0.g3(this);
                        return;
                    } else if (ik0Var.h) {
                        recyclerView.scrollBy(0, ik0Var.f36280i);
                        org.telegram.messenger.g0.g3(this);
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
                    float f14 = scrollSlidingTextTabStrip.T + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f33135c0));
                    scrollSlidingTextTabStrip.T = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.O.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.T > 1.0f) {
                        scrollSlidingTextTabStrip.T = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.T < 1.0f) {
                        org.telegram.messenger.g0.g3(scrollSlidingTextTabStrip.f33138e0);
                        return;
                    }
                    scrollSlidingTextTabStrip.I = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    jl0 jl0Var = scrollSlidingTextTabStrip.f33132b;
                    if (jl0Var != null) {
                        jl0Var.g(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ShutterButton shutterButton = (ShutterButton) obj;
                nt0 nt0Var = shutterButton.f33158e;
                if (nt0Var != null) {
                    final xl xlVar = (xl) nt0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xlVar.f42173e;
                    ui uiVar = chatAttachAlertPhotoLayout.f37521b;
                    em emVar = chatAttachAlertPhotoLayout.S;
                    int i11 = uiVar.O2;
                    org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
                    if ((i11 == 2 || (g2Var instanceof org.telegram.ui.bn)) && !chatAttachAlertPhotoLayout.f32836t0 && !uiVar.Q1 && chatAttachAlertPhotoLayout.Q != null && !uiVar.B1) {
                        if (g2Var == null) {
                            g2Var = LaunchActivity.Q();
                        }
                        if (g2Var != null && g2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f32842x0) {
                                org.telegram.messenger.f3.o(null, 2131749362, new lc(chatAttachAlertPhotoLayout.Q, xlVar.f42172c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.R0 = true;
                                g2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    chatAttachAlertPhotoLayout.T[i12].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(nr.f37956f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f32835s0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                nr nrVar = nr.f37956f;
                                duration.setInterpolator(nrVar).start();
                                chatAttachAlertPhotoLayout.f32833r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(nrVar).start();
                                org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.f40375a2;
                                if ((g2Var2 instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var2).z()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                xlVar.f42170a = org.telegram.messenger.g0.s0(z11);
                                org.telegram.messenger.g0.V3(emVar, true);
                                emVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                chatAttachAlertPhotoLayout.f32814h0 = 0;
                                chatAttachAlertPhotoLayout.f32816i0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = xlVar.f42173e;
                                                if (chatAttachAlertPhotoLayout2.f32816i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f32814h0 + 1;
                                                    chatAttachAlertPhotoLayout2.f32814h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.h3(chatAttachAlertPhotoLayout2.f32816i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.h3(xlVar.f42173e.f32816i0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                org.telegram.messenger.g0.f2(g2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.Q.getCameraSessionObject();
                                File file = xlVar.f42170a;
                                if (uiVar.O2 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new c0(xlVar, 20), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = xlVar.f42173e;
                                                if (chatAttachAlertPhotoLayout2.f32816i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f32814h0 + 1;
                                                    chatAttachAlertPhotoLayout2.f32814h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.h3(chatAttachAlertPhotoLayout2.f32816i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.h3(xlVar.f42173e.f32816i0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.Q);
                                chatAttachAlertPhotoLayout.f32822l0.a(ot0.f38356b);
                                chatAttachAlertPhotoLayout.Q.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.f33163w = false;
                    return;
                }
                return;
            case 18:
                nv0 nv0Var = (nv0) obj;
                View view = nv0Var.f37995s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        nv0Var.f37995s.setVisibility(0);
                        nv0Var.f37995s.setAlpha(0.0f);
                    }
                    nv0Var.f37995s.animate().setListener(null).cancel();
                    nv0Var.f37995s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                nv0Var.f37990c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 19:
                ((ThemeEditorView) obj).f33178a = false;
                try {
                    org.telegram.ui.ActionBar.m6.l();
                    org.telegram.ui.ActionBar.m6.o();
                    org.telegram.ui.ActionBar.m6.q();
                    org.telegram.ui.ActionBar.m6.k(false, false);
                    org.telegram.ui.ActionBar.t6.b0(null, true);
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
                i71 i71Var = (i71) obj;
                if (i71Var.K) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f15 = i71Var.f36211g0 + (((float) elapsedRealtime3) / 200.0f);
                    i71Var.f36211g0 = f15;
                    i71Var.setAnimationIdicatorProgress(i71Var.f36203b0.getInterpolation(f15));
                    if (i71Var.f36211g0 > 1.0f) {
                        i71Var.f36211g0 = 1.0f;
                    }
                    if (i71Var.f36211g0 < 1.0f) {
                        org.telegram.messenger.g0.g3(i71Var.f36214j0);
                        return;
                    }
                    i71Var.K = false;
                    i71Var.setEnabled(true);
                    h71 h71Var = i71Var.E;
                    if (h71Var != null) {
                        h71Var.g(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) obj;
                if (a0Var.f40893w) {
                    a0Var.j(false);
                    org.telegram.messenger.g0.h3(this, 250L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) obj;
                if (b20Var.f41108b && b20Var.R0.f47551u2 == null) {
                    b20Var.f41118h0 = false;
                    org.telegram.ui.Components.voip.k0.a(b20Var);
                    return;
                }
                org.telegram.messenger.g0.h3(b20Var.f41119i0, 3000L);
                return;
            case 23:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                org.telegram.ui.Components.voip.t0 t0Var = j1Var.f41088e;
                if (t0Var != null) {
                    if (!j1Var.f41086b.a(j1Var.f41092s)) {
                        if (j1Var.h == null) {
                            j1Var.h = new org.telegram.ui.Components.voip.h1();
                        }
                        VideoFrame videoFrame = j1Var.h.f41036b;
                        if (videoFrame != null) {
                            t0Var.onFrame(videoFrame);
                        }
                    }
                    org.telegram.messenger.g0.h3(this, 500L);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) obj;
                i1Var.a();
                if (i1Var.f41055b) {
                    org.telegram.messenger.g0.h3(this, 500L);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) obj;
                org.telegram.ui.Components.voip.m mVar = i2Var.f41060b;
                if (mVar != null) {
                    mVar.b();
                }
                long c10 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c10 != i2Var.f41061c || a10 != i2Var.d) {
                    i2Var.f41061c = c10;
                    i2Var.d = a10;
                    wi.n nVar = i2Var.f41059a;
                    if (nVar != null) {
                        nVar.c();
                    }
                }
                org.telegram.messenger.g0.h3(this, 500L);
                return;
            case 26:
                org.telegram.ui.Wallet.i1 i1Var2 = (org.telegram.ui.Wallet.i1) obj;
                if (i1Var2.d && i1Var2.f44370e && i1Var2.f44375k != null) {
                    if (SystemClock.elapsedRealtime() - i1Var2.f44376l >= 30000) {
                        i1Var2.f("heartbeat timed out");
                        return;
                    }
                    i1Var2.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - i1Var2.f44376l) + " ms ago");
                    i1Var2.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    org.telegram.messenger.g0.h3(this, 15000L);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) obj;
                if (n6Var.f34683a != null && n6Var.f44665e != null) {
                    n6Var.b1();
                    if (n6Var.f44682s) {
                        n6Var.f34683a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                org.telegram.ui.Wallet.z6 z6Var = s6Var.H;
                if (s6Var.f45037b0) {
                    long nanoTime = System.nanoTime();
                    if (z6Var.f45388a) {
                        long j3 = z6Var.f45395j;
                        if (j3 == 0) {
                            z6Var.f45395j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, ((float) (nanoTime - j3)) * 1.0E-9f));
                            z6Var.f45395j = nanoTime;
                            if (z6Var.f45394i - z6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f16 = z6Var.d;
                                z6Var.d = com.google.android.gms.internal.vision.e2.z(z6Var.f45389b, f16, exp, f16);
                                float f17 = z6Var.f45391e;
                                z6Var.f45391e = com.google.android.gms.internal.vision.e2.z(z6Var.f45390c, f17, exp, f17);
                            }
                        }
                    }
                    if (z6Var.f45388a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, z6Var.f45389b - z6Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    s6Var.L = f11;
                    if (z6Var.f45388a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, z6Var.f45390c - z6Var.f45391e));
                    }
                    float c11 = org.telegram.ui.Wallet.s6.c(f12 * 1.5f, -15.0f, 15.0f);
                    float f18 = s6Var.L;
                    float f19 = s6Var.M;
                    float z13 = com.google.android.gms.internal.vision.e2.z(f18, f19, 1.0f, f19);
                    s6Var.M = z13;
                    float f20 = s6Var.N;
                    float z14 = com.google.android.gms.internal.vision.e2.z(c11, f20, 1.0f, f20);
                    s6Var.N = z14;
                    float f21 = s6Var.f45044f0;
                    s6Var.b((z13 * f21) + s6Var.O + s6Var.f45042e0, (z14 * f21) + s6Var.P);
                    s6Var.postOnAnimation(this);
                    return;
                }
                return;
            default:
                if (org.telegram.utils.twidget.n0.h.remove(this)) {
                    org.telegram.messenger.g0.r(this);
                    ((org.telegram.ui.zd) obj).run();
                    return;
                }
                return;
        }
    }
}
