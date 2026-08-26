package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;

public final class FilterGLThread$$ExternalSyntheticLambda8 implements SurfaceTexture.OnFrameAvailableListener {
    public final int $r8$classId;
    public final DispatchQueue f$0;

    public FilterGLThread$$ExternalSyntheticLambda8(DispatchQueue dispatchQueue, int i) {
        this.$r8$classId = i;
        this.f$0 = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.$r8$classId) {
            case 0:
                ((FilterGLThread) this.f$0).requestRender(false, true, true);
                break;
            default:
                ((InstantCameraView.CameraGLThread) this.f$0).requestRender(true, false);
                break;
        }
    }
}
