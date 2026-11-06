package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f39215a;
    public final ViewGroup f39216b;

    public j(ViewGroup viewGroup, int i7) {
        this.f39215a = i7;
        this.f39216b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z9;
        switch (this.f39215a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f39216b).f39230r > 1000) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ((k) this.f39216b).f39230r = SystemClock.elapsedRealtime();
                ((k) this.f39216b).f39231s = videoFrame.getRotatedWidth();
                ((k) this.f39216b).f39232w = videoFrame.getRotatedHeight();
                ((k) this.f39216b).f39225b.d.onFrame(videoFrame);
                if (z9 && !((k) this.f39216b).f39233x) {
                    ((k) this.f39216b).f39233x = true;
                    org.telegram.messenger.g0.h3(((k) this.f39216b).f39234y);
                    return;
                }
                return;
            default:
                ((d0) this.f39216b).f39080s = SystemClock.elapsedRealtime();
                ((d0) this.f39216b).f39081w = videoFrame.getRotatedWidth();
                ((d0) this.f39216b).f39082x = videoFrame.getRotatedHeight();
                k2 k2Var = ((d0) this.f39216b).f39075c;
                if (k2Var != null) {
                    k2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f39215a;
        org.webrtc.e0.a(this, videoSink);
    }
}
