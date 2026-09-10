package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Choreographer;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
public final class t50 implements TextureView.SurfaceTextureListener {
    public final int f27334a;
    public final Object f27335b;

    public t50(Object obj, int i10) {
        this.f27334a = i10;
        this.f27335b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f27334a) {
            case 0:
                f60 f60Var = (f60) this.f27335b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (f60Var.f22886h0 == null && surfaceTexture != null && !f60Var.f22885g0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    f60Var.f22886h0 = new x50(f60Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final k11 k11Var = (k11) this.f27335b;
                ArrayList arrayList = k11Var.f24564c;
                i11 i11Var = k11Var.f24562a;
                if (i11Var != null) {
                    i11Var.i();
                    k11Var.f24562a = null;
                }
                i11 i11Var2 = new i11(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                k11Var.invalidate();
                                return;
                            default:
                                k11 k11Var2 = k11Var;
                                Runnable runnable = k11Var2.d;
                                if (runnable != null) {
                                    k11Var2.e = true;
                                    k11Var2.d = null;
                                    k11.b(runnable);
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
                                k11Var.invalidate();
                                return;
                            default:
                                k11 k11Var2 = k11Var;
                                Runnable runnable = k11Var2.d;
                                if (runnable != null) {
                                    k11Var2.e = true;
                                    k11Var2.d = null;
                                    k11.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                k11Var.f24562a = i11Var2;
                i11Var2.f23861a = EmuDetector.with(k11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j11 j11Var = (j11) arrayList.get(i12);
                        Bitmap bitmap = j11Var.e;
                        if (bitmap != null) {
                            k11Var.f24562a.c(j11Var.f24188f, bitmap, j11Var.f24187c, j11Var.d);
                        } else {
                            ArrayList arrayList2 = j11Var.f24186b;
                            if (arrayList2 != null) {
                                k11Var.f24562a.f(arrayList2, j11Var.d);
                            } else {
                                k11Var.f24562a.e(j11Var.f24185a, j11Var.f24189g, j11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(k11Var.f24563b);
                    return;
                }
                return;
            case 3:
                return;
            default:
                uh.g gVar = (uh.g) this.f27335b;
                if (gVar.f42765f == null) {
                    uh.f fVar = new uh.f(gVar, surfaceTexture, i10, i11, new uh.d(gVar, 1));
                    gVar.f42765f = fVar;
                    fVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f27334a) {
            case 0:
                f60 f60Var = (f60) this.f27335b;
                Camera2Session[] camera2SessionArr = f60Var.f22895q0;
                x50 x50Var = f60Var.f22886h0;
                if (x50Var != null) {
                    x50Var.b(0L, 0, true, 0, 0);
                    f60Var.f22886h0 = null;
                }
                if (f60Var.f22892n0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (f60Var.f22893o0 != null) {
                    CameraController.getInstance().close(f60Var.f22893o0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((og0) this.f27335b).V.f30211w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                k11 k11Var = (k11) this.f27335b;
                i11 i11Var = k11Var.f24562a;
                if (i11Var != null) {
                    i11Var.i();
                    k11Var.f24562a = null;
                }
                Runnable runnable = k11Var.d;
                if (runnable != null) {
                    k11Var.d = null;
                    k11.b(runnable);
                    return false;
                }
                return false;
            case 3:
                o91 o91Var = (o91) this.f27335b;
                TextureView textureView = o91Var.d;
                if (o91Var.S) {
                    if (o91Var.W) {
                        o91Var.f25731r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    o91Var.S = false;
                    return false;
                }
                return true;
            default:
                uh.f fVar = ((uh.g) this.f27335b).f42765f;
                if (fVar != null) {
                    fVar.f42751a = false;
                    ((uh.g) this.f27335b).f42765f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f27334a) {
            case 0:
                x50 x50Var = ((f60) this.f27335b).f22886h0;
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
                i11 i11Var = ((k11) this.f27335b).f24562a;
                if (i11Var != null && (handler = i11Var.getHandler()) != null && i11Var.f23862b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            default:
                uh.f fVar = ((uh.g) this.f27335b).f42765f;
                if (fVar != null) {
                    synchronized (fVar.e) {
                        fVar.f42754f = true;
                        fVar.h = i10;
                        fVar.f42755n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f27334a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                o91 o91Var = (o91) this.f27335b;
                if (o91Var.f25731r == 1) {
                    o91Var.f25730n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 4));
                    o91Var.f25730n.invalidate();
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
