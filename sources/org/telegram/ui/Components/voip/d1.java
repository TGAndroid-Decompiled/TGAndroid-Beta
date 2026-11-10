package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.p5;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class d1 implements VideoSink {
    public volatile q0 f39149a;
    public volatile j2 f39150b;
    public volatile int f39151c;
    public volatile int d;
    public volatile long f39152e;
    public final p5 f39153f = new p5(this, 3);
    public final g1 h;

    public d1(g1 g1Var) {
        this.h = g1Var;
    }

    public final boolean a(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f39152e < j3) {
            if (elapsedRealtime - j3 >= 700) {
                return false;
            }
            return true;
        } else if (elapsedRealtime - this.f39152e >= 5000) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z9;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f39152e > 5000) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f39152e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f39151c || rotatedHeight != this.d || z9) {
            this.f39151c = rotatedWidth;
            this.d = rotatedHeight;
            org.telegram.messenger.g0.h3(this.f39153f);
        }
        q0 q0Var = this.f39149a;
        j2 j2Var = this.f39150b;
        if (q0Var != null) {
            q0Var.onFrame(videoFrame);
        }
        if (j2Var != null) {
            j2Var.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
