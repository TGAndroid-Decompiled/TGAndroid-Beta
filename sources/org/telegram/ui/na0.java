package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class na0 implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener f50278a;
    public final pa0 f50279b;

    public na0(pa0 pa0Var, TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f50279b = pa0Var;
        this.f50278a = surfaceTextureListener;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f50278a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f50278a;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f50278a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i7, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ri.q qVar;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f50278a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        qVar = ((org.telegram.ui.ActionBar.g2) this.f50279b).glassEngine;
        qVar.g();
    }
}
