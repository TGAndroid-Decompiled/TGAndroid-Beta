package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class c81 {
    public final ByteBuffer f25263c;
    public long f25264e;
    public final d81 f25265f;
    public final FourierTransform.FFT f25261a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f25262b = new float[1024];
    public int d = 0;

    public c81(d81 d81Var) {
        this.f25265f = d81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f25263c = allocateDirect;
        allocateDirect.position(0);
    }
}
