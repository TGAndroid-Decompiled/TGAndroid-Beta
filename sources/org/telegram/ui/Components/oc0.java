package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class oc0 {
    public final RuntimeShader f27025a;
    public final float[] f27026b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f27027c = {1.0f, 1.0f, 0.0f, 0.0f};

    public oc0(int i10) {
        nc0.b();
        this.f27025a = nc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f27026b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27025a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f27027c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27025a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
