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
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.bo;
import org.telegram.ui.c40;
import org.telegram.ui.ri;
import org.telegram.ui.vw;
public final class l7 implements Runnable {
    public final int f20407a;
    public final Object f20408b;

    public l7(Object obj, int i10) {
        this.f20407a = i10;
        this.f20408b = obj;
    }

    private final void a() {
        p8.a aVar = (p8.a) this.f20408b;
        synchronized (aVar.f40750a) {
            try {
                if (!aVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.f40756j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (!aVar.b()) {
                    return;
                }
                aVar.f40752c = 1;
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
        switch (this.f20407a) {
            case 0:
                n7 n7Var = (n7) this.f20408b;
                if (n7Var.f20492b == null) {
                    n7Var.f20492b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f20492b;
                int i13 = n7Var.f20494c + 1;
                n7Var.f20494c = i13;
                jVar.f2334b = i13;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 1:
                w7 w7Var = (w7) this.f20408b;
                RectF rectF = w7Var.f21589n;
                w7Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f21594y, 1000L);
                return;
            case 2:
                da daVar = (da) this.f20408b;
                if (daVar.N && daVar.E != null) {
                    if (daVar.Z && daVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (daVar.W != null) {
                        n10 = daVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!daVar.Z && !daVar.f19967k0) {
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
                    ml0 ml0Var = daVar.E;
                    if (ml0Var != null) {
                        if (!daVar.O) {
                            n10 = -n10;
                        }
                        ml0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.q7 q7Var = (org.telegram.ui.Components.q7) this.f20408b;
                org.telegram.ui.Components.h8 h8Var = q7Var.f27233y;
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
                org.telegram.ui.Components.h8 h8Var2 = (org.telegram.ui.Components.h8) this.f20408b;
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
                dd ddVar = (dd) this.f20408b;
                ddVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                ddVar.f23315f.performHapticFeedback(0);
                Runnable runnable = ddVar.f23318j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                nk nkVar = (nk) this.f20408b;
                if (nkVar.S) {
                    nkVar.N.clear();
                    nkVar.P.clear();
                    nkVar.Q.clear();
                    nkVar.l();
                    return;
                }
                return;
            case 7:
                pm pmVar = (pm) this.f20408b;
                qm qmVar = pmVar.P;
                if (qmVar.J != null && !qmVar.K) {
                    int computeVerticalScrollOffset = qmVar.f27348r.computeVerticalScrollOffset();
                    if (qmVar.f27348r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (pmVar.e() - pmVar.f27077r) + pmVar.f27076n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (qmVar.E - Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((qmVar.f27348r.getMeasuredHeight() - (qmVar.E - computeVerticalScrollOffset)) - qmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > qmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i16 = (int) f10;
                    if (Math.abs(i16) > 0 && qmVar.f27348r.canScrollVertically(i16) && (f10 <= 0.0f || !z10)) {
                        qmVar.E += f10;
                        qmVar.f27348r.scrollBy(0, i16);
                        pmVar.invalidate();
                    }
                    pmVar.L = true;
                    pmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 8:
                un unVar = (un) this.f20408b;
                l7 l7Var = unVar.U0;
                c6 c6Var = unVar.f28424g1;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!unVar.H && editField != null && unVar.G && !unVar.f28420e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                ju juVar = (ju) this.f20408b;
                l7 l7Var2 = juVar.P;
                eu euVar = juVar.f25430a;
                if (!juVar.f25439y && euVar != null && juVar.N && !juVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    euVar.requestFocus();
                    AndroidUtilities.showKeyboard(euVar);
                    AndroidUtilities.cancelRunOnUIThread(l7Var2);
                    AndroidUtilities.runOnUIThread(l7Var2, 100L);
                    return;
                }
                return;
            case 10:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) this.f20408b).d;
                if (mVar.f7333a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7335c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7335c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 11:
                kz kzVar = (kz) this.f20408b;
                if (kzVar.B0.f25350s == null) {
                    kzVar.X1 = false;
                    kzVar.Z();
                    return;
                }
                return;
            case 12:
                k00 k00Var = (k00) this.f20408b;
                if (k00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f14 = k00Var.f25495p0 + (((float) elapsedRealtime) / 320.0f);
                    k00Var.f25495p0 = f14;
                    k00Var.setAnimationIdicatorProgress(k00Var.f25488i0.getInterpolation(f14));
                    if (k00Var.f25495p0 > 1.0f) {
                        k00Var.f25495p0 = 1.0f;
                    }
                    if (k00Var.f25495p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k00Var.f25503v0);
                        return;
                    }
                    k00Var.O = false;
                    k00Var.setEnabled(true);
                    e00 e00Var = k00Var.J;
                    if (e00Var != null) {
                        ((vw) e00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f20408b;
                float[] fArr = FragmentContextView.M0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f22067s0, 1000L);
                return;
            case 14:
                TextureView textureView = ((v50) this.f20408b).H0.f29546l0;
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
                q60 q60Var = (q60) this.f20408b;
                r60 r60Var = q60Var.f27227x;
                e60 e60Var = r60Var.V;
                if (e60Var != null && e60Var.getAdapter() != null) {
                    r60Var.V.getClass();
                    int S = RecyclerView.S(q60Var);
                    if (S >= 0) {
                        r60Var.T.v(r60Var.V.U(q60Var), S);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 16:
                vb0 vb0Var = (vb0) this.f20408b;
                ValueAnimator valueAnimator = vb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    vb0Var.h.start();
                    return;
                }
                return;
            case 17:
                sd0 sd0Var = (sd0) this.f20408b;
                sd0Var.e();
                AndroidUtilities.runOnUIThread(sd0Var.R, 100L);
                return;
            case 18:
                ji0 ji0Var = (ji0) this.f20408b;
                ji0Var.f25301y = true;
                ValueAnimator valueAnimator2 = ji0Var.f25302z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ji0Var.f25300x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ji0Var.f25302z = ofFloat;
                ofFloat.addUpdateListener(ji0Var.f25279b0);
                ji0Var.f25302z.setInterpolator(new LinearInterpolator());
                ji0Var.f25302z.setDuration(150L);
                ji0Var.f25302z.start();
                return;
            case 19:
                ml0 ml0Var2 = (ml0) this.f20408b;
                ri riVar = ml0Var2.f26176h2;
                int[] iArr = ml0Var2.f26185m2;
                bo boVar = riVar.d;
                iArr[0] = (int) boVar.f32447s9;
                iArr[1] = boVar.Aa;
                if (ml0Var2.f26180j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    ml0Var2.N0(0.0f, ml0Var2.f26185m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    ml0Var2.N0(0.0f, ml0Var2.getMeasuredHeight() - ml0Var2.f26185m2[1]);
                }
                ml0Var2.f26176h2.d.f32502x0.scrollBy(0, dp);
                if (ml0Var2.f26178i2) {
                    AndroidUtilities.runOnUIThread(ml0Var2.D2);
                    return;
                }
                return;
            case 20:
                tk0 tk0Var = (tk0) this.f20408b;
                l7 l7Var3 = tk0Var.f28134i0;
                if (tk0Var.f28138n) {
                    AndroidUtilities.cancelRunOnUIThread(l7Var3);
                    AndroidUtilities.runOnUIThread(l7Var3, 4000L);
                    return;
                }
                tk0Var.U = false;
                tk0Var.invalidate();
                return;
            case 21:
                ol0 ol0Var = (ol0) this.f20408b;
                RecyclerView recyclerView = ol0Var.f26770a;
                if (recyclerView != null) {
                    if (ol0Var.f26774g) {
                        recyclerView.scrollBy(0, -ol0Var.f26775i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (ol0Var.h) {
                        recyclerView.scrollBy(0, ol0Var.f26775i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f20408b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f15 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f22179b0));
                    scrollSlidingTextTabStrip.S = f15;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f15));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f22182d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    mm0 mm0Var = scrollSlidingTextTabStrip.f22178b;
                    if (mm0Var != null) {
                        mm0Var.C0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ShutterButton shutterButton = (ShutterButton) this.f20408b;
                ev0 ev0Var = shutterButton.e;
                if (ev0Var != null && !((rl) ev0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 24:
                zw0 zw0Var = (zw0) this.f20408b;
                View view = zw0Var.f30678s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        zw0Var.f30678s.setVisibility(0);
                        zw0Var.f30678s.setAlpha(0.0f);
                    }
                    zw0Var.f30678s.animate().setListener(null).cancel();
                    zw0Var.f30678s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                zw0Var.f30674c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 25:
                i81 i81Var = (i81) this.f20408b;
                if (i81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f16 = i81Var.f24879f0 + (((float) elapsedRealtime3) / 200.0f);
                    i81Var.f24879f0 = f16;
                    i81Var.setAnimationIdicatorProgress(i81Var.f24871a0.getInterpolation(f16));
                    if (i81Var.f24879f0 > 1.0f) {
                        i81Var.f24879f0 = 1.0f;
                    }
                    if (i81Var.f24879f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(i81Var.f24882i0);
                        return;
                    }
                    i81Var.J = false;
                    i81Var.setEnabled(true);
                    h81 h81Var = i81Var.f24896y;
                    if (h81Var != null) {
                        ((ka.c) h81Var).h(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                c40 c40Var = (c40) this.f20408b;
                if (c40Var.f29035b && c40Var.Q0.f35115z0 == null) {
                    c40Var.f29043g0 = false;
                    org.telegram.ui.Components.voip.m0.a(c40Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(c40Var.f29044h0, 3000L);
                return;
            case 27:
                ((p4.s0) this.f20408b).c();
                return;
            case 28:
                a();
                return;
            default:
                pg.a1 a1Var = (pg.a1) this.f20408b;
                if (a1Var.f40832f && !a1Var.f40838y.f40855y) {
                    pg.a1.b(a1Var);
                    GLES20.glBindFramebuffer(36160, 0);
                    pg.a1 a1Var2 = (pg.a1) this.f20408b;
                    GLES20.glViewport(0, 0, a1Var2.f40833n, a1Var2.f40834r);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    pg.q0 q0Var = ((pg.a1) this.f20408b).f40838y.f40848c;
                    if (q0Var.f40984r != null) {
                        if (q0Var.D != null && q0Var.F != null && q0Var.E) {
                            GLES20.glBindFramebuffer(36160, 0);
                            pg.d1 d1Var = (pg.d1) q0Var.f40984r.get("videoBlur");
                            if (d1Var != null) {
                                GLES20.glUseProgram(d1Var.f40878a);
                                GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.f40990y));
                                GLES20.glUniform1f(d1Var.d("flipy"), 0.0f);
                                GLES20.glUniform1i(d1Var.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, q0Var.D.c());
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glUniform1i(d1Var.d("blured"), 1);
                                GLES20.glActiveTexture(33985);
                                org.telegram.ui.Components.na naVar = q0Var.F.f24615m;
                                if (naVar != null) {
                                    i12 = naVar.f26421s[2];
                                } else {
                                    i12 = -1;
                                }
                                GLES20.glBindTexture(3553, i12);
                                if (q0Var.f40971b != null && (q0Var.f40975i instanceof pg.d)) {
                                    GLES20.glUniform1f(d1Var.d("eraser"), 1.0f);
                                    GLES20.glUniform1i(d1Var.d("mask"), 2);
                                    GLES20.glActiveTexture(33986);
                                    GLES20.glBindTexture(3553, q0Var.g());
                                } else {
                                    GLES20.glUniform1f(d1Var.d("eraser"), 0.0f);
                                }
                                GLES20.glBlendFunc(1, 0);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.f40979m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.f40980n);
                                GLES20.glEnableVertexAttribArray(1);
                                synchronized (q0Var.F.h) {
                                    GLES20.glDrawArrays(5, 0, 4);
                                }
                            }
                        }
                        if (q0Var.f40971b != null) {
                            q0Var.n(q0Var.g(), q0Var.f40971b, (1.0f - (q0Var.I * 0.5f)) - (q0Var.J * 0.5f));
                        } else if (q0Var.f40972c != null) {
                            q0Var.o(q0Var.j(), q0Var.g(), q0Var.f40972c, 1.0f);
                        } else {
                            int j12 = q0Var.j();
                            Map map = q0Var.f40984r;
                            f11 = 0.5f;
                            if (q0Var.G) {
                                str = "maskingBlit";
                            } else {
                                str = "blit";
                            }
                            pg.d1 d1Var2 = (pg.d1) map.get(str);
                            if (j12 != 0 && d1Var2 != null) {
                                GLES20.glUseProgram(d1Var2.f40878a);
                                GLES20.glUniformMatrix4fv(d1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.f40990y));
                                GLES20.glUniform1f(d1Var2.d("alpha"), 1.0f);
                                if (q0Var.G) {
                                    GLES20.glUniform1i(d1Var2.d("texture"), 1);
                                    GLES20.glUniform1i(d1Var2.d("mask"), 0);
                                    GLES20.glUniform1f(d1Var2.d("preview"), 0.4f);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j12);
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(3553, q0Var.f40978l.c());
                                } else {
                                    GLES20.glUniform1i(d1Var2.d("texture"), 0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j12);
                                }
                                GLES20.glBlendFunc(1, 771);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.f40979m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.f40980n);
                                GLES20.glEnableVertexAttribArray(1);
                                GLES20.glDrawArrays(5, 0, 4);
                                w7.m6.a();
                            }
                            i11 = q0Var.f40983q;
                            if (i11 != 0 && q0Var.d != null && q0Var.I > 0.0f) {
                                q0Var.o(i11, q0Var.g(), q0Var.d, (q0Var.J * f11) + (q0Var.I * f11));
                            }
                        }
                        f11 = 0.5f;
                        i11 = q0Var.f40983q;
                        if (i11 != 0) {
                            q0Var.o(i11, q0Var.g(), q0Var.d, (q0Var.J * f11) + (q0Var.I * f11));
                        }
                    }
                    GLES20.glBlendFunc(1, 771);
                    pg.a1 a1Var3 = (pg.a1) this.f20408b;
                    a1Var3.f40830b.eglSwapBuffers(a1Var3.f40831c, a1Var3.e);
                    pg.c1 c1Var = ((pg.a1) this.f20408b).f40838y;
                    if (!c1Var.f40852s) {
                        c1Var.f40852s = true;
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 11));
                    }
                    if (!((pg.a1) this.f20408b).h) {
                        ((pg.a1) this.f20408b).h = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
