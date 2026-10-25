package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class l70 implements TextureView.SurfaceTextureListener {
    public final int f41157a;
    public final NotificationCenter.NotificationCenterDelegate f41158b;

    public l70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f41157a = i10;
        this.f41158b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f41157a) {
            case 0:
                p70 p70Var = (p70) this.f41158b;
                if (p70Var.I == null && surfaceTexture != null) {
                    p70Var.I = new n70(p70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    p70Var.I.postRunnable(new p00(this, 11));
                    n70 n70Var = p70Var.I;
                    n70Var.postRunnable(n70Var.f41771w);
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
        switch (this.f41157a) {
            case 0:
                p70 p70Var = (p70) this.f41158b;
                n70 n70Var = p70Var.I;
                if (n70Var != null) {
                    n70Var.postRunnable(new p00(n70Var, 13));
                    p70Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f41158b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.ch0 ch0Var = org.telegram.ui.Components.ch0.f27157p0;
                    if (ch0Var.P && org.telegram.ui.Components.ch0.p() != null && org.telegram.ui.Components.ch0.p().f48126b.f49719a != 0) {
                        TextureView textureView2 = null;
                        if (ch0Var != null) {
                            textureView = ch0Var.f27173l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (ch0Var != null) {
                            textureView2 = ch0Var.f27173l0;
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
                        photoViewer.f35643e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f41157a) {
            case 0:
                if (((p70) this.f41158b).I != null) {
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
        switch (this.f41157a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f41158b;
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
