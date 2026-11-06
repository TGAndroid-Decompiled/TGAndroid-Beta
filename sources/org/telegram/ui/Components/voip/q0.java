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
    public final EglRenderer f39425a;
    public SurfaceTexture f39426b;
    public boolean f39427c;

    public q0(ti.q qVar) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.f39425a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        qVar.setSurfaceTextureListener(new w30(this, 3));
        SurfaceTexture surfaceTexture = qVar.getSurfaceTexture();
        if (surfaceTexture != null && qVar.f56015a != null) {
            int width = qVar.getWidth();
            int height = qVar.getHeight();
            if (!this.f39427c && this.f39426b != surfaceTexture) {
                this.f39426b = surfaceTexture;
                if (width > 0 && height > 0) {
                    eglRenderer.setLayoutAspectRatio(width / height);
                }
                eglRenderer.createEglSurface(surfaceTexture);
            }
        }
    }

    public final void a() {
        if (this.f39427c) {
            return;
        }
        this.f39427c = true;
        this.f39425a.release();
        this.f39426b = null;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        if (!this.f39427c) {
            this.f39425a.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.e0.a(this, videoSink);
    }
}
