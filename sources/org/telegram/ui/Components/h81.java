package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class h81 {
    public final ByteBuffer f25205c;
    public long e;
    public final i81 f25206f;
    public final FourierTransform.FFT f25203a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f25204b = new float[1024];
    public int d = 0;

    public h81(i81 i81Var) {
        this.f25206f = i81Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f25205c = allocateDirect;
        allocateDirect.position(0);
    }
}
