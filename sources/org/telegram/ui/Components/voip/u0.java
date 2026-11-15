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
    public final EglRenderer f40974a;
    public SurfaceTexture f40975b;
    public boolean f40976c;

    public u0(wi.o oVar) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.f40974a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        oVar.setSurfaceTextureListener(new z30(this, 3));
        SurfaceTexture surfaceTexture = oVar.getSurfaceTexture();
        if (surfaceTexture != null && oVar.f59428a != null) {
            int width = oVar.getWidth();
            int height = oVar.getHeight();
            if (!this.f40976c && this.f40975b != surfaceTexture) {
                this.f40975b = surfaceTexture;
                if (width > 0 && height > 0) {
                    eglRenderer.setLayoutAspectRatio(width / height);
                }
                eglRenderer.createEglSurface(surfaceTexture);
            }
        }
    }

    public final void a() {
        if (this.f40976c) {
            return;
        }
        this.f40976c = true;
        this.f40974a.release();
        this.f40975b = null;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        if (!this.f40976c) {
            this.f40974a.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
