package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class gc0 {
    public final RuntimeShader f25115a;
    public final float[] f25116b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f25117c = {1.0f, 1.0f, 0.0f, 0.0f};

    public gc0(int i10) {
        fc0.b();
        this.f25115a = fc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f25116b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f25115a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f25117c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f25115a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
