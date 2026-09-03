package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class h71 {
    public final ByteBuffer f25331c;
    public long e;
    public final i71 f25332f;
    public final FourierTransform.FFT f25329a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f25330b = new float[1024];
    public int d = 0;

    public h71(i71 i71Var) {
        this.f25332f = i71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f25331c = allocateDirect;
        allocateDirect.position(0);
    }
}
