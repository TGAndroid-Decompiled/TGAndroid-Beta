package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class t71 {
    public final ByteBuffer f28508c;
    public long e;
    public final u71 f28509f;
    public final FourierTransform.FFT f28506a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f28507b = new float[1024];
    public int d = 0;

    public t71(u71 u71Var) {
        this.f28509f = u71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f28508c = allocateDirect;
        allocateDirect.position(0);
    }
}
