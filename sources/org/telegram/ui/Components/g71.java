package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public interface g71 {
    void onError(j71 j71Var, Exception exc);

    void onRenderedFirstFrame();

    void onRenderedFirstFrame(k3.a aVar);

    void onSeekFinished(k3.a aVar);

    void onSeekStarted(k3.a aVar);

    void onStateChanged(boolean z4, int i10);

    boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

    void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

    void onVideoSizeChanged(int i10, int i11, int i12, float f10);
}
