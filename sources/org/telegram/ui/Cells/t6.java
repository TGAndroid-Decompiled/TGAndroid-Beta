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
import org.telegram.messenger.yh;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.dn;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vi;
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
public final class t6 implements Runnable {
    public final int f22095a;
    public final Object f22096b;

    public t6(Object obj, int i10) {
        this.f22095a = i10;
        this.f22096b = obj;
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
        int i10 = this.f22095a;
        float f12 = 0.0f;
        Object obj = this.f22096b;
        switch (i10) {
            case 0:
                u6 u6Var = (u6) obj;
                u6Var.a();
                RectF rectF = u6Var.f22528f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) obj;
                if (n7Var.f21569b == null) {
                    n7Var.f21569b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f21569b;
                int i11 = n7Var.f21571c + 1;
                n7Var.f21571c = i11;
                jVar.f1487b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) obj;
                RectF rectF2 = w7Var.f22624n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f22629y, 1000L);
                return;
            case 3:
                org.telegram.ui.Components.v7 v7Var = (org.telegram.ui.Components.v7) obj;
                org.telegram.ui.Components.m8 m8Var = v7Var.f29909y;
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
            case 4:
                org.telegram.ui.Components.m8 m8Var2 = (org.telegram.ui.Components.m8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f13 = m8Var2.I0;
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
                    float f14 = ((f13 * f7) + ((float) ((j10 * j11) - j11))) / ((float) duration);
                    if (f14 < 0.0f) {
                        f14 = 0.0f;
                    }
                    m8Var2.I0 = f14;
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
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f14);
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
            case 5:
                hd hdVar = (hd) obj;
                hdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                hdVar.f25635f.performHapticFeedback(0);
                Runnable runnable = hdVar.f25638j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ok okVar = (ok) obj;
                if (okVar.S) {
                    okVar.N.clear();
                    okVar.P.clear();
                    okVar.Q.clear();
                    okVar.l();
                    return;
                }
                return;
            case 7:
                dn dnVar = (dn) obj;
                en enVar = dnVar.P;
                if (enVar.J != null && !enVar.K) {
                    int computeVerticalScrollOffset = enVar.f24746r.computeVerticalScrollOffset();
                    if (enVar.f24746r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (dnVar.e() - dnVar.f24454r) + dnVar.f24453n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (enVar.E - Math.max(0, computeVerticalScrollOffset - enVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((enVar.f24746r.getMeasuredHeight() - (enVar.E - computeVerticalScrollOffset)) - enVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > enVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && enVar.f24746r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        enVar.E += f10;
                        enVar.f24746r.scrollBy(0, i14);
                        dnVar.invalidate();
                    }
                    dnVar.L = true;
                    dnVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 8:
                io ioVar = (io) obj;
                t6 t6Var = ioVar.U0;
                d6 d6Var = ioVar.f26014g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!ioVar.H && editField != null && ioVar.G && !ioVar.f26010e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                vu vuVar = (vu) obj;
                t6 t6Var2 = vuVar.P;
                qu quVar = vuVar.f30649a;
                if (!vuVar.f30658y && quVar != null && vuVar.N && !vuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    quVar.requestFocus();
                    AndroidUtilities.showKeyboard(quVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    return;
                }
                return;
            case 10:
                c2.b bVar = (c2.b) ((bi.m4) obj).d;
                if (bVar.f4118a && !((ArrayList) bVar.d).isEmpty() && !((AnimatorSet) bVar.f4120c).isRunning()) {
                    try {
                        ((AnimatorSet) bVar.f4120c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 11:
                wz wzVar = (wz) obj;
                if (wzVar.B0.f26757s == null) {
                    wzVar.X1 = false;
                    wzVar.Y();
                    return;
                }
                return;
            case 12:
                w00 w00Var = (w00) obj;
                if (w00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f15 = w00Var.f30714p0 + (((float) elapsedRealtime) / 320.0f);
                    w00Var.f30714p0 = f15;
                    w00Var.setAnimationIdicatorProgress(w00Var.f30707i0.getInterpolation(f15));
                    if (w00Var.f30714p0 > 1.0f) {
                        w00Var.f30714p0 = 1.0f;
                    }
                    if (w00Var.f30714p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(w00Var.f30722v0);
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
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.Q0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f23178t0, 1000L);
                return;
            case 14:
                TextureView textureView = ((i60) obj).H0.f28186q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new f60(1, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 15:
                o70 o70Var = (o70) obj;
                p70 p70Var = o70Var.f27898x;
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
            case 16:
                vc0 vc0Var = (vc0) obj;
                ValueAnimator valueAnimator = vc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    vc0Var.h.start();
                    return;
                }
                return;
            case 17:
                ((re0) obj).e();
                return;
            case 18:
                jj0 jj0Var = (jj0) obj;
                jj0Var.f26394y = true;
                ValueAnimator valueAnimator2 = jj0Var.f26395z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                jj0Var.f26393x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                jj0Var.f26395z = ofFloat;
                ofFloat.addUpdateListener(jj0Var.f26372b0);
                jj0Var.f26395z.setInterpolator(new LinearInterpolator());
                jj0Var.f26395z.setDuration(150L);
                jj0Var.f26395z.start();
                return;
            case 19:
                mm0 mm0Var = (mm0) obj;
                fj fjVar = mm0Var.f27424f2;
                int[] iArr = mm0Var.f27434k2;
                fo foVar = fjVar.d;
                iArr[0] = (int) foVar.f36104s9;
                iArr[1] = foVar.Ba;
                if (mm0Var.f27428h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.f27434k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.getMeasuredHeight() - mm0Var.f27434k2[1]);
                }
                mm0Var.f27424f2.d.f36160x0.scrollBy(0, dp);
                if (mm0Var.f27426g2) {
                    AndroidUtilities.runOnUIThread(mm0Var.B2);
                    return;
                }
                return;
            case 20:
                tl0 tl0Var = (tl0) obj;
                t6 t6Var3 = tl0Var.f29429i0;
                if (tl0Var.f29433n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                }
                tl0Var.U = false;
                tl0Var.invalidate();
                return;
            case 21:
                om0 om0Var = (om0) obj;
                RecyclerView recyclerView = om0Var.f27988a;
                if (recyclerView != null) {
                    if (om0Var.f27992g) {
                        recyclerView.scrollBy(0, -om0Var.f27993i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (om0Var.h) {
                        recyclerView.scrollBy(0, om0Var.f27993i);
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
                    float f16 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f23289b0));
                    scrollSlidingTextTabStrip.S = f16;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f16));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f23292d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    nn0 nn0Var = scrollSlidingTextTabStrip.f23288b;
                    if (nn0Var != null) {
                        nn0Var.B0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ShutterButton shutterButton = (ShutterButton) obj;
                cw0 cw0Var = shutterButton.e;
                if (cw0Var != null) {
                    final fm fmVar = (fm) cw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = fmVar.e;
                    vi viVar = chatAttachAlertPhotoLayout.f27671b;
                    pm pmVar = chatAttachAlertPhotoLayout.R;
                    int i15 = viVar.T0;
                    org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
                    if ((i15 == 2 || (m2Var instanceof fo)) && !chatAttachAlertPhotoLayout.f23058s0 && !viVar.V && chatAttachAlertPhotoLayout.P != null && !viVar.G) {
                        if (m2Var == null) {
                            m2Var = LaunchActivity.R();
                        }
                        if (m2Var != null && m2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f23063w0) {
                                yh.p(R.string.GlobalAttachVideoRestricted, new zc(chatAttachAlertPhotoLayout.P, fmVar.f25080c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                m2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(es.f24771f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f23056r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                es esVar = es.f24771f;
                                duration2.setInterpolator(esVar).start();
                                chatAttachAlertPhotoLayout.f23054q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
                                org.telegram.ui.ActionBar.m2 m2Var2 = viVar.f30001f0;
                                if ((m2Var2 instanceof fo) && ((fo) m2Var2).x()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                fmVar.f25078a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(pmVar, true);
                                pmVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f23035g0 = 0;
                                chatAttachAlertPhotoLayout.f23037h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = fmVar.e;
                                                if (chatAttachAlertPhotoLayout2.f23037h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f23035g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f23035g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f23037h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(fmVar.e.f23037h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(m2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = fmVar.f25078a;
                                if (viVar.T0 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new org.telegram.ui.Components.s(fmVar, 21), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = fmVar.e;
                                                if (chatAttachAlertPhotoLayout2.f23037h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f23035g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f23035g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f23037h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(fmVar.e.f23037h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f23043k0.a(dw0.f24497b);
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
                wx0 wx0Var = (wx0) obj;
                View view = wx0Var.f31001s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        wx0Var.f31001s.setVisibility(0);
                        wx0Var.f31001s.setAlpha(0.0f);
                    }
                    wx0Var.f31001s.animate().setListener(null).cancel();
                    wx0Var.f31001s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                wx0Var.f30997c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 25:
                j91 j91Var = (j91) obj;
                if (j91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f17 = j91Var.f26282f0 + (((float) elapsedRealtime3) / 200.0f);
                    j91Var.f26282f0 = f17;
                    j91Var.setAnimationIdicatorProgress(j91Var.f26274a0.getInterpolation(f17));
                    if (j91Var.f26282f0 > 1.0f) {
                        j91Var.f26282f0 = 1.0f;
                    }
                    if (j91Var.f26282f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(j91Var.f26285i0);
                        return;
                    }
                    j91Var.J = false;
                    j91Var.setEnabled(true);
                    i91 i91Var = j91Var.f26299y;
                    if (i91Var != null) {
                        ((l2.f) i91Var).j(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                e40 e40Var = (e40) obj;
                if (e40Var.f30281b && e40Var.Q0.f38546z0 == null) {
                    e40Var.f30289g0 = false;
                    org.telegram.ui.Components.voip.l0.a(e40Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(e40Var.f30290h0, 3000L);
                return;
            case 27:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) obj;
                if (y0Var.d && y0Var.e && y0Var.f33869k != null) {
                    if (SystemClock.elapsedRealtime() - y0Var.f33870l >= 30000) {
                        y0Var.f("heartbeat timed out");
                        return;
                    }
                    y0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - y0Var.f33870l) + " ms ago");
                    y0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) obj;
                if (z4Var.f23964a != null && z4Var.d != null) {
                    z4Var.E0();
                    if (z4Var.f33937r) {
                        z4Var.f23964a.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) obj;
                org.telegram.ui.Wallet.l5 l5Var = c5Var.f33018x;
                if (c5Var.isAttachedToWindow()) {
                    l5Var.b(System.nanoTime());
                    if (l5Var.f33434a) {
                        f11 = Math.max(-15.0f, Math.min(15.0f, l5Var.f33435b - l5Var.d));
                    } else {
                        f11 = 0.0f;
                    }
                    c5Var.G = f11;
                    if (l5Var.f33434a) {
                        f12 = Math.max(-15.0f, Math.min(15.0f, l5Var.f33436c - l5Var.e));
                    }
                    float f18 = c5Var.G;
                    float f19 = c5Var.H;
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(f18, f19, 1.0f, f19);
                    c5Var.H = y3;
                    float f20 = c5Var.I;
                    float y10 = com.google.android.gms.internal.play_billing.k3.y(f12, f20, 1.0f, f20);
                    c5Var.I = y10;
                    float f21 = c5Var.U;
                    c5Var.b((y3 * f21) + c5Var.J + c5Var.T, (y10 * f21) + c5Var.K);
                    c5Var.postOnAnimation(this);
                    return;
                }
                return;
        }
    }
}
