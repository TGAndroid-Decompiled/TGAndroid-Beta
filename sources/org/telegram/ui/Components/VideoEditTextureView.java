package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class VideoEditTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public VideoPlayer currentVideoPlayer;
    public VideoEditTextureViewDelegate delegate;
    public FilterGLThread eglThread;
    public int gradientBottom;
    public int gradientTop;
    public StoryEntry.HDRInfo hdrInfo;
    public BlurringShader.BlurManager uiBlurManager;
    public int videoHeight;
    public int videoWidth;
    public final RectOld viewRect;

    public interface VideoEditTextureViewDelegate {
        void onEGLThreadAvailable(FilterGLThread filterGLThread);
    }

    public VideoEditTextureView(Context context, VideoPlayer videoPlayer) {
        super(context);
        this.viewRect = new RectOld();
        this.currentVideoPlayer = videoPlayer;
        setSurfaceTextureListener(this);
    }

    public Bitmap getUiBlurBitmap() {
        BlurringShader blurringShader;
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread == null || (blurringShader = filterGLThread.uiBlur) == null) {
            return null;
        }
        synchronized (blurringShader.bitmapLock) {
            try {
                if (blurringShader.bitmapAvailable) {
                    return blurringShader.bitmap;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3;
        if (this.eglThread != null || surfaceTexture == null || this.currentVideoPlayer == null) {
            return;
        }
        FilterGLThread filterGLThread = new FilterGLThread(surfaceTexture, new VideoEditTextureView$$ExternalSyntheticLambda1(this, 0), this.hdrInfo, this.uiBlurManager, i, i2);
        this.eglThread = filterGLThread;
        filterGLThread.updateUiBlurGradient(this.gradientTop, this.gradientBottom);
        FilterGLThread filterGLThread2 = this.eglThread;
        BlurringShader.BlurManager blurManager = this.uiBlurManager;
        BlurringShader blurringShader = filterGLThread2.uiBlur;
        if (blurringShader != null) {
            blurringShader.setBlurManager(blurManager);
        }
        int i4 = this.videoWidth;
        if (i4 != 0 && (i3 = this.videoHeight) != 0) {
            FilterGLThread filterGLThread3 = this.eglThread;
            filterGLThread3.getClass();
            filterGLThread3.postRunnable(new FilterGLThread$$ExternalSyntheticLambda0(filterGLThread3, i4, i3, 0));
        }
        this.eglThread.requestRender(true, true, false);
        VideoEditTextureViewDelegate videoEditTextureViewDelegate = this.delegate;
        if (videoEditTextureViewDelegate != null) {
            videoEditTextureViewDelegate.onEGLThreadAvailable(this.eglThread);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread == null) {
            return true;
        }
        filterGLThread.shutdown();
        this.eglThread = null;
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.postRunnable(new FilterGLThread$$ExternalSyntheticLambda0(filterGLThread, i, i2, 1));
            this.eglThread.requestRender(false, true, false);
            this.eglThread.postRunnable(new Tooltip$$ExternalSyntheticLambda0(this, 10));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setDelegate(VideoEditTextureViewDelegate videoEditTextureViewDelegate) {
        this.delegate = videoEditTextureViewDelegate;
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            if (videoEditTextureViewDelegate == null) {
                filterGLThread.setFilterGLThreadDelegate(null);
            } else {
                videoEditTextureViewDelegate.onEGLThreadAvailable(filterGLThread);
            }
        }
    }

    public void setHDRInfo(StoryEntry.HDRInfo hDRInfo) {
        this.hdrInfo = hDRInfo;
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.postRunnable(new EmojiView$2$$ExternalSyntheticLambda1(26, filterGLThread, hDRInfo));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            int width = getWidth();
            int height = getHeight();
            BlurringShader blurringShader = filterGLThread.uiBlur;
            if (blurringShader == null) {
                return;
            }
            Matrix matrix2 = blurringShader.iMatrix;
            matrix.invert(matrix2);
            float f = width;
            float f2 = height;
            matrix2.preScale(f, f2);
            matrix2.postScale(1.0f / f, 1.0f / f2);
            blurringShader.updateTransform(matrix2);
            filterGLThread.requestRender(false, false, false);
        }
    }

    public final void setViewRect(float f, float f2, float f3, float f4) {
        RectOld rectOld = this.viewRect;
        rectOld.x = f;
        rectOld.y = f2;
        rectOld.width = f3;
        rectOld.height = f4;
    }
}
