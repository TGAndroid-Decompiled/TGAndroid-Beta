package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f39236a;
    public final ViewGroup f39237b;

    public j(ViewGroup viewGroup, int i7) {
        this.f39236a = i7;
        this.f39237b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z9;
        switch (this.f39236a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f39237b).f39251r > 1000) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ((k) this.f39237b).f39251r = SystemClock.elapsedRealtime();
                ((k) this.f39237b).f39252s = videoFrame.getRotatedWidth();
                ((k) this.f39237b).f39253w = videoFrame.getRotatedHeight();
                ((k) this.f39237b).f39246b.d.onFrame(videoFrame);
                if (z9 && !((k) this.f39237b).f39254x) {
                    ((k) this.f39237b).f39254x = true;
                    org.telegram.messenger.g0.h3(((k) this.f39237b).f39255y);
                    return;
                }
                return;
            default:
                ((d0) this.f39237b).f39101s = SystemClock.elapsedRealtime();
                ((d0) this.f39237b).f39102w = videoFrame.getRotatedWidth();
                ((d0) this.f39237b).f39103x = videoFrame.getRotatedHeight();
                k2 k2Var = ((d0) this.f39237b).f39096c;
                if (k2Var != null) {
                    k2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f39236a;
        org.webrtc.e0.a(this, videoSink);
    }
}
