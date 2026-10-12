package org.telegram.ui.Components;

import java.io.File;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
public final class mh0 implements Runnable {
    public final int f28550a;
    public final Object f28551b;
    public final Object f28552c;
    public final Object d;

    public mh0(Object obj, Object obj2, Object obj3, int i10) {
        this.f28550a = i10;
        this.f28551b = obj;
        this.f28552c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ((VideoFileRenderer) this.f28551b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f28552c, (VideoFrame) this.d);
    }

    private final void b() {
        ((pi.t) this.f28551b).f45824f.onOutputStarted(((pi.n) this.f28552c).f45801a, (File) this.d);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mh0.run():void");
    }
}
