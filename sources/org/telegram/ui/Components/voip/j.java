package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class j implements VideoSink {
    public final int f39280a;
    public final ViewGroup f39281b;

    public j(ViewGroup viewGroup, int i7) {
        this.f39280a = i7;
        this.f39281b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z9;
        switch (this.f39280a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((k) this.f39281b).f39295r > 1000) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ((k) this.f39281b).f39295r = SystemClock.elapsedRealtime();
                ((k) this.f39281b).f39296s = videoFrame.getRotatedWidth();
                ((k) this.f39281b).f39297w = videoFrame.getRotatedHeight();
                ((k) this.f39281b).f39290b.d.onFrame(videoFrame);
                if (z9 && !((k) this.f39281b).f39298x) {
                    ((k) this.f39281b).f39298x = true;
                    org.telegram.messenger.g0.h3(((k) this.f39281b).f39299y);
                    return;
                }
                return;
            default:
                ((d0) this.f39281b).f39145s = SystemClock.elapsedRealtime();
                ((d0) this.f39281b).f39146w = videoFrame.getRotatedWidth();
                ((d0) this.f39281b).f39147x = videoFrame.getRotatedHeight();
                k2 k2Var = ((d0) this.f39281b).f39140c;
                if (k2Var != null) {
                    k2Var.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f39280a;
        org.webrtc.d0.a(this, videoSink);
    }
}
