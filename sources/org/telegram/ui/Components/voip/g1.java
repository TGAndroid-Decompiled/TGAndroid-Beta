package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class g1 implements VideoSink {
    public volatile t0 f41011a;
    public volatile m2 f41012b;
    public volatile int f41013c;
    public volatile int d;
    public volatile long f41014e;
    public final oi.c2 f41015f = new oi.c2(this, 19);
    public final j1 h;

    public g1(j1 j1Var) {
        this.h = j1Var;
    }

    public final boolean a(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f41014e < j3) {
            if (elapsedRealtime - j3 >= 700) {
                return false;
            }
            return true;
        } else if (elapsedRealtime - this.f41014e >= 5000) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f41014e > 5000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41014e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f41013c || rotatedHeight != this.d || z10) {
            this.f41013c = rotatedWidth;
            this.d = rotatedHeight;
            org.telegram.messenger.g0.g3(this.f41015f);
        }
        t0 t0Var = this.f41011a;
        m2 m2Var = this.f41012b;
        if (t0Var != null) {
            t0Var.onFrame(videoFrame);
        }
        if (m2Var != null) {
            m2Var.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
