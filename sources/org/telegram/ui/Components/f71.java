package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class f71 {
    public final ByteBuffer f23844c;
    public long e;
    public final g71 f23845f;
    public final FourierTransform.FFT f23842a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f23843b = new float[1024];
    public int d = 0;

    public f71(g71 g71Var) {
        this.f23845f = g71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f23844c = allocateDirect;
        allocateDirect.position(0);
    }
}
