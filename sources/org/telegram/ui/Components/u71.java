package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class u71 {
    public final ByteBuffer f28691c;
    public long e;
    public final v71 f28692f;
    public final FourierTransform.FFT f28689a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f28690b = new float[1024];
    public int d = 0;

    public u71(v71 v71Var) {
        this.f28692f = v71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f28691c = allocateDirect;
        allocateDirect.position(0);
    }
}
