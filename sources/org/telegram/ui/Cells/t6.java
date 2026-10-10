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
import org.telegram.messenger.bi;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.h70;
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
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj;
import org.telegram.ui.sw;
import org.telegram.ui.y30;
import org.telegram.ui.zn;
public final class t6 implements Runnable {
    public final int f23063a;
    public final Object f23064b;

    public t6(Object obj, int i10) {
        this.f23063a = i10;
        this.f23064b = obj;
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
        int i10 = this.f23063a;
        float f12 = 0.0f;
        Object obj = this.f23064b;
        switch (i10) {
            case 0:
                u6 u6Var = (u6) obj;
                u6Var.a();
                RectF rectF = u6Var.f23507f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) obj;
                if (n7Var.f22530b == null) {
                    n7Var.f22530b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f22530b;
                int i11 = n7Var.f22532c + 1;
                n7Var.f22532c = i11;
                jVar.f2601b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) obj;
                RectF rectF2 = w7Var.f23683n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f23688y, 1000L);
                return;
            case 3:
                org.telegram.ui.Components.u7 u7Var = (org.telegram.ui.Components.u7) obj;
                org.telegram.ui.Components.l8 l8Var = u7Var.f31386y;
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
                idVar.f27350f.performHapticFeedback(0);
                Runnable runnable = idVar.f27353j;
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
                    int computeVerticalScrollOffset = hnVar.f27080r.computeVerticalScrollOffset();
                    if (hnVar.f27080r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (gnVar.e() - gnVar.f26800r) + gnVar.f26799n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (hnVar.E - Math.max(0, computeVerticalScrollOffset - hnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((hnVar.f27080r.getMeasuredHeight() - (hnVar.E - computeVerticalScrollOffset)) - hnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > hnVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && hnVar.f27080r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        hnVar.E += f10;
                        hnVar.f27080r.scrollBy(0, i14);
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
                d6 d6Var = loVar.f28447g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!loVar.H && editField != null && loVar.G && !loVar.f28443e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                vu vuVar = avVar.f24637a;
                if (!avVar.f24647y && vuVar != null && avVar.N && !avVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    vuVar.requestFocus();
                    AndroidUtilities.showKeyboard(vuVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    return;
                }
                return;
            case 10:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.z4) obj).d;
                if (mVar.f7951a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7953c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7953c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 11:
                b00 b00Var = (b00) obj;
                if (b00Var.B0.f29820s == null) {
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
                    float f15 = b10Var.f24790p0 + (((float) elapsedRealtime) / 320.0f);
                    b10Var.f24790p0 = f15;
                    b10Var.setAnimationIdicatorProgress(b10Var.f24783i0.getInterpolation(f15));
                    if (b10Var.f24790p0 > 1.0f) {
                        b10Var.f24790p0 = 1.0f;
                    }
                    if (b10Var.f24790p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(b10Var.f24798v0);
                        return;
                    }
                    b10Var.O = false;
                    b10Var.setEnabled(true);
                    v00 v00Var = b10Var.J;
                    if (v00Var != null) {
                        ((sw) v00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f24192t0, 1000L);
                return;
            case 14:
                TextureView textureView = ((m60) obj).H0.f31364q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new as(20, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 15:
                t70 t70Var = (t70) obj;
                u70 u70Var = t70Var.f31043x;
                h70 h70Var = u70Var.V;
                if (h70Var != null && h70Var.getAdapter() != null) {
                    u70Var.V.getClass();
                    int R = RecyclerView.R(t70Var);
                    if (R >= 0) {
                        u70Var.T.v(u70Var.V.T(t70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 16:
                wc0 wc0Var = (wc0) obj;
                ValueAnimator valueAnimator = wc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    wc0Var.h.start();
                    return;
                }
                return;
            case 17:
                ((ue0) obj).e();
                return;
            case 18:
                oj0 oj0Var = (oj0) obj;
                oj0Var.f29507y = true;
                ValueAnimator valueAnimator2 = oj0Var.f29508z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                oj0Var.f29506x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                oj0Var.f29508z = ofFloat;
                ofFloat.addUpdateListener(oj0Var.f29484b0);
                oj0Var.f29508z.setInterpolator(new LinearInterpolator());
                oj0Var.f29508z.setDuration(150L);
                oj0Var.f29508z.start();
                return;
            case 19:
                rm0 rm0Var = (rm0) obj;
                bj bjVar = rm0Var.f30496f2;
                int[] iArr = rm0Var.f30506k2;
                zn znVar = bjVar.d;
                iArr[0] = (int) znVar.f44978s9;
                iArr[1] = znVar.Ba;
                if (rm0Var.f30500h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    rm0Var.M0(0.0f, rm0Var.f30506k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    rm0Var.M0(0.0f, rm0Var.getMeasuredHeight() - rm0Var.f30506k2[1]);
                }
                rm0Var.f30496f2.d.f45034x0.scrollBy(0, dp);
                if (rm0Var.f30498g2) {
                    AndroidUtilities.runOnUIThread(rm0Var.B2);
                    return;
                }
                return;
            case 20:
                yl0 yl0Var = (yl0) obj;
                t6 t6Var3 = yl0Var.f33342i0;
                if (yl0Var.f33346n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                }
                yl0Var.U = false;
                yl0Var.invalidate();
                return;
            case 21:
                tm0 tm0Var = (tm0) obj;
                RecyclerView recyclerView = tm0Var.f31174a;
                if (recyclerView != null) {
                    if (tm0Var.f31179g) {
                        recyclerView.scrollBy(0, -tm0Var.f31180i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (tm0Var.h) {
                        recyclerView.scrollBy(0, tm0Var.f31180i);
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
                    float f16 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f24311b0));
                    scrollSlidingTextTabStrip.S = f16;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f16));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f24314d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    sn0 sn0Var = scrollSlidingTextTabStrip.f24310b;
                    if (sn0Var != null) {
                        sn0Var.u0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ShutterButton shutterButton = (ShutterButton) obj;
                hw0 hw0Var = shutterButton.f24335e;
                if (hw0Var != null) {
                    final im imVar = (im) hw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.f27411e;
                    yi yiVar = chatAttachAlertPhotoLayout.f30211b;
                    sm smVar = chatAttachAlertPhotoLayout.R;
                    int i15 = yiVar.T0;
                    org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33235f0;
                    if ((i15 == 2 || (n2Var instanceof zn)) && !chatAttachAlertPhotoLayout.f24065s0 && !yiVar.V && chatAttachAlertPhotoLayout.P != null && !yiVar.G) {
                        if (n2Var == null) {
                            n2Var = LaunchActivity.R();
                        }
                        if (n2Var != null && n2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f24070w0) {
                                bi.q(R.string.GlobalAttachVideoRestricted, new ad(chatAttachAlertPhotoLayout.P, imVar.f27410c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(is.f27443f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f24063r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                is isVar = is.f27443f;
                                duration2.setInterpolator(isVar).start();
                                chatAttachAlertPhotoLayout.f24061q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(isVar).start();
                                org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f33235f0;
                                if ((n2Var2 instanceof zn) && ((zn) n2Var2).v()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                imVar.f27408a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(smVar, true);
                                smVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f24042g0 = 0;
                                chatAttachAlertPhotoLayout.f24044h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = imVar.f27411e;
                                                if (chatAttachAlertPhotoLayout2.f24044h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24042g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24042g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24044h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(imVar.f27411e.f24044h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = imVar.f27408a;
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
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = imVar.f27411e;
                                                if (chatAttachAlertPhotoLayout2.f24044h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24042g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24042g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24044h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(imVar.f27411e.f24044h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f24050k0.a(iw0.f27463b);
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
                View view = by0Var.f25089s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        by0Var.f25089s.setVisibility(0);
                        by0Var.f25089s.setAlpha(0.0f);
                    }
                    by0Var.f25089s.animate().setListener(null).cancel();
                    by0Var.f25089s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                by0Var.f25084c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 25:
                o91 o91Var = (o91) obj;
                if (o91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f17 = o91Var.f29410f0 + (((float) elapsedRealtime3) / 200.0f);
                    o91Var.f29410f0 = f17;
                    o91Var.setAnimationIdicatorProgress(o91Var.f29401a0.getInterpolation(f17));
                    if (o91Var.f29410f0 > 1.0f) {
                        o91Var.f29410f0 = 1.0f;
                    }
                    if (o91Var.f29410f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(o91Var.f29413i0);
                        return;
                    }
                    o91Var.J = false;
                    o91Var.setEnabled(true);
                    n91 n91Var = o91Var.f29427y;
                    if (n91Var != null) {
                        ((m2.t) n91Var).D(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                y30 y30Var = (y30) obj;
                if (y30Var.f32120b && y30Var.Q0.f37937z0 == null) {
                    y30Var.f32129g0 = false;
                    org.telegram.ui.Components.voip.m0.a(y30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(y30Var.f32130h0, 3000L);
                return;
            case 27:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) obj;
                if (z0Var.d && z0Var.f35774e && z0Var.f35779k != null) {
                    if (SystemClock.elapsedRealtime() - z0Var.f35780l >= 30000) {
                        z0Var.f("heartbeat timed out");
                        return;
                    }
                    z0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - z0Var.f35780l) + " ms ago");
                    z0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.b5 b5Var = (org.telegram.ui.Wallet.b5) obj;
                if (b5Var.f26629a != null && b5Var.d != null) {
                    b5Var.E0();
                    if (b5Var.f34727r) {
                        b5Var.f26629a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.e5 e5Var = (org.telegram.ui.Wallet.e5) obj;
                org.telegram.ui.Wallet.n5 n5Var = e5Var.f34914x;
                if (e5Var.isAttachedToWindow()) {
                    n5Var.b(System.nanoTime());
                    if (n5Var.f35332a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, n5Var.f35333b - n5Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    e5Var.G = f11;
                    if (n5Var.f35332a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, n5Var.f35334c - n5Var.f35335e));
                    }
                    float f18 = e5Var.G;
                    float f19 = e5Var.H;
                    float y3 = com.google.android.gms.internal.vision.e2.y(f18, f19, 1.0f, f19);
                    e5Var.H = y3;
                    float f20 = e5Var.I;
                    float y10 = com.google.android.gms.internal.vision.e2.y(f12, f20, 1.0f, f20);
                    e5Var.I = y10;
                    float f21 = e5Var.U;
                    e5Var.b((y3 * f21) + e5Var.J + e5Var.T, (y10 * f21) + e5Var.K);
                    e5Var.postOnAnimation(this);
                    return;
                }
                return;
        }
    }
}
