package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f39271a;
    public final ViewGroup f39272b;

    public j(ViewGroup viewGroup, int i7) {
        this.f39271a = i7;
        this.f39272b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z9;
        switch (this.f39271a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f39272b).f39286r > 1000) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ((k) this.f39272b).f39286r = SystemClock.elapsedRealtime();
                ((k) this.f39272b).f39287s = videoFrame.getRotatedWidth();
                ((k) this.f39272b).f39288w = videoFrame.getRotatedHeight();
                ((k) this.f39272b).f39281b.d.onFrame(videoFrame);
                if (z9 && !((k) this.f39272b).f39289x) {
                    ((k) this.f39272b).f39289x = true;
                    org.telegram.messenger.g0.h3(((k) this.f39272b).f39290y);
                    return;
                }
                return;
            default:
                ((d0) this.f39272b).f39136s = SystemClock.elapsedRealtime();
                ((d0) this.f39272b).f39137w = videoFrame.getRotatedWidth();
                ((d0) this.f39272b).f39138x = videoFrame.getRotatedHeight();
                k2 k2Var = ((d0) this.f39272b).f39131c;
                if (k2Var != null) {
                    k2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f39271a;
        org.webrtc.e0.a(this, videoSink);
    }
}
