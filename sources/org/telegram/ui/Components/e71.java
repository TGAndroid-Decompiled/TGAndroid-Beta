package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class e71 {
    public final ByteBuffer f23591c;
    public long e;
    public final f71 f23592f;
    public final FourierTransform.FFT f23589a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f23590b = new float[1024];
    public int d = 0;

    public e71(f71 f71Var) {
        this.f23592f = f71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f23591c = allocateDirect;
        allocateDirect.position(0);
    }
}
