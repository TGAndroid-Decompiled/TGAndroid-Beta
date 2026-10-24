package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class i81 {
    public final ByteBuffer f27367c;
    public long e;
    public final j81 f27368f;
    public final FourierTransform.FFT f27365a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f27366b = new float[1024];
    public int d = 0;

    public i81(j81 j81Var) {
        this.f27368f = j81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f27367c = allocateDirect;
        allocateDirect.position(0);
    }
}
