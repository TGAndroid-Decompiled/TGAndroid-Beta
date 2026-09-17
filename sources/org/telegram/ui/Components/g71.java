package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class g71 {
    public final ByteBuffer f24107c;
    public long e;
    public final h71 f24108f;
    public final FourierTransform.FFT f24105a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f24106b = new float[1024];
    public int d = 0;

    public g71(h71 h71Var) {
        this.f24108f = h71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f24107c = allocateDirect;
        allocateDirect.position(0);
    }
}
