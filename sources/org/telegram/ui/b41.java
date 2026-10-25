package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class b41 implements org.telegram.ui.Components.p81, org.telegram.ui.Components.l81 {
    public final c41 f37973a;

    public b41(c41 c41Var) {
        this.f37973a = c41Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f37973a.V.f30909i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        c41 c41Var = this.f37973a;
        if (i10 == 4) {
            c41Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(c41Var.Z);
        AndroidUtilities.runOnUIThread(c41Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f37973a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new my0(this, 15));
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
    public void onError(org.telegram.ui.Components.s81 s81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
