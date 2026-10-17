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
public final class t50 implements TextureView.SurfaceTextureListener {
    public final int f30468a;
    public final Object f30469b;

    public t50(Object obj, int i10) {
        this.f30468a = i10;
        this.f30469b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f30468a) {
            case 0:
                m60 m60Var = (m60) this.f30469b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (m60Var.m0 == null && surfaceTexture != null && !m60Var.f28433l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    m60Var.m0 = new x50(m60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final t11 t11Var = (t11) this.f30469b;
                ArrayList arrayList = t11Var.f30432c;
                r11 r11Var = t11Var.f30430a;
                if (r11Var != null) {
                    r11Var.i();
                    t11Var.f30430a = null;
                }
                r11 r11Var2 = new r11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                t11Var.invalidate();
                                return;
                            default:
                                t11 t11Var2 = t11Var;
                                Runnable runnable = t11Var2.d;
                                if (runnable != null) {
                                    t11Var2.e = true;
                                    t11Var2.d = null;
                                    t11.b(runnable);
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
                                t11Var.invalidate();
                                return;
                            default:
                                t11 t11Var2 = t11Var;
                                Runnable runnable = t11Var2.d;
                                if (runnable != null) {
                                    t11Var2.e = true;
                                    t11Var2.d = null;
                                    t11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                t11Var.f30430a = r11Var2;
                r11Var2.f29790a = EmuDetector.with(t11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        s11 s11Var = (s11) arrayList.get(i12);
                        Bitmap bitmap = s11Var.e;
                        if (bitmap != null) {
                            t11Var.f30430a.c(s11Var.f30143f, bitmap, s11Var.f30142c, s11Var.d);
                        } else {
                            ArrayList arrayList2 = s11Var.f30141b;
                            if (arrayList2 != null) {
                                t11Var.f30430a.f(arrayList2, s11Var.d);
                            } else {
                                t11Var.f30430a.d(s11Var.f30140a, s11Var.f30144g, s11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(t11Var.f30431b);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                si.k kVar = (si.k) this.f30469b;
                si.o oVar = kVar.f46673j;
                oVar.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = kVar.f46683n;
                if (kVar.V && handler != null && kVar.f46655c.isAvailable()) {
                    handler.post(new si.b(kVar, 7));
                    return;
                }
                return;
            default:
                wh.f fVar = (wh.f) this.f30469b;
                if (fVar.f49061f == null) {
                    wh.e eVar = new wh.e(fVar, surfaceTexture, i10, i11, new wh.d(fVar, 1));
                    fVar.f49061f = eVar;
                    eVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f30468a) {
            case 0:
                m60 m60Var = (m60) this.f30469b;
                Camera2Session[] camera2SessionArr = m60Var.f28445v0;
                x50 x50Var = m60Var.m0;
                if (x50Var != null) {
                    x50Var.b(0L, 0, true, 0, 0);
                    m60Var.m0 = null;
                }
                if (m60Var.f28442s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (m60Var.f28443t0 != null) {
                    CameraController.getInstance().close(m60Var.f28443t0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((zg0) this.f30469b).V.f33429w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                t11 t11Var = (t11) this.f30469b;
                r11 r11Var = t11Var.f30430a;
                if (r11Var != null) {
                    r11Var.i();
                    t11Var.f30430a = null;
                }
                Runnable runnable = t11Var.d;
                if (runnable != null) {
                    t11Var.d = null;
                    t11.b(runnable);
                    return false;
                }
                return false;
            case 3:
                u91 u91Var = (u91) this.f30469b;
                TextureView textureView = u91Var.d;
                if (u91Var.S) {
                    if (u91Var.W) {
                        u91Var.f30942r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    u91Var.S = false;
                    return false;
                }
                return true;
            case 4:
                ((si.k) this.f30469b).f46673j.b("preview surface destroyed: active=" + ((si.k) this.f30469b).V);
                if (((si.k) this.f30469b).V) {
                    ((si.k) this.f30469b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    return true;
                }
                return true;
            default:
                wh.e eVar = ((wh.f) this.f30469b).f49061f;
                if (eVar != null) {
                    eVar.f49047a = false;
                    ((wh.f) this.f30469b).f49061f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f30468a) {
            case 0:
                x50 x50Var = ((m60) this.f30469b).m0;
                if (x50Var != null) {
                    x50Var.F = i10;
                    x50Var.G = i11;
                    x50Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                r11 r11Var = ((t11) this.f30469b).f30430a;
                if (r11Var != null && (handler = r11Var.getHandler()) != null && r11Var.f29791b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                si.k kVar = (si.k) this.f30469b;
                si.o oVar = kVar.f46673j;
                oVar.b("preview surface size changed: view=" + i10 + "x" + i11);
                kVar.d0();
                return;
            default:
                wh.e eVar = ((wh.f) this.f30469b).f49061f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f49050f = true;
                        eVar.h = i10;
                        eVar.f49051n = i11;
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
        float f7;
        Object valueOf;
        String str;
        switch (this.f30468a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                u91 u91Var = (u91) this.f30469b;
                if (u91Var.f30942r == 1) {
                    u91Var.f30941n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 4));
                    u91Var.f30941n.invalidate();
                    return;
                }
                return;
            case 4:
                if (((si.k) this.f30469b).f46650a0) {
                    ((si.k) this.f30469b).f46650a0 = false;
                    si.o oVar = ((si.k) this.f30469b).f46673j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    si.k kVar = (si.k) this.f30469b;
                    if (kVar.m0) {
                        str = "DUAL_ACTIVE";
                    } else if (kVar.D0) {
                        str = "WARM_DEVICE";
                    } else {
                        str = "SEQUENTIAL";
                    }
                    sb2.append(str);
                    sb2.append(", totalElapsedMs=");
                    sb2.append(si.k.z(((si.k) this.f30469b).H0));
                    oVar.b(sb2.toString());
                    si.t0 t0Var = (si.t0) ((si.k) this.f30469b).f46676k.f15837b;
                    Handler handler = t0Var.f46791i;
                    l2.f fVar = t0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new org.telegram.ui.web.z1(fVar, 27));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                si.k kVar2 = (si.k) this.f30469b;
                if (kVar2.I0 == 0) {
                    kVar2.I0 = elapsedRealtimeNanos;
                    si.o oVar2 = kVar2.f46673j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((si.k) this.f30469b).f46655c.getWidth());
                    sb3.append("x");
                    sb3.append(((si.k) this.f30469b).f46655c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((si.k) this.f30469b).f46692q);
                    sb3.append(", attached=");
                    sb3.append(((si.k) this.f30469b).f46655c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((si.k) this.f30469b).f46655c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((si.k) this.f30469b).f46655c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((si.k) this.f30469b).f46655c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    if (((si.k) this.f30469b).f46655c.getDisplay() == null) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Float.valueOf(((si.k) this.f30469b).f46655c.getDisplay().getRefreshRate());
                    }
                    sb3.append(valueOf);
                    oVar2.b(sb3.toString());
                }
                si.k kVar3 = (si.k) this.f30469b;
                long j12 = kVar3.K0;
                if (j12 != 0) {
                    long j13 = elapsedRealtimeNanos - j12;
                    kVar3.M0++;
                    kVar3.N0 += j13;
                    j10 = 0;
                    double d = j13;
                    kVar3.O0 = (d * d) + kVar3.O0;
                    long j14 = kVar3.P0;
                    if (j14 == 0 || j13 < j14) {
                        kVar3.P0 = j13;
                    }
                    kVar3.Q0 = Math.max(kVar3.Q0, j13);
                    if (j13 > 50000000) {
                        kVar3.R0++;
                    }
                    if (j13 > 100000000) {
                        kVar3.S0++;
                    }
                } else {
                    j10 = 0;
                }
                si.k kVar4 = (si.k) this.f30469b;
                kVar4.K0 = elapsedRealtimeNanos;
                long j15 = kVar4.L0;
                if (timestamp > j15) {
                    if (kVar4.U0 == j10) {
                        kVar4.U0 = timestamp;
                    }
                    kVar4.V0 = timestamp;
                    kVar4.T0++;
                } else if (j15 != j10) {
                    kVar4.W0++;
                }
                kVar4.L0 = timestamp;
                kVar4.J0++;
                if (elapsedRealtimeNanos - kVar4.I0 >= 5000000000L) {
                    TextureView textureView = kVar4.f46655c;
                    long j16 = kVar4.V0 - kVar4.U0;
                    if (j16 > j10) {
                        long j17 = kVar4.T0;
                        if (j17 > 1) {
                            f7 = (((float) (j17 - 1)) * 1.0E9f) / ((float) j16);
                            kVar4.f46673j.b("preview frame delivery: callbackFps=" + ((((float) kVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + si.k.j(kVar4.N0, kVar4.M0) + ", min=" + (((float) kVar4.P0) / 1000000.0f) + ", max=" + (((float) kVar4.Q0) / 1000000.0f) + ", jitter=" + si.k.W(kVar4.O0, kVar4.N0, kVar4.M0) + "}, gaps={over50ms=" + kVar4.R0 + ", over100ms=" + kVar4.S0 + "}, nonMonotonicTimestamps=" + kVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            kVar4.P();
                            kVar4.I0 = elapsedRealtimeNanos;
                            return;
                        }
                    }
                    f7 = 0.0f;
                    kVar4.f46673j.b("preview frame delivery: callbackFps=" + ((((float) kVar4.J0) * 1.0E9f) / ((float) j11)) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + si.k.j(kVar4.N0, kVar4.M0) + ", min=" + (((float) kVar4.P0) / 1000000.0f) + ", max=" + (((float) kVar4.Q0) / 1000000.0f) + ", jitter=" + si.k.W(kVar4.O0, kVar4.N0, kVar4.M0) + "}, gaps={over50ms=" + kVar4.R0 + ", over100ms=" + kVar4.S0 + "}, nonMonotonicTimestamps=" + kVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    kVar4.P();
                    kVar4.I0 = elapsedRealtimeNanos;
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
