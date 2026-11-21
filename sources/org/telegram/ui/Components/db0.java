package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class db0 {
    public final RuntimeShader f34468a;
    public final float[] f34469b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f34470c = {1.0f, 1.0f, 0.0f, 0.0f};

    public db0(int i7) {
        ai.t0.c();
        this.f34468a = ai.t0.b(org.telegram.messenger.g0.y2(null, i7));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f34469b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f34468a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f34470c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f34468a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
