package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class pc0 {
    public final RuntimeShader f27323a;
    public final float[] f27324b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f27325c = {1.0f, 1.0f, 0.0f, 0.0f};

    public pc0(int i10) {
        oc0.b();
        this.f27323a = oc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f27324b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27323a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f27325c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27323a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
