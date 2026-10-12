package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class p81 {
    public final ByteBuffer f29444c;
    public long f29445e;
    public final q81 f29446f;
    public final FourierTransform.FFT f29442a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f29443b = new float[1024];
    public int d = 0;

    public p81(q81 q81Var) {
        this.f29446f = q81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f29444c = allocateDirect;
        allocateDirect.position(0);
    }
}
