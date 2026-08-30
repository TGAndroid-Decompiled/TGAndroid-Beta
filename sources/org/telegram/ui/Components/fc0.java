package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class fc0 {
    public final RuntimeShader f24848a;
    public final float[] f24849b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f24850c = {1.0f, 1.0f, 0.0f, 0.0f};

    public fc0(int i10) {
        ec0.b();
        this.f24848a = ec0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f24849b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f24848a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f24850c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f24848a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
