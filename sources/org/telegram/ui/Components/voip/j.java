package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f40945a;
    public final ViewGroup f40946b;

    public j(ViewGroup viewGroup, int i7) {
        this.f40945a = i7;
        this.f40946b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        switch (this.f40945a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f40946b).f40982r > 1000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((k) this.f40946b).f40982r = SystemClock.elapsedRealtime();
                ((k) this.f40946b).f40983s = videoFrame.getRotatedWidth();
                ((k) this.f40946b).f40984w = videoFrame.getRotatedHeight();
                ((k) this.f40946b).f40977b.d.onFrame(videoFrame);
                if (z10 && !((k) this.f40946b).f40985x) {
                    ((k) this.f40946b).f40985x = true;
                    org.telegram.messenger.g0.g3(((k) this.f40946b).f40986y);
                    return;
                }
                return;
            default:
                ((e0) this.f40946b).f40854s = SystemClock.elapsedRealtime();
                ((e0) this.f40946b).f40855w = videoFrame.getRotatedWidth();
                ((e0) this.f40946b).f40856x = videoFrame.getRotatedHeight();
                o2 o2Var = ((e0) this.f40946b).f40849c;
                if (o2Var != null) {
                    o2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f40945a;
        org.webrtc.d0.a(this, videoSink);
    }
}
