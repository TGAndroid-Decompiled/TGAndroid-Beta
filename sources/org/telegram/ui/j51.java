package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class j51 implements org.telegram.ui.Components.e71, org.telegram.ui.Components.a71 {
    public final k51 f34777a;

    public j51(k51 k51Var) {
        this.f34777a = k51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f34777a.V.f24856i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        k51 k51Var = this.f34777a;
        if (i10 == 4) {
            k51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(k51Var.Z);
        AndroidUtilities.runOnUIThread(k51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f34777a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new g01(this, 12));
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.h71 h71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
