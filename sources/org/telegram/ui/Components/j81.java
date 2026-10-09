package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class j81 {
    public final ByteBuffer f27636c;
    public long f27637e;
    public final k81 f27638f;
    public final FourierTransform.FFT f27634a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f27635b = new float[1024];
    public int d = 0;

    public j81(k81 k81Var) {
        this.f27638f = k81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f27636c = allocateDirect;
        allocateDirect.position(0);
    }
}
