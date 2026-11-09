package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f39360a;
    public final ViewGroup f39361b;

    public j(ViewGroup viewGroup, int i7) {
        this.f39360a = i7;
        this.f39361b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z9;
        switch (this.f39360a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f39361b).f39375r > 1000) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ((k) this.f39361b).f39375r = SystemClock.elapsedRealtime();
                ((k) this.f39361b).f39376s = videoFrame.getRotatedWidth();
                ((k) this.f39361b).f39377w = videoFrame.getRotatedHeight();
                ((k) this.f39361b).f39370b.d.onFrame(videoFrame);
                if (z9 && !((k) this.f39361b).f39378x) {
                    ((k) this.f39361b).f39378x = true;
                    org.telegram.messenger.g0.h3(((k) this.f39361b).f39379y);
                    return;
                }
                return;
            default:
                ((d0) this.f39361b).f39225s = SystemClock.elapsedRealtime();
                ((d0) this.f39361b).f39226w = videoFrame.getRotatedWidth();
                ((d0) this.f39361b).f39227x = videoFrame.getRotatedHeight();
                k2 k2Var = ((d0) this.f39361b).f39220c;
                if (k2Var != null) {
                    k2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f39360a;
        org.webrtc.d0.a(this, videoSink);
    }
}
