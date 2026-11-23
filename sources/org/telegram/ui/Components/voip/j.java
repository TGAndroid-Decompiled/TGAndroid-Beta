package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f41081a;
    public final ViewGroup f41082b;

    public j(ViewGroup viewGroup, int i7) {
        this.f41081a = i7;
        this.f41082b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        switch (this.f41081a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f41082b).f41102r > 1000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((k) this.f41082b).f41102r = SystemClock.elapsedRealtime();
                ((k) this.f41082b).f41103s = videoFrame.getRotatedWidth();
                ((k) this.f41082b).f41104w = videoFrame.getRotatedHeight();
                ((k) this.f41082b).f41097b.d.onFrame(videoFrame);
                if (z10 && !((k) this.f41082b).f41105x) {
                    ((k) this.f41082b).f41105x = true;
                    org.telegram.messenger.g0.g3(((k) this.f41082b).f41106y);
                    return;
                }
                return;
            default:
                ((d0) this.f41082b).f40947s = SystemClock.elapsedRealtime();
                ((d0) this.f41082b).f40948w = videoFrame.getRotatedWidth();
                ((d0) this.f41082b).f40949x = videoFrame.getRotatedHeight();
                n2 n2Var = ((d0) this.f41082b).f40942c;
                if (n2Var != null) {
                    n2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f41081a;
        org.webrtc.d0.a(this, videoSink);
    }
}
