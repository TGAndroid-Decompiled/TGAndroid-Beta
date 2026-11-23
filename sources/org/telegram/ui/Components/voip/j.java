package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f41043a;
    public final ViewGroup f41044b;

    public j(ViewGroup viewGroup, int i7) {
        this.f41043a = i7;
        this.f41044b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        switch (this.f41043a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f41044b).f41064r > 1000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((k) this.f41044b).f41064r = SystemClock.elapsedRealtime();
                ((k) this.f41044b).f41065s = videoFrame.getRotatedWidth();
                ((k) this.f41044b).f41066w = videoFrame.getRotatedHeight();
                ((k) this.f41044b).f41059b.d.onFrame(videoFrame);
                if (z10 && !((k) this.f41044b).f41067x) {
                    ((k) this.f41044b).f41067x = true;
                    org.telegram.messenger.g0.g3(((k) this.f41044b).f41068y);
                    return;
                }
                return;
            default:
                ((d0) this.f41044b).f40909s = SystemClock.elapsedRealtime();
                ((d0) this.f41044b).f40910w = videoFrame.getRotatedWidth();
                ((d0) this.f41044b).f40911x = videoFrame.getRotatedHeight();
                n2 n2Var = ((d0) this.f41044b).f40904c;
                if (n2Var != null) {
                    n2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f41043a;
        org.webrtc.d0.a(this, videoSink);
    }
}
