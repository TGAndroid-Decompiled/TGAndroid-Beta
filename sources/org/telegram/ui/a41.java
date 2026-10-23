package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class a41 implements org.telegram.ui.Components.g81, org.telegram.ui.Components.c81 {
    public final b41 f35571a;

    public a41(b41 b41Var) {
        this.f35571a = b41Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f35571a.V.f28265i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        b41 b41Var = this.f35571a;
        if (i10 == 4) {
            b41Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(b41Var.Z);
        AndroidUtilities.runOnUIThread(b41Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f35571a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new my0(this, 14));
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
    public void onError(org.telegram.ui.Components.j81 j81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
