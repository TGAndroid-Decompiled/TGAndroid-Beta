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
                if (SystemClock.elapsedRealtime() - ((k) this.f40946b).f40966r > 1000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((k) this.f40946b).f40966r = SystemClock.elapsedRealtime();
                ((k) this.f40946b).f40967s = videoFrame.getRotatedWidth();
                ((k) this.f40946b).f40968w = videoFrame.getRotatedHeight();
                ((k) this.f40946b).f40961b.d.onFrame(videoFrame);
                if (z10 && !((k) this.f40946b).f40969x) {
                    ((k) this.f40946b).f40969x = true;
                    org.telegram.messenger.g0.g3(((k) this.f40946b).f40970y);
                    return;
                }
                return;
            default:
                ((d0) this.f40946b).f40811s = SystemClock.elapsedRealtime();
                ((d0) this.f40946b).f40812w = videoFrame.getRotatedWidth();
                ((d0) this.f40946b).f40813x = videoFrame.getRotatedHeight();
                n2 n2Var = ((d0) this.f40946b).f40806c;
                if (n2Var != null) {
                    n2Var.d.onFrame(videoFrame);
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
