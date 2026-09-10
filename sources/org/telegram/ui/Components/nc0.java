package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class nc0 {
    public final RuntimeShader f25486a;
    public final float[] f25487b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f25488c = {1.0f, 1.0f, 0.0f, 0.0f};

    public nc0(int i10) {
        mc0.b();
        this.f25486a = mc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f25487b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f25486a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f25488c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f25486a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
