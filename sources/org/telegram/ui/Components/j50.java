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
public final class j50 implements TextureView.SurfaceTextureListener {
    public final int f27381a;
    public final Object f27382b;

    public j50(Object obj, int i10) {
        this.f27381a = i10;
        this.f27382b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f27381a) {
            case 0:
                w50 w50Var = (w50) this.f27382b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (w50Var.f32165h0 == null && surfaceTexture != null && !w50Var.f32164g0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    w50Var.f32165h0 = new n50(w50Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final w01 w01Var = (w01) this.f27382b;
                ArrayList arrayList = w01Var.f32081c;
                u01 u01Var = w01Var.f32079a;
                if (u01Var != null) {
                    u01Var.i();
                    w01Var.f32079a = null;
                }
                u01 u01Var2 = new u01(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                w01Var.invalidate();
                                return;
                            default:
                                w01 w01Var2 = w01Var;
                                Runnable runnable = w01Var2.d;
                                if (runnable != null) {
                                    w01Var2.f32082e = true;
                                    w01Var2.d = null;
                                    w01.b(runnable);
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
                                w01Var.invalidate();
                                return;
                            default:
                                w01 w01Var2 = w01Var;
                                Runnable runnable = w01Var2.d;
                                if (runnable != null) {
                                    w01Var2.f32082e = true;
                                    w01Var2.d = null;
                                    w01.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                w01Var.f32079a = u01Var2;
                u01Var2.f30781a = EmuDetector.with(w01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        v01 v01Var = (v01) arrayList.get(i12);
                        Bitmap bitmap = v01Var.f31062e;
                        if (bitmap != null) {
                            w01Var.f32079a.c(v01Var.f31063f, bitmap, v01Var.f31061c, v01Var.d);
                        } else {
                            ArrayList arrayList2 = v01Var.f31060b;
                            if (arrayList2 != null) {
                                w01Var.f32079a.f(arrayList2, v01Var.d);
                            } else {
                                w01Var.f32079a.e(v01Var.f31059a, v01Var.f31064g, v01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(w01Var.f32080b);
                    return;
                }
                return;
            case 3:
                return;
            default:
                wh.g gVar = (wh.g) this.f27382b;
                if (gVar.f48635f == null) {
                    wh.f fVar = new wh.f(gVar, surfaceTexture, i10, i11, new wh.d(gVar, 1));
                    gVar.f48635f = fVar;
                    fVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f27381a) {
            case 0:
                w50 w50Var = (w50) this.f27382b;
                Camera2Session[] camera2SessionArr = w50Var.f32174q0;
                n50 n50Var = w50Var.f32165h0;
                if (n50Var != null) {
                    n50Var.b(0L, 0, true, 0, 0);
                    w50Var.f32165h0 = null;
                }
                if (w50Var.f32171n0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (w50Var.f32172o0 != null) {
                    CameraController.getInstance().close(w50Var.f32172o0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((eg0) this.f27382b).V.f33738w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                w01 w01Var = (w01) this.f27382b;
                u01 u01Var = w01Var.f32079a;
                if (u01Var != null) {
                    u01Var.i();
                    w01Var.f32079a = null;
                }
                Runnable runnable = w01Var.d;
                if (runnable != null) {
                    w01Var.d = null;
                    w01.b(runnable);
                    return false;
                }
                return false;
            case 3:
                b91 b91Var = (b91) this.f27382b;
                TextureView textureView = b91Var.d;
                if (b91Var.S) {
                    if (b91Var.W) {
                        b91Var.f24662r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    b91Var.S = false;
                    return false;
                }
                return true;
            default:
                wh.f fVar = ((wh.g) this.f27382b).f48635f;
                if (fVar != null) {
                    fVar.f48619a = false;
                    ((wh.g) this.f27382b).f48635f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f27381a) {
            case 0:
                n50 n50Var = ((w50) this.f27382b).f32165h0;
                if (n50Var != null) {
                    n50Var.F = i10;
                    n50Var.G = i11;
                    n50Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                u01 u01Var = ((w01) this.f27382b).f32079a;
                if (u01Var != null && (handler = u01Var.getHandler()) != null && u01Var.f30782b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            default:
                wh.f fVar = ((wh.g) this.f27382b).f48635f;
                if (fVar != null) {
                    synchronized (fVar.f48622e) {
                        fVar.f48623f = true;
                        fVar.h = i10;
                        fVar.f48624n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f27381a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                b91 b91Var = (b91) this.f27382b;
                if (b91Var.f24662r == 1) {
                    b91Var.f24661n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 4));
                    b91Var.f24661n.invalidate();
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
