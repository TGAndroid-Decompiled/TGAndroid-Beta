package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class e70 implements TextureView.SurfaceTextureListener {
    public final int f37835a;
    public final NotificationCenter.NotificationCenterDelegate f37836b;

    public e70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.f37835a = i9;
        this.f37836b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        switch (this.f37835a) {
            case 0:
                i70 i70Var = (i70) this.f37836b;
                if (i70Var.E == null && surfaceTexture != null) {
                    i70Var.E = new g70(i70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i9, i10, Math.min(i9 / 150.0f, i10 / 150.0f), 0);
                    i70Var.E.postRunnable(new o00(this, 11));
                    g70 g70Var = i70Var.E;
                    g70Var.postRunnable(g70Var.f38443w);
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
        switch (this.f37835a) {
            case 0:
                i70 i70Var = (i70) this.f37836b;
                g70 g70Var = i70Var.E;
                if (g70Var != null) {
                    g70Var.postRunnable(new o00(g70Var, 13));
                    i70Var.E = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f37836b;
                if (photoViewer.f35790x2 != null) {
                    org.telegram.ui.Components.pf0 pf0Var = org.telegram.ui.Components.pf0.f31622l0;
                    if (pf0Var.L && org.telegram.ui.Components.pf0.p() != null && org.telegram.ui.Components.pf0.p().f49145b.f50439a != 0) {
                        TextureView textureView2 = null;
                        if (pf0Var != null) {
                            textureView = pf0Var.f31635h0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (pf0Var != null) {
                            textureView2 = pf0Var.f31635h0;
                        }
                        textureView2.setVisibility(0);
                        return false;
                    } else if (photoViewer.B3) {
                        if (photoViewer.H3) {
                            photoViewer.C3 = 2;
                        }
                        photoViewer.f35790x2.setSurfaceTexture(surfaceTexture);
                        photoViewer.f35790x2.setVisibility(0);
                        photoViewer.B3 = false;
                        photoViewer.f35580a0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        switch (this.f37835a) {
            case 0:
                if (((i70) this.f37836b).E != null) {
                    Intro.onSurfaceChanged(i9, i10, Math.min(i9 / 150.0f, i10 / 150.0f), 0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f37835a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f37836b;
                if (photoViewer.C3 == 1) {
                    photoViewer.w0(true);
                    return;
                }
                return;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i9, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i9, int i10) {
    }
}
