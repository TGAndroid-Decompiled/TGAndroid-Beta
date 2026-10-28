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
public final class v50 implements TextureView.SurfaceTextureListener {
    public final int f33564a;
    public final Object f33565b;

    public v50(Object obj, int i10) {
        this.f33564a = i10;
        this.f33565b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f33564a) {
            case 0:
                p60 p60Var = (p60) this.f33565b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (p60Var.f31490l0 == null && surfaceTexture != null && !p60Var.f31488k0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    p60Var.f31490l0 = new z50(p60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final h21 h21Var = (h21) this.f33565b;
                ArrayList arrayList = h21Var.f28837c;
                f21 f21Var = h21Var.f28835a;
                if (f21Var != null) {
                    f21Var.i();
                    h21Var.f28835a = null;
                }
                f21 f21Var2 = new f21(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                h21Var.invalidate();
                                return;
                            default:
                                h21 h21Var2 = h21Var;
                                Runnable runnable = h21Var2.d;
                                if (runnable != null) {
                                    h21Var2.e = true;
                                    h21Var2.d = null;
                                    h21.b(runnable);
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
                                h21Var.invalidate();
                                return;
                            default:
                                h21 h21Var2 = h21Var;
                                Runnable runnable = h21Var2.d;
                                if (runnable != null) {
                                    h21Var2.e = true;
                                    h21Var2.d = null;
                                    h21.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                h21Var.f28835a = f21Var2;
                f21Var2.f27984a = EmuDetector.with(h21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        g21 g21Var = (g21) arrayList.get(i12);
                        Bitmap bitmap = g21Var.e;
                        if (bitmap != null) {
                            h21Var.f28835a.c(g21Var.f28364f, bitmap, g21Var.f28363c, g21Var.d);
                        } else {
                            ArrayList arrayList2 = g21Var.f28362b;
                            if (arrayList2 != null) {
                                h21Var.f28835a.f(arrayList2, g21Var.d);
                            } else {
                                h21Var.f28835a.d(g21Var.f28361a, g21Var.f28365g, g21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(h21Var.f28836b);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                vi.j jVar = (vi.j) this.f33565b;
                vi.n nVar = jVar.f50463j;
                nVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.f50473n;
                if (jVar.V && handler != null && jVar.f50445c.isAvailable()) {
                    handler.post(new vi.a(jVar, 7));
                    return;
                }
                return;
            default:
                xh.f fVar = (xh.f) this.f33565b;
                if (fVar.f51911f == null) {
                    xh.e eVar = new xh.e(fVar, surfaceTexture, i10, i11, new xh.d(fVar, 1));
                    fVar.f51911f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f33564a) {
            case 0:
                p60 p60Var = (p60) this.f33565b;
                Camera2Session[] camera2SessionArr = p60Var.f31501u0;
                z50 z50Var = p60Var.f31490l0;
                if (z50Var != null) {
                    z50Var.b(0L, 0, true, 0, 0);
                    p60Var.f31490l0 = null;
                }
                if (p60Var.f31497r0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (p60Var.f31499s0 != null) {
                    CameraController.getInstance().close(p60Var.f31499s0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((dh0) this.f33565b).V.f35833w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                h21 h21Var = (h21) this.f33565b;
                f21 f21Var = h21Var.f28835a;
                if (f21Var != null) {
                    f21Var.i();
                    h21Var.f28835a = null;
                }
                Runnable runnable = h21Var.d;
                if (runnable != null) {
                    h21Var.d = null;
                    h21.b(runnable);
                    return false;
                }
                return false;
            case 3:
                na1 na1Var = (na1) this.f33565b;
                TextureView textureView = na1Var.d;
                if (na1Var.S) {
                    if (na1Var.W) {
                        na1Var.f30823r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    na1Var.S = false;
                    return false;
                }
                return true;
            case 4:
                ((vi.j) this.f33565b).f50463j.b("preview surface destroyed: active=" + ((vi.j) this.f33565b).V);
                if (((vi.j) this.f33565b).V) {
                    ((vi.j) this.f33565b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                xh.e eVar = ((xh.f) this.f33565b).f51911f;
                if (eVar != null) {
                    eVar.f51897a = false;
                    ((xh.f) this.f33565b).f51911f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f33564a) {
            case 0:
                z50 z50Var = ((p60) this.f33565b).f31490l0;
                if (z50Var != null) {
                    z50Var.F = i10;
                    z50Var.G = i11;
                    z50Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                f21 f21Var = ((h21) this.f33565b).f28835a;
                if (f21Var != null && (handler = f21Var.getHandler()) != null && f21Var.f27985b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                vi.j jVar = (vi.j) this.f33565b;
                vi.n nVar = jVar.f50463j;
                nVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.d0();
                return;
            default:
                xh.e eVar = ((xh.f) this.f33565b).f51911f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f51900f = true;
                        eVar.h = i10;
                        eVar.f51901n = i11;
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
        switch (this.f33564a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                na1 na1Var = (na1) this.f33565b;
                if (na1Var.f30823r == 1) {
                    na1Var.f30822n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 4));
                    na1Var.f30822n.invalidate();
                    return;
                }
                return;
            case 4:
                if (((vi.j) this.f33565b).f50440a0) {
                    ((vi.j) this.f33565b).f50440a0 = false;
                    vi.n nVar = ((vi.j) this.f33565b).f50463j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    vi.j jVar = (vi.j) this.f33565b;
                    if (jVar.f50474n0) {
                        str = "DUAL_ACTIVE";
                    } else if (jVar.E0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(vi.j.z(((vi.j) this.f33565b).I0));
                    nVar.b(sb2.toString());
                    vi.u0 u0Var = (vi.u0) ((vi.j) this.f33565b).f50466k.f17209b;
                    Handler handler = u0Var.f50639i;
                    li.e3 e3Var = u0Var.d;
                    Objects.requireNonNull(e3Var);
                    handler.post(new ti.g(e3Var, 13));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                vi.j jVar2 = (vi.j) this.f33565b;
                if (jVar2.J0 == 0) {
                    jVar2.J0 = elapsedRealtimeNanos;
                    vi.n nVar2 = jVar2.f50463j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((vi.j) this.f33565b).f50445c.getWidth());
                    sb3.append("x");
                    sb3.append(((vi.j) this.f33565b).f50445c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((vi.j) this.f33565b).f50482q);
                    sb3.append(", attached=");
                    sb3.append(((vi.j) this.f33565b).f50445c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((vi.j) this.f33565b).f50445c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((vi.j) this.f33565b).f50445c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((vi.j) this.f33565b).f50445c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((vi.j) this.f33565b).f50445c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((vi.j) this.f33565b).f50445c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    nVar2.b(sb3.toString());
                }
                vi.j jVar3 = (vi.j) this.f33565b;
                long j12 = jVar3.L0;
                if (j12 != 0) {
                    long j13 = elapsedRealtimeNanos - j12;
                    jVar3.N0++;
                    jVar3.O0 += j13;
                    j10 = 0;
                    double d = j13;
                    jVar3.P0 = (d * d) + jVar3.P0;
                    long j14 = jVar3.Q0;
                    if (j14 == 0 || j13 < j14) {
                        jVar3.Q0 = j13;
                    }
                    jVar3.R0 = Math.max(jVar3.R0, j13);
                    if (j13 > 50000000) {
                        jVar3.S0++;
                    }
                    if (j13 > 100000000) {
                        jVar3.T0++;
                    }
                } else {
                    j10 = 0;
                }
                vi.j jVar4 = (vi.j) this.f33565b;
                jVar4.L0 = elapsedRealtimeNanos;
                long j15 = jVar4.M0;
                if (timestamp > j15) {
                    if (jVar4.V0 == j10) {
                        jVar4.V0 = timestamp;
                    }
                    jVar4.W0 = timestamp;
                    jVar4.U0++;
                } else if (j15 != j10) {
                    jVar4.X0++;
                }
                jVar4.M0 = timestamp;
                jVar4.K0++;
                if (elapsedRealtimeNanos - jVar4.J0 >= 5000000000L) {
                    TextureView textureView = jVar4.f50445c;
                    long j16 = jVar4.W0 - jVar4.V0;
                    if (j16 > j10) {
                        long j17 = jVar4.U0;
                        if (j17 > 1) {
                            f7 = (((float) (j17 - 1)) * 1.0E9f) / ((float) j16);
                            jVar4.f50463j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.K0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + vi.j.j(jVar4.O0, jVar4.N0) + ", min=" + (((float) jVar4.Q0) / 1000000.0f) + ", max=" + (((float) jVar4.R0) / 1000000.0f) + ", jitter=" + vi.j.W(jVar4.P0, jVar4.O0, jVar4.N0) + "}, gaps={over50ms=" + jVar4.S0 + ", over100ms=" + jVar4.T0 + "}, nonMonotonicTimestamps=" + jVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.J0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    jVar4.f50463j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.K0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + vi.j.j(jVar4.O0, jVar4.N0) + ", min=" + (((float) jVar4.Q0) / 1000000.0f) + ", max=" + (((float) jVar4.R0) / 1000000.0f) + ", jitter=" + vi.j.W(jVar4.P0, jVar4.O0, jVar4.N0) + "}, gaps={over50ms=" + jVar4.S0 + ", over100ms=" + jVar4.T0 + "}, nonMonotonicTimestamps=" + jVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    jVar4.P();
                    jVar4.J0 = elapsedRealtimeNanos;
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
