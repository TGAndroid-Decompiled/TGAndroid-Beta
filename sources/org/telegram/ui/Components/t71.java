package org.telegram.ui.Components;

import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
public final class t71 {
    public final ByteBuffer f28343c;
    public long e;
    public final u71 f28344f;
    public final FourierTransform.FFT f28341a = new FourierTransform.FFT(1024, 48000.0f);
    public final float[] f28342b = new float[1024];
    public int d = 0;

    public t71(u71 u71Var) {
        this.f28344f = u71Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f28343c = allocateDirect;
        allocateDirect.position(0);
    }
}
