package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class oc0 {
    public final RuntimeShader f27066a;
    public final float[] f27067b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f27068c = {1.0f, 1.0f, 0.0f, 0.0f};

    public oc0(int i10) {
        mi.a.c();
        this.f27066a = mi.a.b(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f27067b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27066a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f27068c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27066a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
