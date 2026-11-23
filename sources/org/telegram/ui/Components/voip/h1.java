package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class h1 implements VideoSink {
    public volatile u0 f40913a;
    public volatile n2 f40914b;
    public volatile int f40915c;
    public volatile int d;
    public volatile long f40916e;
    public final oi.c2 f40917f = new oi.c2(this, 19);
    public final k1 h;

    public h1(k1 k1Var) {
        this.h = k1Var;
    }

    public final boolean a(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f40916e < j3) {
            if (elapsedRealtime - j3 >= 700) {
                return false;
            }
            return true;
        } else if (elapsedRealtime - this.f40916e >= 5000) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f40916e > 5000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40916e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f40915c || rotatedHeight != this.d || z10) {
            this.f40915c = rotatedWidth;
            this.d = rotatedHeight;
            org.telegram.messenger.g0.g3(this.f40917f);
        }
        u0 u0Var = this.f40913a;
        n2 n2Var = this.f40914b;
        if (u0Var != null) {
            u0Var.onFrame(videoFrame);
        }
        if (n2Var != null) {
            n2Var.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
