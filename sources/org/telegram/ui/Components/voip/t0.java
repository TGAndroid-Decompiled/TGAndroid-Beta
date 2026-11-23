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
    public final EglRenderer f41357a;
    public SurfaceTexture f41358b;
    public boolean f41359c;

    public t0(wi.o oVar) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.f41357a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        oVar.setSurfaceTextureListener(new k40(this, 3));
        SurfaceTexture surfaceTexture = oVar.getSurfaceTexture();
        if (surfaceTexture != null && oVar.f60038a != null) {
            int width = oVar.getWidth();
            int height = oVar.getHeight();
            if (!this.f41359c && this.f41358b != surfaceTexture) {
                this.f41358b = surfaceTexture;
                if (width > 0 && height > 0) {
                    eglRenderer.setLayoutAspectRatio(width / height);
                }
                eglRenderer.createEglSurface(surfaceTexture);
            }
        }
    }

    public final void a() {
        if (this.f41359c) {
            return;
        }
        this.f41359c = true;
        this.f41357a.release();
        this.f41358b = null;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        if (!this.f41359c) {
            this.f41357a.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
