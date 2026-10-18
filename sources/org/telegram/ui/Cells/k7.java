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
import org.telegram.messenger.kk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bs;
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
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dw;
import org.telegram.ui.j30;
import org.telegram.ui.sn;
import org.telegram.ui.ui;
public final class k7 implements Runnable {
    public final int f22514a;
    public final Object f22515b;

    public k7(Object obj, int i10) {
        this.f22514a = i10;
        this.f22515b = obj;
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
        float f12;
        int i10 = this.f22514a;
        float f13 = 0.0f;
        Object obj = this.f22515b;
        switch (i10) {
            case 0:
                m7 m7Var = (m7) obj;
                if (m7Var.f22592b == null) {
                    m7Var.f22592b = new androidx.emoji2.text.j(m7Var, 4);
                }
                androidx.emoji2.text.j jVar = m7Var.f22592b;
                int i11 = m7Var.f22594c + 1;
                m7Var.f22594c = i11;
                jVar.f3103b = i11;
                m7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 1:
                v7 v7Var = (v7) obj;
                RectF rectF = v7Var.f23649n;
                v7Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(v7Var.f23654y, 1000L);
                return;
            case 2:
                org.telegram.ui.Components.t7 t7Var = (org.telegram.ui.Components.t7) obj;
                org.telegram.ui.Components.k8 k8Var = t7Var.f30490y;
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
                    float f14 = k8Var2.I0;
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
                    float f15 = ((f14 * f7) + ((float) ((j10 * j11) - j11))) / ((float) duration);
                    if (f15 < 0.0f) {
                        f15 = 0.0f;
                    }
                    k8Var2.I0 = f15;
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
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f15);
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
                fdVar.f26221f.performHapticFeedback(0);
                Runnable runnable = fdVar.f26224j;
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
                    int computeVerticalScrollOffset = bnVar.f25016r.computeVerticalScrollOffset();
                    if (bnVar.f25016r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (anVar.e() - anVar.f24677r) + anVar.f24676n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (bnVar.E - Math.max(0, computeVerticalScrollOffset - bnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((bnVar.f25016r.getMeasuredHeight() - (bnVar.E - computeVerticalScrollOffset)) - bnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > bnVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && bnVar.f25016r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        bnVar.E += f10;
                        bnVar.f25016r.scrollBy(0, i14);
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
                c6 c6Var = foVar.f26298g1;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!foVar.H && editField != null && foVar.G && !foVar.f26294e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                lu luVar = quVar.f29749a;
                if (!quVar.f29758y && luVar != null && quVar.N && !quVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    luVar.requestFocus();
                    AndroidUtilities.showKeyboard(luVar);
                    AndroidUtilities.cancelRunOnUIThread(k7Var2);
                    AndroidUtilities.runOnUIThread(k7Var2, 100L);
                    return;
                }
                return;
            case 9:
                c2.b bVar = (c2.b) ((ci.p3) obj).d;
                if (bVar.f4493a && !((ArrayList) bVar.d).isEmpty() && !((AnimatorSet) bVar.f4495c).isRunning()) {
                    try {
                        ((AnimatorSet) bVar.f4495c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 10:
                tz tzVar = (tz) obj;
                if (tzVar.B0.f26625s == null) {
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
                    float f16 = s00Var.f30118p0 + (((float) elapsedRealtime) / 320.0f);
                    s00Var.f30118p0 = f16;
                    s00Var.setAnimationIdicatorProgress(s00Var.f30111i0.getInterpolation(f16));
                    if (s00Var.f30118p0 > 1.0f) {
                        s00Var.f30118p0 = 1.0f;
                    }
                    if (s00Var.f30118p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(s00Var.f30126v0);
                        return;
                    }
                    s00Var.O = false;
                    s00Var.setEnabled(true);
                    n00 n00Var = s00Var.J;
                    if (n00Var != null) {
                        ((dw) n00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f24240t0, 1000L);
                return;
            case 13:
                TextureView textureView = ((f60) obj).H0.f28445q0;
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
                l70 l70Var = k70Var.f27769x;
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
                ej0Var.f25959y = true;
                ValueAnimator valueAnimator2 = ej0Var.f25960z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ej0Var.f25958x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ej0Var.f25960z = ofFloat;
                ofFloat.addUpdateListener(ej0Var.f25937b0);
                ej0Var.f25960z.setInterpolator(new LinearInterpolator());
                ej0Var.f25960z.setDuration(150L);
                ej0Var.f25960z.start();
                return;
            case 18:
                im0 im0Var = (im0) obj;
                ui uiVar = im0Var.f27276f2;
                int[] iArr = im0Var.f27286k2;
                sn snVar = uiVar.d;
                iArr[0] = (int) snVar.f41398s9;
                iArr[1] = snVar.Ba;
                if (im0Var.f27280h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    im0Var.M0(0.0f, im0Var.f27286k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    im0Var.M0(0.0f, im0Var.getMeasuredHeight() - im0Var.f27286k2[1]);
                }
                im0Var.f27276f2.d.f41454x0.scrollBy(0, dp);
                if (im0Var.f27278g2) {
                    AndroidUtilities.runOnUIThread(im0Var.B2);
                    return;
                }
                return;
            case 19:
                pl0 pl0Var = (pl0) obj;
                k7 k7Var3 = pl0Var.f29354i0;
                if (pl0Var.f29358n) {
                    AndroidUtilities.cancelRunOnUIThread(k7Var3);
                    AndroidUtilities.runOnUIThread(k7Var3, 4000L);
                    return;
                }
                pl0Var.U = false;
                pl0Var.invalidate();
                return;
            case 20:
                km0 km0Var = (km0) obj;
                RecyclerView recyclerView = km0Var.f27938a;
                if (recyclerView != null) {
                    if (km0Var.f27942g) {
                        recyclerView.scrollBy(0, -km0Var.f27943i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (km0Var.h) {
                        recyclerView.scrollBy(0, km0Var.f27943i);
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
                    float f17 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f24351b0));
                    scrollSlidingTextTabStrip.S = f17;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f17));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f24354d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    jn0 jn0Var = scrollSlidingTextTabStrip.f24350b;
                    if (jn0Var != null) {
                        jn0Var.k0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ShutterButton shutterButton = (ShutterButton) obj;
                xv0 xv0Var = shutterButton.e;
                if (xv0Var != null) {
                    final cm cmVar = (cm) xv0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.e;
                    ti tiVar = chatAttachAlertPhotoLayout.f28245b;
                    mm mmVar = chatAttachAlertPhotoLayout.R;
                    int i15 = tiVar.T0;
                    org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30581f0;
                    if ((i15 == 2 || (n2Var instanceof sn)) && !chatAttachAlertPhotoLayout.f24120s0 && !tiVar.V && chatAttachAlertPhotoLayout.P != null && !tiVar.G) {
                        if (n2Var == null) {
                            n2Var = LaunchActivity.R();
                        }
                        if (n2Var != null && n2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f24125w0) {
                                kk.q(R.string.GlobalAttachVideoRestricted, new xc(chatAttachAlertPhotoLayout.P, cmVar.f25311c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(bs.f25037f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f24118r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                bs bsVar = bs.f25037f;
                                duration2.setInterpolator(bsVar).start();
                                chatAttachAlertPhotoLayout.f24116q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
                                org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30581f0;
                                if ((n2Var2 instanceof sn) && ((sn) n2Var2).x()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                cmVar.f25309a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(mmVar, true);
                                mmVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f24097g0 = 0;
                                chatAttachAlertPhotoLayout.f24099h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = cmVar.e;
                                                if (chatAttachAlertPhotoLayout2.f24099h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24097g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24097g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24099h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(cmVar.e.f24099h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = cmVar.f25309a;
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
                                                if (chatAttachAlertPhotoLayout2.f24099h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24097g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24097g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24099h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(cmVar.e.f24099h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f24105k0.a(yv0.f32768b);
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
                rx0 rx0Var = (rx0) obj;
                View view = rx0Var.f30084s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        rx0Var.f30084s.setVisibility(0);
                        rx0Var.f30084s.setAlpha(0.0f);
                    }
                    rx0Var.f30084s.animate().setListener(null).cancel();
                    rx0Var.f30084s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                rx0Var.f30080c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 24:
                b91 b91Var = (b91) obj;
                if (b91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f18 = b91Var.f24861f0 + (((float) elapsedRealtime3) / 200.0f);
                    b91Var.f24861f0 = f18;
                    b91Var.setAnimationIdicatorProgress(b91Var.f24853a0.getInterpolation(f18));
                    if (b91Var.f24861f0 > 1.0f) {
                        b91Var.f24861f0 = 1.0f;
                    }
                    if (b91Var.f24861f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(b91Var.f24864i0);
                        return;
                    }
                    b91Var.J = false;
                    b91Var.setEnabled(true);
                    a91 a91Var = b91Var.f24878y;
                    if (a91Var != null) {
                        ((l2.f) a91Var).z(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                j30 j30Var = (j30) obj;
                if (j30Var.f31561b && j30Var.Q0.f41038z0 == null) {
                    j30Var.f31569g0 = false;
                    org.telegram.ui.Components.voip.l0.a(j30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(j30Var.f31570h0, 3000L);
                return;
            case 26:
                org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) obj;
                if (a1Var.d && a1Var.e && a1Var.f33970k != null) {
                    if (SystemClock.elapsedRealtime() - a1Var.f33971l >= 30000) {
                        a1Var.f("heartbeat timed out");
                        return;
                    }
                    a1Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - a1Var.f33971l) + " ms ago");
                    a1Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                if (m5Var.f31197a != null && m5Var.d != null) {
                    m5Var.P0();
                    if (m5Var.f34585r) {
                        m5Var.f31197a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj;
                org.telegram.ui.Wallet.d6 d6Var = p5Var.f34741x;
                if (p5Var.isAttachedToWindow()) {
                    d6Var.b(System.nanoTime());
                    if (d6Var.f34131a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, d6Var.f34132b - d6Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    p5Var.G = f11;
                    if (d6Var.f34131a) {
                        f13 = Math.max(-15.0f, Math.min(15.0f, d6Var.f34133c - d6Var.e));
                    }
                    float f19 = p5Var.G;
                    float f20 = p5Var.H;
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(f19, f20, 1.0f, f20);
                    p5Var.H = y3;
                    float f21 = p5Var.I;
                    float y10 = com.google.android.gms.internal.play_billing.k3.y(f13, f21, 1.0f, f21);
                    p5Var.I = y10;
                    float f22 = p5Var.U;
                    p5Var.b((y3 * f22) + p5Var.J + p5Var.T, (y10 * f22) + p5Var.K);
                    p5Var.postOnAnimation(this);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.f6 f6Var = (org.telegram.ui.Wallet.f6) obj;
                org.telegram.ui.Wallet.d6 d6Var2 = f6Var.H;
                if (f6Var.h) {
                    d6Var2.b(System.nanoTime());
                    if (d6Var2.f34131a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, d6Var2.f34132b - d6Var2.d));
                    } else {
                        f12 = 0.0f;
                    }
                    f6Var.O = f12;
                    if (d6Var2.f34131a) {
                        f13 = Math.max(-15.0f, Math.min(15.0f, d6Var2.f34133c - d6Var2.e));
                    }
                    float b10 = org.telegram.ui.Wallet.f6.b(f13 * 1.5f, -15.0f, 15.0f);
                    float f23 = f6Var.O;
                    float f24 = f6Var.P;
                    float y11 = com.google.android.gms.internal.play_billing.k3.y(f23, f24, 1.0f, f24);
                    f6Var.P = y11;
                    float f25 = f6Var.Q;
                    float y12 = com.google.android.gms.internal.play_billing.k3.y(b10, f25, 1.0f, f25);
                    f6Var.Q = y12;
                    float f26 = f6Var.M;
                    org.telegram.ui.Wallet.b6 b6Var = f6Var.f34234a.f34194i0;
                    float f27 = (y11 * f26) + b6Var.f47117i + f6Var.L;
                    f6Var.K = f27;
                    float f28 = (y12 * f26) + b6Var.d;
                    f6Var.N = f28;
                    f6Var.a(f27, f28);
                    f6Var.postOnAnimation(this);
                    return;
                }
                return;
        }
    }
}
