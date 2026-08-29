package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class w61 {
    public final ByteBuffer f34338c;
    public long f34339e;
    public final x61 f34340f;
    public final FourierTransform.FFT f34336a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f34337b = new float[1024];
    public int d = 0;

    public w61(x61 x61Var) {
        this.f34340f = x61Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f34338c = allocateDirect;
        allocateDirect.position(0);
    }
}
