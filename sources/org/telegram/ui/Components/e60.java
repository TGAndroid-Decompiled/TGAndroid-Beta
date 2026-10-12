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
    public final int f25612a;
    public final Object f25613b;

    public e60(Object obj, int i10) {
        this.f25612a = i10;
        this.f25613b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f25612a) {
            case 0:
                w60 w60Var = (w60) this.f25613b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (w60Var.m0 == null && surfaceTexture != null && !w60Var.f32296l0) {
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
                final i21 i21Var = (i21) this.f25613b;
                ArrayList arrayList = i21Var.f27008c;
                g21 g21Var = i21Var.f27006a;
                if (g21Var != null) {
                    g21Var.i();
                    i21Var.f27006a = null;
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
                                    i21Var2.f27009e = true;
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
                                    i21Var2.f27009e = true;
                                    i21Var2.d = null;
                                    i21.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                i21Var.f27006a = g21Var2;
                g21Var2.f26229a = EmuDetector.with(i21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        h21 h21Var = (h21) arrayList.get(i12);
                        Bitmap bitmap = h21Var.f26622e;
                        if (bitmap != null) {
                            i21Var.f27006a.c(h21Var.f26623f, bitmap, h21Var.f26621c, h21Var.d);
                        } else {
                            ArrayList arrayList2 = h21Var.f26620b;
                            if (arrayList2 != null) {
                                i21Var.f27006a.f(arrayList2, h21Var.d);
                            } else {
                                i21Var.f27006a.e(h21Var.f26619a, h21Var.f26624g, h21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(i21Var.f27007b);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                qi.h hVar = (qi.h) this.f25613b;
                qi.l lVar = hVar.f46733j;
                lVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = hVar.f46740n;
                if (hVar.S && handler != null && hVar.f46721c.isAvailable()) {
                    handler.post(new qi.a(hVar, 6));
                    return;
                }
                return;
            default:
                vh.f fVar = (vh.f) this.f25613b;
                if (fVar.f49909f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f49909f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f25612a) {
            case 0:
                w60 w60Var = (w60) this.f25613b;
                Camera2Session[] camera2SessionArr = w60Var.f32308v0;
                i60 i60Var = w60Var.m0;
                if (i60Var != null) {
                    i60Var.b(0L, 0, true, 0, 0);
                    w60Var.m0 = null;
                }
                if (w60Var.f32305s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (w60Var.f32306t0 != null) {
                    CameraController.getInstance().close(w60Var.f32306t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((jh0) this.f25613b).V.f33905w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                i21 i21Var = (i21) this.f25613b;
                g21 g21Var = i21Var.f27006a;
                if (g21Var != null) {
                    g21Var.i();
                    i21Var.f27006a = null;
                }
                Runnable runnable = i21Var.d;
                if (runnable != null) {
                    i21Var.d = null;
                    i21.b(runnable);
                    return false;
                }
                return false;
            case 3:
                ma1 ma1Var = (ma1) this.f25613b;
                TextureView textureView = ma1Var.d;
                if (ma1Var.S) {
                    if (ma1Var.W) {
                        ma1Var.f28515r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    ma1Var.S = false;
                    return false;
                }
                return true;
            case 4:
                ((qi.h) this.f25613b).f46733j.b("preview surface destroyed: active=" + ((qi.h) this.f25613b).S);
                if (((qi.h) this.f25613b).S) {
                    ((qi.h) this.f25613b).t(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                vh.e eVar = ((vh.f) this.f25613b).f49909f;
                if (eVar != null) {
                    eVar.f49893a = false;
                    ((vh.f) this.f25613b).f49909f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f25612a) {
            case 0:
                i60 i60Var = ((w60) this.f25613b).m0;
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
                g21 g21Var = ((i21) this.f25613b).f27006a;
                if (g21Var != null && (handler = g21Var.getHandler()) != null && g21Var.f26230b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                qi.h hVar = (qi.h) this.f25613b;
                qi.l lVar = hVar.f46733j;
                lVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                hVar.G();
                return;
            default:
                vh.e eVar = ((vh.f) this.f25613b).f49909f;
                if (eVar != null) {
                    synchronized (eVar.f49896e) {
                        eVar.f49897f = true;
                        eVar.h = i10;
                        eVar.f49898n = i11;
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
        switch (this.f25612a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                ma1 ma1Var = (ma1) this.f25613b;
                if (ma1Var.f28515r == 1) {
                    ma1Var.f28514n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 4));
                    ma1Var.f28514n.invalidate();
                    return;
                }
                return;
            case 4:
                if (((qi.h) this.f25613b).X) {
                    ((qi.h) this.f25613b).X = false;
                    ((qi.h) this.f25613b).f46733j.b("camera switch first preview frame");
                    qi.p0 p0Var = (qi.p0) ((qi.h) this.f25613b).f46735k.f14467b;
                    Handler handler = p0Var.f46867j;
                    n4.l lVar = p0Var.d;
                    Objects.requireNonNull(lVar);
                    handler.post(new org.telegram.ui.web.t0(lVar, 22));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                qi.h hVar = (qi.h) this.f25613b;
                if (hVar.f46734j0 == 0) {
                    hVar.f46734j0 = elapsedRealtimeNanos;
                    qi.l lVar2 = hVar.f46733j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((qi.h) this.f25613b).f46721c.getWidth());
                    sb2.append("x");
                    sb2.append(((qi.h) this.f25613b).f46721c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((qi.h) this.f25613b).f46746q);
                    sb2.append(", attached=");
                    sb2.append(((qi.h) this.f25613b).f46721c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((qi.h) this.f25613b).f46721c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((qi.h) this.f25613b).f46721c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((qi.h) this.f25613b).f46721c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    if (((qi.h) this.f25613b).f46721c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((qi.h) this.f25613b).f46721c.getDisplay().getRefreshRate());
                    }
                    sb2.append(valueOf);
                    lVar2.b(sb2.toString());
                }
                qi.h hVar2 = (qi.h) this.f25613b;
                long j11 = hVar2.f46738l0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    hVar2.f46741n0++;
                    hVar2.f46743o0 += j12;
                    j3 = 0;
                    double d = j12;
                    hVar2.f46745p0 = (d * d) + hVar2.f46745p0;
                    long j13 = hVar2.f46747q0;
                    if (j13 == 0 || j12 < j13) {
                        hVar2.f46747q0 = j12;
                    }
                    hVar2.f46749r0 = Math.max(hVar2.f46749r0, j12);
                    if (j12 > 50000000) {
                        hVar2.f46751s0++;
                    }
                    if (j12 > 100000000) {
                        hVar2.f46753t0++;
                    }
                } else {
                    j3 = 0;
                }
                qi.h hVar3 = (qi.h) this.f25613b;
                hVar3.f46738l0 = elapsedRealtimeNanos;
                long j14 = hVar3.m0;
                if (timestamp > j14) {
                    if (hVar3.f46756v0 == j3) {
                        hVar3.f46756v0 = timestamp;
                    }
                    hVar3.f46758w0 = timestamp;
                    hVar3.f46755u0++;
                } else if (j14 != j3) {
                    hVar3.f46760x0++;
                }
                hVar3.m0 = timestamp;
                hVar3.f46736k0++;
                if (elapsedRealtimeNanos - hVar3.f46734j0 >= 5000000000L) {
                    TextureView textureView = hVar3.f46721c;
                    long j15 = hVar3.f46758w0 - hVar3.f46756v0;
                    if (j15 > j3) {
                        long j16 = hVar3.f46755u0;
                        if (j16 > 1) {
                            f7 = (((float) (j16 - 1)) * 1.0E9f) / ((float) j15);
                            hVar3.f46733j.b("preview frame delivery: callbackFps=" + ((((float) hVar3.f46736k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + qi.h.c(hVar3.f46743o0, hVar3.f46741n0) + ", min=" + (((float) hVar3.f46747q0) / 1000000.0f) + ", max=" + (((float) hVar3.f46749r0) / 1000000.0f) + ", jitter=" + qi.h.B(hVar3.f46745p0, hVar3.f46743o0, hVar3.f46741n0) + "}, gaps={over50ms=" + hVar3.f46751s0 + ", over100ms=" + hVar3.f46753t0 + "}, nonMonotonicTimestamps=" + hVar3.f46760x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            hVar3.v();
                            hVar3.f46734j0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    hVar3.f46733j.b("preview frame delivery: callbackFps=" + ((((float) hVar3.f46736k0) * 1.0E9f) / ((float) j10)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + qi.h.c(hVar3.f46743o0, hVar3.f46741n0) + ", min=" + (((float) hVar3.f46747q0) / 1000000.0f) + ", max=" + (((float) hVar3.f46749r0) / 1000000.0f) + ", jitter=" + qi.h.B(hVar3.f46745p0, hVar3.f46743o0, hVar3.f46741n0) + "}, gaps={over50ms=" + hVar3.f46751s0 + ", over100ms=" + hVar3.f46753t0 + "}, nonMonotonicTimestamps=" + hVar3.f46760x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    hVar3.v();
                    hVar3.f46734j0 = elapsedRealtimeNanos;
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
