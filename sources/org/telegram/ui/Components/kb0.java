package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class kb0 {
    public final RuntimeShader f27798a;
    public final float[] f27799b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f27800c = {1.0f, 1.0f, 0.0f, 0.0f};

    public kb0(int i10) {
        fi.e.c();
        this.f27798a = fi.e.b(org.telegram.messenger.i0.y2(null, i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f27799b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27798a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f27800c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27798a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
