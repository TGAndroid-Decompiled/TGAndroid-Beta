package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
public final class m50 implements TextureView.SurfaceTextureListener {
    public final int f47525a;
    public final org.telegram.messenger.cs f47526b;

    public m50(org.telegram.messenger.cs csVar, int i3) {
        this.f47525a = i3;
        this.f47526b = csVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        switch (this.f47525a) {
            case 0:
                o50 o50Var = (o50) this.f47526b;
                if (o50Var.J == null && surfaceTexture != null) {
                    o50Var.J = new n50(o50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i3, i10, Math.min(i3 / 150.0f, i10 / 150.0f), 0);
                    o50Var.J.postRunnable(new fz(this, 11));
                    n50 n50Var = o50Var.J;
                    n50Var.postRunnable(n50Var.f47891x);
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
        switch (this.f47525a) {
            case 0:
                o50 o50Var = (o50) this.f47526b;
                n50 n50Var = o50Var.J;
                if (n50Var != null) {
                    n50Var.postRunnable(new fz(n50Var, 13));
                    o50Var.J = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f47526b;
                if (photoViewer.C2 != null) {
                    org.telegram.ui.Components.ie0 ie0Var = org.telegram.ui.Components.ie0.f34683q0;
                    if (ie0Var.Q && org.telegram.ui.Components.ie0.k() != null && org.telegram.ui.Components.ie0.k().f55850b.f57570a != 0) {
                        TextureView textureView2 = null;
                        if (ie0Var != null) {
                            textureView = ie0Var.m0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (ie0Var != null) {
                            textureView2 = ie0Var.m0;
                        }
                        textureView2.setVisibility(0);
                        return false;
                    } else if (photoViewer.G3) {
                        if (photoViewer.M3) {
                            photoViewer.H3 = 2;
                        }
                        photoViewer.C2.setSurfaceTexture(surfaceTexture);
                        photoViewer.C2.setVisibility(0);
                        photoViewer.G3 = false;
                        photoViewer.f41420f0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        switch (this.f47525a) {
            case 0:
                if (((o50) this.f47526b).J != null) {
                    Intro.onSurfaceChanged(i3, i10, Math.min(i3 / 150.0f, i10 / 150.0f), 0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f47525a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f47526b;
                if (photoViewer.H3 == 1) {
                    photoViewer.y0(true);
                    return;
                }
                return;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i3, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i3, int i10) {
    }
}
