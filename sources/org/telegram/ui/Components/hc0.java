package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class hc0 {
    public final RuntimeShader f27450a;
    public final float[] f27451b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f27452c = {1.0f, 1.0f, 0.0f, 0.0f};

    public hc0(int i10) {
        gc0.b();
        this.f27450a = gc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f27451b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27450a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f27452c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27450a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
