package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
public final class q60 implements TextureView.SurfaceTextureListener {
    public final int f40875a;
    public final org.telegram.messenger.us f40876b;

    public q60(org.telegram.messenger.us usVar, int i10) {
        this.f40875a = i10;
        this.f40876b = usVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f40875a) {
            case 0:
                s60 s60Var = (s60) this.f40876b;
                if (s60Var.I == null && surfaceTexture != null) {
                    s60Var.I = new r60(s60Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    s60Var.I.postRunnable(new zy(this, 12));
                    r60 r60Var = s60Var.I;
                    r60Var.postRunnable(r60Var.f41147x);
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
        switch (this.f40875a) {
            case 0:
                s60 s60Var = (s60) this.f40876b;
                r60 r60Var = s60Var.I;
                if (r60Var != null) {
                    r60Var.postRunnable(new zy(r60Var, 14));
                    s60Var.I = null;
                    return true;
                }
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f40876b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.jf0 jf0Var = org.telegram.ui.Components.jf0.f27345p0;
                    if (jf0Var.P && org.telegram.ui.Components.jf0.k() != null && org.telegram.ui.Components.jf0.k().f9863b.f11817a != 0) {
                        TextureView textureView2 = null;
                        if (jf0Var != null) {
                            textureView = jf0Var.f27361l0;
                        } else {
                            textureView = null;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        if (jf0Var != null) {
                            textureView2 = jf0Var.f27361l0;
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
                        photoViewer.f33470e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.f40875a) {
            case 0:
                if (((s60) this.f40876b).I != null) {
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
        switch (this.f40875a) {
            case 0:
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f40876b;
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
