package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class r81 {
    public final ByteBuffer f32164c;
    public long e;
    public final s81 f32165f;
    public final FourierTransform.FFT f32162a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f32163b = new float[1024];
    public int d = 0;

    public r81(s81 s81Var) {
        this.f32165f = s81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f32164c = allocateDirect;
        allocateDirect.position(0);
    }
}
