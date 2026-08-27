package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;

public final class h70 implements TextureView.SurfaceTextureListener {

    public final int f38694a;

    public final NotificationCenter.NotificationCenterDelegate f38695b;

    public h70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38694a = i10;
        this.f38695b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38694a) {
            case 0:
                l70 l70Var = (l70) this.f38695b;
                if (l70Var.E == null && surfaceTexture != null) {
                    l70Var.E = new k70(l70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    l70Var.E.postRunnable(new r00(this, 11));
                    k70 k70Var = l70Var.E;
                    k70Var.postRunnable(k70Var.f39642w);
                    break;
                }
                break;
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f38694a) {
            case 0:
                l70 l70Var = (l70) this.f38695b;
                k70 k70Var = l70Var.E;
                if (k70Var == null) {
                    return true;
                }
                k70Var.postRunnable(new r00(k70Var, 13));
                l70Var.E = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38695b;
                if (photoViewer.f35794x2 != null) {
                    org.telegram.ui.Components.sf0 sf0Var = org.telegram.ui.Components.sf0.f32415l0;
                    if (sf0Var.L && org.telegram.ui.Components.sf0.p() != null && org.telegram.ui.Components.sf0.p().f49861b.f258a != 0) {
                        (sf0Var != null ? sf0Var.f32428h0 : null).setSurfaceTexture(surfaceTexture);
                        (sf0Var != null ? sf0Var.f32428h0 : null).setVisibility(0);
                        return false;
                    }
                    if (photoViewer.B3) {
                        if (photoViewer.H3) {
                            photoViewer.C3 = 2;
                        }
                        photoViewer.f35794x2.setSurfaceTexture(surfaceTexture);
                        photoViewer.f35794x2.setVisibility(0);
                        photoViewer.B3 = false;
                        photoViewer.f35583a0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f38694a) {
            case 0:
                if (((l70) this.f38695b).E != null) {
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                }
                break;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f38694a) {
            case 0:
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38695b;
                if (photoViewer.C3 == 1) {
                    photoViewer.x0(true);
                }
                break;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
