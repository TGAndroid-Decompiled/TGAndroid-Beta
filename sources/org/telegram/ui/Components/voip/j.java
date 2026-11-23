package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f41082a;
    public final ViewGroup f41083b;

    public j(ViewGroup viewGroup, int i7) {
        this.f41082a = i7;
        this.f41083b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z10;
        switch (this.f41082a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f41083b).f41103r > 1000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((k) this.f41083b).f41103r = SystemClock.elapsedRealtime();
                ((k) this.f41083b).f41104s = videoFrame.getRotatedWidth();
                ((k) this.f41083b).f41105w = videoFrame.getRotatedHeight();
                ((k) this.f41083b).f41098b.d.onFrame(videoFrame);
                if (z10 && !((k) this.f41083b).f41106x) {
                    ((k) this.f41083b).f41106x = true;
                    org.telegram.messenger.g0.g3(((k) this.f41083b).f41107y);
                    return;
                }
                return;
            default:
                ((d0) this.f41083b).f40948s = SystemClock.elapsedRealtime();
                ((d0) this.f41083b).f40949w = videoFrame.getRotatedWidth();
                ((d0) this.f41083b).f40950x = videoFrame.getRotatedHeight();
                n2 n2Var = ((d0) this.f41083b).f40943c;
                if (n2Var != null) {
                    n2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f41082a;
        org.webrtc.d0.a(this, videoSink);
    }
}
