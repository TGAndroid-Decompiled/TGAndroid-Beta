package org.telegram.ui.Components.voip;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.Components.k40;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class t0 implements VideoSink {
    public final EglRenderer f41358a;
    public SurfaceTexture f41359b;
    public boolean f41360c;

    public t0(wi.o oVar) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.f41358a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        oVar.setSurfaceTextureListener(new k40(this, 3));
        SurfaceTexture surfaceTexture = oVar.getSurfaceTexture();
        if (surfaceTexture != null && oVar.f60038a != null) {
            int width = oVar.getWidth();
            int height = oVar.getHeight();
            if (!this.f41360c && this.f41359b != surfaceTexture) {
                this.f41359b = surfaceTexture;
                if (width > 0 && height > 0) {
                    eglRenderer.setLayoutAspectRatio(width / height);
                }
                eglRenderer.createEglSurface(surfaceTexture);
            }
        }
    }

    public final void a() {
        if (this.f41360c) {
            return;
        }
        this.f41360c = true;
        this.f41358a.release();
        this.f41359b = null;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        if (!this.f41360c) {
            this.f41358a.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
