package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class d81 {
    public final ByteBuffer f25714c;
    public long f25715e;
    public final e81 f25716f;
    public final FourierTransform.FFT f25712a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f25713b = new float[1024];
    public int d = 0;

    public d81(e81 e81Var) {
        this.f25716f = e81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f25714c = allocateDirect;
        allocateDirect.position(0);
    }
}
