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
public final class k50 implements TextureView.SurfaceTextureListener {
    public final int f25516a;
    public final Object f25517b;

    public k50(Object obj, int i10) {
        this.f25516a = i10;
        this.f25517b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f25516a) {
            case 0:
                x50 x50Var = (x50) this.f25517b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (x50Var.f29901h0 == null && surfaceTexture != null && !x50Var.f29900g0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    x50Var.f29901h0 = new o50(x50Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final w01 w01Var = (w01) this.f25517b;
                ArrayList arrayList = w01Var.f29457c;
                u01 u01Var = w01Var.f29455a;
                if (u01Var != null) {
                    u01Var.i();
                    w01Var.f29455a = null;
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
                                    w01Var2.e = true;
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
                                    w01Var2.e = true;
                                    w01Var2.d = null;
                                    w01.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                w01Var.f29455a = u01Var2;
                u01Var2.f28356a = EmuDetector.with(w01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        v01 v01Var = (v01) arrayList.get(i12);
                        Bitmap bitmap = v01Var.e;
                        if (bitmap != null) {
                            w01Var.f29455a.c(v01Var.f28613f, bitmap, v01Var.f28612c, v01Var.d);
                        } else {
                            ArrayList arrayList2 = v01Var.f28611b;
                            if (arrayList2 != null) {
                                w01Var.f29455a.f(arrayList2, v01Var.d);
                            } else {
                                w01Var.f29455a.e(v01Var.f28610a, v01Var.f28614g, v01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(w01Var.f29456b);
                    return;
                }
                return;
            case 3:
                return;
            default:
                vh.g gVar = (vh.g) this.f25517b;
                if (gVar.f44347f == null) {
                    vh.f fVar = new vh.f(gVar, surfaceTexture, i10, i11, new vh.d(gVar, 1));
                    gVar.f44347f = fVar;
                    fVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f25516a) {
            case 0:
                x50 x50Var = (x50) this.f25517b;
                Camera2Session[] camera2SessionArr = x50Var.f29910q0;
                o50 o50Var = x50Var.f29901h0;
                if (o50Var != null) {
                    o50Var.b(0L, 0, true, 0, 0);
                    x50Var.f29901h0 = null;
                }
                if (x50Var.f29907n0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (x50Var.f29908o0 != null) {
                    CameraController.getInstance().close(x50Var.f29908o0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((eg0) this.f25517b).V.f31070w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                w01 w01Var = (w01) this.f25517b;
                u01 u01Var = w01Var.f29455a;
                if (u01Var != null) {
                    u01Var.i();
                    w01Var.f29455a = null;
                }
                Runnable runnable = w01Var.d;
                if (runnable != null) {
                    w01Var.d = null;
                    w01.b(runnable);
                    return false;
                }
                return false;
            case 3:
                b91 b91Var = (b91) this.f25517b;
                TextureView textureView = b91Var.d;
                if (b91Var.S) {
                    if (b91Var.W) {
                        b91Var.f22635r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    b91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.f fVar = ((vh.g) this.f25517b).f44347f;
                if (fVar != null) {
                    fVar.f44333a = false;
                    ((vh.g) this.f25517b).f44347f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f25516a) {
            case 0:
                o50 o50Var = ((x50) this.f25517b).f29901h0;
                if (o50Var != null) {
                    o50Var.F = i10;
                    o50Var.G = i11;
                    o50Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                u01 u01Var = ((w01) this.f25517b).f29455a;
                if (u01Var != null && (handler = u01Var.getHandler()) != null && u01Var.f28357b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            default:
                vh.f fVar = ((vh.g) this.f25517b).f44347f;
                if (fVar != null) {
                    synchronized (fVar.e) {
                        fVar.f44336f = true;
                        fVar.h = i10;
                        fVar.f44337n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f25516a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                b91 b91Var = (b91) this.f25517b;
                if (b91Var.f22635r == 1) {
                    b91Var.f22634n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ga(this, 4));
                    b91Var.f22634n.invalidate();
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
