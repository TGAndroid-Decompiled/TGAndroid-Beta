package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class b81 {
    public final ByteBuffer f24832c;
    public long e;
    public final c81 f24833f;
    public final FourierTransform.FFT f24830a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f24831b = new float[1024];
    public int d = 0;

    public b81(c81 c81Var) {
        this.f24833f = c81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f24832c = allocateDirect;
        allocateDirect.position(0);
    }
}
