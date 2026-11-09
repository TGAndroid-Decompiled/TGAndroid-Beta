package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class ta0 {
    public final RuntimeShader f38335a;
    public final float[] f38336b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f38337c = {1.0f, 1.0f, 0.0f, 0.0f};

    public ta0(int i7) {
        sa0.c();
        this.f38335a = sa0.b(org.telegram.messenger.g0.y2(null, i7));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f38336b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f38335a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f38337c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f38335a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
