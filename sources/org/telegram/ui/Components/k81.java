package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class k81 {
    public final ByteBuffer f27932c;
    public long f27933e;
    public final l81 f27934f;
    public final FourierTransform.FFT f27930a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f27931b = new float[1024];
    public int d = 0;

    public k81(l81 l81Var) {
        this.f27934f = l81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f27932c = allocateDirect;
        allocateDirect.position(0);
    }
}
