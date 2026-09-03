package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class i71 {
    public final ByteBuffer f27733c;
    public long f27734e;
    public final j71 f27735f;
    public final FourierTransform.FFT f27731a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f27732b = new float[1024];
    public int d = 0;

    public i71(j71 j71Var) {
        this.f27735f = j71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f27733c = allocateDirect;
        allocateDirect.position(0);
    }
}
