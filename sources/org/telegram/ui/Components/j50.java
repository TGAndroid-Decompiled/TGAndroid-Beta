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
    public final int f25231a;
    public final Object f25232b;

    public j50(Object obj, int i10) {
        this.f25231a = i10;
        this.f25232b = obj;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f25231a) {
            case 0:
                w50 w50Var = (w50) this.f25232b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (w50Var.f29584h0 == null && surfaceTexture != null && !w50Var.f29583g0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    w50Var.f29584h0 = new n50(w50Var, surfaceTexture, i10, i11);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                final x01 x01Var = (x01) this.f25232b;
                ArrayList arrayList = x01Var.f29839c;
                v01 v01Var = x01Var.f29837a;
                if (v01Var != null) {
                    v01Var.i();
                    x01Var.f29837a = null;
                }
                v01 v01Var2 = new v01(surfaceTexture, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                x01Var.invalidate();
                                return;
                            default:
                                x01 x01Var2 = x01Var;
                                Runnable runnable = x01Var2.d;
                                if (runnable != null) {
                                    x01Var2.e = true;
                                    x01Var2.d = null;
                                    x01.b(runnable);
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
                                x01Var.invalidate();
                                return;
                            default:
                                x01 x01Var2 = x01Var;
                                Runnable runnable = x01Var2.d;
                                if (runnable != null) {
                                    x01Var2.e = true;
                                    x01Var2.d = null;
                                    x01.b(runnable);
                                    return;
                                }
                                return;
                        }
                    }
                }, i10, i11);
                x01Var.f29837a = v01Var2;
                v01Var2.f28541a = EmuDetector.with(x01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        w01 w01Var = (w01) arrayList.get(i12);
                        Bitmap bitmap = w01Var.e;
                        if (bitmap != null) {
                            x01Var.f29837a.c(w01Var.f29508f, bitmap, w01Var.f29507c, w01Var.d);
                        } else {
                            ArrayList arrayList2 = w01Var.f29506b;
                            if (arrayList2 != null) {
                                x01Var.f29837a.f(arrayList2, w01Var.d);
                            } else {
                                x01Var.f29837a.e(w01Var.f29505a, w01Var.f29509g, w01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(x01Var.f29838b);
                    return;
                }
                return;
            case 3:
                return;
            default:
                vh.g gVar = (vh.g) this.f25232b;
                if (gVar.f44393f == null) {
                    vh.f fVar = new vh.f(gVar, surfaceTexture, i10, i11, new vh.d(gVar, 1));
                    gVar.f44393f = fVar;
                    fVar.start();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f25231a) {
            case 0:
                w50 w50Var = (w50) this.f25232b;
                Camera2Session[] camera2SessionArr = w50Var.f29593q0;
                n50 n50Var = w50Var.f29584h0;
                if (n50Var != null) {
                    n50Var.b(0L, 0, true, 0, 0);
                    w50Var.f29584h0 = null;
                }
                if (w50Var.f29590n0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    return true;
                } else if (w50Var.f29591o0 != null) {
                    CameraController.getInstance().close(w50Var.f29591o0, null, null);
                    return true;
                } else {
                    return true;
                }
            case 1:
                ((eg0) this.f25232b).V.f31096w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                x01 x01Var = (x01) this.f25232b;
                v01 v01Var = x01Var.f29837a;
                if (v01Var != null) {
                    v01Var.i();
                    x01Var.f29837a = null;
                }
                Runnable runnable = x01Var.d;
                if (runnable != null) {
                    x01Var.d = null;
                    x01.b(runnable);
                    return false;
                }
                return false;
            case 3:
                c91 c91Var = (c91) this.f25232b;
                TextureView textureView = c91Var.d;
                if (c91Var.S) {
                    if (c91Var.W) {
                        c91Var.f23031r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    c91Var.S = false;
                    return false;
                }
                return true;
            default:
                vh.f fVar = ((vh.g) this.f25232b).f44393f;
                if (fVar != null) {
                    fVar.f44379a = false;
                    ((vh.g) this.f25232b).f44393f = null;
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.f25231a) {
            case 0:
                n50 n50Var = ((w50) this.f25232b).f29584h0;
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
                v01 v01Var = ((x01) this.f25232b).f29837a;
                if (v01Var != null && (handler = v01Var.getHandler()) != null && v01Var.f28542b.get()) {
                    handler.sendMessage(handler.obtainMessage(1, i10, i11));
                    return;
                }
                return;
            case 3:
                return;
            default:
                vh.f fVar = ((vh.g) this.f25232b).f44393f;
                if (fVar != null) {
                    synchronized (fVar.e) {
                        fVar.f44382f = true;
                        fVar.h = i10;
                        fVar.f44383n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f25231a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                c91 c91Var = (c91) this.f25232b;
                if (c91Var.f23031r == 1) {
                    c91Var.f23030n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 4));
                    c91Var.f23030n.invalidate();
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
