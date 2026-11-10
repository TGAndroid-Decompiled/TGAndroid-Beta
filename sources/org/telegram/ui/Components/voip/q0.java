package org.telegram.ui.Components.voip;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.Components.w30;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class q0 implements VideoSink {
    public final EglRenderer f39487a;
    public SurfaceTexture f39488b;
    public boolean f39489c;

    public q0(ti.p pVar) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.f39487a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        pVar.setSurfaceTextureListener(new w30(this, 3));
        SurfaceTexture surfaceTexture = pVar.getSurfaceTexture();
        if (surfaceTexture != null && pVar.f56140a != null) {
            int width = pVar.getWidth();
            int height = pVar.getHeight();
            if (!this.f39489c && this.f39488b != surfaceTexture) {
                this.f39488b = surfaceTexture;
                if (width > 0 && height > 0) {
                    eglRenderer.setLayoutAspectRatio(width / height);
                }
                eglRenderer.createEglSurface(surfaceTexture);
            }
        }
    }

    public final void a() {
        if (this.f39489c) {
            return;
        }
        this.f39489c = true;
        this.f39487a.release();
        this.f39488b = null;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        if (!this.f39489c) {
            this.f39487a.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
