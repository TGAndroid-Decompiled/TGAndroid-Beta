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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.a40;
import org.telegram.ui.qi;
import org.telegram.ui.tw;
import org.telegram.ui.zn;
public final class u6 implements Runnable {
    public final int f21632a;
    public final Object f21633b;

    public u6(Object obj, int i10) {
        this.f21632a = i10;
        this.f21633b = obj;
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
        switch (this.f21632a) {
            case 0:
                v6 v6Var = (v6) this.f21633b;
                v6Var.a();
                RectF rectF = v6Var.f21700f;
                v6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(v6Var.v, 1000L);
                return;
            case 1:
                o7 o7Var = (o7) this.f21633b;
                if (o7Var.f20773b == null) {
                    o7Var.f20773b = new androidx.emoji2.text.j(o7Var, 4);
                }
                androidx.emoji2.text.j jVar = o7Var.f20773b;
                int i11 = o7Var.f20775c + 1;
                o7Var.f20775c = i11;
                jVar.f2333b = i11;
                o7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                x7 x7Var = (x7) this.f21633b;
                RectF rectF2 = x7Var.f21863n;
                x7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(x7Var.f21868y, 1000L);
                return;
            case 3:
                ea eaVar = (ea) this.f21633b;
                if (eaVar.N && eaVar.E != null) {
                    if (eaVar.Z && eaVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (eaVar.W != null) {
                        n10 = eaVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!eaVar.Z && !eaVar.f20236k0) {
                        if (eaVar.O) {
                            if (eaVar.W.getBottom() - n10 < eaVar.F.getMeasuredHeight() - eaVar.p()) {
                                i10 = eaVar.W.getBottom() - eaVar.F.getMeasuredHeight();
                                q6 = eaVar.p();
                                n10 = i10 + q6;
                            }
                        } else if (eaVar.W.getTop() + n10 > eaVar.q()) {
                            i10 = -eaVar.W.getTop();
                            q6 = eaVar.q();
                            n10 = i10 + q6;
                        }
                    }
                    yl0 yl0Var = eaVar.E;
                    if (yl0Var != null) {
                        if (!eaVar.O) {
                            n10 = -n10;
                        }
                        yl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.r7 r7Var = (org.telegram.ui.Components.r7) this.f21633b;
                org.telegram.ui.Components.i8 i8Var = r7Var.f27838y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i12 = i8Var.J0 + 1;
                    i8Var.J0 = i12;
                    if (i12 == 1) {
                        r7Var.v = true;
                        i8Var.H0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            i8Var.C0();
                        } else if (i8Var.H0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(i8Var.N0);
                            i8Var.L0 = 0L;
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
                org.telegram.ui.Components.i8 i8Var2 = (org.telegram.ui.Components.i8) this.f21633b;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f11 = i8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - i8Var2.K0;
                    i8Var2.K0 = currentTimeMillis;
                    long j11 = currentTimeMillis - i8Var2.L0;
                    int i13 = i8Var2.J0;
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
                    i8Var2.I0 = f12;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = i8Var2.I0;
                        }
                        i8Var2.G0(playingMessageObject, false);
                    }
                    if (i8Var2.H0 == 1 && i8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j11 > 200 || i8Var2.I0 == 0.0f) {
                            i8Var2.L0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f12);
                        }
                        if (i8Var2.J0 > 0 && i8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(i8Var2.N0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i8Var2.K0 = System.currentTimeMillis();
                return;
            case 6:
                fd fdVar = (fd) this.f21633b;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f24165f.performHapticFeedback(0);
                Runnable runnable = fdVar.f24168j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                nk nkVar = (nk) this.f21633b;
                if (nkVar.S) {
                    nkVar.N.clear();
                    nkVar.P.clear();
                    nkVar.Q.clear();
                    nkVar.l();
                    return;
                }
                return;
            case 8:
                pm pmVar = (pm) this.f21633b;
                qm qmVar = pmVar.P;
                if (qmVar.J != null && !qmVar.K) {
                    int computeVerticalScrollOffset = qmVar.f27604r.computeVerticalScrollOffset();
                    if (qmVar.f27604r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (pmVar.e() - pmVar.f27374r) + pmVar.f27373n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (qmVar.E - Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((qmVar.f27604r.getMeasuredHeight() - (qmVar.E - computeVerticalScrollOffset)) - qmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > qmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && qmVar.f27604r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        qmVar.E += f10;
                        qmVar.f27604r.scrollBy(0, i14);
                        pmVar.invalidate();
                    }
                    pmVar.L = true;
                    pmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 9:
                un unVar = (un) this.f21633b;
                u6 u6Var = unVar.U0;
                e6 e6Var = unVar.f28818g1;
                if (e6Var != null) {
                    EditTextBoldCursor editField = e6Var.getEditField();
                    if (!unVar.H && editField != null && unVar.G && !unVar.f28814e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(u6Var);
                        AndroidUtilities.runOnUIThread(u6Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ju juVar = (ju) this.f21633b;
                u6 u6Var2 = juVar.P;
                eu euVar = juVar.f25458a;
                if (!juVar.f25467y && euVar != null && juVar.N && !juVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    euVar.requestFocus();
                    AndroidUtilities.showKeyboard(euVar);
                    AndroidUtilities.cancelRunOnUIThread(u6Var2);
                    AndroidUtilities.runOnUIThread(u6Var2, 100L);
                    return;
                }
                return;
            case 11:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) this.f21633b).d;
                if (mVar.f7325a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7327c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7327c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 12:
                kz kzVar = (kz) this.f21633b;
                if (kzVar.B0.f30067s == null) {
                    kzVar.X1 = false;
                    kzVar.Y();
                    return;
                }
                return;
            case 13:
                k00 k00Var = (k00) this.f21633b;
                if (k00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = k00Var.f25542p0 + (((float) elapsedRealtime) / 320.0f);
                    k00Var.f25542p0 = f13;
                    k00Var.setAnimationIdicatorProgress(k00Var.f25535i0.getInterpolation(f13));
                    if (k00Var.f25542p0 > 1.0f) {
                        k00Var.f25542p0 = 1.0f;
                    }
                    if (k00Var.f25542p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k00Var.f25550v0);
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
                FragmentContextView fragmentContextView = (FragmentContextView) this.f21633b;
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f22294s0, 1000L);
                return;
            case 15:
                TextureView textureView = ((u50) this.f21633b).H0.f23246q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new bv(14, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 16:
                b70 b70Var = (b70) this.f21633b;
                c70 c70Var = b70Var.f22909x;
                p60 p60Var = c70Var.V;
                if (p60Var != null && p60Var.getAdapter() != null) {
                    c70Var.V.getClass();
                    int S = RecyclerView.S(b70Var);
                    if (S >= 0) {
                        c70Var.T.v(c70Var.V.U(b70Var), S);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 17:
                gc0 gc0Var = (gc0) this.f21633b;
                ValueAnimator valueAnimator = gc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    gc0Var.h.start();
                    return;
                }
                return;
            case 18:
                de0 de0Var = (de0) this.f21633b;
                de0Var.e();
                AndroidUtilities.runOnUIThread(de0Var.R, 100L);
                return;
            case 19:
                vi0 vi0Var = (vi0) this.f21633b;
                vi0Var.f29188y = true;
                ValueAnimator valueAnimator2 = vi0Var.f29189z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                vi0Var.f29187x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vi0Var.f29189z = ofFloat;
                ofFloat.addUpdateListener(vi0Var.f29166b0);
                vi0Var.f29189z.setInterpolator(new LinearInterpolator());
                vi0Var.f29189z.setDuration(150L);
                vi0Var.f29189z.start();
                return;
            case 20:
                yl0 yl0Var2 = (yl0) this.f21633b;
                qi qiVar = yl0Var2.f30689h2;
                int[] iArr = yl0Var2.f30698m2;
                zn znVar = qiVar.d;
                iArr[0] = (int) znVar.f40496s9;
                iArr[1] = znVar.Aa;
                if (yl0Var2.f30693j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    yl0Var2.N0(0.0f, yl0Var2.f30698m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    yl0Var2.N0(0.0f, yl0Var2.getMeasuredHeight() - yl0Var2.f30698m2[1]);
                }
                yl0Var2.f30689h2.d.f40551x0.scrollBy(0, dp);
                if (yl0Var2.f30691i2) {
                    AndroidUtilities.runOnUIThread(yl0Var2.D2);
                    return;
                }
                return;
            case 21:
                fl0 fl0Var = (fl0) this.f21633b;
                u6 u6Var3 = fl0Var.f24267i0;
                if (fl0Var.f24271n) {
                    AndroidUtilities.cancelRunOnUIThread(u6Var3);
                    AndroidUtilities.runOnUIThread(u6Var3, 4000L);
                    return;
                }
                fl0Var.U = false;
                fl0Var.invalidate();
                return;
            case 22:
                am0 am0Var = (am0) this.f21633b;
                RecyclerView recyclerView = am0Var.f22690a;
                if (recyclerView != null) {
                    if (am0Var.f22694g) {
                        recyclerView.scrollBy(0, -am0Var.f22695i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (am0Var.h) {
                        recyclerView.scrollBy(0, am0Var.f22695i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 23:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f21633b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f22406b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f22409d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    zm0 zm0Var = scrollSlidingTextTabStrip.f22405b;
                    if (zm0Var != null) {
                        zm0Var.y0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) this.f21633b;
                qv0 qv0Var = shutterButton.e;
                if (qv0Var != null && !((rl) qv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 25:
                lx0 lx0Var = (lx0) this.f21633b;
                View view = lx0Var.f26257s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        lx0Var.f26257s.setVisibility(0);
                        lx0Var.f26257s.setAlpha(0.0f);
                    }
                    lx0Var.f26257s.animate().setListener(null).cancel();
                    lx0Var.f26257s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                lx0Var.f26253c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 26:
                y81 y81Var = (y81) this.f21633b;
                if (y81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f15 = y81Var.f30592f0 + (((float) elapsedRealtime3) / 200.0f);
                    y81Var.f30592f0 = f15;
                    y81Var.setAnimationIdicatorProgress(y81Var.f30584a0.getInterpolation(f15));
                    if (y81Var.f30592f0 > 1.0f) {
                        y81Var.f30592f0 = 1.0f;
                    }
                    if (y81Var.f30592f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(y81Var.f30595i0);
                        return;
                    }
                    y81Var.J = false;
                    y81Var.setEnabled(true);
                    x81 x81Var = y81Var.f30609y;
                    if (x81Var != null) {
                        ((ki.e0) x81Var).i(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                a40 a40Var = (a40) this.f21633b;
                if (a40Var.f29423b && a40Var.Q0.f34483z0 == null) {
                    a40Var.f29431g0 = false;
                    org.telegram.ui.Components.voip.m0.a(a40Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(a40Var.f29432h0, 3000L);
                return;
            case 28:
                ((p4.s0) this.f21633b).c();
                return;
            default:
                p8.a aVar = (p8.a) this.f21633b;
                synchronized (aVar.f41043a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f41049j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f41045c = 1;
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
