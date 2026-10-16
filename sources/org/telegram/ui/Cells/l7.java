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
import org.telegram.messenger.sk;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.dn;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vm;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e40;
import org.telegram.ui.fj;
import org.telegram.ui.fo;
import org.telegram.ui.xw;
public final class l7 implements Runnable {
    public final int f21185a;
    public final Object f21186b;

    public l7(Object obj, int i10) {
        this.f21185a = i10;
        this.f21186b = obj;
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
        int i10 = this.f21185a;
        float f13 = 0.0f;
        Object obj = this.f21186b;
        switch (i10) {
            case 0:
                n7 n7Var = (n7) obj;
                if (n7Var.f21276b == null) {
                    n7Var.f21276b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f21276b;
                int i11 = n7Var.f21278c + 1;
                n7Var.f21278c = i11;
                jVar.f1491b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 1:
                w7 w7Var = (w7) obj;
                RectF rectF = w7Var.f22394n;
                w7Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f22399y, 1000L);
                return;
            case 2:
                org.telegram.ui.Components.v7 v7Var = (org.telegram.ui.Components.v7) obj;
                org.telegram.ui.Components.m8 m8Var = v7Var.f29586y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i12 = m8Var.J0 + 1;
                    m8Var.J0 = i12;
                    if (i12 == 1) {
                        v7Var.v = true;
                        m8Var.H0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            m8Var.D0();
                        } else if (m8Var.H0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(m8Var.N0);
                            m8Var.L0 = 0L;
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
                org.telegram.ui.Components.m8 m8Var2 = (org.telegram.ui.Components.m8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f14 = m8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - m8Var2.K0;
                    m8Var2.K0 = currentTimeMillis;
                    long j12 = currentTimeMillis - m8Var2.L0;
                    int i13 = m8Var2.J0;
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
                    m8Var2.I0 = f15;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = m8Var2.I0;
                        }
                        m8Var2.G0(playingMessageObject, false);
                    }
                    if (m8Var2.H0 == 1 && m8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j12 > 200 || m8Var2.I0 == 0.0f) {
                            m8Var2.L0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f15);
                        }
                        if (m8Var2.J0 > 0 && m8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(m8Var2.N0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                m8Var2.K0 = System.currentTimeMillis();
                return;
            case 4:
                hd hdVar = (hd) obj;
                hdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                hdVar.f25277f.performHapticFeedback(0);
                Runnable runnable = hdVar.f25280j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ok okVar = (ok) obj;
                if (okVar.S) {
                    okVar.N.clear();
                    okVar.P.clear();
                    okVar.Q.clear();
                    okVar.l();
                    return;
                }
                return;
            case 6:
                dn dnVar = (dn) obj;
                en enVar = dnVar.P;
                if (enVar.J != null && !enVar.K) {
                    int computeVerticalScrollOffset = enVar.f24433r.computeVerticalScrollOffset();
                    if (enVar.f24433r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (dnVar.e() - dnVar.f24147r) + dnVar.f24146n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (enVar.E - Math.max(0, computeVerticalScrollOffset - enVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((enVar.f24433r.getMeasuredHeight() - (enVar.E - computeVerticalScrollOffset)) - enVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > enVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && enVar.f24433r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        enVar.E += f10;
                        enVar.f24433r.scrollBy(0, i14);
                        dnVar.invalidate();
                    }
                    dnVar.L = true;
                    dnVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 7:
                io ioVar = (io) obj;
                l7 l7Var = ioVar.U0;
                d6 d6Var = ioVar.f25677g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!ioVar.H && editField != null && ioVar.G && !ioVar.f25673e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                vu vuVar = (vu) obj;
                l7 l7Var2 = vuVar.P;
                qu quVar = vuVar.f30318a;
                if (!vuVar.f30327y && quVar != null && vuVar.N && !vuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    quVar.requestFocus();
                    AndroidUtilities.showKeyboard(quVar);
                    AndroidUtilities.cancelRunOnUIThread(l7Var2);
                    AndroidUtilities.runOnUIThread(l7Var2, 100L);
                    return;
                }
                return;
            case 9:
                c2.b bVar = (c2.b) ((bi.m4) obj).d;
                if (bVar.f4122a && !((ArrayList) bVar.d).isEmpty() && !((AnimatorSet) bVar.f4124c).isRunning()) {
                    try {
                        ((AnimatorSet) bVar.f4124c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 10:
                wz wzVar = (wz) obj;
                if (wzVar.B0.f26442s == null) {
                    wzVar.X1 = false;
                    wzVar.Y();
                    return;
                }
                return;
            case 11:
                w00 w00Var = (w00) obj;
                if (w00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f16 = w00Var.f30380p0 + (((float) elapsedRealtime) / 320.0f);
                    w00Var.f30380p0 = f16;
                    w00Var.setAnimationIdicatorProgress(w00Var.f30373i0.getInterpolation(f16));
                    if (w00Var.f30380p0 > 1.0f) {
                        w00Var.f30380p0 = 1.0f;
                    }
                    if (w00Var.f30380p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(w00Var.f30388v0);
                        return;
                    }
                    w00Var.O = false;
                    w00Var.setEnabled(true);
                    q00 q00Var = w00Var.J;
                    if (q00Var != null) {
                        ((xw) q00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f22878t0, 1000L);
                return;
            case 13:
                TextureView textureView = ((i60) obj).H0.f27879q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new vm(26, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 14:
                o70 o70Var = (o70) obj;
                p70 p70Var = o70Var.f27592x;
                c70 c70Var = p70Var.V;
                if (c70Var != null && c70Var.getAdapter() != null) {
                    p70Var.V.getClass();
                    int R = RecyclerView.R(o70Var);
                    if (R >= 0) {
                        p70Var.T.v(p70Var.V.T(o70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 15:
                vc0 vc0Var = (vc0) obj;
                ValueAnimator valueAnimator = vc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    vc0Var.h.start();
                    return;
                }
                return;
            case 16:
                ((re0) obj).e();
                return;
            case 17:
                jj0 jj0Var = (jj0) obj;
                jj0Var.f26064y = true;
                ValueAnimator valueAnimator2 = jj0Var.f26065z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                jj0Var.f26063x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                jj0Var.f26065z = ofFloat;
                ofFloat.addUpdateListener(jj0Var.f26042b0);
                jj0Var.f26065z.setInterpolator(new LinearInterpolator());
                jj0Var.f26065z.setDuration(150L);
                jj0Var.f26065z.start();
                return;
            case 18:
                mm0 mm0Var = (mm0) obj;
                fj fjVar = mm0Var.f27133f2;
                int[] iArr = mm0Var.f27143k2;
                fo foVar = fjVar.d;
                iArr[0] = (int) foVar.f35805s9;
                iArr[1] = foVar.Ba;
                if (mm0Var.f27137h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.f27143k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.getMeasuredHeight() - mm0Var.f27143k2[1]);
                }
                mm0Var.f27133f2.d.f35861x0.scrollBy(0, dp);
                if (mm0Var.f27135g2) {
                    AndroidUtilities.runOnUIThread(mm0Var.B2);
                    return;
                }
                return;
            case 19:
                tl0 tl0Var = (tl0) obj;
                l7 l7Var3 = tl0Var.f29135i0;
                if (tl0Var.f29139n) {
                    AndroidUtilities.cancelRunOnUIThread(l7Var3);
                    AndroidUtilities.runOnUIThread(l7Var3, 4000L);
                    return;
                }
                tl0Var.U = false;
                tl0Var.invalidate();
                return;
            case 20:
                om0 om0Var = (om0) obj;
                RecyclerView recyclerView = om0Var.f27679a;
                if (recyclerView != null) {
                    if (om0Var.f27683g) {
                        recyclerView.scrollBy(0, -om0Var.f27684i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (om0Var.h) {
                        recyclerView.scrollBy(0, om0Var.f27684i);
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
                    float f17 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f22989b0));
                    scrollSlidingTextTabStrip.S = f17;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f17));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f22992d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    nn0 nn0Var = scrollSlidingTextTabStrip.f22988b;
                    if (nn0Var != null) {
                        nn0Var.w0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ShutterButton shutterButton = (ShutterButton) obj;
                cw0 cw0Var = shutterButton.e;
                if (cw0Var != null) {
                    final em emVar = (em) cw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = emVar.e;
                    vi viVar = chatAttachAlertPhotoLayout.f27360b;
                    om omVar = chatAttachAlertPhotoLayout.R;
                    int i15 = viVar.T0;
                    org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
                    if ((i15 == 2 || (m2Var instanceof fo)) && !chatAttachAlertPhotoLayout.f22758s0 && !viVar.V && chatAttachAlertPhotoLayout.P != null && !viVar.G) {
                        if (m2Var == null) {
                            m2Var = LaunchActivity.R();
                        }
                        if (m2Var != null && m2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f22763w0) {
                                sk.q(R.string.GlobalAttachVideoRestricted, new zc(chatAttachAlertPhotoLayout.P, emVar.f24428c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                m2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(es.f24465f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f22756r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                es esVar = es.f24465f;
                                duration2.setInterpolator(esVar).start();
                                chatAttachAlertPhotoLayout.f22754q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
                                org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f29672f0;
                                if ((m2Var2 instanceof fo) && ((fo) m2Var2).x()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                emVar.f24426a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(omVar, true);
                                omVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f22735g0 = 0;
                                chatAttachAlertPhotoLayout.f22737h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = emVar.e;
                                                if (chatAttachAlertPhotoLayout2.f22737h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f22735g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f22735g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22737h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(emVar.e.f22737h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(m2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = emVar.f24426a;
                                if (viVar.T0 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new org.telegram.ui.Components.s(emVar, 21), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = emVar.e;
                                                if (chatAttachAlertPhotoLayout2.f22737h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f22735g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f22735g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22737h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(emVar.e.f22737h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f22743k0.a(dw0.f24191b);
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
                wx0 wx0Var = (wx0) obj;
                View view = wx0Var.f30693s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        wx0Var.f30693s.setVisibility(0);
                        wx0Var.f30693s.setAlpha(0.0f);
                    }
                    wx0Var.f30693s.animate().setListener(null).cancel();
                    wx0Var.f30693s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                wx0Var.f30689c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 24:
                k91 k91Var = (k91) obj;
                if (k91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f18 = k91Var.f26314f0 + (((float) elapsedRealtime3) / 200.0f);
                    k91Var.f26314f0 = f18;
                    k91Var.setAnimationIdicatorProgress(k91Var.f26306a0.getInterpolation(f18));
                    if (k91Var.f26314f0 > 1.0f) {
                        k91Var.f26314f0 = 1.0f;
                    }
                    if (k91Var.f26314f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k91Var.f26317i0);
                        return;
                    }
                    k91Var.J = false;
                    k91Var.setEnabled(true);
                    j91 j91Var = k91Var.f26331y;
                    if (j91Var != null) {
                        ((m.h) j91Var).e(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                e40 e40Var = (e40) obj;
                if (e40Var.f29950b && e40Var.Q0.f38261z0 == null) {
                    e40Var.f29958g0 = false;
                    org.telegram.ui.Components.voip.l0.a(e40Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(e40Var.f29959h0, 3000L);
                return;
            case 26:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) obj;
                if (z0Var.d && z0Var.e && z0Var.f33642k != null) {
                    if (SystemClock.elapsedRealtime() - z0Var.f33643l >= 30000) {
                        z0Var.f("heartbeat timed out");
                        return;
                    }
                    z0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - z0Var.f33643l) + " ms ago");
                    z0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) obj;
                if (a5Var.f24003a != null && a5Var.d != null) {
                    a5Var.E0();
                    if (a5Var.f32654r) {
                        a5Var.f24003a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.d5 d5Var = (org.telegram.ui.Wallet.d5) obj;
                org.telegram.ui.Wallet.n5 n5Var = d5Var.f32790x;
                if (d5Var.isAttachedToWindow()) {
                    n5Var.b(System.nanoTime());
                    if (n5Var.f33243a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, n5Var.f33244b - n5Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    d5Var.G = f11;
                    if (n5Var.f33243a) {
                        f13 = Math.max(-15.0f, Math.min(15.0f, n5Var.f33245c - n5Var.e));
                    }
                    float f19 = d5Var.G;
                    float f20 = d5Var.H;
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(f19, f20, 1.0f, f20);
                    d5Var.H = y3;
                    float f21 = d5Var.I;
                    float y10 = com.google.android.gms.internal.play_billing.k3.y(f13, f21, 1.0f, f21);
                    d5Var.I = y10;
                    float f22 = d5Var.U;
                    d5Var.b((y3 * f22) + d5Var.J + d5Var.T, (y10 * f22) + d5Var.K);
                    d5Var.postOnAnimation(this);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.q5 q5Var = (org.telegram.ui.Wallet.q5) obj;
                org.telegram.ui.Wallet.n5 n5Var2 = q5Var.K;
                if (q5Var.f33376s) {
                    n5Var2.b(System.nanoTime());
                    if (n5Var2.f33243a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, n5Var2.f33244b - n5Var2.d));
                    } else {
                        f12 = 0.0f;
                    }
                    q5Var.R = f12;
                    if (n5Var2.f33243a) {
                        f13 = Math.max(-15.0f, Math.min(15.0f, n5Var2.f33245c - n5Var2.e));
                    }
                    float b10 = org.telegram.ui.Wallet.q5.b(f13 * 1.5f, -15.0f, 15.0f);
                    float f23 = q5Var.R;
                    float f24 = q5Var.S;
                    float y11 = com.google.android.gms.internal.play_billing.k3.y(f23, f24, 1.0f, f24);
                    q5Var.S = y11;
                    float f25 = q5Var.T;
                    float y12 = com.google.android.gms.internal.play_billing.k3.y(b10, f25, 1.0f, f25);
                    q5Var.T = y12;
                    float f26 = q5Var.P;
                    org.telegram.ui.Wallet.l5 l5Var = q5Var.f33370a.f33336f0;
                    float f27 = (y11 * f26) + l5Var.f45708i + q5Var.O;
                    q5Var.N = f27;
                    float f28 = (y12 * f26) + l5Var.d;
                    q5Var.Q = f28;
                    q5Var.a(f27, f28);
                    q5Var.postOnAnimation(this);
                    return;
                }
                return;
        }
    }
}
