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
    public final int f33570a;
    public final Object f33571b;

    public v50(Object obj, int i10) {
        this.f33570a = i10;
        this.f33571b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f33570a) {
            case 0:
                o60 o60Var = (o60) this.f33571b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (o60Var.m0 == null && surfaceTexture != null && !o60Var.f31191l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    o60Var.m0 = new z50(o60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final g21 g21Var = (g21) this.f33571b;
                ArrayList arrayList = g21Var.f28395c;
                e21 e21Var = g21Var.f28393a;
                if (e21Var != null) {
                    e21Var.i();
                    g21Var.f28393a = null;
                }
                e21 e21Var2 = new e21(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                g21Var.invalidate();
                                return;
                            default:
                                g21 g21Var2 = g21Var;
                                Runnable runnable = g21Var2.d;
                                if (runnable != null) {
                                    g21Var2.e = true;
                                    g21Var2.d = null;
                                    g21.b(runnable);
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
                                g21Var.invalidate();
                                return;
                            default:
                                g21 g21Var2 = g21Var;
                                Runnable runnable = g21Var2.d;
                                if (runnable != null) {
                                    g21Var2.e = true;
                                    g21Var2.d = null;
                                    g21.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                g21Var.f28393a = e21Var2;
                e21Var2.f27691a = EmuDetector.with(g21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        f21 f21Var = (f21) arrayList.get(i12);
                        Bitmap bitmap = f21Var.e;
                        if (bitmap != null) {
                            g21Var.f28393a.c(f21Var.f28046f, bitmap, f21Var.f28045c, f21Var.d);
                        } else {
                            ArrayList arrayList2 = f21Var.f28044b;
                            if (arrayList2 != null) {
                                g21Var.f28393a.f(arrayList2, f21Var.d);
                            } else {
                                g21Var.f28393a.d(f21Var.f28043a, f21Var.f28047g, f21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(g21Var.f28394b);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                vi.j jVar = (vi.j) this.f33571b;
                vi.n nVar = jVar.f50428j;
                nVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.f50438n;
                if (jVar.V && handler != null && jVar.f50410c.isAvailable()) {
                    handler.post(new vi.a(jVar, 7));
                    return;
                }
                return;
            default:
                xh.f fVar = (xh.f) this.f33571b;
                if (fVar.f51853f == null) {
                    xh.e eVar = new xh.e(fVar, surfaceTexture, i10, i11, new xh.d(fVar, 1));
                    fVar.f51853f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f33570a) {
            case 0:
                o60 o60Var = (o60) this.f33571b;
                Camera2Session[] camera2SessionArr = o60Var.f31203v0;
                z50 z50Var = o60Var.m0;
                if (z50Var != null) {
                    z50Var.b(0L, 0, true, 0, 0);
                    o60Var.m0 = null;
                }
                if (o60Var.f31200s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (o60Var.f31201t0 != null) {
                    CameraController.getInstance().close(o60Var.f31201t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((ch0) this.f33571b).V.f35809w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                g21 g21Var = (g21) this.f33571b;
                e21 e21Var = g21Var.f28393a;
                if (e21Var != null) {
                    e21Var.i();
                    g21Var.f28393a = null;
                }
                Runnable runnable = g21Var.d;
                if (runnable != null) {
                    g21Var.d = null;
                    g21.b(runnable);
                    return false;
                }
                return false;
            case 3:
                ma1 ma1Var = (ma1) this.f33571b;
                TextureView textureView = ma1Var.d;
                if (ma1Var.S) {
                    if (ma1Var.W) {
                        ma1Var.f30504r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    ma1Var.S = false;
                    return false;
                }
                return true;
            case 4:
                ((vi.j) this.f33571b).f50428j.b("preview surface destroyed: active=" + ((vi.j) this.f33571b).V);
                if (((vi.j) this.f33571b).V) {
                    ((vi.j) this.f33571b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                xh.e eVar = ((xh.f) this.f33571b).f51853f;
                if (eVar != null) {
                    eVar.f51839a = false;
                    ((xh.f) this.f33571b).f51853f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f33570a) {
            case 0:
                z50 z50Var = ((o60) this.f33571b).m0;
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
                e21 e21Var = ((g21) this.f33571b).f28393a;
                if (e21Var != null && (handler = e21Var.getHandler()) != null && e21Var.f27692b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                vi.j jVar = (vi.j) this.f33571b;
                vi.n nVar = jVar.f50428j;
                nVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.d0();
                return;
            default:
                xh.e eVar = ((xh.f) this.f33571b).f51853f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f51842f = true;
                        eVar.h = i10;
                        eVar.f51843n = i11;
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
        switch (this.f33570a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                ma1 ma1Var = (ma1) this.f33571b;
                if (ma1Var.f30504r == 1) {
                    ma1Var.f30503n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 4));
                    ma1Var.f30503n.invalidate();
                    return;
                }
                return;
            case 4:
                if (((vi.j) this.f33571b).f50405a0) {
                    ((vi.j) this.f33571b).f50405a0 = false;
                    vi.n nVar = ((vi.j) this.f33571b).f50428j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    vi.j jVar = (vi.j) this.f33571b;
                    if (jVar.m0) {
                        str = "DUAL_ACTIVE";
                    } else if (jVar.D0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(vi.j.z(((vi.j) this.f33571b).H0));
                    nVar.b(sb2.toString());
                    vi.s0 s0Var = (vi.s0) ((vi.j) this.f33571b).f50431k.f17210b;
                    Handler handler = s0Var.f50588i;
                    li.e3 e3Var = s0Var.d;
                    Objects.requireNonNull(e3Var);
                    handler.post(new ti.g(e3Var, 13));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                vi.j jVar2 = (vi.j) this.f33571b;
                if (jVar2.I0 == 0) {
                    jVar2.I0 = elapsedRealtimeNanos;
                    vi.n nVar2 = jVar2.f50428j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((vi.j) this.f33571b).f50410c.getWidth());
                    sb3.append("x");
                    sb3.append(((vi.j) this.f33571b).f50410c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((vi.j) this.f33571b).f50447q);
                    sb3.append(", attached=");
                    sb3.append(((vi.j) this.f33571b).f50410c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((vi.j) this.f33571b).f50410c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((vi.j) this.f33571b).f50410c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((vi.j) this.f33571b).f50410c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((vi.j) this.f33571b).f50410c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((vi.j) this.f33571b).f50410c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    nVar2.b(sb3.toString());
                }
                vi.j jVar3 = (vi.j) this.f33571b;
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
                vi.j jVar4 = (vi.j) this.f33571b;
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
                    TextureView textureView = jVar4.f50410c;
                    long j16 = jVar4.V0 - jVar4.U0;
                    if (j16 > j10) {
                        long j17 = jVar4.T0;
                        if (j17 > 1) {
                            f7 = (((float) (j17 - 1)) * 1.0E9f) / ((float) j16);
                            jVar4.f50428j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + vi.j.j(jVar4.N0, jVar4.M0) + ", min=" + (((float) jVar4.P0) / 1000000.0f) + ", max=" + (((float) jVar4.Q0) / 1000000.0f) + ", jitter=" + vi.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.I0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    jVar4.f50428j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + vi.j.j(jVar4.N0, jVar4.M0) + ", min=" + (((float) jVar4.P0) / 1000000.0f) + ", max=" + (((float) jVar4.Q0) / 1000000.0f) + ", jitter=" + vi.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
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
