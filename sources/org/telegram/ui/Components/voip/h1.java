package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class h1 implements VideoSink {
    public volatile u0 f40637a;
    public volatile n2 f40638b;
    public volatile int f40639c;
    public volatile int d;
    public volatile long f40640e;
    public final org.telegram.ui.ActionBar.r0 f40641f = new org.telegram.ui.ActionBar.r0(this, 16);
    public final k1 h;

    public h1(k1 k1Var) {
        this.h = k1Var;
    }

    public final boolean a(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f40640e < j3) {
            if (elapsedRealtime - j3 >= 700) {
                return false;
            }
            return true;
        } else if (elapsedRealtime - this.f40640e >= 5000) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f40640e > 5000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40640e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f40639c || rotatedHeight != this.d || z10) {
            this.f40639c = rotatedWidth;
            this.d = rotatedHeight;
            org.telegram.messenger.g0.h3(this.f40641f);
        }
        u0 u0Var = this.f40637a;
        n2 n2Var = this.f40638b;
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
