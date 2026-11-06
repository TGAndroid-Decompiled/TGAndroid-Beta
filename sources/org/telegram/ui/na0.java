package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class na0 implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener f47977a;
    public final pa0 f47978b;

    public na0(pa0 pa0Var, TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f47978b = pa0Var;
        this.f47977a = surfaceTextureListener;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f47977a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f47977a;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f47977a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        oi.q qVar;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f47977a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        qVar = ((org.telegram.ui.ActionBar.f2) this.f47978b).glassEngine;
        qVar.g();
    }
}
