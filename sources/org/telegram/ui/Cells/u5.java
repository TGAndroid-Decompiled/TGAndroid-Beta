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
import org.telegram.messenger.tl;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.ym;
import org.telegram.ui.Components.zm;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dw;
import org.telegram.ui.k30;
import org.telegram.ui.si;
import org.telegram.ui.sn;
public final class u5 implements Runnable {
    public final int f23735a;
    public final Object f23736b;

    public u5(Object obj, int i10) {
        this.f23735a = i10;
        this.f23736b = obj;
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
        int i10 = this.f23735a;
        Object obj = this.f23736b;
        switch (i10) {
            case 0:
                v5 v5Var = (v5) obj;
                TextView textView = v5Var.f23846b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(v5Var.f23845a, property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new m.a(this, 14));
                v5Var.d.start();
                return;
            case 1:
                t6 t6Var = (t6) obj;
                t6Var.a();
                RectF rectF = t6Var.f23700r;
                t6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(t6Var.f23704y, 1000L);
                return;
            case 2:
                n7 n7Var = (n7) obj;
                if (n7Var.f22797b == null) {
                    n7Var.f22797b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f22797b;
                int i11 = n7Var.f22799c + 1;
                n7Var.f22799c = i11;
                jVar.f3106b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 3:
                v7 v7Var = (v7) obj;
                RectF rectF2 = v7Var.f23862s;
                v7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(v7Var.F, 1000L);
                return;
            case 4:
                org.telegram.ui.Components.r7 r7Var = (org.telegram.ui.Components.r7) obj;
                org.telegram.ui.Components.i8 i8Var = r7Var.f30084y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i12 = i8Var.I0 + 1;
                    i8Var.I0 = i12;
                    if (i12 == 1) {
                        r7Var.v = true;
                        i8Var.G0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            i8Var.J0();
                        } else if (i8Var.G0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(i8Var.N0);
                            i8Var.K0 = 0L;
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
                org.telegram.ui.Components.i8 i8Var2 = (org.telegram.ui.Components.i8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f11 = i8Var2.H0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = currentTimeMillis - i8Var2.J0;
                    i8Var2.J0 = currentTimeMillis;
                    long j12 = currentTimeMillis - i8Var2.K0;
                    int i13 = i8Var2.I0;
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
                    i8Var2.H0 = f12;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = i8Var2.H0;
                        }
                        i8Var2.M0(playingMessageObject, false);
                    }
                    if (i8Var2.G0 == 1 && i8Var2.I0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j12 > 200 || i8Var2.H0 == 0.0f) {
                            i8Var2.K0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f12);
                        }
                        if (i8Var2.I0 > 0 && i8Var2.H0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(i8Var2.N0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i8Var2.J0 = System.currentTimeMillis();
                return;
            case 6:
                dd ddVar = (dd) obj;
                ddVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                ddVar.f25701f.performHapticFeedback(0);
                Runnable runnable = ddVar.f25704j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                kk kkVar = (kk) obj;
                if (kkVar.S) {
                    kkVar.N.clear();
                    kkVar.P.clear();
                    kkVar.Q.clear();
                    kkVar.l();
                    return;
                }
                return;
            case 8:
                ym ymVar = (ym) obj;
                zm zmVar = ymVar.P;
                if (zmVar.J != null && !zmVar.K) {
                    int computeVerticalScrollOffset = zmVar.f33292r.computeVerticalScrollOffset();
                    if (zmVar.f33292r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (ymVar.e() - ymVar.f32983r) + ymVar.f32982n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (zmVar.E - Math.max(0, computeVerticalScrollOffset - zmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((zmVar.f33292r.getMeasuredHeight() - (zmVar.E - computeVerticalScrollOffset)) - zmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > zmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && zmVar.f33292r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        zmVar.E += f10;
                        zmVar.f33292r.scrollBy(0, i14);
                        ymVar.invalidate();
                    }
                    ymVar.L = true;
                    ymVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 9:
                co coVar = (co) obj;
                u5 u5Var = coVar.U0;
                d6 d6Var = coVar.f25370g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!coVar.H && editField != null && coVar.G && !coVar.f25366e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                ou ouVar = (ou) obj;
                u5 u5Var2 = ouVar.P;
                ju juVar = ouVar.f29381a;
                if (!ouVar.f29390y && juVar != null && ouVar.N && !ouVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    juVar.requestFocus();
                    AndroidUtilities.showKeyboard(juVar);
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
                rz rzVar = (rz) obj;
                if (rzVar.B0.f27752s == null) {
                    rzVar.X1 = false;
                    rzVar.Y();
                    return;
                }
                return;
            case 13:
                q00 q00Var = (q00) obj;
                if (q00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = q00Var.f29724p0 + (((float) elapsedRealtime) / 320.0f);
                    q00Var.f29724p0 = f13;
                    q00Var.setAnimationIdicatorProgress(q00Var.f29717i0.getInterpolation(f13));
                    if (q00Var.f29724p0 > 1.0f) {
                        q00Var.f29724p0 = 1.0f;
                    }
                    if (q00Var.f29724p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(q00Var.f29732v0);
                        return;
                    }
                    q00Var.O = false;
                    q00Var.setEnabled(true);
                    l00 l00Var = q00Var.J;
                    if (l00Var != null) {
                        ((dw) l00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f24383t0, 1000L);
                return;
            case 15:
                TextureView textureView = ((d60) obj).H0.f28206q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new wt(15, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 16:
                j70 j70Var = (j70) obj;
                k70 k70Var = j70Var.f27593y;
                x60 x60Var = k70Var.V;
                if (x60Var != null && x60Var.getAdapter() != null) {
                    k70Var.V.getClass();
                    int R = RecyclerView.R(j70Var);
                    if (R >= 0) {
                        k70Var.T.v(k70Var.V.T(j70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 17:
                pc0 pc0Var = (pc0) obj;
                ValueAnimator valueAnimator = pc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    pc0Var.h.start();
                    return;
                }
                return;
            case 18:
                ((ne0) obj).e();
                return;
            case 19:
                hj0 hj0Var = (hj0) obj;
                hj0Var.f27066y = true;
                ValueAnimator valueAnimator2 = hj0Var.f27067z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                hj0Var.f27065x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                hj0Var.f27067z = ofFloat;
                ofFloat.addUpdateListener(hj0Var.f27044b0);
                hj0Var.f27067z.setInterpolator(new LinearInterpolator());
                hj0Var.f27067z.setDuration(150L);
                hj0Var.f27067z.start();
                return;
            case 20:
                lm0 lm0Var = (lm0) obj;
                si siVar = lm0Var.f28381f2;
                int[] iArr = lm0Var.f28391k2;
                sn snVar = siVar.d;
                iArr[0] = (int) snVar.E9;
                iArr[1] = snVar.Na;
                if (lm0Var.f28385h2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    lm0Var.M0(0.0f, lm0Var.f28391k2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    lm0Var.M0(0.0f, lm0Var.getMeasuredHeight() - lm0Var.f28391k2[1]);
                }
                lm0Var.f28381f2.d.f41734x0.scrollBy(0, dp);
                if (lm0Var.f28383g2) {
                    AndroidUtilities.runOnUIThread(lm0Var.C2);
                    return;
                }
                return;
            case 21:
                sl0 sl0Var = (sl0) obj;
                u5 u5Var3 = sl0Var.f30553i0;
                if (sl0Var.f30557n) {
                    AndroidUtilities.cancelRunOnUIThread(u5Var3);
                    AndroidUtilities.runOnUIThread(u5Var3, 4000L);
                    return;
                }
                sl0Var.U = false;
                sl0Var.invalidate();
                return;
            case 22:
                nm0 nm0Var = (nm0) obj;
                RecyclerView recyclerView = nm0Var.f28967a;
                if (recyclerView != null) {
                    if (nm0Var.f28971g) {
                        recyclerView.scrollBy(0, -nm0Var.f28972i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (nm0Var.h) {
                        recyclerView.scrollBy(0, nm0Var.f28972i);
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
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f24495b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f24498d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    mn0 mn0Var = scrollSlidingTextTabStrip.f24494b;
                    if (mn0Var != null) {
                        mn0Var.k0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) obj;
                bw0 bw0Var = shutterButton.e;
                if (bw0Var != null) {
                    final am amVar = (am) bw0Var;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = amVar.e;
                    ri riVar = chatAttachAlertPhotoLayout.f27704b;
                    km kmVar = chatAttachAlertPhotoLayout.R;
                    int i15 = riVar.T0;
                    org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
                    if ((i15 == 2 || (o2Var instanceof sn)) && !chatAttachAlertPhotoLayout.f24263s0 && !riVar.V && chatAttachAlertPhotoLayout.P != null && !riVar.G) {
                        if (o2Var == null) {
                            o2Var = LaunchActivity.R();
                        }
                        if (o2Var != null && o2Var.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.f24268w0) {
                                tl.q(R.string.GlobalAttachVideoRestricted, new vc(chatAttachAlertPhotoLayout.P, amVar.f24751c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.Q0 = true;
                                o2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    chatAttachAlertPhotoLayout.S[i16].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(zr.f33337f).start();
                                }
                                ViewPropertyAnimator duration2 = chatAttachAlertPhotoLayout.f24261r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                                zr zrVar = zr.f33337f;
                                duration2.setInterpolator(zrVar).start();
                                chatAttachAlertPhotoLayout.f24259q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(zrVar).start();
                                org.telegram.ui.ActionBar.o2 o2Var2 = riVar.f30146f0;
                                if ((o2Var2 instanceof sn) && ((sn) o2Var2).x()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                amVar.f24749a = AndroidUtilities.generateVideoPath(z11);
                                AndroidUtilities.updateViewVisibilityAnimated(kmVar, true);
                                kmVar.setText(AndroidUtilities.formatLongDuration(0));
                                chatAttachAlertPhotoLayout.f24240g0 = 0;
                                chatAttachAlertPhotoLayout.f24242h0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = amVar.e;
                                                if (chatAttachAlertPhotoLayout2.f24242h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24240g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24240g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24242h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(amVar.e.f24242h0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                AndroidUtilities.lockOrientation(o2Var.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                                File file = amVar.f24749a;
                                if (riVar.T0 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z12, new org.telegram.ui.Components.s(amVar, 21), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = amVar.e;
                                                if (chatAttachAlertPhotoLayout2.f24242h0 != null) {
                                                    int i17 = chatAttachAlertPhotoLayout2.f24240g0 + 1;
                                                    chatAttachAlertPhotoLayout2.f24240g0 = i17;
                                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i17));
                                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f24242h0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                AndroidUtilities.runOnUIThread(amVar.e.f24242h0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.P);
                                chatAttachAlertPhotoLayout.f24248k0.a(cw0.f25480b);
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
                vx0 vx0Var = (vx0) obj;
                View view = vx0Var.f32072s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        vx0Var.f32072s.setVisibility(0);
                        vx0Var.f32072s.setAlpha(0.0f);
                    }
                    vx0Var.f32072s.animate().setListener(null).cancel();
                    vx0Var.f32072s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                vx0Var.f32068c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 26:
                ((ThemeEditorView) obj).f24534a = false;
                try {
                    org.telegram.ui.ActionBar.k6.k();
                    org.telegram.ui.ActionBar.k6.n();
                    org.telegram.ui.ActionBar.k6.p();
                    org.telegram.ui.ActionBar.k6.j(false, false);
                    org.telegram.ui.ActionBar.r6.e0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.I1;
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
                    float f15 = k91Var.f27972f0 + (((float) elapsedRealtime3) / 200.0f);
                    k91Var.f27972f0 = f15;
                    k91Var.setAnimationIdicatorProgress(k91Var.f27964a0.getInterpolation(f15));
                    if (k91Var.f27972f0 > 1.0f) {
                        k91Var.f27972f0 = 1.0f;
                    }
                    if (k91Var.f27972f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k91Var.f27975i0);
                        return;
                    }
                    k91Var.J = false;
                    k91Var.setEnabled(true);
                    j91 j91Var = k91Var.f27989y;
                    if (j91Var != null) {
                        ((l2.f) j91Var).I(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                k30 k30Var = (k30) obj;
                if (k30Var.f31670b && k30Var.Q0.f42321z0 == null) {
                    k30Var.f31678g0 = false;
                    org.telegram.ui.Components.voip.l0.a(k30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(k30Var.f31679h0, 3000L);
                return;
            default:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) obj;
                if (z0Var.d && z0Var.e && z0Var.f35478k != null) {
                    if (SystemClock.elapsedRealtime() - z0Var.f35479l >= 30000) {
                        z0Var.f("heartbeat timed out");
                        return;
                    }
                    z0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - z0Var.f35479l) + " ms ago");
                    z0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
        }
    }
}
