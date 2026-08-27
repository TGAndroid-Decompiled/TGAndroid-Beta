package org.telegram.ui.Components;

import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

public final class mu0 implements Runnable {

    public final int f30748a;

    public final Object f30749b;

    public mu0(Object obj, int i10) {
        this.f30748a = i10;
        this.f30749b = obj;
    }

    private final void a() {
        float f10;
        float f11;
        int i10;
        yf.z0 z0Var = (yf.z0) this.f30749b;
        if (!z0Var.f50134f || z0Var.f50140y.f49888y) {
            return;
        }
        yf.z0.b(z0Var);
        GLES20.glBindFramebuffer(36160, 0);
        yf.z0 z0Var2 = (yf.z0) this.f30749b;
        GLES20.glViewport(0, 0, z0Var2.f50135n, z0Var2.f50136r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        yf.p0 p0Var = ((yf.z0) this.f30749b).f50140y.f49880c;
        if (p0Var.f50026r != null) {
            if (p0Var.D != null && p0Var.F != null && p0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                yf.c1 c1Var = (yf.c1) p0Var.f50026r.get("videoBlur");
                if (c1Var != null) {
                    GLES20.glUseProgram(c1Var.f49894a);
                    GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(p0Var.f50032y));
                    GLES20.glUniform1f(c1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(c1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, p0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(c1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    fa faVar = p0Var.F.f35212m;
                    GLES20.glBindTexture(3553, faVar != null ? faVar.f28334s[2] : -1);
                    if (p0Var.f50012b == null || !(p0Var.f50017i instanceof yf.d)) {
                        GLES20.glUniform1f(c1Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(c1Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(c1Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, p0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) p0Var.f50021m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) p0Var.f50022n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (p0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (p0Var.f50012b != null) {
                p0Var.n(p0Var.g(), p0Var.f50012b, (1.0f - (p0Var.I * 0.5f)) - (p0Var.J * 0.5f));
            } else {
                if (p0Var.f50013c != null) {
                    p0Var.o(p0Var.j(), p0Var.g(), p0Var.f50013c, 1.0f);
                } else {
                    int iJ = p0Var.j();
                    f10 = 0.0f;
                    yf.c1 c1Var2 = (yf.c1) p0Var.f50026r.get(p0Var.G ? "maskingBlit" : "blit");
                    if (iJ == 0 || c1Var2 == null) {
                        f11 = 0.5f;
                    } else {
                        GLES20.glUseProgram(c1Var2.f49894a);
                        f11 = 0.5f;
                        GLES20.glUniformMatrix4fv(c1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(p0Var.f50032y));
                        GLES20.glUniform1f(c1Var2.d("alpha"), 1.0f);
                        if (p0Var.G) {
                            GLES20.glUniform1i(c1Var2.d("texture"), 1);
                            GLES20.glUniform1i(c1Var2.d("mask"), 0);
                            GLES20.glUniform1f(c1Var2.d("preview"), 0.4f);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, iJ);
                            GLES20.glActiveTexture(33985);
                            GLES20.glBindTexture(3553, p0Var.f50020l.c());
                        } else {
                            GLES20.glUniform1i(c1Var2.d("texture"), 0);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, iJ);
                        }
                        GLES20.glBlendFunc(1, 771);
                        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) p0Var.f50021m);
                        GLES20.glEnableVertexAttribArray(0);
                        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) p0Var.f50022n);
                        GLES20.glEnableVertexAttribArray(1);
                        GLES20.glDrawArrays(5, 0, 4);
                        h7.n8.a();
                    }
                }
                i10 = p0Var.f50025q;
                if (i10 != 0 && p0Var.d != null && p0Var.I > f10) {
                    p0Var.o(i10, p0Var.g(), p0Var.d, (p0Var.J * f11) + (p0Var.I * f11));
                }
            }
            f10 = 0.0f;
            f11 = 0.5f;
            i10 = p0Var.f50025q;
            if (i10 != 0) {
                p0Var.o(i10, p0Var.g(), p0Var.d, (p0Var.J * f11) + (p0Var.I * f11));
            }
        }
        GLES20.glBlendFunc(1, 771);
        yf.z0 z0Var3 = (yf.z0) this.f30749b;
        z0Var3.f50131b.eglSwapBuffers(z0Var3.f50132c, z0Var3.f50133e);
        yf.b1 b1Var = ((yf.z0) this.f30749b).f50140y;
        if (!b1Var.f49885s) {
            b1Var.f49885s = true;
            AndroidUtilities.runOnUIThread(new qf.b(this, 21));
        }
        if (((yf.z0) this.f30749b).h) {
            return;
        }
        ((yf.z0) this.f30749b).h = true;
    }

    @Override
    public final void run() {
        switch (this.f30748a) {
            case 0:
                ShutterButton shutterButton = (ShutterButton) this.f30749b;
                nu0 nu0Var = shutterButton.f26532e;
                if (nu0Var == null || ((el) nu0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 1:
                iw0 iw0Var = (iw0) this.f30749b;
                View view = iw0Var.f29510s;
                if (view == null) {
                    iw0Var.f29505c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    iw0Var.f29510s.setVisibility(0);
                    iw0Var.f29510s.setAlpha(0.0f);
                }
                iw0Var.f29510s.animate().setListener(null).cancel();
                iw0Var.f29510s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 2:
                o71 o71Var = (o71) this.f30749b;
                if (o71Var.F) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (jElapsedRealtime > 17) {
                        jElapsedRealtime = 17;
                    }
                    float f10 = o71Var.f31207b0 + (jElapsedRealtime / 200.0f);
                    o71Var.f31207b0 = f10;
                    o71Var.setAnimationIdicatorProgress(o71Var.T.getInterpolation(f10));
                    if (o71Var.f31207b0 > 1.0f) {
                        o71Var.f31207b0 = 1.0f;
                    }
                    if (o71Var.f31207b0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(o71Var.f31212e0);
                        return;
                    }
                    o71Var.F = false;
                    o71Var.setEnabled(true);
                    n71 n71Var = o71Var.f31227y;
                    if (n71Var != null) {
                        ((m5.o) n71Var).x(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.ui.j30 j30Var = (org.telegram.ui.j30) this.f30749b;
                if (!j30Var.f33648b || j30Var.M0.f42497v0 != null) {
                    AndroidUtilities.runOnUIThread(j30Var.f33652d0, 3000L);
                    return;
                } else {
                    j30Var.f33651c0 = false;
                    j30Var.setUiVisible(false);
                    return;
                }
            case 4:
                ((p5.h) this.f30749b).g(false);
                return;
            case 5:
                r5.p pVar = (r5.p) this.f30749b;
                synchronized (r5.p.f46797i) {
                    try {
                        if (pVar.d()) {
                            pVar.f(15);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 6:
                tf.e eVar = (tf.e) this.f30749b;
                eVar.f48188f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 7:
                u0.d dVar = (u0.d) this.f30749b;
                m.s1 s1Var = dVar.f48238c;
                u0.a aVar = dVar.f48236a;
                if (dVar.A) {
                    if (dVar.f48245x) {
                        dVar.f48245x = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f48232e = jCurrentAnimationTimeMillis;
                        aVar.f48234g = -1L;
                        aVar.f48233f = jCurrentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f48234g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f48234g + ((long) aVar.f48235i)) || !dVar.e()) {
                        dVar.A = false;
                        return;
                    }
                    if (dVar.f48246y) {
                        dVar.f48246y = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        s1Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f48233f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j10 = jCurrentAnimationTimeMillis2 - aVar.f48233f;
                    aVar.f48233f = jCurrentAnimationTimeMillis2;
                    dVar.C.scrollListBy((int) (j10 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.d));
                    WeakHashMap weakHashMap = r0.j0.f46605a;
                    s1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 8:
                if (((TaskCompletionSource) this.f30749b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 9:
                a();
                return;
            default:
                zf.j jVar = ((org.telegram.ui.ys0) this.f30749b).O0;
                if (jVar instanceof zf.v2) {
                    ((zf.v2) jVar).getEditText();
                    return;
                }
                return;
        }
    }
}
