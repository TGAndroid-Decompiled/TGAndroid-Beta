package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f40666a;
    public final ViewGroup f40667b;

    public j(ViewGroup viewGroup, int i7) {
        this.f40666a = i7;
        this.f40667b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        switch (this.f40666a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f40667b).f40703r > 1000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((k) this.f40667b).f40703r = SystemClock.elapsedRealtime();
                ((k) this.f40667b).f40704s = videoFrame.getRotatedWidth();
                ((k) this.f40667b).f40705w = videoFrame.getRotatedHeight();
                ((k) this.f40667b).f40698b.d.onFrame(videoFrame);
                if (z10 && !((k) this.f40667b).f40706x) {
                    ((k) this.f40667b).f40706x = true;
                    org.telegram.messenger.g0.h3(((k) this.f40667b).f40707y);
                    return;
                }
                return;
            default:
                ((e0) this.f40667b).f40575s = SystemClock.elapsedRealtime();
                ((e0) this.f40667b).f40576w = videoFrame.getRotatedWidth();
                ((e0) this.f40667b).f40577x = videoFrame.getRotatedHeight();
                o2 o2Var = ((e0) this.f40667b).f40570c;
                if (o2Var != null) {
                    o2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f40666a;
        org.webrtc.d0.a(this, videoSink);
    }
}
