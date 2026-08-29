package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class h70 implements TextureView.SurfaceTextureListener {
    public final int f38774a;
    public final NotificationCenter.NotificationCenterDelegate f38775b;

    public h70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38774a = i10;
        this.f38775b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38774a) {
            case 0:
                k70 k70Var = (k70) this.f38775b;
                if (k70Var.E == null && surfaceTexture != null) {
                    k70Var.E = new j70(k70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    k70Var.E.postRunnable(new q00(this, 11));
                    j70 j70Var = k70Var.E;
                    j70Var.postRunnable(j70Var.f39462w);
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
        switch (this.f38774a) {
            case 0:
                k70 k70Var = (k70) this.f38775b;
                j70 j70Var = k70Var.E;
                if (j70Var != null) {
                    j70Var.postRunnable(new q00(j70Var, 13));
                    k70Var.E = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38775b;
                if (photoViewer.f35858x2 != null) {
                    org.telegram.ui.Components.bg0 bg0Var = org.telegram.ui.Components.bg0.f27076l0;
                    if (bg0Var.L && org.telegram.ui.Components.bg0.p() != null && org.telegram.ui.Components.bg0.p().f398b.f3044a != 0) {
                        TextureView textureView2 = null;
                        if (bg0Var != null) {
                            textureView = bg0Var.f27089h0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (bg0Var != null) {
                            textureView2 = bg0Var.f27089h0;
                        }
                        textureView2.setVisibility(0);
                        return false;
                    } else if (photoViewer.B3) {
                        if (photoViewer.H3) {
                            photoViewer.C3 = 2;
                        }
                        photoViewer.f35858x2.setSurfaceTexture(surfaceTexture);
                        photoViewer.f35858x2.setVisibility(0);
                        photoViewer.B3 = false;
                        photoViewer.f35647a0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38774a) {
            case 0:
                if (((k70) this.f38775b).E != null) {
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
        switch (this.f38774a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38775b;
                if (photoViewer.C3 == 1) {
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
