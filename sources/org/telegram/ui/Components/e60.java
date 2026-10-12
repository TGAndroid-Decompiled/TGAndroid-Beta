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
public final class e60 implements TextureView.SurfaceTextureListener {
    public final int f25607a;
    public final Object f25608b;

    public e60(Object obj, int i10) {
        this.f25607a = i10;
        this.f25608b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f25607a) {
            case 0:
                w60 w60Var = (w60) this.f25608b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (w60Var.m0 == null && surfaceTexture != null && !w60Var.f32310l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    w60Var.m0 = new i60(w60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final i21 i21Var = (i21) this.f25608b;
                ArrayList arrayList = i21Var.f27023c;
                g21 g21Var = i21Var.f27021a;
                if (g21Var != null) {
                    g21Var.i();
                    i21Var.f27021a = null;
                }
                g21 g21Var2 = new g21(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                i21Var.invalidate();
                                return;
                            default:
                                i21 i21Var2 = i21Var;
                                Runnable runnable = i21Var2.d;
                                if (runnable != null) {
                                    i21Var2.f27024e = true;
                                    i21Var2.d = null;
                                    i21.b(runnable);
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
                                i21Var.invalidate();
                                return;
                            default:
                                i21 i21Var2 = i21Var;
                                Runnable runnable = i21Var2.d;
                                if (runnable != null) {
                                    i21Var2.f27024e = true;
                                    i21Var2.d = null;
                                    i21.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                i21Var.f27021a = g21Var2;
                g21Var2.f26231a = EmuDetector.with(i21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        h21 h21Var = (h21) arrayList.get(i12);
                        Bitmap bitmap = h21Var.f26618e;
                        if (bitmap != null) {
                            i21Var.f27021a.c(h21Var.f26619f, bitmap, h21Var.f26617c, h21Var.d);
                        } else {
                            ArrayList arrayList2 = h21Var.f26616b;
                            if (arrayList2 != null) {
                                i21Var.f27021a.f(arrayList2, h21Var.d);
                            } else {
                                i21Var.f27021a.e(h21Var.f26615a, h21Var.f26620g, h21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(i21Var.f27022b);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                qi.h hVar = (qi.h) this.f25608b;
                qi.l lVar = hVar.f46725j;
                lVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = hVar.f46732n;
                if (hVar.S && handler != null && hVar.f46713c.isAvailable()) {
                    handler.post(new qi.a(hVar, 6));
                    return;
                }
                return;
            default:
                vh.f fVar = (vh.f) this.f25608b;
                if (fVar.f49901f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f49901f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f25607a) {
            case 0:
                w60 w60Var = (w60) this.f25608b;
                Camera2Session[] camera2SessionArr = w60Var.f32322v0;
                i60 i60Var = w60Var.m0;
                if (i60Var != null) {
                    i60Var.b(0L, 0, true, 0, 0);
                    w60Var.m0 = null;
                }
                if (w60Var.f32319s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (w60Var.f32320t0 != null) {
                    CameraController.getInstance().close(w60Var.f32320t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((jh0) this.f25608b).V.f33903w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                i21 i21Var = (i21) this.f25608b;
                g21 g21Var = i21Var.f27021a;
                if (g21Var != null) {
                    g21Var.i();
                    i21Var.f27021a = null;
                }
                Runnable runnable = i21Var.d;
                if (runnable != null) {
                    i21Var.d = null;
                    i21.b(runnable);
                    return false;
                }
                return false;
            case 3:
                ma1 ma1Var = (ma1) this.f25608b;
                TextureView textureView = ma1Var.d;
                if (ma1Var.S) {
                    if (ma1Var.W) {
                        ma1Var.f28520r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    ma1Var.S = false;
                    return false;
                }
                return true;
            case 4:
                ((qi.h) this.f25608b).f46725j.b("preview surface destroyed: active=" + ((qi.h) this.f25608b).S);
                if (((qi.h) this.f25608b).S) {
                    ((qi.h) this.f25608b).t(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f25608b).f49901f;
                if (eVar != null) {
                    eVar.f49885a = false;
                    ((vh.f) this.f25608b).f49901f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f25607a) {
            case 0:
                i60 i60Var = ((w60) this.f25608b).m0;
                if (i60Var != null) {
                    i60Var.F = i10;
                    i60Var.G = i11;
                    i60Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                g21 g21Var = ((i21) this.f25608b).f27021a;
                if (g21Var != null && (handler = g21Var.getHandler()) != null && g21Var.f26232b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                qi.h hVar = (qi.h) this.f25608b;
                qi.l lVar = hVar.f46725j;
                lVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                hVar.G();
                return;
            default:
                vh.e eVar = ((vh.f) this.f25608b).f49901f;
                if (eVar != null) {
                    synchronized (eVar.f49888e) {
                        eVar.f49889f = true;
                        eVar.h = i10;
                        eVar.f49890n = i11;
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
        float f7;
        Object valueOf;
        switch (this.f25607a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                ma1 ma1Var = (ma1) this.f25608b;
                if (ma1Var.f28520r == 1) {
                    ma1Var.f28519n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 4));
                    ma1Var.f28519n.invalidate();
                    return;
                }
                return;
            case 4:
                if (((qi.h) this.f25608b).X) {
                    ((qi.h) this.f25608b).X = false;
                    ((qi.h) this.f25608b).f46725j.b("camera switch first preview frame");
                    qi.p0 p0Var = (qi.p0) ((qi.h) this.f25608b).f46727k.f14466b;
                    Handler handler = p0Var.f46859j;
                    n4.l lVar = p0Var.d;
                    Objects.requireNonNull(lVar);
                    handler.post(new org.telegram.ui.web.t0(lVar, 22));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                qi.h hVar = (qi.h) this.f25608b;
                if (hVar.f46726j0 == 0) {
                    hVar.f46726j0 = elapsedRealtimeNanos;
                    qi.l lVar2 = hVar.f46725j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((qi.h) this.f25608b).f46713c.getWidth());
                    sb2.append("x");
                    sb2.append(((qi.h) this.f25608b).f46713c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((qi.h) this.f25608b).f46738q);
                    sb2.append(", attached=");
                    sb2.append(((qi.h) this.f25608b).f46713c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((qi.h) this.f25608b).f46713c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((qi.h) this.f25608b).f46713c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((qi.h) this.f25608b).f46713c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((qi.h) this.f25608b).f46713c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((qi.h) this.f25608b).f46713c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    lVar2.b(sb2.toString());
                }
                qi.h hVar2 = (qi.h) this.f25608b;
                long j11 = hVar2.f46730l0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    hVar2.f46733n0++;
                    hVar2.f46735o0 += j12;
                    j3 = 0;
                    double d = j12;
                    hVar2.f46737p0 = (d * d) + hVar2.f46737p0;
                    long j13 = hVar2.f46739q0;
                    if (j13 == 0 || j12 < j13) {
                        hVar2.f46739q0 = j12;
                    }
                    hVar2.f46741r0 = Math.max(hVar2.f46741r0, j12);
                    if (j12 > 50000000) {
                        hVar2.f46743s0++;
                    }
                    if (j12 > 100000000) {
                        hVar2.f46745t0++;
                    }
                } else {
                    j3 = 0;
                }
                qi.h hVar3 = (qi.h) this.f25608b;
                hVar3.f46730l0 = elapsedRealtimeNanos;
                long j14 = hVar3.m0;
                if (timestamp > j14) {
                    if (hVar3.f46748v0 == j3) {
                        hVar3.f46748v0 = timestamp;
                    }
                    hVar3.f46750w0 = timestamp;
                    hVar3.f46747u0++;
                } else if (j14 != j3) {
                    hVar3.f46752x0++;
                }
                hVar3.m0 = timestamp;
                hVar3.f46728k0++;
                if (elapsedRealtimeNanos - hVar3.f46726j0 >= 5000000000L) {
                    TextureView textureView = hVar3.f46713c;
                    long j15 = hVar3.f46750w0 - hVar3.f46748v0;
                    if (j15 > j3) {
                        long j16 = hVar3.f46747u0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            hVar3.f46725j.b("preview frame delivery: callbackFps=" + ((((float) hVar3.f46728k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + qi.h.c(hVar3.f46735o0, hVar3.f46733n0) + ", min=" + (((float) hVar3.f46739q0) / 1000000.0f) + ", max=" + (((float) hVar3.f46741r0) / 1000000.0f) + ", jitter=" + qi.h.B(hVar3.f46737p0, hVar3.f46735o0, hVar3.f46733n0) + "}, gaps={over50ms=" + hVar3.f46743s0 + ", over100ms=" + hVar3.f46745t0 + "}, nonMonotonicTimestamps=" + hVar3.f46752x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            hVar3.v();
                            hVar3.f46726j0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    hVar3.f46725j.b("preview frame delivery: callbackFps=" + ((((float) hVar3.f46728k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + qi.h.c(hVar3.f46735o0, hVar3.f46733n0) + ", min=" + (((float) hVar3.f46739q0) / 1000000.0f) + ", max=" + (((float) hVar3.f46741r0) / 1000000.0f) + ", jitter=" + qi.h.B(hVar3.f46737p0, hVar3.f46735o0, hVar3.f46733n0) + "}, gaps={over50ms=" + hVar3.f46743s0 + ", over100ms=" + hVar3.f46745t0 + "}, nonMonotonicTimestamps=" + hVar3.f46752x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    hVar3.v();
                    hVar3.f46726j0 = elapsedRealtimeNanos;
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
