package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class d80 implements TextureView.SurfaceTextureListener {
    public final int f34915a;
    public final NotificationCenter.NotificationCenterDelegate f34916b;

    public d80(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f34915a = i10;
        this.f34916b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f34915a) {
            case 0:
                h80 h80Var = (h80) this.f34916b;
                if (h80Var.I == null && surfaceTexture != null) {
                    h80Var.I = new f80(h80Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    h80Var.I.postRunnable(new zz(this, 12));
                    f80 f80Var = h80Var.I;
                    f80Var.postRunnable(f80Var.f35481w);
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
        switch (this.f34915a) {
            case 0:
                h80 h80Var = (h80) this.f34916b;
                f80 f80Var = h80Var.I;
                if (f80Var != null) {
                    f80Var.postRunnable(new zz(f80Var, 14));
                    h80Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f34916b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.fh0 fh0Var = org.telegram.ui.Components.fh0.f24733p0;
                    if (fh0Var.P && org.telegram.ui.Components.fh0.p() != null && org.telegram.ui.Components.fh0.p().f43934b.f45646a != 0) {
                        TextureView textureView2 = null;
                        if (fh0Var != null) {
                            textureView = fh0Var.f24749l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (fh0Var != null) {
                            textureView2 = fh0Var.f24749l0;
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
                        photoViewer.f31928e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f34915a) {
            case 0:
                if (((h80) this.f34916b).I != null) {
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
        switch (this.f34915a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f34916b;
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
