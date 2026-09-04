package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class f71 {
    public final ByteBuffer f25949c;
    public long f25950e;
    public final g71 f25951f;
    public final FourierTransform.FFT f25947a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f25948b = new float[1024];
    public int d = 0;

    public f71(g71 g71Var) {
        this.f25951f = g71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f25949c = allocateDirect;
        allocateDirect.position(0);
    }
}
