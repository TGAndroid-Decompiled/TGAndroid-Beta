package org.telegram.ui.Components.voip;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.Components.z30;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class u0 implements VideoSink {
    public final EglRenderer f40977a;
    public SurfaceTexture f40978b;
    public boolean f40979c;

    public u0(wi.o oVar) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.f40977a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        oVar.setSurfaceTextureListener(new z30(this, 3));
        SurfaceTexture surfaceTexture = oVar.getSurfaceTexture();
        if (surfaceTexture != null && oVar.f59428a != null) {
            int width = oVar.getWidth();
            int height = oVar.getHeight();
            if (!this.f40979c && this.f40978b != surfaceTexture) {
                this.f40978b = surfaceTexture;
                if (width > 0 && height > 0) {
                    eglRenderer.setLayoutAspectRatio(width / height);
                }
                eglRenderer.createEglSurface(surfaceTexture);
            }
        }
    }

    public final void a() {
        if (this.f40979c) {
            return;
        }
        this.f40979c = true;
        this.f40977a.release();
        this.f40978b = null;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        if (!this.f40979c) {
            this.f40977a.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
