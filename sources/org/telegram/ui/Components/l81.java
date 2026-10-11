package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class l81 {
    public final ByteBuffer f28235c;
    public long f28236e;
    public final m81 f28237f;
    public final FourierTransform.FFT f28233a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f28234b = new float[1024];
    public int d = 0;

    public l81(m81 m81Var) {
        this.f28237f = m81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f28235c = allocateDirect;
        allocateDirect.position(0);
    }
}
