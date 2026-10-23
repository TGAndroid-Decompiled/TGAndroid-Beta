package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.sl;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dw;
import org.telegram.ui.k30;
import org.telegram.ui.si;
import org.telegram.ui.sn;
public final class u5 implements Runnable {
    public final int f23734a;
    public final Object f23735b;

    public u5(Object obj, int i10) {
        this.f23734a = i10;
        this.f23735b = obj;
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
        int i10 = this.f23734a;
        Object obj = this.f23735b;
        switch (i10) {
            case 0:
                v5 v5Var = (v5) obj;
                TextView textView = v5Var.f23845b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(v5Var.f23844a, property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new m.a(this, 14));
                v5Var.d.start();
                return;
            case 1:
                t6 t6Var = (t6) obj;
                t6Var.a();
                RectF rectF = t6Var.f23699r;
                t6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(t6Var.f23703y, 1000L);
                return;
            case 2:
                n7 n7Var = (n7) obj;
                if (n7Var.f22796b == null) {
                    n7Var.f22796b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f22796b;
                int i11 = n7Var.f22798c + 1;
                n7Var.f22798c = i11;
                jVar.f3106b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 3:
                v7 v7Var = (v7) obj;
                RectF rectF2 = v7Var.f23861s;
                v7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(v7Var.F, 1000L);
                return;
            case 4:
                org.telegram.ui.Components.t7 t7Var = (org.telegram.ui.Components.t7) obj;
                org.telegram.ui.Components.k8 k8Var = t7Var.f30659y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i12 = k8Var.I0 + 1;
                    k8Var.I0 = i12;
                    if (i12 == 1) {
                        t7Var.v = true;
                        k8Var.G0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            k8Var.J0();
                        } else if (k8Var.G0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(k8Var.N0);
                            k8Var.K0 = 0L;
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
            case 5:
                org.telegram.ui.Components.k8 k8Var2 = (org.telegram.ui.Components.k8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f11 = k8Var2.H0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - k8Var2.J0;
                    k8Var2.J0 = currentTimeMillis;
                    long j12 = currentTimeMillis - k8Var2.K0;
                    int i13 = k8Var2.I0;
                    if (i13 == 1) {
                        j10 = 3;
                    } else if (i13 == 2) {
                        j10 = 6;
                    } else {
                        j10 = 12;
                    }
                    float f12 = ((f11 * f7) + ((float) ((j10 * j11) - j11))) / ((float) duration);
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    k8Var2.H0 = f12;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = k8Var2.H0;
                        }
                        k8Var2.M0(playingMessageObject, false);
                    }
                    if (k8Var2.G0 == 1 && k8Var2.I0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j12 > 200 || k8Var2.H0 == 0.0f) {
                            k8Var2.K0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f12);
                        }
                        if (k8Var2.I0 > 0 && k8Var2.H0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(k8Var2.N0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                k8Var2.J0 = System.currentTimeMillis();
                return;
            case 6:
                fd fdVar = (fd) obj;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f26287f.performHapticFeedback(0);
                Runnable runnable = fdVar.f26290j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                mk mkVar = (mk) obj;
                if (mkVar.S) {
                    mkVar.N.clear();
                    mkVar.P.clear();
                    mkVar.Q.clear();
                    mkVar.l();
                    return;
                }
                return;
            case 8:
                an anVar = (an) obj;
                bn bnVar = anVar.P;
                if (bnVar.J != null && !bnVar.K) {
                    int computeVerticalScrollOffset = bnVar.f25102r.computeVerticalScrollOffset();
                    if (bnVar.f25102r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (anVar.e() - anVar.f24781r) + anVar.f24780n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (bnVar.E - Math.max(0, computeVerticalScrollOffset - bnVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((bnVar.f25102r.getMeasuredHeight() - (bnVar.E - computeVerticalScrollOffset)) - bnVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > bnVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && bnVar.f25102r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        bnVar.E += f10;
                        bnVar.f25102r.scrollBy(0, i14);
                        anVar.invalidate();
                    }
                    anVar.L = true;
                    anVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 9:
                fo foVar = (fo) obj;
                u5 u5Var = foVar.U0;
                d6 d6Var = foVar.f26398g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!foVar.H && editField != null && foVar.G && !foVar.f26394e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(u5Var);
                        AndroidUtilities.runOnUIThread(u5Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                qu quVar = (qu) obj;
                u5 u5Var2 = quVar.P;
                lu luVar = quVar.f29989a;
                if (!quVar.f29998y && luVar != null && quVar.N && !quVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    luVar.requestFocus();
                    AndroidUtilities.showKeyboard(luVar);
                    AndroidUtilities.cancelRunOnUIThread(u5Var2);
                    AndroidUtilities.runOnUIThread(u5Var2, 100L);
                    return;
                }
                return;
            case 11:
                c2.b bVar = (c2.b) ((ci.o3) obj).d;
                if (bVar.f4493a && !((ArrayList) bVar.d).isEmpty() && !((AnimatorSet) bVar.f4495c).isRunning()) {
                    try {
                        ((AnimatorSet) bVar.f4495c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 12:
                tz tzVar = (tz) obj;
                if (tzVar.B0.f28091s == null) {
                    tzVar.X1 = false;
                    tzVar.Y();
                    return;
                }
                return;
            case 13:
                s00 s00Var = (s00) obj;
                if (s00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = s00Var.f30323p0 + (((float) elapsedRealtime) / 320.0f);
                    s00Var.f30323p0 = f13;
                    s00Var.setAnimationIdicatorProgress(s00Var.f30316i0.getInterpolation(f13));
                    if (s00Var.f30323p0 > 1.0f) {
                        s00Var.f30323p0 = 1.0f;
                    }
                    if (s00Var.f30323p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(s00Var.f30331v0);
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
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f24382t0, 1000L);
                return;
            case 15:
                TextureView textureView = ((f60) obj).H0.f28872q0;
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
            case 16:
                l70 l70Var = (l70) obj;
                m70 m70Var = l70Var.f28238y;
                z60 z60Var = m70Var.V;
                if (z60Var != null && z60Var.getAdapter() != null) {
                    m70Var.V.getClass();
                    int R = RecyclerView.R(l70Var);
                    if (R >= 0) {
                        m70Var.T.v(m70Var.V.T(l70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 17:
                rc0 rc0Var = (rc0) obj;
                ValueAnimator valueAnimator = rc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    rc0Var.h.start();
                    return;
                }
                return;
            case 18:
                ((pe0) obj).e();
                return;
            case 19:
                ij0 ij0Var = (ij0) obj;
                ij0Var.f27354y = true;
                ValueAnimator valueAnimator2 = ij0Var.f27355z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ij0Var.f27353x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ij0Var.f27355z = ofFloat;
                ofFloat.addUpdateListener(ij0Var.f27332b0);
                ij0Var.f27355z.setInterpolator(new LinearInterpolator());
                ij0Var.f27355z.setDuration(150L);
                ij0Var.f27355z.start();
                return;
            case 20:
                mm0 mm0Var = (mm0) obj;
                si siVar = mm0Var.f28690f2;
                int[] iArr = mm0Var.f28700k2;
                sn snVar = siVar.d;
                iArr[0] = (int) snVar.E9;
                iArr[1] = snVar.Na;
                if (mm0Var.f28694h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.f28700k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    mm0Var.M0(0.0f, mm0Var.getMeasuredHeight() - mm0Var.f28700k2[1]);
                }
                mm0Var.f28690f2.d.f41737x0.scrollBy(0, dp);
                if (mm0Var.f28692g2) {
                    AndroidUtilities.runOnUIThread(mm0Var.C2);
                    return;
                }
                return;
            case 21:
                tl0 tl0Var = (tl0) obj;
                u5 u5Var3 = tl0Var.f30832i0;
                if (tl0Var.f30836n) {
                    AndroidUtilities.cancelRunOnUIThread(u5Var3);
                    AndroidUtilities.runOnUIThread(u5Var3, 4000L);
                    return;
                }
                tl0Var.U = false;
                tl0Var.invalidate();
                return;
            case 22:
                om0 om0Var = (om0) obj;
                RecyclerView recyclerView = om0Var.f29232a;
                if (recyclerView != null) {
                    if (om0Var.f29236g) {
                        recyclerView.scrollBy(0, -om0Var.f29237i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (om0Var.h) {
                        recyclerView.scrollBy(0, om0Var.f29237i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 23:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f24494b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f24497d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    nn0 nn0Var = scrollSlidingTextTabStrip.f24493b;
                    if (nn0Var != null) {
                        nn0Var.k0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) obj;
                cw0 cw0Var = shutterButton.e;
                if (cw0Var != null) {
                    final cm cmVar = (cm) cw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.e;
                    ti tiVar = chatAttachAlertPhotoLayout.f28366b;
                    mm mmVar = chatAttachAlertPhotoLayout.R;
                    int i15 = tiVar.T0;
                    org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
                    if ((i15 == 2 || (o2Var instanceof sn)) && !chatAttachAlertPhotoLayout.f24262s0 && !tiVar.V && chatAttachAlertPhotoLayout.P != null && !tiVar.G) {
                        if (o2Var == null) {
                            o2Var = LaunchActivity.R();
                        }
                        if (o2Var != null && o2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f24267w0) {
                                sl.q(R.string.GlobalAttachVideoRestricted, new xc(chatAttachAlertPhotoLayout.P, cmVar.f25379c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                o2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(bs.f25133f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f24260r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                bs bsVar = bs.f25133f;
                                duration2.setInterpolator(bsVar).start();
                                chatAttachAlertPhotoLayout.f24258q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(bsVar).start();
                                org.telegram.ui.ActionBar.o2 o2Var2 = tiVar.f30730f0;
                                if ((o2Var2 instanceof sn) && ((sn) o2Var2).x()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                cmVar.f25377a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(mmVar, true);
                                mmVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f24239g0 = 0;
                                chatAttachAlertPhotoLayout.f24241h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = cmVar.e;
                                                if (chatAttachAlertPhotoLayout2.f24241h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24239g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24239g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24241h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(cmVar.e.f24241h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(o2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = cmVar.f25377a;
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
                                                if (chatAttachAlertPhotoLayout2.f24241h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24239g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24239g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24241h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(cmVar.e.f24241h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f24247k0.a(dw0.f25747b);
                                chatAttachAlertPhotoLayout.P.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.v = false;
                    return;
                }
                return;
            case 25:
                wx0 wx0Var = (wx0) obj;
                View view = wx0Var.f32376s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        wx0Var.f32376s.setVisibility(0);
                        wx0Var.f32376s.setAlpha(0.0f);
                    }
                    wx0Var.f32376s.animate().setListener(null).cancel();
                    wx0Var.f32376s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                wx0Var.f32372c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 26:
                ((ThemeEditorView) obj).f24533a = false;
                try {
                    org.telegram.ui.ActionBar.k6.k();
                    org.telegram.ui.ActionBar.k6.n();
                    org.telegram.ui.ActionBar.k6.p();
                    org.telegram.ui.ActionBar.k6.j(false, false);
                    org.telegram.ui.ActionBar.r6.e0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.J1;
                    if (launchActivity != null) {
                        launchActivity.d0();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 27:
                k91 k91Var = (k91) obj;
                if (k91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f15 = k91Var.f27969f0 + (((float) elapsedRealtime3) / 200.0f);
                    k91Var.f27969f0 = f15;
                    k91Var.setAnimationIdicatorProgress(k91Var.f27961a0.getInterpolation(f15));
                    if (k91Var.f27969f0 > 1.0f) {
                        k91Var.f27969f0 = 1.0f;
                    }
                    if (k91Var.f27969f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k91Var.f27972i0);
                        return;
                    }
                    k91Var.J = false;
                    k91Var.setEnabled(true);
                    j91 j91Var = k91Var.f27986y;
                    if (j91Var != null) {
                        ((l2.f) j91Var).I(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                k30 k30Var = (k30) obj;
                if (k30Var.f31700b && k30Var.Q0.f42275z0 == null) {
                    k30Var.f31708g0 = false;
                    org.telegram.ui.Components.voip.l0.a(k30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(k30Var.f31709h0, 3000L);
                return;
            default:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) obj;
                if (z0Var.d && z0Var.e && z0Var.f35476k != null) {
                    if (SystemClock.elapsedRealtime() - z0Var.f35477l >= 30000) {
                        z0Var.f("heartbeat timed out");
                        return;
                    }
                    z0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - z0Var.f35477l) + " ms ago");
                    z0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
        }
    }
}
