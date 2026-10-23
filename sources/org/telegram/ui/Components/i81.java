package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class i81 {
    public final ByteBuffer f27240c;
    public long e;
    public final j81 f27241f;
    public final FourierTransform.FFT f27238a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f27239b = new float[1024];
    public int d = 0;

    public i81(j81 j81Var) {
        this.f27241f = j81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f27240c = allocateDirect;
        allocateDirect.position(0);
    }
}
