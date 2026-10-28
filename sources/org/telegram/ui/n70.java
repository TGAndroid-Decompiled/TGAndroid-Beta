package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class n70 implements TextureView.SurfaceTextureListener {
    public final int f41644a;
    public final NotificationCenter.NotificationCenterDelegate f41645b;

    public n70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f41644a = i10;
        this.f41645b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f41644a) {
            case 0:
                r70 r70Var = (r70) this.f41645b;
                if (r70Var.I == null && surfaceTexture != null) {
                    r70Var.I = new p70(r70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    r70Var.I.postRunnable(new r00(this, 11));
                    p70 p70Var = r70Var.I;
                    p70Var.postRunnable(p70Var.f42336w);
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
        switch (this.f41644a) {
            case 0:
                r70 r70Var = (r70) this.f41645b;
                p70 p70Var = r70Var.I;
                if (p70Var != null) {
                    p70Var.postRunnable(new r00(p70Var, 13));
                    r70Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f41645b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.dh0 dh0Var = org.telegram.ui.Components.dh0.f27444p0;
                    if (dh0Var.P && org.telegram.ui.Components.dh0.p() != null && org.telegram.ui.Components.dh0.p().f48167b.f49757a != 0) {
                        TextureView textureView2 = null;
                        if (dh0Var != null) {
                            textureView = dh0Var.f27460l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (dh0Var != null) {
                            textureView2 = dh0Var.f27460l0;
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
                        photoViewer.f35670e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f41644a) {
            case 0:
                if (((r70) this.f41645b).I != null) {
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
        switch (this.f41644a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f41645b;
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
