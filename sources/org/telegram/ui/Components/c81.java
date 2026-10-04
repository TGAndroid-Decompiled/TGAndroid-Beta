package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class c81 {
    public final ByteBuffer f25268c;
    public long f25269e;
    public final d81 f25270f;
    public final FourierTransform.FFT f25266a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f25267b = new float[1024];
    public int d = 0;

    public c81(d81 d81Var) {
        this.f25270f = d81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f25268c = allocateDirect;
        allocateDirect.position(0);
    }
}
