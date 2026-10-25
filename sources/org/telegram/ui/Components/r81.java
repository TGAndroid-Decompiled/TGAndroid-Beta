package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class r81 {
    public final ByteBuffer f32162c;
    public long e;
    public final s81 f32163f;
    public final FourierTransform.FFT f32160a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f32161b = new float[1024];
    public int d = 0;

    public r81(s81 s81Var) {
        this.f32163f = s81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f32162c = allocateDirect;
        allocateDirect.position(0);
    }
}
