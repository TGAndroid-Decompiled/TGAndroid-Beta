package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class lb0 {
    public final RuntimeShader f30410a;
    public final float[] f30411b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f30412c = {1.0f, 1.0f, 0.0f, 0.0f};

    public lb0(int i9) {
        kb0.b();
        this.f30410a = kb0.a(AndroidUtilities.readRes(i9));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f30411b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f30410a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f30412c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f30410a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
