package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class na0 implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener f48010a;
    public final pa0 f48011b;

    public na0(pa0 pa0Var, TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f48011b = pa0Var;
        this.f48010a = surfaceTextureListener;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f48010a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f48010a;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f48010a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        oi.q qVar;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f48010a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        qVar = ((org.telegram.ui.ActionBar.f2) this.f48011b).glassEngine;
        qVar.g();
    }
}
