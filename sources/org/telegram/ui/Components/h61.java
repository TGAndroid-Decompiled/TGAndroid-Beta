package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public interface h61 {
    void onError(k61 k61Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(i3.a aVar);

    void onSeekFinished(i3.a aVar);

    void onSeekStarted(i3.a aVar);

    void onStateChanged(boolean z10, int i9);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i9, int i10, int i11, float f10);
}
