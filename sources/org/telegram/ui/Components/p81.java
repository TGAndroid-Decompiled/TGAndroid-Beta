package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class p81 {
    public final ByteBuffer f29447c;
    public long f29448e;
    public final q81 f29449f;
    public final FourierTransform.FFT f29445a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f29446b = new float[1024];
    public int d = 0;

    public p81(q81 q81Var) {
        this.f29449f = q81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f29447c = allocateDirect;
        allocateDirect.position(0);
    }
}
