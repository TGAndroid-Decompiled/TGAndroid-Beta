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
    public final int f39868a;
    public final Object f39869b;

    public w30(Object obj, int i7) {
        this.f39868a = i7;
        this.f39869b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f39868a) {
            case 0:
                o40 o40Var = (o40) this.f39869b;
                if (org.telegram.messenger.r2.f25216a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (o40Var.f36498l0 == null && surfaceTexture != null && !o40Var.f36496k0) {
                    if (org.telegram.messenger.r2.f25216a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    o40Var.f36498l0 = new a40(o40Var, surfaceTexture, i7, i10);
                    return;
                }
                return;
            case 1:
                final dz0 dz0Var = (dz0) this.f39869b;
                ArrayList arrayList = dz0Var.f33107c;
                bz0 bz0Var = dz0Var.f33105a;
                if (bz0Var != null) {
                    bz0Var.h();
                    dz0Var.f33105a = null;
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
                                    dz0Var2.f33108e = true;
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
                                    dz0Var2.f33108e = true;
                                    dz0Var2.d = null;
                                    dz0.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i7, i10);
                dz0Var.f33105a = bz0Var2;
                bz0Var2.f32387a = org.telegram.messenger.n6.h(dz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        cz0 cz0Var = (cz0) arrayList.get(i11);
                        Bitmap bitmap = cz0Var.f32830e;
                        if (bitmap != null) {
                            dz0Var.f33105a.c(cz0Var.f32831f, bitmap, cz0Var.f32829c, cz0Var.d);
                        } else {
                            ArrayList arrayList2 = cz0Var.f32828b;
                            if (arrayList2 != null) {
                                dz0Var.f33105a.d(arrayList2, cz0Var.d);
                            } else {
                                dz0Var.f33105a.b(cz0Var.f32832g, cz0Var.f32827a, cz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(dz0Var.f33106b);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f39869b;
                EglRenderer eglRenderer = q0Var.f39487a;
                if (!q0Var.f39489c && q0Var.f39488b != surfaceTexture) {
                    q0Var.f39488b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    return;
                }
                return;
            case 4:
                wi.k kVar = (wi.k) this.f39869b;
                wi.o oVar = kVar.f58040j;
                oVar.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = kVar.f58050n;
                if (kVar.U && handler != null && kVar.f58021c.isAvailable()) {
                    handler.post(new wi.a(kVar, 8));
                    return;
                }
                return;
            default:
                xh.e eVar = (xh.e) this.f39869b;
                if (eVar.f58790f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f58790f = dVar;
                    dVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f39868a) {
            case 0:
                o40 o40Var = (o40) this.f39869b;
                Camera2Session[] camera2SessionArr = o40Var.f36509u0;
                a40 a40Var = o40Var.f36498l0;
                if (a40Var != null) {
                    a40Var.a(0, true, 0, 0, 0L);
                    o40Var.f36498l0 = null;
                }
                if (o40Var.f36505r0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    return true;
                } else if (o40Var.f36507s0 != null) {
                    CameraController.getInstance().close(o40Var.f36507s0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                dz0 dz0Var = (dz0) this.f39869b;
                bz0 bz0Var = dz0Var.f33105a;
                if (bz0Var != null) {
                    bz0Var.h();
                    dz0Var.f33105a = null;
                }
                Runnable runnable = dz0Var.d;
                if (runnable != null) {
                    dz0Var.d = null;
                    dz0.b(runnable);
                    return false;
                }
                return false;
            case 2:
                l71 l71Var = (l71) this.f39869b;
                TextureView textureView = l71Var.d;
                if (l71Var.S) {
                    if (l71Var.W) {
                        l71Var.f35597r = 2;
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
                ((wi.k) this.f39869b).f58040j.b("preview surface destroyed: active=" + ((wi.k) this.f39869b).U);
                if (((wi.k) this.f39869b).U) {
                    ((wi.k) this.f39869b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                xh.d dVar = ((xh.e) this.f39869b).f58790f;
                if (dVar != null) {
                    dVar.f58774a = false;
                    ((xh.e) this.f39869b).f58790f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        Handler handler;
        switch (this.f39868a) {
            case 0:
                a40 a40Var = ((o40) this.f39869b).f36498l0;
                if (a40Var != null) {
                    a40Var.F = i7;
                    a40Var.G = i10;
                    a40Var.b();
                    return;
                }
                return;
            case 1:
                bz0 bz0Var = ((dz0) this.f39869b).f33105a;
                if (bz0Var != null && (handler = bz0Var.getHandler()) != null && bz0Var.f32388b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i7, i10));
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f39869b;
                if (i7 > 0 && i10 > 0) {
                    q0Var.f39487a.setLayoutAspectRatio(i7 / i10);
                    return;
                }
                return;
            case 4:
                wi.k kVar = (wi.k) this.f39869b;
                wi.o oVar = kVar.f58040j;
                oVar.b("preview surface size changed: view=" + i7 + "x" + i10);
                kVar.a0();
                return;
            default:
                xh.d dVar = ((xh.e) this.f39869b).f58790f;
                if (dVar != null) {
                    synchronized (dVar.f58777e) {
                        dVar.f58778f = true;
                        dVar.h = i7;
                        dVar.f58779n = i10;
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
        switch (this.f39868a) {
            case 0:
            case 1:
                return;
            case 2:
                l71 l71Var = (l71) this.f39869b;
                if (l71Var.f35597r == 1) {
                    l71Var.f35596n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 5));
                    l71Var.f35596n.invalidate();
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                if (((wi.k) this.f39869b).X) {
                    ((wi.k) this.f39869b).X = false;
                    wi.o oVar = ((wi.k) this.f39869b).f58040j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    if (((wi.k) this.f39869b).f58044k0) {
                        str = "DUAL_ACTIVE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(wi.k.z(((wi.k) this.f39869b).F0));
                    oVar.b(sb2.toString());
                    wi.t0 t0Var = (wi.t0) ((wi.k) this.f39869b).f58043k.f37395b;
                    Handler handler = t0Var.f58213i;
                    qt qtVar = t0Var.d;
                    Objects.requireNonNull(qtVar);
                    handler.post(new wg.a0(qtVar, 1));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                wi.k kVar = (wi.k) this.f39869b;
                if (kVar.G0 == 0) {
                    kVar.G0 = elapsedRealtimeNanos;
                    wi.o oVar2 = kVar.f58040j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((wi.k) this.f39869b).f58021c.getWidth());
                    sb3.append("x");
                    sb3.append(((wi.k) this.f39869b).f58021c.getHeight());
                    sb3.append(", buffer=");
                    TextureView textureView = ((wi.k) this.f39869b).f58021c;
                    sb3.append(Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight()))));
                    sb3.append(", attached=");
                    sb3.append(((wi.k) this.f39869b).f58021c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((wi.k) this.f39869b).f58021c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((wi.k) this.f39869b).f58021c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((wi.k) this.f39869b).f58021c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((wi.k) this.f39869b).f58021c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((wi.k) this.f39869b).f58021c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    oVar2.b(sb3.toString());
                }
                wi.k kVar2 = (wi.k) this.f39869b;
                long j11 = kVar2.I0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    kVar2.K0++;
                    kVar2.L0 += j12;
                    j3 = 0;
                    double d = j12;
                    kVar2.M0 = (d * d) + kVar2.M0;
                    long j13 = kVar2.N0;
                    if (j13 == 0 || j12 < j13) {
                        kVar2.N0 = j12;
                    }
                    kVar2.O0 = Math.max(kVar2.O0, j12);
                    if (j12 > 50000000) {
                        kVar2.P0++;
                    }
                    if (j12 > 100000000) {
                        kVar2.Q0++;
                    }
                } else {
                    j3 = 0;
                }
                wi.k kVar3 = (wi.k) this.f39869b;
                kVar3.I0 = elapsedRealtimeNanos;
                long j14 = kVar3.J0;
                if (timestamp > j14) {
                    if (kVar3.S0 == j3) {
                        kVar3.S0 = timestamp;
                    }
                    kVar3.T0 = timestamp;
                    kVar3.R0++;
                } else if (j14 != j3) {
                    kVar3.U0++;
                }
                kVar3.J0 = timestamp;
                kVar3.H0++;
                if (elapsedRealtimeNanos - kVar3.G0 >= 5000000000L) {
                    TextureView textureView2 = kVar3.f58021c;
                    long j15 = kVar3.T0 - kVar3.S0;
                    if (j15 > j3) {
                        long j16 = kVar3.R0;
                        if (j16 > 1) {
                            f10 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            kVar3.f58040j.b("preview frame delivery: callbackFps=" + ((((float) kVar3.H0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (((float) kVar3.N0) / 1000000.0f) + ", max=" + (((float) kVar3.O0) / 1000000.0f) + ", jitter=" + wi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                            kVar3.O();
                            kVar3.G0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f10 = 0.0f;
                    kVar3.f58040j.b("preview frame delivery: callbackFps=" + ((((float) kVar3.H0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (((float) kVar3.N0) / 1000000.0f) + ", max=" + (((float) kVar3.O0) / 1000000.0f) + ", jitter=" + wi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                    kVar3.O();
                    kVar3.G0 = elapsedRealtimeNanos;
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
