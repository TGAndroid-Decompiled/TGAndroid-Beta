package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class h71 {
    public final ByteBuffer f25344c;
    public long e;
    public final i71 f25345f;
    public final FourierTransform.FFT f25342a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f25343b = new float[1024];
    public int d = 0;

    public h71(i71 i71Var) {
        this.f25345f = i71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f25344c = allocateDirect;
        allocateDirect.position(0);
    }
}
