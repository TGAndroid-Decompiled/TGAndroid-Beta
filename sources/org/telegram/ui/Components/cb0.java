package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class cb0 {
    public final RuntimeShader f33960a;
    public final float[] f33961b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f33962c = {1.0f, 1.0f, 0.0f, 0.0f};

    public cb0(int i7) {
        ai.r0.c();
        this.f33960a = ai.r0.b(org.telegram.messenger.g0.y2(null, i7));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f33961b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f33960a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f33962c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f33960a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
