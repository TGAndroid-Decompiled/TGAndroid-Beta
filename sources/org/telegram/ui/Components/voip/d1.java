package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.m5;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class d1 implements VideoSink {
    public volatile q0 f39105a;
    public volatile j2 f39106b;
    public volatile int f39107c;
    public volatile int d;
    public volatile long f39108e;
    public final m5 f39109f = new m5(this, 5);
    public final g1 h;

    public d1(g1 g1Var) {
        this.h = g1Var;
    }

    public final boolean a(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f39108e < j3) {
            if (elapsedRealtime - j3 >= 700) {
                return false;
            }
            return true;
        } else if (elapsedRealtime - this.f39108e >= 5000) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z9;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f39108e > 5000) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f39108e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f39107c || rotatedHeight != this.d || z9) {
            this.f39107c = rotatedWidth;
            this.d = rotatedHeight;
            org.telegram.messenger.g0.h3(this.f39109f);
        }
        q0 q0Var = this.f39105a;
        j2 j2Var = this.f39106b;
        if (q0Var != null) {
            q0Var.onFrame(videoFrame);
        }
        if (j2Var != null) {
            j2Var.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.e0.a(this, videoSink);
    }
}
