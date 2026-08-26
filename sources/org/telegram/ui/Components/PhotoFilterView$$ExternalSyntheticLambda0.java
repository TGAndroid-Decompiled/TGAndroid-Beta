package org.telegram.ui.Components;

public final class PhotoFilterView$$ExternalSyntheticLambda0 implements VideoEditTextureView.VideoEditTextureViewDelegate, PhotoFilterBlurControl.PhotoFilterLinearBlurControlDelegate, PhotoFilterCurvesControl.PhotoFilterCurvesControlDelegate {
    public final PhotoFilterView f$0;

    public PhotoFilterView$$ExternalSyntheticLambda0(PhotoFilterView photoFilterView) {
        this.f$0 = photoFilterView;
    }

    @Override
    public void onEGLThreadAvailable(FilterGLThread filterGLThread) {
        PhotoFilterView photoFilterView = this.f$0;
        photoFilterView.eglThread = filterGLThread;
        filterGLThread.setFilterGLThreadDelegate(photoFilterView);
    }
}
