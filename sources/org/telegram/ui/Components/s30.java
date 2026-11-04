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
public final class s30 implements TextureView.SurfaceTextureListener {
    public final int f37894a;
    public final Object f37895b;

    public s30(Object obj, int i3) {
        this.f37894a = i3;
        this.f37895b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        switch (this.f37894a) {
            case 0:
                k40 k40Var = (k40) this.f37895b;
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (k40Var.m0 == null && surfaceTexture != null && !k40Var.f35287l0) {
                    if (org.telegram.messenger.r2.f25040a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    k40Var.m0 = new w30(k40Var, surfaceTexture, i3, i10);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final cz0 cz0Var = (cz0) this.f37895b;
                ArrayList arrayList = cz0Var.f32870c;
                az0 az0Var = cz0Var.f32868a;
                if (az0Var != null) {
                    az0Var.h();
                    cz0Var.f32868a = null;
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
                                    cz0Var2.f32871e = true;
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
                                    cz0Var2.f32871e = true;
                                    cz0Var2.d = null;
                                    cz0.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i3, i10);
                cz0Var.f32868a = az0Var2;
                az0Var2.f32007a = org.telegram.messenger.n6.h(cz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        bz0 bz0Var = (bz0) arrayList.get(i11);
                        Bitmap bitmap = bz0Var.f32481e;
                        if (bitmap != null) {
                            cz0Var.f32868a.c(bz0Var.f32482f, bitmap, bz0Var.f32480c, bz0Var.d);
                        } else {
                            ArrayList arrayList2 = bz0Var.f32479b;
                            if (arrayList2 != null) {
                                cz0Var.f32868a.e(arrayList2, bz0Var.d);
                            } else {
                                cz0Var.f32868a.b(bz0Var.f32483g, bz0Var.f32478a, bz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(cz0Var.f32869b);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                wi.j jVar = (wi.j) this.f37895b;
                wi.n nVar = jVar.f57884j;
                nVar.b("preview surface available: view=" + i3 + "x" + i10);
                Handler handler = jVar.f57893n;
                if (jVar.V && handler != null && jVar.f57865c.isAvailable()) {
                    handler.post(new wi.a(jVar, 7));
                    return;
                }
                return;
            default:
                yh.e eVar = (yh.e) this.f37895b;
                if (eVar.f59500f == null) {
                    yh.d dVar = new yh.d(eVar, surfaceTexture, i3, i10, new yh.c(eVar, 1));
                    eVar.f59500f = dVar;
                    dVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f37894a) {
            case 0:
                k40 k40Var = (k40) this.f37895b;
                Camera2Session[] camera2SessionArr = k40Var.f35300v0;
                w30 w30Var = k40Var.m0;
                if (w30Var != null) {
                    w30Var.a(0, true, 0, 0, 0L);
                    k40Var.m0 = null;
                }
                if (k40Var.f35297s0) {
                    for (int i3 = 0; i3 < camera2SessionArr.length; i3++) {
                        Camera2Session camera2Session = camera2SessionArr[i3];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i3] = null;
                        }
                    }
                    return true;
                } else if (k40Var.f35298t0 != null) {
                    CameraController.getInstance().close(k40Var.f35298t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((ie0) this.f37895b).W.f41581x3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                cz0 cz0Var = (cz0) this.f37895b;
                az0 az0Var = cz0Var.f32868a;
                if (az0Var != null) {
                    az0Var.h();
                    cz0Var.f32868a = null;
                }
                Runnable runnable = cz0Var.d;
                if (runnable != null) {
                    cz0Var.d = null;
                    cz0.b(runnable);
                    return false;
                }
                return false;
            case 3:
                d71 d71Var = (d71) this.f37895b;
                TextureView textureView = d71Var.d;
                if (d71Var.T) {
                    if (d71Var.f32997a0) {
                        d71Var.f33014r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    d71Var.T = false;
                    return false;
                }
                return true;
            case 4:
                ((wi.j) this.f37895b).f57884j.b("preview surface destroyed: active=" + ((wi.j) this.f37895b).V);
                if (((wi.j) this.f37895b).V) {
                    ((wi.j) this.f37895b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                yh.d dVar = ((yh.e) this.f37895b).f59500f;
                if (dVar != null) {
                    dVar.f59484a = false;
                    ((yh.e) this.f37895b).f59500f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        Handler handler;
        switch (this.f37894a) {
            case 0:
                w30 w30Var = ((k40) this.f37895b).m0;
                if (w30Var != null) {
                    w30Var.G = i3;
                    w30Var.H = i10;
                    w30Var.b();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                az0 az0Var = ((cz0) this.f37895b).f32868a;
                if (az0Var != null && (handler = az0Var.getHandler()) != null && az0Var.f32008b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i3, i10));
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                wi.j jVar = (wi.j) this.f37895b;
                wi.n nVar = jVar.f57884j;
                nVar.b("preview surface size changed: view=" + i3 + "x" + i10);
                jVar.d0();
                return;
            default:
                yh.d dVar = ((yh.e) this.f37895b).f59500f;
                if (dVar != null) {
                    synchronized (dVar.f59487e) {
                        dVar.f59488f = true;
                        dVar.h = i3;
                        dVar.f59489n = i10;
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
        float f10;
        Object valueOf;
        String str;
        switch (this.f37894a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                d71 d71Var = (d71) this.f37895b;
                if (d71Var.f33014r == 1) {
                    d71Var.f33013n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.g1(this, 5));
                    d71Var.f33013n.invalidate();
                    return;
                }
                return;
            case 4:
                if (((wi.j) this.f37895b).f57860a0) {
                    ((wi.j) this.f37895b).f57860a0 = false;
                    wi.n nVar = ((wi.j) this.f37895b).f57884j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    wi.j jVar = (wi.j) this.f37895b;
                    if (jVar.f57894n0) {
                        str = "DUAL_ACTIVE";
                    } else if (jVar.E0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(wi.j.z(((wi.j) this.f37895b).I0));
                    nVar.b(sb2.toString());
                    wi.t0 t0Var = (wi.t0) ((wi.j) this.f37895b).f57887k.f36540b;
                    Handler handler = t0Var.f58060i;
                    y00 y00Var = t0Var.d;
                    Objects.requireNonNull(y00Var);
                    handler.post(new r4.u(y00Var, 29));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                wi.j jVar2 = (wi.j) this.f37895b;
                if (jVar2.J0 == 0) {
                    jVar2.J0 = elapsedRealtimeNanos;
                    wi.n nVar2 = jVar2.f57884j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((wi.j) this.f37895b).f57865c.getWidth());
                    sb3.append("x");
                    sb3.append(((wi.j) this.f37895b).f57865c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((wi.j) this.f37895b).f57902q);
                    sb3.append(", attached=");
                    sb3.append(((wi.j) this.f37895b).f57865c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((wi.j) this.f37895b).f57865c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((wi.j) this.f37895b).f57865c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((wi.j) this.f37895b).f57865c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((wi.j) this.f37895b).f57865c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((wi.j) this.f37895b).f57865c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    nVar2.b(sb3.toString());
                }
                wi.j jVar3 = (wi.j) this.f37895b;
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
                wi.j jVar4 = (wi.j) this.f37895b;
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
                    TextureView textureView = jVar4.f57865c;
                    long j16 = jVar4.W0 - jVar4.V0;
                    if (j16 > j10) {
                        long j17 = jVar4.U0;
                        if (j17 > 1) {
                            f10 = (((float) (j17 - 1)) * 1.0E9f) / ((float) j16);
                            jVar4.f57884j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.K0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.j.j(jVar4.O0, jVar4.N0) + ", min=" + (((float) jVar4.Q0) / 1000000.0f) + ", max=" + (((float) jVar4.R0) / 1000000.0f) + ", jitter=" + wi.j.W(jVar4.P0, jVar4.O0, jVar4.N0) + "}, gaps={over50ms=" + jVar4.S0 + ", over100ms=" + jVar4.T0 + "}, nonMonotonicTimestamps=" + jVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.J0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f10 = 0.0f;
                    jVar4.f57884j.b("preview frame delivery: callbackFps=" + ((((float) jVar4.K0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.j.j(jVar4.O0, jVar4.N0) + ", min=" + (((float) jVar4.Q0) / 1000000.0f) + ", max=" + (((float) jVar4.R0) / 1000000.0f) + ", jitter=" + wi.j.W(jVar4.P0, jVar4.O0, jVar4.N0) + "}, gaps={over50ms=" + jVar4.S0 + ", over100ms=" + jVar4.T0 + "}, nonMonotonicTimestamps=" + jVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
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

    private final void a(SurfaceTexture surfaceTexture, int i3, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i3, int i10) {
    }

    private final void c(SurfaceTexture surfaceTexture, int i3, int i10) {
    }

    private final void d(SurfaceTexture surfaceTexture, int i3, int i10) {
    }
}
