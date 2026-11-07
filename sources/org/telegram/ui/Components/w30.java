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
    public final int f39843a;
    public final Object f39844b;

    public w30(Object obj, int i7) {
        this.f39843a = i7;
        this.f39844b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f39843a) {
            case 0:
                o40 o40Var = (o40) this.f39844b;
                if (org.telegram.messenger.r2.f25199a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (o40Var.f36538l0 == null && surfaceTexture != null && !o40Var.f36536k0) {
                    if (org.telegram.messenger.r2.f25199a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    o40Var.f36538l0 = new a40(o40Var, surfaceTexture, i7, i10);
                    return;
                }
                return;
            case 1:
                final dz0 dz0Var = (dz0) this.f39844b;
                ArrayList arrayList = dz0Var.f33100c;
                bz0 bz0Var = dz0Var.f33098a;
                if (bz0Var != null) {
                    bz0Var.h();
                    dz0Var.f33098a = null;
                }
                bz0 bz0Var2 = new bz0(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                dz0Var.invalidate();
                                return;
                            default:
                                dz0 dz0Var2 = dz0Var;
                                Runnable runnable = dz0Var2.d;
                                if (runnable != null) {
                                    dz0Var2.f33101e = true;
                                    dz0Var2.d = null;
                                    dz0.b(runnable);
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
                                dz0Var.invalidate();
                                return;
                            default:
                                dz0 dz0Var2 = dz0Var;
                                Runnable runnable = dz0Var2.d;
                                if (runnable != null) {
                                    dz0Var2.f33101e = true;
                                    dz0Var2.d = null;
                                    dz0.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i7, i10);
                dz0Var.f33098a = bz0Var2;
                bz0Var2.f32347a = org.telegram.messenger.n6.h(dz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        cz0 cz0Var = (cz0) arrayList.get(i11);
                        Bitmap bitmap = cz0Var.f32733e;
                        if (bitmap != null) {
                            dz0Var.f33098a.c(cz0Var.f32734f, bitmap, cz0Var.f32732c, cz0Var.d);
                        } else {
                            ArrayList arrayList2 = cz0Var.f32731b;
                            if (arrayList2 != null) {
                                dz0Var.f33098a.d(arrayList2, cz0Var.d);
                            } else {
                                dz0Var.f33098a.b(cz0Var.f32735g, cz0Var.f32730a, cz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(dz0Var.f33099b);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f39844b;
                EglRenderer eglRenderer = q0Var.f39443a;
                if (!q0Var.f39445c && q0Var.f39444b != surfaceTexture) {
                    q0Var.f39444b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    return;
                }
                return;
            case 4:
                wi.k kVar = (wi.k) this.f39844b;
                wi.o oVar = kVar.f57930j;
                oVar.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = kVar.f57940n;
                if (kVar.V && handler != null && kVar.f57911c.isAvailable()) {
                    handler.post(new wi.a(kVar, 8));
                    return;
                }
                return;
            default:
                xh.e eVar = (xh.e) this.f39844b;
                if (eVar.f58693f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f58693f = dVar;
                    dVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f39843a) {
            case 0:
                o40 o40Var = (o40) this.f39844b;
                Camera2Session[] camera2SessionArr = o40Var.f36549u0;
                a40 a40Var = o40Var.f36538l0;
                if (a40Var != null) {
                    a40Var.a(0, true, 0, 0, 0L);
                    o40Var.f36538l0 = null;
                }
                if (o40Var.f36545r0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    return true;
                } else if (o40Var.f36547s0 != null) {
                    CameraController.getInstance().close(o40Var.f36547s0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                dz0 dz0Var = (dz0) this.f39844b;
                bz0 bz0Var = dz0Var.f33098a;
                if (bz0Var != null) {
                    bz0Var.h();
                    dz0Var.f33098a = null;
                }
                Runnable runnable = dz0Var.d;
                if (runnable != null) {
                    dz0Var.d = null;
                    dz0.b(runnable);
                    return false;
                }
                return false;
            case 2:
                l71 l71Var = (l71) this.f39844b;
                TextureView textureView = l71Var.d;
                if (l71Var.S) {
                    if (l71Var.W) {
                        l71Var.f35569r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    l71Var.S = false;
                    return false;
                }
                return true;
            case 3:
                return true;
            case 4:
                ((wi.k) this.f39844b).f57930j.b("preview surface destroyed: active=" + ((wi.k) this.f39844b).V);
                if (((wi.k) this.f39844b).V) {
                    ((wi.k) this.f39844b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                xh.d dVar = ((xh.e) this.f39844b).f58693f;
                if (dVar != null) {
                    dVar.f58677a = false;
                    ((xh.e) this.f39844b).f58693f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        Handler handler;
        switch (this.f39843a) {
            case 0:
                a40 a40Var = ((o40) this.f39844b).f36538l0;
                if (a40Var != null) {
                    a40Var.F = i7;
                    a40Var.G = i10;
                    a40Var.b();
                    return;
                }
                return;
            case 1:
                bz0 bz0Var = ((dz0) this.f39844b).f33098a;
                if (bz0Var != null && (handler = bz0Var.getHandler()) != null && bz0Var.f32348b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i7, i10));
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f39844b;
                if (i7 > 0 && i10 > 0) {
                    q0Var.f39443a.setLayoutAspectRatio(i7 / i10);
                    return;
                }
                return;
            case 4:
                wi.k kVar = (wi.k) this.f39844b;
                wi.o oVar = kVar.f57930j;
                oVar.b("preview surface size changed: view=" + i7 + "x" + i10);
                kVar.b0();
                return;
            default:
                xh.d dVar = ((xh.e) this.f39844b).f58693f;
                if (dVar != null) {
                    synchronized (dVar.f58680e) {
                        dVar.f58681f = true;
                        dVar.h = i7;
                        dVar.f58682n = i10;
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
        switch (this.f39843a) {
            case 0:
            case 1:
                return;
            case 2:
                l71 l71Var = (l71) this.f39844b;
                if (l71Var.f35569r == 1) {
                    l71Var.f35568n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 5));
                    l71Var.f35568n.invalidate();
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                if (((wi.k) this.f39844b).Y) {
                    ((wi.k) this.f39844b).Y = false;
                    wi.o oVar = ((wi.k) this.f39844b).f57930j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    if (((wi.k) this.f39844b).f57937l0) {
                        str = "DUAL_ACTIVE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(wi.k.A(((wi.k) this.f39844b).G0));
                    oVar.b(sb2.toString());
                    wi.u0 u0Var = (wi.u0) ((wi.k) this.f39844b).f57933k.f37389b;
                    Handler handler = u0Var.f58110i;
                    qt qtVar = u0Var.d;
                    Objects.requireNonNull(qtVar);
                    handler.post(new wg.p(qtVar, 3));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                wi.k kVar = (wi.k) this.f39844b;
                if (kVar.H0 == 0) {
                    kVar.H0 = elapsedRealtimeNanos;
                    wi.o oVar2 = kVar.f57930j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((wi.k) this.f39844b).f57911c.getWidth());
                    sb3.append("x");
                    sb3.append(((wi.k) this.f39844b).f57911c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((wi.k) this.f39844b).f57948q);
                    sb3.append(", attached=");
                    sb3.append(((wi.k) this.f39844b).f57911c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((wi.k) this.f39844b).f57911c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((wi.k) this.f39844b).f57911c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((wi.k) this.f39844b).f57911c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((wi.k) this.f39844b).f57911c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((wi.k) this.f39844b).f57911c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    oVar2.b(sb3.toString());
                }
                wi.k kVar2 = (wi.k) this.f39844b;
                long j11 = kVar2.J0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    kVar2.L0++;
                    kVar2.M0 += j12;
                    j3 = 0;
                    double d = j12;
                    kVar2.N0 = (d * d) + kVar2.N0;
                    long j13 = kVar2.O0;
                    if (j13 == 0 || j12 < j13) {
                        kVar2.O0 = j12;
                    }
                    kVar2.P0 = Math.max(kVar2.P0, j12);
                    if (j12 > 50000000) {
                        kVar2.Q0++;
                    }
                    if (j12 > 100000000) {
                        kVar2.R0++;
                    }
                } else {
                    j3 = 0;
                }
                wi.k kVar3 = (wi.k) this.f39844b;
                kVar3.J0 = elapsedRealtimeNanos;
                long j14 = kVar3.K0;
                if (timestamp > j14) {
                    if (kVar3.T0 == j3) {
                        kVar3.T0 = timestamp;
                    }
                    kVar3.U0 = timestamp;
                    kVar3.S0++;
                } else if (j14 != j3) {
                    kVar3.V0++;
                }
                kVar3.K0 = timestamp;
                kVar3.I0++;
                if (elapsedRealtimeNanos - kVar3.H0 >= 5000000000L) {
                    TextureView textureView = kVar3.f57911c;
                    long j15 = kVar3.U0 - kVar3.T0;
                    if (j15 > j3) {
                        long j16 = kVar3.S0;
                        if (j16 > 1) {
                            f10 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            kVar3.f57930j.b("preview frame delivery: callbackFps=" + ((((float) kVar3.I0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.k.i(kVar3.M0, kVar3.L0) + ", min=" + (((float) kVar3.O0) / 1000000.0f) + ", max=" + (((float) kVar3.P0) / 1000000.0f) + ", jitter=" + wi.k.V(kVar3.N0, kVar3.M0, kVar3.L0) + "}, gaps={over50ms=" + kVar3.Q0 + ", over100ms=" + kVar3.R0 + "}, nonMonotonicTimestamps=" + kVar3.V0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            kVar3.P();
                            kVar3.H0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f10 = 0.0f;
                    kVar3.f57930j.b("preview frame delivery: callbackFps=" + ((((float) kVar3.I0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.k.i(kVar3.M0, kVar3.L0) + ", min=" + (((float) kVar3.O0) / 1000000.0f) + ", max=" + (((float) kVar3.P0) / 1000000.0f) + ", jitter=" + wi.k.V(kVar3.N0, kVar3.M0, kVar3.L0) + "}, gaps={over50ms=" + kVar3.Q0 + ", over100ms=" + kVar3.R0 + "}, nonMonotonicTimestamps=" + kVar3.V0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    kVar3.P();
                    kVar3.H0 = elapsedRealtimeNanos;
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
