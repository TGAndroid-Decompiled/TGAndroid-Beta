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
public final class z30 implements TextureView.SurfaceTextureListener {
    public final int f42227a;
    public final Object f42228b;

    public z30(Object obj, int i7) {
        this.f42227a = i7;
        this.f42228b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f42227a) {
            case 0:
                r40 r40Var = (r40) this.f42228b;
                if (org.telegram.messenger.r2.f26198a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (r40Var.m0 == null && surfaceTexture != null && !r40Var.f38862l0) {
                    if (org.telegram.messenger.r2.f26198a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    r40Var.m0 = new d40(r40Var, surfaceTexture, i7, i10);
                    return;
                }
                return;
            case 1:
                final fz0 fz0Var = (fz0) this.f42228b;
                ArrayList arrayList = fz0Var.f34757c;
                dz0 dz0Var = fz0Var.f34755a;
                if (dz0Var != null) {
                    dz0Var.h();
                    fz0Var.f34755a = null;
                }
                dz0 dz0Var2 = new dz0(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                fz0Var.invalidate();
                                return;
                            default:
                                fz0 fz0Var2 = fz0Var;
                                Runnable runnable = fz0Var2.d;
                                if (runnable != null) {
                                    fz0Var2.f34758e = true;
                                    fz0Var2.d = null;
                                    fz0.b(runnable);
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
                                fz0Var.invalidate();
                                return;
                            default:
                                fz0 fz0Var2 = fz0Var;
                                Runnable runnable = fz0Var2.d;
                                if (runnable != null) {
                                    fz0Var2.f34758e = true;
                                    fz0Var2.d = null;
                                    fz0.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i7, i10);
                fz0Var.f34755a = dz0Var2;
                dz0Var2.f34109a = org.telegram.messenger.n6.h(fz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ez0 ez0Var = (ez0) arrayList.get(i11);
                        Bitmap bitmap = ez0Var.f34458e;
                        if (bitmap != null) {
                            fz0Var.f34755a.c(ez0Var.f34459f, bitmap, ez0Var.f34457c, ez0Var.d);
                        } else {
                            ArrayList arrayList2 = ez0Var.f34456b;
                            if (arrayList2 != null) {
                                fz0Var.f34755a.d(arrayList2, ez0Var.d);
                            } else {
                                fz0Var.f34755a.b(ez0Var.f34460g, ez0Var.f34455a, ez0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(fz0Var.f34756b);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f42228b;
                EglRenderer eglRenderer = u0Var.f40974a;
                if (!u0Var.f40976c && u0Var.f40975b != surfaceTexture) {
                    u0Var.f40975b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    return;
                }
                return;
            case 4:
                xh.e eVar = (xh.e) this.f42228b;
                if (eVar.f59974f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f59974f = dVar;
                    dVar.start();
                    return;
                }
                return;
            default:
                zi.l lVar = (zi.l) this.f42228b;
                zi.p pVar = lVar.f61579j;
                pVar.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = lVar.f61589n;
                if (lVar.U && handler != null && lVar.f61560c.isAvailable()) {
                    handler.post(new zi.a(lVar, 8));
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f42227a) {
            case 0:
                r40 r40Var = (r40) this.f42228b;
                Camera2Session[] camera2SessionArr = r40Var.f38874v0;
                d40 d40Var = r40Var.m0;
                if (d40Var != null) {
                    d40Var.a(0, true, 0, 0, 0L);
                    r40Var.m0 = null;
                }
                if (r40Var.f38871s0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    return true;
                } else if (r40Var.f38872t0 != null) {
                    CameraController.getInstance().close(r40Var.f38872t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                fz0 fz0Var = (fz0) this.f42228b;
                dz0 dz0Var = fz0Var.f34755a;
                if (dz0Var != null) {
                    dz0Var.h();
                    fz0Var.f34755a = null;
                }
                Runnable runnable = fz0Var.d;
                if (runnable != null) {
                    fz0Var.d = null;
                    fz0.b(runnable);
                    return false;
                }
                return false;
            case 2:
                m71 m71Var = (m71) this.f42228b;
                TextureView textureView = m71Var.d;
                if (m71Var.T) {
                    if (m71Var.f37139a0) {
                        m71Var.f37156r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    m71Var.T = false;
                    return false;
                }
                return true;
            case 3:
                return true;
            case 4:
                xh.d dVar = ((xh.e) this.f42228b).f59974f;
                if (dVar != null) {
                    dVar.f59958a = false;
                    ((xh.e) this.f42228b).f59974f = null;
                    return true;
                }
                return true;
            default:
                ((zi.l) this.f42228b).f61579j.b("preview surface destroyed: active=" + ((zi.l) this.f42228b).U);
                if (((zi.l) this.f42228b).U) {
                    ((zi.l) this.f42228b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        Handler handler;
        switch (this.f42227a) {
            case 0:
                d40 d40Var = ((r40) this.f42228b).m0;
                if (d40Var != null) {
                    d40Var.G = i7;
                    d40Var.H = i10;
                    d40Var.b();
                    return;
                }
                return;
            case 1:
                dz0 dz0Var = ((fz0) this.f42228b).f34755a;
                if (dz0Var != null && (handler = dz0Var.getHandler()) != null && dz0Var.f34110b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i7, i10));
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f42228b;
                if (i7 > 0 && i10 > 0) {
                    u0Var.f40974a.setLayoutAspectRatio(i7 / i10);
                    return;
                }
                return;
            case 4:
                xh.d dVar = ((xh.e) this.f42228b).f59974f;
                if (dVar != null) {
                    synchronized (dVar.f59961e) {
                        dVar.f59962f = true;
                        dVar.h = i7;
                        dVar.f59963n = i10;
                    }
                    return;
                }
                return;
            default:
                zi.l lVar = (zi.l) this.f42228b;
                zi.p pVar = lVar.f61579j;
                pVar.b("preview surface size changed: view=" + i7 + "x" + i10);
                lVar.a0();
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
        switch (this.f42227a) {
            case 0:
            case 1:
                return;
            case 2:
                m71 m71Var = (m71) this.f42228b;
                if (m71Var.f37156r == 1) {
                    m71Var.f37155n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 5));
                    m71Var.f37155n.invalidate();
                    return;
                }
                return;
            case 3:
            case 4:
                return;
            default:
                if (((zi.l) this.f42228b).X) {
                    ((zi.l) this.f42228b).X = false;
                    zi.p pVar = ((zi.l) this.f42228b).f61579j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    if (((zi.l) this.f42228b).f61583k0) {
                        str = "DUAL_ACTIVE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(zi.l.z(((zi.l) this.f42228b).F0));
                    pVar.b(sb2.toString());
                    zi.v0 v0Var = (zi.v0) ((zi.l) this.f42228b).f61582k.f57880a;
                    Handler handler = v0Var.f61752i;
                    ff ffVar = v0Var.d;
                    Objects.requireNonNull(ffVar);
                    handler.post(new vg.o(ffVar, 14));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                zi.l lVar = (zi.l) this.f42228b;
                if (lVar.G0 == 0) {
                    lVar.G0 = elapsedRealtimeNanos;
                    zi.p pVar2 = lVar.f61579j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((zi.l) this.f42228b).f61560c.getWidth());
                    sb3.append("x");
                    sb3.append(((zi.l) this.f42228b).f61560c.getHeight());
                    sb3.append(", buffer=");
                    TextureView textureView = ((zi.l) this.f42228b).f61560c;
                    sb3.append(Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight()))));
                    sb3.append(", attached=");
                    sb3.append(((zi.l) this.f42228b).f61560c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((zi.l) this.f42228b).f61560c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((zi.l) this.f42228b).f61560c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((zi.l) this.f42228b).f61560c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((zi.l) this.f42228b).f61560c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((zi.l) this.f42228b).f61560c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    pVar2.b(sb3.toString());
                }
                zi.l lVar2 = (zi.l) this.f42228b;
                long j11 = lVar2.I0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    lVar2.K0++;
                    lVar2.L0 += j12;
                    j3 = 0;
                    double d = j12;
                    lVar2.M0 = (d * d) + lVar2.M0;
                    long j13 = lVar2.N0;
                    if (j13 == 0 || j12 < j13) {
                        lVar2.N0 = j12;
                    }
                    lVar2.O0 = Math.max(lVar2.O0, j12);
                    if (j12 > 50000000) {
                        lVar2.P0++;
                    }
                    if (j12 > 100000000) {
                        lVar2.Q0++;
                    }
                } else {
                    j3 = 0;
                }
                zi.l lVar3 = (zi.l) this.f42228b;
                lVar3.I0 = elapsedRealtimeNanos;
                long j14 = lVar3.J0;
                if (timestamp > j14) {
                    if (lVar3.S0 == j3) {
                        lVar3.S0 = timestamp;
                    }
                    lVar3.T0 = timestamp;
                    lVar3.R0++;
                } else if (j14 != j3) {
                    lVar3.U0++;
                }
                lVar3.J0 = timestamp;
                lVar3.H0++;
                if (elapsedRealtimeNanos - lVar3.G0 >= 5000000000L) {
                    TextureView textureView2 = lVar3.f61560c;
                    long j15 = lVar3.T0 - lVar3.S0;
                    if (j15 > j3) {
                        long j16 = lVar3.R0;
                        if (j16 > 1) {
                            f10 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            lVar3.f61579j.b("preview frame delivery: callbackFps=" + ((((float) lVar3.H0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + zi.l.i(lVar3.L0, lVar3.K0) + ", min=" + (((float) lVar3.N0) / 1000000.0f) + ", max=" + (((float) lVar3.O0) / 1000000.0f) + ", jitter=" + zi.l.U(lVar3.M0, lVar3.L0, lVar3.K0) + "}, gaps={over50ms=" + lVar3.P0 + ", over100ms=" + lVar3.Q0 + "}, nonMonotonicTimestamps=" + lVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                            lVar3.O();
                            lVar3.G0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f10 = 0.0f;
                    lVar3.f61579j.b("preview frame delivery: callbackFps=" + ((((float) lVar3.H0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + zi.l.i(lVar3.L0, lVar3.K0) + ", min=" + (((float) lVar3.N0) / 1000000.0f) + ", max=" + (((float) lVar3.O0) / 1000000.0f) + ", jitter=" + zi.l.U(lVar3.M0, lVar3.L0, lVar3.K0) + "}, gaps={over50ms=" + lVar3.P0 + ", over100ms=" + lVar3.Q0 + "}, nonMonotonicTimestamps=" + lVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                    lVar3.O();
                    lVar3.G0 = elapsedRealtimeNanos;
                    return;
                }
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
