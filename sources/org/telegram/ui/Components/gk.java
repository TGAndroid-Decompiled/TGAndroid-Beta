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
public final class gk implements Runnable {
    public final int f35512a;
    public final Object f35513b;

    public gk(Object obj, int i7) {
        this.f35512a = i7;
        this.f35513b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        float f10;
        int L;
        boolean z11;
        boolean z12;
        float f11;
        int i7 = this.f35512a;
        float f12 = 0.0f;
        Object obj = this.f35513b;
        switch (i7) {
            case 0:
                jk jkVar = (jk) obj;
                if (jkVar.T) {
                    jkVar.O.clear();
                    jkVar.Q.clear();
                    jkVar.R.clear();
                    jkVar.f();
                    return;
                }
                return;
            case 1:
                om omVar = (om) obj;
                pm pmVar = omVar.Q;
                if (pmVar.K != null && !pmVar.L) {
                    int computeVerticalScrollOffset = pmVar.f38487r.computeVerticalScrollOffset();
                    if (pmVar.f38487r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (omVar.e() - omVar.f38130r) + omVar.f38129n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (pmVar.F - Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
                    float max2 = Math.max(0.0f, ((pmVar.f38487r.getMeasuredHeight() - (pmVar.F - computeVerticalScrollOffset)) - pmVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
                    float L2 = org.telegram.messenger.g0.L(32.0f);
                    if (max < L2 && computeVerticalScrollOffset > pmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / L2))) * org.telegram.messenger.g0.L(6.0f);
                    } else if (max2 < L2) {
                        f10 = org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i10 = (int) f10;
                    if (Math.abs(i10) > 0 && pmVar.f38487r.canScrollVertically(i10) && (f10 <= 0.0f || !z10)) {
                        pmVar.F += f10;
                        pmVar.f38487r.scrollBy(0, i10);
                        omVar.invalidate();
                    }
                    omVar.M = true;
                    omVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 2:
                rn rnVar = (rn) obj;
                gk gkVar = rnVar.V0;
                org.telegram.ui.Cells.b6 b6Var = rnVar.f39222h1;
                if (b6Var != null) {
                    EditTextBoldCursor editField = b6Var.getEditField();
                    if (!rnVar.I && editField != null && rnVar.H && !rnVar.f39218f1 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.I3(editField);
                        org.telegram.messenger.g0.r(gkVar);
                        org.telegram.messenger.g0.h3(gkVar, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                wt wtVar = (wt) obj;
                gk gkVar2 = wtVar.Q;
                rt rtVar = wtVar.f41786a;
                if (!wtVar.E && rtVar != null && wtVar.O && !wtVar.f41794w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    rtVar.requestFocus();
                    org.telegram.messenger.g0.I3(rtVar);
                    org.telegram.messenger.g0.r(gkVar2);
                    org.telegram.messenger.g0.h3(gkVar2, 100L);
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
                ry ryVar = (ry) obj;
                if (ryVar.C0.f34759s == null) {
                    ryVar.Y1 = false;
                    ryVar.Z();
                    return;
                }
                return;
            case 6:
                pz pzVar = (pz) obj;
                if (pzVar.P) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = pzVar.f38635q0 + (((float) elapsedRealtime) / 320.0f);
                    pzVar.f38635q0 = f13;
                    pzVar.setAnimationIdicatorProgress(pzVar.f38628j0.getInterpolation(f13));
                    if (pzVar.f38635q0 > 1.0f) {
                        pzVar.f38635q0 = 1.0f;
                    }
                    if (pzVar.f38635q0 < 1.0f) {
                        org.telegram.messenger.g0.g3(pzVar.f38644w0);
                        return;
                    }
                    pzVar.P = false;
                    pzVar.setEnabled(true);
                    lz lzVar = pzVar.K;
                    if (lzVar != null) {
                        ((org.telegram.ui.tw) lzVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.f();
                org.telegram.messenger.g0.h3(fragmentContextView.f32979u0, 1000L);
                return;
            case 8:
                TextureView textureView = ((r40) obj).I0.f42791q0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.g3(new dw(12, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 9:
                w50 w50Var = (w50) obj;
                x50 x50Var = w50Var.E;
                k50 k50Var = x50Var.Q1;
                if (k50Var != null && k50Var.getAdapter() != null) {
                    x50Var.Q1.getClass();
                    int R = RecyclerView.R(w50Var);
                    if (R >= 0) {
                        x50Var.O1.t(x50Var.Q1.T(w50Var), R);
                    }
                }
                org.telegram.messenger.g0.g3(this);
                return;
            case 10:
                ua0 ua0Var = (ua0) obj;
                ValueAnimator valueAnimator = ua0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ua0Var.h.start();
                    return;
                }
                return;
            case 11:
                ((pc0) obj).e();
                return;
            case 12:
                xg0 xg0Var = (xg0) obj;
                xg0Var.f42041y = true;
                ValueAnimator valueAnimator2 = xg0Var.f42042z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                xg0Var.f42040x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xg0Var.f42042z = ofFloat;
                ofFloat.addUpdateListener(xg0Var.f42018b0);
                xg0Var.f42042z.setInterpolator(new LinearInterpolator());
                xg0Var.f42042z.setDuration(150L);
                xg0Var.f42042z.start();
                return;
            case 13:
                ck0 ck0Var = (ck0) obj;
                m.b3 b3Var = ck0Var.f34060g2;
                int[] iArr = ck0Var.f34069l2;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) b3Var.d;
                iArr[0] = (int) bnVar.P9;
                iArr[1] = bnVar.Ya;
                if (ck0Var.f34064i2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    ck0Var.M0(0.0f, ck0Var.f34069l2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    ck0Var.M0(0.0f, ck0Var.getMeasuredHeight() - ck0Var.f34069l2[1]);
                }
                ((org.telegram.ui.bn) ck0Var.f34060g2.d).A0.scrollBy(0, L);
                if (ck0Var.f34062h2) {
                    org.telegram.messenger.g0.g3(ck0Var.D2);
                    return;
                }
                return;
            case 14:
                hj0 hj0Var = (hj0) obj;
                gk gkVar3 = hj0Var.f35906j0;
                if (hj0Var.f35909n) {
                    org.telegram.messenger.g0.r(gkVar3);
                    org.telegram.messenger.g0.h3(gkVar3, 4000L);
                    return;
                }
                hj0Var.V = false;
                hj0Var.invalidate();
                return;
            case 15:
                gk0 gk0Var = (gk0) obj;
                RecyclerView recyclerView = gk0Var.f35514a;
                if (recyclerView != null) {
                    if (gk0Var.f35519g) {
                        recyclerView.scrollBy(0, -gk0Var.f35520i);
                        org.telegram.messenger.g0.g3(this);
                        return;
                    } else if (gk0Var.h) {
                        recyclerView.scrollBy(0, gk0Var.f35520i);
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
                    float f14 = scrollSlidingTextTabStrip.T + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f33102c0));
                    scrollSlidingTextTabStrip.T = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.O.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.T > 1.0f) {
                        scrollSlidingTextTabStrip.T = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.T < 1.0f) {
                        org.telegram.messenger.g0.g3(scrollSlidingTextTabStrip.f33105e0);
                        return;
                    }
                    scrollSlidingTextTabStrip.I = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    hl0 hl0Var = scrollSlidingTextTabStrip.f33099b;
                    if (hl0Var != null) {
                        hl0Var.g(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ShutterButton shutterButton = (ShutterButton) obj;
                kt0 kt0Var = shutterButton.f33125e;
                if (kt0Var != null) {
                    final vl vlVar = (vl) kt0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vlVar.f40702e;
                    si siVar = chatAttachAlertPhotoLayout.f36766b;
                    cm cmVar = chatAttachAlertPhotoLayout.S;
                    int i11 = siVar.O2;
                    org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
                    if ((i11 == 2 || (h2Var instanceof org.telegram.ui.bn)) && !chatAttachAlertPhotoLayout.f32803t0 && !siVar.Q1 && chatAttachAlertPhotoLayout.Q != null && !siVar.B1) {
                        if (h2Var == null) {
                            h2Var = LaunchActivity.Q();
                        }
                        if (h2Var != null && h2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f32809x0) {
                                org.telegram.messenger.f3.o(null, 2131749363, new lc(chatAttachAlertPhotoLayout.Q, vlVar.f40701c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.R0 = true;
                                h2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    chatAttachAlertPhotoLayout.T[i12].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(lr.f37208f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f32802s0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                lr lrVar = lr.f37208f;
                                duration.setInterpolator(lrVar).start();
                                chatAttachAlertPhotoLayout.f32800r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(lrVar).start();
                                org.telegram.ui.ActionBar.h2 h2Var2 = siVar.f39659a2;
                                if ((h2Var2 instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var2).z()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                vlVar.f40699a = org.telegram.messenger.g0.s0(z11);
                                org.telegram.messenger.g0.V3(cmVar, true);
                                cmVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                chatAttachAlertPhotoLayout.f32781h0 = 0;
                                chatAttachAlertPhotoLayout.f32783i0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = vlVar.f40702e;
                                                if (chatAttachAlertPhotoLayout2.f32783i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f32781h0 + 1;
                                                    chatAttachAlertPhotoLayout2.f32781h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.h3(chatAttachAlertPhotoLayout2.f32783i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.h3(vlVar.f40702e.f32783i0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                org.telegram.messenger.g0.f2(h2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.Q.getCameraSessionObject();
                                File file = vlVar.f40699a;
                                if (siVar.O2 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new b0(vlVar, 20), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = vlVar.f40702e;
                                                if (chatAttachAlertPhotoLayout2.f32783i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f32781h0 + 1;
                                                    chatAttachAlertPhotoLayout2.f32781h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.h3(chatAttachAlertPhotoLayout2.f32783i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.h3(vlVar.f40702e.f32783i0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.Q);
                                chatAttachAlertPhotoLayout.f32789l0.a(lt0.f37223b);
                                chatAttachAlertPhotoLayout.Q.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.f33130w = false;
                    return;
                }
                return;
            case 18:
                kv0 kv0Var = (kv0) obj;
                View view = kv0Var.f36900s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        kv0Var.f36900s.setVisibility(0);
                        kv0Var.f36900s.setAlpha(0.0f);
                    }
                    kv0Var.f36900s.animate().setListener(null).cancel();
                    kv0Var.f36900s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                kv0Var.f36895c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 19:
                ((ThemeEditorView) obj).f33145a = false;
                try {
                    org.telegram.ui.ActionBar.n6.l();
                    org.telegram.ui.ActionBar.n6.o();
                    org.telegram.ui.ActionBar.n6.q();
                    org.telegram.ui.ActionBar.n6.k(false, false);
                    org.telegram.ui.ActionBar.u6.b0(null, true);
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
                f71 f71Var = (f71) obj;
                if (f71Var.K) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f15 = f71Var.f35001g0 + (((float) elapsedRealtime3) / 200.0f);
                    f71Var.f35001g0 = f15;
                    f71Var.setAnimationIdicatorProgress(f71Var.f34993b0.getInterpolation(f15));
                    if (f71Var.f35001g0 > 1.0f) {
                        f71Var.f35001g0 = 1.0f;
                    }
                    if (f71Var.f35001g0 < 1.0f) {
                        org.telegram.messenger.g0.g3(f71Var.f35004j0);
                        return;
                    }
                    f71Var.K = false;
                    f71Var.setEnabled(true);
                    e71 e71Var = f71Var.E;
                    if (e71Var != null) {
                        e71Var.g(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) obj;
                if (a0Var.f40758w) {
                    a0Var.j(false);
                    org.telegram.messenger.g0.h3(this, 250L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) obj;
                if (b20Var.f40973b && b20Var.R0.f47483u2 == null) {
                    b20Var.f40983h0 = false;
                    org.telegram.ui.Components.voip.k0.a(b20Var);
                    return;
                }
                org.telegram.messenger.g0.h3(b20Var.f40984i0, 3000L);
                return;
            case 23:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                org.telegram.ui.Components.voip.t0 t0Var = j1Var.f40953e;
                if (t0Var != null) {
                    if (!j1Var.f40951b.a(j1Var.f40957s)) {
                        if (j1Var.h == null) {
                            j1Var.h = new org.telegram.ui.Components.voip.h1();
                        }
                        VideoFrame videoFrame = j1Var.h.f40901b;
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
                if (i1Var.f40920b) {
                    org.telegram.messenger.g0.h3(this, 500L);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) obj;
                org.telegram.ui.Components.voip.m mVar = i2Var.f40925b;
                if (mVar != null) {
                    mVar.b();
                }
                long c10 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c10 != i2Var.f40926c || a10 != i2Var.d) {
                    i2Var.f40926c = c10;
                    i2Var.d = a10;
                    wi.n nVar = i2Var.f40924a;
                    if (nVar != null) {
                        nVar.c();
                    }
                }
                org.telegram.messenger.g0.h3(this, 500L);
                return;
            case 26:
                org.telegram.ui.Wallet.i1 i1Var2 = (org.telegram.ui.Wallet.i1) obj;
                if (i1Var2.d && i1Var2.f44330e && i1Var2.f44335k != null) {
                    if (SystemClock.elapsedRealtime() - i1Var2.f44336l >= 30000) {
                        i1Var2.f("heartbeat timed out");
                        return;
                    }
                    i1Var2.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - i1Var2.f44336l) + " ms ago");
                    i1Var2.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    org.telegram.messenger.g0.h3(this, 15000L);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) obj;
                if (n6Var.f33530a != null && n6Var.f44625e != null) {
                    n6Var.b1();
                    if (n6Var.f44642s) {
                        n6Var.f33530a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                org.telegram.ui.Wallet.z6 z6Var = s6Var.H;
                if (s6Var.f44997b0) {
                    long nanoTime = System.nanoTime();
                    if (z6Var.f45347a) {
                        long j3 = z6Var.f45354j;
                        if (j3 == 0) {
                            z6Var.f45354j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, ((float) (nanoTime - j3)) * 1.0E-9f));
                            z6Var.f45354j = nanoTime;
                            if (z6Var.f45353i - z6Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f16 = z6Var.d;
                                z6Var.d = com.google.android.gms.internal.vision.e2.z(z6Var.f45348b, f16, exp, f16);
                                float f17 = z6Var.f45350e;
                                z6Var.f45350e = com.google.android.gms.internal.vision.e2.z(z6Var.f45349c, f17, exp, f17);
                            }
                        }
                    }
                    if (z6Var.f45347a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, z6Var.f45348b - z6Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    s6Var.L = f11;
                    if (z6Var.f45347a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, z6Var.f45349c - z6Var.f45350e));
                    }
                    float c11 = org.telegram.ui.Wallet.s6.c(f12 * 1.5f, -15.0f, 15.0f);
                    float f18 = s6Var.L;
                    float f19 = s6Var.M;
                    float z13 = com.google.android.gms.internal.vision.e2.z(f18, f19, 1.0f, f19);
                    s6Var.M = z13;
                    float f20 = s6Var.N;
                    float z14 = com.google.android.gms.internal.vision.e2.z(c11, f20, 1.0f, f20);
                    s6Var.N = z14;
                    float f21 = s6Var.f45004f0;
                    s6Var.b((z13 * f21) + s6Var.O + s6Var.f45002e0, (z14 * f21) + s6Var.P);
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
