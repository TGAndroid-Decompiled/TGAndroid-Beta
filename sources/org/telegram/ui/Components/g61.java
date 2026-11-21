package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public interface g61 {
    void onError(i61 i61Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(m2.a aVar);

    void onSeekFinished(m2.a aVar);

    void onSeekStarted(m2.a aVar);

    void onStateChanged(boolean z10, int i7);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i7, int i10, int i11, float f10);
}
