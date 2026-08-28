package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class j61 {
    public final ByteBuffer f29658c;
    public long f29659e;
    public final k61 f29660f;
    public final FourierTransform.FFT f29656a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f29657b = new float[1024];
    public int d = 0;

    public j61(k61 k61Var) {
        this.f29660f = k61Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f29658c = allocateDirect;
        allocateDirect.position(0);
    }
}
