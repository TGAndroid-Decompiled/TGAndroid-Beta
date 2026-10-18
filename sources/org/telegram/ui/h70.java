package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;
public final class h70 implements TextureView.SurfaceTextureListener {
    public final int f37425a;
    public final NotificationCenter.NotificationCenterDelegate f37426b;

    public h70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f37425a = i10;
        this.f37426b = notificationCenterDelegate;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f37425a) {
            case 0:
                l70 l70Var = (l70) this.f37426b;
                if (l70Var.I == null && surfaceTexture != null) {
                    l70Var.I = new j70(l70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    l70Var.I.postRunnable(new fz(this, 12));
                    j70 j70Var = l70Var.I;
                    j70Var.postRunnable(j70Var.f38072w);
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
        switch (this.f37425a) {
            case 0:
                l70 l70Var = (l70) this.f37426b;
                j70 j70Var = l70Var.I;
                if (j70Var != null) {
                    j70Var.postRunnable(new fz(j70Var, 14));
                    l70Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f37426b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.zg0 zg0Var = org.telegram.ui.Components.zg0.f32905p0;
                    if (zg0Var.P && org.telegram.ui.Components.zg0.p() != null && org.telegram.ui.Components.zg0.p().f45264b.f47005a != 0) {
                        TextureView textureView2 = null;
                        if (zg0Var != null) {
                            textureView = zg0Var.f32921l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (zg0Var != null) {
                            textureView2 = zg0Var.f32921l0;
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
                        photoViewer.f33266e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f37425a) {
            case 0:
                if (((l70) this.f37426b).I != null) {
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
        switch (this.f37425a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f37426b;
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
