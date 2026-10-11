package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.ai;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj;
import org.telegram.ui.rw;
import org.telegram.ui.y30;
import org.telegram.ui.zn;
public final class t6 implements Runnable {
    public final int f23087a;
    public final Object f23088b;

    public t6(Object obj, int i10) {
        this.f23087a = i10;
        this.f23088b = obj;
    }

    @Override
    public final void run() {
        long j3;
        float f7;
        boolean z10;
        float f10;
        int dp;
        boolean z11;
        boolean z12;
        float f11;
        int i10 = this.f23087a;
        float f12 = 0.0f;
        Object obj = this.f23088b;
        switch (i10) {
            case 0:
                u6 u6Var = (u6) obj;
                u6Var.a();
                RectF rectF = u6Var.f23531f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) obj;
                if (n7Var.f22554b == null) {
                    n7Var.f22554b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f22554b;
                int i11 = n7Var.f22556c + 1;
                n7Var.f22556c = i11;
                jVar.f2601b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) obj;
                RectF rectF2 = w7Var.f23707n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f23712y, 1000L);
                return;
            case 3:
                org.telegram.ui.Components.u7 u7Var = (org.telegram.ui.Components.u7) obj;
                org.telegram.ui.Components.l8 l8Var = u7Var.f31461y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i12 = l8Var.J0 + 1;
                    l8Var.J0 = i12;
                    if (i12 == 1) {
                        u7Var.v = true;
                        l8Var.H0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            l8Var.D0();
                        } else if (l8Var.H0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(l8Var.N0);
                            l8Var.L0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    } else if (i12 == 2) {
                        MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    } else {
                        MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.Components.l8 l8Var2 = (org.telegram.ui.Components.l8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f13 = l8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - l8Var2.K0;
                    l8Var2.K0 = currentTimeMillis;
                    long j11 = currentTimeMillis - l8Var2.L0;
                    int i13 = l8Var2.J0;
                    if (i13 == 1) {
                        j3 = 3;
                    } else if (i13 == 2) {
                        j3 = 6;
                    } else {
                        j3 = 12;
                    }
                    float f14 = ((f13 * f7) + ((float) ((j3 * j10) - j10))) / ((float) duration);
                    if (f14 < 0.0f) {
                        f14 = 0.0f;
                    }
                    l8Var2.I0 = f14;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = l8Var2.I0;
                        }
                        l8Var2.G0(playingMessageObject, false);
                    }
                    if (l8Var2.H0 == 1 && l8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j11 > 200 || l8Var2.I0 == 0.0f) {
                            l8Var2.L0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f14);
                        }
                        if (l8Var2.J0 > 0 && l8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(l8Var2.N0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                l8Var2.K0 = System.currentTimeMillis();
                return;
            case 5:
                id idVar = (id) obj;
                idVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                idVar.f27419f.performHapticFeedback(0);
                Runnable runnable = idVar.f27422j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                rk rkVar = (rk) obj;
                if (rkVar.S) {
                    rkVar.N.clear();
                    rkVar.P.clear();
                    rkVar.Q.clear();
                    rkVar.l();
                    return;
                }
                return;
            case 7:
                gn gnVar = (gn) obj;
                hn hnVar = gnVar.P;
                if (hnVar.J != null && !hnVar.K) {
                    int computeVerticalScrollOffset = hnVar.f27170r.computeVerticalScrollOffset();
                    if (hnVar.f27170r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (gnVar.e() - gnVar.f26829r) + gnVar.f26828n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (hnVar.E - Math.max(0, computeVerticalScrollOffset - hnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((hnVar.f27170r.getMeasuredHeight() - (hnVar.E - computeVerticalScrollOffset)) - hnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > hnVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && hnVar.f27170r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        hnVar.E += f10;
                        hnVar.f27170r.scrollBy(0, i14);
                        gnVar.invalidate();
                    }
                    gnVar.L = true;
                    gnVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 8:
                lo loVar = (lo) obj;
                t6 t6Var = loVar.U0;
                d6 d6Var = loVar.f28523g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!loVar.H && editField != null && loVar.G && !loVar.f28519e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        AndroidUtilities.runOnUIThread(t6Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                av avVar = (av) obj;
                t6 t6Var2 = avVar.P;
                vu vuVar = avVar.f24679a;
                if (!avVar.f24689y && vuVar != null && avVar.N && !avVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    vuVar.requestFocus();
                    AndroidUtilities.showKeyboard(vuVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    return;
                }
                return;
            case 10:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.z4) obj).d;
                if (mVar.f7950a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7952c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7952c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 11:
                b00 b00Var = (b00) obj;
                if (b00Var.B0.f29923s == null) {
                    b00Var.X1 = false;
                    b00Var.Y();
                    return;
                }
                return;
            case 12:
                b10 b10Var = (b10) obj;
                if (b10Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f15 = b10Var.f24832p0 + (((float) elapsedRealtime) / 320.0f);
                    b10Var.f24832p0 = f15;
                    b10Var.setAnimationIdicatorProgress(b10Var.f24825i0.getInterpolation(f15));
                    if (b10Var.f24832p0 > 1.0f) {
                        b10Var.f24832p0 = 1.0f;
                    }
                    if (b10Var.f24832p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(b10Var.f24840v0);
                        return;
                    }
                    b10Var.O = false;
                    b10Var.setEnabled(true);
                    v00 v00Var = b10Var.J;
                    if (v00Var != null) {
                        ((rw) v00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f24216t0, 1000L);
                return;
            case 14:
                TextureView textureView = ((m60) obj).H0.f31110q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new bs(19, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 15:
                s70 s70Var = (s70) obj;
                t70 t70Var = s70Var.f30786x;
                g70 g70Var = t70Var.V;
                if (g70Var != null && g70Var.getAdapter() != null) {
                    t70Var.V.getClass();
                    int R = RecyclerView.R(s70Var);
                    if (R >= 0) {
                        t70Var.T.v(t70Var.V.T(s70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 16:
                vc0 vc0Var = (vc0) obj;
                ValueAnimator valueAnimator = vc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    vc0Var.h.start();
                    return;
                }
                return;
            case 17:
                ((te0) obj).e();
                return;
            case 18:
                oj0 oj0Var = (oj0) obj;
                oj0Var.f29539y = true;
                ValueAnimator valueAnimator2 = oj0Var.f29540z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                oj0Var.f29538x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                oj0Var.f29540z = ofFloat;
                ofFloat.addUpdateListener(oj0Var.f29516b0);
                oj0Var.f29540z.setInterpolator(new LinearInterpolator());
                oj0Var.f29540z.setDuration(150L);
                oj0Var.f29540z.start();
                return;
            case 19:
                rm0 rm0Var = (rm0) obj;
                bj bjVar = rm0Var.f30555f2;
                int[] iArr = rm0Var.f30565k2;
                zn znVar = bjVar.d;
                iArr[0] = (int) znVar.f44967s9;
                iArr[1] = znVar.Ba;
                if (rm0Var.f30559h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    rm0Var.M0(0.0f, rm0Var.f30565k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    rm0Var.M0(0.0f, rm0Var.getMeasuredHeight() - rm0Var.f30565k2[1]);
                }
                rm0Var.f30555f2.d.f45023x0.scrollBy(0, dp);
                if (rm0Var.f30557g2) {
                    AndroidUtilities.runOnUIThread(rm0Var.B2);
                    return;
                }
                return;
            case 20:
                yl0 yl0Var = (yl0) obj;
                t6 t6Var3 = yl0Var.f33396i0;
                if (yl0Var.f33400n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                }
                yl0Var.U = false;
                yl0Var.invalidate();
                return;
            case 21:
                tm0 tm0Var = (tm0) obj;
                RecyclerView recyclerView = tm0Var.f31293a;
                if (recyclerView != null) {
                    if (tm0Var.f31298g) {
                        recyclerView.scrollBy(0, -tm0Var.f31299i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (tm0Var.h) {
                        recyclerView.scrollBy(0, tm0Var.f31299i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f16 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f24335b0));
                    scrollSlidingTextTabStrip.S = f16;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f16));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f24338d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    sn0 sn0Var = scrollSlidingTextTabStrip.f24334b;
                    if (sn0Var != null) {
                        sn0Var.u0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ShutterButton shutterButton = (ShutterButton) obj;
                hw0 hw0Var = shutterButton.f24359e;
                if (hw0Var != null) {
                    final im imVar = (im) hw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.f27468e;
                    yi yiVar = chatAttachAlertPhotoLayout.f30245b;
                    sm smVar = chatAttachAlertPhotoLayout.R;
                    int i15 = yiVar.T0;
                    org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
                    if ((i15 == 2 || (m2Var instanceof zn)) && !chatAttachAlertPhotoLayout.f24089s0 && !yiVar.V && chatAttachAlertPhotoLayout.P != null && !yiVar.G) {
                        if (m2Var == null) {
                            m2Var = LaunchActivity.R();
                        }
                        if (m2Var != null && m2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f24094w0) {
                                ai.q(R.string.GlobalAttachVideoRestricted, new ad(chatAttachAlertPhotoLayout.P, imVar.f27467c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                m2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(is.f27500f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f24087r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                is isVar = is.f27500f;
                                duration2.setInterpolator(isVar).start();
                                chatAttachAlertPhotoLayout.f24085q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(isVar).start();
                                org.telegram.ui.ActionBar.m2 m2Var2 = yiVar.f33289f0;
                                if ((m2Var2 instanceof zn) && ((zn) m2Var2).v()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                imVar.f27465a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(smVar, true);
                                smVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f24066g0 = 0;
                                chatAttachAlertPhotoLayout.f24068h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = imVar.f27468e;
                                                if (chatAttachAlertPhotoLayout2.f24068h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24066g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24066g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24068h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(imVar.f27468e.f24068h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(m2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = imVar.f27465a;
                                if (yiVar.T0 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new org.telegram.ui.Components.s(imVar, 21), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = imVar.f27468e;
                                                if (chatAttachAlertPhotoLayout2.f24068h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24066g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24066g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24068h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(imVar.f27468e.f24068h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f24074k0.a(iw0.f27520b);
                                chatAttachAlertPhotoLayout.P.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.v = false;
                    return;
                }
                return;
            case 24:
                by0 by0Var = (by0) obj;
                View view = by0Var.f25127s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        by0Var.f25127s.setVisibility(0);
                        by0Var.f25127s.setAlpha(0.0f);
                    }
                    by0Var.f25127s.animate().setListener(null).cancel();
                    by0Var.f25127s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                by0Var.f25122c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 25:
                o91 o91Var = (o91) obj;
                if (o91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f17 = o91Var.f29440f0 + (((float) elapsedRealtime3) / 200.0f);
                    o91Var.f29440f0 = f17;
                    o91Var.setAnimationIdicatorProgress(o91Var.f29431a0.getInterpolation(f17));
                    if (o91Var.f29440f0 > 1.0f) {
                        o91Var.f29440f0 = 1.0f;
                    }
                    if (o91Var.f29440f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(o91Var.f29443i0);
                        return;
                    }
                    o91Var.J = false;
                    o91Var.setEnabled(true);
                    n91 n91Var = o91Var.f29457y;
                    if (n91Var != null) {
                        ((m2.t) n91Var).D(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                y30 y30Var = (y30) obj;
                if (y30Var.f32178b && y30Var.Q0.f38007z0 == null) {
                    y30Var.f32187g0 = false;
                    org.telegram.ui.Components.voip.n0.a(y30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(y30Var.f32188h0, 3000L);
                return;
            case 27:
                org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) obj;
                if (a1Var.d && a1Var.f34671e && a1Var.f34676k != null) {
                    if (SystemClock.elapsedRealtime() - a1Var.f34677l >= 30000) {
                        a1Var.f("heartbeat timed out");
                        return;
                    }
                    a1Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - a1Var.f34677l) + " ms ago");
                    a1Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) obj;
                if (c5Var.f26675a != null && c5Var.d != null) {
                    c5Var.E0();
                    if (c5Var.f34792r) {
                        c5Var.f26675a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.f5 f5Var = (org.telegram.ui.Wallet.f5) obj;
                org.telegram.ui.Wallet.o5 o5Var = f5Var.f34980x;
                if (f5Var.isAttachedToWindow()) {
                    o5Var.b(System.nanoTime());
                    if (o5Var.f35396a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, o5Var.f35397b - o5Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    f5Var.G = f11;
                    if (o5Var.f35396a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, o5Var.f35398c - o5Var.f35399e));
                    }
                    float f18 = f5Var.G;
                    float f19 = f5Var.H;
                    float y3 = com.google.android.gms.internal.vision.e2.y(f18, f19, 1.0f, f19);
                    f5Var.H = y3;
                    float f20 = f5Var.I;
                    float y10 = com.google.android.gms.internal.vision.e2.y(f12, f20, 1.0f, f20);
                    f5Var.I = y10;
                    float f21 = f5Var.U;
                    f5Var.b((y3 * f21) + f5Var.J + f5Var.T, (y10 * f21) + f5Var.K);
                    f5Var.postOnAnimation(this);
                    return;
                }
                return;
        }
    }
}
