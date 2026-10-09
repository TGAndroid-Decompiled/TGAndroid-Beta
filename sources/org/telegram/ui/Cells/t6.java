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
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj;
import org.telegram.ui.sw;
import org.telegram.ui.y30;
import org.telegram.ui.zn;
public final class t6 implements Runnable {
    public final int f23059a;
    public final Object f23060b;

    public t6(Object obj, int i10) {
        this.f23059a = i10;
        this.f23060b = obj;
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
        int i10 = this.f23059a;
        float f12 = 0.0f;
        Object obj = this.f23060b;
        switch (i10) {
            case 0:
                u6 u6Var = (u6) obj;
                u6Var.a();
                RectF rectF = u6Var.f23503f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) obj;
                if (n7Var.f22526b == null) {
                    n7Var.f22526b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f22526b;
                int i11 = n7Var.f22528c + 1;
                n7Var.f22528c = i11;
                jVar.f2601b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) obj;
                RectF rectF2 = w7Var.f23679n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f23684y, 1000L);
                return;
            case 3:
                org.telegram.ui.Components.u7 u7Var = (org.telegram.ui.Components.u7) obj;
                org.telegram.ui.Components.l8 l8Var = u7Var.f31388y;
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
                idVar.f27352f.performHapticFeedback(0);
                Runnable runnable = idVar.f27355j;
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
                    int computeVerticalScrollOffset = hnVar.f27090r.computeVerticalScrollOffset();
                    if (hnVar.f27090r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (gnVar.e() - gnVar.f26810r) + gnVar.f26809n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (hnVar.E - Math.max(0, computeVerticalScrollOffset - hnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((hnVar.f27090r.getMeasuredHeight() - (hnVar.E - computeVerticalScrollOffset)) - hnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > hnVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && hnVar.f27090r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        hnVar.E += f10;
                        hnVar.f27090r.scrollBy(0, i14);
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
                d6 d6Var = loVar.f28508g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!loVar.H && editField != null && loVar.G && !loVar.f28504e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                zu zuVar = (zu) obj;
                t6 t6Var2 = zuVar.P;
                uu uuVar = zuVar.f33649a;
                if (!zuVar.f33659y && uuVar != null && zuVar.N && !zuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    uuVar.requestFocus();
                    AndroidUtilities.showKeyboard(uuVar);
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
                a00 a00Var = (a00) obj;
                if (a00Var.B0.f29542s == null) {
                    a00Var.X1 = false;
                    a00Var.Y();
                    return;
                }
                return;
            case 12:
                a10 a10Var = (a10) obj;
                if (a10Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f15 = a10Var.f24518p0 + (((float) elapsedRealtime) / 320.0f);
                    a10Var.f24518p0 = f15;
                    a10Var.setAnimationIdicatorProgress(a10Var.f24511i0.getInterpolation(f15));
                    if (a10Var.f24518p0 > 1.0f) {
                        a10Var.f24518p0 = 1.0f;
                    }
                    if (a10Var.f24518p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(a10Var.f24526v0);
                        return;
                    }
                    a10Var.O = false;
                    a10Var.setEnabled(true);
                    u00 u00Var = a10Var.J;
                    if (u00Var != null) {
                        ((sw) u00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f24188t0, 1000L);
                return;
            case 14:
                TextureView textureView = ((l60) obj).H0.f31030q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new zr(20, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 15:
                s70 s70Var = (s70) obj;
                t70 t70Var = s70Var.f30712x;
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
                nj0 nj0Var = (nj0) obj;
                nj0Var.f29194y = true;
                ValueAnimator valueAnimator2 = nj0Var.f29195z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                nj0Var.f29193x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                nj0Var.f29195z = ofFloat;
                ofFloat.addUpdateListener(nj0Var.f29171b0);
                nj0Var.f29195z.setInterpolator(new LinearInterpolator());
                nj0Var.f29195z.setDuration(150L);
                nj0Var.f29195z.start();
                return;
            case 19:
                qm0 qm0Var = (qm0) obj;
                bj bjVar = qm0Var.f30201f2;
                int[] iArr = qm0Var.f30211k2;
                zn znVar = bjVar.d;
                iArr[0] = (int) znVar.f44934s9;
                iArr[1] = znVar.Ba;
                if (qm0Var.f30205h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    qm0Var.M0(0.0f, qm0Var.f30211k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    qm0Var.M0(0.0f, qm0Var.getMeasuredHeight() - qm0Var.f30211k2[1]);
                }
                qm0Var.f30201f2.d.f44990x0.scrollBy(0, dp);
                if (qm0Var.f30203g2) {
                    AndroidUtilities.runOnUIThread(qm0Var.B2);
                    return;
                }
                return;
            case 20:
                xl0 xl0Var = (xl0) obj;
                t6 t6Var3 = xl0Var.f32948i0;
                if (xl0Var.f32952n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                }
                xl0Var.U = false;
                xl0Var.invalidate();
                return;
            case 21:
                sm0 sm0Var = (sm0) obj;
                RecyclerView recyclerView = sm0Var.f30845a;
                if (recyclerView != null) {
                    if (sm0Var.f30850g) {
                        recyclerView.scrollBy(0, -sm0Var.f30851i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (sm0Var.h) {
                        recyclerView.scrollBy(0, sm0Var.f30851i);
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
                    float f16 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f24307b0));
                    scrollSlidingTextTabStrip.S = f16;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f16));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f24310d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    rn0 rn0Var = scrollSlidingTextTabStrip.f24306b;
                    if (rn0Var != null) {
                        rn0Var.u0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ShutterButton shutterButton = (ShutterButton) obj;
                gw0 gw0Var = shutterButton.f24331e;
                if (gw0Var != null) {
                    final im imVar = (im) gw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.f27434e;
                    yi yiVar = chatAttachAlertPhotoLayout.f30173b;
                    sm smVar = chatAttachAlertPhotoLayout.R;
                    int i15 = yiVar.T0;
                    org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33228f0;
                    if ((i15 == 2 || (n2Var instanceof zn)) && !chatAttachAlertPhotoLayout.f24061s0 && !yiVar.V && chatAttachAlertPhotoLayout.P != null && !yiVar.G) {
                        if (n2Var == null) {
                            n2Var = LaunchActivity.R();
                        }
                        if (n2Var != null && n2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f24066w0) {
                                bi.q(R.string.GlobalAttachVideoRestricted, new ad(chatAttachAlertPhotoLayout.P, imVar.f27433c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(hs.f27118f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f24059r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                hs hsVar = hs.f27118f;
                                duration2.setInterpolator(hsVar).start();
                                chatAttachAlertPhotoLayout.f24057q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(hsVar).start();
                                org.telegram.ui.ActionBar.n2 n2Var2 = yiVar.f33228f0;
                                if ((n2Var2 instanceof zn) && ((zn) n2Var2).v()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                imVar.f27431a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(smVar, true);
                                smVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f24038g0 = 0;
                                chatAttachAlertPhotoLayout.f24040h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = imVar.f27434e;
                                                if (chatAttachAlertPhotoLayout2.f24040h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24038g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24038g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24040h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(imVar.f27434e.f24040h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = imVar.f27431a;
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
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = imVar.f27434e;
                                                if (chatAttachAlertPhotoLayout2.f24040h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24038g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24038g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24040h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(imVar.f27434e.f24040h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f24046k0.a(hw0.f27146b);
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
                ay0 ay0Var = (ay0) obj;
                View view = ay0Var.f24806s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        ay0Var.f24806s.setVisibility(0);
                        ay0Var.f24806s.setAlpha(0.0f);
                    }
                    ay0Var.f24806s.animate().setListener(null).cancel();
                    ay0Var.f24806s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                ay0Var.f24801c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 25:
                n91 n91Var = (n91) obj;
                if (n91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f17 = n91Var.f29105f0 + (((float) elapsedRealtime3) / 200.0f);
                    n91Var.f29105f0 = f17;
                    n91Var.setAnimationIdicatorProgress(n91Var.f29096a0.getInterpolation(f17));
                    if (n91Var.f29105f0 > 1.0f) {
                        n91Var.f29105f0 = 1.0f;
                    }
                    if (n91Var.f29105f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(n91Var.f29108i0);
                        return;
                    }
                    n91Var.J = false;
                    n91Var.setEnabled(true);
                    m91 m91Var = n91Var.f29122y;
                    if (m91Var != null) {
                        ((m2.t) m91Var).D(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                y30 y30Var = (y30) obj;
                if (y30Var.f32055b && y30Var.Q0.f37893z0 == null) {
                    y30Var.f32064g0 = false;
                    org.telegram.ui.Components.voip.m0.a(y30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(y30Var.f32065h0, 3000L);
                return;
            case 27:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) obj;
                if (z0Var.d && z0Var.f35709e && z0Var.f35714k != null) {
                    if (SystemClock.elapsedRealtime() - z0Var.f35715l >= 30000) {
                        z0Var.f("heartbeat timed out");
                        return;
                    }
                    z0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - z0Var.f35715l) + " ms ago");
                    z0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) obj;
                if (a5Var.f26290a != null && a5Var.d != null) {
                    a5Var.E0();
                    if (a5Var.f34636r) {
                        a5Var.f26290a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.d5 d5Var = (org.telegram.ui.Wallet.d5) obj;
                org.telegram.ui.Wallet.m5 m5Var = d5Var.f34823x;
                if (d5Var.isAttachedToWindow()) {
                    m5Var.b(System.nanoTime());
                    if (m5Var.f35239a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, m5Var.f35240b - m5Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    d5Var.G = f11;
                    if (m5Var.f35239a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, m5Var.f35241c - m5Var.f35242e));
                    }
                    float f18 = d5Var.G;
                    float f19 = d5Var.H;
                    float y3 = com.google.android.gms.internal.vision.e2.y(f18, f19, 1.0f, f19);
                    d5Var.H = y3;
                    float f20 = d5Var.I;
                    float y10 = com.google.android.gms.internal.vision.e2.y(f12, f20, 1.0f, f20);
                    d5Var.I = y10;
                    float f21 = d5Var.U;
                    d5Var.b((y3 * f21) + d5Var.J + d5Var.T, (y10 * f21) + d5Var.K);
                    d5Var.postOnAnimation(this);
                    return;
                }
                return;
        }
    }
}
