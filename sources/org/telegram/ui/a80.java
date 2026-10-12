package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class a80 implements TextureView.SurfaceTextureListener {
    public final int f35724a;
    public final NotificationCenter.NotificationCenterDelegate f35725b;

    public a80(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f35724a = i10;
        this.f35725b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f35724a) {
            case 0:
                f80 f80Var = (f80) this.f35725b;
                if (f80Var.I == null && surfaceTexture != null) {
                    f80Var.I = new d80(f80Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    f80Var.I.postRunnable(new wz(this, 12));
                    d80 d80Var = f80Var.I;
                    d80Var.postRunnable(d80Var.f36685w);
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
        switch (this.f35724a) {
            case 0:
                f80 f80Var = (f80) this.f35725b;
                d80 d80Var = f80Var.I;
                if (d80Var != null) {
                    d80Var.postRunnable(new wz(d80Var, 14));
                    f80Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f35725b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.jh0 jh0Var = org.telegram.ui.Components.jh0.f27497p0;
                    if (jh0Var.P && org.telegram.ui.Components.jh0.p() != null && org.telegram.ui.Components.jh0.p().f46108b.f48219a != 0) {
                        TextureView textureView2 = null;
                        if (jh0Var != null) {
                            textureView = jh0Var.f27514l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (jh0Var != null) {
                            textureView2 = jh0Var.f27514l0;
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
                        photoViewer.f33743e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f35724a) {
            case 0:
                if (((f80) this.f35725b).I != null) {
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
        switch (this.f35724a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f35725b;
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
