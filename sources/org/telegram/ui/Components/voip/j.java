package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f40669a;
    public final ViewGroup f40670b;

    public j(ViewGroup viewGroup, int i7) {
        this.f40669a = i7;
        this.f40670b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        switch (this.f40669a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f40670b).f40706r > 1000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((k) this.f40670b).f40706r = SystemClock.elapsedRealtime();
                ((k) this.f40670b).f40707s = videoFrame.getRotatedWidth();
                ((k) this.f40670b).f40708w = videoFrame.getRotatedHeight();
                ((k) this.f40670b).f40701b.d.onFrame(videoFrame);
                if (z10 && !((k) this.f40670b).f40709x) {
                    ((k) this.f40670b).f40709x = true;
                    org.telegram.messenger.g0.h3(((k) this.f40670b).f40710y);
                    return;
                }
                return;
            default:
                ((e0) this.f40670b).f40578s = SystemClock.elapsedRealtime();
                ((e0) this.f40670b).f40579w = videoFrame.getRotatedWidth();
                ((e0) this.f40670b).f40580x = videoFrame.getRotatedHeight();
                o2 o2Var = ((e0) this.f40670b).f40573c;
                if (o2Var != null) {
                    o2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f40669a;
        org.webrtc.d0.a(this, videoSink);
    }
}
