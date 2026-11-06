package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f39218a;
    public final ViewGroup f39219b;

    public j(ViewGroup viewGroup, int i7) {
        this.f39218a = i7;
        this.f39219b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z9;
        switch (this.f39218a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f39219b).f39233r > 1000) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ((k) this.f39219b).f39233r = SystemClock.elapsedRealtime();
                ((k) this.f39219b).f39234s = videoFrame.getRotatedWidth();
                ((k) this.f39219b).f39235w = videoFrame.getRotatedHeight();
                ((k) this.f39219b).f39228b.d.onFrame(videoFrame);
                if (z9 && !((k) this.f39219b).f39236x) {
                    ((k) this.f39219b).f39236x = true;
                    org.telegram.messenger.g0.h3(((k) this.f39219b).f39237y);
                    return;
                }
                return;
            default:
                ((d0) this.f39219b).f39083s = SystemClock.elapsedRealtime();
                ((d0) this.f39219b).f39084w = videoFrame.getRotatedWidth();
                ((d0) this.f39219b).f39085x = videoFrame.getRotatedHeight();
                k2 k2Var = ((d0) this.f39219b).f39078c;
                if (k2Var != null) {
                    k2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f39218a;
        org.webrtc.e0.a(this, videoSink);
    }
}
