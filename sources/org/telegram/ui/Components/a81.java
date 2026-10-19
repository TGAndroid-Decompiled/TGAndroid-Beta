package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class a81 {
    public final ByteBuffer f24515c;
    public long e;
    public final b81 f24516f;
    public final FourierTransform.FFT f24513a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f24514b = new float[1024];
    public int d = 0;

    public a81(b81 b81Var) {
        this.f24516f = b81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f24515c = allocateDirect;
        allocateDirect.position(0);
    }
}
