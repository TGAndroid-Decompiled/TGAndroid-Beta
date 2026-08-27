package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

public interface j61 {
    void onError(m61 m61Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(i3.a aVar);

    void onSeekFinished(i3.a aVar);

    void onSeekStarted(i3.a aVar);

    void onStateChanged(boolean z10, int i10);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i10, int i11, int i12, float f10);
}
