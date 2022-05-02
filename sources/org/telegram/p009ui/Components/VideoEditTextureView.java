package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.p009ui.Components.FilterGLThread;

public class VideoEditTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    private VideoPlayer currentVideoPlayer;
    private VideoEditTextureViewDelegate delegate;
    private FilterGLThread eglThread;
    private int videoHeight;
    private int videoWidth;
    private Rect viewRect = new Rect();

    public interface VideoEditTextureViewDelegate {
        void onEGLThreadAvailable(FilterGLThread filterGLThread);
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public VideoEditTextureView(Context context, VideoPlayer videoPlayer) {
        super(context);
        this.currentVideoPlayer = videoPlayer;
        setSurfaceTextureListener(this);
    }

    public void setDelegate(VideoEditTextureViewDelegate videoEditTextureViewDelegate) {
        this.delegate = videoEditTextureViewDelegate;
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread == null) {
            return;
        }
        if (videoEditTextureViewDelegate == null) {
            filterGLThread.setFilterGLThreadDelegate(null);
        } else {
            videoEditTextureViewDelegate.onEGLThreadAvailable(filterGLThread);
        }
    }

    public void setVideoSize(int i, int i2) {
        this.videoWidth = i;
        this.videoHeight = i2;
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.setVideoSize(i, i2);
        }
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3;
        if (this.eglThread == null && surfaceTexture != null && this.currentVideoPlayer != null) {
            FilterGLThread filterGLThread = new FilterGLThread(surfaceTexture, new FilterGLThread.FilterGLThreadVideoDelegate() {
                @Override
                public final void onVideoSurfaceCreated(SurfaceTexture surfaceTexture2) {
                    VideoEditTextureView.this.lambda$onSurfaceTextureAvailable$0(surfaceTexture2);
                }
            });
            this.eglThread = filterGLThread;
            int i4 = this.videoWidth;
            if (!(i4 == 0 || (i3 = this.videoHeight) == 0)) {
                filterGLThread.setVideoSize(i4, i3);
            }
            this.eglThread.setSurfaceTextureSize(i, i2);
            this.eglThread.requestRender(true, true, false);
            VideoEditTextureViewDelegate videoEditTextureViewDelegate = this.delegate;
            if (videoEditTextureViewDelegate != null) {
                videoEditTextureViewDelegate.onEGLThreadAvailable(this.eglThread);
            }
        }
    }

    public void lambda$onSurfaceTextureAvailable$0(SurfaceTexture surfaceTexture) {
        if (this.currentVideoPlayer != null) {
            this.currentVideoPlayer.setSurface(new Surface(surfaceTexture));
        }
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.setSurfaceTextureSize(i, i2);
            this.eglThread.requestRender(false, true, false);
            this.eglThread.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    VideoEditTextureView.this.lambda$onSurfaceTextureSizeChanged$1();
                }
            });
        }
    }

    public void lambda$onSurfaceTextureSizeChanged$1() {
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(false, true, false);
        }
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread == null) {
            return true;
        }
        filterGLThread.shutdown();
        this.eglThread = null;
        return true;
    }

    public void release() {
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.shutdown();
        }
        this.currentVideoPlayer = null;
    }

    public void setViewRect(float f, float f2, float f3, float f4) {
        Rect rect = this.viewRect;
        rect.f1082x = f;
        rect.f1083y = f2;
        rect.width = f3;
        rect.height = f4;
    }

    public boolean containsPoint(float f, float f2) {
        Rect rect = this.viewRect;
        float f3 = rect.f1082x;
        if (f >= f3 && f <= f3 + rect.width) {
            float f4 = rect.f1083y;
            if (f2 >= f4 && f2 <= f4 + rect.height) {
                return true;
            }
        }
        return false;
    }
}
