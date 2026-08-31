package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class j71 {
    public final ByteBuffer f28063c;
    public long f28064e;
    public final k71 f28065f;
    public final FourierTransform.FFT f28061a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f28062b = new float[1024];
    public int d = 0;

    public j71(k71 k71Var) {
        this.f28065f = k71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f28063c = allocateDirect;
        allocateDirect.position(0);
    }
}
