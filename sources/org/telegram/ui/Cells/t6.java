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
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.f70;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.xw;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ni;
import org.telegram.ui.pw;
import org.telegram.ui.v30;
import org.telegram.ui.wn;
public final class t6 implements Runnable {
    public final int f21230a;
    public final Object f21231b;

    public t6(Object obj, int i10) {
        this.f21230a = i10;
        this.f21231b = obj;
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
        switch (this.f21230a) {
            case 0:
                u6 u6Var = (u6) this.f21231b;
                u6Var.a();
                RectF rectF = u6Var.f21671f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) this.f21231b;
                if (n7Var.f20718b == null) {
                    n7Var.f20718b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f20718b;
                int i11 = n7Var.f20720c + 1;
                n7Var.f20720c = i11;
                jVar.f2333b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) this.f21231b;
                RectF rectF2 = w7Var.f21828n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f21833y, 1000L);
                return;
            case 3:
                da daVar = (da) this.f21231b;
                if (daVar.N && daVar.E != null) {
                    if (daVar.Z && daVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (daVar.W != null) {
                        n10 = daVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!daVar.Z && !daVar.f20190k0) {
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
                    zl0 zl0Var = daVar.E;
                    if (zl0Var != null) {
                        if (!daVar.O) {
                            n10 = -n10;
                        }
                        zl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) this.f21231b;
                org.telegram.ui.Components.j8 j8Var = s7Var.f28212y;
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
                org.telegram.ui.Components.j8 j8Var2 = (org.telegram.ui.Components.j8) this.f21231b;
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
                gd gdVar = (gd) this.f21231b;
                gdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                gdVar.f24545f.performHapticFeedback(0);
                Runnable runnable = gdVar.f24548j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                qk qkVar = (qk) this.f21231b;
                if (qkVar.S) {
                    qkVar.N.clear();
                    qkVar.P.clear();
                    qkVar.Q.clear();
                    qkVar.l();
                    return;
                }
                return;
            case 8:
                sm smVar = (sm) this.f21231b;
                tm tmVar = smVar.P;
                if (tmVar.J != null && !tmVar.K) {
                    int computeVerticalScrollOffset = tmVar.f28602r.computeVerticalScrollOffset();
                    if (tmVar.f28602r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (smVar.e() - smVar.f28292r) + smVar.f28291n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (tmVar.E - Math.max(0, computeVerticalScrollOffset - tmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((tmVar.f28602r.getMeasuredHeight() - (tmVar.E - computeVerticalScrollOffset)) - tmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > tmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && tmVar.f28602r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        tmVar.E += f10;
                        tmVar.f28602r.scrollBy(0, i14);
                        smVar.invalidate();
                    }
                    smVar.L = true;
                    smVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 9:
                xn xnVar = (xn) this.f21231b;
                t6 t6Var = xnVar.U0;
                d6 d6Var = xnVar.f30397g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!xnVar.H && editField != null && xnVar.G && !xnVar.f30393e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                mu muVar = (mu) this.f21231b;
                t6 t6Var2 = muVar.P;
                hu huVar = muVar.f26381a;
                if (!muVar.f26390y && huVar != null && muVar.N && !muVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    huVar.requestFocus();
                    AndroidUtilities.showKeyboard(huVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    return;
                }
                return;
            case 11:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) this.f21231b).d;
                if (mVar.f7321a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7323c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7323c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 12:
                nz nzVar = (nz) this.f21231b;
                if (nzVar.B0.f30378s == null) {
                    nzVar.X1 = false;
                    nzVar.Y();
                    return;
                }
                return;
            case 13:
                n00 n00Var = (n00) this.f21231b;
                if (n00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = n00Var.f26495p0 + (((float) elapsedRealtime) / 320.0f);
                    n00Var.f26495p0 = f13;
                    n00Var.setAnimationIdicatorProgress(n00Var.f26488i0.getInterpolation(f13));
                    if (n00Var.f26495p0 > 1.0f) {
                        n00Var.f26495p0 = 1.0f;
                    }
                    if (n00Var.f26495p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(n00Var.f26503v0);
                        return;
                    }
                    n00Var.O = false;
                    n00Var.setEnabled(true);
                    h00 h00Var = n00Var.J;
                    if (h00Var != null) {
                        ((pw) h00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f21231b;
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f22301s0, 1000L);
                return;
            case 15:
                TextureView textureView = ((y50) this.f21231b).H0.f24205q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new xw(13, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 16:
                e70 e70Var = (e70) this.f21231b;
                f70 f70Var = e70Var.f23895x;
                s60 s60Var = f70Var.V;
                if (s60Var != null && s60Var.getAdapter() != null) {
                    f70Var.V.getClass();
                    int R = RecyclerView.R(e70Var);
                    if (R >= 0) {
                        f70Var.T.v(f70Var.V.T(e70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 17:
                ic0 ic0Var = (ic0) this.f21231b;
                ValueAnimator valueAnimator = ic0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ic0Var.h.start();
                    return;
                }
                return;
            case 18:
                fe0 fe0Var = (fe0) this.f21231b;
                fe0Var.e();
                AndroidUtilities.runOnUIThread(fe0Var.R, 100L);
                return;
            case 19:
                wi0 wi0Var = (wi0) this.f21231b;
                wi0Var.f29992y = true;
                ValueAnimator valueAnimator2 = wi0Var.f29993z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                wi0Var.f29991x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                wi0Var.f29993z = ofFloat;
                ofFloat.addUpdateListener(wi0Var.f29970b0);
                wi0Var.f29993z.setInterpolator(new LinearInterpolator());
                wi0Var.f29993z.setDuration(150L);
                wi0Var.f29993z.start();
                return;
            case 20:
                zl0 zl0Var2 = (zl0) this.f21231b;
                ni niVar = zl0Var2.f31000h2;
                int[] iArr = zl0Var2.f31009m2;
                wn wnVar = niVar.d;
                iArr[0] = (int) wnVar.f39733s9;
                iArr[1] = wnVar.Aa;
                if (zl0Var2.f31004j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    zl0Var2.N0(0.0f, zl0Var2.f31009m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    zl0Var2.N0(0.0f, zl0Var2.getMeasuredHeight() - zl0Var2.f31009m2[1]);
                }
                zl0Var2.f31000h2.d.f39788x0.scrollBy(0, dp);
                if (zl0Var2.f31002i2) {
                    AndroidUtilities.runOnUIThread(zl0Var2.D2);
                    return;
                }
                return;
            case 21:
                gl0 gl0Var = (gl0) this.f21231b;
                t6 t6Var3 = gl0Var.f24605i0;
                if (gl0Var.f24609n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                }
                gl0Var.U = false;
                gl0Var.invalidate();
                return;
            case 22:
                bm0 bm0Var = (bm0) this.f21231b;
                RecyclerView recyclerView = bm0Var.f22972a;
                if (recyclerView != null) {
                    if (bm0Var.f22976g) {
                        recyclerView.scrollBy(0, -bm0Var.f22977i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (bm0Var.h) {
                        recyclerView.scrollBy(0, bm0Var.f22977i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 23:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f21231b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f22413b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f22416d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    an0 an0Var = scrollSlidingTextTabStrip.f22412b;
                    if (an0Var != null) {
                        an0Var.C0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) this.f21231b;
                rv0 rv0Var = shutterButton.e;
                if (rv0Var != null && !((ul) rv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 25:
                lx0 lx0Var = (lx0) this.f21231b;
                View view = lx0Var.f26149s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        lx0Var.f26149s.setVisibility(0);
                        lx0Var.f26149s.setAlpha(0.0f);
                    }
                    lx0Var.f26149s.animate().setListener(null).cancel();
                    lx0Var.f26149s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                lx0Var.f26145c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 26:
                x81 x81Var = (x81) this.f21231b;
                if (x81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f15 = x81Var.f30188f0 + (((float) elapsedRealtime3) / 200.0f);
                    x81Var.f30188f0 = f15;
                    x81Var.setAnimationIdicatorProgress(x81Var.f30180a0.getInterpolation(f15));
                    if (x81Var.f30188f0 > 1.0f) {
                        x81Var.f30188f0 = 1.0f;
                    }
                    if (x81Var.f30188f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(x81Var.f30191i0);
                        return;
                    }
                    x81Var.J = false;
                    x81Var.setEnabled(true);
                    w81 w81Var = x81Var.f30205y;
                    if (w81Var != null) {
                        ((l.d) w81Var).L(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                v30 v30Var = (v30) this.f21231b;
                if (v30Var.f29379b && v30Var.Q0.f33116z0 == null) {
                    v30Var.f29387g0 = false;
                    org.telegram.ui.Components.voip.m0.a(v30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(v30Var.f29388h0, 3000L);
                return;
            case 28:
                ((p4.s0) this.f21231b).c();
                return;
            default:
                p8.a aVar = (p8.a) this.f21231b;
                synchronized (aVar.f41094a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f41100j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f41096c = 1;
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
