package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class sa0 {
    public final RuntimeShader f39264a;
    public final float[] f39265b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f39266c = {1.0f, 1.0f, 0.0f, 0.0f};

    public sa0(int i7) {
        ai.q0.c();
        this.f39264a = ai.q0.b(org.telegram.messenger.g0.y2(null, i7));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f39265b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f39264a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f39266c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f39264a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
