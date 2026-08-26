package org.telegram.ui.Components;

import android.graphics.PointF;

public final class PhotoFilterView$$ExternalSyntheticLambda0 implements VideoEditTextureView.VideoEditTextureViewDelegate, PhotoFilterBlurControl.PhotoFilterLinearBlurControlDelegate, PhotoFilterCurvesControl.PhotoFilterCurvesControlDelegate {
    public final PhotoFilterView f$0;

    public PhotoFilterView$$ExternalSyntheticLambda0(PhotoFilterView photoFilterView) {
        this.f$0 = photoFilterView;
    }

    @Override
    public void onEGLThreadAvailable(FilterGLThread filterGLThread) {
        this.f$0.lambda$new$0(filterGLThread);
    }

    @Override
    public void valueChanged() {
        this.f$0.lambda$new$2();
    }

    @Override
    public void valueChanged(PointF pointF, float f, float f2, float f3) {
        this.f$0.lambda$new$1(pointF, f, f2, f3);
    }
}
