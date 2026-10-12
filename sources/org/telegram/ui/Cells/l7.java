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
import org.telegram.messenger.am;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.um;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a40;
import org.telegram.ui.eo;
import org.telegram.ui.fj;
import org.telegram.ui.uw;
public final class l7 implements Runnable {
    public final int f22190a;
    public final Object f22191b;

    public l7(Object obj, int i10) {
        this.f22190a = i10;
        this.f22191b = obj;
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
        float f12;
        int i10 = this.f22190a;
        float f13 = 0.0f;
        Object obj = this.f22191b;
        switch (i10) {
            case 0:
                n7 n7Var = (n7) obj;
                if (n7Var.f22290b == null) {
                    n7Var.f22290b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f22290b;
                int i11 = n7Var.f22292c + 1;
                n7Var.f22292c = i11;
                jVar.f2599b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 1:
                w7 w7Var = (w7) obj;
                RectF rectF = w7Var.f23443n;
                w7Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f23448y, 1000L);
                return;
            case 2:
                org.telegram.ui.Components.u7 u7Var = (org.telegram.ui.Components.u7) obj;
                org.telegram.ui.Components.l8 l8Var = u7Var.f31089y;
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
            case 3:
                org.telegram.ui.Components.l8 l8Var2 = (org.telegram.ui.Components.l8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f14 = l8Var2.I0;
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
                    float f15 = ((f14 * f7) + ((float) ((j3 * j10) - j10))) / ((float) duration);
                    if (f15 < 0.0f) {
                        f15 = 0.0f;
                    }
                    l8Var2.I0 = f15;
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
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f15);
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
            case 4:
                hd hdVar = (hd) obj;
                hdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                hdVar.f26756f.performHapticFeedback(0);
                Runnable runnable = hdVar.f26759j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                tk tkVar = (tk) obj;
                if (tkVar.S) {
                    tkVar.N.clear();
                    tkVar.P.clear();
                    tkVar.Q.clear();
                    tkVar.l();
                    return;
                }
                return;
            case 6:
                in inVar = (in) obj;
                jn jnVar = inVar.P;
                if (jnVar.J != null && !jnVar.K) {
                    int computeVerticalScrollOffset = jnVar.f27566r.computeVerticalScrollOffset();
                    if (jnVar.f27566r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (inVar.e() - inVar.f27232r) + inVar.f27231n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (jnVar.E - Math.max(0, computeVerticalScrollOffset - jnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((jnVar.f27566r.getMeasuredHeight() - (jnVar.E - computeVerticalScrollOffset)) - jnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > jnVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && jnVar.f27566r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        jnVar.E += f10;
                        jnVar.f27566r.scrollBy(0, i14);
                        inVar.invalidate();
                    }
                    inVar.L = true;
                    inVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 7:
                no noVar = (no) obj;
                l7 l7Var = noVar.U0;
                d6 d6Var = noVar.f28890g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!noVar.H && editField != null && noVar.G && !noVar.f28886e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(l7Var);
                        AndroidUtilities.runOnUIThread(l7Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                cv cvVar = (cv) obj;
                l7 l7Var2 = cvVar.P;
                xu xuVar = cvVar.f25015a;
                if (!cvVar.f25025y && xuVar != null && cvVar.N && !cvVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    xuVar.requestFocus();
                    AndroidUtilities.showKeyboard(xuVar);
                    AndroidUtilities.cancelRunOnUIThread(l7Var2);
                    AndroidUtilities.runOnUIThread(l7Var2, 100L);
                    return;
                }
                return;
            case 9:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.z4) obj).d;
                if (mVar.f7947a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7949c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7949c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 10:
                d00 d00Var = (d00) obj;
                if (d00Var.B0.f31223s == null) {
                    d00Var.X1 = false;
                    d00Var.Y();
                    return;
                }
                return;
            case 11:
                d10 d10Var = (d10) obj;
                if (d10Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f16 = d10Var.f25175p0 + (((float) elapsedRealtime) / 320.0f);
                    d10Var.f25175p0 = f16;
                    d10Var.setAnimationIdicatorProgress(d10Var.f25168i0.getInterpolation(f16));
                    if (d10Var.f25175p0 > 1.0f) {
                        d10Var.f25175p0 = 1.0f;
                    }
                    if (d10Var.f25175p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(d10Var.f25183v0);
                        return;
                    }
                    d10Var.O = false;
                    d10Var.setEnabled(true);
                    x00 x00Var = d10Var.J;
                    if (x00Var != null) {
                        ((uw) x00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f23966t0, 1000L);
                return;
            case 13:
                TextureView textureView = ((p60) obj).H0.f32301q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new jt(18, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 14:
                v70 v70Var = (v70) obj;
                w70 w70Var = v70Var.f31449x;
                j70 j70Var = w70Var.V;
                if (j70Var != null && j70Var.getAdapter() != null) {
                    w70Var.V.getClass();
                    int R = RecyclerView.R(v70Var);
                    if (R >= 0) {
                        w70Var.T.v(w70Var.V.T(v70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 15:
                zc0 zc0Var = (zc0) obj;
                ValueAnimator valueAnimator = zc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    zc0Var.h.start();
                    return;
                }
                return;
            case 16:
                ((xe0) obj).e();
                return;
            case 17:
                qj0 qj0Var = (qj0) obj;
                qj0Var.f29849y = true;
                ValueAnimator valueAnimator2 = qj0Var.f29850z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                qj0Var.f29848x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qj0Var.f29850z = ofFloat;
                ofFloat.addUpdateListener(qj0Var.f29826b0);
                qj0Var.f29850z.setInterpolator(new LinearInterpolator());
                qj0Var.f29850z.setDuration(150L);
                qj0Var.f29850z.start();
                return;
            case 18:
                wm0 wm0Var = (wm0) obj;
                fj fjVar = wm0Var.f32452f2;
                int[] iArr = wm0Var.f32462k2;
                eo eoVar = fjVar.d;
                iArr[0] = (int) eoVar.f37427s9;
                iArr[1] = eoVar.Ba;
                if (wm0Var.f32456h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    wm0Var.M0(0.0f, wm0Var.f32462k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    wm0Var.M0(0.0f, wm0Var.getMeasuredHeight() - wm0Var.f32462k2[1]);
                }
                wm0Var.f32452f2.d.f37483x0.scrollBy(0, dp);
                if (wm0Var.f32454g2) {
                    AndroidUtilities.runOnUIThread(wm0Var.B2);
                    return;
                }
                return;
            case 19:
                dm0 dm0Var = (dm0) obj;
                l7 l7Var3 = dm0Var.f25408i0;
                if (dm0Var.f25412n) {
                    AndroidUtilities.cancelRunOnUIThread(l7Var3);
                    AndroidUtilities.runOnUIThread(l7Var3, 4000L);
                    return;
                }
                dm0Var.U = false;
                dm0Var.invalidate();
                return;
            case 20:
                ym0 ym0Var = (ym0) obj;
                RecyclerView recyclerView = ym0Var.f33133a;
                if (recyclerView != null) {
                    if (ym0Var.f33138g) {
                        recyclerView.scrollBy(0, -ym0Var.f33139i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (ym0Var.h) {
                        recyclerView.scrollBy(0, ym0Var.f33139i);
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
                    float f17 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f24085b0));
                    scrollSlidingTextTabStrip.S = f17;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f17));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f24088d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    xn0 xn0Var = scrollSlidingTextTabStrip.f24084b;
                    if (xn0Var != null) {
                        xn0Var.v0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ShutterButton shutterButton = (ShutterButton) obj;
                mw0 mw0Var = shutterButton.f24109e;
                if (mw0Var != null) {
                    final km kmVar = (km) mw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kmVar.f27882e;
                    aj ajVar = chatAttachAlertPhotoLayout.f30570b;
                    um umVar = chatAttachAlertPhotoLayout.R;
                    int i15 = ajVar.T0;
                    org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24338f0;
                    if ((i15 == 2 || (m2Var instanceof eo)) && !chatAttachAlertPhotoLayout.f23839s0 && !ajVar.V && chatAttachAlertPhotoLayout.P != null && !ajVar.G) {
                        if (m2Var == null) {
                            m2Var = LaunchActivity.R();
                        }
                        if (m2Var != null && m2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f23844w0) {
                                am.q(R.string.GlobalAttachVideoRestricted, new zc(chatAttachAlertPhotoLayout.P, kmVar.f27881c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                m2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(js.f27634f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f23837r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                js jsVar = js.f27634f;
                                duration2.setInterpolator(jsVar).start();
                                chatAttachAlertPhotoLayout.f23835q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(jsVar).start();
                                org.telegram.ui.ActionBar.m2 m2Var2 = ajVar.f24338f0;
                                if ((m2Var2 instanceof eo) && ((eo) m2Var2).v()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                kmVar.f27879a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(umVar, true);
                                umVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f23816g0 = 0;
                                chatAttachAlertPhotoLayout.f23818h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = kmVar.f27882e;
                                                if (chatAttachAlertPhotoLayout2.f23818h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f23816g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f23816g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f23818h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(kmVar.f27882e.f23818h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(m2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = kmVar.f27879a;
                                if (ajVar.T0 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new org.telegram.ui.Components.s(kmVar, 21), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = kmVar.f27882e;
                                                if (chatAttachAlertPhotoLayout2.f23818h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f23816g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f23816g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f23818h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(kmVar.f27882e.f23818h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f23824k0.a(nw0.f28982b);
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
                gy0 gy0Var = (gy0) obj;
                View view = gy0Var.f26565s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        gy0Var.f26565s.setVisibility(0);
                        gy0Var.f26565s.setAlpha(0.0f);
                    }
                    gy0Var.f26565s.animate().setListener(null).cancel();
                    gy0Var.f26565s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                gy0Var.f26560c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 24:
                t91 t91Var = (t91) obj;
                if (t91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f18 = t91Var.f30813f0 + (((float) elapsedRealtime3) / 200.0f);
                    t91Var.f30813f0 = f18;
                    t91Var.setAnimationIdicatorProgress(t91Var.f30804a0.getInterpolation(f18));
                    if (t91Var.f30813f0 > 1.0f) {
                        t91Var.f30813f0 = 1.0f;
                    }
                    if (t91Var.f30813f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(t91Var.f30816i0);
                        return;
                    }
                    t91Var.J = false;
                    t91Var.setEnabled(true);
                    s91 s91Var = t91Var.f30830y;
                    if (s91Var != null) {
                        ((n4.l) s91Var).k(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                a40 a40Var = (a40) obj;
                if (a40Var.f31799b && a40Var.Q0.f38785z0 == null) {
                    a40Var.f31808g0 = false;
                    org.telegram.ui.Components.voip.n0.a(a40Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(a40Var.f31809h0, 3000L);
                return;
            case 26:
                org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) obj;
                if (a1Var.d && a1Var.f34448e && a1Var.f34453k != null) {
                    if (SystemClock.elapsedRealtime() - a1Var.f34454l >= 30000) {
                        a1Var.f("heartbeat timed out");
                        return;
                    }
                    a1Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - a1Var.f34454l) + " ms ago");
                    a1Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) obj;
                if (c5Var.f27776a != null && c5Var.d != null) {
                    c5Var.E0();
                    if (c5Var.f34569r) {
                        c5Var.f27776a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.f5 f5Var = (org.telegram.ui.Wallet.f5) obj;
                org.telegram.ui.Wallet.p5 p5Var = f5Var.f34757x;
                if (f5Var.isAttachedToWindow()) {
                    p5Var.b(System.nanoTime());
                    if (p5Var.f35223a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, p5Var.f35224b - p5Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    f5Var.G = f11;
                    if (p5Var.f35223a) {
                        f13 = Math.max(-15.0f, Math.min(15.0f, p5Var.f35225c - p5Var.f35226e));
                    }
                    float f19 = f5Var.G;
                    float f20 = f5Var.H;
                    float y3 = com.google.android.gms.internal.vision.e2.y(f19, f20, 1.0f, f20);
                    f5Var.H = y3;
                    float f21 = f5Var.I;
                    float y10 = com.google.android.gms.internal.vision.e2.y(f13, f21, 1.0f, f21);
                    f5Var.I = y10;
                    float f22 = f5Var.U;
                    f5Var.b((y3 * f22) + f5Var.J + f5Var.T, (y10 * f22) + f5Var.K);
                    f5Var.postOnAnimation(this);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                org.telegram.ui.Wallet.p5 p5Var2 = s5Var.K;
                if (s5Var.f35354s) {
                    p5Var2.b(System.nanoTime());
                    if (p5Var2.f35223a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, p5Var2.f35224b - p5Var2.d));
                    } else {
                        f12 = 0.0f;
                    }
                    s5Var.R = f12;
                    if (p5Var2.f35223a) {
                        f13 = Math.max(-15.0f, Math.min(15.0f, p5Var2.f35225c - p5Var2.f35226e));
                    }
                    float b10 = org.telegram.ui.Wallet.s5.b(f13 * 1.5f, -15.0f, 15.0f);
                    float f23 = s5Var.R;
                    float f24 = s5Var.S;
                    float y11 = com.google.android.gms.internal.vision.e2.y(f23, f24, 1.0f, f24);
                    s5Var.S = y11;
                    float f25 = s5Var.T;
                    float y12 = com.google.android.gms.internal.vision.e2.y(b10, f25, 1.0f, f25);
                    s5Var.T = y12;
                    float f26 = s5Var.P;
                    org.telegram.ui.Wallet.n5 n5Var = s5Var.f35347a.f35317f0;
                    float f27 = (y11 * f26) + n5Var.f48285i + s5Var.O;
                    s5Var.N = f27;
                    float f28 = (y12 * f26) + n5Var.d;
                    s5Var.Q = f28;
                    s5Var.a(f27, f28);
                    s5Var.postOnAnimation(this);
                    return;
                }
                return;
        }
    }
}
