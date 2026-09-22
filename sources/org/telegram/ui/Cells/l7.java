package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.a40;
import org.telegram.ui.bo;
import org.telegram.ui.qi;
import org.telegram.ui.tw;
public final class l7 implements Runnable {
    public final int f20391a;
    public final Object f20392b;

    public l7(Object obj, int i10) {
        this.f20391a = i10;
        this.f20392b = obj;
    }

    private final void a() {
        p8.a aVar = (p8.a) this.f20392b;
        synchronized (aVar.f40724a) {
            try {
                if (!aVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.f40730j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (!aVar.b()) {
                    return;
                }
                aVar.f40726c = 1;
                aVar.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
        float f11;
        String str;
        int i11;
        int i12;
        switch (this.f20391a) {
            case 0:
                n7 n7Var = (n7) this.f20392b;
                if (n7Var.f20471b == null) {
                    n7Var.f20471b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f20471b;
                int i13 = n7Var.f20473c + 1;
                n7Var.f20473c = i13;
                jVar.f2331b = i13;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 1:
                w7 w7Var = (w7) this.f20392b;
                RectF rectF = w7Var.f21573n;
                w7Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f21578y, 1000L);
                return;
            case 2:
                da daVar = (da) this.f20392b;
                if (daVar.N && daVar.E != null) {
                    if (daVar.Z && daVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (daVar.W != null) {
                        n10 = daVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!daVar.Z && !daVar.f19936k0) {
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
                    ll0 ll0Var = daVar.E;
                    if (ll0Var != null) {
                        if (!daVar.O) {
                            n10 = -n10;
                        }
                        ll0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.q7 q7Var = (org.telegram.ui.Components.q7) this.f20392b;
                org.telegram.ui.Components.h8 h8Var = q7Var.f27275y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i14 = h8Var.J0 + 1;
                    h8Var.J0 = i14;
                    if (i14 == 1) {
                        q7Var.v = true;
                        h8Var.H0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            h8Var.C0();
                        } else if (h8Var.H0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(h8Var.N0);
                            h8Var.L0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    } else if (i14 == 2) {
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
                org.telegram.ui.Components.h8 h8Var2 = (org.telegram.ui.Components.h8) this.f20392b;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f12 = h8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - h8Var2.K0;
                    h8Var2.K0 = currentTimeMillis;
                    long j11 = currentTimeMillis - h8Var2.L0;
                    int i15 = h8Var2.J0;
                    if (i15 == 1) {
                        j3 = 3;
                    } else if (i15 == 2) {
                        j3 = 6;
                    } else {
                        j3 = 12;
                    }
                    float f13 = ((f12 * f7) + ((float) ((j3 * j10) - j10))) / ((float) duration);
                    if (f13 < 0.0f) {
                        f13 = 0.0f;
                    }
                    h8Var2.I0 = f13;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = h8Var2.I0;
                        }
                        h8Var2.G0(playingMessageObject, false);
                    }
                    if (h8Var2.H0 == 1 && h8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j11 > 200 || h8Var2.I0 == 0.0f) {
                            h8Var2.L0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f13);
                        }
                        if (h8Var2.J0 > 0 && h8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(h8Var2.N0, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                h8Var2.K0 = System.currentTimeMillis();
                return;
            case 5:
                dd ddVar = (dd) this.f20392b;
                ddVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                ddVar.f23287f.performHapticFeedback(0);
                Runnable runnable = ddVar.f23290j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                nk nkVar = (nk) this.f20392b;
                if (nkVar.S) {
                    nkVar.N.clear();
                    nkVar.P.clear();
                    nkVar.Q.clear();
                    nkVar.l();
                    return;
                }
                return;
            case 7:
                pm pmVar = (pm) this.f20392b;
                qm qmVar = pmVar.P;
                if (qmVar.J != null && !qmVar.K) {
                    int computeVerticalScrollOffset = qmVar.f27384r.computeVerticalScrollOffset();
                    if (qmVar.f27384r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (pmVar.e() - pmVar.f27087r) + pmVar.f27086n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (qmVar.E - Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((qmVar.f27384r.getMeasuredHeight() - (qmVar.E - computeVerticalScrollOffset)) - qmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > qmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i16 = (int) f10;
                    if (Math.abs(i16) > 0 && qmVar.f27384r.canScrollVertically(i16) && (f10 <= 0.0f || !z10)) {
                        qmVar.E += f10;
                        qmVar.f27384r.scrollBy(0, i16);
                        pmVar.invalidate();
                    }
                    pmVar.L = true;
                    pmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 8:
                un unVar = (un) this.f20392b;
                l7 l7Var = unVar.U0;
                d6 d6Var = unVar.f28443g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!unVar.H && editField != null && unVar.G && !unVar.f28439e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(l7Var);
                        AndroidUtilities.runOnUIThread(l7Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ju juVar = (ju) this.f20392b;
                l7 l7Var2 = juVar.P;
                eu euVar = juVar.f25419a;
                if (!juVar.f25428y && euVar != null && juVar.N && !juVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    euVar.requestFocus();
                    AndroidUtilities.showKeyboard(euVar);
                    AndroidUtilities.cancelRunOnUIThread(l7Var2);
                    AndroidUtilities.runOnUIThread(l7Var2, 100L);
                    return;
                }
                return;
            case 10:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) this.f20392b).d;
                if (mVar.f7330a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7332c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7332c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 11:
                kz kzVar = (kz) this.f20392b;
                if (kzVar.B0.f25083s == null) {
                    kzVar.X1 = false;
                    kzVar.Y();
                    return;
                }
                return;
            case 12:
                k00 k00Var = (k00) this.f20392b;
                if (k00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f14 = k00Var.f25481p0 + (((float) elapsedRealtime) / 320.0f);
                    k00Var.f25481p0 = f14;
                    k00Var.setAnimationIdicatorProgress(k00Var.f25474i0.getInterpolation(f14));
                    if (k00Var.f25481p0 > 1.0f) {
                        k00Var.f25481p0 = 1.0f;
                    }
                    if (k00Var.f25481p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k00Var.f25489v0);
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
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f20392b;
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f22054s0, 1000L);
                return;
            case 14:
                TextureView textureView = ((v50) this.f20392b).H0.f29588l0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new ny(8, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 15:
                q60 q60Var = (q60) this.f20392b;
                r60 r60Var = q60Var.f27262x;
                e60 e60Var = r60Var.V;
                if (e60Var != null && e60Var.getAdapter() != null) {
                    r60Var.V.getClass();
                    int R = RecyclerView.R(q60Var);
                    if (R >= 0) {
                        r60Var.T.v(r60Var.V.T(q60Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 16:
                vb0 vb0Var = (vb0) this.f20392b;
                ValueAnimator valueAnimator = vb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    vb0Var.h.start();
                    return;
                }
                return;
            case 17:
                sd0 sd0Var = (sd0) this.f20392b;
                sd0Var.e();
                AndroidUtilities.runOnUIThread(sd0Var.R, 100L);
                return;
            case 18:
                ii0 ii0Var = (ii0) this.f20392b;
                ii0Var.f25042y = true;
                ValueAnimator valueAnimator2 = ii0Var.f25043z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ii0Var.f25041x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ii0Var.f25043z = ofFloat;
                ofFloat.addUpdateListener(ii0Var.f25020b0);
                ii0Var.f25043z.setInterpolator(new LinearInterpolator());
                ii0Var.f25043z.setDuration(150L);
                ii0Var.f25043z.start();
                return;
            case 19:
                ll0 ll0Var2 = (ll0) this.f20392b;
                qi qiVar = ll0Var2.f25954h2;
                int[] iArr = ll0Var2.f25963m2;
                bo boVar = qiVar.d;
                iArr[0] = (int) boVar.f32464s9;
                iArr[1] = boVar.Aa;
                if (ll0Var2.f25958j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    ll0Var2.M0(0.0f, ll0Var2.f25963m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    ll0Var2.M0(0.0f, ll0Var2.getMeasuredHeight() - ll0Var2.f25963m2[1]);
                }
                ll0Var2.f25954h2.d.f32519x0.scrollBy(0, dp);
                if (ll0Var2.f25956i2) {
                    AndroidUtilities.runOnUIThread(ll0Var2.D2);
                    return;
                }
                return;
            case 20:
                sk0 sk0Var = (sk0) this.f20392b;
                l7 l7Var3 = sk0Var.f27894i0;
                if (sk0Var.f27898n) {
                    AndroidUtilities.cancelRunOnUIThread(l7Var3);
                    AndroidUtilities.runOnUIThread(l7Var3, 4000L);
                    return;
                }
                sk0Var.U = false;
                sk0Var.invalidate();
                return;
            case 21:
                nl0 nl0Var = (nl0) this.f20392b;
                RecyclerView recyclerView = nl0Var.f26487a;
                if (recyclerView != null) {
                    if (nl0Var.f26491g) {
                        recyclerView.scrollBy(0, -nl0Var.f26492i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (nl0Var.h) {
                        recyclerView.scrollBy(0, nl0Var.f26492i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f20392b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f15 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f22166b0));
                    scrollSlidingTextTabStrip.S = f15;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f15));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f22169d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    lm0 lm0Var = scrollSlidingTextTabStrip.f22165b;
                    if (lm0Var != null) {
                        lm0Var.C0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ShutterButton shutterButton = (ShutterButton) this.f20392b;
                dv0 dv0Var = shutterButton.e;
                if (dv0Var != null && !((rl) dv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 24:
                yw0 yw0Var = (yw0) this.f20392b;
                View view = yw0Var.f30421s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        yw0Var.f30421s.setVisibility(0);
                        yw0Var.f30421s.setAlpha(0.0f);
                    }
                    yw0Var.f30421s.animate().setListener(null).cancel();
                    yw0Var.f30421s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                yw0Var.f30417c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 25:
                h81 h81Var = (h81) this.f20392b;
                if (h81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f16 = h81Var.f24600f0 + (((float) elapsedRealtime3) / 200.0f);
                    h81Var.f24600f0 = f16;
                    h81Var.setAnimationIdicatorProgress(h81Var.f24592a0.getInterpolation(f16));
                    if (h81Var.f24600f0 > 1.0f) {
                        h81Var.f24600f0 = 1.0f;
                    }
                    if (h81Var.f24600f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(h81Var.f24603i0);
                        return;
                    }
                    h81Var.J = false;
                    h81Var.setEnabled(true);
                    g81 g81Var = h81Var.f24617y;
                    if (g81Var != null) {
                        ((ka.c) g81Var).h(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                a40 a40Var = (a40) this.f20392b;
                if (a40Var.f29055b && a40Var.Q0.f34531z0 == null) {
                    a40Var.f29063g0 = false;
                    org.telegram.ui.Components.voip.m0.a(a40Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(a40Var.f29064h0, 3000L);
                return;
            case 27:
                ((p4.s0) this.f20392b).c();
                return;
            case 28:
                a();
                return;
            default:
                pg.a1 a1Var = (pg.a1) this.f20392b;
                if (a1Var.f40806f && !a1Var.f40812y.f40829y) {
                    pg.a1.b(a1Var);
                    GLES20.glBindFramebuffer(36160, 0);
                    pg.a1 a1Var2 = (pg.a1) this.f20392b;
                    GLES20.glViewport(0, 0, a1Var2.f40807n, a1Var2.f40808r);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    pg.q0 q0Var = ((pg.a1) this.f20392b).f40812y.f40822c;
                    if (q0Var.f40958r != null) {
                        if (q0Var.D != null && q0Var.F != null && q0Var.E) {
                            GLES20.glBindFramebuffer(36160, 0);
                            pg.d1 d1Var = (pg.d1) q0Var.f40958r.get("videoBlur");
                            if (d1Var != null) {
                                GLES20.glUseProgram(d1Var.f40852a);
                                GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.f40964y));
                                GLES20.glUniform1f(d1Var.d("flipy"), 0.0f);
                                GLES20.glUniform1i(d1Var.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, q0Var.D.c());
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glUniform1i(d1Var.d("blured"), 1);
                                GLES20.glActiveTexture(33985);
                                org.telegram.ui.Components.na naVar = q0Var.F.f24654m;
                                if (naVar != null) {
                                    i12 = naVar.f26418s[2];
                                } else {
                                    i12 = -1;
                                }
                                GLES20.glBindTexture(3553, i12);
                                if (q0Var.f40945b != null && (q0Var.f40949i instanceof pg.d)) {
                                    GLES20.glUniform1f(d1Var.d("eraser"), 1.0f);
                                    GLES20.glUniform1i(d1Var.d("mask"), 2);
                                    GLES20.glActiveTexture(33986);
                                    GLES20.glBindTexture(3553, q0Var.g());
                                } else {
                                    GLES20.glUniform1f(d1Var.d("eraser"), 0.0f);
                                }
                                GLES20.glBlendFunc(1, 0);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.f40953m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.f40954n);
                                GLES20.glEnableVertexAttribArray(1);
                                synchronized (q0Var.F.h) {
                                    GLES20.glDrawArrays(5, 0, 4);
                                }
                            }
                        }
                        if (q0Var.f40945b != null) {
                            q0Var.n(q0Var.g(), q0Var.f40945b, (1.0f - (q0Var.I * 0.5f)) - (q0Var.J * 0.5f));
                        } else if (q0Var.f40946c != null) {
                            q0Var.o(q0Var.j(), q0Var.g(), q0Var.f40946c, 1.0f);
                        } else {
                            int j12 = q0Var.j();
                            Map map = q0Var.f40958r;
                            f11 = 0.5f;
                            if (q0Var.G) {
                                str = "maskingBlit";
                            } else {
                                str = "blit";
                            }
                            pg.d1 d1Var2 = (pg.d1) map.get(str);
                            if (j12 != 0 && d1Var2 != null) {
                                GLES20.glUseProgram(d1Var2.f40852a);
                                GLES20.glUniformMatrix4fv(d1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.f40964y));
                                GLES20.glUniform1f(d1Var2.d("alpha"), 1.0f);
                                if (q0Var.G) {
                                    GLES20.glUniform1i(d1Var2.d("texture"), 1);
                                    GLES20.glUniform1i(d1Var2.d("mask"), 0);
                                    GLES20.glUniform1f(d1Var2.d("preview"), 0.4f);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j12);
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(3553, q0Var.f40952l.c());
                                } else {
                                    GLES20.glUniform1i(d1Var2.d("texture"), 0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j12);
                                }
                                GLES20.glBlendFunc(1, 771);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.f40953m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.f40954n);
                                GLES20.glEnableVertexAttribArray(1);
                                GLES20.glDrawArrays(5, 0, 4);
                                w7.m6.a();
                            }
                            i11 = q0Var.f40957q;
                            if (i11 != 0 && q0Var.d != null && q0Var.I > 0.0f) {
                                q0Var.o(i11, q0Var.g(), q0Var.d, (q0Var.J * f11) + (q0Var.I * f11));
                            }
                        }
                        f11 = 0.5f;
                        i11 = q0Var.f40957q;
                        if (i11 != 0) {
                            q0Var.o(i11, q0Var.g(), q0Var.d, (q0Var.J * f11) + (q0Var.I * f11));
                        }
                    }
                    GLES20.glBlendFunc(1, 771);
                    pg.a1 a1Var3 = (pg.a1) this.f20392b;
                    a1Var3.f40804b.eglSwapBuffers(a1Var3.f40805c, a1Var3.e);
                    pg.c1 c1Var = ((pg.a1) this.f20392b).f40812y;
                    if (!c1Var.f40826s) {
                        c1Var.f40826s = true;
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 11));
                    }
                    if (!((pg.a1) this.f20392b).h) {
                        ((pg.a1) this.f20392b).h = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
