package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class rc0 {
    public final RuntimeShader f27958a;
    public final float[] f27959b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f27960c = {1.0f, 1.0f, 0.0f, 0.0f};

    public rc0(int i10) {
        qc0.b();
        this.f27958a = qc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f27959b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27958a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f27960c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27958a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
