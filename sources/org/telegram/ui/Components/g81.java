package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class g81 {
    public final ByteBuffer f25221c;
    public long e;
    public final h81 f25222f;
    public final FourierTransform.FFT f25219a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f25220b = new float[1024];
    public int d = 0;

    public g81(h81 h81Var) {
        this.f25222f = h81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f25221c = allocateDirect;
        allocateDirect.position(0);
    }
}
