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
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.f70;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.yw;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.a40;
import org.telegram.ui.ly;
import org.telegram.ui.oi;
import org.telegram.ui.yn;
public final class t6 implements Runnable {
    public final int f23070a;
    public final Object f23071b;

    public t6(Object obj, int i10) {
        this.f23070a = i10;
        this.f23071b = obj;
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
        switch (this.f23070a) {
            case 0:
                u6 u6Var = (u6) this.f23071b;
                u6Var.a();
                RectF rectF = u6Var.f23520f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) this.f23071b;
                if (n7Var.f22538b == null) {
                    n7Var.f22538b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f22538b;
                int i11 = n7Var.f22540c + 1;
                n7Var.f22540c = i11;
                jVar.f2522b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) this.f23071b;
                RectF rectF2 = w7Var.f23687n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f23692y, 1000L);
                return;
            case 3:
                da daVar = (da) this.f23071b;
                if (daVar.N && daVar.E != null) {
                    if (daVar.Z && daVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (daVar.W != null) {
                        n10 = daVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!daVar.Z && !daVar.f21966k0) {
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
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) this.f23071b;
                org.telegram.ui.Components.j8 j8Var = s7Var.f30650y;
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
                org.telegram.ui.Components.j8 j8Var2 = (org.telegram.ui.Components.j8) this.f23071b;
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
                gd gdVar = (gd) this.f23071b;
                gdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                gdVar.f26809f.performHapticFeedback(0);
                Runnable runnable = gdVar.f26812j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                qk qkVar = (qk) this.f23071b;
                if (qkVar.S) {
                    qkVar.N.clear();
                    qkVar.P.clear();
                    qkVar.Q.clear();
                    qkVar.l();
                    return;
                }
                return;
            case 8:
                sm smVar = (sm) this.f23071b;
                tm tmVar = smVar.P;
                if (tmVar.J != null && !tmVar.K) {
                    int computeVerticalScrollOffset = tmVar.f31098r.computeVerticalScrollOffset();
                    if (tmVar.f31098r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (smVar.e() - smVar.f30818r) + smVar.f30817n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (tmVar.E - Math.max(0, computeVerticalScrollOffset - tmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((tmVar.f31098r.getMeasuredHeight() - (tmVar.E - computeVerticalScrollOffset)) - tmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > tmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i14 = (int) f10;
                    if (Math.abs(i14) > 0 && tmVar.f31098r.canScrollVertically(i14) && (f10 <= 0.0f || !z10)) {
                        tmVar.E += f10;
                        tmVar.f31098r.scrollBy(0, i14);
                        smVar.invalidate();
                    }
                    smVar.L = true;
                    smVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 9:
                xn xnVar = (xn) this.f23071b;
                t6 t6Var = xnVar.U0;
                d6 d6Var = xnVar.f32926g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!xnVar.H && editField != null && xnVar.G && !xnVar.f32922e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                mu muVar = (mu) this.f23071b;
                t6 t6Var2 = muVar.P;
                hu huVar = muVar.f28710a;
                if (!muVar.f28720y && huVar != null && muVar.N && !muVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    huVar.requestFocus();
                    AndroidUtilities.showKeyboard(huVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    return;
                }
                return;
            case 11:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) this.f23071b).d;
                if (mVar.f7902a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7904c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7904c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 12:
                nz nzVar = (nz) this.f23071b;
                if (nzVar.B0.f24607s == null) {
                    nzVar.X1 = false;
                    nzVar.X();
                    return;
                }
                return;
            case 13:
                n00 n00Var = (n00) this.f23071b;
                if (n00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f13 = n00Var.f28789p0 + (((float) elapsedRealtime) / 320.0f);
                    n00Var.f28789p0 = f13;
                    n00Var.setAnimationIdicatorProgress(n00Var.f28782i0.getInterpolation(f13));
                    if (n00Var.f28789p0 > 1.0f) {
                        n00Var.f28789p0 = 1.0f;
                    }
                    if (n00Var.f28789p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(n00Var.f28797v0);
                        return;
                    }
                    n00Var.O = false;
                    n00Var.setEnabled(true);
                    h00 h00Var = n00Var.J;
                    if (h00Var != null) {
                        ((ly) h00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f23071b;
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f24188s0, 1000L);
                return;
            case 15:
                TextureView textureView = ((y50) this.f23071b).H0.f26324q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new yw(12, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 16:
                e70 e70Var = (e70) this.f23071b;
                f70 f70Var = e70Var.f25989x;
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
                ic0 ic0Var = (ic0) this.f23071b;
                ValueAnimator valueAnimator = ic0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ic0Var.h.start();
                    return;
                }
                return;
            case 18:
                ee0 ee0Var = (ee0) this.f23071b;
                ee0Var.e();
                AndroidUtilities.runOnUIThread(ee0Var.R, 100L);
                return;
            case 19:
                vi0 vi0Var = (vi0) this.f23071b;
                vi0Var.f31725y = true;
                ValueAnimator valueAnimator2 = vi0Var.f31726z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                vi0Var.f31724x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vi0Var.f31726z = ofFloat;
                ofFloat.addUpdateListener(vi0Var.f31702b0);
                vi0Var.f31726z.setInterpolator(new LinearInterpolator());
                vi0Var.f31726z.setDuration(150L);
                vi0Var.f31726z.start();
                return;
            case 20:
                zl0 zl0Var2 = (zl0) this.f23071b;
                oi oiVar = zl0Var2.f33537h2;
                int[] iArr = zl0Var2.f33546m2;
                yn ynVar = oiVar.d;
                iArr[0] = (int) ynVar.f43476q9;
                iArr[1] = ynVar.f43581ya;
                if (zl0Var2.f33541j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    zl0Var2.N0(0.0f, zl0Var2.f33546m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    zl0Var2.N0(0.0f, zl0Var2.getMeasuredHeight() - zl0Var2.f33546m2[1]);
                }
                zl0Var2.f33537h2.d.f43533v0.scrollBy(0, dp);
                if (zl0Var2.f33539i2) {
                    AndroidUtilities.runOnUIThread(zl0Var2.D2);
                    return;
                }
                return;
            case 21:
                fl0 fl0Var = (fl0) this.f23071b;
                t6 t6Var3 = fl0Var.f26506i0;
                if (fl0Var.f26510n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                }
                fl0Var.U = false;
                fl0Var.invalidate();
                return;
            case 22:
                dm0 dm0Var = (dm0) this.f23071b;
                RecyclerView recyclerView = dm0Var.f25769a;
                if (recyclerView != null) {
                    if (dm0Var.f25774g) {
                        recyclerView.scrollBy(0, -dm0Var.f25775i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (dm0Var.h) {
                        recyclerView.scrollBy(0, dm0Var.f25775i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 23:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f23071b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f14 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f24308b0));
                    scrollSlidingTextTabStrip.S = f14;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f14));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f24311d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    dn0 dn0Var = scrollSlidingTextTabStrip.f24307b;
                    if (dn0Var != null) {
                        dn0Var.E0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) this.f23071b;
                uv0 uv0Var = shutterButton.f24332e;
                if (uv0Var != null && !((ul) uv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 25:
                tx0 tx0Var = (tx0) this.f23071b;
                View view = tx0Var.f31205s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        tx0Var.f31205s.setVisibility(0);
                        tx0Var.f31205s.setAlpha(0.0f);
                    }
                    tx0Var.f31205s.animate().setListener(null).cancel();
                    tx0Var.f31205s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                tx0Var.f31200c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 26:
                f91 f91Var = (f91) this.f23071b;
                if (f91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f15 = f91Var.f26408f0 + (((float) elapsedRealtime3) / 200.0f);
                    f91Var.f26408f0 = f15;
                    f91Var.setAnimationIdicatorProgress(f91Var.f26399a0.getInterpolation(f15));
                    if (f91Var.f26408f0 > 1.0f) {
                        f91Var.f26408f0 = 1.0f;
                    }
                    if (f91Var.f26408f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(f91Var.f26411i0);
                        return;
                    }
                    f91Var.J = false;
                    f91Var.setEnabled(true);
                    e91 e91Var = f91Var.f26425y;
                    if (e91Var != null) {
                        ((n2.c) e91Var).k(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                a40 a40Var = (a40) this.f23071b;
                if (a40Var.f31982b && a40Var.Q0.f36983z0 == null) {
                    a40Var.f31991g0 = false;
                    org.telegram.ui.Components.voip.m0.a(a40Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(a40Var.f31992h0, 3000L);
                return;
            case 28:
                ((p4.s0) this.f23071b).c();
                return;
            default:
                p8.a aVar = (p8.a) this.f23071b;
                synchronized (aVar.f44344a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f44351j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f44346c = 1;
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
