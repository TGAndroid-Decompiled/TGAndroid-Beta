package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class r71 {
    public final ByteBuffer f27899c;
    public long e;
    public final s71 f27900f;
    public final FourierTransform.FFT f27897a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f27898b = new float[1024];
    public int d = 0;

    public r71(s71 s71Var) {
        this.f27900f = s71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f27899c = allocateDirect;
        allocateDirect.position(0);
    }
}
