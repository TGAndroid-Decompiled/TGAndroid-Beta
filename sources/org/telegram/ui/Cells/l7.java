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
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.ni;
import org.telegram.ui.qw;
import org.telegram.ui.x30;
import org.telegram.ui.xn;
public final class l7 implements Runnable {
    public final int f20378a;
    public final Object f20379b;

    public l7(Object obj, int i10) {
        this.f20378a = i10;
        this.f20379b = obj;
    }

    private final void a() {
        p8.a aVar = (p8.a) this.f20379b;
        synchronized (aVar.f40679a) {
            try {
                if (!aVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.f40685j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (!aVar.b()) {
                    return;
                }
                aVar.f40681c = 1;
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
        switch (this.f20378a) {
            case 0:
                n7 n7Var = (n7) this.f20379b;
                if (n7Var.f20450b == null) {
                    n7Var.f20450b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.f20450b;
                int i13 = n7Var.f20452c + 1;
                n7Var.f20452c = i13;
                jVar.f2326b = i13;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 1:
                w7 w7Var = (w7) this.f20379b;
                RectF rectF = w7Var.f21556n;
                w7Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.f21561y, 1000L);
                return;
            case 2:
                ea eaVar = (ea) this.f20379b;
                if (eaVar.N && eaVar.E != null) {
                    if (eaVar.Z && eaVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (eaVar.W != null) {
                        n10 = eaVar.n() >> 1;
                    } else {
                        return;
                    }
                    if (!eaVar.Z && !eaVar.f19995k0) {
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
                    ml0 ml0Var = eaVar.E;
                    if (ml0Var != null) {
                        if (!eaVar.O) {
                            n10 = -n10;
                        }
                        ml0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) this.f20379b;
                org.telegram.ui.Components.j8 j8Var = s7Var.f27864y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i14 = j8Var.J0 + 1;
                    j8Var.J0 = i14;
                    if (i14 == 1) {
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
                org.telegram.ui.Components.j8 j8Var2 = (org.telegram.ui.Components.j8) this.f20379b;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f12 = j8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - j8Var2.K0;
                    j8Var2.K0 = currentTimeMillis;
                    long j11 = currentTimeMillis - j8Var2.L0;
                    int i15 = j8Var2.J0;
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
                    j8Var2.I0 = f13;
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
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f13);
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
            case 5:
                fd fdVar = (fd) this.f20379b;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f23943f.performHapticFeedback(0);
                Runnable runnable = fdVar.f23946j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ok okVar = (ok) this.f20379b;
                if (okVar.S) {
                    okVar.N.clear();
                    okVar.P.clear();
                    okVar.Q.clear();
                    okVar.l();
                    return;
                }
                return;
            case 7:
                qm qmVar = (qm) this.f20379b;
                rm rmVar = qmVar.P;
                if (rmVar.J != null && !rmVar.K) {
                    int computeVerticalScrollOffset = rmVar.f27671r.computeVerticalScrollOffset();
                    if (rmVar.f27671r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (qmVar.e() - qmVar.f27395r) + qmVar.f27394n) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float max = Math.max(0.0f, (rmVar.E - Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((rmVar.f27671r.getMeasuredHeight() - (rmVar.E - computeVerticalScrollOffset)) - rmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    if (max < dp2 && computeVerticalScrollOffset > rmVar.getListTopPadding()) {
                        f10 = (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    } else if (max2 < dp2) {
                        f10 = AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2));
                    } else {
                        f10 = 0.0f;
                    }
                    int i16 = (int) f10;
                    if (Math.abs(i16) > 0 && rmVar.f27671r.canScrollVertically(i16) && (f10 <= 0.0f || !z10)) {
                        rmVar.E += f10;
                        rmVar.f27671r.scrollBy(0, i16);
                        qmVar.invalidate();
                    }
                    qmVar.L = true;
                    qmVar.postDelayed(this, 15L);
                    return;
                }
                return;
            case 8:
                vn vnVar = (vn) this.f20379b;
                l7 l7Var = vnVar.U0;
                d6 d6Var = vnVar.f28788g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!vnVar.H && editField != null && vnVar.G && !vnVar.f28784e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                ku kuVar = (ku) this.f20379b;
                l7 l7Var2 = kuVar.P;
                fu fuVar = kuVar.f25693a;
                if (!kuVar.f25702y && fuVar != null && kuVar.N && !kuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    fuVar.requestFocus();
                    AndroidUtilities.showKeyboard(fuVar);
                    AndroidUtilities.cancelRunOnUIThread(l7Var2);
                    AndroidUtilities.runOnUIThread(l7Var2, 100L);
                    return;
                }
                return;
            case 10:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) this.f20379b).d;
                if (mVar.f7316a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.f7318c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.f7318c).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 11:
                lz lzVar = (lz) this.f20379b;
                if (lzVar.B0.f25373s == null) {
                    lzVar.X1 = false;
                    lzVar.Y();
                    return;
                }
                return;
            case 12:
                l00 l00Var = (l00) this.f20379b;
                if (l00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f14 = l00Var.f25752p0 + (((float) elapsedRealtime) / 320.0f);
                    l00Var.f25752p0 = f14;
                    l00Var.setAnimationIdicatorProgress(l00Var.f25745i0.getInterpolation(f14));
                    if (l00Var.f25752p0 > 1.0f) {
                        l00Var.f25752p0 = 1.0f;
                    }
                    if (l00Var.f25752p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(l00Var.f25760v0);
                        return;
                    }
                    l00Var.O = false;
                    l00Var.setEnabled(true);
                    f00 f00Var = l00Var.J;
                    if (f00Var != null) {
                        ((qw) f00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) this.f20379b;
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.f22028s0, 1000L);
                return;
            case 14:
                TextureView textureView = ((w50) this.f20379b).H0.f29905l0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new oy(8, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 15:
                r60 r60Var = (r60) this.f20379b;
                s60 s60Var = r60Var.f27564x;
                f60 f60Var = s60Var.V;
                if (f60Var != null && f60Var.getAdapter() != null) {
                    s60Var.V.getClass();
                    int R = RecyclerView.R(r60Var);
                    if (R >= 0) {
                        s60Var.T.v(s60Var.V.T(r60Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 16:
                ub0 ub0Var = (ub0) this.f20379b;
                ValueAnimator valueAnimator = ub0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ub0Var.h.start();
                    return;
                }
                return;
            case 17:
                sd0 sd0Var = (sd0) this.f20379b;
                sd0Var.e();
                AndroidUtilities.runOnUIThread(sd0Var.R, 100L);
                return;
            case 18:
                ji0 ji0Var = (ji0) this.f20379b;
                ji0Var.f25332y = true;
                ValueAnimator valueAnimator2 = ji0Var.f25333z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ji0Var.f25331x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ji0Var.f25333z = ofFloat;
                ofFloat.addUpdateListener(ji0Var.f25310b0);
                ji0Var.f25333z.setInterpolator(new LinearInterpolator());
                ji0Var.f25333z.setDuration(150L);
                ji0Var.f25333z.start();
                return;
            case 19:
                ml0 ml0Var2 = (ml0) this.f20379b;
                ni niVar = ml0Var2.f26207h2;
                int[] iArr = ml0Var2.f26216m2;
                xn xnVar = niVar.d;
                iArr[0] = (int) xnVar.f39541s9;
                iArr[1] = xnVar.Aa;
                if (ml0Var2.f26211j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    ml0Var2.M0(0.0f, ml0Var2.f26216m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    ml0Var2.M0(0.0f, ml0Var2.getMeasuredHeight() - ml0Var2.f26216m2[1]);
                }
                ml0Var2.f26207h2.d.f39596x0.scrollBy(0, dp);
                if (ml0Var2.f26209i2) {
                    AndroidUtilities.runOnUIThread(ml0Var2.D2);
                    return;
                }
                return;
            case 20:
                tk0 tk0Var = (tk0) this.f20379b;
                l7 l7Var3 = tk0Var.f28232i0;
                if (tk0Var.f28236n) {
                    AndroidUtilities.cancelRunOnUIThread(l7Var3);
                    AndroidUtilities.runOnUIThread(l7Var3, 4000L);
                    return;
                }
                tk0Var.U = false;
                tk0Var.invalidate();
                return;
            case 21:
                ol0 ol0Var = (ol0) this.f20379b;
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
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f20379b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f15 = scrollSlidingTextTabStrip.S + (((float) elapsedRealtime2) / ((float) scrollSlidingTextTabStrip.f22140b0));
                    scrollSlidingTextTabStrip.S = f15;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f15));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f22143d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    mm0 mm0Var = scrollSlidingTextTabStrip.f22139b;
                    if (mm0Var != null) {
                        mm0Var.C0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ShutterButton shutterButton = (ShutterButton) this.f20379b;
                dv0 dv0Var = shutterButton.e;
                if (dv0Var != null && !((sl) dv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 24:
                xw0 xw0Var = (xw0) this.f20379b;
                View view = xw0Var.f30083s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        xw0Var.f30083s.setVisibility(0);
                        xw0Var.f30083s.setAlpha(0.0f);
                    }
                    xw0Var.f30083s.animate().setListener(null).cancel();
                    xw0Var.f30083s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                xw0Var.f30079c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 25:
                g81 g81Var = (g81) this.f20379b;
                if (g81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f16 = g81Var.f24217f0 + (((float) elapsedRealtime3) / 200.0f);
                    g81Var.f24217f0 = f16;
                    g81Var.setAnimationIdicatorProgress(g81Var.f24209a0.getInterpolation(f16));
                    if (g81Var.f24217f0 > 1.0f) {
                        g81Var.f24217f0 = 1.0f;
                    }
                    if (g81Var.f24217f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(g81Var.f24220i0);
                        return;
                    }
                    g81Var.J = false;
                    g81Var.setEnabled(true);
                    f81 f81Var = g81Var.f24234y;
                    if (f81Var != null) {
                        ((ka.c) f81Var).h(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                x30 x30Var = (x30) this.f20379b;
                if (x30Var.f29029b && x30Var.Q0.f33202z0 == null) {
                    x30Var.f29037g0 = false;
                    org.telegram.ui.Components.voip.m0.a(x30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(x30Var.f29038h0, 3000L);
                return;
            case 27:
                ((p4.s0) this.f20379b).c();
                return;
            case 28:
                a();
                return;
            default:
                pg.b1 b1Var = (pg.b1) this.f20379b;
                if (b1Var.f40766f && !b1Var.f40772y.f40808y) {
                    pg.b1.b(b1Var);
                    GLES20.glBindFramebuffer(36160, 0);
                    pg.b1 b1Var2 = (pg.b1) this.f20379b;
                    GLES20.glViewport(0, 0, b1Var2.f40767n, b1Var2.f40768r);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    pg.r0 r0Var = ((pg.b1) this.f20379b).f40772y.f40801c;
                    if (r0Var.f40919r != null) {
                        if (r0Var.D != null && r0Var.F != null && r0Var.E) {
                            GLES20.glBindFramebuffer(36160, 0);
                            pg.e1 e1Var = (pg.e1) r0Var.f40919r.get("videoBlur");
                            if (e1Var != null) {
                                GLES20.glUseProgram(e1Var.f40810a);
                                GLES20.glUniformMatrix4fv(e1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(r0Var.f40925y));
                                GLES20.glUniform1f(e1Var.d("flipy"), 0.0f);
                                GLES20.glUniform1i(e1Var.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, r0Var.D.c());
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glUniform1i(e1Var.d("blured"), 1);
                                GLES20.glActiveTexture(33985);
                                org.telegram.ui.Components.pa paVar = r0Var.F.f25237m;
                                if (paVar != null) {
                                    i12 = paVar.f26990s[2];
                                } else {
                                    i12 = -1;
                                }
                                GLES20.glBindTexture(3553, i12);
                                if (r0Var.f40906b != null && (r0Var.f40910i instanceof pg.d)) {
                                    GLES20.glUniform1f(e1Var.d("eraser"), 1.0f);
                                    GLES20.glUniform1i(e1Var.d("mask"), 2);
                                    GLES20.glActiveTexture(33986);
                                    GLES20.glBindTexture(3553, r0Var.g());
                                } else {
                                    GLES20.glUniform1f(e1Var.d("eraser"), 0.0f);
                                }
                                GLES20.glBlendFunc(1, 0);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) r0Var.f40914m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) r0Var.f40915n);
                                GLES20.glEnableVertexAttribArray(1);
                                synchronized (r0Var.F.h) {
                                    GLES20.glDrawArrays(5, 0, 4);
                                }
                            }
                        }
                        if (r0Var.f40906b != null) {
                            r0Var.n(r0Var.g(), r0Var.f40906b, (1.0f - (r0Var.I * 0.5f)) - (r0Var.J * 0.5f));
                        } else if (r0Var.f40907c != null) {
                            r0Var.o(r0Var.j(), r0Var.g(), r0Var.f40907c, 1.0f);
                        } else {
                            int j12 = r0Var.j();
                            Map map = r0Var.f40919r;
                            f11 = 0.5f;
                            if (r0Var.G) {
                                str = "maskingBlit";
                            } else {
                                str = "blit";
                            }
                            pg.e1 e1Var2 = (pg.e1) map.get(str);
                            if (j12 != 0 && e1Var2 != null) {
                                GLES20.glUseProgram(e1Var2.f40810a);
                                GLES20.glUniformMatrix4fv(e1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(r0Var.f40925y));
                                GLES20.glUniform1f(e1Var2.d("alpha"), 1.0f);
                                if (r0Var.G) {
                                    GLES20.glUniform1i(e1Var2.d("texture"), 1);
                                    GLES20.glUniform1i(e1Var2.d("mask"), 0);
                                    GLES20.glUniform1f(e1Var2.d("preview"), 0.4f);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j12);
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(3553, r0Var.f40913l.c());
                                } else {
                                    GLES20.glUniform1i(e1Var2.d("texture"), 0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j12);
                                }
                                GLES20.glBlendFunc(1, 771);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) r0Var.f40914m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) r0Var.f40915n);
                                GLES20.glEnableVertexAttribArray(1);
                                GLES20.glDrawArrays(5, 0, 4);
                                w7.m6.a();
                            }
                            i11 = r0Var.f40918q;
                            if (i11 != 0 && r0Var.d != null && r0Var.I > 0.0f) {
                                r0Var.o(i11, r0Var.g(), r0Var.d, (r0Var.J * f11) + (r0Var.I * f11));
                            }
                        }
                        f11 = 0.5f;
                        i11 = r0Var.f40918q;
                        if (i11 != 0) {
                            r0Var.o(i11, r0Var.g(), r0Var.d, (r0Var.J * f11) + (r0Var.I * f11));
                        }
                    }
                    GLES20.glBlendFunc(1, 771);
                    pg.b1 b1Var3 = (pg.b1) this.f20379b;
                    b1Var3.f40764b.eglSwapBuffers(b1Var3.f40765c, b1Var3.e);
                    pg.d1 d1Var = ((pg.b1) this.f20379b).f40772y;
                    if (!d1Var.f40805s) {
                        d1Var.f40805s = true;
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(this, 11));
                    }
                    if (!((pg.b1) this.f20379b).h) {
                        ((pg.b1) this.f20379b).h = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
