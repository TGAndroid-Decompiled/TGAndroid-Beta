package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class ab0 {
    public final RuntimeShader f33453a;
    public final float[] f33454b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f33455c = {1.0f, 1.0f, 0.0f, 0.0f};

    public ab0(int i7) {
        ai.p0.c();
        this.f33453a = ai.p0.b(org.telegram.messenger.g0.y2(null, i7));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f33454b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f33453a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f33455c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f33453a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
