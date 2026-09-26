package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class s71 {
    public final ByteBuffer f28192c;
    public long e;
    public final t71 f28193f;
    public final FourierTransform.FFT f28190a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f28191b = new float[1024];
    public int d = 0;

    public s71(t71 t71Var) {
        this.f28193f = t71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f28192c = allocateDirect;
        allocateDirect.position(0);
    }
}
