package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class db0 {
    public final RuntimeShader f34463a;
    public final float[] f34464b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f34465c = {1.0f, 1.0f, 0.0f, 0.0f};

    public db0(int i7) {
        ai.t0.c();
        this.f34463a = ai.t0.b(org.telegram.messenger.g0.y2(null, i7));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f34464b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f34463a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f34465c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f34463a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
