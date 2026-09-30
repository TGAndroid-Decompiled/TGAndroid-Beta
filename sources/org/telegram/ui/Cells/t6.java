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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.ni;
import org.telegram.ui.pw;
import org.telegram.ui.v30;
public final class t6 implements Runnable {
    public final int f21210a;
    public final Object f21211b;

    public t6(Object obj, int i10) {
        this.f21210a = i10;
        this.f21211b = obj;
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
        switch (this.f21210a) {
            case 0:
                u6 u6Var = (u6) this.f21211b;
                u6Var.a();
                RectF rectF = u6Var.f21651f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) this.f21211b;
                if (n7Var.f20703b == null) {
                    n7Var.f20703b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f20703b;
                int i11 = n7Var.f20705c + 1;
                n7Var.f20705c = i11;
                jVar.f2326b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) this.f21211b;
                RectF rectF2 = w7Var.f21808n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f21813y, 1000L);
                return;
            case 3:
                da daVar = (da) this.f21211b;
                if (daVar.N && daVar.E != null) {
                    if (daVar.Z && daVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (daVar.W != null) {
                        n10 = daVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!daVar.Z && !daVar.f20175k0) {
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
                    yl0 yl0Var = daVar.E;
                    if (yl0Var != null) {
                        if (!daVar.O) {
                            n10 = -n10;
                        }
                        yl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) this.f21211b;
                org.telegram.ui.Components.j8 j8Var = s7Var.f28145y;
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
                org.telegram.ui.Components.j8 j8Var2 = (org.telegram.ui.Components.j8) this.f21211b;
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
                gd gdVar = (gd) this.f21211b;
                gdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                gdVar.f24490f.performHapticFeedback(0);
                Runnable runnable = gdVar.f24493j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                pk pkVar = (pk) this.f21211b;
                if (pkVar.S) {
                    pkVar.N.clear();
                    pkVar.P.clear();
                    pkVar.Q.clear();
                    pkVar.l();
                    return;
                }
                return;
            case 8:
                rm rmVar = (rm) this.f21211b;
                sm smVar = rmVar.P;
                if (smVar.J != null && !smVar.K) {
                    int computeVerticalScrollOffset = smVar.f28312r.computeVerticalScrollOffset();
                    if (smVar.f28312r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (rmVar.e() - rmVar.f27997r) + rmVar.f27996n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (smVar.E - Math.max(0, computeVerticalScrollOffset - smVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((smVar.f28312r.getMeasuredHeight() - (smVar.E - computeVerticalScrollOffset)) - smVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > smVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && smVar.f28312r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        smVar.E += f10;
                        smVar.f28312r.scrollBy(0, i14);
                        rmVar.invalidate();
                    }
                    rmVar.L = true;
                    rmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 9:
                wn wnVar = (wn) this.f21211b;
                t6 t6Var = wnVar.U0;
                d6 d6Var = wnVar.f30061g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!wnVar.H && editField != null && wnVar.G && !wnVar.f30057e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                lu luVar = (lu) this.f21211b;
                t6 t6Var2 = luVar.P;
                gu guVar = luVar.f26079a;
                if (!luVar.f26088y && guVar != null && luVar.N && !luVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    guVar.requestFocus();
                    AndroidUtilities.showKeyboard(guVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    return;
                }
                return;
            case 11:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) this.f21211b).d;
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
                mz mzVar = (mz) this.f21211b;
                if (mzVar.B0.f30042s == null) {
                    mzVar.X1 = false;
                    mzVar.Y();
                    return;
                }
                return;
            case 13:
                m00 m00Var = (m00) this.f21211b;
                if (m00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = m00Var.f26203p0 + (((float) elapsedRealtime) / 320.0f);
                    m00Var.f26203p0 = f13;
                    m00Var.setAnimationIdicatorProgress(m00Var.f26196i0.getInterpolation(f13));
                    if (m00Var.f26203p0 > 1.0f) {
                        m00Var.f26203p0 = 1.0f;
                    }
                    if (m00Var.f26203p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(m00Var.f26211v0);
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
                FragmentContextView fragmentContextView = (FragmentContextView) this.f21211b;
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f22281s0, 1000L);
                return;
            case 15:
                TextureView textureView = ((x50) this.f21211b).H0.f23893q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new dv(14, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 16:
                d70 d70Var = (d70) this.f21211b;
                e70 e70Var = d70Var.f23567x;
                r60 r60Var = e70Var.V;
                if (r60Var != null && r60Var.getAdapter() != null) {
                    e70Var.V.getClass();
                    int R = RecyclerView.R(d70Var);
                    if (R >= 0) {
                        e70Var.T.v(e70Var.V.T(d70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 17:
                hc0 hc0Var = (hc0) this.f21211b;
                ValueAnimator valueAnimator = hc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    hc0Var.h.start();
                    return;
                }
                return;
            case 18:
                ee0 ee0Var = (ee0) this.f21211b;
                ee0Var.e();
                AndroidUtilities.runOnUIThread(ee0Var.R, 100L);
                return;
            case 19:
                vi0 vi0Var = (vi0) this.f21211b;
                vi0Var.f29133y = true;
                ValueAnimator valueAnimator2 = vi0Var.f29134z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                vi0Var.f29132x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vi0Var.f29134z = ofFloat;
                ofFloat.addUpdateListener(vi0Var.f29111b0);
                vi0Var.f29134z.setInterpolator(new LinearInterpolator());
                vi0Var.f29134z.setDuration(150L);
                vi0Var.f29134z.start();
                return;
            case 20:
                yl0 yl0Var2 = (yl0) this.f21211b;
                ni niVar = yl0Var2.f30685h2;
                int[] iArr = yl0Var2.f30694m2;
                org.telegram.ui.wn wnVar2 = niVar.d;
                iArr[0] = (int) wnVar2.f39640s9;
                iArr[1] = wnVar2.Aa;
                if (yl0Var2.f30689j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    yl0Var2.M0(0.0f, yl0Var2.f30694m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    yl0Var2.M0(0.0f, yl0Var2.getMeasuredHeight() - yl0Var2.f30694m2[1]);
                }
                yl0Var2.f30685h2.d.f39695x0.scrollBy(0, dp);
                if (yl0Var2.f30687i2) {
                    AndroidUtilities.runOnUIThread(yl0Var2.D2);
                    return;
                }
                return;
            case 21:
                fl0 fl0Var = (fl0) this.f21211b;
                t6 t6Var3 = fl0Var.f24260i0;
                if (fl0Var.f24264n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                }
                fl0Var.U = false;
                fl0Var.invalidate();
                return;
            case 22:
                am0 am0Var = (am0) this.f21211b;
                RecyclerView recyclerView = am0Var.f22685a;
                if (recyclerView != null) {
                    if (am0Var.f22689g) {
                        recyclerView.scrollBy(0, -am0Var.f22690i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (am0Var.h) {
                        recyclerView.scrollBy(0, am0Var.f22690i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 23:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f21211b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f22393b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f22396d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    zm0 zm0Var = scrollSlidingTextTabStrip.f22392b;
                    if (zm0Var != null) {
                        zm0Var.C0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) this.f21211b;
                qv0 qv0Var = shutterButton.e;
                if (qv0Var != null && !((tl) qv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 25:
                kx0 kx0Var = (kx0) this.f21211b;
                View view = kx0Var.f25848s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        kx0Var.f25848s.setVisibility(0);
                        kx0Var.f25848s.setAlpha(0.0f);
                    }
                    kx0Var.f25848s.animate().setListener(null).cancel();
                    kx0Var.f25848s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                kx0Var.f25844c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 26:
                x81 x81Var = (x81) this.f21211b;
                if (x81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f15 = x81Var.f30317f0 + (((float) elapsedRealtime3) / 200.0f);
                    x81Var.f30317f0 = f15;
                    x81Var.setAnimationIdicatorProgress(x81Var.f30309a0.getInterpolation(f15));
                    if (x81Var.f30317f0 > 1.0f) {
                        x81Var.f30317f0 = 1.0f;
                    }
                    if (x81Var.f30317f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(x81Var.f30320i0);
                        return;
                    }
                    x81Var.J = false;
                    x81Var.setEnabled(true);
                    w81 w81Var = x81Var.f30334y;
                    if (w81Var != null) {
                        ((l.d) w81Var).L(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                v30 v30Var = (v30) this.f21211b;
                if (v30Var.f29373b && v30Var.Q0.f33038z0 == null) {
                    v30Var.f29381g0 = false;
                    org.telegram.ui.Components.voip.m0.a(v30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(v30Var.f29382h0, 3000L);
                return;
            case 28:
                ((p4.s0) this.f21211b).c();
                return;
            default:
                p8.a aVar = (p8.a) this.f21211b;
                synchronized (aVar.f40997a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f41003j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f40999c = 1;
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
