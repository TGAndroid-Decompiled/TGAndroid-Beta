package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class f71 {
    public final ByteBuffer f25950c;
    public long f25951e;
    public final g71 f25952f;
    public final FourierTransform.FFT f25948a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f25949b = new float[1024];
    public int d = 0;

    public f71(g71 g71Var) {
        this.f25952f = g71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f25950c = allocateDirect;
        allocateDirect.position(0);
    }
}
