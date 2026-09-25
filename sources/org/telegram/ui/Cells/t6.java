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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.vw;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ni;
import org.telegram.ui.pw;
import org.telegram.ui.v30;
import org.telegram.ui.wn;
public final class t6 implements Runnable {
    public final int f21209a;
    public final Object f21210b;

    public t6(Object obj, int i10) {
        this.f21209a = i10;
        this.f21210b = obj;
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
        switch (this.f21209a) {
            case 0:
                u6 u6Var = (u6) this.f21210b;
                u6Var.a();
                RectF rectF = u6Var.f21650f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) this.f21210b;
                if (n7Var.f20702b == null) {
                    n7Var.f20702b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f20702b;
                int i11 = n7Var.f20704c + 1;
                n7Var.f20704c = i11;
                jVar.f2326b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) this.f21210b;
                RectF rectF2 = w7Var.f21807n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f21812y, 1000L);
                return;
            case 3:
                da daVar = (da) this.f21210b;
                if (daVar.N && daVar.E != null) {
                    if (daVar.Z && daVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (daVar.W != null) {
                        n10 = daVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!daVar.Z && !daVar.f20174k0) {
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
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) this.f21210b;
                org.telegram.ui.Components.j8 j8Var = s7Var.f28176y;
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
                org.telegram.ui.Components.j8 j8Var2 = (org.telegram.ui.Components.j8) this.f21210b;
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
                fd fdVar = (fd) this.f21210b;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f24154f.performHapticFeedback(0);
                Runnable runnable = fdVar.f24157j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ok okVar = (ok) this.f21210b;
                if (okVar.S) {
                    okVar.N.clear();
                    okVar.P.clear();
                    okVar.Q.clear();
                    okVar.l();
                    return;
                }
                return;
            case 8:
                qm qmVar = (qm) this.f21210b;
                rm rmVar = qmVar.P;
                if (rmVar.J != null && !rmVar.K) {
                    int computeVerticalScrollOffset = rmVar.f28001r.computeVerticalScrollOffset();
                    if (rmVar.f28001r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (qmVar.e() - qmVar.f27708r) + qmVar.f27707n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (rmVar.E - Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((rmVar.f28001r.getMeasuredHeight() - (rmVar.E - computeVerticalScrollOffset)) - rmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > rmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && rmVar.f28001r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        rmVar.E += f10;
                        rmVar.f28001r.scrollBy(0, i14);
                        qmVar.invalidate();
                    }
                    qmVar.L = true;
                    qmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 9:
                vn vnVar = (vn) this.f21210b;
                t6 t6Var = vnVar.U0;
                d6 d6Var = vnVar.f29198g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!vnVar.H && editField != null && vnVar.G && !vnVar.f29194e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                ku kuVar = (ku) this.f21210b;
                t6 t6Var2 = kuVar.P;
                fu fuVar = kuVar.f25881a;
                if (!kuVar.f25890y && fuVar != null && kuVar.N && !kuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    fuVar.requestFocus();
                    AndroidUtilities.showKeyboard(fuVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    return;
                }
                return;
            case 11:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) this.f21210b).d;
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
                lz lzVar = (lz) this.f21210b;
                if (lzVar.B0.f28836s == null) {
                    lzVar.X1 = false;
                    lzVar.Y();
                    return;
                }
                return;
            case 13:
                l00 l00Var = (l00) this.f21210b;
                if (l00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = l00Var.f25954p0 + (((float) elapsedRealtime) / 320.0f);
                    l00Var.f25954p0 = f13;
                    l00Var.setAnimationIdicatorProgress(l00Var.f25947i0.getInterpolation(f13));
                    if (l00Var.f25954p0 > 1.0f) {
                        l00Var.f25954p0 = 1.0f;
                    }
                    if (l00Var.f25954p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(l00Var.f25962v0);
                        return;
                    }
                    l00Var.O = false;
                    l00Var.setEnabled(true);
                    f00 f00Var = l00Var.J;
                    if (f00Var != null) {
                        ((pw) f00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f21210b;
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f22280s0, 1000L);
                return;
            case 15:
                TextureView textureView = ((v50) this.f21210b).H0.f23236q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new vw(13, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 16:
                b70 b70Var = (b70) this.f21210b;
                c70 c70Var = b70Var.f22913x;
                p60 p60Var = c70Var.V;
                if (p60Var != null && p60Var.getAdapter() != null) {
                    c70Var.V.getClass();
                    int R = RecyclerView.R(b70Var);
                    if (R >= 0) {
                        c70Var.T.v(c70Var.V.T(b70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 17:
                fc0 fc0Var = (fc0) this.f21210b;
                ValueAnimator valueAnimator = fc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    fc0Var.h.start();
                    return;
                }
                return;
            case 18:
                ce0 ce0Var = (ce0) this.f21210b;
                ce0Var.e();
                AndroidUtilities.runOnUIThread(ce0Var.R, 100L);
                return;
            case 19:
                ti0 ti0Var = (ti0) this.f21210b;
                ti0Var.f28553y = true;
                ValueAnimator valueAnimator2 = ti0Var.f28554z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ti0Var.f28552x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ti0Var.f28554z = ofFloat;
                ofFloat.addUpdateListener(ti0Var.f28531b0);
                ti0Var.f28554z.setInterpolator(new LinearInterpolator());
                ti0Var.f28554z.setDuration(150L);
                ti0Var.f28554z.start();
                return;
            case 20:
                wl0 wl0Var2 = (wl0) this.f21210b;
                ni niVar = wl0Var2.f30100h2;
                int[] iArr = wl0Var2.f30109m2;
                wn wnVar = niVar.d;
                iArr[0] = (int) wnVar.f39641s9;
                iArr[1] = wnVar.Aa;
                if (wl0Var2.f30104j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    wl0Var2.M0(0.0f, wl0Var2.f30109m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    wl0Var2.M0(0.0f, wl0Var2.getMeasuredHeight() - wl0Var2.f30109m2[1]);
                }
                wl0Var2.f30100h2.d.f39696x0.scrollBy(0, dp);
                if (wl0Var2.f30102i2) {
                    AndroidUtilities.runOnUIThread(wl0Var2.D2);
                    return;
                }
                return;
            case 21:
                dl0 dl0Var = (dl0) this.f21210b;
                t6 t6Var3 = dl0Var.f23663i0;
                if (dl0Var.f23667n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                }
                dl0Var.U = false;
                dl0Var.invalidate();
                return;
            case 22:
                yl0 yl0Var = (yl0) this.f21210b;
                RecyclerView recyclerView = yl0Var.f30640a;
                if (recyclerView != null) {
                    if (yl0Var.f30644g) {
                        recyclerView.scrollBy(0, -yl0Var.f30645i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (yl0Var.h) {
                        recyclerView.scrollBy(0, yl0Var.f30645i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 23:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f21210b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f22392b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f22395d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    xm0 xm0Var = scrollSlidingTextTabStrip.f22391b;
                    if (xm0Var != null) {
                        xm0Var.C0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) this.f21210b;
                ov0 ov0Var = shutterButton.e;
                if (ov0Var != null && !((sl) ov0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 25:
                ix0 ix0Var = (ix0) this.f21210b;
                View view = ix0Var.f25195s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        ix0Var.f25195s.setVisibility(0);
                        ix0Var.f25195s.setAlpha(0.0f);
                    }
                    ix0Var.f25195s.animate().setListener(null).cancel();
                    ix0Var.f25195s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                ix0Var.f25191c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 26:
                v81 v81Var = (v81) this.f21210b;
                if (v81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f15 = v81Var.f29090f0 + (((float) elapsedRealtime3) / 200.0f);
                    v81Var.f29090f0 = f15;
                    v81Var.setAnimationIdicatorProgress(v81Var.f29082a0.getInterpolation(f15));
                    if (v81Var.f29090f0 > 1.0f) {
                        v81Var.f29090f0 = 1.0f;
                    }
                    if (v81Var.f29090f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(v81Var.f29093i0);
                        return;
                    }
                    v81Var.J = false;
                    v81Var.setEnabled(true);
                    u81 u81Var = v81Var.f29107y;
                    if (u81Var != null) {
                        ((l.d) u81Var).L(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                v30 v30Var = (v30) this.f21210b;
                if (v30Var.f29462b && v30Var.Q0.f33039z0 == null) {
                    v30Var.f29470g0 = false;
                    org.telegram.ui.Components.voip.m0.a(v30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(v30Var.f29471h0, 3000L);
                return;
            case 28:
                ((p4.s0) this.f21210b).c();
                return;
            default:
                p8.a aVar = (p8.a) this.f21210b;
                synchronized (aVar.f40996a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f41002j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f40998c = 1;
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
