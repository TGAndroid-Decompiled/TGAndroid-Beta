package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.webrtc.EglRenderer;
public final class w30 implements TextureView.SurfaceTextureListener {
    public final int f39823a;
    public final Object f39824b;

    public w30(Object obj, int i7) {
        this.f39823a = i7;
        this.f39824b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f39823a) {
            case 0:
                o40 o40Var = (o40) this.f39824b;
                if (org.telegram.messenger.r2.f25191a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (o40Var.f36612l0 == null && surfaceTexture != null && !o40Var.f36610k0) {
                    if (org.telegram.messenger.r2.f25191a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    o40Var.f36612l0 = new a40(o40Var, surfaceTexture, i7, i10);
                    return;
                }
                return;
            case 1:
                final cz0 cz0Var = (cz0) this.f39824b;
                ArrayList arrayList = cz0Var.f32724c;
                az0 az0Var = cz0Var.f32722a;
                if (az0Var != null) {
                    az0Var.h();
                    cz0Var.f32722a = null;
                }
                az0 az0Var2 = new az0(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                cz0Var.invalidate();
                                return;
                            default:
                                cz0 cz0Var2 = cz0Var;
                                Runnable runnable = cz0Var2.d;
                                if (runnable != null) {
                                    cz0Var2.f32725e = true;
                                    cz0Var2.d = null;
                                    cz0.b(runnable);
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
                                cz0Var.invalidate();
                                return;
                            default:
                                cz0 cz0Var2 = cz0Var;
                                Runnable runnable = cz0Var2.d;
                                if (runnable != null) {
                                    cz0Var2.f32725e = true;
                                    cz0Var2.d = null;
                                    cz0.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i7, i10);
                cz0Var.f32722a = az0Var2;
                az0Var2.f31943a = org.telegram.messenger.n6.h(cz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        bz0 bz0Var = (bz0) arrayList.get(i11);
                        Bitmap bitmap = bz0Var.f32342e;
                        if (bitmap != null) {
                            cz0Var.f32722a.c(bz0Var.f32343f, bitmap, bz0Var.f32341c, bz0Var.d);
                        } else {
                            ArrayList arrayList2 = bz0Var.f32340b;
                            if (arrayList2 != null) {
                                cz0Var.f32722a.d(arrayList2, bz0Var.d);
                            } else {
                                cz0Var.f32722a.b(bz0Var.f32344g, bz0Var.f32339a, bz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(cz0Var.f32723b);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f39824b;
                EglRenderer eglRenderer = q0Var.f39425a;
                if (!q0Var.f39427c && q0Var.f39426b != surfaceTexture) {
                    q0Var.f39426b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    return;
                }
                return;
            case 4:
                wi.j jVar = (wi.j) this.f39824b;
                wi.n nVar = jVar.f57901j;
                nVar.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = jVar.f57911n;
                if (jVar.V && handler != null && jVar.f57882c.isAvailable()) {
                    handler.post(new wi.a(jVar, 7));
                    return;
                }
                return;
            default:
                xh.e eVar = (xh.e) this.f39824b;
                if (eVar.f58663f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f58663f = dVar;
                    dVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f39823a) {
            case 0:
                o40 o40Var = (o40) this.f39824b;
                Camera2Session[] camera2SessionArr = o40Var.f36623u0;
                a40 a40Var = o40Var.f36612l0;
                if (a40Var != null) {
                    a40Var.a(0, true, 0, 0, 0L);
                    o40Var.f36612l0 = null;
                }
                if (o40Var.f36619r0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    return true;
                } else if (o40Var.f36621s0 != null) {
                    CameraController.getInstance().close(o40Var.f36621s0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                cz0 cz0Var = (cz0) this.f39824b;
                az0 az0Var = cz0Var.f32722a;
                if (az0Var != null) {
                    az0Var.h();
                    cz0Var.f32722a = null;
                }
                Runnable runnable = cz0Var.d;
                if (runnable != null) {
                    cz0Var.d = null;
                    cz0.b(runnable);
                    return false;
                }
                return false;
            case 2:
                f71 f71Var = (f71) this.f39824b;
                TextureView textureView = f71Var.d;
                if (f71Var.S) {
                    if (f71Var.W) {
                        f71Var.f33532r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    f71Var.S = false;
                    return false;
                }
                return true;
            case 3:
                return true;
            case 4:
                ((wi.j) this.f39824b).f57901j.b("preview surface destroyed: active=" + ((wi.j) this.f39824b).V);
                if (((wi.j) this.f39824b).V) {
                    ((wi.j) this.f39824b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                xh.d dVar = ((xh.e) this.f39824b).f58663f;
                if (dVar != null) {
                    dVar.f58647a = false;
                    ((xh.e) this.f39824b).f58663f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        Handler handler;
        switch (this.f39823a) {
            case 0:
                a40 a40Var = ((o40) this.f39824b).f36612l0;
                if (a40Var != null) {
                    a40Var.F = i7;
                    a40Var.G = i10;
                    a40Var.b();
                    return;
                }
                return;
            case 1:
                az0 az0Var = ((cz0) this.f39824b).f32722a;
                if (az0Var != null && (handler = az0Var.getHandler()) != null && az0Var.f31944b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i7, i10));
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f39824b;
                if (i7 > 0 && i10 > 0) {
                    q0Var.f39425a.setLayoutAspectRatio(i7 / i10);
                    return;
                }
                return;
            case 4:
                wi.j jVar = (wi.j) this.f39824b;
                wi.n nVar = jVar.f57901j;
                nVar.b("preview surface size changed: view=" + i7 + "x" + i10);
                jVar.d0();
                return;
            default:
                xh.d dVar = ((xh.e) this.f39824b).f58663f;
                if (dVar != null) {
                    synchronized (dVar.f58650e) {
                        dVar.f58651f = true;
                        dVar.h = i7;
                        dVar.f58652n = i10;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j3;
        long j10;
        float f10;
        Object valueOf;
        String str;
        switch (this.f39823a) {
            case 0:
            case 1:
                return;
            case 2:
                f71 f71Var = (f71) this.f39824b;
                if (f71Var.f33532r == 1) {
                    f71Var.f33531n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 5));
                    f71Var.f33531n.invalidate();
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                if (((wi.j) this.f39824b).f57877a0) {
                    ((wi.j) this.f39824b).f57877a0 = false;
                    wi.n nVar = ((wi.j) this.f39824b).f57901j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    wi.j jVar = (wi.j) this.f39824b;
                    if (jVar.f57912n0) {
                        str = "DUAL_ACTIVE";
                    } else if (jVar.E0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(wi.j.z(((wi.j) this.f39824b).I0));
                    nVar.b(sb2.toString());
                    wi.t0 t0Var = (wi.t0) ((wi.j) this.f39824b).f57904k.f37504b;
                    Handler handler = t0Var.f58080i;
                    qt qtVar = t0Var.d;
                    Objects.requireNonNull(qtVar);
                    handler.post(new wg.p(qtVar, 3));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                wi.j jVar2 = (wi.j) this.f39824b;
                if (jVar2.J0 == 0) {
                    jVar2.J0 = elapsedRealtimeNanos;
                    wi.n nVar2 = jVar2.f57901j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((wi.j) this.f39824b).f57882c.getWidth());
                    sb3.append("x");
                    sb3.append(((wi.j) this.f39824b).f57882c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((wi.j) this.f39824b).f57919q);
                    sb3.append(", attached=");
                    sb3.append(((wi.j) this.f39824b).f57882c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((wi.j) this.f39824b).f57882c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((wi.j) this.f39824b).f57882c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((wi.j) this.f39824b).f57882c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((wi.j) this.f39824b).f57882c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((wi.j) this.f39824b).f57882c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    nVar2.b(sb3.toString());
                }
                wi.j jVar3 = (wi.j) this.f39824b;
                long j11 = jVar3.L0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    jVar3.N0++;
                    jVar3.O0 += j12;
                    j3 = 0;
                    double d = j12;
                    jVar3.P0 = (d * d) + jVar3.P0;
                    long j13 = jVar3.Q0;
                    if (j13 == 0 || j12 < j13) {
                        jVar3.Q0 = j12;
                    }
                    jVar3.R0 = Math.max(jVar3.R0, j12);
                    if (j12 > 50000000) {
                        jVar3.S0++;
                    }
                    if (j12 > 100000000) {
                        jVar3.T0++;
                    }
                } else {
                    j3 = 0;
                }
                wi.j jVar4 = (wi.j) this.f39824b;
                jVar4.L0 = elapsedRealtimeNanos;
                long j14 = jVar4.M0;
                if (timestamp > j14) {
                    if (jVar4.V0 == j3) {
                        jVar4.V0 = timestamp;
                    }
                    jVar4.W0 = timestamp;
                    jVar4.U0++;
                } else if (j14 != j3) {
                    jVar4.X0++;
                }
                jVar4.M0 = timestamp;
                jVar4.K0++;
                if (elapsedRealtimeNanos - jVar4.J0 >= 5000000000L) {
                    TextureView textureView = jVar4.f57882c;
                    long j15 = jVar4.W0 - jVar4.V0;
                    if (j15 > j3) {
                        long j16 = jVar4.U0;
                        if (j16 > 1) {
                            f10 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            jVar4.f57901j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.K0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.j.j(jVar4.O0, jVar4.N0) + ", min=" + (((float) jVar4.Q0) / 1000000.0f) + ", max=" + (((float) jVar4.R0) / 1000000.0f) + ", jitter=" + wi.j.W(jVar4.P0, jVar4.O0, jVar4.N0) + "}, gaps={over50ms=" + jVar4.S0 + ", over100ms=" + jVar4.T0 + "}, nonMonotonicTimestamps=" + jVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.J0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f10 = 0.0f;
                    jVar4.f57901j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.K0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.j.j(jVar4.O0, jVar4.N0) + ", min=" + (((float) jVar4.Q0) / 1000000.0f) + ", max=" + (((float) jVar4.R0) / 1000000.0f) + ", jitter=" + wi.j.W(jVar4.P0, jVar4.O0, jVar4.N0) + "}, gaps={over50ms=" + jVar4.S0 + ", over100ms=" + jVar4.T0 + "}, nonMonotonicTimestamps=" + jVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    jVar4.P();
                    jVar4.J0 = elapsedRealtimeNanos;
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void d(SurfaceTexture surfaceTexture) {
    }

    private final void e(SurfaceTexture surfaceTexture) {
    }

    private final void f(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i7, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i7, int i10) {
    }
}
