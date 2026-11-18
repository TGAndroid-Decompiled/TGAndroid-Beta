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
public final class h40 implements TextureView.SurfaceTextureListener {
    public final int f35712a;
    public final Object f35713b;

    public h40(Object obj, int i7) {
        this.f35712a = i7;
        this.f35713b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.f35712a) {
            case 0:
                z40 z40Var = (z40) this.f35713b;
                if (org.telegram.messenger.s2.f26723a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (z40Var.m0 == null && surfaceTexture != null && !z40Var.f42786l0) {
                    if (org.telegram.messenger.s2.f26723a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    z40Var.m0 = new l40(z40Var, surfaceTexture, i7, i10);
                    return;
                }
                return;
            case 1:
                final mz0 mz0Var = (mz0) this.f35713b;
                ArrayList arrayList = mz0Var.f37677c;
                kz0 kz0Var = mz0Var.f37675a;
                if (kz0Var != null) {
                    kz0Var.h();
                    mz0Var.f37675a = null;
                }
                kz0 kz0Var2 = new kz0(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                mz0Var.invalidate();
                                return;
                            default:
                                mz0 mz0Var2 = mz0Var;
                                Runnable runnable = mz0Var2.d;
                                if (runnable != null) {
                                    mz0Var2.f37678e = true;
                                    mz0Var2.d = null;
                                    mz0.b(runnable);
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
                                mz0Var.invalidate();
                                return;
                            default:
                                mz0 mz0Var2 = mz0Var;
                                Runnable runnable = mz0Var2.d;
                                if (runnable != null) {
                                    mz0Var2.f37678e = true;
                                    mz0Var2.d = null;
                                    mz0.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i7, i10);
                mz0Var.f37675a = kz0Var2;
                kz0Var2.f36921a = org.telegram.messenger.n6.h(mz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        lz0 lz0Var = (lz0) arrayList.get(i11);
                        Bitmap bitmap = lz0Var.f37275e;
                        if (bitmap != null) {
                            mz0Var.f37675a.c(lz0Var.f37276f, bitmap, lz0Var.f37274c, lz0Var.d);
                        } else {
                            ArrayList arrayList2 = lz0Var.f37273b;
                            if (arrayList2 != null) {
                                mz0Var.f37675a.d(arrayList2, lz0Var.d);
                            } else {
                                mz0Var.f37675a.b(lz0Var.f37277g, lz0Var.f37272a, lz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(mz0Var.f37676b);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f35713b;
                EglRenderer eglRenderer = t0Var.f41221a;
                if (!t0Var.f41223c && t0Var.f41222b != surfaceTexture) {
                    t0Var.f41222b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    return;
                }
                return;
            case 4:
                xh.e eVar = (xh.e) this.f35713b;
                if (eVar.f60539f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f60539f = dVar;
                    dVar.start();
                    return;
                }
                return;
            default:
                zi.k kVar = (zi.k) this.f35713b;
                zi.o oVar = kVar.f62142j;
                oVar.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = kVar.f62152n;
                if (kVar.U && handler != null && kVar.f62123c.isAvailable()) {
                    handler.post(new zi.a(kVar, 8));
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f35712a) {
            case 0:
                z40 z40Var = (z40) this.f35713b;
                Camera2Session[] camera2SessionArr = z40Var.f42798v0;
                l40 l40Var = z40Var.m0;
                if (l40Var != null) {
                    l40Var.a(0, true, 0, 0, 0L);
                    z40Var.m0 = null;
                }
                if (z40Var.f42795s0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    return true;
                } else if (z40Var.f42796t0 != null) {
                    CameraController.getInstance().close(z40Var.f42796t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                mz0 mz0Var = (mz0) this.f35713b;
                kz0 kz0Var = mz0Var.f37675a;
                if (kz0Var != null) {
                    kz0Var.h();
                    mz0Var.f37675a = null;
                }
                Runnable runnable = mz0Var.d;
                if (runnable != null) {
                    mz0Var.d = null;
                    mz0.b(runnable);
                    return false;
                }
                return false;
            case 2:
                w71 w71Var = (w71) this.f35713b;
                TextureView textureView = w71Var.d;
                if (w71Var.T) {
                    if (w71Var.f41593a0) {
                        w71Var.f41610r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    w71Var.T = false;
                    return false;
                }
                return true;
            case 3:
                return true;
            case 4:
                xh.d dVar = ((xh.e) this.f35713b).f60539f;
                if (dVar != null) {
                    dVar.f60523a = false;
                    ((xh.e) this.f35713b).f60539f = null;
                    return true;
                }
                return true;
            default:
                ((zi.k) this.f35713b).f62142j.b("preview surface destroyed: active=" + ((zi.k) this.f35713b).U);
                if (((zi.k) this.f35713b).U) {
                    ((zi.k) this.f35713b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        Handler handler;
        switch (this.f35712a) {
            case 0:
                l40 l40Var = ((z40) this.f35713b).m0;
                if (l40Var != null) {
                    l40Var.G = i7;
                    l40Var.H = i10;
                    l40Var.b();
                    return;
                }
                return;
            case 1:
                kz0 kz0Var = ((mz0) this.f35713b).f37675a;
                if (kz0Var != null && (handler = kz0Var.getHandler()) != null && kz0Var.f36922b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i7, i10));
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f35713b;
                if (i7 > 0 && i10 > 0) {
                    t0Var.f41221a.setLayoutAspectRatio(i7 / i10);
                    return;
                }
                return;
            case 4:
                xh.d dVar = ((xh.e) this.f35713b).f60539f;
                if (dVar != null) {
                    synchronized (dVar.f60526e) {
                        dVar.f60527f = true;
                        dVar.h = i7;
                        dVar.f60528n = i10;
                    }
                    return;
                }
                return;
            default:
                zi.k kVar = (zi.k) this.f35713b;
                zi.o oVar = kVar.f62142j;
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
        switch (this.f35712a) {
            case 0:
            case 1:
                return;
            case 2:
                w71 w71Var = (w71) this.f35713b;
                if (w71Var.f41610r == 1) {
                    w71Var.f41609n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.i1(this, 5));
                    w71Var.f41609n.invalidate();
                    return;
                }
                return;
            case 3:
            case 4:
                return;
            default:
                if (((zi.k) this.f35713b).X) {
                    ((zi.k) this.f35713b).X = false;
                    zi.o oVar = ((zi.k) this.f35713b).f62142j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    if (((zi.k) this.f35713b).f62146k0) {
                        str = "DUAL_ACTIVE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(zi.k.z(((zi.k) this.f35713b).F0));
                    oVar.b(sb2.toString());
                    zi.u0 u0Var = (zi.u0) ((zi.k) this.f35713b).f62145k.f62182a;
                    Handler handler = u0Var.f62316i;
                    of ofVar = u0Var.d;
                    Objects.requireNonNull(ofVar);
                    handler.post(new v4.p(ofVar, 16));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                zi.k kVar = (zi.k) this.f35713b;
                if (kVar.G0 == 0) {
                    kVar.G0 = elapsedRealtimeNanos;
                    zi.o oVar2 = kVar.f62142j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((zi.k) this.f35713b).f62123c.getWidth());
                    sb3.append("x");
                    sb3.append(((zi.k) this.f35713b).f62123c.getHeight());
                    sb3.append(", buffer=");
                    TextureView textureView = ((zi.k) this.f35713b).f62123c;
                    sb3.append(Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight()))));
                    sb3.append(", attached=");
                    sb3.append(((zi.k) this.f35713b).f62123c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((zi.k) this.f35713b).f62123c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((zi.k) this.f35713b).f62123c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((zi.k) this.f35713b).f62123c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((zi.k) this.f35713b).f62123c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((zi.k) this.f35713b).f62123c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    oVar2.b(sb3.toString());
                }
                zi.k kVar2 = (zi.k) this.f35713b;
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
                zi.k kVar3 = (zi.k) this.f35713b;
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
                    TextureView textureView2 = kVar3.f62123c;
                    long j15 = kVar3.T0 - kVar3.S0;
                    if (j15 > j3) {
                        long j16 = kVar3.R0;
                        if (j16 > 1) {
                            f10 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            kVar3.f62142j.b("preview frame delivery: callbackFps=" + ((((float) kVar3.H0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + zi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (((float) kVar3.N0) / 1000000.0f) + ", max=" + (((float) kVar3.O0) / 1000000.0f) + ", jitter=" + zi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                            kVar3.O();
                            kVar3.G0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f10 = 0.0f;
                    kVar3.f62142j.b("preview frame delivery: callbackFps=" + ((((float) kVar3.H0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + zi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (((float) kVar3.N0) / 1000000.0f) + ", max=" + (((float) kVar3.O0) / 1000000.0f) + ", jitter=" + zi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
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
