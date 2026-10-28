package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class s81 {
    public final ByteBuffer f32515c;
    public long e;
    public final t81 f32516f;
    public final FourierTransform.FFT f32513a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f32514b = new float[1024];
    public int d = 0;

    public s81(t81 t81Var) {
        this.f32516f = t81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f32515c = allocateDirect;
        allocateDirect.position(0);
    }
}
