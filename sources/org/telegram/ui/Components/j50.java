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
    public final int f25119a;
    public final Object f25120b;

    public j50(Object obj, int i10) {
        this.f25119a = i10;
        this.f25120b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f25119a) {
            case 0:
                w50 w50Var = (w50) this.f25120b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (w50Var.f29545h0 == null && surfaceTexture != null && !w50Var.f29544g0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    w50Var.f29545h0 = new n50(w50Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final y01 y01Var = (y01) this.f25120b;
                ArrayList arrayList = y01Var.f30072c;
                w01 w01Var = y01Var.f30070a;
                if (w01Var != null) {
                    w01Var.i();
                    y01Var.f30070a = null;
                }
                w01 w01Var2 = new w01(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                y01Var.invalidate();
                                return;
                            default:
                                y01 y01Var2 = y01Var;
                                Runnable runnable = y01Var2.d;
                                if (runnable != null) {
                                    y01Var2.e = true;
                                    y01Var2.d = null;
                                    y01.b(runnable);
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
                                y01Var.invalidate();
                                return;
                            default:
                                y01 y01Var2 = y01Var;
                                Runnable runnable = y01Var2.d;
                                if (runnable != null) {
                                    y01Var2.e = true;
                                    y01Var2.d = null;
                                    y01.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                y01Var.f30070a = w01Var2;
                w01Var2.f29459a = EmuDetector.with(y01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        x01 x01Var = (x01) arrayList.get(i12);
                        Bitmap bitmap = x01Var.e;
                        if (bitmap != null) {
                            y01Var.f30070a.c(x01Var.f29805f, bitmap, x01Var.f29804c, x01Var.d);
                        } else {
                            ArrayList arrayList2 = x01Var.f29803b;
                            if (arrayList2 != null) {
                                y01Var.f30070a.f(arrayList2, x01Var.d);
                            } else {
                                y01Var.f30070a.e(x01Var.f29802a, x01Var.f29806g, x01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(y01Var.f30071b);
                    return;
                }
                return;
            case 3:
                return;
            default:
                vh.g gVar = (vh.g) this.f25120b;
                if (gVar.f44425f == null) {
                    vh.f fVar = new vh.f(gVar, surfaceTexture, i10, i11, new vh.d(gVar, 1));
                    gVar.f44425f = fVar;
                    fVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f25119a) {
            case 0:
                w50 w50Var = (w50) this.f25120b;
                Camera2Session[] camera2SessionArr = w50Var.f29554q0;
                n50 n50Var = w50Var.f29545h0;
                if (n50Var != null) {
                    n50Var.b(0L, 0, true, 0, 0);
                    w50Var.f29545h0 = null;
                }
                if (w50Var.f29551n0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (w50Var.f29552o0 != null) {
                    CameraController.getInstance().close(w50Var.f29552o0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((fg0) this.f25120b).V.f31116w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                y01 y01Var = (y01) this.f25120b;
                w01 w01Var = y01Var.f30070a;
                if (w01Var != null) {
                    w01Var.i();
                    y01Var.f30070a = null;
                }
                Runnable runnable = y01Var.d;
                if (runnable != null) {
                    y01Var.d = null;
                    y01.b(runnable);
                    return false;
                }
                return false;
            case 3:
                d91 d91Var = (d91) this.f25120b;
                TextureView textureView = d91Var.d;
                if (d91Var.S) {
                    if (d91Var.W) {
                        d91Var.f23283r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    d91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.f fVar = ((vh.g) this.f25120b).f44425f;
                if (fVar != null) {
                    fVar.f44411a = false;
                    ((vh.g) this.f25120b).f44425f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f25119a) {
            case 0:
                n50 n50Var = ((w50) this.f25120b).f29545h0;
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
                w01 w01Var = ((y01) this.f25120b).f30070a;
                if (w01Var != null && (handler = w01Var.getHandler()) != null && w01Var.f29460b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            default:
                vh.f fVar = ((vh.g) this.f25120b).f44425f;
                if (fVar != null) {
                    synchronized (fVar.e) {
                        fVar.f44414f = true;
                        fVar.h = i10;
                        fVar.f44415n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f25119a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                d91 d91Var = (d91) this.f25120b;
                if (d91Var.f23283r == 1) {
                    d91Var.f23282n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 4));
                    d91Var.f23282n.invalidate();
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
