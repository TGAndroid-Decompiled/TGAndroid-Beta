package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;

public final class l61 {

    public final ByteBuffer f30308c;

    public long f30309e;

    public final m61 f30310f;

    public final FourierTransform.FFT f30306a = new FourierTransform.FFT(1024, 48000.0f);

    public final float[] f30307b = new float[1024];
    public int d = 0;

    public l61(m61 m61Var) {
        this.f30310f = m61Var;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(8192);
        this.f30308c = byteBufferAllocateDirect;
        byteBufferAllocateDirect.position(0);
    }
}
