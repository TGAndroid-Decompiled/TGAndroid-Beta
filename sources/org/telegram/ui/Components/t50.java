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
    public final int f30643a;
    public final Object f30644b;

    public t50(Object obj, int i10) {
        this.f30643a = i10;
        this.f30644b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f30643a) {
            case 0:
                n60 n60Var = (n60) this.f30644b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (n60Var.m0 == null && surfaceTexture != null && !n60Var.f28867l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    n60Var.m0 = new x50(n60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final y11 y11Var = (y11) this.f30644b;
                ArrayList arrayList = y11Var.f32786c;
                w11 w11Var = y11Var.f32784a;
                if (w11Var != null) {
                    w11Var.i();
                    y11Var.f32784a = null;
                }
                w11 w11Var2 = new w11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                y11Var.invalidate();
                                return;
                            default:
                                y11 y11Var2 = y11Var;
                                Runnable runnable = y11Var2.d;
                                if (runnable != null) {
                                    y11Var2.e = true;
                                    y11Var2.d = null;
                                    y11.b(runnable);
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
                                y11Var.invalidate();
                                return;
                            default:
                                y11 y11Var2 = y11Var;
                                Runnable runnable = y11Var2.d;
                                if (runnable != null) {
                                    y11Var2.e = true;
                                    y11Var2.d = null;
                                    y11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                y11Var.f32784a = w11Var2;
                w11Var2.f32100a = EmuDetector.with(y11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        x11 x11Var = (x11) arrayList.get(i12);
                        Bitmap bitmap = x11Var.e;
                        if (bitmap != null) {
                            y11Var.f32784a.c(x11Var.f32400f, bitmap, x11Var.f32399c, x11Var.d);
                        } else {
                            ArrayList arrayList2 = x11Var.f32398b;
                            if (arrayList2 != null) {
                                y11Var.f32784a.f(arrayList2, x11Var.d);
                            } else {
                                y11Var.f32784a.d(x11Var.f32397a, x11Var.f32401g, x11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(y11Var.f32785b);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                si.j jVar = (si.j) this.f30644b;
                si.n nVar = jVar.f47086j;
                nVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.f47096n;
                if (jVar.V && handler != null && jVar.f47068c.isAvailable()) {
                    handler.post(new si.a(jVar, 7));
                    return;
                }
                return;
            default:
                wh.f fVar = (wh.f) this.f30644b;
                if (fVar.f49491f == null) {
                    wh.e eVar = new wh.e(fVar, surfaceTexture, i10, i11, new wh.d(fVar, 1));
                    fVar.f49491f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f30643a) {
            case 0:
                n60 n60Var = (n60) this.f30644b;
                Camera2Session[] camera2SessionArr = n60Var.f28879v0;
                x50 x50Var = n60Var.m0;
                if (x50Var != null) {
                    x50Var.b(0L, 0, true, 0, 0);
                    n60Var.m0 = null;
                }
                if (n60Var.f28876s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (n60Var.f28877t0 != null) {
                    CameraController.getInstance().close(n60Var.f28877t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((dh0) this.f30644b).V.f33743w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                y11 y11Var = (y11) this.f30644b;
                w11 w11Var = y11Var.f32784a;
                if (w11Var != null) {
                    w11Var.i();
                    y11Var.f32784a = null;
                }
                Runnable runnable = y11Var.d;
                if (runnable != null) {
                    y11Var.d = null;
                    y11.b(runnable);
                    return false;
                }
                return false;
            case 3:
                da1 da1Var = (da1) this.f30644b;
                TextureView textureView = da1Var.d;
                if (da1Var.S) {
                    if (da1Var.W) {
                        da1Var.f25580r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    da1Var.S = false;
                    return false;
                }
                return true;
            case 4:
                ((si.j) this.f30644b).f47086j.b("preview surface destroyed: active=" + ((si.j) this.f30644b).V);
                if (((si.j) this.f30644b).V) {
                    ((si.j) this.f30644b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                wh.e eVar = ((wh.f) this.f30644b).f49491f;
                if (eVar != null) {
                    eVar.f49477a = false;
                    ((wh.f) this.f30644b).f49491f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f30643a) {
            case 0:
                x50 x50Var = ((n60) this.f30644b).m0;
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
                w11 w11Var = ((y11) this.f30644b).f32784a;
                if (w11Var != null && (handler = w11Var.getHandler()) != null && w11Var.f32101b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                si.j jVar = (si.j) this.f30644b;
                si.n nVar = jVar.f47086j;
                nVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.d0();
                return;
            default:
                wh.e eVar = ((wh.f) this.f30644b).f49491f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f49480f = true;
                        eVar.h = i10;
                        eVar.f49481n = i11;
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
        switch (this.f30643a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                da1 da1Var = (da1) this.f30644b;
                if (da1Var.f25580r == 1) {
                    da1Var.f25579n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 4));
                    da1Var.f25579n.invalidate();
                    return;
                }
                return;
            case 4:
                if (((si.j) this.f30644b).f47063a0) {
                    ((si.j) this.f30644b).f47063a0 = false;
                    si.n nVar = ((si.j) this.f30644b).f47086j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    si.j jVar = (si.j) this.f30644b;
                    if (jVar.m0) {
                        str = "DUAL_ACTIVE";
                    } else if (jVar.D0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(si.j.z(((si.j) this.f30644b).H0));
                    nVar.b(sb2.toString());
                    si.u0 u0Var = (si.u0) ((si.j) this.f30644b).f47089k.f14874b;
                    Handler handler = u0Var.f47254i;
                    l2.f fVar = u0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new org.telegram.ui.web.a2(fVar, 27));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                si.j jVar2 = (si.j) this.f30644b;
                if (jVar2.I0 == 0) {
                    jVar2.I0 = elapsedRealtimeNanos;
                    si.n nVar2 = jVar2.f47086j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((si.j) this.f30644b).f47068c.getWidth());
                    sb3.append("x");
                    sb3.append(((si.j) this.f30644b).f47068c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((si.j) this.f30644b).f47105q);
                    sb3.append(", attached=");
                    sb3.append(((si.j) this.f30644b).f47068c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((si.j) this.f30644b).f47068c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((si.j) this.f30644b).f47068c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((si.j) this.f30644b).f47068c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((si.j) this.f30644b).f47068c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((si.j) this.f30644b).f47068c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    nVar2.b(sb3.toString());
                }
                si.j jVar3 = (si.j) this.f30644b;
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
                si.j jVar4 = (si.j) this.f30644b;
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
                    TextureView textureView = jVar4.f47068c;
                    long j16 = jVar4.V0 - jVar4.U0;
                    if (j16 > j10) {
                        long j17 = jVar4.T0;
                        if (j17 > 1) {
                            f7 = (((float) (j17 - 1)) * 1.0E9f) / ((float) j16);
                            jVar4.f47086j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + si.j.j(jVar4.N0, jVar4.M0) + ", min=" + (((float) jVar4.P0) / 1000000.0f) + ", max=" + (((float) jVar4.Q0) / 1000000.0f) + ", jitter=" + si.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.I0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    jVar4.f47086j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + si.j.j(jVar4.N0, jVar4.M0) + ", min=" + (((float) jVar4.P0) / 1000000.0f) + ", max=" + (((float) jVar4.Q0) / 1000000.0f) + ", jitter=" + si.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
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
