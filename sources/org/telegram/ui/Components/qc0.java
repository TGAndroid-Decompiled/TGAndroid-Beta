package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class qc0 {
    public final RuntimeShader f27662a;
    public final float[] f27663b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f27664c = {1.0f, 1.0f, 0.0f, 0.0f};

    public qc0(int i10) {
        pc0.b();
        this.f27662a = pc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f27663b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27662a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f27664c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27662a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
