package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class f71 {
    public final ByteBuffer f25976c;
    public long f25977e;
    public final g71 f25978f;
    public final FourierTransform.FFT f25974a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f25975b = new float[1024];
    public int d = 0;

    public f71(g71 g71Var) {
        this.f25978f = g71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f25976c = allocateDirect;
        allocateDirect.position(0);
    }
}
