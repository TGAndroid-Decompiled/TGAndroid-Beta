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
public final class x50 implements TextureView.SurfaceTextureListener {
    public final int f30876a;
    public final Object f30877b;

    public x50(Object obj, int i10) {
        this.f30876a = i10;
        this.f30877b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f30876a) {
            case 0:
                p60 p60Var = (p60) this.f30877b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (p60Var.m0 == null && surfaceTexture != null && !p60Var.f27874l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    p60Var.m0 = new b60(p60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final z11 z11Var = (z11) this.f30877b;
                ArrayList arrayList = z11Var.f31426c;
                x11 x11Var = z11Var.f31424a;
                if (x11Var != null) {
                    x11Var.i();
                    z11Var.f31424a = null;
                }
                x11 x11Var2 = new x11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                z11Var.invalidate();
                                return;
                            default:
                                z11 z11Var2 = z11Var;
                                Runnable runnable = z11Var2.d;
                                if (runnable != null) {
                                    z11Var2.e = true;
                                    z11Var2.d = null;
                                    z11.b(runnable);
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
                                z11Var.invalidate();
                                return;
                            default:
                                z11 z11Var2 = z11Var;
                                Runnable runnable = z11Var2.d;
                                if (runnable != null) {
                                    z11Var2.e = true;
                                    z11Var2.d = null;
                                    z11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                z11Var.f31424a = x11Var2;
                x11Var2.f30801a = EmuDetector.with(z11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        y11 y11Var = (y11) arrayList.get(i12);
                        Bitmap bitmap = y11Var.e;
                        if (bitmap != null) {
                            z11Var.f31424a.c(y11Var.f31114f, bitmap, y11Var.f31113c, y11Var.d);
                        } else {
                            ArrayList arrayList2 = y11Var.f31112b;
                            if (arrayList2 != null) {
                                z11Var.f31424a.f(arrayList2, y11Var.d);
                            } else {
                                z11Var.f31424a.d(y11Var.f31111a, y11Var.f31115g, y11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(z11Var.f31425b);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                ri.j jVar = (ri.j) this.f30877b;
                ri.n nVar = jVar.f44574j;
                nVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.f44584n;
                if (jVar.V && handler != null && jVar.f44556c.isAvailable()) {
                    handler.post(new ri.a(jVar, 7));
                    return;
                }
                return;
            default:
                wh.f fVar = (wh.f) this.f30877b;
                if (fVar.f47652f == null) {
                    wh.e eVar = new wh.e(fVar, surfaceTexture, i10, i11, new wh.d(fVar, 1));
                    fVar.f47652f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f30876a) {
            case 0:
                p60 p60Var = (p60) this.f30877b;
                Camera2Session[] camera2SessionArr = p60Var.f27886v0;
                b60 b60Var = p60Var.m0;
                if (b60Var != null) {
                    b60Var.b(0L, 0, true, 0, 0);
                    p60Var.m0 = null;
                }
                if (p60Var.f27883s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (p60Var.f27884t0 != null) {
                    CameraController.getInstance().close(p60Var.f27884t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((fh0) this.f30877b).V.f32091w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                z11 z11Var = (z11) this.f30877b;
                x11 x11Var = z11Var.f31424a;
                if (x11Var != null) {
                    x11Var.i();
                    z11Var.f31424a = null;
                }
                Runnable runnable = z11Var.d;
                if (runnable != null) {
                    z11Var.d = null;
                    z11.b(runnable);
                    return false;
                }
                return false;
            case 3:
                da1 da1Var = (da1) this.f30877b;
                TextureView textureView = da1Var.d;
                if (da1Var.S) {
                    if (da1Var.W) {
                        da1Var.f24062r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    da1Var.S = false;
                    return false;
                }
                return true;
            case 4:
                ((ri.j) this.f30877b).f44574j.b("preview surface destroyed: active=" + ((ri.j) this.f30877b).V);
                if (((ri.j) this.f30877b).V) {
                    ((ri.j) this.f30877b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                wh.e eVar = ((wh.f) this.f30877b).f47652f;
                if (eVar != null) {
                    eVar.f47638a = false;
                    ((wh.f) this.f30877b).f47652f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f30876a) {
            case 0:
                b60 b60Var = ((p60) this.f30877b).m0;
                if (b60Var != null) {
                    b60Var.F = i10;
                    b60Var.G = i11;
                    b60Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                x11 x11Var = ((z11) this.f30877b).f31424a;
                if (x11Var != null && (handler = x11Var.getHandler()) != null && x11Var.f30802b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                ri.j jVar = (ri.j) this.f30877b;
                ri.n nVar = jVar.f44574j;
                nVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.d0();
                return;
            default:
                wh.e eVar = ((wh.f) this.f30877b).f47652f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f47641f = true;
                        eVar.h = i10;
                        eVar.f47642n = i11;
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
        switch (this.f30876a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                da1 da1Var = (da1) this.f30877b;
                if (da1Var.f24062r == 1) {
                    da1Var.f24061n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 4));
                    da1Var.f24061n.invalidate();
                    return;
                }
                return;
            case 4:
                if (((ri.j) this.f30877b).f44551a0) {
                    ((ri.j) this.f30877b).f44551a0 = false;
                    ri.n nVar = ((ri.j) this.f30877b).f44574j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    ri.j jVar = (ri.j) this.f30877b;
                    if (jVar.m0) {
                        str = "DUAL_ACTIVE";
                    } else if (jVar.D0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(ri.j.z(((ri.j) this.f30877b).H0));
                    nVar.b(sb2.toString());
                    ri.r0 r0Var = (ri.r0) ((ri.j) this.f30877b).f44577k.f14848b;
                    Handler handler = r0Var.f44680i;
                    m.h hVar = r0Var.d;
                    Objects.requireNonNull(hVar);
                    handler.post(new ri.h0(hVar, 0));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                ri.j jVar2 = (ri.j) this.f30877b;
                if (jVar2.I0 == 0) {
                    jVar2.I0 = elapsedRealtimeNanos;
                    ri.n nVar2 = jVar2.f44574j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((ri.j) this.f30877b).f44556c.getWidth());
                    sb3.append("x");
                    sb3.append(((ri.j) this.f30877b).f44556c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((ri.j) this.f30877b).f44593q);
                    sb3.append(", attached=");
                    sb3.append(((ri.j) this.f30877b).f44556c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((ri.j) this.f30877b).f44556c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((ri.j) this.f30877b).f44556c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((ri.j) this.f30877b).f44556c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((ri.j) this.f30877b).f44556c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((ri.j) this.f30877b).f44556c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    nVar2.b(sb3.toString());
                }
                ri.j jVar3 = (ri.j) this.f30877b;
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
                ri.j jVar4 = (ri.j) this.f30877b;
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
                    TextureView textureView = jVar4.f44556c;
                    long j16 = jVar4.V0 - jVar4.U0;
                    if (j16 > j10) {
                        long j17 = jVar4.T0;
                        if (j17 > 1) {
                            f7 = (((float) (j17 - 1)) * 1.0E9f) / ((float) j16);
                            jVar4.f44574j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + ri.j.j(jVar4.N0, jVar4.M0) + ", min=" + (((float) jVar4.P0) / 1000000.0f) + ", max=" + (((float) jVar4.Q0) / 1000000.0f) + ", jitter=" + ri.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.I0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    jVar4.f44574j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + ri.j.j(jVar4.N0, jVar4.M0) + ", min=" + (((float) jVar4.P0) / 1000000.0f) + ", max=" + (((float) jVar4.Q0) / 1000000.0f) + ", jitter=" + ri.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
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
