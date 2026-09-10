package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class s71 {
    public final ByteBuffer f26970c;
    public long e;
    public final t71 f26971f;
    public final FourierTransform.FFT f26968a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f26969b = new float[1024];
    public int d = 0;

    public s71(t71 t71Var) {
        this.f26971f = t71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f26970c = allocateDirect;
        allocateDirect.position(0);
    }
}
