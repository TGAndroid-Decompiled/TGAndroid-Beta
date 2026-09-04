package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class fc0 {
    public final RuntimeShader f26011a;
    public final float[] f26012b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f26013c = {1.0f, 1.0f, 0.0f, 0.0f};

    public fc0(int i10) {
        ec0.b();
        this.f26011a = ec0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f26012b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26011a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f26013c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26011a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
