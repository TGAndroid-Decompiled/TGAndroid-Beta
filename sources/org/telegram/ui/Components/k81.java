package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class k81 {
    public final ByteBuffer f27986c;
    public long f27987e;
    public final l81 f27988f;
    public final FourierTransform.FFT f27984a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f27985b = new float[1024];
    public int d = 0;

    public k81(l81 l81Var) {
        this.f27988f = l81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f27986c = allocateDirect;
        allocateDirect.position(0);
    }
}
