package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class ec0 {
    public final RuntimeShader f23622a;
    public final float[] f23623b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f23624c = {1.0f, 1.0f, 0.0f, 0.0f};

    public ec0(int i10) {
        dc0.b();
        this.f23622a = dc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f23623b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f23622a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f23624c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f23622a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
