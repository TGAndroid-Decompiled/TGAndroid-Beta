package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class sa0 {
    public final RuntimeShader f37909a;
    public final float[] f37910b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f37911c = {1.0f, 1.0f, 0.0f, 0.0f};

    public sa0(int i7) {
        ra0.c();
        this.f37909a = ra0.b(org.telegram.messenger.g0.y2(null, i7));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f37910b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f37909a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f37911c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f37909a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
