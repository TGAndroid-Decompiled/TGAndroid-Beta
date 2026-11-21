package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f41080a;
    public final ViewGroup f41081b;

    public j(ViewGroup viewGroup, int i7) {
        this.f41080a = i7;
        this.f41081b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        switch (this.f41080a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f41081b).f41101r > 1000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((k) this.f41081b).f41101r = SystemClock.elapsedRealtime();
                ((k) this.f41081b).f41102s = videoFrame.getRotatedWidth();
                ((k) this.f41081b).f41103w = videoFrame.getRotatedHeight();
                ((k) this.f41081b).f41096b.d.onFrame(videoFrame);
                if (z10 && !((k) this.f41081b).f41104x) {
                    ((k) this.f41081b).f41104x = true;
                    org.telegram.messenger.g0.g3(((k) this.f41081b).f41105y);
                    return;
                }
                return;
            default:
                ((d0) this.f41081b).f40946s = SystemClock.elapsedRealtime();
                ((d0) this.f41081b).f40947w = videoFrame.getRotatedWidth();
                ((d0) this.f41081b).f40948x = videoFrame.getRotatedHeight();
                n2 n2Var = ((d0) this.f41081b).f40941c;
                if (n2Var != null) {
                    n2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f41080a;
        org.webrtc.d0.a(this, videoSink);
    }
}
