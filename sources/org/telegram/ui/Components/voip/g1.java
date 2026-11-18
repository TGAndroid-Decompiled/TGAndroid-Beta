package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class g1 implements VideoSink {
    public volatile t0 f40874a;
    public volatile m2 f40875b;
    public volatile int f40876c;
    public volatile int d;
    public volatile long f40877e;
    public final oi.a2 f40878f = new oi.a2(this, 19);
    public final j1 h;

    public g1(j1 j1Var) {
        this.h = j1Var;
    }

    public final boolean a(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f40877e < j3) {
            if (elapsedRealtime - j3 >= 700) {
                return false;
            }
            return true;
        } else if (elapsedRealtime - this.f40877e >= 5000) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f40877e > 5000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40877e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f40876c || rotatedHeight != this.d || z10) {
            this.f40876c = rotatedWidth;
            this.d = rotatedHeight;
            org.telegram.messenger.g0.g3(this.f40878f);
        }
        t0 t0Var = this.f40874a;
        m2 m2Var = this.f40875b;
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
