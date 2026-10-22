package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class yc0 {
    public final RuntimeShader f32637a;
    public final float[] f32638b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f32639c = {1.0f, 1.0f, 0.0f, 0.0f};

    public yc0(int i10) {
        xc0.b();
        this.f32637a = xc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f32638b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f32637a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f32639c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f32637a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
