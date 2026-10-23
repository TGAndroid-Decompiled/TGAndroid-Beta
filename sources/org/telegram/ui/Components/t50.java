package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
public final class t50 implements TextureView.SurfaceTextureListener {
    public final int f30446a;
    public final Object f30447b;

    public t50(Object obj, int i10) {
        this.f30446a = i10;
        this.f30447b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f30446a) {
            case 0:
                m60 m60Var = (m60) this.f30447b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (m60Var.m0 == null && surfaceTexture != null && !m60Var.f28424l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    m60Var.m0 = new x50(m60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final v11 v11Var = (v11) this.f30447b;
                ArrayList arrayList = v11Var.f31121c;
                t11 t11Var = v11Var.f31119a;
                if (t11Var != null) {
                    t11Var.i();
                    v11Var.f31119a = null;
                }
                t11 t11Var2 = new t11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                v11Var.invalidate();
                                return;
                            default:
                                v11 v11Var2 = v11Var;
                                Runnable runnable = v11Var2.d;
                                if (runnable != null) {
                                    v11Var2.e = true;
                                    v11Var2.d = null;
                                    v11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                v11Var.invalidate();
                                return;
                            default:
                                v11 v11Var2 = v11Var;
                                Runnable runnable = v11Var2.d;
                                if (runnable != null) {
                                    v11Var2.e = true;
                                    v11Var2.d = null;
                                    v11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                v11Var.f31119a = t11Var2;
                t11Var2.f30395a = EmuDetector.with(v11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        u11 u11Var = (u11) arrayList.get(i12);
                        Bitmap bitmap = u11Var.e;
                        if (bitmap != null) {
                            v11Var.f31119a.c(u11Var.f30821f, bitmap, u11Var.f30820c, u11Var.d);
                        } else {
                            ArrayList arrayList2 = u11Var.f30819b;
                            if (arrayList2 != null) {
                                v11Var.f31119a.f(arrayList2, u11Var.d);
                            } else {
                                v11Var.f31119a.d(u11Var.f30818a, u11Var.f30822g, u11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(v11Var.f31120b);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                si.j jVar = (si.j) this.f30447b;
                si.n nVar = jVar.f46653j;
                nVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.f46663n;
                if (jVar.V && handler != null && jVar.f46635c.isAvailable()) {
                    handler.post(new si.a(jVar, 7));
                    return;
                }
                return;
            default:
                wh.f fVar = (wh.f) this.f30447b;
                if (fVar.f49049f == null) {
                    wh.e eVar = new wh.e(fVar, surfaceTexture, i10, i11, new wh.d(fVar, 1));
                    fVar.f49049f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f30446a) {
            case 0:
                m60 m60Var = (m60) this.f30447b;
                Camera2Session[] camera2SessionArr = m60Var.f28436v0;
                x50 x50Var = m60Var.m0;
                if (x50Var != null) {
                    x50Var.b(0L, 0, true, 0, 0);
                    m60Var.m0 = null;
                }
                if (m60Var.f28433s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (m60Var.f28434t0 != null) {
                    CameraController.getInstance().close(m60Var.f28434t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((ah0) this.f30447b).V.f33446w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                v11 v11Var = (v11) this.f30447b;
                t11 t11Var = v11Var.f31119a;
                if (t11Var != null) {
                    t11Var.i();
                    v11Var.f31119a = null;
                }
                Runnable runnable = v11Var.d;
                if (runnable != null) {
                    v11Var.d = null;
                    v11.b(runnable);
                    return false;
                }
                return false;
            case 3:
                w91 w91Var = (w91) this.f30447b;
                TextureView textureView = w91Var.d;
                if (w91Var.S) {
                    if (w91Var.W) {
                        w91Var.f32037r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    w91Var.S = false;
                    return false;
                }
                return true;
            case 4:
                ((si.j) this.f30447b).f46653j.b("preview surface destroyed: active=" + ((si.j) this.f30447b).V);
                if (((si.j) this.f30447b).V) {
                    ((si.j) this.f30447b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                wh.e eVar = ((wh.f) this.f30447b).f49049f;
                if (eVar != null) {
                    eVar.f49035a = false;
                    ((wh.f) this.f30447b).f49049f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f30446a) {
            case 0:
                x50 x50Var = ((m60) this.f30447b).m0;
                if (x50Var != null) {
                    x50Var.F = i10;
                    x50Var.G = i11;
                    x50Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                t11 t11Var = ((v11) this.f30447b).f31119a;
                if (t11Var != null && (handler = t11Var.getHandler()) != null && t11Var.f30396b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                si.j jVar = (si.j) this.f30447b;
                si.n nVar = jVar.f46653j;
                nVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.d0();
                return;
            default:
                wh.e eVar = ((wh.f) this.f30447b).f49049f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f49038f = true;
                        eVar.h = i10;
                        eVar.f49039n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j10;
        long j11;
        float f7;
        Object valueOf;
        String str;
        switch (this.f30446a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                w91 w91Var = (w91) this.f30447b;
                if (w91Var.f32037r == 1) {
                    w91Var.f32036n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 4));
                    w91Var.f32036n.invalidate();
                    return;
                }
                return;
            case 4:
                if (((si.j) this.f30447b).f46630a0) {
                    ((si.j) this.f30447b).f46630a0 = false;
                    si.n nVar = ((si.j) this.f30447b).f46653j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    si.j jVar = (si.j) this.f30447b;
                    if (jVar.m0) {
                        str = "DUAL_ACTIVE";
                    } else if (jVar.D0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(si.j.z(((si.j) this.f30447b).H0));
                    nVar.b(sb2.toString());
                    si.s0 s0Var = (si.s0) ((si.j) this.f30447b).f46656k.f14830b;
                    Handler handler = s0Var.f46771i;
                    l2.f fVar = s0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new org.telegram.ui.web.z1(fVar, 27));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                si.j jVar2 = (si.j) this.f30447b;
                if (jVar2.I0 == 0) {
                    jVar2.I0 = elapsedRealtimeNanos;
                    si.n nVar2 = jVar2.f46653j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((si.j) this.f30447b).f46635c.getWidth());
                    sb3.append("x");
                    sb3.append(((si.j) this.f30447b).f46635c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((si.j) this.f30447b).f46672q);
                    sb3.append(", attached=");
                    sb3.append(((si.j) this.f30447b).f46635c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((si.j) this.f30447b).f46635c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((si.j) this.f30447b).f46635c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((si.j) this.f30447b).f46635c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((si.j) this.f30447b).f46635c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((si.j) this.f30447b).f46635c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    nVar2.b(sb3.toString());
                }
                si.j jVar3 = (si.j) this.f30447b;
                long j12 = jVar3.K0;
                if (j12 != 0) {
                    long j13 = elapsedRealtimeNanos - j12;
                    jVar3.M0++;
                    jVar3.N0 += j13;
                    j10 = 0;
                    double d = j13;
                    jVar3.O0 = (d * d) + jVar3.O0;
                    long j14 = jVar3.P0;
                    if (j14 == 0 || j13 < j14) {
                        jVar3.P0 = j13;
                    }
                    jVar3.Q0 = Math.max(jVar3.Q0, j13);
                    if (j13 > 50000000) {
                        jVar3.R0++;
                    }
                    if (j13 > 100000000) {
                        jVar3.S0++;
                    }
                } else {
                    j10 = 0;
                }
                si.j jVar4 = (si.j) this.f30447b;
                jVar4.K0 = elapsedRealtimeNanos;
                long j15 = jVar4.L0;
                if (timestamp > j15) {
                    if (jVar4.U0 == j10) {
                        jVar4.U0 = timestamp;
                    }
                    jVar4.V0 = timestamp;
                    jVar4.T0++;
                } else if (j15 != j10) {
                    jVar4.W0++;
                }
                jVar4.L0 = timestamp;
                jVar4.J0++;
                if (elapsedRealtimeNanos - jVar4.I0 >= 5000000000L) {
                    TextureView textureView = jVar4.f46635c;
                    long j16 = jVar4.V0 - jVar4.U0;
                    if (j16 > j10) {
                        long j17 = jVar4.T0;
                        if (j17 > 1) {
                            f7 = (((float) (j17 - 1)) * 1.0E9f) / ((float) j16);
                            jVar4.f46653j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + si.j.j(jVar4.N0, jVar4.M0) + ", min=" + (((float) jVar4.P0) / 1000000.0f) + ", max=" + (((float) jVar4.Q0) / 1000000.0f) + ", jitter=" + si.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.I0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    jVar4.f46653j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + si.j.j(jVar4.N0, jVar4.M0) + ", min=" + (((float) jVar4.P0) / 1000000.0f) + ", max=" + (((float) jVar4.Q0) / 1000000.0f) + ", jitter=" + si.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    jVar4.P();
                    jVar4.I0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void e(SurfaceTexture surfaceTexture) {
    }

    private final void f(SurfaceTexture surfaceTexture) {
    }

    private final void g(SurfaceTexture surfaceTexture) {
    }

    private final void h(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void c(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void d(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
