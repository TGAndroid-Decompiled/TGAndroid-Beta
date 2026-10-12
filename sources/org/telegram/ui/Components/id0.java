package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class id0 {
    public final RuntimeShader f27143a;
    public final float[] f27144b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f27145c = {1.0f, 1.0f, 0.0f, 0.0f};

    public id0(int i10) {
        hd0.b();
        this.f27143a = hd0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f27144b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27143a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f27145c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f27143a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
