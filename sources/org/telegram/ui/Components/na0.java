package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class na0 {
    public final RuntimeShader f36423a;
    public final float[] f36424b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f36425c = {1.0f, 1.0f, 0.0f, 0.0f};

    public na0(int i3) {
        ma0.c();
        this.f36423a = ma0.b(org.telegram.messenger.g0.y2(null, i3));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f36424b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f36423a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f36425c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f36423a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
