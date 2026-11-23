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
public final class k40 implements TextureView.SurfaceTextureListener {
    public final int f36731a;
    public final Object f36732b;

    public k40(Object obj, int i7) {
        this.f36731a = i7;
        this.f36732b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f36731a) {
            case 0:
                c50 c50Var = (c50) this.f36732b;
                if (org.telegram.messenger.s2.f26694a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (c50Var.m0 == null && surfaceTexture != null && !c50Var.f34003l0) {
                    if (org.telegram.messenger.s2.f26694a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    c50Var.m0 = new o40(c50Var, surfaceTexture, i7, i10);
                    return;
                }
                return;
            case 1:
                final oz0 oz0Var = (oz0) this.f36732b;
                ArrayList arrayList = oz0Var.f38382c;
                mz0 mz0Var = oz0Var.f38380a;
                if (mz0Var != null) {
                    mz0Var.h();
                    oz0Var.f38380a = null;
                }
                mz0 mz0Var2 = new mz0(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                oz0Var.invalidate();
                                return;
                            default:
                                oz0 oz0Var2 = oz0Var;
                                Runnable runnable = oz0Var2.d;
                                if (runnable != null) {
                                    oz0Var2.f38383e = true;
                                    oz0Var2.d = null;
                                    oz0.b(runnable);
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
                                oz0Var.invalidate();
                                return;
                            default:
                                oz0 oz0Var2 = oz0Var;
                                Runnable runnable = oz0Var2.d;
                                if (runnable != null) {
                                    oz0Var2.f38383e = true;
                                    oz0Var2.d = null;
                                    oz0.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i7, i10);
                oz0Var.f38380a = mz0Var2;
                mz0Var2.f37623a = org.telegram.messenger.n6.h(oz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        nz0 nz0Var = (nz0) arrayList.get(i11);
                        Bitmap bitmap = nz0Var.f37989e;
                        if (bitmap != null) {
                            oz0Var.f38380a.c(nz0Var.f37990f, bitmap, nz0Var.f37988c, nz0Var.d);
                        } else {
                            ArrayList arrayList2 = nz0Var.f37987b;
                            if (arrayList2 != null) {
                                oz0Var.f38380a.d(arrayList2, nz0Var.d);
                            } else {
                                oz0Var.f38380a.b(nz0Var.f37991g, nz0Var.f37986a, nz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(oz0Var.f38381b);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f36732b;
                EglRenderer eglRenderer = t0Var.f41319a;
                if (!t0Var.f41321c && t0Var.f41320b != surfaceTexture) {
                    t0Var.f41320b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    return;
                }
                return;
            case 4:
                xh.e eVar = (xh.e) this.f36732b;
                if (eVar.f60550f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f60550f = dVar;
                    dVar.start();
                    return;
                }
                return;
            default:
                zi.k kVar = (zi.k) this.f36732b;
                zi.o oVar = kVar.f62153j;
                oVar.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = kVar.f62163n;
                if (kVar.U && handler != null && kVar.f62134c.isAvailable()) {
                    handler.post(new zi.a(kVar, 8));
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f36731a) {
            case 0:
                c50 c50Var = (c50) this.f36732b;
                Camera2Session[] camera2SessionArr = c50Var.f34015v0;
                o40 o40Var = c50Var.m0;
                if (o40Var != null) {
                    o40Var.a(0, true, 0, 0, 0L);
                    c50Var.m0 = null;
                }
                if (c50Var.f34012s0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    return true;
                } else if (c50Var.f34013t0 != null) {
                    CameraController.getInstance().close(c50Var.f34013t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                oz0 oz0Var = (oz0) this.f36732b;
                mz0 mz0Var = oz0Var.f38380a;
                if (mz0Var != null) {
                    mz0Var.h();
                    oz0Var.f38380a = null;
                }
                Runnable runnable = oz0Var.d;
                if (runnable != null) {
                    oz0Var.d = null;
                    oz0.b(runnable);
                    return false;
                }
                return false;
            case 2:
                z71 z71Var = (z71) this.f36732b;
                TextureView textureView = z71Var.d;
                if (z71Var.T) {
                    if (z71Var.f42668a0) {
                        z71Var.f42685r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    z71Var.T = false;
                    return false;
                }
                return true;
            case 3:
                return true;
            case 4:
                xh.d dVar = ((xh.e) this.f36732b).f60550f;
                if (dVar != null) {
                    dVar.f60534a = false;
                    ((xh.e) this.f36732b).f60550f = null;
                    return true;
                }
                return true;
            default:
                ((zi.k) this.f36732b).f62153j.b("preview surface destroyed: active=" + ((zi.k) this.f36732b).U);
                if (((zi.k) this.f36732b).U) {
                    ((zi.k) this.f36732b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        Handler handler;
        switch (this.f36731a) {
            case 0:
                o40 o40Var = ((c50) this.f36732b).m0;
                if (o40Var != null) {
                    o40Var.G = i7;
                    o40Var.H = i10;
                    o40Var.b();
                    return;
                }
                return;
            case 1:
                mz0 mz0Var = ((oz0) this.f36732b).f38380a;
                if (mz0Var != null && (handler = mz0Var.getHandler()) != null && mz0Var.f37624b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i7, i10));
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f36732b;
                if (i7 > 0 && i10 > 0) {
                    t0Var.f41319a.setLayoutAspectRatio(i7 / i10);
                    return;
                }
                return;
            case 4:
                xh.d dVar = ((xh.e) this.f36732b).f60550f;
                if (dVar != null) {
                    synchronized (dVar.f60537e) {
                        dVar.f60538f = true;
                        dVar.h = i7;
                        dVar.f60539n = i10;
                    }
                    return;
                }
                return;
            default:
                zi.k kVar = (zi.k) this.f36732b;
                zi.o oVar = kVar.f62153j;
                oVar.b("preview surface size changed: view=" + i7 + "x" + i10);
                kVar.a0();
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
        switch (this.f36731a) {
            case 0:
            case 1:
                return;
            case 2:
                z71 z71Var = (z71) this.f36732b;
                if (z71Var.f42685r == 1) {
                    z71Var.f42684n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 5));
                    z71Var.f42684n.invalidate();
                    return;
                }
                return;
            case 3:
            case 4:
                return;
            default:
                if (((zi.k) this.f36732b).X) {
                    ((zi.k) this.f36732b).X = false;
                    zi.o oVar = ((zi.k) this.f36732b).f62153j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    if (((zi.k) this.f36732b).f62157k0) {
                        str = "DUAL_ACTIVE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(zi.k.z(((zi.k) this.f36732b).F0));
                    oVar.b(sb2.toString());
                    zi.u0 u0Var = (zi.u0) ((zi.k) this.f36732b).f62156k.f62193a;
                    Handler handler = u0Var.f62327i;
                    pf pfVar = u0Var.d;
                    Objects.requireNonNull(pfVar);
                    handler.post(new vg.d(pfVar, 15));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                zi.k kVar = (zi.k) this.f36732b;
                if (kVar.G0 == 0) {
                    kVar.G0 = elapsedRealtimeNanos;
                    zi.o oVar2 = kVar.f62153j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((zi.k) this.f36732b).f62134c.getWidth());
                    sb3.append("x");
                    sb3.append(((zi.k) this.f36732b).f62134c.getHeight());
                    sb3.append(", buffer=");
                    TextureView textureView = ((zi.k) this.f36732b).f62134c;
                    sb3.append(Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight()))));
                    sb3.append(", attached=");
                    sb3.append(((zi.k) this.f36732b).f62134c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((zi.k) this.f36732b).f62134c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((zi.k) this.f36732b).f62134c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((zi.k) this.f36732b).f62134c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((zi.k) this.f36732b).f62134c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((zi.k) this.f36732b).f62134c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    oVar2.b(sb3.toString());
                }
                zi.k kVar2 = (zi.k) this.f36732b;
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
                zi.k kVar3 = (zi.k) this.f36732b;
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
                    TextureView textureView2 = kVar3.f62134c;
                    long j15 = kVar3.T0 - kVar3.S0;
                    if (j15 > j3) {
                        long j16 = kVar3.R0;
                        if (j16 > 1) {
                            f10 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            kVar3.f62153j.b("preview frame delivery: callbackFps=" + ((((float) kVar3.H0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + zi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (((float) kVar3.N0) / 1000000.0f) + ", max=" + (((float) kVar3.O0) / 1000000.0f) + ", jitter=" + zi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                            kVar3.O();
                            kVar3.G0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f10 = 0.0f;
                    kVar3.f62153j.b("preview frame delivery: callbackFps=" + ((((float) kVar3.H0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + zi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (((float) kVar3.N0) / 1000000.0f) + ", max=" + (((float) kVar3.O0) / 1000000.0f) + ", jitter=" + zi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                    kVar3.O();
                    kVar3.G0 = elapsedRealtimeNanos;
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
