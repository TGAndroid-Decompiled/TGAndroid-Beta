package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class b80 implements TextureView.SurfaceTextureListener {
    public final int f32071a;
    public final NotificationCenter.NotificationCenterDelegate f32072b;

    public b80(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f32071a = i10;
        this.f32072b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f32071a) {
            case 0:
                f80 f80Var = (f80) this.f32072b;
                if (f80Var.I == null && surfaceTexture != null) {
                    f80Var.I = new d80(f80Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    f80Var.I.postRunnable(new i10(this, 11));
                    d80 d80Var = f80Var.I;
                    d80Var.postRunnable(d80Var.f33048w);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        switch (this.f32071a) {
            case 0:
                f80 f80Var = (f80) this.f32072b;
                d80 d80Var = f80Var.I;
                if (d80Var != null) {
                    d80Var.postRunnable(new i10(d80Var, 13));
                    f80Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f32072b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.fg0 fg0Var = org.telegram.ui.Components.fg0.f23914p0;
                    if (fg0Var.P && org.telegram.ui.Components.fg0.p() != null && org.telegram.ui.Components.fg0.p().f40821b.f42256a != 0) {
                        TextureView textureView2 = null;
                        if (fg0Var != null) {
                            textureView = fg0Var.f23930l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (fg0Var != null) {
                            textureView2 = fg0Var.f23930l0;
                        }
                        textureView2.setVisibility(0);
                        return false;
                    } else if (photoViewer.F3) {
                        if (photoViewer.L3) {
                            photoViewer.G3 = 2;
                        }
                        photoViewer.B2.setSurfaceTexture(surfaceTexture);
                        photoViewer.B2.setVisibility(0);
                        photoViewer.F3 = false;
                        photoViewer.f30954e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f32071a) {
            case 0:
                if (((f80) this.f32072b).I != null) {
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f32071a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f32072b;
                if (photoViewer.G3 == 1) {
                    photoViewer.x0(true);
                    return;
                }
                return;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
