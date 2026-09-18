package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.uw;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.a40;
import org.telegram.ui.qi;
import org.telegram.ui.tw;
import org.telegram.ui.zn;
public final class t6 implements Runnable {
    public final int f21172a;
    public final Object f21173b;

    public t6(Object obj, int i10) {
        this.f21172a = i10;
        this.f21173b = obj;
    }

    @Override
    public final void run() {
        int n10;
        int i10;
        int q6;
        long j3;
        float f7;
        boolean z10;
        float f10;
        int dp;
        int i11 = this.f21172a;
        Object obj = this.f21173b;
        switch (i11) {
            case 0:
                u6 u6Var = (u6) obj;
                u6Var.a();
                RectF rectF = u6Var.f21614f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) obj;
                if (n7Var.f20665b == null) {
                    n7Var.f20665b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f20665b;
                int i12 = n7Var.f20667c + 1;
                n7Var.f20667c = i12;
                jVar.f2334b = i12;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) obj;
                RectF rectF2 = w7Var.f21771n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f21776y, 1000L);
                return;
            case 3:
                da daVar = (da) obj;
                if (daVar.N && daVar.E != null) {
                    if (daVar.Z && daVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (daVar.W != null) {
                        n10 = daVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!daVar.Z && !daVar.f20137k0) {
                        if (daVar.O) {
                            if (daVar.W.getBottom() - n10 < daVar.F.getMeasuredHeight() - daVar.p()) {
                                i10 = daVar.W.getBottom() - daVar.F.getMeasuredHeight();
                                q6 = daVar.p();
                                n10 = i10 + q6;
                            }
                        } else if (daVar.W.getTop() + n10 > daVar.q()) {
                            i10 = -daVar.W.getTop();
                            q6 = daVar.q();
                            n10 = i10 + q6;
                        }
                    }
                    wl0 wl0Var = daVar.E;
                    if (wl0Var != null) {
                        if (!daVar.O) {
                            n10 = -n10;
                        }
                        wl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) obj;
                org.telegram.ui.Components.j8 j8Var = s7Var.f28074y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i13 = j8Var.J0 + 1;
                    j8Var.J0 = i13;
                    if (i13 == 1) {
                        s7Var.v = true;
                        j8Var.H0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            j8Var.C0();
                        } else if (j8Var.H0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(j8Var.N0);
                            j8Var.L0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    } else if (i13 == 2) {
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
                org.telegram.ui.Components.j8 j8Var2 = (org.telegram.ui.Components.j8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f11 = j8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - j8Var2.K0;
                    j8Var2.K0 = currentTimeMillis;
                    long j11 = currentTimeMillis - j8Var2.L0;
                    int i14 = j8Var2.J0;
                    if (i14 == 1) {
                        j3 = 3;
                    } else if (i14 == 2) {
                        j3 = 6;
                    } else {
                        j3 = 12;
                    }
                    float f12 = ((f11 * f7) + ((float) ((j3 * j10) - j10))) / ((float) duration);
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    j8Var2.I0 = f12;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = j8Var2.I0;
                        }
                        j8Var2.G0(playingMessageObject, false);
                    }
                    if (j8Var2.H0 == 1 && j8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j11 > 200 || j8Var2.I0 == 0.0f) {
                            j8Var2.L0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f12);
                        }
                        if (j8Var2.J0 > 0 && j8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(j8Var2.N0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                j8Var2.K0 = System.currentTimeMillis();
                return;
            case 6:
                fd fdVar = (fd) obj;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f24128f.performHapticFeedback(0);
                Runnable runnable = fdVar.f24131j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                nk nkVar = (nk) obj;
                if (nkVar.S) {
                    nkVar.N.clear();
                    nkVar.P.clear();
                    nkVar.Q.clear();
                    nkVar.l();
                    return;
                }
                return;
            case 8:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.P;
                if (qmVar.J != null && !qmVar.K) {
                    int computeVerticalScrollOffset = qmVar.f27684r.computeVerticalScrollOffset();
                    if (qmVar.f27684r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (pmVar.e() - pmVar.f27267r) + pmVar.f27266n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (qmVar.E - Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((qmVar.f27684r.getMeasuredHeight() - (qmVar.E - computeVerticalScrollOffset)) - qmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > qmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i15 = (int) f10;
                    if (Math.abs(i15) > 0 && qmVar.f27684r.canScrollVertically(i15) && (f10 <= 0.0f || !z10)) {
                        qmVar.E += f10;
                        qmVar.f27684r.scrollBy(0, i15);
                        pmVar.invalidate();
                    }
                    pmVar.L = true;
                    pmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 9:
                un unVar = (un) obj;
                t6 t6Var = unVar.U0;
                d6 d6Var = unVar.f28748g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!unVar.H && editField != null && unVar.G && !unVar.f28744e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        AndroidUtilities.runOnUIThread(t6Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ju juVar = (ju) obj;
                t6 t6Var2 = juVar.P;
                eu euVar = juVar.f25450a;
                if (!juVar.f25459y && euVar != null && juVar.N && !juVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    euVar.requestFocus();
                    AndroidUtilities.showKeyboard(euVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    return;
                }
                return;
            case 11:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) obj).d;
                if (mVar.f7326a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7328c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7328c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 12:
                kz kzVar = (kz) obj;
                if (kzVar.B0.f29131s == null) {
                    kzVar.X1 = false;
                    kzVar.Y();
                    return;
                }
                return;
            case 13:
                k00 k00Var = (k00) obj;
                if (k00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = k00Var.f25507p0 + (((float) elapsedRealtime) / 320.0f);
                    k00Var.f25507p0 = f13;
                    k00Var.setAnimationIdicatorProgress(k00Var.f25500i0.getInterpolation(f13));
                    if (k00Var.f25507p0 > 1.0f) {
                        k00Var.f25507p0 = 1.0f;
                    }
                    if (k00Var.f25507p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k00Var.f25515v0);
                        return;
                    }
                    k00Var.O = false;
                    k00Var.setEnabled(true);
                    e00 e00Var = k00Var.J;
                    if (e00Var != null) {
                        ((tw) e00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f22243s0, 1000L);
                return;
            case 15:
                TextureView textureView = ((u50) obj).H0.f22848o0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new uw(12, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 16:
                a60 a60Var = (a60) obj;
                jm0 jm0Var = a60Var.f22526s;
                ki.g0 g0Var = a60Var.K;
                if (g0Var != null && g0Var.f13699a == 3) {
                    long elapsedRealtime2 = (SystemClock.elapsedRealtime() + g0Var.f13700b) - g0Var.f13701c;
                    a60Var.f22515f0 = elapsedRealtime2;
                    jm0Var.setProgress(Math.min(1.0f, ((float) elapsedRealtime2) / ((float) g0Var.d)));
                    jm0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 17:
                z60 z60Var = (z60) obj;
                a70 a70Var = z60Var.f30744x;
                n60 n60Var = a70Var.V;
                if (n60Var != null && n60Var.getAdapter() != null) {
                    a70Var.V.getClass();
                    int S = RecyclerView.S(z60Var);
                    if (S >= 0) {
                        a70Var.T.v(a70Var.V.U(z60Var), S);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 18:
                ec0 ec0Var = (ec0) obj;
                ValueAnimator valueAnimator = ec0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ec0Var.h.start();
                    return;
                }
                return;
            case 19:
                be0 be0Var = (be0) obj;
                be0Var.e();
                AndroidUtilities.runOnUIThread(be0Var.R, 100L);
                return;
            case 20:
                ti0 ti0Var = (ti0) obj;
                ti0Var.f28417y = true;
                ValueAnimator valueAnimator2 = ti0Var.f28418z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ti0Var.f28416x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ti0Var.f28418z = ofFloat;
                ofFloat.addUpdateListener(ti0Var.f28395b0);
                ti0Var.f28418z.setInterpolator(new LinearInterpolator());
                ti0Var.f28418z.setDuration(150L);
                ti0Var.f28418z.start();
                return;
            case 21:
                wl0 wl0Var2 = (wl0) obj;
                qi qiVar = wl0Var2.f30075h2;
                int[] iArr = wl0Var2.f30084m2;
                zn znVar = qiVar.d;
                iArr[0] = (int) znVar.f40433s9;
                iArr[1] = znVar.Aa;
                if (wl0Var2.f30079j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    wl0Var2.N0(0.0f, wl0Var2.f30084m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    wl0Var2.N0(0.0f, wl0Var2.getMeasuredHeight() - wl0Var2.f30084m2[1]);
                }
                wl0Var2.f30075h2.d.f40488x0.scrollBy(0, dp);
                if (wl0Var2.f30077i2) {
                    AndroidUtilities.runOnUIThread(wl0Var2.D2);
                    return;
                }
                return;
            case 22:
                dl0 dl0Var = (dl0) obj;
                t6 t6Var3 = dl0Var.f23615i0;
                if (dl0Var.f23619n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                }
                dl0Var.U = false;
                dl0Var.invalidate();
                return;
            case 23:
                yl0 yl0Var = (yl0) obj;
                RecyclerView recyclerView = yl0Var.f30610a;
                if (recyclerView != null) {
                    if (yl0Var.f30614g) {
                        recyclerView.scrollBy(0, -yl0Var.f30615i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (yl0Var.h) {
                        recyclerView.scrollBy(0, yl0Var.f30615i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 24:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime3) / ((float) scrollSlidingTextTabStrip.f22355b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f22358d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    ym0 ym0Var = scrollSlidingTextTabStrip.f22354b;
                    if (ym0Var != null) {
                        ym0Var.C0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ShutterButton shutterButton = (ShutterButton) obj;
                pv0 pv0Var = shutterButton.e;
                if (pv0Var != null && !((rl) pv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 26:
                kx0 kx0Var = (kx0) obj;
                View view = kx0Var.f25870s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        kx0Var.f25870s.setVisibility(0);
                        kx0Var.f25870s.setAlpha(0.0f);
                    }
                    kx0Var.f25870s.animate().setListener(null).cancel();
                    kx0Var.f25870s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                kx0Var.f25866c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 27:
                w81 w81Var = (w81) obj;
                if (w81Var.J) {
                    long elapsedRealtime4 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime4 > 17) {
                        elapsedRealtime4 = 17;
                    }
                    float f15 = w81Var.f29969f0 + (((float) elapsedRealtime4) / 200.0f);
                    w81Var.f29969f0 = f15;
                    w81Var.setAnimationIdicatorProgress(w81Var.f29961a0.getInterpolation(f15));
                    if (w81Var.f29969f0 > 1.0f) {
                        w81Var.f29969f0 = 1.0f;
                    }
                    if (w81Var.f29969f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(w81Var.f29972i0);
                        return;
                    }
                    w81Var.J = false;
                    w81Var.setEnabled(true);
                    v81 v81Var = w81Var.f29986y;
                    if (v81Var != null) {
                        ((l.d) v81Var).L(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                a40 a40Var = (a40) obj;
                if (a40Var.f29354b && a40Var.Q0.f34432z0 == null) {
                    a40Var.f29362g0 = false;
                    org.telegram.ui.Components.voip.m0.a(a40Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(a40Var.f29363h0, 3000L);
                return;
            default:
                ((p4.s0) obj).c();
                return;
        }
    }
}
