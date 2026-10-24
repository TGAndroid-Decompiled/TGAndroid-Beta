package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class yc0 {
    public final RuntimeShader f32881a;
    public final float[] f32882b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f32883c = {1.0f, 1.0f, 0.0f, 0.0f};

    public yc0(int i10) {
        xc0.b();
        this.f32881a = xc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f32882b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f32881a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f32883c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f32881a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
