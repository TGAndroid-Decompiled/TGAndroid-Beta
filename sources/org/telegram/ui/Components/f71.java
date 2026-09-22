package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class f71 {
    public final ByteBuffer f23843c;
    public long e;
    public final g71 f23844f;
    public final FourierTransform.FFT f23841a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f23842b = new float[1024];
    public int d = 0;

    public f71(g71 g71Var) {
        this.f23844f = g71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f23843c = allocateDirect;
        allocateDirect.position(0);
    }
}
