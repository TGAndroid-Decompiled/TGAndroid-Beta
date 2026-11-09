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
public final class x30 implements TextureView.SurfaceTextureListener {
    public final int f40284a;
    public final Object f40285b;

    public x30(Object obj, int i7) {
        this.f40284a = i7;
        this.f40285b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f40284a) {
            case 0:
                p40 p40Var = (p40) this.f40285b;
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (p40Var.f36907l0 == null && surfaceTexture != null && !p40Var.f36905k0) {
                    if (org.telegram.messenger.r2.f25212a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    p40Var.f36907l0 = new b40(p40Var, surfaceTexture, i7, i10);
                    return;
                }
                return;
            case 1:
                final ez0 ez0Var = (ez0) this.f40285b;
                ArrayList arrayList = ez0Var.f33527c;
                cz0 cz0Var = ez0Var.f33525a;
                if (cz0Var != null) {
                    cz0Var.h();
                    ez0Var.f33525a = null;
                }
                cz0 cz0Var2 = new cz0(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ez0Var.invalidate();
                                return;
                            default:
                                ez0 ez0Var2 = ez0Var;
                                Runnable runnable = ez0Var2.d;
                                if (runnable != null) {
                                    ez0Var2.f33528e = true;
                                    ez0Var2.d = null;
                                    ez0.b(runnable);
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
                                ez0Var.invalidate();
                                return;
                            default:
                                ez0 ez0Var2 = ez0Var;
                                Runnable runnable = ez0Var2.d;
                                if (runnable != null) {
                                    ez0Var2.f33528e = true;
                                    ez0Var2.d = null;
                                    ez0.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i7, i10);
                ez0Var.f33525a = cz0Var2;
                cz0Var2.f32796a = org.telegram.messenger.n6.h(ez0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        dz0 dz0Var = (dz0) arrayList.get(i11);
                        Bitmap bitmap = dz0Var.f33233e;
                        if (bitmap != null) {
                            ez0Var.f33525a.c(dz0Var.f33234f, bitmap, dz0Var.f33232c, dz0Var.d);
                        } else {
                            ArrayList arrayList2 = dz0Var.f33231b;
                            if (arrayList2 != null) {
                                ez0Var.f33525a.d(arrayList2, dz0Var.d);
                            } else {
                                ez0Var.f33525a.b(dz0Var.f33235g, dz0Var.f33230a, dz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(ez0Var.f33526b);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f40285b;
                EglRenderer eglRenderer = q0Var.f39567a;
                if (!q0Var.f39569c && q0Var.f39568b != surfaceTexture) {
                    q0Var.f39568b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    return;
                }
                return;
            case 4:
                wi.k kVar = (wi.k) this.f40285b;
                wi.o oVar = kVar.f58036j;
                oVar.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = kVar.f58046n;
                if (kVar.U && handler != null && kVar.f58017c.isAvailable()) {
                    handler.post(new wi.a(kVar, 8));
                    return;
                }
                return;
            default:
                xh.e eVar = (xh.e) this.f40285b;
                if (eVar.f58792f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f58792f = dVar;
                    dVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f40284a) {
            case 0:
                p40 p40Var = (p40) this.f40285b;
                Camera2Session[] camera2SessionArr = p40Var.f36918u0;
                b40 b40Var = p40Var.f36907l0;
                if (b40Var != null) {
                    b40Var.a(0, true, 0, 0, 0L);
                    p40Var.f36907l0 = null;
                }
                if (p40Var.f36914r0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    return true;
                } else if (p40Var.f36916s0 != null) {
                    CameraController.getInstance().close(p40Var.f36916s0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ez0 ez0Var = (ez0) this.f40285b;
                cz0 cz0Var = ez0Var.f33525a;
                if (cz0Var != null) {
                    cz0Var.h();
                    ez0Var.f33525a = null;
                }
                Runnable runnable = ez0Var.d;
                if (runnable != null) {
                    ez0Var.d = null;
                    ez0.b(runnable);
                    return false;
                }
                return false;
            case 2:
                m71 m71Var = (m71) this.f40285b;
                TextureView textureView = m71Var.d;
                if (m71Var.S) {
                    if (m71Var.W) {
                        m71Var.f36013r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    m71Var.S = false;
                    return false;
                }
                return true;
            case 3:
                return true;
            case 4:
                ((wi.k) this.f40285b).f58036j.b("preview surface destroyed: active=" + ((wi.k) this.f40285b).U);
                if (((wi.k) this.f40285b).U) {
                    ((wi.k) this.f40285b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                xh.d dVar = ((xh.e) this.f40285b).f58792f;
                if (dVar != null) {
                    dVar.f58776a = false;
                    ((xh.e) this.f40285b).f58792f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        Handler handler;
        switch (this.f40284a) {
            case 0:
                b40 b40Var = ((p40) this.f40285b).f36907l0;
                if (b40Var != null) {
                    b40Var.F = i7;
                    b40Var.G = i10;
                    b40Var.b();
                    return;
                }
                return;
            case 1:
                cz0 cz0Var = ((ez0) this.f40285b).f33525a;
                if (cz0Var != null && (handler = cz0Var.getHandler()) != null && cz0Var.f32797b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i7, i10));
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f40285b;
                if (i7 > 0 && i10 > 0) {
                    q0Var.f39567a.setLayoutAspectRatio(i7 / i10);
                    return;
                }
                return;
            case 4:
                wi.k kVar = (wi.k) this.f40285b;
                wi.o oVar = kVar.f58036j;
                oVar.b("preview surface size changed: view=" + i7 + "x" + i10);
                kVar.a0();
                return;
            default:
                xh.d dVar = ((xh.e) this.f40285b).f58792f;
                if (dVar != null) {
                    synchronized (dVar.f58779e) {
                        dVar.f58780f = true;
                        dVar.h = i7;
                        dVar.f58781n = i10;
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
        switch (this.f40284a) {
            case 0:
            case 1:
                return;
            case 2:
                m71 m71Var = (m71) this.f40285b;
                if (m71Var.f36013r == 1) {
                    m71Var.f36012n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 5));
                    m71Var.f36012n.invalidate();
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                if (((wi.k) this.f40285b).X) {
                    ((wi.k) this.f40285b).X = false;
                    wi.o oVar = ((wi.k) this.f40285b).f58036j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    if (((wi.k) this.f40285b).f58040k0) {
                        str = "DUAL_ACTIVE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(wi.k.z(((wi.k) this.f40285b).F0));
                    oVar.b(sb2.toString());
                    wi.t0 t0Var = (wi.t0) ((wi.k) this.f40285b).f58039k.f37805b;
                    Handler handler = t0Var.f58209i;
                    rt rtVar = t0Var.d;
                    Objects.requireNonNull(rtVar);
                    handler.post(new wg.a0(rtVar, 1));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                wi.k kVar = (wi.k) this.f40285b;
                if (kVar.G0 == 0) {
                    kVar.G0 = elapsedRealtimeNanos;
                    wi.o oVar2 = kVar.f58036j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((wi.k) this.f40285b).f58017c.getWidth());
                    sb3.append("x");
                    sb3.append(((wi.k) this.f40285b).f58017c.getHeight());
                    sb3.append(", buffer=");
                    TextureView textureView = ((wi.k) this.f40285b).f58017c;
                    sb3.append(Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight()))));
                    sb3.append(", attached=");
                    sb3.append(((wi.k) this.f40285b).f58017c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((wi.k) this.f40285b).f58017c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((wi.k) this.f40285b).f58017c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((wi.k) this.f40285b).f58017c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((wi.k) this.f40285b).f58017c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((wi.k) this.f40285b).f58017c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    oVar2.b(sb3.toString());
                }
                wi.k kVar2 = (wi.k) this.f40285b;
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
                wi.k kVar3 = (wi.k) this.f40285b;
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
                    TextureView textureView2 = kVar3.f58017c;
                    long j15 = kVar3.T0 - kVar3.S0;
                    if (j15 > j3) {
                        long j16 = kVar3.R0;
                        if (j16 > 1) {
                            f10 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            kVar3.f58036j.b("preview frame delivery: callbackFps=" + ((((float) kVar3.H0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (((float) kVar3.N0) / 1000000.0f) + ", max=" + (((float) kVar3.O0) / 1000000.0f) + ", jitter=" + wi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                            kVar3.O();
                            kVar3.G0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f10 = 0.0f;
                    kVar3.f58036j.b("preview frame delivery: callbackFps=" + ((((float) kVar3.H0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (((float) kVar3.N0) / 1000000.0f) + ", max=" + (((float) kVar3.O0) / 1000000.0f) + ", jitter=" + wi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
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
