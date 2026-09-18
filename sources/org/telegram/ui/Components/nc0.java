package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class nc0 {
    public final RuntimeShader f26659a;
    public final float[] f26660b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f26661c = {1.0f, 1.0f, 0.0f, 0.0f};

    public nc0(int i10) {
        mc0.b();
        this.f26659a = mc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f26660b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26659a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f26661c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26659a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
