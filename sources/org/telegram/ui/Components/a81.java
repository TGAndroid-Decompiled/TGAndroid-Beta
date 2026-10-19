package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class a81 {
    public final ByteBuffer f24513c;
    public long e;
    public final b81 f24514f;
    public final FourierTransform.FFT f24511a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f24512b = new float[1024];
    public int d = 0;

    public a81(b81 b81Var) {
        this.f24514f = b81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f24513c = allocateDirect;
        allocateDirect.position(0);
    }
}
