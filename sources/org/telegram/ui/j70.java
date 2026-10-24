package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class j70 implements TextureView.SurfaceTextureListener {
    public final int f38483a;
    public final NotificationCenter.NotificationCenterDelegate f38484b;

    public j70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38483a = i10;
        this.f38484b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38483a) {
            case 0:
                n70 n70Var = (n70) this.f38484b;
                if (n70Var.I == null && surfaceTexture != null) {
                    n70Var.I = new l70(n70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    n70Var.I.postRunnable(new fz(this, 12));
                    l70 l70Var = n70Var.I;
                    l70Var.postRunnable(l70Var.f39128w);
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
        switch (this.f38483a) {
            case 0:
                n70 n70Var = (n70) this.f38484b;
                l70 l70Var = n70Var.I;
                if (l70Var != null) {
                    l70Var.postRunnable(new fz(l70Var, 14));
                    n70Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38484b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.ch0 ch0Var = org.telegram.ui.Components.ch0.f25313p0;
                    if (ch0Var.P && org.telegram.ui.Components.ch0.p() != null && org.telegram.ui.Components.ch0.p().f45687b.f47452a != 0) {
                        TextureView textureView2 = null;
                        if (ch0Var != null) {
                            textureView = ch0Var.f25329l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (ch0Var != null) {
                            textureView2 = ch0Var.f25329l0;
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
                        photoViewer.f33582e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38483a) {
            case 0:
                if (((n70) this.f38484b).I != null) {
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
        switch (this.f38483a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38484b;
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
