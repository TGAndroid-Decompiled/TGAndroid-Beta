package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class h1 implements VideoSink {
    public volatile u0 f40634a;
    public volatile n2 f40635b;
    public volatile int f40636c;
    public volatile int d;
    public volatile long f40637e;
    public final org.telegram.ui.ActionBar.r0 f40638f = new org.telegram.ui.ActionBar.r0(this, 16);
    public final k1 h;

    public h1(k1 k1Var) {
        this.h = k1Var;
    }

    public final boolean a(long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f40637e < j3) {
            if (elapsedRealtime - j3 >= 700) {
                return false;
            }
            return true;
        } else if (elapsedRealtime - this.f40637e >= 5000) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f40637e > 5000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40637e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f40636c || rotatedHeight != this.d || z10) {
            this.f40636c = rotatedWidth;
            this.d = rotatedHeight;
            org.telegram.messenger.g0.h3(this.f40638f);
        }
        u0 u0Var = this.f40634a;
        n2 n2Var = this.f40635b;
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
