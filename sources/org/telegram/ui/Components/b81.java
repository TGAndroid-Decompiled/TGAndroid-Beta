package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class b81 {
    public final ByteBuffer f24828c;
    public long e;
    public final c81 f24829f;
    public final FourierTransform.FFT f24826a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f24827b = new float[1024];
    public int d = 0;

    public b81(c81 c81Var) {
        this.f24829f = c81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f24828c = allocateDirect;
        allocateDirect.position(0);
    }
}
