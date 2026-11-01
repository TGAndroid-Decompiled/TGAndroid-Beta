package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
public final class p60 implements TextureView.SurfaceTextureListener {
    public final int f40376a;
    public final org.telegram.messenger.vs f40377b;

    public p60(org.telegram.messenger.vs vsVar, int i10) {
        this.f40376a = i10;
        this.f40377b = vsVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f40376a) {
            case 0:
                r60 r60Var = (r60) this.f40377b;
                if (r60Var.I == null && surfaceTexture != null) {
                    r60Var.I = new q60(r60Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    r60Var.I.postRunnable(new yy(this, 12));
                    q60 q60Var = r60Var.I;
                    q60Var.postRunnable(q60Var.f40699x);
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
        switch (this.f40376a) {
            case 0:
                r60 r60Var = (r60) this.f40377b;
                q60 q60Var = r60Var.I;
                if (q60Var != null) {
                    q60Var.postRunnable(new yy(q60Var, 14));
                    r60Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f40377b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.jf0 jf0Var = org.telegram.ui.Components.jf0.f27400p0;
                    if (jf0Var.P && org.telegram.ui.Components.jf0.k() != null && org.telegram.ui.Components.jf0.k().f9864b.f11818a != 0) {
                        TextureView textureView2 = null;
                        if (jf0Var != null) {
                            textureView = jf0Var.f27416l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (jf0Var != null) {
                            textureView2 = jf0Var.f27416l0;
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
                        photoViewer.f33477e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f40376a) {
            case 0:
                if (((r60) this.f40377b).I != null) {
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
        switch (this.f40376a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f40377b;
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
