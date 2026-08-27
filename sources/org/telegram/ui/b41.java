package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

public final class b41 implements org.telegram.ui.Components.j61, org.telegram.ui.Components.f61 {

    public final c41 f36696a;

    public b41(c41 c41Var) {
        this.f36696a = c41Var;
    }

    @Override
    public boolean needUpdate() {
        return this.f36696a.R.f27363i != null;
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        c41 c41Var = this.f36696a;
        if (i10 == 4) {
            c41Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(c41Var.V);
            AndroidUtilities.runOnUIThread(c41Var.V, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f36696a.R.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new ky0(this, 14));
    }

    @Override
    public void onSeekFinished(i3.a aVar) {
    }

    @Override
    public void onSeekStarted(i3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.m61 m61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
