package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Log;
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
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ni;
import org.telegram.ui.pw;
import org.telegram.ui.v30;
public final class t6 implements Runnable {
    public final int f21208a;
    public final Object f21209b;

    public t6(Object obj, int i10) {
        this.f21208a = i10;
        this.f21209b = obj;
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
        switch (this.f21208a) {
            case 0:
                u6 u6Var = (u6) this.f21209b;
                u6Var.a();
                RectF rectF = u6Var.f21649f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) this.f21209b;
                if (n7Var.f20701b == null) {
                    n7Var.f20701b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f20701b;
                int i11 = n7Var.f20703c + 1;
                n7Var.f20703c = i11;
                jVar.f2326b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) this.f21209b;
                RectF rectF2 = w7Var.f21806n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f21811y, 1000L);
                return;
            case 3:
                da daVar = (da) this.f21209b;
                if (daVar.N && daVar.E != null) {
                    if (daVar.Z && daVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (daVar.W != null) {
                        n10 = daVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!daVar.Z && !daVar.f20173k0) {
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
                    xl0 xl0Var = daVar.E;
                    if (xl0Var != null) {
                        if (!daVar.O) {
                            n10 = -n10;
                        }
                        xl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) this.f21209b;
                org.telegram.ui.Components.j8 j8Var = s7Var.f28186y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i12 = j8Var.J0 + 1;
                    j8Var.J0 = i12;
                    if (i12 == 1) {
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
                org.telegram.ui.Components.j8 j8Var2 = (org.telegram.ui.Components.j8) this.f21209b;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f11 = j8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - j8Var2.K0;
                    j8Var2.K0 = currentTimeMillis;
                    long j11 = currentTimeMillis - j8Var2.L0;
                    int i13 = j8Var2.J0;
                    if (i13 == 1) {
                        j3 = 3;
                    } else if (i13 == 2) {
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
                fd fdVar = (fd) this.f21209b;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f24216f.performHapticFeedback(0);
                Runnable runnable = fdVar.f24219j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                pk pkVar = (pk) this.f21209b;
                if (pkVar.S) {
                    pkVar.N.clear();
                    pkVar.P.clear();
                    pkVar.Q.clear();
                    pkVar.l();
                    return;
                }
                return;
            case 8:
                rm rmVar = (rm) this.f21209b;
                sm smVar = rmVar.P;
                if (smVar.J != null && !smVar.K) {
                    int computeVerticalScrollOffset = smVar.f28309r.computeVerticalScrollOffset();
                    if (smVar.f28309r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (rmVar.e() - rmVar.f28003r) + rmVar.f28002n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (smVar.E - Math.max(0, computeVerticalScrollOffset - smVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((smVar.f28309r.getMeasuredHeight() - (smVar.E - computeVerticalScrollOffset)) - smVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > smVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && smVar.f28309r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        smVar.E += f10;
                        smVar.f28309r.scrollBy(0, i14);
                        rmVar.invalidate();
                    }
                    rmVar.L = true;
                    rmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 9:
                wn wnVar = (wn) this.f21209b;
                t6 t6Var = wnVar.U0;
                d6 d6Var = wnVar.f30120g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!wnVar.H && editField != null && wnVar.G && !wnVar.f30116e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                lu luVar = (lu) this.f21209b;
                t6 t6Var2 = luVar.P;
                gu guVar = luVar.f26172a;
                if (!luVar.f26181y && guVar != null && luVar.N && !luVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    guVar.requestFocus();
                    AndroidUtilities.showKeyboard(guVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    return;
                }
                return;
            case 11:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) this.f21209b).d;
                if (mVar.f7309a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7311c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7311c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 12:
                mz mzVar = (mz) this.f21209b;
                if (mzVar.B0.f29147s == null) {
                    mzVar.X1 = false;
                    mzVar.Y();
                    return;
                }
                return;
            case 13:
                m00 m00Var = (m00) this.f21209b;
                if (m00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = m00Var.f26245p0 + (((float) elapsedRealtime) / 320.0f);
                    m00Var.f26245p0 = f13;
                    m00Var.setAnimationIdicatorProgress(m00Var.f26238i0.getInterpolation(f13));
                    if (m00Var.f26245p0 > 1.0f) {
                        m00Var.f26245p0 = 1.0f;
                    }
                    if (m00Var.f26245p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(m00Var.f26253v0);
                        return;
                    }
                    m00Var.O = false;
                    m00Var.setEnabled(true);
                    g00 g00Var = m00Var.J;
                    if (g00Var != null) {
                        ((pw) g00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f21209b;
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f22279s0, 1000L);
                return;
            case 15:
                TextureView textureView = ((w50) this.f21209b).H0.f23573q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new ww(13, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 16:
                c70 c70Var = (c70) this.f21209b;
                d70 d70Var = c70Var.f23256x;
                q60 q60Var = d70Var.V;
                if (q60Var != null && q60Var.getAdapter() != null) {
                    d70Var.V.getClass();
                    int R = RecyclerView.R(c70Var);
                    if (R >= 0) {
                        d70Var.T.v(d70Var.V.T(c70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 17:
                gc0 gc0Var = (gc0) this.f21209b;
                ValueAnimator valueAnimator = gc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    gc0Var.h.start();
                    return;
                }
                return;
            case 18:
                de0 de0Var = (de0) this.f21209b;
                de0Var.e();
                AndroidUtilities.runOnUIThread(de0Var.R, 100L);
                return;
            case 19:
                ui0 ui0Var = (ui0) this.f21209b;
                ui0Var.f28840y = true;
                ValueAnimator valueAnimator2 = ui0Var.f28841z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ui0Var.f28839x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ui0Var.f28841z = ofFloat;
                ofFloat.addUpdateListener(ui0Var.f28818b0);
                ui0Var.f28841z.setInterpolator(new LinearInterpolator());
                ui0Var.f28841z.setDuration(150L);
                ui0Var.f28841z.start();
                return;
            case 20:
                xl0 xl0Var2 = (xl0) this.f21209b;
                ni niVar = xl0Var2.f30384h2;
                int[] iArr = xl0Var2.f30393m2;
                org.telegram.ui.wn wnVar2 = niVar.d;
                iArr[0] = (int) wnVar2.f39639s9;
                iArr[1] = wnVar2.Aa;
                if (xl0Var2.f30388j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    xl0Var2.M0(0.0f, xl0Var2.f30393m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    xl0Var2.M0(0.0f, xl0Var2.getMeasuredHeight() - xl0Var2.f30393m2[1]);
                }
                xl0Var2.f30384h2.d.f39694x0.scrollBy(0, dp);
                if (xl0Var2.f30386i2) {
                    AndroidUtilities.runOnUIThread(xl0Var2.D2);
                    return;
                }
                return;
            case 21:
                el0 el0Var = (el0) this.f21209b;
                t6 t6Var3 = el0Var.f23983i0;
                if (el0Var.f23987n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                }
                el0Var.U = false;
                el0Var.invalidate();
                return;
            case 22:
                zl0 zl0Var = (zl0) this.f21209b;
                RecyclerView recyclerView = zl0Var.f30916a;
                if (recyclerView != null) {
                    if (zl0Var.f30920g) {
                        recyclerView.scrollBy(0, -zl0Var.f30921i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (zl0Var.h) {
                        recyclerView.scrollBy(0, zl0Var.f30921i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 23:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f21209b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f22391b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f22394d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    ym0 ym0Var = scrollSlidingTextTabStrip.f22390b;
                    if (ym0Var != null) {
                        ym0Var.C0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) this.f21209b;
                pv0 pv0Var = shutterButton.e;
                if (pv0Var != null && !((tl) pv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 25:
                jx0 jx0Var = (jx0) this.f21209b;
                View view = jx0Var.f25550s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        jx0Var.f25550s.setVisibility(0);
                        jx0Var.f25550s.setAlpha(0.0f);
                    }
                    jx0Var.f25550s.animate().setListener(null).cancel();
                    jx0Var.f25550s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                jx0Var.f25546c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 26:
                w81 w81Var = (w81) this.f21209b;
                if (w81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f15 = w81Var.f29940f0 + (((float) elapsedRealtime3) / 200.0f);
                    w81Var.f29940f0 = f15;
                    w81Var.setAnimationIdicatorProgress(w81Var.f29932a0.getInterpolation(f15));
                    if (w81Var.f29940f0 > 1.0f) {
                        w81Var.f29940f0 = 1.0f;
                    }
                    if (w81Var.f29940f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(w81Var.f29943i0);
                        return;
                    }
                    w81Var.J = false;
                    w81Var.setEnabled(true);
                    v81 v81Var = w81Var.f29957y;
                    if (v81Var != null) {
                        ((l.d) v81Var).L(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                v30 v30Var = (v30) this.f21209b;
                if (v30Var.f29378b && v30Var.Q0.f33037z0 == null) {
                    v30Var.f29386g0 = false;
                    org.telegram.ui.Components.voip.m0.a(v30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(v30Var.f29387h0, 3000L);
                return;
            case 28:
                ((p4.s0) this.f21209b).c();
                return;
            default:
                p8.a aVar = (p8.a) this.f21209b;
                synchronized (aVar.f40994a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f41000j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f40996c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
