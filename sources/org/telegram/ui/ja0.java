package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class ja0 implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener f46581a;
    public final la0 f46582b;

    public ja0(la0 la0Var, TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f46582b = la0Var;
        this.f46581a = surfaceTextureListener;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f46581a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i3, i10);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f46581a;
        if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f46581a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i3, i10);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        pi.q qVar;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f46581a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        qVar = ((org.telegram.ui.ActionBar.d2) this.f46582b).glassEngine;
        qVar.g();
    }
}
