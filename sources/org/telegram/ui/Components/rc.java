package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.webrtc.VideoFrame;
public final class rc implements Runnable {
    public final int f39269a;
    public final Object f39270b;

    public rc(Object obj, int i7) {
        this.f39269a = i7;
        this.f39270b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        float f10;
        int L;
        boolean z11;
        boolean z12;
        ac0 ac0Var;
        long j3;
        org.telegram.ui.mq0 mq0Var;
        float f11;
        long j10;
        int i7 = this.f39269a;
        hi.o7 o7Var = null;
        boolean z13 = true;
        Object obj = this.f39270b;
        switch (i7) {
            case 0:
                tc tcVar = (tc) obj;
                tcVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                tcVar.f39897f.performHapticFeedback(0);
                Runnable runnable = tcVar.f39900j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                jk jkVar = (jk) obj;
                if (jkVar.T) {
                    jkVar.O.clear();
                    jkVar.Q.clear();
                    jkVar.R.clear();
                    jkVar.f();
                    return;
                }
                return;
            case 2:
                om omVar = (om) obj;
                pm pmVar = omVar.Q;
                if (pmVar.K != null && !pmVar.L) {
                    int computeVerticalScrollOffset = pmVar.f38510r.computeVerticalScrollOffset();
                    if (pmVar.f38510r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (omVar.e() - omVar.f38213r) + omVar.f38212n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (pmVar.F - Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
                    float max2 = Math.max(0.0f, ((pmVar.f38510r.getMeasuredHeight() - (pmVar.F - computeVerticalScrollOffset)) - pmVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
                    float L2 = org.telegram.messenger.g0.L(32.0f);
                    if (max < L2 && computeVerticalScrollOffset > pmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / L2))) * org.telegram.messenger.g0.L(6.0f);
                    } else if (max2 < L2) {
                        f10 = org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i10 = (int) f10;
                    if (Math.abs(i10) > 0 && pmVar.f38510r.canScrollVertically(i10) && (f10 <= 0.0f || !z10)) {
                        pmVar.F += f10;
                        pmVar.f38510r.scrollBy(0, i10);
                        omVar.invalidate();
                    }
                    omVar.M = true;
                    omVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 3:
                qn qnVar = (qn) obj;
                rc rcVar = qnVar.V0;
                org.telegram.ui.Cells.a6 a6Var = qnVar.f38924h1;
                if (a6Var != null) {
                    EditTextBoldCursor editField = a6Var.getEditField();
                    if (!qnVar.I && editField != null && qnVar.H && !qnVar.f38920f1 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.I3(editField);
                        org.telegram.messenger.g0.r(rcVar);
                        org.telegram.messenger.g0.h3(rcVar, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                wt wtVar = (wt) obj;
                rc rcVar2 = wtVar.Q;
                rt rtVar = wtVar.f41719a;
                if (!wtVar.E && rtVar != null && wtVar.O && !wtVar.f41727w && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                    rtVar.requestFocus();
                    org.telegram.messenger.g0.I3(rtVar);
                    org.telegram.messenger.g0.r(rcVar2);
                    org.telegram.messenger.g0.h3(rcVar2, 100L);
                    return;
                }
                return;
            case 5:
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
            case 6:
                qy qyVar = (qy) obj;
                if (qyVar.C0.f35493s == null) {
                    qyVar.Y1 = false;
                    qyVar.Z();
                    return;
                }
                return;
            case 7:
                oz ozVar = (oz) obj;
                if (ozVar.P) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f12 = ozVar.f38310q0 + (((float) elapsedRealtime) / 320.0f);
                    ozVar.f38310q0 = f12;
                    ozVar.setAnimationIdicatorProgress(ozVar.f38303j0.getInterpolation(f12));
                    if (ozVar.f38310q0 > 1.0f) {
                        ozVar.f38310q0 = 1.0f;
                    }
                    if (ozVar.f38310q0 < 1.0f) {
                        org.telegram.messenger.g0.g3(ozVar.f38319w0);
                        return;
                    }
                    ozVar.P = false;
                    ozVar.setEnabled(true);
                    kz kzVar = ozVar.K;
                    if (kzVar != null) {
                        ((org.telegram.ui.sw) kzVar).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.X0;
                fragmentContextView.f();
                org.telegram.messenger.g0.h3(fragmentContextView.f33079u0, 1000L);
                return;
            case 9:
                TextureView textureView = ((r40) obj).I0.f42686q0;
                if (textureView != null) {
                    try {
                        org.telegram.messenger.g0.g3(new bt(16, this, textureView.getBitmap(org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f))));
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 10:
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
            case 11:
                ta0 ta0Var = (ta0) obj;
                ValueAnimator valueAnimator = ta0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ta0Var.h.start();
                    return;
                }
                return;
            case 12:
                cc0 cc0Var = (cc0) obj;
                if (cc0Var.f34021n && cc0Var.isAttachedToWindow()) {
                    cc0Var.d();
                    cc0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 13:
                ((oc0) obj).e();
                return;
            case 14:
                yg0 yg0Var = (yg0) obj;
                yg0Var.f42485y = true;
                ValueAnimator valueAnimator2 = yg0Var.f42486z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                yg0Var.f42484x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                yg0Var.f42486z = ofFloat;
                ofFloat.addUpdateListener(yg0Var.f42462b0);
                yg0Var.f42486z.setInterpolator(new LinearInterpolator());
                yg0Var.f42486z.setDuration(150L);
                yg0Var.f42486z.start();
                return;
            case 15:
                ek0 ek0Var = (ek0) obj;
                m.b3 b3Var = ek0Var.f34753g2;
                int[] iArr = ek0Var.f34762l2;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) b3Var.d;
                iArr[0] = (int) bnVar.P9;
                iArr[1] = bnVar.Ya;
                if (ek0Var.f34757i2) {
                    L = -org.telegram.messenger.g0.L(12.0f);
                    ek0Var.M0(0.0f, ek0Var.f34762l2[0]);
                } else {
                    L = org.telegram.messenger.g0.L(12.0f);
                    ek0Var.M0(0.0f, ek0Var.getMeasuredHeight() - ek0Var.f34762l2[1]);
                }
                ((org.telegram.ui.bn) ek0Var.f34753g2.d).A0.scrollBy(0, L);
                if (ek0Var.f34755h2) {
                    org.telegram.messenger.g0.g3(ek0Var.D2);
                    return;
                }
                return;
            case 16:
                jj0 jj0Var = (jj0) obj;
                rc rcVar3 = jj0Var.f36437j0;
                if (jj0Var.f36440n) {
                    org.telegram.messenger.g0.r(rcVar3);
                    org.telegram.messenger.g0.h3(rcVar3, 4000L);
                    return;
                }
                jj0Var.V = false;
                jj0Var.invalidate();
                return;
            case 17:
                ik0 ik0Var = (ik0) obj;
                RecyclerView recyclerView = ik0Var.f36040a;
                if (recyclerView != null) {
                    if (ik0Var.f36045g) {
                        recyclerView.scrollBy(0, -ik0Var.f36046i);
                        org.telegram.messenger.g0.g3(this);
                        return;
                    } else if (ik0Var.h) {
                        recyclerView.scrollBy(0, ik0Var.f36046i);
                        org.telegram.messenger.g0.g3(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 18:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.I) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f13 = scrollSlidingTextTabStrip.T + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f33202c0));
                    scrollSlidingTextTabStrip.T = f13;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.O.getInterpolation(f13));
                    if (scrollSlidingTextTabStrip.T > 1.0f) {
                        scrollSlidingTextTabStrip.T = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.T < 1.0f) {
                        org.telegram.messenger.g0.g3(scrollSlidingTextTabStrip.f33205e0);
                        return;
                    }
                    scrollSlidingTextTabStrip.I = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    jl0 jl0Var = scrollSlidingTextTabStrip.f33199b;
                    if (jl0Var != null) {
                        jl0Var.c(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ShutterButton shutterButton = (ShutterButton) obj;
                mt0 mt0Var = shutterButton.f33225e;
                if (mt0Var != null) {
                    final vl vlVar = (vl) mt0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vlVar.f40735e;
                    ti tiVar = chatAttachAlertPhotoLayout.f37135b;
                    cm cmVar = chatAttachAlertPhotoLayout.S;
                    int i11 = tiVar.O2;
                    org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
                    if ((i11 == 2 || (g2Var instanceof org.telegram.ui.bn)) && !chatAttachAlertPhotoLayout.f32903t0 && !tiVar.Q1 && chatAttachAlertPhotoLayout.Q != null && !tiVar.B1) {
                        if (g2Var == null) {
                            g2Var = LaunchActivity.Q();
                        }
                        if (g2Var != null && g2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f32909x0) {
                                org.telegram.messenger.f3.o(null, 2131749362, new kc(chatAttachAlertPhotoLayout.Q, vlVar.f40734c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.R0 = true;
                                g2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    chatAttachAlertPhotoLayout.T[i12].animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(30.0f)).setDuration(150L).setInterpolator(kr.f36858f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f32902s0.animate().alpha(0.0f).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
                                kr krVar = kr.f36858f;
                                duration.setInterpolator(krVar).start();
                                chatAttachAlertPhotoLayout.f32900r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(krVar).start();
                                org.telegram.ui.ActionBar.g2 g2Var2 = tiVar.f39956a2;
                                if ((g2Var2 instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var2).y()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                vlVar.f40732a = org.telegram.messenger.g0.s0(z11);
                                org.telegram.messenger.g0.V3(cmVar, true);
                                cmVar.setText(org.telegram.messenger.g0.g0(0, true, false));
                                chatAttachAlertPhotoLayout.f32881h0 = 0;
                                chatAttachAlertPhotoLayout.f32883i0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = vlVar.f40735e;
                                                if (chatAttachAlertPhotoLayout2.f32883i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f32881h0 + 1;
                                                    chatAttachAlertPhotoLayout2.f32881h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.h3(chatAttachAlertPhotoLayout2.f32883i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.h3(vlVar.f40735e.f32883i0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                org.telegram.messenger.g0.f2(g2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.Q.getCameraSessionObject();
                                File file = vlVar.f40732a;
                                if (tiVar.O2 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new b0(vlVar, 20), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = vlVar.f40735e;
                                                if (chatAttachAlertPhotoLayout2.f32883i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.f32881h0 + 1;
                                                    chatAttachAlertPhotoLayout2.f32881h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(org.telegram.messenger.g0.g0(i13, true, false));
                                                    org.telegram.messenger.g0.h3(chatAttachAlertPhotoLayout2.f32883i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.messenger.g0.h3(vlVar.f40735e.f32883i0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.Q);
                                chatAttachAlertPhotoLayout.f32889l0.a(nt0.f37910b);
                                chatAttachAlertPhotoLayout.Q.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.f33230w = false;
                    return;
                }
                return;
            case 20:
                mv0 mv0Var = (mv0) obj;
                View view = mv0Var.f37557s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        mv0Var.f37557s.setVisibility(0);
                        mv0Var.f37557s.setAlpha(0.0f);
                    }
                    mv0Var.f37557s.animate().setListener(null).cancel();
                    mv0Var.f37557s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                mv0Var.f37552c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 21:
                ((ThemeEditorView) obj).f33245a = false;
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
            case 22:
                j61 j61Var = (j61) obj;
                if (j61Var.d && (ac0Var = j61Var.f36312f) != null && ac0Var.isAttachedToWindow()) {
                    PhotoViewer photoViewer = j61Var.f36308a.f47939a;
                    h61 h61Var = photoViewer.G2;
                    if (h61Var != null) {
                        j3 = h61Var.S();
                    } else {
                        j3 = 0;
                    }
                    hi.r7 r7Var = j61Var.f36309b;
                    if (r7Var != null && r7Var.f15312o && !r7Var.h && !r7Var.e(hi.r7.a(j3))) {
                        r7Var.f();
                    }
                    if (j61Var.f36313g != null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 < j61Var.f36313g.size()) {
                                hi.o7 o7Var2 = (hi.o7) j61Var.f36313g.get(i13);
                                if (j3 >= o7Var2.f15159a && j3 < o7Var2.f15160b) {
                                    o7Var = o7Var2;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                    z13 = (o7Var == null || TextUtils.isEmpty(o7Var.f15161c)) ? false : false;
                    if (z13) {
                        if (o7Var != j61Var.h || !TextUtils.equals(o7Var.f15161c, j61Var.f36312f.getText())) {
                            j61Var.h = o7Var;
                            j61Var.f36312f.setText(o7Var.f15161c);
                        }
                        j61Var.f36312f.setSpokenWords(o7Var.d);
                        j61Var.f36312f.A(j3);
                    }
                    if (z13 != j61Var.f36314i) {
                        j61Var.f36314i = z13;
                        j61Var.f36312f.animate().cancel();
                        ViewPropertyAnimator animate = j61Var.f36312f.animate();
                        if (z13) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ViewPropertyAnimator alpha = animate.alpha(f11);
                        if (z13) {
                            j10 = 120;
                        } else {
                            j10 = 180;
                        }
                        alpha.setDuration(j10).start();
                    }
                    float height = (photoViewer.f43334f0.getHeight() - photoViewer.f43457t2.bottom) - org.telegram.messenger.g0.L(8.0f);
                    org.telegram.ui.cr0 cr0Var = photoViewer.f43363i3;
                    if (cr0Var != null && cr0Var.getVisibility() == 0) {
                        height = org.telegram.messenger.g0.T1(height, Math.min(height, photoViewer.f43363i3.getY()), Utilities.i(photoViewer.f43363i3.getAlpha(), 1.0f, 0.0f));
                    }
                    org.telegram.ui.wp0 wp0Var = photoViewer.U1;
                    if (wp0Var != null && photoViewer.f43283a2 != null && wp0Var.getVisibility() == 0 && (mq0Var = photoViewer.R1) != null && mq0Var.getVisibility() == 0) {
                        height = org.telegram.messenger.g0.T1(height, Math.min(height, photoViewer.R1.getTranslationY() + ((photoViewer.U1.getY() + photoViewer.f43283a2.getTop()) - photoViewer.U1.getScrollY())), Utilities.i(photoViewer.U1.getAlpha(), 1.0f, 0.0f));
                    }
                    float L3 = (height - org.telegram.messenger.g0.L(8.0f)) - j61Var.f36312f.getHeight();
                    if (j61Var.f36312f.getTranslationY() != L3) {
                        j61Var.f36312f.setTranslationY(L3);
                    }
                    j61Var.f36312f.postOnAnimation(this);
                    return;
                }
                return;
            case 23:
                j71 j71Var = (j71) obj;
                if (j71Var.K) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f14 = j71Var.f36333g0 + (((float) elapsedRealtime3) / 200.0f);
                    j71Var.f36333g0 = f14;
                    j71Var.setAnimationIdicatorProgress(j71Var.f36325b0.getInterpolation(f14));
                    if (j71Var.f36333g0 > 1.0f) {
                        j71Var.f36333g0 = 1.0f;
                    }
                    if (j71Var.f36333g0 < 1.0f) {
                        org.telegram.messenger.g0.g3(j71Var.f36336j0);
                        return;
                    }
                    j71Var.K = false;
                    j71Var.setEnabled(true);
                    i71 i71Var = j71Var.E;
                    if (i71Var != null) {
                        i71Var.c(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) obj;
                if (b0Var.f40789w) {
                    b0Var.j(false);
                    org.telegram.messenger.g0.h3(this, 250L);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.a20 a20Var = (org.telegram.ui.a20) obj;
                if (a20Var.f41003b && a20Var.R0.f47405u2 == null) {
                    a20Var.f41013h0 = false;
                    org.telegram.ui.Components.voip.l0.a(a20Var);
                    return;
                }
                org.telegram.messenger.g0.h3(a20Var.f41014i0, 3000L);
                return;
            case 26:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                org.telegram.ui.Components.voip.u0 u0Var = k1Var.f40993e;
                if (u0Var != null) {
                    if (!k1Var.f40991b.a(k1Var.f40997s)) {
                        if (k1Var.h == null) {
                            k1Var.h = new org.telegram.ui.Components.voip.i1();
                        }
                        VideoFrame videoFrame = k1Var.h.f40932b;
                        if (videoFrame != null) {
                            u0Var.onFrame(videoFrame);
                        }
                    }
                    org.telegram.messenger.g0.h3(this, 500L);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                j1Var.a();
                if (j1Var.f40951b) {
                    org.telegram.messenger.g0.h3(this, 500L);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.voip.j2 j2Var = (org.telegram.ui.Components.voip.j2) obj;
                org.telegram.ui.Components.voip.m mVar = j2Var.f40956b;
                if (mVar != null) {
                    mVar.b();
                }
                long c10 = org.telegram.ui.Components.voip.g.c();
                boolean a10 = org.telegram.ui.Components.voip.m.a(VoIPService.getSharedInstance());
                if (c10 != j2Var.f40957c || a10 != j2Var.d) {
                    j2Var.f40957c = c10;
                    j2Var.d = a10;
                    wi.n nVar = j2Var.f40955a;
                    if (nVar != null) {
                        nVar.c();
                    }
                }
                org.telegram.messenger.g0.h3(this, 500L);
                return;
            default:
                org.telegram.ui.Wallet.j1 j1Var2 = (org.telegram.ui.Wallet.j1) obj;
                if (j1Var2.d && j1Var2.f44502e && j1Var2.f44507k != null) {
                    if (SystemClock.elapsedRealtime() - j1Var2.f44508l >= 30000) {
                        j1Var2.f("heartbeat timed out");
                        return;
                    }
                    j1Var2.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - j1Var2.f44508l) + " ms ago");
                    j1Var2.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    org.telegram.messenger.g0.h3(this, 15000L);
                    return;
                }
                return;
        }
    }
}
