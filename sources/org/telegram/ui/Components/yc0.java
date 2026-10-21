package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class yc0 {
    public final RuntimeShader f32634a;
    public final float[] f32635b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f32636c = {1.0f, 1.0f, 0.0f, 0.0f};

    public yc0(int i10) {
        xc0.b();
        this.f32634a = xc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f32635b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f32634a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f32636c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f32634a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
