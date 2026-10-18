package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class z71 {
    public final ByteBuffer f32856c;
    public long e;
    public final a81 f32857f;
    public final FourierTransform.FFT f32854a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f32855b = new float[1024];
    public int d = 0;

    public z71(a81 a81Var) {
        this.f32857f = a81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f32856c = allocateDirect;
        allocateDirect.position(0);
    }
}
