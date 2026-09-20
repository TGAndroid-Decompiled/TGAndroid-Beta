package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class mc0 {
    public final RuntimeShader f26380a;
    public final float[] f26381b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f26382c = {1.0f, 1.0f, 0.0f, 0.0f};

    public mc0(int i10) {
        lc0.b();
        this.f26380a = lc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f26381b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26380a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f26382c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26380a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
