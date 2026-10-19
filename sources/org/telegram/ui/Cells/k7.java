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
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.lk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bw;
import org.telegram.ui.h30;
import org.telegram.ui.qn;
import org.telegram.ui.si;
public final class k7 implements Runnable {
    public final int f22510a;
    public final Object f22511b;

    public k7(Object obj, int i10) {
        this.f22510a = i10;
        this.f22511b = obj;
    }

    @Override
    public final void run() {
        long j10;
        float f7;
        boolean z10;
        float f10;
        int dp;
        boolean z11;
        boolean z12;
        float f11;
        int i10 = this.f22510a;
        float f12 = 0.0f;
        Object obj = this.f22511b;
        switch (i10) {
            case 0:
                m7 m7Var = (m7) obj;
                if (m7Var.f22588b == null) {
                    m7Var.f22588b = new androidx.emoji2.text.j(m7Var, 4);
                }
                androidx.emoji2.text.j jVar = m7Var.f22588b;
                int i11 = m7Var.f22590c + 1;
                m7Var.f22590c = i11;
                jVar.f3101b = i11;
                m7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 1:
                v7 v7Var = (v7) obj;
                RectF rectF = v7Var.f23645n;
                v7Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(v7Var.f23650y, 1000L);
                return;
            case 2:
                org.telegram.ui.Components.t7 t7Var = (org.telegram.ui.Components.t7) obj;
                org.telegram.ui.Components.k8 k8Var = t7Var.f30447y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i12 = k8Var.J0 + 1;
                    k8Var.J0 = i12;
                    if (i12 == 1) {
                        t7Var.v = true;
                        k8Var.H0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            k8Var.D0();
                        } else if (k8Var.H0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(k8Var.N0);
                            k8Var.L0 = 0L;
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
            case 3:
                org.telegram.ui.Components.k8 k8Var2 = (org.telegram.ui.Components.k8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f13 = k8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - k8Var2.K0;
                    k8Var2.K0 = currentTimeMillis;
                    long j12 = currentTimeMillis - k8Var2.L0;
                    int i13 = k8Var2.J0;
                    if (i13 == 1) {
                        j10 = 3;
                    } else if (i13 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f14 = ((f13 * f7) + ((float) ((j10 * j11) - j11))) / ((float) duration);
                    if (f14 < 0.0f) {
                        f14 = 0.0f;
                    }
                    k8Var2.I0 = f14;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = k8Var2.I0;
                        }
                        k8Var2.G0(playingMessageObject, false);
                    }
                    if (k8Var2.H0 == 1 && k8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j12 > 200 || k8Var2.I0 == 0.0f) {
                            k8Var2.L0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f14);
                        }
                        if (k8Var2.J0 > 0 && k8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(k8Var2.N0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                k8Var2.K0 = System.currentTimeMillis();
                return;
            case 4:
                fd fdVar = (fd) obj;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f26201f.performHapticFeedback(0);
                Runnable runnable = fdVar.f26204j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                mk mkVar = (mk) obj;
                if (mkVar.S) {
                    mkVar.N.clear();
                    mkVar.P.clear();
                    mkVar.Q.clear();
                    mkVar.l();
                    return;
                }
                return;
            case 6:
                an anVar = (an) obj;
                bn bnVar = anVar.P;
                if (bnVar.J != null && !bnVar.K) {
                    int computeVerticalScrollOffset = bnVar.f24993r.computeVerticalScrollOffset();
                    if (bnVar.f24993r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (anVar.e() - anVar.f24652r) + anVar.f24651n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (bnVar.E - Math.max(0, computeVerticalScrollOffset - bnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((bnVar.f24993r.getMeasuredHeight() - (bnVar.E - computeVerticalScrollOffset)) - bnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > bnVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && bnVar.f24993r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        bnVar.E += f10;
                        bnVar.f24993r.scrollBy(0, i14);
                        anVar.invalidate();
                    }
                    anVar.L = true;
                    anVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 7:
                fo foVar = (fo) obj;
                k7 k7Var = foVar.U0;
                c6 c6Var = foVar.f26278g1;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!foVar.H && editField != null && foVar.G && !foVar.f26274e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(k7Var);
                        AndroidUtilities.runOnUIThread(k7Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                qu quVar = (qu) obj;
                k7 k7Var2 = quVar.P;
                lu luVar = quVar.f29699a;
                if (!quVar.f29708y && luVar != null && quVar.N && !quVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    luVar.requestFocus();
                    AndroidUtilities.showKeyboard(luVar);
                    AndroidUtilities.cancelRunOnUIThread(k7Var2);
                    AndroidUtilities.runOnUIThread(k7Var2, 100L);
                    return;
                }
                return;
            case 9:
                c2.b bVar = (c2.b) ((ci.p3) obj).d;
                if (bVar.f4491a && !((ArrayList) bVar.d).isEmpty() && !((AnimatorSet) bVar.f4493c).isRunning()) {
                    try {
                        ((AnimatorSet) bVar.f4493c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 10:
                tz tzVar = (tz) obj;
                if (tzVar.B0.f26647s == null) {
                    tzVar.X1 = false;
                    tzVar.Y();
                    return;
                }
                return;
            case 11:
                s00 s00Var = (s00) obj;
                if (s00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f15 = s00Var.f30093p0 + (((float) elapsedRealtime) / 320.0f);
                    s00Var.f30093p0 = f15;
                    s00Var.setAnimationIdicatorProgress(s00Var.f30086i0.getInterpolation(f15));
                    if (s00Var.f30093p0 > 1.0f) {
                        s00Var.f30093p0 = 1.0f;
                    }
                    if (s00Var.f30093p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(s00Var.f30101v0);
                        return;
                    }
                    s00Var.O = false;
                    s00Var.setEnabled(true);
                    n00 n00Var = s00Var.J;
                    if (n00Var != null) {
                        ((bw) n00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f24236t0, 1000L);
                return;
            case 13:
                TextureView textureView = ((f60) obj).H0.f28433q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new yt(15, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 14:
                k70 k70Var = (k70) obj;
                l70 l70Var = k70Var.f27733x;
                y60 y60Var = l70Var.V;
                if (y60Var != null && y60Var.getAdapter() != null) {
                    l70Var.V.getClass();
                    int R = RecyclerView.R(k70Var);
                    if (R >= 0) {
                        l70Var.T.v(l70Var.V.T(k70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 15:
                oc0 oc0Var = (oc0) obj;
                ValueAnimator valueAnimator = oc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    oc0Var.h.start();
                    return;
                }
                return;
            case 16:
                ((le0) obj).e();
                return;
            case 17:
                ej0 ej0Var = (ej0) obj;
                ej0Var.f25943y = true;
                ValueAnimator valueAnimator2 = ej0Var.f25944z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ej0Var.f25942x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ej0Var.f25944z = ofFloat;
                ofFloat.addUpdateListener(ej0Var.f25921b0);
                ej0Var.f25944z.setInterpolator(new LinearInterpolator());
                ej0Var.f25944z.setDuration(150L);
                ej0Var.f25944z.start();
                return;
            case 18:
                im0 im0Var = (im0) obj;
                si siVar = im0Var.f27286f2;
                int[] iArr = im0Var.f27296k2;
                qn qnVar = siVar.d;
                iArr[0] = (int) qnVar.f40847s9;
                iArr[1] = qnVar.Ba;
                if (im0Var.f27290h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    im0Var.M0(0.0f, im0Var.f27296k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    im0Var.M0(0.0f, im0Var.getMeasuredHeight() - im0Var.f27296k2[1]);
                }
                im0Var.f27286f2.d.f40903x0.scrollBy(0, dp);
                if (im0Var.f27288g2) {
                    AndroidUtilities.runOnUIThread(im0Var.B2);
                    return;
                }
                return;
            case 19:
                pl0 pl0Var = (pl0) obj;
                k7 k7Var3 = pl0Var.f29319i0;
                if (pl0Var.f29323n) {
                    AndroidUtilities.cancelRunOnUIThread(k7Var3);
                    AndroidUtilities.runOnUIThread(k7Var3, 4000L);
                    return;
                }
                pl0Var.U = false;
                pl0Var.invalidate();
                return;
            case 20:
                km0 km0Var = (km0) obj;
                RecyclerView recyclerView = km0Var.f27911a;
                if (recyclerView != null) {
                    if (km0Var.f27915g) {
                        recyclerView.scrollBy(0, -km0Var.f27916i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (km0Var.h) {
                        recyclerView.scrollBy(0, km0Var.f27916i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 21:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f16 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f24347b0));
                    scrollSlidingTextTabStrip.S = f16;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f16));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f24350d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    jn0 jn0Var = scrollSlidingTextTabStrip.f24346b;
                    if (jn0Var != null) {
                        jn0Var.k0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ShutterButton shutterButton = (ShutterButton) obj;
                yv0 yv0Var = shutterButton.e;
                if (yv0Var != null) {
                    final cm cmVar = (cm) yv0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.e;
                    ti tiVar = chatAttachAlertPhotoLayout.f28225b;
                    mm mmVar = chatAttachAlertPhotoLayout.R;
                    int i15 = tiVar.T0;
                    org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30536f0;
                    if ((i15 == 2 || (n2Var instanceof qn)) && !chatAttachAlertPhotoLayout.f24116s0 && !tiVar.V && chatAttachAlertPhotoLayout.P != null && !tiVar.G) {
                        if (n2Var == null) {
                            n2Var = LaunchActivity.R();
                        }
                        if (n2Var != null && n2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f24121w0) {
                                lk.q(R.string.GlobalAttachVideoRestricted, new xc(chatAttachAlertPhotoLayout.P, cmVar.f25282c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(bs.f25014f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f24114r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                bs bsVar = bs.f25014f;
                                duration2.setInterpolator(bsVar).start();
                                chatAttachAlertPhotoLayout.f24112q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
                                org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30536f0;
                                if ((n2Var2 instanceof qn) && ((qn) n2Var2).x()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                cmVar.f25280a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(mmVar, true);
                                mmVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f24093g0 = 0;
                                chatAttachAlertPhotoLayout.f24095h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = cmVar.e;
                                                if (chatAttachAlertPhotoLayout2.f24095h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24093g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24093g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24095h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(cmVar.e.f24095h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = cmVar.f25280a;
                                if (tiVar.T0 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new org.telegram.ui.Components.s(cmVar, 21), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = cmVar.e;
                                                if (chatAttachAlertPhotoLayout2.f24095h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24093g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24093g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24095h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(cmVar.e.f24095h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f24101k0.a(zv0.f33045b);
                                chatAttachAlertPhotoLayout.P.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.v = false;
                    return;
                }
                return;
            case 23:
                sx0 sx0Var = (sx0) obj;
                View view = sx0Var.f30358s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        sx0Var.f30358s.setVisibility(0);
                        sx0Var.f30358s.setAlpha(0.0f);
                    }
                    sx0Var.f30358s.animate().setListener(null).cancel();
                    sx0Var.f30358s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                sx0Var.f30354c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 24:
                c91 c91Var = (c91) obj;
                if (c91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f17 = c91Var.f25136f0 + (((float) elapsedRealtime3) / 200.0f);
                    c91Var.f25136f0 = f17;
                    c91Var.setAnimationIdicatorProgress(c91Var.f25128a0.getInterpolation(f17));
                    if (c91Var.f25136f0 > 1.0f) {
                        c91Var.f25136f0 = 1.0f;
                    }
                    if (c91Var.f25136f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(c91Var.f25139i0);
                        return;
                    }
                    c91Var.J = false;
                    c91Var.setEnabled(true);
                    b91 b91Var = c91Var.f25153y;
                    if (b91Var != null) {
                        ((l2.f) b91Var).I(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                h30 h30Var = (h30) obj;
                if (h30Var.f31565b && h30Var.Q0.f40479z0 == null) {
                    h30Var.f31573g0 = false;
                    org.telegram.ui.Components.voip.l0.a(h30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(h30Var.f31574h0, 3000L);
                return;
            case 26:
                org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) obj;
                if (a1Var.d && a1Var.e && a1Var.f33969k != null) {
                    if (SystemClock.elapsedRealtime() - a1Var.f33970l >= 30000) {
                        a1Var.f("heartbeat timed out");
                        return;
                    }
                    a1Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - a1Var.f33970l) + " ms ago");
                    a1Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                if (o5Var.f32027a != null && o5Var.d != null) {
                    o5Var.Q0();
                    if (o5Var.f34651r) {
                        o5Var.f32027a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                org.telegram.ui.Wallet.z5 z5Var = s5Var.G;
                if (s5Var.f34833a0) {
                    long nanoTime = System.nanoTime();
                    if (z5Var.f35173a) {
                        long j13 = z5Var.f35179j;
                        if (j13 == 0) {
                            z5Var.f35179j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, ((float) (nanoTime - j13)) * 1.0E-9f));
                            z5Var.f35179j = nanoTime;
                            if (z5Var.f35178i - z5Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f18 = z5Var.d;
                                z5Var.d = com.google.android.gms.internal.play_billing.k3.y(z5Var.f35174b, f18, exp, f18);
                                float f19 = z5Var.e;
                                z5Var.e = com.google.android.gms.internal.play_billing.k3.y(z5Var.f35175c, f19, exp, f19);
                            }
                        }
                    }
                    if (z5Var.f35173a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, z5Var.f35174b - z5Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    s5Var.K = f11;
                    if (z5Var.f35173a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, z5Var.f35175c - z5Var.e));
                    }
                    float c10 = org.telegram.ui.Wallet.s5.c(f12 * 1.5f, -15.0f, 15.0f);
                    float f20 = s5Var.K;
                    float f21 = s5Var.L;
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(f20, f21, 1.0f, f21);
                    s5Var.L = y3;
                    float f22 = s5Var.M;
                    float y10 = com.google.android.gms.internal.play_billing.k3.y(c10, f22, 1.0f, f22);
                    s5Var.M = y10;
                    float f23 = s5Var.f34839e0;
                    s5Var.b((y3 * f23) + s5Var.N + s5Var.f34838d0, (y10 * f23) + s5Var.O);
                    s5Var.postOnAnimation(this);
                    return;
                }
                return;
            default:
                ((p4.s0) obj).c();
                return;
        }
    }
}
