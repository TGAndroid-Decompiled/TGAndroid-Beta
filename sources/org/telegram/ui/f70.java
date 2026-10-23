package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class f70 implements TextureView.SurfaceTextureListener {
    public final int f36911a;
    public final NotificationCenter.NotificationCenterDelegate f36912b;

    public f70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f36911a = i10;
        this.f36912b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f36911a) {
            case 0:
                j70 j70Var = (j70) this.f36912b;
                if (j70Var.I == null && surfaceTexture != null) {
                    j70Var.I = new h70(j70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    j70Var.I.postRunnable(new dz(this, 12));
                    h70 h70Var = j70Var.I;
                    h70Var.postRunnable(h70Var.f37531w);
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
        switch (this.f36911a) {
            case 0:
                j70 j70Var = (j70) this.f36912b;
                h70 h70Var = j70Var.I;
                if (h70Var != null) {
                    h70Var.postRunnable(new dz(h70Var, 14));
                    j70Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f36912b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.ah0 ah0Var = org.telegram.ui.Components.ah0.f24602p0;
                    if (ah0Var.P && org.telegram.ui.Components.ah0.p() != null && org.telegram.ui.Components.ah0.p().f45276b.f47018a != 0) {
                        TextureView textureView2 = null;
                        if (ah0Var != null) {
                            textureView = ah0Var.f24618l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (ah0Var != null) {
                            textureView2 = ah0Var.f24618l0;
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
                        photoViewer.f33283e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f36911a) {
            case 0:
                if (((j70) this.f36912b).I != null) {
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
        switch (this.f36911a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f36912b;
                if (photoViewer.G3 == 1) {
                    photoViewer.y0(true);
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
